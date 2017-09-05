package Person;

public class Person {
    private final Gender gender;
    private final String name;
    private Person spouse;   

    public Person getSpouse () {
        return spouse;
    }

    public void setSpouse ( Person spouse ) {
        this.spouse = spouse;
    }



    public Person ( Gender gender, String name ) {
        this.gender = gender;
        this.name = name;
    }

    public Person ( Gender gender, String name, Person spouse) {
        this.gender = gender;
        this.name = name;
        this.spouse = spouse;

    }
    /**
     * This method checks gender of persons. If genders are not equal - tries to marry.
     * If one of them has another spouse - execute divorce(sets spouse = null for husband and wife.
     * Example: if both persons have spouses - then divorce will set 4 spouse to null) and then executes marry().
     * @param person - new husband/wife for this person.
     * @return - returns true if this person has another gender than passed
     * person and they are not husband and wife, false otherwise
     */
    public boolean Marry(Person person) {
        if (gender != person.gender){
            if (spouse == person.spouse && spouse != null) return false;
            this.Divorce ();
            person.Divorce ();
            spouse = person;
            person.spouse = this;
            return true;
        }
        return false;
    }

    /**
     * Sets spouse = null if spouse is not null
     * @return true - if person status has been changed
     */
    public boolean Divorce() {
        if (spouse != null) {
            spouse.spouse = null;
            spouse = null;
            return true;
        }
        return false;


    }

}
