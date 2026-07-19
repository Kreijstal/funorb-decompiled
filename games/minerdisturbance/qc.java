/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qc implements Iterable {
    static ea field_d;
    static int field_f;
    static bg field_a;
    al field_e;
    static boolean field_b;
    static int field_c;

    final static ea c(int param0) {
        int var5_int = 0;
        byte[] var17 = null;
        int[] var13 = null;
        int[] var11 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var8 = null;
        Object var3 = null;
        int var7 = MinerDisturbance.field_ab;
        int var1 = qk.field_b[0] * ng.field_e[0];
        byte[] var16 = db.field_b[0];
        if (param0 != 255) {
            field_c = 101;
        }
        if (!jk.field_gb[0]) {
            var8 = new int[var1];
            for (var5_int = 0; var1 > var5_int; var5_int++) {
                var8[var5_int] = af.field_p[c.a(255, (int) var16[var5_int])];
            }
            var3 = new ea(pf.field_c, wd.field_a, bg.field_d[0], oc.field_e[0], qk.field_b[0], ng.field_e[0], var8);
        } else {
            var17 = ci.field_a[0];
            var13 = new int[var1];
            var11 = var13;
            var5 = var11;
            for (var6 = 0; var6 < var1; var6++) {
                var5[var6] = hi.a(c.a(255, (int) var17[var6]) << -1930255720, af.field_p[c.a((int) var16[var6], 255)]);
            }
            var3 = new og(pf.field_c, wd.field_a, bg.field_d[0], oc.field_e[0], qk.field_b[0], ng.field_e[0], var13);
        }
        ec.a((byte) 40);
        return (ea) (var3);
    }

    final al a(int param0) {
        if (param0 != 609) {
            return (al) null;
        }
        al var2 = this.field_e.field_t;
        if (var2 == this.field_e) {
            return null;
        }
        var2.a((byte) -99);
        return var2;
    }

    final void a(byte param0, al param1) {
        al discarded$0 = null;
        try {
            if (!(null == param1.field_q)) {
                param1.a((byte) -120);
            }
            param1.field_q = this.field_e.field_q;
            param1.field_t = this.field_e;
            param1.field_q.field_t = param1;
            if (param0 != -37) {
                discarded$0 = this.a(113);
            }
            param1.field_t.field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "qc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new bc((qc) (this)));
    }

    public static void b(int param0) {
        if (param0 != 2207) {
            return;
        }
        field_d = null;
        field_a = null;
    }

    private qc() throws Throwable {
        throw new Error();
    }

    static {
        field_f = 0;
        field_a = new bg(8, 0, 4, 1);
        field_b = true;
        field_c = 65;
    }
}
