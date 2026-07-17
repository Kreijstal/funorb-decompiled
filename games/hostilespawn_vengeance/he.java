/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends ch {
    static String field_w;
    int field_u;
    static double field_r;
    static String field_z;
    static gb field_t;
    static int field_x;
    int field_v;
    static java.awt.Image field_y;
    static int[] field_s;

    public static void b(boolean param0) {
        if (!param0) {
            he.b(false);
        }
        field_z = null;
        field_t = null;
        field_w = null;
        field_y = null;
        field_s = null;
    }

    final static pg[] c() {
        int var2 = 0;
        int var3 = HostileSpawn.field_I ? 1 : 0;
        pg[] var1 = new pg[sc.field_c];
        for (var2 = 0; sc.field_c > var2; var2++) {
            var1[var2] = new pg(ra.field_a, vc.field_e, th.field_Jb[var2], nh.field_O[var2], sf.field_X[var2], hd.field_r[var2], ja.field_e[var2], bf.field_d);
        }
        uj.d(113);
        return var1;
    }

    final void a(int param0) {
        super.a(param0);
        ((he) this).field_u = 0;
        ((he) this).field_v = 0;
    }

    final static void a(double param0, oc param1, int param2, double param3, oj param4, int param5, int param6) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            L1: {
              if (r.field_a == 0) {
                break L1;
              } else {
                L2: {
                  if (bm.field_c != 0) {
                    break L2;
                  } else {
                    if (3 == rl.field_c) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (bm.field_c != 1) {
                    break L3;
                  } else {
                    if (rl.field_c == 2) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                return;
              }
            }
            L4: {
              var13 = -122;
              var11 = -param2 + param1.field_e;
              var12 = -param6 + param1.field_g;
              if (var11 <= -24) {
                break L4;
              } else {
                if (var11 >= 24) {
                  break L4;
                } else {
                  if (-24 >= var12) {
                    break L4;
                  } else {
                    if (var12 < 24) {
                      param4.field_F = param4.field_F - 1;
                      jn.field_F[ib.field_c].field_c = 256.0 * Math.random();
                      jn.field_F[ib.field_c].field_j.a((byte) 46, param1);
                      jn.field_F[ib.field_c].field_l.a(param4.field_l, -28860);
                      jn.field_F[ib.field_c].field_e = 1;
                      jn.field_F[ib.field_c].field_h = 0;
                      jn.field_F[ib.field_c].field_i = 1;
                      jn.field_F[ib.field_c].field_l.field_f = jn.field_F[ib.field_c].field_l.field_f + 0.5;
                      jn.field_F[ib.field_c].field_l.field_a = jn.field_F[ib.field_c].field_l.field_a + 0.5;
                      jn.field_F[ib.field_c].field_l.a((int)(Math.random() * 10.0), (byte) 94, jn.field_F[ib.field_c].field_c);
                      ib.field_c = ib.field_c + 1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            L5: {
              L6: {
                if ((7 & em.field_c) != 0) {
                  break L6;
                } else {
                  if (uj.field_l != 1) {
                    break L6;
                  } else {
                    var9_int = (int)(24.0 * (-param4.field_l.field_f + ((double)(-param1.field_e) + ((double)param2 + param3))));
                    var10 = (int)(((double)(-param1.field_g) + (param0 + (double)param6) - param4.field_l.field_a) * 24.0);
                    var14 = (int)Math.sqrt((double)(var10 * var10 + var9_int * var9_int));
                    if (400 >= var14) {
                      var15 = -var14 + 400;
                      if (jh.field_db < var15) {
                        jh.field_db = var15;
                        break L6;
                      } else {
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
              }
              break L5;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var9 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var9;
            stackOut_22_1 = new StringBuilder().append("he.A(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param4 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + -58 + 44 + param6 + 41);
        }
    }

    final static void a(p param0, oj param1, byte param2, double param3, double param4) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var7_int = (int)((param4 - (double)param0.field_j.field_e - param0.field_l.field_f) * 24.0);
              var8 = (int)((-param0.field_l.field_a + ((double)(-param0.field_j.field_g) + param3)) * 24.0);
              if (var7_int < -24) {
                break L1;
              } else {
                if (var7_int > 24) {
                  break L1;
                } else {
                  if (var8 < -24) {
                    break L1;
                  } else {
                    if (24 <= var8) {
                      break L1;
                    } else {
                      param1.field_z = 4;
                      param1.field_F = 255;
                      ci.a(1, 76);
                      nh.a(param1, -29966);
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              param0.field_e = param0.field_e + 2;
              if (param0.field_e > 32) {
                param0.field_i = -1;
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var7;
            stackOut_11_1 = new StringBuilder().append("he.D(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 110 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static int c(int param0, byte param1) {
        int var3 = 0;
        int var2 = (16707538 & param0) >> 16;
        int var4 = 254 & param0 >> 8;
        int var5 = param0 & 254;
        return var5 >> 1 | (var2 << 15 | var4 << 7);
    }

    final void b(int param0) {
        super.b(param0);
        if (param0 != -24) {
            he.b(false);
        }
    }

    he(kh param0) {
        super(param0, new mn[5]);
        int var2_int = 0;
        int var3 = 0;
        ((he) this).field_u = 0;
        ((he) this).field_v = 0;
        try {
            for (var2_int = 0; var2_int < ((he) this).field_g.length; var2_int++) {
                ((he) this).field_g[var2_int] = new mn();
                for (var3 = 0; var3 < 4; var3++) {
                    ((he) this).field_g[var2_int].field_d[var3] = var2_int <= var3 ? 0 : 256;
                }
            }
            ((he) this).field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "he.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Passwords must be between 5 and 20 letters and numbers";
        field_z = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_r = Math.atan2(1.0, 0.0);
        field_s = new int[4];
    }
}
