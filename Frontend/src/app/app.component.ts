import { Component } from '@angular/core';
import { Book } from 'src/types/Book';
import { ResourceService } from './services/resource.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})

export class AppComponent {
  title = 'bookbox';
  
}
