/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wha implements Iterable {
    static String field_e;
    static vr field_a;
    static String field_g;
    int field_f;
    private bw field_d;
    static String field_b;
    bw[] field_c;

    public final Iterator iterator() {
        return (Iterator) (Object) new np((wha) this);
    }

    final void a(int param0, long param1, bw param2) {
        bw var6 = null;
        bw var5 = null;
        if (null != param2.field_e) {
            param2.a(false);
            var6 = ((wha) this).field_c[(int)(param1 & (long)(((wha) this).field_f - 1))];
            var5 = var6;
            param2.field_e = var6.field_e;
            param2.field_b = var5;
            if (param0 == 0) {
                param2.field_e.field_b = param2;
                param2.field_c = param1;
                param2.field_b.field_e = param2;
                return;
            }
            ((wha) this).field_f = 63;
            param2.field_e.field_b = param2;
            param2.field_c = param1;
            param2.field_b.field_e = param2;
            return;
        }
        bw var7 = ((wha) this).field_c[(int)(param1 & (long)(((wha) this).field_f - 1))];
        var5 = var7;
        param2.field_e = var7.field_e;
        param2.field_b = var5;
        if (param0 != 0) {
            ((wha) this).field_f = 63;
            param2.field_e.field_b = param2;
            param2.field_c = param1;
            param2.field_b.field_e = param2;
            return;
        }
        param2.field_e.field_b = param2;
        param2.field_c = param1;
        param2.field_b.field_e = param2;
    }

    final bw a(long param0, byte param1) {
        bw var5 = null;
        int var6 = BachelorFridge.field_y;
        bw var4 = ((wha) this).field_c[(int)((long)(-1 + ((wha) this).field_f) & param0)];
        ((wha) this).field_d = var4.field_b;
        while (((wha) this).field_d != var4) {
            if ((param0 ^ -1L) == (((wha) this).field_d.field_c ^ -1L)) {
                var5 = ((wha) this).field_d;
                ((wha) this).field_d = ((wha) this).field_d.field_b;
                return var5;
            }
            ((wha) this).field_d = ((wha) this).field_d.field_b;
        }
        ((wha) this).field_d = null;
        if (param1 <= -100) {
            return null;
        }
        return null;
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != -1) {
            wha.a(-48);
            field_a = null;
            field_e = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_e = null;
        field_b = null;
    }

    wha(int param0) {
        int var2 = 0;
        bw var3 = null;
        ((wha) this).field_c = new bw[param0];
        ((wha) this).field_f = param0;
        for (var2 = 0; var2 < param0; var2++) {
            var3 = new bw();
            ((wha) this).field_c[var2] = new bw();
            var3.field_e = var3;
            var3.field_b = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_g = "Accept unrated rematch";
        field_b = "To Customer Support";
    }
}
