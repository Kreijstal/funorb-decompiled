/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eu {
    static ri[] field_a;

    final static int a(byte param0) {
        if (param0 != -97) {
            return -56;
        }
        return lq.field_d;
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            field_a = (ri[]) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
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
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var28 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 <= (param2 ^ -1)) {
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
              if ((param1 ^ -1) >= -1) {
                break L2;
              } else {
                if (!rm.a(param1, -108)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            if (32993 != param7) {
              throw new IllegalArgumentException("");
            } else {
              var8_int = 0;
              if (param0 <= -64) {
                L3: {
                  if (param2 < param1) {
                    stackOut_15_0 = param2;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = param1;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                var9 = stackIn_16_0;
                var10 = param2 >> 1851954721;
                var11 = param1 >> -1830949375;
                var12 = param4;
                var13 = new int[var11 * var10];
                L4: while (true) {
                  L5: {
                    L6: {
                      jaggl.OpenGL.glTexImage2Di(param3, var8_int, param5, param2, param1, 0, param7, param6, var12, 0);
                      if (-2 > (var9 ^ -1)) {
                        break L6;
                      } else {
                        if (var28 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var15 = 0;
                    var24 = 0;
                    var25 = param2 + var24;
                    var14 = var13;
                    var26 = 0;
                    L7: while (true) {
                      L8: {
                        if (var26 >= var11) {
                          var13 = var12;
                          param2 = var10;
                          param1 = var11;
                          var12 = var14;
                          var8_int++;
                          var10 = var10 >> 1;
                          var11 = var11 >> 1;
                          stackOut_29_0 = var9 >> 1;
                          stackIn_30_0 = stackOut_29_0;
                          break L8;
                        } else {
                          stackOut_21_0 = 0;
                          stackIn_30_0 = stackOut_21_0;
                          stackIn_22_0 = stackOut_21_0;
                          if (var28 != 0) {
                            break L8;
                          } else {
                            var27 = stackIn_22_0;
                            L9: while (true) {
                              L10: {
                                if (var10 <= var27) {
                                  var24 = var24 + param2;
                                  var25 = var25 + param2;
                                  var26++;
                                  break L10;
                                } else {
                                  incrementValue$5 = var24;
                                  var24++;
                                  var16 = var12[incrementValue$5];
                                  incrementValue$6 = var24;
                                  var24++;
                                  var17 = var12[incrementValue$6];
                                  incrementValue$7 = var25;
                                  var25++;
                                  var18 = var12[incrementValue$7];
                                  var21 = var16 >> -126182264 & 255;
                                  incrementValue$8 = var25;
                                  var25++;
                                  var19 = var12[incrementValue$8];
                                  var23 = var16 >> 554048280 & 255;
                                  var22 = 255 & var16;
                                  var20 = var16 >> -2422160 & 255;
                                  var20 = var20 + ((var17 & 16749302) >> 1054046608);
                                  var23 = var23 + (var17 >> 459251192 & 255);
                                  var21 = var21 + ((65490 & var17) >> -439656760);
                                  var22 = var22 + (255 & var17);
                                  var23 = var23 + (255 & var18 >> 450257976);
                                  var21 = var21 + ((65476 & var18) >> -1830625976);
                                  var22 = var22 + (var18 & 255);
                                  var20 = var20 + (255 & var18 >> 1634697712);
                                  var21 = var21 + (var19 >> 849413544 & 255);
                                  var23 = var23 + (var19 >> 1547674040 & 255);
                                  var22 = var22 + (255 & var19);
                                  var20 = var20 + (255 & var19 >> 1143996176);
                                  incrementValue$9 = var15;
                                  var15++;
                                  var13[incrementValue$9] = ic.a(ic.a(eb.a(var21, 1020) << -1997852826, ic.a(eb.a(16711680, var20 << 1695055086), eb.a(1020, var23) << 847796630)), eb.a(var22 >> -1414477758, 255));
                                  var27++;
                                  if (var28 != 0) {
                                    break L10;
                                  } else {
                                    continue L9;
                                  }
                                }
                              }
                              continue L7;
                            }
                          }
                        }
                      }
                      var9 = stackIn_30_0;
                      if (var28 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var8 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var8);
            stackOut_32_1 = new StringBuilder().append("eu.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param4 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
