/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class jq {
    static re field_b;
    static ri field_c;
    static int field_a;
    static int field_f;
    static uj field_d;
    static ri field_e;

    public static void a(int param0) {
        if (param0 != 8) {
            return;
        }
        field_b = null;
        field_e = null;
        field_c = null;
        field_d = null;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int var6 = 0;
        Random var7 = null;
        ve var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var6 = 21 * param3 / param0;
          field_c.a(param5 - 7, -14 + param1, param4);
          if (null != uf.field_h) {
            break L0;
          } else {
            uf.field_h = new ja(8, 21);
            g.c(uf.field_h);
            oo.a(0, 0, 8, 10, 65280, 16776960);
            oo.a(0, 10, 8, 11, 16776960, 16711680);
            g.d();
            break L0;
          }
        }
        uf.field_h.c(param5, param1, param4);
        if (param2 == 2) {
          L1: {
            oo.f(param5, param1, 8, 21 + -var6, 0, param4);
            var7 = new Random();
            if (param3 < param0) {
              break L1;
            } else {
              if (hp.a((byte) 11, var7, 7) == 0) {
                var8 = new ve(3 + param5, param1 - 12, 5, 0.0, 8.0, 1.5, 1, 1.5, 0.99, 1);
                var8.field_k = param1 * 79 + 13 * param5 + wf.field_m;
                var9 = 200;
                var10 = var9 * 128;
                var11 = var9 * 64;
                var11 = var11 >> 8;
                var12 = var9 * 255;
                var10 = var10 >> 8;
                var10 = var10 << 16;
                var12 = var12 >> 8;
                var11 = var11 << 8;
                var8.a(var12 | (var10 | var11), 3 + param5, true, -12 + param1, 16777215, -1963);
                break L1;
              } else {
                break L1;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(k param0, int param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = ZombieDawnMulti.field_E ? 1 : 0;
                        var6 = new byte[24];
                        var2 = var6;
                        if (param1 == 13746) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        if (null != bg.field_e) {
                            statePc = 4;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        try {
                            bg.field_e.a(0L, (byte) -70);
                            bg.field_e.a(var6, (byte) -50);
                            var3_int = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (0 != var6[var3_int]) {
                                statePc = 8;
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
                            var3_int++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            param0.a(var2, 24, 0, 120);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (var4 >= 24) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 15: {
                        param0.a(var2, 24, 0, 120);
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, byte param1) {
        em.field_U = !param0 ? new qh(l.field_d, ga.field_r) : new qh(mk.field_n, sk.field_i);
        mh.field_i = new cj(0L, (cj) null);
        mh.field_i.a((byte) 50, (cj) (Object) em.field_U.field_c);
        int var2 = 81 % ((65 - param1) / 60);
        mh.field_i.a((byte) 50, jp.field_b);
        qf.field_b = new cj(0L, wa.field_a);
        vb.field_c = new cj(0L, (cj) null);
        qf.field_b.a((byte) 50, mq.field_l);
        qf.field_b.a((byte) 50, vb.field_c);
        vb.field_c.a((byte) 50, pd.field_b);
        vb.field_c.a((byte) 50, pg.field_a);
        ci.a(param0, -72);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new re();
        field_f = 0;
        field_d = null;
    }
}
