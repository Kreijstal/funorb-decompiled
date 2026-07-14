/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends ne {
    static String field_k;
    static boolean field_j;
    int field_l;
    ne field_o;
    static String field_m;
    static int field_i;
    ni field_n;

    final static int a(byte param0, int param1, int param2) {
        if (!(-1 != ce.field_p)) {
            return hc.field_b;
        }
        int var5 = 119 / ((-85 - param0) / 41);
        double var3 = (double)ce.field_p / 50.0;
        double var6 = (-Math.cos(3.141592653589793 * var3) + 1.0) / 2.0;
        return (int)(var6 * (double)(param2 + -param1)) + param1;
    }

    final static cn a(int param0, byte param1, int param2, int param3, int param4, cn param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        cn var15 = null;
        cn var16 = null;
        cn var17 = null;
        cn var18 = null;
        cn var19 = null;
        cn var20 = null;
        L0: {
          var14 = DungeonAssault.field_K;
          var6 = 0;
          var7 = 0;
          if (-1 < (param3 ^ -1)) {
            var6 = var6 - param3;
            param4 = param4 + param3;
            param3 = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 >= 0) {
            break L1;
          } else {
            param2 = param2 + param0;
            var7 = var7 - param0;
            param0 = 0;
            break L1;
          }
        }
        L2: {
          if (gf.field_i >= param4 + param3) {
            break L2;
          } else {
            param4 = gf.field_i + -param3;
            break L2;
          }
        }
        L3: {
          if (param0 - -param2 <= gf.field_c) {
            break L3;
          } else {
            param2 = -param0 + gf.field_c;
            break L3;
          }
        }
        if (param4 >= 0) {
          if (0 <= param2) {
            if (param1 > 92) {
              if (param5 != null) {
                if (param5.field_y >= param4) {
                  if (param5.field_v >= param2) {
                    var8 = -param4 + gf.field_i;
                    var9 = -param4 + param5.field_y;
                    var10 = param3 + gf.field_i * param0;
                    var11 = -1;
                    var12 = -param2;
                    L4: while (true) {
                      if (-1 >= (var12 ^ -1)) {
                        param5.field_w = var6;
                        param5.field_A = var7;
                        return param5;
                      } else {
                        var13 = -param4;
                        L5: while (true) {
                          if (0 <= var13) {
                            var11 = var11 + var9;
                            var10 = var10 + var8;
                            var12++;
                            continue L4;
                          } else {
                            var11++;
                            param5.field_B[var11] = gf.field_b[var10];
                            var13++;
                            var10++;
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
                    var20 = new cn(param4, param2);
                    param5 = var20;
                    var8 = -param4 + gf.field_i;
                    var9 = -param4 + var20.field_y;
                    var10 = param3 + gf.field_i * param0;
                    var11 = -1;
                    var12 = -param2;
                    L6: while (true) {
                      if (-1 >= (var12 ^ -1)) {
                        var20.field_w = var6;
                        var20.field_A = var7;
                        return var20;
                      } else {
                        var13 = -param4;
                        L7: while (true) {
                          if (0 <= var13) {
                            var11 = var11 + var9;
                            var10 = var10 + var8;
                            var12++;
                            continue L6;
                          } else {
                            var11++;
                            var20.field_B[var11] = gf.field_b[var10];
                            var13++;
                            var10++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var19 = new cn(param4, param2);
                  var8 = -param4 + gf.field_i;
                  var9 = -param4 + var19.field_y;
                  var10 = param3 + gf.field_i * param0;
                  var11 = -1;
                  var12 = -param2;
                  L8: while (true) {
                    if (-1 >= (var12 ^ -1)) {
                      var19.field_w = var6;
                      var19.field_A = var7;
                      return var19;
                    } else {
                      var13 = -param4;
                      L9: while (true) {
                        if (0 <= var13) {
                          var11 = var11 + var9;
                          var10 = var10 + var8;
                          var12++;
                          continue L8;
                        } else {
                          var11++;
                          var19.field_B[var11] = gf.field_b[var10];
                          var13++;
                          var10++;
                          continue L9;
                        }
                      }
                    }
                  }
                }
              } else {
                var18 = new cn(param4, param2);
                var8 = -param4 + gf.field_i;
                var9 = -param4 + var18.field_y;
                var10 = param3 + gf.field_i * param0;
                var11 = -1;
                var12 = -param2;
                L10: while (true) {
                  if (-1 >= (var12 ^ -1)) {
                    var18.field_w = var6;
                    var18.field_A = var7;
                    return var18;
                  } else {
                    var13 = -param4;
                    L11: while (true) {
                      if (0 <= var13) {
                        var11 = var11 + var9;
                        var10 = var10 + var8;
                        var12++;
                        continue L10;
                      } else {
                        var11++;
                        var18.field_B[var11] = gf.field_b[var10];
                        var13++;
                        var10++;
                        continue L11;
                      }
                    }
                  }
                }
              }
            } else {
              field_j = false;
              if (param5 != null) {
                if (param5.field_y >= param4) {
                  if (param5.field_v >= param2) {
                    var8 = -param4 + gf.field_i;
                    var9 = -param4 + param5.field_y;
                    var10 = param3 + gf.field_i * param0;
                    var11 = -1;
                    var12 = -param2;
                    L12: while (true) {
                      if (-1 >= (var12 ^ -1)) {
                        param5.field_w = var6;
                        param5.field_A = var7;
                        return param5;
                      } else {
                        var13 = -param4;
                        L13: while (true) {
                          if (0 <= var13) {
                            var11 = var11 + var9;
                            var10 = var10 + var8;
                            var12++;
                            continue L12;
                          } else {
                            var11++;
                            param5.field_B[var11] = gf.field_b[var10];
                            var13++;
                            var10++;
                            continue L13;
                          }
                        }
                      }
                    }
                  } else {
                    var17 = new cn(param4, param2);
                    param5 = var17;
                    var8 = -param4 + gf.field_i;
                    var9 = -param4 + var17.field_y;
                    var10 = param3 + gf.field_i * param0;
                    var11 = -1;
                    var12 = -param2;
                    L14: while (true) {
                      if (-1 >= (var12 ^ -1)) {
                        var17.field_w = var6;
                        var17.field_A = var7;
                        return var17;
                      } else {
                        var13 = -param4;
                        L15: while (true) {
                          if (0 <= var13) {
                            var11 = var11 + var9;
                            var10 = var10 + var8;
                            var12++;
                            continue L14;
                          } else {
                            var11++;
                            var17.field_B[var11] = gf.field_b[var10];
                            var13++;
                            var10++;
                            continue L15;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var16 = new cn(param4, param2);
                  param5 = var16;
                  var8 = -param4 + gf.field_i;
                  var9 = -param4 + var16.field_y;
                  var10 = param3 + gf.field_i * param0;
                  var11 = -1;
                  var12 = -param2;
                  L16: while (true) {
                    if (-1 >= (var12 ^ -1)) {
                      var16.field_w = var6;
                      var16.field_A = var7;
                      return var16;
                    } else {
                      var13 = -param4;
                      L17: while (true) {
                        if (0 <= var13) {
                          var11 = var11 + var9;
                          var10 = var10 + var8;
                          var12++;
                          continue L16;
                        } else {
                          var11++;
                          var16.field_B[var11] = gf.field_b[var10];
                          var13++;
                          var10++;
                          continue L17;
                        }
                      }
                    }
                  }
                }
              } else {
                var15 = new cn(param4, param2);
                param5 = var15;
                var8 = -param4 + gf.field_i;
                var9 = -param4 + var15.field_y;
                var10 = param3 + gf.field_i * param0;
                var11 = -1;
                var12 = -param2;
                L18: while (true) {
                  if (-1 >= (var12 ^ -1)) {
                    var15.field_w = var6;
                    var15.field_A = var7;
                    return var15;
                  } else {
                    var13 = -param4;
                    L19: while (true) {
                      if (0 <= var13) {
                        var11 = var11 + var9;
                        var10 = var10 + var8;
                        var12++;
                        continue L18;
                      } else {
                        var11++;
                        var15.field_B[var11] = gf.field_b[var10];
                        var13++;
                        var10++;
                        continue L19;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_m = null;
        if (param0 != -28822) {
            int discarded$0 = fa.a((byte) -16, -26, 56);
        }
    }

    final void a(int param0, int param1) {
        int var3 = -119 / ((param1 - -68) / 41);
        ((fa) this).field_l = param0;
        ((fa) this).field_n.h(128 + oo.field_d * param0 >> 1439807272);
    }

    fa(ni param0, ne param1) {
        ((fa) this).field_n = param0;
        ((fa) this).field_l = param0.i();
        ((fa) this).field_o = param1;
        ((fa) this).field_n.h(oo.field_d * ((fa) this).field_l - -128 >> 698583976);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Achieved";
        field_k = "A vast pit occupies almost all of this room, except for a narrow ledge. There is no way to gauge its depth. A raider who falls here will continue falling for some time.<br><br>This trap will kill defeated raiders, even if they have abilities that would normally prevent death.";
    }
}
