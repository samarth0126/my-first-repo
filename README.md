# CGPA Calculator in C

A simple program to calculate the Cumulative Grade Point Average (CGPA) of a student, developed in the C programming language.

---

## Features

- Input grades for multiple courses.
- Specify the credit hours for each course.
- Calculate Semester GPA (SGPA).
- Compute overall CGPA across multiple semesters.
- User-friendly interface.

---

## Table of Contents

1. [Installation](#installation)
2. [Usage](#usage)
3. [How It Works](#how-it-works)
4. [Contributing](#contributing)
5. [License](#license)

---

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/cgpa-calculator.git
    cd cgpa-calculator
    ```

2. Compile the program using any C compiler. For example, using GCC:
    ```bash
    gcc -o cgpa_calculator cgpa_calculator.c
    ```

3. Run the program:
    ```bash
    ./cgpa_calculator
    ```

---

## Usage

1. Start the program.
2. Enter the number of courses for the semester.
3. For each course, input:
   - Grade (on a scale, e.g., 0–4 or 0–10, depending on your system).
   - Credit hours for the course.
4. The program will calculate the SGPA for the semester.
5. Optionally, repeat for multiple semesters to compute the CGPA.

---

## How It Works

The program calculates the SGPA and CGPA using the formula:

### SGPA Formula:
\[
SGPA = \frac{\sum (\text{Grade Points} \times \text{Credit Hours})}{\sum \text{Credit Hours}}
\]

### CGPA Formula:
\[
CGPA = \frac{\sum (\text{SGPA} \times \text{Total Credit Hours in Semester})}{\sum \text{Total Credit Hours Across All Semesters}}
\]

The program ensures:
- Input validation for grades and credit hours.
- Accurate weighted averages for SGPA and CGPA.

---

## Example

### Sample Input:
