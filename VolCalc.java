//    Assignment 1 Problem1

public class VolCalc {
        public static void main(String[] args) {
            // Diameters in miles
            double diameterEarth = 7600.0;
            double diameterSun = 865000.0;

            // Calculate the radii
            double radiusEarth = diameterEarth / 2.0;
            double radiusSun = diameterSun / 2.0;

            // Calculate the volumes using the formula V = 4/3 * π * r^3
            double volumeEarth = (4.0 / 3.0) * Math.PI * Math.pow(radiusEarth, 3);
            double volumeSun = (4.0 / 3.0) * Math.PI * Math.pow(radiusSun, 3);

            // Calculate the ratio of the volumes
            double volumeRatio = volumeSun / volumeEarth;

            // Output the results
            System.out.printf("The volume of the Earth is %.2f cubic miles,\n ", volumeEarth);
            System.out.printf("The volume of the Sun is %.2f cubic miles,\n ", volumeSun);
            System.out.printf("The ratio of the volume of the Sun to the volume of the Earth is %.2f.%n", volumeRatio);
        }
    }

/*

> Diameters: The diameters of the Earth and the Sun are defined as 7600.0 and 865000.0 miles, respectively.
> Radii Calculation: The radii are calculated by dividing the diameters by 2.
> Volume Calculation: The volume of each sphere is calculated using the formula V = 4/3 * pi * (r*r*r)
> Volume Ratio: The ratio of the volumes is computed by dividing the volume of the Sun by the volume of the Earth.
>
 */
