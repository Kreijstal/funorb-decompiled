/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class za extends vg {
    static String field_f;
    static nh field_g;

    final static int a(int param0, byte param1, int param2, int param3) {
        if (param0 > param3) {
          return param0;
        } else {
          if (param2 >= param3) {
            if (param1 <= 35) {
              field_g = null;
              return param3;
            } else {
              return param3;
            }
          } else {
            return param2;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 <= 79) {
            return;
        }
        field_g = null;
        field_f = null;
    }

    final static int a(int param0) {
        if (param0 != 18998) {
            return 12;
        }
        return aa.field_c;
    }

    protected za() {
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
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
        L0: {
          var26 = TombRacer.field_G ? 1 : 0;
          var6 = 0;
          var7 = param1;
          var8 = param2 * param2;
          var9 = param1 * param1;
          var10 = var9 << 490551489;
          var11 = var8 << 1858798593;
          var12 = param1 << 25055169;
          var13 = var10 + (-var12 + 1) * var8;
          var14 = var9 + -(var11 * (-1 + var12));
          var15 = var8 << -1390571934;
          var16 = var9 << -732530014;
          var17 = 71 % ((39 - param4) / 61);
          var18 = (3 + (var6 << -504119039)) * var10;
          var19 = ((var7 << -343032287) + -3) * var11;
          var20 = (1 + var6) * var16;
          var21 = var15 * (var7 - 1);
          if (gca.field_d > param5) {
            break L0;
          } else {
            if (hc.field_h >= param5) {
              var22 = rp.a(ss.field_c, -16226, pka.field_b, param0 - -param2);
              var23 = rp.a(ss.field_c, -16226, pka.field_b, param0 - param2);
              nra.a((byte) -55, param3, var22, vaa.field_a[param5], var23);
              break L0;
            } else {
              L1: while (true) {
                if (-1 > (var7 ^ -1)) {
                  L2: {
                    if (0 <= var13) {
                      break L2;
                    } else {
                      L3: while (true) {
                        if ((var13 ^ -1) <= -1) {
                          break L2;
                        } else {
                          var14 = var14 + var20;
                          var13 = var13 + var18;
                          var6++;
                          var20 = var20 + var16;
                          var18 = var18 + var16;
                          continue L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (-1 < (var14 ^ -1)) {
                      var14 = var14 + var20;
                      var13 = var13 + var18;
                      var6++;
                      var18 = var18 + var16;
                      var20 = var20 + var16;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var14 = var14 + -var19;
                  var13 = var13 + -var21;
                  var19 = var19 - var15;
                  var7--;
                  var21 = var21 - var15;
                  var22 = param5 + -var7;
                  var23 = var7 + param5;
                  if (var23 < gca.field_d) {
                    continue L1;
                  } else {
                    if (hc.field_h >= var22) {
                      L5: {
                        var24 = rp.a(ss.field_c, -16226, pka.field_b, param0 + var6);
                        var25 = rp.a(ss.field_c, -16226, pka.field_b, -var6 + param0);
                        if (var22 < gca.field_d) {
                          break L5;
                        } else {
                          nra.a((byte) -55, param3, var24, vaa.field_a[var22], var25);
                          break L5;
                        }
                      }
                      if (var23 <= hc.field_h) {
                        nra.a((byte) -55, param3, var24, vaa.field_a[var23], var25);
                        continue L1;
                      } else {
                        continue L1;
                      }
                    } else {
                      continue L1;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
        L6: while (true) {
          if (-1 > (var7 ^ -1)) {
            L7: {
              if (0 <= var13) {
                break L7;
              } else {
                L8: while (true) {
                  if ((var13 ^ -1) <= -1) {
                    break L7;
                  } else {
                    var14 = var14 + var20;
                    var13 = var13 + var18;
                    var6++;
                    var20 = var20 + var16;
                    var18 = var18 + var16;
                    continue L8;
                  }
                }
              }
            }
            L9: {
              if (-1 < (var14 ^ -1)) {
                var14 = var14 + var20;
                var13 = var13 + var18;
                var6++;
                var18 = var18 + var16;
                var20 = var20 + var16;
                break L9;
              } else {
                break L9;
              }
            }
            var14 = var14 + -var19;
            var13 = var13 + -var21;
            var19 = var19 - var15;
            var7--;
            var21 = var21 - var15;
            var22 = param5 + -var7;
            var23 = var7 + param5;
            if (var23 < gca.field_d) {
              continue L6;
            } else {
              if (hc.field_h >= var22) {
                L10: {
                  var24 = rp.a(ss.field_c, -16226, pka.field_b, param0 + var6);
                  var25 = rp.a(ss.field_c, -16226, pka.field_b, -var6 + param0);
                  if (var22 < gca.field_d) {
                    break L10;
                  } else {
                    nra.a((byte) -55, param3, var24, vaa.field_a[var22], var25);
                    break L10;
                  }
                }
                if (var23 <= hc.field_h) {
                  nra.a((byte) -55, param3, var24, vaa.field_a[var23], var25);
                  continue L6;
                } else {
                  continue L6;
                }
              } else {
                continue L6;
              }
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Player names can be up to 12 letters, numbers and underscores";
    }
}
