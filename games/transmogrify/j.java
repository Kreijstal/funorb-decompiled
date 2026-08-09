/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class j {
    static int field_b;
    static String field_a;
    int field_c;
    int field_d;
    sj[] field_e;

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= -117) {
            return;
        }
        j.a((byte) 18);
    }

    final void a(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        sj var7 = null;
        sj var8 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Transmogrify.field_A ? 1 : 0;
                    if (param0 == -10874) {
                        statePc = 30;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_a = (String) null;
                    var2 = this.field_e.length;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if ((var2 ^ -1) < -2) {
                        statePc = 16;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var2 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var2 < this.field_e.length) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    if (var5 == 0) {
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
                    if (this.field_e[var2] != null) {
                        statePc = 10;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_e[var2].field_t = var2;
                    this.field_e[var2].field_g = var2 * 32 + this.field_d;
                    if (this.field_e[var2].field_k == this) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.field_e[var2].field_s = var2;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var2++;
                    if (var5 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    return;
                }
                case 16: {
                    incrementValue$0 = var2;
                    var2--;
                    var3 = li.a(incrementValue$0, o.field_o, false);
                    var7 = this.field_e[var3];
                    this.field_e[var3] = this.field_e[var2];
                    this.field_e[var2] = var7;
                    if (var5 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var5 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var2 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var2 < this.field_e.length) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                case 21: {
                    if (var5 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    return;
                }
                case 23: {
                    if (this.field_e[var2] != null) {
                        statePc = 25;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.field_e[var2].field_t = var2;
                    this.field_e[var2].field_g = var2 * 32 + this.field_d;
                    if (this.field_e[var2].field_k == this) {
                        statePc = 27;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.field_e[var2].field_s = var2;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    var2++;
                    if (var5 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    return;
                }
                case 30: {
                    var2 = this.field_e.length;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if ((var2 ^ -1) >= -2) {
                        statePc = 47;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    incrementValue$1 = var2;
                    var2--;
                    var3 = li.a(incrementValue$1, o.field_o, false);
                    var8 = this.field_e[var3];
                    this.field_e[var3] = this.field_e[var2];
                    this.field_e[var2] = var8;
                    if (var5 != 0) {
                        statePc = 48;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var5 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var2 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var2 < this.field_e.length) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    return;
                }
                case 37: {
                    if (var5 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    return;
                }
                case 39: {
                    if (this.field_e[var2] != null) {
                        statePc = 41;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 41: {
                    this.field_e[var2].field_t = var2;
                    this.field_e[var2].field_g = var2 * 32 + this.field_d;
                    if (this.field_e[var2].field_k == this) {
                        statePc = 43;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 43: {
                    this.field_e[var2].field_s = var2;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    var2++;
                    if (var5 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    return;
                }
                case 47: {
                    var2 = 0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (var2 < this.field_e.length) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    return;
                }
                case 50: {
                    if (var5 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    return;
                }
                case 52: {
                    if (this.field_e[var2] != null) {
                        statePc = 54;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 54: {
                    this.field_e[var2].field_t = var2;
                    this.field_e[var2].field_g = var2 * 32 + this.field_d;
                    if (this.field_e[var2].field_k == this) {
                        statePc = 56;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 56: {
                    this.field_e[var2].field_s = var2;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    var2++;
                    if (var5 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        var3 = Transmogrify.field_A ? 1 : 0;
        var2 = 0;
        if (!param0) {
          this.a(false);
          L0: while (true) {
            if (this.field_e.length > var2) {
              if (var3 == 0) {
                L1: {
                  if (this.field_e[var2] != null) {
                    this.field_e[var2].d(1);
                    this.field_e[var2] = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var2++;
                if (var3 == 0) {
                  continue L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L2: while (true) {
            if (this.field_e.length > var2) {
              if (var3 == 0) {
                L3: {
                  if (this.field_e[var2] != null) {
                    this.field_e[var2].d(1);
                    this.field_e[var2] = null;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var2++;
                if (var3 == 0) {
                  continue L2;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int[][] param3, int param4) {
        boolean stackIn_12_0 = false;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_15_0 = false;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int[][] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int[] var8 = null;
        sj[] var9 = null;
        int var10 = 0;
        sj var11 = null;
        int var12 = 0;
        int[][] var13 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        sb.a(nc.field_p);
                        if (param2 == 3) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a(false);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var13 = param3;
                        var6 = var13;
                        var7 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var13.length <= var7) {
                            statePc = 26;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8 = var13[var7];
                        sb.g(var8[0], var8[1], var8[2], var8[3]);
                        var9 = this.field_e;
                        if (var12 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var10 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var9.length <= var10) {
                            statePc = 19;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var11 = var9[var10];
                        if (var12 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var11 == null) {
                            statePc = 18;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_14_0 = param0;
                        stackIn_12_0 = stackIn_14_0;
                        if (var11.field_g != var11.field_j) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_14_0 = stackIn_12_0;
                        stackIn_13_0 = stackIn_14_0;
                        if (var11.field_q != var11.field_p) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_15_0 = stackIn_13_0;
                        stackIn_15_1 = 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = stackIn_14_0;
                        stackIn_15_1 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 ^ stackIn_15_1 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var11.a(param1, param4, param2 + -2, 0);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var10++;
                        if (var12 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        sb.b(nc.field_p);
                        var7++;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var12 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var6_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var6_ref);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("j.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_23_1 = stackIn_24_1;
                    if (param3 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw ch.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param4 + ')');
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    j(int param0, int param1, int param2) {
        this.field_c = param2;
        this.field_d = param1;
        this.field_e = new sj[param0];
    }

    static {
        field_b = 0;
        field_a = "Loading...";
    }
}
