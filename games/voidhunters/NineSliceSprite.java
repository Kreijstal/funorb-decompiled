/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NineSliceSprite {
    static IntrusiveDeque rasterStateStack;
    private Sprite[] slices;
    static String field_a;

    public static void clearSharedReferences(int param0) {
        field_a = null;
        rasterStateStack = null;
        if (param0 != -22113) {
          NineSliceSprite.clearSharedReferences(70);
        }
    }

    final void draw(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = 48 / ((param0 + 8) / 58);
        NanosecondClock.drawNineSlice(3, param4, param2, param3, this.slices, param1);
    }

    NineSliceSprite(Sprite[] param0) {
        try {
          this.slices = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        rasterStateStack = new IntrusiveDeque();
        field_a = "Plasma ball";
    }
}
