import { Component, Input, OnInit } from '@angular/core';
import { Book } from 'src/types/Book';

@Component({
  selector: 'app-book-card',
  templateUrl: './book-card.component.html',
  styleUrls: ['./book-card.component.scss']
})
export class BookCardComponent implements OnInit {

  @Input() book: Book = new Book(0, 0, '', 0, []);

  constructor() { }
  
  ngOnInit(): void {
  }

}
