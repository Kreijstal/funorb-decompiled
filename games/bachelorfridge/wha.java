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
        return (Iterator) ((Object) new np((wha) (this)));
    }

    final void a(int param0, long param1, bw param2) {
        bw var5 = null;
        try {
            if (null != param2.field_e) {
                param2.a(false);
            }
            var5 = this.field_c[(int)(param1 & (long)(this.field_f - 1))];
            param2.field_e = var5.field_e;
            param2.field_b = var5;
            if (param0 != 0) {
                this.field_f = 63;
            }
            param2.field_e.field_b = param2;
            param2.field_c = param1;
            param2.field_b.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "wha.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final bw a(long param0, byte param1) {
        bw var5 = null;
        int var6 = BachelorFridge.field_y;
        bw var4 = this.field_c[(int)((long)(-1 + this.field_f) & param0)];
        this.field_d = var4.field_b;
        while (this.field_d != var4) {
            if ((param0 ^ -1L) == (this.field_d.field_c ^ -1L)) {
                var5 = this.field_d;
                this.field_d = this.field_d.field_b;
                return var5;
            }
            this.field_d = this.field_d.field_b;
        }
        this.field_d = null;
        if (param1 <= -100) {
            return null;
        }
        return (bw) null;
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
        bw dupTemp$0 = null;
        bw var3 = null;
        this.field_c = new bw[param0];
        this.field_f = param0;
        for (var2 = 0; var2 < param0; var2++) {
            dupTemp$0 = new bw();
            var3 = dupTemp$0;
            this.field_c[var2] = dupTemp$0;
            var3.field_e = var3;
            var3.field_b = var3;
        }
    }

    static {
        field_e = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_g = "Accept unrated rematch";
        field_b = "To Customer Support";
    }
}
