/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static o[] field_d;
    static ae field_f;
    static o[][][] field_e;
    static te field_c;
    static float field_b;
    static o[] field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_e = null;
        field_f = null;
        if (param0 != 0) {
            field_d = null;
        }
        field_c = null;
    }

    final static int a(char param0, CharSequence param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = wizardrun.field_H;
        var3 = 0;
        var4 = param1.length();
        if (param2 == 75) {
          var5 = 0;
          L0: while (true) {
            if (var5 >= var4) {
              return var3;
            } else {
              if (param1.charAt(var5) == param0) {
                var3++;
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return -33;
        }
    }

    final static void a(String param0, float param1, int param2) {
        dg.field_a = param0;
        if (param2 != 0) {
            field_a = null;
        }
        field_b = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new o[3];
        field_f = new ae();
    }
}
