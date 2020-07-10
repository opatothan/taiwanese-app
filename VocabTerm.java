
public class VocabTerm {
	String englishDef; 
	String chineseTraditionalDef; 
	String chineseSimplifiedDef; 
	String taiwanesePinyin; 
	String chinesePinyin;
	boolean isFavorited = false;
	MediaPlayer soundClip;
	String zhuyin;
	
	public VocabTerm(String englishDef, String chineseTraditionalDef, String chineseSimplifiedDef, String taiwanesePinyin, String chinesePinyin, String zhuyin, String soundFileName) {//i assume the default setting for isFavorited is false, so just use this when adding new terms
		this.englishDef = englishDef; 
		this.chineseTraditionalDef = chineseTraditionalDef; 
		this.chineseSimplifiedDef = chineseSimplifiedDef; 
		this.taiwanesePinyin =taiwanesePinyin; 
		this.chinesePinyin = chinesePinyin;
		this.zhuyin= zhuyin;
		
		if(!soundFileName.contentEquals("")) {
		    int idSound = context.getResources().getIdentifier(fileName, "raw",context.getPackageName()); 
		    /**
		     * you need to replace "context" with the context of whatever you're using, don't miss the bottom one too. 
		     * I'm assuming you store the audio files in"raw", but if not just change to whichever filename you're using
		     * 
		     */
		    if(idSound!=0) {
		    	soundClip = MediaPlayer.create(context, idSound);
		    }
		    
		}
	}

	
	public VocabTerm(String englishDef, String chineseTraditionalDef, String chineseSimplifiedDef, String taiwanesePinyin, String chinesePinyin, boolean isFavorited) {//this time with isFavorited
		this.englishDef = englishDef; 
		this.chineseTraditionalDef = chineseTraditionalDef; 
		this.chineseSimplifiedDef = chineseSimplifiedDef; 
		this.taiwanesePinyin =taiwanesePinyin; 
		this.chinesePinyin = chinesePinyin;
		this.isFavorited = isFavorited;
	}
	

	
	public void playSound() {
		try {
			soundClip.start();
		}
		catch(Exception E) {
			System.out.println("Something went wrong with playing the file for "+chinesePinyin+". Check if the file exists.");
		}
	}

	
	// rest of this stuff is just getters and setters///////////////////////////////////////////////////
	public String getEnglishDef() {
		return englishDef;
	}

	public void setEnglishDef(String englishDef) {
		this.englishDef = englishDef;
	}

	public String getChineseTraditionalDef() {
		return chineseTraditionalDef;
	}

	public void setChineseTraditionalDef(String chineseTraditionalDef) {
		this.chineseTraditionalDef = chineseTraditionalDef;
	}

	public String getChineseSimplifiedDef() {
		return chineseSimplifiedDef;
	}

	public void setChineseSimplifiedDef(String chineseSimplifiedDef) {
		this.chineseSimplifiedDef = chineseSimplifiedDef;
	}

	public String getTaiwanesePinyin() {
		return taiwanesePinyin;
	}

	public void setTaiwanesePinyin(String taiwanesePinyin) {
		this.taiwanesePinyin = taiwanesePinyin;
	}

	public String getChinesePinyin() {
		return chinesePinyin;
	}

	public void setChinesePinyin(String chinesePinyin) {
		this.chinesePinyin = chinesePinyin;
	}

	public boolean isFavorited() {
		return isFavorited;
	}

	public void setFavorited(boolean isFavorited) {
		this.isFavorited = isFavorited;
	}


}