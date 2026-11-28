/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tk {
    static int field_b;
    static al field_f;
    static PcmSample[] field_c;
    static String[] field_e;
    static MeshData field_a;
    static String field_d;
    static int field_g;

    final static void a(int param0, String param1) {
        try {
          if (param0 != 13) {
            tk.clearStaticReferences(-71);
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "tk.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract we a(byte param0);

    abstract int getGroupRequestProgressPercent(int param0, boolean param1);

    abstract byte[] a(int param0, int param1);

    final static void a(byte param0, boolean param1) {
        ByteArrayPoolSupport.a(param1, true, true);
        if (param0 >= -89) {
          field_e = (String[]) null;
        }
    }

    public static void clearStaticReferences(int param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        field_f = null;
        field_e = null;
        if (param0 != 15866) {
          field_a = (MeshData) null;
        }
    }

    static {
        field_b = 0;
        field_f = new al("");
        field_c = new PcmSample[13];
        field_d = "Level";
        field_g = 0;
    }
}
