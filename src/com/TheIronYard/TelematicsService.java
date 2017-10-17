package com.TheIronYard;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Report is the method because it follows the ()
public class TelematicsService {
    // I have added my file writer will be able to access that file
    // We added the expection because filewriter throws an exception
    public static void report(VehicleInfo vehicleInfo) throws IOException {
        File file = new File(vehicleInfo.getVIN() + ".json");
// You have to create the file writer object.
        FileWriter fileWriter = new FileWriter(file);

        // Convert VecInfo to a string that is format of JSON
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(vehicleInfo);

// Know we need to call that method from the  (write)
        fileWriter.write(json);
        fileWriter.close();
    }

    //



}

