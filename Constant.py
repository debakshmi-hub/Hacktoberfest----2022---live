class Game(tkinter.Frame):
    # creating the framework
    def __init__(self):
        tkinter.Frame.__init__(self)
        self.grid()
        self.master.title('2048')

        self.mainGrid = tkinter.Frame(
            self, bg="#161616", bd=3, width=400, height=400)
        self.mainGrid.grid(pady=(100, 0))
        self.make_grid()
        self.begin_game()
        # commands to be followed when corresponding keys r pressed
        self.master.bind("<Left>", self.left)
        self.master.bind("<Right>", self.right)
        self.master.bind("<Up>", self.up)
        self.master.bind("<Down>", self.down)

        self.mainloop()

    # creating the grids
    def make_grid(self):
        self.cells = []
        # making a 4 X 4 grid
        for i in range(4):
            row = []
            for j in range(4):
                cell_frame = tkinter.Frame(
                    self.mainGrid,
                    bg="azure4",
                    width=100,
                    height=100)
                cell_frame.grid(row=i, column=j, padx=5, pady=5)
                cell_number = tkinter.Label(self.mainGrid, bg="azure4")
                cell_number.grid(row=i, column=j)
                cell_data = {"frame": cell_frame, "value": cell_number}
                row.append(cell_data)
            self.cells.append(row)

        # Displaying the score
        score_frame = tkinter.Frame(self)
        score_frame.place(relx=0.5, y=45, anchor="center")
        tkinter.Label(
            score_frame,
            text="Score"
        ).grid(
            row=0)
        self.score_label = tkinter.Label(score_frame, text="0")
        self.score_label.grid(row=1)
