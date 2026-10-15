/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicEnvelope {
    static String field_l;
    int vibratoRate;
    int field_h;
    byte[] releaseEnvelope;
    int vibratoDelay;
    int decayRate;
    int field_b;
    int vibratoDepth;
    static MeshAudioHelpers field_f;
    byte[] volumeEnvelope;
    static String field_i;
    int field_k;

    final static SoftwareFramebuffer createFramebuffer(java.awt.Component component, int width, int obfuscationGuard, int height) {
        try {
          Class implementationClass = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          SoftwareFramebuffer framebuffer = null;
          ProducerFramebuffer fallback = null;
          java.awt.Component var6 = null;
          SoftwareFramebuffer stackIn_3_0 = null;
          ProducerFramebuffer stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (obfuscationGuard != -2414) {
              var6 = (java.awt.Component) null;
              MusicEnvelope.createFramebuffer((java.awt.Component) null, 85, -118, 37);
            }
            try {
              implementationClass = Class.forName("BufferedImageFramebuffer");
              framebuffer = (SoftwareFramebuffer) (implementationClass.newInstance());
              framebuffer.initialize(component, height, true, width);
              stackIn_3_0 = framebuffer;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              fallback = new ProducerFramebuffer();
              ((SoftwareFramebuffer) ((Object) fallback)).initialize(component, height, true, width);
              stackIn_5_0 = fallback;
              return (SoftwareFramebuffer) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("jm.A(");
            if (component == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(width).append(',').append(obfuscationGuard).append(',').append(height).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void updateIgnoreList(boolean allowActiveRelayout, boolean obfuscationGuard, int wheelTurns) {
        ScrollPane scrollPaneForLayout;
        int rowGapForLayout;
        int wheelPixels;
        int lineStep;
        int layoutGuard;
        boolean activeRelayout;
        boolean keepChildLayout = false;
        UiComponent nameLabelForText = null;
        String displayedName = null;
        int truncatedValue = 0;
        RuntimeException caughtFailure = null;
        int layoutRetained = 0;
        RuntimeException updateFailure = null;
        NodeDeque entries = null;
        Object previousEntry = null;
        SocialListEntry entry = null;
        int createdLabels = 0;
        int hasPreviousName = 0;
        int nameX = 0;
        int nameWidth = 0;
        int isTruncated = 0;
        String removeIgnoreCaption = null;
        int pressX = 0;
        int pressY = 0;
        int unusedClientFlag = 0;
        ContextActionController contextForRemove = null;
        ContextActionController contextForLayout = null;
        unusedClientFlag = BrickABrac.field_J ? 1 : 0;
        try {
          scrollPaneForLayout = TableResponseHelpers.ignoreListPane.scrollPane;
          rowGapForLayout = 2;
          wheelPixels = wheelTurns * (WidgetLayerBootstrap.uiRowHeight * 3 + 6);
          lineStep = WidgetLayerBootstrap.uiRowHeight + 2;
          layoutGuard = 22676;
          activeRelayout = allowActiveRelayout;
          keepChildLayout = (ClientResourceHelpers.field_b == TableResponseHelpers.ignoreListPane.scrollPane);
          layoutRetained = ((ScrollPane) (Object) scrollPaneForLayout).updateContentLayout(rowGapForLayout, wheelPixels, lineStep, layoutGuard, activeRelayout, keepChildLayout) ? 1 : 0;
          entries = TableResponseHelpers.ignoreListPane.content.children;
          if (!obfuscationGuard) {
            return;
          }
          if (LevelMetadata.field_m != 2 &&
            LevelMetadata.field_m != 1) {
            TableResponseHelpers.ignoreListPane.enabled = false;
            TableResponseHelpers.ignoreListPane.scrollPane.viewport.text = AlternateNumericLoginCredentials.field_t;
            UiGeometryHelpers.resetListVerticalBounds(obfuscationGuard, TableResponseHelpers.ignoreListPane.content);
            return;
          }
          TableResponseHelpers.ignoreListPane.enabled = true;
          TableResponseHelpers.ignoreListPane.scrollPane.viewport.text = null;
          previousEntry = null;
          entry = (SocialListEntry) (entries.first(-57));
          while (entry != null) {
            createdLabels = 0;
            if (null == entry.children) {
              entry.nameLabel = new UiComponent(0L, TextFieldWidget.field_K);
              entry.addChild(entry.nameLabel, 0);
              entry.renameIndicator = new UiComponent(0L, TextFieldWidget.field_K);
              entry.addChild(entry.renameIndicator, 0);
              entry.markDescendantsToInheritVisualState(obfuscationGuard);
              createdLabels = 1;
            }
            entry.width = TableResponseHelpers.ignoreListPane.content.width;
            entry.nameLabel.setBounds(WidgetLayerBootstrap.uiRowHeight, 0, 0, entry.width, (byte) 64);
            hasPreviousName = 0;
            if (null != entry.previousName &&
              !entry.previousName.equals("")) {
              entry.renameIndicator.sprite = ClientViewHelpers.displayNameChangedSprite;
              entry.renameIndicator.activeTextColor = 16737894;
              hasPreviousName = 1;
              entry.renameIndicator.setBounds(WidgetLayerBootstrap.uiRowHeight, 0, 0, ClientViewHelpers.displayNameChangedSprite.canvasWidth + 3, (byte) 64);
            }
            nameX = 0;
            nameWidth = entry.width;
            if (hasPreviousName != 0) {
              nameX = ClientViewHelpers.displayNameChangedSprite.canvasWidth + 3;
              nameWidth = nameWidth - nameX;
            }
            nameLabelForText = entry.nameLabel;
            if (0 < nameWidth) {
              displayedName = TextFont.truncateText(entry.nameLabel.font, entry.name, nameWidth);
            } else {
              displayedName = entry.name;
            }
            nameLabelForText.text = displayedName;
            truncatedValue = (entry.nameLabel.text.equals(entry.name)) ? 0 : 1;
            isTruncated = truncatedValue;
            entry.nameLabel.setBounds(WidgetLayerBootstrap.uiRowHeight, 0, nameX, nameWidth, (byte) 64);
            if (layoutRetained == 0) {
              entry.remainingHeight = WidgetLayerBootstrap.uiRowHeight - entry.height;
            }
            if (createdLabels != 0) {
              TableResponseHelpers.ignoreListPane.content.placeBelow((UiComponent) (previousEntry), 2, entry, 17290);
            }
            if (null != entry.renameIndicator &&
              entry.renameIndicator.activeInside) {
              WidgetTextLayout.field_e = entry.previousName;
            } else {
              if (entry.nameLabel.activeInside &&
                isTruncated != 0) {
                WidgetTextLayout.field_e = entry.name;
              }
            }
            if (entry.pressedButton != 0) {
              SpriteGeometry.a(-1, entry, TableResponseHelpers.ignoreListPane.scrollPane, (int[]) null, entry.actionName, -1, (byte) -58, 0L, entry.name);
              contextForRemove = GameRenderAudioHelpers.contextActions;
              removeIgnoreCaption = ScreenNavigationHelpers.field_e;
              contextForRemove.contextMenu.addAction(removeIgnoreCaption, 7, (byte) 126);
              contextForLayout = GameRenderAudioHelpers.contextActions;
              pressX = LoadingProgressDialog.pressX;
              pressY = PlayerNameChooserPanel.pressY;
              contextForLayout.contextMenu.layoutAtAnchor(pressY, -126, 0, 0, pressX);
            }
            previousEntry = entry;
            entry = (SocialListEntry) (entries.next((byte) 116));
          }
          if (TableResponseHelpers.ignoreListPane.leftFooter.pressedButton != 0) {
            MusicCrossfadeStream.nameEntryPopup = new NameEntryPopup(TableResponseHelpers.ignoreListPane.leftFooter.screenX, TableResponseHelpers.ignoreListPane.leftFooter.screenY, TableResponseHelpers.ignoreListPane.leftFooter.width, TableResponseHelpers.ignoreListPane.leftFooter.height, CacheIoWorker.field_e, GameUiController.field_c, CappedUrlRequest.field_l, CappedUrlRequest.field_l);
            GameUiController.field_d = 2;
          }
          if (0 == TableResponseHelpers.ignoreListPane.rightFooter.pressedButton) {
            return;
          }
          MusicCrossfadeStream.nameEntryPopup = new NameEntryPopup(TableResponseHelpers.ignoreListPane.rightFooter.screenX, TableResponseHelpers.ignoreListPane.rightFooter.screenY, TableResponseHelpers.ignoreListPane.rightFooter.width, TableResponseHelpers.ignoreListPane.rightFooter.height, MultiplayerExitScreen.field_A, GameUiController.field_c, CappedUrlRequest.field_l, CappedUrlRequest.field_l);
          GameUiController.field_d = 3;
          return;
        } catch (java.lang.RuntimeException caughtUpdateFailure) {
          caughtFailure = caughtUpdateFailure;
          updateFailure = caughtFailure;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) updateFailure), "jm.B(" + allowActiveRelayout + ',' + obfuscationGuard + ',' + wheelTurns + ')');
        }
    }

    final static AlphaFont a(byte[] param0, byte param1) {
        AlphaFont var2 = null;
        RuntimeException var2_ref = null;
        AlphaFont stackIn_5_0 = null;
        AlphaFont stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (param1 >= -7) {
            stackIn_5_0 = (AlphaFont) null;
            return stackIn_5_0;
          }
          var2 = new AlphaFont(param0, ArrayWidgetGroup.decodedSpriteOffsetX, SocketConnector.decodedSpriteOffsetY, UiGeometryHelpers.decodedSpriteWidths, TextHotspotRegion.decodedSpriteHeights, PlayerBadgeHelpers.decodedSpritePalette, GameOverlayHelpers.decodedSpriteIndices);
          MotionWaypoint.clearDecodedSpriteData((byte) 96);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("jm.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(boolean param0, char param1) {
        if (!param0) {
          field_l = (String) null;
        }
        return String.valueOf(param1);
    }

    final static void handleCommonDataResponse(byte obfuscationGuard) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int requestId = 0;
        int var4 = 0;
        IntArrayRequest var4_ref_pe = null;
        LevelResultSubmission levelResult = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        BitPacketBuffer var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          var10 = LogoRenderHelpers.incomingPackets;
          if (obfuscationGuard != 22) {
            field_l = (String) null;
          }
          var2 = var10.readUnsignedByte(255);
          requestId = var10.readUnsignedByte(obfuscationGuard + 233);
          if (var2 == 0) {
            var4_ref_pe = (IntArrayRequest) (PasswordFieldRenderer.pendingIntArrayRequests.first(-37));
            if (var4_ref_pe == null) {
              GameTransportHelpers.closeGameTransport((byte) 57);
              return;
            }
            var5_int = LobbyOverlayHelpers.incomingPacketLength - var10.position;
            var12 = var4_ref_pe.values;
            var11 = var12;
            var6 = var11;
            if (var12.length << 2 < var5_int) {
              var5_int = var12.length << 2;
            }
            for (var7 = 0; var5_int > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var10.readUnsignedByte(255) << (IntrusiveHashIterator.a(3, var7) << 8));
            }
            var4_ref_pe.complete = true;
            var4_ref_pe.unlink((byte) 111);
            return;
          }
          if (var2 == 1) {
            var4 = var10.readSignedSmart(-1342);
            levelResult = (LevelResultSubmission) (NinjaBackground.pendingLevelResults.first(-19));
            while (levelResult != null) {
              if (requestId != levelResult.packId ||
                var4 != levelResult.levelIndex) {
                levelResult = (LevelResultSubmission) (NinjaBackground.pendingLevelResults.next((byte) 116));
                continue;
              }
              break;
            }
            if (levelResult != null) {
              levelResult.unlink((byte) 111);
              return;
            }
            GameTransportHelpers.closeGameTransport((byte) 110);
            return;
          }
          AlignedIconLabel.a("LR1: " + WhirlpoolHasher.c((byte) -96), (Throwable) null, 53);
          GameTransportHelpers.closeGameTransport((byte) 52);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "jm.D(" + obfuscationGuard + ')');
        }
    }

    public static void b(byte param0) {
        field_f = null;
        field_i = null;
        field_l = null;
        if (param0 != 31) {
          field_l = (String) null;
        }
    }

    static {
        field_l = "The following settings need to be changed:  ";
        field_f = new MeshAudioHelpers();
        field_i = "Please enter your date of birth to enable chat:";
    }
}
