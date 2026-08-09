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
                discarded$64 = param2.append(" revert=").append(this.field_G);
                if (this.field_F == 2147483647) {
                  break L2;
                } else {
                  if (2147483647 == this.field_D) {
                    break L2;
                  } else {
                    discarded$65 = param2.append(" to ").append(this.field_F).append(',').append(this.field_D);
                    break L2;
                  }
                }
              }
            }
            stackIn_7_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("jh.S(").append(param0).append(',');

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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ')');
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
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
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
                    var5_int = -param0 + -this.field_H + ko.field_p;
                    var6 = -param3 + -this.field_J + pi.field_e;
                    if (var5_int != this.field_r) {
                      break L4;
                    } else {
                      if (this.field_v != var6) {
                        break L4;
                      } else {
                        var5_int = -5 % ((-25 - param1) / 45);
                        super.a(param0, 89, param2, param3);
                        return;
                      }
                    }
                  }
                  this.field_r = var5_int;
                  this.field_v = var6;
                  if (!(this.field_o instanceof mt)) {
                    break L1;
                  } else {
                    ((mt) ((Object) this.field_o)).a((jh) (this), param0, -18285, param3);
                    break L1;
                  }
                }
              }
              if (!this.field_G) {
                break L1;
              } else {
                L5: {
                  if (this.field_F == this.field_r) {
                    break L5;
                  } else {
                    L6: {
                      var5_int = this.field_F - this.field_r;
                      stackIn_13_0 = this;

                      stackIn_13_1 = this.field_r;

                      if (-3 <= (Math.abs(var5_int) ^ -1)) {
                        stackIn_15_0 = this;

                        if (-1 <= (var5_int ^ -1)) {
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
                        stackIn_16_2 = var5_int >> 1333312865;
                        break L6;
                      }
                    }
                    ((jh) (this)).field_r = stackIn_16_1 + stackIn_16_2;
                    break L5;
                  }
                }
                if (this.field_D != this.field_v) {
                  L7: {
                    var5_int = -this.field_v + this.field_D;
                    stackIn_23_0 = this;

                    stackIn_23_1 = this.field_v;

                    if (2 < Math.abs(var5_int)) {
                      stackIn_24_0 = this;
                      stackIn_24_1 = stackIn_23_1;
                      stackIn_24_2 = var5_int >> -342355135;
                      break L7;
                    } else {
                      stackIn_22_0 = this;

                      if (-1 <= (var5_int ^ -1)) {
                        stackIn_24_0 = this;
                        stackIn_24_1 = stackIn_23_1;
                        stackIn_24_2 = -1;
                        break L7;
                      } else {
                        stackIn_24_0 = this;
                        stackIn_24_1 = stackIn_23_1;
                        stackIn_24_2 = 1;
                        break L7;
                      }
                    }
                  }
                  ((jh) (this)).field_v = stackIn_24_1 + stackIn_24_2;
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
          L8: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("jh.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param3 + ')');
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
                  stackIn_5_0 = 1;
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
              stackIn_12_0 = 1;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_8_0 = var8_int;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8);

            stackIn_15_1 = new StringBuilder().append("jh.R(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
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
        super.d(param0);
        this.field_y.a(-111, 0, 0, this.field_p, this.field_q);
        this.field_F = this.field_r;
        this.field_D = this.field_v;
        if (param0) {
            pk var3 = (pk) null;
            this.a((pk) null, 44, -30, 20, 44, -100, 90);
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
