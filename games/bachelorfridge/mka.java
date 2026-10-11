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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
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
          }
          stackIn_3_0 = var8;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_6_0 = var8_ref;
          stackIn_6_1 = new StringBuilder().append("mka.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
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
        try {
          this.field_l = param3;
          this.field_k = param1;
          this.field_h = param0;
          this.field_g = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "mka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_i = new String[]{"Sausage", "Bacon", "Chinese Takeaway", "Indian Takeaway", "Eggs", "Brussel Sprouts", "Milk", "Cheddar", "Strawberry Moose", "Southern Fried Chicken", "Mystery Meat", "Butter", "Baked Beans", "Pet Food", "Pizza", "Sushi", "Cake", "Tuna", "Espresso", "Cola", "Open Beer", "Trainer", "Banana", "Tofu", "Jam", "Cereal", "Gingerbread Man", "Pickled Onions", "Burger", "Fruit Juice", "Kebab", "Glow Sticks", "Caviar", "Passion fruit", "Roast Beef", "Yorkshire Pudding", "Turkey", "Pork Pie", "Tea", "Scone", "Carrot", "Haggis", "Hot Cross Buns", "Kippers", "Shellfish", "Energy Drink", "Cucumber", "Mince Pie", "Stilton cheese", "Doughnut"};
        field_j = true;
        field_f = new eaa();
    }
}
