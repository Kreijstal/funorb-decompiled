/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OptionsScreen extends FramedMenuScreen {
    static int field_x;
    static UiComponent field_u;
    static int resultCounterOne;
    static StringBuilder field_A;
    static String field_w;
    static IntArrayRequest[] progressRequests;
    static UiComponent field_v;
    static RgbSprite desertFarSprite;

    final static RgbSprite a(int param0, int param1, String param2, boolean param3) {
        int var11 = 0;
        int var12 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RgbSprite var6 = null;
        RgbSprite var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var13 = 0;
        RgbSprite stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          var4_int = ma.field_O.measureText(param2) + 2;
          var5 = ma.field_O.baselineHeight;
          var6 = new RgbSprite(var4_int, var5);
          var6.bindRasterTarget();
          ma.field_O.drawCentered(param2, var4_int / param0, 2 + ma.field_O.ascent, 0, -1);
          BallPulseEffect.framebuffer.bindRaster((byte) 124);
          var7 = new RgbSprite(var4_int * param1, var5 * param1);
          var7.bindRasterTarget();
          var6.a(0, 0, param1 * var4_int, param1 * var5);
          DualLinkDeque.a(var5 * param1, 0, param1 * var4_int, param0 ^ 2, 0);
          BallPulseEffect.framebuffer.bindRaster((byte) 126);
          if (param3) {
            var8 = var7.width;
            var9 = 2 + ma.field_O.capHeight * param1;
            var10 = new int[var8 * var9];
            for (var11 = 0; var9 > var11; var11++) {
              for (var12 = 0; var12 < var8; var12++) {
                var10[var8 * var11 + var12] = var7.pixels[(var11 + var7.height - var9) * var7.width + (0 + var12)];
              }
            }
            var7.pixels = var10;
            var7.offsetY = var7.offsetY + var9 / 2;
            var7.offsetX = var7.offsetX + 0;
            var7.width = var8;
            var7.height = var9;
          }
          stackIn_11_0 = var7;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("fp.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int choosePopupX(int obfuscationGuard, int popupWidth, int anchorX, int anchorWidth) {
        if (Rasterizer2D.width >= anchorX + popupWidth) {
          return anchorX;
        }
        if (obfuscationGuard >= ~(-popupWidth + (anchorX + anchorWidth))) {
          return anchorX + anchorWidth - popupWidth;
        }
        return Rasterizer2D.width - popupWidth;
    }

    OptionsScreen() {
        super(14, 180, 460, 155, 35, be.field_o);
    }

    final void drawScreen(byte obfuscationGuard) {
        super.drawScreen((byte) -119);
        if (obfuscationGuard > -14) {
          return;
        }
        AchievementMaskRequest.a(this.screenId, 19);
        this.drawMenuFrame(68);
        this.a(0);
    }

    public static void c(boolean param0) {
        desertFarSprite = null;
        field_u = null;
        progressRequests = null;
        field_v = null;
        if (param0) {
          return;
        }
        field_A = null;
        field_w = null;
    }

    static {
        field_w = "This game has started.";
        progressRequests = null;
        field_A = new StringBuilder(80);
    }
}
