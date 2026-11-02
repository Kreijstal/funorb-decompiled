/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveProvider {
    static int field_b;
    static String field_d;
    static IntrusiveDeque field_c;
    static String field_a;

    abstract ArchiveIndex a(byte param0);

    public static void a(int param0) {
        field_a = null;
        if (param0 != -7672) {
          ArchiveProvider.a(119);
          field_d = null;
          field_c = null;
          return;
        }
        field_d = null;
        field_c = null;
    }

    abstract byte[] a(int param0, int param1);

    abstract int a(byte param0, int param1);

    final static void a(Sprite param0, int param1) {
        try {
          ti.a((byte) 126);
          SoftwareRasterizer.a(param0.field_D, param0.field_x, param0.field_A);
          if (param1 < 124) {
            ArchiveProvider.a(-15);
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "vb.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_d = "Create a free account to start using this feature";
        field_c = new IntrusiveDeque();
        field_a = "Connection lost - attempting to reconnect";
    }
}
