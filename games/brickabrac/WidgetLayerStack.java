/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetLayerStack extends SingleChildWidget {
    private NodeDeque layers;
    static UiComponent field_K;
    static String field_G;
    static RgbSprite volcanicMidSprite;
    static String field_H;

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        PlayerBoard var4;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param1 != 21543) {
          var4 = (PlayerBoard) null;
          WidgetLayerStack.a(103, 104, 91, (byte) -14, (PlayerBoard) null, 105, 90);
        }
        if (0 >= ResourceArchiveFactory.windowModeCapabilityWord) {
          var2 = (QuickChatMenu.h(-26090)) ? 0 : 1;
        } else {
          if (null == jj.canvasResizeController) {
            GameplayRenderHelpers.fullscreenCanvas = LoginCredentials.createFullscreenCanvas(0, 0, 640, 480, true, AccountMessageDialog.field_ub);
          } else {
            GameplayRenderHelpers.fullscreenCanvas = jj.canvasResizeController.openFullscreenCanvas(true);
            BrowserResizeNotificationHelpers.notifyBrowserResize(97, 2);
          }
          if (GameplayRenderHelpers.fullscreenCanvas == null) {
            var2 = 3;
          } else {
            var2 = 2;
            CanvasInputHelpers.attachCanvasInput((byte) 117, GameplayRenderHelpers.fullscreenCanvas);
          }
        }
        if (null == jj.canvasResizeController &&
          TextChoiceDialogStyles.field_c) {
          FullscreenDialogHelpers.buildFullscreenDialog(param0, var2, (byte) 104);
        }
    }

    final void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        int var7 = BrickABrac.field_J ? 1 : 0;
        if (this.renderer != null) {
          this.renderer.paintWidget(true, obfuscationGuard - 20607, parentX, (Widget) (this), parentY);
        }
        NodeDequeCursor var5 = new NodeDequeCursor(this.layers);
        Widget var6 = (Widget) (var5.last(true));
        while (var6 != null) {
          var6.drawLayer(parentY + this.y, parentX + this.x, layer, (byte) -11);
          var6 = (Widget) (var5.previous(-24706));
        }
        if (obfuscationGuard != -11) {
          field_G = (String) null;
        }
    }

    public static void j(byte param0) {
        volcanicMidSprite = null;
        field_G = null;
        if (param0 > -91) {
          NineSliceFrame var2 = (NineSliceFrame) null;
          WidgetLayerStack.configureFullscreenDialogButtons(-80, 69, (NineSliceFrame) null, 50, (NineSliceFrame) null, -32);
        }
        field_H = null;
        field_K = null;
    }

    final void hideLayers(int obfuscationGuard) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard > -119) {
          return;
        }
        NodeDequeCursor var2 = new NodeDequeCursor(this.layers);
        WidgetLayer var3 = (WidgetLayer) (var2.first(240));
        while (var3 != null) {
          var3.visible = false;
          var3 = (WidgetLayer) (var2.next(7));
        }
        this.child = null;
    }

    final void pushLayer(int obfuscationGuard, Widget layer) {
        WidgetLayer var3 = null;
        try {
          if (!(layer instanceof WidgetLayer)) {
            throw new IllegalArgumentException();
          }
          var3 = (WidgetLayer) (layer);
          if (obfuscationGuard > -63) {
            WidgetLayerStack.j((byte) -73);
          }
          this.layers.addFirst(true, var3);
          var3.visible = true;
          var3.tryFocus(true, (Widget) (this));
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "cp.M(" + obfuscationGuard + ',' + (layer != null ? "{...}" : "null") + ')');
        }
    }

    final void removeHiddenLayers(byte obfuscationGuard) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        NodeDequeCursor var2 = new NodeDequeCursor(this.layers);
        WidgetLayer var3 = (WidgetLayer) (var2.first(240));
        if (obfuscationGuard != -36) {
          return;
        }
        while (var3 != null) {
          if (var3.updateOpacityAndCheckHidden(-94)) {
            var3.unlink((byte) 111);
          }
          var3 = (WidgetLayer) (var2.next(obfuscationGuard ^ -37));
        }
    }

    public WidgetLayerStack() {
        super(0, 0, SpriteGeometry.field_y, TextFieldRenderer.field_w, (WidgetRenderer) null, (WidgetListener) null);
        this.layers = new NodeDeque();
    }

    final static LegacyEmailValidationError validateLegacyEmailAddress(String address, byte obfuscationGuard) {
        int atIndex = 0;
        RuntimeException failure = null;
        String localPart = null;
        String domain = null;
        LegacyEmailValidationError localPartError = null;
        LegacyEmailValidationError missingAddressError = null;
        LegacyEmailValidationError missingAtError = null;
        LegacyEmailValidationError guardSuccessValue = null;
        LegacyEmailValidationError returnedLocalPartError = null;
        LegacyEmailValidationError domainError = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String addressSummary = null;
        RuntimeException caughtFailure = null;
        try {
          if (address != null &&
            address.length() != 0) {
            atIndex = address.indexOf('@');
            if (-1 == atIndex) {
              missingAtError = RasterEffectHelpers.missingEmailPart;
              return missingAtError;
            }
            localPart = address.substring(0, atIndex);
            domain = address.substring(atIndex + 1);
            if (obfuscationGuard >= -16) {
              guardSuccessValue = (LegacyEmailValidationError) null;
              return guardSuccessValue;
            }
            localPartError = SingleChildWidget.validateEmailLocalPart(localPart, false);
            if (localPartError == null) {
              domainError = IterableIntrusiveHashTable.validateEmailDomain(domain, 0);
              return domainError;
            }
            returnedLocalPartError = localPartError;
            return returnedLocalPartError;
          }
          missingAddressError = ByteStorage.missingEmailAddress;
          return missingAddressError;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("cp.L(");
          if (address == null) {
            addressSummary = "null";
          } else {
            addressSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(addressSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void configureFullscreenDialogButtons(int paddingY, int gapY, NineSliceFrame selectedFrame, int obfuscationGuard, NineSliceFrame normalFrame, int paddingX) {
        try {
          QuickChatCategoryDefinition.fullscreenDialogButtonGapY = gapY;
          GameOverlayHelpers.fullscreenDialogButtonPaddingX = paddingX;
          if (obfuscationGuard <= 25) {
            WidgetLayerStack.drawFullscreenDialogRows(24);
          }
          LoginCredentialKind.fullscreenDialogButtonFrame = normalFrame;
          DropTargetWidget.fullscreenDialogButtonPaddingY = paddingY;
          GrowableIntList.fullscreenDialogSelectedFrame = selectedFrame;
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "cp.Q(" + paddingY + ',' + gapY + ',' + (selectedFrame != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + (normalFrame != null ? "{...}" : "null") + ',' + paddingX + ')');
        }
    }

    final void i(int param0) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        int var3 = 18 / ((36 - param0) / 43);
        NodeDequeCursor var2 = new NodeDequeCursor(this.layers);
        WidgetLayer var4 = (WidgetLayer) (var2.first(240));
        while (var4 != null) {
          if (var4.tickLayerAndCheckHidden(0)) {
            var4.unlink((byte) 111);
          }
          var4 = (WidgetLayer) (var2.next(7));
        }
        this.child = (Widget) ((Object) this.getTopVisibleLayer(-126));
    }

    final static void drawFullscreenDialogRows(int obfuscationGuard) {
        int rowIndex = 0;
        int maximumPrefixLines = 0;
        int maximumSuffixLines = 0;
        String singularPrefixText = null;
        String singularSuffixText = null;
        NineSliceFrame selectedFrame = null;
        RuntimeException caughtFailure = null;
        int rowY = 0;
        RuntimeException failure = null;
        int secondsRemaining = 0;
        long elapsedMillis = 0L;
        int buttonIndex = 0;
        int paint = 0;
        String text = null;
        int prefixLineCount = 0;
        int suffixLineCount = 0;
        NineSliceFrame frame = null;
        int unusedGameFlag = 0;
        PlayerBoard unusedBoard = null;
        int textWidth;
        int textX;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          rowY = CachedArchiveSource.fullscreenDialogTop;
          secondsRemaining = 0;
          if (obfuscationGuard != -16546) {
            unusedBoard = (PlayerBoard) null;
            WidgetLayerStack.a(-114, -15, 90, (byte) -109, (PlayerBoard) null, -85, -67);
          }
          if (ArchiveFetchClient.fullscreenDialogKind == 2) {
            elapsedMillis = -CalendarRankingHelpers.fullscreenConfirmationStartMillis + MonotonicTime.nowMillis(false);
            secondsRemaining = (int)((-elapsedMillis + 10999L) / 1000L);
            if (0 > secondsRemaining) {
              secondsRemaining = 0;
            }
          }
          for (rowIndex = 0; ValidationStatus.fullscreenDialogRows.length > rowIndex; rowIndex++) {
            buttonIndex = BrickABrac.fullscreenDialogRowButtons[rowIndex];
            if (buttonIndex < 0) {
              paint = NewAchievementsScreen.fullscreenDialogBodyPaint;
            } else {
              if (UiComponent.fullscreenDialogSelection.selectedIndex != buttonIndex) {
                paint = EmailLoginCredentials.fullscreenDialogButtonPaint;
              } else {
                paint = LevelCompleteScreen.fullscreenDialogSelectedPaint;
              }
            }
            text = ValidationStatus.fullscreenDialogRows[rowIndex];
            if (2 == ArchiveFetchClient.fullscreenDialogKind &&
              1 == secondsRemaining) {
              if (QuickChatPhraseRegistry.fullscreenSingularPrefix.length >= IntrusiveHashIterator.fullscreenPluralPrefix.length) {
                maximumPrefixLines = QuickChatPhraseRegistry.fullscreenSingularPrefix.length;
              } else {
                maximumPrefixLines = IntrusiveHashIterator.fullscreenPluralPrefix.length;
              }
              prefixLineCount = maximumPrefixLines;
              if (HuffmanCodec.fullscreenPluralSuffix.length <= SingleChildWidget.fullscreenSingularSuffix.length) {
                maximumSuffixLines = SingleChildWidget.fullscreenSingularSuffix.length;
              } else {
                maximumSuffixLines = HuffmanCodec.fullscreenPluralSuffix.length;
              }
              suffixLineCount = maximumSuffixLines;
              if (rowIndex >= 6 &&
                6 + prefixLineCount > rowIndex) {
                if (-prefixLineCount - 6 + rowIndex + QuickChatPhraseRegistry.fullscreenSingularPrefix.length < 0) {
                  singularPrefixText = "";
                } else {
                  singularPrefixText = QuickChatPhraseRegistry.fullscreenSingularPrefix[-prefixLineCount + rowIndex + (-6 + QuickChatPhraseRegistry.fullscreenSingularPrefix.length)];
                }
                text = singularPrefixText;
              }
              if (7 + prefixLineCount <= rowIndex &&
                7 - (-prefixLineCount - suffixLineCount) > rowIndex) {
                if (-prefixLineCount + (rowIndex - 7) < SingleChildWidget.fullscreenSingularSuffix.length) {
                  singularSuffixText = SingleChildWidget.fullscreenSingularSuffix[rowIndex + (-7 - prefixLineCount)];
                } else {
                  singularSuffixText = "";
                }
                text = singularSuffixText;
              }
            }
            if (-2 == buttonIndex) {
              text = Integer.toString(secondsRemaining);
            }
            textWidth = hm.measureFullscreenDialogText(!(0 > buttonIndex), text, 0);
            textX = ProxySocketConnector.fullscreenDialogCenterX - (textWidth >> 1);
            if (buttonIndex >= 0) {
              rowY = rowY + QuickChatCategoryDefinition.fullscreenDialogButtonGapY;
              if (UiComponent.fullscreenDialogSelection.selectedIndex != buttonIndex) {
                selectedFrame = LoginCredentialKind.fullscreenDialogButtonFrame;
              } else {
                selectedFrame = GrowableIntList.fullscreenDialogSelectedFrame;
              }
              frame = selectedFrame;
              if (frame != null) {
                frame.paintFrame((GameOverlayHelpers.fullscreenDialogButtonPaddingX << 1) + textWidth, MouseInputCleanup.fullscreenDialogButtonLineHeight + (DropTargetWidget.fullscreenDialogButtonPaddingY << 1), -GameOverlayHelpers.fullscreenDialogButtonPaddingX + textX, false, rowY);
              }
              rowY = rowY + DropTargetWidget.fullscreenDialogButtonPaddingY;
            }
            if (buttonIndex >= 0) {
              LevelResultWireHelpers.fullscreenDialogButtonFont.drawLeft(text, textX, rowY + QuickChatCategoryRegistry.fullscreenDialogButtonBaseline, paint, -1);
              rowY = rowY + (DropTargetWidget.fullscreenDialogButtonPaddingY + (QuickChatCategoryDefinition.fullscreenDialogButtonGapY + MouseInputCleanup.fullscreenDialogButtonLineHeight));
            } else {
              StateIconLabel.fullscreenDialogBodyFont.drawLeft(text, textX, rowY + DualLinkIterator.fullscreenDialogBodyBaseline, paint, -1);
              rowY = rowY + IntArrayRequest.fullscreenDialogBodyLineHeight;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "cp.F(" + obfuscationGuard + ')');
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, PlayerBoard param4, int param5, int param6) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_8_3 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        RgbSprite var9 = null;
        int var8Lifetime1;
        try {
          if (param4.maskedTicks < 50) {
            return;
          }
          var7_int = param4.maskedTicks - 50;
          var8 = var7_int * 96 / 100;
          if (var8 > 96) {
            var8 = 96;
          }
          stackIn_7_0 = param0;
          stackIn_7_1 = param5;
          stackIn_7_2 = param1 / param6;
          if (param6 != 1) {
            stackIn_8_3 = 0;
          } else {
            stackIn_8_3 = 35;
          }
          Rasterizer2D.fillRectangleAlpha(stackIn_7_0, stackIn_7_1, stackIn_7_2, -stackIn_8_3 + param2 / param6, 0, var8);
          if (150 < var7_int * 2 &&
            param4.resultCode > 0 &&
            param4.resultCode - 1 < ArchiveNetworkClient.activeRosetteSprites.length) {
            var8Lifetime1 = -75 + var7_int;
            if (50 < var8Lifetime1) {
              var8Lifetime1 = 50;
            }
            var8Lifetime1 = 256 * var8Lifetime1 / 50;
            var9 = ArchiveNetworkClient.activeRosetteSprites[param4.resultCode - 1];
            var9.b(param0 + (param1 - param6 * var9.canvasWidth) / (param6 * 2), param5 + (param2 - var9.canvasHeight * param6) / (param6 * 2), var8Lifetime1);
            LegacyEmailValidationError.drawBoardResultWord(param1, var8Lifetime1, 60, param0, param6, param5, param2, param4);
          }
          if (param3 < 118) {
            WidgetLayerStack.a(true, 86);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_21_0 = var7;
          stackIn_21_1 = new StringBuilder().append("cp.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static TableDataRequest requestTableData(int obfuscationGuard, int tableId, int columnCount, int rowLimit, int opcode) {
        int clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        TableDataRequest request = (TableDataRequest) (GameplayAudioEvent.pendingTableRequests.first(-91));
        while (request != null) {
          if (~request.tableId == ~tableId) {
            return request;
          }
          request = (TableDataRequest) (GameplayAudioEvent.pendingTableRequests.next((byte) 116));
        }
        TableDataRequest created = new TableDataRequest();
        request = created;
        created.rowLimit = rowLimit;
        created.columnCount = columnCount;
        if (obfuscationGuard != -2) {
          return (TableDataRequest) null;
        }
        request.tableId = tableId;
        GameplayAudioEvent.pendingTableRequests.addLast(request, (byte) 3);
        AppletResourceHelpers.sendTableRequest(request, opcode, (byte) 68);
        return request;
    }

    final Widget h(byte param0) {
        NodeDequeCursor var2;
        WidgetLayer var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = new NodeDequeCursor(this.layers);
        if (param0 != 25) {
          WidgetLayerStack.j((byte) -34);
        }
        var3 = (WidgetLayer) (var2.first(param0 + 215));
        while (var3 != null) {
          if (var3.visible) {
            return var3.g((byte) -3);
          }
          var3 = (WidgetLayer) (var2.next(7));
        }
        return null;
    }

    final WidgetLayer getTopVisibleLayer(int obfuscationGuard) {
        NodeDequeCursor var2;
        WidgetLayer var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard >= -96) {
          field_G = (String) null;
        }
        var2 = new NodeDequeCursor(this.layers);
        var3 = (WidgetLayer) (var2.first(240));
        while (var3 != null) {
          if (var3.visible) {
            return var3;
          }
          var3 = (WidgetLayer) (var2.next(7));
        }
        return null;
    }

    static {
        field_H = "<%0> would need a rating of <%1> to play with the current options.";
        field_G = "Confirm Password: ";
    }
}
