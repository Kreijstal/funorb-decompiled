/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends RendererBitmapFont implements e {
    long field_nativeid;

    final native void drawGlyph(char glyph, int x, int y, int color, boolean shadowPass);

    n(oa param0, ya param1, BitmapFontMetrics param2, SpriteData[] param3, RenderSprite[] param4) {
        super(param0, param2);
        int var11 = 0;
        byte[][] var6 = new byte[param3.length][];
        int[] var7 = new int[param3.length];
        int[] var8 = new int[param3.length];
        int[] var9 = new int[param3.length];
        int[] var10 = new int[param3.length];
        for (var11 = 0; var11 < param3.length; var11++) {
          var6[var11] = param3[var11].indices;
          var7[var11] = param3[var11].width;
          var8[var11] = param3[var11].height;
          var9[var11] = param3[var11].padLeft;
          var10[var11] = param3[var11].padTop;
        }
        this.S(param0, param1, var6, param3[0].palette, var7, var8, var9, var10);
    }

    private final native void PA(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7);

    final void drawGlyphWithMask(char glyph, int x, int y, int color, boolean shadowPass, aa mask, int maskX, int maskY) {
        this.PA(glyph, x, y, color, shadowPass, mask, maskX, maskY);
    }

    private final native void S(oa param0, ya param1, byte[][] param2, int[] param3, int[] param4, int[] param5, int[] param6, int[] param7);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          vk.a((e) (this), 80);
        }
    }

    public final native void w(boolean param0);
}
