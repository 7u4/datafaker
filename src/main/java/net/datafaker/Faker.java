package net.datafaker;

import net.datafaker.service.FakeValuesService;
import net.datafaker.service.RandomService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/**
 * Provides utility methods for generating fake strings, such as names, phone
 * numbers, addresses. generate random strings with given patterns
 *
 * @author ren
 */
public class Faker {
    private final RandomService randomService;
    private final FakeValuesService fakeValuesService;
    private final List<FakeValuesService> fakeValuesServiceList = new ArrayList<>();

    private final Address address;
    private final Ancient ancient;
    private final Animal animal;
    private final App app;
    private final Appliance appliance;
    private final AquaTeenHungerForce aquaTeenHungerForce;
    private final Artist artist;
    private final Avatar avatar;
    private final Aviation aviation;
    private final Babylon5 babylon5;
    private final BackToTheFuture backToTheFuture;
    private final Barcode barcode;
    private final Basketball basketball;
    private final Beer beer;
    private final BojackHorseman bojackHorseman;
    private final BossaNova bossaNova;
    private final BreakingBad breakingBad;
    private final Book book;
    private final Bool bool;
    private final Buffy buffy;
    private final Business business;
    private final CNPJ cnpj;
    private final CPF cpf;
    private final Cat cat;
    private final ChuckNorris chuckNorris;
    private final Code code;
    private final Coin coin;
    private final Color color;
    private final Commerce commerce;
    private final Company company;
    private final Country country;
    private final Crypto crypto;
    private final Currency currency;
    private final DateAndTime dateAndTime;
    private final Demographic demographic;
    private final Dessert dessert;
    private final Disease disease;
    private final Dog dog;
    private final Domain domain;
    private final DragonBall dragonBall;
    private final Dune dune;
    private final Educator educator;
    private final ElderScrolls elderScrolls;
    private final EnglandFootBall englandfootball;
    private final Esports esports;
    private final FakeDuration duration;
    private final File file;
    private final Finance finance;
    private final Food food;
    private final Formula1 formula1;
    private final Friends friends;
    private final FunnyName funnyName;
    private final GameOfThrones gameOfThrones;
    private final Gender gender;
    private final Hacker hacker;
    private final HarryPotter harryPotter;
    private final Hearthstone hearthstone;
    private final Hipster hipster;
    private final HitchhikersGuideToTheGalaxy hitchhikersGuideToTheGalaxy;
    private final Hobbit hobbit;
    private final HowIMetYourMother howIMetYourMother;
    private final IdNumber idNumber;
    private final Internet internet;
    private final Job job;
    private final Kaamelott kaamelott;
    private final LeagueOfLegends leagueOfLegends;
    private final Lebowski lebowski;
    private final LordOfTheRings lordOfTheRings;
    private final Lorem lorem;
    private final Matz matz;
    private final Medical medical;
    private final Minecraft minecraft;
    private final Mood mood;
    private final Mountain mountain;
    private final Music music;
    private final Name name;
    private final Nation nation;
    private final Number number;
    private final Options options;
    private final Overwatch overwatch;
    private final Passport passport;
    private final PhoneNumber phoneNumber;
    private final Photography photography;
    private final Pokemon pokemon;
    private final PrincessBride princessBride;
    private final ProgrammingLanguage programmingLanguage;
    private final Relationship relationship;
    private final ResidentEvil residentEvil;
    private final RickAndMorty rickAndMorty;
    private final Robin robin;
    private final RockBand rockBand;
    private final RuPaulDragRace ruPaulDragRace;
    private final Science science;
    private final Shakespeare shakespeare;
    private final Sip sip;
    private final Size size;
    private final SlackEmoji slackEmoji;
    private final Space space;
    private final StarCraft starCraft;
    private final StarTrek starTrek;
    private final Stock stock;
    private final Superhero superhero;
    private final Team team;
    private final Touhou touhou;
    private final TwinPeaks twinPeaks;
    private final Twitter twitter;
    private final University university;
    private final Vehicle vehicle;
    private final Weather weather;
    private final Witcher witcher;
    private final Yoda yoda;
    private final Zelda zelda;

    public Faker() {
        this(Locale.ENGLISH);
    }

    public Faker(Locale locale) {
        this(locale, (Random) null);
    }

    public Faker(Random random) {
        this(Locale.ENGLISH, random);
    }

