/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableDualLinkDeque implements Iterable {
    static SpriteWidget field_b;
    static int field_f;
    static String field_a;
    static int field_d;
    static String field_g;
    DualLinkNode field_e;
    static SpriteWidget field_c;

    final void addLast(boolean param0, DualLinkNode param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1.field_k != null) {
            param1.unlinkSecondary(52);
          }
          param1.field_k = this.field_e.field_k;
          param1.field_h = this.field_e;
          param1.field_k.field_h = param1;
          param1.field_h.field_k = param1;
          if (!param0) {
            this.removeFirst(27);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("eb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_g = null;
        field_a = null;
        field_c = null;
        if (!param0) {
          IterableDualLinkDeque.releaseStatics(false);
        }
        field_b = null;
    }

    final DualLinkNode removeFirst(int param0) {
        if (param0 != -32314) {
          DualLinkNode var3 = (DualLinkNode) null;
          this.addLast(true, (DualLinkNode) null);
        }
        DualLinkNode var2 = this.field_e.field_h;
        if (this.field_e == var2) {
          return null;
        }
        var2.unlinkSecondary(63);
        return var2;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new DualLinkDequeIterator(this));
    }

    final static void updateGameSetupPanel(boolean param0, boolean param1, int param2, boolean param3) {
        int stackIn_11_0 = 0;
        String stackIn_24_0 = null;
        SpriteWidget stackIn_36_0 = null;
        String stackIn_37_1 = null;
        SpriteWidget stackIn_39_0 = null;
        String[] stackIn_39_1 = null;
        String stackIn_40_2 = null;
        SpriteWidget stackIn_70_0 = null;
        boolean stackIn_71_1 = false;
        SpriteWidget stackIn_75_0 = null;
        boolean stackIn_76_1 = false;
        SpriteWidget stackIn_80_0 = null;
        boolean stackIn_81_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        SpriteWidget var5 = null;
        SpriteWidget var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        SpriteWidget var15 = null;
        String var16 = null;
        SpriteWidget var17 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = Virogrid.field_F ? 1 : 0;
        try {
          TriangleSortHelpers.positionSlidingPanels(PendingHighscoreRequest.field_h, -4);
          if (QueuedRequest.field_h != null) {
            var15 = ChecksumHelpers.field_c;
            var17 = var15;
            ChecksumHelpers.field_c.field_ub = 0;
            var17.field_K = 0;
            HuffmanCodec.field_d.field_ub = 0;
            var5 = HuffmanCodec.field_d;
            var5.field_K = 0;
            var6 = BitCountAndDialogHelpers.field_b;
            BitCountAndDialogHelpers.field_b.field_ub = 0;
            var6.field_K = 0;
            PopupMenuDrawHelpers.field_e.field_V = IconTextComponent.field_Ib.toUpperCase();
            var7 = (CacheReference.field_r.field_K + 2) / 2;
            BitCountAndDialogHelpers.field_b.setGeometry(0, 40, -2 + var7, (byte) -96, CacheReference.field_r.field_ub - 40);
            HuffmanCodec.field_d.setGeometry(var7, 40, CacheReference.field_r.field_K - var7, (byte) -64, -40 + CacheReference.field_r.field_ub);
            if (UiLayerInputHelpers.field_b.length == 1 &&
              UiLayerInputHelpers.field_b[0] == 2) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (var10 < UiLayerInputHelpers.field_b.length) {
                  stackIn_11_0 = (0 == (FadeLayer.field_E[var10 / 8] & 1 << (7 & var10))) ? 0 : 1;
                  var11_int = stackIn_11_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    UiLayerInputHelpers.field_b[var10] != 2) {
                    var8 = 1;
                  } else {
                    var10++;
                    continue;
                  }
                }
                if (0 != var9_int) {
                  break;
                }
                var8 = 1;
                break;
              }
            }
            HuffmanCodec.field_d.field_Y = true;
            if (!GameKeyHandler.field_c) {
              stackIn_36_0 = HuffmanCodec.field_d;
              if (var8 != 0) {
                stackIn_37_1 = IntrusiveDeque.field_g;
              } else {
                stackIn_37_1 = ArrayWidgetContainer.field_x;
              }
              stackIn_36_0.field_V = ((String) (Object) stackIn_37_1).toUpperCase();
              stackIn_39_0 = IntrusiveNode.field_b;
              stackIn_39_1 = new String[]{HuffmanCodec.field_d.field_V};
              if (var8 != 0) {
                stackIn_40_2 = AccountTermsPanel.field_K;
              } else {
                stackIn_40_2 = FullscreenFocusCanvas.field_b;
              }
              stackIn_39_0.field_V = MenuScreen.formatIndexedText(stackIn_39_1, stackIn_40_2, 2);
              BitCountAndDialogHelpers.field_b.field_V = StatefulWidgetPainter.field_v;
              ViewModeNoticeGlobals.field_b = true;
              CellFlip.field_o.field_Y = true;
              if (ArchiveRequest.field_q != null) {
                PasswordLoginCredentials.field_l = false;
                ViewModeNoticeGlobals.field_b = false;
                if (null == NetworkArchiveRequest.field_D) {
                  IconTextComponent.field_Lb = new boolean[TextMetricsGlobals.field_h];
                  NetworkArchiveRequest.field_D = new byte[TextMetricsGlobals.field_h];
                }
                var13 = 0;
                var9_intLifetime1 = var13;
                while (var13 < TextMetricsGlobals.field_h) {
                  IconTextComponent.field_Lb[var13] = false;
                  var13++;
                }
                FadeLayer.findValidSettingCombination(true, -1, -1, TextMetricsGlobals.field_h, 0, 8, -1, QueuedRequest.field_h);
                if (!(2 > ReflectionCheckHelpers.field_d) &&
                  ResizableDialog.field_Y[12]) {
                  ViewModeNoticeGlobals.field_b = true;
                }
              }
              if (!ViewModeNoticeGlobals.field_b) {
                HuffmanCodec.field_d.field_Y = false;
                if (HuffmanCodec.field_d.field_G) {
                  var9 = null;
                  if (PasswordLoginCredentials.field_l) {
                    var9 = "<col=A00000>" + FrameSkin.field_d + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; var10Lifetime1 < TextMetricsGlobals.field_h; var10Lifetime1++) {
                    if (IconTextComponent.field_Lb[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + LoginMethodHelpers.field_a[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 != null) {
                        var9 = (String) (var9) + ", " + var11_ref;
                      } else {
                        var9 = var11_ref;
                      }
                    }
                  }
                  QuickChatCategoryCache.field_g = "<col=A00000>" + MusicCrossfadeStream.field_F + "<br>" + BackgroundParticle.field_h + (String) (var9);
                }
              }
            } else {
              CellFlip.field_o.field_Y = false;
              IntrusiveNode.field_b.field_V = DiskArchiveRequest.field_A;
              if (var8 == 0) {
                stackIn_24_0 = IntrusiveDequeCursor.field_f;
              } else {
                stackIn_24_0 = ConditionalTextValue.field_d;
              }
              var16 = stackIn_24_0;
              var9 = var16;
              var10Lifetime1 = BitCountAndDialogHelpers.field_b.field_C.textWidth(var16) + 3 * BitCountAndDialogHelpers.field_b.field_C.measureCharacterAdvance('.');
              BitCountAndDialogHelpers.field_b.field_lb = 0;
              if ((SpriteState.field_y & 48) == 16) {
                var9 = var16 + ".";
              }
              BitCountAndDialogHelpers.field_b.field_z = (-var10Lifetime1 + BitCountAndDialogHelpers.field_b.field_K) / 2;
              if ((48 & SpriteState.field_y) == 32) {
                var9 = (String) (var9) + "..";
              }
              if ((48 & SpriteState.field_y) == 48) {
                var9 = (String) (var9) + "...";
              }
              BitCountAndDialogHelpers.field_b.field_V = (String) (var9);
              HuffmanCodec.field_d.field_V = TextMetricsGlobals.field_g.toUpperCase();
            }
          }
          stackIn_70_0 = ScrollPaneWithFooter.field_Eb;
          stackIn_71_1 = (param3) && (!param1) && (!QuickChatPhraseRegistry.field_h);
          ((SpriteWidget) (Object) stackIn_70_0).updateInputFullScreen(stackIn_71_1, (byte) 89);
          stackIn_75_0 = CacheReference.field_r;
          stackIn_76_1 = (param3) && (!param1) && (!QuickChatPhraseRegistry.field_h);
          ((SpriteWidget) (Object) stackIn_75_0).updateInputFullScreen(stackIn_76_1, (byte) 103);
          stackIn_80_0 = MouseTrailPoint.field_n;
          stackIn_81_1 = (param3) && (!param1) && (QuickChatPhraseRegistry.field_h);
          ((SpriteWidget) (Object) stackIn_80_0).updateInputFullScreen(stackIn_81_1, (byte) 100);
          LobbyGame.field_pc.field_c.processTabPresses(0);
          if (param0) {
            field_f = 123;
          }
          if (null != QueuedRequest.field_h) {
            if (CellFlip.field_o.field_nb != 0) {
              NetworkArchiveRequest.sendReturnToLobbyRequest(param2, -12508);
            }
            if (0 != HuffmanCodec.field_d.field_nb) {
              if (!GameKeyHandler.field_c) {
                TooltipAndOptionsHelpers.sendGameOptions((byte) -55, param2);
              } else {
                PacketRequestHelpers.sendByteRequest(3, param2);
              }
            }
            LoginMethod.updateGameOptionControls(param2, true, -2137400888, QueuedRequest.field_h);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var4), "eb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    IterableDualLinkDeque() {
        this.field_e = new DualLinkNode();
        this.field_e.field_h = this.field_e;
        this.field_e.field_k = this.field_e;
    }

    static {
        field_g = "Offer rematch";
        field_a = "Cancel";
    }
}
