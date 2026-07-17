/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends oh {
    int field_r;
    static boolean field_s;
    ln field_k;
    static qh field_l;
    static int field_o;
    fs field_h;
    int field_i;
    static String field_n;
    static String field_q;
    static String[] field_m;
    int field_p;
    static int field_j;

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        int var21 = 0;
        int var22 = 0;
        RuntimeException decompiledCaughtException = null;
        var22 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 0) {
                break L1;
              } else {
                param6 = param6 + param0;
                param0 = 0;
                break L1;
              }
            }
            L2: {
              if (param3 < 0) {
                param1 = param1 + param3;
                param3 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 + param3 <= gf.field_b) {
                break L3;
              } else {
                param1 = gf.field_b - param3;
                break L3;
              }
            }
            L4: {
              if (gf.field_k >= param6 + param0) {
                break L4;
              } else {
                param6 = -param0 + gf.field_k;
                break L4;
              }
            }
            var7_int = param4 * param5 >> 8;
            var8 = -var7_int + param5;
            var9 = param6 + param0;
            var10 = param0;
            L5: while (true) {
              if (var10 >= var9) {
                break L0;
              } else {
                var11 = param3 + var10 * gf.field_b;
                var12 = param1;
                L6: while (true) {
                  if (var12 <= 0) {
                    var10++;
                    continue L5;
                  } else {
                    var13 = gf.field_h[var11];
                    var14 = (16711680 & var13) >> 16;
                    var15 = 255 & var13 >> 8;
                    var16 = 255 & var13;
                    var17 = 5 * var14 + var15 * 6 - -(5 * var16);
                    var18 = (var14 * var7_int >> 8) - -(var17 * var8 >> 12);
                    var19 = (var15 * var7_int >> 8) - -(var8 * var17 >> 12);
                    var20 = (var16 * var7_int >> 8) - -(var17 * var8 >> 12);
                    var21 = var20 | (var19 << 8 | var18 << 16);
                    gf.field_h[var11] = var21;
                    var11++;
                    var12--;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var7, "ne.B(" + param0 + 44 + param1 + 44 + 24 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    public static void c() {
        field_q = null;
        field_m = null;
        field_l = null;
        field_n = null;
    }

    final static bi a(int param0) {
        bi var2 = new bi(pf.field_d.field_z, pf.field_d.field_w);
        ra.a(-127);
        var2.e();
        pf.field_d.b(0, 0, param0 >= 0 ? param0 : 2105376);
        cg.i(0);
        return var2;
    }

    final static void d() {
        ch.field_c = null;
        jn.field_a = false;
        oi.field_d = null;
        we.field_f = null;
        db.field_a = null;
        qq.field_n = null;
        w.field_D = null;
        va.field_e = null;
        ks.field_j = null;
        tf.field_b = null;
        ac.field_s = null;
        sr.field_F = null;
        tp.field_e = null;
        ma.field_r = null;
        q.field_Cb = null;
        oe.field_c = null;
        ds.field_b = null;
        mm.field_o = null;
        he.field_h = null;
        vm.field_Jb = null;
    }

    final static void a(bc param0, byte param1, nq param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        si var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int[] var14 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = ai.field_e;
            ua.field_f = new qr(0L, (qr) null);
            if (param0 != null) {
              param0.field_k = 0;
              param0.field_j = false;
              kq.field_A = new jo(var3_int, param0, param0);
              dh.field_c = new re(var3_int, param0, param0, (wr) (Object) new ch());
              var4 = hc.a(false);
              if (var4 != null) {
                ke.a(-69, var4);
                kh.field_Nb = rd.a(65793, 5138823, 65793, 65793, 4020342, (byte) 99, 1127256, 1513239, (nq) null, 0, 2245737, 1513239, 8947848);
                nl.field_d = rd.a(0, 0, 0, 0, 0, (byte) 99, 0, 0, param2, 16764006, 0, 0, 0);
                hl.field_I = rd.a(0, 0, 0, 0, 0, (byte) 99, 0, 0, param2, 16777215, 0, 0, 0);
                var5 = gf.field_b;
                var6 = gf.field_k;
                var14 = gf.field_h;
                jq.field_c = new bi(10, 14);
                jq.field_c.e();
                var8 = 2;
                L1: while (true) {
                  if (7 <= var8) {
                    gf.a(var14, var5, var6);
                    of.field_b = gn.a(0, var4, hl.field_I, nl.field_d, kh.field_Nb);
                    ua.field_f.field_M = new pf();
                    break L0;
                  } else {
                    gf.j(var8, var8 - -1, -(var8 << 1) + 14, 16777215);
                    var8++;
                    continue L1;
                  }
                }
              } else {
                jq.a(-29901, (Throwable) null, "QC2");
                return;
              }
            } else {
              var10 = null;
              jq.a(-29901, (Throwable) null, "QC1");
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("ne.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(-64).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              int discarded$6 = 0;
              if (!ef.a(param1)) {
                var6 = tq.field_g;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var6.length <= var3) {
                    var2 = wd.field_L;
                    var3 = 0;
                    L2: while (true) {
                      if (var3 >= var2.length) {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (param1 == var4) {
                          stackOut_18_0 = 1;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0 != 0;
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (var4 != param1) {
                      var3++;
                      continue L1;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0 != 0;
                    }
                  }
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2_ref, "ne.E(" + 0 + 44 + param1 + 41);
        }
        return stackIn_22_0 != 0;
    }

    ne(mg param0, int param1, int param2) {
        try {
            ((ne) this).field_h = param0.field_G;
            ((ne) this).field_p = param1;
            ((ne) this).field_i = param0.field_z;
            ((ne) this).field_r = param2;
            ((ne) this).field_k = param0.field_y;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ne.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    ne(fs param0, int param1, int param2, int param3) {
        try {
            ((ne) this).field_h = param0;
            ((ne) this).field_k = null;
            ((ne) this).field_r = param3;
            ((ne) this).field_p = param2;
            ((ne) this).field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ne.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_m = new String[]{"Metal income in this territory.", "Biomass income in this territory.", "Energy income in this territory.", "Exotics income in this territory."};
        field_q = "No players";
        field_j = 20;
    }
}
