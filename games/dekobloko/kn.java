/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends bh {
    int field_w;
    int field_y;
    static String field_n;
    int field_q;
    long field_o;
    int field_u;
    int[] field_s;
    int field_v;
    int field_t;
    static w field_r;
    int field_x;
    static w field_p;

    public static void a(int param0) {
        field_r = null;
        field_p = null;
        if (param0 != -1) {
            kn.a(11);
            field_n = null;
            return;
        }
        field_n = null;
    }

    final static void a(mm param0, byte param1, int param2, String param3, int param4, int param5) {
        int var6 = 0;
        if (param1 != -39) {
          return;
        } else {
          L0: {
            var6 = 2;
            if ((Object) (Object) se.field_S != (Object) (Object) param0) {
              break L0;
            } else {
              var6 = 1;
              break L0;
            }
          }
          L1: {
            param0.c(param3, -var6 + param5, -var6 + param2, 0, -1);
            param0.c(param3, -var6 + param5, param2, 0, -1);
            param0.c(param3, -var6 + param5, param2 + var6, 0, -1);
            param0.c(param3, param5, -var6 + param2, 0, -1);
            param0.c(param3, param5, param2 - -var6, 0, -1);
            param0.c(param3, param5 + var6, -var6 + param2, 0, -1);
            param0.c(param3, var6 + param5, param2, 0, -1);
            param0.c(param3, var6 + param5, var6 + param2, 0, -1);
            if ((Object) (Object) w.field_kb == (Object) (Object) param0) {
              param0.c(param3, 1 + param5, param2 + -var6, 0, -1);
              param0.c(param3, -1 + param5, param2 + -var6, 0, -1);
              param0.c(param3, var6 + param5, -1 + param2, 0, -1);
              param0.c(param3, -var6 + param5, -1 + param2, 0, -1);
              param0.c(param3, var6 + param5, param2 - -1, 0, -1);
              param0.c(param3, -var6 + param5, 1 + param2, 0, -1);
              param0.c(param3, param5 - -1, var6 + param2, 0, -1);
              param0.c(param3, -1 + param5, param2 + var6, 0, -1);
              break L1;
            } else {
              break L1;
            }
          }
          param0.c(param3, param5, param2, param4, -1);
          return;
        }
    }

    kn(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = dk.field_a;
        dk.field_a = dk.field_a + 1;
        ((kn) this).field_u = 65535 & fieldTemp$0;
        ((kn) this).field_s = param6;
        ((kn) this).field_v = param3;
        ((kn) this).field_q = param1;
        ((kn) this).field_t = param2;
        ((kn) this).field_y = param5;
        ((kn) this).field_w = param4;
        ((kn) this).field_x = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
