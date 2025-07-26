class Car:
    def __init__(self, make, model,year):
        self.make = make
        self.model = model
        self.year = year
    def start_engine(self):
        print(f"The car make {self.make} {self.model} and year {self.year}")



car1 = Car("Tata", "punch", "2029")
car1.start_engine()

