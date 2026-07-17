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
        RuntimeException var8_ref = null;
        sna stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        sna stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var8 = new sna(0L, (sna) null);
              var8.field_eb = qaa.a(param2, -94);
              var8.field_A = qaa.a(param5, -68);
              var8.field_db = qaa.a(param7, -127);
              var8.field_K = qaa.a(param1, -74);
              var8.field_X = qaa.a(param0, -58);
              var8.field_jb = param4;
              var8.field_gb = param6;
              if (param3 <= -118) {
                break L1;
              } else {
                mka.b(true);
                break L1;
              }
            }
            stackOut_2_0 = (sna) var8;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8_ref;
            stackOut_4_1 = new StringBuilder().append("mka.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
        return stackIn_3_0;
    }

    public static void b(boolean param0) {
        field_f = null;
        field_i = null;
        if (param0) {
            mka.b(true);
        }
    }

    mka(mka param0, int param1, int param2, int param3) {
        try {
            ((mka) this).field_l = param3;
            ((mka) this).field_k = param1;
            ((mka) this).field_h = param0;
            ((mka) this).field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "mka.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
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
