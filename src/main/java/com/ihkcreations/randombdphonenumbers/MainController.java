package com.ihkcreations.randombdphonenumbers;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Random;

public class MainController implements Initializable {

    @FXML
    private ComboBox<String> comboChooseSeq;

    @FXML
    private TextField txtRandomNumber;

    @FXML
    private TextField txtSeqField;
    boolean isEditable;

    String[] list = {"GP Old", "GP New", "Banglalink Old", "Banglalink New", "Teletalk", "Airtel", "Robi", "Choose Own"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboChooseSeq.getItems().addAll(list);
        comboChooseSeq.setOnAction(event -> {

            String checkSelectedSeq;
            if(comboChooseSeq.getSelectionModel().getSelectedItem() == null){
                checkSelectedSeq = "";
            }else{
                checkSelectedSeq = comboChooseSeq.getSelectionModel().getSelectedItem();
            }


            switch (checkSelectedSeq) {

                case "GP Old" -> {
                    if(isEditable){
                       txtSeqField.setEditable(false);
                    }
                    txtSeqField.setText("017");}
                case "GP New" -> {
                    if(isEditable){
                        txtSeqField.setEditable(false);
                    }
                    txtSeqField.setText("013");}
                case "Banglalink Old" -> {
                    if(isEditable){
                        txtSeqField.setEditable(false);
                    }
                    txtSeqField.setText("019");}
                case "Banglalink New" -> {
                    if(isEditable){
                        txtSeqField.setEditable(false);
                    }
                    txtSeqField.setText("014");}
                case "Teletalk" -> {
                    if(isEditable){
                        txtSeqField.setEditable(false);
                    }
                    txtSeqField.setText("015");}
                case "Airtel" -> {
                    if(isEditable){
                        txtSeqField.setEditable(false);
                    }
                    txtSeqField.setText("016");}
                case "Robi" -> {
                    if(isEditable){
                        txtSeqField.setEditable(false);
                    }
                    txtSeqField.setText("018");}
                case "Choose Own" -> {
                    txtSeqField.setText("");
                    txtSeqField.setEditable(true);
                    isEditable = true;

                }
            }
        });
    }


    public void generateRandomNumber() {
        Random rand = new Random();
        int max = 99999999;
        int min = 10000000;
        String eightNumbers = String.valueOf(rand.nextInt(max - min + 1) + min);

        String seq = txtSeqField.getText();
        if(seq == null){
            seq = "";
        }
        String newNumber = seq + eightNumbers;
        txtRandomNumber.setText(newNumber);
    }
}
