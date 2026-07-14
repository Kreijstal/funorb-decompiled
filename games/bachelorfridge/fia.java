/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fia extends bca {
    static int field_q;
    static byte[] field_r;
    static int field_t;
    static String field_s;

    fia(lu param0) {
        super(param0);
        ((fia) this).field_k = param0.e((byte) 87);
        ((fia) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (var2 < 0) {
                break;
            }
            ((fia) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    final static void c(int param0, int param1) {
        cq discarded$0 = ol.a(pja.field_a[param1][param0 + kla.a(3, m.field_a, -2147483648)], true);
    }

    fia(int param0, nq param1) {
        super(param0, param1);
    }

    public static void c(boolean param0) {
        if (param0) {
            return;
        }
        field_s = null;
        field_r = null;
    }

    final void a(op param0, int param1) {
        int var3 = -91 / ((param1 - 12) / 35);
        ((fia) this).a(param0, (byte) -2);
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            field_t = -44;
            return (at) (Object) new jw(param1, (fia) this);
        }
        return (at) (Object) new jw(param1, (fia) this);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 0;
        field_t = 0;
    }
}
