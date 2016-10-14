public class Main {
  public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
	int counter = 3;
	while(counter > 0){
            RobotConnection robCon = null;
		try{
			counter--;
			robCon = robotConnectionManager.getConnection();
			robCon.moveRobotTo(toX, toY);
			counter = 0;
		}
		catch(RobotConnectionException e){
			if (counter == 0){
				throw e;
			};
		}
		catch(Throwable t){
			throw  t;
		}
            	finally{
                	if (robCon != null){
                    		try{
                        	robCon.close();
                    	}
                catch(Throwable t){
                };
            };
       	};  
	}
	};
}
