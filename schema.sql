-- LibraSpace database schema (SQLite)
-- Create the database file with:  sqlite3 libraryinfo.db < database/schema.sql

CREATE TABLE student (
    student_id     TEXT PRIMARY KEY,
    student_name   TEXT NOT NULL,
    student_email  TEXT NOT NULL,
    student_phone  TEXT,
    books_borrowed VARCHAR(255) NULL
);

CREATE TABLE librarian (
    librarian_id    TEXT PRIMARY KEY,
    librarian_name  TEXT NOT NULL,
    librarian_email TEXT NOT NULL,
    librarian_phone TEXT
);

CREATE TABLE room (
    room_id  TEXT PRIMARY KEY,
    room_name TEXT NOT NULL,
    capacity INTEGER NOT NULL,
    status   TEXT
);

CREATE TABLE reservation (
    reservation_id   TEXT PRIMARY KEY,
    student_id       TEXT NOT NULL,
    room_id          TEXT,
    reservation_date TEXT NOT NULL,
    status           TEXT,
    librarian_id     TEXT
);

CREATE TABLE book (
    bookID     VARCHAR(255) PRIMARY KEY,
    title      VARCHAR(255) NOT NULL,
    author     VARCHAR(255) NOT NULL,
    publisher  VARCHAR(255),
    genre      VARCHAR(100),
    numPages   INT,
    isBorrowed BOOLEAN
);
