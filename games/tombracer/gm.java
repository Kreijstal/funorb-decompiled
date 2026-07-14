/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm extends ci {
    static int field_m;
    static int field_n;
    private static String field_z;

    public gm() {
        super(0, true);
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        if (param0 == 1) {
          var4 = ((gm) this).field_i.a((byte) -108, param1);
          var3 = var4;
          if (((gm) this).field_i.field_d) {
            lua.a(var4, 0, ns.field_g, sj.field_b[param1]);
            return var4;
          } else {
            return var4;
          }
        } else {
          int[] discarded$2 = ((gm) this).c(-83, -24);
          var4 = ((gm) this).field_i.a((byte) -108, param1);
          var3 = var4;
          if (!((gm) this).field_i.field_d) {
            return var4;
          } else {
            lua.a(var4, 0, ns.field_g, sj.field_b[param1]);
            return var4;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "gm.H(";
    }
}
