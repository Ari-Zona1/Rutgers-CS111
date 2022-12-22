import javax.swing.tree.TreeNode;

public class LeasingCost {
    
    /* 
     * Description:
     *      This method creates an array of Vehicles objects from the given file name
     *      ******IMPORTANT******
     *      This method calls buildVehicle() method, which is STUDENT'S task to complete.
     *
     * Parameters:
     *      filename: the file name containing the vehicles description
     *
     * File format:
     *      the first line of the file containing an integer representing how many vehicles will be described 
     *      in the following lines.
     *      Each line other than the first line describes one vehicle; 
     *      7 or 8 fragments of data in randomly placed order describing the vehicle (7 for gas car, 8 for electric car) in each line. 
     *      Each fragment end with the ';' character
     * 
     *   All possible fragments:
     *      type:FULETYPE;
     *          FULETPE can be gas or electric
     *      name:CARNAME;
     *          CARNAME is the name of the car
     *      due:DUEATSIGNING;
     *          DUEATSIGNING is a double number describing the dollar amount due when signing the lease
     *      length:LEASELENGTH;
     *          LEASELENGTH is an integer number describing the lease length in months
     *      monthly:MONTHLYCOST;
     *          MONTHLYCOST is a double number describing the monthly lease cost in dollar
     *      mile/unit:USAGE; 
     *          USAGE is a double describing miles the car can drive per gallon if fuel type is GAS, or miles the car can drive per kWh if fuel type is ELECTRIC
     *      allowance:MILEAGEALLOWANCE;
     *          MILEAGEALLOWANCE is an integer describing the maximum distance the car is allowed to travel per month
     *      charger:CHARGERCOST;
     *          CHARGERCOST is a double describing the cost of charger for electric cars, this fragment can only appear if the line is describing an electrical car
     *   Example of a line:
     *      type:gas; name:civic; due:1000; length:3; monthly:295; mile/unit:34; 
     *
     * Returns:
     *      this method returns an array of Vehicle objects 
     */
	public static Vehicle[] createAllVehicles(String filename) {
        StdIn.setFile(filename);

        int numberOfCars = Integer.parseInt( StdIn.readLine() );
        Vehicle[] vehicles = new Vehicle[numberOfCars];

        for ( int i = 0; i < numberOfCars; i++ ) {
        	String line = StdIn.readLine();
            vehicles[i] = createVehicle(line);
        }
        return vehicles;
    }

    /* 
     * Description:
     *      This method calculates the CO2 emission given several parameters
     * Parameters:
     *      numberOfMonth: 
     *          the lease length in months
     *      usage: 
     *          miles the car can drive per gallon if fuelType is GAS, or
     *			miles the car can drive per kWh    if fuelType is ELECTRIC
     *      mileageAllowance: 
     *			mileage allowance per month
     *		co2PerUnit:
     *			kg of CO2 released with the combustion of each gallon of gasoline, or
     *			kg of CO2 are emitted to generate 1 kWh on average
     * Returns:
     *      this method returns a double representing the CO2 emission produced by the car during the lease.
     */
	public static double computeCO2(double numberOfMonth, double usage, double mileageAllowance, double co2PerUnit ){
		double miles = numberOfMonth * mileageAllowance ;
		return miles/usage*co2PerUnit;
    }

    /* 
     * Description:
     *      This method calculates the cost the fuel during the lease given several parameters
     * Parameters:
     *      numberOfMonth: 
     *          the lease length in months
     *      usage: 
     *          miles the car can drive per gallon if fuelType is GAS, or
     *			miles the car can drive per kWh    if fuelType is ELECTRIC
     *      mileageAllowance: 
     *			mileage allowance per month
     *		fuelPrice: 
     *			price of 1 kWh in cents of a dollar,  if fuelType is GAS, or
     *			price of one gallon of gas in dollars if fuelType is ELECTRIC
     * Returns:
     *      this method returns a double representing the fuel cost during the lease
     */
	public static double computeFuelCost(double numberOfMonth, double usage, double mileageAllowance, double fuelPrice){
    	double miles = numberOfMonth * mileageAllowance;
        double cost = miles/usage * fuelPrice;
    	return cost;
    }

