/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class gj extends qa implements wg {
    static dd[] field_E;
    vc field_C;
    static rk field_A;
    static String field_D;
    static String[] field_B;

    gj(int param0, int param1, int param2, int param3, ch param4) {
        super(param0, param1, param2, param3, param4, (kd) null);
        this.field_C = new vc();
    }

    final boolean a(qa param0, int param1) {
        we var3 = null;
        RuntimeException var3_ref = null;
        qa var4 = null;
        int var5 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var3 = new we(this.field_C);
            var4 = (qa) ((Object) var3.b(87));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var4.a(param0, -118);
                    stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0) {
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        var4 = (qa) ((Object) var3.c(-6144));
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_9_0 = param1;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              L4: {
                if (stackIn_10_0 < -26) {
                  break L4;
                } else {
                  this.d((byte) -117);
                  break L4;
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3_ref);
            stackOut_14_1 = new StringBuilder().append("gj.A(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    final StringBuilder a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (this.a(param1, -62, param0, param2)) {
                this.a(param2, -37, param0, param1);
                this.b(param0, param1, 0, param2);
                break L1;
              } else {
                break L1;
              }
            }
            if (param3 < -47) {
              stackOut_6_0 = (StringBuilder) (param0);
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_4_0 = (StringBuilder) null;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("gj.S(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void f(int param0) {
        we var2 = null;
        qa var3 = null;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        var2 = new we(this.field_C);
        if (param0 == -1) {
          var3 = (qa) ((Object) var2.b(-74));
          L0: while (true) {
            if (var3 != null) {
              var3.f(-1);
              var3 = (qa) ((Object) var2.c(-6144));
              if (var4 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.d((byte) 84);
    }

    private final void d(byte param0) {
        we var2 = null;
        qa var3 = null;
        int var4 = 0;
        we var5 = null;
        we var8 = null;
        var4 = fleas.field_A ? 1 : 0;
        if (param0 == 84) {
          var5 = new we(this.field_C);
          var2 = var5;
          var3 = (qa) ((Object) var5.b(73));
          L0: while (true) {
            if (var3 != null) {
              var3.b(false);
              var3 = (qa) ((Object) var5.c(-6144));
              if (var4 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          field_B = (String[]) null;
          var8 = new we(this.field_C);
          var2 = var8;
          var3 = (qa) ((Object) var8.b(73));
          L1: while (true) {
            if (var3 != null) {
              var3.b(false);
              var3 = (qa) ((Object) var8.c(-6144));
              if (var4 == 0) {
                continue L1;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
        we var7 = null;
        RuntimeException var7_ref = null;
        qa var8 = null;
        int var9 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        byte stackOut_6_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var7 = new we(this.field_C);
            var8 = (qa) ((Object) var7.b(-128));
            L1: while (true) {
              L2: {
                L3: {
                  if (var8 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var8.b((byte) -54);
                    stackIn_7_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        var8.a((byte) 5, param1, param2 + this.field_y, param3, param4, this.field_z + param5);
                        var8 = (qa) ((Object) var7.c(-6144));
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_6_0 = param0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              }
              if (stackIn_7_0 == 5) {
                break L0;
              } else {
                field_B = (String[]) null;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var7_ref);
            stackOut_10_1 = new StringBuilder().append("gj.R(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 0) {
              stackOut_3_0 = aj.a(param1, 0, (byte) -108, param1.length);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("gj.SA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        we var8 = null;
        RuntimeException var8_ref = null;
        qa var9 = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var10 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param1) {
              var8 = new we(this.field_C);
              var9 = (qa) ((Object) var8.b(-75));
              L1: while (true) {
                L2: {
                  L3: {
                    if (var9 == null) {
                      break L3;
                    } else {
                      stackOut_6_0 = var9.b((byte) -54);
                      stackIn_13_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var10 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          break L3;
                        } else {
                          if (!var9.a(param0 + this.field_z, true, param2, param3, param4, param5, param6 + this.field_y)) {
                            var9 = (qa) ((Object) var8.c(-6144));
                            if (var10 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          } else {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var8_ref);
            stackOut_14_1 = new StringBuilder().append("gj.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final boolean a(int param0, qa param1) {
        lh discarded$2 = null;
        RuntimeException var3 = null;
        qa var4 = null;
        we var5 = null;
        qa var6 = null;
        int var7 = 0;
        we var8 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_16_0 = false;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_15_0 = false;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_C.a(-1092895903)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 32) {
                  break L1;
                } else {
                  field_A = (rk) null;
                  break L1;
                }
              }
              var8 = new we(this.field_C);
              var4 = (qa) ((Object) var8.b(106));
              L2: while (true) {
                L3: {
                  L4: {
                    if (var4 == null) {
                      break L4;
                    } else {
                      stackOut_9_0 = var4.e(param0 + -31);
                      stackIn_23_0 = stackOut_9_0 ? 1 : 0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var7 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_10_0) {
                              break L6;
                            } else {
                              if (var7 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var5 = new we(this.field_C);
                          discarded$2 = var5.a((byte) -99, var4);
                          var6 = (qa) ((Object) var5.c(-6144));
                          L7: while (true) {
                            if (var6 == null) {
                              break L5;
                            } else {
                              stackOut_15_0 = var6.a(param1, -108);
                              stackIn_23_0 = stackOut_15_0 ? 1 : 0;
                              stackIn_16_0 = stackOut_15_0;
                              if (var7 != 0) {
                                break L3;
                              } else {
                                if (stackIn_16_0) {
                                  stackOut_18_0 = 1;
                                  stackIn_19_0 = stackOut_18_0;
                                  decompiledRegionSelector0 = 2;
                                  break L0;
                                } else {
                                  var6 = (qa) ((Object) var5.c(param0 ^ -6112));
                                  if (var7 == 0) {
                                    continue L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var4 = (qa) ((Object) var8.c(param0 ^ -6112));
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var3);
            stackOut_24_1 = new StringBuilder().append("gj.BB(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_23_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    final boolean a(int param0, qa param1, int param2, int param3, int param4, int param5, int param6) {
        we var8 = null;
        RuntimeException var8_ref = null;
        qa var9 = null;
        int var10 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var8 = new we(this.field_C);
            var9 = (qa) ((Object) var8.b(-62));
            L1: while (true) {
              L2: {
                L3: {
                  if (var9 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var9.b((byte) -54);
                    stackIn_11_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        L4: {
                          if (!var9.e(1)) {
                            break L4;
                          } else {
                            if (!var9.a(param0, param1, param2, -31628, param4, param5, param6)) {
                              break L4;
                            } else {
                              stackOut_7_0 = 1;
                              stackIn_8_0 = stackOut_7_0;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            }
                          }
                        }
                        var9 = (qa) ((Object) var8.c(-6144));
                        if (var10 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_10_0 = param3;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              if (stackIn_11_0 == -31628) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                field_A = (rk) null;
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var8_ref);
            stackOut_15_1 = new StringBuilder().append("gj.O(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    public static void a(byte param0) {
        field_A = null;
        field_B = null;
        if (param0 >= -93) {
            return;
        }
        field_D = null;
        field_E = null;
    }

    final void a(qa param0, byte param1) {
        String discarded$2 = null;
        RuntimeException runtimeException = null;
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
              this.field_C.a(false, param0);
              if (param1 < -27) {
                break L1;
              } else {
                discarded$2 = this.g(121);
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
            stackOut_3_1 = new StringBuilder().append("gj.TA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    void b(int param0, int param1, boolean param2, int param3) {
        we var5 = null;
        qa var6 = null;
        int var7 = 0;
        we var8 = null;
        we var9 = null;
        L0: {
          var7 = fleas.field_A ? 1 : 0;
          if (0 != param3) {
            break L0;
          } else {
            if (null != this.field_p) {
              this.field_p.a(-127, param1, true, (qa) (this), param0);
              break L0;
            } else {
              var8 = new we(this.field_C);
              var5 = var8;
              if (param2) {
                var6 = (qa) ((Object) var8.a((byte) 106));
                L1: while (true) {
                  if (var6 != null) {
                    var6.b(param0 - -this.field_z, param1 + this.field_y, true, param3);
                    var6 = (qa) ((Object) var8.a(true));
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          }
        }
        var9 = new we(this.field_C);
        if (param2) {
          var6 = (qa) ((Object) var9.a((byte) 106));
          L2: while (true) {
            if (var6 != null) {
              var6.b(param0 - -this.field_z, param1 + this.field_y, true, param3);
              var6 = (qa) ((Object) var9.a(true));
              if (var7 == 0) {
                continue L2;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        qa var8 = null;
        we var9 = null;
        boolean stackIn_4_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_18_0 = false;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_19_0 = 0;
        boolean stackOut_17_0 = false;
        boolean stackOut_16_0 = false;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var9 = new we(this.field_C);
            var8 = (qa) ((Object) var9.b(102));
            L1: while (true) {
              L2: {
                L3: {
                  if (var8 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var8.b((byte) -54);
                    stackIn_11_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        L4: {
                          if (!var8.e(1)) {
                            break L4;
                          } else {
                            if (!var8.a(-2, param1, param2, param3)) {
                              break L4;
                            } else {
                              stackOut_7_0 = 1;
                              stackIn_8_0 = stackOut_7_0;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            }
                          }
                        }
                        var8 = (qa) ((Object) var9.c(param0 + -6142));
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_10_0 = param0;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              if (stackIn_11_0 == -2) {
                var6 = param1;
                if (80 != var6) {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L5: {
                    if (!ei.field_H[81]) {
                      stackOut_17_0 = this.a(32, param2);
                      stackIn_18_0 = stackOut_17_0;
                      break L5;
                    } else {
                      stackOut_16_0 = this.b(param2, param0 ^ 28533);
                      stackIn_18_0 = stackOut_16_0;
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var5);
            stackOut_21_1 = new StringBuilder().append("gj.N(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    qa i(int param0) {
        int var4 = fleas.field_A ? 1 : 0;
        we var2 = new we(this.field_C);
        if (param0 != -257) {
            return (qa) null;
        }
        qa var3 = (qa) ((Object) var2.b(-119));
        do {
            if (var3 == null) {
                return null;
            }
            if (!(!var3.e(1))) {
                return var3;
            }
            var3 = (qa) ((Object) var2.c(param0 + -5887));
        } while (var4 == 0);
        return null;
    }

    final boolean b(qa param0, int param1) {
        lh discarded$2 = null;
        RuntimeException var3 = null;
        qa var4 = null;
        we var5 = null;
        qa var6 = null;
        int var7 = 0;
        we var8 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_16_0 = false;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_15_0 = false;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_C.a(param1 ^ 1092889578)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var8 = new we(this.field_C);
                if (param1 == -28533) {
                  break L1;
                } else {
                  this.d((byte) -72);
                  break L1;
                }
              }
              var4 = (qa) ((Object) var8.a((byte) 106));
              L2: while (true) {
                L3: {
                  L4: {
                    if (var4 == null) {
                      break L4;
                    } else {
                      stackOut_9_0 = var4.e(1);
                      stackIn_23_0 = stackOut_9_0 ? 1 : 0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var7 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_10_0) {
                              break L6;
                            } else {
                              if (var7 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var5 = new we(this.field_C);
                          discarded$2 = var5.b((byte) -119, var4);
                          var6 = (qa) ((Object) var5.a(true));
                          L7: while (true) {
                            if (var6 == null) {
                              break L5;
                            } else {
                              stackOut_15_0 = var6.a(param0, -59);
                              stackIn_23_0 = stackOut_15_0 ? 1 : 0;
                              stackIn_16_0 = stackOut_15_0;
                              if (var7 != 0) {
                                break L3;
                              } else {
                                if (stackIn_16_0) {
                                  stackOut_18_0 = 1;
                                  stackIn_19_0 = stackOut_18_0;
                                  decompiledRegionSelector0 = 2;
                                  break L0;
                                } else {
                                  var6 = (qa) ((Object) var5.a(true));
                                  if (var7 == 0) {
                                    continue L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var4 = (qa) ((Object) var8.a(true));
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var3);
            stackOut_24_1 = new StringBuilder().append("gj.WA(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_23_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    private final void b(StringBuilder param0, Hashtable param1, int param2, int param3) {
        StringBuilder discarded$33 = null;
        StringBuilder discarded$34 = null;
        StringBuilder discarded$35 = null;
        RuntimeException var5 = null;
        qa var6 = null;
        int var7 = 0;
        int var8 = 0;
        we var9 = null;
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
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                this.b(26, -83, true, -8);
                break L1;
              }
            }
            var9 = new we(this.field_C);
            var6 = (qa) ((Object) var9.b(param2 + -78));
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                discarded$33 = param0.append('\n');
                if (var8 == 0) {
                  var7 = 0;
                  L3: while (true) {
                    L4: {
                      if (var7 > param3) {
                        discarded$34 = var6.a(param0, param1, param3 - -1, param2 ^ -82);
                        var6 = (qa) ((Object) var9.c(-6144));
                        break L4;
                      } else {
                        discarded$35 = param0.append(' ');
                        var7++;
                        if (var8 != 0) {
                          break L4;
                        } else {
                          continue L3;
                        }
                      }
                    }
                    continue L2;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("gj.AB(");
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
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
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
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String g(int param0) {
        we var2 = null;
        qa var3 = null;
        String var4 = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_4_0 = null;
        String stackIn_10_0 = null;
        String stackOut_9_0 = null;
        String stackOut_2_0 = null;
        var5 = fleas.field_A ? 1 : 0;
        var2 = new we(this.field_C);
        var3 = (qa) ((Object) var2.b(param0 ^ -127));
        L0: while (true) {
          if (var3 == null) {
            if (param0 == 4) {
              return null;
            } else {
              stackOut_9_0 = this.g(49);
              stackIn_10_0 = stackOut_9_0;
              return null;
            }
          } else {
            var4 = var3.g(4);
            stackOut_2_0 = (String) (var4);
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (var5 == 0) {
              if (stackIn_4_0 != null) {
                return var4;
              } else {
                var3 = (qa) ((Object) var2.c(-6144));
                continue L0;
              }
            } else {
              return null;
            }
          }
        }
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 1) {
          L0: {
            field_D = (String) null;
            if (this.i(param0 ^ -258) == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.i(param0 ^ -258) == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int c(byte param0) {
        String discarded$4 = null;
        String discarded$5 = null;
        int var2 = 0;
        we var3 = null;
        qa var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var6 = fleas.field_A ? 1 : 0;
        var2 = 0;
        var3 = new we(this.field_C);
        var4 = (qa) ((Object) var3.b(107));
        L0: while (true) {
          L1: {
            if (var4 == null) {
              break L1;
            } else {
              var5 = var4.c((byte) 8);
              var8 = var2;
              var7 = var5;
              if (var6 != 0) {
                if (var7 != var8) {
                  discarded$4 = this.g(-53);
                  return var2;
                } else {
                  return var2;
                }
              } else {
                L2: {
                  if (var7 <= var8) {
                    break L2;
                  } else {
                    var2 = var5;
                    break L2;
                  }
                }
                var4 = (qa) ((Object) var3.c(-6144));
                if (var6 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          if (param0 != 8) {
            discarded$5 = this.g(-53);
            return var2;
          } else {
            return var2;
          }
        }
    }

    void a(int param0, int param1, qa param2, byte param3) {
        RuntimeException runtimeException = null;
        we var5 = null;
        qa var6 = null;
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
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -88);
              var5 = new we(this.field_C);
              if (param3 <= -85) {
                break L1;
              } else {
                field_D = (String) null;
                break L1;
              }
            }
            var6 = (qa) ((Object) var5.b(-67));
            L2: while (true) {
              L3: {
                if (var6 == null) {
                  break L3;
                } else {
                  if (!var6.b((byte) -54)) {
                    break L3;
                  } else {
                    var6.a(this.field_z + param0, param1 + this.field_y, param2, (byte) -123);
                    var6 = (qa) ((Object) var5.c(-6144));
                    if (var7 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (runtimeException);
            stackOut_8_1 = new StringBuilder().append("gj.I(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
    }

    static {
        field_D = "There are several different tiles in Flea Circus, each with a different effect. The effect is normally triggered when a flea touches the tile. Some tiles only work if a flea approaches from the side or top.";
        field_B = new String[]{"By rating", "By win percentage"};
    }
}
