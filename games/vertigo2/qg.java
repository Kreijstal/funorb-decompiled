/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qg extends oh {
    private boolean field_M;
    private boolean field_N;
    private int field_H;
    private int field_J;
    static int field_I;
    private int field_K;
    static int field_G;
    private int field_L;

    final void a(byte param0) {
        super.a((byte) 119);
        this.field_C.a(false, 0, 0, this.field_s, this.field_n);
        if (param0 <= 93) {
          return;
        } else {
          this.field_K = this.field_t;
          this.field_L = this.field_o;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        pf.a((byte) -88, on.field_b[param2][param3], param1);
        if (param0 != 1) {
            qg.a(105, 55, -99, true, (String) null, 34L);
        }
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
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
              var8_int = super.a(param0, param1, param2, param3, param4, (byte) -120, param6) ? 1 : 0;
              if (param5 <= -107) {
                break L1;
              } else {
                this.field_H = -3;
                break L1;
              }
            }
            L2: {
              if (var8_int == 0) {
                break L2;
              } else {
                if (!this.field_M) {
                  break L2;
                } else {
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (this.a(0, param2, param1, param0, param6)) {
              this.field_A = param4;
              if ((param4 ^ -1) != -2) {
                stackIn_12_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                um.field_E = (qg) (this);
                this.field_J = -param2 + -this.field_t + param6;
                this.field_H = -param1 + (param0 - this.field_o);
                return true;
              }
            } else {
              stackIn_8_0 = var8_int;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("qg.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
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
              if (!this.a(param3, -1, param1, param0)) {
                break L1;
              } else {
                this.a(param0, param3, true, param1);
                this.a(1000, param0, param1, param3);
                discarded$64 = param3.append(" revert=").append(this.field_N);
                if (-2147483648 == (this.field_L ^ -1)) {
                  break L1;
                } else {
                  if ((this.field_K ^ -1) != -2147483648) {
                    discarded$65 = param3.append(" to ").append(this.field_L).append(',').append(this.field_K);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param2 == -79) {
                break L2;
              } else {
                this.field_J = -46;
                break L2;
              }
            }
            stackIn_8_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("qg.FA(");

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


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        return stackIn_8_0;
    }

    final void a(byte param0, int param1, int param2, iq param3) {
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          L0: {
            if (param0 > 6) {
              L1: {
                L2: {
                  L3: {
                    if (!(this.field_C instanceof d)) {
                      break L3;
                    } else {
                      if (!((d) ((Object) this.field_C)).field_F) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (-2 == (this.field_A ^ -1)) {
                    L4: {
                      var5_int = -this.field_H + (ed.field_n + -param1);
                      var6 = -this.field_J + (gb.field_d - param2);
                      if (var5_int != this.field_o) {
                        break L4;
                      } else {
                        if (var6 == this.field_t) {
                          break L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_o = var5_int;
                    this.field_t = var6;
                    if (!(this.field_v instanceof ai)) {
                      break L1;
                    } else {
                      ((ai) ((Object) this.field_v)).a(-17589, param1, (qg) (this), param2);
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
                if (this.field_N) {
                  L5: {
                    if (this.field_L == this.field_o) {
                      break L5;
                    } else {
                      L6: {
                        var5_int = this.field_L + -this.field_o;
                        stackIn_12_0 = this;

                        stackIn_12_1 = this.field_o;

                        if (-3 <= (Math.abs(var5_int) ^ -1)) {
                          stackIn_14_0 = this;

                          if (0 >= var5_int) {
                            stackIn_15_0 = this;
                            stackIn_15_1 = stackIn_12_1;
                            stackIn_15_2 = -1;
                            break L6;
                          } else {
                            stackIn_15_0 = this;
                            stackIn_15_1 = stackIn_12_1;
                            stackIn_15_2 = 1;
                            break L6;
                          }
                        } else {
                          stackIn_15_0 = this;
                          stackIn_15_1 = stackIn_12_1;
                          stackIn_15_2 = var5_int >> 1924953025;
                          break L6;
                        }
                      }
                      ((qg) (this)).field_o = stackIn_15_1 + stackIn_15_2;
                      break L5;
                    }
                  }
                  if (this.field_t == this.field_K) {
                    break L1;
                  } else {
                    L7: {
                      var5_int = -this.field_t + this.field_K;
                      stackIn_19_0 = this;

                      stackIn_19_1 = this.field_t;

                      if ((Math.abs(var5_int) ^ -1) >= -3) {
                        stackIn_21_0 = this;

                        if (-1 > (var5_int ^ -1)) {
                          stackIn_22_0 = this;
                          stackIn_22_1 = stackIn_19_1;
                          stackIn_22_2 = 1;
                          break L7;
                        } else {
                          stackIn_22_0 = this;
                          stackIn_22_1 = stackIn_19_1;
                          stackIn_22_2 = -1;
                          break L7;
                        }
                      } else {
                        stackIn_22_0 = this;
                        stackIn_22_1 = stackIn_19_1;
                        stackIn_22_2 = var5_int >> -33855231;
                        break L7;
                      }
                    }
                    ((qg) (this)).field_t = stackIn_22_1 + stackIn_22_2;
                    break L1;
                  }
                } else {
                  super.a((byte) 64, param1, param2, param3);
                  return;
                }
              }
              super.a((byte) 64, param1, param2, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var5);

            stackIn_32_1 = new StringBuilder().append("qg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw wn.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(iq param0, byte param1, int param2, int param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_A = 0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "qg.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static long b(boolean param0) {
        if (param0) {
            return 5L;
        }
        return gk.a(57) - gn.field_b;
    }

    final static void a(int param0, int param1, int param2, boolean param3, String param4, long param5) {
        int var7_int = 0;
        try {
            uh.field_Wb.j(param0, 127);
            uh.field_Wb.field_u = uh.field_Wb.field_u + 1;
            var7_int = uh.field_Wb.field_u;
            if (param2 != 0) {
                qg.a(-61, -1, -60, -41);
            }
            uh.field_Wb.a((byte) -119, param5);
            uh.field_Wb.a((byte) 0, param4);
            uh.field_Wb.f(param1, -75);
            uh.field_Wb.f(param3 ? 1 : 0, 112);
            uh.field_Wb.b((byte) -125, uh.field_Wb.field_u + -var7_int);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "qg.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    private qg(int param0, int param1, int param2, int param3, ur param4, uf param5, iq param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_K = 2147483647;
        this.field_L = 2147483647;
        try {
            this.field_N = param7 ? true : false;
            this.field_C = param6;
            this.field_M = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "qg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
    }
}
