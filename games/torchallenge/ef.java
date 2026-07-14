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
        mg.field_d = param0;
        i.field_m = param3;
        gb.field_f = param1;
        int var4 = 124 % ((-49 - param2) / 36);
    }

    final static void a(int param0, qe param1) {
        int var2 = 0;
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (!(ea.field_g != null)) {
            ea.field_g = new qe[10];
        }
        for (var2 = param0; ea.field_g.length > var2; var2++) {
            if (!(ea.field_g[var2] != null)) {
                ea.field_g[var2] = param1;
                param1.field_y = var2;
                return;
            }
        }
        qe[] var3 = ea.field_g;
        ea.field_g = new qe[var3.length + 10];
        for (var2 = 0; var2 < var3.length; var2++) {
            ea.field_g[var2] = var3[var2];
        }
        ea.field_g[var2] = param1;
        param1.field_y = var2;
        int discarded$0 = kf.a(param1, var2, 8);
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var6 = TorChallenge.field_F ? 1 : 0;
        int var4 = -1;
        for (var5 = param2; var5 < param3; var5++) {
            var4 = ae.field_w[255 & (var4 ^ param1[var5])] ^ var4 >>> -131065240;
        }
        if (param0 < 33) {
            field_e = -18;
        }
        var4 = var4 ^ -1;
        return var4;
    }

    public static void b(int param0) {
        field_h = null;
        field_i = null;
        field_f = null;
        field_j = null;
        if (param0 >= -82) {
            Object var2 = null;
            ef.a(-3, (qe) null);
        }
        field_l = null;
        field_a = null;
        field_d = null;
    }

    final static void c(int param0) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (param0 != -13730) {
            ef.a((byte) -19);
        }
        int[] var5 = m.field_i;
        int[] var1 = var5;
        int var2 = 0;
        int var3 = var5.length;
        while (var2 < var3) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        vg var4_ref_vg = null;
        int var4 = 0;
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
        vg var17_ref = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        var19 = TorChallenge.field_F ? 1 : 0;
        sf.field_b = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
        var1 = qc.field_a.length;
        var23 = new int[var1];
        var22 = var23;
        var21 = var22;
        var20 = var21;
        var2 = var20;
        var3 = 0;
        L0: while (true) {
          if (var3 >= var1) {
            L1: {
              var3 = sf.field_b[9] >> 1359442120;
              var4 = sf.field_b[10] >> 2052539592;
              if (param0 == 3) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            L2: {
              var5 = sf.field_b[11] >> -226844792;
              var6 = jc.field_c << -1991473020;
              var7 = 0;
              var8 = ai.a(true, var6) >> -2112981688;
              var9 = lc.b(param0 ^ -73, var6) >> -889747864;
              if (-1 == kc.field_u) {
                break L2;
              } else {
                if (0 == (ph.field_d ^ -1)) {
                  break L2;
                } else {
                  var8 = -ph.field_d + 240;
                  var9 = -128;
                  var7 = kc.field_u + -320;
                  break L2;
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
            L3: while (true) {
              if (qc.field_a.length <= var15) {
                return;
              } else {
                var16 = 0;
                var17_int = 1;
                L4: while (true) {
                  if (qc.field_a.length <= var17_int) {
                    var23[var16] = -2147483648;
                    var17_ref = qc.field_a[var16];
                    ue.a(var16, false);
                    var18 = 0;
                    L5: while (true) {
                      if (-4 >= (var18 ^ -1)) {
                        rj.a((byte) -77, false, uf.field_n, var17_ref, true, false, sf.field_b);
                        ul.a(var7, var8, var13, var14, var12, var17_ref, var9, -16711780);
                        var15++;
                        continue L3;
                      } else {
                        uf.field_n[var18] = uf.field_n[var18] + ok.field_d[var15][var18];
                        var18++;
                        continue L5;
                      }
                    }
                  } else {
                    if (var23[var17_int] > var23[var16]) {
                      var16 = var17_int;
                      var17_int++;
                      continue L4;
                    } else {
                      var17_int++;
                      continue L4;
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
            continue L0;
          }
        }
    }

    final static void a(byte param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
              if (param0 >= 64) {
                L0: {
                  if (var1 != null) {
                    try {
                      var2_ref = Runtime.getRuntime();
                      var4 = null;
                      var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                      ul.field_l = 1 + (int)(var3.longValue() / 1048576L);
                    } catch (java.lang.Throwable decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                    }
                    break L0;
                  } else {
                    break L0;
                  }
                }
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var2 = decompiledCaughtException;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ef(boolean param0) {
        ((ef) this).field_m = param0 ? true : false;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                            param1.getAppletContext().showDocument(mc.a(var2, -1, param1), "_top");
                            if (param0 == -93) {
                                statePc = 4;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            field_l = null;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var2_ref = (Exception) (Object) caughtException;
                        var2_ref.printStackTrace();
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ka[2];
        field_j = new int[]{290, 40};
        field_i = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3]};
        field_f = "Log in / Create account";
        field_e = 250;
        field_h = new ka[5][];
        field_k = 0;
        field_d = new int[8192];
    }
}
