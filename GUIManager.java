public class GUIManager {
    Student student = new Student();
    StudentManager studentManager = new StudentManager();

    public void kampaHazirlik() {
        System.out.println("Bu projeye gösterilen ilginin büyüklüğünü açıkçası beklemiyordum. " +
                "(Şimdiden 30.000 kaydı geçtik.) Bu da demek oluyor ki muhtemelen Türkiye'de bugüne kadar yapılmış en kalabalık " +
                "profesyonel yazılım geliştirme eğitimini yapacağız.");
    }

    public void SSS() {
        System.out.println("Yazılım Geliştirici Yetiştirme Kampı ücretsiz mi olacak? " +
                "-Evet, ücretsiz olacak." +
                "Yazılım Geliştirici Yetiştirme Kampı nerede yayınlanacak? " +
                "-Kampımız canlı olarak yayınlanacak. Canlı yayın YouTube kanalımda gerçekleşecek. Canlı yayın alanına ulaşmak için tıklayınız. " +
                "Yayın saatini kaçırmamak için kanala abone olup hatırlatıcı eklemeyi unutmayınız. ");
    }

    public void girisYap() {
        student.getEmail();
        student.getPassword();
    }

    public void kayitOl(String yeniIsim, String yeniSoyisim, String yeniEposta, String yeniSifre) {

        studentManager.addName(yeniIsim);
        studentManager.addSurname(yeniSoyisim);
        studentManager.addEmail(yeniEposta);
        studentManager.addPassword(yeniSifre);

    }
}
