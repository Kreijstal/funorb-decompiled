/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends gk {
    private double field_J;
    static int field_z;
    static int[] field_C;
    private double field_G;
    private double field_E;
    static String field_D;
    private dc field_H;
    static bi field_F;
    static int field_I;
    private boolean field_B;

    final static nf[] a(mi param0, String param1, int param2, String param3) {
        if (param2 != 1) {
            field_C = null;
        }
        int var4 = param0.a(-26, param3);
        int var5 = param0.a(var4, param1, -94);
        return hf.a(param0, var4, (byte) -127, var5);
    }

    nm(pm param0, bi param1, dc param2, int param3) {
        super(param0, param1);
        ((nm) this).field_n.e(param1.field_o.length * param3 >> -338220536);
        ((nm) this).field_w = 0.2;
        ((nm) this).field_H = param2;
    }

    final static boolean e(byte param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1_ref = (Object) (Object) tf.field_p;
                    // monitorenter tf.field_p
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ic.field_b != lh.field_b) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var1_ref
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        gk.field_r = ke.field_P[ic.field_b];
                        if (param0 == -96) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        field_z = -30;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ad.field_h = mk.field_n[ic.field_b];
                        ic.field_b = 127 & 1 + ic.field_b;
                        // monitorexit var1_ref
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1_ref
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void h(int param0) {
        if (param0 != 3981) {
            Object var2 = null;
            nf[] discarded$0 = nm.a((mi) null, (String) null, -1, (String) null);
        }
        field_D = null;
        field_F = null;
        field_C = null;
    }

    final void b(int param0) {
        if (!((nm) this).field_t.field_z) {
            ((nm) this).e(param0 + 31537);
            if (param0 != -25071) {
                boolean discarded$0 = nm.e((byte) -32);
            }
            return;
        }
        if (!(((nm) this).field_H.c((byte) 105))) {
            ((nm) this).f(128);
            return;
        }
        ((nm) this).e(param0 + 31537);
        if (param0 != -25071) {
            boolean discarded$1 = nm.e((byte) -32);
        }
    }

    final void e(int param0) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        int var29 = 0;
        double var30 = 0.0;
        double var32 = 0.0;
        double var34 = 0.0;
        double var36 = 0.0;
        double var38 = 0.0;
        double var40 = 0.0;
        double var42 = 0.0;
        double var44 = 0.0;
        dj var46 = null;
        double[] var50 = null;
        double stackIn_8_0 = 0.0;
        int stackIn_12_0 = 0;
        double stackIn_18_0 = 0.0;
        double stackIn_18_1 = 0.0;
        double stackIn_19_0 = 0.0;
        double stackIn_19_1 = 0.0;
        double stackIn_20_0 = 0.0;
        double stackIn_20_1 = 0.0;
        double stackIn_20_2 = 0.0;
        vc stackIn_33_0 = null;
        vc stackIn_34_0 = null;
        vc stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        double stackOut_7_0 = 0.0;
        double stackOut_6_0 = 0.0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        double stackOut_17_0 = 0.0;
        double stackOut_17_1 = 0.0;
        double stackOut_19_0 = 0.0;
        double stackOut_19_1 = 0.0;
        double stackOut_19_2 = 0.0;
        double stackOut_18_0 = 0.0;
        double stackOut_18_1 = 0.0;
        double stackOut_18_2 = 0.0;
        vc stackOut_32_0 = null;
        vc stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        vc stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        if (!((nm) this).field_H.c((byte) 105)) {
          ((nm) this).field_B = false;
          ((nm) this).field_n.h(0);
          ((nm) this).field_n.d(0);
          return;
        } else {
          L0: {
            var46 = ((nm) this).field_t.field_A.field_B;
            var3 = var46.field_E - ((nm) this).field_H.field_cb;
            var5 = var46.field_t - ((nm) this).field_H.field_L;
            var7 = var46.field_D - ((nm) this).field_H.field_X;
            var9 = var7 * ((nm) this).field_H.field_K + (var3 * ((nm) this).field_H.field_x + var5 * ((nm) this).field_H.field_P);
            var11 = var3;
            var13 = var5;
            var15 = var7;
            if (var9 >= 0.0) {
              L1: {
                if (((nm) this).field_H.field_y <= var9) {
                  stackOut_7_0 = ((nm) this).field_H.field_y;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = var9;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              var17 = stackIn_8_0;
              var15 = var15 - var17 * ((nm) this).field_H.field_K;
              var13 = var13 - ((nm) this).field_H.field_P * var17;
              var11 = var11 - var17 * ((nm) this).field_H.field_x;
              break L0;
            } else {
              break L0;
            }
          }
          L2: {
            var17 = var11 * var11 + var13 * var13 + var15 * var15;
            var19 = 2.0 * ((nm) this).field_w;
            if (var17 > var19 * var19) {
              stackOut_11_0 = (int)(0.5 + var19 * (double)((nm) this).field_m / Math.sqrt(var17));
              stackIn_12_0 = stackOut_11_0;
              break L2;
            } else {
              stackOut_10_0 = ((nm) this).field_m;
              stackIn_12_0 = stackOut_10_0;
              break L2;
            }
          }
          L3: {
            var21 = stackIn_12_0;
            if (param0 == 6466) {
              break L3;
            } else {
              field_C = null;
              break L3;
            }
          }
          L4: {
            if ((var21 ^ -1) < -257) {
              var21 = 256;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            var50 = new double[12];
            var46.field_jb.a((byte) 85, var50);
            var23 = var50[3];
            var25 = var50[4];
            var27 = var50[5];
            stackOut_17_0 = 128.5;
            stackOut_17_1 = 128.0 * (var13 * var25 + var11 * var23 + var27 * var15);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (var17 <= var19 * var19) {
              stackOut_19_0 = stackIn_19_0;
              stackOut_19_1 = stackIn_19_1;
              stackOut_19_2 = var19;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = stackIn_18_0;
              stackOut_18_1 = stackIn_18_1;
              stackOut_18_2 = Math.sqrt(var17);
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            var29 = (int)(stackIn_20_0 - stackIn_20_1 / stackIn_20_2);
            ((nm) this).field_n.b(16384 + eg.field_i * var21 * fa.field_S >> 258769199, var29);
            var11 = -(var9 * ((nm) this).field_H.field_x) + var3;
            var15 = -(((nm) this).field_H.field_K * var9) + var7;
            var13 = -(var9 * ((nm) this).field_H.field_P) + var5;
            var30 = var46.field_K;
            var32 = var46.field_G;
            var34 = var46.field_L;
            if (((nm) this).field_B) {
              var32 = var32 + (-var13 + ((nm) this).field_J);
              var30 = var30 + (((nm) this).field_G - var11);
              var34 = var34 + (-var15 + ((nm) this).field_E);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            ((nm) this).field_G = var11;
            ((nm) this).field_J = var13;
            ((nm) this).field_E = var15;
            ((nm) this).field_B = true;
            if (0.01 <= var17) {
              var17 = 1.0 / Math.sqrt(var17);
              var15 = var15 * var17;
              var13 = var13 * var17;
              var11 = var11 * var17;
              break L7;
            } else {
              break L7;
            }
          }
          var36 = -(var13 * var32) - var11 * var30 - var34 * var15 + 2.0;
          if (var36 < 0.01) {
            ((nm) this).field_n.d(0);
            return;
          } else {
            var38 = -(var13 * var46.field_G) - var11 * var46.field_K - var15 * var46.field_L + 2.0;
            if (var38 < 0.01) {
              ((nm) this).field_n.d(0);
              return;
            } else {
              L8: {
                var40 = (double)(((nm) this).field_s.field_n * 256) / (double)dk.field_k;
                var42 = var40 * 2.0 / var36;
                var44 = var38 * var42 / 2.0;
                stackOut_32_0 = ((nm) this).field_n;
                stackIn_34_0 = stackOut_32_0;
                stackIn_33_0 = stackOut_32_0;
                if (1600.0 > var44) {
                  stackOut_34_0 = (vc) (Object) stackIn_34_0;
                  stackOut_34_1 = (int)(var44 + 0.5);
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  break L8;
                } else {
                  stackOut_33_0 = (vc) (Object) stackIn_33_0;
                  stackOut_33_1 = 1600;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  break L8;
                }
              }
              L9: {
                ((vc) (Object) stackIn_35_0).d(stackIn_35_1);
                if (((nm) this).field_x) {
                  cb.field_a.a((gf) (Object) ((nm) this).field_n);
                  ((nm) this).field_x = false;
                  break L9;
                } else {
                  break L9;
                }
              }
              return;
            }
          }
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        int var3 = 0;
        String var4 = null;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var3 = -74 % ((param1 - 19) / 41);
        var4 = pn.a(-1, param0);
        if (-1 == param2.indexOf(param0)) {
          if (0 != (param2.indexOf(var4) ^ -1)) {
            return true;
          } else {
            L0: {
              L1: {
                if (param2.startsWith(param0)) {
                  break L1;
                } else {
                  if (param2.startsWith(var4)) {
                    break L1;
                  } else {
                    if (param2.endsWith(param0)) {
                      break L1;
                    } else {
                      if (!param2.endsWith(var4)) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L0;
            }
            return stackIn_10_0 != 0;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new int[8192];
        field_I = -1;
        field_D = "Username: ";
    }
}
