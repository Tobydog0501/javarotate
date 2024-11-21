package matrix;

public interface vector {
    vector transpose(vector v);
    double dot(vector a, vector b);
    vector multiply(vector a, vector b);
    int col=0;
    int row=0;
    vector init(vector v);
}
