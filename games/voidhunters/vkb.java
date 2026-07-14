/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vkb extends rqa {
    final static int a(int param0, int param1) {
        if (param0 < 8) {
            return -114;
        }
        int var2 = 0;
        if (!(-65536 <= (param1 ^ -1))) {
            param1 = param1 >>> 16;
            var2 = var2 | 16;
        }
        if (!((param1 ^ -1) >= -256)) {
            param1 = param1 >>> 8;
            var2 = var2 | 8;
        }
        if ((param1 ^ -1) < -16) {
            var2 = var2 | 4;
            param1 = param1 >>> 4;
        }
        if ((param1 ^ -1) < -4) {
            var2 = var2 | 2;
            param1 = param1 >>> 2;
        }
        if ((param1 ^ -1) < -2) {
            param1 = param1 >>> 1;
            var2 = var2 | 1;
        }
        return var2;
    }

    vkb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            Object var4 = null;
            nc discarded$0 = ((vkb) this).a((nc[]) null, -72);
        }
        tcb.field_q = param0[0].a(41);
        return new nc((Object) (Object) "void");
    }

    final static void a(int param0) {
        double var1 = 0.0;
        int var3 = 0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        double var16_double = 0.0;
        int var17 = 0;
        int var18 = 0;
        double var18_double = 0.0;
        int var19 = 0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var26 = 0;
        var26 = VoidHunters.field_G;
        if (klb.field_o == null) {
          L0: {
            klb.field_o = new int[65536];
            if (param0 == -10693) {
              break L0;
            } else {
              int discarded$1 = vkb.a(43, 19);
              break L0;
            }
          }
          var1 = 0.7 + (-0.015 + 0.03 * Math.random());
          var3 = 0;
          L1: while (true) {
            if ((var3 ^ -1) <= -65537) {
              return;
            } else {
              L2: {
                var4 = 0.0078125 + (double)((64562 & var3) >> -1507633526) / 64.0;
                var6 = 0.0625 + (double)(7 & var3 >> -1801669273) / 8.0;
                var8 = (double)(var3 & 127) / 128.0;
                var10 = var8;
                var12 = var8;
                var14 = var8;
                if (var6 == 0.0) {
                  break L2;
                } else {
                  L3: {
                    if (0.5 > var8) {
                      var16_double = var8 * (1.0 + var6);
                      break L3;
                    } else {
                      var16_double = var8 + var6 - var8 * var6;
                      break L3;
                    }
                  }
                  L4: {
                    var18_double = 2.0 * var8 - var16_double;
                    var20 = 0.3333333333333333 + var4;
                    if (1.0 < var20) {
                      var20 = var20 - 1.0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    var22 = var4;
                    var24 = var4 - 0.3333333333333333;
                    if (6.0 * var22 < 1.0) {
                      var12 = var22 * (6.0 * (-var18_double + var16_double)) + var18_double;
                      break L5;
                    } else {
                      if (var22 * 2.0 >= 1.0) {
                        if (2.0 > 3.0 * var22) {
                          var12 = (var16_double - var18_double) * (-var22 + 0.6666666666666666) * 6.0 + var18_double;
                          break L5;
                        } else {
                          var12 = var18_double;
                          break L5;
                        }
                      } else {
                        var12 = var16_double;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (1.0 <= 6.0 * var20) {
                      if (2.0 * var20 >= 1.0) {
                        if (2.0 <= 3.0 * var20) {
                          var10 = var18_double;
                          break L6;
                        } else {
                          var10 = 6.0 * ((-var18_double + var16_double) * (-var20 + 0.6666666666666666)) + var18_double;
                          break L6;
                        }
                      } else {
                        var10 = var16_double;
                        break L6;
                      }
                    } else {
                      var10 = 6.0 * (-var18_double + var16_double) * var20 + var18_double;
                      break L6;
                    }
                  }
                  L7: {
                    if (var24 < 0.0) {
                      var24 = var24 + 1.0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if (1.0 <= var24 * 6.0) {
                    if (1.0 > var24 * 2.0) {
                      var14 = var16_double;
                      break L2;
                    } else {
                      if (2.0 <= var24 * 3.0) {
                        var14 = var18_double;
                        break L2;
                      } else {
                        var14 = 6.0 * ((-var24 + 0.6666666666666666) * (var16_double - var18_double)) + var18_double;
                        break L2;
                      }
                    }
                  } else {
                    var14 = var18_double + 6.0 * (var16_double - var18_double) * var24;
                    break L2;
                  }
                }
              }
              var10 = Math.pow(var10, var1);
              var12 = Math.pow(var12, var1);
              var14 = Math.pow(var14, var1);
              var16 = (int)(256.0 * var10);
              var17 = (int)(var12 * 256.0);
              var18 = (int)(var14 * 256.0);
              var19 = (var17 << -1949237720) + ((var16 << 614856784) - -var18);
              klb.field_o[var3] = var19;
              var3++;
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    static {
    }
}
