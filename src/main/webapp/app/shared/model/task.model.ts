import { IEmployee } from 'app/shared/model/employee.model';
import { Language } from 'app/shared/model/enumerations/language.model';

export interface ITask {
  id?: number;
  title?: string | null;
  description?: string | null;
  language?: keyof typeof Language | null;
  employee?: IEmployee | null;
}

export const defaultValue: Readonly<ITask> = {};
