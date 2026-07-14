/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ji implements Iterable {
    static boolean field_f;
    private nm field_h;
    static Random field_e;
    static String field_g;
    nm[] field_d;
    int field_c;
    static mf field_a;
    static mh field_b;

    public static void a(int param0) {
        field_a = null;
        field_g = null;
        field_b = null;
        if (param0 != 24968) {
            Object var2 = null;
            ji.a(-14, true, (vm) null, -51, -100, true);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final nm a(long param0, int param1) {
        nm var4 = null;
        nm var5 = null;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        var4 = ((ji) this).field_d[(int)((long)(((ji) this).field_c - 1) & param0)];
        ((ji) this).field_h = var4.field_e;
        if (param1 <= 85) {
          ((ji) this).field_c = -72;
          L0: while (true) {
            if (var4 == ((ji) this).field_h) {
              ((ji) this).field_h = null;
              return null;
            } else {
              if (param0 != ((ji) this).field_h.field_g) {
                ((ji) this).field_h = ((ji) this).field_h.field_e;
                continue L0;
              } else {
                var5 = ((ji) this).field_h;
                ((ji) this).field_h = ((ji) this).field_h.field_e;
                return var5;
              }
            }
          }
        } else {
          L1: while (true) {
            if (var4 == ((ji) this).field_h) {
              ((ji) this).field_h = null;
              return null;
            } else {
              if (param0 != ((ji) this).field_h.field_g) {
                ((ji) this).field_h = ((ji) this).field_h.field_e;
                continue L1;
              } else {
                var5 = ((ji) this).field_h;
                ((ji) this).field_h = ((ji) this).field_h.field_e;
                return var5;
              }
            }
          }
        }
    }

    final void a(byte param0, long param1, nm param2) {
        nm var5 = null;
        int var6 = 0;
        if (null != param2.field_b) {
            param2.b((byte) 111);
            var5 = ((ji) this).field_d[(int)(param1 & (long)(-1 + ((ji) this).field_c))];
            param2.field_b = var5.field_b;
            param2.field_e = var5;
            param2.field_b.field_e = param2;
            param2.field_e.field_b = param2;
            var6 = -64 % ((param0 - -60) / 52);
            param2.field_g = param1;
            return;
        }
        var5 = ((ji) this).field_d[(int)(param1 & (long)(-1 + ((ji) this).field_c))];
        param2.field_b = var5.field_b;
        param2.field_e = var5;
        param2.field_b.field_e = param2;
        param2.field_e.field_b = param2;
        var6 = -64 % ((param0 - -60) / 52);
        param2.field_g = param1;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new ik((ji) this);
    }

    final static void a(int param0, boolean param1, vm param2, int param3, int param4, boolean param5) {
        Object var6 = null;
        Object var6_ref = null;
        Throwable var7 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6_ref = (Object) (Object) eo.field_f;
                    // monitorenter eo.field_f
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 25459) {
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
                        field_g = null;
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
                        if (fo.field_a != param2) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        // monitorexit var6_ref
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        fo.field_a = param2;
                        if (fo.field_a == null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        m.field_f.a(param4, fo.field_a, param3, param1, param0 + -25460, param5);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        // monitorexit var6_ref
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var7 = caughtException;
                        // monitorexit var6_ref
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 11: {
                    throw (RuntimeException) (Object) var7;
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ji(int param0) {
        int var2 = 0;
        nm var3 = null;
        ((ji) this).field_d = new nm[param0];
        ((ji) this).field_c = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            var3 = new nm();
            ((ji) this).field_d[var2] = new nm();
            var3.field_b = var3;
            var3.field_e = var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    final static lo a(String param0, int param1) {
        int var5 = 0;
        String var6 = null;
        lo var7 = null;
        int var8 = BrickABrac.field_J ? 1 : 0;
        int var2 = param0.length();
        if (-1 == (var2 ^ -1)) {
            return la.field_a;
        }
        if (!(255 >= var2)) {
            return pi.field_r;
        }
        String[] var3 = qb.a((byte) -11, param0, '.');
        if (2 > var3.length) {
            return la.field_a;
        }
        String[] var4 = var3;
        for (var5 = param1; var4.length > var5; var5++) {
            var6 = var4[var5];
            var7 = kb.a(param1 ^ 95, var6);
            if (var7 != null) {
                return var7;
            }
        }
        return mf.a((byte) -95, var3[var3.length - 1]);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Friends";
        field_e = new Random();
    }
}
