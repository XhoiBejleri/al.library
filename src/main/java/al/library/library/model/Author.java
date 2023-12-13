package al.library.library.model;

public class Author {
        private String name;
        private String nationality;

        public Author() {

        }

        // Constructor
        public Author(String name, String nationality) {
            this.name = name;
            this.nationality = nationality;
        }
        // Getters and Setters
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getNationality() {
            return nationality;
        }
        public void setNationality(String nationality) {
            this.nationality = nationality;
        }
    }
