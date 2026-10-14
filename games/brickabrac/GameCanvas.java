/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameCanvas extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean focusLossPending;
    static lo field_c;
    java.awt.Frame window;
    static String field_b;
    static String field_d;
    static int field_f;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.focusLossPending = true;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "wg.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(String param0, byte param1, boolean param2, String param3, int param4, String param5, int param6) {
        m var7 = null;
        RuntimeException var7_ref = null;
        m var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new m(param5);
          if (param1 > -45) {
            field_c = (lo) null;
          }
          var8 = new m(param3);
          stackIn_3_0 = ValidationIconWidget.a(param0, param2, param4, var7, param6, var8, 4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("wg.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(')').toString());
        }
    }

    final static int a(boolean param0) {
        HalloweenBackground.field_v.a(77);
        if (param0) {
          MenuScreen var2 = (MenuScreen) null;
          GameCanvas.registerMenuScreen(43, (MenuScreen) null);
          if (vd.field_f.pollTransport(72)) {
            return 0;
          }
          return sm.b(-1);
        }
        if (vd.field_f.pollTransport(72)) {
          return 0;
        }
        return sm.b(-1);
    }

    public static void a(int param0) {
        if (param0 == 0) {
          field_c = null;
          field_b = null;
          field_d = null;
          return;
        }
        String var2 = (String) null;
        GameCanvas.a((String) null, (byte) 44, true, (String) null, -49, (String) null, 29);
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final void a(PlatformServices param0, int param1) {
        try {
          sq.a(param0, -20954, this.window);
          int var3_int = -13 / ((param1 - 82) / 32);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "wg.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final static void registerMenuScreen(int obfuscationGuard, MenuScreen screen) {
        try {
          if (obfuscationGuard > -53) {
            field_d = (String) null;
          }
          if (screen.screenId >= 0 &&
            DelayedPacket.menuScreens.length > screen.screenId) {
            DelayedPacket.menuScreens[screen.screenId] = screen;
            return;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "wg.E(" + obfuscationGuard + ',' + (screen != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        UiComponent var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        ChatMessage var9 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (ScrollPaneWithFooter.field_Yb > hc.field_f) {
            hc.field_f = hc.field_f + 1;
          }
          if (BallPulseEffect.framebuffer.height != ej.field_O) {
            BoundedFile.field_h = BoundedFile.field_h + (-ej.field_O + BallPulseEffect.framebuffer.height);
            ej.field_O = BallPulseEffect.framebuffer.height;
          }
          if (param2 <= ~hc.field_f) {
            return;
          }
          ef.a(param2 - 123);
          DualLinkDeque.field_d.updateRoot(param3, -15211);
          if (null != vd.field_a) {
            if (um.field_e) {
              vd.field_a.a(DualLinkDeque.field_d.screenY, DualLinkDeque.field_d.screenX, 116, param3);
            } else {
              vd.field_a = null;
            }
          }
          for (var4_int = 0; 5 > var4_int; var4_int++) {
            var5 = ik.field_i[var4_int];
            if (var5 != null) {
              if (var5.pressedButton != 0) {
                QuickChatPhraseDefinition.a(784, var4_int, var5);
              }
              var6 = tm.getChatFilter(var4_int, (byte) 18);
              vj.field_a[var4_int].sprite = ef.field_b[var6];
              QuickChatPhraseDefinition.field_F[var4_int].text = rh.field_e[var6];
            }
          }
          if (LegacyUtf8Decoder.field_c.pressedButton != 0) {
            CircleBody.reportAbuseDialog = new ReportAbuseDialog(LegacyUtf8Decoder.field_c.screenX, LegacyUtf8Decoder.field_c.screenY, LegacyUtf8Decoder.field_c.width, LegacyUtf8Decoder.field_c.height, param1, MenuSelection.field_m, rf.field_c, ReportAbuseDialog.field_Zb, CappedUrlRequest.field_l, BlankScreen.field_k, DualLinkNode.field_t, (String) null, 0L);
          }
          var9 = sj.a(LobbyGame.field_oc, np.uiRowHeight, -13294, param0);
          if (var9 != null) {
            ScrollPaneWithFooter.a(0, var9);
          }
          var8 = LevelResultSubmission.c(-9235);
          if (var8 == null) {
            return;
          }
          WidgetTextLayout.field_e = var8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var4), "wg.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    GameCanvas() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    static {
        field_c = new lo();
        field_d = "Game full";
        field_b = "Please try again in a few minutes.";
    }
}
