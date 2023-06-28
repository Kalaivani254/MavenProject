package com.onebill.readcsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Withmultithread {

	public static void main(String[] args) {
        String filePath = "/home/kalaivani/Downloads/sample.csv";
        int numThreads = 4; // Number of threads to use

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            ExecutorService executor = Executors.newFixedThreadPool(numThreads);

            String line;
            while ((line = reader.readLine()) != null) {
                Runnable worker = new CSVReaderWorker(line);
                executor.execute(worker);
            }

            executor.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class CSVReaderWorker implements Runnable {
        private String line;

        public CSVReaderWorker(String line) {
            this.line = line;
        }

      
        public void run() {
           
            String[] columns = line.split(",");
            for (String column : columns) {
                System.out.println(column);
            }
        }
    }
}
