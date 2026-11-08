/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ModalPanel extends UiContainer {
    static boolean field_T;
    static int[] field_X;
    static String[] field_R;
    static SceneWidget field_W;
    static String field_P;
    private ModalStack field_V;
    boolean field_Q;
    private int field_U;
    static int[] field_S;

    public static void releaseStatics(byte param0) {
        field_S = null;
        field_W = null;
        field_P = null;
        field_X = null;
        field_R = null;
        if (param0 < 126) {
          field_S = (int[]) null;
        }
    }

    ModalPanel(ModalStack param0, int param1, int param2) {
        super(-param1 + IntrusiveNode.field_l >> 1, DualNode.field_u - param2 >> 1, param1, param2, (WidgetPainter) null);
        try {
          this.field_U = 0;
          this.field_Q = false;
          this.field_V = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "bb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final UiComponent findFocusedChild(int param0) {
        UiComponent var2 = super.findFocusedChild(param0 ^ 0);
        if (param0 != -1) {
          this.drawLayer(96, (byte) -104, -78, -99);
          if (var2 != null) {
            return var2;
          }
          return (UiComponent) (this);
        }
        if (var2 != null) {
          return var2;
        }
        return (UiComponent) (this);
    }

    boolean refreshVisibilityAndCheckClosed(int param0) {
        if (param0 > -50) {
          this.findFocusedChild(-124);
          this.field_U = this.targetAlpha(false);
          if (this.field_U != 0) {
            return false;
          }
          if (!this.field_Q) {
            return true;
          }
          return false;
        }
        this.field_U = this.targetAlpha(false);
        if (this.field_U != 0) {
          return false;
        }
        if (!this.field_Q) {
          return true;
        }
        return false;
    }

    final static void a(byte param0) {
        if (!QuickChatMenu.field_ac) {
          throw new IllegalStateException();
        }
        IntrusiveNode.field_a = true;
        if (param0 > 66) {
          AccountTermsPanel.a(true, 40);
          uj.field_d = 0;
          return;
        }
        field_W = (SceneWidget) null;
        AccountTermsPanel.a(true, 40);
        uj.field_d = 0;
    }

    final void resizeAndCenter(byte param0, int param1, int param2) {
        this.setBounds(-param1 + IntrusiveNode.field_l >> 1, (byte) -103, -param2 + DualNode.field_u >> 1, param1, param2);
        int var4 = 103 / ((param0 - 0) / 45);
    }

    final static void a(int param0, byte param1) {
        PlayingSound var2 = null;
        int var3 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        PlayingSound var2Lifetime1;
        var3 = SteelSentinels.obfuscationControl;
        try {
          VerticalScrollbar.field_ac = param0;
          if (param1 != 64) {
            ModalPanel.a((byte) 37);
          }
          var2 = (PlayingSound) (ClockAndCookieHelpers.field_b.first(13058));
          while (var2 != null) {
            if (var2.field_u.isLinked((byte) -12)) {
              var2.field_v.setVolumeQ6(128 + VerticalScrollbar.field_ac * var2.field_t >> 8);
            } else {
              var2.unlink(param1 - 60);
            }
            var2 = (PlayingSound) (ClockAndCookieHelpers.field_b.next((byte) -84));
          }
          if (null != PacketLoopHelpers.field_c) {
            var2Lifetime1 = (PlayingSound) (PacketLoopHelpers.field_c.first(13058));
            while (var2Lifetime1 != null) {
              stackIn_14_0 = var2Lifetime1.field_u.isLinked((byte) -12);
              if (stackIn_14_0) {
                var2Lifetime1.field_v.setVolumeQ6(128 + VerticalScrollbar.field_ac * var2Lifetime1.field_t >> 8);
              } else {
                var2Lifetime1.unlink(4);
              }
              var2Lifetime1 = (PlayingSound) (PacketLoopHelpers.field_c.next((byte) -75));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var2_ref), "bb.SB(" + param0 + ',' + param1 + ')');
        }
    }

    private final int targetAlpha(boolean param0) {
        if (!param0) {
          return !this.field_Q ? 0 : this.field_V.topOpenPanel(-1850) == this ? 256 : 0;
        }
        return -118;
    }

    boolean updateAnimationsAndCheckClosed(int param0) {
        int var2 = this.targetAlpha(false);
        int var3 = var2 - this.field_U;
        if (param0 != -8350) {
          return false;
        }
        if (var3 > 0) {
          this.field_U = this.field_U + (-1 + (8 + var3)) / 8;
        }
        if (var3 < 0) {
          this.field_U = this.field_U + (-16 + var3 + 1) / 16;
          if (this.field_U != 0) {
            return false;
          }
          if (0 == var2) {
            return !this.field_Q ? true : false;
          }
          return false;
        }
        if (this.field_U != 0) {
          return false;
        }
        if (0 == var2) {
          return !this.field_Q ? true : false;
        }
        return false;
    }

    final void drawLayer(int param0, byte param1, int param2, int param3) {
        if (param1 > -99) {
          ModalPanel.a(35, (byte) 1);
        }
        if (this.field_U == 0) {
          return;
        }
        if (this.field_U >= 256) {
          if (param3 != 0) {
            return;
          }
          this.drawPanelBackground(param2 + this.field_o, param0 + this.field_z, true);
          super.drawLayer(param0, (byte) -121, param2, param3);
          return;
        }
        if (lc.field_b == null) {
          lc.field_b = new RgbSprite(this.field_x, this.field_E);
          IterableNodeHashTable.a(lc.field_b, (byte) -103);
          SoftwareRaster.clear();
          this.drawPanelBackground(0, 0, true);
          super.drawLayer(-param0 - this.field_z, (byte) -108, -this.field_o - param2, param3);
          MatchingTextValidator.popRasterStateWithIntGuard(111);
          lc.field_b.drawShadedGrayscale(param2 + this.field_o, param0 + this.field_z, this.field_U);
          return;
        }
        if (this.field_x > lc.field_b.field_A) {
          lc.field_b = new RgbSprite(this.field_x, this.field_E);
          IterableNodeHashTable.a(lc.field_b, (byte) -103);
          SoftwareRaster.clear();
          this.drawPanelBackground(0, 0, true);
          super.drawLayer(-param0 - this.field_z, (byte) -108, -this.field_o - param2, param3);
          MatchingTextValidator.popRasterStateWithIntGuard(111);
          lc.field_b.drawShadedGrayscale(param2 + this.field_o, param0 + this.field_z, this.field_U);
          return;
        }
        if (lc.field_b.field_F < this.field_E) {
          lc.field_b = new RgbSprite(this.field_x, this.field_E);
          IterableNodeHashTable.a(lc.field_b, (byte) -103);
          SoftwareRaster.clear();
          this.drawPanelBackground(0, 0, true);
          super.drawLayer(-param0 - this.field_z, (byte) -108, -this.field_o - param2, param3);
          MatchingTextValidator.popRasterStateWithIntGuard(111);
          lc.field_b.drawShadedGrayscale(param2 + this.field_o, param0 + this.field_z, this.field_U);
          return;
        }
        IterableNodeHashTable.a(lc.field_b, (byte) -103);
        SoftwareRaster.clear();
        this.drawPanelBackground(0, 0, true);
        super.drawLayer(-param0 - this.field_z, (byte) -108, -this.field_o - param2, param3);
        MatchingTextValidator.popRasterStateWithIntGuard(111);
        lc.field_b.drawShadedGrayscale(param2 + this.field_o, param0 + this.field_z, this.field_U);
    }

    abstract void drawPanelBackground(int param0, int param1, boolean param2);

    static {
        field_R = new String[]{"Game-time mode", "Technology level", "Game map"};
        field_P = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_S = new int[]{108, -1, 30, 28, -1, -1, -1, -1, -1, -1, -1};
    }
}
