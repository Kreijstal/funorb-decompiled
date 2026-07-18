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
        field_b = null;
    }

    final static boolean b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        nl var2_ref_nl = null;
        int var3 = 0;
        gm var4 = null;
        int var5 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_7_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_42_0 = 0;
        boolean stackIn_44_0 = false;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        gm stackIn_59_0 = null;
        gm stackIn_60_0 = null;
        gm stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        boolean stackIn_72_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_71_0 = false;
        int stackOut_69_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        gm stackOut_58_0 = null;
        gm stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        gm stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_45_0 = 0;
        boolean stackOut_43_0 = false;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_3_0 = false;
        var5 = Kickabout.field_G;
        try {
          L0: {
            var1_int = 3;
            if (ks.field_e == 1) {
              stackOut_71_0 = tc.a(4, (byte) 97, 29360128, (nl) (Object) mh.field_k, 74973184);
              stackIn_72_0 = stackOut_71_0;
              break L0;
            } else {
              if (ks.field_e != 2) {
                if (ks.field_e != 3) {
                  if (ks.field_e == 4) {
                    var2 = 1;
                    var2 = var2 != 0 & tc.a(4, (byte) 121, 53084160, (nl) (Object) mh.field_k, 72744960) ? 1 : 0;
                    var2 = var2 != 0 & tc.a(1, (byte) 93, 49152000, (nl) (Object) ld.field_f, 55050240) ? 1 : 0;
                    stackOut_69_0 = var2;
                    stackIn_70_0 = stackOut_69_0;
                    return stackIn_70_0 != 0;
                  } else {
                    if (ks.field_e != 5) {
                      if (6 != ks.field_e) {
                        if (ks.field_e == 7) {
                          L1: {
                            L2: {
                              var2_ref_nl = et.field_d.field_P[1][4];
                              if (var2_ref_nl.f(-107) != 180) {
                                break L2;
                              } else {
                                if (var2_ref_nl.a(true) != 550) {
                                  break L2;
                                } else {
                                  stackOut_66_0 = 1;
                                  stackIn_68_0 = stackOut_66_0;
                                  break L1;
                                }
                              }
                            }
                            stackOut_67_0 = 0;
                            stackIn_68_0 = stackOut_67_0;
                            break L1;
                          }
                          return stackIn_68_0 != 0;
                        } else {
                          if (ks.field_e == 8) {
                            L3: {
                              L4: {
                                var2 = 1;
                                stackOut_47_0 = var2;
                                stackIn_50_0 = stackOut_47_0;
                                stackIn_48_0 = stackOut_47_0;
                                if (ld.field_f.field_u != 0) {
                                  break L4;
                                } else {
                                  stackOut_48_0 = stackIn_48_0;
                                  stackIn_50_0 = stackOut_48_0;
                                  stackIn_49_0 = stackOut_48_0;
                                  if (!tc.a(8, (byte) 114, 3932160, (nl) (Object) ld.field_f, 16384000)) {
                                    break L4;
                                  } else {
                                    stackOut_49_0 = stackIn_49_0;
                                    stackOut_49_1 = 1;
                                    stackIn_51_0 = stackOut_49_0;
                                    stackIn_51_1 = stackOut_49_1;
                                    break L3;
                                  }
                                }
                              }
                              stackOut_50_0 = stackIn_50_0;
                              stackOut_50_1 = 0;
                              stackIn_51_0 = stackOut_50_0;
                              stackIn_51_1 = stackOut_50_1;
                              break L3;
                            }
                            L5: {
                              var2 = stackIn_51_0 & stackIn_51_1;
                              stackOut_51_0 = var2;
                              stackIn_53_0 = stackOut_51_0;
                              stackIn_52_0 = stackOut_51_0;
                              if (~et.field_d.field_P[1][4].field_w != ~fm.a((byte) -27, 1)) {
                                stackOut_53_0 = stackIn_53_0;
                                stackOut_53_1 = 0;
                                stackIn_54_0 = stackOut_53_0;
                                stackIn_54_1 = stackOut_53_1;
                                break L5;
                              } else {
                                stackOut_52_0 = stackIn_52_0;
                                stackOut_52_1 = 1;
                                stackIn_54_0 = stackOut_52_0;
                                stackIn_54_1 = stackOut_52_1;
                                break L5;
                              }
                            }
                            L6: {
                              var2 = stackIn_54_0 & stackIn_54_1;
                              if (var2 != 0) {
                                var3 = 0;
                                L7: while (true) {
                                  if (var3 >= 4) {
                                    break L6;
                                  } else {
                                    L8: {
                                      var4 = (gm) (Object) et.field_d.field_P[1][1 + var3];
                                      var4.a(th.field_c[var3] << 16, false, 0, te.field_a[var3] << 16);
                                      var4.field_G = 0;
                                      stackOut_58_0 = (gm) var4;
                                      stackIn_60_0 = stackOut_58_0;
                                      stackIn_59_0 = stackOut_58_0;
                                      if (var3 == 1) {
                                        stackOut_60_0 = (gm) (Object) stackIn_60_0;
                                        stackOut_60_1 = 8;
                                        stackIn_61_0 = stackOut_60_0;
                                        stackIn_61_1 = stackOut_60_1;
                                        break L8;
                                      } else {
                                        stackOut_59_0 = (gm) (Object) stackIn_59_0;
                                        stackOut_59_1 = 2;
                                        stackIn_61_0 = stackOut_59_0;
                                        stackIn_61_1 = stackOut_59_1;
                                        break L8;
                                      }
                                    }
                                    ((gm) (Object) stackIn_61_0).a(stackIn_61_1, 26214);
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                break L6;
                              }
                            }
                            stackOut_62_0 = var2;
                            stackIn_63_0 = stackOut_62_0;
                            return stackIn_63_0 != 0;
                          } else {
                            if (ks.field_e == 9) {
                              var2 = 1;
                              var2 = var2 != 0 & tc.a(2, (byte) 119, 49152000, (nl) (Object) ld.field_f, 55050240) ? 1 : 0;
                              var2 = var2 != 0 & tc.a(8, (byte) 82, 20971520, (nl) (Object) mh.field_k, 55050240) ? 1 : 0;
                              var2 = var2 != 0 & tc.a(1, (byte) 119, 31457280, et.field_d.field_P[1][3], 54067200) ? 1 : 0;
                              var2 = var2 != 0 & tc.a(1, (byte) 123, 31457280, et.field_d.field_P[1][4], 56033280) ? 1 : 0;
                              stackOut_45_0 = var2;
                              stackIn_46_0 = stackOut_45_0;
                              return stackIn_46_0 != 0;
                            } else {
                              if (ks.field_e != 10) {
                                if (11 != ks.field_e) {
                                  if (ks.field_e == 12) {
                                    stackOut_43_0 = tc.a(4, (byte) 107, 29360128, (nl) (Object) fc.field_c, 19660800);
                                    stackIn_44_0 = stackOut_43_0;
                                    return stackIn_44_0;
                                  } else {
                                    if (ks.field_e == 13) {
                                      L9: {
                                        var2 = 1;
                                        var2 = var2 != 0 & tc.a(4, (byte) 96, 29360128, (nl) (Object) fc.field_c, 19660800) ? 1 : 0;
                                        var2 = var2 != 0 & tc.a(1, (byte) 84, 29360128, et.field_d.field_P[1][0], 1310720) ? 1 : 0;
                                        stackOut_38_0 = var2;
                                        stackIn_40_0 = stackOut_38_0;
                                        stackIn_39_0 = stackOut_38_0;
                                        if (-1 != et.field_d.field_V.field_m) {
                                          stackOut_40_0 = stackIn_40_0;
                                          stackOut_40_1 = 0;
                                          stackIn_41_0 = stackOut_40_0;
                                          stackIn_41_1 = stackOut_40_1;
                                          break L9;
                                        } else {
                                          stackOut_39_0 = stackIn_39_0;
                                          stackOut_39_1 = 1;
                                          stackIn_41_0 = stackOut_39_0;
                                          stackIn_41_1 = stackOut_39_1;
                                          break L9;
                                        }
                                      }
                                      var2 = stackIn_41_0 & stackIn_41_1;
                                      stackOut_41_0 = var2;
                                      stackIn_42_0 = stackOut_41_0;
                                      return stackIn_42_0 != 0;
                                    } else {
                                      return true;
                                    }
                                  }
                                } else {
                                  stackOut_33_0 = 1;
                                  stackIn_34_0 = stackOut_33_0;
                                  return stackIn_34_0 != 0;
                                }
                              } else {
                                L10: {
                                  var2 = 1;
                                  var2 = var2 != 0 & tc.a(12, (byte) 113, 3276800, (nl) (Object) mh.field_k, 58982400) ? 1 : 0;
                                  if (var2 == 0) {
                                    break L10;
                                  } else {
                                    if (mh.field_k.field_u != 0) {
                                      break L10;
                                    } else {
                                      if (0 == et.field_d.field_V.field_m) {
                                        ej.b(200, -2, -100, 30);
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                L11: {
                                  var2 = var2 != 0 & tc.a(8, (byte) 86, 29360128, (nl) (Object) fc.field_c, 36438016) ? 1 : 0;
                                  stackOut_24_0 = var2;
                                  stackIn_26_0 = stackOut_24_0;
                                  stackIn_25_0 = stackOut_24_0;
                                  if (-1 != et.field_d.field_V.field_m) {
                                    stackOut_26_0 = stackIn_26_0;
                                    stackOut_26_1 = 0;
                                    stackIn_27_0 = stackOut_26_0;
                                    stackIn_27_1 = stackOut_26_1;
                                    break L11;
                                  } else {
                                    stackOut_25_0 = stackIn_25_0;
                                    stackOut_25_1 = 1;
                                    stackIn_27_0 = stackOut_25_0;
                                    stackIn_27_1 = stackOut_25_1;
                                    break L11;
                                  }
                                }
                                L12: {
                                  var2 = stackIn_27_0 & stackIn_27_1;
                                  stackOut_27_0 = var2;
                                  stackIn_29_0 = stackOut_27_0;
                                  stackIn_28_0 = stackOut_27_0;
                                  if (et.field_d.field_V.e(-105) >= 131072) {
                                    stackOut_29_0 = stackIn_29_0;
                                    stackOut_29_1 = 0;
                                    stackIn_30_0 = stackOut_29_0;
                                    stackIn_30_1 = stackOut_29_1;
                                    break L12;
                                  } else {
                                    stackOut_28_0 = stackIn_28_0;
                                    stackOut_28_1 = 1;
                                    stackIn_30_0 = stackOut_28_0;
                                    stackIn_30_1 = stackOut_28_1;
                                    break L12;
                                  }
                                }
                                var2 = stackIn_30_0 & stackIn_30_1;
                                stackOut_30_0 = var2;
                                stackIn_31_0 = stackOut_30_0;
                                return stackIn_31_0 != 0;
                              }
                            }
                          }
                        }
                      } else {
                        var2 = 1;
                        var2 = var2 != 0 & tc.a(2, (byte) 116, 52428800, (nl) (Object) mh.field_k, 43909120) ? 1 : 0;
                        var2 = var2 != 0 & tc.a(8, (byte) 84, 13107200, (nl) (Object) ld.field_f, 43909120) ? 1 : 0;
                        stackOut_13_0 = var2;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      }
                    } else {
                      var2 = 1;
                      var2 = var2 != 0 & tc.a(1, (byte) 122, 53084160, (nl) (Object) mh.field_k, 55050240) ? 1 : 0;
                      var2 = var2 != 0 & tc.a(4, (byte) 89, 49152000, (nl) (Object) ld.field_f, 72744960) ? 1 : 0;
                      stackOut_10_0 = var2;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0 != 0;
                    }
                  }
                } else {
                  stackOut_6_0 = tc.a(8, (byte) 116, 29360128, (nl) (Object) mh.field_k, 18481152);
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              } else {
                stackOut_3_0 = tc.a(4, (byte) 82, 29360128, (nl) (Object) mh.field_k, 44040192);
                stackIn_4_0 = stackOut_3_0;
                return stackIn_4_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "bt.C(" + 105 + ')');
        }
        return stackIn_72_0;
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
        if (param1 >= 32768) {
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
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((bt) this).field_f = new eq(64);
        try {
          L0: {
            L1: {
              ((bt) this).field_h = param1;
              ((bt) this).field_g = param2;
              if (null == ((bt) this).field_h) {
                break L1;
              } else {
                int discarded$4 = ((bt) this).field_h.a(true, 0);
                break L1;
              }
            }
            L2: {
              if (((bt) this).field_g == null) {
                break L2;
              } else {
                int discarded$5 = ((bt) this).field_g.a(true, 0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("bt.<init>(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
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
