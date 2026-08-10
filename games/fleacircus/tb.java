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
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        ha var4_ref_ha = null;
        int var4 = 0;
        int var5_int = 0;
        ha var5 = null;
        int var6 = 0;
        int var7 = 0;
        CharSequence var8 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (rh.field_k != fh.field_b) {
              stackIn_4_0 = 0;
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
                          if (pd.field_l <= var5_int) {
                            hc.field_j = rj.field_k;
                            rj.field_k = vi.field_a;
                            vi.field_a = be.field_a;
                            be.field_a = var4_ref_ha.field_n;
                            stackIn_14_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            ae.field_a.field_k[var5_int] = var4_ref_ha.field_r[var5_int];
                            var5_int++;
                            continue L2;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L3: {
                if (param0 <= -54) {
                  break L3;
                } else {
                  var8 = (CharSequence) null;
                  tb.a((CharSequence) null, false);
                  break L3;
                }
              }
              L4: while (true) {
                L5: {
                  if ((il.field_h ^ -1) <= -1) {
                    break L5;
                  } else {
                    ae.field_a.field_i = 0;
                    if (gi.a(1, true)) {
                      il.field_h = ae.field_a.f((byte) 47);
                      ae.field_a.field_i = 0;
                      pd.field_l = param1[il.field_h];
                      break L5;
                    } else {
                      stackIn_20_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                if (gf.b(-9)) {
                  if (ja.field_P != 0) {
                    L6: {
                      var4 = ja.field_P;
                      if (g.field_u == 0.0) {
                        break L6;
                      } else {
                        var4 = (int)((double)var4 + jj.field_R.nextGaussian() * g.field_u);
                        if ((var4 ^ -1) <= -1) {
                          break L6;
                        } else {
                          var4 = 0;
                          break L6;
                        }
                      }
                    }
                    var5 = new ha((long)var4 + var2_long, il.field_h, new byte[pd.field_l]);
                    var6 = 0;
                    L7: while (true) {
                      if (pd.field_l <= var6) {
                        bj.field_n.a(false, var5);
                        il.field_h = -1;
                        continue L4;
                      } else {
                        var5.field_r[var6] = ae.field_a.field_k[var6];
                        var6++;
                        continue L7;
                      }
                    }
                  } else {
                    hc.field_j = rj.field_k;
                    rj.field_k = vi.field_a;
                    vi.field_a = be.field_a;
                    be.field_a = il.field_h;
                    il.field_h = -1;
                    stackIn_27_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                } else {
                  stackIn_24_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var2);

            stackIn_37_1 = new StringBuilder().append("tb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L8;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L8;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0 != 0;
              } else {
                return stackIn_27_0 != 0;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 > -43) {
            field_d = (java.applet.Applet) null;
        }
        field_f = null;
        field_b = null;
        field_d = null;
        field_a = null;
        field_e = null;
    }

    final static int a(CharSequence param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            if (!param1) {
              var4 = 0;
              L1: while (true) {
                if (var4 >= var2_int) {
                  stackIn_8_0 = var3;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3 = rc.a(param0.charAt(var4), 22861) + ((var3 << -157896507) + -var3);
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 40;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("tb.A(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    static {
        field_e = "Right slope: ";
        field_b = "Tiles in the level (1/3)";
        field_a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
