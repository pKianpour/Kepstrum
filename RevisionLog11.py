from tkinter import * 
import tkinter as tk

root = tk.Tk()
numberOfFields = 2.5
screenWidth = root.winfo_screenwidth()
screenHeight = root.winfo_screenheight()
fieldCounter = 0

class revisionLog(tk.Frame):
    def __init__(self, parent):
        global numberOfFields
        global screenWidth
        global screenHeight
        tk.Frame.__init__(self, parent)


        self.canvas = tk.Canvas (self, width=screenWidth, height=screenHeight,background ="white")
        #this means adjusting dimensions as needed and we are filling the window
        self.canvas.pack(fill="both", expand=True)

        blackLine = self.canvas.create_line(60,60,60,screenHeight-120, fill="black")
        blackLine = self.canvas.create_line(60,60,screenWidth-60,60, fill = "black")
        blackLine = self.canvas.create_line(screenWidth-60,60,screenWidth-60,screenHeight-120, fill="black")
        blackLine = self.canvas.create_line(screenWidth-60,screenHeight-120,60,screenHeight-120, fill="black")

        proportionalHeight = screenHeight/10
        proportionalWidth = (screenWidth/16)
    
        # black lines representing 3 lines at top
        blackLine = self.canvas.create_line(60,proportionalHeight, screenWidth-60, proportionalHeight, fill="black")
        blackLine = self.canvas.create_line(proportionalWidth*2.5,proportionalHeight,proportionalWidth*2.5,60, fill="black")
        blackLine = self.canvas.create_line(screenWidth-(proportionalWidth*2.5),proportionalHeight,screenWidth-(proportionalWidth*2.5),60, fill="black")

        #width and height proportionality for "add a field"
        fieldWidthAlignment = screenWidth/10

        #DNA map text
        self.canvas.create_text(125,90, text="DNA MAP", font="bold 18")
        
        #add a field button
        fieldButton = tk.Button(self, text = "Add a FIELD", fg="black", command=self.addNewField)
        fieldButton.configure(width = 10, bg = "#FFDAB9")
        fieldButton_window = self.canvas.create_window(fieldWidthAlignment, proportionalHeight *1.5, anchor=W,window=fieldButton)

        #revision disabled button and text entry
        revisionButton = tk.Button(self, text = "Revision", state='disabled',fg="black")
        revisionButton.configure(width = 6, bg = "#f49541", relief=RAISED)
        revisionButton.pack(side=LEFT)
        revisionButton = self.canvas.create_window(fieldWidthAlignment, proportionalHeight * 2, anchor=W,window=revisionButton)
        revisionEntry = tk.Entry(self.canvas)
        revisionEntry.configure(bg="#d4ffd4")
        self.canvas.create_window(fieldWidthAlignment,proportionalHeight*numberOfFields,anchor = W,window = revisionEntry)

        #date disabled button and text entry
        dateButton = tk.Button(self, text = "Date", state=DISABLED,fg="black")
        dateButton.configure(width = 4, bg = "#f49541", relief = RAISED)
        dateButton.pack(side=LEFT)
        dateButton = self.canvas.create_window(fieldWidthAlignment*2, proportionalHeight * 2, anchor=W, window=dateButton)
        dateEntry = tk.Entry(self.canvas)
        dateEntry.configure(bg="#d4ffd4")
        self.canvas.create_window(fieldWidthAlignment*2,proportionalHeight*numberOfFields,window = dateEntry, anchor=W)

        #inital disabled button and text entry
        initialButton = tk.Button(self, text = "Initial", anchor = W, state=DISABLED,fg="black")
        initialButton.configure(width = 4, bg = "#f49541", relief = RAISED)
        initialButton.pack(side=LEFT)
        initialButton = self.canvas.create_window(fieldWidthAlignment*3, proportionalHeight * 2, anchor=W, window=initialButton)
        initialEntry = tk.Entry(self.canvas)
        initialEntry.configure(bg="#d4ffd4")
        self.canvas.create_window(fieldWidthAlignment*3,proportionalHeight*numberOfFields,window = initialEntry, anchor=W)

        #Description disabled button and text entry
        descriptionButton = tk.Button(self, text = "Description", anchor = W, state=DISABLED,fg="black")
        descriptionButton.configure(width = 9, bg = "#f49541", relief = RAISED)
        descriptionButton.pack(side=LEFT)
        descriptionButton = self.canvas.create_window(fieldWidthAlignment*4, proportionalHeight * 2, anchor=W, window=descriptionButton)
        descriptionEntry = tk.Entry(self.canvas)
        descriptionEntry.configure(bg="#d4ffd4")
        self.canvas.create_window(fieldWidthAlignment*4,proportionalHeight*numberOfFields,window = descriptionEntry, anchor=W,width=350)

        #code disabled button and text entry
        codeButton = tk.Button(self, text = "Code", anchor = W, state=DISABLED,fg="black")
        codeButton.configure(width = 4, bg = "#f49541", relief = RAISED)
        codeButton.pack(side=LEFT)
        codeButton = self.canvas.create_window(fieldWidthAlignment*6, proportionalHeight * 2, anchor=W, window=codeButton)
        codeEntry = tk.Entry(self.canvas)
        codeEntry.configure(bg="#d4ffd4")
        self.canvas.create_window(fieldWidthAlignment*6,proportionalHeight*numberOfFields,window = codeEntry, anchor=W)
        
        #draft disabled button with save as draft button
        draftButton = tk.Button(self, text = "Draft", anchor = W, state=DISABLED,fg="black")
        draftButton.configure(width = 4, bg = "#f49541", relief = RAISED)
        draftButton.pack(side=LEFT)
        draftButton = self.canvas.create_window(fieldWidthAlignment*7, proportionalHeight * 2, anchor=W, window=draftButton)
        saveDraftButton = tk.Button(self, text ="Save as draft",anchor=W)
        saveDraftButton.configure(width=10, bg ="#FFDAB9", relief = RAISED)
        self.canvas_window = self.canvas.create_window(fieldWidthAlignment*7, proportionalHeight*numberOfFields, anchor=W, window=saveDraftButton)

        #final disabled button with save as draft button
        finalButton = tk.Button(self, text = "Final", anchor = W, state=DISABLED,fg="black")
        finalButton.configure(width = 4, bg = "#f49541", relief = RAISED)
        finalButton = self.canvas.create_window(fieldWidthAlignment*8, proportionalHeight * 2, anchor=W, window=finalButton)
        saveReleaseButton = tk.Button(self, text ="Save & Release",anchor=W)
        saveReleaseButton.configure(width=12, bg ="#FFDAB9", relief = RAISED)
        self.canvas_window = self.canvas.create_window(fieldWidthAlignment*8, proportionalHeight*numberOfFields, anchor=W, window=saveReleaseButton)

        #Releaze disabled button with confirm button
        releazeButton = tk.Button(self, text = "Release", anchor = W, state=DISABLED,fg="black")
        releazeButton.configure(width = 7, bg = "#f49541", relief = RAISED)
        releazeButton = self.canvas.create_window(fieldWidthAlignment*9, proportionalHeight * 2, anchor=W, window=releazeButton)
        confirmButton = tk.Button(self, text ="confirm",anchor=W)
        confirmButton.configure(width=6, bg ="#FFDAB9", relief = RAISED)
        canvas_window = self.canvas.create_window(fieldWidthAlignment*9, proportionalHeight*numberOfFields, anchor=W, window=confirmButton)

        # print button
        button10 = tk.Button(self, text = "        Print",anchor=W)
        button10.configure(width=10, bg ="#FFDAB9", relief = RAISED)
        button10_window = self.canvas.create_window(120, screenHeight-115, anchor=NW, window=button10)
        # DNA plot button
        button11 = tk.Button(self, text = "    DNA Plot",anchor=W)
        button11.configure(width=10, bg = "#FFDAB9", relief = RAISED)
        button11_window = self.canvas.create_window(210, screenHeight-115, anchor=NW, window=button11)

        # Help Button
        button12 = tk.Button(self, text = "  Help")
        button12.configure(width=10, bg = "#FFDAB9", relief = RAISED)
        button12_window = self.canvas.create_window(screenWidth-180, screenHeight-115, anchor=NW, window=button12)
        # Error Bar
        
    def addNewField(self):
        global numberOfFields
        global screenWidth
        global screenHeight
        global fieldCounter 
        proportionalHeight = screenHeight/10
        proportionalWidth = (screenWidth/16)
        fieldWidthAlignment = screenWidth/10
        print("Adding new field")
        numberOfFields += 0.25
        fieldCounter +=1
        if (fieldCounter > 22):
            exit()
        else:
            #revision text entry
            revisionEntry = tk.Entry(self.canvas)
            revisionEntry.configure(bg="#d4ffd4")
            self.canvas.create_window(fieldWidthAlignment,proportionalHeight*numberOfFields,anchor = W,window = revisionEntry)

            #date text entry
            dateEntry = tk.Entry(self.canvas)
            dateEntry.configure(bg="#d4ffd4")
            self.canvas.create_window(fieldWidthAlignment*2,proportionalHeight*numberOfFields,window = dateEntry, anchor=W)

            #inital text entry
            initialEntry = tk.Entry(self.canvas)
            initialEntry.configure(bg="#d4ffd4")
            self.canvas.create_window(fieldWidthAlignment*3,proportionalHeight*numberOfFields,window = initialEntry, anchor=W)

            #Description text entry
            descriptionEntry = tk.Entry(self.canvas)
            descriptionEntry.configure(bg="#d4ffd4")
            self.canvas.create_window(fieldWidthAlignment*4,proportionalHeight*numberOfFields,window = descriptionEntry, anchor=W,width=350)

            #code text entry
            codeEntry = tk.Entry(self.canvas)
            codeEntry.configure(bg="#d4ffd4")
            self.canvas.create_window(fieldWidthAlignment*6,proportionalHeight*numberOfFields,window = codeEntry, anchor=W)
            
            #save as draft button
            saveDraftButton = tk.Button(self, text ="Save as draft",anchor=W)
            saveDraftButton.configure(width=10, bg ="#FFDAB9", relief = RAISED)
            self.canvas_window = self.canvas.create_window(fieldWidthAlignment*7, proportionalHeight*numberOfFields, anchor=W, window=saveDraftButton)

            #save and release button
            saveReleaseButton = tk.Button(self, text ="Save & Release",anchor=W)
            saveReleaseButton.configure(width=12, bg ="#FFDAB9", relief = RAISED)
            self.canvas_window = self.canvas.create_window(fieldWidthAlignment*8, proportionalHeight*numberOfFields, anchor=W, window=saveReleaseButton)

            #Releaze confirm button
            confirmButton = tk.Button(self, text ="confirm",anchor=W)
            confirmButton.configure(width=6, bg ="#FFDAB9", relief = RAISED)
            canvas_window = self.canvas.create_window(fieldWidthAlignment*9, proportionalHeight*numberOfFields, anchor=W, window=confirmButton)        
'''
     def print(self):

        # U must install pywin32 and import modules:
        import win32print, win32ui, win32con  
        # X from the left margin, Y from top margin 
        # both in pixels
        X=50; Y=50
        # Separate lines from Your string 
        # for example:input_string and create 
        # new string for example: multi_line_string 
        multi_line_string = input_string.splitlines()  
        hDC = win32ui.CreateDC ()
        # Set default printer from Windows:
        hDC.CreatePrinterDC (win32print.GetDefaultPrinter ())
        hDC.StartDoc (the_name_will_appear_on_printer_spool)
        hDC.StartPage ()
        for line in multi_line_string:
             hDC.TextOut(X,Y,line)
             Y += 100
        hDC.EndPage ()
        hDC.EndDoc ()
'''
if __name__ == "__main__":
  
    revisionLog(root).pack(fill="both", expand=True)
    root.mainloop()
