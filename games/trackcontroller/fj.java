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
                  stackIn_62_0 = 63;
                  break L2;
                } else {
                  stackIn_62_0 = 62;
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
                stackIn_56_0 = 63;
                break L3;
              } else {
                stackIn_56_0 = 62;
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
                      stackIn_43_0 = 63;
                      break L5;
                    } else {
                      stackIn_43_0 = 62;
                      break L5;
                    }
                  }
                  return stackIn_43_0;
                }
              } else {
                L6: {
                  if (param1 != 43) {
                    stackIn_38_0 = 63;
                    break L6;
                  } else {
                    stackIn_38_0 = 62;
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
                        stackIn_26_0 = 63;
                        break L7;
                      } else {
                        stackIn_26_0 = 62;
                        break L7;
                      }
                    }
                    return stackIn_26_0;
                  }
                } else {
                  L8: {
                    if (param1 != 43) {
                      stackIn_21_0 = 63;
                      break L8;
                    } else {
                      stackIn_21_0 = 62;
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
                      stackIn_13_0 = 63;
                      break L9;
                    } else {
                      stackIn_13_0 = 62;
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
                    stackIn_7_0 = 63;
                    break L10;
                  } else {
                    stackIn_7_0 = 62;
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (this.field_J) {
                  stackIn_11_0 = 1;
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
              stackIn_9_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = var8_int;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("fj.R(");

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
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a((byte) 116, param3, param2, param1)) {
                break L1;
              } else {
                this.a(34, param2, param3, param1);
                this.a(-51, param1, param2, param3);
                discarded$64 = param2.append(" revert=").append(this.field_L);
                if (this.field_Q == 2147483647) {
                  break L1;
                } else {
                  if ((this.field_E ^ -1) != -2147483648) {
                    discarded$65 = param2.append(" to ").append(this.field_Q).append(',').append(this.field_E);
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
            stackIn_8_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("fj.BB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    final void a(int param0, int param1, byte param2, al param3) {
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
                      stackIn_10_0 = this;

                      stackIn_10_1 = this.field_p;

                      if (2 >= Math.abs(var5_int)) {
                        stackIn_12_0 = this;

                        if (var5_int <= 0) {
                          stackIn_13_0 = this;
                          stackIn_13_1 = stackIn_10_1;
                          stackIn_13_2 = -1;
                          break L6;
                        } else {
                          stackIn_13_0 = this;
                          stackIn_13_1 = stackIn_10_1;
                          stackIn_13_2 = 1;
                          break L6;
                        }
                      } else {
                        stackIn_13_0 = this;
                        stackIn_13_1 = stackIn_10_1;
                        stackIn_13_2 = var5_int >> 181225441;
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
                    stackIn_20_0 = this;

                    stackIn_20_1 = this.field_m;

                    if (-3 > (Math.abs(var5_int) ^ -1)) {
                      stackIn_21_0 = this;
                      stackIn_21_1 = stackIn_20_1;
                      stackIn_21_2 = var5_int >> -1210419711;
                      break L7;
                    } else {
                      stackIn_19_0 = this;

                      if (-1 > (var5_int ^ -1)) {
                        stackIn_21_0 = this;
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = 1;
                        break L7;
                      } else {
                        stackIn_21_0 = this;
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = -1;
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
            stackIn_32_0 = (RuntimeException) (var5);

            stackIn_32_1 = new StringBuilder().append("fj.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
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
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 == 1) {
              var3_int = 0;
              L1: while (true) {
                if ((param0 ^ -1) >= -1) {
                  stackIn_8_0 = var3_int;
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
              stackIn_3_0 = -24;
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
