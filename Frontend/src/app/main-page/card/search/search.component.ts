import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent implements OnInit {

  @Output() searchEntered = new EventEmitter();
  searchInput: string = '';

  constructor() { }

  ngOnInit(): void {
  }

  
  onEnter() {
    this.searchEntered.emit(this.searchInput);
  }
}
