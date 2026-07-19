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
        int[] discarded$2 = null;
        int[] var3 = null;
        int[] var4 = null;
        if (param0 == 1) {
          var4 = this.field_i.a((byte) -108, param1);
          var3 = var4;
          if (this.field_i.field_d) {
            lua.a(var4, 0, ns.field_g, sj.field_b[param1]);
            return var4;
          } else {
            return var4;
          }
        } else {
          discarded$2 = this.c(-83, -24);
          var4 = this.field_i.a((byte) -108, param1);
          var3 = var4;
          if (!this.field_i.field_d) {
            return var4;
          } else {
            lua.a(var4, 0, ns.field_g, sj.field_b[param1]);
            return var4;
          }
        }
    }

    static {
        field_z = "gm.H(";
    }
}
