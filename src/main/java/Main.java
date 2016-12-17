/**
 * Created by ocittwo on 12/17/16.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */
public class Main {

    public static void main(String[] args) {
        Orang orang = new Orang();
        orang.setNama_depan("Ahmad");
        orang.setNama_belakang("Rosid");

        System.out.println(orang.getNama_depan());
        System.out.println(orang.getNama_belakang());
    }

}
