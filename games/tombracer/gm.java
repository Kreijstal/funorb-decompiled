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
        int[] var4 = null;
        int[] var3 = null;
        int[] var4Lifetime1;
        int[] var3Lifetime1;
        if (param0 != 1) {
          this.c(-83, -24);
          var4 = this.field_i.a((byte) -108, param1);
          var3 = var4;
          if (this.field_i.field_d) {
            lua.a(var4, 0, ns.field_g, sj.field_b[param1]);
            return var4;
          }
          return var4;
        }
        var4Lifetime1 = this.field_i.a((byte) -108, param1);
        var3Lifetime1 = var4Lifetime1;
        if (!this.field_i.field_d) {
          return var4Lifetime1;
        }
        lua.a(var4Lifetime1, 0, ns.field_g, sj.field_b[param1]);
        return var4Lifetime1;
    }

    static {
        field_z = "gm.H(";
    }
}
