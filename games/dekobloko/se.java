/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class se extends ma {
    private int field_N;
    static lm field_S;
    static String field_V;
    static String field_Q;
    private int field_R;
    private boolean field_P;
    private int field_O;
    static w field_U;
    private int field_M;
    private boolean field_T;

    public static void g(int param0) {
        if (param0 != 11344) {
          se.i(-102);
          field_Q = null;
          field_V = null;
          field_S = null;
          field_U = null;
          return;
        } else {
          field_Q = null;
          field_V = null;
          field_S = null;
          field_U = null;
          return;
        }
    }

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (!this.field_P) {
                  break L1;
                } else {
                  stackIn_3_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (this.a(param1, (byte) -39, param4, param0, param5)) {
              this.field_o = param3;
              if ((param3 ^ -1) == -2) {
                this.field_N = -param5 + (param1 - this.field_u);
                lg.field_Y = (se) (this);
                this.field_R = param0 + -this.field_D + -param4;
                stackIn_10_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return true;
              }
            } else {
              stackIn_6_0 = var8_int;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var8);

            stackIn_13_1 = new StringBuilder().append("se.LB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final static java.applet.Applet h(int param0) {
        if (param0 != 25144) {
            se.i(-107);
            if (kb.field_h != null) {
                return kb.field_h;
            }
            return (java.applet.Applet) ((Object) ta.field_i);
        }
        if (kb.field_h != null) {
            return kb.field_h;
        }
        return (java.applet.Applet) ((Object) ta.field_i);
    }

    final static boolean i(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        if (param0 == -1) {
          if (!nm.field_Qb) {
            if (ph.n(param0 + -30145)) {
              return true;
            } else {
              return false;
            }
          } else {
            if (!qj.field_k) {
              L0: {
                if (!ph.n(param0 + -30145)) {
                  stackIn_21_0 = 0;
                  break L0;
                } else {
                  stackIn_21_0 = 1;
                  break L0;
                }
              }
              return stackIn_21_0 != 0;
            } else {
              stackIn_17_0 = 1;
              return stackIn_17_0 != 0;
            }
          }
        } else {
          se.i(107);
          if (nm.field_Qb) {
            if (qj.field_k) {
              return true;
            } else {
              L1: {
                if (!ph.n(param0 + -30145)) {
                  stackIn_10_0 = 0;
                  break L1;
                } else {
                  stackIn_10_0 = 1;
                  break L1;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            L2: {
              if (!ph.n(param0 + -30145)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final void a(ce param0, int param1, int param2, int param3) {
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
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
                  if (!(this.field_L instanceof ek)) {
                    break L3;
                  } else {
                    if (!((ek) ((Object) this.field_L)).field_I) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (1 == this.field_o) {
                  L4: {
                    var5_int = bh.field_g - (this.field_N - -param3);
                    var6 = pm.field_f - this.field_R - param2;
                    if (this.field_u != var5_int) {
                      break L4;
                    } else {
                      if (var6 != this.field_D) {
                        break L4;
                      } else {
                        break L1;
                      }
                    }
                  }
                  this.field_D = var6;
                  this.field_u = var5_int;
                  if (!(this.field_v instanceof mj)) {
                    break L1;
                  } else {
                    ((mj) ((Object) this.field_v)).a(param3, (se) (this), -24076, param2);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
              if (!this.field_T) {
                break L1;
              } else {
                L5: {
                  if (this.field_M != this.field_u) {
                    L6: {
                      var5_int = -this.field_u + this.field_M;
                      stackIn_10_0 = this;

                      stackIn_10_1 = this.field_u;

                      if (Math.abs(var5_int) <= 2) {
                        stackIn_12_0 = this;

                        if (-1 <= (var5_int ^ -1)) {
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
                        stackIn_13_2 = var5_int >> 1623977313;
                        break L6;
                      }
                    }
                    ((se) (this)).field_u = stackIn_13_1 + stackIn_13_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (this.field_D == this.field_O) {
                  break L1;
                } else {
                  L7: {
                    var5_int = this.field_O + -this.field_D;
                    stackIn_19_0 = this;

                    stackIn_19_1 = this.field_D;

                    if ((Math.abs(var5_int) ^ -1) < -3) {
                      stackIn_20_0 = this;
                      stackIn_20_1 = stackIn_19_1;
                      stackIn_20_2 = var5_int >> -553011135;
                      break L7;
                    } else {
                      stackIn_18_0 = this;

                      if ((var5_int ^ -1) < -1) {
                        stackIn_20_0 = this;
                        stackIn_20_1 = stackIn_19_1;
                        stackIn_20_2 = 1;
                        break L7;
                      } else {
                        stackIn_20_0 = this;
                        stackIn_20_1 = stackIn_19_1;
                        stackIn_20_2 = -1;
                        break L7;
                      }
                    }
                  }
                  ((se) (this)).field_D = stackIn_20_1 + stackIn_20_2;
                  break L1;
                }
              }
            }
            super.a(param0, 113, param2, param3);
            if (param1 >= 38) {
              break L0;
            } else {
              se.g(86);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("se.A(");

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
          throw dh.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(ji param0, ji param1, byte param2, boolean param3, ji param4) {
        try {
            jj.field_f = ui.a(0, "");
            jj.field_f.a(-21, false);
            fn.a(param0, param1, param4, 0);
            bl.g((byte) -121);
            sh.field_d = uc.field_c;
            if (param2 != 76) {
                ji var6 = (ji) null;
                se.a((ji) null, (ji) null, (byte) -98, true, (ji) null);
            }
            ka.field_P = uc.field_c;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "se.GB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        ce var6 = null;
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
              if (param3) {
                break L1;
              } else {
                var6 = (ce) null;
                this.a(-91, 66, (ce) null, 112, 104, 72, (byte) -16);
                break L1;
              }
            }
            L2: {
              if (this.a(0, param1, param0, param2)) {
                this.a((byte) 72, param2, param0, param1);
                this.a((byte) -105, param1, param2, param0);
                discarded$62 = param2.append(" revert=").append(this.field_T);
                if (-2147483648 == (this.field_M ^ -1)) {
                  break L2;
                } else {
                  if ((this.field_O ^ -1) != -2147483648) {
                    discarded$63 = param2.append(" to ").append(this.field_M).append(',').append(this.field_O);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
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

            stackIn_12_1 = new StringBuilder().append("se.MB(");

            if (param0 == null) {
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


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

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
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    final void b(boolean param0) {
        super.b(param0);
        this.field_L.b(this.field_y, this.field_t, 0, 0, -16555);
        this.field_O = this.field_D;
        this.field_M = this.field_u;
    }

    final void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        try {
            super.a(param0, param1 ^ 0, param2, param3, param4, param5);
            this.field_o = 0;
            if (param1 != 64) {
                field_S = (lm) null;
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "se.IB(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    private se(int param0, int param1, int param2, int param3, gl param4, kg param5, ce param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_O = 2147483647;
        this.field_M = 2147483647;
        try {
            this.field_T = param7 ? true : false;
            this.field_P = param8 ? true : false;
            this.field_L = param6;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "se.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_Q = "Create";
        field_V = "You cannot chat to <%0> because <%0> is not in your friend list.";
    }
}
