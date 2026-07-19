/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class un {
    static tp[] field_e;
    static int field_a;
    static String field_h;
    static String[] field_c;
    static jp field_d;
    static long field_g;
    static boolean field_f;
    static th field_b;

    public static void a(boolean param0) {
        field_b = null;
        field_h = null;
        if (param0) {
          un.a(true);
          field_d = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    final static int a(int param0) {
        if (param0 != 1) {
          un.a(false);
          return 1900 + new Date().getYear();
        } else {
          return 1900 + new Date().getYear();
        }
    }

    final static void a(byte param0, wq param1) {
        int var2_int = 0;
        try {
            vh.field_U = param1.i(65280) << -1093759739;
            var2_int = param1.l(255);
            fh.field_c = 1835008 & var2_int << 1232216530;
            int var3 = -32 % ((param0 - -69) / 37);
            vh.field_U = vh.field_U + (var2_int >> -698822653);
            fh.field_c = fh.field_c + (param1.i(65280) << -1896671006);
            var2_int = param1.l(255);
            sf.field_Z = 2064384 & var2_int << 1485979023;
            fh.field_c = fh.field_c + (var2_int >> 1281514982);
            sf.field_Z = sf.field_Z + (param1.l(255) << 527496135);
            var2_int = param1.l(255);
            sf.field_Z = sf.field_Z + (var2_int >> 1761990561);
            vj.field_c = 65536 & var2_int << -1447884240;
            vj.field_c = vj.field_c + param1.i(65280);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "un.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_h = "Chat view has been scrolled up. Scroll down to chat.";
        field_b = new th(0, 2, 2, 1);
    }
}
