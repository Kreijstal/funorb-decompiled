/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QueuedListRequest extends IntrusiveNode {
    int field_t;
    int field_s;
    static IntrusiveDeque field_z;
    boolean field_u;
    static UiComponent field_A;
    static Archive field_v;
    int field_q;
    String[][] field_p;
    static String field_w;
    int field_o;
    static ScrollPane field_x;
    int field_B;
    static int field_r;
    int[][] field_y;
    int field_n;

    final static void decreaseSoundVolume(int param0) {
        int var1 = -74 / ((param0 + 57) / 45);
        if (32 >= DelegatingCanvas.field_c) {
          StatefulWidgetRenderer.setSoundEffectVolume(0, 128);
          return;
        }
        int var2 = DelegatingCanvas.field_c % 32;
        if (var2 == 0) {
          var2 = 32;
        }
        StatefulWidgetRenderer.setSoundEffectVolume(DelegatingCanvas.field_c - var2, 128);
    }

    public static void releaseStatics(byte param0) {
        int var1 = 8 % ((param0 + 24) / 61);
        field_A = null;
        field_x = null;
        field_w = null;
        field_z = null;
        field_v = null;
    }

    QueuedListRequest() {
    }

    static {
        field_w = "Loading extra data";
    }
}
