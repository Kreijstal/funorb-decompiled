/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static int field_c;
    static String field_b;
    static jj field_d;
    static ut[] field_a;

    final static void a(int param0, int param1) {
        try {
            ea.a(vt.field_c.field_v, 5, true, 636, param1, -51);
            if (param0 != 1) {
                field_d = null;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "sk.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(byte param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 97) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            stackOut_3_0 = wd.field_n[0];
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "sk.B(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(boolean param0) {
        RuntimeException runtimeException = null;
        fa var1 = null;
        ml var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                sk.a(-17, -97, 99);
                break L1;
              }
            }
            var1 = (fa) (Object) nl.field_f.g(24009);
            if (var1 == null) {
              lr.b((byte) -116);
              return;
            } else {
              var2 = un.field_e;
              int discarded$8 = var2.k(4);
              int discarded$9 = var2.k(4);
              int discarded$10 = var2.k(4);
              int discarded$11 = var2.k(4);
              var1.c((byte) -109);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) (Object) runtimeException, "sk.G(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, lv param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 == 16586) {
              np.field_Jb.a((gn) (Object) new i(param0, param2), 3);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("sk.D(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -5514) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            field_d = null;
            field_b = null;
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "sk.F(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        long var3_long = 0L;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        float var11 = 0.0f;
        String var12 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_long = nj.a(108);
            if (~var3_long <= ~ah.field_c) {
              L1: {
                ah.field_c = var3_long + 25L;
                var5 = (float)param2 / (float)param1;
                var6 = (int)(var5 * 100.0f);
                var8 = -80 / ((param0 - 12) / 58);
                var7 = nm.a((byte) -100, field_c);
                var9 = nm.a((byte) -99, field_c + 1);
                var10 = -var7 + var9;
                var11 = var5 * (float)var10 + (float)var7;
                var12 = no.field_K[field_c];
                if (null != var12) {
                  var12 = var12 + " - " + var6 + "%";
                  break L1;
                } else {
                  break L1;
                }
              }
              ju.a(var11, var12, (byte) 30);
              nm.field_g.b((byte) 118);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) (Object) runtimeException, "sk.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3, ml param4, int param5) {
        RuntimeException var6 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 19881) {
                break L1;
              } else {
                sk.a(22, -23, -9);
                break L1;
              }
            }
            stackOut_3_0 = gl.a(1 << param3, (byte) 123, param2, param5, param4, param3, 1 << param5, 1 << param1, 1 << param2, param1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("sk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param5 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
        field_b = "click";
    }
}
