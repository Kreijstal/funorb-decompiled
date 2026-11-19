/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends IntrusiveNode {
    int field_m;
    static boolean field_k;
    boolean field_j;
    static PlatformTaskDispatcher field_s;
    static Sprite field_t;
    int field_n;
    static va field_q;
    static vn field_p;
    int field_i;
    int field_l;
    static String field_o;
    static int[] field_r;

    final static void a(int param0, ih param1, byte param2) {
        try {
          io.field_c.addLast((byte) -105, param1);
          NanoTickClock.a(1, param0, param1);
          if (param2 != -79) {
            na.clearSharedReferences(54);
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "na.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_r = null;
        field_t = null;
        field_o = null;
        field_q = null;
        field_s = null;
        field_p = null;
        if (param0 >= -70) {
          field_q = (va) null;
        }
    }

    na(int param0, int param1, int param2, int param3, Sprite param4) {
        try {
          this.field_l = param0;
          this.field_j = false;
          this.field_i = param3;
          this.field_n = param1;
          this.field_m = param2;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "na.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = false;
        field_o = "Creating your account";
        field_r = new int[128];
    }
}