    public Faker(Locale locale, Random random) {
        this(locale, new RandomService(random));
    }

    public Faker(Locale locale, RandomService randomService) {
        this(new FakeValuesService(locale, randomService), randomService);
    }

    public Faker(FakeValuesService fakeValuesService, RandomService random) {
        this.randomService = random;
        this.fakeValuesService = fakeValuesService;

        this.fakeValuesServiceList.add(new FakeValuesService(new Locale("nl"), randomService));
        this.fakeValuesServiceList.add(new FakeValuesService(new Locale("ar"), randomService));

        this.address = new Address(this);
        this.ancient = new Ancient(this);
        this.animal = new Animal(this);
        this.app = new App(this);
        this.appliance = new Appliance(this);
        this.aquaTeenHungerForce = new AquaTeenHungerForce(this);
        this.artist = new Artist(this);
        this.avatar = new Avatar(this);
        this.aviation = new Aviation(this);
        this.babylon5 = new Babylon5(this);
        this.backToTheFuture = new BackToTheFuture(this);
        this.barcode = new Barcode(this);
        this.basketball = new Basketball(this);
        this.beer = new Beer(this);
        this.bojackHorseman = new BojackHorseman(this);
        this.book = new Book(this);
        this.bool = new Bool(this);
        this.bossaNova = new BossaNova(this);
        this.breakingBad = new BreakingBad(this);
        this.buffy = new Buffy(this);
        this.business = new Business(this);
        this.cat = new Cat(this);
        this.chuckNorris = new ChuckNorris(this);
        this.code = new Code(this);
        this.coin = new Coin(this);
        this.color = new Color(this);
        this.commerce = new Commerce(this);
        this.company = new Company(this);
        this.country = new Country(this);
        this.cnpj = new CNPJ(this);
        this.cpf = new CPF(this);
        this.crypto = new Crypto(this);
        this.currency = new Currency(this);
        this.dateAndTime = new DateAndTime(this);
        this.demographic = new Demographic(this);
        this.dessert = new Dessert(this);
        this.disease = new Disease(this);
        this.dog = new Dog(this);
        this.domain = new Domain(this);
        this.dragonBall = new DragonBall(this);
        this.dune = new Dune(this);
        this.duration = new FakeDuration(this);
        this.educator = new Educator(this);
        this.elderScrolls = new ElderScrolls(this);
        this.englandfootball = new EnglandFootBall(this);
        this.esports = new Esports(this);
        this.file = new File(this);
        this.finance = new Finance(this);
        this.food = new Food(this);
        this.formula1 = new Formula1(this);
        this.friends = new Friends(this);
        this.funnyName = new FunnyName(this);
        this.gameOfThrones = new GameOfThrones(this);
        this.gender = new Gender(this);
        this.hacker = new Hacker(this);
        this.harryPotter = new HarryPotter(this);
        this.hearthstone = new Hearthstone(this);
        this.hipster = new Hipster(this);
        this.hitchhikersGuideToTheGalaxy = new HitchhikersGuideToTheGalaxy(this);
        this.hobbit = new Hobbit(this);
        this.howIMetYourMother = new HowIMetYourMother(this);
        this.idNumber = new IdNumber(this);
        this.internet = new Internet(this);
        this.job = new Job(this);
        this.kaamelott = new Kaamelott(this);
        this.leagueOfLegends = new LeagueOfLegends(this);
        this.lebowski = new Lebowski(this);
        this.lordOfTheRings = new LordOfTheRings(this);
        this.lorem = new Lorem(this);
        this.matz = new Matz(this);
        this.medical = new Medical(this);
        this.minecraft = new Minecraft(this);
        this.mood = new Mood(this);
        this.mountain = new Mountain(this);
        this.music = new Music(this);
        this.name = new Name(this);
        this.nation = new Nation(this);
        this.number = new Number(this);
        this.options = new Options(this);
        this.overwatch = new Overwatch(this);
        this.passport = new Passport(this);
        this.phoneNumber = new PhoneNumber(this);
        this.photography = new Photography(this);
        this.pokemon = new Pokemon(this);
        this.princessBride = new PrincessBride(this);
        this.programmingLanguage = new ProgrammingLanguage(this);
        this.relationship = new Relationship(this);
        this.residentEvil = new ResidentEvil(this);
        this.rickAndMorty = new RickAndMorty(this);
        this.robin = new Robin(this);
        this.rockBand = new RockBand(this);
        this.ruPaulDragRace = new RuPaulDragRace(this);
        this.science = new Science(this);
        this.shakespeare = new Shakespeare(this);
        this.sip = new Sip(this);
        this.size = new Size(this);
        this.slackEmoji = new SlackEmoji(this);
        this.space = new Space(this);
        this.starCraft = new StarCraft(this);
        this.starTrek = new StarTrek(this);
        this.stock = new Stock(this);
        this.superhero = new Superhero(this);
        this.team = new Team(this);
        this.touhou = new Touhou(this);
        this.twinPeaks = new TwinPeaks(this);
        this.twitter = new Twitter(this);
        this.university = new University(this);
        this.vehicle = new Vehicle(this);
        this.weather = new Weather(this);
        this.witcher = new Witcher(this);
        this.yoda = new Yoda(this);
        this.zelda = new Zelda(this);
    }

