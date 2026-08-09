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
        f[][] stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        f[][] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        bb var10 = null;
        int var11 = 0;
        f[][] var12 = null;
        int var13 = 0;
        f[][] var14 = null;
        var11 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param1 == -27919) {
                break L1;
              } else {
                field_j = (String) null;
                break L1;
              }
            }
            var12 = new f[param5][param0];
            var14 = var12;
            var6 = var14;
            var7 = 0;
            L2: while (true) {
              if (param0 <= var7) {
                var7 = 1;
                L3: while (true) {
                  if (-1 + param5 <= var7) {
                    var7 = 0;
                    L4: while (true) {
                      if (var7 >= param0) {
                        var7 = 0;
                        L5: while (true) {
                          if (var7 >= param3.length) {
                            no.a(0, -8383, 0, var14);
                            stackIn_42_0 = (f[][]) (var6);
                            break L0;
                          } else {
                            var13 = 0;
                            var8 = var13;
                            L6: while (true) {
                              if (var13 >= param3[0].length()) {
                                var7++;
                                continue L5;
                              } else {
                                L7: {
                                  L8: {
                                    var9 = param3[var7].charAt(var13);
                                    if (-65 == (var9 ^ -1)) {
                                      break L8;
                                    } else {
                                      if (42 == var9) {
                                        break L8;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var10 = new bb(bm.field_g);
                                  var10.field_p = 2;
                                  var6[-param3.length + param2 - -var7][param4 + var13] = (f) ((Object) var10);
                                  break L7;
                                }
                                L9: {
                                  if (var9 != 42) {
                                    break L9;
                                  } else {
                                    var6[param2 - param3.length + var7][var13 + param4] = (f) ((Object) new jo(bm.field_g, 0));
                                    break L9;
                                  }
                                }
                                L10: {
                                  if (var9 == 35) {
                                    var6[var7 + param2 - param3.length][var13 + param4] = (f) ((Object) new pj(0, 0, bm.field_g));
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                L11: {
                                  if (var9 != 47) {
                                    break L11;
                                  } else {
                                    var6[param2 - param3.length - -var7][var13 + param4] = (f) ((Object) new pj(0, 1, bm.field_g));
                                    break L11;
                                  }
                                }
                                L12: {
                                  if (var9 == 76) {
                                    var6[var7 + (-param3.length + param2)][param4 + var13] = (f) ((Object) new pj(0, 2, bm.field_g));
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                L13: {
                                  if (var9 == 96) {
                                    var6[var7 + (-param3.length + param2)][param4 - -var13] = (f) ((Object) new pj(0, 3, bm.field_g));
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                L14: {
                                  if (39 == var9) {
                                    var6[var7 + -param3.length + param2][param4 + var13] = (f) ((Object) new pj(0, 4, bm.field_g));
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                var13++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        var6[param5 - 1][var7] = aj.field_s;
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var14[var7][0] = aj.field_s;
                    var8 = 1;
                    L15: while (true) {
                      if (var8 >= param0 - 1) {
                        var14[var7][-1 + param0] = aj.field_s;
                        var7++;
                        continue L3;
                      } else {
                        var14[var7][var8] = bm.field_g;
                        var8++;
                        continue L15;
                      }
                    }
                  }
                }
              } else {
                var12[0][var7] = aj.field_s;
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var6_ref = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var6_ref);

            stackIn_45_1 = new StringBuilder().append("dp.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L16;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L16;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_42_0;
    }

    dp() {
        this.field_k = false;
    }

    static {
        field_j = "Loading graphics";
        field_h = 0;
        field_i = "Go Back";
    }
}
