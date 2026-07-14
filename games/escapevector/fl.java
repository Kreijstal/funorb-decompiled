/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fl extends hg {
    fl field_j;
    long field_p;
    static String field_h;
    static String field_l;
    fl field_i;
    static int field_o;
    static int[] field_m;
    static int[] field_k;
    static uc field_n;
    static String field_g;

    final void d(int param0) {
        int var2 = 125 / ((param0 - 31) / 57);
        if (!(((fl) this).field_i != null)) {
            return;
        }
        ((fl) this).field_i.field_j = ((fl) this).field_j;
        ((fl) this).field_j.field_i = ((fl) this).field_i;
        ((fl) this).field_i = null;
        ((fl) this).field_j = null;
    }

    final static String e(int param0) {
        if (dg.field_o == dn.field_q) {
            return tf.field_h;
        }
        if (!(dg.field_o != ui.field_b)) {
            return tc.field_j;
        }
        if (!di.field_g.b(param0)) {
            return tc.field_j;
        }
        return vk.field_v;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param2 == -1) {
            break L0;
          } else {
            field_k = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 < param4) {
              break L2;
            } else {
              if (param5 + param4 <= param0) {
                break L2;
              } else {
                if (param6 < param3) {
                  break L2;
                } else {
                  if (param3 - -param1 <= param6) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static void a(int param0, int param1) {
        int var5 = 0;
        ed var6 = null;
        ed var7 = null;
        fn var8 = null;
        int var9 = EscapeVector.field_A;
        int var2 = 4 == param1 ? 1 : 0;
        ed[] var3 = mb.field_f;
        if (var2 != 0) {
            var3 = ob.field_b;
        }
        if (!(var3 != null)) {
            return;
        }
        ed[] var4 = jm.field_K;
        if (param0 != -1) {
            field_h = null;
        }
        if (!(var4 != null)) {
            return;
        }
        if (!(null != bf.field_M)) {
            bf.field_M = new rk[var3.length];
        }
        for (var5 = 0; var5 < var3.length; var5++) {
            var6 = var3[var5];
            var7 = var4[var5];
            var8 = new fn(rn.field_b[var5], rn.field_f[var5]);
            bf.field_M[var5] = new rk(var6, var7, var8);
        }
        ka.a(105);
    }

    final static void a(String param0, lk param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ga.field_d = param1;
        tl.field_l = param7;
        kl.field_n = param8;
        if (param3 != -22183) {
            return;
        }
        rh.field_N = param2;
        he.field_y = param4;
        ce.field_j = param5;
        mn.field_n = param6;
        kh.field_c = param0;
        od.field_j = (sb) (Object) new bk();
        uk.field_b = new kk(param1);
        af.field_e = new sk(od.field_j, uk.field_b);
    }

    protected fl() {
    }

    public static void a(byte param0) {
        field_h = null;
        int var1 = 126 % ((param0 - 50) / 35);
        field_n = null;
        field_m = null;
        field_k = null;
        field_l = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Connection timed out. Please try using a different server.";
        field_h = "Connection lost - attempting to reconnect";
        field_g = "Shield bonus: ";
        field_m = new int[]{-1, -1, -1, 0};
    }
}
