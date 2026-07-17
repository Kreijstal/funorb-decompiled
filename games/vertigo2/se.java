/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends ji {
    static er field_C;
    static byte[][] field_y;
    private int field_z;
    static fi field_A;

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[] var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var24 = null;
        int[] var25 = null;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var16 = Vertigo2.field_L ? 1 : 0;
        if (param1 >= 91) {
          L0: {
            var17 = ((se) this).field_x.a(param0, (byte) -62);
            var3 = var17;
            if (((se) this).field_x.field_i) {
              var25 = ((se) this).a(0, -1, param0 - 1 & fk.field_x);
              var5 = ((se) this).a(0, -1, param0);
              var24 = ((se) this).a(0, -1, param0 + 1 & fk.field_x);
              var7 = 0;
              L1: while (true) {
                if (var7 >= we.field_M) {
                  break L0;
                } else {
                  L2: {
                    var8 = ((se) this).field_z * (var24[var7] + -var25[var7]);
                    var9 = (-var5[rm.field_z & var7 + -1] + var5[rm.field_z & 1 + var7]) * ((se) this).field_z;
                    var10 = var9 >> 12;
                    var11 = var8 >> 12;
                    var12 = var10 * var10 >> 12;
                    var13 = var11 * var11 >> 12;
                    var14 = (int)(4096.0 * Math.sqrt((double)((float)(var13 + (var12 + 4096)) / 4096.0f)));
                    if (0 == var14) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      break L2;
                    } else {
                      stackOut_7_0 = 16777216 / var14;
                      stackIn_9_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  var15 = stackIn_9_0;
                  var17[var7] = -var15 + 4096;
                  var7++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
          return var17;
        } else {
          return null;
        }
    }

    final static void a(String param0) {
        try {
            lr.field_S = param0;
            rh.b(-14, 12);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "se.B(" + (param0 != null ? "{...}" : "null") + 44 + 12 + 41);
        }
    }

    public se() {
        super(1, true);
        ((se) this).field_z = 4096;
    }

    final void a(byte param0, int param1, ed param2) {
        RuntimeException var4 = null;
        Object var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (0 != param1) {
                break L1;
              } else {
                ((se) this).field_z = param2.a((byte) -11);
                break L1;
              }
            }
            L2: {
              if (param0 == 110) {
                break L2;
              } else {
                var5 = null;
                ((se) this).a((byte) -52, -60, (ed) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("se.C(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    public static void b() {
        field_y = null;
        field_C = null;
        field_A = null;
    }

    static {
    }
}
