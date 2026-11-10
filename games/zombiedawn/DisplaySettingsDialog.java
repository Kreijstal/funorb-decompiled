/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplaySettingsDialog extends ResizableDialog implements ButtonActionListener {
    static Sprite[] field_eb;
    private DropdownList field_hb;
    private TextButton[] field_U;
    private TextButton field_W;
    private FullscreenExitHelpers[] field_fb;
    static int field_Y;
    private TextButton field_V;
    private TextButton field_gb;
    private boolean field_cb;
    private TextButton field_bb;
    private boolean field_ab;
    private GridContainer field_T;
    static int[] field_db;
    private TextButton field_ib;
    private boolean field_Z;
    private TextButton field_X;

    private final TextButton getCurrentModeButton(int param0) {
        if (DisplayState.field_b != null) {
          return this.field_V;
        }
        if (param0 != 16) {
          this.field_cb = true;
        }
        if (null != SpriteSheetDecoder.field_b && SpriteSheetDecoder.field_b.field_c &&
          null != this.field_W) {
          return this.field_W;
        }
        return this.field_bb;
    }

    private final TextButton addButton(byte param0, String param1, WidgetListener param2) {
        TextButton var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        TextButton stackIn_2_0 = null;
        TextButton stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new TextButton(param1, param2);
          var4.field_h = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
          var5 = this.field_n - 46;
          if (param0 >= -38) {
            stackIn_2_0 = (TextButton) null;
            return stackIn_2_0;
          }
          var4.setBounds(-71, var5, 15, this.field_i - 30, 30);
          this.addChild((UiWidget) (var4), 10);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("lb.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 > -63) {
          DisplaySettingsDialog.isConnectionReady(9);
        }
        field_db = null;
        field_eb = null;
    }

    public final void onButtonActivated(int param0, int param1, TextButton param2, int param3, int param4) {
        int stackIn_15_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        try {
          if (param1 != -6) {
            this.field_fb = (FullscreenExitHelpers[]) null;
          }
          if (this.field_X == param2) {
            this.closeSettings((byte) -92);
          } else {
            if (param2 == this.field_gb) {
              this.applySelectedOption((byte) -67);
            } else {
              if (param2 != this.field_bb) {
                if (param2 != this.field_W) {
                  if (null != this.field_hb) {
                    stackIn_15_0 = (this.field_hb.field_l) ? 1 : 0;
                  } else {
                    stackIn_15_0 = 0;
                  }
                  var6_int = stackIn_15_0;
                  if (var6_int == 0 &&
                    param2 == this.field_V) {
                    if (!this.field_cb) {
                      this.field_F.addDialog(new FullscreenErrorDialog(this.field_F, AgeValidator.field_f), true);
                      return;
                    }
                    if (OctaveNoiseMap.field_j > 0) {
                      this.selectButton(param2, -115);
                      return;
                    }
                    this.field_F.addDialog(new FullscreenMembershipDialog(this.field_F), true);
                    return;
                  }
                } else {
                  this.selectButton(param2, -104);
                }
              } else {
                this.selectButton(param2, param1 ^ -91);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_28_0 = var6;
          stackIn_28_1 = new StringBuilder().append("lb.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void applySelectedOption(byte param0) {
        int var2;
        int var3;
        TextButton var4;
        var3 = ZombieDawn.field_J;
        if (this.field_bb == this.field_ib) {
          FullscreenExitHelpers.exitFullscreen((byte) -71);
          ArmySoldier.leaveResizableMode(-55);
        } else {
          if (this.field_ib != this.field_W) {
            if (this.field_ib == this.field_V) {
              if (this.field_hb != null) {
                var2 = this.field_hb.getSelectedIndex(0);
                if (0 <= var2) {
                  SpriteSheetDecoder.field_b.setFullscreenSize(this.field_fb[var2].field_d, this.field_fb[var2].field_a, 124);
                }
              }
              DisplayState.requestFullscreen(true, false);
              this.field_F.addDialog(new FullscreenConfirmationDialog(this.field_F), true);
            }
          } else {
            FullscreenExitHelpers.exitFullscreen((byte) -71);
            ResizableModeHelpers.requestResizableMode((byte) 114);
          }
        }
        this.field_gb.field_C = false;
        if (param0 > -46) {
          var4 = (TextButton) null;
          this.selectButton((TextButton) null, -96);
        }
    }

    private final void selectButton(TextButton param0, int param1) {
        TextButton var3 = null;
        int var4 = 0;
        int var5 = 0;
        FullscreenExitHelpers var6 = null;
        TextButton stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          this.field_ib = param0;
          var4 = -49 / ((param1 + 40) / 47);
          param0.focusNext((byte) 68, (UiWidget) (this));
          var3 = this.getCurrentModeButton(16);
          stackIn_2_0 = this.field_gb;
          stackIn_3_1 = (var3 != param0);
          stackIn_2_0.field_C = stackIn_3_1;
          if (this.field_V == param0) {
            if (var3 == param0) {
              if (null != this.field_hb) {
                var5 = this.field_hb.getSelectedIndex(0);
                var6 = this.field_fb[var5];
                if (var6.field_a == SpriteSheetDecoder.field_b.field_t &&
                  SpriteSheetDecoder.field_b.field_i == var6.field_d) {
                  this.refreshButtonHighlights(-18681);
                  return;
                }
                this.field_gb.field_C = true;
                this.refreshButtonHighlights(-18681);
              } else {
                this.refreshButtonHighlights(-18681);
              }
            } else {
              this.refreshButtonHighlights(-18681);
            }
          } else {
            this.refreshButtonHighlights(-18681);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("lb.L(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final void updatePointer(UiWidget param0, byte param1, int param2, int param3) {
        int var6 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        TextButton[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        TextButton var7 = null;
        int var8 = 0;
        TextButton[] var9 = null;
        var8 = ZombieDawn.field_J;
        try {
          super.updatePointer(param0, (byte) 88, param2, param3);
          if (LoginCredentials.field_a) {
            param0.blur((byte) 57);
            var9 = this.field_U;
            var5 = var9;
            for (var6 = 0; var6 < var9.length; var6++) {
              var7 = var9[var6];
              if (var7.field_l) {
                var7.focusNext((byte) 126, (UiWidget) (this));
              }
            }
          }
          if (!this.field_ab &&
            !MeleeHuman.isGuestSession(13296)) {
            this.closeSettings((byte) -117);
            this.field_F.addDialog(new DisplaySettingsDialog(this.field_F), true);
          }
          if (null != this.field_hb) {
            stackIn_15_0 = (this.field_hb.isListOpen((byte) -43)) ? 0 : 1;
            if (stackIn_15_0 == (this.field_Z ? 1 : 0)) {
              this.selectButton(this.field_V, 115);
              this.field_Z = this.field_hb.isListOpen((byte) -24);
            }
          }
          var5_int = -47 % ((param1 - 46) / 42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_22_0 = var5_ref;
          stackIn_22_1 = new StringBuilder().append("lb.D(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean requestKeyboardFocus(int param0, int param1, UiWidget param2, char param3) {
        boolean stackIn_73_0 = false;
        Object stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        try {
          var5 = null;
          if (this.field_bb.isFocused(-17741)) {
            var5 = this.field_bb;
          } else {
            if (this.field_W != null &&
              this.field_W.isFocused(-17741)) {
              var5 = this.field_W;
            } else {
              if (this.field_V.isFocused(-17741)) {
                var5 = this.field_V;
              } else {
                if (this.field_X.isFocused(-17741)) {
                  var5 = this.field_X;
                } else {
                  if (this.field_gb.isFocused(-17741)) {
                    var5 = this.field_gb;
                  } else {
                    if (!this.field_bb.field_x) {
                      if (null != this.field_W &&
                        this.field_W.field_x) {
                        var5 = this.field_W;
                      } else {
                        if (this.field_V.field_x) {
                          var5 = this.field_V;
                        }
                      }
                    } else {
                      var5 = this.field_bb;
                    }
                  }
                }
              }
            }
          }
          var6 = param1;
          switch (var6) {
            case 97:
              if (var5 == this.field_bb) {
                if (null != this.field_W) {
                  this.field_W.focusNext((byte) 110, (UiWidget) (this));
                } else {
                  this.field_V.focusNext((byte) 111, (UiWidget) (this));
                }
                return true;
              }
              if (var5 == this.field_W) {
                this.field_V.focusNext((byte) 85, (UiWidget) (this));
                return true;
              }
              if (var5 == this.field_X &&
                this.field_gb.field_C) {
                this.field_gb.focusNext((byte) 74, (UiWidget) (this));
                return true;
              }
              break;
            case 99:
              if (var5 != this.field_bb &&
                var5 != this.field_W) {
                if (var5 != this.field_V) {
                  break;
                }
                if (!this.field_gb.field_C) {
                  this.field_X.focusNext((byte) 68, (UiWidget) (this));
                } else {
                  this.field_gb.focusNext((byte) 92, (UiWidget) (this));
                }
                return true;
              }
              this.field_X.focusNext((byte) 116, (UiWidget) (this));
              return true;
            case 98:
              if (var5 == this.field_X) {
                this.field_bb.focusNext((byte) 89, (UiWidget) (this));
                return true;
              }
              if (this.field_gb == var5) {
                this.field_V.focusNext((byte) 102, (UiWidget) (this));
                return true;
              }
              break;
            case 96:
              if (var5 == this.field_V) {
                if (null != this.field_W) {
                  this.field_W.focusNext((byte) 125, (UiWidget) (this));
                  return true;
                }
                this.field_bb.focusNext((byte) 84, (UiWidget) (this));
                return true;
              }
              if (var5 == this.field_W) {
                this.field_bb.focusNext((byte) 125, (UiWidget) (this));
                return true;
              }
              if (var5 == this.field_gb) {
                this.field_X.focusNext((byte) 74, (UiWidget) (this));
                return true;
              }
              break;
            default:
              break;
          }
          var6 = -79 / ((param0 + 83) / 32);
          stackIn_73_0 = super.requestKeyboardFocus(-118, param1, param2, param3);
          return stackIn_73_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_76_0 = var5;
          stackIn_76_1 = new StringBuilder().append("lb.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) (stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void refreshButtonHighlights(int param0) {
        int var3 = 0;
        TextButton var4 = null;
        int var5 = ZombieDawn.field_J;
        if (param0 != -18681) {
          return;
        }
        TextButton[] var6 = this.field_U;
        TextButton[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          var4.field_x = var4 == this.field_ib ? true : false;
        }
    }

    final static boolean isConnectionReady(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 >= -77) {
          DisplaySettingsDialog.releaseStatics((byte) 52);
        }
        stackIn_6_0 = (LoginMethod.field_c != null) && (ValidatedTextWidget.field_T.isPostRequestStage(-44));
        return stackIn_6_0;
    }

    private final TextButton addIconButton(String param0, IndexedSprite[] param1, byte param2, WidgetListener param3) {
        TextButton var5 = null;
        RuntimeException var5_ref = null;
        GridContainer var6 = null;
        TextButton var7 = null;
        TextButton stackIn_2_0 = null;
        TextButton stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new TextButton(param0, param3);
          var5.field_h = (WidgetPainter) ((Object) new IconButtonPainter(param1));
          if (param2 != 32) {
            stackIn_2_0 = (TextButton) null;
            return stackIn_2_0;
          }
          var6 = this.field_T;
          var7 = var5;
          var6.addCell(0, var7, var6.field_M);
          this.field_T.reapplyBounds(true);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("lb.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    DisplaySettingsDialog(DialogLayer param0) {
        super(param0, 430, 254);
        int incrementValue$0 = 0;
        int var7_int = 0;
        boolean stackIn_31_1 = false;
        int stackIn_34_0 = 0;
        boolean stackIn_37_1 = false;
        int stackIn_40_0 = 0;
        int stackIn_48_0 = 0;
        Object stackIn_50_0;
        GridContainer stackIn_50_1;
        GridContainer stackIn_50_2;
        int stackIn_50_3;
        Object stackIn_51_0;
        GridContainer stackIn_52_1 = null;
        GridContainer stackIn_52_2 = null;
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
        FullscreenExitHelpers[] var3_ref_re__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        String var6 = null;
        TextButton var6_ref = null;
        UiWidget var7 = null;
        FullscreenExitHelpers var8 = null;
        String var10 = null;
        Object stackIn_50_0Lifetime1;
        GridContainer stackIn_52_1Lifetime1;
        GridContainer stackIn_52_2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var2_intLifetime1;
        int var3Lifetime2;
        try {
          this.field_fb = DropdownSelectorPainter.enumerateFullscreenModes(0, SpriteFadeHelpers.field_a);
          if (this.field_fb.length > 0) {
            for (var2_int = 0; var2_int < this.field_fb.length; var2_int++) {
              if (this.field_fb[var2_int] != null) {
                for (var3 = 1 + var2_int; this.field_fb.length > var3; var3++) {
                  if (null != this.field_fb[var3] &&
                    this.field_fb[var2_int].field_a == this.field_fb[var3].field_a &&
                    this.field_fb[var3].field_d == this.field_fb[var2_int].field_d) {
                    this.field_fb[var3] = null;
                  }
                }
                if (null != SpriteSheetDecoder.field_b &&
                  this.field_fb[var2_int] != null &&
                  !SpriteSheetDecoder.field_b.acceptsDimensions(this.field_fb[var2_int].field_d, this.field_fb[var2_int].field_a, 79)) {
                  this.field_fb[var2_int] = null;
                }
              }
            }
            var2_int = 0;
            for (var3Lifetime2 = 0; this.field_fb.length > var3Lifetime2; var3Lifetime2++) {
              if (this.field_fb[var3Lifetime2] != null) {
                var2_int++;
              }
            }
            var3_ref_re__ = this.field_fb;
            this.field_fb = new FullscreenExitHelpers[var2_int];
            var4 = 0;
            for (var5 = 0; var3_ref_re__.length > var5; var5++) {
              if (var3_ref_re__[var5] != null) {
                incrementValue$0 = var4;
                var4++;
                this.field_fb[incrementValue$0] = var3_ref_re__[var5];
              }
            }
            MinigunGunner.sortDisplayModes(this.field_fb, 0);
          }
          stackIn_31_1 = !(0 >= this.field_fb.length);
          this.field_cb = stackIn_31_1;
          stackIn_34_0 = (!GlassShard.hasPendingResize((byte) 126)) ? 0 : 1;
          var2_intLifetime1 = stackIn_34_0;
          stackIn_37_1 = !(MeleeHuman.isGuestSession(13296));
          this.field_ab = stackIn_37_1;
          stackIn_40_0 = (var2_intLifetime1 == 0) ? 2 : 3;
          var3Lifetime1 = stackIn_40_0;
          if (var2_intLifetime1 == 0) {
            if (null != SpriteSheetDecoder.field_b) {
              stackIn_48_0 = (SpriteSheetDecoder.field_b.isMemoryInsufficient(0)) ? 1 : 0;
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
          this.field_T = new GridContainer(stackIn_50_3, stackIn_52_4, 410, 105, (WidgetPainter) null, var3Lifetime1, 1);
          this.field_T.field_M = 83;
          this.field_T.setCellInsets((byte) 106, 5, 5);
          this.addChild(this.field_T, 10);
          this.field_bb = this.addIconButton(LoginPromptTexts.field_a, PopupMenuBuilder.field_e, (byte) 32, (WidgetListener) (this));
          if (var2_intLifetime1 != 0) {
            this.field_W = this.addIconButton(MusicPatch.field_n, JaggrabDownloader.field_h, (byte) 32, (WidgetListener) (this));
          }
          this.field_V = this.addIconButton(ArchiveLoadStep.field_j, ClientProtocolStage.field_c, (byte) 32, (WidgetListener) (this));
          if (var2_intLifetime1 != 0) {
            stackIn_57_1 = 3;
          } else {
            stackIn_57_1 = 2;
          }
          this.field_U = new TextButton[stackIn_57_1];
          this.field_U[1] = this.field_V;
          this.field_U[0] = this.field_bb;
          if (var2_intLifetime1 != 0) {
            this.field_U[2] = this.field_W;
          }
          if (this.field_cb &&
            var2_intLifetime1 != 0) {
            var5_ref_String__ = new String[this.field_fb.length];
            var6_int = -1 + var5_ref_String__.length;
            for (var7_int = 0; var7_int < this.field_fb.length; var7_int++) {
              var8 = this.field_fb[var7_int];
              if (DisplayState.field_b != null &&
                SpriteSheetDecoder.field_b.field_t == var8.field_a &&
                SpriteSheetDecoder.field_b.field_i == var8.field_d) {
                var6_int = var7_int;
              }
              var5_ref_String__[var7_int] = var8.field_a + "<times>" + var8.field_d;
            }
            this.field_hb = new DropdownList(var5_ref_String__, var6_int, 150);
            this.field_hb.setBounds(-87, -19 + (this.field_V.field_j + (this.field_T.field_j + this.field_V.field_n)), this.field_V.field_k + this.field_T.field_k, 126, 18);
            this.field_x.addLast(this.field_hb, -123);
          }
          this.field_X = this.addButton((byte) -101, EmailAvailabilityValidator.field_j, (WidgetListener) (this));
          var5Lifetime1 = this.field_X.field_i / 2 + this.field_X.field_k;
          this.field_X.field_i = 150;
          this.field_X.field_k = -20 + (var5Lifetime1 - this.field_X.field_i);
          this.field_gb = this.addButton((byte) -80, WhirlpoolHasher.field_h, (WidgetListener) (this));
          this.field_gb.field_k = var5Lifetime1 + 20;
          this.field_gb.field_i = this.field_X.field_i;
          this.field_gb.field_C = false;
          if (var2_intLifetime1 != 0 ||
            var4Lifetime1 != 0) {
            if (var2_intLifetime1 != 0) {
              stackIn_74_0 = MarkerSliderPainter.field_h;
            } else {
              stackIn_74_0 = PowerupNames.field_a;
            }
            var10 = stackIn_74_0;
            var6 = var10;
            var7 = new UiWidget(var10, (WidgetListener) null);
            var7.field_i = this.field_i;
            var7.field_j = 163;
            var7.field_k = 0;
            var7.field_n = 80;
            var7.field_h = (WidgetPainter) ((Object) new TextWidgetPainter(MenuFontGlobals.field_e, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true));
            this.addChild(var7, 10);
          }
          this.field_Z = false;
          var6_ref = this.getCurrentModeButton(16);
          if (var6_ref != null) {
            var6_ref.field_x = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_80_0 = var2;
          stackIn_80_1 = new StringBuilder().append("lb.<init>(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    private final void closeSettings(byte param0) {
        if (!this.field_H) {
          return;
        }
        this.field_H = false;
        if (param0 > -87) {
          this.field_ib = (TextButton) null;
        }
    }

    static {
        field_db = new int[8192];
    }
}
