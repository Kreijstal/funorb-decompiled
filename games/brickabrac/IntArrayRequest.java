/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntArrayRequest extends IntrusiveNode {
    static String field_p;
    static boolean field_i;
    static int field_u;
    static GameplayScreen gameplayScreen;
    static boolean[] heldKeys;
    static int field_t;
    static int field_q;
    static int field_s;
    static int lastBackgroundId;
    int requestId;
    static RgbSprite[] field_k;
    int[] values;
    static int field_j;
    static int field_r;
    boolean complete;

    public static void a(int param0) {
        heldKeys = null;
        if (param0 == 112) {
          field_p = null;
          gameplayScreen = null;
          field_k = null;
          return;
        }
        IntArrayRequest.a((byte) 91);
        field_p = null;
        gameplayScreen = null;
        field_k = null;
    }

    final static void c(int param0) {
        int var1 = -95 / ((param0 - 64) / 58);
        NineSliceFrame.a(true, false);
    }

    final static int a(byte param0) {
        int var1 = 119 % ((param0 + 15) / 60);
        return SpaceBackground.field_u - np.field_b;
    }

    IntArrayRequest() {
    }

    static {
        heldKeys = new boolean[112];
        field_i = true;
        lastBackgroundId = 0;
        field_q = 4;
        field_p = "Full";
    }
}
