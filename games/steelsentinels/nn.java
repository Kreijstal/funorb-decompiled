/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn extends java.awt.Canvas implements java.awt.event.FocusListener {
    static mi field_g;
    java.awt.Frame field_d;
    volatile boolean field_b;
    static String field_f;
    static String field_e;
    static int[] field_c;
    static pe[] field_h;
    static wk[] field_a;

    final static void a(int param0, boolean param1, int param2, int param3) {
        ib.a(param2, db.field_b, param1, param3, 127, da.field_g, te.field_b);
        if (param0 != -1604006872) {
            field_g = null;
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(pn param0, int param1) {
        try {
            ok.a(-1, param0, ((nn) this).field_d);
            int var3_int = 121 / ((param1 - -15) / 60);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "nn.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(String[] args, int param1, String param2, byte param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_9_0 = 0;
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
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
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
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              cb.field_j = sn.field_p;
              if (param1 == 255) {
                L2: {
                  if (13 <= wi.field_y) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L2;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L2;
                  }
                }
                qf.field_d = fn.a(stackIn_9_0 != 0, (byte) 69);
                break L1;
              } else {
                L3: {
                  if (param1 < 100) {
                    break L3;
                  } else {
                    if (param1 > 105) {
                      break L3;
                    } else {
                      qf.field_d = fc.a((byte) -76, args);
                      break L1;
                    }
                  }
                }
                qf.field_d = fi.a(18, param2, param1);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("nn.C(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (args == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + -128 + 41);
        }
    }

    final static void a(boolean param0) {
        int var1 = an.field_h * an.field_h;
        if (param0) {
            return;
        }
        int var2 = var1 - wa.field_p * wa.field_p;
        int var3 = var2 * (jn.field_c + -va.field_b) / var1 + va.field_b;
        qc.field_V.a(0, var3, 120, me.field_e, 640);
        nm.a(da.field_g, 0, va.field_e, 5, jn.field_c - 24, 640, 110);
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    nn() {
    }

    public static void b(byte param0) {
        field_c = null;
        field_e = null;
        field_h = null;
        field_a = null;
        field_g = null;
        field_f = null;
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((nn) this).field_b = true;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "nn.focusLost(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(byte param0) {
        return de.field_d;
    }

    final static int a(int[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = 0;
            var3 = param0.length;
            if (var3 < 8) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              var4 = 0;
              L1: while (true) {
                if (var3 + -8 <= var4) {
                  var6 = var3 - 8;
                  var4 = var6;
                  L2: while (true) {
                    if (var6 >= var3) {
                      stackOut_21_0 = var2_int;
                      stackIn_22_0 = stackOut_21_0;
                      break L0;
                    } else {
                      L3: {
                        if (param0[var6] < 0) {
                          break L3;
                        } else {
                          if (param0[var6] >= dn.field_Sb.length) {
                            break L3;
                          } else {
                            var2_int = var2_int + dn.field_Sb[param0[var6]];
                            break L3;
                          }
                        }
                      }
                      if (param0[var6] != 34) {
                        var6++;
                        continue L2;
                      } else {
                        stackOut_18_0 = 6100;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      }
                    }
                  }
                } else {
                  L4: {
                    if (param0[var4] < 0) {
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("nn.G(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + 78 + 41);
        }
        return stackIn_22_0;
    }

    final static void a(int param0, int param1, int param2, int param3, wk param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
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
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var20 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var6_int = (-param2 + param1 << 8) / param4.field_z;
              param3 = param3 + param4.field_H;
              var7 = (param2 << 8) + param4.field_D * var6_int;
              param0 = param0 + param4.field_D;
              var8 = param3 * pb.field_c + param0;
              var9 = 0;
              var10 = param4.field_F;
              var11 = param4.field_A;
              var12 = -var11 + pb.field_c;
              var13 = 0;
              if (pb.field_l > param3) {
                var14 = pb.field_l - param3;
                var10 = var10 - var14;
                var9 = var9 + var11 * var14;
                param3 = pb.field_l;
                var8 = var8 + pb.field_c * var14;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 >= pb.field_i) {
                break L2;
              } else {
                var14 = pb.field_i + -param0;
                var7 = var7 + var14 * var6_int;
                var12 = var12 + var14;
                var13 = var13 + var14;
                var8 = var8 + var14;
                var11 = var11 - var14;
                var9 = var9 + var14;
                param0 = pb.field_i;
                break L2;
              }
            }
            L3: {
              if (~pb.field_d <= ~(var10 + param3)) {
                break L3;
              } else {
                var10 = var10 - (var10 + (param3 - pb.field_d));
                break L3;
              }
            }
            L4: {
              if (param0 - -var11 <= pb.field_b) {
                break L4;
              } else {
                var14 = param0 + var11 - pb.field_b;
                var12 = var12 + var14;
                var11 = var11 - var14;
                var13 = var13 + var14;
                break L4;
              }
            }
            L5: {
              if (0 >= var11) {
                break L5;
              } else {
                if (var10 <= 0) {
                  break L5;
                } else {
                  param3 = -var10;
                  L6: while (true) {
                    if (param3 >= 0) {
                      break L0;
                    } else {
                      var14 = var7;
                      param0 = -var11;
                      L7: while (true) {
                        if (0 <= param0) {
                          var8 = var8 + var12;
                          var9 = var9 + var13;
                          param3++;
                          continue L6;
                        } else {
                          L8: {
                            var15 = var14 >> 8;
                            var14 = var14 + var6_int;
                            var16 = 256 + -var15;
                            if (var15 < 0) {
                              var8++;
                              var9++;
                              break L8;
                            } else {
                              L9: {
                                int incrementValue$1 = var9;
                                var9++;
                                var17 = param4.field_E[incrementValue$1];
                                if (var17 != 0) {
                                  if (255 < var15) {
                                    pb.field_g[var8] = var17;
                                    break L9;
                                  } else {
                                    var18 = pb.field_g[var8];
                                    var19 = var16 * (var18 & 16711935) - -(var15 * (16711935 & var17)) >> 8 & 16711935;
                                    pb.field_g[var8] = ec.a(ec.a(65280, var17) * var15 + ec.a(var18, 65280) * var16 >> 8, 65280) + var19;
                                    break L9;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var8++;
                              break L8;
                            }
                          }
                          param0++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("nn.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param4 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + -1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Playing";
        field_c = new int[]{109, 23, 18, 16, -1, -1, -1, -1, -1, -1, -1};
    }
}
