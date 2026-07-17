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
        if (!((aa) this).field_a) {
          if (-3 != ((aa) this).field_j) {
            var2 = 43 / ((param0 - 42) / 57);
            if (((aa) this).field_k == hn.field_f) {
              return 1;
            } else {
              if (2 == gk.field_db) {
                if (!ha.a(((aa) this).field_n, (byte) 37)) {
                  return 0;
                } else {
                  return 1;
                }
              } else {
                return 0;
              }
            }
          } else {
            if (-1 >= ((aa) this).field_i) {
              var2 = 43 / ((param0 - 42) / 57);
              if (((aa) this).field_k == hn.field_f) {
                return 1;
              } else {
                if (2 == gk.field_db) {
                  if (!ha.a(((aa) this).field_n, (byte) 37)) {
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
        field_c = null;
        field_p = null;
        field_f = null;
    }

    final static qa a(Throwable param0, String param1) {
        qa var2 = null;
        if (param0 instanceof qa) {
            var2 = (qa) (Object) param0;
            var2.field_d = var2.field_d + 32 + param1;
        } else {
            var2 = new qa(param0, param1);
        }
        return var2;
    }

    aa(boolean param0) {
        ((aa) this).field_b = op.field_s;
        ((aa) this).field_n = op.field_t;
        ((aa) this).field_h = cl.field_h;
        if (param0) {
            ((aa) this).field_l = oh.field_g;
        } else {
            ((aa) this).field_l = null;
        }
        ((aa) this).field_j = fk.field_o;
        ((aa) this).field_m = dd.field_a;
        ((aa) this).field_i = lj.field_d;
        ((aa) this).field_e = kn.field_I;
        ((aa) this).field_a = uc.field_n;
        ((aa) this).field_k = cd.field_g;
        ((aa) this).field_d = qf.field_b;
        ((aa) this).field_g = pb.field_j;
    }

    aa(int param0, String param1, int param2, String param3, String param4) {
        try {
            ((aa) this).field_i = 0;
            ((aa) this).field_d = 0;
            ((aa) this).field_j = param0;
            ((aa) this).field_g = param4;
            ((aa) this).field_e = 0;
            ((aa) this).field_a = true;
            ((aa) this).field_k = 0L;
            ((aa) this).field_h = param3;
            ((aa) this).field_m = param1;
            ((aa) this).field_b = param2;
            ((aa) this).field_n = param1;
            ((aa) this).field_l = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "aa.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = null;
    }
}
