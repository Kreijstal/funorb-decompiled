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
        var3 = new byte[this.field_c.capacity()];
        var2 = var3;
        java.nio.Buffer discarded$19 = this.field_c.position(0);
        java.nio.ByteBuffer discarded$20 = this.field_c.get(var3);
        if (param0 != -13913) {
          return (byte[]) null;
        } else {
          return var3;
        }
    }

    ab() {
    }

    final static te a(byte param0, int param1) {
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        te[] var6 = ee.j(44);
        te[] var2 = var6;
        int var3 = 0;
        int var4 = 105 / ((-2 - param0) / 61);
        do {
            if (var6.length <= var3) {
                return null;
            }
            if (!(param1 != var6[var3].field_c)) {
                return var6[var3];
            }
            var3++;
        } while (var5 == 0);
        return null;
    }

    final static void a(int param0, int param1, le[] param2, int param3, int param4, byte param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param0 > 0) {
                  L2: {
                    var6_int = param2[0].field_m;
                    var7 = param2[2].field_m;
                    var8 = param2[1].field_m;
                    param2[0].a(param4, param3, param1);
                    param2[2].a(-var7 + (param0 + param4), param3, param1);
                    ge.b(si.field_u);
                    ge.c(var6_int + param4, param3, param4 - -param0 - var7, param2[1].field_n + param3);
                    var9 = param4 + var6_int;
                    var10 = -var7 + param0 + param4;
                    if (param5 > 24) {
                      break L2;
                    } else {
                      field_d = -36;
                      break L2;
                    }
                  }
                  param4 = var9;
                  L3: while (true) {
                    L4: {
                      if (param4 >= var10) {
                        ge.a(si.field_u);
                        break L4;
                      } else {
                        param2[1].a(param4, param3, param1);
                        param4 = param4 + var8;
                        if (var11 != 0) {
                          break L4;
                        } else {
                          continue L3;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
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
          L5: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var6);
            stackOut_13_1 = new StringBuilder().append("ab.C(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte[] param1) {
        java.nio.Buffer discarded$0 = null;
        java.nio.ByteBuffer discarded$1 = null;
        try {
            this.field_c = java.nio.ByteBuffer.allocateDirect(param1.length);
            discarded$0 = this.field_c.position(0);
            int var3_int = 117 / ((11 - param0) / 42);
            discarded$1 = this.field_c.put(param1);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ab.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 0;
    }
}
