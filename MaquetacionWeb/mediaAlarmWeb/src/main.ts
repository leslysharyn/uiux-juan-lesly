import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import {registerLicense} from '@syncfusion/ej2-base';
import { AppModule } from './app/app.module';


registerLicense('ORg4AjUWIQA/Gnt2VVhkQlFacldJWXxIekx0RWFab1l6cFNMZFlBJAtUQF1hSn5Qd0BiUHtWcnFQT2Je');
platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));
