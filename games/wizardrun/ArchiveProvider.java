/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ArchiveProvider {
    static Calendar field_c;
    static int field_a;
    static RasterBuffer field_b;
    private static String field_z;

    abstract int a(boolean param0, int param1);

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          ArchiveProvider.releaseStatics(false);
          field_c = null;
          field_b = null;
          return;
        }
        field_c = null;
        field_b = null;
    }

    abstract Js5Index b(boolean param0);

    abstract byte[] a(byte param0, int param1);

    static {
        field_z = "hl.L(";
        field_c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
