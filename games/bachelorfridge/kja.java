/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kja {
    int field_a;
    static kv field_e;
    int field_c;
    int field_b;
    int field_d;

    final static void a(int param0, int param1, byte param2, boolean param3) {
        wg.a(param3, -90);
        if (param2 > -9) {
          field_e = (kv) null;
          vla.a(5, param1, param0, param3);
          return;
        } else {
          vla.a(5, param1, param0, param3);
          return;
        }
    }

    final static sna a(byte param0) {
        if (param0 != 20) {
            kja.a(-25, 95, (byte) 51, true);
            return ak.field_q.field_vb;
        }
        return ak.field_q.field_vb;
    }

    public static void b(int param0) {
        if (param0 != 1900) {
            field_e = (kv) null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static int a(int param0) {
        if (param0 != 27168) {
          field_e = (kv) null;
          return new Date().getYear() + 1900;
        } else {
          return new Date().getYear() + 1900;
        }
    }

    final static void a(int param0, byte param1, ne param2) {
        pf var3 = null;
        try {
            if (param1 < 1) {
                ne var4 = (ne) null;
                kja.a(80, (byte) 81, (ne) null);
            }
            var3 = sja.field_fb;
            var3.c(param0, (byte) 108);
            var3.d(param2.field_o, 0);
            var3.d(param2.field_i, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "kja.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
