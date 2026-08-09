/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rj extends fc {
    private int field_D;
    static bd field_N;
    static int[] field_M;
    private int field_I;
    static vl field_G;
    static ln[] field_J;
    private int field_L;
    private boolean field_B;
    private boolean field_E;
    static boolean field_K;
    private int field_F;
    static int field_H;

    final static void a(p param0, int param1) {
        if (param1 != -2312) {
            return;
        }
        try {
            param0.field_e = param0.field_e + 1;
            if (param0.field_e >= 8) {
                param0.field_i = -1;
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "rj.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
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
                if (this.field_B) {
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!this.b(param3, param0, param4 ^ 145, param2, param1)) {
              stackIn_9_0 = var8_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                if (param6 != 1) {
                  break L2;
                } else {
                  this.field_L = -this.field_v + param0 - param1;
                  rh.field_D = (rj) (this);
                  this.field_I = -param2 + (param3 + -this.field_m);
                  break L2;
                }
              }
              this.field_r = param6;
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("rj.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param6 + ')');
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

    private rj(int param0, int param1, int param2, int param3, nn param4, mh param5, ag param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_D = 2147483647;
        this.field_F = 2147483647;
        try {
            this.field_E = param7 ? true : false;
            this.field_B = param8 ? true : false;
            this.field_A = param6;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "rj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(ag param0, int param1, int param2, int param3) {
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(this.field_A instanceof ph)) {
                    break L3;
                  } else {
                    if (!((ph) ((Object) this.field_A)).field_D) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.field_r == 1) {
                  L4: {
                    var5_int = -param3 + (-this.field_L + j.field_c);
                    var6 = -this.field_I + (rb.field_m - param1);
                    if (var5_int != this.field_v) {
                      break L4;
                    } else {
                      if (this.field_m != var6) {
                        break L4;
                      } else {
                        super.a(param0, param1, param2, param3);
                        return;
                      }
                    }
                  }
                  this.field_m = var6;
                  this.field_v = var5_int;
                  if (!(this.field_p instanceof jl)) {
                    break L1;
                  } else {
                    ((jl) ((Object) this.field_p)).a((rj) (this), param1, param3, (byte) 98);
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
              if (!this.field_E) {
                break L1;
              } else {
                L5: {
                  if (this.field_v == this.field_D) {
                    break L5;
                  } else {
                    L6: {
                      var5_int = -this.field_v + this.field_D;
                      stackIn_11_0 = this;

                      stackIn_11_1 = this.field_v;

                      if ((Math.abs(var5_int) ^ -1) < -3) {
                        stackIn_12_0 = this;
                        stackIn_12_1 = stackIn_11_1;
                        stackIn_12_2 = var5_int >> 1581977089;
                        break L6;
                      } else {
                        stackIn_10_0 = this;

                        if ((var5_int ^ -1) >= -1) {
                          stackIn_12_0 = this;
                          stackIn_12_1 = stackIn_11_1;
                          stackIn_12_2 = -1;
                          break L6;
                        } else {
                          stackIn_12_0 = this;
                          stackIn_12_1 = stackIn_11_1;
                          stackIn_12_2 = 1;
                          break L6;
                        }
                      }
                    }
                    ((rj) (this)).field_v = stackIn_12_1 + stackIn_12_2;
                    break L5;
                  }
                }
                if (this.field_F == this.field_m) {
                  break L1;
                } else {
                  L7: {
                    var5_int = -this.field_m + this.field_F;
                    stackIn_16_0 = this;

                    stackIn_16_1 = this.field_m;

                    if ((Math.abs(var5_int) ^ -1) >= -3) {
                      stackIn_18_0 = this;

                      if (-1 > (var5_int ^ -1)) {
                        stackIn_19_0 = this;
                        stackIn_19_1 = stackIn_16_1;
                        stackIn_19_2 = 1;
                        break L7;
                      } else {
                        stackIn_19_0 = this;
                        stackIn_19_1 = stackIn_16_1;
                        stackIn_19_2 = -1;
                        break L7;
                      }
                    } else {
                      stackIn_19_0 = this;
                      stackIn_19_1 = stackIn_16_1;
                      stackIn_19_2 = var5_int >> 878198145;
                      break L7;
                    }
                  }
                  ((rj) (this)).field_m = stackIn_19_1 + stackIn_19_2;
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
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("rj.W(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
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
              if (param0 >= 73) {
                break L1;
              } else {
                this.field_L = 46;
                break L1;
              }
            }
            L2: {
              if (!this.a(param3, param2, false, param1)) {
                break L2;
              } else {
                this.a(param2, param1, param3, 76);
                this.a(-85, param2, param1, param3);
                discarded$64 = param3.append(" revert=").append(this.field_E);
                if ((this.field_D ^ -1) == -2147483648) {
                  break L2;
                } else {
                  if (-2147483648 == (this.field_F ^ -1)) {
                    break L2;
                  } else {
                    discarded$65 = param3.append(" to ").append(this.field_D).append(',').append(this.field_F);
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

            stackIn_10_1 = new StringBuilder().append("rj.IA(").append(param0).append(',');

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
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    public static void e(byte param0) {
        if (param0 > -96) {
          field_J = (ln[]) null;
          field_N = null;
          field_G = null;
          field_M = null;
          field_J = null;
          return;
        } else {
          field_N = null;
          field_G = null;
          field_M = null;
          field_J = null;
          return;
        }
    }

    final void j(int param0) {
        super.j(param0);
        this.field_A.a(this.field_s, 0, 0, 0, this.field_x);
        this.field_D = this.field_v;
        this.field_F = this.field_m;
    }

    final void a(int param0, int param1, int param2, int param3, ag param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, 0);
            this.field_r = param5;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "rj.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    static {
        field_M = new int[4];
        field_G = new vl();
    }
}
