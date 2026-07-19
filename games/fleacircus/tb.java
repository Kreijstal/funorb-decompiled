/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static boolean field_c;
    static java.applet.Applet field_d;
    static String field_e;
    static String field_b;
    static String field_a;
    static dd field_f;

    final static boolean a(int param0, int[] param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        long var2_long = 0L;
        ha var4_ref_ha = null;
        int var4 = 0;
        int var5_int = 0;
        ha var5 = null;
        int var6 = 0;
        int var7 = 0;
        CharSequence var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_22_0 = false;
        int stackIn_24_0 = 0;
        boolean stackIn_27_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_16_0 = 0;
        boolean stackOut_21_0 = false;
        int stackOut_23_0 = 0;
        boolean stackOut_26_0 = false;
        int stackOut_31_0 = 0;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (rh.field_k != fh.field_b) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var2_long = lj.a((byte) -83);
                if (-1 == (ja.field_P ^ -1)) {
                  break L1;
                } else {
                  if (0 <= il.field_h) {
                    break L1;
                  } else {
                    var4_ref_ha = (ha) ((Object) bj.field_n.c((byte) 47));
                    if (var4_ref_ha == null) {
                      break L1;
                    } else {
                      if ((var4_ref_ha.field_q ^ -1L) > (var2_long ^ -1L)) {
                        var4_ref_ha.c(-1);
                        pd.field_l = var4_ref_ha.field_r.length;
                        ae.field_a.field_i = 0;
                        var5_int = 0;
                        L2: while (true) {
                          L3: {
                            L4: {
                              if (pd.field_l <= var5_int) {
                                break L4;
                              } else {
                                ae.field_a.field_k[var5_int] = var4_ref_ha.field_r[var5_int];
                                var5_int++;
                                if (var7 != 0) {
                                  break L3;
                                } else {
                                  if (var7 == 0) {
                                    continue L2;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                            hc.field_j = rj.field_k;
                            rj.field_k = vi.field_a;
                            vi.field_a = be.field_a;
                            be.field_a = var4_ref_ha.field_n;
                            break L3;
                          }
                          stackOut_16_0 = 1;
                          stackIn_17_0 = stackOut_16_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L5: {
                if (param0 <= -54) {
                  break L5;
                } else {
                  var8 = (CharSequence) null;
                  discarded$1 = tb.a((CharSequence) null, false);
                  break L5;
                }
              }
              L6: while (true) {
                L7: {
                  L8: {
                    if ((il.field_h ^ -1) <= -1) {
                      break L8;
                    } else {
                      ae.field_a.field_i = 0;
                      stackOut_21_0 = gi.a(1, true);
                      stackIn_27_0 = stackOut_21_0;
                      stackIn_22_0 = stackOut_21_0;
                      if (var7 != 0) {
                        break L7;
                      } else {
                        if (stackIn_22_0) {
                          il.field_h = ae.field_a.f((byte) 47);
                          ae.field_a.field_i = 0;
                          pd.field_l = param1[il.field_h];
                          break L8;
                        } else {
                          stackOut_23_0 = 0;
                          stackIn_24_0 = stackOut_23_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  stackOut_26_0 = gf.b(-9);
                  stackIn_27_0 = stackOut_26_0;
                  break L7;
                }
                if (stackIn_27_0) {
                  if (ja.field_P != 0) {
                    L9: {
                      var4 = ja.field_P;
                      if (g.field_u == 0.0) {
                        break L9;
                      } else {
                        var4 = (int)((double)var4 + jj.field_R.nextGaussian() * g.field_u);
                        if ((var4 ^ -1) <= -1) {
                          break L9;
                        } else {
                          var4 = 0;
                          break L9;
                        }
                      }
                    }
                    var5 = new ha((long)var4 + var2_long, il.field_h, new byte[pd.field_l]);
                    var6 = 0;
                    if (pd.field_l <= var6) {
                      bj.field_n.a(false, var5);
                      il.field_h = -1;
                      continue L6;
                    } else {
                      var5.field_r[var6] = ae.field_a.field_k[var6];
                      var6++;
                      continue L6;
                    }
                  } else {
                    hc.field_j = rj.field_k;
                    rj.field_k = vi.field_a;
                    vi.field_a = be.field_a;
                    be.field_a = il.field_h;
                    il.field_h = -1;
                    stackOut_31_0 = 1;
                    stackIn_32_0 = stackOut_31_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                } else {
                  stackOut_28_0 = 0;
                  stackIn_29_0 = stackOut_28_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var2);
            stackOut_41_1 = new StringBuilder().append("tb.C(").append(param0).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L10;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L10;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_24_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_29_0 != 0;
              } else {
                return stackIn_32_0 != 0;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 > -43) {
          field_d = (java.applet.Applet) null;
          field_f = null;
          field_b = null;
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_f = null;
          field_b = null;
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    final static int a(CharSequence param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            if (!param1) {
              var4 = 0;
              L1: while (true) {
                L2: {
                  if (var4 >= var2_int) {
                    stackOut_8_0 = var3;
                    stackIn_9_0 = stackOut_8_0;
                    break L2;
                  } else {
                    stackOut_6_0 = rc.a(param0.charAt(var4), 22861) + ((var3 << -157896507) + -var3);
                    stackIn_9_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      var3 = stackIn_7_0;
                      var4++;
                      continue L1;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 40;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("tb.A(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_9_0;
        }
    }

    static {
        field_e = "Right slope: ";
        field_b = "Tiles in the level (1/3)";
        field_a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
