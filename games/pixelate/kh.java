/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    static ak field_a;
    static int[] field_c;
    static String field_b;

    final static void a(boolean param0, String param1) {
        try {
            if (param0) {
                field_a = (ak) null;
            }
            sc.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "kh.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        String var2 = null;
        field_a = null;
        field_c = null;
        if (param0 != 21601) {
          var2 = (String) null;
          kh.a(false, (String) null);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    static {
        field_c = new int[8192];
        field_b = "Rank";
    }
}
