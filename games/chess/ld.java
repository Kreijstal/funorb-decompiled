/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static int field_g;
    String field_i;
    int field_c;
    long field_m;
    String field_o;
    int field_h;
    int field_e;
    boolean field_d;
    String field_n;
    ci field_f;
    int[] field_l;
    int field_k;
    static String field_j;
    String field_b;
    int field_q;
    static String field_a;
    static int[] field_p;

    final int b(int param0) {
        L0: {
          if (this.field_d) {
            break L0;
          } else {
            L1: {
              if (2 != this.field_k) {
                break L1;
              } else {
                if (-1 > (this.field_h ^ -1)) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if ((gb.field_t ^ -1L) == (this.field_m ^ -1L)) {
              return 1;
            } else {
              L2: {
                if (param0 != field_g) {
                  break L2;
                } else {
                  if (!ah.a(this.field_i, 76)) {
                    break L2;
                  } else {
                    return 1;
                  }
                }
              }
              return 0;
            }
          }
        }
        return 2;
    }

    final static void a(String param0, String param1, int param2) {
        try {
            if (!(null == ua.field_d)) {
                ua.field_d.k((byte) 95);
            }
            um.field_b = new wf(param0, param1, false, true, true);
            if (param2 != 0) {
                ld.a(-20);
            }
            nj.field_w.c(um.field_b, 69);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "ld.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            ld.a(-22);
        }
        field_a = null;
        field_p = null;
        field_j = null;
    }

    ld(boolean param0) {
        this.field_i = oh.field_e;
        this.field_b = bh.field_H;
        this.field_e = va.field_a;
        this.field_o = an.field_a;
        this.field_m = sa.field_e;
        this.field_c = qn.field_M;
        this.field_k = tk.field_b;
        this.field_n = sn.field_g;
        this.field_q = ud.field_a;
        if (!param0) {
            this.field_l = null;
        } else {
            this.field_l = mk.field_d;
        }
        this.field_d = ue.field_c;
        this.field_h = fj.field_a;
    }

    ld(int param0, String param1, int param2, String param3, String param4) {
        try {
            this.field_b = param3;
            this.field_c = param2;
            this.field_q = 0;
            this.field_o = param1;
            this.field_h = 0;
            this.field_n = param4;
            this.field_e = 0;
            this.field_l = null;
            this.field_i = param1;
            this.field_d = true;
            this.field_k = param0;
            this.field_m = 0L;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "ld.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_a = "Waiting for extra data";
        field_p = new int[8192];
    }
}
