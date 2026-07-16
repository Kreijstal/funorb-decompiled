/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bt {
    private eq field_f;
    static java.awt.Image field_i;
    static String field_d;
    private sj field_g;
    static hd field_b;
    private sj field_h;
    static String field_c;
    static boolean field_e;
    static int[] field_a;

    final static void a(int param0) {
        int var2 = 0;
        L0: {
          var2 = Kickabout.field_G;
          if (sr.field_l != null) {
            if (sr.field_l.c(0)) {
              gu.a(uv.field_i.h((byte) -77), (byte) -88, 11);
              break L0;
            } else {
              tu.b(15848, 11, 0);
              break L0;
            }
          } else {
            L1: {
              if (!um.field_e.e(param0 + -2)) {
                break L1;
              } else {
                if (um.field_e.b(-21660)) {
                  break L1;
                } else {
                  tu.b(param0 + 15848, 11, 0);
                  break L0;
                }
              }
            }
            gu.a(uv.field_i.h((byte) 74), (byte) -114, 11);
            an.field_d = true;
            break L0;
          }
        }
        L2: {
          if (param0 == 0) {
            break L2;
          } else {
            ut discarded$1 = bt.a(-48, true, 12);
            break L2;
          }
        }
    }

    final static ut a(int param0, boolean param1, int param2) {
        int var8 = 0;
        int var9 = Kickabout.field_G;
        int var3 = af.field_b[param1 ? 0 : 1];
        int[] var4 = sm.field_o[param1 ? 0 : 1];
        kg[] var5 = ph.field_e[param1 ? 0 : 2];
        if (param0 > -125) {
            return null;
        }
        ut var6 = new ut(var3, param2 * var4[1] + var4[2] + var4[0]);
        iw.a(83, var6);
        int var7 = 0;
        var5[0].a(0, var7);
        var7 = var7 + var4[0];
        for (var8 = 0; var8 < param2; var8++) {
            var5[1].a(0, var7);
            var7 = var7 + var4[1];
        }
        var5[2].a(0, var7);
        ta.e(118);
        pd.a(var6, 20684);
        return var6;
    }

    public static void a(boolean param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        field_i = null;
        if (!param0) {
            return;
        }
        field_b = null;
    }

    final static boolean b(int param0) {
        int var1 = 0;
        int var2 = 0;
        nl var2_ref_nl = null;
        int var3 = 0;
        gm var4 = null;
        int var5 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        gm stackIn_49_0 = null;
        gm stackIn_50_0 = null;
        gm stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_57_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        gm stackOut_48_0 = null;
        gm stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        gm stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        var5 = Kickabout.field_G;
        var1 = 73 % ((param0 - -65) / 33);
        if (ks.field_e == 1) {
          return tc.a(4, (byte) 97, 29360128, (nl) (Object) mh.field_k, 74973184);
        } else {
          if (-3 != (ks.field_e ^ -1)) {
            if (-4 != (ks.field_e ^ -1)) {
              if (-5 == (ks.field_e ^ -1)) {
                var2 = 1;
                var2 = var2 != 0 & tc.a(4, (byte) 121, 53084160, (nl) (Object) mh.field_k, 72744960) ? 1 : 0;
                var2 = var2 != 0 & tc.a(1, (byte) 93, 49152000, (nl) (Object) ld.field_f, 55050240) ? 1 : 0;
                return var2 != 0;
              } else {
                if (-6 != (ks.field_e ^ -1)) {
                  if (6 != ks.field_e) {
                    if (-8 == (ks.field_e ^ -1)) {
                      L0: {
                        L1: {
                          var2_ref_nl = et.field_d.field_P[1][4];
                          if (var2_ref_nl.f(-107) != 180) {
                            break L1;
                          } else {
                            if (var2_ref_nl.a(true) != 550) {
                              break L1;
                            } else {
                              stackOut_55_0 = 1;
                              stackIn_57_0 = stackOut_55_0;
                              break L0;
                            }
                          }
                        }
                        stackOut_56_0 = 0;
                        stackIn_57_0 = stackOut_56_0;
                        break L0;
                      }
                      return stackIn_57_0 != 0;
                    } else {
                      if ((ks.field_e ^ -1) == -9) {
                        L2: {
                          L3: {
                            var2 = 1;
                            stackOut_37_0 = var2;
                            stackIn_40_0 = stackOut_37_0;
                            stackIn_38_0 = stackOut_37_0;
                            if (-1 != (ld.field_f.field_u ^ -1)) {
                              break L3;
                            } else {
                              stackOut_38_0 = stackIn_38_0;
                              stackIn_40_0 = stackOut_38_0;
                              stackIn_39_0 = stackOut_38_0;
                              if (!tc.a(8, (byte) 114, 3932160, (nl) (Object) ld.field_f, 16384000)) {
                                break L3;
                              } else {
                                stackOut_39_0 = stackIn_39_0;
                                stackOut_39_1 = 1;
                                stackIn_41_0 = stackOut_39_0;
                                stackIn_41_1 = stackOut_39_1;
                                break L2;
                              }
                            }
                          }
                          stackOut_40_0 = stackIn_40_0;
                          stackOut_40_1 = 0;
                          stackIn_41_0 = stackOut_40_0;
                          stackIn_41_1 = stackOut_40_1;
                          break L2;
                        }
                        L4: {
                          var2 = stackIn_41_0 & stackIn_41_1;
                          stackOut_41_0 = var2;
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_42_0 = stackOut_41_0;
                          if ((et.field_d.field_P[1][4].field_w ^ -1) != (fm.a((byte) -27, 1) ^ -1)) {
                            stackOut_43_0 = stackIn_43_0;
                            stackOut_43_1 = 0;
                            stackIn_44_0 = stackOut_43_0;
                            stackIn_44_1 = stackOut_43_1;
                            break L4;
                          } else {
                            stackOut_42_0 = stackIn_42_0;
                            stackOut_42_1 = 1;
                            stackIn_44_0 = stackOut_42_0;
                            stackIn_44_1 = stackOut_42_1;
                            break L4;
                          }
                        }
                        L5: {
                          var2 = stackIn_44_0 & stackIn_44_1;
                          if (var2 != 0) {
                            var3 = 0;
                            L6: while (true) {
                              if (-5 >= (var3 ^ -1)) {
                                break L5;
                              } else {
                                L7: {
                                  var4 = (gm) (Object) et.field_d.field_P[1][1 + var3];
                                  var4.a(th.field_c[var3] << 1263914064, false, 0, te.field_a[var3] << 1621558128);
                                  var4.field_G = 0;
                                  stackOut_48_0 = (gm) var4;
                                  stackIn_50_0 = stackOut_48_0;
                                  stackIn_49_0 = stackOut_48_0;
                                  if (var3 == 1) {
                                    stackOut_50_0 = (gm) (Object) stackIn_50_0;
                                    stackOut_50_1 = 8;
                                    stackIn_51_0 = stackOut_50_0;
                                    stackIn_51_1 = stackOut_50_1;
                                    break L7;
                                  } else {
                                    stackOut_49_0 = (gm) (Object) stackIn_49_0;
                                    stackOut_49_1 = 2;
                                    stackIn_51_0 = stackOut_49_0;
                                    stackIn_51_1 = stackOut_49_1;
                                    break L7;
                                  }
                                }
                                ((gm) (Object) stackIn_51_0).a(stackIn_51_1, 26214);
                                var3++;
                                continue L6;
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        return var2 != 0;
                      } else {
                        if (-10 == (ks.field_e ^ -1)) {
                          var2 = 1;
                          var2 = var2 != 0 & tc.a(2, (byte) 119, 49152000, (nl) (Object) ld.field_f, 55050240) ? 1 : 0;
                          var2 = var2 != 0 & tc.a(8, (byte) 82, 20971520, (nl) (Object) mh.field_k, 55050240) ? 1 : 0;
                          var2 = var2 != 0 & tc.a(1, (byte) 119, 31457280, et.field_d.field_P[1][3], 54067200) ? 1 : 0;
                          var2 = var2 != 0 & tc.a(1, (byte) 123, 31457280, et.field_d.field_P[1][4], 56033280) ? 1 : 0;
                          return var2 != 0;
                        } else {
                          if ((ks.field_e ^ -1) != -11) {
                            if (11 != ks.field_e) {
                              if ((ks.field_e ^ -1) == -13) {
                                return tc.a(4, (byte) 107, 29360128, (nl) (Object) fc.field_c, 19660800);
                              } else {
                                if (ks.field_e == 13) {
                                  L8: {
                                    var2 = 1;
                                    var2 = var2 != 0 & tc.a(4, (byte) 96, 29360128, (nl) (Object) fc.field_c, 19660800) ? 1 : 0;
                                    var2 = var2 != 0 & tc.a(1, (byte) 84, 29360128, et.field_d.field_P[1][0], 1310720) ? 1 : 0;
                                    stackOut_31_0 = var2;
                                    stackIn_33_0 = stackOut_31_0;
                                    stackIn_32_0 = stackOut_31_0;
                                    if (-1 != et.field_d.field_V.field_m) {
                                      stackOut_33_0 = stackIn_33_0;
                                      stackOut_33_1 = 0;
                                      stackIn_34_0 = stackOut_33_0;
                                      stackIn_34_1 = stackOut_33_1;
                                      break L8;
                                    } else {
                                      stackOut_32_0 = stackIn_32_0;
                                      stackOut_32_1 = 1;
                                      stackIn_34_0 = stackOut_32_0;
                                      stackIn_34_1 = stackOut_32_1;
                                      break L8;
                                    }
                                  }
                                  var2 = stackIn_34_0 & stackIn_34_1;
                                  return var2 != 0;
                                } else {
                                  return true;
                                }
                              }
                            } else {
                              return true;
                            }
                          } else {
                            L9: {
                              var2 = 1;
                              var2 = var2 != 0 & tc.a(12, (byte) 113, 3276800, (nl) (Object) mh.field_k, 58982400) ? 1 : 0;
                              if (var2 == 0) {
                                break L9;
                              } else {
                                if (-1 != (mh.field_k.field_u ^ -1)) {
                                  break L9;
                                } else {
                                  if (0 == et.field_d.field_V.field_m) {
                                    ej.b(200, -2, -100, 30);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            L10: {
                              var2 = var2 != 0 & tc.a(8, (byte) 86, 29360128, (nl) (Object) fc.field_c, 36438016) ? 1 : 0;
                              stackOut_19_0 = var2;
                              stackIn_21_0 = stackOut_19_0;
                              stackIn_20_0 = stackOut_19_0;
                              if (-1 != et.field_d.field_V.field_m) {
                                stackOut_21_0 = stackIn_21_0;
                                stackOut_21_1 = 0;
                                stackIn_22_0 = stackOut_21_0;
                                stackIn_22_1 = stackOut_21_1;
                                break L10;
                              } else {
                                stackOut_20_0 = stackIn_20_0;
                                stackOut_20_1 = 1;
                                stackIn_22_0 = stackOut_20_0;
                                stackIn_22_1 = stackOut_20_1;
                                break L10;
                              }
                            }
                            L11: {
                              var2 = stackIn_22_0 & stackIn_22_1;
                              stackOut_22_0 = var2;
                              stackIn_24_0 = stackOut_22_0;
                              stackIn_23_0 = stackOut_22_0;
                              if ((et.field_d.field_V.e(-105) ^ -1) <= -131073) {
                                stackOut_24_0 = stackIn_24_0;
                                stackOut_24_1 = 0;
                                stackIn_25_0 = stackOut_24_0;
                                stackIn_25_1 = stackOut_24_1;
                                break L11;
                              } else {
                                stackOut_23_0 = stackIn_23_0;
                                stackOut_23_1 = 1;
                                stackIn_25_0 = stackOut_23_0;
                                stackIn_25_1 = stackOut_23_1;
                                break L11;
                              }
                            }
                            var2 = stackIn_25_0 & stackIn_25_1;
                            return var2 != 0;
                          }
                        }
                      }
                    }
                  } else {
                    var2 = 1;
                    var2 = var2 != 0 & tc.a(2, (byte) 116, 52428800, (nl) (Object) mh.field_k, 43909120) ? 1 : 0;
                    var2 = var2 != 0 & tc.a(8, (byte) 84, 13107200, (nl) (Object) ld.field_f, 43909120) ? 1 : 0;
                    return var2 != 0;
                  }
                } else {
                  var2 = 1;
                  var2 = var2 != 0 & tc.a(1, (byte) 122, 53084160, (nl) (Object) mh.field_k, 55050240) ? 1 : 0;
                  var2 = var2 != 0 & tc.a(4, (byte) 89, 49152000, (nl) (Object) ld.field_f, 72744960) ? 1 : 0;
                  return var2 != 0;
                }
              }
            } else {
              return tc.a(8, (byte) 116, 29360128, (nl) (Object) mh.field_k, 18481152);
            }
          } else {
            return tc.a(4, (byte) 82, 29360128, (nl) (Object) mh.field_k, 44040192);
          }
        }
    }

    final tc a(int param0, int param1) {
        byte[] var4 = null;
        tc var3 = (tc) ((bt) this).field_f.a((long)param1, (byte) 43);
        if (param0 != 200) {
            return null;
        }
        if (!(var3 == null)) {
            return var3;
        }
        if ((param1 ^ -1) <= -32769) {
            var4 = ((bt) this).field_g.b(0, -32669, param1 & 32767);
        } else {
            var4 = ((bt) this).field_h.b(0, -32669, param1);
        }
        var3 = new tc();
        if (var4 != null) {
            var3.a(new iw(var4), 0);
        }
        if (32768 <= param1) {
            var3.a(-104);
        }
        ((bt) this).field_f.a((long)param1, (Object) (Object) var3, (byte) -110);
        return var3;
    }

    bt(int param0, sj param1, sj param2) {
        ((bt) this).field_f = new eq(64);
        ((bt) this).field_h = param1;
        ((bt) this).field_g = param2;
        if (null != ((bt) this).field_h) {
            int discarded$0 = ((bt) this).field_h.a(true, 0);
        }
        if (((bt) this).field_g != null) {
            int discarded$1 = ((bt) this).field_g.a(true, 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "League points: ";
        field_d = "Retry";
        field_e = false;
        field_a = new int[128];
    }
}
