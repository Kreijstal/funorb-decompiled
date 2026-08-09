/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aj extends jh {
    private boolean field_H;
    private int field_K;
    private int field_G;
    private int field_I;
    private boolean field_F;
    static float field_E;
    static int field_J;
    private int field_D;

    final static void a(int param0) {
        if (param0 != 2) {
            return;
        }
        od.b(128, 17);
    }

    final void a(int param0, gm param1, int param2, int param3) {
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(this.field_C instanceof lg)) {
                    break L3;
                  } else {
                    if (!((lg) ((Object) this.field_C)).field_x) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.field_l == 1) {
                  L4: {
                    var5_int = n.field_t + -this.field_K - param3;
                    var6 = k.field_e + (-this.field_G + -param2);
                    if (this.field_w != var5_int) {
                      break L4;
                    } else {
                      if (this.field_k != var6) {
                        break L4;
                      } else {
                        var5_int = -58 / ((param0 - -28) / 43);
                        super.a(-71, param1, param2, param3);
                        return;
                      }
                    }
                  }
                  this.field_k = var6;
                  this.field_w = var5_int;
                  if (this.field_t instanceof sj) {
                    ((sj) ((Object) this.field_t)).a(param2, (aj) (this), (byte) -83, param3);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
              if (!this.field_H) {
                break L1;
              } else {
                L5: {
                  if (this.field_w == this.field_D) {
                    break L5;
                  } else {
                    L6: {
                      var5_int = this.field_D + -this.field_w;
                      stackIn_9_0 = this;

                      stackIn_9_1 = this.field_w;

                      if (Math.abs(var5_int) <= 2) {
                        stackIn_11_0 = this;

                        if (var5_int > 0) {
                          stackIn_12_0 = this;
                          stackIn_12_1 = stackIn_9_1;
                          stackIn_12_2 = 1;
                          break L6;
                        } else {
                          stackIn_12_0 = this;
                          stackIn_12_1 = stackIn_9_1;
                          stackIn_12_2 = -1;
                          break L6;
                        }
                      } else {
                        stackIn_12_0 = this;
                        stackIn_12_1 = stackIn_9_1;
                        stackIn_12_2 = var5_int >> 1279222241;
                        break L6;
                      }
                    }
                    ((aj) (this)).field_w = stackIn_12_1 + stackIn_12_2;
                    break L5;
                  }
                }
                if (this.field_k == this.field_I) {
                  break L1;
                } else {
                  L7: {
                    var5_int = -this.field_k + this.field_I;
                    stackIn_18_0 = this;

                    stackIn_18_1 = this.field_k;

                    if (-3 > (Math.abs(var5_int) ^ -1)) {
                      stackIn_19_0 = this;
                      stackIn_19_1 = stackIn_18_1;
                      stackIn_19_2 = var5_int >> -655719295;
                      break L7;
                    } else {
                      stackIn_17_0 = this;

                      if (-1 > (var5_int ^ -1)) {
                        stackIn_19_0 = this;
                        stackIn_19_1 = stackIn_18_1;
                        stackIn_19_2 = 1;
                        break L7;
                      } else {
                        stackIn_19_0 = this;
                        stackIn_19_1 = stackIn_18_1;
                        stackIn_19_2 = -1;
                        break L7;
                      }
                    }
                  }
                  ((aj) (this)).field_k = stackIn_19_1 + stackIn_19_2;
                  break L1;
                }
              }
            }
            var5_int = -58 / ((param0 - -28) / 43);
            super.a(-71, param1, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("aj.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3, gm param4, int param5) {
        super.a(param0, param1, param2, (byte) 124, param4, param5);
        if (param3 < 109) {
            return;
        }
        try {
            this.field_l = 0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "aj.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final StringBuilder a(StringBuilder param0, byte param1, Hashtable param2, int param3) {
        StringBuilder discarded$70 = null;
        StringBuilder discarded$71 = null;
        RuntimeException var5 = null;
        gm var6 = null;
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
              if (param1 == 117) {
                break L1;
              } else {
                var6 = (gm) null;
                this.a(68, -37, 53, -107, -120, (gm) null, (byte) 32);
                break L1;
              }
            }
            L2: {
              if (!this.a(param1 ^ -31757, param0, param2, param3)) {
                break L2;
              } else {
                this.a(param0, param3, true, param2);
                this.a(param3, param2, param0, param1 ^ -16410);
                discarded$70 = param0.append(" revert=").append(this.field_H);
                if (2147483647 == this.field_D) {
                  break L2;
                } else {
                  if ((this.field_I ^ -1) != -2147483648) {
                    discarded$71 = param0.append(" to ").append(this.field_D).append(',').append(this.field_I);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_8_0 = (StringBuilder) (param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("aj.O(");

            if (param0 == null) {
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


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

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
          throw rb.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    final void f(byte param0) {
        super.f((byte) 121);
        this.field_C.a((byte) 125, 0, 0, this.field_o, this.field_p);
        if (param0 < 103) {
          return;
        } else {
          this.field_I = this.field_k;
          this.field_D = this.field_w;
          return;
        }
    }

    private aj(int param0, int param1, int param2, int param3, el param4, ca param5, gm param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_I = 2147483647;
        this.field_D = 2147483647;
        try {
            this.field_F = param8 ? true : false;
            this.field_C = param6;
            this.field_H = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "aj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(byte param0, boolean param1, double[] param2, double param3) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var7 = Torquing.field_u;
        try {
          L0: {
            L1: {
              L2: {
                if (qd.field_d != 2) {
                  break L2;
                } else {
                  if (1000.0 < ap.a(param2, 3, param2, 3)) {
                    L3: {
                      if (param1) {
                        var5_int = 11;
                        break L3;
                      } else {
                        if (param3 != 0.0) {
                          var5_int = 1;
                          break L3;
                        } else {
                          var5_int = 0;
                          break L3;
                        }
                      }
                    }
                    L4: {
                      var6 = (int)Math.sqrt(-1000.0 + ap.a(param2, 3, param2, 3)) * 96 >> 1013561415;
                      if (255 < var6) {
                        var6 = 255;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    np.a(var5_int, -32596, var6);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              np.a(-1, param0 + -32540, 0);
              break L1;
            }
            if (param0 == -56) {
              break L0;
            } else {
              field_E = 1.1098183393478394f;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("aj.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param6 >= 5) {
                break L1;
              } else {
                this.field_K = -35;
                break L1;
              }
            }
            L2: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, (byte) 105) ? 1 : 0;
              if (var8_int == 0) {
                break L2;
              } else {
                if (!this.field_F) {
                  break L2;
                } else {
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (!this.a(param3, param4, param1, param2, 87)) {
              stackIn_13_0 = var8_int;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L3: {
                if (param0 == 1) {
                  this.field_K = -param1 + param4 + -this.field_w;
                  this.field_G = -param2 + param3 - this.field_k;
                  lp.field_d = (aj) (this);
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_l = param0;
              stackIn_11_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var8);

            stackIn_16_1 = new StringBuilder().append("aj.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param6 + ')');
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

    static {
    }
}
