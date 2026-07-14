/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class psa extends rqa {
    static dja field_o;

    psa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            field_o = null;
        }
        si.a(34, 62, param0[0].a(94));
        return new nc((Object) (Object) "void");
    }

    final static void e(int param0) {
        double var1 = 0.0;
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
        var24 = VoidHunters.field_G;
        if (null != mpb.field_h) {
          return;
        } else {
          mpb.field_h = new int[65536];
          var1 = 0.7 + (-0.015 + 0.03 * Math.random());
          var3 = 0;
          var4 = -119 % ((-10 - param0) / 52);
          var5 = 0;
          L0: while (true) {
            if (var5 >= 512) {
              return;
            } else {
              var6 = 360.0f * ((float)(var5 >> 808122595) / 64.0f + 0.0078125f);
              var7 = 0.0625f + (float)(var5 & 7) / 8.0f;
              var8 = 0;
              L1: while (true) {
                if ((var8 ^ -1) <= -129) {
                  var5++;
                  continue L0;
                } else {
                  L2: {
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
                    if (-1 == var15) {
                      var11 = var19;
                      var10 = var9;
                      var12 = var17;
                      break L2;
                    } else {
                      if (-2 != var15) {
                        if (var15 == 2) {
                          var11 = var9;
                          var12 = var19;
                          var10 = var17;
                          break L2;
                        } else {
                          if (3 != var15) {
                            if (4 != var15) {
                              if ((var15 ^ -1) == -6) {
                                var11 = var17;
                                var10 = var9;
                                var12 = var18;
                                break L2;
                              } else {
                                break L2;
                              }
                            } else {
                              var12 = var9;
                              var11 = var17;
                              var10 = var19;
                              break L2;
                            }
                          } else {
                            var12 = var9;
                            var10 = var17;
                            var11 = var18;
                            break L2;
                          }
                        }
                      } else {
                        var10 = var18;
                        var11 = var9;
                        var12 = var17;
                        break L2;
                      }
                    }
                  }
                  var10 = (float)Math.pow((double)var10, var1);
                  var11 = (float)Math.pow((double)var11, var1);
                  var12 = (float)Math.pow((double)var12, var1);
                  var20 = (int)(256.0f * var10);
                  var21 = (int)(var11 * 256.0f);
                  var22 = (int)(256.0f * var12);
                  var23 = var22 + (var21 << 1501463016) + (-16777216 - -(var20 << -1851724336));
                  var3++;
                  mpb.field_h[var3] = var23;
                  var8++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            psa.e(13);
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = (dja) (Object) new mbb();
    }
}
