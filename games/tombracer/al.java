/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends vg {
    static boolean field_j;
    static double field_h;
    int field_i;
    static vna field_g;
    static su field_f;

    public static void a(byte param0) {
        Object var2 = null;
        field_f = null;
        if (param0 <= 56) {
          var2 = null;
          int discarded$2 = al.a((pc) null, 17, -109, (pc) null);
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    al(int param0) {
        ((al) this).field_i = param0;
    }

    final static int a(pc param0, int param1, int param2, pc param3) {
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = qb.a(param0.field_e, param0.field_a, param3.field_a, param0.field_k, (byte) -81, param3.field_e, param0.field_d, param3.field_d, param1, param3.field_k);
          if (-1 <= var4) {
            break L0;
          } else {
            System.out.println("Uh oh, collide.lineseg_lineseg returned " + var4);
            var4 = 0;
            System.out.println("collide.lineseg_lineseg(" + param0.field_d + ", " + param0.field_k + ", " + param0.field_e + ", " + param0.field_a + ", " + param3.field_d + ", " + param3.field_k + ", " + param3.field_e + ", " + param3.field_a + ", " + param1 + ")");
            break L0;
          }
        }
        if (param2 != 12) {
          var5 = null;
          int discarded$1 = al.a((pc) null, 111, 55, (pc) null);
          return var4;
        } else {
          return var4;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0.0;
        field_g = new vna();
        field_f = new su(12, 0, 1, 0);
    }
}
