//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

public class Calculator implements CalcOps{
    @Override
    public float add(float flt1, float flt2) {
        return (flt1 + flt2);
    }

    @Override
    public float subtract(float flt1, float flt2) {
        return (flt1 - flt2);
    }
    @Override
    public float multiply(float flt1, float flt2) {
        return (flt1 * flt2);
    }

    @Override
    public float divide(float flt1, float flt2) {
        return (flt1 / flt2);
    }

}
