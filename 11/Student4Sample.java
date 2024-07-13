class Student4 {
    private String name;
    private double gpa;

    public Student4 (String aName, double aGpa ) //コンストラクタ

    if(testName(aName)&&testGpa(aGpa)) {

        name = aName; 
        gpa = aGpa; 

        }else{
        System.out.println("エラー");
        System.exit(1); //プログラム終了
        }

    public void setStudent4(String aName, double aGpa) //セッター

    public String getName( ) //ゲッター

    public double getGpa( ) //ゲッター

    private boolean test(int i, int j) { // プライベートメソッド
        return i >= 0 && j >= 0;
    }

}