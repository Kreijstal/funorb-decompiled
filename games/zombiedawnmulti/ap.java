/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ap extends qb {
    static String field_u;
    static boolean field_s;
    static String field_r;
    static ja field_t;
    private ej field_q;

    private final void a(boolean param0, boolean param1) {
        try {
            IOException var3 = null;
            Exception var4 = null;
            k stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            k stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            k stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            k stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            k stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            k stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((ap) this).field_q == null) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        try {
                            ((ap) this).field_b.field_j = 0;
                            stackOut_3_0 = ((ap) this).field_b;
                            stackOut_3_1 = 122;
                            stackIn_5_0 = stackOut_3_0;
                            stackIn_5_1 = stackOut_3_1;
                            stackIn_4_0 = stackOut_3_0;
                            stackIn_4_1 = stackOut_3_1;
                            if (param0) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = (k) (Object) stackIn_4_0;
                            stackOut_4_1 = stackIn_4_1;
                            stackOut_4_2 = 3;
                            stackIn_6_0 = stackOut_4_0;
                            stackIn_6_1 = stackOut_4_1;
                            stackIn_6_2 = stackOut_4_2;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = (k) (Object) stackIn_5_0;
                            stackOut_5_1 = stackIn_5_1;
                            stackOut_5_2 = 2;
                            stackIn_6_0 = stackOut_5_0;
                            stackIn_6_1 = stackOut_5_1;
                            stackIn_6_2 = stackOut_5_2;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((k) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2);
                            ((ap) this).field_b.b(0L, param1);
                            ((ap) this).field_q.a(0, -100, ((ap) this).field_b.field_m.length, ((ap) this).field_b.field_m);
                            if (param1) {
                                statePc = 14;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            this.a(false, false);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var3 = (IOException) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        try {
                            ((ap) this).field_q.c(93);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        ((ap) this).field_n = ((ap) this).field_n + 1;
                        ((ap) this).field_q = null;
                        ((ap) this).field_p = -2;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
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

    final static void a(ul param0, byte param1, fm param2) {
        int var3 = 0;
        int var4 = 0;
        ob var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        Object var12 = null;
        Object var13 = null;
        int[] var17 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = p.field_e;
        rp.field_l = new cj(0L, (cj) null);
        var4 = 97 / ((param1 - 46) / 63);
        if (param0 != null) {
          param0.field_j = false;
          param0.field_b = 0;
          ok.field_p = new ig(var3, param0, param0);
          bd.field_c = new an(var3, param0, param0, (dr) (Object) new dd());
          var5 = ha.b(false);
          if (var5 == null) {
            var12 = null;
            bd.a("QC2", (Throwable) null, false);
            return;
          } else {
            fb.a(var5, (byte) -19);
            var13 = null;
            tg.field_d = qd.a(1127256, (fm) null, 65793, 1513239, 8947848, 4020342, 65793, (byte) 123, 0, 2245737, 65793, 1513239, 5138823);
            bb.field_k = qd.a(0, param2, 0, 0, 0, 0, 0, (byte) 127, 16764006, 0, 0, 0, 0);
            kb.field_x = qd.a(0, param2, 0, 0, 0, 0, 0, (byte) 122, 16777215, 0, 0, 0, 0);
            var6 = oo.field_b;
            var7 = oo.field_l;
            var17 = oo.field_i;
            tb.field_v = new ja(10, 14);
            tb.field_v.a();
            var9 = 2;
            L0: while (true) {
              if (7 <= var9) {
                oo.a(var17, var6, var7);
                tl.field_t = eh.a(false, tg.field_d, bb.field_k, kb.field_x, var5);
                rp.field_l.field_Cb = new th();
                return;
              } else {
                oo.g(var9, var9 + 1, 14 + -(var9 << -1210809887), 16777215);
                var9++;
                continue L0;
              }
            }
          }
        } else {
          var11 = null;
          bd.a("QC1", (Throwable) null, false);
          return;
        }
    }

    final boolean b(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            tn var2_ref = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var16 = 0;
            int stackIn_62_0 = 0;
            int stackOut_61_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = ZombieDawnMulti.field_E ? 1 : 0;
                        if (((ap) this).field_q == null) {
                            statePc = 10;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = bl.a((byte) 115);
                        var4 = (int)(var2_long - ((ap) this).field_f);
                        if (-201 > (var4 ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var4 = 200;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        ((ap) this).field_f = var2_long;
                        ((ap) this).field_d = ((ap) this).field_d + var4;
                        if (((ap) this).field_d > 30000) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((ap) this).field_q.c(99);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var5_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        ((ap) this).field_q = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null == ((ap) this).field_q) {
                            statePc = 12;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (((ap) this).a(0) == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        return false;
                    }
                    case 14: {
                        if (0 == ((ap) this).d(20)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        return false;
                    }
                    case 16: {
                        return true;
                    }
                    case 18: {
                        try {
                            ((ap) this).field_q.b(-26844);
                            var2_ref = (tn) (Object) ((ap) this).field_g.c((byte) 111);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var2_ref == null) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((ap) this).field_b.field_j = 0;
                            ((ap) this).field_b.a(-112, 1);
                            ((ap) this).field_b.b(var2_ref.field_l, true);
                            ((ap) this).field_q.a(0, -100, ((ap) this).field_b.field_m.length, ((ap) this).field_b.field_m);
                            ((ap) this).field_j.a(29664, (qa) (Object) var2_ref);
                            var2_ref = (tn) (Object) ((ap) this).field_g.b((byte) 97);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var2_ref = (tn) (Object) ((ap) this).field_c.c((byte) 124);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var2_ref == null) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((ap) this).field_b.field_j = 0;
                            ((ap) this).field_b.a(-20, 0);
                            ((ap) this).field_b.b(var2_ref.field_l, true);
                            ((ap) this).field_q.a(0, -100, ((ap) this).field_b.field_m.length, ((ap) this).field_b.field_m);
                            ((ap) this).field_l.a(29664, (qa) (Object) var2_ref);
                            var2_ref = (tn) (Object) ((ap) this).field_c.b((byte) 102);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var2_int = 0;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (-101 >= (var2_int ^ -1)) {
                                statePc = 61;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var3_int = ((ap) this).field_q.a(-79);
                            if (var3_int >= 0) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (0 == var3_int) {
                                statePc = 61;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            ((ap) this).field_d = 0;
                            var4 = 0;
                            if (null == ((ap) this).field_m) {
                                statePc = 33;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (((ap) this).field_m.field_D == 0) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var4 = 1;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var4 = 10;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if ((var4 ^ -1) >= -1) {
                                statePc = 46;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var5 = -((ap) this).field_k.field_j + var4;
                            if (var3_int < var5) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var5 = var3_int;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            ((ap) this).field_q.a(var5, ((ap) this).field_k.field_j, ((ap) this).field_k.field_m, 108);
                            if (((ap) this).field_i != 0) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var6 = 0;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (var5 <= var6) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            ((ap) this).field_k.field_m[var6 + ((ap) this).field_k.field_j] = (byte)vg.a((int) ((ap) this).field_k.field_m[var6 + ((ap) this).field_k.field_j], (int) ((ap) this).field_i);
                            var6++;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            ((ap) this).field_k.field_j = ((ap) this).field_k.field_j + var5;
                            if (var4 > ((ap) this).field_k.field_j) {
                                statePc = 44;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var2_int++;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var5 = ((ap) this).field_m.field_y.field_m.length - ((ap) this).field_m.field_B;
                            var6 = -((ap) this).field_m.field_D + 512;
                            if (var6 <= -((ap) this).field_m.field_y.field_j + var5) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var6 = -((ap) this).field_m.field_y.field_j + var5;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var3_int >= var6) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var6 = var3_int;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            ((ap) this).field_q.a(var6, ((ap) this).field_m.field_y.field_j, ((ap) this).field_m.field_y.field_m, 117);
                            if (0 != ((ap) this).field_i) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var7 = 0;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var6 <= var7) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ((ap) this).field_m.field_y.field_m[var7 + ((ap) this).field_m.field_y.field_j] = (byte)vg.a((int) ((ap) this).field_m.field_y.field_m[var7 + ((ap) this).field_m.field_y.field_j], (int) ((ap) this).field_i);
                            var7++;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            ((ap) this).field_m.field_y.field_j = ((ap) this).field_m.field_y.field_j + var6;
                            ((ap) this).field_m.field_D = ((ap) this).field_m.field_D + var6;
                            if (((ap) this).field_m.field_y.field_j != var5) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ((ap) this).field_m.a(-4564);
                            ((ap) this).field_m.field_t = false;
                            ((ap) this).field_m = null;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (-513 == (((ap) this).field_m.field_D ^ -1)) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            ((ap) this).field_m.field_D = 0;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var2_int++;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var2_int = -121 % ((44 - param0) / 45);
                            stackOut_61_0 = 1;
                            stackIn_62_0 = stackOut_61_0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        return stackIn_62_0 != 0;
                    }
                    case 63: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 64: {
                        try {
                            ((ap) this).field_q.c(82);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        ((ap) this).field_q = null;
                        ((ap) this).field_n = ((ap) this).field_n + 1;
                        ((ap) this).field_p = -2;
                        if (0 == ((ap) this).a(0)) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 68: {
                        return false;
                    }
                    case 69: {
                        if (0 == ((ap) this).d(20)) {
                            statePc = 71;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 70: {
                        return false;
                    }
                    case 71: {
                        return true;
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

    final static sl a(ul param0, ul param1, String param2, int param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        if (param3 != 4) {
          return null;
        } else {
          var5 = param0.a(param2, (byte) 123);
          var6 = param0.a(param4, var5, -1);
          return pm.a(param1, var6, var5, param0, -29435);
        }
    }

    private final void g(int param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((ap) this).field_q == null) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        try {
                            ((ap) this).field_b.field_j = param0;
                            ((ap) this).field_b.a(124, 6);
                            ((ap) this).field_b.d(3, -8593);
                            ((ap) this).field_b.a(0, (byte) -55);
                            ((ap) this).field_q.a(0, param0 + -100, ((ap) this).field_b.field_m.length, ((ap) this).field_b.field_m);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((ap) this).field_q.c(116);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        ((ap) this).field_p = -2;
                        ((ap) this).field_q = null;
                        ((ap) this).field_n = ((ap) this).field_n + 1;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
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

    public ap() {
    }

    final void a(byte param0) {
        try {
            int var2_int = 0 / ((param0 - 53) / 41);
            ((ap) this).field_q.c(-101);
        } catch (Exception exception) {
        }
        ((ap) this).field_n = ((ap) this).field_n + 1;
        ((ap) this).field_p = -1;
        ((ap) this).field_q = null;
        ((ap) this).field_i = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final void f(int param0) {
        if (param0 != 31) {
            this.a(false, true);
        }
        if (!(((ap) this).field_q == null)) {
            ((ap) this).field_q.c(88);
        }
    }

    final void a(boolean param0, Object param1, int param2) {
        try {
            Exception var4_ref_Exception = null;
            IOException var4_ref_IOException = null;
            int var4 = 0;
            tn var4_ref_tn = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = ZombieDawnMulti.field_E ? 1 : 0;
                        if (((ap) this).field_q != null) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((ap) this).field_q.c(-90);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        var4_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((ap) this).field_q = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((ap) this).field_q = (ej) param1;
                        this.g(0);
                        this.a(param0, true);
                        ((ap) this).field_m = null;
                        ((ap) this).field_k.field_j = 0;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var4_ref_tn = (tn) (Object) ((ap) this).field_j.a(11356);
                        if (var4_ref_tn == null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        ((ap) this).field_g.a(29664, (qa) (Object) var4_ref_tn);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref_tn = (tn) (Object) ((ap) this).field_l.a(11356);
                        if (var4_ref_tn == null) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        ((ap) this).field_c.a(29664, (qa) (Object) var4_ref_tn);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 11: {
                        if (0 == ((ap) this).field_i) {
                            statePc = 19;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((ap) this).field_b.field_j = 0;
                            ((ap) this).field_b.a(126, 4);
                            ((ap) this).field_b.a(125, (int) ((ap) this).field_i);
                            ((ap) this).field_b.b(-103, 0);
                            ((ap) this).field_q.a(0, -100, ((ap) this).field_b.field_m.length, ((ap) this).field_b.field_m);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        var4_ref_IOException = (IOException) (Object) caughtException;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((ap) this).field_q.c(-53);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        ((ap) this).field_q = null;
                        ((ap) this).field_n = ((ap) this).field_n + 1;
                        ((ap) this).field_p = -2;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        var4 = 12 % ((param2 - 63) / 33);
                        ((ap) this).field_d = 0;
                        ((ap) this).field_f = bl.a((byte) 110);
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

    public static void h(int param0) {
        if (param0 != 16682) {
            field_s = false;
        }
        field_r = null;
        field_u = null;
        field_t = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = false;
        field_u = "Spectate";
        field_r = "<%0> has not yet unlocked this option for use.";
    }
}
