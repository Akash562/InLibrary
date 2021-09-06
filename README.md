# InLibrary Library For Android Application



# CustomAlert

## Library For Android Alert Dilaog   

allprojects { 


		   repositories { 
		
			  maven { url 'https://jitpack.io' } 
		  } 
  	 } 
  
  
  
    dependencies {
	        
	} 
  
  
  ## Add a Custom Alert 
  
  ![logo](https://github.com/Akash562/inLibrary/blob/master/app/ScreenShot/alert.png)
  
	Single_Alert PSA = new Single_Alert();
                PSA.Single_Alert(MainActivity.this);
                PSA.setTitle("TITLE");
                PSA.setTitleSize(14);
                PSA.setIcon(R.drawable.ic_android);
                PSA.setContent("Custom ALert Body");
                PSA.setContentSize(14);
                PSA.show(new Single_Alert.OnClickListener() {
                    @Override
                    public void onPositiveButtonClick() {
                        Toast.makeText(MainActivity.this, "Click Action Button", Toast.LENGTH_SHORT).show();
                        PSA.dismiss();
                    }
                });
		
## Add a Custom Toast

###### Pirate Toast Success  
![logo](https://github.com/Akash562/inLibrary/blob/master/app/ScreenShot/toast%20success.png)
                 
	 new Custom_Toast()
	 .Toast_Success(
	       this,                          // context
	       "Android Toast by PirateAK",  // message
	       16);                          // message size               
	      
###### Pirate Toast Error      
![logo](https://github.com/Akash562/inLibrary/blob/master/app/ScreenShot/toast%20error.png)

	 new Custom_Toast()
	 .Toast_Error(
	       this,                          // context
	       "Android Toast by PirateAK",  // message
	       16);                          // message size
	       
	       
###### Pirate Toast Warning	       
![logo](https://github.com/Akash562/inLibrary/blob/master/app/ScreenShot/toast%20warning.png)

	 new Custom_Toast()
	 .Toast_Warning(
	       this,                          // context
	       "Android Toast by PirateAK",  // message
	       16);                          // message size
	       
	       
