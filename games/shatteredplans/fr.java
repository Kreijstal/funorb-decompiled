/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fr extends qs {
    static String field_D;
    private int field_A;
    private int field_C;
    private int field_J;
    static String field_F;
    private boolean field_E;
    private boolean field_B;
    static String field_H;
    private int field_G;

    final static void f(byte param0) {
        int var1;
        int var2;
        var1 = (int)(1600.0 * (1.0 + Math.cos((double)((float)cl.field_n / 500.0f))));
        var2 = (int)(1600.0 * (-Math.sin((double)((float)cl.field_n / 500.0f)) + 1.0));
        if (param0 <= -28) {
          if (!fj.field_t.field_k) {
            ln.field_K.c(-var1 >> -950540796, -var2 >> -1246220924);
            return;
          } else {
            il.a(var1, 0, var2, ln.field_K);
            gf.f(0, 0, 640, 0);
            return;
          }
        } else {
          return;
        }
    }

    final void h(int param0) {
        super.h(param0);
        this.field_z.a(0, this.field_n, (byte) 101, 0, this.field_x);
        this.field_J = this.field_m;
        this.field_C = this.field_q;
    }

    final void a(int param0, int param1, vg param2, byte param3) {
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
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
                  if (!(this.field_z instanceof kg)) {
                    break L3;
                  } else {
                    if (!((kg) ((Object) this.field_z)).field_y) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if ((this.field_o ^ -1) != -2) {
                  break L2;
                } else {
                  L4: {
                    var5_int = -param0 + (pd.field_k - this.field_A);
                    var6 = -this.field_G + (bb.field_b - param1);
                    if (this.field_m != var5_int) {
                      break L4;
                    } else {
                      if (var6 == this.field_q) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_m = var5_int;
                  this.field_q = var6;
                  if (this.field_u instanceof cd) {
                    ((cd) ((Object) this.field_u)).a((byte) 80, param1, (fr) (this), param0);
                    break L1;
                  } else {
                    super.a(param0, param1, param2, param3);
                    return;
                  }
                }
              }
              if (!this.field_B) {
                break L1;
              } else {
                L5: {
                  if (this.field_m != this.field_J) {
                    L6: {
                      var5_int = -this.field_m + this.field_J;
                      stackIn_17_0 = this;

                      stackIn_17_1 = this.field_m;

                      if (2 < Math.abs(var5_int)) {
                        stackIn_18_0 = this;
                        stackIn_18_1 = stackIn_17_1;
                        stackIn_18_2 = var5_int >> -842827039;
                        break L6;
                      } else {
                        stackIn_16_0 = this;

                        if (-1 > (var5_int ^ -1)) {
                          stackIn_18_0 = this;
                          stackIn_18_1 = stackIn_17_1;
                          stackIn_18_2 = 1;
                          break L6;
                        } else {
                          stackIn_18_0 = this;
                          stackIn_18_1 = stackIn_17_1;
                          stackIn_18_2 = -1;
                          break L6;
                        }
                      }
                    }
                    ((fr) (this)).field_m = stackIn_18_1 + stackIn_18_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (this.field_C != this.field_q) {
                  L7: {
                    var5_int = -this.field_q + this.field_C;
                    stackIn_25_0 = this;

                    stackIn_25_1 = this.field_q;

                    if ((Math.abs(var5_int) ^ -1) < -3) {
                      stackIn_26_0 = this;
                      stackIn_26_1 = stackIn_25_1;
                      stackIn_26_2 = var5_int >> -312148607;
                      break L7;
                    } else {
                      stackIn_24_0 = this;

                      if (var5_int > 0) {
                        stackIn_26_0 = this;
                        stackIn_26_1 = stackIn_25_1;
                        stackIn_26_2 = 1;
                        break L7;
                      } else {
                        stackIn_26_0 = this;
                        stackIn_26_1 = stackIn_25_1;
                        stackIn_26_2 = -1;
                        break L7;
                      }
                    }
                  }
                  ((fr) (this)).field_q = stackIn_26_1 + stackIn_26_2;
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

            stackIn_31_1 = new StringBuilder().append("fr.PA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param3 + ')');
        }
    }

    final static String a(String param0, int param1, char param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param0.length();
              var5 = param3.length();
              var6 = var4_int;
              var7 = var5 - param1;
              if (0 == var7) {
                break L1;
              } else {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param0.indexOf((int) param2, var8_int);
                  if (0 <= var8_int) {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param0.indexOf((int) param2, var9);
              if (var10 >= 0) {
                discarded$0 = var8.append(param0.substring(var9, var10));
                var9 = var10 + 1;
                discarded$1 = var8.append(param3);
                continue L3;
              } else {
                discarded$2 = var8.append(param0.substring(var9));
                stackIn_11_0 = var8.toString();
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("fr.K(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        return stackIn_11_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_o = 0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "fr.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private fr(int param0, int param1, int param2, int param3, iq param4, ko param5, vg param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_C = 2147483647;
        this.field_J = 2147483647;
        try {
            this.field_E = param8 ? true : false;
            this.field_B = param7 ? true : false;
            this.field_z = param6;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "fr.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = 6 % ((64 - param0) / 61);
              if (!this.a(false, param2, param3, param1)) {
                break L1;
              } else {
                this.a(param1, param2, false, param3);
                this.a(81, param1, param2, param3);
                discarded$64 = param3.append(" revert=").append(this.field_B);
                if ((this.field_J ^ -1) == -2147483648) {
                  break L1;
                } else {
                  if (this.field_C != 2147483647) {
                    discarded$65 = param3.append(" to ").append(this.field_J).append(',').append(this.field_C);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackIn_6_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("fr.NA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final static Boolean j(int param0) {
        if (param0 != 0) {
            return (Boolean) null;
        }
        Boolean var1 = sa.field_d;
        sa.field_d = null;
        return var1;
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8_int = super.a(param0, param1, (byte) 118, param3, param4, param5, param6) ? 1 : 0;
            if (param2 > 95) {
              L1: {
                if (var8_int == 0) {
                  break L1;
                } else {
                  if (this.field_E) {
                    stackIn_15_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (!this.a(param1, 101, param3, param5, param4)) {
                stackIn_13_0 = var8_int;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L2: {
                  if (-2 == (param0 ^ -1)) {
                    this.field_A = -param4 + (param1 + -this.field_m);
                    oa.field_b = (fr) (this);
                    this.field_G = -param5 + -this.field_q + param3;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_o = param0;
                stackIn_11_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var8);

            stackIn_18_1 = new StringBuilder().append("fr.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              return stackIn_15_0 != 0;
            }
          }
        }
    }

    public static void i(int param0) {
        field_H = null;
        if (param0 != -950540796) {
            return;
        }
        field_D = null;
        field_F = null;
    }

    static {
        field_D = "Create a free account to start using this feature";
        field_F = "<%highlight>HOT KEYS</col> - For placement, fleet moves and fleet strength adjustment, <%key>'SHIFT'</col> will make changes in units of <%highlight>one fleet</col>, <%key>'ALT'</col> will use units of <%highlight>5 fleets</col>, and <%key>'CTRL'</col> will use <%highlight>all available fleets</col>.";
    }
}
