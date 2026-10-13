/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DeployEvent extends GameEvent {
    int tileY;
    static String field_y;
    int tileX;
    static String field_G;
    static RgbSprite field_z;
    static byte[] field_F;
    private int modifiers;
    static int[][] field_C;
    static int pointerPressButton;

    public static void g(int param0) {
        if (param0 > -88) {
          pointerPressButton = 25;
        }
        field_z = null;
        field_C = (int[][]) null;
        field_G = null;
        field_F = null;
        field_y = null;
    }

    final static void h(int param0) {
        GlobalSpell.field_f = new ClientUiComponent(0L, (ClientUiComponent) null);
        if (fh.field_c) {
          GlobalSpell.field_f.addChild(t.field_g, 84);
        }
        GlobalSpell.field_f.addChild(IconTextComponent.field_Kb, 104);
        SpellCastEvent.field_E = new CommunityTabGroup(ClientConnectionState.field_c, GlobalSpell.field_f);
        if (param0 != 14570) {
          return;
        }
        NumericDateInputWidget.field_T = new ClientUiComponent(0L, (ClientUiComponent) null);
        NumericDateInputWidget.field_T.addChild(SpellCastEvent.field_E.tabs, 127);
        NumericDateInputWidget.field_T.addChild(cp.field_d, 39);
        BitmapTextLayout.b(false);
    }

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        int var3 = -17 % ((obfuscationGuard - 53) / 51);
        if (verbose) {
          System.out.println("Deploy event debug");
          System.out.println("Unit at " + this.tileX + "," + this.tileY);
        }
        String var4 = "EventDeploy: pos: (" + this.tileX + "," + this.tileY + "), mods: " + this.modifiers;
        return var4;
    }

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        RuntimeException var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -84) {
            field_y = (String) null;
          }
          stackIn_3_0 = this.a((byte) -39, param2, param0, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("tr.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static LobbyPlayer getLobbyPlayer(byte obfuscationGuard, long accountId) {
        if (obfuscationGuard != 121) {
          DeployEvent.h(23);
        }
        return (LobbyPlayer) (oi.lobbyPlayersById.get((byte) -27, accountId));
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        MapTile var4_ref_ne = null;
        int var4 = 0;
        int var5 = 0;
        Unit var6 = null;
        try {
          if (obfuscationGuard != -26661) {
            return;
          }
          var6 = battlefield.getUnitAt(this.tileY, true, this.tileX);
          if (var6 != null &&
            !var6.hasMovementFlag1(false)) {
            if (var6.unitType == 7) {
              var6.removeFromBattlefield(obfuscationGuard + 26577);
              var4_ref_ne = battlefield.tiles[this.tileX + this.tileY * battlefield.mapWidth];
              var4_ref_ne.terrainType = 11;
              var4_ref_ne.godFavourLevel = 1;
              var4_ref_ne.terrainChanged = true;
              var4_ref_ne.godId = this.modifiers;
              var4_ref_ne.ownerPlayer = var6.ownerPlayer;
            }
            if (var6.unitType == 34) {
              var6.packedFlag8 = true;
              var6.movementSpent = true;
              var6.strength = 20;
              var6.maximumStrength = 20;
              var6.refreshTileEffects((byte) 71);
              var6.z(10);
            }
            if (var6.unitType == 17) {
              var6.removeFromBattlefield(obfuscationGuard ^ 26692);
              if ((1 & this.modifiers) > 0) {
                stackIn_13_0 = -1 + var6.tileX;
              } else {
                stackIn_13_0 = var6.tileX;
              }
              var4 = stackIn_13_0;
              if ((2 & this.modifiers) > 0) {
                stackIn_16_0 = var6.tileY - 1;
              } else {
                stackIn_16_0 = var6.tileY;
              }
              var5 = stackIn_16_0;
              battlefield.a(var5, var4, (byte) -13, var6.ownerPlayer);
            }
          }
          fl.recomputeClientStateChecksum(battlefield, -115);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("tr.G(");
          if (battlefield == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void updateIgnoreListControls(int obfuscationGuard, boolean enableCapture, int visibleRows) {
        ScrollContainer stackIn_5_0;
        boolean stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        boolean stackIn_6_4 = false;
        ClientUiComponent stackIn_21_0 = null;
        String stackIn_22_1 = null;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        NodeDeque var4 = null;
        Object var5 = null;
        SocialListEntry var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ClientContextMenu var16 = null;
        ClientContextMenu var17 = null;
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard >= -67) {
            field_G = (String) null;
          }
          stackIn_5_0 = TaggedMapData.field_g.scrollContainer;
          stackIn_5_1 = enableCapture;
          stackIn_5_2 = (2 + jn.field_d) * (3 * visibleRows);
          stackIn_5_3 = jn.field_d + 2;
          stackIn_6_4 = (PointerInputHandler.contextMenuScrollContainer == TaggedMapData.field_g.scrollContainer);
          var3_int = ((ScrollContainer) (Object) stackIn_5_0).updateContentLayout(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_6_4, 0, 2) ? 1 : 0;
          var4 = TaggedMapData.field_g.listContent.children;
          if (th.socialListState != 2 &&
            th.socialListState != 1) {
            TaggedMapData.field_g.scrollContainer.viewport.text = ConsoleParseException.field_a;
            TaggedMapData.field_g.inputEnabled = false;
            ArchiveIndex.a(TaggedMapData.field_g.listContent, -71);
            return;
          }
          TaggedMapData.field_g.scrollContainer.viewport.text = null;
          TaggedMapData.field_g.inputEnabled = true;
          var5 = null;
          var6 = (SocialListEntry) (var4.first((byte) 110));
          while (var6 != null) {
            var7 = 0;
            if (var6.children == null) {
              var6.nameComponent = new ClientUiComponent(0L, IsaacRandom.field_i);
              var6.addChild(var6.nameComponent, 114);
              var6.previousNameComponent = new ClientUiComponent(0L, IsaacRandom.field_i);
              var6.addChild(var6.previousNameComponent, 113);
              var6.inheritVisualStateForDescendants(-10027);
              var7 = 1;
            }
            var6.width = TaggedMapData.field_g.listContent.width;
            var6.nameComponent.setBounds(jn.field_d, -20500, var6.width, 0, 0);
            var8 = 0;
            if (null != var6.previousDisplayName &&
              !var6.previousDisplayName.equals("")) {
              var6.previousNameComponent.sprite = NodeHashIterator.field_e;
              var6.previousNameComponent.matchedButtonTextColour = 16737894;
              var6.previousNameComponent.setBounds(jn.field_d, -20500, NodeHashIterator.field_e.canvasWidth + 3, 0, 0);
              var8 = 1;
            }
            var9 = 0;
            var10 = var6.width;
            if (var8 != 0) {
              var9 = 3 + NodeHashIterator.field_e.canvasWidth;
              var10 = var10 - var9;
            }
            stackIn_21_0 = var6.nameComponent;
            if (var10 <= 0) {
              stackIn_22_1 = var6.displayName;
            } else {
              stackIn_22_1 = BitmapFont.truncateWithEllipsis(var6.nameComponent.font, var6.displayName, var10);
            }
            stackIn_21_0.text = stackIn_22_1;
            stackIn_25_0 = (var6.nameComponent.text.equals(var6.displayName)) ? 0 : 1;
            var11 = stackIn_25_0;
            var6.nameComponent.setBounds(jn.field_d, -20500, var10, 0, var9);
            if (var3_int == 0) {
              var6.pendingHeightDelta = -var6.height + jn.field_d;
            }
            if (var7 != 0) {
              TaggedMapData.field_g.listContent.positionAfter(var6, true, 2, (ClientUiComponent) (var5));
            }
            if (var6.previousNameComponent != null &&
              var6.previousNameComponent.heldButtonMatches) {
              DialogMessagePane.field_I = var6.previousDisplayName;
            } else {
              if (var6.nameComponent.heldButtonMatches &&
                var11 != 0) {
                DialogMessagePane.field_I = var6.displayName;
              }
            }
            if (0 != var6.pressedButton) {
              ng.openClientContextMenu(TaggedMapData.field_g.scrollContainer, var6, (int[]) null, var6.displayName, -1, -110, -1, var6.accountName, 0L);
              var16 = tn.activeContextMenu;
              var13_ref_String = ArchiveIndex.field_u;
              var16.menu.addTextAction(7, var13_ref_String, (byte) -100);
              var17 = tn.activeContextMenu;
              var13 = BattleTutorial.pointerPressX;
              var14 = TeleportAction.pointerPressY;
              var17.menu.layoutPopup(0, var14, 0, (byte) -118, var13);
            }
            var5 = var6;
            var6 = (SocialListEntry) (var4.next((byte) 123));
          }
          if (0 != TaggedMapData.field_g.addButton.pressedButton) {
            EffectPresentation.field_e = new AccountNamePrompt(TaggedMapData.field_g.addButton.screenX, TaggedMapData.field_g.addButton.screenY, TaggedMapData.field_g.addButton.width, TaggedMapData.field_g.addButton.height, iw.field_o, kq.field_N, eq.field_h, eq.field_h);
            ut.field_fb = 2;
          }
          if (TaggedMapData.field_g.removeButton.pressedButton == 0) {
            return;
          }
          EffectPresentation.field_e = new AccountNamePrompt(TaggedMapData.field_g.removeButton.screenX, TaggedMapData.field_g.removeButton.screenY, TaggedMapData.field_g.removeButton.width, TaggedMapData.field_g.removeButton.height, StandardContentDialog.field_kb, kq.field_N, eq.field_h, eq.field_h);
          ut.field_fb = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "tr.D(" + obfuscationGuard + ',' + enableCapture + ',' + visibleRows + ')');
        }
    }

    DeployEvent(int param0, int param1, int param2) {
        this.modifiers = param2;
        this.tileX = param0;
        this.eventKind = 18;
        this.tileY = param1;
    }

    static {
        field_G = "<%0> wants to join";
        field_y = "You win!";
        pointerPressButton = 0;
        field_C = new int[][]{null, null, null, null, null, null};
    }
}
