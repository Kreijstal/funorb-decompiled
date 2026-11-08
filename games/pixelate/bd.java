/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static Sprite field_a;
    static int field_c;
    static java.applet.Applet field_b;

    public static void releaseStatics(int param0) {
        field_b = null;
        field_a = null;
        if (param0 == 70) {
          return;
        }
        bd.a((byte) -62, false, -83, 24);
    }

    final static void a(byte param0, boolean param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        SceneWidget var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        aa var9 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          if (MatchingTextValidator.field_o != ClientException.field_f.field_i) {
            wa.field_i = wa.field_i + (ClientException.field_f.field_i - MatchingTextValidator.field_o);
            MatchingTextValidator.field_o = ClientException.field_f.field_i;
          }
          if (param0 > -50) {
            return;
          }
          if (HuffmanCodec.field_b < qh.field_c) {
            HuffmanCodec.field_b = HuffmanCodec.field_b + 1;
          }
          if (HuffmanCodec.field_b <= 0) {
            return;
          }
          r.b(-96);
          ui.field_i.updateInputFullScreen(-28476, param1);
          if (td.field_b != null) {
            if (!ln.field_q) {
              td.field_b = null;
            } else {
              td.field_b.handlePointerEvents(ui.field_i.screenY, param1, (byte) 99, ui.field_i.field_tb);
            }
          }
          for (var4_int = 0; 5 > var4_int; var4_int++) {
            var5 = ResourceArchive.field_f[var4_int];
            if (var5 != null) {
              if (var5.field_P != 0) {
                DiskCacheRequest.openChatFilterMenu((byte) -13, var5, var4_int);
              }
              var6 = IterableNodeHashTable.getChatFilterMode(var4_int, 0);
              ResourceArchive.field_h[var4_int].field_H = Checkbox.field_V[var6];
              DelegatingCanvas.field_e[var4_int].field_cb = LoginCredentials.field_a[var6];
            }
          }
          if (0 != GradientOutlineTextPainter.field_u.field_P) {
            AccountTermsPanel.field_M = new ReportAbuseDialog(GradientOutlineTextPainter.field_u.field_tb, GradientOutlineTextPainter.field_u.screenY, GradientOutlineTextPainter.field_u.field_K, GradientOutlineTextPainter.field_u.height, param3, cm.field_o, ScorePopup.field_i, Vector3.field_f, TextFieldValidator.field_h, um.field_q, dn.field_c, (String) null, 0L);
          }
          var9 = CacheReference.rebuildChatHistoryWidgets((byte) -110, fq.field_q, param2, MouseWheelHandler.field_c);
          if (var9 != null) {
            fj.a(var9, (byte) 125);
          }
          var8 = pk.buildChatInputPrompt((byte) 88);
          if (var8 == null) {
            return;
          }
          PuzzleThumbnail.field_o = var8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var4), "bd.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          field_a = (Sprite) null;
          if (hf.field_q < 20) {
            return true;
          }
          if (!LoadingStepTracker.isLobbyUiReady(106)) {
            return true;
          }
          if (ra.field_g <= 0) {
            return false;
          }
          if (!ri.alwaysTrue(-81)) {
            return true;
          }
          return false;
        }
        if (hf.field_q < 20) {
          return true;
        }
        if (!LoadingStepTracker.isLobbyUiReady(106)) {
          return true;
        }
        if (ra.field_g <= 0) {
          return false;
        }
        if (!ri.alwaysTrue(-81)) {
          return true;
        }
        return false;
    }

    final boolean b(int param0) {
        if (param0 != -21) {
          return true;
        }
        if (BoardView.field_b == this) {
          return true;
        }
        if (e.field_d == this) {
          return true;
        }
        if (Pixelate.field_G != this) {
          return false;
        }
        return true;
    }

    final static void a(byte param0) {
        DualLinkNode var1 = null;
        int var2 = Pixelate.field_H ? 1 : 0;
        DualLinkNode var1Lifetime1;
        try {
          ReflectionCheckRequest.field_t = 0;
          DialWidgetPainter.field_q = 0;
          LabeledField.field_L = null;
          if (param0 != -1) {
            field_c = 75;
          }
          VerticalScrollbar.field_Hb.clear(param0 - 110);
          bq.field_b.clear(-127);
          var1 = vm.field_b.first(-89);
          while (var1 != null) {
            var1.unlinkSecondary(17);
            var1 = vm.field_b.next((byte) 50);
          }
          var1Lifetime1 = GameResultsScreen.field_q.first(-84);
          while (var1Lifetime1 != null) {
            var1Lifetime1.unlinkSecondary(17);
            var1Lifetime1 = GameResultsScreen.field_q.next((byte) 50);
          }
          ValidatedTextWidget.field_db = 0;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "bd.A(" + param0 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = new Sprite(270, 70);
    }
}
