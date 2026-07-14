/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static String field_a;
    int field_c;
    String field_f;
    String field_i;
    static int field_d;
    static int field_h;
    ad field_e;
    static md field_g;
    String field_b;

    final static void a(md param0, java.awt.Frame param1, boolean param2) {
        ic var3 = null;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        L0: while (true) {
          var3 = param0.a(param1, -120);
          L1: while (true) {
            if (var3.field_g != 0) {
              if (-2 != (var3.field_g ^ -1)) {
                em.a(100L, false);
                continue L0;
              } else {
                param1.setVisible(param2);
                param1.dispose();
                return;
              }
            } else {
              em.a(10L, param2);
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 10) {
            rk.a(-4);
            field_a = null;
            return;
        }
        field_a = null;
    }

    private rk() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Sound: ";
    }
}
