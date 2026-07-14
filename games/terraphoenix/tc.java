/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tc implements Iterable {
    static String field_b;
    vh field_a;
    static o field_f;
    static int field_e;
    static String field_d;
    static int[] field_c;

    private tc() throws Throwable {
        throw new Error();
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new ne((tc) this);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 > -51) {
            field_c = null;
        }
        field_f = null;
        field_c = null;
        field_d = null;
    }

    final vh c(int param0) {
        if (param0 != 0) {
            vh discarded$0 = ((tc) this).c(117);
        }
        vh var2 = ((tc) this).field_a.field_o;
        if (((tc) this).field_a == var2) {
            return null;
        }
        var2.c((byte) 13);
        return var2;
    }

    final static void b(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Terraphoenix.field_V;
                    var1 = (Object) (Object) th.field_g;
                    // monitorenter th.field_g
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        eb.field_F = eb.field_F + 1;
                        r.field_V = d.field_M;
                        if (0 <= dj.field_e) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var2 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-113 >= (var2 ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        bh.field_e[var2] = false;
                        var2++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        dj.field_e = vl.field_h;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (vl.field_h == dj.field_e) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2 = sj.field_g[vl.field_h];
                        vl.field_h = vl.field_h + 1 & 127;
                        if (-1 >= (var2 ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        bh.field_e[var2 ^ -1] = false;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        bh.field_e[var2] = true;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        d.field_M = u.field_g;
                        // monitorexit var1
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var3;
                }
                case 14: {
                    if (param0 == 1) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    tc.a(122);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(vh param0, byte param1) {
        if (!(param0.field_i == null)) {
            param0.c((byte) 13);
        }
        param0.field_i = ((tc) this).field_a.field_i;
        param0.field_o = ((tc) this).field_a;
        param0.field_i.field_o = param0;
        int var3 = -73 / ((param1 - -57) / 49);
        param0.field_o.field_i = param0;
    }

    final static String a(byte param0, byte[] param1, int param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        L0: {
          var9 = Terraphoenix.field_V;
          var12 = new char[param2];
          var11 = var12;
          var10 = var11;
          var4 = var10;
          if (param0 == -114) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        var5 = 0;
        var6 = 0;
        L1: while (true) {
          if (var6 >= param2) {
            return new String(var12, 0, var5);
          } else {
            var7 = 255 & param1[var6 + param3];
            if (var7 != -1) {
              L2: {
                if (-129 > var7) {
                  break L2;
                } else {
                  if (-161 >= (var7 ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      var8 = oj.field_s[var7 + -128];
                      if (0 != var8) {
                        break L3;
                      } else {
                        var8 = 63;
                        break L3;
                      }
                    }
                    var7 = var8;
                    break L2;
                  }
                }
              }
              var5++;
              var10[var5] = (char)var7;
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    final static int a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
            field_d = null;
        }
        return (param1 + -param3) * (-param3 + param1) + (-param2 + param4) * (-param2 + param4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This password is part of your Player Name, and would be easy to guess";
        field_f = new o();
        field_d = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
