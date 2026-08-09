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
        int var2;
        int var3;
        int var4;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        var4 = fleas.field_A ? 1 : 0;
        var2 = param0 ? 1 : 0;
        var3 = -1 + this.field_e.length;
        L0: while (true) {
          L1: {
            if (var3 < 0) {
              break L1;
            } else {
              stackIn_7_0 = var2;

              stackIn_7_1 = (0.0 < this.field_e[var3] ? -1 : (0.0 == this.field_e[var3] ? 0 : 1));

              if (var4 == 0) {
                L2: {
                  L3: {

                    if (stackIn_7_1 >= 0) {
                      break L3;
                    } else {

                      if (this.field_e[var3] >= 640.0) {
                        break L3;
                      } else {

                        if (this.field_g[var3] <= 0.0) {
                          break L3;
                        } else {


                          if (480.0 > this.field_g[var3]) {
                            stackIn_14_0 = stackIn_7_0;
                            stackIn_14_1 = 0;
                            break L2;
                          } else {

                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_14_0 = stackIn_7_0;
                  stackIn_14_1 = 1;
                  break L2;
                }
                var2 = stackIn_14_0 & stackIn_14_1;
                var3--;
                if (var4 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              } else {
                if (stackIn_7_0 < stackIn_7_1) {
                  return false;
                } else {
                  return true;
                }
              }
            }
          }
          if (var2 == 0) {
            if ((this.field_c ^ -1) >= -1) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = 104 % ((-63 - param0) / 59);
        field_f = null;
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        rh var5 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = fleas.field_A ? 1 : 0;
                    if (param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var5 = (rh) null;
                    ji.a((rh) null, 11, 87, -10);
                    statePc = 10;
                    continue stateLoop;
                }
                case 2: {
                    var2 = this.field_c * 240 / 255;
                    gb.a((int)this.field_e[0] << 145185700, (int)this.field_g[0] << -1791974876, 64, this.field_c, this.field_d);
                    var3 = 1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (20 > var3) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 6: {
                    var2 = (-var3 + 20) * (this.field_c * 12) / 255;
                    gb.a((int)this.field_e[var3] << 1579441988, (int)this.field_g[var3] << -2123610236, 32, var2, this.field_d);
                    gb.a((int)(this.field_e[-1 + var3] + this.field_e[var3]) << -1656541085, (int)(this.field_g[var3] + this.field_g[var3 - 1]) << -516268701, 32, var2, this.field_d);
                    var3++;
                    if (var4 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    if (var4 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    var2 = this.field_c * 240 / 255;
                    gb.a((int)this.field_e[0] << 145185700, (int)this.field_g[0] << -1791974876, 64, this.field_c, this.field_d);
                    var3 = 1;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (20 > var3) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 14: {
                    var2 = (-var3 + 20) * (this.field_c * 12) / 255;
                    gb.a((int)this.field_e[var3] << 1579441988, (int)this.field_g[var3] << -2123610236, 32, var2, this.field_d);
                    gb.a((int)(this.field_e[-1 + var3] + this.field_e[var3]) << -1656541085, (int)(this.field_g[var3] + this.field_g[var3 - 1]) << -516268701, 32, var2, this.field_d);
                    var3++;
                    if (var4 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                case 16: {
                    if (var4 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        if (param0 >= -57) {
            ji.a(77);
        }
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = fleas.field_A ? 1 : 0;
                    var3 = 19;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (0 >= var3) {
                        statePc = 9;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_e[var3] = this.field_e[-1 + var3];
                    this.field_g[var3] = this.field_g[-1 + var3];
                    var3--;
                    if (var4 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param1 <= -37) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.a(false);
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    this.field_e[0] = this.field_e[0] + this.field_j;
                    this.field_g[0] = this.field_g[0] + this.field_h;
                    this.field_h = this.field_h + bc.field_Y;
                    this.field_c = this.field_c - param0;
                    return;
                }
                case 8: {
                    this.field_e[0] = this.field_e[0] + this.field_j;
                    this.field_g[0] = this.field_g[0] + this.field_h;
                    this.field_h = this.field_h + bc.field_Y;
                    this.field_c = this.field_c - param0;
                    return;
                }
                case 9: {
                    if (param1 <= -37) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.a(false);
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    this.field_e[0] = this.field_e[0] + this.field_j;
                    this.field_g[0] = this.field_g[0] + this.field_h;
                    this.field_h = this.field_h + bc.field_Y;
                    this.field_c = this.field_c - param0;
                    return;
                }
                case 12: {
                    this.field_e[0] = this.field_e[0] + this.field_j;
                    this.field_g[0] = this.field_g[0] + this.field_h;
                    this.field_h = this.field_h + bc.field_Y;
                    this.field_c = this.field_c - param0;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static bi a(rh param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        bi stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        bi stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == -21460) {
              if (ha.a(param0, param2 ^ 11872, param1, param3)) {
                stackIn_7_0 = kl.a(-88);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (bi) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ji.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = fleas.field_A ? 1 : 0;
                    this.field_g = new double[20];
                    this.field_e = new double[20];
                    this.field_c = 249;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_e[0] = (double)param0;
                        this.field_g[0] = (double)param1;
                        this.field_d = param3;
                        var5_int = 1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (20 <= var5_int) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6 = this.field_e;
                        this.field_g[var5_int] = -1000.0;
                        stackIn_6_0 = var5_int;
                        stackIn_4_0 = stackIn_6_0;
                        if (var8 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7 = stackIn_4_0;
                        var6[var7] = -1000.0;
                        var5_int++;
                        if (var8 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = db.a((byte) -115, na.field_c, 10) + 15;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5_double = (double)stackIn_6_0 / 10.0;
                        this.field_j = ma.a((double)param2 * 3.141592653589793 / 512.0, 70) * var5_double;
                        this.field_h = nb.a(3.141592653589793 * (double)param2 / 512.0, -127) * var5_double;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_10_0 = (RuntimeException) (runtimeException);
                    stackIn_9_0 = stackIn_10_0;
                    stackIn_10_1 = new StringBuilder().append("ji.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_9_1 = stackIn_10_1;
                    if (param3 == null) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_11_2 = "{...}";
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "null";
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_b = "Instructions";
        field_i = 1;
    }
}
