/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hp extends OutputStream {
    static llb field_b;
    private StringBuilder field_a;

    public final void write(int param0) {
        StringBuilder discarded$0 = ((hp) this).field_a.append((char)param0);
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4) {
        tra.field_o.a(5, -6, 640, 0, param1);
        if (null != fkb.field_m) {
          fkb.field_m.a(12, param1, -ejb.field_p + param2, param2, param1, param4);
          int discarded$8 = -22;
          int discarded$9 = -103;
          hp.a(-122, 15, -4, false, -81);
          return;
        } else {
          int discarded$10 = -22;
          int discarded$11 = -103;
          hp.a(-122, 15, -4, false, -81);
          return;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            hp.a(true);
        }
    }

    hp(StringBuilder param0) {
        try {
            ((hp) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "hp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
