/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RadialSummonItem {
    int offsetY;
    int offsetX;
    boolean unitChoice;
    static String field_e;
    static int[][] field_h;
    private int hitRadius;
    int godGroupId;
    int choiceId;
    static vg field_f;

    final static int getCampaignPacketWord2(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          field_e = (String) null;
          return cg.campaignPacketWord2;
        }
        return cg.campaignPacketWord2;
    }

    final static String a(int param0) {
        if (param0 != -1) {
          return (String) null;
        }
        if (du.nameCheckPending == ChannelBaseVolumeConsoleCommand.field_L) {
          return qk.field_b;
        }
        return ah.loginPassword;
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 > 52) {
          field_f = null;
          field_h = (int[][]) null;
          return;
        }
        RadialSummonItem.b(125);
        field_f = null;
        field_h = (int[][]) null;
    }

    final void draw(int availability, int originY, boolean obfuscationGuard, int originX) {
        int var6;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard) {
          RadialSummonItem.getCampaignPacketWord2(false);
        }
        if (!this.unitChoice) {
          if (availability > 0) {
            if (this.containsPoint(112, AiPlanningStrategy.pointerX, originY, originX, ko.pointerY)) {
              UnitModelPreview.field_d[this.godGroupId].drawTransparent(this.offsetX + originX - 25, originY + (this.offsetY - 25));
              UnitModelPreview.field_d[0].drawAdditive(originX + (this.offsetX - 25), -25 + this.offsetY + originY, 256);
              if (var6 != 0) {
                UnitModelPreview.field_d[this.godGroupId].drawTransparent(this.offsetX + originX - 25, originY + (this.offsetY - 25));
                UnitModelPreview.field_d[this.godGroupId].drawWithBrightness(originX - (-this.offsetX + 25), -25 + (this.offsetY + originY), 128);
              }
            } else {
              UnitModelPreview.field_d[this.godGroupId].drawTransparent(this.offsetX + originX - 25, originY + (this.offsetY - 25));
              if (var6 != 0) {
                UnitModelPreview.field_d[this.godGroupId].drawWithBrightness(originX - (-this.offsetX + 25), -25 + (this.offsetY + originY), 128);
              }
            }
          } else {
            UnitModelPreview.field_d[this.godGroupId].drawWithBrightness(originX - (-this.offsetX + 25), -25 + (this.offsetY + originY), 128);
          }
          fe.a(this.offsetX + originX, originY + this.offsetY, this.godGroupId, availability, fe.field_b);
          if (var6 == 0) {
            return;
          }
        }
        if (0 < availability) {
          if (this.containsPoint(31, AiPlanningStrategy.pointerX, originY, originX, ko.pointerY)) {
            StandardContentDialog.field_ob.drawShadedGrayscale(originX - (-this.offsetX + 20), -20 + (this.offsetY + originY), TutorialLayout.field_g[this.godGroupId]);
            if (var6 == 0) {
              if (this.choiceId != 81) {
                DeployAction.field_x[this.choiceId].drawTransparent(this.offsetX + originX - 20, this.offsetY + originY - 20);
                km.field_h[0].drawTransparent(-23 + (this.offsetX + originX), -23 + originY + this.offsetY);
                return;
              }
              DeployAction.field_x[4].drawTransparent(-20 + this.offsetX + originX, -20 + (originY + this.offsetY));
              km.field_h[0].drawTransparent(-23 + (this.offsetX + originX), -23 + originY + this.offsetY);
              return;
            }
          }
          StandardContentDialog.field_ob.drawTintedGrayscale(-20 + this.offsetX + originX, originY + this.offsetY - 20, TutorialLayout.field_g[this.godGroupId]);
          if (this.choiceId == 81) {
            DeployAction.field_x[4].drawTransparent(-20 + this.offsetX + originX, -20 + (originY + this.offsetY));
            if (var6 != 0) {
              DeployAction.field_x[this.choiceId].drawTransparent(this.offsetX + originX - 20, this.offsetY + originY - 20);
            }
          } else {
            DeployAction.field_x[this.choiceId].drawTransparent(this.offsetX + originX - 20, this.offsetY + originY - 20);
          }
          km.field_h[0].drawTransparent(-23 + (this.offsetX + originX), -23 + originY + this.offsetY);
          if (var6 != 0) {
            StandardContentDialog.field_ob.drawTintedGrayscale(this.offsetX + (originX - 20), -20 + originY + this.offsetY, fe.b(TutorialLayout.field_g[this.godGroupId], 128));
            if (this.choiceId != 81) {
              DeployAction.field_x[this.choiceId].drawWithBrightness(-20 + this.offsetX + originX, -20 + (originY + this.offsetY), 0);
            }
            DeployAction.field_x[4].drawWithBrightness(-20 + (originX + this.offsetX), originY + this.offsetY - 20, 0);
            km.field_h[0].drawWithBrightness(-23 + originX + this.offsetX, -23 + (originY + this.offsetY), 10);
          }
          return;
        }
        StandardContentDialog.field_ob.drawTintedGrayscale(this.offsetX + (originX - 20), -20 + originY + this.offsetY, fe.b(TutorialLayout.field_g[this.godGroupId], 128));
        if (this.choiceId == 81) {
          DeployAction.field_x[4].drawWithBrightness(-20 + (originX + this.offsetX), originY + this.offsetY - 20, 0);
        } else {
          DeployAction.field_x[this.choiceId].drawWithBrightness(-20 + this.offsetX + originX, -20 + (originY + this.offsetY), 0);
          if (var6 != 0) {
            DeployAction.field_x[4].drawWithBrightness(-20 + (originX + this.offsetX), originY + this.offsetY - 20, 0);
          }
        }
        km.field_h[0].drawWithBrightness(-23 + originX + this.offsetX, -23 + (originY + this.offsetY), 10);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          param0 = param0 | param0 << 8;
          var5_int = param0 ^ param0 >> 1;
          var8 = -74 % ((55 - param1) / 32);
          var9 = 0;
          while (var9 < 4) {
            var7 = (7 & param0) + param2 + (CachedArchiveProvider.field_y[var9][1] - 64);
            var6 = -54 + (param4 + (CachedArchiveProvider.field_y[var9][0] + (var5_int & 15)));
            var10 = (param0 + param3 / (4 + (param0 & 3))) % 3;
            param0 = param0 >> 1;
            var5_int = var5_int >> 1;
            SetCoatConsoleCommand.kalphiteSprites[var10].drawHalfSize(60 + var6, 50 + var7);
            var9++;
            if (var11 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var5), "jr.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    RadialSummonItem(boolean unitChoice, int godGroupId, int choiceId, int hitRadius) {
        this.hitRadius = hitRadius;
        this.unitChoice = unitChoice ? true : false;
        this.godGroupId = godGroupId;
        this.choiceId = choiceId;
    }

    final boolean containsPoint(int obfuscationGuard, int pointerX, int originY, int originX, int pointerY) {
        int deltaY = 0;
        int deltaX = -pointerX + originX + this.offsetX;
        int deltaYCanonical;
        if (obfuscationGuard < 10) {
          field_e = (String) null;
          deltaY = this.offsetY + originY - pointerY;
          if (this.hitRadius * this.hitRadius <= deltaY * deltaY + deltaX * deltaX) {
            return false;
          }
          return true;
        }
        deltaYCanonical = this.offsetY + originY - pointerY;
        if (this.hitRadius * this.hitRadius <= deltaYCanonical * deltaYCanonical + deltaX * deltaX) {
          return false;
        }
        return true;
    }

    final static void a(int param0, ClientUiComponent param1, int param2, byte[] param3, int param4, ClientUiComponent param5, int param6, int param7, int param8, ClientUiComponent param9) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          SpellConfirmationDialog.field_a = param7;
          t.field_b = param3;
          ChannelBaseVolumeConsoleCommand.localAccountId = -1L;
          tq.gameOptionCount = param3.length;
          NumericDateInputWidget.roomSetup = null;
          SpellCastAction.field_s = false;
          if (param8 >= -52) {
            field_h = (int[][]) null;
          }
          CoatOfArms.field_d = new byte[(SpellConfirmationDialog.field_a + 7) / 8];
          ToggleWidget.currentRoom = null;
          var10_int = 0;
          var11 = 0;
          do {
            if (!(t.field_b.length > var11)) {
              var10_int = (7 + var10_int) / 8;
              ClientContextMenu.field_d = new byte[var10_int];
              break;
            }
            var10_int = var10_int + (t.field_b[var11] & 255);
            var11++;
          } while (var12 == 0);
          if (param9.children == null) {
            param9.children = new NodeDeque();
          }
          SummonAction.lobbyPlayerOrder = param9.children;
          SummonAction.lobbyPlayerOrder.clear(80);
          oi.lobbyPlayersById = new DualNodeHashTable(param4);
          AnimationPlayer.pendingJoinRequestCount = 0;
          SummonAction.field_s = -1;
          oo.watchedRoomId = 0;
          GlobalSpell.field_g = -1;
          if (null == param1.children) {
            param1.children = new NodeDeque();
          }
          GameClock.lobbyRoomOrder = param1.children;
          GameClock.lobbyRoomOrder.clear(120);
          ClippedWidgetContainer.lobbyRoomsById = new DualNodeHashTable(param6);
          if (null == param5.children) {
            param5.children = new NodeDeque();
          }
          ModalDialog.currentRoomPlayers = param5.children;
          ModalDialog.currentRoomPlayers.clear(122);
          UnitCycler.currentRoomPlayersById = new DualNodeHashTable(param0);
          RegistrationAgreementPane.lobbyNotificationDuration = param2;
          ph.field_d = 0L;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_19_0 = var10;
          stackIn_19_1 = new StringBuilder().append("jr.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    static {
        field_e = "<%0> has used <%1>";
        field_h = new int[][]{new int[]{303, 375, 440, 498, 560}, new int[]{288, 360, 425, 488, 560}, new int[]{303, 375, 440, 498, 560}, new int[]{283, 350, 417, 488, 560}};
        field_f = null;
    }
}
