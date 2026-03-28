package com.api.request;

public class ProfileRequest {

    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private String mobileNumber;

    // ✅ Constructor
    public ProfileRequest(int id, String email, String firstName, String lastName, String mobileNumber) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
    }

    // ✅ Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getMobileNumber() { return mobileNumber; }
    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }

    @Override
    public String toString() {
        return "ProfileRequest [id=" + id + ", email=" + email + ", firstName=" + firstName +
                ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
    }

    // ✅ Builder Class
    public static class Builder {

        private int id;
        private String email;
        private String firstName;
        private String lastName;
        private String mobileNumber;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder mobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        // ✅ Build method
        public ProfileRequest build() {
            return new ProfileRequest(id, email, firstName, lastName, mobileNumber);
        }
    }
}