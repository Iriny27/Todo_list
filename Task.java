import java.util.Date;
public class Task {
      private int TaskId;
	  private String name;
	  private String description;
	  private String startDate;
	  private String dueDate;
	  private String status;
	  
	  public Task(String name, String description, String startDate, String dueDate, String status) {
	    this.name = name;
	    this.description = description;
	    this.startDate = startDate;
	    this.dueDate = dueDate;
	    this.status = status;
	    
	  }
	  
	  public Task() {
		super();
	}

	public String toString() {
	    return name + " - " + description + " - " + startDate + " to " + dueDate;
	  }
	  
	  public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

	  
	  public void setName(String name) {
	    this.name = name;
	  }
	  
	  public void setDescription(String description) {
	    this.description = description;
	  }
	  
	  public void setStartDate(String startDate) {
	    this.startDate = startDate;
	  }
	  
	  public void setDueDate(String dueDate) {
	    this.dueDate = dueDate;
	  }

	public int getTaskId() {
		return TaskId;
	}

	public void setTaskId(int taskId) {
		TaskId = taskId;
	}
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getDueDate() {
		return dueDate;
	}

}
