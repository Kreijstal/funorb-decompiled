/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static ob field_c;
    static int field_d;
    static int field_b;
    static am field_g;
    static fg field_f;
    static String field_a;
    static String field_e;

    final static void a(String param0, int param1, int param2, int param3, String param4, int param5) {
        sl var6 = null;
        int var7 = 0;
        sl var8 = null;
        L0: {
          var8 = js.field_f;
          var6 = var8;
          var8.h(param5, 255);
          var8.field_j = var8.field_j + 1;
          var7 = var8.field_j;
          var8.c(param3, (byte) -80);
          if (param3 == param1) {
            var8.a(param0, (byte) 0);
            break L0;
          } else {
            break L0;
          }
        }
        if (param4 == null) {
          var8.d(param2, 255);
          var8.b(-var7 + var8.field_j, (byte) 122);
          return;
        } else {
          int discarded$2 = ee.a((ob) (Object) var8, (byte) -87, param4);
          var8.b(-var7 + var8.field_j, (byte) 122);
          return;
        }
    }

    final static String a(CharSequence param0, int param1) {
        String var2 = pd.a((byte) 102, oq.a(5722, param0));
        if (!(var2 != null)) {
            var2 = "";
        }
        int var3 = 114 / ((-15 - param1) / 49);
        return var2;
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != -1) {
            return;
        }
        field_a = null;
        field_g = null;
        field_c = null;
        field_e = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean b(int param0) {
        int var1 = 1 % ((-61 - param0) / 56);
        return lg.field_e != null ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = -1;
        field_a = "Victory";
        field_f = new fg();
        field_e = "Maximum total fleet size";
    }
}
