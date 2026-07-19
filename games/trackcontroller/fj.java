/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fj extends ok {
    private boolean field_L;
    private int field_K;
    private int field_E;
    private int field_Q;
    static java.math.BigInteger field_N;
    private int field_I;
    static ng[] field_M;
    static ja field_H;
    private boolean field_J;
    static nb field_P;
    static String field_O;
    static int field_S;
    static String field_R;
    static int field_U;
    static int field_T;

    private fj(int param0, int param1, int param2, int param3, t param4, tg param5, al param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_E = 2147483647;
        this.field_Q = 2147483647;
        try {
            this.field_B = param6;
            this.field_J = param8 ? true : false;
            this.field_L = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "fj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(byte param0) {
        super.a((byte) 107);
        int var2 = 95 / ((48 - param0) / 40);
        this.field_B.a(this.field_u, -3050, 0, this.field_x, 0);
        this.field_Q = this.field_p;
        this.field_E = this.field_m;
    }

    public static void e(byte param0) {
        if (param0 != 118) {
          fj.e((byte) 71);
          field_O = null;
          field_N = null;
          field_R = null;
          field_P = null;
          field_M = null;
          field_H = null;
          return;
        } else {
          field_O = null;
          field_N = null;
          field_R = null;
          field_P = null;
          field_M = null;
          field_H = null;
          return;
        }
    }

    final void a(al param0, boolean param1, int param2, int param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_r = 0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "fj.GB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int b(int param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -48) {
          L0: {
            if ((param1 ^ -1) > -49) {
              break L0;
            } else {
              if (57 < param1) {
                break L0;
              } else {
                return -48 + param1;
              }
            }
          }
          L1: {
            if (-98 < (param1 ^ -1)) {
              break L1;
            } else {
              if ((param1 ^ -1) < -123) {
                break L1;
              } else {
                return -87 - -param1;
              }
            }
          }
          if (65 <= param1) {
            if ((param1 ^ -1) < -91) {
              L2: {
                if (param1 != 43) {
                  stackOut_61_0 = 63;
                  stackIn_62_0 = stackOut_61_0;
                  break L2;
                } else {
                  stackOut_60_0 = 62;
                  stackIn_62_0 = stackOut_60_0;
                  break L2;
                }
              }
              return stackIn_62_0;
            } else {
              return 36 - (65 + -param1);
            }
          } else {
            L3: {
              if (param1 != 43) {
                stackOut_55_0 = 63;
                stackIn_56_0 = stackOut_55_0;
                break L3;
              } else {
                stackOut_54_0 = 62;
                stackIn_56_0 = stackOut_54_0;
                break L3;
              }
            }
            return stackIn_56_0;
          }
        } else {
          fj.e((byte) -76);
          if ((param1 ^ -1) <= -49) {
            if (57 < param1) {
              L4: {
                if (-98 < (param1 ^ -1)) {
                  break L4;
                } else {
                  if ((param1 ^ -1) < -123) {
                    break L4;
                  } else {
                    return -87 - -param1;
                  }
                }
              }
              if (65 <= param1) {
                if ((param1 ^ -1) >= -91) {
                  return 36 - (65 + -param1);
                } else {
                  L5: {
                    if (param1 != 43) {
                      stackOut_42_0 = 63;
                      stackIn_43_0 = stackOut_42_0;
                      break L5;
                    } else {
                      stackOut_41_0 = 62;
                      stackIn_43_0 = stackOut_41_0;
                      break L5;
                    }
                  }
                  return stackIn_43_0;
                }
              } else {
                L6: {
                  if (param1 != 43) {
                    stackOut_37_0 = 63;
                    stackIn_38_0 = stackOut_37_0;
                    break L6;
                  } else {
                    stackOut_36_0 = 62;
                    stackIn_38_0 = stackOut_36_0;
                    break L6;
                  }
                }
                return stackIn_38_0;
              }
            } else {
              return -48 + param1;
            }
          } else {
            if (-98 >= (param1 ^ -1)) {
              if ((param1 ^ -1) < -123) {
                if (65 <= param1) {
                  if ((param1 ^ -1) >= -91) {
                    return 36 - (65 + -param1);
                  } else {
                    L7: {
                      if (param1 != 43) {
                        stackOut_25_0 = 63;
                        stackIn_26_0 = stackOut_25_0;
                        break L7;
                      } else {
                        stackOut_24_0 = 62;
                        stackIn_26_0 = stackOut_24_0;
                        break L7;
                      }
                    }
                    return stackIn_26_0;
                  }
                } else {
                  L8: {
                    if (param1 != 43) {
                      stackOut_20_0 = 63;
                      stackIn_21_0 = stackOut_20_0;
                      break L8;
                    } else {
                      stackOut_19_0 = 62;
                      stackIn_21_0 = stackOut_19_0;
                      break L8;
                    }
                  }
                  return stackIn_21_0;
                }
              } else {
                return -87 - -param1;
              }
            } else {
              if (65 <= param1) {
                if ((param1 ^ -1) < -91) {
                  L9: {
                    if (param1 != 43) {
                      stackOut_12_0 = 63;
                      stackIn_13_0 = stackOut_12_0;
                      break L9;
                    } else {
                      stackOut_11_0 = 62;
                      stackIn_13_0 = stackOut_11_0;
                      break L9;
                    }
                  }
                  return stackIn_13_0;
                } else {
                  return 36 - (65 + -param1);
                }
              } else {
                L10: {
                  if (param1 != 43) {
                    stackOut_6_0 = 63;
                    stackIn_7_0 = stackOut_6_0;
                    break L10;
                  } else {
                    stackOut_5_0 = 62;
                    stackIn_7_0 = stackOut_5_0;
                    break L10;
                  }
                }
                return stackIn_7_0;
              }
            }
          }
        }
    }

    final boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (this.field_J) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (this.a(param5, param6, param2, false, param1)) {
              L2: {
                if (-2 != (param3 ^ -1)) {
                  break L2;
                } else {
                  rf.field_e = (fj) (this);
                  this.field_I = param1 + (-this.field_m + -param6);
                  this.field_K = -param5 + -this.field_p + param2;
                  break L2;
                }
              }
              this.field_r = param3;
              stackOut_8_0 = 1;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_4_0 = var8_int;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var8);
            stackOut_12_1 = new StringBuilder().append("fj.R(");
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
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final StringBuilder a(boolean param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$26 = null;
        StringBuilder discarded$27 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (!this.a((byte) 116, param3, param2, param1)) {
                break L1;
              } else {
                this.a(34, param2, param3, param1);
                this.a(-51, param1, param2, param3);
                discarded$26 = param2.append(" revert=").append(this.field_L);
                if (this.field_Q == 2147483647) {
                  break L1;
                } else {
                  if ((this.field_E ^ -1) != -2147483648) {
                    discarded$27 = param2.append(" to ").append(this.field_Q).append(',').append(this.field_E);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                this.a((byte) -42);
                break L2;
              }
            }
            stackOut_7_0 = (StringBuilder) (param2);
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var5);
            stackOut_9_1 = new StringBuilder().append("fj.BB(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    final void a(int param0, int param1, byte param2, al param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(this.field_B instanceof rh)) {
                    break L3;
                  } else {
                    if (!((rh) ((Object) this.field_B)).field_B) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (1 == this.field_r) {
                  L4: {
                    var5_int = -this.field_K + (kf.field_b - param1);
                    var6 = -param0 + (-this.field_I + fg.field_a);
                    if (this.field_p != var5_int) {
                      break L4;
                    } else {
                      if (this.field_m == var6) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_m = var6;
                  this.field_p = var5_int;
                  if (this.field_l instanceof ek) {
                    ((ek) ((Object) this.field_l)).a((fj) (this), param0, param1, param2 + -21487);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
              if (!this.field_L) {
                break L1;
              } else {
                L5: {
                  if (this.field_Q != this.field_p) {
                    L6: {
                      var5_int = -this.field_p + this.field_Q;
                      stackOut_8_0 = this;
                      stackOut_8_1 = this.field_p;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (2 >= Math.abs(var5_int)) {
                        stackOut_10_0 = this;
                        stackOut_10_1 = stackIn_10_1;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (var5_int <= 0) {
                          stackOut_12_0 = this;
                          stackOut_12_1 = stackIn_12_1;
                          stackOut_12_2 = -1;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          stackIn_13_2 = stackOut_12_2;
                          break L6;
                        } else {
                          stackOut_11_0 = this;
                          stackOut_11_1 = stackIn_11_1;
                          stackOut_11_2 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          stackIn_13_2 = stackOut_11_2;
                          break L6;
                        }
                      } else {
                        stackOut_9_0 = this;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = var5_int >> 181225441;
                        stackIn_13_0 = stackOut_9_0;
                        stackIn_13_1 = stackOut_9_1;
                        stackIn_13_2 = stackOut_9_2;
                        break L6;
                      }
                    }
                    ((fj) (this)).field_p = stackIn_13_1 + stackIn_13_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (this.field_E != this.field_m) {
                  L7: {
                    var5_int = -this.field_m + this.field_E;
                    stackOut_16_0 = this;
                    stackOut_16_1 = this.field_m;
                    stackIn_20_0 = stackOut_16_0;
                    stackIn_20_1 = stackOut_16_1;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    if (-3 > (Math.abs(var5_int) ^ -1)) {
                      stackOut_20_0 = this;
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = var5_int >> -1210419711;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      stackIn_21_2 = stackOut_20_2;
                      break L7;
                    } else {
                      stackOut_17_0 = this;
                      stackOut_17_1 = stackIn_17_1;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      if (-1 > (var5_int ^ -1)) {
                        stackOut_19_0 = this;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        break L7;
                      } else {
                        stackOut_18_0 = this;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = -1;
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_21_2 = stackOut_18_2;
                        break L7;
                      }
                    }
                  }
                  ((fj) (this)).field_m = stackIn_21_1 + stackIn_21_2;
                  break L1;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
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
            stackOut_30_0 = (RuntimeException) (var5);
            stackOut_30_1 = new StringBuilder().append("fj.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 == 1) {
              var3_int = 0;
              L1: while (true) {
                if ((param0 ^ -1) >= -1) {
                  stackOut_7_0 = var3_int;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3_int = var3_int << -1863695327 | param2 & 1;
                  param2 = param2 >>> 1;
                  param0--;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -24;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var3), "fj.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    static {
        field_N = new java.math.BigInteger("65537");
        field_H = new ja();
        field_O = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_R = "Resume Game";
        field_S = 2;
    }
}
