/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn extends kd {
    char[] field_F;
    String field_D;
    static rf field_G;
    int[] field_C;
    char[] field_z;
    int[] field_A;
    static gh field_E;
    static int field_y;
    boolean field_B;

    final void a(int param0, gi param1) {
        int var3_int = 0;
        int var4 = SteelSentinels.field_G;
        try {
            while (true) {
                var3_int = param1.f((byte) -107);
                if (0 == var3_int) {
                    break;
                }
                this.a(param1, var3_int, (byte) -123);
            }
            var3_int = -10 % ((-28 - param0) / 36);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "mn.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() < hl.field_o) {
                  break L1;
                } else {
                  if (param1.length() <= hf.field_e) {
                    L2: {
                      if (param0 == -30157) {
                        break L2;
                      } else {
                        mn.g(59);
                        break L2;
                      }
                    }
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
            stackOut_4_0 = 1;
            stackIn_5_0 = stackOut_4_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("mn.E(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final void c(byte param0) {
        int var4 = 0;
        int var2 = 0;
        int var3 = SteelSentinels.field_G;
        if (this.field_A != null) {
            for (var2 = 0; var2 < this.field_A.length; var2++) {
                this.field_A[var2] = vn.a(this.field_A[var2], 32768);
            }
        }
        if (param0 != -3) {
            this.field_F = (char[]) null;
        }
        if (null != this.field_C) {
            var4 = 0;
            var2 = var4;
            while (var4 < this.field_C.length) {
                this.field_C[var4] = vn.a(this.field_C[var4], 32768);
                var4++;
            }
        }
    }

    private final void a(gi param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        char[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        char stackOut_16_2 = 0;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        char[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        char[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        char stackOut_8_2 = 0;
        char[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (1 == param1) {
                this.field_D = param0.h(1);
                break L1;
              } else {
                if ((param1 ^ -1) == -3) {
                  var4_int = param0.f((byte) -59);
                  this.field_C = new int[var4_int];
                  this.field_z = new char[var4_int];
                  var5 = 0;
                  L2: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      L3: {
                        this.field_C[var5] = param0.c((byte) -60);
                        var6 = param0.d((byte) -2);
                        stackOut_14_0 = this.field_z;
                        stackOut_14_1 = var5;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (var6 != 0) {
                          stackOut_16_0 = (char[]) ((Object) stackIn_16_0);
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = eh.a((byte) -71, (byte) var6);
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          break L3;
                        } else {
                          stackOut_15_0 = (char[]) ((Object) stackIn_15_0);
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = 0;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_17_2 = stackOut_15_2;
                          break L3;
                        }
                      }
                      stackIn_17_0[stackIn_17_1] = (char) stackIn_17_2;
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (-4 != (param1 ^ -1)) {
                    if (param1 != 4) {
                      break L1;
                    } else {
                      this.field_B = true;
                      break L1;
                    }
                  } else {
                    var4_int = param0.f((byte) -66);
                    this.field_F = new char[var4_int];
                    this.field_A = new int[var4_int];
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        L5: {
                          this.field_A[var5] = param0.c((byte) -60);
                          var6 = param0.d((byte) -2);
                          stackOut_6_0 = this.field_F;
                          stackOut_6_1 = var5;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (0 != var6) {
                            stackOut_8_0 = (char[]) ((Object) stackIn_8_0);
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = eh.a((byte) -71, (byte) var6);
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            break L5;
                          } else {
                            stackOut_7_0 = (char[]) ((Object) stackIn_7_0);
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = 0;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            break L5;
                          }
                        }
                        stackIn_9_0[stackIn_9_1] = (char) stackIn_9_2;
                        var5++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
            var4_int = -16 % ((param2 - 46) / 58);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var4);
            stackOut_21_1 = new StringBuilder().append("mn.B(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void g(int param0) {
        field_G = null;
        field_E = null;
        if (param0 != 1) {
            field_E = (gh) null;
        }
    }

    final static java.awt.Frame a(int param0, int param1, pn param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        vc[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        vc[] var10 = null;
        wj var11 = null;
        Object stackIn_8_0 = null;
        Object stackIn_27_0 = null;
        java.awt.Frame stackIn_33_0 = null;
        Object stackIn_39_0 = null;
        java.awt.Frame stackIn_41_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_26_0 = null;
        Object stackOut_7_0 = null;
        java.awt.Frame stackOut_40_0 = null;
        Object stackOut_38_0 = null;
        java.awt.Frame stackOut_32_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            if (param2.b(-98)) {
              L1: {
                if (0 == param4) {
                  var10 = nc.a(38, param2);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var10.length <= var8) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_26_0 = null;
                          stackIn_27_0 = stackOut_26_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        if (param3 == var10[var8].field_a) {
                          L3: {
                            if (var10[var8].field_g == param1) {
                              L4: {
                                if (param5 == 0) {
                                  break L4;
                                } else {
                                  if (var10[var8].field_i == param5) {
                                    break L4;
                                  } else {
                                    var8++;
                                    continue L2;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (var10[var8].field_j > param4) {
                                    break L5;
                                  } else {
                                    var8++;
                                    continue L2;
                                  }
                                }
                              }
                              var7_int = 1;
                              param4 = var10[var8].field_j;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          var8++;
                          continue L2;
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    stackOut_7_0 = null;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param2.a(param1, param5, param4, param3, 6);
              L6: while (true) {
                if (0 != var11.field_a) {
                  if (param0 == 22230) {
                    var7 = (java.awt.Frame) (var11.field_c);
                    if (var7 != null) {
                      if ((var11.field_a ^ -1) != -3) {
                        stackOut_40_0 = (java.awt.Frame) (var7);
                        stackIn_41_0 = stackOut_40_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        ok.a(-1, param2, var7);
                        stackOut_38_0 = null;
                        stackIn_39_0 = stackOut_38_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    stackOut_32_0 = (java.awt.Frame) null;
                    stackIn_33_0 = stackOut_32_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  a.a((byte) 127, 10L);
                  continue L6;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var6);
            stackOut_42_1 = new StringBuilder().append("mn.D(").append(param0).append(',').append(param1).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param2 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L7;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L7;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_8_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_27_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_33_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (java.awt.Frame) ((Object) stackIn_39_0);
              } else {
                return stackIn_41_0;
              }
            }
          }
        }
    }

    mn() {
        this.field_B = false;
    }

    static {
        field_G = new rf();
        field_y = 0;
    }
}
