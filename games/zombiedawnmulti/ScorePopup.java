/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScorePopup extends SceneObject {
    static int field_N;
    static int field_O;
    static Sprite[] field_M;
    private PcmSampleStream field_R;
    static String field_G;
    static boolean field_J;
    private String field_P;
    private int field_F;
    static IntrusiveDeque field_K;
    static char field_I;
    private PcmSampleStream field_L;
    static UiComponent field_H;

    final static PcmSampleStream playLoopingSound(int param0, int param1) {
        SoundEffectInstance var2 = new SoundEffectInstance(param1);
        var2.field_m.setLoopCount(param0);
        PropObject.field_M.addFirst(var2, false);
        return var2.field_m;
    }

    final static void disconnectLobby(int param0) {
        LobbyPlayer var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          BufferedSocket.field_n = null;
          JaggrabDownloader.field_c = null;
          GrowableIntList.field_k = false;
          if (MeltdownPuddleView.field_i != null) {
            MeltdownPuddleView.field_i.clear(-30986);
            MeltdownPuddleView.field_i = null;
          }
          TextWidgetPainter.field_c = null;
          if (NetworkArchiveRequest.field_C != null) {
            NetworkArchiveRequest.field_C.clear(-30986);
            NetworkArchiveRequest.field_C = null;
          }
          MeshMaterial.field_h = null;
          if (null != PendingRankingRequest.field_g) {
            PendingRankingRequest.field_g.clear(-30986);
            PendingRankingRequest.field_g = null;
          }
          MessageMenuScreen.field_o = null;
          if (TextWidgetPainter.field_c != null) {
            var1 = (LobbyPlayer) (TextWidgetPainter.field_c.firstInTraversal((byte) 7));
            while (var1 != null) {
              var1.unlinkSecondary(param0 ^ 32692);
              var1 = (LobbyPlayer) (TextWidgetPainter.field_c.nextInTraversal((byte) 97));
            }
            TextWidgetPainter.field_c = null;
          }
          if (param0 != -28264) {
            field_M = (Sprite[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "wc.L(" + param0 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 == -66) {
          field_H = null;
          field_M = null;
          field_K = null;
          field_G = null;
          return;
        }
        ScorePopup.updateLobbyRequests(62, false);
        field_H = null;
        field_M = null;
        field_K = null;
        field_G = null;
    }

    final static void updateLobbyRequests(int param0, boolean param1) {
        int stackIn_4_0 = 0;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_2 = false;
        int stackIn_17_0 = 0;
        boolean stackIn_20_1 = false;
        boolean stackIn_21_2 = false;
        boolean stackIn_33_1 = false;
        boolean stackIn_34_2 = false;
        int stackIn_50_0 = 0;
        boolean stackIn_50_1 = false;
        boolean stackIn_53_2 = false;
        int stackIn_63_0 = 0;
        boolean stackIn_66_1 = false;
        boolean stackIn_67_2 = false;
        boolean stackIn_79_1 = false;
        boolean stackIn_80_2 = false;
        int stackIn_94_0 = 0;
        boolean stackIn_94_1 = false;
        boolean stackIn_97_2 = false;
        int stackIn_107_0 = 0;
        boolean stackIn_110_1 = false;
        boolean stackIn_111_2 = false;
        boolean stackIn_123_1 = false;
        boolean stackIn_124_2 = false;
        int stackIn_138_0 = 0;
        boolean stackIn_138_1 = false;
        boolean stackIn_141_2 = false;
        int stackIn_151_0 = 0;
        boolean stackIn_154_1 = false;
        boolean stackIn_155_2 = false;
        boolean stackIn_167_1 = false;
        boolean stackIn_168_2 = false;
        int var2;
        VerticalScrollbar.tickLobbyHighlights(2);
        if (null == JaggrabDownloader.field_c) {
          var2 = 0;
          stackIn_17_0 = 1;
          if (MenuInputState.field_b) {
            stackIn_4_0 = stackIn_17_0;
            stackIn_4_1 = true;
            stackIn_7_2 = (TickButtonPainter.field_a <= 50) ? false : true;
            FadingDialog.updateLobbyScreenWhiteText(stackIn_4_0 != 0, stackIn_4_1, stackIn_7_2, -93, param0, 0, var2 != 0, 11, 13, ByteStorage.field_d, 14, param1);
          } else {
            if (DisplayNamePanel.field_K) {
              stackIn_33_1 = true;
              stackIn_34_2 = (TickButtonPainter.field_a <= 50) ? false : true;
              FadingDialog.updateLobbyScreenWhiteText(stackIn_17_0 != 0, stackIn_33_1, stackIn_34_2, -93, param0, 0, var2 != 0, 11, 13, ByteStorage.field_d, 14, param1);
            } else {
              stackIn_20_1 = false;
              stackIn_21_2 = (TickButtonPainter.field_a <= 50) ? false : true;
              FadingDialog.updateLobbyScreenWhiteText(stackIn_17_0 != 0, stackIn_20_1, stackIn_21_2, -93, param0, 0, var2 != 0, 11, 13, ByteStorage.field_d, 14, param1);
            }
          }
        } else {
          if (JaggrabDownloader.field_c.field_cc == 2) {
            var2 = 1;
            stackIn_151_0 = 1;
            if (MenuInputState.field_b) {
              stackIn_138_0 = stackIn_151_0;
              stackIn_138_1 = true;
              stackIn_141_2 = (TickButtonPainter.field_a <= 50) ? false : true;
              FadingDialog.updateLobbyScreenWhiteText(stackIn_138_0 != 0, stackIn_138_1, stackIn_141_2, -93, param0, 0, var2 != 0, 11, 13, ByteStorage.field_d, 14, param1);
            } else {
              if (DisplayNamePanel.field_K) {
                stackIn_167_1 = true;
                stackIn_168_2 = (TickButtonPainter.field_a <= 50) ? false : true;
                FadingDialog.updateLobbyScreenWhiteText(stackIn_151_0 != 0, stackIn_167_1, stackIn_168_2, -93, param0, 0, var2 != 0, 11, 13, ByteStorage.field_d, 14, param1);
              } else {
                stackIn_154_1 = false;
                stackIn_155_2 = (TickButtonPainter.field_a <= 50) ? false : true;
                FadingDialog.updateLobbyScreenWhiteText(stackIn_151_0 != 0, stackIn_154_1, stackIn_155_2, -93, param0, 0, var2 != 0, 11, 13, ByteStorage.field_d, 14, param1);
              }
            }
            if (UiWidget.field_r) {
              TextValidationFailure.field_a.writeCipheredOpcode((byte) -35, 57);
              UiWidget.field_r = false;
            }
            if (ValidationIconWidget.field_N) {
              TextValidationFailure.field_a.writeCipheredOpcode((byte) -35, 10);
              ValidationIconWidget.field_N = false;
            }
            if (EffectAudioHelpers.field_f) {
              TextPopupHelpers.openTextPopup(1, ArrayWidgetGroup.field_I, true, (byte) 93, ClockAndScreenHelpers.field_e);
              EffectAudioHelpers.field_f = false;
            }
            return;
          }
          if (JaggrabDownloader.field_c.field_cc == 4) {
            var2 = 1;
            stackIn_107_0 = 1;
            if (MenuInputState.field_b) {
              stackIn_94_0 = stackIn_107_0;
              stackIn_94_1 = true;
              stackIn_97_2 = (TickButtonPainter.field_a <= 50) ? false : true;
              FadingDialog.updateLobbyScreenWhiteText(stackIn_94_0 != 0, stackIn_94_1, stackIn_97_2, -93, param0, 0, var2 != 0, 11, 13, ByteStorage.field_d, 14, param1);
            } else {
              if (DisplayNamePanel.field_K) {
                stackIn_123_1 = true;
                stackIn_124_2 = (TickButtonPainter.field_a <= 50) ? false : true;
                FadingDialog.updateLobbyScreenWhiteText(stackIn_107_0 != 0, stackIn_123_1, stackIn_124_2, -93, param0, 0, var2 != 0, 11, 13, ByteStorage.field_d, 14, param1);
              } else {
                stackIn_110_1 = false;
                stackIn_111_2 = (TickButtonPainter.field_a <= 50) ? false : true;
                FadingDialog.updateLobbyScreenWhiteText(stackIn_107_0 != 0, stackIn_110_1, stackIn_111_2, -93, param0, 0, var2 != 0, 11, 13, ByteStorage.field_d, 14, param1);
              }
            }
          } else {
            var2 = 0;
            stackIn_63_0 = 1;
            if (MenuInputState.field_b) {
              stackIn_50_0 = stackIn_63_0;
              stackIn_50_1 = true;
              stackIn_53_2 = (TickButtonPainter.field_a <= 50) ? false : true;
              FadingDialog.updateLobbyScreenWhiteText(stackIn_50_0 != 0, stackIn_50_1, stackIn_53_2, -93, param0, 0, var2 != 0, 11, 13, ByteStorage.field_d, 14, param1);
            } else {
              if (DisplayNamePanel.field_K) {
                stackIn_79_1 = true;
                stackIn_80_2 = (TickButtonPainter.field_a <= 50) ? false : true;
                FadingDialog.updateLobbyScreenWhiteText(stackIn_63_0 != 0, stackIn_79_1, stackIn_80_2, -93, param0, 0, var2 != 0, 11, 13, ByteStorage.field_d, 14, param1);
              } else {
                stackIn_66_1 = false;
                stackIn_67_2 = (TickButtonPainter.field_a <= 50) ? false : true;
                FadingDialog.updateLobbyScreenWhiteText(stackIn_63_0 != 0, stackIn_66_1, stackIn_67_2, -93, param0, 0, var2 != 0, 11, 13, ByteStorage.field_d, 14, param1);
              }
            }
          }
        }
        if (UiWidget.field_r) {
          TextValidationFailure.field_a.writeCipheredOpcode((byte) -35, 57);
          UiWidget.field_r = false;
        }
        if (ValidationIconWidget.field_N) {
          TextValidationFailure.field_a.writeCipheredOpcode((byte) -35, 10);
          ValidationIconWidget.field_N = false;
        }
        if (EffectAudioHelpers.field_f) {
          TextPopupHelpers.openTextPopup(1, ArrayWidgetGroup.field_I, true, (byte) 93, ClockAndScreenHelpers.field_e);
          EffectAudioHelpers.field_f = false;
        }
    }

    final void tick(byte param0) {
        if (param0 >= -79) {
          ScorePopup.updateLobbyRequests(8, false);
          if (0 >= this.field_F) {
            this.unlink(true);
            return;
          }
          this.field_F = this.field_F - 7;
          this.positionY = this.positionY - 131072;
          if (0 > this.field_F) {
            this.field_F = 0;
            return;
          }
          return;
        }
        if (0 >= this.field_F) {
          this.unlink(true);
          return;
        }
        this.field_F = this.field_F - 7;
        this.positionY = this.positionY - 131072;
        if (0 > this.field_F) {
          this.field_F = 0;
          return;
        }
    }

    final void draw(int param0, Camera param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param1.worldToScreenX(this.getX(param0 ^ -10199), -20126);
          var4 = param1.worldToScreenY(this.getY(-109), 116);
          TranslatedUiText.field_e.drawCenteredAlpha(this.field_P, var3_int, var4, 3, -1, this.field_F);
          if (null != this.field_R) {
            if (this.field_R.isSamplePositionOutOfRange()) {
              this.field_R = null;
              this.field_L = null;
            } else {
              var5 = DropTargetWidget.computeScreenVolume(125, var4, var3_int);
              this.field_R.setVolume(var5);
              if (this.field_L != null) {
                this.field_L.setVolume(var5);
              }
            }
          }
          if (param0 != -10136) {
            field_H = (UiComponent) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("wc.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static boolean isGuestSession(int param0) {
        if (param0 <= 88) {
          return false;
        }
        return ZombieDrop.field_N;
    }

    ScorePopup(int param0, int param1, int param2, boolean param3) {
        super(param0, param1, 0);
        this.field_R = null;
        this.field_L = null;
        this.field_P = Integer.toString(param2);
        this.field_F = 255;
        if (!param3) {
          this.field_R = Camera.createMixerStream(-128, 55);
        }
    }

    static {
        field_J = false;
        field_I = '/';
        field_K = null;
        field_G = "achievements to collect";
        field_O = 131072;
    }
}
