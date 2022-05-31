package com.employee;

public class manager extends employee{
		private int incentive;
		public int getIncentive() {
			return incentive;
		}

		public void setIncentive(int incentive) {
			this.incentive = incentive;
		}
		public void total_salary() {
			System.out.println("Total salary of manager :"+(basic + incentive));
		}
	}
