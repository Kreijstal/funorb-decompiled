/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ji {
    static int field_a;
    private int[] field_d;
    static String field_b;
    private double[] field_e;
    private double[] field_g;
    private double field_h;
    private int field_c;
    static int field_i;
    static dd[] field_f;
    private double field_j;

    final boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        var4 = fleas.field_A ? 1 : 0;
        var2 = param0 ? 1 : 0;
        var3 = -1 + this.field_e.length;
        L0: while (true) {
          if (var3 < 0) {
            if (var2 == 0) {
              if ((this.field_c ^ -1) >= -1) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            stackOut_2_0 = var2;
            stackOut_2_1 = (0.0 < this.field_e[var3] ? -1 : (0.0 == this.field_e[var3] ? 0 : 1));
            stackIn_7_0 = stackOut_2_0;
            stackIn_7_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (var4 == 0) {
              L1: {
                L2: {
                  stackOut_7_0 = stackIn_7_0;
                  stackIn_12_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (stackIn_7_1 >= 0) {
                    break L2;
                  } else {
                    stackOut_8_0 = stackIn_8_0;
                    stackIn_12_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (this.field_e[var3] >= 640.0) {
                      break L2;
                    } else {
                      stackOut_9_0 = stackIn_9_0;
                      stackIn_12_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (this.field_g[var3] <= 0.0) {
                        break L2;
                      } else {
                        stackOut_10_0 = stackIn_10_0;
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (480.0 > this.field_g[var3]) {
                          stackOut_13_0 = stackIn_13_0;
                          stackOut_13_1 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          break L1;
                        } else {
                          stackOut_11_0 = stackIn_11_0;
                          stackIn_12_0 = stackOut_11_0;
                          break L2;
                        }
                      }
                    }
                  }
                }
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = 1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                break L1;
              }
              var2 = stackIn_14_0 & stackIn_14_1;
              var3--;
              continue L0;
            } else {
              if (stackIn_3_0 < stackIn_3_1) {
                return false;
              } else {
                return true;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = 104 % ((-63 - param0) / 59);
        field_f = null;
    }

    final void b(boolean param0) {
        bi discarded$1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        rh var5 = null;
        var4 = fleas.field_A ? 1 : 0;
        if (param0) {
          var2 = this.field_c * 240 / 255;
          gb.a((int)this.field_e[0] << 145185700, (int)this.field_g[0] << -1791974876, 64, this.field_c, this.field_d);
          var3 = 1;
          L0: while (true) {
            if (20 > var3) {
              var2 = (-var3 + 20) * (this.field_c * 12) / 255;
              gb.a((int)this.field_e[var3] << 1579441988, (int)this.field_g[var3] << -2123610236, 32, var2, this.field_d);
              gb.a((int)(this.field_e[-1 + var3] + this.field_e[var3]) << -1656541085, (int)(this.field_g[var3] + this.field_g[var3 - 1]) << -516268701, 32, var2, this.field_d);
              var3++;
              if (var4 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          var5 = (rh) null;
          discarded$1 = ji.a((rh) null, 11, 87, -10);
          var2 = this.field_c * 240 / 255;
          gb.a((int)this.field_e[0] << 145185700, (int)this.field_g[0] << -1791974876, 64, this.field_c, this.field_d);
          var3 = 1;
          L1: while (true) {
            if (20 > var3) {
              var2 = (-var3 + 20) * (this.field_c * 12) / 255;
              gb.a((int)this.field_e[var3] << 1579441988, (int)this.field_g[var3] << -2123610236, 32, var2, this.field_d);
              gb.a((int)(this.field_e[-1 + var3] + this.field_e[var3]) << -1656541085, (int)(this.field_g[var3] + this.field_g[var3 - 1]) << -516268701, 32, var2, this.field_d);
              var3++;
              if (var4 == 0) {
                continue L1;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void a(byte param0) {
        if (param0 >= -57) {
            ji.a(77);
        }
    }

    final void a(int param0, byte param1) {
        boolean discarded$1 = false;
        int var3 = 0;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        var3 = 19;
        L0: while (true) {
          if (0 >= var3) {
            if (param1 <= -37) {
              this.field_e[0] = this.field_e[0] + this.field_j;
              this.field_g[0] = this.field_g[0] + this.field_h;
              this.field_h = this.field_h + bc.field_Y;
              this.field_c = this.field_c - param0;
              return;
            } else {
              discarded$1 = this.a(false);
              this.field_e[0] = this.field_e[0] + this.field_j;
              this.field_g[0] = this.field_g[0] + this.field_h;
              this.field_h = this.field_h + bc.field_Y;
              this.field_c = this.field_c - param0;
              return;
            }
          } else {
            this.field_e[var3] = this.field_e[-1 + var3];
            this.field_g[var3] = this.field_g[-1 + var3];
            var3--;
            if (var4 == 0) {
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    final static bi a(rh param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        bi stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        bi stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bi stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        bi stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param2 == -21460) {
              if (ha.a(param0, param2 ^ 11872, param1, param3)) {
                stackOut_6_0 = kl.a(-88);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = (bi) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("ji.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (bi) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    ji(int param0, int param1, int param2, int[] param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        double var5_double = 0.0;
        double[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        this.field_g = new double[20];
        this.field_e = new double[20];
        this.field_c = 249;
        try {
          L0: {
            this.field_e[0] = (double)param0;
            this.field_g[0] = (double)param1;
            this.field_d = param3;
            var5_int = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (20 <= var5_int) {
                    break L3;
                  } else {
                    var6 = this.field_e;
                    this.field_g[var5_int] = -1000.0;
                    stackOut_3_0 = var5_int;
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      var7 = stackIn_4_0;
                      var6[var7] = -1000.0;
                      var5_int++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = db.a((byte) -115, na.field_c, 10) + 15;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              }
              var5_double = (double)stackIn_6_0 / 10.0;
              this.field_j = ma.a((double)param2 * 3.141592653589793 / 512.0, 70) * var5_double;
              this.field_h = nb.a(3.141592653589793 * (double)param2 / 512.0, -127) * var5_double;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (runtimeException);
            stackOut_8_1 = new StringBuilder().append("ji.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    static {
        field_b = "Instructions";
        field_i = 1;
    }
}
