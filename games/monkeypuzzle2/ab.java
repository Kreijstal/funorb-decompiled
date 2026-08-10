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
        byte[] var2;
        byte[] var3;
        var3 = new byte[this.field_c.capacity()];
        var2 = var3;
        this.field_c.position(0);
        this.field_c.get(var3);
        if (param0 != -13913) {
          return (byte[]) null;
        } else {
          return var3;
        }
    }

    ab() {
    }

    final static te a(byte param0, int param1) {
        te[] var2;
        int var3;
        int var4;
        int var5;
        te[] var6;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var6 = ee.j(44);
        var2 = var6;
        var3 = 0;
        var4 = 105 / ((-2 - param0) / 61);
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

    final static void a(int param0, int param1, le[] param2, int param3, int param4, byte param5) {
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
                    if (param4 >= var10) {
                      ge.a(si.field_u);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param2[1].a(param4, param3, param1);
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

            stackIn_13_1 = new StringBuilder().append("ab.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, byte[] param1) {
        try {
            this.field_c = java.nio.ByteBuffer.allocateDirect(param1.length);
            this.field_c.position(0);
            int var3_int = 117 / ((11 - param0) / 42);
            this.field_c.put(param1);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ab.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 0;
    }
}
