/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DraggableWidget extends SingleChildWidget {
    static int[] field_V;
    private int field_T;
    static int field_O;
    private int field_N;
    static String field_U;
    private boolean field_Q;
    private boolean field_R;
    private int field_W;
    static String field_P;
    private int field_S;

    final boolean handlePointerPress(UiWidget param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.handlePointerPress(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_Q) {
            return true;
          }
          if (!this.containsPoint(param6, 1343807649, param1, param3, param5)) {
            stackIn_5_0 = var8_int;
            return stackIn_5_0 != 0;
          }
          if (param2 == 1) {
            this.field_S = -param1 - this.field_t + param6;
            this.field_T = -param3 + (-this.field_w + param5);
            InterfaceTextLoader.field_c = this;
          }
          this.field_x = param2;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("ed.PA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final StringBuilder appendDebugTree(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -372494750) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.beginDebugDescription(param0, param2, param3 ^ -372494832, param1)) {
            this.appendDebugProperties(-120, param1, param0, param2);
            this.appendChildDebugTrees(-31857, param2, param1, param0);
            discarded$62 = param1.append(" revert=").append(this.field_R);
            if (2147483647 != this.field_N &&
              this.field_W != 2147483647) {
              discarded$63 = param1.append(" to ").append(this.field_N).append(',').append(this.field_W);
            }
          }
          stackIn_10_0 = (StringBuilder) (param1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ed.WA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int findHoveredPanelRow(byte param0, int param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        if (null != ContextMenu.field_bc) {
          stackIn_5_0 = ContextMenu.field_bc.field_b ? 1 : 0;
        } else {
          stackIn_5_0 = (null == SocialListEntry.field_Qb) ? 0 : 1;
        }
        var3 = stackIn_5_0;
        if (var3 != 0) {
          stackIn_8_0 = IsaacCipher.field_a.field_z;
        } else {
          stackIn_8_0 = 480;
        }
        var4 = stackIn_8_0;
        var5 = -param2 + var4;
        var6 = -(var5 / 2) - 638 + (int)ClientProtocolStage.field_d + param1;
        var7 = var5 / 20;
        if (param0 != 101) {
          return -98;
        }
        if (var5 < 0 ||
          0 > var6 ||
          var7 > 1) {
          var7 = -1;
        }
        if (var7 == 1) {
          var7 = 1 + var6 / 26;
        }
        return var7;
    }

    final static int getMessagePopupHeight(int param0) {
        if (param0 != 32768) {
          return 74;
        }
        return ArchiveProvider.field_a;
    }

    private DraggableWidget(int param0, int param1, int param2, int param3, WidgetPainter param4, WidgetListener param5, UiWidget param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_N = 2147483647;
        this.field_W = 2147483647;
        try {
          this.field_J = param6;
          this.field_R = param7 ? true : false;
          this.field_Q = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ed.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void handlePointerRelease(int param0, boolean param1, UiWidget param2, int param3, int param4, int param5) {
        try {
          super.handlePointerRelease(param0, param1, param2, param3, param4, param5);
          this.field_x = 0;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ed.AB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void refreshChildLayout(byte param0) {
        super.refreshChildLayout((byte) 122);
        this.field_J.setBounds(this.field_u, 0, 51, 0, this.field_F);
        this.field_W = this.field_w;
        this.field_N = this.field_t;
        if (param0 <= 116) {
          this.field_S = 40;
        }
    }

    final static MouseWheelInput createMouseWheelInput(byte param0) {
        try {
          Throwable var1 = null;
          MouseWheelInput stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 < 111) {
              DraggableWidget.updateCameraTransition((byte) -107);
            }
            stackIn_3_0 = (MouseWheelInput) (Class.forName("MouseWheelHandler").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void updatePointer(UiWidget param0, int param1, int param2, boolean param3) {
        int stackIn_16_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_22_1 = 0;
        int stackIn_25_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_J instanceof TextButton) ||
            ((TextButton) (this.field_J)).field_K) &&
            this.field_x == 1) {
            var5_int = ContextMenu.field_Nb + (-this.field_S - param1);
            var6 = -param2 + (-this.field_T + ClientProtocolStage.field_a);
            if (this.field_t != var5_int ||
              this.field_w != var6) {
              this.field_w = var6;
              this.field_t = var5_int;
              if (this.field_s instanceof WidgetDragListener) {
                ((WidgetDragListener) (this.field_s)).onDragged(param1, param2, this, -26289);
              }
            }
          } else {
            if (!this.field_R) {
              super.updatePointer(param0, param1, param2, param3);
              return;
            }
            if (this.field_N != this.field_t) {
              var5_int = this.field_N - this.field_t;
              stackIn_16_1 = this.field_t;
              if (Math.abs(var5_int) > 2) {
                stackIn_17_2 = var5_int >> 1;
              } else {
                if (var5_int <= 0) {
                  stackIn_17_2 = -1;
                } else {
                  stackIn_17_2 = 1;
                }
              }
              this.field_t = stackIn_16_1 + stackIn_17_2;
            }
            if (this.field_w != this.field_W) {
              var5_int = -this.field_w + this.field_W;
              stackIn_22_1 = this.field_w;
              if (Math.abs(var5_int) <= 2) {
                if (var5_int <= 0) {
                  stackIn_25_2 = -1;
                } else {
                  stackIn_25_2 = 1;
                }
              } else {
                stackIn_25_2 = var5_int >> 1;
              }
              this.field_w = stackIn_22_1 + stackIn_25_2;
            }
          }
          super.updatePointer(param0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("ed.MA(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_U = null;
        field_V = null;
        field_P = null;
        if (param0) {
          DraggableWidget.findHoveredPanelRow((byte) 0, -44, 90);
        }
    }

    final static void updateCameraTransition(byte param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$1 = 0;
        BackgroundSparkle stackIn_83_0 = null;
        BackgroundSparkle stackIn_83_1 = null;
        int stackIn_83_2 = 0;
        BackgroundSparkle stackIn_84_0;
        BackgroundSparkle stackIn_84_1;
        boolean stackIn_84_3;
        boolean stackIn_102_0 = false;
        int stackIn_132_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        float var1_float = 0.0f;
        PointerTrailBubble var1 = null;
        RuntimeException var1_ref = null;
        float var2_float = 0.0f;
        BackgroundSparkle var2 = null;
        BackgroundSparkle var3 = null;
        int var3_int = 0;
        SparkParticle var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        BackgroundSparkle var7 = null;
        SparkParticle var3_refLifetime1;
        int var1_intLifetime1;
        float var2_floatLifetime1;
        int var4Lifetime1;
        var6 = TetraLink.field_J;
        try {
          if (GameKeyHandler.field_g != TextHighlightSpan.field_p) {
            var1_int = 1;
            if (!MenuLabelGlobals.field_d.field_c &&
              WidgetTheme.field_i.field_c) {
              SoundMixerHelpers.field_e = WidgetNode.field_x;
              TransitionPhase.field_d = GameRoomPanelHelpers.field_c;
              MenuScreen.field_g = 2;
              var2_float = -NodeHashTable.field_h + SoundMixerHelpers.field_e;
              while ((double)var2_float < -3.141592653589793) {
                var2_float = (float)((double)var2_float + 6.283185307179586);
              }
              while ((double)var2_float > 3.141592653589793) {
                var2_float = (float)((double)var2_float - 6.283185307179586);
              }
              if ((double)Math.abs(var2_float) > 0.01 ||
                0.05 < (double)Math.abs(-TransitionPhase.field_d + LoadingResourceHelpers.field_d)) {
                var1_int = 0;
              }
            } else {
              if (MenuLabelGlobals.field_d.field_c &&
                !WidgetTheme.field_i.field_c) {
                LoadingResourceHelpers.field_d = GameRoomPanelHelpers.field_c;
                NodeHashTable.field_h = WidgetNode.field_x;
                LobbyResourceHelpers.field_g[0] = (double)LoadingResourceHelpers.field_d * Math.sin((double)NodeHashTable.field_h);
                LobbyResourceHelpers.field_g[2] = (double)LoadingResourceHelpers.field_d * Math.cos((double)NodeHashTable.field_h);
                WidgetTheme.field_i.field_c = true;
                CameraAndChatHelpers.updateCameraMatrix(-30);
              }
            }
            if (MenuLabelGlobals.field_d.field_n) {
              InputDetachHelpers.field_e = InputDetachHelpers.field_e - 16384;
              if (0 >= InputDetachHelpers.field_e) {
                InputDetachHelpers.field_e = 0;
              } else {
                var1_int = 0;
              }
            } else {
              if (WidgetTheme.field_i.field_n) {
                InputDetachHelpers.field_e = 0;
                WidgetTheme.field_i.field_n = false;
              }
              InputDetachHelpers.field_e = InputDetachHelpers.field_e + 16384;
              if (InputDetachHelpers.field_e < 262144) {
                var1_int = 0;
              } else {
                InputDetachHelpers.field_e = 262144;
              }
            }
            WidgetTheme.field_i.field_g = MenuLabelGlobals.field_d.field_g;
            if (WidgetTheme.field_i.field_l < MenuLabelGlobals.field_d.field_l) {
              WidgetTheme.field_i.field_l = WidgetTheme.field_i.field_l + 1;
            } else {
              if (WidgetTheme.field_i.field_l > MenuLabelGlobals.field_d.field_l) {
                WidgetTheme.field_i.field_l = WidgetTheme.field_i.field_l - 1;
              }
            }
            WidgetTheme.field_i.field_j = MenuLabelGlobals.field_d.field_j;
            WidgetTheme.field_i.field_e = MenuLabelGlobals.field_d.field_e;
            if (MenuLabelGlobals.field_d.field_l != WidgetTheme.field_i.field_l) {
              var1_int = 0;
            }
            if (var1_int != 0) {
              TextHighlightSpan.field_p = GameKeyHandler.field_g;
              WidgetTheme.field_i = MenuLabelGlobals.field_d;
            }
          }
          if (MenuScreen.field_g != 0) {
            while (-3.141592653589793 > (double)NodeHashTable.field_h) {
              NodeHashTable.field_h = (float)((double)NodeHashTable.field_h + 6.283185307179586);
            }
            while ((double)NodeHashTable.field_h > 3.141592653589793) {
              NodeHashTable.field_h = (float)((double)NodeHashTable.field_h - 6.283185307179586);
            }
            while ((double)SoundMixerHelpers.field_e < -3.141592653589793) {
              SoundMixerHelpers.field_e = (float)((double)SoundMixerHelpers.field_e + 6.283185307179586);
            }
            while ((double)SoundMixerHelpers.field_e > 3.141592653589793) {
              SoundMixerHelpers.field_e = (float)((double)SoundMixerHelpers.field_e - 6.283185307179586);
            }
            var1_float = SoundMixerHelpers.field_e - NodeHashTable.field_h;
            while (-3.141592653589793 > (double)var1_float) {
              var1_float = (float)((double)var1_float + 6.283185307179586);
            }
            while ((double)var1_float > 3.141592653589793) {
              var1_float = (float)((double)var1_float - 6.283185307179586);
            }
            NodeHashTable.field_h = NodeHashTable.field_h + 0.05000000074505806f * var1_float;
            var2_floatLifetime1 = -LoadingResourceHelpers.field_d + TransitionPhase.field_d;
            LoadingResourceHelpers.field_d = LoadingResourceHelpers.field_d + 0.05000000074505806f * var2_floatLifetime1;
            LobbyResourceHelpers.field_g[0] = (double)LoadingResourceHelpers.field_d * Math.sin((double)NodeHashTable.field_h);
            LobbyResourceHelpers.field_g[2] = (double)LoadingResourceHelpers.field_d * Math.cos((double)NodeHashTable.field_h);
            CameraAndChatHelpers.updateCameraMatrix(-42);
            if (0.0001 > (double)Math.abs(var1_float) &&
              0.05 > (double)Math.abs(var2_floatLifetime1)) {
              MenuScreen.field_g = 0;
            } else {
              if (0.1 > (double)Math.abs(var1_float) &&
                Math.abs(var2_floatLifetime1) < 1.0f) {
                MenuScreen.field_g = 1;
              }
            }
          }
          if (field_O == 10) {
            if (50 < LruTextureCache.field_e) {
              if (LruTextureCache.field_e <= 100) {
                CachedArchiveSource.field_y = (float)(-50 + LruTextureCache.field_e);
              } else {
                if (LruTextureCache.field_e <= 350) {
                  var1_intLifetime1 = LruTextureCache.field_e - 100;
                  SpriteCheckboxPainter.field_d = (float)((double)(0.10000000149011612f * (210.0f - 4.0f * MenuThemeHelpers.field_c)) + 3.141592653589793);
                  TextLayout.field_d[0] = Math.cos((double)SpriteCheckboxPainter.field_d);
                  TextLayout.field_d[2] = Math.sin((double)SpriteCheckboxPainter.field_d);
                  InputDetachHelpers.field_e = (var1_intLifetime1 * (4 * var1_intLifetime1 * var1_intLifetime1) / 5000 << 16) / 3125;
                  SectorCacheStore.field_c = 256 - var1_intLifetime1 * var1_intLifetime1 * (var1_intLifetime1 * 128) / 7812500;
                  MenuThemeHelpers.field_c = (float)((long)(var1_intLifetime1 * (var1_intLifetime1 * var1_intLifetime1)) * 210L) / 62500000.0f;
                } else {
                  if (351 == LruTextureCache.field_e) {
                    InputDetachHelpers.field_e = 262144;
                    SectorCacheStore.field_c = 0;
                    TextLayout.field_d[0] = 1.0;
                    MenuThemeHelpers.field_c = 52.5f;
                    TextLayout.field_d[2] = 0.0;
                  }
                }
              }
            } else {
              CachedArchiveSource.field_y = 0.0f;
            }
          }
          var1 = (PointerTrailBubble) (ArrayWidgetContainer.field_J.first(false));
          while (var1 != null) {
            fieldTemp$4 = var1.field_n - 1;
            var1.field_n = var1.field_n - 1;
            if (0 == fieldTemp$4) {
              var1.unlink(false);
            }
            var1 = (PointerTrailBubble) (ArrayWidgetContainer.field_J.next((byte) -70));
          }
          var2 = (BackgroundSparkle) (AnimationSequence.field_d.first(false));
          while (var2 != null) {
            fieldTemp$3 = var2.field_r + 1;
            var2.field_r = var2.field_r + 1;
            if (83 < fieldTemp$3) {
              var2.unlink(false);
            }
            var2 = (BackgroundSparkle) (AnimationSequence.field_d.next((byte) -70));
          }
          if (ModelMergeHelpers.nextRandomInt(40, 1692) == 0) {
            stackIn_83_0 = null;
            stackIn_83_1 = null;
            stackIn_83_2 = ModelMergeHelpers.nextRandomInt(3, 1692);
            if (ModelMergeHelpers.nextRandomInt(2, 1692) != 0) {
              stackIn_84_0 = null;
              stackIn_84_1 = null;
              stackIn_84_3 = false;
            } else {
              stackIn_84_0 = null;
              stackIn_84_1 = null;
              stackIn_84_3 = true;
            }
            var7 = new BackgroundSparkle(stackIn_83_2, stackIn_84_3, ModelMergeHelpers.nextRandomInt(64, 1692));
            var3 = (BackgroundSparkle) (AnimationSequence.field_d.first(false));
            while (var3 != null) {
              if (var3.field_s >= var7.field_s) {
                var3 = (BackgroundSparkle) (AnimationSequence.field_d.next((byte) -70));
                continue;
              }
              break;
            }
            if (var3 == null) {
              AnimationSequence.field_d.addLast(var7, false);
            } else {
              MenuScreen.insertNodeBefore(var3, 98, var7);
            }
          }
          if (PendingStatQuery.hasFeatureBit(0, (byte) 106)) {
            if (Renderable.field_d) {
              if (OpacityWidget.field_S < 32) {
                OpacityWidget.field_S = OpacityWidget.field_S + 1;
              } else {
                var3_int = -VerticalScrollbar.field_Xb + AccountCreationResultHelpers.field_b & 65535;
                if ((32768 & var3_int) != 0) {
                  var3_int = var3_int - 65536;
                }
                var3_int = var3_int >> 5;
                VerticalScrollbar.field_Xb = VerticalScrollbar.field_Xb + var3_int;
                if ((var3_int & -4) == 0) {
                  ScreenSwitchHelpers.field_a.selectSequence((byte) 122, GzipDecompressor.field_a);
                  Renderable.field_d = false;
                }
              }
            } else {
              fieldTemp$0 = OpacityWidget.field_S - 1;
              OpacityWidget.field_S = OpacityWidget.field_S - 1;
              if (fieldTemp$0 < 0) {
                OpacityWidget.field_S = 0;
              }
              if (ModelMergeHelpers.nextRandomInt(200, 1692) == 0) {
                AccountCreationResultHelpers.field_b = ModelMergeHelpers.nextRandomInt(65536, 1692);
                ScreenSwitchHelpers.field_a.selectSequence((byte) 57, NameEntryPopup.field_Vb);
                Renderable.field_d = true;
                var3_int = AccountCreationResultHelpers.field_b - VerticalScrollbar.field_Xb & 65535;
                stackIn_102_0 = ((var3_int & 32768) != 0);
                DualLinkDeque.field_a = stackIn_102_0;
              }
            }
            ScreenSwitchHelpers.field_a.advance((byte) -125);
          }
          var3_ref = (SparkParticle) (QuickChatHelpDialog.field_Sb.first(false));
          if (param0 >= -81) {
            field_V = (int[]) null;
          }
          while (var3_ref != null) {
            fieldTemp$2 = var3_ref.field_s - 1;
            var3_ref.field_s = var3_ref.field_s - 1;
            if (fieldTemp$2 <= 0) {
              var3_ref.unlink(false);
            } else {
              var3_ref.field_v = var3_ref.field_v + var3_ref.field_r;
              var3_ref.field_t = var3_ref.field_t + var3_ref.field_x;
              var3_ref.field_y = var3_ref.field_y + var3_ref.field_w;
              var3_ref.field_r = var3_ref.field_r + 48;
            }
            var3_ref = (SparkParticle) (QuickChatHelpDialog.field_Sb.next((byte) -70));
          }
          if (WidgetTheme.field_i.field_e > 0 && (WidgetTheme.field_i.field_e == 1 ||
            ModelMergeHelpers.nextRandomInt(WidgetTheme.field_i.field_e, 1692) == 0)) {
            while (true) {
              var4 = ModelMergeHelpers.nextRandomInt(8193, 1692) - 4096;
              var5 = -4096 + ModelMergeHelpers.nextRandomInt(8193, 1692);
              if (var4 * var4 + var5 * var5 >= 8388608) {
                continue;
              }
              break;
            }
            var3_refLifetime1 = new SparkParticle(0, 1638400, 0, var4, -8192, var5, 150);
            QuickChatHelpDialog.field_Sb.addLast(var3_refLifetime1, false);
          }
          if (field_O != -4 &&
            field_O != -2) {
            stackIn_132_0 = (!MenuLabelGlobals.field_d.field_c) ? 1 : 2;
            WidgetTheme.field_u = stackIn_132_0;
          } else {
            WidgetTheme.field_u = 0;
          }
          if (WidgetTheme.field_u == ContentTransitionDialog.field_ab) {
            RasterBuffer.field_i = 0;
          } else {
            fieldTemp$1 = RasterBuffer.field_i + 8;
            RasterBuffer.field_i = RasterBuffer.field_i + 8;
            if (fieldTemp$1 >= 256) {
              RasterBuffer.field_i = 0;
              ContentTransitionDialog.field_ab = WidgetTheme.field_u;
            }
          }
          var4Lifetime1 = 0;
          if (WidgetTheme.field_u == 2) {
            var4Lifetime1 = GzipDecompressor.field_g.textWidth(ArchiveFactoryHelpers.field_c) + 17;
            if (var4Lifetime1 < 135) {
              var4Lifetime1 = 135;
            }
          } else {
            if (WidgetTheme.field_u == 1) {
              var4Lifetime1 = 17 + GzipDecompressor.field_g.textWidth(ReflectionCheckHelpers.field_d);
            }
          }
          ClientProtocolStage.field_d = ClientProtocolStage.field_d + (-ClientProtocolStage.field_d + (float)var4Lifetime1) * 0.10000000149011612f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1_ref), "ed.G(" + param0 + ')');
        }
    }

    static {
        field_U = "Names cannot start or end with space or underscore";
        field_P = "Leave game";
    }
}
