/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    static boolean field_h;
    static boolean[][] field_d;
    static volatile int field_c;
    static ll field_j;
    static String field_g;
    static int[] field_i;
    static String field_a;
    static boolean field_f;
    static boolean field_e;
    static int field_b;

    final static boolean a(int param0, boolean param1, int[] param2, byte param3, int[] param4, int[] param5) {
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var15 = null;
        int[] var17 = null;
        int[] var19 = null;
        int[] var20 = null;
        var11 = SteelSentinels.field_G;
        var6_int = param0;
        if (var6_int == 34) {
          return false;
        } else {
          L0: {
            if (var6_int == 27) {
              break L0;
            } else {
              if ((var6_int ^ -1) == -34) {
                break L0;
              } else {
                if (var6_int == 32) {
                  break L0;
                } else {
                  if (var6_int == 24) {
                    return bj.a(param5, 84, param1, (byte) 125);
                  } else {
                    L1: {
                      var19 = n.field_z;
                      var17 = var19;
                      var15 = var17;
                      var13 = var15;
                      var12 = var13;
                      var6 = var12;
                      if (param3 == 84) {
                        break L1;
                      } else {
                        ad.a(-38);
                        break L1;
                      }
                    }
                    var7 = 0;
                    L2: while (true) {
                      if (var7 >= var19.length) {
                        return false;
                      } else {
                        L3: {
                          var8 = var19[var7];
                          if (t.a(param5, var8, -20370)) {
                            break L3;
                          } else {
                            if (bj.a(param5, var8, param1, (byte) 96)) {
                              break L3;
                            } else {
                              var7++;
                              continue L2;
                            }
                          }
                        }
                        var20 = nl.a(var8, (byte) 123);
                        var10 = var20.length - 8;
                        L4: while (true) {
                          if (var10 < var20.length) {
                            if (param0 == var20[var10]) {
                              return true;
                            } else {
                              var10++;
                              continue L4;
                            }
                          } else {
                            var7++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return bj.a(param5, 62, param1, (byte) 115);
        }
    }

    final static void a(int param0, int param1) {
        kj var2 = mm.field_g;
        var2.a(param1, (byte) -117);
        var2.field_p = var2.field_p + 1;
        int var3 = var2.field_p;
        var2.a((byte) 126, 5);
        var2.a((byte) 114, nf.field_b.field_Ub);
        int var4 = nf.field_b.field_Nc + (nf.field_b.field_sc << 1866473254);
        var2.a((byte) 127, var4);
        var2.a(nf.field_b.field_Sb.length, (byte) -122, param0, nf.field_b.field_Sb);
        var2.b((byte) -113, var2.field_p - var3);
    }

    final static void a(boolean param0, byte param1) {
        if (qf.field_e != null) {
            if (qf.field_e.b(param0, (byte) -128)) {
                qf.field_e = null;
            }
        }
        if (param1 != -76) {
            field_b = -64;
        }
    }

    final static void a(int param0, nk param1, int param2) {
        int var3 = 0;
        int[] var3_ref_int__ = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int[] var5 = null;
        int var6_int = 0;
        wk var6 = null;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        L0: {
          var7 = SteelSentinels.field_G;
          if (-1 < (param0 ^ -1)) {
            break L0;
          } else {
            if (param0 < ue.field_c.length) {
              L1: {
                if (param1 != null) {
                  break L1;
                } else {
                  L2: {
                    if (0 > param0) {
                      break L2;
                    } else {
                      if (ue.field_c.length > param0) {
                        var20 = ue.field_c[param0];
                        var16 = var20;
                        var12 = var16;
                        var8 = var12;
                        var3_ref_int__ = var8;
                        if (var3_ref_int__ == null) {
                          ue.field_g[param0] = null;
                          return;
                        } else {
                          var22 = new int[8];
                          var18 = var22;
                          var14 = var18;
                          var10 = var14;
                          var4_ref_int__ = var10;
                          var21 = new int[-8 + var20.length];
                          var17 = var21;
                          var13 = var17;
                          var9 = var13;
                          var5 = var9;
                          ii.a(var3_ref_int__, 0, var5, 0, var21.length);
                          ii.a(var3_ref_int__, var21.length, var4_ref_int__, 0, var22.length);
                          param1 = ji.a(var21, (byte) 97, var22);
                          break L1;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  return;
                }
              }
              L3: {
                if (null != ue.field_g[param0]) {
                  ue.field_g[param0].d();
                  pb.a(0, 0, 62, 74, 0);
                  break L3;
                } else {
                  ue.field_g[param0] = new wk(62, 74);
                  ue.field_g[param0].d();
                  break L3;
                }
              }
              L4: {
                var3 = hj.field_w;
                if (param2 > 23) {
                  break L4;
                } else {
                  ad.a(true, (byte) -104);
                  break L4;
                }
              }
              L5: {
                if (param1.field_N == 0) {
                  hj.field_w = 1200;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (55 == param1.field_N) {
                  hj.field_w = 1200;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (-58 == (param1.field_N ^ -1)) {
                  hj.field_w = 1300;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (param1.field_N == -63) {
                  hj.field_w = 1400;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (-66 != param1.field_N) {
                  break L9;
                } else {
                  hj.field_w = 1000;
                  break L9;
                }
              }
              L10: {
                if (param1.field_N != 69) {
                  break L10;
                } else {
                  hj.field_w = 1400;
                  break L10;
                }
              }
              L11: {
                if (param1.field_N != 72) {
                  break L11;
                } else {
                  hj.field_w = 1000;
                  break L11;
                }
              }
              L12: {
                if (param1.field_N != 75) {
                  break L12;
                } else {
                  hj.field_w = 1000;
                  break L12;
                }
              }
              L13: {
                if (param1.field_N == 79) {
                  hj.field_w = 1000;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if ((param1.field_N ^ -1) != -85) {
                  break L14;
                } else {
                  hj.field_w = 1000;
                  break L14;
                }
              }
              L15: {
                if (88 == param1.field_N) {
                  hj.field_w = 1000;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if ((param1.field_N ^ -1) != -93) {
                  break L16;
                } else {
                  hj.field_w = 700;
                  break L16;
                }
              }
              L17: {
                param1.a(0, false, 31, 74, (byte) 49, 0);
                hj.field_w = var3;
                if (!nk.f((byte) -19)) {
                  var4 = 0;
                  var23 = ue.field_c[param0];
                  var6_int = 0;
                  L18: while (true) {
                    L19: {
                      if (var23.length <= var6_int) {
                        break L19;
                      } else {
                        if (0 != (var23[var6_int] ^ -1)) {
                          L20: {
                            stackOut_53_0 = var23[var6_int];
                            stackOut_53_1 = -68;
                            stackIn_55_0 = stackOut_53_0;
                            stackIn_55_1 = stackOut_53_1;
                            stackIn_54_0 = stackOut_53_0;
                            stackIn_54_1 = stackOut_53_1;
                            if (-8 + var23.length > var6_int) {
                              stackOut_55_0 = stackIn_55_0;
                              stackOut_55_1 = stackIn_55_1;
                              stackOut_55_2 = 0;
                              stackIn_56_0 = stackOut_55_0;
                              stackIn_56_1 = stackOut_55_1;
                              stackIn_56_2 = stackOut_55_2;
                              break L20;
                            } else {
                              stackOut_54_0 = stackIn_54_0;
                              stackOut_54_1 = stackIn_54_1;
                              stackOut_54_2 = 1;
                              stackIn_56_0 = stackOut_54_0;
                              stackIn_56_1 = stackOut_54_1;
                              stackIn_56_2 = stackOut_54_2;
                              break L20;
                            }
                          }
                          if (oc.a(stackIn_56_0, stackIn_56_1, stackIn_56_2 != 0)) {
                            var4 = 1;
                            break L19;
                          } else {
                            var6_int++;
                            continue L18;
                          }
                        } else {
                          var6_int++;
                          continue L18;
                        }
                      }
                    }
                    if (var4 != 0) {
                      pb.c(0, 0, 62, 74, 0, 128);
                      var6 = sj.field_F;
                      var6.a((-var6.field_z + 62) / 2, (-var6.field_B + 74) / 2);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                } else {
                  break L17;
                }
              }
              sb.field_bb.b((byte) 123);
              return;
            } else {
              break L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_g = null;
        field_a = null;
        field_d = null;
        if (param0 != 0) {
            return;
        }
        field_i = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 < 103) {
            return 2;
        }
        int var3 = param1 >>> 572902431;
        return (param1 - -var3) / param2 - var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_g = "Names cannot start or end with space or underscore";
        field_e = true;
        field_a = "Friends";
        field_b = 0;
    }
}
