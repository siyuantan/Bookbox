import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Book } from 'src/types/Book';

@Injectable({
  providedIn: 'root'
})
export class ResourceService {

  constructor(private http: HttpClient) {}

  getAllBooks(): Observable<Book[]> {
    return this.http.get<Book[]>('http://localhost:8080/api/books');
  }
  
  getBookByTitle(bookTitle: string): Observable<Book[]> {
    return this.http.get<Book[]>(`http://localhost:8080/api/book?title=${bookTitle}`);
  }
}
