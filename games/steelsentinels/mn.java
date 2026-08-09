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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
            stackIn_5_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("mn.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
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
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
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
                        stackIn_16_0 = this.field_z;

                        stackIn_16_1 = var5;

                        if (var6 != 0) {
                          stackIn_17_0 = (char[]) ((Object) stackIn_16_0);
                          stackIn_17_1 = stackIn_16_1;
                          stackIn_17_2 = eh.a((byte) -71, (byte) var6);
                          break L3;
                        } else {
                          stackIn_17_0 = (char[]) ((Object) stackIn_16_0);
                          stackIn_17_1 = stackIn_16_1;
                          stackIn_17_2 = 0;
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
                          stackIn_8_0 = this.field_F;

                          stackIn_8_1 = var5;

                          if (0 != var6) {
                            stackIn_9_0 = (char[]) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = eh.a((byte) -71, (byte) var6);
                            break L5;
                          } else {
                            stackIn_9_0 = (char[]) ((Object) stackIn_8_0);
                            stackIn_9_1 = stackIn_8_1;
                            stackIn_9_2 = 0;
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
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("mn.B(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
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
        Object stackIn_8_0 = null;
        Object stackIn_27_0 = null;
        java.awt.Frame stackIn_33_0 = null;
        Object stackIn_39_0 = null;
        java.awt.Frame stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        vc[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        vc[] var10 = null;
        wj var11 = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            if (param2.b(-98)) {
              L1: {
                if (0 == param4) {
                  var10 = nc.a(38, param2);
                  var6 = var10;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var10.length <= var8) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackIn_27_0 = null;
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
                    stackIn_8_0 = null;
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
                        stackIn_41_0 = (java.awt.Frame) (var7);
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        ok.a(-1, param2, var7);
                        stackIn_39_0 = null;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    stackIn_33_0 = (java.awt.Frame) null;
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
            var6_ref = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var6_ref);

            stackIn_44_1 = new StringBuilder().append("mn.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L7;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
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
