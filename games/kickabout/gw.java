/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gw {
    static hd field_a;
    static String field_e;
    static vn[] field_f;
    static ut[] field_d;
    static int field_c;
    static String field_b;

    final static void b(int param0) {
        ml var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            var1 = or.field_d;
            L1: while (true) {
              int discarded$8 = -16000;
              if (!tm.b()) {
                if (param0 == 5) {
                  break L0;
                } else {
                  field_c = 84;
                  return;
                }
              } else {
                var1.b(8, (byte) 94);
                int fieldTemp$9 = var1.field_n + 1;
                var1.field_n = var1.field_n + 1;
                var2 = fieldTemp$9;
                int discarded$10 = 0;
                mo.a(var1);
                or.field_d.c(param0 ^ 59, -var2 + var1.field_n);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1_ref, "gw.B(" + param0 + ')');
        }
    }

    final static String a(int param0, byte param1, iw param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          try {
            L0: {
              var3_int = param2.f(-32768);
              if (var3_int > 80) {
                var3_int = 80;
                break L0;
              } else {
                break L0;
              }
            }
            var4 = new byte[var3_int];
            param2.field_n = param2.field_n + os.field_I.a(param2.field_n, var4, var3_int, param2.field_f, 0, false);
            var5 = hf.a((byte) -121, var3_int, 0, var4);
            stackOut_3_0 = (String) var5;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackOut_5_0 = "Cabbage";
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("gw.F(").append(80).append(',').append(-96).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    public static void d(int param0) {
        field_e = null;
        int var1 = -113 / ((-15 - param0) / 44);
        field_f = null;
        field_d = null;
        field_a = null;
        field_b = null;
    }

    final static void c() {
        np.field_Jb.a((gn) (Object) new no(), 3);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ut[] param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param5 == null) {
                break L1;
              } else {
                if (param3 > 0) {
                  var6_int = param5[0].field_o;
                  var7 = param5[2].field_o;
                  var8 = param5[1].field_o;
                  param5[0].d(param2, param0, param4);
                  param5[2].d(-var7 + param2 - -param3, param0, param4);
                  on.a(vi.field_q);
                  on.h(param2 - -var6_int, param0, param2 - (-param3 + var7), param5[1].field_v + param0);
                  var9 = param2 + var6_int;
                  var10 = param3 + (param2 + -var7);
                  param2 = var9;
                  L2: while (true) {
                    if (var10 <= param2) {
                      on.b(vi.field_q);
                      break L0;
                    } else {
                      param5[1].d(param2, param0, param4);
                      param2 = param2 + var8;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("gw.D(").append(param0).append(',').append(-27981).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param5 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final static void a() {
        fb.field_J = new bo(tv.field_e, ai.field_H, hl.field_f, dw.field_e, (hd) (Object) hs.field_d, ul.field_c);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new vn[5];
        field_e = "Cancel rematch";
        field_b = "You";
    }
}
