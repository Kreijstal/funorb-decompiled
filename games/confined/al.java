/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class al {
    static java.util.zip.CRC32 field_e;
    private String field_f;
    static String field_a;
    static String field_b;
    static int field_d;
    static String field_c;

    final void a(java.applet.Applet param0, byte param1) {
        kn.a(126, param0, 31536000L, ((al) this).field_f, "jagex-last-login-method");
        if (param1 != 49) {
            field_e = null;
        }
    }

    final boolean a(String param0, int param1) {
        if (param1 != -5851) {
            field_a = null;
            return ((al) this).field_f.equals((Object) (Object) param0);
        }
        return ((al) this).field_f.equals((Object) (Object) param0);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(byte param0) {
        int var1 = -81 % ((21 - param0) / 63);
        if (sa.field_R) {
            return null;
        }
        if (kc.field_t > hm.field_qb) {
            return null;
        }
        if (!(hm.field_qb >= kc.field_t - -hm.field_nb)) {
            return vf.field_o;
        }
        return null;
    }

    al(String param0) {
        ((al) this).field_f = param0;
    }

    public static void b(byte param0) {
        field_e = null;
        if (param0 <= 9) {
          field_e = null;
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Good old-fashioned physical#explosives, these missiles can#add an edge to your attack.";
        field_a = "Yes";
        field_e = new java.util.zip.CRC32();
        field_c = "Quit to website";
    }
}
