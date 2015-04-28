package application;

import java.awt.Label;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class CustomerController {
	
    @FXML
    private Label firstNameField;
    @FXML
    private Label middleInitField;
    @FXML
    private Label lastNameField;
    @FXML
    private RadioButton femaleRadioButton;
    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private Label addressField;
    @FXML
    private Label cityField;
    @FXML
    private ComboBox stateCbx;
    @FXML
    private Label zipField;
    
    // Reference to main.
    private MainApp MainApp;
    
    // Constructor
    public CustomerController(){
    }
    
    private Stage dialogStage;
    private Customer customer;
    private boolean SaveClicked = false;

    @FXML
    private void initialize() {
    }

    /**
     * Sets the stage of this dialog.
     * 
     * @param dialogStage
     */
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;

        firstNameField.setText(customer.getFirstName());
        middleInitField.setText(customer.getMiddleInit());
        lastNameField.setText(customer.getLastName());
        addressField.setText(customer.getAddress());
        cityField.setText(customer.getCity());
        zipField.setText(Integer.toString(customer.getZip()));

        
        
    }

    /**
     * Returns true if the user clicked Save, false otherwise.
     * 
     * @return
     */
    public boolean isSaveClicked() {
        return SaveClicked;
    }

    /**
     * Called when the user clicks Save.
     */
   
    /**
    @FXML
    private void handleSave() {
        if (isInputValid()) {
            Customer.setFirstName(firstNameField.getText());
            Customer.setMiddleInit(middleInitField.getText());
            Customer.setLastName(lastNameField.getText());
            Customer.setAddress(addressField.getText());
            Customer.setCity(cityField.getText());
            Customer.setZip(Integer.parseInt(zipField.getText()));
           

            SaveClicked = true;
            dialogStage.close();
        }
    }
    **/

    /**
     * Called when the user clicks Clear.
     */
    
    /**
    @FXML
    private void handleClear() {
    	  Customer.setFirstName("");
          Customer.setMiddleInit("");
          Customer.setLastName("");
          Customer.setAddress("");
          Customer.setCity("");
    }
    
    */ 

    /**
     * Validates the user input in the text fields.
     * 
     * @return true if the input is valid
     */
    private boolean isInputValid() {
        String errorMessage = "";

        if (firstNameField.getText() == null || firstNameField.getText().length() == 0) {
            errorMessage += "No valid first name!\n"; 
        }
        if (lastNameField.getText() == null || lastNameField.getText().length() == 0) {
            errorMessage += "No valid last name!\n"; 
        }
        if (middleInitField.getText() == null || middleInitField.getText().length() == 0) {
            errorMessage += "No valid middle initial!\n"; 
        }
        if (addressField.getText() == null || addressField.getText().length() == 0) {
            errorMessage += "No valid address!\n"; 
        }

        if (zipField.getText() == null || zipField.getText().length() == 0) {
            errorMessage += "No valid zip code!\n"; 
        } else {
            // try to parse the zip code into an int.
            try {
                Integer.parseInt(zipField.getText());
            } catch (NumberFormatException e) {
                errorMessage += "No valid postal code (must be an integer)!\n"; 
            }
        }

        if (cityField.getText() == null || cityField.getText().length() == 0) {
            errorMessage += "No valid city!\n"; 
        }


        if (errorMessage.length() == 0) {
            return true;
        } else {
            // Show the error message.
            Alert alert = new Alert(AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please correct invalid fields");
            alert.setContentText(errorMessage);

            alert.showAndWait();

            return false;
        }
    }
}
    
    
    
