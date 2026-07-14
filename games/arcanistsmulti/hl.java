/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends pg {
    int field_g;
    static String field_i;
    static String field_h;
    static kc field_m;
    int field_k;
    static int[] field_l;
    wk field_j;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
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
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        L0: {
          var22 = ArcanistsMulti.field_G ? 1 : 0;
          var5 = param4 * param4;
          var6 = param0 - param4;
          var7 = param4 + param0;
          var8 = -param4 + param1;
          var9 = param1 + param4;
          if (var8 < de.field_i) {
            var8 = de.field_i;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (de.field_h >= var9) {
            break L1;
          } else {
            var9 = de.field_h;
            break L1;
          }
        }
        L2: {
          if (var6 < de.field_c) {
            var6 = de.field_c;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (var7 > de.field_k) {
            var7 = de.field_k;
            break L3;
          } else {
            break L3;
          }
        }
        var26 = de.field_l;
        var25 = var26;
        var24 = var25;
        var23 = var24;
        var10 = var23;
        if (param3 != 2232) {
          field_l = null;
          var15 = var6;
          if (var7 > var15) {
            var16 = var8;
            L4: while (true) {
              if (var9 > var16) {
                var12 = var16 - param1;
                var13 = -param0 + var15;
                var14 = var13 * var13 + var12 * var12;
                if (var14 < var5) {
                  L5: {
                    if (var14 != 0) {
                      break L5;
                    } else {
                      var14 = 1;
                      break L5;
                    }
                  }
                  var11 = var16 + var15 * de.field_e;
                  var17 = 256 - -(param2 * var14 / var5) - param2;
                  var18 = var26[var11];
                  var19 = var18 >> 1768713072 & 255;
                  var20 = 255 & var18 >> 1771034792;
                  var21 = 255 & var18;
                  if (0 < var17) {
                    if (-257 != (var17 ^ -1)) {
                      L6: {
                        if (var17 <= var20) {
                          var20 = -(var17 * (var20 - var17) / (256 - var17)) + var17;
                          break L6;
                        } else {
                          var20 = var20 + (256 + -var17);
                          break L6;
                        }
                      }
                      L7: {
                        if (var17 <= var19) {
                          var19 = var17 - var17 * (var19 - var17) / (256 + -var17);
                          break L7;
                        } else {
                          var19 = var19 + (256 + -var17);
                          break L7;
                        }
                      }
                      if (var17 <= var21) {
                        var21 = var17 + -(var17 * (var21 + -var17) / (-var17 + 256));
                        var10[var11] = fj.b(fj.b(var19 << -1513388336, var20 << -480690840), var21);
                        var16++;
                        var16++;
                        var16++;
                        var15++;
                        return;
                      } else {
                        var21 = var21 + (256 - var17);
                        var10[var11] = fj.b(fj.b(var19 << -1513388336, var20 << -480690840), var21);
                        var16++;
                        var16++;
                        var16++;
                        var15++;
                        return;
                      }
                    } else {
                      var10[var11] = fj.b(fj.b(var19 << -1513388336, var20 << -480690840), var21);
                      var16++;
                      continue L4;
                    }
                  } else {
                    var20 = -var20 + 255;
                    var19 = 255 + -var19;
                    var21 = -var21 + 255;
                    var10[var11] = fj.b(fj.b(var19 << -1513388336, var20 << -480690840), var21);
                    var16++;
                    var16++;
                    var16++;
                    var15++;
                    return;
                  }
                } else {
                  var16++;
                  var16++;
                  var16++;
                  var16++;
                  var15++;
                  return;
                }
              } else {
                var15++;
                return;
              }
            }
          } else {
            return;
          }
        } else {
          var15 = var6;
          L8: while (true) {
            if (var7 <= var15) {
              return;
            } else {
              var16 = var8;
              L9: while (true) {
                if (var9 <= var16) {
                  var15++;
                  continue L8;
                } else {
                  var12 = var16 - param1;
                  var13 = -param0 + var15;
                  var14 = var13 * var13 + var12 * var12;
                  if (var14 < var5) {
                    L10: {
                      if (var14 != 0) {
                        break L10;
                      } else {
                        var14 = 1;
                        break L10;
                      }
                    }
                    L11: {
                      var11 = var16 + var15 * de.field_e;
                      var17 = 256 - -(param2 * var14 / var5) - param2;
                      var18 = var26[var11];
                      var19 = var18 >> 1768713072 & 255;
                      var20 = 255 & var18 >> 1771034792;
                      var21 = 255 & var18;
                      if (0 < var17) {
                        if (-257 != (var17 ^ -1)) {
                          L12: {
                            if (var17 <= var20) {
                              var20 = -(var17 * (var20 - var17) / (256 - var17)) + var17;
                              break L12;
                            } else {
                              var20 = var20 + (256 + -var17);
                              break L12;
                            }
                          }
                          L13: {
                            if (var17 <= var19) {
                              var19 = var17 - var17 * (var19 - var17) / (256 + -var17);
                              break L13;
                            } else {
                              var19 = var19 + (256 + -var17);
                              break L13;
                            }
                          }
                          if (var17 > var21) {
                            var21 = var21 + (256 - var17);
                            break L11;
                          } else {
                            var21 = var17 + -(var17 * (var21 + -var17) / (-var17 + 256));
                            break L11;
                          }
                        } else {
                          var10[var11] = fj.b(fj.b(var19 << -1513388336, var20 << -480690840), var21);
                          var16++;
                          continue L9;
                        }
                      } else {
                        var20 = -var20 + 255;
                        var19 = 255 + -var19;
                        var21 = -var21 + 255;
                        break L11;
                      }
                    }
                    var10[var11] = fj.b(fj.b(var19 << -1513388336, var20 << -480690840), var21);
                    var16++;
                    continue L9;
                  } else {
                    var16++;
                    continue L9;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -1513388336) {
          field_m = null;
          field_m = null;
          field_h = null;
          field_l = null;
          field_i = null;
          return;
        } else {
          field_m = null;
          field_h = null;
          field_l = null;
          field_i = null;
          return;
        }
    }

    hl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "  You have the option of selecting Team Games when you select 'Create an Unrated Game' or when you set up the options for a Rated game. When this option is selected, any game with either 4 or 6 players will be divided into two seperate teams, the <u><col=aa0000>Reds</col></u> and the <u><col=0000ff>Blues</col></u>.";
        field_h = "Withdraw request to join <%0>'s game";
    }
}
