/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class hl {
    static Calendar field_c;
    static int field_a;
    static df field_b;
    private static String field_z;

    abstract int a(boolean param0, int param1);

    public static void a(boolean param0) {
        if (!param0) {
            hl.a(false);
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    abstract pc b(boolean param0);

    abstract byte[] a(byte param0, int param1);

    static {
        field_z = "hl.L(";
        field_c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
