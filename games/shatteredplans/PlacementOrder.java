/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlacementOrder extends DualLinkNode {
    int field_v;
    static int field_t;
    Star field_u;
    static IntrusiveDeque field_r;
    static vd field_w;
    static Sprite field_q;
    static String[][] field_s;
    static String[] field_o;
    static Sprite[] field_p;

    public static void e(int param0) {
        field_o = null;
        if (param0 == 21758) {
          field_q = null;
          field_w = null;
          field_r = null;
          field_p = null;
          field_s = (String[][]) null;
          return;
        }
        field_q = (Sprite) null;
        field_q = null;
        field_w = null;
        field_r = null;
        field_p = null;
        field_s = (String[][]) null;
    }

    PlacementOrder(Star param0, int param1) {
        try {
          this.field_u = param0;
          this.field_v = param1;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "qa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_r = new IntrusiveDeque();
        field_o = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
