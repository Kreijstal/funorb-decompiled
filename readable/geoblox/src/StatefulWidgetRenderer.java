/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StatefulWidgetRenderer extends TextWidgetRenderer {
    static byte[][] byteArrayPool5000;
    static int accountCreationAgeYears;
    static TextTemplateDefinitionLoader textTemplateDefinitions;
    static int decodedRankedRatioNumerator;
    static String emailLocalPartCharacters;
    private WidgetSkinState workingSkin;
    private WidgetSkinState[] stateSkins;

    final WidgetSkinState replaceStateSkin(int methodGuard, int stateIndex) {
        if (methodGuard >= -93) {
            return (WidgetSkinState) null;
        }
        WidgetSkinState replacementSkin = new WidgetSkinState();
        this.stateSkins[stateIndex] = replacementSkin;
        return replacementSkin;
    }

    final void setPanelSpritesOnExistingStates(byte methodGuard, Sprite[] sprites) {
        int stateIndex = 0;
        WidgetSkinState[] skinsAlias = null;
        WidgetSkinState stateSkin = null;
        int clientControlFlowSnapshot = 0;
        UiWidget unusedNullWidget = null;
        WidgetSkinState[] skinsSnapshot = null;
        RuntimeException failureBeforeContext = null;
        StringBuilder failureContextBuilder = null;
        String spritesDescription = null;
        RuntimeException caughtPanelFailure = null;
        RuntimeException panelFailure = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != 124) {
            unusedNullWidget = (UiWidget) null;
            this.drawWidget(-125, -66, 53, true, (UiWidget) null);
          }
          skinsSnapshot = this.stateSkins;
          skinsAlias = skinsSnapshot;
          for (stateIndex = 0; skinsSnapshot.length > stateIndex; stateIndex++) {
            stateSkin = skinsSnapshot[stateIndex];
            if (stateSkin != null) {
              stateSkin.panelSprites = sprites;
            }
          }
          return;
        } catch (java.lang.RuntimeException panelException) {
          caughtPanelFailure = panelException;
          panelFailure = caughtPanelFailure;
          failureBeforeContext = panelFailure;
          failureContextBuilder = new StringBuilder().append("rd.C(").append(methodGuard).append(',');
          if (sprites == null) {
            spritesDescription = "null";
          } else {
            spritesDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureBeforeContext), ((StringBuilder) (Object) failureContextBuilder).append(spritesDescription).append(')').toString());
        }
    }

    private final void copyStyleAndSkinsTo(boolean baseStyleGuard, StatefulWidgetRenderer targetRenderer, boolean copySkinProperties) {
        int stateIndex = 0;
        WidgetSkinState newTargetSkin = null;
        WidgetSkinState sourceForCopy = null;
        int copyGuard = 0;
        WidgetSkinState targetForCopy = null;
        RuntimeException failureBeforeContext = null;
        StringBuilder failureContextBuilder = null;
        String targetDescription = null;
        RuntimeException caughtCopyFailure = null;
        RuntimeException copyFailure = null;
        WidgetSkinState sourceSkin = null;
        WidgetSkinState existingTargetSkin = null;
        int clientControlFlowSnapshot = 0;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          super.copyStyleTo(targetRenderer, baseStyleGuard);
          if (copySkinProperties) {
            for (stateIndex = 0; 6 > stateIndex; stateIndex++) {
              sourceSkin = this.stateSkins[stateIndex];
              if (sourceSkin == null) {
                targetRenderer.stateSkins[stateIndex] = null;
              } else {
                existingTargetSkin = targetRenderer.stateSkins[stateIndex];
                sourceForCopy = sourceSkin;
                copyGuard = 2;
                if (existingTargetSkin == null) {
                  newTargetSkin = new WidgetSkinState();
                  targetRenderer.stateSkins[stateIndex] = newTargetSkin;
                  targetForCopy = newTargetSkin;
                } else {
                  targetForCopy = existingTargetSkin;
                }
                ((WidgetSkinState) (Object) sourceForCopy).copyPropertiesTo(copyGuard, targetForCopy);
              }
            }
            return;
          }
          ArrayOperations.copyReferences(this.stateSkins, 0, targetRenderer.stateSkins, 0, 6);
          return;
        } catch (java.lang.RuntimeException copyException) {
          caughtCopyFailure = copyException;
          copyFailure = caughtCopyFailure;
          failureBeforeContext = copyFailure;
          failureContextBuilder = new StringBuilder().append("rd.DA(").append(baseStyleGuard).append(',');
          if (targetRenderer == null) {
            targetDescription = "null";
          } else {
            targetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureBeforeContext), ((StringBuilder) (Object) failureContextBuilder).append(targetDescription).append(',').append(copySkinProperties).append(')').toString());
        }
    }

    final void setIconOnExistingStates(int firstStateIndex, Sprite icon) {
        int stateIndex = 0;
        WidgetSkinState[] skinsAlias = null;
        WidgetSkinState stateSkin = null;
        int clientControlFlowSnapshot = 0;
        WidgetSkinState[] skinsSnapshot = null;
        RuntimeException failureBeforeContext = null;
        StringBuilder failureContextBuilder = null;
        String iconDescription = null;
        RuntimeException caughtIconFailure = null;
        RuntimeException iconFailure = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          skinsSnapshot = this.stateSkins;
          skinsAlias = skinsSnapshot;
          for (stateIndex = firstStateIndex; stateIndex < skinsSnapshot.length; stateIndex++) {
            stateSkin = skinsSnapshot[stateIndex];
            if (stateSkin != null) {
              stateSkin.icon = icon;
            }
          }
          return;
        } catch (java.lang.RuntimeException iconException) {
          caughtIconFailure = iconException;
          iconFailure = caughtIconFailure;
          failureBeforeContext = iconFailure;
          failureContextBuilder = new StringBuilder().append("rd.CA(").append(firstStateIndex).append(',');
          if (icon == null) {
            iconDescription = "null";
          } else {
            iconDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureBeforeContext), ((StringBuilder) (Object) failureContextBuilder).append(iconDescription).append(')').toString());
        }
    }

    final static void showAccountProgressDialog(int methodGuard) {
        if (methodGuard != 520) {
            String unusedNullLoginText = (String) null;
            StatefulWidgetRenderer.setOptionalLoginText(38, (String) null);
        }
        ClientFlowState.accountDialogLayer.hideAllDialogs(10936);
        if ((null == SecondaryNodeHashTable.accountProgressDialog)) {
            SecondaryNodeHashTable.accountProgressDialog = new ProgressDialog(ClientFlowState.accountDialogLayer, TextWidgetRenderer.unreadTicketMessage);
        }
        ClientFlowState.accountDialogLayer.showDialog(false, SecondaryNodeHashTable.accountProgressDialog);
    }

    final static void initializePunctuationKeyCodes(int backquoteInternalCode) {
        ResizableDialog.awtKeyCodeToInternalCode[45] = 26;
        ResizableDialog.awtKeyCodeToInternalCode[44] = 71;
        ResizableDialog.awtKeyCodeToInternalCode[520] = 59;
        ResizableDialog.awtKeyCodeToInternalCode[222] = 58;
        ResizableDialog.awtKeyCodeToInternalCode[192] = backquoteInternalCode;
        ResizableDialog.awtKeyCodeToInternalCode[46] = 72;
        ResizableDialog.awtKeyCodeToInternalCode[47] = 73;
        ResizableDialog.awtKeyCodeToInternalCode[92] = 74;
        ResizableDialog.awtKeyCodeToInternalCode[91] = 42;
        ResizableDialog.awtKeyCodeToInternalCode[93] = 43;
        ResizableDialog.awtKeyCodeToInternalCode[61] = 27;
        ResizableDialog.awtKeyCodeToInternalCode[59] = 57;
    }

    public StatefulWidgetRenderer() {
        this.stateSkins = new WidgetSkinState[6];
        this.workingSkin = new WidgetSkinState();
        WidgetSkinState newBaseSkin = new WidgetSkinState();
        this.stateSkins[0] = newBaseSkin;
        WidgetSkinState baseSkin = newBaseSkin;
        baseSkin.resetDrawingProperties((byte) -3);
    }

    public static void releaseSharedResources(byte methodGuard) {
        int guardArithmetic = -71 / ((32 - methodGuard) / 50);
        textTemplateDefinitions = null;
        byteArrayPool5000 = (byte[][]) null;
        emailLocalPartCharacters = null;
    }

    final void setStatePanelSprites(Sprite[] sprites, int stateIndex, byte methodGuard) {
        int stateIndexSnapshot = 0;
        RuntimeException failureBeforeContext = null;
        StringBuilder failureContextBuilder = null;
        String spritesDescription = null;
        RuntimeException caughtPanelFailure = null;
        RuntimeException panelFailure = null;
        try {
          stateIndexSnapshot = stateIndex;
          if (this.stateSkins[stateIndexSnapshot] == null) {
            this.stateSkins[stateIndexSnapshot] = new WidgetSkinState();
          }
          this.stateSkins[stateIndex].panelSprites = sprites;
          if (methodGuard <= 38) {
            textTemplateDefinitions = (TextTemplateDefinitionLoader) null;
          }
          return;
        } catch (java.lang.RuntimeException panelException) {
          caughtPanelFailure = panelException;
          panelFailure = caughtPanelFailure;
          failureBeforeContext = panelFailure;
          failureContextBuilder = new StringBuilder().append("rd.GA(");
          if (sprites == null) {
            spritesDescription = "null";
          } else {
            spritesDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureBeforeContext), ((StringBuilder) (Object) failureContextBuilder).append(spritesDescription).append(',').append(stateIndex).append(',').append(methodGuard).append(')').toString());
        }
    }

    public final void drawWidget(int parentX, int methodGuard, int parentY, boolean widgetEnabled, UiWidget widget) {
        UiWidget buttonWidgetBeforeCast = null;
        RuntimeException failureBeforeContext = null;
        StringBuilder failureContextBuilder = null;
        String widgetDescription = null;
        RuntimeException caughtRenderFailure = null;
        RuntimeException renderFailure = null;
        WidgetSkinState baseSkin = null;
        WidgetSkinState hoverSkin = null;
        ButtonWidget buttonWidget = null;
        WidgetSkinState activeSkin = null;
        WidgetSkinState pressedSkin = null;
        WidgetSkinState focusSkin = null;
        WidgetSkinState disabledSkin = null;
        try {
          if (!(widget instanceof ButtonWidget)) {
            buttonWidgetBeforeCast = null;
          } else {
            buttonWidgetBeforeCast = (UiWidget) (widget);
          }
          buttonWidget = (ButtonWidget) ((Object) buttonWidgetBeforeCast);
          PasswordWidgetRenderer.pushWidgetClip(widget.widgetY + parentY, widget.widgetX + parentX, -14045, widget.widgetHeight + (parentY + widget.widgetY), widget.widgetWidth + (parentX + widget.widgetX));
          if (buttonWidget != null) {
            widgetEnabled = widgetEnabled & buttonWidget.enabled;
          }
          baseSkin = this.stateSkins[0];
          if (methodGuard >= -5) {
            byteArrayPool5000 = (byte[][]) null;
          }
          this.workingSkin.resetDrawingProperties((byte) -28);
          baseSkin.mergeIntoWorkingSkin(parentX, parentY, this.workingSkin, (StatefulWidgetRenderer) (this), -16566, widget);
          if (buttonWidget != null) {
            if (buttonWidget.active) {
              activeSkin = this.stateSkins[1];
              if (activeSkin != null) {
                activeSkin.mergeIntoWorkingSkin(parentX, parentY, this.workingSkin, (StatefulWidgetRenderer) (this), -16566, widget);
              }
            }
            if (buttonWidget.pointerInside) {
              pressedSkin = this.stateSkins[3];
              if ((buttonWidget.pressedPointerButton != 0) &&
                  (pressedSkin != null)) {
                pressedSkin.mergeIntoWorkingSkin(parentX, parentY, this.workingSkin, (StatefulWidgetRenderer) (this), -16566, widget);
              } else {
                hoverSkin = this.stateSkins[2];
                if (hoverSkin != null) {
                  hoverSkin.mergeIntoWorkingSkin(parentX, parentY, this.workingSkin, (StatefulWidgetRenderer) (this), -16566, widget);
                }
              }
            }
          }
          if (widget.hasKeyboardFocus((byte) 54)) {
            focusSkin = this.stateSkins[5];
            if (focusSkin != null) {
              focusSkin.mergeIntoWorkingSkin(parentX, parentY, this.workingSkin, (StatefulWidgetRenderer) (this), -16566, widget);
            }
          }
          if (!widgetEnabled) {
            disabledSkin = this.stateSkins[4];
            if (disabledSkin != null) {
              disabledSkin.mergeIntoWorkingSkin(parentX, parentY, this.workingSkin, (StatefulWidgetRenderer) (this), -16566, widget);
            }
          }
          this.workingSkin.drawSkin((StatefulWidgetRenderer) (this), parentX, parentY, widget, 0);
          RasterTargetRestoreSupport.restoreRasterTarget(true);
          return;
        } catch (java.lang.RuntimeException renderException) {
          caughtRenderFailure = renderException;
          renderFailure = caughtRenderFailure;
          failureBeforeContext = renderFailure;
          failureContextBuilder = new StringBuilder().append("rd.E(").append(parentX).append(',').append(methodGuard).append(',').append(parentY).append(',').append(widgetEnabled).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureBeforeContext), ((StringBuilder) (Object) failureContextBuilder).append(widgetDescription).append(')').toString());
        }
    }

    final static void setOptionalLoginText(int methodGuard, String text) {
        if (methodGuard > -116) {
            return;
        }
        try {
            GameSoundResources.optionalLoginText = text;
        } catch (RuntimeException loginTextFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) loginTextFailure), "rd.FA(" + methodGuard + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    StatefulWidgetRenderer(StatefulWidgetRenderer sourceRenderer, boolean copySkinProperties) {
        this();
        try {
            sourceRenderer.copyStyleAndSkinsTo(true, (StatefulWidgetRenderer) (this), copySkinProperties);
        } catch (RuntimeException rendererConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) rendererConstructionFailure), "rd.<init>(" + (sourceRenderer != null ? "{...}" : "null") + ',' + copySkinProperties + ')');
        }
    }

    final static Sprite[] loadSpritesWithDecodedAlpha(int groupId, int methodGuard, int fileId, ResourceArchive archive) {
        RuntimeException spriteLoadFailure = null;
        RuntimeException failureBeforeContext = null;
        StringBuilder failureContextBuilder = null;
        String archiveDescription = null;
        RuntimeException caughtLoadFailure = null;
        try {
          if (methodGuard >= -61) {
            byteArrayPool5000 = (byte[][]) null;
          }
          if (SpawnQuotaSupport.decodeSpritesFromArchive(fileId, groupId, 114, archive)) {
            return SpriteConstructionSupport.buildSpritesWithDecodedAlpha(104);
          }
          return null;
        } catch (java.lang.RuntimeException loadException) {
          caughtLoadFailure = loadException;
          spriteLoadFailure = caughtLoadFailure;
          failureBeforeContext = spriteLoadFailure;
          failureContextBuilder = new StringBuilder().append("rd.EA(").append(groupId).append(',').append(methodGuard).append(',').append(fileId).append(',');
          if (archive == null) {
            archiveDescription = "null";
          } else {
            archiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureBeforeContext), ((StringBuilder) (Object) failureContextBuilder).append(archiveDescription).append(')').toString());
        }
    }

    static {
        byteArrayPool5000 = new byte[250][];
        emailLocalPartCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
