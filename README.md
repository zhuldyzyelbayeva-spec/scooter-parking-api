# Assignment #3 — Responsive Web Design

## Student

- Name: Yelbayeva Zhuldyz
- Group: SE-2522

## Objective

The goal of this assignment is to create responsive web pages using CSS Media Queries and the Bootstrap Grid system.

The project demonstrates how a webpage adapts to different screen sizes:
- Mobile
- Tablet
- Desktop

## Tasks

### Task 0 — Responsive Typography

A simple webpage section with headings and paragraphs was created. CSS Media Queries are used to change font sizes for different screen sizes:

- Mobile: smaller font size
- Tablet: medium font size
- Desktop: larger font size

### Task 1 — Responsive Layout with Media Queries

Three boxes were created using CSS Flexbox and Media Queries. The layout changes depending on the screen size:

- Desktop: three boxes in one row
- Tablet: two boxes in the first row and one box in the second row
- Mobile: boxes are stacked vertically

This task uses only custom CSS Media Queries without Bootstrap Grid.

### Task 2 — Bootstrap Responsive Columns

Three columns were created using Bootstrap's 12-column grid system. The following Bootstrap classes are used:

```text
col-12
col-md-6
col-lg-4
```

## Responsive behavior:

Mobile: col-12 — one column takes the full width
Tablet: col-md-6 — two columns fit in one row
Desktop: col-lg-4 — three equal columns fit in one row
Task 3 — Bootstrap Navigation Bar
A responsive Bootstrap navigation bar was created.

### It includes:

Logo on the left
Navigation links on the right
Hamburger menu on smaller screens
Collapsible navigation links
Task 4 — Responsive Portfolio Page
A complete responsive portfolio page was created by combining Bootstrap Grid and custom CSS Media Queries.

### The portfolio contains:

Responsive Bootstrap navbar
Project cards
Bootstrap Grid layout
Personal information sidebar
Contact information
Footer
Responsive typography and spacing

The portfolio adapts to mobile, tablet, and desktop screen sizes.

## Project Structure

Assignment_3_Responsive_Web_Design/
-│
-├── index.html
-├── README.md
-│
-├── css/
-│   └── style.css
-│
-├── js/
-│   └── script.js
-│
-└── screenshots/

- Technologies
- HTML5
- CSS3
- CSS Media Queries
- Bootstrap 5.3
- JavaScript

## How to Run
Open the project folder.
Open index.html in a web browser.
Make sure you have an Internet connection because Bootstrap 5.3 is loaded from a CDN.
Resize the browser window or use Chrome DevTools Device Toolbar to test mobile, tablet, and desktop layouts.
Responsive Breakpoints

The project uses the following custom CSS breakpoints:

- Mobile: below 768px
- Tablet: 768px to 991.98px
- Desktop: 992px and above

Bootstrap Grid is used together with custom CSS Media Queries to create responsive layouts.

## Summary

This project demonstrates the principles of responsive web design. CSS Media Queries were used to adapt typography, spacing, and the three-box layout. Bootstrap's 12-column Grid was used to create responsive columns and portfolio cards. A Bootstrap responsive navbar was also implemented with a collapsible hamburger menu. The final portfolio combines Bootstrap Grid and custom CSS Media Queries to provide a clean and usable layout across mobile, tablet, and desktop screen sizes.
