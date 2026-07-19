/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dr extends ms {
    static String field_y;
    static String field_D;
    Class[] field_u;
    String field_A;
    static int[] field_z;
    static String field_w;
    static String[] field_C;
    String field_B;
    static String field_x;
    static int[][] field_v;

    public final String toString() {
        return this.field_A;
    }

    abstract nd a(int param0, nd[] param1);

    public static void d(byte param0) {
        field_D = null;
        field_v = (int[][]) null;
        field_y = null;
        field_C = null;
        field_w = null;
        field_z = null;
        field_x = null;
        if (param0 <= 68) {
            field_w = (String) null;
        }
    }

    final static void a(int param0, byte param1, int param2, nr param3) {
        RuntimeException runtimeException = null;
        nr var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 96) {
                break L1;
              } else {
                var5 = (nr) null;
                dr.a(125, (byte) -9, 20, (nr) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("dr.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final boolean a(String param0, byte param1, nd[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Class var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_6_0 = 0;
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
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!this.field_B.equals(param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_u.length == param2.length) {
                var4_int = -96 / ((-2 - param1) / 52);
                var5 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var5 >= this.field_u.length) {
                        break L3;
                      } else {
                        stackOut_10_0 = param2[var5].field_e;
                        stackIn_31_0 = stackOut_10_0 ? 1 : 0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var7 != 0) {
                          break L2;
                        } else {
                          L4: {
                            if (stackIn_11_0) {
                              L5: {
                                var6 = cq.a(param2[var5].field_c, (byte) -75);
                                if (Boolean.TYPE != var6) {
                                  break L5;
                                } else {
                                  if (this.field_u[var5] != Boolean.TYPE) {
                                    stackOut_18_0 = 0;
                                    stackIn_19_0 = stackOut_18_0;
                                    decompiledRegionSelector0 = 4;
                                    break L0;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L6: {
                                if (Character.TYPE != var6) {
                                  break L6;
                                } else {
                                  if (this.field_u[var5] == Character.TYPE) {
                                    break L6;
                                  } else {
                                    stackOut_22_0 = 0;
                                    stackIn_23_0 = stackOut_22_0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                }
                              }
                              if (!rt.a(false, var6)) {
                                break L4;
                              } else {
                                if (!rt.a(false, this.field_u[var5])) {
                                  stackOut_27_0 = 0;
                                  stackIn_28_0 = stackOut_27_0;
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                } else {
                                  break L4;
                                }
                              }
                            } else {
                              if (this.field_u[var5].isInstance(param2[var5].field_c)) {
                                break L4;
                              } else {
                                stackOut_13_0 = 0;
                                stackIn_14_0 = stackOut_13_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                          var5++;
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_30_0 = 1;
                    stackIn_31_0 = stackOut_30_0;
                    break L2;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var4);
            stackOut_32_1 = new StringBuilder().append("dr.E(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L7;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L7;
            }
          }
          L8: {
            stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param1).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param2 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L8;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_31_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0 != 0;
                  } else {
                    return stackIn_28_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    dr(String param0, Class[] param1, String param2) {
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        RuntimeException runtimeException = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder var7 = null;
        StringBuilder var8 = null;
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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
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
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.field_u = param1;
            this.field_B = param0;
            var7 = new StringBuilder(this.field_B).append('(');
            var8 = var7;
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 >= this.field_u.length) {
                    break L3;
                  } else {
                    discarded$12 = var7.append(hw.a(640, this.field_u[var5]));
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (-1 + this.field_u.length <= var5) {
                          break L4;
                        } else {
                          discarded$13 = var8.append(", ");
                          break L4;
                        }
                      }
                      var5++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                discarded$14 = var8.append(')');
                break L2;
              }
              L5: {
                if (param2 == null) {
                  break L5;
                } else {
                  discarded$15 = var8.append("     <col=ffaaff>" + param2 + "</col>");
                  break L5;
                }
              }
              this.field_A = var8.toString();
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (runtimeException);
            stackOut_12_1 = new StringBuilder().append("dr.<init>(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          L7: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          L8: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    static {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        field_y = "Manoeuvres";
        field_D = "Close";
        field_w = "(+<%0>)";
        field_C = new String[]{"Showing by rating", "Showing by win percentage"};
        field_x = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_z = new int[16];
        for (var0 = 0; field_z.length > var0; var0++) {
            var1 = var0 - -1;
            field_z[var0] = Math.min(oe.c(oe.c(rn.a(var1 << -662008272, 16729482), rn.a(-2046820097, var1) << -2095792888), rn.a(var1 << 1918708674, 252)), 267583488);
            field_z[var0] = oe.c(rn.a(16515326, field_z[var0]), rn.a(32512, field_z[var0] >> -1888637087));
            var2 = gq.a(field_z[var0]);
            var2 = var2 & 655359;
            var3 = 255 & var2;
            if (!((var3 ^ -1) >= -6)) {
                var3 = 5;
            }
            var2 = -256 & var2 | var3;
            field_z[var0] = gq.b(var2);
        }
        field_v = new int[8][16];
    }
}
