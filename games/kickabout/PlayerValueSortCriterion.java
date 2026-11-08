/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerValueSortCriterion extends SortCriterion {
    static Sprite field_p;
    static boolean field_n;
    static String field_o;

    PlayerValueSortCriterion() {
    }

    final int compare(int param0, Object param1, Object param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2) {
            field_n = false;
          }
          var4_int = ((ShopPlayerSlot) (param1)).field_Gb;
          var5 = ((ShopPlayerSlot) (param2)).field_Gb;
          stackIn_3_0 = -var5 + var4_int ^ this.field_i << 31;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("od.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int directionCount(int param0) {
        if (param0 > -69) {
          Object var3 = (Object) null;
          this.compare(-91, (Object) null, (Object) null);
        }
        return 2;
    }

    public static void releaseStatics(int param0) {
        field_p = null;
        if (param0 != 0) {
          return;
        }
        field_o = null;
    }

    final static void a(int[] param0, int param1, ParticipantStatus[] param2, int param3) {
        int dupTemp$0 = 0;
        int var12 = 0;
        ParticipantAgent[] stackIn_6_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        CoverageBitmapFont var4 = null;
        RuntimeException var4_ref = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int var8Lifetime1;
        int var9Lifetime1;
        int var17Lifetime1;
        var19 = Kickabout.field_G;
        try {
          var4 = ByteArrayPool.field_d;
          var23 = new int[2];
          var20 = var23;
          var5 = var20;
          var24 = new int[2];
          var21 = var24;
          var6 = var21;
          var25 = new int[2];
          var22 = var25;
          var7 = var22;
          for (var8 = 0; var8 < AsciiCharacterSupport.field_c.field_g.length; var8++) {
            dupTemp$0 = AsciiCharacterSupport.field_c.field_g[var8].team;
            var5[dupTemp$0] = var5[dupTemp$0] + 1;
          }
          stackIn_6_0 = AsciiCharacterSupport.field_c.field_g;
          if (ContextMenuItem.field_Cb != -2) {
            stackIn_7_1 = ContextMenuItem.field_Cb;
          } else {
            stackIn_7_1 = 0;
          }
          var8Lifetime1 = stackIn_6_0[stackIn_7_1].team;
          for (var9 = 0; 2 > var9; var9++) {
            var6[var9] = VertexNormal.field_c * var23[var9] + 4;
          }
          if (param3 != 14839) {
            field_p = (Sprite) null;
          }
          var7[var8Lifetime1] = 473 - var24[var8Lifetime1];
          var7[-var8Lifetime1 + 1] = -2 + var25[var8Lifetime1] - var6[-var8Lifetime1 + 1];
          for (var9Lifetime1 = 0; 2 > var9Lifetime1; var9Lifetime1++) {
            SoftwareRasterizer.fillRoundedRectangleBlended(-ThumbnailStateFactory.field_c + 644, var25[var9Lifetime1], ThumbnailStateFactory.field_c, var24[var9Lifetime1], 2, 0, param1);
            SoftwareRasterizer.fillRoundedRectangleBlended(643 - (ThumbnailStateFactory.field_c + VertexNormal.field_c + 2), var25[var9Lifetime1], VertexNormal.field_c + 1, var24[var9Lifetime1], 2, 0, param1);
            var10 = AsciiCharacterSupport.field_c.field_X.score[var9Lifetime1];
            if (var10 > 99) {
              var10 = 99;
            }
            ((BitmapFont) ((Object) var4)).drawCentered(Integer.toString(var10), -2 + (-VertexNormal.field_c + 644 - ThumbnailStateFactory.field_c + (VertexNormal.field_c >> 1)) + 1, (var24[var9Lifetime1] + VertexNormal.field_c >> 1) + var25[var9Lifetime1] - 2, 16777215, -1);
            var11 = 0;
            for (var12 = 0; AsciiCharacterSupport.field_c.playerCount > var12; var12++) {
              if (~var9Lifetime1 == ~AsciiCharacterSupport.field_c.field_g[var12].team) {
                var13 = 1 + (TextPromptDialog.field_yb + var11 * VertexNormal.field_c) + (var25[var9Lifetime1] + 2) + 3;
                var14 = param0[var12];
                var15 = SingleChildContainer.latencyIndicatorHeight(true, var14);
                if (JaggrabDownloader.field_c &&
                  644 - ThumbnailStateFactory.field_c < ArrayWidgetContainer.field_x &&
                  ArrayWidgetContainer.field_x < 640 &&
                  TutorialCaptionSupport.field_j > var13 - VertexNormal.field_c &&
                  TutorialCaptionSupport.field_j < var13) {
                  SpriteResourceSupport.showTextTooltip((byte) 52, LoginDialog.substitutePlaceholders(-18, "<%0>: <%1>ms", new String[]{TrinketPickerDialog.field_G[var12], var14 + ""}));
                }
                stackIn_29_0 = (AsciiCharacterSupport.field_c.participantStatus[var12].isActive(3511)) ? 16777215 : 11184810;
                var16 = stackIn_29_0;
                ((BitmapFont) ((Object) var4)).drawText(TrinketPickerDialog.field_G[var12], -ThumbnailStateFactory.field_c + 644 + 10, var13, var16, -1);
                if (AsciiCharacterSupport.field_c.participantStatus[var12].isActive(3511)) {
                  if (AsciiCharacterSupport.field_c.participantStatus[var12].offerDraw) {
                    var17 = ((BitmapFont) ((Object) var4)).stringWidth(AlphaContainer.field_A) + 12;
                    AuctionListing.pushRasterClip(-VertexNormal.field_c + (-ThumbnailStateFactory.field_c + 642) - 1, -22914, 0, 480, 0);
                    SoftwareRasterizer.fillRoundedRectangleBlended(642 - (ThumbnailStateFactory.field_c + (VertexNormal.field_c + var17)), var13 - VertexNormal.field_c + 3, var17 + 4, VertexNormal.field_c - 2, 6, 65793, param1);
                    ((BitmapFont) ((Object) var4)).drawText(AlphaContainer.field_A, 7 + (-ThumbnailStateFactory.field_c + 644 - VertexNormal.field_c - (2 + var17)), var13, 16777215, -1);
                    TeamManagementScreen.popRasterState(119);
                  }
                } else {
                  var17 = 644 + (-ThumbnailStateFactory.field_c + 10);
                  var18 = ((BitmapFont) ((Object) var4)).stringWidth(TrinketPickerDialog.field_G[var12]);
                  SoftwareRasterizer.drawLine(var17, -2 + (var13 - TextPromptDialog.field_yb), var18 + var17, var13 - 1, 13382451);
                  SoftwareRasterizer.drawLine(var17, -1 + var13, var17 + var18, -2 - TextPromptDialog.field_yb + var13, 13382451);
                }
                var11++;
                if (JaggrabDownloader.field_c) {
                  SoftwareRasterizer.fillRect(629, var13 - 10, 6, 10, 0);
                  for (var17Lifetime1 = 0; var15 > var17Lifetime1; var17Lifetime1++) {
                    SoftwareRasterizer.drawHorizontalLine(630, var13 - var17Lifetime1 - 2, 4, DualLinkNode.field_i[var17Lifetime1]);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_43_0 = var4_ref;
          stackIn_43_1 = new StringBuilder().append("od.A(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_o = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
