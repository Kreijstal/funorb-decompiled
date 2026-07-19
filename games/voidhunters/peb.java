/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class peb extends le {
    private static String field_z;

    final int[] a(int param0, boolean param1) {
        int[] discarded$2 = null;
        int[] var3 = null;
        int[] var4 = null;
        if (param1) {
          var4 = this.field_f.a((byte) 127, param0);
          var3 = var4;
          if (this.field_f.field_e) {
            cua.a(var4, 0, hob.field_d, sj.field_p[param0]);
            return var4;
          } else {
            return var4;
          }
        } else {
          discarded$2 = this.a(79, false);
          var4 = this.field_f.a((byte) 127, param0);
          var3 = var4;
          if (!this.field_f.field_e) {
            return var4;
          } else {
            cua.a(var4, 0, hob.field_d, sj.field_p[param0]);
            return var4;
          }
        }
    }

    public peb() {
        super(0, true);
    }

    static {
        field_z = "peb.A(";
    }
}
