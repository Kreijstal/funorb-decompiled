/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    int field_a;
    static String[] field_e;
    int field_d;
    static int[] field_c;
    static int field_f;
    int[] field_g;
    static int field_b;

    final static jp a(mf param0, int param1, int param2, int param3) {
        if (!ln.a(-100, param2, param0, param1)) {
            return null;
        }
        if (param3 != 1) {
            return null;
        }
        return ta.b(param3 ^ 13875);
    }

    final static void a(int param0, int param1) {
        pi var2 = k.field_h;
        var2.e(-13413, param0);
        var2.a(-21, 1);
        if (param1 != -1) {
            field_f = 16;
        }
        var2.a(-111, 0);
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (null != ((ml) this).field_g) {
            // if_icmpeq L27
        } else {
            return 0;
        }
        if (param0 != -95) {
            ((ml) this).field_a = -53;
        }
        for (var3 = 1; ((ml) this).field_g.length > var3; var3++) {
            if (((ml) this).field_g[-1 + var3] + ((ml) this).field_g[var3] >> 821112545 > param1) {
                return -1 + var3;
            }
        }
        return ((ml) this).field_g.length - 1;
    }

    final int b(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0;
        int stackOut_5_0;
        if (param0 == 56) {
          L0: {
            L1: {
              if (((ml) this).field_g == null) {
                break L1;
              } else {
                if (0 != ((ml) this).field_g.length) {
                  stackOut_6_0 = ((ml) this).field_g[-1 + ((ml) this).field_g.length];
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return 69;
        }
    }

    final static void a(int param0, tp param1, byte param2, int param3, int param4, int param5) {
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
        L0: {
          var20 = BrickABrac.field_J ? 1 : 0;
          var6 = (-param5 + param0 << 1898506056) / param1.field_f;
          param4 = param4 + param1.field_b;
          param3 = param3 + param1.field_g;
          var7 = var6 * param1.field_b + (param5 << -1876976696);
          if (param2 > 80) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        L1: {
          var8 = param3 * lb.field_c + param4;
          var9 = 0;
          var10 = param1.field_a;
          var11 = param1.field_d;
          var12 = lb.field_c + -var11;
          var13 = 0;
          if (param3 < lb.field_b) {
            var14 = -param3 + lb.field_b;
            var9 = var9 + var11 * var14;
            var10 = var10 - var14;
            param3 = lb.field_b;
            var8 = var8 + lb.field_c * var14;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param4 >= lb.field_i) {
            break L2;
          } else {
            var14 = -param4 + lb.field_i;
            param4 = lb.field_i;
            var9 = var9 + var14;
            var13 = var13 + var14;
            var11 = var11 - var14;
            var12 = var12 + var14;
            var7 = var7 + var14 * var6;
            var8 = var8 + var14;
            break L2;
          }
        }
        L3: {
          if (var10 + param3 > lb.field_j) {
            var10 = var10 - (param3 - (-var10 + lb.field_j));
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (lb.field_f < param4 + var11) {
            var14 = param4 + (var11 - lb.field_f);
            var12 = var12 + var14;
            var11 = var11 - var14;
            var13 = var13 + var14;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (-1 <= var11) {
            break L5;
          } else {
            if (-1 < var10) {
              param3 = -var10;
              L6: while (true) {
                if (param3 >= 0) {
                  return;
                } else {
                  var14 = var7;
                  param4 = -var11;
                  L7: while (true) {
                    if (0 <= param4) {
                      var8 = var8 + var12;
                      var9 = var9 + var13;
                      param3++;
                      continue L6;
                    } else {
                      var15 = var14 >> 1032855336;
                      var14 = var14 + var6;
                      var16 = 256 - var15;
                      if (var15 >= 0) {
                        var9++;
                        var17 = param1.field_j[255 & param1.field_i[var9]];
                        if (-1 != (var17 ^ -1)) {
                          if ((var15 ^ -1) < -256) {
                            lb.field_l[var8] = var17;
                            var8++;
                            param4++;
                            continue L7;
                          } else {
                            var18 = lb.field_l[var8];
                            var19 = (16711935 & var18) * var16 - -((var17 & 16711935) * var15) >> 1493300968 & 16711935;
                            lb.field_l[var8] = ik.a(65280, var16 * ik.a(var18, 65280) - -(var15 * ik.a(65280, var17)) >> 1002640136) + var19;
                            var8++;
                            param4++;
                            continue L7;
                          }
                        } else {
                          var8++;
                          param4++;
                          continue L7;
                        }
                      } else {
                        var9++;
                        var8++;
                        param4++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            } else {
              break L5;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        if (param0 != 111) {
            Object var2 = null;
            ml.a(26, (tp) null, (byte) 26, -9, 66, -42);
        }
    }

    ml(int param0, int param1, int param2) {
        ((ml) this).field_a = param1;
        ((ml) this).field_g = new int[param2 + 1];
        ((ml) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
