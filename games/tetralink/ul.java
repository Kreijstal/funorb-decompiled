/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul implements kg {
    static String field_a;
    static float field_d;
    static String field_b;
    static String field_e;
    static kh[] field_c;

    public static void a(int param0) {
        int var1 = -102 / ((-25 - param0) / 36);
        field_b = null;
        field_e = null;
        field_c = null;
        field_a = null;
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        oh var8 = null;
        gd var9 = null;
        try {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                var9 = (gd) null;
                ul.a((byte) 88, (gd) null);
                break L1;
              }
            }
            L2: {
              var6_int = param1 + param0.field_t;
              var7 = param2 + param0.field_w;
              in.a(var6_int, var7, (byte) -118, param0.field_F, param0.field_u);
              var8 = fj.field_q[1];
              if (!(param0 instanceof ae)) {
                break L2;
              } else {
                if (!((ae) ((Object) param0)).field_N) {
                  break L2;
                } else {
                  var8.b((param0.field_F + -var8.field_t >> -522780447) + 1 + var6_int, 1 + (var7 - -(param0.field_u + -var8.field_F >> 1502553345)), 256);
                  break L2;
                }
              }
            }
            if (param0.c(3)) {
              id.a(param0.field_F - 4, 2 + var7, 0, param0.field_u - 4, 2 + var6_int);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("ul.L(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, gd param1) {
        gd var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            var3 = 114 / ((param0 - 0) / 52);
            param1.b(false);
            var2 = (gd) ((Object) gl.field_p.c(false));
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  if (!var2.a((byte) -115, param1)) {
                    break L2;
                  } else {
                    var2 = (gd) ((Object) gl.field_p.a((byte) -70));
                    continue L1;
                  }
                }
              }
              if (var2 != null) {
                cl.a(var2, -94, param1);
                break L0;
              } else {
                gl.field_p.a(param1, false);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2_ref);

            stackIn_11_1 = new StringBuilder().append("ul.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_a = "Unable to connect to the data server. Please check any firewall you are using.";
        field_b = "You have resigned.";
    }
}