    /* 
     * Description:
     *      This method calculates the cost of lease
     * Parameters:
     *      dueAtSigning: 
     *          the dollar amount due at signing the lease
     *      numberOfMonths: 
     *          lease length in months
     *      monthlyCost: 
     *			cost of the lease per month
     * Returns:
     *      this method returns a double representing the lease cost during the entire lease
     */
	public static double computeLeaseCost(double dueAtSigning, int numberOfMonths, double monthlyCost){
    	
        return dueAtSigning + numberOfMonths*monthlyCost;
    }

    /* 
     * Description:
     *      This method creates and returns an Vehicle object with name, Lease, and Fuel properly populated based on the given string
     *      
     * Parameters:
     *      one string containing 7~8 fragments descrbing the 
     *   All possible fragments:
     *      type:FULETYPE;
     *          FULETPE can be gas or electric
     *      name:CARNAME;
     *          CARNAME is the name of the car
     *      due:DUEATSIGNING;
     *          DUEATSIGNING is a double number describing the dollar amount due when signing the lease
     *      length:LEASELENGTH;
     *          LEASELENGTH is an integer number describing the lease length in months
     *      monthly:MONTHLYCOST;
     *          MONTHLYCOST is a double number describing the monthly lease cost in dollar
     *      mile/unit:USAGE; 
     *          USAGE is a double describing miles the car can drive per gallon if fuel type is GAS, or miles the car can drive per kWh if fuel type is ELECTRIC
     *      allowance:MILEAGEALLOWANCE;
     *          MILEAGEALLOWANCE is an integer describing the maximum distance the car is allowed to travel per month
     *      charger:CHARGERCOST;
     *          CHARGERCOST is a double describing the cost of charger for electric cars, this fragment can only appear if the line is describing an electrical car
     *   Example of a line:
     *          type:gas.name:civic.due:1000.length:3.monthly:295.mile/unit:34.mileageAllowance:1200.
     *          monthly:238.name:Bolt.due:1000.mileageAllowance:20000.length:15.mile/unit:50.type:electric.charger:500.
     * Returns:
     *      this method creates and returns an Vehicle object with name, Lease, and Fuel properly populated
     *
     * Hint: 
     *      to extract the information of each fragments, we can use 
     *          s.substring(int startIndex, int endIndex) 
     *          s.indexOf(String target)
     *          s.indexOf(char target)
     *
     *      for example, assume we have: 
     *          String s = "description1:ABCD;  description2:EFGH;  description3:IJKL;"
     *      if we want to find the data for description 2, we can first take the substring of the entire string from the letter 'E'
     *      but first we need to find the index of 'E', we can do it by find the index of the string "description2:" and add 13("description2" is 13 chars long)to it
     *      and then we can take the substring from 'E' until the end of the entire string
     *      now use s.substring to exract:
     *          "EFGH;  description3:IJKL;" and let's call it newString for now. 
     *      to extract "EFGH" (the data we want) from newString. we need to find the index of the first ';' which we can simply use newString.indexOf(';')
     *      then we can take the substring of the newString knowing the index of ;
     *      we now have extracted "EFGH" from the String s
     *      the last step is just to convert the datatype based on what type of data we are extracting
     */
	public static Vehicle createVehicle(String description){
        
        //Need to grab the name portion first
        //Temp string to find the indexOf
         String tempName = "name:";
         //End of a vaule string
         String end = ";"; //Being reused
         //Find the index of name portion
         int tempI = description.indexOf(tempName);
         // Index of where our value starts
         int valueI = tempI + tempName.length();

         String tempS = description.substring(valueI);
         int endI = tempS.indexOf(end);
         String nData = tempS.substring(0, endI);
         //System.out.println(nameData);

          // Need to grab Fuel
          //Temp string to find the type
        String tempType = "type:";
         //Find the index of type portion
        tempI = description.indexOf(tempType);
        // Index of where our value starts
        valueI = tempI + tempType.length();
        tempS = description.substring(valueI);
        endI = tempS.indexOf(end);
        String tData = tempS.substring(0, endI);
        //System.out.println(nameData);

        //need to grab mile
        String tempMile = "mile/unit:";
         //Find the index of mile portion
        tempI = description.indexOf(tempMile);
        // Index of where our value starts
        valueI = tempI + tempMile.length();
         //System.out.println(valueI);
        tempS = description.substring(valueI);
         //System.out.println(tempS);
        endI = tempS.indexOf(end);
         //System.out.println(endI);
        //Need to convert the data into a double
        double dUData = Double.parseDouble(tempS.substring(0, endI));
        //System.out.println(dUData);


        Fuel f;
        //Electric
        if (tData.equals("electric")) {
            String ctype = "charger:";
             //Find the index of charger portion
            tempI = description.indexOf(ctype);
            // Index of where our value starts
            valueI = tempI + ctype.length();
            tempS = description.substring(valueI);
             //System.out.println(tempS);
            endI = tempS.indexOf(end);
             //System.out.println(cData);
            double dCData = Double.parseDouble(tempS.substring(0, endI));
             //System.out.println(dCData);
            f = new Fuel(dUData, dCData);
        }

        else {//GAS
            f = new Fuel(dUData);
        }

        //need to get lease info now
        String dtype = "due:";
         //Find the index of due portion
        tempI = description.indexOf(dtype);
         //System.out.println(tempI);
         // Index of where our value starts
        valueI = tempI + dtype.length();
         //System.out.println(valueI);
        tempS = description.substring(valueI);
        //System.out.println(tempS);
        endI = tempS.indexOf(end);
        //System.out.println(temp);
        double dDData = Double.parseDouble(tempS.substring(0, endI));
        //System.out.println(dDData);

        //need to find length
        String ltype = "length:";
         //Find the index of length portion
        tempI = description.indexOf(ltype);
        //System.out.println(tempI);
        // Index of where our value starts
        valueI = tempI + ltype.length();
        //System.out.println(valueI);
        tempS = description.substring(valueI);
        //System.out.println(tempS);
        endI = tempS.indexOf(end);
        //System.out.println(endI);
        int ilData = Integer.parseInt(tempS.substring(0, endI));
        //System.out.println(ilData);

        //Need to find monthly
        String mType = "monthly:";
         //Find the index of monthly portion
        tempI = description.indexOf(mType);
        // Index of where our value starts
        valueI = tempI + mType.length();
        tempS = description.substring(valueI);
        endI = tempS.indexOf(end);
        //System.out.println(monthlyD);
        double dMData = Double.parseDouble(tempS.substring(0, endI));
        //System.out.println(dMdata);

        //Need to find allowance
        String aType = "allowance:";
         //Find the index of allowance portion
        tempI = description.indexOf(aType);
        // Index of where our value starts
        valueI = tempI + aType.length();
        tempS = description.substring(valueI);
        endI = tempS.indexOf(end);
        //System.out.println(mAData);
        int intMAData = Integer.parseInt(tempS.substring(0, endI));
        //System.out.println(intMAData);

        //Create lease 
        Lease l = new Lease(dDData,ilData, dMData, intMAData);
        //System.out.println("PASS");

        // Create the whip
        Vehicle whip = new Vehicle(nData, f, l);
        //System.out.println("PASS");

        //return the whip
	    return whip;
	}

