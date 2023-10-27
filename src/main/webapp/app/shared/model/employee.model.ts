import { ITask } from 'app/shared/model/task.model';

export interface IEmployee {
  id?: number;
  firstName?: string | null;
  lastName?: string | null;
  email?: string | null;
  phoneNumber?: string | null;
  tasks?: ITask[] | null;
}

export const defaultValue: Readonly<IEmployee> = {};
