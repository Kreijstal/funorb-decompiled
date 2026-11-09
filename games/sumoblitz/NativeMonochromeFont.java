/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeMonochromeFont extends ToolkitFont implements NativeResource {
    long field_nativeid;

    private final native void nativeDrawMaskedGlyph(char param0, int param1, int param2, int param3, boolean param4, SpriteMask param5, int param6, int param7);

    final native void drawGlyph(char param0, int param1, int param2, int param3, boolean param4);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeResourceReaper.deferDisposal((NativeResource) (this), (byte) -37);
        }
    }

    public final native void disposeNativeResource(boolean param0);

    final void drawMaskedGlyph(char param0, int param1, int param2, int param3, boolean param4, SpriteMask param5, int param6, int param7) {
        this.nativeDrawMaskedGlyph(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    NativeMonochromeFont(NativeSoftwareGraphicsToolkit param0, NativeGraphicsHeap param1, FontMetrics param2, SpriteData[] param3, ToolkitSprite[] param4) {
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
          var9[var11] = param3[var11].leftInset;
          var10[var11] = param3[var11].topInset;
        }
        this.nativeInitialize(param0, param1, var6, var7, var8, var9, var10);
    }

    private final native void nativeInitialize(NativeSoftwareGraphicsToolkit toolkit, NativeGraphicsHeap heap, byte[][] glyphs, int[] widths, int[] heights, int[] leftInsets, int[] topInsets);
}
