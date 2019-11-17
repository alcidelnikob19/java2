package bot;

public class masaj_bot extends ProgwardsTelegramBot{


        //@Override
        public String processMessage(String text){
            checkTags(text);
            return "Под твой запрос подходит: \n" + extract();
        }

        public static void main(String[] args){
            System.out.println("Hello bot!");
            ApiContextInitializer.init();

            masaj_bot bot = new masaj_bot();
            bot.username = "masaj22bot";
            bot.token = "922149229:AAFP8Fhmjii6fNOqCVuNdXA5ny6urOPSCFk";
            bot.addTags("Массаж Тайский", "Релакс, Разминание");
            bot.addTags("Массаж Казачий", "Болевое воздействие , Растягивание");
            bot.addTags("Массаж Японский", "Шиацу, скручивание, вытягиваине");
            bot.start();
        }




}
