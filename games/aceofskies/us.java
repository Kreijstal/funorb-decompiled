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
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        pf var12 = null;
        ea stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        ea stackOut_1_0 = null;
        L0: {
          var11 = AceOfSkies.field_G ? 1 : 0;
          if (!(param3 instanceof pf)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (ea) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (ea) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (pf) (pf) stackIn_3_0;
          vp.b(param2 + ((ea) param3).field_p, ((ea) param3).field_h + param4, ((ea) param3).field_q, ((ea) param3).field_n, ((us) this).field_f);
          if (var12 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        var7 = -(((pf) var12).field_B * 2) + ((ea) param3).field_q;
        if (param1 == -7592) {
          var8 = ((pf) var12).field_B + param2 + ((ea) param3).field_p;
          var9 = ((pf) var12).field_x + ((ea) param3).field_h + param4;
          vp.f(var8, var9, var8 + var7, var9, ((us) this).field_b);
          var10 = -1 + var12.c(true);
          L2: while (true) {
            if (-1 < (var10 ^ -1)) {
              L3: {
                if (null == ((us) this).field_g) {
                  break L3;
                } else {
                  ((us) this).field_g.c(((pf) var12).field_f, var7 / 2 + var8, ((pf) var12).field_x + var9 + ((us) this).field_g.field_w, ((us) this).field_e, ((us) this).field_a);
                  break L3;
                }
              }
              return;
            } else {
              vp.g(var7 * var12.a(false, var10) / var12.a(param1 ^ 7589) + var8, var9, ((us) this).field_c, ((us) this).field_d);
              var10--;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0) {
        double var1 = 0.0;
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
        var23 = AceOfSkies.field_G ? 1 : 0;
        if (null != sa.field_h) {
          return;
        } else {
          sa.field_h = new int[65536];
          L0: {
            var1 = -0.015 + 0.03 * Math.random() + 0.7;
            if (param0 == 2069944240) {
              break L0;
            } else {
              us.a(-104);
              break L0;
            }
          }
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (-513 >= (var4 ^ -1)) {
              return;
            } else {
              var5 = 360.0f * ((float)(var4 >> 1257270659) / 64.0f + 0.0078125f);
              var6 = (float)(7 & var4) / 8.0f + 0.0625f;
              var7 = 0;
              L2: while (true) {
                if ((var7 ^ -1) <= -129) {
                  var4++;
                  continue L1;
                } else {
                  L3: {
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
                      break L3;
                    } else {
                      if ((var14 ^ -1) != -2) {
                        if ((var14 ^ -1) != -3) {
                          if (var14 != 3) {
                            if (4 == var14) {
                              var10 = var16;
                              var11 = var8;
                              var9 = var18;
                              break L3;
                            } else {
                              if (5 == var14) {
                                var11 = var17;
                                var9 = var8;
                                var10 = var16;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                          } else {
                            var10 = var17;
                            var11 = var8;
                            var9 = var16;
                            break L3;
                          }
                        } else {
                          var11 = var18;
                          var10 = var8;
                          var9 = var16;
                          break L3;
                        }
                      } else {
                        var9 = var17;
                        var10 = var8;
                        var11 = var16;
                        break L3;
                      }
                    }
                  }
                  var9 = (float)Math.pow((double)var9, var1);
                  var10 = (float)Math.pow((double)var10, var1);
                  var11 = (float)Math.pow((double)var11, var1);
                  var19 = (int)(var9 * 256.0f);
                  var20 = (int)(var10 * 256.0f);
                  var21 = (int)(var11 * 256.0f);
                  var22 = var21 + (var19 << 2069944240) + (-16777216 + (var20 << 1411247432));
                  var3++;
                  sa.field_h[var3] = var22;
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    us(hc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((us) this).field_d = param6;
        ((us) this).field_c = param5;
        ((us) this).field_a = param2;
        ((us) this).field_f = param4;
        ((us) this).field_b = param3;
        ((us) this).field_e = param1;
        ((us) this).field_g = param0;
    }

    static {
    }
}
