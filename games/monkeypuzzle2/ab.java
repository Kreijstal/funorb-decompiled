/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends ka {
    static int field_d;
    private java.nio.ByteBuffer field_c;
    static int field_e;

    final static void e(int param0) {
        if (param0 != -18753) {
            field_d = 4;
        }
    }

    final byte[] d(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[((ab) this).field_c.capacity()];
        var2 = var3;
        java.nio.Buffer discarded$19 = ((ab) this).field_c.position(0);
        java.nio.ByteBuffer discarded$20 = ((ab) this).field_c.get(var3);
        if (param0 != -13913) {
          return null;
        } else {
          return var3;
        }
    }

    ab() {
    }

    final static te a(byte param0, int param1) {
        te[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        te[] var6 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        int discarded$2 = 44;
        var6 = ee.j();
        var2 = var6;
        var3 = 0;
        var4 = 105;
        L0: while (true) {
          if (var6.length > var3) {
            if (param1 == var6[var3].field_c) {
              return var6[var3];
            } else {
              var3++;
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static void a(int param0, int param1, le[] param2, int param3, int param4) {
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
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param0 > 0) {
                  var6_int = param2[0].field_m;
                  var7 = param2[2].field_m;
                  var8 = param2[1].field_m;
                  param2[0].a(param4, param3, param1);
                  param2[2].a(-var7 + (param0 + param4), param3, param1);
                  ge.b(si.field_u);
                  ge.c(var6_int + param4, param3, param4 - -param0 - var7, param2[1].field_n + param3);
                  var9 = param4 + var6_int;
                  var10 = -var7 + param0 + param4;
                  param4 = var9;
                  L2: while (true) {
                    if (param4 >= var10) {
                      ge.a(si.field_u);
                      break L0;
                    } else {
                      param2[1].a(param4, param3, param1);
                      param4 = param4 + var8;
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
            stackOut_9_1 = new StringBuilder().append("ab.C(").append(param0).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
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
          throw la.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 44 + param4 + 44 + 42 + 41);
        }
    }

    final void a(int param0, byte[] param1) {
        try {
            ((ab) this).field_c = java.nio.ByteBuffer.allocateDirect(param1.length);
            java.nio.Buffer discarded$0 = ((ab) this).field_c.position(0);
            int var3_int = 117 / ((11 - param0) / 42);
            java.nio.ByteBuffer discarded$1 = ((ab) this).field_c.put(param1);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "ab.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
    }
}
