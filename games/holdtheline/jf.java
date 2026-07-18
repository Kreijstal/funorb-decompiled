/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jf {
    static uf field_a;
    static int field_b;
    static go field_c;
    static oa field_d;

    final static void a(int param0, int param1, byte param2, int param3) {
        L0: {
          L1: {
            if (-1 == on.field_v[param1][param3]) {
              break L1;
            } else {
              if (on.field_v[param1][param3] > param0) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          on.field_v[param1][param3] = param0;
          tn.a(0);
          break L0;
        }
    }

    final static boolean a(in param0, qm param1, int param2, int param3, in param4, int param5, int param6, qm param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        int var20_int = 0;
        float var20 = 0.0f;
        float var21 = 0.0f;
        int var22 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var22 = HoldTheLine.field_D;
        try {
          L0: {
            var9_int = -param7.field_h + param1.field_h;
            var10 = -param7.field_f + param1.field_f;
            var11 = Math.abs(param0.field_j * param4.field_j + param0.field_g * param4.field_g);
            var12 = Math.abs(-(param0.field_g * param4.field_j) + param0.field_j * param4.field_g);
            var13 = var12;
            var14 = var11;
            var15 = param4.field_j * (float)var9_int + (float)var10 * param4.field_g;
            var16 = (float)var9_int * param4.field_g - (float)var10 * param4.field_j;
            var17 = (float)var10 * param0.field_g + param0.field_j * (float)var9_int;
            var18 = param0.field_g * (float)var9_int - param0.field_j * (float)var10;
            le.field_s[0] = (float)(-param5) + (-(var13 * (float)param6) - var11 * (float)param3 + Math.abs(var15));
            if (le.field_s[0] > 0.0f) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              le.field_s[1] = -(var14 * (float)param6) - var12 * (float)param3 + Math.abs(var16) - (float)param2;
              if (le.field_s[1] > 0.0f) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                le.field_s[2] = -((float)param2 * var12) - (float)param5 * var11 + Math.abs(var17) - (float)param3;
                if (le.field_s[2] > 0.0f) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0 != 0;
                } else {
                  le.field_s[3] = Math.abs(var18) - (var14 * (float)param2 + (float)param5 * var13) - (float)param6;
                  if (0.0f >= le.field_s[3]) {
                    ek.field_o = 0;
                    var19 = le.field_s[0];
                    var20_int = 1;
                    L1: while (true) {
                      if (var20_int >= 4) {
                        kk.field_k = -var19;
                        if (ek.field_o != 0) {
                          L2: {
                            if (ek.field_o == 2) {
                              L3: {
                                vl.field_c = param4.a((byte) -74);
                                var20 = (float)param3 * (ln.a(-29407, param0.a(param4, true)) * param0.field_j) + (float)param6 * (ln.a(-29407, param0.a(param4, (byte) -10)) * param0.field_g);
                                var21 = (float)param3 * (ln.a(-29407, param0.a(param4, true)) * param0.field_g) - (float)param6 * (ln.a(-29407, param0.a(param4, (byte) -10)) * param0.field_j);
                                if (0.0f < var16) {
                                  vl.field_c.a(-1.0f, -1);
                                  var21 = -var21;
                                  ek.field_o = ek.field_o + 1;
                                  var20 = -var20;
                                  break L3;
                                } else {
                                  break L3;
                                }
                              }
                              mm.field_d = (float)param1.field_h + var20;
                              lk.field_b = (float)param1.field_f + var21;
                              break L2;
                            } else {
                              if (ek.field_o != 4) {
                                L4: {
                                  vl.field_c = param0.a((byte) -81);
                                  var20 = ln.a(-29407, param4.a(param0, true)) * param4.field_j * (float)param5 + (float)param2 * (ln.a(-29407, param4.a(param0, (byte) -10)) * param4.field_g);
                                  var21 = (float)param5 * (ln.a(-29407, param4.a(param0, true)) * param4.field_g) - ln.a(-29407, param4.a(param0, (byte) -10)) * param4.field_j * (float)param2;
                                  if (var18 > 0.0f) {
                                    vl.field_c.a(-1.0f, -1);
                                    var21 = -var21;
                                    var20 = -var20;
                                    ek.field_o = ek.field_o + 1;
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                                lk.field_b = var21 + (float)param7.field_f;
                                mm.field_d = (float)param7.field_h + var20;
                                break L2;
                              } else {
                                L5: {
                                  vl.field_c = new in(param0);
                                  var20 = (float)param5 * (ln.a(-29407, param4.a(param0, (byte) -10)) * param4.field_j) - ln.a(-29407, param4.a(param0, true)) * param4.field_g * (float)param2;
                                  var21 = (float)param5 * (ln.a(-29407, param4.a(param0, (byte) -10)) * param4.field_g) + ln.a(-29407, param4.a(param0, true)) * param4.field_j * (float)param2;
                                  if (0.0f < var17) {
                                    vl.field_c.a(-1.0f, -1);
                                    ek.field_o = ek.field_o + 1;
                                    var20 = -var20;
                                    var21 = -var21;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                mm.field_d = var20 + (float)param7.field_h;
                                lk.field_b = var21 + (float)param7.field_f;
                                break L2;
                              }
                            }
                          }
                          stackOut_41_0 = 1;
                          stackIn_42_0 = stackOut_41_0;
                          break L0;
                        } else {
                          L6: {
                            vl.field_c = new in(param4);
                            var20 = ln.a(-29407, param0.a(param4, (byte) -10)) * param0.field_j * (float)param3 - ln.a(-29407, param0.a(param4, true)) * param0.field_g * (float)param6;
                            var21 = (float)param3 * (ln.a(-29407, param0.a(param4, (byte) -10)) * param0.field_g) + ln.a(-29407, param0.a(param4, true)) * param0.field_j * (float)param6;
                            if (var15 > 0.0f) {
                              vl.field_c.a(-1.0f, -1);
                              var21 = -var21;
                              var20 = -var20;
                              ek.field_o = ek.field_o + 1;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          mm.field_d = var20 + (float)param1.field_h;
                          lk.field_b = (float)param1.field_f + var21;
                          return true;
                        }
                      } else {
                        L7: {
                          if (var19 < le.field_s[var20_int]) {
                            var19 = le.field_s[var20_int];
                            ek.field_o = var20_int * 2;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var20_int++;
                        continue L1;
                      }
                    }
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0 != 0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var9 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var9;
            stackOut_43_1 = new StringBuilder().append("jf.B(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L8;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L8;
            }
          }
          L9: {
            stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param1 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L9;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L9;
            }
          }
          L10: {
            stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param4 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L10;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L10;
            }
          }
          L11: {
            stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
            stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param7 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L11;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L11;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + ',' + 7527 + ')');
        }
        return stackIn_42_0 != 0;
    }

    abstract void a(java.awt.Component param0, byte param1);

    abstract int a(byte param0);

    final static short[] a(short[] param0, int param1, da param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_15_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            var4_int = param2.h(16, 7);
            if (var4_int != 0) {
              L1: {
                L2: {
                  field_a = null;
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (param0.length != var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param0 = new short[var4_int];
                break L1;
              }
              L3: {
                var5 = param2.h(4, 7);
                var6 = (short)param2.h(16, 7);
                if (0 >= var5) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param0[var7] = (short)var6;
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param0[var7] = (short)(var6 + param2.h(var5, 7));
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_15_0 = (short[]) param0;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (short[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("jf.A(");
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
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(16).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + false + ')');
        }
        return stackIn_16_0;
    }

    public static void b() {
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final static void a() {
        if (rc.field_c.length > kn.field_a) {
            int fieldTemp$1 = kn.field_a;
            kn.field_a = kn.field_a + 1;
            kf.field_q = rc.field_c[fieldTemp$1];
        } else {
            kf.field_q = null;
        }
    }

    abstract void a(java.awt.Component param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
    }
}
