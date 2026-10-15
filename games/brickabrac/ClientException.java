/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientException extends RuntimeException {
    static BufferedFile[] field_g;
    Throwable originalCause;
    String context;
    static RgbSprite field_b;
    static int field_e;
    static String field_c;
    static int[] meshHighlightTable;

    final static int getFullscreenDialogHeight(int obfuscationGuard) {
        if (obfuscationGuard != 5395) {
          return -14;
        }
        return jj.fullscreenDialogHeight;
    }

    public static void a(boolean param0) {
        if (param0) {
          ClientException.buildRgbSprites(-93);
        }
        field_g = null;
        field_b = null;
        field_c = null;
        meshHighlightTable = null;
    }

    ClientException(Throwable originalCause, String context) {
        this.originalCause = originalCause;
        this.context = context;
    }

    final static void a(int param0, int param1, boolean param2, MultiplayerMatch param3, int param4, int param5) {
        int var6_int = 0;
        int stackIn_7_0;
        boolean stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        boolean stackIn_8_4;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        PlayerBoard var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          KeyboardInput.a(param0 + 6, t.field_d, 294, 6, param1, 64, 3 + param5);
          for (var6_int = 0; param3.playerCount > var6_int; var6_int++) {
            if (0 == (1 << var6_int & (param3.playerMaskTwo | param3.playerMaskOne | param3.playerMaskThree))) {
              var7 = param3.playerBoards[var6_int];
              var8 = 1414 * var7.field_G / (30 * param3.playerCount);
              var8 = var8 + (MembershipBenefitsScreen.clientTick + 294 << 7);
              var8 = var8 >> 8;
              stackIn_7_0 = var7.characterIndex;
              stackIn_7_1 = false;
              stackIn_7_2 = var7.positionOrderTicks;
              stackIn_7_3 = var8;
              stackIn_8_4 = (var6_int == param4);
              WidgetGroup.a(stackIn_7_0, stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_8_4, param5, param0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("v.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static RgbSprite[] buildRgbSprites(int obfuscationGuard) {
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        RgbSprite[] var1;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var11;
        int[] var13;
        byte[] var15;
        int[] var17;
        byte[] var21;
        int[] var22;
        var8 = BrickABrac.field_J ? 1 : 0;
        var1 = new RgbSprite[nl.decodedSpriteCount];
        if (obfuscationGuard != -835) {
          ClientException.a(false);
        }
        for (var2 = 0; var2 < nl.decodedSpriteCount; var2++) {
          var3 = TextHotspotRegion.decodedSpriteHeights[var2] * jh.decodedSpriteWidths[var2];
          var21 = GameOverlayHelpers.decodedSpriteIndices[var2];
          if (!tm.decodedSpriteHasAlpha[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6 = 0; var6 < var3; var6++) {
              var10[var6] = qp.decodedSpritePalette[IntrusiveHashIterator.a((int) var21[var6], 255)];
            }
            var1[var2] = new RgbSprite(cf.decodedCanvasWidth, FullscreenFailureDialog.decodedCanvasHeight, ArrayWidgetGroup.decodedSpriteOffsetX[var2], SocketConnector.decodedSpriteOffsetY[var2], jh.decodedSpriteWidths[var2], TextHotspotRegion.decodedSpriteHeights[var2], var22);
          } else {
            var15 = PopupWidgetLayer.decodedSpriteAlpha[var2];
            var11 = var15;
            var9 = var11;
            var5 = var9;
            var17 = new int[var3];
            var13 = var17;
            var6_ref_int__ = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6_ref_int__[var7] = LevelSelectScreen.d(IntrusiveHashIterator.a(255, (int) var15[var7]) << 24, qp.decodedSpritePalette[IntrusiveHashIterator.a(255, (int) var21[var7])]);
            }
            var1[var2] = (RgbSprite) ((Object) new ArgbSprite(cf.decodedCanvasWidth, FullscreenFailureDialog.decodedCanvasHeight, ArrayWidgetGroup.decodedSpriteOffsetX[var2], SocketConnector.decodedSpriteOffsetY[var2], jh.decodedSpriteWidths[var2], TextHotspotRegion.decodedSpriteHeights[var2], var17));
          }
        }
        MotionWaypoint.clearDecodedSpriteData((byte) 96);
        return var1;
    }

    static {
        field_c = "Send private message to <%0>";
    }
}
