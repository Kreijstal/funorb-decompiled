/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ji extends da {
    static int[] field_F;
    static cn field_G;
    static String field_H;
    private md field_I;

    final void a(lm param0, int param1) {
        if (!(param0 instanceof rf)) {
            throw new IllegalArgumentException();
        }
        if (param1 != -1) {
            return;
        }
        rf var3 = (rf) (Object) param0;
        ((ji) this).field_I.b((ne) (Object) var3, false);
        var3.field_T = true;
        boolean discarded$0 = var3.a(34, (lm) this);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = DungeonAssault.field_K;
        if (!(((ji) this).field_o == null)) {
            ((ji) this).field_o.a((byte) 34, (lm) this, param1, param3, true);
        }
        dj var5 = new dj(((ji) this).field_I);
        if (param2 != 0) {
            ((ji) this).field_I = null;
        }
        lm var6 = (lm) (Object) var5.b(-1225818257);
        while (var6 != null) {
            var6.a(param0, param1 + ((ji) this).field_q, 0, param3 - -((ji) this).field_v);
            var6 = (lm) (Object) var5.d(1834857157);
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        if (param1) {
            return 48;
        }
        return uj.a(ld.field_f, 37, 1 + -param2 + param0) + param2;
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_17_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = DungeonAssault.field_K;
                    if (param1 <= -30) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_G = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        if (qg.field_n.startsWith("win")) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        if (param0.startsWith("http://")) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!param0.startsWith("https://")) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0 != 0;
                }
                case 10: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param0.length() <= var3) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-1 == var2.indexOf((int) param0.charAt(var3))) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0 != 0;
                }
                case 16: {
                    try {
                        var3++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(boolean param0) {
        int var4 = DungeonAssault.field_K;
        dj var2 = new dj(((ji) this).field_I);
        if (!param0) {
            int discarded$0 = ji.a(-59, true, -77);
        }
        rf var3 = (rf) (Object) var2.a(-479592473);
        while (var3 != null) {
            if (!(!var3.f((byte) -90))) {
                var3.a(false);
            }
            var3 = (rf) (Object) var2.c(17756);
        }
        ((ji) this).field_D = (lm) (Object) ((ji) this).i(32);
    }

    public ji() {
        super(0, 0, hn.field_t, vf.field_x, (ca) null, (pg) null);
        ((ji) this).field_I = new md();
    }

    final void j(int param0) {
        int var4 = DungeonAssault.field_K;
        dj var2 = new dj(((ji) this).field_I);
        if (param0 != -33) {
            int discarded$0 = ji.a(-41, true, -105);
        }
        rf var3 = (rf) (Object) var2.a(-479592473);
        while (var3 != null) {
            if (var3.i(462)) {
                var3.a(false);
            }
            var3 = (rf) (Object) var2.c(17756);
        }
    }

    final lm g(int param0) {
        dj var2 = null;
        rf var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = DungeonAssault.field_K;
          if (param0 == 1) {
            break L0;
          } else {
            var5 = null;
            ((ji) this).a((lm) null, 10);
            break L0;
          }
        }
        var2 = new dj(((ji) this).field_I);
        var3 = (rf) (Object) var2.a(-479592473);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_T) {
              var3 = (rf) (Object) var2.c(param0 + 17755);
              continue L1;
            } else {
              return var3.g(param0 + -20312);
            }
          } else {
            return null;
          }
        }
    }

    final void h(int param0) {
        int var4 = DungeonAssault.field_K;
        if (param0 != 1) {
            field_F = null;
        }
        dj var2 = new dj(((ji) this).field_I);
        rf var3 = (rf) (Object) var2.a(-479592473);
        while (var3 != null) {
            var3.field_T = false;
            var3 = (rf) (Object) var2.c(param0 ^ 17757);
        }
        ((ji) this).field_D = null;
    }

    public static void f(byte param0) {
        field_H = null;
        field_G = null;
        if (param0 != -98) {
            ji.f((byte) -89);
        }
        field_F = null;
    }

    final rf i(int param0) {
        dj var2 = null;
        rf var3 = null;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        if (param0 == 32) {
          var2 = new dj(((ji) this).field_I);
          var3 = (rf) (Object) var2.a(-479592473);
          L0: while (true) {
            if (var3 != null) {
              if (!var3.field_T) {
                var3 = (rf) (Object) var2.c(17756);
                continue L0;
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        field_F = new int[32];
        for (var0 = 0; -33 < (var0 ^ -1); var0++) {
            var1 = var0 * 1 + 32;
            field_F[var0] = 65793 * var1;
        }
        field_H = "You have collected <%0> consecutive bounties";
    }
}
