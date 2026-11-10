/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class FullscreenErrorDialog extends ResizableDialog implements ButtonActionListener {
    static MenuSelection field_W;
    static String field_U;
    static Sprite field_T;
    static float field_V;
    static boolean[] field_X;
    private TextButton field_Z;
    static boolean field_Y;

    private final void hideFullscreenError(boolean param0) {
        if (!this.field_H) {
          return;
        }
        if (!param0) {
          field_T = (Sprite) null;
          this.field_H = false;
          return;
        }
        this.field_H = false;
    }

    final static void queueProgressRecord(AchievementSubmission param0, byte param1, int param2) {
        try {
          RankingRowHelpers.field_g.addFirst(0, param0);
          SecondaryNodeDequeIterator.writeProgressRecord(param2, true, param0);
          if (param1 != 7) {
            field_V = -1.3851797580718994f;
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "i.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final TextButton appendButton(byte param0, WidgetListener param1, String param2) {
        TextButton var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        TextButton stackIn_2_0 = null;
        TextButton stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new TextButton(param2, param1);
          var4.field_h = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
          if (param0 != 53) {
            stackIn_2_0 = (TextButton) null;
            return stackIn_2_0;
          }
          var5 = -6 + this.field_n;
          this.field_n = this.field_n + 38;
          var4.setBounds(param0 ^ -109, var5, 15, this.field_i - 14 - 16, 30);
          this.addChild(var4, 10);
          this.reapplyBounds(true);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("i.FA(").append(param0).append(',');
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
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void onButtonActivated(int param0, int param1, TextButton param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_Z == param2) {
            this.hideFullscreenError(true);
          }
          if (param1 == -6) {
            return;
          }
          field_X = (boolean[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("i.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    FullscreenErrorDialog(DialogLayer param0, FullscreenErrorReason param1) {
        super(param0, 200, 150);
        Object var3 = null;
        UiWidget var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (param1 != AgeValidator.field_f) {
            if (LoginAndPacketHelpers.field_b != param1) {
              if (PendingRecordRequest.field_h == param1) {
                var3 = AppletHostHelpers.field_c;
                this.field_n = this.field_n + 30;
              }
            } else {
              var3 = TutorialTipHelpers.field_a;
              this.field_n = this.field_n + 10;
              if (GlassShard.hasPendingResize((byte) 126)) {
                this.field_n = this.field_n + 20;
                var3 = FullscreenFocusText.field_a;
              }
            }
          } else {
            var3 = SavedDataRequest.field_n;
          }
          var4 = new UiWidget((String) (var3), (WidgetListener) null);
          var4.field_k = 0;
          var4.field_i = this.field_i;
          var4.field_n = 80;
          var4.field_j = 50;
          var4.field_h = (WidgetPainter) ((Object) new TextWidgetPainter(SecondaryNodeDeque.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild(var4, 10);
          this.field_Z = this.appendButton((byte) 53, (WidgetListener) (this), FullscreenExitHelpers.field_c);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("i.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static boolean pollGameSocketConnection(boolean param0, boolean param1) {
        try {
          long dupTemp$1 = 0L;
          IOException var2 = null;
          BitPacketBuffer var4 = null;
          BitPacketBuffer var5 = null;
          int stackIn_12_0 = 0;
          Throwable decompiledCaughtException = null;
          if (ScorePopup.field_F == null) {
            ScorePopup.field_F = PasswordFieldPainter.field_B.connectSocket(2, SoundEffectNode.field_o, GzipDecompressor.field_c);
          }
          if (ScorePopup.field_F.status == 0) {
            return false;
          }
          dupTemp$1 = MonotonicClock.monotonicTimeMillis(-22826);
          HotspotTextWidget.field_N = dupTemp$1;
          ImageProducerRasterBuffer.field_i = dupTemp$1;
          if (!param1) {
            field_X = (boolean[]) null;
          }
          if (1 != ScorePopup.field_F.status) {
            ValidatedTextWidget.field_T = HighscoreRequest.field_l;
          } else {
            try {
              LoginMethod.field_c = new BufferedSocket((java.net.Socket) (ScorePopup.field_F.result), PasswordFieldPainter.field_B);
              var4 = MatchingTextValidator.field_g;
              var5 = var4;
              LinkTextPainter.field_e.position = 0;
              stackIn_12_0 = (!param0) ? -1 : -2;
              Scrollbar.field_U = stackIn_12_0;
              FunOrbApplet.field_t = stackIn_12_0;
              MessageDialogContent.field_P = stackIn_12_0;
              ValidatedTextWidget.field_T = AudioMixerHelpers.field_g;
              var5.position = 0;
              RankingQueryWriter.writeRankingQuery(IntrusiveNode.field_g, Bzip2State.field_b, (byte) -114, LinkTextPainter.field_e, PasswordValidator.field_k);
              CheckboxPainter.flushOutgoingPackets((byte) -46, -1);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              ValidatedTextWidget.field_T = HighscoreRequest.field_l;
              ScorePopup.field_F = null;
              return true;
            }
          }
          ScorePopup.field_F = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 == 10) {
          field_X = null;
          field_W = null;
          field_U = null;
          field_T = null;
          return;
        }
        FullscreenErrorDialog.releaseStatics(34);
        field_X = null;
        field_W = null;
        field_U = null;
        field_T = null;
    }

    final static void playMusicTrack(int param0, boolean param1, byte param2, MusicTrack param3) {
        Object var4 = null;
        Throwable var5 = null;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (null != ScreechEffect.field_p) {
            ArchiveRequest.switchMusicTrack(param3, (byte) 113, param0, 1048576, param1);
          }
          if (param2 > -110) {
            FullscreenErrorDialog.releaseStatics(11);
          }
          if (PowerupBar.field_o == null) {
            return;
          }
          var4 = ExceptionWrapper.field_d;
          synchronized (var4) {
            PowerupBar.field_o.setChannelVolume(param0, true, -1);
            if (Alien.field_kb == param3) {
              return;
            }
            PowerupBar.field_o.stop(28013);
            ExceptionWrapper.field_d.flushDeviceSafely();
            Alien.field_kb = param3;
            if (Alien.field_kb != null) {
              PowerupBar.field_o.playTrack((byte) -22, Alien.field_kb, param1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("i.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) (stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_T = null;
        field_X = new boolean[64];
        field_W = new MenuSelection(1);
        field_Y = true;
    }
}
