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
        RuntimeException var5 = null;
        int var5_int = 0;
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
        RuntimeException decompiledCaughtException = null;
        var22 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param4 * param4;
              var6 = param0 - param4;
              var7 = param4 + param0;
              var8 = -param4 + param1;
              var9 = param1 + param4;
              if (var8 < de.field_i) {
                var8 = de.field_i;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (de.field_h >= var9) {
                break L2;
              } else {
                var9 = de.field_h;
                break L2;
              }
            }
            L3: {
              if (var6 < de.field_c) {
                var6 = de.field_c;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var7 > de.field_k) {
                var7 = de.field_k;
                break L4;
              } else {
                break L4;
              }
            }
            var26 = de.field_l;
            var25 = var26;
            var24 = var25;
            var23 = var24;
            var10 = var23;
            var15 = var6;
            L5: while (true) {
              if (var7 <= var15) {
                break L0;
              } else {
                var16 = var8;
                L6: while (true) {
                  if (var9 <= var16) {
                    var15++;
                    continue L5;
                  } else {
                    L7: {
                      var12 = var16 - param1;
                      var13 = -param0 + var15;
                      var14 = var13 * var13 + var12 * var12;
                      if (var14 < var5_int) {
                        L8: {
                          if (var14 != 0) {
                            break L8;
                          } else {
                            var14 = 1;
                            break L8;
                          }
                        }
                        L9: {
                          var11 = var16 + var15 * de.field_e;
                          var17 = 256 - -(param2 * var14 / var5_int) - param2;
                          var18 = var26[var11];
                          var19 = var18 >> 16 & 255;
                          var20 = 255 & var18 >> 8;
                          var21 = 255 & var18;
                          if (0 < var17) {
                            if (var17 != 256) {
                              L10: {
                                if (var17 <= var20) {
                                  var20 = -(var17 * (var20 - var17) / (256 - var17)) + var17;
                                  break L10;
                                } else {
                                  var20 = var20 + (256 + -var17);
                                  break L10;
                                }
                              }
                              L11: {
                                if (var17 <= var19) {
                                  var19 = var17 - var17 * (var19 - var17) / (256 + -var17);
                                  break L11;
                                } else {
                                  var19 = var19 + (256 + -var17);
                                  break L11;
                                }
                              }
                              if (var17 > var21) {
                                var21 = var21 + (256 - var17);
                                break L9;
                              } else {
                                var21 = var17 + -(var17 * (var21 + -var17) / (-var17 + 256));
                                break L9;
                              }
                            } else {
                              var10[var11] = fj.b(fj.b(var19 << 16, var20 << 8), var21);
                              var16++;
                              continue L6;
                            }
                          } else {
                            var20 = -var20 + 255;
                            var19 = 255 + -var19;
                            var21 = -var21 + 255;
                            break L9;
                          }
                        }
                        var10[var11] = fj.b(fj.b(var19 << 16, var20 << 8), var21);
                        var16++;
                        break L7;
                      } else {
                        var16++;
                        break L7;
                      }
                    }
                    var16++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var5, "hl.B(" + param0 + ',' + param1 + ',' + param2 + ',' + 2232 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_h = null;
        field_l = null;
        field_i = null;
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
