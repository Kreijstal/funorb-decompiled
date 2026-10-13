/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationStatusWidget extends HotspotTextWidget {
    private ValidationSource validationSource;
    private RgbSprite spinnerSprite;
    private int spinnerTick;
    static String field_S;
    static int field_X;
    static String field_W;
    static int[][] field_T;
    static String field_V;
    private String fallbackText;

    final String getTooltipText(int obfuscationGuard) {
        if (obfuscationGuard == 21384) {
          return null;
        }
        this.spinnerTick = -103;
        return null;
    }

    final static int a(byte[] param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -73 / ((param2 - 55) / 56);
          stackIn_1_0 = ClientUiNode.a(param1, param0, 0, -8779);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("pk.O(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    ValidationStatusWidget(ValidationSource validationSource, String fallbackText, int x, int y, int width, int height) {
        super(fallbackText, ji.a(true));
        try {
          this.validationSource = validationSource;
          this.fallbackText = fallbackText;
          this.setBounds(x, width, y, 8192, height);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pk.<init>(" + (validationSource != null ? "{...}" : "null") + ',' + (fallbackText != null ? "{...}" : "null") + ',' + x + ',' + y + ',' + width + ',' + height + ')');
        }
    }

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        String displayText;
        ValidationState state;
        int obfuscationControl;
        TextWidgetPainter textPainter;
        int iconX;
        int iconCenterY;
        int waitingSpriteWidth;
        int waitingSpriteHeight;
        RgbSprite checkingSpriteAlias;
        RgbSprite validIcon;
        RgbSprite invalidIcon;
        RgbSprite checkingIcon;
        RgbSprite waitingIcon;
        int checkingSpriteWidth;
        int checkingSpriteHeight;
        ValidationState iconState;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        state = this.validationSource.getValidationState(false);
        if (ad.validationWaiting != state &&
          state != so.validationChecking) {
          displayText = this.validationSource.getValidationMessage((byte) 55);
          if (displayText == null) {
            displayText = this.fallbackText;
          }
        } else {
          displayText = gt.validationPendingText;
        }
        if (!displayText.equals(this.text)) {
          this.text = displayText;
          this.rebuildHotspots(-128);
        }
        super.drawWidget(originX, originY, (byte) -114, renderLayer);
        if (obfuscationGuard > -82) {
          field_W = (String) null;
        }
        iconState = this.validationSource.getValidationState(false);
        textPainter = (TextWidgetPainter) ((Object) this.painter);
        iconX = originX + this.x;
        iconCenterY = textPainter.getTextTop(-18033, originY, (Widget) (this)) + (textPainter.getTextLayout(-69, (Widget) (this)).getHeight((byte) 27) >> 1);
        if (iconState == ad.validationWaiting) {
          waitingIcon = db.validationStatusIcons[0];
          waitingSpriteWidth = waitingIcon.canvasWidth << 1;
          waitingSpriteHeight = waitingIcon.canvasHeight << 1;
          if (this.spinnerSprite == null) {
            this.spinnerSprite = new RgbSprite(waitingSpriteWidth, waitingSpriteHeight);
            CombatSandbox.a(this.spinnerSprite, 3);
          } else {
            if (this.spinnerSprite.pixelWidth < waitingSpriteWidth) {
              this.spinnerSprite = new RgbSprite(waitingSpriteWidth, waitingSpriteHeight);
              CombatSandbox.a(this.spinnerSprite, 3);
            } else {
              if (waitingSpriteHeight > this.spinnerSprite.pixelHeight) {
                this.spinnerSprite = new RgbSprite(waitingSpriteWidth, waitingSpriteHeight);
                CombatSandbox.a(this.spinnerSprite, 3);
              } else {
                CombatSandbox.a(this.spinnerSprite, 3);
                SoftwareRaster.b();
              }
            }
          }
          waitingIcon.b(112, 144, waitingIcon.canvasWidth << 4, waitingIcon.canvasHeight << 4, -this.spinnerTick << 10, 4096);
          QuickChatPhraseRepository.popRasterState(-18862);
          this.spinnerSprite.f(iconX - (waitingIcon.canvasWidth >> 1), -waitingIcon.canvasHeight + iconCenterY, 256);
          return;
        }
        if (so.validationChecking != iconState) {
          if (iconState == rn.validationInvalid) {
            invalidIcon = db.validationStatusIcons[2];
            invalidIcon.f(iconX, -(invalidIcon.pixelHeight >> 1) + iconCenterY, 256);
            return;
          }
          if (iconState != oo.validationValid) {
            return;
          }
          validIcon = db.validationStatusIcons[1];
          validIcon.f(iconX, -(validIcon.pixelHeight >> 1) + iconCenterY, 256);
          return;
        }
        checkingIcon = db.validationStatusIcons[0];
        checkingSpriteAlias = checkingIcon;
        checkingSpriteWidth = checkingIcon.canvasWidth << 1;
        checkingSpriteHeight = checkingIcon.canvasHeight << 1;
        if (this.spinnerSprite == null) {
          this.spinnerSprite = new RgbSprite(checkingSpriteWidth, checkingSpriteHeight);
          CombatSandbox.a(this.spinnerSprite, 3);
        } else {
          if (this.spinnerSprite.pixelWidth < checkingSpriteWidth) {
            this.spinnerSprite = new RgbSprite(checkingSpriteWidth, checkingSpriteHeight);
            CombatSandbox.a(this.spinnerSprite, 3);
          } else {
            if (checkingSpriteHeight > this.spinnerSprite.pixelHeight) {
              this.spinnerSprite = new RgbSprite(checkingSpriteWidth, checkingSpriteHeight);
              CombatSandbox.a(this.spinnerSprite, 3);
            } else {
              CombatSandbox.a(this.spinnerSprite, 3);
              SoftwareRaster.b();
            }
          }
        }
        checkingIcon.b(112, 144, checkingIcon.canvasWidth << 4, checkingIcon.canvasHeight << 4, -this.spinnerTick << 10, 4096);
        QuickChatPhraseRepository.popRasterState(-18862);
        this.spinnerSprite.f(iconX - (checkingIcon.canvasWidth >> 1), -checkingIcon.canvasHeight + iconCenterY, 256);
        return;
    }

    final boolean takeFocus(int obfuscationGuard, Widget rootWidget) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 11) {
            ValidationStatusWidget.a(56, -104, -60, 38, -92, -10, 85, -99);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pk.M(").append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = CampaignMenuEntry.field_u[param3];
        if (11 == var8) {
          var8 = 7;
        }
        if (param5 != -29403) {
          return;
        }
        if (var8 == 0) {
          return;
        }
        if (7 == var8) {
          return;
        }
        if (var8 == 9) {
          var8 = 2;
        }
        j.field_b = var8;
        SpellConfirmationDialog.field_e = var8;
        ConsoleTextNode.field_m = var8;
        ContextActionMenu.field_Wb = var8;
        ChannelBaseVolumeConsoleCommand.field_E = var8;
        pv.field_b = var8;
        cs.field_Y = var8;
        gt.field_i = var8;
        QuickChatCategory.field_z = var8;
        int var9 = 0 < param2 ? 1 : 0;
        int var10 = param2 < ResourceRequest.field_y - 1 ? 1 : 0;
        if (param1 <= 0) {
          if (var9 != 0) {
            cs.field_Y = CampaignMenuEntry.field_u[-1 + param3];
          }
          if (var10 != 0) {
            SpellConfirmationDialog.field_e = CampaignMenuEntry.field_u[param3 + 1];
            var8 = var8 * 20;
            if (-1 + ConsoleParseException.field_c > param1) {
              if (var9 != 0) {
                ChannelBaseVolumeConsoleCommand.field_E = CampaignMenuEntry.field_u[-1 + (param3 + ResourceRequest.field_y)];
              }
              QuickChatCategory.field_z = CampaignMenuEntry.field_u[ResourceRequest.field_y + param3];
              gt.field_i = CampaignMenuEntry.field_u[1 + (ResourceRequest.field_y + param3)];
            }
            ac.activeTerrainSprites[ls.a(ConsoleTextNode.field_m, j.field_b, pv.field_b, SpellConfirmationDialog.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
            ac.activeTerrainSprites[ls.a(ContextActionMenu.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
            ac.activeTerrainSprites[ls.a(gt.field_i, j.field_b, QuickChatCategory.field_z, SpellConfirmationDialog.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
            ac.activeTerrainSprites[ls.a(ChannelBaseVolumeConsoleCommand.field_E, j.field_b, QuickChatCategory.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
            return;
          }
          var8 = var8 * 20;
          if (-1 + ConsoleParseException.field_c <= param1) {
            ac.activeTerrainSprites[ls.a(ConsoleTextNode.field_m, j.field_b, pv.field_b, SpellConfirmationDialog.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
            ac.activeTerrainSprites[ls.a(ContextActionMenu.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
            ac.activeTerrainSprites[ls.a(gt.field_i, j.field_b, QuickChatCategory.field_z, SpellConfirmationDialog.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
            ac.activeTerrainSprites[ls.a(ChannelBaseVolumeConsoleCommand.field_E, j.field_b, QuickChatCategory.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
            return;
          }
          if (var9 != 0) {
            ChannelBaseVolumeConsoleCommand.field_E = CampaignMenuEntry.field_u[-1 + (param3 + ResourceRequest.field_y)];
            QuickChatCategory.field_z = CampaignMenuEntry.field_u[ResourceRequest.field_y + param3];
            ac.activeTerrainSprites[ls.a(ConsoleTextNode.field_m, j.field_b, pv.field_b, SpellConfirmationDialog.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
            ac.activeTerrainSprites[ls.a(ContextActionMenu.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
            ac.activeTerrainSprites[ls.a(gt.field_i, j.field_b, QuickChatCategory.field_z, SpellConfirmationDialog.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
            ac.activeTerrainSprites[ls.a(ChannelBaseVolumeConsoleCommand.field_E, j.field_b, QuickChatCategory.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
            return;
          }
          QuickChatCategory.field_z = CampaignMenuEntry.field_u[ResourceRequest.field_y + param3];
          ac.activeTerrainSprites[ls.a(ConsoleTextNode.field_m, j.field_b, pv.field_b, SpellConfirmationDialog.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
          ac.activeTerrainSprites[ls.a(ContextActionMenu.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
          ac.activeTerrainSprites[ls.a(gt.field_i, j.field_b, QuickChatCategory.field_z, SpellConfirmationDialog.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
          ac.activeTerrainSprites[ls.a(ChannelBaseVolumeConsoleCommand.field_E, j.field_b, QuickChatCategory.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
          return;
        }
        if (var9 != 0) {
          ContextActionMenu.field_Wb = CampaignMenuEntry.field_u[param3 + (-ResourceRequest.field_y - 1)];
        }
        pv.field_b = CampaignMenuEntry.field_u[-ResourceRequest.field_y + param3];
        if (var10 == 0) {
          if (var9 != 0) {
            cs.field_Y = CampaignMenuEntry.field_u[-1 + param3];
          }
          var8 = var8 * 20;
          if (-1 + ConsoleParseException.field_c <= param1) {
            ac.activeTerrainSprites[ls.a(ConsoleTextNode.field_m, j.field_b, pv.field_b, SpellConfirmationDialog.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
            ac.activeTerrainSprites[ls.a(ContextActionMenu.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
            ac.activeTerrainSprites[ls.a(gt.field_i, j.field_b, QuickChatCategory.field_z, SpellConfirmationDialog.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
            ac.activeTerrainSprites[ls.a(ChannelBaseVolumeConsoleCommand.field_E, j.field_b, QuickChatCategory.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
            return;
          }
          if (var9 != 0) {
            ChannelBaseVolumeConsoleCommand.field_E = CampaignMenuEntry.field_u[-1 + (param3 + ResourceRequest.field_y)];
            QuickChatCategory.field_z = CampaignMenuEntry.field_u[ResourceRequest.field_y + param3];
            ac.activeTerrainSprites[ls.a(ConsoleTextNode.field_m, j.field_b, pv.field_b, SpellConfirmationDialog.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
            ac.activeTerrainSprites[ls.a(ContextActionMenu.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
            ac.activeTerrainSprites[ls.a(gt.field_i, j.field_b, QuickChatCategory.field_z, SpellConfirmationDialog.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
            ac.activeTerrainSprites[ls.a(ChannelBaseVolumeConsoleCommand.field_E, j.field_b, QuickChatCategory.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
            return;
          }
          QuickChatCategory.field_z = CampaignMenuEntry.field_u[ResourceRequest.field_y + param3];
          ac.activeTerrainSprites[ls.a(ConsoleTextNode.field_m, j.field_b, pv.field_b, SpellConfirmationDialog.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
          ac.activeTerrainSprites[ls.a(ContextActionMenu.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
          ac.activeTerrainSprites[ls.a(gt.field_i, j.field_b, QuickChatCategory.field_z, SpellConfirmationDialog.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
          ac.activeTerrainSprites[ls.a(ChannelBaseVolumeConsoleCommand.field_E, j.field_b, QuickChatCategory.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
          return;
        }
        ConsoleTextNode.field_m = CampaignMenuEntry.field_u[-ResourceRequest.field_y + (param3 + 1)];
        if (var9 != 0) {
          cs.field_Y = CampaignMenuEntry.field_u[-1 + param3];
        }
        SpellConfirmationDialog.field_e = CampaignMenuEntry.field_u[param3 + 1];
        var8 = var8 * 20;
        if (-1 + ConsoleParseException.field_c > param1) {
          if (var9 != 0) {
            ChannelBaseVolumeConsoleCommand.field_E = CampaignMenuEntry.field_u[-1 + (param3 + ResourceRequest.field_y)];
          }
          QuickChatCategory.field_z = CampaignMenuEntry.field_u[ResourceRequest.field_y + param3];
          gt.field_i = CampaignMenuEntry.field_u[1 + (ResourceRequest.field_y + param3)];
        }
        ac.activeTerrainSprites[ls.a(ConsoleTextNode.field_m, j.field_b, pv.field_b, SpellConfirmationDialog.field_e, -83) + (0 + var8)].b(param7, param0, param6, param4);
        ac.activeTerrainSprites[ls.a(ContextActionMenu.field_Wb, j.field_b, pv.field_b, cs.field_Y, -85) + (var8 + 1)].b(param7, param0, param6, param4);
        ac.activeTerrainSprites[ls.a(gt.field_i, j.field_b, QuickChatCategory.field_z, SpellConfirmationDialog.field_e, param5 ^ 29329) + (var8 + 2)].b(param7, param0, param6, param4);
        ac.activeTerrainSprites[ls.a(ChannelBaseVolumeConsoleCommand.field_E, j.field_b, QuickChatCategory.field_z, cs.field_Y, -22) + 3 + var8].b(param7, param0, param6, param4);
        return;

    }

    public static void c(boolean param0) {
        field_S = null;
        field_W = null;
        field_T = (int[][]) null;
        if (param0) {
          field_W = (String) null;
          field_V = null;
          return;
        }
        field_V = null;
    }

    final void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        try {
          this.spinnerTick = this.spinnerTick + 1;
          super.updatePointer(obfuscationGuard, originX, originY, rootWidget);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pk.P(" + obfuscationGuard + ',' + originX + ',' + originY + ',' + (rootWidget != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_T = new int[][]{new int[]{150, 150}, new int[]{300, 150}, new int[]{50, 150}, new int[]{150, 150}, new int[]{425, 450}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{50, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{450, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{250, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{50, 150}, new int[]{300, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{50, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{250, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{400, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{0, 150}, new int[]{100, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{250, 150}, new int[]{100, 150}, new int[]{150, 150}, new int[]{250, 150}, new int[]{150, 150}, new int[]{20, 150}, new int[]{150, 150}, new int[]{50, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{5, 150}, new int[]{150, 150}, new int[]{40, 150}, new int[]{150, 150}, new int[]{400, 450}, new int[]{380, 380}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{425, 450}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 165}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}, new int[]{150, 150}};
        field_S = "Only show lobby chat from my friends";
        field_W = "Invite <%0> to this game";
        field_V = "You are not currently logged in to the game.";
        field_X = 0;
    }
}
