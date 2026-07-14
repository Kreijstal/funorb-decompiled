/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends jb {
    int field_f;
    boolean field_k;
    static String field_j;
    static int field_h;
    static String field_i;
    int[] field_g;

    public static void a(int param0) {
        field_j = null;
        int var1 = -70 % ((-87 - param0) / 39);
        field_i = null;
    }

    final static f[][] a(int param0, int param1, int param2, String[] param3, int param4, int param5) {
        f[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        bb var10 = null;
        int var11 = 0;
        f[][] var12 = null;
        int var13 = 0;
        f[][] var14 = null;
        L0: {
          var11 = CrazyCrystals.field_B;
          if (param1 == -27919) {
            break L0;
          } else {
            field_j = null;
            break L0;
          }
        }
        var12 = new f[param5][param0];
        var14 = var12;
        var6 = var14;
        var7 = 0;
        L1: while (true) {
          if (param0 <= var7) {
            var7 = 1;
            L2: while (true) {
              if (-1 + param5 <= var7) {
                var7 = 0;
                L3: while (true) {
                  if (var7 >= param0) {
                    var7 = 0;
                    L4: while (true) {
                      if (var7 >= param3.length) {
                        no.a(0, -8383, 0, var14);
                        return var6;
                      } else {
                        var13 = 0;
                        var8 = var13;
                        L5: while (true) {
                          if (var13 >= param3[0].length()) {
                            var7++;
                            continue L4;
                          } else {
                            L6: {
                              L7: {
                                var9 = param3[var7].charAt(var13);
                                if (var9 == 64) {
                                  break L7;
                                } else {
                                  if (42 == var9) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var10 = new bb(bm.field_g);
                              var10.field_p = 2;
                              var6[-param3.length + param2 - -var7][param4 + var13] = (f) (Object) var10;
                              break L6;
                            }
                            L8: {
                              if (var9 != 42) {
                                break L8;
                              } else {
                                var6[param2 - param3.length + var7][var13 + param4] = (f) (Object) new jo(bm.field_g, 0);
                                break L8;
                              }
                            }
                            L9: {
                              if (var9 == 35) {
                                var6[var7 + param2 - param3.length][var13 + param4] = (f) (Object) new pj(0, 0, bm.field_g);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            L10: {
                              if (var9 != 47) {
                                break L10;
                              } else {
                                var6[param2 - param3.length - -var7][var13 + param4] = (f) (Object) new pj(0, 1, bm.field_g);
                                break L10;
                              }
                            }
                            L11: {
                              if (var9 == 76) {
                                var6[var7 + (-param3.length + param2)][param4 + var13] = (f) (Object) new pj(0, 2, bm.field_g);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            L12: {
                              if (var9 == 96) {
                                var6[var7 + (-param3.length + param2)][param4 - -var13] = (f) (Object) new pj(0, 3, bm.field_g);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            if (39 == var9) {
                              var6[var7 + -param3.length + param2][param4 + var13] = (f) (Object) new pj(0, 4, bm.field_g);
                              var13++;
                              continue L5;
                            } else {
                              var13++;
                              continue L5;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var6[param5 - 1][var7] = aj.field_s;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var14[var7][0] = aj.field_s;
                var8 = 1;
                L13: while (true) {
                  if (var8 >= param0 - 1) {
                    var14[var7][-1 + param0] = aj.field_s;
                    var7++;
                    continue L2;
                  } else {
                    var14[var7][var8] = bm.field_g;
                    var8++;
                    continue L13;
                  }
                }
              }
            }
          } else {
            var12[0][var7] = aj.field_s;
            var7++;
            continue L1;
          }
        }
    }

    dp() {
        ((dp) this).field_k = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Loading graphics";
        field_h = 0;
        field_i = "Go Back";
    }
}
