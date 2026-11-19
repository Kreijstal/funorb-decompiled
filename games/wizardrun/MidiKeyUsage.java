/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiKeyUsage extends IntrusiveNode {
    static int field_k;
    byte[] keys;
    static String field_i;

    public static void releaseStatics(boolean param0) {
        field_i = null;
        if (param0) {
          MidiKeyUsage.releaseStatics(false);
        }
    }

    MidiKeyUsage(byte[] param0) {
        try {
          this.keys = param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "pb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Press UP or <%1> to jump.";
    }
}
