/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlVertexDeclaration extends GpuVertexDeclaration {
    VertexStreamLayout[] streams;
    static int[] field_b;
    static String field_e;
    static int field_c;
    static String field_g;
    static boolean field_d;

    public static void clearSharedReferences(int param0) {
        if (param0 != 23008) {
          return;
        }
        field_b = null;
        field_g = null;
        field_e = null;
    }

    OpenGlVertexDeclaration(VertexStreamLayout[] param0) {
        try {
          this.streams = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "bva.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 0;
        field_g = "You have <%0> unread messages!";
        field_b = new int[8192];
        field_d = false;
        field_e = "Unpacking sound effects";
    }
}
