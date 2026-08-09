/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bc extends si {
    private boolean field_O;
    private int field_L;
    private int field_N;
    private boolean field_I;
    static nc field_J;
    private int field_M;
    private int field_H;
    static sf field_K;

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
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
                if (!this.field_O) {
                  break L1;
                } else {
                  stackIn_3_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (!this.a(param4, param3, param1, param5, -118)) {
              stackIn_11_0 = var8_int;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L2: {
                if (1 == param0) {
                  jf.field_a = (bc) (this);
                  this.field_N = param3 - this.field_m - param1;
                  this.field_L = param4 + (-this.field_j - param5);
                  break L2;
                } else {
                  break L2;
                }
              }
              this.field_u = param0;
              stackIn_9_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("bc.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final void a(int param0, int param1, rc param2, int param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_u = 0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "bc.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private bc(int param0, int param1, int param2, int param3, j param4, dg param5, rc param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_M = 2147483647;
        this.field_H = 2147483647;
        try {
            this.field_I = param7 ? true : false;
            this.field_O = param8 ? true : false;
            this.field_G = param6;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "bc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(int param0, int param1, int param2, rc param3) {
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
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
                  L4: {
                    if (!(this.field_G instanceof pj)) {
                      break L4;
                    } else {
                      if (!((pj) ((Object) this.field_G)).field_B) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (-2 == (this.field_u ^ -1)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                if (!this.field_I) {
                  break L1;
                } else {
                  L5: {
                    if (this.field_H == this.field_m) {
                      break L5;
                    } else {
                      L6: {
                        var5_int = -this.field_m + this.field_H;
                        stackIn_11_0 = this;

                        stackIn_11_1 = this.field_m;

                        if (-3 > (Math.abs(var5_int) ^ -1)) {
                          stackIn_12_0 = this;
                          stackIn_12_1 = stackIn_11_1;
                          stackIn_12_2 = var5_int >> -358334527;
                          break L6;
                        } else {
                          stackIn_10_0 = this;

                          if (-1 > (var5_int ^ -1)) {
                            stackIn_12_0 = this;
                            stackIn_12_1 = stackIn_11_1;
                            stackIn_12_2 = 1;
                            break L6;
                          } else {
                            stackIn_12_0 = this;
                            stackIn_12_1 = stackIn_11_1;
                            stackIn_12_2 = -1;
                            break L6;
                          }
                        }
                      }
                      ((bc) (this)).field_m = stackIn_12_1 + stackIn_12_2;
                      break L5;
                    }
                  }
                  if (this.field_M != this.field_j) {
                    L7: {
                      var5_int = -this.field_j + this.field_M;
                      stackIn_19_0 = this;

                      stackIn_19_1 = this.field_j;

                      if ((Math.abs(var5_int) ^ -1) < -3) {
                        stackIn_20_0 = this;
                        stackIn_20_1 = stackIn_19_1;
                        stackIn_20_2 = var5_int >> 944363521;
                        break L7;
                      } else {
                        stackIn_18_0 = this;

                        if (var5_int > 0) {
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
                    ((bc) (this)).field_j = stackIn_20_1 + stackIn_20_2;
                    if (!SolKnight.field_L) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    super.a(param0, param1, param2, param3);
                    return;
                  }
                }
              }
              L8: {
                var5_int = -this.field_N + (gb.field_j - param0);
                var6 = -this.field_L + (ad.field_m - param2);
                if (var5_int != this.field_m) {
                  break L8;
                } else {
                  if (var6 == this.field_j) {
                    break L1;
                  } else {
                    break L8;
                  }
                }
              }
              this.field_m = var5_int;
              this.field_j = var6;
              if (!(this.field_n instanceof t)) {
                break L1;
              } else {
                ((t) ((Object) this.field_n)).a(param0, (byte) 40, param2, (bc) (this));
                break L1;
              }
            }
            super.a(param0, param1, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("bc.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
    }

    public static void c(boolean param0) {
        if (param0) {
            return;
        }
        field_K = null;
        field_J = null;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
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
            if (param0 < -41) {
              L1: {
                if (this.a(param2, -1, param1, param3)) {
                  this.b(param2, -119, param1, param3);
                  this.a(param1, param2, param3, -19156);
                  discarded$62 = param2.append(" revert=").append(this.field_I);
                  if (2147483647 == this.field_H) {
                    break L1;
                  } else {
                    if ((this.field_M ^ -1) != -2147483648) {
                      discarded$63 = param2.append(" to ").append(this.field_H).append(',').append(this.field_M);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              stackIn_10_0 = (StringBuilder) (param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("bc.GA(").append(param0).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_10_0;
        }
    }

    final void a(int param0) {
        super.a(-123);
        this.field_G.b(this.field_x, this.field_t, 0, 0, 0);
        this.field_H = this.field_m;
        if (param0 >= -102) {
          return;
        } else {
          this.field_M = this.field_j;
          return;
        }
    }

    static {
        field_J = new nc();
        field_K = new sf(1);
    }
}