    /* 
     * Description:
     *      The method calculates and assign CO2Emission, FuelCost, leastCost, of each vehicle.
     *      
     * Parameters:
     *      vehicles: 
     *          an array of Vehicle objects, initilized by getVehicles() method
     *      gasPrice: 
     *          a double representing the price of gas in dollar/gallon
     *      electricityPrice: 
     *			a double representing the price of gas in dollar/kWh
     * Hint:
     *      **********REMEMBER charger cost for electric cars***************
     *      feel free to use:
     *          computeCO2(double numberOfMonth, double usage, double mileageAllowance, double co2PerUnit )
     *          computeFuelCost(double numberOfMonth, double usage, double mileageAllowance, double fuelPrice)
     *          computeLeaseCost(double dueAtSigning, int numberOfMonths, double monthlyCost)
     */
	public static void computeCO2EmissionsAndCost( Vehicle[] vehicles, double gasPrice, double electricityPrice ){
	    //Loop through each vehicles
        for(int i = 0; i < vehicles.length; i++){
            //Need to get fuel tpye
            Fuel ftype = vehicles[i].getFuel();

            //Need to grab lease 
            Lease ltype = vehicles[i].getLease();

            //Need to grab lease lenght
            int leaseLen = ltype.getLeaseLength();
            //System.out.println(leaseLen);

            //Need mileageAllowance
            double mileage = ltype.getMileageAllowance();
            //System.out.println(mileage);

            //need useage
            double usage = ftype.getUsage();
            //System.out.println(usage);

            //Need due at signing
            double signing = ltype.getDueAtSigning();
            //System.out.println(signing);

            //need monthlyCost
            double monthlyCost = ltype.getMonthlyCost();
            //System.out.println(monthlyCost);

            //need to calculate fuel price and CO2PerUnit 
            double fPrice, CO2Unit;

            //checking fuel type
            int fuelType = ftype.getType();
            //System.out.println(fuelType);
            
            //Electric
            if (fuelType != 1) {
                CO2Unit = ftype.CO2EMITTED_ELECTRICITYCOMBUSTION;
                fPrice = electricityPrice;
                //System.out.println(CO2Unit);
                //System.out.println(fPrice);
            }
            else { //Gas
                CO2Unit = ftype.CO2EMITTED_GASCOMBUSTION;
                fPrice = gasPrice;
                //System.out.println(CO2Unit);
                //System.out.println(fPrice);
            }   

            //Need to compute CO2Emission using the following methods
            //computeCO2(double numberOfMonth, double usage, double mileageAllowance, double co2PerUnit )
            double co2E = computeCO2(leaseLen, usage, mileage, CO2Unit);
             //System.out.println(co2E);
            
            //Setting the CO2E to the vehicle
            vehicles[i].setCO2Emission(co2E);
             //System.out.println("PASS");

            //setting fuel cost using the following method:
            //computeFuelCost(double numberOfMonth, double usage, double mileageAllowance, double fuelPrice)
            double fCost = computeFuelCost(leaseLen, usage, mileage, fPrice);
             //System.out.println(fCost);
            
            //Setting the fuel cost to vechical
            vehicles[i].setFuelCost(fCost);
            //System.out.println("PASS");

            //setting lease cost using the following method:
            //computeLeaseCost(double dueAtSigning, int numberOfMonths, double monthlyCost)
            double lCost = computeLeaseCost(signing, leaseLen, monthlyCost);
            //System.out.println("lCost");

            //get vehicle fuel type
            int vFType = ftype.getType();
            //System.out.println(vFType);

            //compute total cost and set that
            if (vFType != 1) { //Electric
                //System.out.println("Electric!");
                //When dealing with electric we need to consider the charging cost
                double cCost = ftype.getCharger();
                //System.out.println(cCost);
                vehicles[i].setTotalCost(fCost + lCost + cCost);
                //System.out.println("PASS");
               continue; //Next please
            }
            
            //System.out.println("Gas!");

            //Gas
            vehicles[i].setTotalCost(fCost + lCost);
            //System.out.println("PASS");

        }
    }


    /**
     * How to compile:
     *     javac LeasingCost.java
     * How to run:         
     *     java LeasingCost vehicles.txt 3.85 11.0
     **/
	public static void main (String[] args) {
        String filename         = args[0];
        double gasPrice 		= Double.parseDouble( args[1] );
		double electricityPrice = Double.parseDouble( args[2] );

		Vehicle[] vehicles = createAllVehicles(filename); 
		computeCO2EmissionsAndCost(vehicles, gasPrice, electricityPrice);

		for ( Vehicle v : vehicles ) 
            System.out.println(v.toString());
    }
}
