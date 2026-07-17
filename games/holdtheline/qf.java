/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qf extends gd {
    private nk field_m;
    static int[] field_i;
    static long field_l;
    static float[] field_k;
    static int field_j;

    final static void a(ei param0, vj param1, int param2, int param3, int param4, vj param5, int param6, ei param7) {
        RuntimeException var8 = null;
        int var10_int = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        gj var14 = null;
        gj var15 = null;
        Object var16 = null;
        Object var17 = null;
        Object var18 = null;
        Object var19 = null;
        lb var20 = null;
        lb var21 = null;
        gj var22 = null;
        lb var23 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var16 = null;
        var18 = null;
        var17 = null;
        var19 = null;
        var13 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param1.field_k - param5.field_k > 1) {
                break L1;
              } else {
                if (param1.field_k - param5.field_k < -1) {
                  break L1;
                } else {
                  L2: {
                    if (param1 instanceof lb) {
                      var21 = (lb) (Object) param1;
                      if (param5 instanceof lb) {
                        var23 = (lb) (Object) param5;
                        if (!th.a(-1, var21, var23)) {
                          break L2;
                        } else {
                          var10 = mm.field_d + (float)param4;
                          var11 = (float)param6 + lk.field_b;
                          oe.a(var11, param2, param7, (byte) 63, var10, param0);
                          break L2;
                        }
                      } else {
                        L3: {
                          var22 = (gj) (Object) param5;
                          var10_int = ba.a(var21, 0, var22);
                          if (var10_int >= 1) {
                            var11 = (float)param4 + mm.field_d;
                            var12 = (float)param6 + var22.b(lk.field_b, -7517);
                            oe.a(var12, param2, param7, (byte) 113, var11, param0);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        if (var10_int != 2) {
                          break L2;
                        } else {
                          var11 = rb.field_g + (float)param4;
                          var12 = var22.b(cj.field_G, -7517) + (float)param6;
                          oe.a(var12, param2, param7, (byte) 127, var11, param0);
                          break L2;
                        }
                      }
                    } else {
                      var14 = (gj) (Object) param1;
                      if (param5 instanceof lb) {
                        L4: {
                          var20 = (lb) (Object) param5;
                          var10_int = ba.a(var20, 0, var14);
                          if (var10_int < 1) {
                            break L4;
                          } else {
                            var11 = (float)param4 + var14.b(lk.field_b, -7517);
                            var12 = mm.field_d + (float)param6;
                            oe.a(var12, param2, param7, (byte) 62, var11, param0);
                            break L4;
                          }
                        }
                        if (var10_int == 2) {
                          var11 = var14.b(cj.field_G, -7517) + (float)param4;
                          var12 = rb.field_g + (float)param6;
                          oe.a(var12, param2, param7, (byte) 78, var11, param0);
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        L5: {
                          var15 = (gj) (Object) param5;
                          int discarded$1 = -6218;
                          var10_int = i.a(var15, var14);
                          if (var10_int >= 1) {
                            var11 = var14.b(mm.field_d, -7517) + (float)param4;
                            var12 = var15.b(lk.field_b, -7517) + (float)param6;
                            oe.a(var12, param2, param7, (byte) 110, var11, param0);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        if (var10_int != 2) {
                          break L2;
                        } else {
                          var11 = (float)param4 + var14.b(rb.field_g, -7517);
                          var12 = (float)param6 + var15.b(cj.field_G, -7517);
                          oe.a(var12, param2, param7, (byte) 91, var11, param0);
                          break L2;
                        }
                      }
                    }
                  }
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var8;
            stackOut_26_1 = new StringBuilder().append("qf.BA(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L6;
            }
          }
          L7: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          L8: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44).append(param2).append(44).append(-3).append(44).append(param4).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param5 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L8;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L8;
            }
          }
          L9: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(44).append(param6).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param7 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L9;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L9;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 41);
        }
    }

    qf(nk param0, nk param1) {
        super(param0);
        try {
            ((qf) this).field_m = param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "qf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3) {
        if (!(pj.b((byte) 80))) {
            wm.a(param3, false, param0);
            return;
        }
        ej.field_b = param0;
        if (~ej.field_b == ~dg.field_c) {
            return;
        }
        lm.field_a = dg.field_c;
        if (dg.field_c == 13) {
            ((ec) (Object) l.field_a[dg.field_c]).d((byte) -126);
            vg.field_G = 1;
            gg.field_L = true;
            return;
        }
        if (dg.field_c == -1) {
            vg.field_G = 1;
            gg.field_L = true;
            return;
        }
        ((ti) (Object) l.field_a[dg.field_c]).i(74);
        vg.field_G = 1;
        gg.field_L = true;
    }

    final static void a(int param0, int param1, byte[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            var3_int = 256;
            var4 = new int[256];
            var5 = 0;
            L1: while (true) {
              if (var5 >= 256) {
                var3_int += 256;
                var7 = 0;
                var5 = var7;
                L2: while (true) {
                  if (var7 >= 256) {
                    break L0;
                  } else {
                    param2[var3_int] = (byte)(param2[var3_int] + -param1);
                    var3_int = var3_int + var4[var7];
                    var7++;
                    continue L2;
                  }
                }
              } else {
                int incrementValue$2 = var3_int;
                var3_int++;
                var4[var5] = pk.a((int) param2[incrementValue$2], 255);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("qf.U(").append(0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final fd a(String param0, byte param1) {
        ia var3 = null;
        RuntimeException var3_ref = null;
        fd stackIn_8_0 = null;
        fd stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        fd stackOut_7_0 = null;
        fd stackOut_11_0 = null;
        fd stackOut_10_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 52) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            L2: {
              if (((qf) this).field_m instanceof wk) {
                var3 = ((wk) (Object) ((qf) this).field_m).a(1);
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.b(-7447) != tg.field_d) {
                    stackOut_7_0 = g.field_k;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (!param0.equals((Object) (Object) ((qf) this).field_m.field_q)) {
                stackOut_11_0 = g.field_k;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = tg.field_d;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("qf.N(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        return stackIn_12_0;
    }

    final static void a() {
        ja.a(-1848651292, en.a(95));
    }

    public static void g() {
        field_k = null;
        field_i = null;
    }

    final static ui a(int param0, el param1) {
        RuntimeException var2 = null;
        ui stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ui stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 293) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            stackOut_2_0 = lg.a(db.a(param1, 100, 96), (byte) -68);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("qf.AA(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static boolean a(byte param0, ee param1, ee param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_17_0 = false;
        boolean stackIn_21_0 = false;
        int stackIn_23_0 = 0;
        boolean stackIn_25_0 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_16_0 = false;
        boolean stackOut_24_0 = false;
        int stackOut_22_0 = 0;
        boolean stackOut_20_0 = false;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (!param1.field_z) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param2.field_z) {
                L1: {
                  if (param1.field_q + -param2.field_q > 1) {
                    break L1;
                  } else {
                    if (param1.field_q + -param2.field_q < -1) {
                      break L1;
                    } else {
                      if ((param2.field_A.field_f - param1.field_A.field_f) * (param2.field_A.field_f + -param1.field_A.field_f) + (-param1.field_A.field_h + param2.field_A.field_h) * (-param1.field_A.field_h + param2.field_A.field_h) <= (param2.field_B + param1.field_B) * (param2.field_B + param1.field_B)) {
                        L2: {
                          if (!param1.field_p) {
                            break L2;
                          } else {
                            if (!param2.field_p) {
                              break L2;
                            } else {
                              int discarded$1 = 7527;
                              stackOut_16_0 = jf.a(param1.field_w, param1.field_A, param2.field_i, param1.field_k, param2.field_w, param2.field_k, param1.field_i, param2.field_A);
                              stackIn_17_0 = stackOut_16_0;
                              return stackIn_17_0;
                            }
                          }
                        }
                        if (param1.field_p) {
                          stackOut_24_0 = ck.a(param2.field_B, true, param1.field_i, param2.field_A, param1.field_A, param1.field_k, param1.field_w);
                          stackIn_25_0 = stackOut_24_0;
                          break L0;
                        } else {
                          if (!param2.field_p) {
                            stackOut_22_0 = 1;
                            stackIn_23_0 = stackOut_22_0;
                            return stackIn_23_0 != 0;
                          } else {
                            stackOut_20_0 = ca.a(param1.field_A, param2.field_i, param2.field_A, param1.field_B, param2.field_w, param2.field_k, 110);
                            stackIn_21_0 = stackOut_20_0;
                            return stackIn_21_0;
                          }
                        }
                      } else {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0 != 0;
                      }
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("qf.T(").append(-73).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L3;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L3;
            }
          }
          L4: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L4;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 41);
        }
        return stackIn_25_0;
    }

    final String a(String param0, boolean param1) {
        ia var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_7_0 = null;
        String stackOut_11_0 = null;
        Object stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (!(((qf) this).field_m instanceof wk)) {
                break L1;
              } else {
                var3 = ((wk) (Object) ((qf) this).field_m).a(1);
                if (var3 != null) {
                  L2: {
                    if (var3.b(-7447) != tg.field_d) {
                      break L2;
                    } else {
                      if (param0.equals((Object) (Object) ((qf) this).field_m.field_q)) {
                        break L2;
                      } else {
                        stackOut_5_0 = jd.field_L;
                        stackIn_6_0 = stackOut_5_0;
                        return stackIn_6_0;
                      }
                    }
                  }
                  stackOut_7_0 = var3.b((byte) -59);
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                } else {
                  break L1;
                }
              }
            }
            if (!param0.equals((Object) (Object) ((qf) this).field_m.field_q)) {
              stackOut_11_0 = jd.field_L;
              stackIn_12_0 = stackOut_11_0;
              return stackIn_12_0;
            } else {
              if (!param1) {
                field_l = 24L;
                stackOut_15_0 = null;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("qf.L(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 41);
        }
        return (String) (Object) stackIn_16_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new float[]{1.5f, 1.25f, 1.0f};
    }
}
