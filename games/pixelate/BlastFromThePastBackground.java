/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BlastFromThePastBackground extends BackgroundScene {
    static int[][] field_p;
    static SceneWidget field_n;
    static String[] field_m;
    private RetroBlock[] field_o;

    final void tick(int param0) {
        int var3 = 0;
        RetroBlock var4 = null;
        int var5 = Pixelate.field_H ? 1 : 0;
        super.tick(param0);
        RetroBlock[] var6 = this.field_o;
        RetroBlock[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          var4.tick(148);
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 <= 17) {
          field_n = (SceneWidget) null;
        }
        field_n = null;
        field_m = null;
        field_p = (int[][]) null;
    }

    BlastFromThePastBackground(String param0, Sprite[] param1) {
        super(param0, param1);
        try {
          this.createBlocks((byte) 97);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "wc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void render(boolean param0) {
        int var3 = 0;
        RetroBlock var4 = null;
        int var5 = Pixelate.field_H ? 1 : 0;
        ThreeSliceButtonPainter.field_w.drawOpaque(0, 0);
        RetroBlock[] var6 = this.field_o;
        RetroBlock[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          var4.draw(73);
        }
        if (param0) {
          BlastFromThePastBackground.releaseStatics((byte) 76);
        }
    }

    final static String getAccountStatusText(int param0) {
        if (param0 != 0) {
          field_n = (SceneWidget) null;
        }
        if (Js5NetworkRequest.field_F == MarkerSlider.field_X) {
          return nk.field_b;
        }
        if (!an.field_e.isComplete(param0 ^ 46)) {
          return an.field_e.getMessage((byte) 114);
        }
        if (Js5NetworkRequest.field_F == MatchingTextValidator.field_n) {
          return an.field_e.getMessage((byte) 116);
        }
        return Checkbox.field_U;
    }

    private final void createBlocks(byte param0) {
        this.field_o = new RetroBlock[2];
        if (param0 < 91) {
          this.tick(-106);
        }
        this.field_o[0] = new RetroBlock(0);
        this.field_o[1] = new RetroBlock(7);
    }

    static {
        field_m = new String[8];
    }
}
