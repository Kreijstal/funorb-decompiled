/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayModeDialog extends ResizableModalPanel implements UiActionListener {
    static Sprite[] field_U;
    private boolean resolutionDropdownOpen;
    static Widget field_X;
    private UiFocusableComponent fullscreenButton;
    private boolean hasDisplayModes;
    private UiFocusableComponent resizableButton;
    private UiFocusableComponent backButton;
    private UiFocusableComponent applyButton;
    private UiFocusableComponent[] modeButtons;
    private DisplayMode[] displayModes;
    private UiFocusableComponent selectedModeButton;
    private UiComboBox resolutionDropdown;
    private UiFocusableComponent classicButton;
    private UiWeightedGridContainer modeGrid;
    private boolean field_J;

    final void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        int var6 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        UiFocusableComponent[] var5 = null;
        RuntimeException var5_ref = null;
        UiFocusableComponent var7 = null;
        int var8 = 0;
        UiFocusableComponent[] var9 = null;
        var8 = VoidHunters.field_G;
        try {
          super.updatePointer(param0, param1, param2 ^ 0, param3);
          if (VariableConditionFactory.field_c) {
            param3.clearFocus((byte) -34);
            var9 = this.modeButtons;
            var5 = var9;
            for (var6 = 0; var9.length > var6; var6++) {
              var7 = var9[var6];
              if (var7.hovered) {
                var7.requestFocus(0, (UiComponent) (this));
              }
            }
          }
          if (!this.field_J &&
            !GetPhasedEnergyBeamPulsetime.isGuestMode((byte) 124)) {
            this.closeDialog((byte) -118);
            this.modalStack.pushPanel(false, new DisplayModeDialog(this.modalStack));
          }
          if (param2 != -981) {
            field_U = (Sprite[]) null;
          }
          if (null != this.resolutionDropdown) {
            stackIn_16_0 = (this.resolutionDropdown.isDropdownOpen(0)) ? 0 : 1;
            if (stackIn_16_0 != (this.resolutionDropdownOpen ? 1 : 0)) {
              return;
            }
            this.selectMode(true, this.fullscreenButton);
            this.resolutionDropdownOpen = this.resolutionDropdown.isDropdownOpen(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_22_0 = var5_ref;
          stackIn_22_1 = new StringBuilder().append("hnb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final void selectMode(boolean param0, UiFocusableComponent param1) {
        UiFocusableComponent var3 = null;
        int var4 = 0;
        DisplayMode var5 = null;
        UiFocusableComponent stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          this.selectedModeButton = param1;
          if (!param0) {
            return;
          }
          param1.requestFocus(0, (UiComponent) (this));
          var3 = this.getCurrentModeButton((byte) 62);
          stackIn_4_0 = this.applyButton;
          stackIn_5_1 = (var3 != param1);
          stackIn_4_0.enabled = stackIn_5_1;
          if (param1 == this.fullscreenButton) {
            if (var3 == param1) {
              if (this.resolutionDropdown != null) {
                var4 = this.resolutionDropdown.getSelectedIndex(0);
                var5 = this.displayModes[var4];
                if (MissionConditionFactory.field_b.fullscreenWidth == var5.width &&
                  MissionConditionFactory.field_b.fullscreenHeight == var5.height) {
                  this.refreshModeSelection(-99);
                  return;
                }
                this.applyButton.enabled = true;
              }
              this.refreshModeSelection(-99);
            } else {
              this.refreshModeSelection(-99);
            }
          } else {
            this.refreshModeSelection(-99);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("hnb.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void closeDialog(byte param0) {
        if (!this.active) {
          return;
        }
        if (param0 >= -20) {
          return;
        }
        this.active = false;
    }

    DisplayModeDialog(ModalStack param0) {
        super(param0, 430, 254);
        int incrementValue$0 = 0;
        int var7_int = 0;
        boolean stackIn_31_1 = false;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        boolean stackIn_40_1 = false;
        int stackIn_48_0 = 0;
        Object stackIn_50_0;
        UiWeightedGridContainer stackIn_50_1;
        UiWeightedGridContainer stackIn_50_2;
        int stackIn_50_3;
        Object stackIn_51_0;
        UiWeightedGridContainer stackIn_52_1 = null;
        UiWeightedGridContainer stackIn_52_2 = null;
        int stackIn_52_4 = 0;
        int stackIn_57_1 = 0;
        String stackIn_74_0 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        DisplayMode[] var3_ref_fm__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        String var6 = null;
        UiFocusableComponent var6_ref = null;
        UiComponent var7 = null;
        DisplayMode var8 = null;
        String var10 = null;
        Object stackIn_50_0Lifetime1;
        UiWeightedGridContainer stackIn_52_1Lifetime1;
        UiWeightedGridContainer stackIn_52_2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var2_intLifetime1;
        int var3Lifetime2;
        try {
          this.displayModes = MissionBuilderFactory.listDisplayModesBlocking(SetTorpedoProjectiles.field_o, -30334);
          if (0 < this.displayModes.length) {
            for (var2_int = 0; var2_int < this.displayModes.length; var2_int++) {
              if (null != this.displayModes[var2_int]) {
                for (var3 = 1 + var2_int; this.displayModes.length > var3; var3++) {
                  if (null != this.displayModes[var3] &&
                    this.displayModes[var3].width == this.displayModes[var2_int].width &&
                    this.displayModes[var2_int].height == this.displayModes[var3].height) {
                    this.displayModes[var3] = null;
                  }
                }
                if (MissionConditionFactory.field_b != null &&
                  this.displayModes[var2_int] != null &&
                  !MissionConditionFactory.field_b.isValidSize(this.displayModes[var2_int].height, this.displayModes[var2_int].width, 0)) {
                  this.displayModes[var2_int] = null;
                }
              }
            }
            var2_int = 0;
            for (var3Lifetime2 = 0; this.displayModes.length > var3Lifetime2; var3Lifetime2++) {
              if (this.displayModes[var3Lifetime2] != null) {
                var2_int++;
              }
            }
            var3_ref_fm__ = this.displayModes;
            this.displayModes = new DisplayMode[var2_int];
            var4 = 0;
            for (var5 = 0; var5 < var3_ref_fm__.length; var5++) {
              if (null != var3_ref_fm__[var5]) {
                incrementValue$0 = var4;
                var4++;
                this.displayModes[incrementValue$0] = var3_ref_fm__[var5];
              }
            }
            SpecialOrderSubmessage.a(this.displayModes, (byte) 62);
          }
          stackIn_31_1 = !(this.displayModes.length <= 0);
          this.hasDisplayModes = stackIn_31_1;
          stackIn_34_0 = (!Particle.canResizeGameWindow((byte) 114)) ? 0 : 1;
          var2_intLifetime1 = stackIn_34_0;
          stackIn_37_0 = (var2_intLifetime1 == 0) ? 2 : 3;
          var3Lifetime1 = stackIn_37_0;
          stackIn_40_1 = !(GetPhasedEnergyBeamPulsetime.isGuestMode((byte) 110));
          this.field_J = stackIn_40_1;
          if (var2_intLifetime1 == 0) {
            if (MissionConditionFactory.field_b != null) {
              stackIn_48_0 = (MissionConditionFactory.field_b.isResizeMemoryRestricted((byte) -17)) ? 1 : 0;
            } else {
              stackIn_48_0 = 0;
            }
          } else {
            stackIn_48_0 = 0;
          }
          boolean decompiledFrameRemainder0 = true;
          var4Lifetime1 = stackIn_48_0;
          stackIn_50_0 = this;
          stackIn_50_1 = null;
          stackIn_50_2 = null;
          stackIn_50_3 = 10;
          if (var2_intLifetime1 == 0) {
            stackIn_51_0 = this;
            stackIn_50_0Lifetime1 = stackIn_51_0;
            if (var4Lifetime1 == 0) {
              stackIn_52_1 = null;
              stackIn_52_2 = null;
              stackIn_52_4 = 75;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_52_1Lifetime1 = null;
            stackIn_52_2Lifetime1 = null;
            stackIn_52_4 = 58;
          }
          this.modeGrid = new UiWeightedGridContainer(stackIn_50_3, stackIn_52_4, 410, 105, (UiRenderer) null, var3Lifetime1, 1);
          this.modeGrid.field_w = 83;
          this.modeGrid.setCellPadding(-6, 5, 5);
          this.addChild(-18756, this.modeGrid);
          this.classicButton = this.addModeButton(SetMissilesDamageSourceTeam.field_q, (byte) 111, (UiListener) (this), GetFighterRepairAmount.field_q);
          if (var2_intLifetime1 != 0) {
            this.resizableButton = this.addModeButton(SoundCache.field_b, (byte) 106, (UiListener) (this), SetUseBackground.field_p);
          }
          this.fullscreenButton = this.addModeButton(GetPointDefenceLaserReload.field_o, (byte) 110, (UiListener) (this), SpecialOrderSubmessage.field_f);
          if (var2_intLifetime1 == 0) {
            stackIn_57_1 = 2;
          } else {
            stackIn_57_1 = 3;
          }
          this.modeButtons = new UiFocusableComponent[stackIn_57_1];
          this.modeButtons[1] = this.fullscreenButton;
          if (var2_intLifetime1 != 0) {
            this.modeButtons[2] = this.resizableButton;
          }
          this.modeButtons[0] = this.classicButton;
          if (this.hasDisplayModes &&
            var2_intLifetime1 != 0) {
            var5_ref_String__ = new String[this.displayModes.length];
            var6_int = var5_ref_String__.length - 1;
            for (var7_int = 0; this.displayModes.length > var7_int; var7_int++) {
              var8 = this.displayModes[var7_int];
              if (psb.field_b != null &&
                var8.width == MissionConditionFactory.field_b.fullscreenWidth &&
                var8.height == MissionConditionFactory.field_b.fullscreenHeight) {
                var6_int = var7_int;
              }
              var5_ref_String__[var7_int] = var8.width + "<times>" + var8.height;
            }
            this.resolutionDropdown = new UiComboBox(var5_ref_String__, var6_int, 150);
            this.resolutionDropdown.setBounds(this.fullscreenButton.x + this.modeGrid.x, 126, 18, 1, -19 + (this.fullscreenButton.height + this.modeGrid.y + this.fullscreenButton.y));
            this.children.addFirst(this.resolutionDropdown, (byte) -55);
          }
          this.backButton = this.addActionButton(TextureSourceOperation.field_l, (UiListener) (this), -14);
          var5Lifetime1 = this.backButton.width / 2 + this.backButton.x;
          this.backButton.width = 150;
          this.backButton.x = -this.backButton.width + (var5Lifetime1 - 20);
          this.applyButton = this.addActionButton(SetVariableLabelActionFactory.field_a, (UiListener) (this), -14);
          this.applyButton.width = this.backButton.width;
          this.applyButton.enabled = false;
          this.applyButton.x = var5Lifetime1 + 20;
          if (var2_intLifetime1 != 0 ||
            var4Lifetime1 != 0) {
            if (var2_intLifetime1 != 0) {
              stackIn_74_0 = EnvironmentMapSource.field_a;
            } else {
              stackIn_74_0 = GetMissionVariablesHudY.field_q;
            }
            var10 = stackIn_74_0;
            var6 = var10;
            var7 = new UiComponent(var10, (UiListener) null);
            var7.x = 0;
            var7.width = this.width;
            var7.y = 163;
            var7.height = 80;
            var7.renderer = (UiRenderer) ((Object) new UiTextStyle(SetShipToShipRamDamage.field_o, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true));
            this.addChild(-18756, var7);
          }
          this.resolutionDropdownOpen = false;
          var6_ref = this.getCurrentModeButton((byte) 80);
          if (var6_ref != null) {
            var6_ref.active = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_80_0 = var2;
          stackIn_80_1 = new StringBuilder().append("hnb.<init>(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    private final UiFocusableComponent addModeButton(String param0, byte param1, UiListener param2, SoftwareIndexedSprite2D[] param3) {
        UiFocusableComponent var5 = null;
        RuntimeException var5_ref = null;
        UiWeightedGridContainer var6 = null;
        UiFocusableComponent var7 = null;
        UiFocusableComponent stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new UiFocusableComponent(param0, param2);
          var5.renderer = (UiRenderer) ((Object) new StateSpriteTextRenderer(param3));
          if (param1 < 105) {
            this.modeButtons = (UiFocusableComponent[]) null;
          }
          var6 = this.modeGrid;
          var7 = var5;
          var6.appendCell((UiComponent) (var7), (byte) -58, var6.field_w);
          this.modeGrid.refreshLayout(false);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("hnb.R(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 1) {
          field_U = (Sprite[]) null;
        }
        field_U = null;
        field_X = null;
    }

    public final void onAction(int param0, int param1, int param2, UiFocusableComponent param3, int param4) {
        UiFocusableComponent discarded$0 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        UiListener var8 = null;
        var7 = VoidHunters.field_G;
        try {
          if (param0 != 11) {
            var8 = (UiListener) null;
            discarded$0 = this.addActionButton((String) null, (UiListener) null, 51);
          }
          if (param3 == this.backButton) {
            this.closeDialog((byte) -31);
          } else {
            if (param3 == this.applyButton) {
              this.applySelectedMode(param0 ^ -44);
            } else {
              if (param3 == this.classicButton) {
                this.selectMode(true, param3);
              } else {
                if (param3 == this.resizableButton) {
                  this.selectMode(true, param3);
                } else {
                  if (null != this.resolutionDropdown) {
                    stackIn_13_0 = (this.resolutionDropdown.hovered) ? 1 : 0;
                  } else {
                    stackIn_13_0 = 0;
                  }
                  var6_int = stackIn_13_0;
                  if (var6_int == 0 &&
                    this.fullscreenButton == param3) {
                    if (!this.hasDisplayModes) {
                      this.modalStack.pushPanel(false, new DisplayModeErrorDialog(this.modalStack, ComponentAttachmentPlan.signedAppletRequired));
                      return;
                    }
                    if (GetDebrisCarryOver.field_o <= 0) {
                      this.modalStack.pushPanel(false, new FullscreenMembershipDialog(this.modalStack));
                      return;
                    }
                    this.selectMode(true, param3);
                    return;
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_28_0 = var6;
          stackIn_28_1 = new StringBuilder().append("hnb.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        boolean stackIn_76_0 = false;
        Object stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        try {
          var5 = null;
          if (param0 != -15834) {
            this.modeButtons = (UiFocusableComponent[]) null;
          }
          if (!this.classicButton.hasFocus((byte) -120)) {
            if (null != this.resizableButton &&
              this.resizableButton.hasFocus((byte) -120)) {
              var5 = this.resizableButton;
            } else {
              if (!this.fullscreenButton.hasFocus((byte) -120)) {
                if (this.backButton.hasFocus((byte) -120)) {
                  var5 = this.backButton;
                } else {
                  if (this.applyButton.hasFocus((byte) -120)) {
                    var5 = this.applyButton;
                  } else {
                    if (!this.classicButton.active) {
                      if (null != this.resizableButton &&
                        this.resizableButton.active) {
                        var5 = this.resizableButton;
                      } else {
                        if (this.fullscreenButton.active) {
                          var5 = this.fullscreenButton;
                        }
                      }
                    } else {
                      var5 = this.classicButton;
                    }
                  }
                }
              } else {
                var5 = this.fullscreenButton;
              }
            }
          } else {
            var5 = this.classicButton;
          }
          var6 = param1;
          switch (var6) {
            case 97:
              if (this.classicButton == var5) {
                if (null != this.resizableButton) {
                  this.resizableButton.requestFocus(param0 ^ -15834, (UiComponent) (this));
                } else {
                  this.fullscreenButton.requestFocus(0, (UiComponent) (this));
                }
                return true;
              }
              if (var5 == this.resizableButton) {
                this.fullscreenButton.requestFocus(0, (UiComponent) (this));
                return true;
              }
              if (var5 == this.backButton &&
                this.applyButton.enabled) {
                this.applyButton.requestFocus(0, (UiComponent) (this));
                return true;
              }
              break;
            case 99:
              if (var5 != this.classicButton &&
                this.resizableButton != var5) {
                if (this.fullscreenButton != var5) {
                  break;
                }
                if (this.applyButton.enabled) {
                  this.applyButton.requestFocus(param0 + 15834, (UiComponent) (this));
                } else {
                  this.backButton.requestFocus(param0 ^ -15834, (UiComponent) (this));
                }
                return true;
              }
              this.backButton.requestFocus(0, (UiComponent) (this));
              return true;
            case 98:
              if (this.backButton == var5) {
                this.classicButton.requestFocus(0, (UiComponent) (this));
                return true;
              }
              if (this.applyButton == var5) {
                this.fullscreenButton.requestFocus(0, (UiComponent) (this));
                return true;
              }
              break;
            case 96:
              if (var5 == this.fullscreenButton) {
                if (this.resizableButton != null) {
                  this.resizableButton.requestFocus(0, (UiComponent) (this));
                  return true;
                }
                this.classicButton.requestFocus(0, (UiComponent) (this));
                return true;
              }
              if (this.resizableButton == var5) {
                this.classicButton.requestFocus(0, (UiComponent) (this));
                return true;
              }
              if (var5 == this.applyButton) {
                this.backButton.requestFocus(0, (UiComponent) (this));
                return true;
              }
              break;
            default:
              break;
          }
          stackIn_76_0 = super.handleKey(-15834, param1, param2, param3);
          return stackIn_76_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("hnb.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) (stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param3).append(')').toString());
        }
    }

    private final UiFocusableComponent addActionButton(String param0, UiListener param1, int param2) {
        UiFocusableComponent var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        UiFocusableComponent stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new UiFocusableComponent(param0, param1);
          var4.renderer = (UiRenderer) ((Object) new ThreeSliceButtonStyle());
          var5 = this.height - 46;
          var4.setBounds(15, -16 + (param2 + this.width), 30, 1, var5);
          this.addChild(param2 ^ 18766, var4);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("hnb.W(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    private final UiFocusableComponent getCurrentModeButton(byte param0) {
        if (psb.field_b != null) {
          return this.fullscreenButton;
        }
        if (param0 <= 45) {
          String var3 = (String) null;
          DisplayModeDialog.containsPassword((byte) -60, (String) null);
        }
        if (MissionConditionFactory.field_b != null && MissionConditionFactory.field_b.resizable &&
          null != this.resizableButton) {
          return this.resizableButton;
        }
        return this.classicButton;
    }

    private final void refreshModeSelection(int param0) {
        UiFocusableComponent discarded$0 = null;
        UiFocusableComponent var4 = null;
        int var5 = VoidHunters.field_G;
        UiFocusableComponent[] var2 = this.modeButtons;
        int var3 = 0;
        if (param0 != -99) {
          discarded$0 = this.getCurrentModeButton((byte) -52);
        }
        while (var3 < var2.length) {
          var4 = var2[var3];
          var4.active = this.selectedModeButton == var4 ? true : false;
          var3++;
        }
    }

    private final void applySelectedMode(int param0) {
        int var3;
        int var2;
        var3 = VoidHunters.field_G;
        if (this.selectedModeButton != this.classicButton) {
          if (this.resizableButton == this.selectedModeButton) {
            FullscreenExit.exitFullscreen((byte) -95);
            LegacyOpenGlTurbulenceEffect.makeGameWindowResizable(-10128);
          } else {
            if (this.fullscreenButton == this.selectedModeButton) {
              if (null != this.resolutionDropdown) {
                var2 = this.resolutionDropdown.getSelectedIndex(0);
                if (var2 >= 0) {
                  MissionConditionFactory.field_b.setFullscreenSize(this.displayModes[var2].height, 480, this.displayModes[var2].width);
                }
                SetReadyRoomMutatorTime.a(2, true);
                this.modalStack.pushPanel(false, new tda(this.modalStack));
              } else {
                SetReadyRoomMutatorTime.a(2, true);
                this.modalStack.pushPanel(false, new tda(this.modalStack));
              }
            }
          }
        } else {
          FullscreenExit.exitFullscreen((byte) -95);
          SetVariableLabelAction.d(0);
        }
        if (param0 >= -18) {
          return;
        }
        this.applyButton.enabled = false;
    }

    final static boolean containsPassword(byte param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -72) {
            return true;
          }
          if (SetLagVariant.passwordForChatFilter != null) {
            stackIn_9_0 = !(param1.toLowerCase().indexOf(SetLagVariant.passwordForChatFilter.toLowerCase()) < 0);
            return stackIn_9_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("hnb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
    }
}
