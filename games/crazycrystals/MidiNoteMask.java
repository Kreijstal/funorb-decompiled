/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiNoteMask extends IntrusiveNode {
    static boolean field_h;
    byte[] field_g;
    static ra field_f;

    MidiNoteMask(byte[] param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "dm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearDeclaredStaticReferences(int param0) {
        if (param0 != 14226) {
          return;
        }
        field_f = null;
    }

    static {
    }
}
