/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pj extends mi {
    private int field_I;
    private int field_J;
    static rc field_P;
    static ji field_G;
    private int field_N;
    static kl field_M;
    private boolean field_O;
    static String field_L;
    private boolean field_K;
    private int field_H;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = wizardrun.field_H;
        if (param7 < param0) {
          if (param0 < param4) {
            a.a(param6, param5, param0, param2, ed.field_k, param3, param4, -20476, param7);
            if (param1 != 0) {
              pj.g(24);
              return;
            } else {
              return;
            }
          } else {
            if (param4 <= param7) {
              a.a(param3, param5, param7, param6, ed.field_k, param2, param0, -20476, param4);
              if (param1 != 0) {
                pj.g(24);
                return;
              } else {
                return;
              }
            } else {
              a.a(param3, param5, param4, param2, ed.field_k, param6, param0, -20476, param7);
              if (param1 != 0) {
                pj.g(24);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param7 < param4) {
            a.a(param6, param5, param7, param3, ed.field_k, param2, param4, -20476, param0);
            if (param1 == 0) {
              return;
            } else {
              pj.g(24);
              return;
            }
          } else {
            if (param4 > param0) {
              a.a(param2, param5, param4, param3, ed.field_k, param6, param7, -20476, param0);
              if (param1 == 0) {
                return;
              } else {
                pj.g(24);
                return;
              }
            } else {
              a.a(param2, param5, param0, param6, ed.field_k, param3, param7, -20476, param4);
              if (param1 != 0) {
                pj.g(24);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        StringBuilder discarded$26 = null;
        StringBuilder discarded$27 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_10_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_9_0 = null;
        StringBuilder stackOut_1_0 = null;
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
        try {
          L0: {
            if (param1 == 102) {
              L1: {
                if (this.a(param3, param0, param2, true)) {
                  this.a(109, param2, param0, param3);
                  this.a(param3, param2, param0, (byte) -101);
                  discarded$26 = param3.append(" revert=").append(this.field_K);
                  if (-2147483648 == (this.field_N ^ -1)) {
                    break L1;
                  } else {
                    if (this.field_J != 2147483647) {
                      discarded$27 = param3.append(" to ").append(this.field_N).append(',').append(this.field_J);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              stackOut_9_0 = (StringBuilder) (param3);
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (StringBuilder) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("pj.U(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',');
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
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_10_0;
        }
    }

    public static void g(int param0) {
        field_L = null;
        field_M = null;
        field_G = null;
        field_P = null;
        if (param0 < 103) {
            pj.g(-92);
        }
    }

    final void e(int param0) {
        super.e(param0);
        this.field_F.a(110, 0, this.field_n, this.field_r, 0);
        this.field_N = this.field_o;
        this.field_J = this.field_l;
    }

    final void a(int param0, int param1, int param2, int param3, ub param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_q = 0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "pj.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2, ub param3) {
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
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
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
                  if (!(this.field_F instanceof pl)) {
                    break L3;
                  } else {
                    if (!((pl) ((Object) this.field_F)).field_B) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (-2 != (this.field_q ^ -1)) {
                  break L2;
                } else {
                  L4: {
                    var5_int = -this.field_H + (pg.field_n - param2);
                    var6 = -this.field_I + (fi.field_B + -param1);
                    if (this.field_o != var5_int) {
                      break L4;
                    } else {
                      if (this.field_l == var6) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_l = var6;
                  this.field_o = var5_int;
                  if (!(this.field_s instanceof ah)) {
                    break L1;
                  } else {
                    ((ah) ((Object) this.field_s)).a(param2, (pj) (this), param1, param0 ^ 10000622);
                    break L1;
                  }
                }
              }
              if (!this.field_K) {
                break L1;
              } else {
                L5: {
                  if (this.field_N != this.field_o) {
                    L6: {
                      var5_int = -this.field_o + this.field_N;
                      stackOut_13_0 = this;
                      stackOut_13_1 = this.field_o;
                      stackIn_17_0 = stackOut_13_0;
                      stackIn_17_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (2 < Math.abs(var5_int)) {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = var5_int >> 1034026305;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        break L6;
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
                          break L6;
                        } else {
                          stackOut_15_0 = this;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = -1;
                          stackIn_18_0 = stackOut_15_0;
                          stackIn_18_1 = stackOut_15_1;
                          stackIn_18_2 = stackOut_15_2;
                          break L6;
                        }
                      }
                    }
                    ((pj) (this)).field_o = stackIn_18_1 + stackIn_18_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (this.field_J == this.field_l) {
                  break L1;
                } else {
                  L7: {
                    var5_int = this.field_J + -this.field_l;
                    stackOut_20_0 = this;
                    stackOut_20_1 = this.field_l;
                    stackIn_24_0 = stackOut_20_0;
                    stackIn_24_1 = stackOut_20_1;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    if (-3 > (Math.abs(var5_int) ^ -1)) {
                      stackOut_24_0 = this;
                      stackOut_24_1 = stackIn_24_1;
                      stackOut_24_2 = var5_int >> -639331295;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      stackIn_25_2 = stackOut_24_2;
                      break L7;
                    } else {
                      stackOut_21_0 = this;
                      stackOut_21_1 = stackIn_21_1;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      if (var5_int > 0) {
                        stackOut_23_0 = this;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = 1;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_25_2 = stackOut_23_2;
                        break L7;
                      } else {
                        stackOut_22_0 = this;
                        stackOut_22_1 = stackIn_22_1;
                        stackOut_22_2 = -1;
                        stackIn_25_0 = stackOut_22_0;
                        stackIn_25_1 = stackOut_22_1;
                        stackIn_25_2 = stackOut_22_2;
                        break L7;
                      }
                    }
                  }
                  ((pj) (this)).field_l = stackIn_25_1 + stackIn_25_2;
                  break L1;
                }
              }
            }
            super.a(param0, param1, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var5);
            stackOut_28_1 = new StringBuilder().append("pj.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
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
              var8_int = super.a(param0, (byte) 48, param2, param3, param4, param5, param6) ? 1 : 0;
              var9 = -58 % ((12 - param1) / 36);
              if (var8_int == 0) {
                break L1;
              } else {
                if (this.field_O) {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!this.b(param5, param2, 0, param0, param3)) {
              stackOut_9_0 = var8_int;
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                if (param4 == 1) {
                  tg.field_h = (pj) (this);
                  this.field_H = param2 - this.field_o - param0;
                  this.field_I = -this.field_l + param5 + -param3;
                  break L2;
                } else {
                  break L2;
                }
              }
              this.field_q = param4;
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var8);
            stackOut_13_1 = new StringBuilder().append("pj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param6 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final static void f(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        sc var4 = null;
        int var4_int = 0;
        int var5 = 0;
        dc var5_ref_dc = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        mg var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var9 = nk.field_N;
              if (param0 == -17144) {
                break L1;
              } else {
                pj.f(16);
                break L1;
              }
            }
            var2 = var9.f(255);
            var3 = var9.f(255);
            if (var2 == 0) {
              var4 = (sc) ((Object) tg.field_c.b((byte) 110));
              if (var4 != null) {
                L2: {
                  var5 = -var9.field_m + gd.field_c;
                  var11 = var4.field_n;
                  var10 = var11;
                  var6 = var10;
                  if (var5 <= var11.length << 1073019202) {
                    break L2;
                  } else {
                    var5 = var11.length << -1448914270;
                    break L2;
                  }
                }
                var7 = 0;
                L3: while (true) {
                  if (var5 <= var7) {
                    var4.field_j = true;
                    var4.a(false);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var6[var7 >> -1124254142] = var6[var7 >> -1124254142] + (var9.f(255) << kl.b(768, var7 << 140535304));
                    var7++;
                    continue L3;
                  }
                }
              } else {
                ql.a(-64);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              if (-2 != (var2 ^ -1)) {
                rg.a((Throwable) null, "LR1: " + ni.c(6), -562);
                ql.a(-66);
                return;
              } else {
                var4_int = var9.a(param0 + 37623);
                var5_ref_dc = (dc) ((Object) v.field_d.b((byte) 100));
                L4: while (true) {
                  L5: {
                    if (var5_ref_dc == null) {
                      break L5;
                    } else {
                      L6: {
                        if (var5_ref_dc.field_k != var3) {
                          break L6;
                        } else {
                          if (var4_int == var5_ref_dc.field_m) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var5_ref_dc = (dc) ((Object) v.field_d.d(param0 ^ -25336));
                      continue L4;
                    }
                  }
                  if (var5_ref_dc != null) {
                    var5_ref_dc.a(false);
                    return;
                  } else {
                    ql.a(-100);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "pj.NA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private pj(int param0, int param1, int param2, int param3, bf param4, ce param5, ub param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_J = 2147483647;
        this.field_N = 2147483647;
        try {
            this.field_K = param7 ? true : false;
            this.field_O = param8 ? true : false;
            this.field_F = param6;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "pj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_P = new rc();
        field_L = "This password contains repeated characters, and would be easy to guess";
    }
}
