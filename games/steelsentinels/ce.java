/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends IntrusiveNode {
    static int[] field_t;
    static SceneWidget field_o;
    static int field_r;
    static RgbSprite[] field_v;
    byte[] field_s;
    static IndexedSprite[] field_q;
    static volatile boolean field_w;
    static String field_u;
    static RgbSprite field_p;

    ce(byte[] param0) {
        try {
          this.field_s = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ce.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_v = null;
        field_t = null;
        field_o = null;
        if (param0 == 77) {
          field_p = null;
          field_q = null;
          field_u = null;
          return;
        }
        field_o = (SceneWidget) null;
        field_p = null;
        field_q = null;
        field_u = null;
    }

    static {
        field_t = jg.a(true);
        field_u = "Please enter a year between <%0> and <%1>";
        field_w = false;
    }
}
