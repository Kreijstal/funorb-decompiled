/*
 * Decompiled by CFR-JS 0.4.0.
 */
class MessageDialog extends ContentTransitionDialog implements ButtonActivationListener {
    static String tutorialEightBallStartPlaceCueball;
    private boolean field_tb;
    static String playerYouX2AreGroupName;
    private ProgressBarWidget statusProgressBar;
    private boolean field_sb;
    private BitmapFont messageFont;
    private boolean field_ub;
    static int field_xb;
    private boolean errorContentInstalled;

    final static void o(byte param0) {
        LobbyGame.field_Vb = new UiComponent("decision box", (UiComponent) null);
        MenuSelection.a(true, LobbyGame.field_Vb);
        NanoTickClock.field_t = new UiComponent("decision button a", (UiComponent) null);
        rl.field_b = new UiComponent("decision button b", (UiComponent) null);
        if (param0 < -103) {
          ar.a(29022, NanoTickClock.field_t);
          ar.a(29022, rl.field_b);
          LobbyGame.field_Vb.addChild(-104, NanoTickClock.field_t);
          LobbyGame.field_Vb.addChild(-104, rl.field_b);
          return;
        }
        MessageDialog.o((byte) -98);
        ar.a(29022, NanoTickClock.field_t);
        ar.a(29022, rl.field_b);
        LobbyGame.field_Vb.addChild(-104, NanoTickClock.field_t);
        LobbyGame.field_Vb.addChild(-104, rl.field_b);
    }

    final boolean handleKeyInput(char param0, int param1, boolean param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            return true;
          }
          if (param1 != 13) {
            stackIn_7_0 = super.handleKeyInput(param0, param1, false, param3);
            return stackIn_7_0;
          }
          this.dismissDialog(17);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("qq.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void dismissDialog(int param0) {
        if (param0 != 17) {
          return;
        }
        if (!this.dialogOpen) {
          return;
        }
        this.dialogOpen = false;
        if (this.field_sb) {
          ProxySocketConnector.a(false);
          return;
        }
        if (!this.field_tb) {
          return;
        }
        bh.b(false);
    }

    final void m(byte param0) {
        MessageDialogContent var2 = null;
        MessageDialogContent var2Lifetime1;
        this.statusProgressBar.setStripeColors(4210752, 19365, 2121792);
        if (param0 == -33) {
          var2 = new MessageDialogContent(this, this.messageFont, ag.connectionrestored);
          var2.addActionButton(15, ti.returntogame, param0 + 34);
          this.replaceContent(var2, param0 + 63);
          return;
        }
        this.field_tb = false;
        var2Lifetime1 = new MessageDialogContent(this, this.messageFont, ag.connectionrestored);
        var2Lifetime1.addActionButton(15, ti.returntogame, param0 + 34);
        this.replaceContent(var2Lifetime1, param0 + 63);
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 >= -62) {
          playerYouX2AreGroupName = (String) null;
          tutorialEightBallStartPlaceCueball = null;
          playerYouX2AreGroupName = null;
          return;
        }
        tutorialEightBallStartPlaceCueball = null;
        playerYouX2AreGroupName = null;
    }

    final void installErrorContent(String param0, int param1, int param2) {
        boolean stackIn_5_1 = false;
        MessageDialogContent stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        String stackIn_11_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        MessageDialogContent var5 = null;
        try {
          if (this.errorContentInstalled) {
            return;
          }
          this.errorContentInstalled = true;
          stackIn_5_1 = (param2 == ~param1);
          this.field_ub = stackIn_5_1;
          this.statusProgressBar.setStripeColors(4210752, param2 ^ -19110, 8405024);
          var5 = new MessageDialogContent(this, this.messageFont, param0);
          if (param1 == 5) {
            var5.addActionButton(11, NodeHashTableIterator.reloadgame, 1);
            var5.addActionButton(17, dj.quittowebsite, 1);
          } else {
            if (param1 != 256) {
              stackIn_10_0 = var5;
              stackIn_10_1 = -1;
              if (!this.field_sb) {
                stackIn_11_2 = CueStick.back;
              } else {
                stackIn_11_2 = QuickChatPhraseDefinition.retry;
              }
              ((MessageDialogContent) (Object) stackIn_10_0).addActionButton(stackIn_10_1, stackIn_11_2, 1);
            } else {
              var5.addButton(QuickChatPhraseDefinition.retry, -101, (WidgetListener) (this));
            }
          }
          if (param1 != 3) {
            if (4 == param1) {
              var5.addActionButton(8, StatefulTextPainter.playfreeversion, 1);
            } else {
              if (param1 == 6) {
                var5.addActionButton(9, e.tocustomersupport, 1);
              } else {
                if (param1 != 9) {
                  this.replaceContent(var5, 30);
                  return;
                }
                var5.addButton(StatefulTextPainter.changedisplayname, -94, (WidgetListener) (this));
              }
            }
          } else {
            var5.addActionButton(7, UiComponentNode.toserverlist, 1);
          }
          this.replaceContent(var5, 30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("qq.R(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public void onButtonActivated(boolean param0, int param1, int param2, ButtonWidget param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_ub) {
            lf.a(3, (byte) 121);
            this.dismissDialog(17);
          } else {
            LoginForm.a("tochangedisplayname.ws", NanoTickClock.getApplet(97), false);
          }
          if (param0) {
            return;
          }
          this.messageFont = (BitmapFont) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("qq.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    MessageDialog(DialogLayer param0, BitmapFont param1, String param2, boolean param3, boolean param4) {
        super(param0, new MessageDialogContent((MessageDialog) null, param1, param2), 77, 10, 10);
        try {
          this.errorContentInstalled = false;
          this.field_sb = param3 ? true : false;
          this.messageFont = param1;
          this.field_tb = param4 ? true : false;
          this.field_ub = false;
          this.statusProgressBar = new ProgressBarWidget(13, 50, 274, 30, 15, 2113632, 4210752);
          this.statusProgressBar.animationEnabled = true;
          this.addChild(true, this.statusProgressBar);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "qq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        tutorialEightBallStartPlaceCueball = "The objective of eight-ball pool is to \"pot\" all of your group of balls and then the black ball (number 8). Before we get to that, we \"break\", and the first thing you might want to do is <u=ffffff>move the cue ball</u>. <col=99ff99>Hold</col> down the <img=0> <col=99ff99>left mouse button over the cue ball and drag</col> it to where you would like to place it.";
        field_xb = 0;
        playerYouX2AreGroupName = "You and <%0> are <%2>.";
    }
}
