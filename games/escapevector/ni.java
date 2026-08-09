/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ni extends r {
    private int field_J;
    static hh field_M;
    private int field_L;
    static int[] field_D;
    static o field_N;
    private int field_I;
    private boolean field_P;
    static String field_K;
    static int field_O;
    private int field_H;
    static boolean field_F;
    static String field_G;
    private boolean field_E;

    final void a(int param0, int param1, int param2, int param3, hm param4, byte param5) {
        try {
            super.a(param0, param1, param2, param3, param4, (byte) -96);
            this.field_t = 0;
            int var7_int = 58 % ((-39 - param5) / 45);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ni.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void l(int param0) {
        if (param0 >= -90) {
          field_F = false;
          field_M = null;
          field_K = null;
          field_D = null;
          field_G = null;
          field_N = null;
          return;
        } else {
          field_M = null;
          field_K = null;
          field_D = null;
          field_G = null;
          field_N = null;
          return;
        }
    }

    private ni(int param0, int param1, int param2, int param3, db param4, wn param5, hm param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_H = 2147483647;
        this.field_I = 2147483647;
        try {
            this.field_P = param8 ? true : false;
            this.field_C = param6;
            this.field_E = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ni.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
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
              if (param0 == 0) {
                break L1;
              } else {
                field_O = 81;
                break L1;
              }
            }
            L2: {
              if (this.a(param3, param1, param2, false)) {
                this.a(param1, param2, param3, 1);
                this.a(param3, (byte) 95, param1, param2);
                discarded$62 = param2.append(" revert=").append(this.field_E);
                if (-2147483648 == (this.field_H ^ -1)) {
                  break L2;
                } else {
                  if (2147483647 != this.field_I) {
                    discarded$63 = param2.append(" to ").append(this.field_H).append(',').append(this.field_I);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            stackIn_9_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("ni.AA(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    final void k(int param0) {
        if (param0 != -6844) {
          return;
        } else {
          super.k(param0 + 0);
          this.field_C.a(this.field_g, 0, 0, true, this.field_x);
          this.field_I = this.field_j;
          this.field_H = this.field_k;
          return;
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
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
            if (this.a(param1, param3, param4, (byte) 97, param0)) {
              this.field_t = param6;
              if (param6 == 1) {
                this.field_J = -this.field_k + (param1 - param4);
                this.field_L = -this.field_j + (param3 + -param0);
                gf.field_b = (ni) (this);
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

            stackIn_13_1 = new StringBuilder().append("ni.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param6 + ')');
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

    final void a(int param0, int param1, int param2, hm param3) {
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
                  if (!(this.field_C instanceof hc)) {
                    break L3;
                  } else {
                    if (!((hc) ((Object) this.field_C)).field_y) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if ((this.field_t ^ -1) != -2) {
                  break L2;
                } else {
                  L4: {
                    var5_int = -this.field_J + dh.field_d - param2;
                    var6 = -param1 + -this.field_L + bj.field_y;
                    if (var5_int != this.field_k) {
                      break L4;
                    } else {
                      if (this.field_j != var6) {
                        break L4;
                      } else {
                        super.a(param0, param1, param2, param3);
                        return;
                      }
                    }
                  }
                  this.field_j = var6;
                  this.field_k = var5_int;
                  if (!(this.field_q instanceof nd)) {
                    break L1;
                  } else {
                    ((nd) ((Object) this.field_q)).a((ni) (this), param1, param2, 32468);
                    break L1;
                  }
                }
              }
              if (!this.field_E) {
                break L1;
              } else {
                L5: {
                  if (this.field_k == this.field_H) {
                    break L5;
                  } else {
                    L6: {
                      var5_int = -this.field_k + this.field_H;
                      stackIn_13_0 = this;

                      stackIn_13_1 = this.field_k;

                      if (Math.abs(var5_int) <= 2) {
                        stackIn_15_0 = this;

                        if (var5_int <= 0) {
                          stackIn_16_0 = this;
                          stackIn_16_1 = stackIn_13_1;
                          stackIn_16_2 = -1;
                          break L6;
                        } else {
                          stackIn_16_0 = this;
                          stackIn_16_1 = stackIn_13_1;
                          stackIn_16_2 = 1;
                          break L6;
                        }
                      } else {
                        stackIn_16_0 = this;
                        stackIn_16_1 = stackIn_13_1;
                        stackIn_16_2 = var5_int >> 1161508993;
                        break L6;
                      }
                    }
                    ((ni) (this)).field_k = stackIn_16_1 + stackIn_16_2;
                    break L5;
                  }
                }
                if (this.field_j != this.field_I) {
                  L7: {
                    var5_int = -this.field_j + this.field_I;
                    stackIn_21_0 = this;

                    stackIn_21_1 = this.field_j;

                    if ((Math.abs(var5_int) ^ -1) >= -3) {
                      stackIn_23_0 = this;

                      if (-1 <= (var5_int ^ -1)) {
                        stackIn_24_0 = this;
                        stackIn_24_1 = stackIn_21_1;
                        stackIn_24_2 = -1;
                        break L7;
                      } else {
                        stackIn_24_0 = this;
                        stackIn_24_1 = stackIn_21_1;
                        stackIn_24_2 = 1;
                        break L7;
                      }
                    } else {
                      stackIn_24_0 = this;
                      stackIn_24_1 = stackIn_21_1;
                      stackIn_24_2 = var5_int >> 799813793;
                      break L7;
                    }
                  }
                  ((ni) (this)).field_j = stackIn_24_1 + stackIn_24_2;
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
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("ni.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
    }

    final static int a(int param0, int param1, boolean param2, int[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
            if (0 > param1) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param2) {
                  break L1;
                } else {
                  field_O = 75;
                  break L1;
                }
              }
              if (param3.length <= param1) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4_int = param3[param1];
                stackIn_11_0 = ul.a(var4_int, param0, 112);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("ni.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    static {
        field_K = "Connection restored.";
        field_O = -1;
        field_D = new int[8192];
        field_G = "Account created successfully!";
    }
}
