#changes are made

def is_isosceles_triangle(a, b, c):
    if a == b or a == c or b == c:
        return True
    else:
        return False

a = float(input("Enter the length of side a: "))
b = float(input("Enter the length of side b: "))
c = float(input("Enter the length of side c: "))

if is_isosceles_triangle(a, b, c):
    print("The triangle with sides {}, {}, {} is an Isosceles triangle.".format(a, b, c))
else:
    print("The triangle with sides {}, {}, {} is not an Isosceles triangle.".format(a, b, c))1