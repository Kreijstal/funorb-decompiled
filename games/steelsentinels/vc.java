/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc {
    int field_a;
    static String field_k;
    static boolean field_d;
    static gk[] field_b;
    static gh field_h;
    static String field_l;
    int field_g;
    static int field_c;
    static gh field_f;
    int field_i;
    static wk[] field_e;
    int field_j;

    final static void a(String param0, wk param1, boolean param2) {
        try {
            ij.field_P = param0;
            if (param2) {
                field_d = true;
            }
            jf.field_kb = param1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "vc.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_l = null;
        field_h = null;
        field_b = null;
        if (param0 != -13) {
          vc.b(45);
          field_f = null;
          field_k = null;
          return;
        } else {
          field_f = null;
          field_k = null;
          return;
        }
    }

    final static void a(int param0) {
        wc.a(23825);
        if (param0 != -1) {
            vc.a(79);
        }
    }

    final static int a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = SteelSentinels.field_G;
        var1 = di.field_g;
        if (var1 != 0) {
          if (1 != var1) {
            if (var1 != 7) {
              if (-6 != (var1 ^ -1)) {
                if (param0 != 32) {
                  field_h = (gh) null;
                  return -1;
                } else {
                  return -1;
                }
              } else {
                return 216000;
              }
            } else {
              return 218000;
            }
          } else {
            if (10 < qh.field_Yb) {
              if (-13 > (qh.field_Yb ^ -1)) {
                if (param0 == 32) {
                  return -1;
                } else {
                  field_h = (gh) null;
                  return -1;
                }
              } else {
                return 30000;
              }
            } else {
              return 218000;
            }
          }
        } else {
          return 90000;
        }
    }

    static {
        field_k = ", and was finished off by a drone";
        field_l = "Resign";
        field_d = false;
    }
}
