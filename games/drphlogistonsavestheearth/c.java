/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static he[] field_a;

    public static void clearStaticReferences(byte param0) {
        if (param0 != -58) {
          return;
        }
        field_a = null;
    }

    final static void a(boolean param0, ResourceArchive param1) {
        tk var2 = null;
        tk.b(param1.getFileByName("headers.packvorbis", "", 24874));
        if (param0) {
          return;
        }
        try {
          var2 = tk.a(param1, "jagex logo2.packvorbis", "");
          var2.c();
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "c.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new he[5];
    }
}
