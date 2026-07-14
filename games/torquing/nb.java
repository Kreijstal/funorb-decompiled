/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends am {
    private boolean field_t;
    private boolean field_s;

    final static void g(byte param0) {
        int var1 = 0;
        double var3 = 0.0;
        int var5 = Torquing.field_u;
        be.a();
        id.field_c = new int[260];
        oe.field_b = 11;
        int var2 = 90 % ((param0 - -4) / 60);
        for (var1 = 0; var1 < 256; var1++) {
            var3 = 15.0;
            id.field_c[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var3));
        }
        int var6 = 256;
        var1 = var6;
        while (id.field_c.length > var6) {
            id.field_c[var6] = 255;
            var6++;
        }
    }

    public nb() {
        super(1, false);
        ((nb) this).field_t = true;
        ((nb) this).field_s = true;
    }

    final int[] a(byte param0, int param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = Torquing.field_u;
        if (param0 < 86) {
            return null;
        }
        int[] var7 = ((nb) this).field_l.a(param1, 25657);
        int[] var3 = var7;
        if (!((nb) this).field_l.field_b) {
        } else {
            var4 = ((nb) this).b(0, 0, ((nb) this).field_t ? vp.field_I + -param1 : param1);
            if (!((nb) this).field_s) {
                dk.a(var4, 0, var7, 0, ci.field_c);
            } else {
                for (var5 = 0; var5 < ci.field_c; var5++) {
                    var3[var5] = var4[jh.field_A - var5];
                }
            }
        }
        return var3;
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        int var14 = 0;
        int[][] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[][] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[][] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[][] var30 = null;
        int[][] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        L0: {
          var12 = Torquing.field_u;
          var31 = ((nb) this).field_r.a(param0 + 44258, param1);
          var26 = var31;
          var21 = var26;
          var16 = var21;
          var13 = var16;
          var3 = var13;
          if (param0 == -29116) {
            break L0;
          } else {
            nb.g((byte) 122);
            break L0;
          }
        }
        L1: {
          if (!((nb) this).field_r.field_b) {
            break L1;
          } else {
            L2: {
              stackOut_3_0 = this;
              stackOut_3_1 = 24066;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              if (((nb) this).field_t) {
                stackOut_5_0 = this;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = -param1 + vp.field_I;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = param1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                break L2;
              }
            }
            var30 = ((nb) this).c(stackIn_6_1, stackIn_6_2, 0);
            var32 = var30[0];
            var27 = var32;
            var22 = var27;
            var17 = var22;
            var5 = var17;
            var33 = var30[1];
            var28 = var33;
            var23 = var28;
            var18 = var23;
            var6 = var18;
            var34 = var30[2];
            var29 = var34;
            var24 = var29;
            var19 = var24;
            var7 = var19;
            var8 = var31[0];
            var9 = var31[1];
            var10 = var31[2];
            if (!((nb) this).field_s) {
              var14 = 0;
              var11 = var14;
              L3: while (true) {
                if (var14 >= ci.field_c) {
                  break L1;
                } else {
                  var8[var14] = var32[var14];
                  var9[var14] = var33[var14];
                  var10[var14] = var34[var14];
                  var14++;
                  continue L3;
                }
              }
            } else {
              var11 = 0;
              L4: while (true) {
                if (var11 >= ci.field_c) {
                  break L1;
                } else {
                  var8[var11] = var5[jh.field_A + -var11];
                  var9[var11] = var6[-var11 + jh.field_A];
                  var10[var11] = var7[-var11 + jh.field_A];
                  var11++;
                  continue L4;
                }
              }
            }
          }
        }
        return var3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        bi.field_p = param0;
        if (param1 >= -87) {
            return;
        }
        bp.field_f = param2;
        kp.field_d = param4;
        bp.field_e = param3;
    }

    final static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        ug.a(param0 ^ -105);
        if (k.field_d != null) {
            tf.a(-93, k.field_d);
        }
        ee.a(true);
        qd.b(param0 ^ 1);
        ci.a(0);
        if (!(!pf.a((byte) -34))) {
            wa.field_d.f(121, 1);
            jd.a((byte) -81, 0);
        }
        ih.b(true);
    }

    final static String a(String param0, java.applet.Applet param1, byte param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String stackIn_6_0 = null;
            String stackOut_5_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Torquing.field_u;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = (String) hp.a(param1, (byte) -85, "getcookies");
                            var4 = kc.a(';', var3, 0);
                            var5 = -110 / ((param2 - -25) / 51);
                            var6 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var4.length <= var6) {
                                statePc = 10;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var7 = var4[var6].indexOf('=');
                            if (-1 < (var7 ^ -1)) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (!var4[var6].substring(0, var7).trim().equals((Object) (Object) param0)) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = var4[var6].substring(var7 + 1).trim();
                            stackIn_6_0 = stackOut_5_0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return stackIn_6_0;
                    }
                    case 7: {
                        try {
                            var6++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var3_ref = caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        return null;
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

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          var5 = Torquing.field_u;
          var4 = param2;
          if (var4 != 0) {
            if (var4 != -2) {
              if (-3 == var4) {
                L1: {
                  stackOut_14_0 = this;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (-2 != param0.i((byte) -101)) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L1;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L1;
                  }
                }
                ((nb) this).field_p = stackIn_17_1 != 0;
                break L0;
              } else {
                break L0;
              }
            } else {
              L2: {
                stackOut_10_0 = this;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (param0.i((byte) -101) != -2) {
                  stackOut_12_0 = this;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L2;
                } else {
                  stackOut_11_0 = this;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L2;
                }
              }
              ((nb) this).field_t = stackIn_13_1 != 0;
              break L0;
            }
          } else {
            L3: {
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (1 != param0.i((byte) -101)) {
                stackOut_8_0 = this;
                stackOut_8_1 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L3;
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = 1;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L3;
              }
            }
            ((nb) this).field_s = stackIn_9_1 != 0;
            break L0;
          }
        }
        L4: {
          if (param1 == 35) {
            break L4;
          } else {
            ((nb) this).field_s = false;
            break L4;
          }
        }
    }

    static {
    }
}
