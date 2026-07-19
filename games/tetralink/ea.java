/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ea implements Iterable {
    static hl field_f;
    mc[] field_d;
    private mc field_g;
    static java.awt.Frame field_h;
    int field_i;
    static String field_c;
    static int field_e;
    static volatile int field_a;
    static int[] field_b;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != -4099) {
            return;
        }
        field_h = null;
        field_f = null;
    }

    final void a(long param0, mc param1, boolean param2) {
        mc var5 = null;
        try {
            if (null != param1.field_e) {
                param1.b(false);
            }
            if (param2) {
                this.field_g = (mc) null;
            }
            var5 = this.field_d[(int)(param0 & (long)(-1 + this.field_i))];
            param1.field_j = var5;
            param1.field_e = var5.field_e;
            param1.field_e.field_j = param1;
            param1.field_j.field_e = param1;
            param1.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ea.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final mc a(long param0, int param1) {
        mc var6 = null;
        int var7 = TetraLink.field_J;
        mc var4 = this.field_d[(int)((long)(-1 + this.field_i) & param0)];
        int var5 = -105 % ((param1 - 41) / 63);
        this.field_g = var4.field_j;
        while (var4 != this.field_g) {
            if (this.field_g.field_c == param0) {
                var6 = this.field_g;
                this.field_g = this.field_g.field_j;
                return var6;
            }
            this.field_g = this.field_g.field_j;
        }
        this.field_g = null;
        return null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new lj((ea) (this)));
    }

    ea(int param0) {
        int var2 = 0;
        mc dupTemp$0 = null;
        mc var3 = null;
        this.field_i = param0;
        this.field_d = new mc[param0];
        for (var2 = 0; var2 < param0; var2++) {
            dupTemp$0 = new mc();
            var3 = dupTemp$0;
            this.field_d[var2] = dupTemp$0;
            var3.field_j = var3;
            var3.field_e = var3;
        }
    }

    static {
        field_c = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_a = 0;
        field_b = new int[4];
    }
}
