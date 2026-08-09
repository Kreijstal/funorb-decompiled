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
        int var6;
        int var9;
        int var10;
        int var11;
        int var12;
        Random var13;
        ve var14;
        Random var15;
        ve var16;
        var6 = 21 * param3 / param0;
        field_c.a(param5 - 7, -14 + param1, param4);
        if (null != uf.field_h) {
          uf.field_h.c(param5, param1, param4);
          if (param2 == 2) {
            oo.f(param5, param1, 8, 21 + -var6, 0, param4);
            var15 = new Random();
            if (param3 >= param0) {
              if (hp.a((byte) 11, var15, 7) != 0) {
                return;
              } else {
                var16 = new ve(3 + param5, param1 - 12, 5, 0.0, 8.0, 1.5, 1, 1.5, 0.99, 1);
                var16.field_k = param1 * 79 + 13 * param5 + wf.field_m;
                var9 = 200;
                var10 = var9 * 128;
                var11 = var9 * 64;
                var11 = var11 >> 8;
                var12 = var9 * 255;
                var10 = var10 >> 8;
                var10 = var10 << 16;
                var12 = var12 >> 8;
                var11 = var11 << 8;
                var16.a(var12 | (var10 | var11), 3 + param5, true, -12 + param1, 16777215, -1963);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          uf.field_h = new ja(8, 21);
          g.c(uf.field_h);
          oo.a(0, 0, 8, 10, 65280, 16776960);
          oo.a(0, 10, 8, 11, 16776960, 16711680);
          g.d();
          uf.field_h.c(param5, param1, param4);
          if (param2 == 2) {
            oo.f(param5, param1, 8, 21 + -var6, 0, param4);
            var13 = new Random();
            if (param3 < param0) {
              return;
            } else {
              L0: {
                if (hp.a((byte) 11, var13, 7) == 0) {
                  var14 = new ve(3 + param5, param1 - 12, 5, 0.0, 8.0, 1.5, 1, 1.5, 0.99, 1);
                  var14.field_k = param1 * 79 + 13 * param5 + wf.field_m;
                  var9 = 200;
                  var10 = var9 * 128;
                  var11 = var9 * 64;
                  var11 = var11 >> 8;
                  var12 = var9 * 255;
                  var10 = var10 >> 8;
                  var10 = var10 << 16;
                  var12 = var12 >> 8;
                  var11 = var11 << 8;
                  var14.a(var12 | (var10 | var11), 3 + param5, true, -12 + param1, 16777215, -1963);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(k param0, int param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            int var5 = 0;
            byte[] var6 = null;
            int var7 = 0;
            int var8 = 0;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            String stackIn_28_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            RuntimeException var2_ref = null;
            Exception var3 = null;
            int var4 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = ZombieDawnMulti.field_E ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var6 = new byte[24];
                            var2 = var6;
                            if (param1 == 13746) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        try {
                            if (null != bg.field_e) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            bg.field_e.a(0L, (byte) -70);
                            bg.field_e.a(var6, (byte) -50);
                            var3_int = 0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = ((Object) stateCaught_5 instanceof Exception ? 18 : 25);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 14;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = ((Object) stateCaught_6 instanceof Exception ? 18 : 25);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var8 = var6[var3_int];
                            var7 = 0;
                            if (var5 != 0) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = ((Object) stateCaught_7 instanceof Exception ? 18 : 25);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var7 != var8) {
                                statePc = 14;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = ((Object) stateCaught_8 instanceof Exception ? 18 : 25);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = ((Object) stateCaught_9 instanceof Exception ? 18 : 25);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (var7 >= var8) {
                                statePc = 16;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = ((Object) stateCaught_10 instanceof Exception ? 18 : 25);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = ((Object) stateCaught_11 instanceof Exception ? 18 : 25);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3_int++;
                            if (var5 == 0) {
                                statePc = 6;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = ((Object) stateCaught_12 instanceof Exception ? 18 : 25);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = ((Object) stateCaught_13 instanceof Exception ? 18 : 25);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = ((Object) stateCaught_14 instanceof Exception ? 18 : 25);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = ((Object) stateCaught_15 instanceof Exception ? 18 : 25);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = ((Object) stateCaught_16 instanceof Exception ? 18 : 25);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var3 = (Exception) ((Object) caughtException);
                            var4 = 0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var4 >= 24) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var6[var4] = (byte)-1;
                            var4++;
                            if (var5 != 0) {
                                statePc = 29;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var5 == 0) {
                                statePc = 19;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            param0.a(var6, 24, 0, 120);
                            return;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            param0.a(var6, 24, 0, 120);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        var2_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_27_0 = (RuntimeException) (var2_ref);
                        stackIn_26_0 = stackIn_27_0;
                        stackIn_27_1 = new StringBuilder().append("jq.D(");
                        stackIn_26_1 = stackIn_27_1;
                        if (param0 == null) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                        stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                        stackIn_28_2 = "{...}";
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 27: {
                        stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                        stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                        stackIn_28_2 = "null";
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 28: {
                        throw fa.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
                    }
                    case 29: {
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
        mh.field_i.a((byte) 50, em.field_U.field_c);
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
        field_b = new re();
        field_f = 0;
        field_d = null;
    }
}
