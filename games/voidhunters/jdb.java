/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jdb implements dja {
    static String field_a;

    public final tv a(byte param0) {
        int var2 = -11 / ((-64 - param0) / 50);
        return (tv) (Object) new cf();
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            Object var2 = null;
            jdb.a(-105, (byte) 0, 18, (ds) null, 3);
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
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
        int stackIn_12_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var28 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param7 <= 0) {
                break L1;
              } else {
                if (bd.a(param7, (byte) -95)) {
                  break L1;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            L2: {
              if (param6 <= 0) {
                break L2;
              } else {
                if (bd.a(param6, (byte) -95)) {
                  break L2;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            L3: {
              var8_int = 0;
              if (param7 >= param6) {
                stackOut_11_0 = param6;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = param7;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            var9 = stackIn_12_0;
            var10 = param7 >> 1;
            var11 = param6 >> 1;
            var12 = param0;
            var13 = new int[var10 * var11];
            L4: while (true) {
              jaggl.OpenGL.glTexImage2Di(param4, var8_int, param3, param7, param6, 0, 32993, param1, var12, 0);
              if (var9 > 1) {
                var15 = 0;
                var24 = 0;
                var25 = var24 - -param7;
                var14 = var13;
                var26 = 0;
                L5: while (true) {
                  if (var26 >= var11) {
                    var13 = var12;
                    param6 = var11;
                    param7 = var10;
                    var12 = var14;
                    var11 = var11 >> 1;
                    var10 = var10 >> 1;
                    var8_int++;
                    var9 = var9 >> 1;
                    continue L4;
                  } else {
                    var27 = 0;
                    L6: while (true) {
                      if (var10 <= var27) {
                        var24 = var24 + param7;
                        var25 = var25 + param7;
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
                        var22 = var16 & 255;
                        var21 = (65332 & var16) >> 8;
                        var20 = var16 >> 16 & 255;
                        var23 = 255 & var16 >> 24;
                        int incrementValue$8 = var25;
                        var25++;
                        var19 = var12[incrementValue$8];
                        var21 = var21 + ((var17 & 65394) >> 8);
                        var23 = var23 + (255 & var17 >> 24);
                        var22 = var22 + (255 & var17);
                        var20 = var20 + ((var17 & 16763127) >> 16);
                        var20 = var20 + (255 & var18 >> 16);
                        var23 = var23 + (255 & var18 >> 24);
                        var22 = var22 + (255 & var18);
                        var21 = var21 + (var18 >> 8 & 255);
                        var20 = var20 + ((var19 & 16752225) >> 16);
                        var23 = var23 + (var19 >> 24 & 255);
                        var21 = var21 + (255 & var19 >> 8);
                        var22 = var22 + (var19 & 255);
                        int incrementValue$9 = var15;
                        var15++;
                        var13[incrementValue$9] = knb.a(dla.a(var22 >> 2, 255), knb.a(dla.a(var21, 1020) << 6, knb.a(dla.a(16711680, var20 << 14), dla.a(-16777216, var23 << 22))));
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
            stackOut_23_0 = (RuntimeException) var8;
            stackOut_23_1 = new StringBuilder().append("jdb.C(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ',' + 29175 + ',' + param3 + ',' + param4 + ',' + 32993 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, ds param3, int param4) {
        try {
            if (param1 != -48) {
                field_a = null;
            }
            param3.c(param1 ^ -48, 12);
            param3.a(17, true);
            param3.a(param2, true);
            param3.a(param4, true);
            param3.c(0, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "jdb.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return null;
        }
        return (tv[]) (Object) new cf[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Apply";
    }
}
