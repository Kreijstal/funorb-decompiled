/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mg {
    static dl[] field_b;
    static String field_h;
    static ko field_d;
    static int field_e;
    static db field_c;
    static int field_a;
    static db field_g;
    static String field_f;

    abstract void a(ng param0, byte param1);

    abstract wh a(int param0);

    public static void b(int param0) {
        if (param0 < -86) {
          field_d = null;
          field_g = null;
          field_b = null;
          field_h = null;
          field_c = null;
          field_f = null;
          return;
        }
        field_a = -24;
        field_d = null;
        field_g = null;
        field_b = null;
        field_h = null;
        field_c = null;
        field_f = null;
    }

    final static void a(int param0, db param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = CrazyCrystals.field_B;
        try {
          if (le.field_g == null) {
            le.field_g = new dl[4][];
            cd.field_v = new int[10];
            cd.field_v[2] = 8;
            cd.field_v[7] = 12;
            cd.field_v[6] = 8;
            cd.field_v[1] = 4;
            cd.field_v[5] = 4;
            cd.field_v[9] = 12;
          }
          if (param0 >= -99) {
            mg.b(-23);
          }
          for (var2_int = 0; var2_int < 4; var2_int++) {
            if (null == le.field_g[var2_int]) {
              le.field_g[var2_int] = bf.a(-1, oe.field_d[var2_int], "", param1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("mg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_h = "Hole";
        field_e = 100;
        field_f = "Please check if address is correct";
    }
}
