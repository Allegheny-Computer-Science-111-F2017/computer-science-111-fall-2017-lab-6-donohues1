# Reflection by Sarah Donohue

My most challenging part of the lab was remembering the little things. We have
used the read in command now many times, therefore I was comfortable with doing
the first step and using the scanner with it. One challenge I came across was
changing the DNA string to upper case in the other GVIM. To do this I had to
actually go into that window and change it, I was stuck on that part for a
while.

I used sequence and replace methods to compute the complement of the DNA
String. The sequence ran my code in order one line at a time until it reached
the last line. I then used the random method to insert DNA letters into the
string. I used 'char' in order to place a random character in the output line
and 'int' to place a random number into the line of output. What was
challenging was in the use of random is that I declared the random at the top
of the program, but did not use it until later in the steps, which the gradle
build did not allow. I realized that I needed to declare the random closer to
the point where I used it, which was within three lines.

I have never come across deleting something from the output, and this is where
it became challenging. I again used random 'int' to locate where the deletion
would happen, and then used a Substring to extract the DNA character. I also
used a random replace command to show the location where to replace it.
