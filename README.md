# Adapter Design Pattern With Spring Boot Example
Uygulamamızı geliştirirken tüm ihtiyaçları doğrudan biz karşılayamayız. Dışarıdan herhangi bir apiyi kullanma ihtiyacımız mutlaka olur. Bir aygıttan veri okuyabiliriz, bir sistemden kullanıcıları doğrulayabiliriz vb.

Bize sağlanan apiye göre bir service yazarsak sistemizi tamamen o apiye bağımlı hale getiririz. Bu durumda external api'nin service'ni bizim service'imize dönüştürmemiz daha mantıklı olacaktır.

Basit bir örnek verelim ; external api'miz A isimli interface veya service'ini sağlıyor diyelim. Biz de bu service'i kullanacağız diyelim.
Bu service yada interface'in daha generic bir halini yazarız. Yada belkide projemizde bu ihtiyacı karşılayan bir interface vardır.
Sonra bu interface'i implemente ederiz ve external api olan A isimli interface'i bu implemente ettiğimiz sınıfta kullanır çağırırız. Böylece ana service ve sistemizi yalıtımlamış oluruz. Bu external apiye ihtiyacımız kalmadığı an implemente ettiğimiz sınıfı silmemiz yeterli olacaktır ve hiç bir yerimiz etkilenmez bu değişiklikten.

Örneğimizde kullanıcıların kayıt olduğu bir sosyal paylaşım sistemimiz olduğunu varsayıyoruz.
Kullanıcılar kayıt olurken girdikleri e-mail'i kendi geliştirdiğimiz algoritmaya göre check ediyorduk.
Daha sonra external bir api bulduk ve bu api ile kullanıcı e-mail'lerini check etmeye karar verdik.
Bu external api'yi interface'lerle kendi sistemize entegre etmeye çalışacağız. Adapter design pattern'i kullanarak o service'imiz içerisinde o apiyi kullanıcaz. Ve kendi service'imizde bu adapter sınıfı çağırıcaz. Araya o adapter sınıfı koyarak kendimizi external api'den soyutlamaya çalışacağız. External apiyi doğrudan service'lerimizde kullanmadan sistemimiz ile external api arasına adapter sınıfları koyduk.
