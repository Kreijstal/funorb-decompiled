/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenDialogHelpers {
    static String field_a;
    static DiagnosticTextLine renderRateDiagnosticLine;
    static int maxArchiveContainerBytes;
    static RgbSprite[] field_c;
    static String field_f;
    static RgbSprite[][] field_e;

    public static void a(boolean param0) {
        field_e = (RgbSprite[][]) null;
        field_f = null;
        field_c = null;
        renderRateDiagnosticLine = null;
        field_a = null;
        if (!param0) {
          FullscreenDialogHelpers.buildFullscreenDialog(false, 57, (byte) -48);
        }
    }

    final static ResourceArchive createConfiguredArchive(int obfuscationGuard, int decodedFilePolicy, boolean discardPackedGroups, int archiveId, boolean prefetch) {
        if (obfuscationGuard != -6) {
          field_c = (RgbSprite[]) null;
        }
        return ResourceArchiveFactory.createResourceArchive(prefetch, archiveId, false, decodedFilePolicy, discardPackedGroups, true);
    }

    final static MenuScreen lookupMenuScreen(int screenId, int obfuscationGuard) {
        if (obfuscationGuard != 28472) {
          return (MenuScreen) null;
        }
        return DelayedPacket.menuScreens[screenId];
    }

    final static void buildFullscreenDialog(boolean usePointer, int promptKind, byte obfuscationGuard) {
        int maximumPrefixLines = 0;
        int maximumSuffixLines = 0;
        String[] prefixRowsTarget = null;
        int prefixRowIndex = 0;
        String prefixRowText = null;
        String[] suffixRowsTarget = null;
        int suffixRowIndex = 0;
        int invertedSuffixLength = 0;
        int invertedSuffixIndex = 0;
        String suffixRowText = null;
        boolean isButtonRow = false;
        int heightSoFar = 0;
        int rowHeight = 0;
        RuntimeException caughtFailure = null;
        int wrappedLineCount = 0;
        RuntimeException failure = null;
        int rowCountOrMarkerIndex = 0;
        String[] prefixLinesAlias = null;
        int rowIndexOrPrefixCount = 0;
        int suffixLineCount = 0;
        int confirmationRowCount = 0;
        int rowFillIndex = 0;
        int unusedGameFlag = 0;
        String[] prefixLines = null;
        String prefixLine = null;
        String suffixLine = null;
        String[] suffixLinesAlias;
        int measuredRowWidth;
        int prefixMeasureIndex;
        int rowY;
        int buttonIndex;
        int buttonLeft;
        int maximumTextWidth;
        int measureRowIndex;
        int heightRowIndex;
        int boundsRowIndex;
        int prefixMeasuredWidth;
        int buttonTextWidth;
        int prefixFillIndex;
        int suffixFillIndex;
        int suffixMeasureIndex;
        int suffixMeasuredWidth;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          IntrusiveHashIterator.fullscreenDialogOpen = true;
          ArchiveFetchClient.fullscreenDialogKind = promptKind;
          if (0 == ArchiveFetchClient.fullscreenDialogKind) {
            wrappedLineCount = FarmBackground.wrapBalancedDialogText(CacheIoWorker.fullscreenDialogWrapScratch, ConditionalTextValue.fullscreenDialogWrapWidth, -63, StateIconLabel.fullscreenDialogBodyFont, StatefulWidgetRenderer.field_x);
            rowCountOrMarkerIndex = 3 + wrappedLineCount;
            BrickABrac.fullscreenDialogRowButtons = new int[rowCountOrMarkerIndex];
            ValidationStatus.fullscreenDialogRows = new String[rowCountOrMarkerIndex];
            for (rowIndexOrPrefixCount = 0; rowCountOrMarkerIndex > rowIndexOrPrefixCount; rowIndexOrPrefixCount++) {
              BrickABrac.fullscreenDialogRowButtons[rowIndexOrPrefixCount] = -1;
            }
            UsernameSuggestionPanel.fullscreenDialogButtonActions = new int[2];
            for (rowIndexOrPrefixCount = 0; rowIndexOrPrefixCount < wrappedLineCount; rowIndexOrPrefixCount++) {
              ValidationStatus.fullscreenDialogRows[rowIndexOrPrefixCount] = CacheIoWorker.fullscreenDialogWrapScratch[rowIndexOrPrefixCount];
            }
            ValidationStatus.fullscreenDialogRows[rowCountOrMarkerIndex - 3] = "";
            ValidationStatus.fullscreenDialogRows[rowCountOrMarkerIndex - 2] = PasswordValidator.field_q;
            BrickABrac.fullscreenDialogRowButtons[rowCountOrMarkerIndex - 2] = 0;
            UsernameSuggestionPanel.fullscreenDialogButtonActions[0] = 4;
            ValidationStatus.fullscreenDialogRows[-1 + rowCountOrMarkerIndex] = LevelSequence.field_a;
            BrickABrac.fullscreenDialogRowButtons[-1 + rowCountOrMarkerIndex] = 1;
            UsernameSuggestionPanel.fullscreenDialogButtonActions[1] = 5;
          } else if (1 == ArchiveFetchClient.fullscreenDialogKind) {
            wrappedLineCount = FarmBackground.wrapBalancedDialogText(CacheIoWorker.fullscreenDialogWrapScratch, ConditionalTextValue.fullscreenDialogWrapWidth, obfuscationGuard ^ -87, StateIconLabel.fullscreenDialogBodyFont, StatefulWidgetRenderer.field_x);
            rowCountOrMarkerIndex = 2 + wrappedLineCount;
            BrickABrac.fullscreenDialogRowButtons = new int[rowCountOrMarkerIndex];
            ValidationStatus.fullscreenDialogRows = new String[rowCountOrMarkerIndex];
            for (rowIndexOrPrefixCount = 0; rowIndexOrPrefixCount < rowCountOrMarkerIndex; rowIndexOrPrefixCount++) {
              BrickABrac.fullscreenDialogRowButtons[rowIndexOrPrefixCount] = -1;
            }
            UsernameSuggestionPanel.fullscreenDialogButtonActions = new int[1];
            for (rowIndexOrPrefixCount = 0; rowIndexOrPrefixCount < wrappedLineCount; rowIndexOrPrefixCount++) {
              ValidationStatus.fullscreenDialogRows[rowIndexOrPrefixCount] = CacheIoWorker.fullscreenDialogWrapScratch[rowIndexOrPrefixCount];
            }
            ValidationStatus.fullscreenDialogRows[rowCountOrMarkerIndex - 2] = "";
            ValidationStatus.fullscreenDialogRows[-1 + rowCountOrMarkerIndex] = LevelSequence.field_a;
            BrickABrac.fullscreenDialogRowButtons[-1 + rowCountOrMarkerIndex] = 0;
            UsernameSuggestionPanel.fullscreenDialogButtonActions[0] = 5;
          } else if (2 != ArchiveFetchClient.fullscreenDialogKind) {
            if (3 == ArchiveFetchClient.fullscreenDialogKind) {
              if (AccountMessageDialog.field_ub.privilegedMode) {
                wrappedLineCount = FarmBackground.wrapBalancedDialogText(CacheIoWorker.fullscreenDialogWrapScratch, ConditionalTextValue.fullscreenDialogWrapWidth, -63, StateIconLabel.fullscreenDialogBodyFont, LoginCredentials.field_a);
              } else {
                wrappedLineCount = FarmBackground.wrapBalancedDialogText(CacheIoWorker.fullscreenDialogWrapScratch, ConditionalTextValue.fullscreenDialogWrapWidth, obfuscationGuard ^ -87, StateIconLabel.fullscreenDialogBodyFont, df.field_d);
              }
              rowCountOrMarkerIndex = 2 + wrappedLineCount;
              ValidationStatus.fullscreenDialogRows = new String[rowCountOrMarkerIndex];
              BrickABrac.fullscreenDialogRowButtons = new int[rowCountOrMarkerIndex];
              for (rowIndexOrPrefixCount = 0; rowCountOrMarkerIndex > rowIndexOrPrefixCount; rowIndexOrPrefixCount++) {
                BrickABrac.fullscreenDialogRowButtons[rowIndexOrPrefixCount] = -1;
              }
              UsernameSuggestionPanel.fullscreenDialogButtonActions = new int[1];
              for (rowIndexOrPrefixCount = 0; rowIndexOrPrefixCount < wrappedLineCount; rowIndexOrPrefixCount++) {
                ValidationStatus.fullscreenDialogRows[rowIndexOrPrefixCount] = CacheIoWorker.fullscreenDialogWrapScratch[rowIndexOrPrefixCount];
              }
              ValidationStatus.fullscreenDialogRows[rowCountOrMarkerIndex - 2] = "";
              ValidationStatus.fullscreenDialogRows[rowCountOrMarkerIndex - 1] = LevelSequence.field_a;
              BrickABrac.fullscreenDialogRowButtons[-1 + rowCountOrMarkerIndex] = 0;
              UsernameSuggestionPanel.fullscreenDialogButtonActions[0] = 5;
            } else if (ArchiveFetchClient.fullscreenDialogKind == 4) {
              wrappedLineCount = FarmBackground.wrapBalancedDialogText(CacheIoWorker.fullscreenDialogWrapScratch, ConditionalTextValue.fullscreenDialogWrapWidth, -63, StateIconLabel.fullscreenDialogBodyFont, ChocolateBackground.field_s);
              rowCountOrMarkerIndex = wrappedLineCount + 2;
              ValidationStatus.fullscreenDialogRows = new String[rowCountOrMarkerIndex];
              BrickABrac.fullscreenDialogRowButtons = new int[rowCountOrMarkerIndex];
              for (rowIndexOrPrefixCount = 0; rowCountOrMarkerIndex > rowIndexOrPrefixCount; rowIndexOrPrefixCount++) {
                BrickABrac.fullscreenDialogRowButtons[rowIndexOrPrefixCount] = -1;
              }
              UsernameSuggestionPanel.fullscreenDialogButtonActions = new int[1];
              for (rowIndexOrPrefixCount = 0; wrappedLineCount > rowIndexOrPrefixCount; rowIndexOrPrefixCount++) {
                ValidationStatus.fullscreenDialogRows[rowIndexOrPrefixCount] = CacheIoWorker.fullscreenDialogWrapScratch[rowIndexOrPrefixCount];
              }
              ValidationStatus.fullscreenDialogRows[rowCountOrMarkerIndex - 2] = "";
              ValidationStatus.fullscreenDialogRows[rowCountOrMarkerIndex - 1] = LevelSequence.field_a;
              BrickABrac.fullscreenDialogRowButtons[-1 + rowCountOrMarkerIndex] = 0;
              UsernameSuggestionPanel.fullscreenDialogButtonActions[0] = 5;
            } else {
              if (ArchiveFetchClient.fullscreenDialogKind != 5) {
                throw new IllegalArgumentException();
              }
              wrappedLineCount = FarmBackground.wrapBalancedDialogText(CacheIoWorker.fullscreenDialogWrapScratch, ConditionalTextValue.fullscreenDialogWrapWidth, -63, StateIconLabel.fullscreenDialogBodyFont, DirectByteStorage.field_h);
              rowCountOrMarkerIndex = 3 + wrappedLineCount;
              BrickABrac.fullscreenDialogRowButtons = new int[rowCountOrMarkerIndex];
              ValidationStatus.fullscreenDialogRows = new String[rowCountOrMarkerIndex];
              for (rowIndexOrPrefixCount = 0; rowIndexOrPrefixCount < rowCountOrMarkerIndex; rowIndexOrPrefixCount++) {
                BrickABrac.fullscreenDialogRowButtons[rowIndexOrPrefixCount] = -1;
              }
              UsernameSuggestionPanel.fullscreenDialogButtonActions = new int[2];
              for (rowIndexOrPrefixCount = 0; wrappedLineCount > rowIndexOrPrefixCount; rowIndexOrPrefixCount++) {
                ValidationStatus.fullscreenDialogRows[rowIndexOrPrefixCount] = CacheIoWorker.fullscreenDialogWrapScratch[rowIndexOrPrefixCount];
              }
              ValidationStatus.fullscreenDialogRows[rowCountOrMarkerIndex - 3] = "";
              ValidationStatus.fullscreenDialogRows[rowCountOrMarkerIndex - 2] = ja.field_b;
              BrickABrac.fullscreenDialogRowButtons[rowCountOrMarkerIndex - 2] = 0;
              UsernameSuggestionPanel.fullscreenDialogButtonActions[0] = 3;
              ValidationStatus.fullscreenDialogRows[rowCountOrMarkerIndex - 1] = LevelSequence.field_a;
              BrickABrac.fullscreenDialogRowButtons[-1 + rowCountOrMarkerIndex] = 1;
              UsernameSuggestionPanel.fullscreenDialogButtonActions[1] = 5;
            }
          } else {
            wrappedLineCount = FarmBackground.wrapBalancedDialogText(CacheIoWorker.fullscreenDialogWrapScratch, ConditionalTextValue.fullscreenDialogWrapWidth, -63, StateIconLabel.fullscreenDialogBodyFont, GamePresentationHelpers.formatIndexedText(PowerUp.field_x, new String[]{"<br><%0><br>"}, (byte) 103));
            rowCountOrMarkerIndex = -1;
            for (rowIndexOrPrefixCount = 0; rowIndexOrPrefixCount < wrappedLineCount; rowIndexOrPrefixCount++) {
              if (!"<%0>".equals(CacheIoWorker.fullscreenDialogWrapScratch[rowIndexOrPrefixCount])) {
                continue;
              }
              rowCountOrMarkerIndex = rowIndexOrPrefixCount;
              break;
            }
            if (-1 == rowCountOrMarkerIndex) {
              throw new IllegalStateException();
            }
            QuickChatPhraseRegistry.fullscreenSingularPrefix = new String[rowCountOrMarkerIndex];
            ArrayOperations.copy(CacheIoWorker.fullscreenDialogWrapScratch, 0, QuickChatPhraseRegistry.fullscreenSingularPrefix, 0, rowCountOrMarkerIndex);
            SingleChildWidget.fullscreenSingularSuffix = new String[-1 - rowCountOrMarkerIndex + wrappedLineCount];
            ArrayOperations.copy(CacheIoWorker.fullscreenDialogWrapScratch, 1 + rowCountOrMarkerIndex, SingleChildWidget.fullscreenSingularSuffix, 0, -1 + (-rowCountOrMarkerIndex + wrappedLineCount));
            wrappedLineCount = FarmBackground.wrapBalancedDialogText(CacheIoWorker.fullscreenDialogWrapScratch, ConditionalTextValue.fullscreenDialogWrapWidth, -63, StateIconLabel.fullscreenDialogBodyFont, GamePresentationHelpers.formatIndexedText(u.field_e, new String[]{"<br><%0><br>"}, (byte) 103));
            rowCountOrMarkerIndex = -1;
            for (rowIndexOrPrefixCount = 0; wrappedLineCount > rowIndexOrPrefixCount; rowIndexOrPrefixCount++) {
              if (!"<%0>".equals(CacheIoWorker.fullscreenDialogWrapScratch[rowIndexOrPrefixCount])) {
                continue;
              }
              rowCountOrMarkerIndex = rowIndexOrPrefixCount;
              break;
            }
            if (rowCountOrMarkerIndex == -1) {
              throw new IllegalStateException();
            }
            IntrusiveHashIterator.fullscreenPluralPrefix = new String[rowCountOrMarkerIndex];
            ArrayOperations.copy(CacheIoWorker.fullscreenDialogWrapScratch, 0, IntrusiveHashIterator.fullscreenPluralPrefix, 0, rowCountOrMarkerIndex);
            HuffmanCodec.fullscreenPluralSuffix = new String[wrappedLineCount - (rowCountOrMarkerIndex + 1)];
            ArrayOperations.copy(CacheIoWorker.fullscreenDialogWrapScratch, rowCountOrMarkerIndex + 1, HuffmanCodec.fullscreenPluralSuffix, 0, -1 + (wrappedLineCount - rowCountOrMarkerIndex));
            if (IntrusiveHashIterator.fullscreenPluralPrefix.length > QuickChatPhraseRegistry.fullscreenSingularPrefix.length) {
              maximumPrefixLines = IntrusiveHashIterator.fullscreenPluralPrefix.length;
            } else {
              maximumPrefixLines = QuickChatPhraseRegistry.fullscreenSingularPrefix.length;
            }
            rowIndexOrPrefixCount = maximumPrefixLines;
            if (HuffmanCodec.fullscreenPluralSuffix.length <= SingleChildWidget.fullscreenSingularSuffix.length) {
              maximumSuffixLines = SingleChildWidget.fullscreenSingularSuffix.length;
            } else {
              maximumSuffixLines = HuffmanCodec.fullscreenPluralSuffix.length;
            }
            suffixLineCount = maximumSuffixLines;
            confirmationRowCount = suffixLineCount + (rowIndexOrPrefixCount + 7);
            BrickABrac.fullscreenDialogRowButtons = new int[confirmationRowCount];
            ValidationStatus.fullscreenDialogRows = new String[confirmationRowCount];
            for (rowFillIndex = 0; rowFillIndex < confirmationRowCount; rowFillIndex++) {
              BrickABrac.fullscreenDialogRowButtons[rowFillIndex] = -1;
            }
            ValidationStatus.fullscreenDialogRows[0] = MultiValueSliderRenderer.field_k;
            ValidationStatus.fullscreenDialogRows[1] = GrowableIntList.field_c;
            BrickABrac.fullscreenDialogRowButtons[1] = 0;
            UsernameSuggestionPanel.fullscreenDialogButtonActions = new int[2];
            BrickABrac.fullscreenDialogRowButtons[3] = 1;
            UsernameSuggestionPanel.fullscreenDialogButtonActions[1] = 2;
            ValidationStatus.fullscreenDialogRows[4] = u.field_f;
            UsernameSuggestionPanel.fullscreenDialogButtonActions[0] = 5;
            ValidationStatus.fullscreenDialogRows[2] = GameConnectionHelpers.field_e;
            ValidationStatus.fullscreenDialogRows[5] = "";
            ValidationStatus.fullscreenDialogRows[3] = di.field_c;
            for (prefixFillIndex = 0; prefixFillIndex < rowIndexOrPrefixCount; prefixFillIndex++) {
              prefixRowsTarget = ValidationStatus.fullscreenDialogRows;
              prefixRowIndex = 6 + prefixFillIndex;
              if (0 > prefixFillIndex - (-IntrusiveHashIterator.fullscreenPluralPrefix.length + rowIndexOrPrefixCount)) {
                prefixRowText = "";
              } else {
                prefixRowText = IntrusiveHashIterator.fullscreenPluralPrefix[-rowIndexOrPrefixCount + (IntrusiveHashIterator.fullscreenPluralPrefix.length + prefixFillIndex)];
              }
              prefixRowsTarget[prefixRowIndex] = prefixRowText;
            }
            ValidationStatus.fullscreenDialogRows[6 + rowIndexOrPrefixCount] = null;
            BrickABrac.fullscreenDialogRowButtons[6 + rowIndexOrPrefixCount] = -2;
            for (suffixFillIndex = 0; suffixFillIndex < suffixLineCount; suffixFillIndex++) {
              suffixRowsTarget = ValidationStatus.fullscreenDialogRows;
              suffixRowIndex = 7 + (rowIndexOrPrefixCount + suffixFillIndex);
              invertedSuffixLength = ~HuffmanCodec.fullscreenPluralSuffix.length;
              invertedSuffixIndex = ~suffixFillIndex;
              if (invertedSuffixLength >= invertedSuffixIndex) {
                suffixRowText = "";
              } else {
                suffixRowText = HuffmanCodec.fullscreenPluralSuffix[suffixFillIndex];
              }
              suffixRowsTarget[suffixRowIndex] = suffixRowText;
            }
            un.fullscreenConfirmationStartMillis = MonotonicTime.nowMillis(false);
          }
          UiComponent.fullscreenDialogSelection.itemCount = UsernameSuggestionPanel.fullscreenDialogButtonActions.length;
          maximumTextWidth = 0;
          if (obfuscationGuard != 104) {
            return;
          }
          for (measureRowIndex = 0; measureRowIndex < ValidationStatus.fullscreenDialogRows.length; measureRowIndex++) {
            isButtonRow = !(BrickABrac.fullscreenDialogRowButtons[measureRowIndex] < 0);
            measuredRowWidth = hm.measureFullscreenDialogText(isButtonRow, ValidationStatus.fullscreenDialogRows[measureRowIndex], 0);
            if (measuredRowWidth > maximumTextWidth) {
              maximumTextWidth = measuredRowWidth;
            }
          }
          if (ArchiveFetchClient.fullscreenDialogKind == 2) {
            prefixLines = QuickChatPhraseRegistry.fullscreenSingularPrefix;
            prefixLinesAlias = prefixLines;
            for (prefixMeasureIndex = 0; prefixLines.length > prefixMeasureIndex; prefixMeasureIndex++) {
              prefixLine = prefixLines[prefixMeasureIndex];
              prefixMeasuredWidth = hm.measureFullscreenDialogText(false, prefixLine, obfuscationGuard - 104);
              if (prefixMeasuredWidth > maximumTextWidth) {
                maximumTextWidth = prefixMeasuredWidth;
              }
            }
            suffixLinesAlias = SingleChildWidget.fullscreenSingularSuffix;
            for (suffixMeasureIndex = 0; suffixLinesAlias.length > suffixMeasureIndex; suffixMeasureIndex++) {
              suffixLine = suffixLinesAlias[suffixMeasureIndex];
              suffixMeasuredWidth = hm.measureFullscreenDialogText(false, suffixLine, 0);
              if (maximumTextWidth < suffixMeasuredWidth) {
                maximumTextWidth = suffixMeasuredWidth;
              }
            }
          }
          jj.fullscreenDialogHeight = UiComponent.fullscreenDialogSelection.itemCount * (QuickChatCategoryDefinition.fullscreenDialogButtonGapY + DropTargetWidget.fullscreenDialogButtonPaddingY << 1);
          np.fullscreenDialogLeft = ProxySocketConnector.fullscreenDialogCenterX - (maximumTextWidth >> 1);
          SpaceBackground.fullscreenDialogRight = -(maximumTextWidth >> 1) + (maximumTextWidth + ProxySocketConnector.fullscreenDialogCenterX);
          for (heightRowIndex = 0; ValidationStatus.fullscreenDialogRows.length > heightRowIndex; heightRowIndex++) {
            heightSoFar = jj.fullscreenDialogHeight;
            if (BrickABrac.fullscreenDialogRowButtons[heightRowIndex] >= 0) {
              rowHeight = b.fullscreenDialogButtonLineHeight;
            } else {
              rowHeight = IntArrayRequest.fullscreenDialogBodyLineHeight;
            }
            jj.fullscreenDialogHeight = heightSoFar + rowHeight;
          }
          CachedArchiveSource.fullscreenDialogTop = -(jj.fullscreenDialogHeight >> 1) + ScreenshotViewer.fullscreenDialogCenterY;
          ce.fullscreenDialogButtonBounds = new int[ValidationStatus.fullscreenDialogRows.length][];
          boundsRowIndex = 0;
          rowY = CachedArchiveSource.fullscreenDialogTop;
          while (boundsRowIndex < ValidationStatus.fullscreenDialogRows.length) {
            buttonIndex = BrickABrac.fullscreenDialogRowButtons[boundsRowIndex];
            if (buttonIndex >= 0) {
              buttonTextWidth = hm.measureFullscreenDialogText(true, ValidationStatus.fullscreenDialogRows[boundsRowIndex], obfuscationGuard - 104);
              buttonLeft = ProxySocketConnector.fullscreenDialogCenterX - (buttonTextWidth >> 1);
              rowY = rowY + QuickChatCategoryDefinition.fullscreenDialogButtonGapY;
              ce.fullscreenDialogButtonBounds[boundsRowIndex] = new int[4];
              ce.fullscreenDialogButtonBounds[boundsRowIndex][0] = -GameOverlayHelpers.fullscreenDialogButtonPaddingX + buttonLeft;
              ce.fullscreenDialogButtonBounds[boundsRowIndex][1] = rowY;
              ce.fullscreenDialogButtonBounds[boundsRowIndex][2] = (GameOverlayHelpers.fullscreenDialogButtonPaddingX << 1) + buttonTextWidth;
              rowY = rowY + (QuickChatCategoryDefinition.fullscreenDialogButtonGapY + ((DropTargetWidget.fullscreenDialogButtonPaddingY << 1) + b.fullscreenDialogButtonLineHeight));
              ce.fullscreenDialogButtonBounds[boundsRowIndex][3] = (DropTargetWidget.fullscreenDialogButtonPaddingY << 1) + b.fullscreenDialogButtonLineHeight;
            } else {
              rowY = rowY + IntArrayRequest.fullscreenDialogBodyLineHeight;
            }
            boundsRowIndex++;
          }
          if (ArchiveFetchClient.fullscreenDialogKind != 2) {
            UiComponent.fullscreenDialogSelection.initializeSelection(PlayerNameChooserPanel.hitTestFullscreenDialogButton(120, ResourcePreparationEntry.pointerY, MusicPatch.pointerX), 0, usePointer, (byte) -127);
          } else {
            UiComponent.fullscreenDialogSelection.initializeSelection(-1, -1, usePointer, (byte) -128);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "bq.B(" + usePointer + ',' + promptKind + ',' + obfuscationGuard + ')');
        }
    }

    static {
        field_a = "Open";
        field_f = "Crumbs!";
        maxArchiveContainerBytes = 0;
    }
}
