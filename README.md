# 📚 LibraSpace

A desktop library app for **borrowing books** and **reserving study rooms**, with separate screens for students and librarians. Built in Java with a Swing interface and an SQLite database.

## Features

**Students**
- Sign in with student ID, name, email and phone number (new students are saved to the database)
- **Library Books** — find a book by ID or name, browse all books, borrow a book, view your borrowed books, and return one
- **Room Reservation** — find a study room, reserve it for a date, and view your reservations

**Librarians**
- Sign in with librarian ID, name, email and phone number
- **Manage Books** — add, update, delete and search books by title
- **Manage Rooms** — add, update, delete and find study rooms (rooms can be Available, Pending, In Maintenance or Closed)

## Built with

| | |
|---|---|
| Language | Java 17 |
| Interface | Java Swing, designed with the NetBeans GUI Builder |
| Database | SQLite, through [sqlite-jdbc](https://github.com/xerial/sqlite-jdbc) 3.51.0.0 |
| Build tool | Maven |

## Getting started

**You need:** JDK 17 or newer, and either [NetBeans](https://netbeans.apache.org) or Maven. To create the database you also need the `sqlite3` command-line tool or [DB Browser for SQLite](https://sqlitebrowser.org).

1. **Clone the repo**
   ```
   File → Clone repository   (GitHub Desktop)
   ```
2. **Create the database.** The real database isn't stored in the repo, so build it from the SQL scripts. Run this from inside `FinalProjectLibrarySystem/LibraSpaceApp`:
   ```
   sqlite3 libraryinfo.db < ../../database/schema.sql
   sqlite3 libraryinfo.db < ../../database/sample-data.sql
   ```
   No `sqlite3`? In DB Browser for SQLite choose *File → New Database*, save it as `libraryinfo.db` in that same folder, then *File → Import → Database from SQL file* for each script.
3. **Run the app**
   - **NetBeans:** open the `LibraSpaceApp` folder as a project and press Run. The main class is `WelcomeGUI`.
   - **Command line**, from the same folder:
     ```
     mvn compile exec:java
     ```

The sample data includes five books, five study rooms, and a couple of made-up students and a librarian you can sign in as.

## Project structure

```
LibraSpaceApp/
├── database/
│   ├── schema.sql            Table definitions
│   └── sample-data.sql       Books, rooms and made-up people
└── FinalProjectLibrarySystem/LibraSpaceApp/
    ├── pom.xml
    └── src/main/java/com/mycompany/libraspaceapp/
        ├── WelcomeGUI        Start screen (student or librarian)
        ├── *LogInGUI, LibraryMenuGUI, LibraryBooksGUI, ReservationGUI
        ├── LibrarianGUI, LibrarianManageBooksGUI, LibrarianManageRoomsGUI
        ├── User, Student, Librarian, Book, Room, Reservation     Data classes
        ├── BookType → DigitalBook, PaperBook      Abstract class and subclasses
        ├── Sharable, MyList<T>, LibraryExeception Interface, generic list, custom exception
        └── DBConnection, *DAO                     Database access
```

The `.form` files next to each GUI class are the NetBeans designer files, so keep them in the repo.

## Good to know

- `LibraSpaceApp.java` is a separate console demo of the OOP concepts used (generics, abstract classes, interfaces). The app itself starts from `WelcomeGUI`.
- Sign-in records a user's details but there are no passwords yet.

## Ideas for next steps

- Add passwords or another way to verify who is signing in
- Use `PreparedStatement` for every database query instead of joining strings together
- Store reservation dates as real dates instead of text
- Show a clear message when a room is already booked for a date

## Team

**ShouqAlshouq** · **hessaalmaazmi** · **jamilaalmarri** · **maha**
