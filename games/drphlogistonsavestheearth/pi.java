/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pi extends si {
    static vh field_P;
    private int field_K;
    private boolean field_H;
    private int field_L;
    private int field_U;
    private boolean field_T;
    private int field_M;
    static String field_W;
    static String field_J;
    static sa field_N;
    static bl field_I;
    static wg field_V;
    static int field_Q;
    static he[] field_S;
    static wa field_O;
    static String field_R;

    final static void a(boolean param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_W = (String) null;
                break L1;
              }
            }
            L2: {
              if (null != ug.field_I) {
                ug.field_I.field_V.a(2, param1);
                break L2;
              } else {
                break L2;
              }
            }
            if (null == dd.field_g) {
              break L0;
            } else {
              dd.field_g.field_O.a(2, param1);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("pi.C(").append(param0).append(',');

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
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    private pi(int param0, int param1, int param2, int param3, cg param4, fd param5, vg param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_K = 2147483647;
        this.field_M = 2147483647;
        try {
            this.field_T = param7 ? true : false;
            this.field_z = param6;
            this.field_H = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "pi.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void i(int param0) {
        super.i(0);
        this.field_z.a(param0, this.field_k, 0, 16535, this.field_w);
        this.field_M = this.field_o;
        this.field_K = this.field_m;
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.removeMouseListener(pj.field_G);
        param0.removeMouseMotionListener(pj.field_G);
        if (param1 != 1) {
            return;
        }
        try {
            param0.removeFocusListener(pj.field_G);
            tf.field_mb = 0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "pi.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        vg var9 = null;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 >= 113) {
                break L1;
              } else {
                var9 = (vg) null;
                this.a((vg) null, -121, -33, (byte) 86);
                break L1;
              }
            }
            L2: {
              var8_int = super.a(param0, param1, param2, (byte) 126, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L2;
              } else {
                if (this.field_H) {
                  stackIn_14_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            if (!this.a(param6, param5, false, param4, param0)) {
              stackIn_12_0 = var8_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L3: {
                if (1 == param2) {
                  this.field_L = -param5 + (-this.field_o + param4);
                  this.field_U = -this.field_m + (param0 - param6);
                  oh.field_b = (pi) (this);
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_y = param2;
              stackIn_10_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var8);

            stackIn_17_1 = new StringBuilder().append("pi.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final static void a(nh param0, int param1) {
        try {
            sa.field_e = param0;
            if (param1 != 21914) {
                field_S = (he[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "pi.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param1, param2, param0, -98)) {
                this.a(param2, (byte) 89, param0, param1);
                this.a(10, param2, param0, param1);
                discarded$62 = param2.append(" revert=").append(this.field_T);
                if (-2147483648 == (this.field_M ^ -1)) {
                  break L1;
                } else {
                  if ((this.field_K ^ -1) != -2147483648) {
                    discarded$63 = param2.append(" to ").append(this.field_M).append(',').append(this.field_K);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 == -10612) {
                break L2;
              } else {
                this.i(-7);
                break L2;
              }
            }
            stackIn_9_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("pi.WA(").append(param0).append(',');

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
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    public static void j(int param0) {
        field_I = null;
        field_V = null;
        field_J = null;
        if (param0 != 2147483647) {
          return;
        } else {
          field_P = null;
          field_R = null;
          field_O = null;
          field_W = null;
          field_S = null;
          field_N = null;
          return;
        }
    }

    final void a(vg param0, int param1, int param2, byte param3) {
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
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
                  if (!(this.field_z instanceof hf)) {
                    break L3;
                  } else {
                    if (!((hf) ((Object) this.field_z)).field_E) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.field_y != 1) {
                  break L2;
                } else {
                  L4: {
                    var5_int = -param1 + (-this.field_L + ck.field_c);
                    var6 = ob.field_g - this.field_U - param2;
                    if (var5_int != this.field_o) {
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
                  this.field_o = var5_int;
                  if (!(this.field_u instanceof te)) {
                    break L1;
                  } else {
                    ((te) ((Object) this.field_u)).a((pi) (this), -31124, param1, param2);
                    break L1;
                  }
                }
              }
              if (this.field_T) {
                L5: {
                  if (this.field_o == this.field_M) {
                    break L5;
                  } else {
                    L6: {
                      var5_int = -this.field_o + this.field_M;
                      stackIn_17_0 = this;

                      stackIn_17_1 = this.field_o;

                      if (Math.abs(var5_int) > 2) {
                        stackIn_18_0 = this;
                        stackIn_18_1 = stackIn_17_1;
                        stackIn_18_2 = var5_int >> 1841527681;
                        break L6;
                      } else {
                        stackIn_16_0 = this;

                        if (var5_int <= 0) {
                          stackIn_18_0 = this;
                          stackIn_18_1 = stackIn_17_1;
                          stackIn_18_2 = -1;
                          break L6;
                        } else {
                          stackIn_18_0 = this;
                          stackIn_18_1 = stackIn_17_1;
                          stackIn_18_2 = 1;
                          break L6;
                        }
                      }
                    }
                    ((pi) (this)).field_o = stackIn_18_1 + stackIn_18_2;
                    break L5;
                  }
                }
                if (this.field_m == this.field_K) {
                  break L1;
                } else {
                  L7: {
                    var5_int = this.field_K + -this.field_m;
                    stackIn_24_0 = this;

                    stackIn_24_1 = this.field_m;

                    if (-3 > (Math.abs(var5_int) ^ -1)) {
                      stackIn_25_0 = this;
                      stackIn_25_1 = stackIn_24_1;
                      stackIn_25_2 = var5_int >> -1711997215;
                      break L7;
                    } else {
                      stackIn_23_0 = this;

                      if (var5_int <= 0) {
                        stackIn_25_0 = this;
                        stackIn_25_1 = stackIn_24_1;
                        stackIn_25_2 = -1;
                        break L7;
                      } else {
                        stackIn_25_0 = this;
                        stackIn_25_1 = stackIn_24_1;
                        stackIn_25_2 = 1;
                        break L7;
                      }
                    }
                  }
                  ((pi) (this)).field_m = stackIn_25_1 + stackIn_25_2;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            super.a(param0, param1, param2, (byte) -128);
            if (param3 < -127) {
              break L0;
            } else {
              field_N = (sa) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("pi.I(");

            if (param0 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_y = 0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "pi.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_P = new vh();
        field_W = "Achievements";
        field_J = null;
        field_V = null;
        field_Q = -1;
        field_N = new sa(4, 1, 1, 1);
        field_R = "Names cannot contain consecutive spaces";
    }
}
