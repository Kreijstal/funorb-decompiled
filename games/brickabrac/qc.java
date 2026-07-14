/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qc extends nm {
    static jp[] field_l;
    static vl field_n;
    static volatile boolean field_i;
    static int field_o;
    int field_j;
    static mf field_k;
    int field_m;

    final static oh a(String param0, int param1) {
        if (ka.field_l == jm.field_f) {
            return null;
        }
        if (param1 != 0) {
            return null;
        }
        if (up.field_v == ka.field_l) {
            if (param0.equals((Object) (Object) om.field_pc)) {
                ka.field_l = ej.field_P;
                return he.field_H;
            }
        }
        he.field_H = null;
        ka.field_l = jm.field_f;
        om.field_pc = param0;
        return null;
    }

    public static void d(int param0) {
        field_n = null;
        if (param0 != 0) {
            return;
        }
        field_l = null;
        field_k = null;
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
                        var3 = BrickABrac.field_J ? 1 : 0;
                        if (null != vd.field_f) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        vd.field_f.b((byte) 30);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (on.field_x != null) {
                            statePc = 5;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        on.field_x.a((byte) 68);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (param0 == 14676) {
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
                        if (oc.field_k == null) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        try {
                            oc.field_k.a(false);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (null != v.field_g) {
                            statePc = 14;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var1 = 0;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (var1 >= v.field_g.length) {
                            statePc = 22;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if (null != v.field_g[var1]) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        var1++;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 19: {
                        try {
                            v.field_g[var1].a(false);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var1++;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 21: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 22: {
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

    final static void c(int param0) {
        int var2 = BrickABrac.field_J ? 1 : 0;
        if (!m.a(param0 ^ 27146)) {
            if (null != ua.field_d) {
                if (ua.field_d.field_e) {
                    nc.b(109);
                    wo.field_b.a(-80, (oc) (Object) new ek(wo.field_b, ch.field_a));
                }
            }
            return;
        }
        boolean discarded$10 = wo.field_b.a(rj.field_b, fh.field_g, param0 + -27268, true);
        if (param0 != 27144) {
            return;
        }
        wo.field_b.i(82);
        while (jl.a((byte) 5)) {
            boolean discarded$11 = wo.field_b.a(go.field_b, dc.field_b, true);
        }
    }

    qc(int param0) {
        this(param0, -1);
    }

    final static String a(long param0, byte param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = BrickABrac.field_J ? 1 : 0;
        if (0L >= param0) {
            return null;
        }
        if (param0 >= 6582952005840035281L) {
            return null;
        }
        if (0L == param0 % 37L) {
            return null;
        }
        int var3 = 0;
        if (param1 != 3) {
            qc.c(21);
        }
        long var4 = param0;
        while ((var4 ^ -1L) != -1L) {
            var4 = var4 / 37L;
            var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while ((param0 ^ -1L) != -1L) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = af.field_B[(int)(var7 + -(37L * param0))];
            if (!(var9 != 95)) {
                var10 = var6.length() - 1;
                var9 = 160;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            StringBuilder discarded$0 = var6.append(var9);
        }
        StringBuilder discarded$1 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    qc(int param0, int param1) {
        ((qc) this).field_j = param1;
        ((qc) this).field_m = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = true;
        field_n = new vl();
    }
}
