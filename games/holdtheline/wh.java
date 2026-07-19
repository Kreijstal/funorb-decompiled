/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends vd {
    private int field_g;
    private int field_h;
    private int field_f;

    final static void a(byte param0) {
        if (!(ci.field_o)) {
            throw new IllegalStateException();
        }
        int var1 = 102 / ((24 - param0) / 33);
        if (null != sb.field_c) {
            sb.field_c.h((byte) -93);
        }
        String var2 = ch.a(false);
        lh.field_a = new vg(var2, (String) null, true, false, false);
        ka.field_b.a(sm.field_c, false);
        sm.field_c.a((n) (lh.field_a), (byte) 13);
        sm.field_c.b(false);
    }

    final void a(float param0, int[] param1, int param2, int[] param3, byte param4) {
        RuntimeException var6 = null;
        int[] var6_array = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var12 = HoldTheLine.field_D;
        try {
          L0: {
            var13 = new int[param1.length + param3.length];
            var15 = var13;
            var14 = var15;
            var6_array = var14;
            var7 = 0;
            L1: while (true) {
              if (var7 >= param3.length) {
                var7 = 0;
                L2: while (true) {
                  if (var7 >= param1.length / 2) {
                    L3: {
                      if ((this.field_h ^ -1) != -257) {
                        dl.a(var15, (byte) -127, this.field_h, this.field_g);
                        break L3;
                      } else {
                        gf.a(var15, this.field_g);
                        break L3;
                      }
                    }
                    L4: {
                      if (param4 == 49) {
                        break L4;
                      } else {
                        this.field_f = -37;
                        break L4;
                      }
                    }
                    var8 = var6_array[-2 + var15.length];
                    var9 = var6_array[-1 + var15.length];
                    var7 = 0;
                    L5: while (true) {
                      if (var7 >= var15.length) {
                        break L0;
                      } else {
                        var10 = var15[var7];
                        var11 = var6_array[var7 + 1];
                        tc.d(var8, var9, var10, var11, this.field_f);
                        var8 = var10;
                        var9 = var11;
                        var7 += 2;
                        continue L5;
                      }
                    }
                  } else {
                    var6_array[param3.length - -(var7 * 2)] = param1[-(var7 * 2) + (-2 + param1.length)];
                    var6_array[2 * var7 + (param3.length + 1)] = param1[-1 + (param1.length - 2 * var7)];
                    var7++;
                    continue L2;
                  }
                }
              } else {
                var13[var7] = param3[var7];
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var6);
            stackOut_16_1 = new StringBuilder().append("wh.A(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param4 + ')');
        }
    }

    wh(int param0, int param1, int param2) {
        this.field_h = param2;
        this.field_f = param1;
        this.field_g = param0;
    }

    static {
    }
}
