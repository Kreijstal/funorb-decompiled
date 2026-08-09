/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static sa field_b;
    static int[][][] field_a;

    final static void c(int param0) {
        ms var1 = null;
        int var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
            vl.field_p = null;
            dj.field_a = 0;
            vg.field_p = 0;
            wh.field_c.b(126);
            ot.field_E.b(81);
            var1 = nh.field_K.a((byte) 66);
            while (var1 != null) {
                var1.c((byte) -76);
                var1 = nh.field_K.c(1);
            }
            if (param0 > -112) {
                da.a(89, true);
            }
            var1 = bk.field_a.a((byte) 66);
            while (var1 != null) {
                var1.c((byte) -76);
                var1 = bk.field_a.c(1);
            }
            th.field_a = 0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "da.I(" + param0 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        if (null == vi.field_a || 0 == vi.field_a.length) {
            return;
        }
        if (-1 < (param1 ^ -1) || param1 >= vi.field_a.length) {
            return;
        }
        ub.a((byte) 106, vi.field_a[param1]);
        if (param0 > -22) {
            da.b(0);
        }
    }

    final static void a(int param0) {
        mv.field_d = mg.field_e.g(1);
        if (param0 <= 10) {
            String[] var2 = (String[]) null;
            da.a(70, 41, (String[][]) null, (String[]) null, 94);
        }
        CharSequence var3 = (CharSequence) ((Object) mv.field_d);
        ft.field_p = k.a(var3, false);
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_20_0 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            var7 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                if (at.field_a) {
                  stackIn_4_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  try {
                    L1: {
                      L2: {
                        var2 = "tuhstatbut";
                        var3 = (String) (lj.a("getcookies", (byte) 81, param1));
                        var4 = dj.a(29, ';', var3);
                        if (param0 == 23660) {
                          break L2;
                        } else {
                          field_a = (int[][][]) null;
                          break L2;
                        }
                      }
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var4.length) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L4: {
                            var6 = var4[var5].indexOf('=');
                            if (-1 < (var6 ^ -1)) {
                              break L4;
                            } else {
                              if (var4[var5].substring(0, var6).trim().equals(var2)) {
                                stackIn_13_0 = 1;
                                decompiledRegionSelector0 = 1;
                                break L1;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L5;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    L6: {
                      if (param1.getParameter("tuhstatbut") == null) {
                        stackIn_20_0 = 0;
                        break L6;
                      } else {
                        stackIn_20_0 = 1;
                        break L6;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_23_0 = (RuntimeException) (var2_ref2);

                stackIn_23_1 = new StringBuilder().append("da.E(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackIn_24_2 = "null";
                  break L7;
                } else {
                  stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackIn_24_2 = "{...}";
                  break L7;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_20_0 != 0;
              } else {
                return stackIn_13_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_a = (int[][][]) null;
        }
        field_a = (int[][][]) null;
        field_b = null;
    }

    final static void a(int param0, int param1, String[][] param2, String[] param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param0 = ha.b(param0, param4, -4);
            var5_int = param2[param0].length;
            var6 = param1;
            L1: while (true) {
              if (var6 >= var5_int) {
                break L0;
              } else {
                var7 = var6;
                var8 = jj.a((byte) 103, var7, param2, param0);
                var9 = t.a(var8, param3, (byte) 118);
                aw.field_j[param4][param0][var7] = var9;
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("da.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != -10820) {
            field_b = (sa) null;
        }
        if (jj.b((byte) -73)) {
            param1 = false;
        }
        ca.a(5295, param1);
        jg.a((byte) 102);
    }

    final static void b(int param0) {
        t.field_c = kv.k(5);
        rl.field_C = new gk();
        if (param0 != -2) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            da.a(43, (java.applet.Applet) null);
        }
        td.a(true, true, param0 + 25);
    }

    final static void a(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        on var4 = null;
        int var4_int = 0;
        int var5 = 0;
        rs var5_ref_rs = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        bv var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var9 = mg.field_e;
            var2 = var9.k(0);
            if (param0 < -77) {
              L1: {
                var3 = var9.k(0);
                if (0 == var2) {
                  var4 = (on) ((Object) ss.field_t.e((byte) 96));
                  if (var4 != null) {
                    L2: {
                      var5 = fk.field_b + -var9.field_q;
                      var11 = var4.field_m;
                      var10 = var11;
                      var6 = var10;
                      if (var5 <= var11.length << -1591929918) {
                        break L2;
                      } else {
                        var5 = var11.length << -14358366;
                        break L2;
                      }
                    }
                    var7 = 0;
                    L3: while (true) {
                      if (var5 <= var7) {
                        var4.d(-116);
                        break L1;
                      } else {
                        var6[var7 >> 1247296610] = var6[var7 >> 1247296610] + (var9.k(0) << rn.a(var7 << -39351256, 768));
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    dj.a((byte) -124);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  if (1 != var2) {
                    af.a((Throwable) null, 70, "LR1: " + cm.b(false));
                    dj.a((byte) -127);
                    break L1;
                  } else {
                    var4_int = var9.a(100);
                    var5_ref_rs = (rs) ((Object) gg.field_F.e((byte) 107));
                    L4: while (true) {
                      L5: {
                        if (var5_ref_rs == null) {
                          break L5;
                        } else {
                          L6: {
                            if (var5_ref_rs.field_r != var3) {
                              break L6;
                            } else {
                              if (var4_int != var5_ref_rs.field_l) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var5_ref_rs = (rs) ((Object) gg.field_F.a((byte) 123));
                          continue L4;
                        }
                      }
                      if (var5_ref_rs != null) {
                        var5_ref_rs.d(-105);
                        break L1;
                      } else {
                        dj.a((byte) -125);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "da.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_b = new sa();
        field_a = new int[][][]{new int[][]{new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -1, 0, 3}}, new int[][]{new int[]{-2, -1, 0, 3, -2, -2}}, new int[][]{new int[]{-2, -1, 0, 3, -2}}, new int[][]{new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -1, 3, -1, 3}, new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2, -2, -2}}, new int[][]{new int[]{-2, -1, 0, 3, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2}}};
    }
}
