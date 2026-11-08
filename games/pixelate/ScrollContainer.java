/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollContainer extends SceneWidget {
    static String field_Jb;
    static String field_Eb;
    static MouseWheelHandler field_Lb;
    SceneWidget content;
    static String[] field_Hb;
    VerticalScrollbar field_Gb;
    SceneWidget field_Ib;
    static Sprite field_Kb;

    ScrollContainer(long param0, SceneWidget param1, SceneWidget param2, VerticalScrollbar param3) {
        super(param0, (SceneWidget) null);
        try {
          this.field_Ib = new SceneWidget(0L, param2);
          this.field_Gb = new VerticalScrollbar(0L, param3);
          this.addChild(this.field_Ib, (byte) 26);
          this.addChild(this.field_Gb, (byte) 26);
          this.content = param1;
          this.field_Ib.addChild(param1, (byte) 26);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "gp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void showLoginResultMessage(boolean param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          dk.field_c = false;
          NumericDateInputWidget.field_V = false;
          if (null != MainMenuScreen.field_r &&
            MainMenuScreen.field_r.field_N) {
            if (param2 == 8) {
              if (!MainMenuScreen.field_s) {
                param1 = bo.field_b;
              } else {
                param1 = mp.field_e;
              }
              param2 = 2;
              nf.field_b.setUsername(Checkbox.field_U, -13939);
            }
            var3_int = 1;
            if (param2 == 10) {
              var3_int = 0;
              RegistrationRequestDialog.showDisplayNameForm((byte) -51);
            }
            if (var3_int != 0) {
              if (NumericDateInputWidget.field_V) {
                param1 = AlphaContainer.formatTemplate(vf.field_a, 79, new String[]{param1});
              }
              if (ke.field_d) {
                param1 = IsaacRandom.field_a;
              }
              MainMenuScreen.field_r.installErrorContent(param2, 5804, param1);
            }
            if (256 != param2 &&
              param2 != 10 &&
              !MainMenuScreen.field_s) {
              nf.field_b.clearFields(-10515);
            }
          }
          if (!param0) {
            field_Hb = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("gp.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void applyScrollInput(boolean param0, int param1, int param2, int param3, byte param4) {
        int var6;
        if (this.field_Gb.pollLineUp((byte) 123)) {
          this.content.pendingYDelta = this.content.pendingYDelta + param2;
        }
        var6 = 13 / ((70 - param4) / 55);
        if (this.field_Gb.pollLineDown((byte) 70)) {
          this.content.pendingYDelta = this.content.pendingYDelta - param2;
        }
        if (this.field_Gb.pollPageUp((byte) 83)) {
          this.content.pendingYDelta = this.content.pendingYDelta + param1;
        }
        if (this.field_Gb.pollPageDown(-1)) {
          this.content.pendingYDelta = this.content.pendingYDelta - param1;
        }
        if (this.field_W) {
          this.content.pendingYDelta = this.content.pendingYDelta - param3;
        }
        if (param0) {
          if (0 > -(this.content.field_S + this.content.pendingYDelta)) {
            this.content.pendingYDelta = -this.content.field_S;
          }
          if (this.content.pendingHeightDelta + this.content.height - this.field_Ib.height < -(this.content.pendingYDelta + this.content.field_S)) {
            this.content.pendingYDelta = -(this.content.height + this.content.pendingHeightDelta - this.field_Ib.height) - this.content.field_S;
          }
        } else {
          if (this.content.pendingHeightDelta + this.content.height - this.field_Ib.height < -(this.content.pendingYDelta + this.content.field_S)) {
            this.content.pendingYDelta = -(this.content.height + this.content.pendingHeightDelta - this.field_Ib.height) - this.content.field_S;
          }
          if (-(this.content.pendingYDelta + this.content.field_S) < 0) {
            this.content.pendingYDelta = -this.content.field_S;
          }
        }
        if (this.field_Gb.isThumbHeld(92)) {
          this.content.field_S = -this.field_Gb.getThumbScrollOffset(3, this.content.height, param0, this.field_Ib.height);
          this.content.pendingYDelta = 0;
        }
        this.field_Gb.layoutScrollbar(this.field_Ib.height, (byte) 108, -this.content.field_S, this.content.height);
    }

    private final void layoutViewport(boolean param0, int param1, int param2) {
        if (!param0) {
          this.field_Ib.height = this.height;
          this.field_Ib.field_K = -param2 + (this.field_K - param1);
          this.content.field_D = 0;
          this.content.field_K = -param2 + (this.field_K - param1);
          this.field_Gb.setBoundsAndLayout(-param2 + this.field_K, this.content.height, this.height, this.field_Ib.height, -this.content.field_S, param2, 0, -1);
          return;
        }
        field_Jb = (String) null;
        this.field_Ib.height = this.height;
        this.field_Ib.field_K = -param2 + (this.field_K - param1);
        this.content.field_D = 0;
        this.content.field_K = -param2 + (this.field_K - param1);
        this.field_Gb.setBoundsAndLayout(-param2 + this.field_K, this.content.height, this.height, this.field_Ib.height, -this.content.field_S, param2, 0, -1);
    }

    final void setBoundsAndLayout(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        this.field_K = param3;
        this.height = param5;
        this.field_S = param4;
        this.field_D = param0;
        if (param2 >= 43) {
          this.layoutViewport(false, param1, param6);
          return;
        }
    }

    private final boolean layoutAndScroll(int param0, int param1, int param2, boolean param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        if (!param3) {
          if (!this.field_W) {
            var8 = 0;
            if (param5 == 7736) {
              this.content.layoutVerticalContent(param1, (byte) -128, var8 != 0, this.field_Ib.height);
              this.applyScrollInput(false, param4, param2, param0, (byte) 127);
              return var8 != 0;
            }
            ScrollContainer.findLobbyPlayer(-48, -99L);
            this.content.layoutVerticalContent(param1, (byte) -128, var8 != 0, this.field_Ib.height);
            this.applyScrollInput(false, param4, param2, param0, (byte) 127);
            return var8 != 0;
          }
          if (param6) {
            var8Lifetime2 = 0;
            if (param5 == 7736) {
              this.content.layoutVerticalContent(param1, (byte) -128, var8Lifetime2 != 0, this.field_Ib.height);
              this.applyScrollInput(false, param4, param2, param0, (byte) 127);
              return var8Lifetime2 != 0;
            }
            ScrollContainer.findLobbyPlayer(-48, -99L);
            this.content.layoutVerticalContent(param1, (byte) -128, var8Lifetime2 != 0, this.field_Ib.height);
            this.applyScrollInput(false, param4, param2, param0, (byte) 127);
            return var8Lifetime2 != 0;
          }
          var8Lifetime3 = 1;
          if (param5 == 7736) {
            this.content.layoutVerticalContent(param1, (byte) -128, var8Lifetime3 != 0, this.field_Ib.height);
            this.applyScrollInput(false, param4, param2, param0, (byte) 127);
            return var8Lifetime3 != 0;
          }
          ScrollContainer.findLobbyPlayer(-48, -99L);
          this.content.layoutVerticalContent(param1, (byte) -128, var8Lifetime3 != 0, this.field_Ib.height);
          this.applyScrollInput(false, param4, param2, param0, (byte) 127);
          return var8Lifetime3 != 0;
        }
        var8Lifetime1 = 1;
        if (param5 == 7736) {
          this.content.layoutVerticalContent(param1, (byte) -128, var8Lifetime1 != 0, this.field_Ib.height);
          this.applyScrollInput(false, param4, param2, param0, (byte) 127);
          return var8Lifetime1 != 0;
        }
        ScrollContainer.findLobbyPlayer(-48, -99L);
        this.content.layoutVerticalContent(param1, (byte) -128, var8Lifetime1 != 0, this.field_Ib.height);
        this.applyScrollInput(false, param4, param2, param0, (byte) 127);
        return var8Lifetime1 != 0;
    }

    final static LobbyPlayer findLobbyPlayer(int param0, long param1) {
        if (param0 == 2) {
          return (LobbyPlayer) (QuickChatCategoryCache.field_d.get(param0 - 11436, param1));
        }
        String var4 = (String) null;
        ScrollContainer.showLoginResultMessage(true, (String) null, -69);
        return (LobbyPlayer) (QuickChatCategoryCache.field_d.get(param0 - 11436, param1));
    }

    final void applyScrollInputForViewport(int param0, int param1, boolean param2, int param3) {
        this.applyScrollInput(param2, this.field_Ib.height, param1, param3, (byte) -43);
        int var5 = -81 / ((param0 + 15) / 62);
    }

    public static void releaseStatics(int param0) {
        field_Hb = null;
        field_Eb = null;
        if (param0 != 0) {
          return;
        }
        field_Kb = null;
        field_Lb = null;
        field_Jb = null;
    }

    final boolean updateScrolling(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param4 == 0) {
          return this.layoutAndScroll(param3, param2, param5, param1, this.field_Ib.height, 7736, param0);
        }
        this.updateScrolling(false, true, -57, 93, -15, 99);
        return this.layoutAndScroll(param3, param2, param5, param1, this.field_Ib.height, 7736, param0);
    }

    static {
        field_Eb = "Disruptive behaviour";
        field_Hb = new String[]{"Many grids have a dark edge of cells called the <col=FF9900>buffer</col>. Use these to drop tiles half-on, half-off the central grid. They are not included as part of the picture."};
        field_Jb = "Location";
    }
}
