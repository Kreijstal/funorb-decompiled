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
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var3 = new we(this.field_C);
            var4 = (qa) ((Object) var3.b(87));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param1 < -26) {
                    break L2;
                  } else {
                    this.d((byte) -117);
                    break L2;
                  }
                }
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var4.a(param0, -118)) {
                  stackIn_6_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var4 = (qa) ((Object) var3.c(-6144));
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("gj.A(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final StringBuilder a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_7_0 = (StringBuilder) (param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("gj.S(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void f(int param0) {
        int var4 = fleas.field_A ? 1 : 0;
        we var2 = new we(this.field_C);
        if (param0 != -1) {
            return;
        }
        qa var3 = (qa) ((Object) var2.b(-74));
        while (var3 != null) {
            var3.f(-1);
            var3 = (qa) ((Object) var2.c(-6144));
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.d((byte) 84);
    }

    private final void d(byte param0) {
        int var4 = fleas.field_A ? 1 : 0;
        if (param0 != 84) {
            field_B = (String[]) null;
        }
        we var2 = new we(this.field_C);
        qa var3 = (qa) ((Object) var2.b(73));
        while (var3 != null) {
            var3.b(false);
            var3 = (qa) ((Object) var2.c(-6144));
        }
    }

    final void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
        we var7 = null;
        qa var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var7 = new we(this.field_C);
            var8 = (qa) ((Object) var7.b(-128));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.b((byte) -54)) {
                    break L2;
                  } else {
                    var8.a((byte) 5, param1, param2 + this.field_y, param3, param4, this.field_z + param5);
                    var8 = (qa) ((Object) var7.c(-6144));
                    continue L1;
                  }
                }
              }
              L3: {
                if (param0 == 5) {
                  break L3;
                } else {
                  field_B = (String[]) null;
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7_ref);

            stackIn_10_1 = new StringBuilder().append("gj.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              stackIn_4_0 = aj.a(param1, 0, (byte) -108, param1.length);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("gj.SA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
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
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param1) {
              var8 = new we(this.field_C);
              var9 = (qa) ((Object) var8.b(-75));
              L1: while (true) {
                L2: {
                  if (var9 == null) {
                    break L2;
                  } else {
                    if (!var9.b((byte) -54)) {
                      break L2;
                    } else {
                      if (!var9.a(param0 + this.field_z, true, param2, param3, param4, param5, param6 + this.field_y)) {
                        var9 = (qa) ((Object) var8.c(-6144));
                        continue L1;
                      } else {
                        stackIn_9_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8_ref);

            stackIn_15_1 = new StringBuilder().append("gj.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final boolean a(int param0, qa param1) {
        RuntimeException var3 = null;
        qa var4 = null;
        we var5 = null;
        qa var6 = null;
        int var7 = 0;
        we var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_C.a(-1092895903)) {
              stackIn_4_0 = 0;
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
                if (var4 == null) {
                  stackIn_20_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (var4.e(param0 + -31)) {
                      var5 = new we(this.field_C);
                      var5.a((byte) -99, var4);
                      var6 = (qa) ((Object) var5.c(-6144));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(param1, -108)) {
                            stackIn_16_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var6 = (qa) ((Object) var5.c(param0 ^ -6112));
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4 = (qa) ((Object) var8.c(param0 ^ -6112));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("gj.BB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_20_0 != 0;
          }
        }
    }

    final boolean a(int param0, qa param1, int param2, int param3, int param4, int param5, int param6) {
        we var8 = null;
        RuntimeException var8_ref = null;
        qa var9 = null;
        int var10 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var8 = new we(this.field_C);
            var9 = (qa) ((Object) var8.b(-62));
            L1: while (true) {
              L2: {
                if (var9 == null) {
                  break L2;
                } else {
                  if (!var9.b((byte) -54)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var9.e(1)) {
                        break L3;
                      } else {
                        if (!var9.a(param0, param1, param2, -31628, param4, param5, param6)) {
                          break L3;
                        } else {
                          stackIn_7_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var9 = (qa) ((Object) var8.c(-6144));
                    continue L1;
                  }
                }
              }
              if (param3 == -31628) {
                stackIn_12_0 = 0;
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
          L4: {
            var8_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8_ref);

            stackIn_15_1 = new StringBuilder().append("gj.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_12_0 != 0;
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
        try {
            this.field_C.a(false, param0);
            if (param1 >= -27) {
                this.g(121);
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "gj.TA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void b(int param0, int param1, boolean param2, int param3) {
        int var7 = fleas.field_A ? 1 : 0;
        if (0 == param3) {
            if (!(null == this.field_p)) {
                this.field_p.a(-127, param1, true, (qa) (this), param0);
            }
        }
        we var5 = new we(this.field_C);
        if (!param2) {
            return;
        }
        qa var6 = (qa) ((Object) var5.a((byte) 106));
        while (var6 != null) {
            var6.b(param0 - -this.field_z, param1 + this.field_y, true, param3);
            var6 = (qa) ((Object) var5.a(true));
        }
    }

    boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        qa var8 = null;
        we var9 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_16_0 = false;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var9 = new we(this.field_C);
            var8 = (qa) ((Object) var9.b(102));
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.b((byte) -54)) {
                    break L2;
                  } else {
                    L3: {
                      if (!var8.e(1)) {
                        break L3;
                      } else {
                        if (!var8.a(-2, param1, param2, param3)) {
                          break L3;
                        } else {
                          stackIn_7_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    var8 = (qa) ((Object) var9.c(param0 + -6142));
                    continue L1;
                  }
                }
              }
              if (param0 == -2) {
                var6 = param1;
                if (80 != var6) {
                  stackIn_18_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L4: {
                    if (!ei.field_H[81]) {
                      stackIn_16_0 = this.a(32, param2);
                      break L4;
                    } else {
                      stackIn_16_0 = this.b(param2, param0 ^ 28533);
                      break L4;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("gj.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    qa i(int param0) {
        we var2;
        qa var3;
        int var4;
        var4 = fleas.field_A ? 1 : 0;
        var2 = new we(this.field_C);
        if (param0 == -257) {
          var3 = (qa) ((Object) var2.b(-119));
          L0: while (true) {
            if (var3 != null) {
              if (var3.e(1)) {
                return var3;
              } else {
                var3 = (qa) ((Object) var2.c(param0 + -5887));
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return (qa) null;
        }
    }

    final boolean b(qa param0, int param1) {
        RuntimeException var3 = null;
        qa var4 = null;
        we var5 = null;
        qa var6 = null;
        int var7 = 0;
        we var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_C.a(param1 ^ 1092889578)) {
              stackIn_4_0 = 0;
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
                if (var4 == null) {
                  stackIn_20_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (var4.e(1)) {
                      var5 = new we(this.field_C);
                      var5.b((byte) -119, var4);
                      var6 = (qa) ((Object) var5.a(true));
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(param0, -59)) {
                            stackIn_16_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var6 = (qa) ((Object) var5.a(true));
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4 = (qa) ((Object) var8.a(true));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("gj.WA(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_20_0 != 0;
          }
        }
    }

    private final void b(StringBuilder param0, Hashtable param1, int param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        we var5 = null;
        qa var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
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
            var5 = new we(this.field_C);
            var6 = (qa) ((Object) var5.b(param2 + -78));
            L2: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                discarded$3 = param0.append('\n');
                var7 = 0;
                L3: while (true) {
                  if (var7 > param3) {
                    var6.a(param0, param1, param3 - -1, param2 ^ -82);
                    var6 = (qa) ((Object) var5.c(-6144));
                    continue L2;
                  } else {
                    discarded$4 = param0.append(' ');
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("gj.AB(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String g(int param0) {
        String var4 = null;
        int var5 = fleas.field_A ? 1 : 0;
        we var2 = new we(this.field_C);
        qa var3 = (qa) ((Object) var2.b(param0 ^ -127));
        while (var3 != null) {
            var4 = var3.g(4);
            if (!(var4 == null)) {
                return var4;
            }
            var3 = (qa) ((Object) var2.c(-6144));
        }
        if (param0 == 4) {
            return null;
        }
        this.g(49);
        return null;
    }

    final boolean e(int param0) {
        if (param0 != 1) {
            field_D = (String) null;
        }
        return this.i(param0 ^ -258) != null ? true : false;
    }

    final int c(byte param0) {
        int var5 = 0;
        int var6 = fleas.field_A ? 1 : 0;
        int var2 = 0;
        we var3 = new we(this.field_C);
        qa var4 = (qa) ((Object) var3.b(107));
        while (var4 != null) {
            var5 = var4.c((byte) 8);
            if (var5 > var2) {
                var2 = var5;
            }
            var4 = (qa) ((Object) var3.c(-6144));
        }
        if (param0 != 8) {
            this.g(-53);
        }
        return var2;
    }

    void a(int param0, int param1, qa param2, byte param3) {
        RuntimeException runtimeException = null;
        we var5 = null;
        qa var6 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                    continue L2;
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
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("gj.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
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
