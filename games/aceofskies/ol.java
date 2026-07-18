/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ol extends ai {
    static String field_f;
    static vd[] field_e;
    static int field_c;
    private int[] field_d;

    final void a(int param0, float param1, int param2, float param3, int param4, int param5, float param6, float param7, int param8, float[] param9, int param10) {
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        int var16 = 0;
        int var17 = 0;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        float var24 = 0.0f;
        int var25 = 0;
        int var26 = 0;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        float var35 = 0.0f;
        int var36 = 0;
        int var37 = 0;
        float var38 = 0.0f;
        float var39 = 0.0f;
        float var40 = 0.0f;
        int var41 = 0;
        Object var42 = null;
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
        var41 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var12_int = (int)((float)param2 * param6 - 1.0f);
              var12_int = var12_int & 255;
              var13 = (int)(param7 * (float)param10 - 1.0f);
              var13 = var13 & 255;
              var14 = (int)(param3 * (float)param4 - 1.0f);
              var14 = var14 & 255;
              var15 = (float)param0 * param3;
              var16 = (int)var15;
              var17 = 1 + var16;
              var18 = var15 - (float)var16;
              var19 = -var18 + 1.0f;
              var16 = var16 & var14;
              var17 = var17 & var14;
              var20 = ce.a(var18, -59);
              var21 = ((ol) this).field_d[var16];
              var22 = ((ol) this).field_d[var17];
              var23 = 0;
              if (param5 <= 0) {
                break L1;
              } else {
                var42 = null;
                ((ol) this).a(68, -0.00900564156472683f, -53, -0.8669494390487671f, -60, 124, -0.45034173130989075f, -0.870319664478302f, 33, (float[]) null, -26);
                break L1;
              }
            }
            L2: while (true) {
              if (param10 <= var23) {
                break L0;
              } else {
                var24 = param7 * (float)var23;
                var25 = (int)var24;
                var26 = var25 - -1;
                var27 = var24 - (float)var25;
                var28 = -var27 + 1.0f;
                var26 = var26 & var13;
                var25 = var25 & var13;
                var29 = ce.a(var27, -87);
                var30 = ((ol) this).field_d[var21 + var25];
                var31 = ((ol) this).field_d[var21 + var26];
                var32 = ((ol) this).field_d[var22 + var25];
                var33 = ((ol) this).field_d[var22 + var26];
                var34 = 0;
                L3: while (true) {
                  if (param2 <= var34) {
                    var23++;
                    continue L2;
                  } else {
                    var35 = param6 * (float)var34;
                    var36 = (int)var35;
                    var37 = var36 + 1;
                    var38 = var35 - (float)var36;
                    var39 = -var38 + 1.0f;
                    var37 = var37 & var12_int;
                    var40 = ce.a(var38, -81);
                    var36 = var36 & var12_int;
                    int incrementValue$1 = param8;
                    param8++;
                    param9[incrementValue$1] = hq.a(var20, 26921, hq.a(var29, 26921, hq.a(var40, 26921, ef.a(var38, var18, -87, var27, pg.a(7, ((ol) this).field_d[var37 - -var33])), ef.a(var39, var18, -98, var27, pg.a(7, ((ol) this).field_d[var36 + var33]))), hq.a(var40, 26921, ef.a(var38, var18, -116, var28, pg.a(7, ((ol) this).field_d[var32 + var37])), ef.a(var39, var18, -115, var28, pg.a(((ol) this).field_d[var32 + var36], 7)))), hq.a(var29, 26921, hq.a(var40, 26921, ef.a(var38, var19, -47, var27, pg.a(((ol) this).field_d[var31 + var37], 7)), ef.a(var39, var19, -111, var27, pg.a(7, ((ol) this).field_d[var31 + var36]))), hq.a(var40, 26921, ef.a(var38, var19, -85, var28, pg.a(((ol) this).field_d[var37 - -var30], 7)), ef.a(var39, var19, -35, var28, pg.a(((ol) this).field_d[var30 + var36], 7))))) * param1;
                    var34++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var12;
            stackOut_9_1 = new StringBuilder().append("ol.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param9 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param10 + ')');
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_f = null;
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
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
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
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
        try {
          L0: {
            if (param1 <= -123) {
              L1: {
                var3 = ph.a(param0, 0);
                if (param2.indexOf(param0) != -1) {
                  break L1;
                } else {
                  if (-1 != param2.indexOf(var3)) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        if (param2.startsWith(param0)) {
                          break L3;
                        } else {
                          if (param2.startsWith(var3)) {
                            break L3;
                          } else {
                            if (param2.endsWith(param0)) {
                              break L3;
                            } else {
                              if (!param2.endsWith(var3)) {
                                stackOut_14_0 = 0;
                                stackIn_15_0 = stackOut_14_0;
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      stackOut_13_0 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      break L2;
                    }
                    break L0;
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("ol.D(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    ol(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ((ol) this).field_d = new int[512];
        Random var2 = new Random((long)param0);
        for (var3 = 0; var3 < 256; var3++) {
            ((ol) this).field_d[var3 + 256] = var3;
            ((ol) this).field_d[var3] = var3;
        }
        int var6 = 0;
        var3 = var6;
        while (var6 < 256) {
            var4 = var2.nextInt() & 255;
            var5 = ((ol) this).field_d[var4];
            ((ol) this).field_d[var4 - -256] = ((ol) this).field_d[var6];
            ((ol) this).field_d[var4] = ((ol) this).field_d[var6];
            ((ol) this).field_d[256 + var6] = var5;
            ((ol) this).field_d[var6] = var5;
            var6++;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Type your email address again to make sure it's correct";
    }
}