    /**
     * Constructs Faker instance with default argument.
     *
     * @return {@link Faker#Faker()}
     */
    public static Faker instance() {
        return new Faker();
    }

    /**
     * Constructs Faker instance with provided {@link Locale}.
     *
     * @param locale - {@link Locale}
     * @return {@link Faker#Faker(Locale)}
     */
    public static Faker instance(Locale locale) {
        return new Faker(locale);
    }

    /**
     * Constructs Faker instance with provided {@link Random}.
     *
     * @param random - {@link Random}
     * @return {@link Faker#Faker(Random)}
     */
    public static Faker instance(Random random) {
        return new Faker(random);
    }

    /**
     * Constructs Faker instance with provided {@link Locale} and {@link Random}.
     *
     * @param locale - {@link Locale}
     * @param random - {@link Random}
     * @return {@link Faker#Faker(Locale, Random)}
     */
    public static Faker instance(Locale locale, Random random) {
        return new Faker(locale, random);
    }

    Locale getLocale() {
        return fakeValuesService().getLocalesChain().get(0);
    }

    /**
     * Returns a string with the '#' characters in the parameter replaced with random digits between 0-9 inclusive.
     * <p>
     * For example, the string "ABC##EFG" could be replaced with a string like "ABC99EFG".
     *
     * @param numberString Template for string generation
     * @return Generated string
     */
    public String numerify(String numberString) {
        return fakeValuesService().numerify(numberString);
    }

    /**
     * Returns a string with the '?' characters in the parameter replaced with random alphabetic
     * characters.
     * <p>
     * For example, the string "12??34" could be replaced with a string like "12AB34".
     *
     * @param letterString Template for string generation
     * @return Generated string.
     */
    public String letterify(String letterString) {
        return fakeValuesService().letterify(letterString);
    }

    /**
     * Returns a string with the '?' characters in the parameter replaced with random alphabetic
     * characters.
     * <p>
     * For example, the string "12??34" could be replaced with a string like "12AB34".
     */
    public String letterify(String letterString, boolean isUpper) {
        return fakeValuesService().letterify(letterString, isUpper);
    }

    /**
     * Applies both a {@link #numerify(String)} and a {@link #letterify(String)}
     * over the incoming string.
     */
    public String bothify(String string) {
        return fakeValuesService().bothify(string);
    }

    /**
     * Applies both a {@link #numerify(String)} and a {@link #letterify(String)}
     * over the incoming string.
     */
    public String bothify(String string, boolean isUpper) {
        return fakeValuesService().bothify(string, isUpper);
    }

    /**
     * Generates a String that matches the given regular expression.
     */
    public String regexify(String regex) {
        return fakeValuesService().regexify(regex);
    }

    /**
     * Generates a String by example. The output string will have the same pattern as the input string.
     *
     * For example:
     *   "AAA" becomes "KRA"
     *   "abc" becomes "uio"
     *   "948" becomes "345"
     *   "A19c" becomes "Z20d"
     *
     * @param example The input string
     * @return The output string based on the input pattern
     */
    public String examplify(String example) {return fakeValuesService().examplify(example);}

    /**
     * Returns a string with the char2replace characters in the parameter replaced with random option from available options.
     * <p>
     * For example, the string "ABC??EFG" could be replaced with a string like "ABCtestтестEFG"
     * if passed options are new String[]{"test", "тест"}.
     *
     * @param string        Template for string generation
     * @param char2replace  Char to replace
     * @param options       Options to use while filling the template
     * @return Generated string
     */
    public String templatify(String string, char char2replace, String... options) {
        return fakeValuesService().templatify(string, char2replace, options);
    }

