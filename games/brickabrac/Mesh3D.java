/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Mesh3D {
    byte[] faceGroups;
    short[] directionX;
    int[] facePointThreeY;
    int maxY;
    byte faceGroupCount;
    int minY;
    short faceCount;
    int[] facePointTwoX;
    short[] faceMaterialIds;
    short[] vertexZ;
    int[] facePointThreeZ;
    short[] directionY;
    short[] field_m;
    short[] field_z;
    int[] facePointOneZ;
    short[] field_K;
    short[] faceDirectionA;
    int[] facePointTwoZ;
    short directionCount;
    short[] field_J;
    short[] vertexY;
    int maxZ;
    int minX;
    int[] facePointTwoY;
    int[] facePointOneX;
    int minZ;
    int maxX;
    short[] faceDirectionB;
    int[] facePointThreeX;
    int[] facePointOneY;
    short[] faceVertexC;
    short[] field_j;
    short[] faceVertexB;
    short vertexCount;
    private boolean boundsValid;
    static NodeDeque rasterSnapshotPool;
    short[] directionZ;
    short[] faceVertexA;
    static int fireworkSpawnMinY;
    short[] vertexX;
    static int[] field_l;
    static PcmSound[] field_e;
    short[] faceDirectionC;

    final static boolean a(byte param0) {
        if (param0 <= 33) {
          Mesh3D.d(-80);
        }
        return NanoGameClock.field_l;
    }

    final void translateVerticesFrom(int deltaZ, int firstVertex, int deltaX, int deltaY) {
        int vertex = 0;
        int unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        for (vertex = firstVertex; this.vertexCount > vertex; vertex++) {
          this.vertexX[vertex] = (short)(this.vertexX[vertex] + deltaX);
          this.vertexY[vertex] = (short)(this.vertexY[vertex] + deltaY);
          this.vertexZ[vertex] = (short)(this.vertexZ[vertex] + deltaZ);
        }
        this.invalidateBounds(-107);
    }

    final static void initializeSocialPanels(ResourceArchive archive, byte obfuscationGuard) {
        UiComponent friendsViewport = null;
        UiComponent friendsViewportAlias = null;
        UiComponent ignoreViewport = null;
        try {
          ok.displayNameChangedSprite = pl.loadRgbSpriteByName("basic", "display_name_changed", (byte) 109, archive);
          GameScreen.friendsListPane = new ScrollPaneWithFooter(0L, rq.field_b, LoginPanel.field_J, ChocolateBackground.field_y);
          f.ignoreListPane = new ScrollPaneWithFooter(0L, rq.field_b, MatchCompleteScreen.field_z, ScreenNavigationHelpers.field_e);
          QuickChatPhraseRegistry.friendsPanel = new UiComponent(0L, (UiComponent) null);
          ChatLobbyUiHelpers.friendsStatusLabel = new UiComponent(0L, CappedUrlRequest.field_l);
          ChatLobbyUiHelpers.friendsStatusLabel.horizontalAlignment = 1;
          MouseWheelSource.friendNameHeading = new UiComponent(0L, MainMenuScreen.field_t, ConnectionPhase.nameColumnHeadingText);
          GameplayScreen.friendLocationHeading = new UiComponent(0L, IntrusiveHashIterator.field_a, ArchiveSource.locationColumnHeadingText);
          BirthDateEntryPanel.field_R = new UiComponent(0L, DualLinkNode.field_t);
          QuickChatPhraseRegistry.friendsPanel.addChild(ChatLobbyUiHelpers.friendsStatusLabel, 0);
          QuickChatPhraseRegistry.friendsPanel.addChild(MouseWheelSource.friendNameHeading, 0);
          QuickChatPhraseRegistry.friendsPanel.addChild(GameplayScreen.friendLocationHeading, 0);
          QuickChatPhraseRegistry.friendsPanel.addChild(GameScreen.friendsListPane, 0);
          QuickChatPhraseRegistry.friendsPanel.addChild(BirthDateEntryPanel.field_R, 0);
          GameScreen.friendsListPane.scrollPane.viewport.copyStyle((byte) -102, CappedUrlRequest.field_l);
          friendsViewport = GameScreen.friendsListPane.scrollPane.viewport;
          friendsViewportAlias = friendsViewport;
          GameScreen.friendsListPane.scrollPane.viewport.verticalAlignment = 1;
          if (obfuscationGuard <= 58) {
            fireworkSpawnMinY = 109;
          }
          friendsViewportAlias.horizontalAlignment = 1;
          f.ignoreListPane.scrollPane.viewport.copyStyle((byte) -115, CappedUrlRequest.field_l);
          ignoreViewport = f.ignoreListPane.scrollPane.viewport;
          f.ignoreListPane.scrollPane.viewport.verticalAlignment = 1;
          ignoreViewport.horizontalAlignment = 1;
        } catch (RuntimeException initializationFailure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) initializationFailure), "fr.I(" + (archive != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static void configureFullscreenDialogFonts(int maximumWrapWidth, TextFont buttonFont, TextFont bodyFont, boolean obfuscationGuard) {
        try {
          ConditionalTextValue.fullscreenDialogWrapWidth = maximumWrapWidth;
          kp.fullscreenDialogButtonFont = buttonFont;
          StateIconLabel.fullscreenDialogBodyFont = bodyFont;
          pp.setFullscreenDialogCenter(Rasterizer2D.width / 2, Rasterizer2D.height / 2, (byte) 19);
          if (!obfuscationGuard) {
            fireworkSpawnMinY = -98;
          }
          MusicCrossfadeStream.configureFullscreenDialogMetrics(buttonFont.capHeight, buttonFont.descent + buttonFont.capHeight, 256, bodyFont.capHeight, bodyFont.descent + bodyFont.capHeight);
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "fr.K(" + maximumWrapWidth + ',' + (buttonFont != null ? "{...}" : "null") + ',' + (bodyFont != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final void scaleVertices(int scaleX, int obfuscationGuard, int divisor, int scaleZ, int scaleY) {
        int vertex = 0;
        int unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard <= 124) {
          return;
        }
        for (vertex = 0; vertex < this.vertexCount; vertex++) {
          this.vertexX[vertex] = (short)(scaleX * this.vertexX[vertex] / divisor);
          this.vertexY[vertex] = (short)(scaleY * this.vertexY[vertex] / divisor);
          this.vertexZ[vertex] = (short)(scaleZ * this.vertexZ[vertex] / divisor);
        }
        this.invalidateBounds(-122);
    }

    public static void b(byte param0) {
        rasterSnapshotPool = null;
        if (param0 != -52) {
          field_l = (int[]) null;
        }
        field_e = null;
        field_l = null;
    }

    private final void invalidateBounds(int obfuscationGuard) {
        this.boundsValid = false;
        if (obfuscationGuard >= -84) {
          this.invalidateBounds(-62);
        }
    }

    final static void updateRematchCaption(int obfuscationGuard) {
        int var2;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (IntArrayRequest.gameplayScreen.isSpectator(124)) {
          return;
        }
        if (obfuscationGuard != 1) {
          rasterSnapshotPool = (NodeDeque) null;
        }
        if (IntArrayRequest.gameplayScreen.resultWordMode) {
          if ((IntArrayRequest.gameplayScreen.match.rematchOfferPlayerMask & 1 << IntArrayRequest.gameplayScreen.localPlayerId) != 0) {
            ArrayWidgetGroup.buttonLabels[12] = ContentTransitionPhase.field_a;
          } else {
            if (IntArrayRequest.gameplayScreen.match.rematchOfferPlayerMask != 0) {
              ArrayWidgetGroup.buttonLabels[12] = qm.field_c;
            } else {
              if ((1 << IntArrayRequest.gameplayScreen.localPlayerId | IntArrayRequest.gameplayScreen.rematchSetupPlayerMask) != (1 << IntArrayRequest.gameplayScreen.match.playerCount) - 1) {
                ArrayWidgetGroup.buttonLabels[12] = ResourcePreparationQueue.field_a;
              } else {
                ArrayWidgetGroup.buttonLabels[12] = TabbedPane.field_Pb;
              }
            }
          }
        } else {
          if ((1 << IntArrayRequest.gameplayScreen.localPlayerId & IntArrayRequest.gameplayScreen.match.rematchOfferPlayerMask) != 0) {
            ArrayWidgetGroup.buttonLabels[12] = LoginCredentials.field_g;
          } else {
            if (0 == IntArrayRequest.gameplayScreen.match.rematchOfferPlayerMask) {
              if ((IntArrayRequest.gameplayScreen.rematchSetupPlayerMask | 1 << IntArrayRequest.gameplayScreen.localPlayerId) != -1 + (1 << IntArrayRequest.gameplayScreen.match.playerCount)) {
                ArrayWidgetGroup.buttonLabels[12] = RectangleBody.field_t;
              } else {
                ArrayWidgetGroup.buttonLabels[12] = GameRenderAudioHelpers.field_b;
              }
            } else {
              ArrayWidgetGroup.buttonLabels[12] = MusicPatch.field_m;
            }
          }
        }
    }

    final void ensureBounds(int obfuscationGuard) {
        int vertex = 0;
        int minimumX;
        int minimumY;
        int minimumZ;
        int maximumX;
        int maximumY;
        int maximumZ;
        int x;
        int y;
        int z;
        int unusedGameFlag;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (this.boundsValid) {
          return;
        }
        this.boundsValid = true;
        minimumX = 32767;
        minimumY = 32767;
        minimumZ = 32767;
        maximumX = -32768;
        if (obfuscationGuard != 23) {
          return;
        }
        maximumY = -32768;
        maximumZ = -32768;
        for (vertex = 0; this.vertexCount > vertex; vertex++) {
          x = this.vertexX[vertex];
          y = this.vertexY[vertex];
          z = this.vertexZ[vertex];
          if (y < minimumY) {
            minimumY = y;
          }
          if (y > maximumY) {
            maximumY = y;
          }
          if (x < minimumX) {
            minimumX = x;
          }
          if (x > maximumX) {
            maximumX = x;
          }
          if (maximumZ < z) {
            maximumZ = z;
          }
          if (z < minimumZ) {
            minimumZ = z;
          }
        }
        this.maxZ = maximumZ;
        this.minX = minimumX;
        this.minY = minimumY;
        this.minZ = minimumZ;
        this.maxY = maximumY;
        this.maxX = maximumX;
    }

    final static void a(boolean param0, String param1, String param2) {
        try {
          if (null != StrongCacheEntry.field_I) {
            StrongCacheEntry.field_I.closeDialog(17);
          }
          DirectByteStorage.field_k = new LoginPanel(param2, param1, false, true, param0);
          rj.accountContentLayer.transitionToContent((byte) 114, DirectByteStorage.field_k);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "fr.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(int param0) {
        ClientResourceHelpers.field_c = new AccountRegistrationPanel();
        if (param0 != -1) {
          return;
        }
        rj.accountContentLayer.transitionToContent((byte) 120, ClientResourceHelpers.field_c);
    }

    Mesh3D() {
        this.faceGroupCount = (byte) 0;
        this.boundsValid = false;
    }

    static {
        rasterSnapshotPool = new NodeDeque();
        field_e = new PcmSound[8];
        field_l = new int[]{44, 45, 8, 23};
    }
}
