/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class woa implements wib {
    int field_c;
    int field_a;
    static int field_b;
    float[] field_d;
    static String field_e;

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, String param6) {
        if (param3 == 74) {
          if (!li.field_i) {
            ita.a(param5, 7988).b(param6, param2, param1, param0, param4);
            return;
          } else {
            nma.field_b[param5].a(param4, param1, -16777216 | param0, true, param2, param6);
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -16777216) {
            return;
        }
        field_e = null;
    }

    woa(int param0, int param1) {
        ((woa) this).field_c = param1;
        ((woa) this).field_a = param0;
        ((woa) this).field_d = new float[param0 * param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Point defence laser";
    }
}
