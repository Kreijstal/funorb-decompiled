/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hf {
    static int field_a;
    static String[] field_b;
    static String field_c;

    abstract e a(boolean param0);

    public static void clearDeclaredStaticReferences(int param0) {
        field_c = null;
        if (param0 != -15927) {
          hf.clearDeclaredStaticReferences(25);
          field_b = null;
          return;
        }
        field_b = null;
    }

    abstract int getGroupRequestProgressPercent(int param0, int param1);

    abstract byte[] a(int param0, boolean param1);

    final static void a(String param0, byte param1) {
        try {
          if (param1 < 107) {
            hf.clearDeclaredStaticReferences(-22);
          }
        } catch (RuntimeException runtimeException) {
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) runtimeException), "hf.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
