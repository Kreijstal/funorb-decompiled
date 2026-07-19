/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo {
    static String field_l;
    static int field_c;
    int field_e;
    String field_m;
    static String[] field_i;
    int field_p;
    static boolean field_w;
    static wk[] field_g;
    String field_q;
    static boolean field_r;
    static wk field_t;
    int field_b;
    static wk field_s;
    je field_u;
    static String field_o;
    long field_n;
    int[] field_d;
    String field_k;
    String field_h;
    int field_a;
    static int field_j;
    int field_v;
    boolean field_f;

    final int a(boolean param0) {
        L0: {
          if (param0) {
            break L0;
          } else {
            this.field_q = (String) null;
            break L0;
          }
        }
        L1: {
          if (this.field_f) {
            break L1;
          } else {
            L2: {
              if (2 != this.field_b) {
                break L2;
              } else {
                if (-1 > (this.field_p ^ -1)) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (oh.field_H != this.field_n) {
              L3: {
                if (th.field_a != 2) {
                  break L3;
                } else {
                  if (!jj.a(82, this.field_m)) {
                    break L3;
                  } else {
                    return 1;
                  }
                }
              }
              return 0;
            } else {
              return 1;
            }
          }
        }
        return 2;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var7 = param1;
        if (var7 > param3) {
            return false;
        }
        int var8 = -73 / ((param5 - -46) / 53);
        int var9 = var7 + param4;
        if (var9 < param3) {
            return false;
        }
        int var10 = param2;
        if (!(var10 <= param0)) {
            return false;
        }
        int var11 = var10 + param6;
        if (var11 < param0) {
            return false;
        }
        return true;
    }

    public static void a(int param0) {
        boolean discarded$0 = false;
        field_g = null;
        field_s = null;
        field_l = null;
        field_o = null;
        field_t = null;
        field_i = null;
        if (param0 != 0) {
            discarded$0 = mo.a(-123, 18, -64, -107, -63, (byte) 82, 91);
        }
    }

    mo(boolean param0) {
        L0: {
          L1: {
            this.field_h = dg.field_b;
            if (!param0) {
              break L1;
            } else {
              this.field_d = hv.field_R;
              if (!ArmiesOfGielinor.field_M) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_d = null;
          break L0;
        }
        this.field_a = rh.field_e;
        this.field_b = u.field_k;
        this.field_k = aw.field_k;
        this.field_f = ui.field_b;
        this.field_m = gp.field_b;
        this.field_q = qd.field_L;
        this.field_v = ut.field_eb;
        this.field_e = th.field_c;
        this.field_p = hc.field_e;
        this.field_n = gk.field_I;
    }

    mo(int param0, String param1, int param2, String param3, String param4) {
        try {
            this.field_m = param1;
            this.field_q = param1;
            this.field_f = true;
            this.field_n = 0L;
            this.field_k = param3;
            this.field_v = param2;
            this.field_p = 0;
            this.field_d = null;
            this.field_e = 0;
            this.field_b = param0;
            this.field_h = param4;
            this.field_a = 0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "mo.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "This game is full.";
        field_r = false;
        field_o = "Click to begin";
        field_j = 0;
    }
}
