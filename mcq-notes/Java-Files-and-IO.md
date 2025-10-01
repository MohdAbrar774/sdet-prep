# Java — Files and I/O

This note summarizes Java’s java.io facilities for handling streams, files, and directories. It covers byte and character streams, standard streams, common classes, and practical examples.

## Table of Contents
- Overview
- Streams
- Byte Streams
  - FileInputStream
  - FileOutputStream
- Character Streams
  - FileReader
  - FileWriter
- Standard Streams
- Reading and Writing Files
- File Navigation and I/O
- Directories in Java
  - Creating Directories
  - Listing Directories
- Examples
- Class Hierarchy Diagram

---

## Overview

- The java.io package provides classes for input and output (I/O) operations.
- Streams represent an input source and an output destination.
- Data can be bytes, characters, objects, etc.

## Streams

A stream is a sequence of data.

- InputStream — reads data from a source.
- OutputStream — writes data to a destination.

Typical flow:
Source → Program → Destination

## Byte Streams

Used for 8-bit binary data. Common classes:
- FileInputStream
- FileOutputStream
- BufferedInputStream and BufferedOutputStream
- DataInputStream and DataOutputStream
- ByteArrayInputStream and ByteArrayOutputStream
- Filter streams and Object streams

### FileInputStream

Constructors:
java
InputStream f = new FileInputStream("C:/java/hello");
File f = new File("C:/java/hello");
InputStream in = new FileInputStream(f);


Common methods (selected):
- close()
- read()
- read(byte[] r)
- available()

### FileOutputStream

Purpose: create or open a file for writing bytes.

Constructors:
java
OutputStream f = new FileOutputStream("C:/java/hello");

File f = new File("C:/java/hello");
OutputStream os = new FileOutputStream(f);


Common methods (selected):
- close()
- write(int w)
- write(byte[] w)

## Character Streams

Used for 16-bit Unicode characters. Common classes:
- FileReader
- FileWriter
- BufferedReader and BufferedWriter

Note: Internally, FileReader and FileWriter still use byte streams, but with character encoding handling.

### FileReader

java
FileReader in = new FileReader("input.txt");
int c;
while ((c = in.read()) != -1) {
    // process char
}
in.close();


### FileWriter

java
FileWriter out = new FileWriter("output.txt");
out.write(c);
out.close();


## Standard Streams

- System.in — standard input stream.
- System.out — standard output stream.
- System.err — standard error stream.

Example (reading characters until 'q'):
java
import java.io.InputStreamReader;

public class ReadConsole {
    public static void main(String[] args) throws java.io.IOException {
        InputStreamReader cin = null;
        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters, 'q' to quit.");
            char c;
            do {
                c = (char) cin.read();
                System.out.print(c);
            } while (c != 'q');
        } finally {
            if (cin != null) cin.close();
        }
    }
}


Sample run:

$ javac ReadConsole.java
$ java ReadConsole
Enter characters, 'q' to quit.
1
e
q
q


## Reading and Writing Files

Hierarchy highlights:
- InputStream and OutputStream for bytes
- Reader and Writer for characters
- Buffered and Data streams for efficiency and typed I/O

Quick read-all-available-bytes demo:
java
InputStream is = new FileInputStream("test.txt");
int size = is.available();
for (int i = 0; i < size; i++) {
    System.out.print((char) is.read() + " ");
}
is.close();


## File Navigation and I/O

Useful classes:
- File
- FileReader
- FileWriter

The File class represents file and directory pathnames and provides utility methods for navigation and inspection.

## Directories in Java

### Creating Directories

- mkdir() — creates a single directory. Returns true on success, false on failure.
- mkdirs() — creates a directory and any non-existent parent directories.

Example:
java
import java.io.File;

public class CreateDir {
    public static void main(String[] args) {
        String dirname = "/tmp/user/java/bin";
        File d = new File(dirname);
        d.mkdirs(); // create with parents
    }
}


Notes:
- Java handles path separators by platform conventions.
- Using "/" on Windows usually still resolves correctly.

### Listing Directories

java
import java.io.File;

public class ReadDir {
    public static void main(String[] args) {
        try {
            File file = new File("/tmp");
            String[] paths = file.list();
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


Sample output:

test1.txt
test2.txt
ReadDir.java
ReadDir.class


## Examples

Copy a file with byte streams:
java
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }
}


Copy a file with character streams:
java
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("input.txt");
            out = new FileWriter("output.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }
}


Write bytes then read them:
java
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class ByteDemo {
    public static void main(String[] args) {
        try {
            int[] bWrite = {11, 21, 3, 40, 5};
            try (FileOutputStream os = new FileOutputStream("test.txt")) {
                for (int x : bWrite) os.write(x);
            }
            try (InputStream is = new FileInputStream("test.txt")) {
                int size = is.available();
                for (int i = 0; i < size; i++) {
                    System.out.print((char) is.read() + " ");
                }
            }
        } catch (Exception e) {
            System.out.print("Exception");
        }
    }
}


## Class Hierarchy Diagram

Monospace diagram of key java.io stream classes:


Object
├─ InputStream (abstract)
│  ├─ ByteArrayInputStream
│  ├─ FileInputStream
│  ├─ FilterInputStream
│  │  ├─ BufferedInputStream
│  │  ├─ DataInputStream
│  │  └─ PushbackInputStream
│  ├─ ObjectInputStream
│  └─ PipedInputStream
│
├─ OutputStream (abstract)
│  ├─ ByteArrayOutputStream
│  ├─ FileOutputStream
│  ├─ FilterOutputStream
│  │  ├─ BufferedOutputStream
│  │  ├─ DataOutputStream
│  │  └─ PrintStream
│  ├─ ObjectOutputStream
│  └─ PipedOutputStream
│
├─ Reader (abstract)
│  ├─ BufferedReader
│  ├─ CharArrayReader
│  ├─ FilterReader
│  ├─ InputStreamReader
│  │  └─ FileReader
│  ├─ PipedReader
│  └─ StringReader
│
└─ Writer (abstract)
   ├─ BufferedWriter
   ├─ CharArrayWriter
   ├─ FilterWriter
   ├─ OutputStreamWriter
   │  └─ FileWriter
   ├─ PipedWriter
   ├─ PrintWriter
   └─ StringWriter


Notes:
- Reader and Writer are for characters. InputStream and OutputStream are for bytes.
- Buffered variants wrap another stream for performance.
- Data streams support reading and writing Java primitives.
- Object streams support Java object serialization.

---