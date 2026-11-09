/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GraphicsOptionsDialog extends ResizingDialog implements WidgetActionListener {
    private FullscreenDisplayMode[] field_Z;
    private boolean field_S;
    private InteractiveWidget field_O;
    private InteractiveWidget field_Y;
    private InteractiveWidget field_Q;
    private DropDownWidget field_ab;
    private boolean field_R;
    private InteractiveWidget[] field_V;
    private InteractiveWidget field_X;
    private InteractiveWidget field_T;
    private boolean field_W;
    private GridWidgetContainer field_U;
    private InteractiveWidget field_P;

    private final InteractiveWidget currentDisplayOption(byte guard) {
        if (null != CompactMeshGeometry.field_o) {
          return this.field_T;
        }
        if (SecondaryNodeDequeIterator.field_b != null && SecondaryNodeDequeIterator.field_b.automatic &&
          null != this.field_Y) {
          return this.field_Y;
        }
        if (guard != -2) {
          return (InteractiveWidget) null;
        }
        return this.field_X;
    }

    private final void closeOptions(int guard) {
        if (guard < 3) {
          return;
        }
        if (!this.open) {
          return;
        }
        this.open = false;
    }

    GraphicsOptionsDialog(DialogLayer param0) {
        super(param0, 430, 254);
        int incrementValue$0 = 0;
        int var7_int = 0;
        boolean stackIn_31_1 = false;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        boolean stackIn_40_1 = false;
        int stackIn_48_0 = 0;
        Object stackIn_50_0;
        GridWidgetContainer stackIn_50_1;
        GridWidgetContainer stackIn_50_2;
        int stackIn_50_3;
        Object stackIn_51_0;
        GridWidgetContainer stackIn_52_1 = null;
        GridWidgetContainer stackIn_52_2 = null;
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
        FullscreenDisplayMode[] var3_ref_cd__ = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        String var6 = null;
        InteractiveWidget var6_ref = null;
        UiWidget var7 = null;
        FullscreenDisplayMode var8 = null;
        String var10 = null;
        Object stackIn_50_0Lifetime1;
        GridWidgetContainer stackIn_52_1Lifetime1;
        GridWidgetContainer stackIn_52_2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var2_intLifetime1;
        int var3Lifetime2;
        try {
          this.field_Z = DisplaySizeController.listFullscreenModes((byte) -110, FourIntUpdateRequest.platformDispatcher);
          if (this.field_Z.length > 0) {
            for (var2_int = 0; this.field_Z.length > var2_int; var2_int++) {
              if (this.field_Z[var2_int] != null) {
                for (var3 = var2_int + 1; this.field_Z.length > var3; var3++) {
                  if (this.field_Z[var3] != null &&
                    this.field_Z[var2_int].width == this.field_Z[var3].width &&
                    this.field_Z[var2_int].height == this.field_Z[var3].height) {
                    this.field_Z[var3] = null;
                  }
                }
                if (null != SecondaryNodeDequeIterator.field_b &&
                  this.field_Z[var2_int] != null &&
                  !SecondaryNodeDequeIterator.field_b.acceptsSize(this.field_Z[var2_int].height, (byte) -54, this.field_Z[var2_int].width)) {
                  this.field_Z[var2_int] = null;
                }
              }
            }
            var2_int = 0;
            for (var3Lifetime2 = 0; var3Lifetime2 < this.field_Z.length; var3Lifetime2++) {
              if (null != this.field_Z[var3Lifetime2]) {
                var2_int++;
              }
            }
            var3_ref_cd__ = this.field_Z;
            this.field_Z = new FullscreenDisplayMode[var2_int];
            var4 = 0;
            for (var5 = 0; var5 < var3_ref_cd__.length; var5++) {
              if (null != var3_ref_cd__[var5]) {
                incrementValue$0 = var4;
                var4++;
                this.field_Z[incrementValue$0] = var3_ref_cd__[var5];
              }
            }
            IntrusiveDequeCursor.a(this.field_Z, true);
          }
          stackIn_31_1 = !(this.field_Z.length <= 0);
          this.field_R = stackIn_31_1;
          stackIn_34_0 = (!CacheReferenceNode.a((byte) -90)) ? 0 : 1;
          var2_intLifetime1 = stackIn_34_0;
          stackIn_37_0 = (var2_intLifetime1 == 0) ? 2 : 3;
          var3Lifetime1 = stackIn_37_0;
          stackIn_40_1 = !(AccountPacketReader.isGuestSession((byte) 9));
          this.field_W = stackIn_40_1;
          if (var2_intLifetime1 == 0) {
            if (SecondaryNodeDequeIterator.field_b != null) {
              stackIn_48_0 = (SecondaryNodeDequeIterator.field_b.isAutoResizeMemoryLimited(-1)) ? 1 : 0;
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
          this.field_U = new GridWidgetContainer(stackIn_50_3, stackIn_52_4, 410, 105, (WidgetRenderer) null, var3Lifetime1, 1);
          this.field_U.field_K = 83;
          this.field_U.setCellPadding(-1, 5, 5);
          this.addChild(this.field_U, 93);
          this.field_X = this.createSpriteOption(GameDefinitionLoader.field_d, (WidgetListener) (this), StatisticsSubmissionSupport.classicText, (byte) -105);
          if (var2_intLifetime1 != 0) {
            this.field_Y = this.createSpriteOption(SoftwareTransform3D.field_f, (WidgetListener) (this), VertexLayout.resizableText, (byte) 122);
          }
          this.field_T = this.createSpriteOption(WidgetStateStyle.field_c, (WidgetListener) (this), PlayingSound.fullScreenText, (byte) 110);
          if (var2_intLifetime1 != 0) {
            stackIn_57_1 = 3;
          } else {
            stackIn_57_1 = 2;
          }
          this.field_V = new InteractiveWidget[stackIn_57_1];
          this.field_V[0] = this.field_X;
          if (var2_intLifetime1 != 0) {
            this.field_V[2] = this.field_Y;
          }
          this.field_V[1] = this.field_T;
          if (this.field_R &&
            var2_intLifetime1 != 0) {
            var5_ref_String__ = new String[this.field_Z.length];
            var6_int = var5_ref_String__.length - 1;
            for (var7_int = 0; var7_int < this.field_Z.length; var7_int++) {
              var8 = this.field_Z[var7_int];
              if (null != CompactMeshGeometry.field_o &&
                var8.width == SecondaryNodeDequeIterator.field_b.fullscreenWidth &&
                var8.height == SecondaryNodeDequeIterator.field_b.fullscreenHeight) {
                var6_int = var7_int;
              }
              var5_ref_String__[var7_int] = var8.width + "<times>" + var8.height;
            }
            this.field_ab = new DropDownWidget(var5_ref_String__, var6_int, 150);
            this.field_ab.setBounds(-103, this.field_T.x + this.field_U.x, -19 + (this.field_T.height + this.field_U.y + this.field_T.y), 18, 126);
            this.children.addFirst(this.field_ab, -10295);
          }
          this.field_P = this.a(-73, (WidgetListener) (this), DraggableWidget.backText);
          var5Lifetime1 = this.field_P.x + this.field_P.width / 2;
          this.field_P.width = 150;
          this.field_P.x = -20 + var5Lifetime1 - this.field_P.width;
          this.field_Q = this.a(-128, (WidgetListener) (this), LoadingStatusText.applyText);
          this.field_Q.enabled = false;
          this.field_Q.width = this.field_P.width;
          this.field_Q.x = var5Lifetime1 + 20;
          if (var2_intLifetime1 != 0 ||
            var4Lifetime1 != 0) {
            if (var2_intLifetime1 == 0) {
              stackIn_74_0 = CanvasResizeState.moreMemoryIsRequiredText;
            } else {
              stackIn_74_0 = LegacyOpenGlClientVertexBuffer.largeScreenSizesAndText;
            }
            var10 = stackIn_74_0;
            var6 = var10;
            var7 = new UiWidget(var10, (WidgetListener) null);
            var7.x = 0;
            var7.width = this.width;
            var7.height = 80;
            var7.y = 163;
            var7.renderer = (WidgetRenderer) ((Object) new TextWidgetRenderer(TextCaretLayout.field_b, 20, 20, 0, 10, 16777215, -1, 0, 0, 16, 0, 0, true));
            this.addChild(var7, 125);
          }
          this.field_S = false;
          var6_ref = this.currentDisplayOption((byte) -2);
          if (var6_ref != null) {
            var6_ref.selected = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_80_0 = var2;
          stackIn_80_1 = new StringBuilder().append("dd.<init>(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    public final void onAction(int action, int guard, InteractiveWidget source, int pointerX, int pointerY) {
        int stackIn_15_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != 710) {
            return;
          }
          if (source != this.field_P) {
            if (this.field_Q != source) {
              if (source == this.field_X) {
                this.a(source, 0);
              } else {
                if (source == this.field_Y) {
                  this.a(source, 0);
                } else {
                  if (this.field_ab != null) {
                    stackIn_15_0 = (this.field_ab.hovered) ? 1 : 0;
                  } else {
                    stackIn_15_0 = 0;
                  }
                  var6_int = stackIn_15_0;
                  if (var6_int == 0 &&
                    source == this.field_T) {
                    if (!this.field_R) {
                      this.dialogLayer.pushDialog((byte) 98, new DisplayModeErrorDialog(this.dialogLayer, Bzip2State.FULLSCREEN_UNSUPPORTED));
                      return;
                    }
                    if (HardwareRidgedWaterNoise.field_x > 0) {
                      this.a(source, guard - 710);
                      return;
                    }
                    this.dialogLayer.pushDialog((byte) 115, new FullscreenMembershipDialog(this.dialogLayer));
                    return;
                  }
                }
              }
            } else {
              this.h((byte) 103);
            }
          } else {
            this.closeOptions(124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_28_0 = var6;
          stackIn_28_1 = new StringBuilder().append("dd.C(").append(action).append(',').append(guard).append(',');
          if (source == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(pointerX).append(',').append(pointerY).append(')').toString());
        }
    }

    final static void resendLoggingRequests(int guard, int opcode) {
        int var3 = 0;
        FourIntUpdateRequest var4 = null;
        QueuedIntArrayRequest var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4 = (FourIntUpdateRequest) (HardwareCubeMapSource.field_d.first(-75));
          while (var4 != null) {
            DroneChargeParticle.sendFourIntUpdate((byte) -97, var4, opcode);
            var4 = (FourIntUpdateRequest) (HardwareCubeMapSource.field_d.next((byte) 18));
          }
          var5 = (QueuedIntArrayRequest) (MenuScreen.field_b.first(109));
          while (var5 != null) {
            IntroPreparation.sendQueuedIntArrayRequest(opcode, 1000, var5);
            var5 = (QueuedIntArrayRequest) (MenuScreen.field_b.next((byte) 18));
          }
          if (guard != 28778) {
            GraphicsOptionsDialog.resendLoggingRequests(-77, -57);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "dd.W(" + guard + ',' + opcode + ')');
        }
    }

    final boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        InteractiveWidget discarded$0 = null;
        boolean stackIn_76_0 = false;
        Object stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5 = null;
          if (guard < 9) {
            var8 = (String) null;
            discarded$0 = this.createSpriteOption((RasterIndexedSprite[]) null, (WidgetListener) null, (String) null, (byte) 16);
          }
          if (!this.field_X.hasFocus(-1)) {
            if (null != this.field_Y &&
              this.field_Y.hasFocus(-1)) {
              var5 = this.field_Y;
            } else {
              if (!this.field_T.hasFocus(-1)) {
                if (this.field_P.hasFocus(-1)) {
                  var5 = this.field_P;
                } else {
                  if (!this.field_Q.hasFocus(-1)) {
                    if (!this.field_X.selected) {
                      if (null != this.field_Y &&
                        this.field_Y.selected) {
                        var5 = this.field_Y;
                      } else {
                        if (this.field_T.selected) {
                          var5 = this.field_T;
                        }
                      }
                    } else {
                      var5 = this.field_X;
                    }
                  } else {
                    var5 = this.field_Q;
                  }
                }
              } else {
                var5 = this.field_T;
              }
            }
          } else {
            var5 = this.field_X;
          }
          var6 = keyCode;
          switch (var6) {
            case 96:
              if (this.field_T == var5) {
                if (null == this.field_Y) {
                  this.field_X.requestFocus((UiWidget) (this), (byte) 61);
                  return true;
                }
                this.field_Y.requestFocus((UiWidget) (this), (byte) 61);
                return true;
              }
              if (var5 == this.field_Y) {
                this.field_X.requestFocus((UiWidget) (this), (byte) 61);
                return true;
              }
              if (this.field_Q == var5) {
                this.field_P.requestFocus((UiWidget) (this), (byte) 61);
                return true;
              }
              break;
            case 97:
              if (this.field_X == var5) {
                if (this.field_Y != null) {
                  this.field_Y.requestFocus((UiWidget) (this), (byte) 61);
                } else {
                  this.field_T.requestFocus((UiWidget) (this), (byte) 61);
                }
                return true;
              }
              if (var5 == this.field_Y) {
                this.field_T.requestFocus((UiWidget) (this), (byte) 61);
                return true;
              }
              if (var5 == this.field_P &&
                this.field_Q.enabled) {
                this.field_Q.requestFocus((UiWidget) (this), (byte) 61);
                return true;
              }
              break;
            case 98:
              if (var5 == this.field_P) {
                this.field_X.requestFocus((UiWidget) (this), (byte) 61);
                return true;
              }
              if (this.field_Q == var5) {
                this.field_T.requestFocus((UiWidget) (this), (byte) 61);
                return true;
              }
              break;
            case 99:
              if (var5 != this.field_X &&
                var5 != this.field_Y) {
                if (var5 != this.field_T) {
                  break;
                }
                if (!this.field_Q.enabled) {
                  this.field_P.requestFocus((UiWidget) (this), (byte) 61);
                } else {
                  this.field_Q.requestFocus((UiWidget) (this), (byte) 61);
                }
                return true;
              }
              this.field_P.requestFocus((UiWidget) (this), (byte) 61);
              return true;
            default:
              break;
          }
          stackIn_76_0 = super.onKey(root, character, (byte) 98, keyCode);
          return stackIn_76_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("dd.KA(");
          if (root == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) (stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    private final InteractiveWidget createSpriteOption(RasterIndexedSprite[] stateSprites, WidgetListener listener, String text, byte guard) {
        InteractiveWidget var5 = null;
        RuntimeException var5_ref = null;
        GridWidgetContainer var6 = null;
        InteractiveWidget var7 = null;
        int var8 = 0;
        InteractiveWidget stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new InteractiveWidget(text, listener);
          var5.renderer = (WidgetRenderer) ((Object) new SpriteOptionRenderer(stateSprites));
          var6 = this.field_U;
          var7 = var5;
          var8 = -20 % ((56 - guard) / 42);
          var6.appendCell(var6.field_K, 0, var7);
          this.field_U.refreshLayout(false);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("dd.D(");
          if (stateSprites == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (listener == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (text == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void updateSelectedOption(boolean guard) {
        int var3 = 0;
        InteractiveWidget var4 = null;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        InteractiveWidget[] var6 = this.field_V;
        InteractiveWidget[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          var4.selected = var4 == this.field_O ? true : false;
        }
        if (!guard) {
          this.field_Y = (InteractiveWidget) null;
        }
    }

    private final void a(InteractiveWidget param0, int param1) {
        InteractiveWidget var3 = null;
        int var4 = 0;
        FullscreenDisplayMode var5 = null;
        InteractiveWidget stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 != 0) {
            this.h((byte) 113);
          }
          this.field_O = param0;
          param0.requestFocus((UiWidget) (this), (byte) 61);
          var3 = this.currentDisplayOption((byte) -2);
          stackIn_4_0 = this.field_Q;
          stackIn_5_1 = (param0 != var3);
          stackIn_4_0.enabled = stackIn_5_1;
          if (param0 == this.field_T) {
            if (var3 == param0) {
              if (null != this.field_ab) {
                var4 = this.field_ab.selectedIndex(param1 - 126);
                var5 = this.field_Z[var4];
                if (var5.width == SecondaryNodeDequeIterator.field_b.fullscreenWidth &&
                  SecondaryNodeDequeIterator.field_b.fullscreenHeight == var5.height) {
                  this.updateSelectedOption(true);
                  return;
                }
                this.field_Q.enabled = true;
                this.updateSelectedOption(true);
              } else {
                this.updateSelectedOption(true);
              }
            } else {
              this.updateSelectedOption(true);
            }
          } else {
            this.updateSelectedOption(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("dd.O(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void h(byte param0) {
        int var3;
        int var2;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_O == this.field_X) {
          HardwareAnimatedWaterEffect.d(1);
          IterableNodeHashTable.b(0);
        } else {
          if (this.field_Y != this.field_O) {
            if (this.field_O == this.field_T &&
              null != this.field_ab) {
              var2 = this.field_ab.selectedIndex(96);
              if (0 <= var2) {
                SecondaryNodeDequeIterator.field_b.setFullscreenSize(this.field_Z[var2].height, this.field_Z[var2].width, 67);
              }
              ArchiveCatalog.a(true, false);
              this.dialogLayer.pushDialog((byte) 108, new DisplayModeConfirmationDialog(this.dialogLayer));
            }
          } else {
            HardwareAnimatedWaterEffect.d(1);
            OpenGlBuffer.f(-5812);
          }
        }
        if (param0 < 65) {
          return;
        }
        this.field_Q.enabled = false;
    }

    private final InteractiveWidget a(int param0, WidgetListener param1, String param2) {
        InteractiveWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        InteractiveWidget stackIn_2_0 = null;
        InteractiveWidget stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new InteractiveWidget(param2, param1);
          if (param0 >= -10) {
            stackIn_2_0 = (InteractiveWidget) null;
            return stackIn_2_0;
          }
          var4.renderer = (WidgetRenderer) ((Object) new SpriteStripButtonRenderer());
          var5 = -46 + this.height;
          var4.setBounds(127, 15, var5, 30, this.width - 30);
          this.addChild((UiWidget) (var4), 80);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("dd.AA(").append(param0).append(',');
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
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void update(int parentX, int guard, UiWidget root, int parentY) {
        int var6 = 0;
        InteractiveWidget[] var5 = null;
        int var5_int = 0;
        InteractiveWidget var7 = null;
        int var8 = 0;
        InteractiveWidget[] var9 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          super.update(parentX, 124, root, parentY);
          if (LegacyOpenGlClientVertexBuffer.field_d) {
            root.clearFocus((byte) 120);
            var9 = this.field_V;
            var5 = var9;
            for (var6 = 0; var9.length > var6; var6++) {
              var7 = var9[var6];
              if (var7.hovered) {
                var7.requestFocus((UiWidget) (this), (byte) 61);
              }
            }
          }
          var5_int = 69 % ((-25 - guard) / 45);
          if (!this.field_W &&
            !AccountPacketReader.isGuestSession((byte) 9)) {
            this.closeOptions(84);
            this.dialogLayer.pushDialog((byte) 124, new GraphicsOptionsDialog(this.dialogLayer));
          }
          if (this.field_ab != null &&
            this.field_ab.isListOpen(20) != this.field_S) {
            this.a(this.field_T, 0);
            this.field_S = this.field_ab.isListOpen(20);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_18_0 = var5_ref;
          stackIn_18_1 = new StringBuilder().append("dd.U(").append(parentX).append(',').append(guard).append(',');
          if (root == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(parentY).append(')').toString());
        }
    }

    static {
    }
}
