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
            field_r = (String) null;
        }
    }

    final static void a(byte param0, er[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param3 > 0) {
                  L2: {
                    if (param0 == 49) {
                      break L2;
                    } else {
                      field_r = (String) null;
                      break L2;
                    }
                  }
                  var6_int = param1[0].field_x;
                  var7 = param1[2].field_x;
                  var8 = param1[1].field_x;
                  param1[0].a(param4, param2, param5);
                  param1[2].a(param4 + (param3 + -var7), param2, param5);
                  bi.a(ak.field_d);
                  bi.c(var6_int + param4, param2, param3 + (param4 - var7), param1[1].field_B + param2);
                  var9 = var6_int + param4;
                  var10 = param4 + (param3 + -var7);
                  param4 = var9;
                  L3: while (true) {
                    if (param4 >= var10) {
                      bi.b(ak.field_d);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param1[1].a(param4, param2, param5);
                      param4 = param4 + var8;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("s.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    s() {
    }

    static {
        field_y = 48;
        field_r = "Passwords can only contain letters and numbers";
        field_v = "Change display name";
    }
}
