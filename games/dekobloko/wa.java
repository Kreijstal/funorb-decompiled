/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static String field_b;
    static int field_c;
    static String field_e;
    static w field_a;
    static String field_f;
    static int[] field_d;

    final static ig a(int[] param0, w param1, byte param2, w param3, w param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        ig[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        me var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        ig stackIn_3_0 = null;
        Object stackIn_12_0 = null;
        ig stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        ig stackOut_13_0 = null;
        ig stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var12 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 == -127) {
              var5_int = param0.length;
              var6 = new String[var5_int];
              var14 = new char[var5_int];
              var13 = var14;
              var7 = var13;
              var8 = new ig[var5_int];
              var9 = 49;
              try {
                L1: {
                  var10_int = 0;
                  L2: while (true) {
                    L3: {
                      if (var5_int <= var10_int) {
                        break L3;
                      } else {
                        var11 = wj.field_Qb.a(126, param0[var10_int]);
                        var6[var10_int] = var11.f((byte) -92);
                        var9 = (char)(var9 + 1);
                        var7[var10_int] = (char)var9;
                        var8[var10_int] = null;
                        var10_int++;
                        if (var12 != 0) {
                          break L3;
                        } else {
                          continue L2;
                        }
                      }
                    }
                    break L1;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var10 = (Exception) (Object) decompiledCaughtException;
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                return (ig) ((Object) stackIn_12_0);
              }
              stackOut_13_0 = new ig(0L, param1, param3, param4, var8, param0, var6, var14);
              stackIn_14_0 = stackOut_13_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = (ig) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("wa.D(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_14_0;
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        ff var4 = null;
        sb var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (ff) ((Object) cd.field_c.c((byte) 119));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    mc.a(true, var4, param1);
                    var4 = (ff) ((Object) cd.field_c.d(true));
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 3) {
                  break L2;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
              var5 = (sb) ((Object) ef.field_S.c((byte) 80));
              L4: while (true) {
                if (var5 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  oi.a(param0 ^ -87, param1, var5);
                  var5 = (sb) ((Object) ef.field_S.d(true));
                  if (var3 == 0) {
                    continue L4;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "wa.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static w a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, mm param12) {
        ig discarded$1 = null;
        w var13 = null;
        RuntimeException var13_ref = null;
        w var14 = null;
        w stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        w stackOut_2_0 = null;
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
              var13 = new w(0L, (w) null);
              var13.field_lb = df.a(param9, 0, param6);
              var13.field_S = df.a(param3, 0, param1);
              var13.field_eb = df.a(param0, 0, param5);
              var13.field_Q = df.a(param4, param11 + 24447, param8);
              var13.field_Ab = df.a(param10, 0, param7);
              var13.field_G = param2;
              if (param11 == -24447) {
                break L1;
              } else {
                var14 = (w) null;
                discarded$1 = wa.a((int[]) null, (w) null, (byte) -92, (w) null, (w) null);
                break L1;
              }
            }
            var13.field_J = param12;
            stackOut_2_0 = (w) (var13);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var13_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var13_ref);
            stackOut_4_1 = new StringBuilder().append("wa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param12 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 18) {
          wa.a(-113, -90);
          field_a = null;
          field_d = null;
          field_f = null;
          field_e = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_f = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var9 = client.field_A ? 1 : 0;
          if ((param6 ^ -1) > -81) {
            stackOut_2_0 = param6 / 20 * 18;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 54;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var7 = stackIn_3_0;
        var8 = 0;
        if ((param6 ^ -1) <= -61) {
          if ((param6 ^ -1) > -81) {
            var7 = var7 + vl.a(23841, 80, 18 * param1 - -40);
            if (var9 != 0) {
              if (93 <= param6) {
                hk.a(param3 - 3, param2 + 36 - 3, 60, 60, 4, 65280, 100);
                if (var9 == 0) {
                  cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
                  cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
                  cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
                  cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
                  fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
                  fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
                  fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
                  fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
                  return;
                } else {
                  var8 = vl.a(23841, 80, ve.field_ic[1 + param6 - 80] * 18 + 40);
                  var7 = var7 + vl.a(23841, 80, 40 + 18 * param0);
                  cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
                  cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
                  cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
                  cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
                  fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
                  fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
                  fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
                  fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
                  return;
                }
              } else {
                L1: {
                  var8 = vl.a(23841, 80, ve.field_ic[1 + param6 - 80] * 18 + 40);
                  if (var9 == 0) {
                    break L1;
                  } else {
                    var7 = var7 + vl.a(23841, 80, 40 + 18 * param0);
                    break L1;
                  }
                }
                cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
                cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
                cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
                cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
                fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
                fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
                fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
                fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
                return;
              }
            } else {
              cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
              cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
              cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
              cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
              fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
              fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
              fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
              fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
              return;
            }
          } else {
            if (93 <= param6) {
              hk.a(param3 - 3, param2 + 36 - 3, 60, 60, 4, 65280, 100);
              if (var9 == 0) {
                cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
                cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
                cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
                cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
                fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
                fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
                fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
                fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
                return;
              } else {
                var8 = vl.a(23841, 80, ve.field_ic[1 + param6 - 80] * 18 + 40);
                var7 = var7 + vl.a(23841, 80, 40 + 18 * param0);
                cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
                cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
                cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
                cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
                fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
                fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
                fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
                fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
                return;
              }
            } else {
              L2: {
                var8 = vl.a(23841, 80, ve.field_ic[1 + param6 - 80] * 18 + 40);
                if (var9 == 0) {
                  break L2;
                } else {
                  var7 = var7 + vl.a(23841, 80, 40 + 18 * param0);
                  break L2;
                }
              }
              cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
              cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
              cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
              cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
              fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
              fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
              fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
              fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
              return;
            }
          }
        } else {
          var7 = var7 + vl.a(23841, 80, 40 + 18 * param0);
          cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
          cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
          cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
          cg.a(param5, 2, 1, param3 + 18, param2 + 72 - -1, 1, -2);
          fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
          fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
          fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
          fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
          return;
        }
    }

    static {
        field_b = "Invalid password.";
        field_f = "You can join this game";
        field_e = "Send private Quick Chat to <%0>";
    }
}
