/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class us implements ir {
    private int field_d;
    private hc field_g;
    private int field_b;
    private int field_f;
    private int field_a;
    private int field_e;
    private int field_c;

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        pf var12 = null;
        ea stackIn_4_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        ea stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof pf)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (ea) (Object) stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = (ea) param3;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (pf) (Object) stackIn_4_0;
              vp.b(param2 + param3.field_p, param3.field_h + param4, param3.field_q, param3.field_n, ((us) this).field_f);
              if (var12 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            var7 = -(var12.field_B * 2) + param3.field_q;
            if (param1 == -7592) {
              var8 = var12.field_B + param2 + param3.field_p;
              var9 = var12.field_x + param3.field_h + param4;
              vp.f(var8, var9, var8 + var7, var9, ((us) this).field_b);
              var10 = -1 + var12.c(true);
              L3: while (true) {
                if (var10 < 0) {
                  L4: {
                    if (null == ((us) this).field_g) {
                      break L4;
                    } else {
                      ((us) this).field_g.c(var12.field_f, var7 / 2 + var8, var12.field_x + var9 + ((us) this).field_g.field_w, ((us) this).field_e, ((us) this).field_a);
                      break L4;
                    }
                  }
                  break L0;
                } else {
                  vp.g(var7 * var12.a(false, var10) / var12.a(param1 ^ 7589) + var8, var9, ((us) this).field_c, ((us) this).field_d);
                  var10--;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("us.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param4 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        double var1_double = 0.0;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        RuntimeException decompiledCaughtException = null;
        var23 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (null != sa.field_h) {
              return;
            } else {
              sa.field_h = new int[65536];
              L1: {
                var1_double = -0.015 + 0.03 * Math.random() + 0.7;
                if (param0 == 2069944240) {
                  break L1;
                } else {
                  us.a(-104);
                  break L1;
                }
              }
              var3 = 0;
              var4 = 0;
              L2: while (true) {
                if (var4 >= 512) {
                  break L0;
                } else {
                  var5 = 360.0f * ((float)(var4 >> 3) / 64.0f + 0.0078125f);
                  var6 = (float)(7 & var4) / 8.0f + 0.0625f;
                  var7 = 0;
                  L3: while (true) {
                    if (var7 >= 128) {
                      var4++;
                      continue L2;
                    } else {
                      L4: {
                        var8 = (float)var7 / 128.0f;
                        var9 = 0.0f;
                        var10 = 0.0f;
                        var11 = 0.0f;
                        var12 = var5 / 60.0f;
                        var13 = (int)var12;
                        var14 = var13 % 6;
                        var15 = var12 - (float)var13;
                        var16 = (1.0f - var6) * var8;
                        var17 = (-(var6 * var15) + 1.0f) * var8;
                        var18 = (-(var6 * (1.0f - var15)) + 1.0f) * var8;
                        if (0 == var14) {
                          var10 = var18;
                          var11 = var16;
                          var9 = var8;
                          break L4;
                        } else {
                          if (var14 != 1) {
                            if (var14 != 2) {
                              if (var14 != 3) {
                                if (4 == var14) {
                                  var10 = var16;
                                  var11 = var8;
                                  var9 = var18;
                                  break L4;
                                } else {
                                  if (5 == var14) {
                                    var11 = var17;
                                    var9 = var8;
                                    var10 = var16;
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                              } else {
                                var10 = var17;
                                var11 = var8;
                                var9 = var16;
                                break L4;
                              }
                            } else {
                              var11 = var18;
                              var10 = var8;
                              var9 = var16;
                              break L4;
                            }
                          } else {
                            var9 = var17;
                            var10 = var8;
                            var11 = var16;
                            break L4;
                          }
                        }
                      }
                      var9 = (float)Math.pow((double)var9, var1_double);
                      var10 = (float)Math.pow((double)var10, var1_double);
                      var11 = (float)Math.pow((double)var11, var1_double);
                      var19 = (int)(var9 * 256.0f);
                      var20 = (int)(var10 * 256.0f);
                      var21 = (int)(var11 * 256.0f);
                      var22 = var21 + (var19 << 16) + (-16777216 + (var20 << 8));
                      int incrementValue$1 = var3;
                      var3++;
                      sa.field_h[incrementValue$1] = var22;
                      var7++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "us.A(" + param0 + ')');
        }
    }

    us(hc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((us) this).field_d = param6;
            ((us) this).field_c = param5;
            ((us) this).field_a = param2;
            ((us) this).field_f = param4;
            ((us) this).field_b = param3;
            ((us) this).field_e = param1;
            ((us) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "us.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
