/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class r extends wt {
    static String field_o;
    static int field_n;

    public static void f(int param0) {
        field_o = null;
        if (param0 != 27354) {
            r.e(-50);
        }
    }

    protected r() {
    }

    final static void e(int param0) {
        int var1 = 0;
        if (param0 == -14598) {
          if (32 < gn.field_a) {
            L0: {
              var1 = gn.field_a % 32;
              if (-1 == (var1 ^ -1)) {
                var1 = 32;
                break L0;
              } else {
                break L0;
              }
            }
            rt.b(-var1 + gn.field_a, (byte) -127);
            return;
          } else {
            rt.b(0, (byte) 28);
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_o = "Suggested names: ";
    }
}
