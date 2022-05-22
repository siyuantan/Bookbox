import { Author } from "./Author";

export class Book {
    public book_id;
    public isbn;
    public title;
    public price;
    public authorDetails;

    constructor(book_id: number, isbn: number, title: string, price: number, authorDetails: Author[]) {
        this.book_id = book_id;
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.authorDetails = authorDetails;
    }
}
