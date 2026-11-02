/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static fr field_c;
    static boolean field_d;
    static long field_b;
    static int field_a;

    public static void a(byte param0) {
        if (param0 != 62) {
          return;
        }
        field_c = null;
    }

    final static void a(int param0) {
        OpenGlRenderbuffer.field_r = false;
        cn.field_z = null;
        JaggrabDownloader.field_b = null;
        NetworkArchiveRequest.field_v = null;
        if (param0 == 14183) {
          SecondaryKeyHashTable.field_a = null;
          return;
        }
        field_d = false;
        SecondaryKeyHashTable.field_a = null;
    }

    static {
        field_b = 20000000L;
    }
}
