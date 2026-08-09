/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ef extends mc {
    private int field_C;
    static String field_A;
    private int field_D;
    static int field_z;
    private boolean field_B;
    private int field_x;
    static boolean field_E;
    static arb field_y;
    private int field_w;
    private boolean field_v;

    final StringBuilder a(boolean param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a(param1, param2, (byte) 115, param3)) {
                break L1;
              } else {
                this.a(124, param2, param1, param3);
                this.a(param2, 13, param3, param1);
                discarded$64 = param3.append(" revert=").append(this.field_B);
                if (-2147483648 == (this.field_w ^ -1)) {
                  break L1;
                } else {
                  if (2147483647 == this.field_C) {
                    break L1;
                  } else {
                    discarded$65 = param3.append(" to ").append(this.field_w).append(',').append(this.field_C);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                this.field_x = 60;
                break L2;
              }
            }
            stackIn_7_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("ef.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    final void a(byte param0, int param1, int param2, int param3, shb param4, int param5) {
        try {
            super.a((byte) 124, param1, param2, param3, param4, param5);
            int var7_int = -8 / ((param0 - 52) / 52);
            this.field_n = 0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ef.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    ef(int param0, int param1, int param2, int param3, wwa param4, sba param5, shb param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_C = 2147483647;
        this.field_w = 2147483647;
        try {
            this.field_B = param7 ? true : false;
            this.field_v = param8 ? true : false;
            this.field_t = param6;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ef.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param6 < -17) {
                break L1;
              } else {
                this.field_B = false;
                break L1;
              }
            }
            L2: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, (byte) -100) ? 1 : 0;
              if (var8_int == 0) {
                break L2;
              } else {
                if (!this.field_v) {
                  break L2;
                } else {
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (!this.a(param2, param1, param0, param5, (byte) 22)) {
              stackIn_12_0 = var8_int;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              this.field_n = param3;
              if ((param3 ^ -1) == -2) {
                this.field_D = -this.field_g + (param0 + -param1);
                this.field_x = -this.field_r + param2 + -param5;
                lb.field_p = (ef) (this);
                stackIn_10_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("ef.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final void a(int param0, int param1, int param2, shb param3) {
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(this.field_t instanceof htb)) {
                    break L3;
                  } else {
                    if (!((htb) ((Object) this.field_t)).field_x) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (-2 != (this.field_n ^ -1)) {
                  break L2;
                } else {
                  L4: {
                    var5_int = -this.field_D + (kc.field_b + -param1);
                    var6 = -this.field_x + uia.field_b - param0;
                    if (this.field_g != var5_int) {
                      break L4;
                    } else {
                      if (this.field_r == var6) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_g = var5_int;
                  this.field_r = var6;
                  if (!(this.field_l instanceof l)) {
                    break L1;
                  } else {
                    ((l) ((Object) this.field_l)).a(false, param1, param0, (ef) (this));
                    break L1;
                  }
                }
              }
              if (!this.field_B) {
                break L1;
              } else {
                L5: {
                  if (this.field_w != this.field_g) {
                    L6: {
                      var5_int = -this.field_g + this.field_w;
                      stackIn_15_0 = this;

                      stackIn_15_1 = this.field_g;

                      if (-3 <= (Math.abs(var5_int) ^ -1)) {
                        stackIn_17_0 = this;

                        if (-1 <= (var5_int ^ -1)) {
                          stackIn_18_0 = this;
                          stackIn_18_1 = stackIn_15_1;
                          stackIn_18_2 = -1;
                          break L6;
                        } else {
                          stackIn_18_0 = this;
                          stackIn_18_1 = stackIn_15_1;
                          stackIn_18_2 = 1;
                          break L6;
                        }
                      } else {
                        stackIn_18_0 = this;
                        stackIn_18_1 = stackIn_15_1;
                        stackIn_18_2 = var5_int >> -891170431;
                        break L6;
                      }
                    }
                    ((ef) (this)).field_g = stackIn_18_1 + stackIn_18_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (this.field_C != this.field_r) {
                  L7: {
                    var5_int = -this.field_r + this.field_C;
                    stackIn_25_0 = this;

                    stackIn_25_1 = this.field_r;

                    if (-3 > (Math.abs(var5_int) ^ -1)) {
                      stackIn_26_0 = this;
                      stackIn_26_1 = stackIn_25_1;
                      stackIn_26_2 = var5_int >> -698883775;
                      break L7;
                    } else {
                      stackIn_24_0 = this;

                      if (var5_int <= 0) {
                        stackIn_26_0 = this;
                        stackIn_26_1 = stackIn_25_1;
                        stackIn_26_2 = -1;
                        break L7;
                      } else {
                        stackIn_26_0 = this;
                        stackIn_26_1 = stackIn_25_1;
                        stackIn_26_2 = 1;
                        break L7;
                      }
                    }
                  }
                  ((ef) (this)).field_r = stackIn_26_1 + stackIn_26_2;
                  break L1;
                } else {
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
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("ef.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
    }

    final void a(int param0) {
        super.a(120);
        this.field_t.a(0, this.field_h, this.field_f, 1, 0);
        this.field_w = this.field_g;
        int var2 = -102 / ((param0 - -80) / 42);
        this.field_C = this.field_r;
    }

    public static void e(int param0) {
        field_y = null;
        field_A = null;
        int var1 = 124 % ((-23 - param0) / 44);
    }

    final static caa a(String param0, String param1, int param2, asb param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        asb var6 = null;
        caa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 < -47) {
                break L1;
              } else {
                var6 = (asb) null;
                ef.a((String) null, (String) null, 4, (asb) null);
                break L1;
              }
            }
            var4_int = param3.b(param1, -97);
            var5 = param3.a(true, var4_int, param0);
            stackIn_3_0 = rr.a(-32431, param3, var4_int, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ef.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_E = false;
        field_A = "You do not have a suitable number of players for the current options.";
    }
}
