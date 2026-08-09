/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bn extends ie {
    private boolean field_R;
    private boolean field_O;
    static tf[] field_P;
    static String field_L;
    private int field_T;
    private int field_N;
    static int field_Q;
    static eq field_S;
    private int field_M;
    static ak field_I;
    private int field_K;

    final boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_8_0 = 0;
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
              var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
              if (var8_int == 0) {
                break L1;
              } else {
                if (this.field_O) {
                  stackIn_12_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!this.a(param0 ^ -86, param5, param3, param6, param4)) {
              stackIn_10_0 = var8_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                if (1 == param2) {
                  this.field_N = param4 - this.field_z - param5;
                  this.field_K = -param3 + -this.field_p + param6;
                  qf.field_a = (bn) (this);
                  break L2;
                } else {
                  break L2;
                }
              }
              this.field_k = param2;
              stackIn_8_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("bn.N(").append(param0).append(',');

            if (param1 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final StringBuilder a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        Hashtable var6 = null;
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
              if (!this.a(-119, param2, param0, param3)) {
                break L1;
              } else {
                this.a(param2, (byte) -2, param3, param0);
                this.a(param3, (byte) -91, param0, param2);
                discarded$64 = param0.append(" revert=").append(this.field_R);
                if (this.field_T == 2147483647) {
                  break L1;
                } else {
                  if (2147483647 != this.field_M) {
                    discarded$65 = param0.append(" to ").append(this.field_T).append(',').append(this.field_M);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (!param1) {
                break L2;
              } else {
                var6 = (Hashtable) null;
                this.a((StringBuilder) null, false, 63, (Hashtable) null);
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

            stackIn_11_1 = new StringBuilder().append("bn.AA(");

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
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        return stackIn_8_0;
    }

    public static void m(int param0) {
        field_S = null;
        field_L = null;
        if (param0 >= -10) {
          bn.n(-45);
          field_I = null;
          field_P = null;
          return;
        } else {
          field_I = null;
          field_P = null;
          return;
        }
    }

    private bn(int param0, int param1, int param2, int param3, eb param4, fn param5, ng param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_T = 2147483647;
        this.field_M = 2147483647;
        try {
            this.field_R = param7 ? true : false;
            this.field_H = param6;
            this.field_O = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "bn.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void n(int param0) {
        if (param0 != 2147483647) {
            field_P = (tf[]) null;
            te.a(17, -2671);
            return;
        }
        te.a(17, -2671);
    }

    final void a(int param0, int param1, ng param2, int param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3 + param3, param4, param5);
            this.field_k = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "bn.EA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2, ng param3) {
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
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
                  if (!(this.field_H instanceof qm)) {
                    break L3;
                  } else {
                    if (!((qm) ((Object) this.field_H)).field_H) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (1 == this.field_k) {
                  L4: {
                    var5_int = -this.field_N + uf.field_d + -param2;
                    var6 = -param1 + -this.field_K + bg.field_k;
                    if (var5_int != this.field_z) {
                      break L4;
                    } else {
                      if (var6 == this.field_p) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_p = var6;
                  this.field_z = var5_int;
                  if (this.field_n instanceof eo) {
                    ((eo) ((Object) this.field_n)).a(param2, (bn) (this), param1, 31);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
              if (!this.field_R) {
                break L1;
              } else {
                L5: {
                  if (this.field_T != this.field_z) {
                    L6: {
                      var5_int = this.field_T + -this.field_z;
                      stackIn_10_0 = this;

                      stackIn_10_1 = this.field_z;

                      if ((Math.abs(var5_int) ^ -1) >= -3) {
                        stackIn_12_0 = this;

                        if (var5_int > 0) {
                          stackIn_13_0 = this;
                          stackIn_13_1 = stackIn_10_1;
                          stackIn_13_2 = 1;
                          break L6;
                        } else {
                          stackIn_13_0 = this;
                          stackIn_13_1 = stackIn_10_1;
                          stackIn_13_2 = -1;
                          break L6;
                        }
                      } else {
                        stackIn_13_0 = this;
                        stackIn_13_1 = stackIn_10_1;
                        stackIn_13_2 = var5_int >> -1387103807;
                        break L6;
                      }
                    }
                    ((bn) (this)).field_z = stackIn_13_1 + stackIn_13_2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (this.field_p != this.field_M) {
                  L7: {
                    var5_int = this.field_M + -this.field_p;
                    stackIn_20_0 = this;

                    stackIn_20_1 = this.field_p;

                    if (Math.abs(var5_int) > 2) {
                      stackIn_21_0 = this;
                      stackIn_21_1 = stackIn_20_1;
                      stackIn_21_2 = var5_int >> 2002693313;
                      break L7;
                    } else {
                      stackIn_19_0 = this;

                      if (-1 <= (var5_int ^ -1)) {
                        stackIn_21_0 = this;
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = -1;
                        break L7;
                      } else {
                        stackIn_21_0 = this;
                        stackIn_21_1 = stackIn_20_1;
                        stackIn_21_2 = 1;
                        break L7;
                      }
                    }
                  }
                  ((bn) (this)).field_p = stackIn_21_1 + stackIn_21_2;
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
            stackIn_32_0 = (RuntimeException) (var5);

            stackIn_32_1 = new StringBuilder().append("bn.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw aa.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
    }

    final void j(int param0) {
        super.j(0);
        this.field_H.a(this.field_E, (byte) 67, param0, 0, this.field_C);
        this.field_T = this.field_z;
        this.field_M = this.field_p;
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    static {
        field_L = "Green Grow The Rushes O";
    }
}
