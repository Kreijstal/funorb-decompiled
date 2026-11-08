/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextHighlightSpan extends IntrusiveNode {
    int field_x;
    int field_r;
    int field_w;
    int field_s;
    static int field_z;
    static AccountServerResult field_n;
    static volatile int field_y;
    static ModelData field_q;
    int field_o;
    static int field_p;
    TextHighlightSpan field_v;
    static String field_t;
    static boolean field_u;

    final static int getFramesPerSecond(int param0) {
        if (param0 != -1) {
          TextHighlightSpan.getFramesPerSecond(56);
          return (int)(1000000000L / CacheEntry.field_B);
        }
        return (int)(1000000000L / CacheEntry.field_B);
    }

    public static void releaseStatics(byte param0) {
        field_n = null;
        field_t = null;
        if (param0 != 44) {
          field_n = (AccountServerResult) null;
          field_q = null;
          return;
        }
        field_q = null;
    }

    TextHighlightSpan(int param0, int param1, int param2, int param3, int param4) {
        this.field_o = param1;
        this.field_s = param2;
        this.field_x = param4;
        this.field_w = param0;
        this.field_r = param3;
    }

    static {
        field_y = -1;
        field_u = false;
        field_t = "Loading sound effects";
    }
}
