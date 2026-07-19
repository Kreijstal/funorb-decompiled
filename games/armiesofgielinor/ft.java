/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ft extends tc {
    int field_k;
    static String field_l;
    static String field_o;
    static String field_p;
    int field_n;
    static wp field_q;
    static hd field_m;

    public static void a(int param0) {
        if (param0 != -10) {
          ft.e(-3);
          field_m = null;
          field_q = null;
          field_p = null;
          field_l = null;
          field_o = null;
          return;
        } else {
          field_m = null;
          field_q = null;
          field_p = null;
          field_l = null;
          field_o = null;
          return;
        }
    }

    final static wk[] a(int param0, byte param1, int param2, int param3) {
        wk[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        wk[] var7 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var7 = new wk[9];
        var4 = var7;
        var7[0] = hl.a(false, param2, param3);
        var5 = 1;
        if (param1 > -8) {
          ft.e(-23);
          L0: while (true) {
            if ((var5 ^ -1) > -10) {
              var4[var5] = var4[0];
              var5++;
              if (var6 == 0) {
                continue L0;
              } else {
                return var4;
              }
            } else {
              var4[4] = hl.a(false, param0, 64);
              return var4;
            }
          }
        } else {
          L1: while (true) {
            if ((var5 ^ -1) > -10) {
              var4[var5] = var4[0];
              var5++;
              if (var6 == 0) {
                continue L1;
              } else {
                return var4;
              }
            } else {
              var4[4] = hl.a(false, param0, 64);
              return var4;
            }
          }
        }
    }

    final static void e(int param0) {
        gl.a(120, param0);
    }

    ft(int param0, int param1) {
        this.field_n = param1;
        this.field_k = param0;
    }

    static {
        field_l = "Reward: ";
        field_o = "Extra coats of arms parts.";
    }
}
