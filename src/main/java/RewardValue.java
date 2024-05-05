public class RewardValue {
    int miles;
    double cash;

    // Accepts miles
    public RewardValue(int mile){
        miles = mile;
        cash = mile * 0.0035;
    }

    //Accept cash value
    public RewardValue(double amount){
        cash = amount;
        miles = (int) (cash / 0.0035);
    }

    public double getCashValue(){
        return cash;
    }

    public int getMilesValue(){
        return miles;
    }
}
