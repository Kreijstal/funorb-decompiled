/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class psa extends rqa {
    static dja field_o;

    psa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            si.a(34, 62, param0[0].a(94));
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("psa.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        double var1_double = 0.0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var8 = 0;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var14 = 0;
        int var15 = 0;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        RuntimeException decompiledCaughtException = null;
        var24 = VoidHunters.field_G;
        try {
          L0: {
            if (null != mpb.field_h) {
              return;
            } else {
              mpb.field_h = new int[65536];
              var1_double = 0.7 + (-0.015 + 0.03 * Math.random());
              var3 = 0;
              var4 = -1;
              var5 = 0;
              L1: while (true) {
                if (var5 >= 512) {
                  break L0;
                } else {
                  var6 = 360.0f * ((float)(var5 >> 3) / 64.0f + 0.0078125f);
                  var7 = 0.0625f + (float)(var5 & 7) / 8.0f;
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= 128) {
                      var5++;
                      continue L1;
                    } else {
                      L3: {
                        var9 = (float)var8 / 128.0f;
                        var10 = 0.0f;
                        var11 = 0.0f;
                        var12 = 0.0f;
                        var13 = var6 / 60.0f;
                        var14 = (int)var13;
                        var15 = var14 % 6;
                        var16 = var13 - (float)var14;
                        var17 = (1.0f - var7) * var9;
                        var18 = var9 * (1.0f - var7 * var16);
                        var19 = var9 * (-(var7 * (1.0f - var16)) + 1.0f);
                        if (var15 == 0) {
                          var11 = var19;
                          var10 = var9;
                          var12 = var17;
                          break L3;
                        } else {
                          if (var15 != 1) {
                            if (var15 == 2) {
                              var11 = var9;
                              var12 = var19;
                              var10 = var17;
                              break L3;
                            } else {
                              if (3 != var15) {
                                if (4 != var15) {
                                  if (var15 == 5) {
                                    var11 = var17;
                                    var10 = var9;
                                    var12 = var18;
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                } else {
                                  var12 = var9;
                                  var11 = var17;
                                  var10 = var19;
                                  break L3;
                                }
                              } else {
                                var12 = var9;
                                var10 = var17;
                                var11 = var18;
                                break L3;
                              }
                            }
                          } else {
                            var10 = var18;
                            var11 = var9;
                            var12 = var17;
                            break L3;
                          }
                        }
                      }
                      var10 = (float)Math.pow((double)var10, var1_double);
                      var11 = (float)Math.pow((double)var11, var1_double);
                      var12 = (float)Math.pow((double)var12, var1_double);
                      var20 = (int)(256.0f * var10);
                      var21 = (int)(var11 * 256.0f);
                      var22 = (int)(256.0f * var12);
                      var23 = var22 + (var21 << 8) + (-16777216 - -(var20 << 16));
                      int incrementValue$1 = var3;
                      var3++;
                      mpb.field_h[incrementValue$1] = var23;
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "psa.C(" + 127 + ')');
        }
    }

    public static void a(int param0) {
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = (dja) (Object) new mbb();
    }
}
