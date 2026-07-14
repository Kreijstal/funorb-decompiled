/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends k {
    static int field_k;
    static int field_m;
    static String field_n;
    static String field_l;

    public static void d(int param0) {
        field_n = null;
        if (param0 >= -18) {
            field_m = -104;
            field_l = null;
            return;
        }
        field_l = null;
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        var4 = ((pe) this).field_j.a(param0, -1);
        var3 = var4;
        if (param1 == 0) {
          if (((pe) this).field_j.field_m) {
            bl.a(var4, 0, hh.field_d, tj.field_f[param0]);
            return var4;
          } else {
            return var4;
          }
        } else {
          field_n = null;
          if (!((pe) this).field_j.field_m) {
            return var4;
          } else {
            bl.a(var4, 0, hh.field_d, tj.field_f[param0]);
            return var4;
          }
        }
    }

    public pe() {
        super(0, true);
    }

    final static gi a(Throwable param0, String param1) {
        gi var2_ref = null;
        gi var2 = null;
        if (!(param0 instanceof gi)) {
            var2 = new gi(param0, param1);
        } else {
            var2_ref = (gi) (Object) param0;
            var2_ref.field_e = var2_ref.field_e + 32 + param1;
        }
        return var2_ref;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_n = "Auto-respond to <%0>";
        field_k = 0;
        field_l = "Invite players";
    }
}
