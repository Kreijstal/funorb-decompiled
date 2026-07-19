/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    long field_k;
    ak field_q;
    static ue field_p;
    int field_j;
    String field_n;
    int field_e;
    static int field_o;
    int[] field_l;
    String field_h;
    int field_b;
    static fh field_c;
    static pc field_f;
    String field_m;
    int field_d;
    boolean field_a;
    String field_g;
    int field_i;

    final int a(byte param0) {
        int var2 = 0;
        if (!this.field_a) {
          if (-3 != (this.field_j ^ -1)) {
            var2 = 43 / ((param0 - 42) / 57);
            if (this.field_k == hn.field_f) {
              return 1;
            } else {
              if (2 == gk.field_db) {
                if (!ha.a(this.field_n, (byte) 37)) {
                  return 0;
                } else {
                  return 1;
                }
              } else {
                return 0;
              }
            }
          } else {
            if (-1 <= (this.field_i ^ -1)) {
              var2 = 43 / ((param0 - 42) / 57);
              if (this.field_k == hn.field_f) {
                return 1;
              } else {
                if (2 == gk.field_db) {
                  if (!ha.a(this.field_n, (byte) 37)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              }
            } else {
              return 2;
            }
          }
        } else {
          return 2;
        }
    }

    public static void a(int param0) {
        qa discarded$2 = null;
        String var2 = null;
        field_c = null;
        if (param0 >= -126) {
          var2 = (String) null;
          discarded$2 = aa.a((Throwable) null, (String) null);
          field_p = null;
          field_f = null;
          return;
        } else {
          field_p = null;
          field_f = null;
          return;
        }
    }

    final static qa a(Throwable param0, String param1) {
        qa var2 = null;
        if (param0 instanceof qa) {
            var2 = (qa) ((Object) param0);
            var2.field_d = var2.field_d + ' ' + param1;
        } else {
            var2 = new qa(param0, param1);
        }
        return var2;
    }

    aa(boolean param0) {
        this.field_b = op.field_s;
        this.field_n = op.field_t;
        this.field_h = cl.field_h;
        if (param0) {
            this.field_l = oh.field_g;
        } else {
            this.field_l = null;
        }
        this.field_j = fk.field_o;
        this.field_m = dd.field_a;
        this.field_i = lj.field_d;
        this.field_e = kn.field_I;
        this.field_a = uc.field_n;
        this.field_k = cd.field_g;
        this.field_d = qf.field_b;
        this.field_g = pb.field_j;
    }

    aa(int param0, String param1, int param2, String param3, String param4) {
        try {
            this.field_i = 0;
            this.field_d = 0;
            this.field_j = param0;
            this.field_g = param4;
            this.field_e = 0;
            this.field_a = true;
            this.field_k = 0L;
            this.field_h = param3;
            this.field_m = param1;
            this.field_b = param2;
            this.field_n = param1;
            this.field_l = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "aa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = null;
    }
}
