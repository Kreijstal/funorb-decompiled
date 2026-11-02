/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientException extends RuntimeException {
    static BufferedFile[] field_g;
    Throwable originalCause;
    String context;
    static RgbSprite gameOverMessageSprite;
    static int field_e;
    static String field_c;
    static int[] meshHighlightTable;

    final static int getFullscreenDialogHeight(int obfuscationGuard) {
        if (obfuscationGuard != 5395) {
          return -14;
        }
        return ModalOverlayHelpers.fullscreenDialogHeight;
    }

    public static void clearSharedReferences(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          ClientException.buildRgbSprites(-93);
        }
        field_g = null;
        gameOverMessageSprite = null;
        field_c = null;
        meshHighlightTable = null;
    }

    ClientException(Throwable originalCause, String context) {
        this.originalCause = originalCause;
        this.context = context;
    }

    final static void drawPlayerTrackMarkers(int obfuscationGuard, int backdropArgument, boolean flag, MultiplayerMatch match, int highlightedPlayer, int originY) {
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
          KeyboardInput.a(obfuscationGuard + 6, CanvasInputCleanup.field_d, 294, 6, backdropArgument, 64, 3 + originY);
          for (var6_int = 0; match.playerCount > var6_int; var6_int++) {
            if (0 == (1 << var6_int & (match.playerMaskTwo | match.playerMaskOne | match.playerMaskThree))) {
              var7 = match.playerBoards[var6_int];
              var8 = 1414 * var7.displayedPosition256 / (30 * match.playerCount);
              var8 = var8 + (MembershipBenefitsScreen.clientTick + 294 << 7);
              var8 = var8 >> 8;
              stackIn_7_0 = var7.characterIndex;
              stackIn_7_1 = false;
              stackIn_7_2 = var7.positionOrderTicks;
              stackIn_7_3 = var8;
              stackIn_8_4 = (var6_int == highlightedPlayer);
              WidgetGroup.drawTrackMarker(stackIn_7_0, stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_8_4, originY, obfuscationGuard);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("v.A(").append(obfuscationGuard).append(',').append(backdropArgument).append(',').append(flag).append(',');
          if (match == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(highlightedPlayer).append(',').append(originY).append(')').toString());
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
        var1 = new RgbSprite[IncomingPacketHelpers.decodedSpriteCount];
        if (obfuscationGuard != -835) {
          ClientException.clearSharedReferences(false);
        }
        for (var2 = 0; var2 < IncomingPacketHelpers.decodedSpriteCount; var2++) {
          var3 = TextHotspotRegion.decodedSpriteHeights[var2] * UiGeometryHelpers.decodedSpriteWidths[var2];
          var21 = GameOverlayHelpers.decodedSpriteIndices[var2];
          if (!OutgoingPacketHelpers.decodedSpriteHasAlpha[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6 = 0; var6 < var3; var6++) {
              var10[var6] = PlayerBadgeHelpers.decodedSpritePalette[IntrusiveHashIterator.bitwiseAnd((int) var21[var6], 255)];
            }
            var1[var2] = new RgbSprite(PauseMenuHelpers.decodedCanvasWidth, FullscreenFailureDialog.decodedCanvasHeight, ArrayWidgetGroup.decodedSpriteOffsetX[var2], SocketConnector.decodedSpriteOffsetY[var2], UiGeometryHelpers.decodedSpriteWidths[var2], TextHotspotRegion.decodedSpriteHeights[var2], var22);
          } else {
            var15 = PopupWidgetLayer.decodedSpriteAlpha[var2];
            var11 = var15;
            var9 = var11;
            var5 = var9;
            var17 = new int[var3];
            var13 = var17;
            var6_ref_int__ = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6_ref_int__[var7] = LevelSelectScreen.bitwiseOr(IntrusiveHashIterator.bitwiseAnd(255, (int) var15[var7]) << 24, PlayerBadgeHelpers.decodedSpritePalette[IntrusiveHashIterator.bitwiseAnd(255, (int) var21[var7])]);
            }
            var1[var2] = (RgbSprite) ((Object) new ArgbSprite(PauseMenuHelpers.decodedCanvasWidth, FullscreenFailureDialog.decodedCanvasHeight, ArrayWidgetGroup.decodedSpriteOffsetX[var2], SocketConnector.decodedSpriteOffsetY[var2], UiGeometryHelpers.decodedSpriteWidths[var2], TextHotspotRegion.decodedSpriteHeights[var2], var17));
          }
        }
        MotionWaypoint.clearDecodedSpriteData((byte) 96);
        return var1;
    }

    static {
        field_c = "Send private message to <%0>";
    }
}
