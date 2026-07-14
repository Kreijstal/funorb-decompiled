/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vi implements Iterable {
    int field_c;
    private wf field_f;
    wf[] field_d;
    static StringBuilder[] field_g;
    static int[] field_a;
    static String field_i;
    static String field_b;
    static boolean field_h;
    static vd field_e;

    final wf a(int param0, long param1) {
        wf var5 = null;
        int var6 = Transmogrify.field_A ? 1 : 0;
        wf var4 = ((vi) this).field_d[(int)((long)(param0 + ((vi) this).field_c) & param1)];
        ((vi) this).field_f = var4.field_b;
        while (var4 != ((vi) this).field_f) {
            if (!(((vi) this).field_f.field_c != param1)) {
                var5 = ((vi) this).field_f;
                ((vi) this).field_f = ((vi) this).field_f.field_b;
                return var5;
            }
            ((vi) this).field_f = ((vi) this).field_f.field_b;
        }
        ((vi) this).field_f = null;
        return null;
    }

    final void a(wf param0, byte param1, long param2) {
        if (param0.field_f != null) {
            param0.c(5);
        }
        wf var5 = ((vi) this).field_d[(int)((long)(-1 + ((vi) this).field_c) & param2)];
        param0.field_f = var5.field_f;
        param0.field_b = var5;
        param0.field_f.field_b = param0;
        if (param1 < 60) {
            Object var6 = null;
            String[] discarded$0 = vi.a('X', (String) null, -67);
        }
        param0.field_b.field_f = param0;
        param0.field_c = param2;
    }

    final static String[] a(char param0, String param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = Transmogrify.field_A ? 1 : 0;
        CharSequence var10 = (CharSequence) (Object) param1;
        int var3 = lj.a(param2 ^ 126, param0, var10);
        String[] var4 = new String[1 + var3];
        int var5 = param2;
        int var6 = 0;
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param0 != param1.charAt(var8); var8++) {
            }
            var5++;
            var4[var5] = param1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = param1.substring(var6);
        return var4;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new w((vi) this);
    }

    private vi() throws Throwable {
        throw new Error();
    }

    final static void a(byte param0) {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = 102 / ((param0 - 31) / 59);
                    var2 = (Object) (Object) hi.field_e;
                    // monitorenter hi.field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        b.field_k = cg.field_k;
                        gj.field_l = gj.field_l + 1;
                        oa.field_j = fc.field_g;
                        bk.field_a = uj.field_i;
                        tl.field_a = li.field_j;
                        li.field_j = false;
                        tg.field_d = ad.field_b;
                        ol.field_b = dh.field_w;
                        nk.field_c = ga.field_b;
                        ad.field_b = 0;
                        // monitorexit var2
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = caughtException;
                        // monitorexit var2
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var3;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_g = null;
        field_i = null;
        field_a = null;
        if (param0 < 33) {
            vi.a(103);
        }
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_g = new StringBuilder[10];
        for (var0 = 0; field_g.length > var0; var0++) {
            field_g[var0] = new StringBuilder(12);
        }
        field_a = new int[field_g.length];
        field_i = "Creating your account";
        field_b = "Visit the Account Management section on the main site to view.";
    }
}
