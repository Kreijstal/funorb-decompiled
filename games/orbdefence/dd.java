/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dd extends kj {
    static cb field_A;
    private int field_C;
    private boolean field_H;
    private int field_G;
    private boolean field_I;
    private int field_F;
    static java.security.SecureRandom field_D;
    static int[] field_B;
    private int field_E;

    final void a(int param0, int param1, byte param2, pj param3, int param4, int param5) {
        try {
            super.a(param0, param1, (byte) -117, param3, param4, param5);
            if (param2 >= -91) {
                pj var8 = (pj) null;
                this.a(-94, 81, (byte) 57, (pj) null, 57, -115);
            }
            this.field_v = 0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "dd.J(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
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
                  if (!(this.field_y instanceof s)) {
                    break L3;
                  } else {
                    if (!((s) ((Object) this.field_y)).field_F) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (-2 != (this.field_v ^ -1)) {
                  break L2;
                } else {
                  L4: {
                    var5_int = -this.field_C + (ua.field_a - param2);
                    var6 = vl.field_d + (-this.field_F - param3);
                    if (this.field_s != var5_int) {
                      break L4;
                    } else {
                      if (this.field_n != var6) {
                        break L4;
                      } else {
                        break L1;
                      }
                    }
                  }
                  this.field_s = var5_int;
                  this.field_n = var6;
                  if (this.field_h instanceof gf) {
                    ((gf) ((Object) this.field_h)).a(param2, true, param3, (dd) (this));
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              if (this.field_I) {
                L5: {
                  if (this.field_E != this.field_s) {
                    L6: {
                      var5_int = this.field_E - this.field_s;
                      stackIn_18_0 = this;

                      stackIn_18_1 = this.field_s;

                      if (-3 > (Math.abs(var5_int) ^ -1)) {
                        stackIn_19_0 = this;
                        stackIn_19_1 = stackIn_18_1;
                        stackIn_19_2 = var5_int >> 1398164449;
                        break L6;
                      } else {
                        stackIn_17_0 = this;

                        if (-1 > (var5_int ^ -1)) {
                          stackIn_19_0 = this;
                          stackIn_19_1 = stackIn_18_1;
                          stackIn_19_2 = 1;
                          break L6;
                        } else {
                          stackIn_19_0 = this;
                          stackIn_19_1 = stackIn_18_1;
                          stackIn_19_2 = -1;
                          break L6;
                        }
                      }
                    }
                    ((dd) (this)).field_s = stackIn_19_1 + stackIn_19_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (this.field_n != this.field_G) {
                  L7: {
                    var5_int = this.field_G - this.field_n;
                    stackIn_26_0 = this;

                    stackIn_26_1 = this.field_n;

                    if (2 < Math.abs(var5_int)) {
                      stackIn_27_0 = this;
                      stackIn_27_1 = stackIn_26_1;
                      stackIn_27_2 = var5_int >> -1907579935;
                      break L7;
                    } else {
                      stackIn_25_0 = this;

                      if (-1 > (var5_int ^ -1)) {
                        stackIn_27_0 = this;
                        stackIn_27_1 = stackIn_26_1;
                        stackIn_27_2 = 1;
                        break L7;
                      } else {
                        stackIn_27_0 = this;
                        stackIn_27_1 = stackIn_26_1;
                        stackIn_27_2 = -1;
                        break L7;
                      }
                    }
                  }
                  ((dd) (this)).field_n = stackIn_27_1 + stackIn_27_2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                super.a(param0, param1, param2, param3);
                return;
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

            stackIn_32_1 = new StringBuilder().append("dd.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
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
              if (param0 <= -23) {
                break L1;
              } else {
                dd.c((byte) 95);
                break L1;
              }
            }
            L2: {
              if (!this.a(9882, param3, param2, param1)) {
                break L2;
              } else {
                this.a(param2, (byte) -98, param1, param3);
                this.a(param3, param2, -19956, param1);
                discarded$64 = param3.append(" revert=").append(this.field_I);
                if ((this.field_E ^ -1) == -2147483648) {
                  break L2;
                } else {
                  if (2147483647 == this.field_G) {
                    break L2;
                  } else {
                    discarded$65 = param3.append(" to ").append(this.field_E).append(',').append(this.field_G);
                    break L2;
                  }
                }
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

            stackIn_10_1 = new StringBuilder().append("dd.C(").append(param0).append(',');

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
          throw dd.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    final static ui a(Throwable param0, String param1) {
        ui var2 = null;
        if (param0 instanceof ui) {
            var2 = (ui) ((Object) param0);
            var2.field_d = var2.field_d + ' ' + param1;
        } else {
            var2 = new ui(param0, param1);
        }
        return var2;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, boolean param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = OrbDefence.field_D ? 1 : 0;
        if (param10) {
          field_D = (java.security.SecureRandom) null;
          if (param14 <= param6) {
            if (param6 >= param5) {
              if (param14 >= param5) {
                ke.a(param9, param15, param14, param0, param3, param11, param7, param13, param8, ul.field_b, param12, param1, param6, param4, param5, param2, 1551567504);
                return;
              } else {
                ke.a(param7, param15, param5, param0, param3, param8, param9, param4, param11, ul.field_b, param2, param1, param6, param13, param14, param12, 1551567504);
                return;
              }
            } else {
              ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
              return;
            }
          } else {
            if (param5 <= param14) {
              if (param5 > param6) {
                ke.a(param7, param9, param5, param4, param8, param3, param15, param0, param11, ul.field_b, param1, param2, param14, param13, param6, param12, 1551567504);
                return;
              } else {
                ke.a(param15, param9, param6, param4, param8, param11, param7, param13, param3, ul.field_b, param12, param2, param14, param0, param5, param1, 1551567504);
                return;
              }
            } else {
              ke.a(param9, param7, param14, param13, param11, param3, param15, param0, param8, ul.field_b, param1, param12, param5, param4, param6, param2, 1551567504);
              return;
            }
          }
        } else {
          if (param14 <= param6) {
            if (param6 >= param5) {
              if (param14 >= param5) {
                ke.a(param9, param15, param14, param0, param3, param11, param7, param13, param8, ul.field_b, param12, param1, param6, param4, param5, param2, 1551567504);
                return;
              } else {
                ke.a(param7, param15, param5, param0, param3, param8, param9, param4, param11, ul.field_b, param2, param1, param6, param13, param14, param12, 1551567504);
                return;
              }
            } else {
              ke.a(param15, param7, param6, param13, param11, param8, param9, param4, param3, ul.field_b, param2, param12, param5, param0, param14, param1, 1551567504);
              return;
            }
          } else {
            if (param5 <= param14) {
              if (param5 > param6) {
                ke.a(param7, param9, param5, param4, param8, param3, param15, param0, param11, ul.field_b, param1, param2, param14, param13, param6, param12, 1551567504);
                return;
              } else {
                ke.a(param15, param9, param6, param4, param8, param11, param7, param13, param3, ul.field_b, param12, param2, param14, param0, param5, param1, 1551567504);
                return;
              }
            } else {
              ke.a(param9, param7, param14, param13, param11, param3, param15, param0, param8, ul.field_b, param1, param12, param5, param4, param6, param2, 1551567504);
              return;
            }
          }
        }
    }

    final boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        pj var9 = null;
        int stackIn_7_0 = 0;
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
              if (param0 <= -115) {
                break L1;
              } else {
                var9 = (pj) null;
                this.a((byte) 38, (pj) null, 56, -20);
                break L1;
              }
            }
            L2: {
              var8_int = super.a((byte) -124, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L2;
              } else {
                if (this.field_H) {
                  stackIn_13_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            if (this.a((byte) 3, param5, param4, param6, param3)) {
              this.field_v = param2;
              if (1 != param2) {
                stackIn_11_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_C = -param3 + (-this.field_s + param5);
                this.field_F = -param6 + param4 - this.field_n;
                al.field_c = (dd) (this);
                return true;
              }
            } else {
              stackIn_7_0 = var8_int;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var8);

            stackIn_16_1 = new StringBuilder().append("dd.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    private dd(int param0, int param1, int param2, int param3, td param4, ag param5, pj param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_G = 2147483647;
        this.field_E = 2147483647;
        try {
            this.field_H = param8 ? true : false;
            this.field_I = param7 ? true : false;
            this.field_y = param6;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "dd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void b(byte param0) {
        super.b((byte) -116);
        this.field_y.a(0, 0, this.field_r, (byte) -90, this.field_m);
        this.field_E = this.field_s;
        this.field_G = this.field_n;
        int var2 = -53 % ((55 - param0) / 49);
    }

    final static int a(int param0, int param1, int param2) {
        int var3;
        var3 = param1 >>> -670469025;
        if (param0 != -1) {
          return -63;
        } else {
          return (param1 - -var3) / param2 + -var3;
        }
    }

    public static void c(byte param0) {
        field_D = null;
        field_B = null;
        if (param0 >= -102) {
            return;
        }
        field_A = null;
    }

    static {
    }
}
