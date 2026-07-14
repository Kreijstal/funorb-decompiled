/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends li {
    boolean field_s;
    int field_q;
    long[][] field_w;
    static int field_y;
    String[][] field_x;
    static int field_u;
    static String field_r;
    int field_p;
    int[][] field_n;
    int field_o;
    static nj field_t;
    static String field_v;

    public static void a(byte param0) {
        field_v = null;
        field_t = null;
        field_r = null;
        if (param0 != -118) {
            field_r = null;
        }
    }

    final static void a(byte param0, er[] param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          if (param1 == null) {
            break L0;
          } else {
            if (param3 > 0) {
              if (param0 != 49) {
                field_r = null;
                var6 = param1[0].field_x;
                var7 = param1[2].field_x;
                var8 = param1[1].field_x;
                param1[0].a(param4, param2, param5);
                param1[2].a(param4 + (param3 + -var7), param2, param5);
                bi.a(ak.field_d);
                bi.c(var6 + param4, param2, param3 + (param4 - var7), param1[1].field_B + param2);
                var9 = var6 + param4;
                var10 = param4 + (param3 + -var7);
                param4 = var9;
                L1: while (true) {
                  if (param4 >= var10) {
                    bi.b(ak.field_d);
                    return;
                  } else {
                    param1[1].a(param4, param2, param5);
                    param4 = param4 + var8;
                    continue L1;
                  }
                }
              } else {
                var6 = param1[0].field_x;
                var7 = param1[2].field_x;
                var8 = param1[1].field_x;
                param1[0].a(param4, param2, param5);
                param1[2].a(param4 + (param3 + -var7), param2, param5);
                bi.a(ak.field_d);
                bi.c(var6 + param4, param2, param3 + (param4 - var7), param1[1].field_B + param2);
                var9 = var6 + param4;
                var10 = param4 + (param3 + -var7);
                param4 = var9;
                L2: while (true) {
                  if (param4 >= var10) {
                    bi.b(ak.field_d);
                    return;
                  } else {
                    param1[1].a(param4, param2, param5);
                    param4 = param4 + var8;
                    continue L2;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    s() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = 48;
        field_r = "Passwords can only contain letters and numbers";
        field_v = "Change display name";
    }
}
