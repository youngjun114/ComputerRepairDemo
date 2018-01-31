/**
 * the PriceList class reads price and labor hours from txt file
 */

import java.util.*;
import java.io.*;

public class PriceList
{
    private Scanner x;
    public void openFile()
    {
        try
        {
            x = new Scanner(new File("PriceList.txt"));
        }
        catch(Exception e)
        {
            System.out.println("File Not Found");
        }
    }

    public double getPrice(String item)
    {
        double price = 0.0;
        while(x.hasNext())
        {
            String part = x.next();
            String priceFromList = x.next();
            String hour = x.next();
            double finalPrice = Double.parseDouble(priceFromList);
            if(part.equalsIgnoreCase(item))
            {
                price = finalPrice;
                return price;

            }
            else
            {
                price = price;
            }
        }
        return price;
    }

    public int getHours(String item)
    {
        String part = "";
        double price = 0.0;
        int hour = 0;
        int finalHour = 0;
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("PriceList.txt"));
            String line = null;
            while((line = br.readLine()) != null)
            {
                String tmp[] = line.split("\t");
                part = tmp[0];
                price = Double.parseDouble(tmp[1]);
                hour = Integer.parseInt(tmp[2]);
                if(part.equalsIgnoreCase(item))
                {
                    finalHour = hour;
                    return finalHour;
                }
                else
                {
                    finalHour = finalHour;
                }
            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return finalHour;
    }

    public void closeFile()
    {
        x.close();
    }
}