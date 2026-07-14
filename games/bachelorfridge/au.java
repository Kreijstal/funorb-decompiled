/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class au {
    static boolean field_b;
    static int field_c;
    static String field_a;

    final static ne a(int param0, int param1, int param2, int param3) {
        ne var4 = null;
        ne var4_ref = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var4 = (ne) (Object) rg.field_f.b((byte) 90);
        L0: while (true) {
          if (var4 == null) {
            var4_ref = new ne();
            var4_ref.field_o = param2;
            var4_ref.field_i = param3;
            rg.field_f.a((bw) (Object) var4_ref, true);
            kja.a(param0, (byte) 21, var4_ref);
            if (param1 != 16757) {
              field_b = true;
              return var4_ref;
            } else {
              return var4_ref;
            }
          } else {
            if (param2 == var4.field_o) {
              return var4;
            } else {
              var4 = (ne) (Object) rg.field_f.c(0);
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -31824) {
            field_c = -118;
        }
    }

    final static void a(int param0, String param1, boolean param2) {
        ha.field_k = bt.field_s;
        taa.field_l = param0;
        if (param2) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Welcome. Click the tooltips to continue.";
    }
}
