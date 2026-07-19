/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends i {
    private int field_J;
    static String[][] field_G;
    static String field_F;
    private int field_H;
    static tf field_K;
    static int field_I;

    ce(sp param0) {
        super(30, param0.field_Sb);
        String var5 = null;
        String var3 = null;
        String var4 = null;
        try {
            this.field_H = param0.field_Fb;
            this.field_J = param0.field_Qb;
            var5 = param0.field_Sb.d(100);
            String var2 = var5;
            var3 = param0.field_Nb;
            var4 = vo.a((byte) -18, gd.field_e[30], new String[]{var5, var3});
            this.a(var4, this.field_t, this.field_D, -91, this.field_u);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ce.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        if (param0 != 30) {
            ce.g(9);
        }
        field_G = (String[][]) null;
        field_K = null;
        field_F = null;
    }

    final void a(int param0, int param1) {
        if (param0 < 60) {
            field_I = 64;
        }
        super.a(95, param1);
        if (param1 == 0) {
            ld.a((byte) -25, this.field_H, this.field_J);
        }
    }

    final static String a(char param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        if (param1 != 48) {
            return (String) null;
        }
        for (var4 = 0; var4 < param2; var4++) {
            var6[var4] = param0;
        }
        return new String(var6);
    }

    static {
        field_G = new String[][]{new String[]{"EMPTY", "Juggernaut", "Brute", "Lugg", "Oaf", "Colossus", "Hulk", "Granite", "Slab", "Thuggish", "Bluto", "Bully", "Brickhouse", "Boulder", "Carthorse", "Muscleman", "Behemoth", "Galactic", "Sherman", "Abrams", "Boomer", "Panzer", "Titan", "Troll", "Barbarian", "Gorilla", "Muttonhead", "Knucklehead", "Lumber", "Clodhopper", "Brobding", "Jumbo", "Ogre", "Titanic", "Kong", "Hercules", "Atlas", "Bumper", "Bertha", "Tugboat", "Meatslab", "Buller", "Bouncer", "Tombstone", "Donkey", "Noneck", "Gristle", "Haystacks", "Undertaker", "Biggie", "Rockslab", "Flintstone", "Bushwhack", "Sumo", "Honda", "Ox", "Shed"}, new String[]{"EMPTY", "Viper", "Snipes", "Quickfire", "Sundance", "Cassidy", "Sharpshooter", "Adder", "Cobra", "Goldengun", "Hitman", "Assassin", "Venom", "Buckshot", "Snapshot", "Bombardier", "Scuttle", "Howitzer", "Missile", "Bullet", "Torpedo", "Pouncer", "Sureshot", "Bourne", "Vanity", "Hubris", "Napalm", "Reaper", "Panache", "Elan", "Finesse", "Zesty", "Esprit", "Gusto", "Altair", "Lion", "Romero", "Mamba", "Nuka", "Buster", "Bond", "Whistler", "Piranha", "Razor"}, new String[]{"EMPTY", "Dos Santos", "Del Peiro", "El Tel", "Kakaka", "Rolando", "Rubery", "Carloz", "Zidamn", "Mezzi", "Henri", "Gerhard", "Cannavero", "Rooni", "Peerlo", "Alfes", "Gristlerooy", "Ayaya", "Tootti", "Viller", "Carvalo", "Nester", "Abelda", "Berbajov", "De Rozzi", "Luchio", "Tevaz", "Inesta", "Sambrosa", "Czechchenko", "Nevdev", "Rodrigues", "Pooyol", "Charesma", "Mitilo", "Zanetto", "Inzaggy", "Robinyou", "Granola", "Beckingham", "Schools", "Sheerer", "Maridona", "Geordio", "Van Basti", "Gascoin", "Linacre", "Badgero", "Kostakutter", "Pelay"}, new String[]{"EMPTY", "Wily", "Rocket", "Fizzbang", "Whizz", "Skimmer", "Hermes", "Flash", "Whippet", "Greyhound", "Scorch", "Blaze", "Zoomer", "Hightail", "Hitops", "Skittish", "Hasty", "Galloper", "Pronto", "Swift", "Cheetah", "Billyo", "Licketysplit", "Lightning", "Brisk", "Dervish", "Scrapper", "Racer", "Lambstail", "Doublequick", "Pulsar", "Rabbit", "Skedaddle", "Belter", "Clappers", "Whoosh", "Vespa", "Scooter", "Springheel", "Rogue", "Scoundrel", "Grifter", "Whizzer", "Streaker", "Whipper", "Chambers", "Springbok", "Grasshopper", "Shooter", "Hummingbird", "Kingfisher"}};
        field_F = "Honour";
        field_K = new tf();
    }
}
