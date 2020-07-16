public class Solution {
    /*
     * @param a: parameter of the equation
     * @param b: parameter of the equation
     * @param c: parameter of the equation
     * @return: a double array, contains at most two root
     */
    public double[] rootOfEquation(double a, double b, double c) {
        if ((b * b - 4 * a * c) < 0){
            return new double[0];
        }
        if ((b * b - 4 * a * c) == 0){
            double[] root = new double[1];
            root[0] = -b / (2 * a);
            return root;
        }
        else {
            double[] root = new double[2];
            double delta = Math.sqrt(b * b - 4 * a * c);
            root[0] = (-b + delta) / (2 * a);
            root[1] = (-b - delta) / (2 * a);

            if (root[0] > root[1]){
                double temp = root[0];
                root[0] = root[1];
                root[1] = temp;
            }
            return root;
        }

    }

}
