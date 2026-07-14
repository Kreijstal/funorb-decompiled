/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jk extends hl {
    private int field_n;
    private int field_s;
    int field_i;
    static kg field_p;
    int field_o;
    static String field_r;
    private int field_m;
    int field_q;
    private int field_j;
    int field_t;
    int field_u;
    int field_k;
    static int[] field_l;

    final void a(byte param0) {
        if (param0 >= -4) {
            ((jk) this).field_i = -41;
            ((jk) this).d(0);
            mm.field_e.a((byte) -112, (hl) this);
            return;
        }
        ((jk) this).d(0);
        mm.field_e.a((byte) -112, (hl) this);
    }

    final static void a(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = HoldTheLine.field_D;
                        if (ce.field_n == null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        ce.field_n.e(param0 ^ 27371);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (null == lk.field_d) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        lk.field_d.a(true);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (null != td.field_g) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            td.field_g.d(param0 ^ -27371);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (vb.field_a != null) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (param0 == 27370) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        jk.a((gn) null, -66);
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        return;
                    }
                    case 13: {
                        var1 = 0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (vb.field_a.length <= var1) {
                            statePc = 22;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (null != vb.field_a[var1]) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 18: {
                        try {
                            vb.field_a[var1].d(-1);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 20: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 22: {
                        if (param0 == 27370) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        jk.a((gn) null, -66);
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
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

    final void f(int param0) {
        ((jk) this).field_u = ((jk) this).field_u + ((jk) this).field_m;
        ((jk) this).field_t = ((jk) this).field_t + ((jk) this).field_j;
        ((jk) this).field_i = ((jk) this).field_i - 1;
        ((jk) this).field_k = ((jk) this).field_k + ((jk) this).field_n;
        ((jk) this).field_q = ((jk) this).field_q + ((jk) this).field_s;
        if (param0 >= -56) {
            ((jk) this).field_k = 46;
        }
    }

    public static void e(int param0) {
        field_p = null;
        field_r = null;
        if (param0 != 1288) {
            jk.a(27);
            field_l = null;
            return;
        }
        field_l = null;
    }

    final static void a(gn param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        qk var5 = null;
        int[] var6 = null;
        int var7 = 0;
        da var8 = null;
        int var9 = 0;
        da var10 = null;
        var7 = HoldTheLine.field_D;
        var8 = new da(param0.a("", false, "logo.fo3d"));
        var10 = var8;
        var3 = var10.f((byte) -16);
        var10.e(true);
        kl.field_s = va.a(11658, var10);
        ej.field_c = new qk[var3];
        gd.field_e = new int[var3][];
        var4 = 0;
        var5_int = -65 / ((58 - param1) / 41);
        L0: while (true) {
          if (var3 <= var4) {
            var10.l(-71);
            var9 = 0;
            var4 = var9;
            L1: while (true) {
              if (var9 >= var3) {
                return;
              } else {
                var5 = ej.field_c[var9];
                var5.a(6, 6, 6, 2, 1);
                var5.c(0);
                var6 = new int[]{var5.field_F + var5.field_L >> 1229712865, var5.field_H - -var5.field_d >> -1728352799, var5.field_p + var5.field_n >> -800904959};
                gd.field_e[var9] = var6;
                var5.a(-var6[1], -var6[0], -26608, -var6[2]);
                var9++;
                continue L1;
              }
            }
          } else {
            ej.field_c[var4] = wg.a(6, var8);
            var4++;
            continue L0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8, int param9, int param10) {
        ((jk) this).field_k = param2 << 638043178;
        ((jk) this).field_u = param8 << 1415346954;
        ((jk) this).field_m = param0;
        int var12 = 105 / ((-81 - param5) / 39);
        ((jk) this).field_t = param6 << -359791062;
        ((jk) this).field_i = param1;
        ((jk) this).field_s = param10;
        ((jk) this).field_o = param7;
        ((jk) this).field_n = param3;
        ((jk) this).field_j = param4;
        ((jk) this).field_q = param9 << -1348675710;
    }

    jk(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((jk) this).a(param7, param4, param1, param3, param2, (byte) 79, param0, param5, param6, param8, param9);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[]{4, 4, 2};
    }
}
