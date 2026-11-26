/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeMonochromeBitmapFont extends RendererBitmapFont implements NativeResource {
    long field_nativeid;

    final native void drawGlyph(char glyph, int x, int y, int color, boolean shadowPass);

    NativeMonochromeBitmapFont(NativeSoftwareRenderer param0, ya param1, BitmapFontMetrics param2, SpriteData[] param3, RenderSprite[] param4) {
        super(param0, param2);
        byte[][] var6 = new byte[param3.length][];
        int[] var7 = new int[param3.length];
        int[] var8 = new int[param3.length];
        int[] var9 = new int[param3.length];
        int[] var10 = new int[param3.length];
        for (int var11 = 0; var11 < param3.length; var11++) {
          var6[var11] = param3[var11].indices;
          var7[var11] = param3[var11].width;
          var8[var11] = param3[var11].height;
          var9[var11] = param3[var11].padLeft;
          var10[var11] = param3[var11].padTop;
        }
        this.initializeNative(param0, param1, var6, var7, var8, var9, var10);
    }

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceDisposer.disposeOrEnqueue((NativeResource) (this), 36);
        }
    }

    public final native void dispose(boolean param0);

    private final native void initializeNative(NativeSoftwareRenderer param0, ya param1, byte[][] param2, int[] param3, int[] param4, int[] param5, int[] param6);

    final void drawGlyphWithMask(char glyph, int x, int y, int color, boolean shadowPass, GlyphMask mask, int maskX, int maskY) {
        this.drawGlyphWithMaskNative(glyph, x, y, color, shadowPass, mask, maskX, maskY);
    }

    private final native void drawGlyphWithMaskNative(char param0, int param1, int param2, int param3, boolean param4, GlyphMask param5, int param6, int param7);
}
