/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class la extends sh {
    private int field_D;
    private boolean field_F;
    static hh field_I;
    private int field_G;
    private int field_B;
    private boolean field_C;
    private int field_H;
    static hh field_E;

    final void a(int param0, int param1, boolean param2, el param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_f = 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "la.TA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
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
                  if (!(this.field_A instanceof hk)) {
                    break L3;
                  } else {
                    if (!((hk) ((Object) this.field_A)).field_D) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (-2 != (this.field_f ^ -1)) {
                  break L2;
                } else {
                  L4: {
                    var5_int = qa.field_a - this.field_D + -param3;
                    var6 = -this.field_H + (ue.field_e - param1);
                    if (this.field_v != var5_int) {
                      break L4;
                    } else {
                      if (var6 != this.field_m) {
                        break L4;
                      } else {
                        break L1;
                      }
                    }
                  }
                  this.field_m = var6;
                  this.field_v = var5_int;
                  if (!(this.field_u instanceof de)) {
                    break L1;
                  } else {
                    ((de) ((Object) this.field_u)).a(param3, -20951, (la) (this), param1);
                    break L1;
                  }
                }
              }
              if (this.field_C) {
                L5: {
                  if (this.field_B != this.field_v) {
                    L6: {
                      var5_int = this.field_B - this.field_v;
                      stackIn_17_0 = this;

                      stackIn_17_1 = this.field_v;

                      if ((Math.abs(var5_int) ^ -1) < -3) {
                        stackIn_18_0 = this;
                        stackIn_18_1 = stackIn_17_1;
                        stackIn_18_2 = var5_int >> -218590175;
                        break L6;
                      } else {
                        stackIn_16_0 = this;

                        if (0 >= var5_int) {
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
                    ((la) (this)).field_v = stackIn_18_1 + stackIn_18_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (this.field_m != this.field_G) {
                  L7: {
                    var5_int = this.field_G + -this.field_m;
                    stackIn_23_0 = this;

                    stackIn_23_1 = this.field_m;

                    if ((Math.abs(var5_int) ^ -1) >= -3) {
                      stackIn_25_0 = this;

                      if ((var5_int ^ -1) < -1) {
                        stackIn_26_0 = this;
                        stackIn_26_1 = stackIn_23_1;
                        stackIn_26_2 = 1;
                        break L7;
                      } else {
                        stackIn_26_0 = this;
                        stackIn_26_1 = stackIn_23_1;
                        stackIn_26_2 = -1;
                        break L7;
                      }
                    } else {
                      stackIn_26_0 = this;
                      stackIn_26_1 = stackIn_23_1;
                      stackIn_26_2 = var5_int >> 866046689;
                      break L7;
                    }
                  }
                  ((la) (this)).field_m = stackIn_26_1 + stackIn_26_2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            super.a(param0, param1, param2, param3);
            if (!param0) {
              break L0;
            } else {
              this.field_G = 54;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var5);

            stackIn_32_1 = new StringBuilder().append("la.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param3 + ')');
        }
    }

    private la(int param0, int param1, int param2, int param3, dh param4, bb param5, el param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_G = 2147483647;
        this.field_B = 2147483647;
        try {
            this.field_A = param6;
            this.field_C = param7 ? true : false;
            this.field_F = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "la.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final StringBuilder a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$70 = null;
        StringBuilder discarded$71 = null;
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
              if (!this.a(param1, param3, 10095, param2)) {
                break L1;
              } else {
                this.a(param3, param2, 34, param1);
                this.b(param3, param1, param2, param0 + 0);
                discarded$70 = param1.append(" revert=").append(this.field_C);
                if ((this.field_B ^ -1) == -2147483648) {
                  break L1;
                } else {
                  if (this.field_G != 2147483647) {
                    discarded$71 = param1.append(" to ").append(this.field_B).append(',').append(this.field_G);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                field_E = (hh) null;
                break L2;
              }
            }
            stackIn_8_0 = (StringBuilder) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("la.PA(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
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
              var8_int = super.a(param0, 53, param2, param3, param4, param5, param6) ? 1 : 0;
              var9 = 5 % ((-3 - param1) / 38);
              if (var8_int == 0) {
                break L1;
              } else {
                if (!this.field_F) {
                  break L1;
                } else {
                  stackIn_3_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (!this.a(param4, -1, param5, param0, param2)) {
              stackIn_10_0 = var8_int;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              this.field_f = param3;
              if (param3 != 1) {
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_H = -param0 + param5 + -this.field_m;
                this.field_D = -param2 + (param4 - this.field_v);
                lh.field_b = (la) (this);
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var8);

            stackIn_13_1 = new StringBuilder().append("la.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final static void f(byte param0) {
        if (param0 != 24) {
          la.g((byte) 86);
          fh.b(-6011);
          ii.field_a = true;
          cf.field_i = true;
          kd.field_e.f(param0 + 10912);
          fa.a(ah.field_b, 480, false);
          return;
        } else {
          fh.b(-6011);
          ii.field_a = true;
          cf.field_i = true;
          kd.field_e.f(param0 + 10912);
          fa.a(ah.field_b, 480, false);
          return;
        }
    }

    final void b(boolean param0) {
        super.b(param0);
        this.field_A.a(this.field_h, this.field_r, (byte) -85, 0, 0);
        this.field_B = this.field_v;
        this.field_G = this.field_m;
    }

    public static void g(byte param0) {
        int var1 = 47 % ((param0 - -51) / 55);
        field_E = null;
        field_I = null;
    }

    static {
        field_I = new hh();
        field_E = new hh();
    }
}
