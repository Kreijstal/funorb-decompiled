/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplaySettingsDialog extends ResizableModalDialog implements WidgetActivationListener {
    private InteractiveWidget fullscreenModeButton;
    static String field_ib;
    private InteractiveWidget applyButton;
    private InteractiveWidget classicModeButton;
    private InteractiveWidget selectedModeButton;
    private InteractiveWidget resizableModeButton;
    private DropdownSelector displayModeDropdown;
    private boolean nonGuestAtOpen;
    static byte[][] field_W;
    private boolean hasFullscreenModes;
    private GridWidgetContainer modeGrid;
    static int decodedChatContextId;
    static String[] field_cb;
    static int field_fb;
    private InteractiveWidget[] modeButtons;
    private FullscreenDisplayMode[] displayModes;
    private boolean dropdownWasExpanded;
    private InteractiveWidget backButton;

    DisplaySettingsDialog(ModalDialogHost host) {
        super(host, 430, 254);
        int retainedModeSlot = 0;
        int modeLabelIndex = 0;
        boolean fullscreenModesAvailable = false;
        int resizeAvailableFlag = 0;
        boolean nonGuestSnapshot = false;
        int modeColumnCount = 0;
        int resizeHeapBlockedFlag = 0;
        Object stackIn_51_0;
        GridWidgetContainer stackIn_51_1;
        GridWidgetContainer stackIn_51_2;
        int modeGridX;
        GridWidgetContainer stackIn_52_1 = null;
        GridWidgetContainer stackIn_52_2 = null;
        int modeGridY = 0;
        int modeButtonCount = 0;
        String restrictionMessageValue = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int modeCounter = 0;
        RuntimeException var2 = null;
        int duplicateModeIndex = 0;
        FullscreenDisplayMode[] unfilteredModes = null;
        int retainedModeIndex = 0;
        int sourceModeIndex = 0;
        String[] modeLabels = null;
        int selectedModeIndex = 0;
        String restrictionMessage = null;
        InteractiveWidget currentMode = null;
        Widget restrictionLabel = null;
        FullscreenDisplayMode mode = null;
        String restrictionText = null;
        Object stackIn_51_0Lifetime1;
        GridWidgetContainer stackIn_51_1Lifetime1;
        GridWidgetContainer stackIn_51_2Lifetime1;
        GridWidgetContainer stackIn_52_1Lifetime1;
        GridWidgetContainer stackIn_52_2Lifetime1;
        int gridColumns;
        int resizeHeapBlocked;
        int actionCenterX;
        int resizeAvailable;
        int modeCountIndex;
        try {
          this.displayModes = ValidatedTextWidget.getFullscreenDisplayModes(-114, IntPair.field_m);
          if (this.displayModes.length > 0) {
            for (modeCounter = 0; modeCounter < this.displayModes.length; modeCounter++) {
              if (this.displayModes[modeCounter] != null) {
                for (duplicateModeIndex = modeCounter + 1; this.displayModes.length > duplicateModeIndex; duplicateModeIndex++) {
                  if (null != this.displayModes[duplicateModeIndex] &&
                    this.displayModes[duplicateModeIndex].width == this.displayModes[modeCounter].width &&
                    this.displayModes[duplicateModeIndex].height == this.displayModes[modeCounter].height) {
                    this.displayModes[duplicateModeIndex] = null;
                  }
                }
                if (null != ActionSpell.viewportManager &&
                  null != this.displayModes[modeCounter] &&
                  !ActionSpell.viewportManager.acceptsDimensions(this.displayModes[modeCounter].width, 122, this.displayModes[modeCounter].height)) {
                  this.displayModes[modeCounter] = null;
                }
              }
            }
            modeCounter = 0;
            for (modeCountIndex = 0; modeCountIndex < this.displayModes.length; modeCountIndex++) {
              if (this.displayModes[modeCountIndex] != null) {
                modeCounter++;
              }
            }
            unfilteredModes = this.displayModes;
            this.displayModes = new FullscreenDisplayMode[modeCounter];
            retainedModeIndex = 0;
            for (sourceModeIndex = 0; sourceModeIndex < unfilteredModes.length; sourceModeIndex++) {
              if (unfilteredModes[sourceModeIndex] != null) {
                retainedModeSlot = retainedModeIndex;
                retainedModeIndex++;
                this.displayModes[retainedModeSlot] = unfilteredModes[sourceModeIndex];
              }
            }
            SpellConfirmationDialog.a(this.displayModes, 1680474497);
          }
          fullscreenModesAvailable = !(this.displayModes.length <= 0);
          this.hasFullscreenModes = fullscreenModesAvailable;
          resizeAvailableFlag = (!PaletteRegionMap.b(85)) ? 0 : 1;
          resizeAvailable = resizeAvailableFlag;
          nonGuestSnapshot = !(DamageEvent.isGuestSession(79));
          this.nonGuestAtOpen = nonGuestSnapshot;
          modeColumnCount = (resizeAvailable != 0) ? 3 : 2;
          gridColumns = modeColumnCount;
          if (resizeAvailable == 0) {
            if (null != ActionSpell.viewportManager) {
              resizeHeapBlockedFlag = (ActionSpell.viewportManager.isResizeBlockedByHeap((byte) 122)) ? 1 : 0;
            } else {
              resizeHeapBlockedFlag = 0;
            }
          } else {
            resizeHeapBlockedFlag = 0;
          }
          boolean useRaisedModeGrid = true;
          resizeHeapBlocked = resizeHeapBlockedFlag;
          stackIn_51_0 = this;
          stackIn_51_1 = null;
          stackIn_51_2 = null;
          modeGridX = 10;
          if (resizeAvailable == 0) {
            stackIn_51_0Lifetime1 = this;
            stackIn_51_1Lifetime1 = null;
            stackIn_51_2Lifetime1 = null;
            if (resizeHeapBlocked == 0) {
              stackIn_52_1 = null;
              stackIn_52_2 = null;
              modeGridY = 75;
              useRaisedModeGrid = false;
            }
          }
          if (useRaisedModeGrid) {
            stackIn_52_1Lifetime1 = null;
            stackIn_52_2Lifetime1 = null;
            modeGridY = 58;
          }
          this.modeGrid = new GridWidgetContainer(modeGridX, modeGridY, 410, 105, (WidgetPainter) null, gridColumns, 1);
          this.modeGrid.field_Q = 83;
          this.modeGrid.setCellInsets(5, 57, 5);
          this.addChild((byte) 10, (Widget) (this.modeGrid));
          this.classicModeButton = this.createModeButton((WidgetListener) (this), oq.field_j, ToggleTurnSkipConsoleCommand.field_H, false);
          if (resizeAvailable != 0) {
            this.resizableModeButton = this.createModeButton((WidgetListener) (this), Unit.field_n, HuffmanCodec.field_e, false);
          }
          this.fullscreenModeButton = this.createModeButton((WidgetListener) (this), oo.field_e, ClientContextMenu.field_b, false);
          if (resizeAvailable != 0) {
            modeButtonCount = 3;
          } else {
            modeButtonCount = 2;
          }
          this.modeButtons = new InteractiveWidget[modeButtonCount];
          this.modeButtons[0] = this.classicModeButton;
          if (resizeAvailable != 0) {
            this.modeButtons[2] = this.resizableModeButton;
          }
          this.modeButtons[1] = this.fullscreenModeButton;
          if (this.hasFullscreenModes &&
            resizeAvailable != 0) {
            modeLabels = new String[this.displayModes.length];
            selectedModeIndex = -1 + modeLabels.length;
            for (modeLabelIndex = 0; modeLabelIndex < this.displayModes.length; modeLabelIndex++) {
              mode = this.displayModes[modeLabelIndex];
              if (null != FixedQuaternion.fullscreenCanvas &&
                mode.width == ActionSpell.viewportManager.fullscreenWidth &&
                ActionSpell.viewportManager.fullscreenHeight == mode.height) {
                selectedModeIndex = modeLabelIndex;
              }
              modeLabels[modeLabelIndex] = mode.width + "<times>" + mode.height;
            }
            this.displayModeDropdown = new DropdownSelector(modeLabels, selectedModeIndex, 150);
            this.displayModeDropdown.setBounds(this.fullscreenModeButton.x + this.modeGrid.x, 126, this.fullscreenModeButton.height + this.fullscreenModeButton.y + (this.modeGrid.y - 19), 8192, 18);
            this.children.addFirst(750, this.displayModeDropdown);
          }
          this.backButton = this.createActionButton((byte) 38, VineGrowthAction.field_w, (WidgetListener) (this));
          actionCenterX = this.backButton.width / 2 + this.backButton.x;
          this.backButton.width = 150;
          this.backButton.x = -this.backButton.width - 20 + actionCenterX;
          this.applyButton = this.createActionButton((byte) 38, nr.field_f, (WidgetListener) (this));
          this.applyButton.enabled = false;
          this.applyButton.x = actionCenterX + 20;
          this.applyButton.width = this.backButton.width;
          if (resizeAvailable != 0 ||
            resizeHeapBlocked != 0) {
            if (resizeAvailable != 0) {
              restrictionMessageValue = GameEvent.field_l;
            } else {
              restrictionMessageValue = ViewportManager.field_w;
            }
            restrictionText = restrictionMessageValue;
            restrictionMessage = restrictionText;
            restrictionLabel = new Widget(restrictionText, (WidgetListener) null);
            restrictionLabel.y = 163;
            restrictionLabel.x = 0;
            restrictionLabel.width = this.width;
            restrictionLabel.height = 80;
            restrictionLabel.painter = (WidgetPainter) ((Object) new BitmapTextWidgetPainter(ArmiesOfGielinor.field_J, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true));
            this.addChild((byte) 10, restrictionLabel);
          }
          this.dropdownWasExpanded = false;
          currentMode = this.currentModeButton(-1);
          if (currentMode != null) {
            currentMode.active = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_80_0 = var2;
          stackIn_80_1 = new StringBuilder().append("ut.<init>(");
          if (host == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    private final InteractiveWidget currentModeButton(int obfuscationGuard) {
        if (obfuscationGuard != -1) {
          return (InteractiveWidget) null;
        }
        if (FixedQuaternion.fullscreenCanvas != null) {
          return this.fullscreenModeButton;
        }
        if (ActionSpell.viewportManager != null &&
          ActionSpell.viewportManager.resizeEnabled &&
          this.resizableModeButton != null) {
          return this.resizableModeButton;
        }
        return this.classicModeButton;
    }

    public final void widgetActivated(int pointerX, int obfuscationGuard, int button, int pointerY, InteractiveWidget widget) {
        InteractiveWidget discarded$0 = null;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        IndexedSprite[] var8 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 11) {
            var8 = (IndexedSprite[]) null;
            discarded$0 = this.createModeButton((WidgetListener) null, (String) null, (IndexedSprite[]) null, true);
          }
          if (widget == this.backButton) {
            this.closeSettings(118);
          } else {
            if (widget == this.applyButton) {
              this.applySelectedMode(obfuscationGuard - 12);
            } else {
              if (widget == this.classicModeButton) {
                this.selectMode(widget, (byte) 34);
              } else {
                if (widget != this.resizableModeButton) {
                  if (this.displayModeDropdown != null) {
                    stackIn_14_0 = (this.displayModeDropdown.hovered) ? 1 : 0;
                  } else {
                    stackIn_14_0 = 0;
                  }
                  var6_int = stackIn_14_0;
                  if (var6_int == 0 &&
                    widget == this.fullscreenModeButton) {
                    if (!this.hasFullscreenModes) {
                      this.host.showDialog(new FullscreenStatusDialog(this.host, PlayerProfile.field_h), 0);
                      return;
                    }
                    if (LoginForm.memberEntitlementValue <= 0) {
                      this.host.showDialog(new FullscreenMembershipDialog(this.host), 0);
                      return;
                    }
                    this.selectMode(widget, (byte) 34);
                    return;
                  }
                } else {
                  this.selectMode(widget, (byte) 34);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_28_0 = var6;
          stackIn_28_1 = new StringBuilder().append("ut.N(").append(pointerX).append(',').append(obfuscationGuard).append(',').append(button).append(',').append(pointerY).append(',');
          if (widget == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        qk.field_d = (param0 << 16) / 150;
        qk.field_c = param0 * 400 / 150;
        if (param1 != 122) {
          return;
        }
        qk.field_a = param0 * 100 / 150;
    }

    private final void applySelectedMode(int obfuscationGuard) {
        int selectedModeIndex = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.classicModeButton == this.selectedModeButton) {
          ck.b(obfuscationGuard - 59);
          AiActionCandidate.e(obfuscationGuard ^ -17024);
        } else {
          if (this.selectedModeButton == this.resizableModeButton) {
            ck.b(-109);
            jj.a(-4223);
          } else {
            if (this.fullscreenModeButton == this.selectedModeButton) {
              if (this.displayModeDropdown != null) {
                selectedModeIndex = this.displayModeDropdown.getSelectedIndex((byte) 71);
                if (selectedModeIndex >= 0) {
                  ActionSpell.viewportManager.setFullscreenSize(this.displayModes[selectedModeIndex].width, this.displayModes[selectedModeIndex].height, -8717);
                }
              }
              AiPlanningStrategy.a(true, obfuscationGuard + 8029);
              this.host.showDialog(new FullscreenConfirmationDialog(this.host), 0);
            }
          }
        }
        if (obfuscationGuard != -1) {
          this.selectedModeButton = (InteractiveWidget) null;
        }
        this.applyButton.enabled = false;
    }

    private final void refreshModeHighlights(int obfuscationGuard) {
        int optionIndex = 0;
        InteractiveWidget option = null;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        InteractiveWidget[] modeOptions = this.modeButtons;
        InteractiveWidget[] optionsReference = modeOptions;
        for (optionIndex = 0; modeOptions.length > optionIndex; optionIndex++) {
          option = modeOptions[optionIndex];
          option.active = this.selectedModeButton == option ? true : false;
        }
        if (obfuscationGuard > -37) {
          this.dropdownWasExpanded = true;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        DropdownOptionList.field_R[EmailConfirmationValidator.field_p] = param5;
        SpriteControlNode.field_m[EmailConfirmationValidator.field_p] = EmailConfirmationValidator.field_p;
        NumericDateInputWidget.field_U[EmailConfirmationValidator.field_p] = param2;
        if (LoginForm.field_T < param2) {
          se.field_e = param2;
        }
        if (param2 < pd.field_e) {
          sq.field_k = param2;
        }
        AnimationFrameSet.field_w[EmailConfirmationValidator.field_p] = param3;
        TutorialController.field_c[EmailConfirmationValidator.field_p] = param0;
        VineGrowthAction.field_s[EmailConfirmationValidator.field_p] = param1;
        int var6 = param0 + (param3 + param1);
        int var7 = var6 == 0 ? 0 : 1000 * param3 / var6;
        EffectPresentation.field_h[EmailConfirmationValidator.field_p] = var7;
        EmailConfirmationValidator.field_p = EmailConfirmationValidator.field_p + 1;
        if (!(sq.field_k <= var7)) {
          sq.field_k = var7;
        }
        if (param4 <= 120) {
          DisplaySettingsDialog.i((byte) 86);
        }
        if (se.field_e < var7) {
          se.field_e = var7;
        }
    }

    final static TaggedMapData readTaggedMap(CipherPacketBuffer packet, byte obfuscationGuard, int recordBitLength) {
        TaggedMapData var3 = null;
        RuntimeException var3_ref = null;
        TaggedMapData stackIn_5_0 = null;
        TaggedMapData stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (recordBitLength == 0) {
            return null;
          }
          if (obfuscationGuard > -31) {
            stackIn_5_0 = (TaggedMapData) null;
            return stackIn_5_0;
          }
          var3 = new TaggedMapData();
          NumericDateInputWidget.readTaggedFields(packet, var3, recordBitLength, -24721);
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ut.G(");
          if (packet == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(',').append(recordBitLength).append(')').toString());
        }
    }

    public static void p(int param0) {
        field_W = (byte[][]) null;
        field_ib = null;
        if (param0 != 0) {
          field_fb = -111;
        }
        field_cb = null;
    }

    final static void i(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var1Lifetime1;
        int[] var1Lifetime2;
        int var2Lifetime1;
        int var2Lifetime2;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          mu.field_a = null;
          GameClock.field_j = 0;
          if (vs.field_j) {
            FullscreenFocusCanvas.gameplayController = null;
            vs.field_j = false;
            SectorCacheStore.field_a = null;
            ConsoleParseException.b(-1);
          }
          if (pv.field_c) {
            PointerInputHandler.field_f = null;
            UnitInfoPopup.field_u = new NodeDeque();
            var10 = BoundedFile.field_e;
            var7 = var10;
            var4 = var7;
            var1 = var4;
            for (var2 = 0; 8 > var2; var2++) {
              var10[var2] = 0;
            }
            var11 = ReportAbuseDialog.field_Nb;
            var8 = var11;
            var5 = var8;
            var1Lifetime1 = var5;
            for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
              var11[var2Lifetime1] = 0;
            }
            var12 = ConsoleTextNode.field_n;
            var9 = var12;
            var6 = var9;
            var1Lifetime2 = var6;
            for (var2Lifetime2 = 0; 8 > var2Lifetime2; var2Lifetime2++) {
              var12[var2Lifetime2] = 0;
            }
            pv.field_c = false;
          }
          if (AiUnitPlanner.field_t) {
            PacketBuffer.i((byte) -97);
            pu.d(-112);
            da.clearSocialLists(-120);
            AiUnitPlanner.field_t = false;
          }
          if (param0 < 120) {
            DisplaySettingsDialog.a(-43, 103, -36, -123, (byte) 96, -93);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1_ref), "ut.A(" + param0 + ')');
        }
    }

    private final void selectMode(InteractiveWidget modeButton, byte obfuscationGuard) {
        InteractiveWidget currentMode = null;
        int selectedModeIndex = 0;
        FullscreenDisplayMode selectedMode = null;
        Widget unusedGuardWidget = null;
        InteractiveWidget applyControl = null;
        boolean modeChanged = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (obfuscationGuard != 34) {
            unusedGuardWidget = (Widget) null;
            this.updatePointer(91, 13, -99, (Widget) null);
          }
          this.selectedModeButton = modeButton;
          modeButton.takeFocus(11, (Widget) (this));
          currentMode = this.currentModeButton(-1);
          applyControl = this.applyButton;
          modeChanged = (currentMode != modeButton);
          applyControl.enabled = modeChanged;
          if (this.fullscreenModeButton == modeButton) {
            if (currentMode == modeButton) {
              if (this.displayModeDropdown != null) {
                selectedModeIndex = this.displayModeDropdown.getSelectedIndex((byte) 71);
                selectedMode = this.displayModes[selectedModeIndex];
                if (ActionSpell.viewportManager.fullscreenWidth != selectedMode.width ||
                  ActionSpell.viewportManager.fullscreenHeight != selectedMode.height) {
                  this.applyButton.enabled = true;
                }
                this.refreshModeHighlights(-108);
              } else {
                this.refreshModeHighlights(-108);
              }
            } else {
              this.refreshModeHighlights(-108);
            }
          } else {
            this.refreshModeHighlights(-108);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ut.U(");
          if (modeButton == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final InteractiveWidget createActionButton(byte obfuscationGuard, String text, WidgetListener listener) {
        InteractiveWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        InteractiveWidget stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new InteractiveWidget(text, listener);
          var4.painter = (WidgetPainter) ((Object) new SpriteButtonPainter());
          if (obfuscationGuard != 38) {
            decodedChatContextId = 126;
          }
          var5 = this.height - 46;
          var4.setBounds(15, -14 + (this.width - 16), var5, 8192, 30);
          this.addChild((byte) 10, (Widget) (var4));
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("ut.C(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (listener == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        int var6 = 0;
        InteractiveWidget[] var5 = null;
        InteractiveWidget var7 = null;
        int var8 = 0;
        InteractiveWidget[] var9 = null;
        boolean stackIn_14_0 = false;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          super.updatePointer(obfuscationGuard, originX, originY, rootWidget);
          if (BitmapTextWidgetPainter.pointerChangedSnapshot) {
            rootWidget.blur(1);
            var9 = this.modeButtons;
            var5 = var9;
            for (var6 = 0; var6 < var9.length; var6++) {
              var7 = var9[var6];
              if (var7.hovered) {
                var7.takeFocus(obfuscationGuard ^ 32729, (Widget) (this));
              }
            }
          }
          if (!this.nonGuestAtOpen &&
            !DamageEvent.isGuestSession(115)) {
            this.closeSettings(88);
            this.host.showDialog(new DisplaySettingsDialog(this.host), 0);
          }
          if (null != this.displayModeDropdown) {
            stackIn_14_0 = this.displayModeDropdown.isExpanded(11180);
            if (this.dropdownWasExpanded) {
              stackIn_15_1 = 0;
            } else {
              stackIn_15_1 = 1;
            }
            if ((stackIn_14_0 ? 1 : 0) == stackIn_15_1) {
              this.selectMode(this.fullscreenModeButton, (byte) 34);
              this.dropdownWasExpanded = this.displayModeDropdown.isExpanded(11180);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_20_0 = var5_ref;
          stackIn_20_1 = new StringBuilder().append("ut.P(").append(obfuscationGuard).append(',').append(originX).append(',').append(originY).append(',');
          if (rootWidget == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void closeSettings(int obfuscationGuard) {
        if (obfuscationGuard < 79) {
          this.fullscreenModeButton = (InteractiveWidget) null;
        }
        if (!this.open) {
          return;
        }
        this.open = false;
    }

    final boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        boolean stackIn_74_0 = false;
        Object stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5 = null;
          if (!this.classicModeButton.isFocused(false)) {
            if (this.resizableModeButton != null &&
              this.resizableModeButton.isFocused(false)) {
              var5 = this.resizableModeButton;
            } else {
              if (this.fullscreenModeButton.isFocused(false)) {
                var5 = this.fullscreenModeButton;
              } else {
                if (!this.backButton.isFocused(false)) {
                  if (this.applyButton.isFocused(false)) {
                    var5 = this.applyButton;
                  } else {
                    if (this.classicModeButton.active) {
                      var5 = this.classicModeButton;
                    } else {
                      if (null != this.resizableModeButton &&
                        this.resizableModeButton.active) {
                        var5 = this.resizableModeButton;
                      } else {
                        if (this.fullscreenModeButton.active) {
                          var5 = this.fullscreenModeButton;
                        }
                      }
                    }
                  }
                } else {
                  var5 = this.backButton;
                }
              }
            }
          } else {
            var5 = this.classicModeButton;
          }
          if (obfuscationGuard != -12215) {
            DisplaySettingsDialog.i((byte) 84);
          }
          var6 = keyCode;
          switch (var6) {
            case 96:
              if (var5 == this.fullscreenModeButton) {
                if (this.resizableModeButton != null) {
                  this.resizableModeButton.takeFocus(11, (Widget) (this));
                  return true;
                }
                this.classicModeButton.takeFocus(obfuscationGuard + 12226, (Widget) (this));
                return true;
              }
              if (var5 == this.resizableModeButton) {
                this.classicModeButton.takeFocus(11, (Widget) (this));
                return true;
              }
              if (this.applyButton == var5) {
                this.backButton.takeFocus(11, (Widget) (this));
                return true;
              }
              break;
            case 97:
              if (this.classicModeButton == var5) {
                if (this.resizableModeButton == null) {
                  this.fullscreenModeButton.takeFocus(11, (Widget) (this));
                } else {
                  this.resizableModeButton.takeFocus(11, (Widget) (this));
                }
                return true;
              }
              if (this.resizableModeButton == var5) {
                this.fullscreenModeButton.takeFocus(11, (Widget) (this));
                return true;
              }
              if (var5 == this.backButton &&
                this.applyButton.enabled) {
                this.applyButton.takeFocus(11, (Widget) (this));
                return true;
              }
              break;
            case 99:
              if (this.classicModeButton != var5 &&
                this.resizableModeButton != var5) {
                if (var5 != this.fullscreenModeButton) {
                  break;
                }
                if (!this.applyButton.enabled) {
                  this.backButton.takeFocus(obfuscationGuard ^ -12222, (Widget) (this));
                } else {
                  this.applyButton.takeFocus(11, (Widget) (this));
                }
                return true;
              }
              this.backButton.takeFocus(11, (Widget) (this));
              return true;
            case 98:
              if (var5 == this.backButton) {
                this.classicModeButton.takeFocus(11, (Widget) (this));
                return true;
              }
              if (this.applyButton == var5) {
                this.fullscreenModeButton.takeFocus(obfuscationGuard + 12226, (Widget) (this));
                return true;
              }
              break;
            default:
              break;
          }
          stackIn_74_0 = super.handleKey(rootWidget, keyCode, character, -12215);
          return stackIn_74_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_77_0 = var5;
          stackIn_77_1 = new StringBuilder().append("ut.F(");
          if (rootWidget == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) (stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final InteractiveWidget createModeButton(WidgetListener listener, String text, IndexedSprite[] stateIcons, boolean obfuscationGuard) {
        InteractiveWidget var5 = null;
        RuntimeException var5_ref = null;
        GridWidgetContainer var6 = null;
        InteractiveWidget var7 = null;
        InteractiveWidget stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new InteractiveWidget(text, listener);
          var5.painter = (WidgetPainter) ((Object) new DisplayModeOptionPainter(stateIcons));
          if (obfuscationGuard) {
            field_W = (byte[][]) null;
          }
          var6 = this.modeGrid;
          var7 = var5;
          var6.addCell(var7, var6.field_Q, 0);
          this.modeGrid.refreshLayout(0);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("ut.E(");
          if (listener == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (text == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (stateIcons == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_ib = "Most cruel";
        field_W = new byte[1000][];
        field_fb = -1;
        field_cb = new String[]{"Barbarians believe staunchly that magic is a gift from the gods. They will attempt to destroy any that believe otherwise. Being barbarians, they will also destroy anyone that looks at them funny, or spills their mead.", "The beloved of Armadyl, god of the skies, the aviansie are an honourable race of birdmen. Their ability to fly giving them a great advantage on the battlefield.", "How the lower simian races attained sentience is unknown, though the monkey god, Marimbo, probably had something to do with it. ", "When foes refuse to get close enough for the barbarians to destroy them face to face, their women throw sharp sticks at the enemy until the situation resolves itself one way or the other.", "Once the King Black Dragon has joined the fight, the door is opened for his relatives to enter the battlefield behind him.", "The TzHaar are a race of creatures born of the volcano, made of rock and fire. They are a lumbering but honourable people; anger one and it will not soon forget. The TzHaar-Ket, members of the warrior caste, make formidable opponents.", "Ancient creatures of the deep, dagannoths are smarter and stronger than they might first appear. Their true numbers are hidden by the underwater abyss. ", "Creating a teleportation node is no easy feat, and there are few wizards in Gielinor who have the ability to do so. Any faction who has portal mages on their side will have a distinct advantage over their enemies.", "Priestly knights, paladins are both great warriors and devout believers. They take their godly duties as seriously as their combat training.", "The wise and ever-watchful owl reflects perfectly the qualities of Saradomin.", "Monks may not be renowned warriors, but their faith gives them another kind of strength.", "The various mages and wizards who follow Saradomin are well-practised in the magic arts.", "Upholders of peace and guardians of what is now Falador, the organisation known as the White Knights boasts many strong and honourable warriors.", "Proud and noble creatures renowned for their curative powers, though a unicorn’s horn can also do plenty of damage.", "Centaurs are mystical creatures not often seen in the world. The lower half of their bodies is that of a horse; the upper half is that of a man. They are considered expert bowmen.", "The princely lions exude grace and power, which is part of what makes them royalty among the big cats.", "The rangers who fight for Saradomin loose arrows with unerring accuracy, in part due to their frequent prayers.", "Priests are the most devout followers of Saradomin, devoting their lives to prayer, and spreading his divine message. This gives them a strong link to their god, and grants them the ability to create spiritual wards and protections.", "Proud and loyal warriors of Saradomin, the icyene have a godly strength flowing through their veins, and beautiful wings that grant them the power of flight.", "Werewolves have two faces: one is that of a man, albeit a hairy one; the other is that of a wolf man, a savage beast with an insatiable hunger for meat.", "The remains of the fallen dead from centuries-old battles, imbued with dark energy by a necromancer to create terrifying and deadly warriors.", "Necromancers are mages with power over death. Their magics allow them to raise and control armies of undead creatures.", "Not as well-schooled as Saradomin mages, but no less deadly, the Zamorak mages have turned to the forgotten, darker arts to gain their power.", "The Black Knights, also known as the Kinshra, were once allied to the White Knights, but theological differences caused a rift between the two organisations.", "Demons possess incredible power and capability for destruction.", "Zamorakians will use any tricks they can to increase their chances of winning a fight, and the benefits of deploying ranged units are not lost on them. Their rangers are the equal of any fielded by Saradominist forces.", "Servants of the demon lords, hellhounds are dispatched by their masters to claim the lives of the cursed. Being demonkind, though, they don't always like to wait for the slow hand of fate to play its part.", "Sea slugs have the ability to take over and control a host body through which to act out their will, with the ultimate aim of achieving total domination of all other races on Gielinor. To this end, they strive to cause as much chaos and strife as possible through the act of war.", "These magically animated stone statues are particularly difficult to kill and are rarely friendly.", "Pyrelords may only be low demons, but as creatures of ever-burning flame with pyromaniacal leanings, they are dangerous beings. They have the ability to burn down forests.", "To compensate for their small stature, gnomes have taken to training the beasts of Gielinor to aid them in combat. The terrorbird is the ideal creature for a mounted or shock unit, granting their riders great speed, and striking fear into enemies with their shrill cries.", "Wolves are noble creatures of the earth that can be fearsome, but once their trust is earned they become faithful and steadfast allies.", "Druids form the bulk of the human followers of Guthix. They aim to live a life of balance, both taking from and giving to the land. In desperate times, they will fight to maintain balance in the world. The druids' knowledge of herbs grants them the ability to heal other units.", "The Black Guard are an organised dwarven militia, tasked with policing dwarf settlements when not engaged in combat. The Black Guard are typically responsible for manning dwarf multicannons.", "A truly impressive feat of dwarven engineering, the multicannon is an extremely powerful and surprisingly mobile weapon that can fire heavy steel cannonballs accurately over great distances. When deployed this cannon deals fire damage, and as such can use the same fire weapons as a dragon.", "One of Gielinor's elemental giants, moss giants are essentially walking piles of moss. It has been suggested that all moss giants' beards (also made of moss) are entities separate from the giants themselves.", "The Void Knights are the fighting force of the human followers of Guthix. Working mostly in secret, they exist to make decisive strikes against any foe who seeks to unbalance the world. For centuries, they have been fighting a secret war against an invading force of extra-dimensional pests.", "Where the terrorbird gives the gnomes speed, the battle tortoise gives them strength. Typically, three gnomes – a rider, a mage and a ranger – will ride atop the shell of one of these giant tortoises to create a formidable combat unit.", "Gnomes do not rely only on animals to enhance their combat effectiveness, and with the invention of ‘copters have gained a significant height advantage.", "Jade vines are typical plants in that they exist only to grow, but they are atypical in that they grow with extraordinary speed and ferocity, and have limited awareness and a sense of self-preservation.", "Ents are trees so old they have gained sentience, and now roam the woodlands and forests of Gielinor, protecting and nurturing them.", "Falcons are the ideal bird for carrying messages through the dense forests of Isafdar, as well as being a useful flying skirmish unit.", "The black bear is stronger than its brown cousins found in the east, and will not think twice before mauling unsuspecting explorers who encroach on their territory. ", "The crystals that elves use in almost every aspect of their lives are given shape by singing to them, which makes songstresses very important elves. Elven weapons are also formed in this way, and when a songstress sings in battle she can boost the effectiveness of her allies, and even increase the morale of non-elf units.", "Shieldmaidens wield crystal shields, often with a dagger or small sword, which they use to protect elf pikemen and archers. Crystal shields can soak up a lot of damage, giving the shieldmaiden's brethren an opportunity to triumph.", "Grenwalls are odd creatures, and natural predators of the timid pawya. They have the ability to fire their spines like miniature arrows, a weapon they use to strike their pawya prey before it can burrow to safety.", "Dire wolves are larger and meaner than the grey and white wolves that commonly fall under Guthix's banner. They show no loyalty to anything other than their packs, and will defend their territory without mercy.", "Foot soldiers of the elf army, these pikemen wield a large-bladed crystal halberd and wear strong yet lightweight armour. Pikemen are well-trained and formidable soldiers.", "Elf archers wield crystal weaponry in the form of a longbow. This crystal bow does not require conventional arrows, but rather creates enchanted arrows of light. This allows the elves to rain death upon their foes with little need for resupply.", "Even the higher echelons of elf society will engage in war when necessary. Although they are born into a higher station, they spend as much time learning the art of warfare as their subordinates, if not more.", "Female elves take an active part in all aspects of elf society, including hunting and war. They may not favour the heavier weapons used by an elf lord, but they are formidable warriors.", "Crystalline shape-shifters are stealthy creatures. They have the ability to teleport over short distances, often right next to you. They can even teleport into the space you are standing in, killing you in the process.", "Goblins live for war. They are not blessed with much intelligence, but great numbers of them can overwhelm their enemies.", "Goblin religion is very basic – 'Do what you're told on pain of death' – so the role of priest is quite a straightforward one. This doesn't stop goblin priests from becoming strong warriors and accomplished spellcasters, focusing on magics that strengthen their allies and weaken their enemies.", "Even by comparison with the other followers of Bandos ogres are stupid, but they have a stronger sense of community than their green-skinned brethren. Ogres are big, hulking and immensely strong creatures.", "A breed of ogre adapted to living in the jungle, jogres have tough hides to help them resist the poisons of jungle spiders, and to protect them from the bites of insects.", "Mogres have developed the ability to breathe underwater, and now prefer to live in marine environments. They have retained the ability to breathe on land, however, and are no less deadly when they do come to the surface.", "The hobgoblin occupies the rung on the evolutionary ladder between goblin and ork, and so display the best and worst traits of both races.", "Ogre shamans are among the most powerful magic users in all of Gielinor. One of their nastier spells creates a thick, black smog in which other Bandosian units thrive.", "Related to hill giants, cyclopes are distinguished by having just one eye in the middle of their faces, and some even have horns on their heads. Their gaze can be quite entrancing, so it is best not to look them in the eye. What they lack in depth-perception they make up for in club-swinging.", "Larger, stronger, faster and ever-so-slightly smarter than goblins, the ork is the staple soldier of any Bandosian army. Although they lack general intelligence, they have grasped the basic principles of tactical combat.", "Ogre men are bad enough, but their female counterparts are stronger still. They're also ravenous, and will eat anything or anyone that gets in their way.", "Ourgs are giant creatures with incredible strength and power - enough to bring even a mountain down to size - and their size alone will scare off most enemies. There are few ourgs in the ranks of Bandos's armies, so they tend to hold positions of command.", "The Kalphite Queen rules over the rest of her hive. A hive mind has great strength, and unwary warriors can be overwhelmed by her workers, soldiers and guardians as they swarm to and cover the area around her.", "Creatures that thrive in the harsh desert are typically scavengers, and jackals are a prime example of this. They are often found in the outskirts of desert cities, living off the scraps left by the city's inhabitants.", "A mummy is the animated remains of a Menaphite who has been entombed in the proper ceremonial manner. The body's owner has long since departed for the afterlife, but the mummy carries on, protecting the burial places of the dead from grave-robbers.", "Locusts are as deadly and pitiless as the desert itself, and swarms of these creatures have the ability to completely destroy crops in a very short space of time. Some have even been known to grow to the size of a small camel.", "The Bedabin are a nomadic people, travelling through the desert and surviving on what little it provides. This tough lifestyle has made them a hardy people. They also possess the secret of making darts, a deadly thrown weapon.", "The desert town of Pollnivneach has the tendency to attract the worst elements of society, not least of which are the thuggish thieves from Menaphos. They'll not give a second thought to taking a cosh to the back of your head, and stealing all your worldly goods.", "These warriors are devout followers of Icthlarin, god of life and death. Icthlarin is worshipped both for caring for the living and for guiding the dead to the afterlife. His warriors uphold their god's values, and take their ceremonial duties particularly seriously.", "All along the banks of the River Elid, and in the swamplands to the desert's south-east, you will find crocodiles basking in the hot sun of the Kharidian Desert. Don't be fooled by their placid demeanour, though: if you get too close they'll take a bite out of you.", "The followers of the lesser desert god Scabaras long ago twisted their form to become insect-like in appearance. They have a preference for isolation, but still know how to handle unwanted company.", "Sphinxes are strange, chimeric creatures that speak in riddles, which allows them to beguile any enemy units that get close enough to hear them.", "These are elementals of Elidinis, the desert goddess of water. They have the ability to create water, which allows them to maintain the River Elid, among other things.", "King of the dragons, this three-headed, black-skinned beast has the ability to breathe fire, and it's many heads allow it two attacks per turn. Not many dragonslayers are hardy enough to survive an attack from this creature, and the second can be devastating."};
    }
}
