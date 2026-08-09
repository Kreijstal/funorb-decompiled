/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qe extends am {
    private boolean field_L;
    private boolean field_P;
    private int field_K;
    static nf[] field_O;
    private int field_R;
    private int field_M;
    static nf field_J;
    static int field_Q;
    private int field_N;

    final void a(int param0, int param1, int param2, fj param3, int param4, int param5) {
        try {
            if (param0 > -18) {
                field_O = (nf[]) null;
            }
            super.a(-26, param1, param2, param3, param4, param5);
            this.field_o = 0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "qe.K(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, boolean param3) {
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
              if (!param3) {
                break L1;
              } else {
                this.field_K = 39;
                break L1;
              }
            }
            L2: {
              if (this.a((byte) -13, param1, param2, param0)) {
                this.a(param0, param2, (byte) -63, param1);
                this.a(param2, 3803, param0, param1);
                discarded$62 = param0.append(" revert=").append(this.field_L);
                if (this.field_M == 2147483647) {
                  break L2;
                } else {
                  if (-2147483648 != (this.field_K ^ -1)) {
                    discarded$63 = param0.append(" to ").append(this.field_M).append(',').append(this.field_K);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            stackIn_9_0 = (StringBuilder) (param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("qe.O(");

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
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    final boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
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
            if (this.a(param1, (byte) 125, param0, param5, param3)) {
              this.field_o = param6;
              if ((param6 ^ -1) == -2) {
                this.field_N = param1 + -this.field_q + -param0;
                this.field_R = -param3 + (-this.field_m + param5);
                rk.field_k = (qe) (this);
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

            stackIn_13_1 = new StringBuilder().append("qe.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param5 + ',' + param6 + ')');
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

    public static void h(int param0) {
        if (param0 != 44) {
            return;
        }
        field_J = null;
        field_O = null;
    }

    private qe(int param0, int param1, int param2, int param3, fe param4, uk param5, fj param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_M = 2147483647;
        this.field_K = 2147483647;
        try {
            this.field_H = param6;
            this.field_P = param8 ? true : false;
            this.field_L = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "qe.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(fj param0, int param1, int param2, int param3) {
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
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
                  if (!(this.field_H instanceof rg)) {
                    break L3;
                  } else {
                    if (!((rg) ((Object) this.field_H)).field_L) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (1 == this.field_o) {
                  L4: {
                    var5_int = ld.field_l + (-this.field_N + -param2);
                    var6 = -param3 + -this.field_R + jh.field_R;
                    if (this.field_q != var5_int) {
                      break L4;
                    } else {
                      if (var6 == this.field_m) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_q = var5_int;
                  this.field_m = var6;
                  if (this.field_t instanceof wk) {
                    ((wk) ((Object) this.field_t)).a((qe) (this), param3, -5428, param2);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
              if (this.field_L) {
                L5: {
                  if (this.field_M == this.field_q) {
                    break L5;
                  } else {
                    L6: {
                      var5_int = -this.field_q + this.field_M;
                      stackIn_12_0 = this;

                      stackIn_12_1 = this.field_q;

                      if (2 < Math.abs(var5_int)) {
                        stackIn_13_0 = this;
                        stackIn_13_1 = stackIn_12_1;
                        stackIn_13_2 = var5_int >> -98282719;
                        break L6;
                      } else {
                        stackIn_11_0 = this;

                        if (-1 <= (var5_int ^ -1)) {
                          stackIn_13_0 = this;
                          stackIn_13_1 = stackIn_12_1;
                          stackIn_13_2 = -1;
                          break L6;
                        } else {
                          stackIn_13_0 = this;
                          stackIn_13_1 = stackIn_12_1;
                          stackIn_13_2 = 1;
                          break L6;
                        }
                      }
                    }
                    ((qe) (this)).field_q = stackIn_13_1 + stackIn_13_2;
                    break L5;
                  }
                }
                if (this.field_K == this.field_m) {
                  break L1;
                } else {
                  L7: {
                    var5_int = -this.field_m + this.field_K;
                    stackIn_17_0 = this;

                    stackIn_17_1 = this.field_m;

                    if ((Math.abs(var5_int) ^ -1) >= -3) {
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
                      stackIn_20_2 = var5_int >> -1516882879;
                      break L7;
                    }
                  }
                  ((qe) (this)).field_m = stackIn_20_1 + stackIn_20_2;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            super.a(param0, param1 + 0, param2, param3);
            if (param1 == 11579568) {
              break L0;
            } else {
              field_J = (nf) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var5);

            stackIn_32_1 = new StringBuilder().append("qe.V(");

            if (param0 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void f(int param0) {
        Hashtable var3;
        super.f(-79);
        this.field_H.a(-110, this.field_F, 0, this.field_z, 0);
        if (param0 >= -49) {
          var3 = (Hashtable) null;
          this.a((StringBuilder) null, 56, (Hashtable) null, true);
          this.field_M = this.field_q;
          this.field_K = this.field_m;
          return;
        } else {
          this.field_M = this.field_q;
          this.field_K = this.field_m;
          return;
        }
    }

    final static boolean a(byte param0, kg param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = param1.c(param0 + 105);
            if (param0 == -73) {
              L1: {
                if ((var2_int ^ -1) == -2) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              }
              var3 = stackIn_6_0;
              stackIn_7_0 = var3;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("qe.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    static {
    }
}
