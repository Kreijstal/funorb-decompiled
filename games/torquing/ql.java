/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends am {
    static ed field_u;
    static qd field_s;
    static boolean field_t;

    public static void b(int param0) {
        field_s = null;
        if (param0 != 16711935) {
            return;
        }
        field_u = null;
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var31 = null;
        int[][] var41 = null;
        int[][] var51 = null;
        int[][] var52 = null;
        int[][] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int[] var60 = null;
        L0: {
          var19 = Torquing.field_u;
          var51 = ((ql) this).field_r.a(15142, param1);
          var41 = var51;
          var31 = var41;
          var21 = var31;
          var20 = var21;
          var3 = var20;
          if (!((ql) this).field_r.field_b) {
            break L0;
          } else {
            var54 = ((ql) this).b(0, 2, param1);
            var52 = ((ql) this).c(24066, param1, 0);
            var53 = ((ql) this).c(24066, param1, 1);
            var7 = var51[0];
            var8 = var51[1];
            var9 = var51[2];
            var55 = var52[0];
            var58 = var52[1];
            var59 = var52[2];
            var56 = var53[0];
            var57 = var53[1];
            var60 = var53[2];
            var16 = 0;
            L1: while (true) {
              if (ci.field_c <= var16) {
                break L0;
              } else {
                var17 = var54[var16];
                if ((var17 ^ -1) == -4097) {
                  var7[var16] = var55[var16];
                  var8[var16] = var58[var16];
                  var9[var16] = var59[var16];
                  var16++;
                  continue L1;
                } else {
                  if (0 == var17) {
                    var7[var16] = var56[var16];
                    var8[var16] = var57[var16];
                    var9[var16] = var60[var16];
                    var16++;
                    continue L1;
                  } else {
                    var18 = -var17 + 4096;
                    var7[var16] = var17 * var55[var16] + var18 * var56[var16] >> 824710124;
                    var8[var16] = var18 * var57[var16] + var58[var16] * var17 >> 2012907180;
                    var9[var16] = var17 * var59[var16] + var60[var16] * var18 >> -1125359892;
                    var16++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        L2: {
          if (param0 == -29116) {
            break L2;
          } else {
            field_u = null;
            break L2;
          }
        }
        return var3;
    }

    final void a(fj param0, int param1, int param2) {
        if (!((param2 ^ -1) != -1)) {
            ((ql) this).field_p = -2 == (param0.i((byte) -101) ^ -1) ? true : false;
        }
        if (param1 != 35) {
            field_u = null;
        }
    }

    final static void a(int param0, uh param1, uh param2) {
        tb.field_l = param2;
        if (param0 != -1618866100) {
            field_u = null;
        }
        tb.field_l.b((lf) (Object) Torquing.field_v);
        ti.field_e = param1;
    }

    final static void a(int param0, int param1, t param2, int param3, int param4, byte param5) {
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
          var20 = Torquing.field_u;
          var6 = (param0 - param4 << -101308696) / param2.field_w;
          var7 = (param4 << 578178792) + var6 * param2.field_v;
          param3 = param3 + param2.field_r;
          param1 = param1 + param2.field_v;
          var8 = param3 * ph.field_j + param1;
          var9 = 0;
          var10 = param2.field_t;
          var11 = param2.field_s;
          var12 = -var11 + ph.field_j;
          var13 = 0;
          if (ph.field_c > param3) {
            var14 = -param3 + ph.field_c;
            var10 = var10 - var14;
            var8 = var8 + var14 * ph.field_j;
            var9 = var9 + var14 * var11;
            param3 = ph.field_c;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param3 - -var10 <= ph.field_h) {
            break L1;
          } else {
            var10 = var10 - (var10 + param3 - ph.field_h);
            break L1;
          }
        }
        L2: {
          if (param1 >= ph.field_k) {
            break L2;
          } else {
            var14 = ph.field_k - param1;
            var11 = var11 - var14;
            var13 = var13 + var14;
            param1 = ph.field_k;
            var9 = var9 + var14;
            var7 = var7 + var6 * var14;
            var12 = var12 + var14;
            var8 = var8 + var14;
            break L2;
          }
        }
        if (param5 < -43) {
          L3: {
            if (param1 + var11 <= ph.field_a) {
              break L3;
            } else {
              var14 = var11 + param1 + -ph.field_a;
              var12 = var12 + var14;
              var13 = var13 + var14;
              var11 = var11 - var14;
              break L3;
            }
          }
          L4: {
            if (var11 <= 0) {
              break L4;
            } else {
              if (0 >= var10) {
                break L4;
              } else {
                param3 = -var10;
                L5: while (true) {
                  if (0 <= param3) {
                    return;
                  } else {
                    var14 = var7;
                    param1 = -var11;
                    L6: while (true) {
                      if (0 <= param1) {
                        var9 = var9 + var13;
                        var8 = var8 + var12;
                        param3++;
                        continue L5;
                      } else {
                        var15 = var14 >> -1668928952;
                        var14 = var14 + var6;
                        var16 = -var15 + 256;
                        if (0 <= var15) {
                          int incrementValue$1 = var9;
                          var9++;
                          var17 = param2.field_y[incrementValue$1];
                          if (var17 != 0) {
                            if (var15 <= 255) {
                              var18 = ph.field_e[var8];
                              var19 = 16711935 & var16 * (var18 & 16711935) + (var17 & 16711935) * var15 >> -1902863832;
                              ph.field_e[var8] = var19 - -(ie.a(var16 * ie.a(var18, 65280) - -(ie.a(65280, var17) * var15), 16711913) >> 2145960904);
                              var8++;
                              param1++;
                              continue L6;
                            } else {
                              ph.field_e[var8] = var17;
                              var8++;
                              param1++;
                              continue L6;
                            }
                          } else {
                            var8++;
                            param1++;
                            continue L6;
                          }
                        } else {
                          var8++;
                          var9++;
                          param1++;
                          continue L6;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public ql() {
        super(3, false);
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var9 = Torquing.field_u;
          var3 = ((ql) this).field_l.a(param1, 25657);
          if (param0 > 86) {
            break L0;
          } else {
            field_t = false;
            break L0;
          }
        }
        L1: {
          if (!((ql) this).field_l.field_b) {
            break L1;
          } else {
            var14 = ((ql) this).b(0, 0, param1);
            var15 = ((ql) this).b(0, 1, param1);
            var13 = ((ql) this).b(0, 2, param1);
            var7 = 0;
            L2: while (true) {
              if (var7 >= ci.field_c) {
                break L1;
              } else {
                var8 = var13[var7];
                if (var8 != 4096) {
                  if (var8 != 0) {
                    var3[var7] = var14[var7] * var8 + (4096 - var8) * var15[var7] >> -1618866100;
                    var7++;
                    continue L2;
                  } else {
                    var3[var7] = var15[var7];
                    var7++;
                    continue L2;
                  }
                } else {
                  var3[var7] = var14[var7];
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new ed();
        field_s = new qd();
    }
}
