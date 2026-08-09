/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class oi extends da {
    private boolean field_I;
    private boolean field_H;
    private int field_L;
    private int field_O;
    private int field_K;
    private int field_N;
    static ec field_J;
    static md field_F;
    static String field_G;
    static String field_M;

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, byte param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param1, param0, 87, param2)) {
                this.a(param0, param2, param1, 1);
                this.a(true, param2, param0, param1);
                discarded$62 = param2.append(" revert=").append(this.field_I);
                if (-2147483648 == (this.field_L ^ -1)) {
                  break L1;
                } else {
                  if (-2147483648 != (this.field_N ^ -1)) {
                    discarded$63 = param2.append(" to ").append(this.field_L).append(',').append(this.field_N);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            if (param3 <= -76) {
              stackIn_10_0 = (StringBuilder) (param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_8_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("oi.CB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_10_0;
        }
    }

    final void a(int param0, int param1, lm param2, boolean param3) {
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
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
                  if (!(this.field_D instanceof ck)) {
                    break L3;
                  } else {
                    if (!((ck) ((Object) this.field_D)).field_B) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.field_y == 1) {
                  L4: {
                    var5_int = -param0 + (-this.field_K + hj.field_S);
                    var6 = -param1 + -this.field_O + eh.field_h;
                    if (this.field_q != var5_int) {
                      break L4;
                    } else {
                      if (var6 == this.field_v) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_q = var5_int;
                  this.field_v = var6;
                  if (!(this.field_n instanceof vi)) {
                    break L1;
                  } else {
                    ((vi) ((Object) this.field_n)).a((byte) -49, (oi) (this), param1, param0);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
              if (!this.field_I) {
                break L1;
              } else {
                L5: {
                  if (this.field_L == this.field_q) {
                    break L5;
                  } else {
                    L6: {
                      var5_int = this.field_L + -this.field_q;
                      stackIn_9_0 = this;

                      stackIn_9_1 = this.field_q;

                      if ((Math.abs(var5_int) ^ -1) >= -3) {
                        stackIn_11_0 = this;

                        if ((var5_int ^ -1) >= -1) {
                          stackIn_12_0 = this;
                          stackIn_12_1 = stackIn_9_1;
                          stackIn_12_2 = -1;
                          break L6;
                        } else {
                          stackIn_12_0 = this;
                          stackIn_12_1 = stackIn_9_1;
                          stackIn_12_2 = 1;
                          break L6;
                        }
                      } else {
                        stackIn_12_0 = this;
                        stackIn_12_1 = stackIn_9_1;
                        stackIn_12_2 = var5_int >> -1326086559;
                        break L6;
                      }
                    }
                    ((oi) (this)).field_q = stackIn_12_1 + stackIn_12_2;
                    break L5;
                  }
                }
                if (this.field_N != this.field_v) {
                  L7: {
                    var5_int = this.field_N - this.field_v;
                    stackIn_17_0 = this;

                    stackIn_17_1 = this.field_v;

                    if (Math.abs(var5_int) <= 2) {
                      stackIn_19_0 = this;

                      if (0 < var5_int) {
                        stackIn_20_0 = this;
                        stackIn_20_1 = stackIn_17_1;
                        stackIn_20_2 = 1;
                        break L7;
                      } else {
                        stackIn_20_0 = this;
                        stackIn_20_1 = stackIn_17_1;
                        stackIn_20_2 = -1;
                        break L7;
                      }
                    } else {
                      stackIn_20_0 = this;
                      stackIn_20_1 = stackIn_17_1;
                      stackIn_20_2 = var5_int >> -1050059583;
                      break L7;
                    }
                  }
                  ((oi) (this)).field_v = stackIn_20_1 + stackIn_20_2;
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
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("oi.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ')');
        }
    }

    final static int b(int param0, int param1) {
        if (param0 != 0) {
            return 121;
        }
        return uj.a(ld.field_f, param0 ^ 37, param1);
    }

    private oi(int param0, int param1, int param2, int param3, ca param4, pg param5, lm param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_L = 2147483647;
        this.field_N = 2147483647;
        try {
            this.field_D = param6;
            this.field_H = param8 ? true : false;
            this.field_I = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "oi.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean a(lm param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int stackIn_7_0 = 0;
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
              var8_int = super.a(param0, param1, param2, param3, param4, (byte) -2, param6) ? 1 : 0;
              var9 = -65 / ((-80 - param5) / 35);
              if (var8_int == 0) {
                break L1;
              } else {
                if (this.field_H) {
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!this.a(param4, param3, param6, -1, param2)) {
              stackIn_9_0 = var8_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                if (1 != param1) {
                  break L2;
                } else {
                  this.field_O = param2 + (-this.field_v + -param6);
                  ah.field_b = (oi) (this);
                  this.field_K = -param3 + param4 - this.field_q;
                  break L2;
                }
              }
              this.field_y = param1;
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("oi.U(");

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
          throw vk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final void e(byte param0) {
        super.e((byte) -42);
        this.field_D.b(0, this.field_x, 0, 0, this.field_s);
        if (param0 >= -4) {
          return;
        } else {
          this.field_L = this.field_q;
          this.field_N = this.field_v;
          return;
        }
    }

    final static cn[] a(int param0, int param1, int param2, nh param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              break L0;
            } else {
              field_F = (md) null;
              break L0;
            }
          }
          if (kk.a(param3, 1, param1, param2)) {
            return fo.a(0);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("oi.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void f(byte param0) {
        oh.field_s = 10;
        jn.field_c = false;
        ke.field_b = vd.field_a;
        if (param0 != 100) {
            return;
        }
        jm.a(param0 ^ -17601);
    }

    final static boolean a(int param0, int param1) {
        try {
            if (ra.field_c.field_o >= param1) {
                return true;
            }
            if (!(null != sp.field_c)) {
                return false;
            }
            int var2_int = sp.field_c.a(0);
            if (0 < var2_int) {
                if (-ra.field_c.field_o + param1 < var2_int) {
                    var2_int = -ra.field_c.field_o + param1;
                }
                sp.field_c.a(ra.field_c.field_m, false, var2_int, ra.field_c.field_o);
                qm.field_o = kd.c(param0 ^ 15127);
                ra.field_c.field_o = ra.field_c.field_o + var2_int;
                if (!(param1 <= ra.field_c.field_o)) {
                    return false;
                }
                ra.field_c.field_o = 0;
                return true;
            }
            try {
                if (false) throw (IOException) null;
                if (param0 != -12929) {
                    field_F = (md) null;
                }
                if ((var2_int ^ -1) <= -1 && b.a(124) <= 30000L) {
                    return false;
                }
                tl.a(-77);
            } catch (IOException iOException) {
                tl.a(param0 + 13056);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, boolean param1, int param2, lm param3, int param4, int param5) {
        try {
            if (!param1) {
                this.field_K = 60;
            }
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_y = 0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "oi.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void h(int param0) {
        if (param0 < 108) {
          field_J = (ec) null;
          field_M = null;
          field_F = null;
          field_J = null;
          field_G = null;
          return;
        } else {
          field_M = null;
          field_F = null;
          field_J = null;
          field_G = null;
          return;
        }
    }

    static {
        field_J = new ec(1048576);
        field_G = "Connection lost. <%0>";
        field_F = null;
        field_M = "Save and exit";
    }
}
