import { Component, OnInit } from '@angular/core';
import { Book } from 'src/types/Book';
import { ResourceService } from '../services/resource.service';

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.scss']
})
export class MainPageComponent implements OnInit {

  retrievedBooks: Book[] = [];
  
  constructor(private resource: ResourceService) {
    resource.getAllBooks().subscribe((books) => {
      this.retrievedBooks = books;
    });
  }

  ngOnInit(): void {
  }

  getBooksBySearchInput(searchBookTerm: string) {
    this.resource.getBookByTitle(searchBookTerm).subscribe((books) => {
      this.retrievedBooks = books;
    })
  }

  searchEntered(searchInput: string) {
    this.getBooksBySearchInput(searchInput);
  }

}
