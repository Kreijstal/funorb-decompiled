/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSoftwareMonoFont extends ToolkitFont implements NativeResource {
    long field_nativeid;

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
          NativeDisposalQueue.enqueue(0, (NativeResource) (this));
        }
    }

    private final native void initializeNative(NativeSoftwareToolkit param0, NativeSoftwareHeap param1, byte[][] param2, int[] param3, int[] param4, int[] param5, int[] param6);

    final native void drawGlyph(char param0, int param1, int param2, int param3, boolean param4);

    NativeSoftwareMonoFont(NativeSoftwareToolkit param0, NativeSoftwareHeap param1, ToolkitFontMetrics param2, IndexedSpriteData[] param3, ToolkitSprite[] param4) {
        super(param0, param2);
        int var11 = 0;
        byte[][] var6 = new byte[param3.length][];
        int[] var7 = new int[param3.length];
        int[] var8 = new int[param3.length];
        int[] var9 = new int[param3.length];
        int[] var10 = new int[param3.length];
        for (var11 = 0; var11 < param3.length; var11++) {
          var6[var11] = param3[var11].field_h;
          var7[var11] = param3[var11].field_f;
          var8[var11] = param3[var11].field_e;
          var9[var11] = param3[var11].field_c;
          var10[var11] = param3[var11].field_g;
        }
        this.initializeNative(param0, param1, var6, var7, var8, var9, var10);
    }

    final void drawGlyphMasked(char param0, int param1, int param2, int param3, boolean param4, GlyphMask param5, int param6, int param7) {
        this.drawGlyphMaskedNative(param0, param1, param2, param3, param4, param5, param6, param7);
    }

    private final native void drawGlyphMaskedNative(char param0, int param1, int param2, int param3, boolean param4, GlyphMask param5, int param6, int param7);

    public final native void disposeNative(boolean param0);
}
