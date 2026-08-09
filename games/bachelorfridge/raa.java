/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class raa extends hfa {
    static int field_F;
    private int field_C;
    static lda field_I;
    private int field_D;
    private boolean field_G;
    static int field_J;
    private int field_L;
    private boolean field_H;
    private int field_K;

    private raa(int param0, int param1, int param2, int param3, qda param4, pl param5, wj param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_D = 2147483647;
        this.field_K = 2147483647;
        try {
            this.field_H = param7 ? true : false;
            this.field_A = param6;
            this.field_G = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "raa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
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
            if (param1 == -7375) {
              L1: {
                var8_int = super.b(param0, param1 ^ 0, param2, param3, param4, param5, param6) ? 1 : 0;
                if (var8_int == 0) {
                  break L1;
                } else {
                  if (!this.field_G) {
                    break L1;
                  } else {
                    stackIn_6_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              if (!this.a(param6, param0, 0, param2, param4)) {
                stackIn_14_0 = var8_int;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                L2: {
                  if (-2 == (param3 ^ -1)) {
                    this.field_L = -param4 + (-this.field_v + param6);
                    cea.field_b = (raa) (this);
                    this.field_C = param0 + -this.field_s + -param2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_u = param3;
                stackIn_12_0 = 1;
                decompiledRegionSelector0 = 2;
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
            stackIn_17_0 = (RuntimeException) (var8);

            stackIn_17_1 = new StringBuilder().append("raa.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              return stackIn_14_0 != 0;
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2, wj param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_u = 0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "raa.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void e(byte param0) {
        int var1;
        if (param0 == 31) {
          var1 = qaa.field_e[rba.field_b];
          if (var1 == -1) {
            jga.field_v = jm.field_k[0] + "... " + id.field_g;
            cr.field_a = f.b((byte) 73);
            return;
          } else {
            jga.field_v = jm.field_k[var1] + "...";
            cr.field_a = f.b((byte) 73);
            return;
          }
        } else {
          raa.e((byte) 61);
          var1 = qaa.field_e[rba.field_b];
          if (var1 == -1) {
            jga.field_v = jm.field_k[0] + "... " + id.field_g;
            cr.field_a = f.b((byte) 73);
            return;
          } else {
            jga.field_v = jm.field_k[var1] + "...";
            cr.field_a = f.b((byte) 73);
            return;
          }
        }
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 >= 20) {
              L1: {
                if (!this.a(param0, param1, param3, (byte) 98)) {
                  break L1;
                } else {
                  this.a(9, param0, param3, param1);
                  this.b(param1, param0, param3, 121);
                  discarded$64 = param3.append(" revert=").append(this.field_H);
                  if (-2147483648 == (this.field_K ^ -1)) {
                    break L1;
                  } else {
                    if (2147483647 == this.field_D) {
                      break L1;
                    } else {
                      discarded$65 = param3.append(" to ").append(this.field_K).append(',').append(this.field_D);
                      break L1;
                    }
                  }
                }
              }
              stackIn_8_0 = (StringBuilder) (param3);
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
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("raa.V(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_8_0;
        }
    }

    final void a(int param0) {
        super.a(param0 ^ 0);
        this.field_A.a(0, this.field_q, (byte) 59, this.field_p, 0);
        this.field_D = this.field_v;
        this.field_K = this.field_s;
        if (param0 != -81) {
            this.field_D = 118;
        }
    }

    final void a(int param0, int param1, wj param2, int param3) {
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
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(this.field_A instanceof hf)) {
                    break L3;
                  } else {
                    if (!((hf) ((Object) this.field_A)).field_z) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if ((this.field_u ^ -1) != -2) {
                  break L2;
                } else {
                  L4: {
                    var5_int = mk.field_p - (this.field_C - -param0);
                    var6 = -param1 + (gd.field_m - this.field_L);
                    if (var5_int != this.field_s) {
                      break L4;
                    } else {
                      if (this.field_v == var6) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_v = var6;
                  this.field_s = var5_int;
                  if (!(this.field_k instanceof tm)) {
                    break L1;
                  } else {
                    ((tm) ((Object) this.field_k)).a(param1, (byte) 118, param0, (raa) (this));
                    break L1;
                  }
                }
              }
              if (this.field_H) {
                L5: {
                  if (this.field_K == this.field_s) {
                    break L5;
                  } else {
                    L6: {
                      var5_int = this.field_K + -this.field_s;
                      stackIn_17_0 = this;

                      stackIn_17_1 = this.field_s;

                      if (-3 > (Math.abs(var5_int) ^ -1)) {
                        stackIn_18_0 = this;
                        stackIn_18_1 = stackIn_17_1;
                        stackIn_18_2 = var5_int >> -1200834879;
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
                    ((raa) (this)).field_s = stackIn_18_1 + stackIn_18_2;
                    break L5;
                  }
                }
                if (this.field_D != this.field_v) {
                  L7: {
                    var5_int = -this.field_v + this.field_D;
                    stackIn_23_0 = this;

                    stackIn_23_1 = this.field_v;

                    if (Math.abs(var5_int) <= 2) {
                      stackIn_25_0 = this;

                      if ((var5_int ^ -1) >= -1) {
                        stackIn_26_0 = this;
                        stackIn_26_1 = stackIn_23_1;
                        stackIn_26_2 = -1;
                        break L7;
                      } else {
                        stackIn_26_0 = this;
                        stackIn_26_1 = stackIn_23_1;
                        stackIn_26_2 = 1;
                        break L7;
                      }
                    } else {
                      stackIn_26_0 = this;
                      stackIn_26_1 = stackIn_23_1;
                      stackIn_26_2 = var5_int >> 1759968737;
                      break L7;
                    }
                  }
                  ((raa) (this)).field_v = stackIn_26_1 + stackIn_26_2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param3 == 20) {
              super.a(param0, param1, param2, param3 + 0);
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
            stackIn_33_0 = (RuntimeException) (var5);

            stackIn_33_1 = new StringBuilder().append("raa.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void h(int param0) {
        if (param0 != 2) {
            return;
        }
        field_I = null;
    }

    static {
    }
}
