/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiScrollBar extends UiArrayContainer implements UiActionListener {
    private UiFocusableComponent upButton;
    private boolean verticalScrolling;
    private boolean arrowAndKeyboardInputEnabled;
    private UiFocusableComponent track;
    private int minimumThumbWidth;
    int verticalLineStep;
    private UiFocusableComponent rightButton;
    private int verticalPageStep;
    private int horizontalPageStep;
    private boolean horizontalScrolling;
    private int minimumThumbHeight;
    int verticalPosition;
    private UiDraggableContainer thumb;
    private int horizontalLineStep;
    private UiFocusableComponent leftButton;
    static byte[][] field_E;
    static GameStateFactory field_z;
    int horizontalPosition;
    private UiFocusableComponent downButton;

    public final void onAction(int param0, int param1, int param2, UiFocusableComponent param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = VoidHunters.field_G;
        try {
          if (param1 == 1 &&
            this.arrowAndKeyboardInputEnabled) {
            if (this.verticalScrolling &&
              this.upButton == param3) {
              this.setVerticalPositionAndNotify((byte) -17, -this.verticalLineStep + this.verticalPosition);
            } else {
              if (this.verticalScrolling &&
                this.downButton == param3) {
                this.setVerticalPositionAndNotify((byte) -17, this.verticalLineStep + this.verticalPosition);
              } else {
                if (this.horizontalScrolling &&
                  this.leftButton == param3) {
                  this.setHorizontalPositionAndNotify(-51, this.horizontalPosition - this.horizontalLineStep);
                } else {
                  if (this.horizontalScrolling &&
                    this.rightButton == param3) {
                    this.setHorizontalPositionAndNotify(-23, this.horizontalPosition + this.horizontalLineStep);
                  }
                }
              }
            }
          }
          if (param0 != 11) {
            this.verticalScrolling = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("vcb.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    final void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var5_intLifetime1;
        int var5_intLifetime2;
        var7 = VoidHunters.field_G;
        try {
          super.updatePointer(param0, param1, param2, param3);
          if ((!(this.thumb.child instanceof UiFocusableComponent) ||
            ((UiFocusableComponent) (this.thumb.child)).enabled) && this.thumb.pressedButton == 1) {
            if (this.horizontalScrolling) {
              var5_int = this.horizontalPosition;
              this.readHorizontalPositionFromThumb((byte) 79);
              if (var5_int != this.horizontalPosition &&
                this.listener instanceof UiScrollListener) {
                ((UiScrollListener) (this.listener)).onScrollDragged(this, this.horizontalPosition, this.horizontalPosition, true);
              }
            } else {
              this.updateThumbX((byte) -8);
            }
            if (!this.verticalScrolling) {
              this.updateThumbY(param2 ^ -981);
            } else {
              var5_intLifetime2 = this.verticalPosition;
              this.readVerticalPositionFromThumb(127);
              if (var5_intLifetime2 != this.verticalPosition &&
                this.listener instanceof UiScrollListener) {
                ((UiScrollListener) (this.listener)).onScrollDragged(this, this.verticalPosition, this.horizontalPosition, true);
              }
            }
          }
          if (this.track.enabled &&
            1 == this.track.activatedButton) {
            if (this.verticalScrolling) {
              if (!this.horizontalScrolling) {
                if (OpenGlFaceAttachment.field_b <= param0 - (-this.thumb.y - (this.thumb.height >> 1))) {
                  this.setVerticalPositionAndNotify((byte) -17, this.verticalPosition - this.verticalPageStep);
                  return;
                }
                this.setVerticalPositionAndNotify((byte) -17, this.verticalPosition + this.verticalPageStep);
                return;
              }
              var5_intLifetime1 = -this.thumb.x - (this.thumb.width >> 1) + (-param1 + PlayerGameData.field_b) - this.x;
              var6 = OpenGlFaceAttachment.field_b - param0 + (-this.y - (this.thumb.y + (this.thumb.height >> 1)));
              if (Math.abs(var6) <= Math.abs(var5_intLifetime1)) {
                if (var5_intLifetime1 <= 0) {
                  this.setHorizontalPositionAndNotify(-116, this.horizontalPosition - this.horizontalPageStep);
                  return;
                }
                this.setHorizontalPositionAndNotify(-15, this.horizontalPageStep + this.horizontalPosition);
                return;
              }
              if (0 < var6) {
                this.setVerticalPositionAndNotify((byte) -17, this.verticalPosition + this.verticalPageStep);
                return;
              }
              this.setVerticalPositionAndNotify((byte) -17, -this.verticalPageStep + this.verticalPosition);
              return;
            }
            if (this.horizontalScrolling) {
              if ((this.thumb.width >> 1) + (this.thumb.x + param1) >= PlayerGameData.field_b) {
                this.setHorizontalPositionAndNotify(107, -this.horizontalPageStep + this.horizontalPosition);
                return;
              }
              this.setHorizontalPositionAndNotify(-102, this.horizontalPosition + this.horizontalPageStep);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_39_0 = var5;
          stackIn_39_1 = new StringBuilder().append("vcb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final void updateHorizontalThumbSize(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 != 21944) {
          UiComponent var5 = (UiComponent) null;
          this.handleKey(-20, -95, (UiComponent) null, 'J');
        }
        if (param0 < param2) {
          var4 = this.track.width * param0 / param2;
          if (var4 < this.minimumThumbWidth) {
            var4 = this.minimumThumbWidth;
          }
          this.thumb.setBounds(this.thumb.x, var4, this.thumb.height, 1, this.thumb.y);
          this.setHorizontalControlsEnabled((byte) -63, true);
        } else {
          this.thumb.setBounds(this.thumb.x, this.track.width, this.thumb.height, param1 ^ 21945, this.thumb.y);
          this.setHorizontalControlsEnabled((byte) -110, false);
        }
        this.updateThumbX((byte) -8);
    }

    final void setVerticalPosition(int param0, int param1) {
        int var4;
        QuickChatCategoryDefinition var5;
        var4 = VoidHunters.field_G;
        if (param1 < 0) {
          this.verticalPosition = 0;
        } else {
          if (param1 > 65536) {
            this.verticalPosition = 65536;
          } else {
            this.verticalPosition = param1;
          }
        }
        this.updateThumbY(0);
        if (param0 != -3393) {
          var5 = (QuickChatCategoryDefinition) null;
          UiScrollBar.createQuickChatCategoryMenu(33, (Widget) null, (Widget) null, (Widget) null, (QuickChatCategoryDefinition) null);
        }
    }

    private final void readVerticalPositionFromThumb(int param0) {
        int var2 = this.upButton == null ? this.track.y : this.upButton.height + this.upButton.y;
        int var3 = null != this.downButton ? -this.thumb.height + this.downButton.y : this.track.height + this.track.y - this.thumb.height;
        int var4 = 68 / ((9 - param0) / 59);
        this.setVerticalPosition(-3393, var3 <= var2 ? 0 : (this.thumb.y - var2 << 16) / (var3 - var2));
    }

    private final void setHorizontalPositionAndNotify(int param0, int param1) {
        this.setHorizontalPosition(param1, 65536);
        int var3 = -73 % ((param0 - 35) / 49);
        if (this.listener instanceof UiScrollListener) {
          ((UiScrollListener) (this.listener)).onScrollChanged(this.horizontalPosition, this.verticalPosition, this, -125);
        }
    }

    private final void setVerticalControlsEnabled(int param0, boolean param1) {
        UiFocusableComponent stackIn_5_0 = null;
        boolean stackIn_7_1 = false;
        UiFocusableComponent stackIn_12_0 = null;
        boolean stackIn_14_1 = false;
        UiFocusableComponent stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        UiFocusableComponent stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        if (param0 != 0) {
          this.readHorizontalPositionFromThumb((byte) -20);
        }
        stackIn_5_0 = this.track;
        stackIn_7_1 = (param1) || (this.horizontalScrolling);
        stackIn_5_0.enabled = stackIn_7_1;
        if (this.thumb.child instanceof UiFocusableComponent) {
          stackIn_12_0 = (UiFocusableComponent) (this.thumb.child);
          stackIn_14_1 = (param1) || (this.horizontalScrolling);
          stackIn_12_0.enabled = stackIn_14_1;
        }
        if (this.upButton != null) {
          stackIn_18_0 = this.upButton;
          stackIn_19_1 = (!param1) ? false : true;
          stackIn_18_0.enabled = stackIn_19_1;
        }
        if (null != this.downButton) {
          stackIn_23_0 = this.downButton;
          stackIn_24_1 = (!param1) ? false : true;
          stackIn_23_0.enabled = stackIn_24_1;
        }
    }

    final void updateVerticalThumbSize(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 > param0) {
          var4 = this.track.height * param0 / param1;
          if (this.minimumThumbHeight > var4) {
            var4 = this.minimumThumbHeight;
          }
          this.thumb.setBounds(this.thumb.x, this.thumb.width, var4, 1, this.thumb.y);
          this.setVerticalControlsEnabled(0, true);
        } else {
          this.thumb.setBounds(this.thumb.x, this.thumb.width, this.track.height, 1, this.thumb.y);
          this.setVerticalControlsEnabled(0, false);
        }
        this.updateThumbY(0);
        if (param2 < 126) {
          QuickChatCategoryDefinition var5 = (QuickChatCategoryDefinition) null;
          UiScrollBar.createQuickChatCategoryMenu(-91, (Widget) null, (Widget) null, (Widget) null, (QuickChatCategoryDefinition) null);
        }
    }

    private final void readHorizontalPositionFromThumb(byte param0) {
        if (param0 <= 49) {
          this.updateVerticalThumbSize(17, -59, -81);
        }
        int var2 = null != this.leftButton ? this.leftButton.x + this.leftButton.width : this.track.x;
        int var3 = this.rightButton != null ? this.rightButton.x - this.thumb.width : this.track.width + this.track.x - this.thumb.width;
        this.setHorizontalPosition(var3 <= var2 ? 0 : (this.thumb.x - var2 << 16) / (var3 - var2), 65536);
    }

    UiScrollBar(int param0, int param1, int param2, int param3, UiRenderer param4, UiRenderer param5, UiRenderer param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        UiDraggableContainer dupTemp$0 = null;
        UiFocusableComponent dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
        this.verticalPageStep = 8192;
        this.horizontalPageStep = 8192;
        this.minimumThumbHeight = 0;
        this.arrowAndKeyboardInputEnabled = true;
        this.verticalPosition = 32768;
        this.horizontalLineStep = 1024;
        this.minimumThumbWidth = 0;
        this.verticalLineStep = 1024;
        this.horizontalPosition = 32768;
        try {
          this.children = new UiComponent[6];
          dupTemp$0 = new UiDraggableContainer(param0, param1, param7, param8, (UiRenderer) null, (UiListener) null, new UiFocusableComponent(0, 0, param7, param8, param6, (UiListener) null), false, false);
          this.thumb = dupTemp$0;
          this.children[0] = (UiComponent) ((Object) dupTemp$0);
          dupTemp$1 = new UiFocusableComponent(param0, param1, param7, param8, param5, (UiListener) null);
          this.track = dupTemp$1;
          this.children[1] = (UiComponent) ((Object) dupTemp$1);
          stackIn_4_1 = (param11);
          this.horizontalScrolling = stackIn_4_1;
          stackIn_7_1 = (param12);
          this.verticalScrolling = stackIn_7_1;
          this.minimumThumbWidth = param9;
          this.minimumThumbHeight = param10;
          this.setHorizontalPosition(param13, 65536);
          this.setVerticalPosition(-3393, param14);
          this.setBounds(param0, param2, param3, 1, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_11_0 = var16;
          stackIn_11_1 = new StringBuilder().append("vcb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param6 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != -7) {
          field_E = (byte[][]) null;
        }
        field_E = (byte[][]) null;
        field_z = null;
    }

    private final int getVerticalThumbFraction(byte param0) {
        if (param0 != 110) {
          this.horizontalPosition = 17;
        }
        return (this.thumb.height << 16) / this.track.height;
    }

    private final void setHorizontalControlsEnabled(byte param0, boolean param1) {
        UiFocusableComponent stackIn_3_0 = null;
        boolean stackIn_5_1 = false;
        UiFocusableComponent stackIn_11_0 = null;
        boolean stackIn_13_1 = false;
        UiFocusableComponent stackIn_17_0 = null;
        boolean stackIn_18_1 = false;
        UiFocusableComponent stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        stackIn_3_0 = this.track;
        stackIn_5_1 = (param1) || (this.verticalScrolling);
        stackIn_3_0.enabled = stackIn_5_1;
        if (param0 > -34) {
          return;
        }
        if (this.thumb.child instanceof UiFocusableComponent) {
          stackIn_11_0 = (UiFocusableComponent) (this.thumb.child);
          stackIn_13_1 = (param1) || (this.verticalScrolling);
          stackIn_11_0.enabled = stackIn_13_1;
        }
        if (this.leftButton != null) {
          stackIn_17_0 = this.leftButton;
          stackIn_18_1 = (!param1) ? false : true;
          stackIn_17_0.enabled = stackIn_18_1;
        }
        if (this.rightButton != null) {
          stackIn_22_0 = this.rightButton;
          stackIn_23_1 = (!param1) ? false : true;
          stackIn_22_0.enabled = stackIn_23_1;
        }
    }

    private final void updateThumbY(int param0) {
        int var2 = null == this.upButton ? this.track.y : this.upButton.height + this.upButton.y;
        int var3 = null == this.downButton ? this.track.y + (this.track.height - this.thumb.height) : this.downButton.y - this.thumb.height;
        this.thumb.y = (this.verticalPosition * (-var2 + var3) >> 16) + var2;
        if (param0 != 0) {
          UiScrollBar.increaseMusicVolume(-79);
        }
    }

    private final void updateThumbX(byte param0) {
        if (param0 != -8) {
          this.layoutChildren(116);
        }
        int var2 = null == this.leftButton ? this.track.x : this.leftButton.width + this.leftButton.x;
        int var3 = null != this.rightButton ? -this.thumb.width + this.rightButton.x : this.track.width + (this.track.x - this.thumb.width);
        this.thumb.x = ((var3 - var2) * this.horizontalPosition >> 16) + var2;
    }

    final static QuickChatMenuWidget createQuickChatCategoryMenu(int param0, Widget param1, Widget param2, Widget param3, QuickChatCategoryDefinition param4) {
        int var14 = 0;
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        QuickChatMenuWidget stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        QuickChatMenuWidget[] var11 = null;
        int var12 = 0;
        QuickChatCategoryDefinition var13_ref_rn = null;
        int var13 = 0;
        int var15 = 0;
        QuickChatPhraseDefinition var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int var12Lifetime1;
        var17 = VoidHunters.field_G;
        try {
          if (param4 == null) {
            stackIn_3_0 = null;
            return (QuickChatMenuWidget) (stackIn_3_0);
          }
          if (param4.categoryIds != null) {
            stackIn_7_0 = param4.categoryIds.length;
          } else {
            stackIn_7_0 = 0;
          }
          var5_int = stackIn_7_0;
          if (null == param4.phraseIds) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = param4.phraseIds.length;
          }
          var6 = stackIn_10_0;
          var7 = var5_int + var6;
          var8 = new String[var7];
          if (param0 != 0) {
            UiScrollBar.clearSharedReferences((byte) 98);
          }
          var21 = new char[var7];
          var19 = var21;
          var9 = var19;
          var20 = new int[var7];
          var18 = var20;
          var10 = var18;
          var11 = new QuickChatMenuWidget[var7];
          if (null != param4.categoryIds) {
            for (var12 = 0; var12 < param4.categoryIds.length; var12++) {
              var13_ref_rn = TileTextureOperation.field_i.getCategory((byte) -72, param4.categoryIds[var12]);
              var8[var12] = var13_ref_rn.label;
              var9[var12] = param4.categoryShortcuts[var12];
              var11[var12] = UiScrollBar.createQuickChatCategoryMenu(0, param1, param2, param3, var13_ref_rn);
            }
          }
          if (param4.phraseIds != null) {
            var12Lifetime1 = var5_int;
            var13 = 49;
            for (var14 = 0; var14 < param4.phraseIds.length; var14++) {
              var15 = param4.phraseIds[var14];
              if (var15 == -1) {
                var8[var14 + var12Lifetime1] = SetPhasedEnergyBeamEnergyUsed.field_p;
                var9[var14 + var12Lifetime1] = param4.phraseShortcuts[var14];
                var10[var12Lifetime1 + var14] = param4.phraseIds[var14];
              } else {
                var16 = GetTorpedoAimarc.field_o.getPhrase(var15, -118);
                var8[var14 + var12Lifetime1] = var16.getPreviewText(80);
                var9[var14 + var12Lifetime1] = param4.phraseShortcuts[var14];
                if (var9[var12Lifetime1 + var14] <= 0) {
                  var13 = (char)(var13 + 1);
                  var9[var14 + var12Lifetime1] = (char)var13;
                }
                var10[var14 + var12Lifetime1] = param4.phraseIds[var14];
              }
            }
          }
          stackIn_27_0 = new QuickChatMenuWidget(0L, param1, param2, param3, var11, var20, var8, var21);
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("vcb.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param4 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final void layoutChildren(int param0) {
        int var3;
        var3 = VoidHunters.field_G;
        if (null != this.leftButton) {
          this.leftButton.x = 0;
          this.leftButton.y = this.height - this.leftButton.height >> 1;
          this.track.x = this.leftButton.x + this.leftButton.width;
        } else {
          this.track.x = 0;
        }
        if (this.rightButton != null) {
          this.rightButton.x = this.width - this.rightButton.width;
          this.rightButton.y = this.height - this.rightButton.height >> 1;
          this.track.width = this.width + (-this.track.x - this.rightButton.width);
        } else {
          this.track.width = -this.track.x + this.width;
        }
        this.updateThumbX((byte) -8);
        if (this.upButton == null) {
          this.track.y = 0;
        } else {
          this.upButton.y = 0;
          this.upButton.x = this.width - this.upButton.width >> 1;
          this.track.y = this.upButton.y + this.upButton.height;
        }
        if (this.downButton != null) {
          this.downButton.y = this.height - this.downButton.height;
          this.downButton.x = -this.downButton.width + this.width >> 1;
          this.track.height = -this.track.y + (this.height - this.downButton.height);
        } else {
          this.track.height = this.height - this.track.y;
        }
        this.updateThumbY(param0 ^ param0);
        if (!this.verticalScrolling) {
          this.thumb.height = this.track.height;
          this.thumb.y = 0;
        }
        if (!this.horizontalScrolling) {
          this.thumb.width = this.track.width;
          this.thumb.x = 0;
        }
        this.thumb.refreshLayout(false);
    }

    final boolean requestFocus(int param0, UiComponent param1) {
        UiDraggableContainer var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.verticalPosition = -9;
          }
          var3 = this.thumb;
          if (var3 != null &&
            ((UiComponent) ((Object) var3)).requestFocus(param0 ^ 0, param1)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("vcb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final void setHorizontalPosition(int param0, int param1) {
        int var4;
        var4 = VoidHunters.field_G;
        if (param0 < 0) {
          this.horizontalPosition = 0;
        } else {
          if (param0 <= 65536) {
            this.horizontalPosition = param0;
          } else {
            this.horizontalPosition = 65536;
          }
        }
        if (param1 != 65536) {
          return;
        }
        this.updateThumbX((byte) -8);
    }

    final static void increaseMusicVolume(int param0) {
        int var1 = 0;
        if (param0 != 32) {
          UiScrollBar.clearSharedReferences((byte) -101);
        }
        if (GetMutatorVotes.field_p < 224) {
          var1 = GetMutatorVotes.field_p % 32;
          BitmapTextLayout.setMusicVolume(-var1 + GetMutatorVotes.field_p + 32, (byte) -100);
        } else {
          BitmapTextLayout.setMusicVolume(256, (byte) -126);
        }
    }

    private final void setVerticalPositionAndNotify(byte param0, int param1) {
        this.setVerticalPosition(-3393, param1);
        if (this.listener instanceof UiScrollListener) {
          ((UiScrollListener) (this.listener)).onScrollChanged(this.verticalPosition, this.verticalPosition, this, param0 ^ 106);
        }
        if (param0 != -17) {
          this.updateThumbX((byte) 62);
        }
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (this.arrowAndKeyboardInputEnabled &&
            this.thumb.hasFocus((byte) -120)) {
            if (98 == param1) {
              this.setVerticalPositionAndNotify((byte) -17, this.verticalPosition - this.verticalLineStep);
              return true;
            }
            if (param1 == 99) {
              this.setVerticalPositionAndNotify((byte) -17, this.verticalLineStep + this.verticalPosition);
              return true;
            }
            if (96 == param1) {
              this.setHorizontalPositionAndNotify(param0 + 15923, this.horizontalPosition - this.horizontalLineStep);
              return true;
            }
            if (param1 == 97) {
              this.setHorizontalPositionAndNotify(116, this.horizontalPosition + this.horizontalLineStep);
              return true;
            }
            if (param1 == 104) {
              this.setVerticalPositionAndNotify((byte) -17, this.verticalPosition - this.getVerticalThumbFraction((byte) 110));
              return true;
            }
            if (param1 == 105) {
              this.setVerticalPositionAndNotify((byte) -17, this.verticalPosition + this.getVerticalThumbFraction((byte) 110));
              return true;
            }
            if (102 == param1) {
              if (this.verticalScrolling &&
                SetMachineGunEnergyUsed.field_o[82]) {
                this.setVerticalPositionAndNotify((byte) -17, 0);
                return true;
              }
              if (!this.horizontalScrolling) {
                return false;
              }
              this.setHorizontalPositionAndNotify(-119, 0);
              return true;
            }
            if (103 == param1) {
              if (this.verticalScrolling &&
                SetMachineGunEnergyUsed.field_o[82]) {
                this.setVerticalPositionAndNotify((byte) -17, 65536);
                return true;
              }
              if (this.horizontalScrolling) {
                this.setHorizontalPositionAndNotify(param0 + 15790, 65536);
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_44_0 = var5;
          stackIn_44_1 = new StringBuilder().append("vcb.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_E = new byte[250][];
        field_z = (GameStateFactory) ((Object) new DebrisFactory());
    }
}
