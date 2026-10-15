/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RankingsRequest extends IntrusiveNode {
    String[][] namesBySort;
    int rowLimit;
    static String field_i;
    int localRating;
    static String field_q;
    int localWins;
    boolean complete;
    static int tickTimeCursor;
    int localLosses;
    int[][] statisticsBySort;
    static RgbSprite field_o;
    static int gameSettingCount;
    int rankingKind;
    int localDraws;

    public static void a(byte param0) {
        field_q = null;
        field_o = null;
        if (param0 > -52) {
          return;
        }
        field_i = null;
    }

    final static char decodeCp1252Byte(byte obfuscationGuard, byte value) {
        int extensionCharacter = 0;
        int unsignedValue = 255 & value;
        if (obfuscationGuard >= 0) {
          return '￪';
        }
        if (0 == unsignedValue) {
          throw new IllegalArgumentException("" + Integer.toString(unsignedValue, 16));
        }
        if (unsignedValue < 128) {
          return (char)unsignedValue;
        }
        if (unsignedValue < 160) {
          extensionCharacter = ParisBackground.cp1252Extensions[-128 + unsignedValue];
          if (extensionCharacter == 0) {
            extensionCharacter = 63;
          }
          unsignedValue = extensionCharacter;
          return (char)unsignedValue;
        }
        return (char)unsignedValue;
    }

    final static void a(boolean param0, byte param1) {
        LevelSequence var3;
        if (param1 < -118) {
          if (null != WidgetTextLayout.field_e) {
            DelayedPacket.a(false, WidgetTextLayout.field_e);
          }
          if (GameRenderAudioHelpers.contextActions != null) {
            GameRenderAudioHelpers.contextActions.drawContextMenu((byte) -126, param0);
          }
          MembershipBenefitsScreen.a(param0, false);
          if (null != CircleBody.reportAbuseDialog) {
            CircleBody.reportAbuseDialog.drawRoot(true, param0);
          }
          WidgetTheme.a(param0, true);
          return;
        }
        var3 = (LevelSequence) null;
        RankingsRequest.a(103, true, 42, (LevelSequence) null);
        if (null != WidgetTextLayout.field_e) {
          DelayedPacket.a(false, WidgetTextLayout.field_e);
        }
        if (GameRenderAudioHelpers.contextActions != null) {
          GameRenderAudioHelpers.contextActions.drawContextMenu((byte) -126, param0);
        }
        MembershipBenefitsScreen.a(param0, false);
        if (null != CircleBody.reportAbuseDialog) {
          CircleBody.reportAbuseDialog.drawRoot(true, param0);
        }
        WidgetTheme.a(param0, true);
        return;
    }

    final static void a(int param0, boolean param1, int param2, LevelSequence param3) {
        String[] array$0 = null;
        String[] var5 = null;
        String[] stackIn_2_0 = null;
        String[] stackIn_2_1 = null;
        int stackIn_2_2 = 0;
        String stackIn_3_3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          array$0 = new String[1];
          stackIn_2_0 = array$0;
          stackIn_2_1 = array$0;
          stackIn_2_2 = 0;
          if (LoadingProgressDialog.field_cb == null) {
            stackIn_3_3 = we.field_c;
          } else {
            stackIn_3_3 = LoadingProgressDialog.field_cb;
          }
          stackIn_2_1[stackIn_2_2] = stackIn_3_3;
          var5 = stackIn_2_0;
          DelegatingCanvas.field_c = 13;
          OptionsScreen.resultCounterOne = 57;
          QuickChatMenu.field_Wb = 3;
          WidgetTextLayout.resultCounterTwo = 23;
          DisplayModeInfo.field_e = 51550 + (ButtonWidgetRenderer.field_w.nextInt(92) << 16);
          OutgoingPacketHelpers.field_g = 11;
          qm.field_a = 40;
          FullscreenFailureDialog.field_kb = 72;
          DiagnosticTextLine.a((byte) 66);
          TextFieldRenderer.field_A = WidgetPaintStyle.field_a;
          if (!TextFieldRenderer.field_A) {
            hd.a(true);
            BitPacketBuffer.field_q = jj.field_d;
          } else {
            if (param3.pack.packId != 0) {
              hd.a(true);
              BitPacketBuffer.field_q = jj.field_d;
            } else {
              if (param2 > 0) {
                hd.a(true);
                BitPacketBuffer.field_q = jj.field_d;
              }
            }
          }
          if (param0 != 16727) {
            tickTimeCursor = 49;
          }
          TabbedPane.currentBackground = GamePresentationHelpers.selectBackground(param3.pack.metadata[param2].attributeByte, (byte) 19);
          OpacityWidget.startLocalGame(var5, param2, param3, 1, param1, -12665);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("cq.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    RankingsRequest() {
    }

    static {
        field_q = "Kick <%0> from this game";
        field_i = "Names can only contain letters, numbers, spaces and underscores";
    }
}
