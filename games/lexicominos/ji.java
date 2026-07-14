/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ji implements Iterable {
    private kd field_c;
    static int[] field_e;
    kd[] field_f;
    int field_d;
    static String field_b;
    static int[] field_a;

    public final Iterator iterator() {
        return (Iterator) (Object) new vk((ji) this);
    }

    final void a(kd param0, int param1, long param2) {
        if (!(null == param0.field_c)) {
            param0.b((byte) -119);
        }
        kd var5 = ((ji) this).field_f[(int)((long)(((ji) this).field_d - param1) & param2)];
        param0.field_f = var5;
        param0.field_c = var5.field_c;
        param0.field_c.field_f = param0;
        param0.field_d = param2;
        param0.field_f.field_c = param0;
    }

    public static void b(byte param0) {
        field_a = null;
        int var1 = -69 % ((4 - param0) / 55);
        field_b = null;
        field_e = null;
    }

    final static boolean a(byte param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1_ref = (Object) (Object) ol.field_l;
                    // monitorenter ol.field_l
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (tj.field_h != sh.field_f) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var1_ref
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (param0 == -72) {
                            statePc = 6;
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
                        boolean discarded$3 = ji.a((byte) 25);
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
                        da.field_b = gj.field_x[tj.field_h];
                        pe.field_b = ok.field_q[tj.field_h];
                        tj.field_h = 127 & tj.field_h + 1;
                        // monitorexit var1_ref
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1_ref
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final kd a(byte param0, long param1) {
        kd var4 = null;
        kd var5 = null;
        int var6 = 0;
        kd var7 = null;
        kd var8 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (param0 == 42) {
          var7 = ((ji) this).field_f[(int)(param1 & (long)(-1 + ((ji) this).field_d))];
          var4 = var7;
          ((ji) this).field_c = var7.field_f;
          L0: while (true) {
            if (var4 != ((ji) this).field_c) {
              if ((param1 ^ -1L) != (((ji) this).field_c.field_d ^ -1L)) {
                ((ji) this).field_c = ((ji) this).field_c.field_f;
                continue L0;
              } else {
                var5 = ((ji) this).field_c;
                ((ji) this).field_c = ((ji) this).field_c.field_f;
                return var5;
              }
            } else {
              ((ji) this).field_c = null;
              return null;
            }
          }
        } else {
          Iterator discarded$1 = ((ji) this).iterator();
          var8 = ((ji) this).field_f[(int)(param1 & (long)(-1 + ((ji) this).field_d))];
          var4 = var8;
          ((ji) this).field_c = var8.field_f;
          L1: while (true) {
            if (var4 != ((ji) this).field_c) {
              if ((param1 ^ -1L) != (((ji) this).field_c.field_d ^ -1L)) {
                ((ji) this).field_c = ((ji) this).field_c.field_f;
                continue L1;
              } else {
                var5 = ((ji) this).field_c;
                ((ji) this).field_c = ((ji) this).field_c.field_f;
                return var5;
              }
            } else {
              ((ji) this).field_c = null;
              return null;
            }
          }
        }
    }

    private ji() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[128];
        field_a = new int[4];
    }
}
