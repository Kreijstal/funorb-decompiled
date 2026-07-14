/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends sm {
    private float field_k;
    private int field_l;
    static String field_i;
    static String field_m;
    private float field_j;
    static String field_h;

    final static kk b(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 != -20849) {
            field_m = null;
        }
        js var8 = new js(pd.field_d, true, false, true, true);
        js var2 = var8;
        int var3 = pe.b(param1 + 20938, param0);
        int var4 = 127;
        for (var5 = 0; var5 < var2.field_i.length; var5++) {
            var6 = (var4 & var8.field_i[var5]) + -16;
            if ((var6 ^ -1) > -1) {
                var6 = 0;
            }
            var2.field_i[var5] = (short)oe.c(var6, rn.a(var4 ^ -1, var3));
        }
        return var2.a(be.field_x, fm.field_a, ol.field_A, lf.field_t, ni.field_a);
    }

    final static boolean a(int param0, int param1) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!(bk.field_e != null)) {
            return false;
        }
        if (param0 == bk.field_e.b(false)) {
            return false;
        }
        fd var2 = (fd) (Object) bk.field_e.e((byte) 111);
        while (var2 != null) {
            var3 = var2.field_k;
            if (!(var3 != param1)) {
                return true;
            }
            var2 = (fd) (Object) bk.field_e.a((byte) 123);
        }
        return false;
    }

    final void b(byte param0) {
        int var2 = -4 / ((param0 - -67) / 49);
        this.b((byte) 111);
        ((ge) this).field_j = 0.0f;
        ((ge) this).field_k = 3.4028234663852886e+38f;
        ((ge) this).field_l = 0;
    }

    ge(ej param0) {
        super(param0);
        ((ge) this).field_k = 3.4028234663852886e+38f;
        ((ge) this).field_j = 0.0f;
    }

    final jb a(byte param0) {
        Object var2_ref = null;
        jb var2_ref_jb = null;
        float var2 = 0.0f;
        jb var3 = null;
        int var4 = 0;
        var2_ref = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!((ge) this).field_a.a(false)) {
          L0: {
            ((ge) this).field_j = 0.0f;
            if (((ge) this).field_k >= 1.0f) {
              break L0;
            } else {
              var2_ref_jb = (jb) (Object) ((ge) this).field_a.e((byte) 102);
              L1: while (true) {
                if (var2_ref_jb == null) {
                  ((ge) this).field_k = 1.0f;
                  break L0;
                } else {
                  var2_ref_jb.field_t = var2_ref_jb.field_t + (1.0f - ((ge) this).field_k);
                  var2_ref_jb = (jb) (Object) ((ge) this).field_a.a((byte) 123);
                  continue L1;
                }
              }
            }
          }
          L2: {
            if (param0 <= -28) {
              break L2;
            } else {
              ((ge) this).field_j = 0.7643955945968628f;
              break L2;
            }
          }
          var2_ref_jb = (jb) (Object) ((ge) this).field_a.e((byte) 94);
          L3: while (true) {
            if (var2_ref_jb == null) {
              var2 = (float)(Math.random() * (double)((ge) this).field_j);
              var3 = (jb) (Object) ((ge) this).field_a.e((byte) 116);
              L4: while (true) {
                if (var3 == null) {
                  af.a((Throwable) null, -114, "ran out of orders! total " + ((ge) this).field_j + ", num " + ((ge) this).field_l + " w " + var2);
                  return null;
                } else {
                  var2 = (float)((double)var2 - Math.pow((double)(var3.field_t / ((ge) this).field_k), 4.0));
                  if (var2 <= 0.0f) {
                    return var3;
                  } else {
                    var3 = (jb) (Object) ((ge) this).field_a.a((byte) 123);
                    continue L4;
                  }
                }
              }
            } else {
              ((ge) this).field_j = (float)((double)((ge) this).field_j + Math.pow((double)(var2_ref_jb.field_t / ((ge) this).field_k), 4.0));
              var2_ref_jb = (jb) (Object) ((ge) this).field_a.a((byte) 123);
              continue L3;
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, jb param1) {
        this.a(param0, param1);
        if (!(param1.field_t >= ((ge) this).field_k)) {
            ((ge) this).field_k = param1.field_t;
        }
    }

    public static void c(int param0) {
        if (param0 > -98) {
            boolean discarded$0 = ge.a(39, 60);
        }
        field_h = null;
        field_m = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Type your password again to make sure it's correct";
        field_m = "Cancel";
    }
}
