	@Override
	public void paint(Graphics g) {
		
		Display display = Display.getDefault();
		Monitor primary = display.getPrimaryMonitor();
		Rectangle bounds = primary.getBounds();
		
		int screenWidth = bounds.width;
		int screenHeight = bounds.height;
		
		g.drawLine(60,60,60,screenHeight-120);
		g.drawLine(60,60,screenWidth-60,60);
		g.drawLine(screenWidth-60,60,screenWidth-60,screenHeight-120);
		g.drawLine(screenWidth-60, screenHeight-120, 60, screenHeight-120);
		
		int proportionalHeight = screenWidth/14;
		int proportionalWidth = screenHeight/16;
		
		g.drawLine(60, proportionalHeight, (screenWidth-60), proportionalHeight);
		int newWidth = proportionalWidth*4;
	
		g.drawLine(newWidth, proportionalHeight, newWidth,60);
	    g.drawLine(screenWidth-newWidth, proportionalHeight, screenWidth-newWidth, 60);
	    g.setColor(Color.black);
	
	}