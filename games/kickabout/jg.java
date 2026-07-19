/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jg extends ct {
    static ut field_K;
    static String field_F;
    private int field_E;
    static String field_I;
    static sj field_J;
    private int field_D;
    static String field_A;
    private int field_H;
    private boolean field_L;
    private boolean field_B;
    private int field_C;

    final static void a(int param0, cn param1, byte param2) {
        try {
            wo.field_m = 150;
            ll.field_o = param1;
            if (param2 != -46) {
                jg.a(-114, (byte) -103, false, 80);
            }
            aw.field_J = wo.field_m + 20 + param0 >> 662775169;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "jg.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, boolean param5, int param6) {
        RuntimeException var7 = null;
        ut var7_ref = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            if (ug.field_c != null) {
              L1: {
                var7_ref = ug.field_c[param0];
                if (param4) {
                  var7_ref = sp.field_Hb[param0];
                  break L1;
                } else {
                  break L1;
                }
              }
              if (param6 == 4) {
                if (!param5) {
                  L2: {
                    if (param4) {
                      var7_ref.c(param3, param2);
                      break L2;
                    } else {
                      if (!param1) {
                        var7_ref.c(param3, param2);
                        break L2;
                      } else {
                        var7_ref.a(-3 + param3, -3 + param2, 6 + var7_ref.field_o, 6 + var7_ref.field_v);
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L3: {
                    if (am.field_k == param0) {
                      break L3;
                    } else {
                      L4: {
                        if (kp.field_m == null) {
                          kp.field_m = new ut(var7_ref.field_o + 8, var7_ref.field_v - -8);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      iw.a(-56, kp.field_m);
                      on.b();
                      var7_ref.c(4, 4);
                      nh.a(kp.field_m, 0.0, 1.3, 1.2);
                      eo.a(kp.field_m, 65793);
                      eo.a(kp.field_m, 16777215);
                      eo.a(kp.field_m, 7829367);
                      pt.a(95, -22914, 14, 88, 22);
                      var12 = new int[255];
                      var11 = var12;
                      var8 = var11;
                      var9 = 0;
                      L5: while (true) {
                        if ((var9 ^ -1) <= -256) {
                          nh.a(20, 40, -20 + on.field_g, 40, 28, 40, var12);
                          ta.e(119);
                          ta.e(param6 + 123);
                          am.field_k = param0;
                          break L3;
                        } else {
                          var8[var9] = 65793 * var9;
                          var9++;
                          continue L5;
                        }
                      }
                    }
                  }
                  kp.field_m.c(param3 + -4, -4 + param2);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var7), "jg.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void h(byte param0) {
        field_F = null;
        int var1 = 35 / ((-16 - param0) / 63);
        field_I = null;
        field_J = null;
        field_K = null;
        field_A = null;
    }

    final boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        StringBuilder discarded$2 = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        StringBuilder var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
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
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
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
              if (param0) {
                break L1;
              } else {
                var9 = (StringBuilder) null;
                discarded$2 = this.a(-45, -42, (Hashtable) null, (StringBuilder) null);
                break L1;
              }
            }
            L2: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L2;
              } else {
                if (!this.field_B) {
                  break L2;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (!this.a((byte) 58, param5, param1, param2, param4)) {
              stackOut_12_0 = var8_int;
              stackIn_13_0 = stackOut_12_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L3: {
                if (-2 == (param6 ^ -1)) {
                  this.field_D = -param1 + (-this.field_g + param4);
                  mp.field_g = (jg) (this);
                  this.field_E = -param5 + param2 - this.field_t;
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_p = param6;
              stackOut_10_0 = 1;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var8);
            stackOut_14_1 = new StringBuilder().append("jg.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw nb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final void a(byte param0, fd param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (!(this.field_z instanceof wi)) {
                      break L4;
                    } else {
                      if (!((wi) ((Object) this.field_z)).field_y) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (-2 != (this.field_p ^ -1)) {
                    break L3;
                  } else {
                    L5: {
                      var5_int = el.field_A - (this.field_E + param2);
                      var6 = -this.field_D + n.field_m - param3;
                      if (var5_int != this.field_t) {
                        break L5;
                      } else {
                        if (this.field_g == var6) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    this.field_t = var5_int;
                    this.field_g = var6;
                    if (this.field_k instanceof eu) {
                      ((eu) ((Object) this.field_k)).a(param0 + -18830, (jg) (this), param3, param2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                if (this.field_L) {
                  L6: {
                    if (this.field_t == this.field_H) {
                      break L6;
                    } else {
                      L7: {
                        var5_int = this.field_H + -this.field_t;
                        stackOut_13_0 = this;
                        stackOut_13_1 = this.field_t;
                        stackIn_17_0 = stackOut_13_0;
                        stackIn_17_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (Math.abs(var5_int) > 2) {
                          stackOut_17_0 = this;
                          stackOut_17_1 = stackIn_17_1;
                          stackOut_17_2 = var5_int >> 702199873;
                          stackIn_18_0 = stackOut_17_0;
                          stackIn_18_1 = stackOut_17_1;
                          stackIn_18_2 = stackOut_17_2;
                          break L7;
                        } else {
                          stackOut_14_0 = this;
                          stackOut_14_1 = stackIn_14_1;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          if (var5_int > 0) {
                            stackOut_16_0 = this;
                            stackOut_16_1 = stackIn_16_1;
                            stackOut_16_2 = 1;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_18_1 = stackOut_16_1;
                            stackIn_18_2 = stackOut_16_2;
                            break L7;
                          } else {
                            stackOut_15_0 = this;
                            stackOut_15_1 = stackIn_15_1;
                            stackOut_15_2 = -1;
                            stackIn_18_0 = stackOut_15_0;
                            stackIn_18_1 = stackOut_15_1;
                            stackIn_18_2 = stackOut_15_2;
                            break L7;
                          }
                        }
                      }
                      ((jg) (this)).field_t = stackIn_18_1 + stackIn_18_2;
                      break L6;
                    }
                  }
                  if (this.field_C == this.field_g) {
                    break L2;
                  } else {
                    L8: {
                      var5_int = this.field_C - this.field_g;
                      stackOut_20_0 = this;
                      stackOut_20_1 = this.field_g;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      if (-3 <= (Math.abs(var5_int) ^ -1)) {
                        stackOut_22_0 = this;
                        stackOut_22_1 = stackIn_22_1;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        if (0 >= var5_int) {
                          stackOut_24_0 = this;
                          stackOut_24_1 = stackIn_24_1;
                          stackOut_24_2 = -1;
                          stackIn_25_0 = stackOut_24_0;
                          stackIn_25_1 = stackOut_24_1;
                          stackIn_25_2 = stackOut_24_2;
                          break L8;
                        } else {
                          stackOut_23_0 = this;
                          stackOut_23_1 = stackIn_23_1;
                          stackOut_23_2 = 1;
                          stackIn_25_0 = stackOut_23_0;
                          stackIn_25_1 = stackOut_23_1;
                          stackIn_25_2 = stackOut_23_2;
                          break L8;
                        }
                      } else {
                        stackOut_21_0 = this;
                        stackOut_21_1 = stackIn_21_1;
                        stackOut_21_2 = var5_int >> -1810630079;
                        stackIn_25_0 = stackOut_21_0;
                        stackIn_25_1 = stackOut_21_1;
                        stackIn_25_2 = stackOut_21_2;
                        break L8;
                      }
                    }
                    ((jg) (this)).field_g = stackIn_25_1 + stackIn_25_2;
                    break L2;
                  }
                } else {
                  super.a(param0, param1, param2, param3);
                  break L1;
                }
              }
              super.a(param0, param1, param2, param3);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var5);
            stackOut_28_1 = new StringBuilder().append("jg.P(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, fd param3, int param4, int param5) {
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
              super.a(param0, param1, param2, param3, param4 ^ 0, param5);
              this.field_p = 0;
              if (param4 == -1) {
                break L1;
              } else {
                this.field_L = false;
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
            stackOut_3_1 = new StringBuilder().append("jg.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw nb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$26 = null;
        StringBuilder discarded$27 = null;
        RuntimeException var5 = null;
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
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
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
              if (!this.a(1, param3, param2, param1)) {
                break L1;
              } else {
                this.b(param1, param3, param2, -18568);
                this.a(param2, 127, param3, param1);
                discarded$26 = param3.append(" revert=").append(this.field_L);
                if (this.field_H == 2147483647) {
                  break L1;
                } else {
                  if (-2147483648 == (this.field_C ^ -1)) {
                    break L1;
                  } else {
                    discarded$27 = param3.append(" to ").append(this.field_H).append(',').append(this.field_C);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 == 17883) {
                break L2;
              } else {
                field_I = (String) null;
                break L2;
              }
            }
            stackOut_6_0 = (StringBuilder) (param3);
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("jg.GA(").append(param0).append(',').append(param1).append(',');
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    private jg(int param0, int param1, int param2, int param3, gj param4, jv param5, fd param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_H = 2147483647;
        this.field_C = 2147483647;
        try {
            this.field_z = param6;
            this.field_B = param8 ? true : false;
            this.field_L = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "jg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(byte param0) {
        super.a(param0);
        this.field_z.a(this.field_i, 1, 0, this.field_n, 0);
        this.field_H = this.field_t;
        this.field_C = this.field_g;
    }

    final static void a(int param0, byte param1, boolean param2, int param3) {
        if (!(kd.field_s)) {
            return;
        }
        qa.field_E.b(0, param2);
        int var4 = dr.field_g.h(-113) ? 1 : 0;
        if (wj.field_A != 0) {
            if (!(var4 != 0)) {
                param2 = false;
                hq.b((byte) 114);
            }
        }
        if (param2) {
            dr.field_g.b(param3, param0, (byte) -127);
        }
        int var6 = -116 % ((param1 - 17) / 36);
        if (!(var4 == 0)) {
            qa.field_E.b(0, param2);
        }
        int var5 = dr.field_g.h((byte) 49) + dr.field_g.field_F;
        if (-641 > (var5 ^ -1)) {
            fb.field_I = fb.field_I + 5;
        } else {
            if (var5 < 635) {
                if ((fb.field_I ^ -1) < -1) {
                    fb.field_I = fb.field_I - 5;
                }
            }
        }
    }

    static {
        field_A = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_F = "Public";
        field_I = "Your team still earns 10% of the winnings and have earnt <%0>.";
    }
}
