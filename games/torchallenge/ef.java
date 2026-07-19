/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    boolean field_c;
    static String field_f;
    boolean field_m;
    static int[] field_d;
    String field_g;
    static og field_l;
    static ka[] field_a;
    static int[][] field_i;
    static int field_e;
    static int[] field_j;
    String[] field_b;
    int field_n;
    static int field_k;
    static ka[][] field_h;

    final static void a(int param0, h param1, byte param2, int param3) {
        try {
            mg.field_d = param0;
            i.field_m = param3;
            gb.field_f = param1;
            int var4_int = 124 % ((-49 - param2) / 36);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ef.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, qe param1) {
        int discarded$2 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        qe[] var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ea.field_g == null) {
                ea.field_g = new qe[10];
                break L1;
              } else {
                break L1;
              }
            }
            var2_int = param0;
            L2: while (true) {
              if (ea.field_g.length <= var2_int) {
                var3 = ea.field_g;
                ea.field_g = new qe[var3.length + 10];
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= var3.length) {
                    ea.field_g[var2_int] = param1;
                    param1.field_y = var2_int;
                    discarded$2 = kf.a(param1, var2_int, 8);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    ea.field_g[var2_int] = var3[var2_int];
                    var2_int++;
                    continue L3;
                  }
                }
              } else {
                if (ea.field_g[var2_int] == null) {
                  ea.field_g[var2_int] = param1;
                  param1.field_y = var2_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var2_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("ef.A(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param2;
            L1: while (true) {
              if (var5 >= param3) {
                L2: {
                  if (param0 >= 33) {
                    break L2;
                  } else {
                    field_e = -18;
                    break L2;
                  }
                }
                var4_int = var4_int ^ -1;
                stackOut_6_0 = var4_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var4_int = ae.field_w[255 & (var4_int ^ param1[var5])] ^ var4_int >>> -131065240;
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("ef.G(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    public static void b(int param0) {
        field_h = (ka[][]) null;
        field_i = (int[][]) null;
        field_f = null;
        field_j = null;
        if (param0 >= -82) {
            qe var2 = (qe) null;
            ef.a(-3, (qe) null);
        }
        field_l = null;
        field_a = null;
        field_d = null;
    }

    final static void c(int param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -13730) {
                break L1;
              } else {
                ef.a((byte) -19);
                break L1;
              }
            }
            var5 = m.field_i;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L2: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1_ref), "ef.B(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        vg var4_ref_vg = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        vg var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            sf.field_b = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = qc.field_a.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  var3 = sf.field_b[9] >> 1359442120;
                  var4 = sf.field_b[10] >> 2052539592;
                  if (param0 == 3) {
                    break L2;
                  } else {
                    field_f = (String) null;
                    break L2;
                  }
                }
                L3: {
                  var5 = sf.field_b[11] >> -226844792;
                  var6 = jc.field_c << -1991473020;
                  var7 = 0;
                  var8 = ai.a(true, var6) >> -2112981688;
                  var9 = lc.b(param0 ^ -73, var6) >> -889747864;
                  if (-1 == kc.field_u) {
                    break L3;
                  } else {
                    if (0 == (ph.field_d ^ -1)) {
                      break L3;
                    } else {
                      var8 = -ph.field_d + 240;
                      var9 = -128;
                      var7 = kc.field_u + -320;
                      break L3;
                    }
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var9 * var9 + (var8 * var8 + var7 * var7)));
                var9 = (int)((double)var9 * var10);
                var7 = (int)((double)var7 * var10);
                var8 = (int)((double)var8 * var10);
                var12 = var7 - var3;
                var13 = -var4 + var8;
                var14 = -var5 + var9;
                var10 = 256.0 / Math.sqrt((double)(var14 * var14 + (var13 * var13 + var12 * var12)));
                var13 = (int)((double)var13 * var10);
                var14 = (int)((double)var14 * var10);
                var12 = (int)((double)var12 * var10);
                var15 = 0;
                L4: while (true) {
                  if (qc.field_a.length <= var15) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L5: while (true) {
                      if (qc.field_a.length <= var17_int) {
                        var21[var16] = -2147483648;
                        var17 = qc.field_a[var16];
                        ue.a(var16, false);
                        var18 = 0;
                        L6: while (true) {
                          if (-4 >= (var18 ^ -1)) {
                            rj.a((byte) -77, false, uf.field_n, var17, true, false, sf.field_b);
                            ul.a(var7, var8, var13, var14, var12, var17, var9, -16711780);
                            var15++;
                            continue L4;
                          } else {
                            uf.field_n[var18] = uf.field_n[var18] + ok.field_d[var15][var18];
                            var18++;
                            continue L6;
                          }
                        }
                      } else {
                        if (var21[var17_int] > var21[var16]) {
                          var16 = var17_int;
                          var17_int++;
                          continue L5;
                        } else {
                          var17_int++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
              } else {
                var4_ref_vg = qc.field_a[var3];
                var17 = var4_ref_vg;
                var17 = var4_ref_vg;
                var4_ref_vg.b(-105);
                ue.a(var3, false);
                var5 = var4_ref_vg.field_p - -var4_ref_vg.field_e >> -537012191;
                var6 = var4_ref_vg.field_K + var4_ref_vg.field_N >> -440973919;
                var7 = var4_ref_vg.field_B + var4_ref_vg.field_h >> 2019796193;
                var8 = sf.field_b[9] >> -890609630;
                var9 = sf.field_b[10] >> -79955134;
                var10_int = sf.field_b[11] >> 1280641826;
                var11 = uf.field_n[3] * var8 - -(var9 * uf.field_n[4]) + uf.field_n[5] * var10_int >> 1353602510;
                var12 = uf.field_n[7] * var9 + (var8 * uf.field_n[6] - -(var10_int * uf.field_n[8])) >> -801017970;
                var13 = uf.field_n[9] * var8 - -(var9 * uf.field_n[10]) - -(var10_int * uf.field_n[11]) >> -1691823762;
                var2[var3] = var6 * var12 + (var11 * var5 - -(var7 * var13)) >> -1208098352;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "ef.F(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                if (param0 >= 64) {
                  L1: {
                    if (var1 != null) {
                      try {
                        L2: {
                          var2_ref = Runtime.getRuntime();
                          var4 = (Object[]) null;
                          var3 = (Long) (var1.invoke((Object) (var2_ref), (Object[]) null));
                          ul.field_l = 1 + (int)(var3.longValue() / 1048576L);
                          break L2;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L3: {
                          var2 = decompiledCaughtException;
                          break L3;
                        }
                      }
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L4;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ef(boolean param0) {
        this.field_m = param0 ? true : false;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                      param1.getAppletContext().showDocument(mc.a(var2, -1, param1), "_top");
                      if (param0 == -93) {
                        break L2;
                      } else {
                        field_l = (og) null;
                        break L2;
                      }
                    }
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_5_0 = (RuntimeException) (var2_ref2);
                stackOut_5_1 = new StringBuilder().append("ef.E(").append(param0).append(',');
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (param1 == null) {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L4;
                } else {
                  stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackOut_6_2 = "{...}";
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L4;
                }
              }
              throw oj.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new ka[2];
        field_j = new int[]{290, 40};
        field_i = new int[][]{new int[]{-1, -1, -1}, new int[]{-1, -1, -1}, new int[]{-1, -1, -1}, new int[]{0, 0, 0}, new int[]{-1, 1, -1}, new int[]{-1, 2, -1}, new int[]{-1, -1, -1}, new int[]{-1, -1, -1}, new int[]{-1, 5, 6}, new int[]{-1, -1, 4}, new int[]{3, -1, -1}};
        field_f = "Log in / Create account";
        field_e = 250;
        field_h = new ka[5][];
        field_k = 0;
        field_d = new int[8192];
    }
}
