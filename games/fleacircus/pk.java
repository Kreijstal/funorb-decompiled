/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pk extends dk {
    private boolean field_E;
    static int[] field_J;
    private int field_L;
    static String field_G;
    private int field_I;
    private int field_F;
    private int field_H;
    private boolean field_K;

    final StringBuilder a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        qa var6 = null;
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
              if (param3 < -47) {
                break L1;
              } else {
                var6 = (qa) null;
                this.a((byte) 36, (qa) null, 37, -90, -110, -10);
                break L1;
              }
            }
            L2: {
              if (this.a(param1, -103, param0, param2)) {
                this.a(param2, -70, param0, param1);
                this.a(param0, param1, (byte) 103, param2);
                discarded$62 = param0.append(" revert=").append(this.field_K);
                if (this.field_I == 2147483647) {
                  break L2;
                } else {
                  if (-2147483648 == (this.field_H ^ -1)) {
                    break L2;
                  } else {
                    discarded$63 = param0.append(" to ").append(this.field_I).append(',').append(this.field_H);
                    break L2;
                  }
                }
              } else {
                break L2;
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

            stackIn_11_1 = new StringBuilder().append("pk.S(");

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


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    final void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_v = 0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "pk.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private pk(int param0, int param1, int param2, int param3, ch param4, kd param5, qa param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_I = 2147483647;
        this.field_H = 2147483647;
        try {
            this.field_E = param8 ? true : false;
            this.field_K = param7 ? true : false;
            this.field_A = param6;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "pk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void c(boolean param0) {
        super.c(param0);
        this.field_A.a(0, this.field_u, 0, this.field_j, 80);
        this.field_H = this.field_z;
        this.field_I = this.field_y;
    }

    final void a(int param0, int param1, qa param2, byte param3) {
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        qa var7 = null;
        try {
          L0: {
            L1: {
              if (param3 < -85) {
                break L1;
              } else {
                var7 = (qa) null;
                this.a((byte) -72, (qa) null, 106, 108, -8, 125);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  L5: {
                    if (!(this.field_A instanceof bb)) {
                      break L5;
                    } else {
                      if (!((bb) ((Object) this.field_A)).field_D) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (-2 == (this.field_v ^ -1)) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                if (this.field_K) {
                  L6: {
                    if (this.field_y != this.field_I) {
                      L7: {
                        var5_int = -this.field_y + this.field_I;
                        stackIn_13_0 = this;

                        stackIn_13_1 = this.field_y;

                        if (-3 <= (Math.abs(var5_int) ^ -1)) {
                          stackIn_15_0 = this;

                          if ((var5_int ^ -1) < -1) {
                            stackIn_16_0 = this;
                            stackIn_16_1 = stackIn_13_1;
                            stackIn_16_2 = 1;
                            break L7;
                          } else {
                            stackIn_16_0 = this;
                            stackIn_16_1 = stackIn_13_1;
                            stackIn_16_2 = -1;
                            break L7;
                          }
                        } else {
                          stackIn_16_0 = this;
                          stackIn_16_1 = stackIn_13_1;
                          stackIn_16_2 = var5_int >> -1246868255;
                          break L7;
                        }
                      }
                      ((pk) (this)).field_y = stackIn_16_1 + stackIn_16_2;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (this.field_H != this.field_z) {
                    L8: {
                      var5_int = this.field_H - this.field_z;
                      stackIn_21_0 = this;

                      stackIn_21_1 = this.field_z;

                      if (-3 <= (Math.abs(var5_int) ^ -1)) {
                        stackIn_23_0 = this;

                        if (0 >= var5_int) {
                          stackIn_24_0 = this;
                          stackIn_24_1 = stackIn_21_1;
                          stackIn_24_2 = -1;
                          break L8;
                        } else {
                          stackIn_24_0 = this;
                          stackIn_24_1 = stackIn_21_1;
                          stackIn_24_2 = 1;
                          break L8;
                        }
                      } else {
                        stackIn_24_0 = this;
                        stackIn_24_1 = stackIn_21_1;
                        stackIn_24_2 = var5_int >> 231527361;
                        break L8;
                      }
                    }
                    ((pk) (this)).field_z = stackIn_24_1 + stackIn_24_2;
                    if (!fleas.field_A) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    super.a(param0, param1, param2, (byte) -91);
                    return;
                  }
                } else {
                  break L2;
                }
              }
              L9: {
                var5_int = -param1 + (ag.field_f - this.field_F);
                var6 = -param0 + -this.field_L + kc.field_b;
                if (this.field_y != var5_int) {
                  break L9;
                } else {
                  if (this.field_z == var6) {
                    break L2;
                  } else {
                    break L9;
                  }
                }
              }
              this.field_z = var6;
              this.field_y = var5_int;
              if (!(this.field_s instanceof qd)) {
                break L2;
              } else {
                ((qd) ((Object) this.field_s)).a(-30781, param1, (pk) (this), param0);
                break L2;
              }
            }
            super.a(param0, param1, param2, (byte) -91);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var5);

            stackIn_34_1 = new StringBuilder().append("pk.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L10;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L10;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param3 + ')');
        }
    }

    final static ve a(byte param0, String param1) {
        RuntimeException var2 = null;
        ve stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 68) {
                break L1;
              } else {
                field_G = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = new ve(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("pk.FA(").append(param0).append(',');

            if (param1 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void d(byte param0) {
        field_G = null;
        if (param0 < 50) {
            pk.d((byte) 21);
            field_J = null;
            return;
        }
        field_J = null;
    }

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
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
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (this.field_E) {
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!this.b(param0, param6, 0, param4, param2)) {
              stackIn_9_0 = var8_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_v = param5;
              if (1 != param5) {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                this.field_F = -param6 + -this.field_y + param4;
                this.field_L = -param0 + (-this.field_z + param2);
                wi.field_e = (pk) (this);
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("pk.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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

    static {
        field_J = new int[16384];
        field_G = "Level: <%0>";
    }
}
