/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class peb extends le {
    private static String field_z;

    final int[] a(int param0, boolean param1) {
        int[] var4 = null;
        int[] var3 = null;
        int[] var4Lifetime1;
        int[] var3Lifetime1;
        if (!param1) {
          this.a(79, false);
          var4 = this.field_f.a((byte) 127, param0);
          var3 = var4;
          if (this.field_f.field_e) {
            cua.a(var4, 0, hob.field_d, sj.field_p[param0]);
            return var4;
          }
          return var4;
        }
        var4Lifetime1 = this.field_f.a((byte) 127, param0);
        var3Lifetime1 = var4Lifetime1;
        if (!this.field_f.field_e) {
          return var4Lifetime1;
        }
        cua.a(var4Lifetime1, 0, hob.field_d, sj.field_p[param0]);
        return var4Lifetime1;
    }

    public peb() {
        super(0, true);
    }

    static {
        field_z = "peb.A(";
    }
}
