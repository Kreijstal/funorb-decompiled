/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eu {
    static ri[] field_a;

    final static int a() {
        return lq.field_d;
    }

    public static void a(boolean param0) {
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var28 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 <= 0) {
                break L1;
              } else {
                if (rm.a(param2, -113)) {
                  break L1;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            L2: {
              if (param1 <= 0) {
                break L2;
              } else {
                if (!rm.a(param1, -108)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            var8_int = 0;
            L3: {
              if (param2 < param1) {
                stackOut_12_0 = param2;
                stackIn_13_0 = stackOut_12_0;
                break L3;
              } else {
                stackOut_11_0 = param1;
                stackIn_13_0 = stackOut_11_0;
                break L3;
              }
            }
            var9 = stackIn_13_0;
            var10 = param2 >> 1;
            var11 = param1 >> 1;
            var12 = param4;
            var13 = new int[var11 * var10];
            L4: while (true) {
              jaggl.OpenGL.glTexImage2Di(param3, var8_int, param5, param2, param1, 0, 32993, param6, var12, 0);
              if (var9 > 1) {
                var15 = 0;
                var24 = 0;
                var25 = param2 + var24;
                var14 = var13;
                var26 = 0;
                L5: while (true) {
                  if (var26 >= var11) {
                    var13 = var12;
                    param2 = var10;
                    param1 = var11;
                    var12 = var14;
                    var8_int++;
                    var10 = var10 >> 1;
                    var11 = var11 >> 1;
                    var9 = var9 >> 1;
                    continue L4;
                  } else {
                    var27 = 0;
                    L6: while (true) {
                      if (var10 <= var27) {
                        var24 = var24 + param2;
                        var25 = var25 + param2;
                        var26++;
                        continue L5;
                      } else {
                        int incrementValue$5 = var24;
                        var24++;
                        var16 = var12[incrementValue$5];
                        int incrementValue$6 = var24;
                        var24++;
                        var17 = var12[incrementValue$6];
                        int incrementValue$7 = var25;
                        var25++;
                        var18 = var12[incrementValue$7];
                        var21 = var16 >> 8 & 255;
                        int incrementValue$8 = var25;
                        var25++;
                        var19 = var12[incrementValue$8];
                        var23 = var16 >> 24 & 255;
                        var22 = 255 & var16;
                        var20 = var16 >> 16 & 255;
                        var20 = var20 + ((var17 & 16749302) >> 16);
                        var23 = var23 + (var17 >> 24 & 255);
                        var21 = var21 + ((65490 & var17) >> 8);
                        var22 = var22 + (255 & var17);
                        var23 = var23 + (255 & var18 >> 24);
                        var21 = var21 + ((65476 & var18) >> 8);
                        var22 = var22 + (var18 & 255);
                        var20 = var20 + (255 & var18 >> 16);
                        var21 = var21 + (var19 >> 8 & 255);
                        var23 = var23 + (var19 >> 24 & 255);
                        var22 = var22 + (255 & var19);
                        var20 = var20 + (255 & var19 >> 16);
                        int incrementValue$9 = var15;
                        var15++;
                        var13[incrementValue$9] = ic.a(ic.a(eb.a(var21, 1020) << 6, ic.a(eb.a(16711680, var20 << 14), eb.a(1020, var23) << 22)), eb.a(var22 >> 2, 255));
                        var27++;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var8;
            stackOut_24_1 = new StringBuilder().append("eu.BA(").append(-122).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param5 + ',' + param6 + ',' + 32993 + ')');
        }
    }

    static {
    }
}
