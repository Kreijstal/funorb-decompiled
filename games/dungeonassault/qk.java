/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static String[] field_b;
    private cn[] field_a;
    static String field_c;
    static boolean[] field_e;
    static String field_d;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 112) {
          field_e = (boolean[]) null;
          sn.a(-87, param1, this.field_a, param4, param0, param2);
          return;
        } else {
          sn.a(-87, param1, this.field_a, param4, param0, param2);
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 <= 120) {
            return;
        }
        field_e = null;
        field_d = null;
        field_b = null;
        field_c = null;
    }

    qk(cn[] param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "qk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Waiting for graphics";
        field_e = new boolean[112];
        field_b = new String[]{"More raiders...", "...more defenders...", "...wreak havock on your enemies...", "...and send your friends running."};
        field_d = "Attack";
    }
}
