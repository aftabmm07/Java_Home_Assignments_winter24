# Java_Home_Assignment#1_winter24

Matriculation number : 7222045

Explantion to the solved assignments

Problem#1
  > Diameters: The diameters of the Earth and the Sun are defined as 7600.0 and 865000.0 miles, respectively.
  > Radii Calculation: The radii are calculated by dividing the diameters by 2.
  > Volume Calculation: The volume of each sphere is calculated using the formula V = 4/3 * pi * (r*r*r)
  > Volume Ratio: The ratio of the volumes is computed by dividing the volume of the Sun by the volume of the Earth.

Problem#2
  > Labeled Continue: The outer loop is labeled outerLoop, allowing us to use continue
    outerLoop to skip directly to the next iteration of the outer loop when a divisor is found.
  > Removed isPrime Variable: The isPrime variable is no longer needed.
    Instead, we directly print the number if it has no divisors.
  > Square Root Check: The inner loop condition is modified to check
    divisibility only up to the square root of i (j * j <= i).

Problem#3
  > The program converts the text string into a character array for iteration.
  > It checks each character:
     - If it’s a letter, it increments the letters count and checks if it’s a vowel (by converting it to lowercase and checking against the string "aeiou").
     - If it’s a whitespace character, it increments the spaces count.
  > Finally, it prints the counts of vowels, consonants, and spaces.
> 
Problem#4
  > Input Text: The soliloquy is stored in the text variable.
  > Word Extraction: The split method is used with a regex that matches non-letter characters, effectively splitting the text into words.
  > Bubble Sort: A classic bubble sort algorithm is implemented to sort the array of words. The comparison is case-insensitive using compareToIgnoreCase.
  > Output: The sorted words are printed to the console, skipping any empty strings that may have resulted from the split.


