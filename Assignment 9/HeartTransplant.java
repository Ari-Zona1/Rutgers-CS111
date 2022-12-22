/**
 * 
 * HeartTransplant class
 * 
 * @author Arjan Abazovic aa2386
 */
public class HeartTransplant {

    // patient array, each Patient is read from the data file
    private Patient[] patients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause survivabilityByCause;

    /*
     * Default constructor
     * Initializes patients to null.
     * Initializes survivabilityByAge to null.
     * Initializes survivabilityByCause to null. 
     */
    public HeartTransplant() {
        this.patients = null;
        this.survivabilityByAge = null;
        this.survivabilityByCause = null;
    }

    /*
     * Returns patients
     */
    public Patient[] getPatients() {
        return this.patients;
    } 

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge getSurvivabilityByAge() {
        return this.survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause getSurvivabilityByCause() {
        return this.survivabilityByCause;
    }

    /*
     * 1) Initialize the instance variable patients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file, use StdIn.readInt() to read an integer.
     *    File Format: 
     *      ID, ethnicity, Gender, Age, Cause, Urgency, State of health
     * 
     *    Each line refers to one Patient, all values are integers.
     * 
     */
    public void readPatients (int numberOfLines) {
        // Initialize the instance variable patients array with the length specified by the parameter numberOfLines.
        this.patients = new Patient[numberOfLines];
    
        // Iterate over the number of lines specified in the parameter numberOfLines.
        for (int i = 0; i < numberOfLines; i++) {
            // Read an integer from the command line representing the patient ID.
            int id = StdIn.readInt();
            //System.out.println(id);

            // Read an integer from the command line representing the patient ethnicity.
            int ethnicity = StdIn.readInt();
            //System.out.println(ethnicity);

            // Read an integer from the command line representing the patient gender.
            int gender = StdIn.readInt();
            //System.out.println(gender);

            // Read an integer from the command line representing the patient age.
            int age = StdIn.readInt();
            //System.out.println(age);

            // Read an integer from the command line representing the patient cause.
            int cause = StdIn.readInt();
            //System.out.println(cause);

            // Read an integer from the command line representing the patient urgency.
            int urgency = StdIn.readInt();
            //System.out.println(urgency);

            // Read an integer from the command line representing the patient state of health.
            int state = StdIn.readInt();
            //System.out.println(state);

            // Create a new Patient object with the read data and add it to the patients array.
            this.patients[i] = new Patient(id, ethnicity, gender, age, cause, urgency, state);

            // Print statement indicating that the Patient has been created
            // System.out.println("Patient " + id + " has been created");
        }
    }
    

    /*
     * 1) Initialize the instance variable survivabilityByAge with a new survivabilityByAge object.
     * 
     * 2) Reads from the command line file to populate the object. 
     *    Use StdIn.readInt() to read an integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     */
    public void readSurvivabilityByAge (int numberOfLines) {
        // Initialize the instance variable survivabilityByAge with a new SurvivabilityByAge object.
        this.survivabilityByAge = new SurvivabilityByAge();
    
        // Iterate over the number of lines specified in the parameter numberOfLines.
        for (int i = 0; i < numberOfLines; i++) {
            // Read an integer from the command line representing the age.
            int age = StdIn.readInt();
            // Read an integer from the command line representing the years post transplant.
            int years = StdIn.readInt();
            // Read a double from the command line representing the rate.
            double rate = StdIn.readDouble();
            // Add the read data to the survivabilityByAge object.
            this.survivabilityByAge.addData(age, years, rate);
        }

        // Print statement indicating that the loop has finished running
        // System.out.println("Loop is done");
    }
    

    /*
     * 1) Initialize the instance variable survivabilityByCause with a new survivabilityByCause object.
     * 
     * 2) Reads from the command line file to populate the object. Use StdIn.readInt() to read an 
     *    integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     */
    public void readSurvivabilityByCause (int numberOfLines) {
        // Initialize the instance variable survivabilityByCause with a new SurvivabilityByCause object.
        this.survivabilityByCause = new SurvivabilityByCause();
    
        // Iterate over the number of lines specified in the parameter numberOfLines.
        for (int i = 0; i < numberOfLines; i++) {
            // Read an integer from the command line representing the cause.
            int cause = StdIn.readInt();
            // Read an integer from the command line representing the years post transplant.
            int years = StdIn.readInt();
            // Read a double from the command line representing the rate.
            double rate = StdIn.readDouble();
            // Add the read data to the survivabilityByCause object.
            this.survivabilityByCause.addData(cause, years, rate);
        }
        // Print statement indicating that the loop has finished running
        // System.out.println("Loop is done");
    }
    
    
    /*
     * Returns a Patient array containing the patients, 
     * from the patients array, that have age above the parameter age.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with age above the parameter age.
     * 
     * Return null if there is no Patient with age above the 
     * parameter age.
     */ 
    public Patient[] getPatientsWithAgeAbove(int age) {
        // Initialize a local variable to count the number of patients with age above the parameter age.
        int count = 0;
        
        // Iterate over the patients array and increment the count variable if a patient has age above the parameter age.
        for (Patient p: this.patients) {
            if (p.getAge() >= age) {
                count++;
                //System.out.println(count);
            }
        }
        
        //System.out.println("Count = " + " " +count);
        
        // If count is 0, return null as no patient was found with age above the parameter age.
        if (count == 0) {
            return null;
        }
        
        // Create a new array named result with the length equal to the value of count.
        Patient[] result = new Patient[count];
        
        // Initialize a local variable to keep track of the current index of the result array.
        int index = 0;
        
        // Iterate over the patients array again and add patients with age above the parameter age to the result array.
        for (Patient p: this.patients) {
            if (p.getAge() >= age) {
                result[index] = p;
                //System.out.println(result[index]);
                index++;
                //System.out.println(index);
                
            }
        }
        
        // Return the result array.
        return result;
    }
    

    /*
     * Returns a Patient array containing the patients, from the patients array, 
     * that have the heart condition cause equal to the parameter cause.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Patient with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Patient[] getPatientsByHeartConditionCause(int cause) {
        // Initialize a local variable to count the number of patients with the heart condition cause equal to the parameter cause.
        int count = 0;
        
        // Iterate over the patients array and increment the count variable if a patient has the heart condition cause equal to cause.
        for (Patient p: this.patients) {
            if (p.getCause() == cause) {
                count++;
                //System.out.println(count);
            }
        }
        
        // If count is 0, return null as no patient was found with the heart condition cause equal to cause.
        if (count == 0) {
            return null;
        }
        
        // Create a new array named result with the length equal to the value of count.
        Patient[] result = new Patient[count];
        
        // Initialize a local variable to keep track of the current index of the result array.
        int index = 0;
        
        // Iterate over the patients array again and add patients with the heart condition cause equal to cause to the result array.
        for (Patient p: this.patients) {
            if (p.getCause() == cause) {
                result[index] = p;
                //System.out.println(index);
                index++;

            }
        }
        
        // Return the result array.
        return result;
    }    

    /*
     * Returns a Patient array containing patients, from the patients array,
     * that have the state of health equal to the parameter state.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the state of health equal to the parameter state.
     * 
     * Return null if there is no Patient with the state of health 
     * equal to the parameter state.
     */ 
    public Patient[] getPatientsByUrgency(int urgency) {
        // Initialize a local variable to count the number of patients with the state of health equal to the parameter urgency.
        int count = 0;
        
        // Iterate over the patients array and increment the count variable if a patient has the state of health equal to urgency.
        for (Patient p: this.patients) {
            if (p.getUrgency() == urgency) {
                count++;
                //System.out.println(count);
            }
        }
        
        // If count is 0, return null as no patient was found with the state of health equal to urgency.
        if (count == 0) {
            return null;
        }
        
        // Create a new array named result with the length equal to the value of count.
        Patient[] result = new Patient[count];
        
        // Initialize a local variable to keep track of the current index of the result array.
        int index = 0;
        
        // Iterate over the patients array again and add patients with the state of health equal to urgency to the result array.
        for (Patient p: this.patients) {
            if (p.getUrgency() == urgency) {
                result[index] = p;
                //System.out.println(index);
                index++;

            }
        }
        // Return the result array.
        return result;
    }
    

    /*
     * Assume there is a heart available for transplantation surgery.
     * Also assume that the heart is of the same blood type as the
     * Patients on the patients array.
     * This method finds the Patient to be the recepient of this
     * heart.
     * 
     * The method returns a Patient from the patients array with
     * he highest potential for survivability after the transplant.
     * 
     * Assume the patient returned by this method will receive a heart,
     * therefore the Patient will no longer need a heart.
     * 
     * There is no correct solution, you may come up with any 
     * function to find the patient with the highest potential 
     * for survivability after the transplant.
     */
    public Patient getPatientForTransplant () {

        // Check if the patients array is empty.
        if (this.patients.length == 0) { //added
            // Return null if the array is empty.
            return null;
        }
    
        // initialize the highest potential for survivability to 0
        double highestSurvivability = -0;
        Patient chosenPatient = null;
        // loop through each patient in the patients array
        for (Patient p: this.patients) {
            // loop through each year from 0-4 indiciating 5 years //added
            for (int i = 0; i < 5; i++) {
                
                // Check if the selected patient has already received a transplant. False, if they did, else True if needed.
                if(p.getNeedHeart() == false){
                    continue;
                }
                // calculate the survivability of the current patient
                double currentSurvivability = this.survivabilityByAge.getRate(p.getAge(), i) * this.survivabilityByCause.getRate(p.getCause(), i);
                // if the current patient has a higher potential for survivability than the previous patients
                if (currentSurvivability > highestSurvivability) {
                    // update the highest potential for survivability
                    highestSurvivability = currentSurvivability;
                    // update the chosen patient
                    chosenPatient = p;
                }
            }
        }
    
        // Check if the selected patient is null.
        if (chosenPatient == null) { //added
            // Return null if the selected patient is null.
            return null;
        }
    
        // Check if the selected patient has already received a transplant.
        if (!chosenPatient.getNeedHeart()) { //added Test case 6
            // Return null if the selected patient has already received a transplant.
            return null;
        }
        
        // Set the needHeart instance variable of the selected patient to false to indicate that the patient has received a transplant.
        chosenPatient.setNeedHeart(false); //added
    
        // Return the selected patient.
        return chosenPatient;
    }
}
