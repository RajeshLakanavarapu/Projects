
import tkinter as tk
from config.CartManager import CartManager
from PIL import Image, ImageTk
from model.UserModel import User
# from view.LoginScreen import LoginScreen

class CheckoutScreen(tk.Toplevel):
    def __init__(self, cart_items):
            super().__init__()
            self.cart_manager = CartManager()
            self.cart_items = cart_items  # Store cart_items passed from the CartScreen
            self.title("Checkout")
            self.geometry("890x500+300+200")
            # Center the window on the screen
            self.update_idletasks()  # Update the window
            width = self.winfo_width()  # Get the width of the window
            height = self.winfo_height()  # Get the height of the window
            x = (self.winfo_screenwidth() // 2) - (width // 2)  # Calculate the x position
            y = (self.winfo_screenheight() // 2) - (height // 2)  # Calculate the y position
            self.geometry(f"+{x}+{y}")  # Set the new position
            

            self.resizable(False, False)
            self.configure(bg='white')
            # self.user=LoginScreen().user
            # print(self.user.firstname)
 
            # Display cart items and total for checkout
            # self.display_cart(cart_items, total)
            self.background_image = Image.open("resources/desi1.png")
            self.background_photo = ImageTk.PhotoImage(self.background_image)
            self.background_label = tk.Label(self, image=self.background_photo, bg="white")
            self.background_label.place(x=15, y=5)
            # self.back_button=tk.Button(self, text="Back",fg='black',bg='white',font=("Microsoft YaHei UI Light", 13,"bold"),command=self.back_to_products_screen,border=0)
            # self.back_button.place(x=800,y=130)
            self.order_items()
            
    def order_items(self):
          self.total = sum(item.price * int(item.qty) for item in self.cart_items)  # Recalculate the total
          self.order_frame=tk.Frame(self, bg="red")
          self.order_frame.place(x=50, y=110, width=600, height=300)
          self.total_label=tk.Label(self.order_frame, text=f"Total: {self.total}", bg="white", font=("Microsoft YaHei UI Light", 10, "bold"))
          self.total_label.place(x=20, y=10)
        #   self.total_label=tk.Label(self.order_frame, text=f"Total: {self.total}", bg="white", font=("Microsoft YaHei UI Light", 10, "bold"))
        #   self.total_label.place(x=20, y=10)


          
          


