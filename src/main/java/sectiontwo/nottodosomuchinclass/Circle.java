package sectiontwo.nottodosomuchinclass;

class Circle extends Figure {
	final double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	double area() {
		return java.lang.Math.PI * (radius * radius);
	}
}
