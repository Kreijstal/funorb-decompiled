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
    static int fullscreenDialogBodyLineHeight;
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
        IntArrayRequest.getFullscreenDialogWidth((byte) 91);
        field_p = null;
        gameplayScreen = null;
        field_k = null;
    }

    final static void c(int param0) {
        int var1 = -95 / ((param0 - 64) / 58);
        NineSliceFrame.a(true, false);
    }

    final static int getFullscreenDialogWidth(byte obfuscationGuard) {
        int guardCalculation = 119 % ((obfuscationGuard + 15) / 60);
        return SpaceBackground.fullscreenDialogRight - WidgetLayerBootstrap.fullscreenDialogLeft;
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
