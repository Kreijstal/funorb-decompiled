/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseInputHandler implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_f;
    static String field_e;
    static UiLayoutNode field_b;
    static int[] field_c;
    static Sprite[] field_g;
    static String field_a;
    static UiLayoutNode field_d;

    final static void drawQuickChatToggleHint(int param0, int param1, int param2, int param3, int param4, int param5) {
        SoftwareRasterizer.fillRoundedRectangleBlended(param2 - 8, param4 - 11, MarkerSliderPainter.field_n, 20, 6, param5, param1);
        String var6 = LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, !QuickChatCategoryCache.field_e ? SoundStreamHandle.field_l : QuickChatMenuBuilder.field_a, new String[]{TutorialScenerySupport.field_b[ClassDescriptorSupport.field_h]});
        ConsoleTokenCursor.field_d.drawText(var6, param2, param4, param0, param3);
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ProxyAuthenticationRequiredException.field_e == null) {
            return;
          }
          TextHotspotWidget.field_M = 0;
          BuyPitchDialog.field_G = param0.getX();
          ModelMaterial.field_b = param0.getY();
          PasswordFieldPainter.field_A = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ku.mouseMoved(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.isPopupTrigger()) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ku.mouseClicked(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ProxyAuthenticationRequiredException.field_e != null) {
            TextHotspotWidget.field_M = 0;
            RandomAccessCacheFile.field_d = 0;
            PasswordFieldPainter.field_A = true;
            var2_int = param0.getModifiers();
            if ((4 & var2_int) == 0) {
            }
            if ((16 & var2_int) == 0) {
            }
            if ((var2_int & 8) != 0) {
            }
          }
          if (!param0.isPopupTrigger()) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ku.mouseReleased(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == ProxyAuthenticationRequiredException.field_e) {
            return;
          }
          TextHotspotWidget.field_M = 0;
          BuyPitchDialog.field_G = param0.getX();
          ModelMaterial.field_b = param0.getY();
          PasswordFieldPainter.field_A = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ku.mouseDragged(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        if (param0 == -1) {
          field_c = null;
          field_g = null;
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        }
        field_d = (UiLayoutNode) null;
        field_c = null;
        field_g = null;
        field_a = null;
        field_d = null;
        field_b = null;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (ProxyAuthenticationRequiredException.field_e != null) {
            RandomAccessCacheFile.field_d = 0;
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ku.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
          if (null != ProxyAuthenticationRequiredException.field_e) {
            TextHotspotWidget.field_M = 0;
            BuyPitchDialog.field_G = -1;
            ModelMaterial.field_b = -1;
            PasswordFieldPainter.field_A = true;
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ku.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ProxyAuthenticationRequiredException.field_e != null) {
            TextHotspotWidget.field_M = 0;
            AuctionItem.field_w = param0.getX();
            UiWidget.field_l = param0.getY();
            MonotonicClock.monotonicMillis(71);
            if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              ContextMenuItem.field_Fb = 2;
              RandomAccessCacheFile.field_d = 2;
            } else {
              ContextMenuItem.field_Fb = 1;
              RandomAccessCacheFile.field_d = 1;
            }
            var2_int = param0.getModifiers();
            PasswordFieldPainter.field_A = true;
            if ((16 & var2_int) == 0) {
            }
            if ((var2_int & 4) == 0) {
            }
            if ((var2_int & 8) != 0) {
            }
          }
          if (!param0.isPopupTrigger()) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ku.mousePressed(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ProxyAuthenticationRequiredException.field_e == null) {
            return;
          }
          TextHotspotWidget.field_M = 0;
          BuyPitchDialog.field_G = param0.getX();
          ModelMaterial.field_b = param0.getY();
          PasswordFieldPainter.field_A = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ku.mouseEntered(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(String param0, int param1, boolean param2) {
        try {
          DiagnosticsOverlaySupport.field_g = true;
          if (param1 != 4) {
            field_a = (String) null;
          }
          TextLineLayoutSupport.field_a = param2;
          WorldSpriteSequence.field_f = new AccountRequestDialog(RankingsRequest.field_l, ConsoleLexer.field_b, param0, AuctionBidDialog.field_G, TextLineLayoutSupport.field_a);
          RankingsRequest.field_l.pushModal(WorldSpriteSequence.field_f, false);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ku.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Lost";
        field_a = "Cancel";
    }
}
