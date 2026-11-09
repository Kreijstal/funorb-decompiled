/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SpriteState extends DualLinkNode {
    int field_z;
    static int[] noiseFadeQ12;
    int field_A;
    static String myHiscoresText;
    int field_u;
    int field_v;
    static IntrusiveDeque field_t;
    int field_x;
    int field_w;
    static int field_s;
    static ToolkitSprite[] field_B;

    final static void e(int param0) {
        String var2 = (String) null;
        wv.a((byte) 77, "", (String) null);
        if (param0 != 0) {
          myHiscoresText = (String) null;
        }
    }

    public static void releaseStatics(int param0) {
        field_t = null;
        myHiscoresText = null;
        int var1 = -35 % ((param0 + 7) / 32);
        field_B = null;
        noiseFadeQ12 = null;
    }

    SpriteState() {
    }

    static {
        int var0 = 0;
        myHiscoresText = "MY HISCORES";
        noiseFadeQ12 = new int[4096];
        for (var0 = 0; 4096 > var0; var0++) {
          noiseFadeQ12[var0] = ValidationStatus.quinticSmoothStepQ12(var0, -676121812);
        }
    }
}
