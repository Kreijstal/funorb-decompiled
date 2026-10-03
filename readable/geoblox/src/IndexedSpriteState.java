/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class IndexedSpriteState {
    static int avatarShockFrameIndex;
    int fullWidth;
    int trimX;
    int width;
    int fullHeight;
    int height;
    int trimY;

    abstract void drawAlpha(int x, int y, int alpha256);

    abstract void draw(int x, int y);

    private final static IndexedSprite a(int param0, int[] param1, IndexedSprite param2) {
        IndexedSprite var3 = null;
        RuntimeException var3_ref = null;
        IndexedSprite stackIn_2_0 = null;
        IndexedSprite stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new IndexedSprite(0, 0, 0);
          var3.width = param2.width;
          var3.fullWidth = param2.fullWidth;
          var3.height = param2.height;
          if (param0 >= -62) {
            stackIn_2_0 = (IndexedSprite) null;
            return stackIn_2_0;
          }
          var3.fullHeight = param2.fullHeight;
          var3.palette = param1;
          var3.indices = param2.indices;
          var3.trimY = param2.trimY;
          var3.trimX = param2.trimX;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("ha.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(byte param0, ResourceArchive param1, ResourceArchive param2, ResourceArchive param3) {
        Sprite var18 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[][] var6 = null;
        int[][] var20 = null;
        int[][] var17 = null;
        int[][] var7 = null;
        IndexedSprite[] var15 = null;
        int var11_int = 0;
        Sprite var16 = null;
        Sprite var19 = null;
        Sprite var11 = null;
        Sprite var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = Geoblox.clientControlFlowFlag;
        try {
            id.field_c = OpacityWidget.loadSpriteFrames("frame_top", "commonui", param2, 0);
            UnderlinedButtonRenderer.field_e = OpacityWidget.loadSpriteFrames("frame_bottom", "commonui", param2, 0);
            jc.field_a = ug.loadSprite("jagex_logo_grey", param2, (byte) -78, "commonui");
            MouseWheelInput.field_e = OpacityWidget.loadSpriteFrames("button", "commonui", param2, 0);
            oa.field_e = oi.a((byte) -39, "validation", "commonui", param2);
            hh.field_d = (BitmapFont) ((Object) TextInputValidator.loadCoverageFont(param3, 1, "arezzo12", "commonui", param2));
            DialogLayer.sharedUiFont = (BitmapFont) ((Object) TextInputValidator.loadCoverageFont(param3, 1, "arezzo14", "commonui", param2));
            hh.field_c = (BitmapFont) ((Object) TextInputValidator.loadCoverageFont(param3, 1, "arezzo14bold", "commonui", param2));
            var18 = new Sprite(param1.getNamedFile(0, "", "button.gif"), (java.awt.Component) ((Object) MessageDialog.gameCanvas));
            SocketConnector.loadIndexedSprite(param2, 1, "commonui", "dropdown");
            var5 = MenuScreen.loadIndexedSpriteFrames("commonui", "screen_options", true, param2);
            ek.field_a = new IndexedSprite[4];
            sb.field_e = new IndexedSprite[4];
            lj.field_c = new IndexedSprite[4];
            var6 = new IndexedSprite[][]{ek.field_a, sb.field_e, lj.field_c};
            var20 = new int[4][];
            var17 = var20;
            var7 = var17;
            var7[0] = var5[0].palette;
            for (var8 = 1; var20.length > var8; var8++) {
                var7[var8] = (int[]) ((Object) var20[0].clone());
            }
            var8 = var5[0].indices[0];
            var20[2][var8] = 16777215;
            var20[1][var8] = 2394342;
            var20[3][var8] = 4767999;
            for (var9 = 0; var9 < 3; var9++) {
                var15 = var6[var9];
                IndexedSprite[] var10 = var15;
                for (var11_int = 0; var11_int < var15.length; var11_int++) {
                    var15[var11_int] = IndexedSpriteState.a(-84, var20[var11_int], var5[var9]);
                }
            }
            var9 = var18.height;
            SpriteCheckboxRenderer.pushRasterTarget(-105);
            if (param0 <= 98) {
                IndexedSprite var14 = (IndexedSprite) null;
                IndexedSpriteState.a(72, (int[]) null, (IndexedSprite) null);
            }
            var18.setAsRasterTarget();
            SoftwareRasterizer.grayscaleRectangle(0, 0, SoftwareRasterizer.stride, SoftwareRasterizer.framebufferHeight);
            var16 = new Sprite(var9, var9);
            var19 = var16;
            var19.setAsRasterTarget();
            var18.drawUnmasked(0, 0);
            var11 = new Sprite(var9, var9);
            var11.setAsRasterTarget();
            var18.drawUnmasked(var9 - var18.width, 0);
            var12 = new Sprite(var18.width - 2 * var9, var9);
            var12.setAsRasterTarget();
            var18.drawUnmasked(-var9, 0);
            id.restoreRasterTarget(true);
            MouseWheelInput.field_e = new Sprite[]{var16, var12, var11};
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ha.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0) {
        int var1 = 77 / ((param0 + 17) / 52);
        return TextPairLoginPayload.keyboardIdleTicks;
    }

    static {
        avatarShockFrameIndex = 0;
    }
}
