/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GradientFrame extends NineSliceFrame {
    private int[] field_g;
    private int field_i;
    private int field_l;
    static String field_k;
    private boolean field_j;
    static boolean[] field_n;
    static int field_m;
    static int field_h;

    final void drawFrame(byte obfuscationGuard, int height, int x, int width, int y) {
        GradientUiRenderer.drawGradientFrame(x, y, width, height, this.frameSprites, this.field_g, this.field_i, this.field_l, this.field_j);
        if (obfuscationGuard != -111) {
          this.field_l = -40;
        }
    }

    GradientFrame(RgbSprite[] param0, int[] param1, int param2, int param3, boolean param4) {
        super(param0);
        try {
          this.field_j = param4 ? true : false;
          this.field_g = param1;
          this.field_l = param3;
          this.field_i = param2;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void releaseStatics(byte obfuscationGuard) {
        field_k = null;
        field_n = null;
        if (obfuscationGuard != -90) {
          field_n = (boolean[]) null;
        }
    }

    static {
        field_k = "Replay Mission";
        field_n = new boolean[]{false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, true, true, true, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true};
        field_h = 0;
    }
}
