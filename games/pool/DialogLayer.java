/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class DialogLayer extends SingleChildWidget {
    private IntrusiveDeque dialogs;
    static String multiconstFriends;
    static so field_R;
    static int[] field_T;
    static String timerMinutesSeconds;
    static Sprite field_Q;
    static String connectionlostWithreason;
    static String playerListLast;
    static int field_V;
    static int field_W;

    final static boolean b(byte param0, int param1) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          if (param1 <= PlayerContextMenu.field_e.position) {
            return true;
          }
          if (null == jd.field_c) {
            return false;
          }
          try {
            var2_int = jd.field_c.readByte(107);
            if (param0 < 27) {
              connectionlostWithreason = (String) null;
            }
            if (0 < var2_int) {
              if (var2_int > param1 - PlayerContextMenu.field_e.position) {
                var2_int = param1 - PlayerContextMenu.field_e.position;
              }
              jd.field_c.a(var2_int, 0, PlayerContextMenu.field_e.position, PlayerContextMenu.field_e.payload);
              MenuScreen.field_v = rl.monotonicTimeMillis((byte) -97);
              PlayerContextMenu.field_e.position = PlayerContextMenu.field_e.position + var2_int;
              if (param1 > PlayerContextMenu.field_e.position) {
                return false;
              }
              PlayerContextMenu.field_e.position = 0;
              return true;
            }
            if (var2_int < 0) {
              dn.c(64);
            } else {
              if (CushionSegment.d((byte) 127) <= 30000L) {
                return false;
              }
              dn.c(64);
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            dn.c(43);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public DialogLayer() {
        super(0, 0, TranslatedUiText.field_j, md.field_b, (WidgetPainter) null, (WidgetListener) null);
        this.dialogs = new IntrusiveDeque();
    }

    final void hideAllDialogs(int param0) {
        int var4 = Pool.field_O;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.dialogs);
        if (param0 != -22216) {
          return;
        }
        FadingDialog var3 = (FadingDialog) (var2.last((byte) -92));
        while (var3 != null) {
          var3.dialogOpen = false;
          var3 = (FadingDialog) (var2.previous(param0 ^ 22169));
        }
        this.child = null;
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        UiComponent var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        pn var9 = null;
        var7 = Pool.field_O;
        try {
          if (OpacityWidget.field_P.height != cb.field_g) {
            StrongCacheEntry.field_J = StrongCacheEntry.field_J + (OpacityWidget.field_P.height - cb.field_g);
            cb.field_g = OpacityWidget.field_P.height;
          }
          if (BufferedFile.field_h > HighscoresScreen.field_P) {
            HighscoresScreen.field_P = HighscoresScreen.field_P + 1;
          }
          if (HighscoresScreen.field_P <= 0) {
            return;
          }
          ProgressDialog.l(23323);
          fl.field_q.updateRoot(param1, false);
          if (null != ThemeSelectScreen.field_J) {
            if (!ea.field_z) {
              ThemeSelectScreen.field_J = null;
            } else {
              ThemeSelectScreen.field_J.processPointerFrame(-125, fl.field_q.screenX, param1, fl.field_q.screenY);
            }
          }
          for (var4_int = 0; 5 > var4_int; var4_int++) {
            var5 = il.field_g[var4_int];
            if (var5 != null) {
              if (var5.pressedButton != 0) {
                NodeHashTableIterator.a(27937, var5, var4_int);
              }
              var6 = f.a(param2 ^ 5, var4_int);
              AlignedIconLabel.field_Mb[var4_int].sprite = ThemeSelectScreen.field_M[var6];
              ta.field_b[var4_int].text = TranslatedUiText.field_i[var6];
            }
          }
          if (param2 != d.field_e.pressedButton) {
            fc.field_b = new ReportAbuseDialog(d.field_e.screenX, d.field_e.screenY, d.field_e.width, d.field_e.height, param3, tq.field_m, dg.field_J, qg.field_f, AlignedIconLabel.field_Lb, e.field_e, UiWidget.field_A, (String) null, 0L);
          }
          var9 = IntrusiveNodeHashTable.a(param0, (byte) -126, ArchiveIndex.field_x, CueAim.field_j);
          if (var9 != null) {
            na.a(var9, 122);
          }
          var8 = dk.a(1);
          if (var8 != null) {
            CacheEntry.field_B = var8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var4), "lq.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void renderWidget(int param0, byte param1, int param2, int param3) {
        int var8 = Pool.field_O;
        int var6 = 22 / ((param1 + 42) / 53);
        if (this.renderer != null) {
          this.renderer.paintWidget(true, param2, (byte) -63, param3, (UiWidget) (this));
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.dialogs);
        UiWidget var7 = (UiWidget) (var5.first(0));
        while (var7 != null) {
          var7.renderWidget(param0, (byte) 28, this.widgetX + param2, this.widgetY + param3);
          var7 = (UiWidget) (var5.next((byte) -71));
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            DialogLayer.i(82);
          }
          stackIn_5_0 = (gf.a(param1 ^ 88, param0) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("lq.T(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final UiWidget findFocusTarget(int param0) {
        int var4 = Pool.field_O;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.dialogs);
        FadingDialog var3 = (FadingDialog) (var2.last((byte) -92));
        while (var3 != null) {
          if (var3.dialogOpen) {
            return var3.findFocusTarget((byte) 127);
          }
          var3 = (FadingDialog) (var2.previous(-84));
        }
        if (param0 == -1) {
          return null;
        }
        DialogLayer.i(65);
        return null;
    }

    final void settleDialogAnimations(int param0) {
        int var4 = Pool.field_O;
        if (param0 != 11741) {
          return;
        }
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.dialogs);
        FadingDialog var3 = (FadingDialog) (var2.last((byte) -92));
        while (var3 != null) {
          if (var3.settleDialogAnimation(false)) {
            var3.unlink((byte) -117);
          }
          var3 = (FadingDialog) (var2.previous(-86));
        }
    }

    final void advanceDialogAnimations(byte param0) {
        if (param0 <= 121) {
          return;
        }
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.dialogs);
        FadingDialog var3 = (FadingDialog) (var2.last((byte) -92));
        while (var3 != null) {
          if (var3.advanceDialogAnimation((byte) -20)) {
            var3.unlink((byte) -117);
          }
          var3 = (FadingDialog) (var2.previous(-112));
        }
        this.child = (UiWidget) ((Object) this.getTopOpenDialog(110));
    }

    final static void a(boolean param0) {
        ProgressDialog.m(8421504);
        TranslatedUiText.b(-31384);
        fc.field_b = null;
        if (!param0) {
          DialogLayer.i(114);
        }
        DialogLayer.i(15975);
    }

    public static void releaseStatics(byte param0) {
        connectionlostWithreason = null;
        playerListLast = null;
        field_T = null;
        multiconstFriends = null;
        timerMinutesSeconds = null;
        if (param0 != -47) {
          return;
        }
        field_R = null;
        field_Q = null;
    }

    final static void i(int param0) {
        ArrayWidgetGroup.field_H = false;
        if (param0 != 15975) {
          connectionlostWithreason = (String) null;
        }
        if (null != LobbyPlayer.field_Ub) {
          LobbyPlayer.field_Ub.resetSelection(17517);
        }
        if (0 != hn.field_b) {
          cl.a(param0 ^ 1124);
        }
        ProgressBarWidget.field_G = 0;
    }

    final FadingDialog getTopOpenDialog(int param0) {
        IntrusiveDequeCursor var2;
        FadingDialog var3;
        if (param0 < 101) {
          timerMinutesSeconds = (String) null;
        }
        var2 = new IntrusiveDequeCursor(this.dialogs);
        var3 = (FadingDialog) (var2.last((byte) -92));
        while (var3 != null) {
          if (var3.dialogOpen) {
            return var3;
          }
          var3 = (FadingDialog) (var2.previous(-128));
        }
        return null;
    }

    final static void l(int param0) {
        DualLinkNode var2 = null;
        int var3 = Pool.field_O;
        DualLinkNode var2Lifetime1;
        try {
          TextHotspotRegion.field_t = 0;
          int var1_int = 83 % ((17 - param0) / 34);
          LocalGameSetupScreen.field_J = null;
          AccountWelcomePanel.field_S = 0;
          SoundCache.field_k.clear((byte) 69);
          jq.field_c.clear((byte) 48);
          var2 = AimTarget.field_b.firstForIteration((byte) -125);
          while (var2 != null) {
            var2.unlinkNode(false);
            var2 = AimTarget.field_b.nextForIteration(83);
          }
          var2Lifetime1 = gd.field_c.firstForIteration((byte) -125);
          while (var2Lifetime1 != null) {
            var2Lifetime1.unlinkNode(false);
            var2Lifetime1 = gd.field_c.nextForIteration(68);
          }
          th.field_a = 0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "lq.GA(" + param0 + ')');
        }
    }

    final void showDialog(UiWidget param0, int param1) {
        FadingDialog var3 = null;
        try {
          if (!(param0 instanceof FadingDialog)) {
            throw new IllegalArgumentException();
          }
          var3 = (FadingDialog) (param0);
          if (param1 != 30000) {
            field_W = 61;
          }
          this.dialogs.addLast((byte) -84, var3);
          var3.dialogOpen = true;
          var3.requestKeyboardFocus((UiWidget) (this), (byte) 66);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "lq.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_T = new int[1024];
        multiconstFriends = "Friends";
        connectionlostWithreason = "Connection lost. <%0>";
        timerMinutesSeconds = "mm:ss";
        field_W = 0;
        playerListLast = " and <%0>";
    }
}
