/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jh extends ie {
    private int field_D;
    private int field_F;
    private boolean field_G;
    static df[] field_B;
    private int field_H;
    static String field_I;
    private int field_J;
    private boolean field_C;
    static String[] field_K;
    static String field_A;
    static an field_z;

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$26 = null;
        StringBuilder discarded$27 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == 0) {
                break L1;
              } else {
                this.field_C = true;
                break L1;
              }
            }
            L2: {
              if (!this.a(param0, param1, 115, param2)) {
                break L2;
              } else {
                this.a(param0, (byte) -128, param2, param1);
                this.a(param0, param2, param1, (byte) -43);
                discarded$26 = param2.append(" revert=").append(this.field_G);
                if (this.field_F == 2147483647) {
                  break L2;
                } else {
                  if (2147483647 == this.field_D) {
                    break L2;
                  } else {
                    discarded$27 = param2.append(" to ").append(this.field_F).append(',').append(this.field_D);
                    break L2;
                  }
                }
              }
            }
            stackOut_6_0 = (StringBuilder) (param2);
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("jh.S(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    final void a(pk param0, boolean param1, int param2, int param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_l = 0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "jh.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, pk param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!(this.field_y instanceof wp)) {
                    break L3;
                  } else {
                    if (!((wp) ((Object) this.field_y)).field_x) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (-2 != (this.field_l ^ -1)) {
                  break L2;
                } else {
                  L4: {
                    L5: {
                      var5_int = -param0 + -this.field_H + ko.field_p;
                      var6 = -param3 + -this.field_J + pi.field_e;
                      if (var5_int != this.field_r) {
                        break L5;
                      } else {
                        if (this.field_v != var6) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_r = var5_int;
                    this.field_v = var6;
                    if (!(this.field_o instanceof mt)) {
                      break L4;
                    } else {
                      ((mt) ((Object) this.field_o)).a((jh) (this), param0, -18285, param3);
                      break L4;
                    }
                  }
                  if (!Sumoblitz.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (!this.field_G) {
                break L1;
              } else {
                L6: {
                  if (this.field_F == this.field_r) {
                    break L6;
                  } else {
                    L7: {
                      var5_int = this.field_F - this.field_r;
                      stackOut_12_0 = this;
                      stackOut_12_1 = this.field_r;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      if (-3 <= (Math.abs(var5_int) ^ -1)) {
                        stackOut_14_0 = this;
                        stackOut_14_1 = stackIn_14_1;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (-1 <= (var5_int ^ -1)) {
                          stackOut_16_0 = this;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = -1;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          break L7;
                        } else {
                          stackOut_15_0 = this;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_17_2 = stackOut_15_2;
                          break L7;
                        }
                      } else {
                        stackOut_13_0 = this;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = var5_int >> 1333312865;
                        stackIn_17_0 = stackOut_13_0;
                        stackIn_17_1 = stackOut_13_1;
                        stackIn_17_2 = stackOut_13_2;
                        break L7;
                      }
                    }
                    ((jh) (this)).field_r = stackIn_17_1 + stackIn_17_2;
                    break L6;
                  }
                }
                if (this.field_D != this.field_v) {
                  L8: {
                    var5_int = -this.field_v + this.field_D;
                    stackOut_20_0 = this;
                    stackOut_20_1 = this.field_v;
                    stackIn_24_0 = stackOut_20_0;
                    stackIn_24_1 = stackOut_20_1;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    if (2 < Math.abs(var5_int)) {
                      stackOut_24_0 = this;
                      stackOut_24_1 = stackIn_24_1;
                      stackOut_24_2 = var5_int >> -342355135;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      stackIn_25_2 = stackOut_24_2;
                      break L8;
                    } else {
                      stackOut_21_0 = this;
                      stackOut_21_1 = stackIn_21_1;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      if (-1 <= (var5_int ^ -1)) {
                        stackOut_23_0 = this;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = -1;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_25_2 = stackOut_23_2;
                        break L8;
                      } else {
                        stackOut_22_0 = this;
                        stackOut_22_1 = stackIn_22_1;
                        stackOut_22_2 = 1;
                        stackIn_25_0 = stackOut_22_0;
                        stackIn_25_1 = stackOut_22_1;
                        stackIn_25_2 = stackOut_22_2;
                        break L8;
                      }
                    }
                  }
                  ((jh) (this)).field_v = stackIn_25_1 + stackIn_25_2;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var5_int = -5 % ((-25 - param1) / 45);
            super.a(param0, 89, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var5);
            stackOut_28_1 = new StringBuilder().append("jh.U(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ')');
        }
    }

    public static void g(int param0) {
        field_B = null;
        if (param0 != -1) {
          field_z = (an) null;
          field_z = null;
          field_I = null;
          field_K = null;
          field_A = null;
          return;
        } else {
          field_z = null;
          field_I = null;
          field_K = null;
          field_A = null;
          return;
        }
    }

    jh(int param0, int param1, int param2, int param3, mh param4, qm param5, pk param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_F = 2147483647;
        this.field_D = 2147483647;
        try {
            this.field_C = param8 ? true : false;
            this.field_G = param7 ? true : false;
            this.field_y = param6;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "jh.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var8_int = super.a(param0, -79, param2, param3, param4, param5, param6) ? 1 : 0;
              if (param1 < -42) {
                break L1;
              } else {
                this.field_H = 88;
                break L1;
              }
            }
            L2: {
              if (var8_int == 0) {
                break L2;
              } else {
                if (!this.field_C) {
                  break L2;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (this.b(param5, -1, param4, param2, param6)) {
              L3: {
                if (param3 != 1) {
                  break L3;
                } else {
                  gt.field_gb = (jh) (this);
                  this.field_H = -param4 + (-this.field_r + param5);
                  this.field_J = -param6 + (param2 + -this.field_v);
                  break L3;
                }
              }
              this.field_l = param3;
              stackOut_11_0 = 1;
              stackIn_12_0 = stackOut_11_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_7_0 = var8_int;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var8);
            stackOut_13_1 = new StringBuilder().append("jh.R(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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

    final void d(boolean param0) {
        boolean discarded$0 = false;
        super.d(param0);
        this.field_y.a(-111, 0, 0, this.field_p, this.field_q);
        this.field_F = this.field_r;
        this.field_D = this.field_v;
        if (param0) {
            pk var3 = (pk) null;
            discarded$0 = this.a((pk) null, 44, -30, 20, 44, -100, 90);
        }
    }

    static {
        int var0 = 0;
        field_B = new df[255];
        field_I = "Close";
        for (var0 = 0; field_B.length > var0; var0++) {
            field_B[var0] = new df();
        }
        field_A = "Back";
        field_K = new String[]{"Complete the final level with the highest level of speed", "Complete the final level with the highest level of traction", "Complete the final level with the highest level of bounce", "Complete the game without restarting a level", "Complete 10 levels without using any temporary powerups", "Complete 5 levels without using any speed powerups", "Complete 5 levels without using any traction powerups", "Complete 5 levels without using any bounce powerups", "Last 30 seconds without bumping into anything", "Destroy at least 10 enemies by using the Energy Blast to knock them into a hazard", "On a level where there are Zap Traps, defeat all enemies by pushing them into a wall", "On a level where there are Pinball Bouncers, bounce over 15 times in 5 seconds", "Get to the maximum multiplier 5 times during the course of a game", "Kill 5 different enemies in a row", "Earn 50,000 points during one level", "On level 8, burst big enemies before little enemies", "Complete the first 10 levels", "Complete the first 10 levels without dying", "Complete the full game", "Complete the full game without dying", "Complete Easy mode with 1,000,000 points", "Complete the full game on hard mode", "Last for 1 minute in Challenge Mode", "Last for 3 minutes in Challenge Mode", "Last for 5 minutes in Challenge Mode", "Last for 1 minute in Hard Challenge Mode", "Last for 3 minutes in Hard Challenge Mode", "Last for 5 minutes in Hard Challenge Mode"};
    }
}
