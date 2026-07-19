/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    boolean field_l;
    static String field_d;
    int[] field_a;
    String field_n;
    int field_j;
    String field_e;
    static String field_t;
    int field_i;
    static String field_m;
    String field_c;
    int field_k;
    static int[] field_p;
    static hl field_b;
    int field_g;
    static oh[] field_q;
    long field_r;
    static boolean field_o;
    hl field_f;
    String field_h;
    int field_s;

    final int a(byte param0) {
        int discarded$2 = 0;
        L0: {
          if (this.field_l) {
            break L0;
          } else {
            L1: {
              if (-3 != (this.field_i ^ -1)) {
                break L1;
              } else {
                if (0 < this.field_k) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (oj.field_c != this.field_r) {
              L2: {
                if (param0 == -63) {
                  break L2;
                } else {
                  discarded$2 = this.a((byte) -16);
                  break L2;
                }
              }
              L3: {
                if ((ji.field_Tb ^ -1) != -3) {
                  break L3;
                } else {
                  if (!oj.a(1, this.field_n)) {
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

    public static void a(int param0) {
        field_p = null;
        field_m = null;
        field_t = null;
        field_b = null;
        int var1 = 95 % ((-43 - param0) / 40);
        field_q = null;
        field_d = null;
    }

    fj(boolean param0) {
        this.field_j = vi.field_c;
        this.field_k = og.field_i;
        this.field_n = TetraLink.field_M;
        this.field_g = hg.field_a;
        this.field_e = g.field_O;
        this.field_s = n.field_O;
        this.field_h = ml.field_fb;
        this.field_c = ab.field_U;
        if (param0) {
            this.field_a = ha.field_i;
        } else {
            this.field_a = null;
        }
        this.field_r = el.field_tc;
        this.field_l = bo.field_s;
        this.field_i = ng.field_u;
    }

    fj(int param0, String param1, int param2, String param3, String param4) {
        try {
            this.field_j = param2;
            this.field_r = 0L;
            this.field_l = true;
            this.field_n = param1;
            this.field_a = null;
            this.field_k = 0;
            this.field_s = 0;
            this.field_g = 0;
            this.field_e = param1;
            this.field_c = param3;
            this.field_i = param0;
            this.field_h = param4;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "fj.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_d = "Show chat";
        field_t = "Show game chat from my friends";
    }
}