    /**
     * Returns a string with the characters in the keys of optionsMap parameter replaced with random option from values.
     *
     * <p>
     * For example, the string "ABC$$EFG" could be replaced with a string like "ABCtestтестEFG"
     * if passed for key '$' there is value new String[]{"test", "тест"} in optionsMap
     *
     * @param string       Template for string generation
     * @param optionsMap   Map with replacement rules
     * @return Generated string
     */
    public String templatify(String string, Map<Character, String[]> optionsMap) {
        return fakeValuesService().templatify(string, optionsMap);
    }

    public RandomService random() {
        return this.randomService;
    }

    public Currency currency() {
        return currency;
    }

    FakeValuesService fakeValuesService() {

        return fakeValuesServiceList.get(randomService.nextInt(fakeValuesServiceList.size()));
//        return this.fakeValuesService;
    }

    public Ancient ancient() {
        return ancient;
    }

    public App app() {
        return app;
    }

    public Appliance appliance() {
        return appliance;
    }

    public Artist artist() {
        return artist;
    }

    public Avatar avatar() {
        return avatar;
    }

    public Aviation aviation() {
        return aviation;
    }

    public Music music() {
        return music;
    }

    public Name name() {
        return new Name(this);
    }

    public Number number() {
        return number;
    }

    public Internet internet() {
        return internet;
    }

    public PhoneNumber phoneNumber() {
        return phoneNumber;
    }

    public Pokemon pokemon() {
        return pokemon;
    }

    public Lorem lorem() {
        return lorem;
    }

    public Address address() {
        return address;
    }

    public Book book() {
        return book;
    }

    public Buffy buffy() {
        return buffy;
    }

    public BossaNova bossaNova() {
        return bossaNova;
    }

    public BreakingBad breakingBad() {
        return breakingBad;
    }

    public Business business() {
        return business;
    }

    public ChuckNorris chuckNorris() {
        return chuckNorris;
    }

    public Color color() {
        return color;
    }

    public Commerce commerce() {
        return commerce;
    }

    public Company company() {
        return company;
    }

    public Crypto crypto() {
        return crypto;
    }

    public Hacker hacker() {
        return hacker;
    }

    public IdNumber idNumber() {
        return idNumber;
    }

    public Options options() {
        return options;
    }

    public Code code() {
        return code;
    }

    public Coin coin() {
        return coin;
    }

    public File file() {
        return file;
    }

    public Finance finance() {
        return finance;
    }

    public Food food() {
        return food;
    }

    public Formula1 formula1() {
        return formula1;
    }

    public ElderScrolls elderScrolls() {
        return elderScrolls;
    }

    public GameOfThrones gameOfThrones() {
        return gameOfThrones;
    }

    public Gender gender() {
        return gender;
    }

    public DateAndTime date() {
        return dateAndTime;
    }

    public Demographic demographic() {
        return demographic;
    }

    public Dog dog() {
        return dog;
    }

    public Educator educator() {
        return educator;
    }

    public SlackEmoji slackEmoji() {
        return slackEmoji;
    }

    public Shakespeare shakespeare() {
        return shakespeare;
    }

    public Space space() {
        return space;
    }

    public Size size() {
        return size;
    }

    public Superhero superhero() {
        return superhero;
    }

    public Bool bool() {
        return bool;
    }

    public Team team() {
        return team;
    }

    public Beer beer() {
        return beer;
    }

    public University university() {
        return university;
    }

    public Cat cat() {
        return cat;
    }

    public Stock stock() {
        return stock;
    }

    public LordOfTheRings lordOfTheRings() {
        return lordOfTheRings;
    }

    public Zelda zelda() {
        return zelda;
    }

    public HarryPotter harryPotter() {
        return harryPotter;
    }

    public RockBand rockBand() {
        return rockBand;
    }

    public RuPaulDragRace ruPaulDragRace() {
        return ruPaulDragRace;
    }

    public Esports esports() {
        return esports;
    }

    public Friends friends() {
        return friends;
    }

    public Hipster hipster() {
        return hipster;
    }

    public Job job() {
        return job;
    }

    public TwinPeaks twinPeaks() {
        return twinPeaks;
    }

    public RickAndMorty rickAndMorty() {
        return rickAndMorty;
    }

