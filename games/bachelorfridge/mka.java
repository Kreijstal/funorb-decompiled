/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mka extends bw {
    static String[] field_i;
    static boolean field_j;
    static eaa field_f;
    mka field_h;
    int field_g;
    int field_k;
    int field_l;

    final static sna a(int param0, int param1, int param2, byte param3, po param4, int param5, int param6, int param7) {
        sna var8 = null;
        var8 = new sna(0L, (sna) null);
        var8.field_eb = qaa.a(param2, -94);
        var8.field_A = qaa.a(param5, -68);
        var8.field_db = qaa.a(param7, -127);
        var8.field_K = qaa.a(param1, -74);
        var8.field_X = qaa.a(param0, -58);
        var8.field_jb = param4;
        var8.field_gb = param6;
        if (param3 > -118) {
          mka.b(true);
          return var8;
        } else {
          return var8;
        }
    }

    public static void b(boolean param0) {
        field_f = null;
        field_i = null;
        if (param0) {
            mka.b(true);
        }
    }

    mka(mka param0, int param1, int param2, int param3) {
        ((mka) this).field_l = param3;
        ((mka) this).field_k = param1;
        ((mka) this).field_h = param0;
        ((mka) this).field_g = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[]{"Sausage", "Bacon", "Chinese Takeaway", "Indian Takeaway", "Eggs", "Brussel Sprouts", "Milk", "Cheddar", "Strawberry Moose", "Southern Fried Chicken", "Mystery Meat", "Butter", "Baked Beans", "Pet Food", "Pizza", "Sushi", "Cake", "Tuna", "Espresso", "Cola", "Open Beer", "Trainer", "Banana", "Tofu", "Jam", "Cereal", "Gingerbread Man", "Pickled Onions", "Burger", "Fruit Juice", "Kebab", "Glow Sticks", "Caviar", "Passion fruit", "Roast Beef", "Yorkshire Pudding", "Turkey", "Pork Pie", "Tea", "Scone", "Carrot", "Haggis", "Hot Cross Buns", "Kippers", "Shellfish", "Energy Drink", "Cucumber", "Mince Pie", "Stilton cheese", "Doughnut"};
        field_j = true;
        field_f = new eaa();
    }
}
