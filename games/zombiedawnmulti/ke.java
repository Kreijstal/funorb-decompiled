/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ke {
    static int field_b;
    static pi field_f;
    static cj field_j;
    static fm field_h;
    static String field_k;
    static String field_d;
    static String field_e;
    static ra field_g;
    static String field_a;
    static String field_c;
    static ja[] field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int[] array$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        array$1 = new int[ah.field_e.field_P[0].length];
                        ah.field_e.field_P[param1] = array$1;
                        ah.field_e.field_P[param1][ia.field_s] = param0;
                        ah.field_e.field_P[param1][rj.field_F] = param3;
                        ah.field_e.field_P[param1][wm.field_Q[0]] = param4;
                        if (param2 == -17895) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ke.a(92, -5L);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5_int = 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (wm.field_Q.length <= var5_int) {
                            statePc = 11;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ah.field_e.field_P[param1][wm.field_Q[var5_int]] = ui.a(ah.field_e.field_P[param1][wm.field_Q[var5_int + -1]], false);
                        var5_int++;
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        return;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var5), "ke.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(int param0, long param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        cp.field_U.setTime(new Date(param1));
        var3 = cp.field_U.get(7);
        var4 = cp.field_U.get(5);
        var5 = cp.field_U.get(2);
        var6 = cp.field_U.get(1);
        var7 = cp.field_U.get(11);
        var8 = cp.field_U.get(12);
        if (param0 != -29971) {
          field_b = -87;
          var9 = cp.field_U.get(13);
          return ud.field_O[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + hm.field_q[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
          var9 = cp.field_U.get(13);
          return ud.field_O[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + hm.field_q[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        field_c = null;
        if (param0) {
          return;
        } else {
          field_h = null;
          field_f = null;
          field_j = null;
          field_k = null;
          field_e = null;
          field_g = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    static {
        field_f = new pi(0);
        field_d = "Accept invitation to <%0>'s game";
        field_k = "There are no valid types of game that match your preferences.";
        field_c = "Concluded";
        field_e = "Played";
        field_a = "Inviting <%0>";
    }
}