    public Yoda yoda() {
        return yoda;
    }

    public Matz matz() {
        return matz;
    }

    public Mood mood() {
        return mood;
    }

    public Mountain mountain() { return mountain; }

    public Witcher witcher() {
        return witcher;
    }

    public CPF cpf() {
        return cpf;
    }

    public CNPJ cnpj() {
        return cnpj;
    }

    public DragonBall dragonBall() {
        return dragonBall;
    }

    public FunnyName funnyName() {
        return funnyName;
    }

    public HitchhikersGuideToTheGalaxy hitchhikersGuideToTheGalaxy() {
        return hitchhikersGuideToTheGalaxy;
    }

    public Hobbit hobbit() {
        return hobbit;
    }

    public HowIMetYourMother howIMetYourMother() {
        return howIMetYourMother;
    }

    public LeagueOfLegends leagueOfLegends() {
        return leagueOfLegends;
    }

    public Overwatch overwatch() {
        return overwatch;
    }

    public Robin robin() {
        return robin;
    }

    public StarTrek starTrek() {
        return starTrek;
    }

    public Weather weather() {
        return weather;
    }

    public Lebowski lebowski() {
        return lebowski;
    }

    public Medical medical() {
        return medical;
    }

    public Country country() {
        return country;
    }

    public Animal animal() {
        return animal;
    }

    public BackToTheFuture backToTheFuture() {
        return backToTheFuture;
    }

    public PrincessBride princessBride() {
        return princessBride;
    }

    public Relationship relationships() {
        return relationship;
    }

    public Nation nation() {
        return nation;
    }

    public Dune dune() {
        return dune;
    }

    public AquaTeenHungerForce aquaTeenHungerForce() {
        return aquaTeenHungerForce;
    }

    public FakeDuration duration() {
        return duration;
    }

    public ProgrammingLanguage programmingLanguage() {
        return programmingLanguage;
    }

    public Kaamelott kaamelott() {
        return kaamelott;
    }

    public Photography photography() {
        return photography;
    }

    public StarCraft starCraft() {
        return starCraft;
    }

    public Touhou touhou() {
        return touhou;
    }

    public Minecraft minecraft() {
        return minecraft;
    }

    public BojackHorseman bojackHorseman() {
        return bojackHorseman;
    }

    public Disease disease() {
        return disease;
    }

    public Basketball basketball() {
        return basketball;
    }

    public Barcode barcode() {
        return barcode;
    }

    public Sip sip() {
        return sip;
    }

    public EnglandFootBall englandfootball() {
        return englandfootball;
    }

    public Babylon5 babylon5() {
        return babylon5;
    }

    public Science science() {
        return science;
    }

    public Vehicle vehicle() {
        return vehicle;
    }

    public Dessert dessert() {
        return dessert;
    }

    public Domain domain() {
        return domain;
    }

    public ResidentEvil residentEvil() {
        return residentEvil;
    }

    public Hearthstone hearthstone() {
        return hearthstone;
    }

    /**
     * Return passport attribute
     *
     * @return passport object.
     */
    public Passport passport() {
        return passport;
    }

    public Twitter twitter() {
        return twitter;
    }

    public String resolve(String key) {
        return this.fakeValuesService().resolve(key, this, this);
    }

    /**
     * Allows the evaluation of native YML expressions to allow you to build your
     * own.
     * <p>
     * The following are valid expressions:
     * <ul>
     * <li>#{regexify '(a|b){2,3}'}</li>
     * <li>#{regexify '\\.\\*\\?\\+'}</li>
     * <li>#{bothify '????','false'}</li>
     * <li>#{Name.first_name} #{Name.first_name} #{Name.last_name}</li>
     * <li>#{number.number_between '1','10'}</li>
     * </ul>
     *
     * @param expression (see examples above)
     * @return the evaluated string expression
     * @throws RuntimeException if unable to evaluate the expression
     */
    public String expression(String expression) {
        return this.fakeValuesService().expression(expression, this);
    }

    public NatoPhoneticAlphabet natoPhoneticAlphabet() {
        return new NatoPhoneticAlphabet(this);
    }

    public Marketing marketing() {
        return new Marketing(this);
    }

    public Restaurant restaurant() {
        return new Restaurant(this);
    }

    public Military military() {
        return new Military(this);
    }

    public TheItCrowd theItCrowd() {
        return new TheItCrowd(this);
    }
}
