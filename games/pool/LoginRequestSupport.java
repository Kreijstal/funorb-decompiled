/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginRequestSupport {
    static String fsUnavailable;
    static UiComponent field_e;
    static String[] hsModeName;
    static int[] field_d;
    static BufferedFile field_a;
    static String[] field_c;

    public static void releaseStatics(int param0) {
        hsModeName = null;
        field_d = null;
        fsUnavailable = null;
        field_e = null;
        if (param0 <= 98) {
          return;
        }
        field_a = null;
        field_c = null;
    }

    final static int pollAccountCreationRequest(String param0, byte param1, int param2, boolean param3, LoginTextValue param4, LoginTextValue param5, int param6) {
        int var12 = 0;
        int stackIn_4_0 = 0;
        PacketBuffer stackIn_17_0 = null;
        boolean stackIn_17_1 = false;
        String stackIn_18_2 = null;
        PacketBuffer stackIn_20_0 = null;
        boolean stackIn_20_1 = false;
        String stackIn_21_2 = null;
        int stackIn_33_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        String var13 = null;
        CharSequence var14 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        try {
          var13 = param4.getText((byte) 104);
          var8 = param5.getText((byte) 104);
          if (null == Atan2Support.field_c &&
            !CollisionContact.a((byte) 65, false)) {
            stackIn_4_0 = -1;
            return stackIn_4_0;
          }
          if (Js5Transport.field_h == RankingsScreen.field_J) {
            JaggrabDownloader.field_j.position = 0;
            AchievementNotice.field_q = null;
            if (param0 == null) {
              FontPaletteSupport.field_b.position = 0;
              FontPaletteSupport.field_b.writeInt(true, ValidationIconWidget.field_P.nextInt());
              FontPaletteSupport.field_b.writeInt(true, ValidationIconWidget.field_P.nextInt());
              stackIn_17_0 = FontPaletteSupport.field_b;
              stackIn_17_1 = false;
              if (param4.isIncludedInLookupRequest(true)) {
                stackIn_18_2 = var13;
              } else {
                stackIn_18_2 = "";
              }
              ((PacketBuffer) (Object) stackIn_17_0).writeNullCircumfixedString(stackIn_17_1, stackIn_18_2);
              stackIn_20_0 = FontPaletteSupport.field_b;
              stackIn_20_1 = false;
              if (!param5.isIncludedInLookupRequest(true)) {
                stackIn_21_2 = "";
              } else {
                stackIn_21_2 = var8;
              }
              ((PacketBuffer) (Object) stackIn_20_0).writeNullCircumfixedString(stackIn_20_1, stackIn_21_2);
              JaggrabDownloader.field_j.writeByte(16, false);
              JaggrabDownloader.field_j.position = JaggrabDownloader.field_j.position + 1;
              var9 = JaggrabDownloader.field_j.position;
              ArchiveIndex.writeEncryptedBuffer((byte) 93, ArchiveLoadSequence.field_l, FontPaletteSupport.field_b, UiWidget.field_q, JaggrabDownloader.field_j);
              JaggrabDownloader.field_j.writeByteLengthPrefix(-var9 + JaggrabDownloader.field_j.position, true);
            } else {
              var9 = 0;
              if (param3) {
                var9 = var9 | 1;
              }
              FontPaletteSupport.field_b.position = 0;
              FontPaletteSupport.field_b.writeInt(true, ValidationIconWidget.field_P.nextInt());
              FontPaletteSupport.field_b.writeInt(true, ValidationIconWidget.field_P.nextInt());
              FontPaletteSupport.field_b.writeNullCircumfixedString(false, var13);
              FontPaletteSupport.field_b.writeNullCircumfixedString(false, var8);
              var14 = (CharSequence) ((Object) param0);
              FontPaletteSupport.field_b.writeNullCircumfixedString(false, DelegatingCanvas.normalizeUsername(-28, var14));
              FontPaletteSupport.field_b.writeShort((byte) -81, param2);
              FontPaletteSupport.field_b.writeByte(param6, false);
              FontPaletteSupport.field_b.writeByte(var9, false);
              JaggrabDownloader.field_j.writeByte(18, false);
              JaggrabDownloader.field_j.position = JaggrabDownloader.field_j.position + 2;
              var10 = JaggrabDownloader.field_j.position;
              var11_ref_String = DateInputWidget.readSettingsCookie(NanoTickClock.getApplet(79), (byte) 112);
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              JaggrabDownloader.field_j.writeNullTerminatedString(-9946, var11_ref_String);
              ArchiveIndex.writeEncryptedBuffer((byte) 93, ArchiveLoadSequence.field_l, FontPaletteSupport.field_b, UiWidget.field_q, JaggrabDownloader.field_j);
              JaggrabDownloader.field_j.writeShortLengthPrefix(-var10 + JaggrabDownloader.field_j.position, (byte) -92);
            }
            DebugTuningSupport.flushClientPackets(-1, 0);
            RankingsScreen.field_J = LogoFinalFrameLoader.field_a;
          }
          if (RankingsScreen.field_J == LogoFinalFrameLoader.field_a &&
            DialogLayer.b((byte) 118, 1)) {
            var9Lifetime1 = PlayerContextMenu.field_e.readUnsignedByte(-80);
            PlayerContextMenu.field_e.position = 0;
            if (var9Lifetime1 >= 100 &&
              105 >= var9Lifetime1) {
              LoginPayloadFactory.field_b = new String[-100 + var9Lifetime1];
              RankingsScreen.field_J = TutorialSelectScreen.field_L;
            } else {
              if (var9Lifetime1 == 248) {
                PotEvent.setTuhstatbutCookie(16, NanoTickClock.getApplet(71));
                LoginTextValue.field_g = FadingDialog.createUnable;
                ShotEvent.closeClientSocket(-70);
                ArchiveLoadStep.field_e = false;
                stackIn_33_0 = var9Lifetime1;
                return stackIn_33_0;
              }
              if (99 == var9Lifetime1) {
                DialogLayer.b((byte) 63, WhirlpoolHasher.constantOne(0));
                AchievementNotice.field_q = new Boolean(DebugTuningSupport.readBoolean((byte) 104, PlayerContextMenu.field_e));
                PlayerContextMenu.field_e.position = 0;
              } else {
                RankingsScreen.field_J = HighScoreRequest.field_l;
                Bzip2DecoderState.field_c = var9Lifetime1;
                ScrollPane.field_Pb = -1;
              }
            }
          }
          if (RankingsScreen.field_J == TutorialSelectScreen.field_L) {
            var9Lifetime2 = 2;
            if (DialogLayer.b((byte) 44, var9Lifetime2)) {
              var10Lifetime1 = PlayerContextMenu.field_e.readUnsignedShort(-1034);
              PlayerContextMenu.field_e.position = 0;
              if (DialogLayer.b((byte) 49, var10Lifetime1)) {
                var11 = LoginPayloadFactory.field_b.length;
                for (var12 = 0; var11 > var12; var12++) {
                  LoginPayloadFactory.field_b[var12] = PlayerContextMenu.field_e.readString(10762);
                }
                ShotEvent.closeClientSocket(53);
                ArchiveLoadStep.field_e = false;
                stackIn_43_0 = var11 + 100;
                return stackIn_43_0;
              }
            }
          }
          if (RankingsScreen.field_J == HighScoreRequest.field_l &&
            PacketAvailabilitySupport.hasCompletePacket((byte) 39)) {
            if (Bzip2DecoderState.field_c != 255) {
              LoginTextValue.field_g = PlayerContextMenu.field_e.readNullTerminatedString(-122);
            } else {
              var9_ref_String = PlayerContextMenu.field_e.readNullableString(110);
              if (var9_ref_String != null) {
                WeightedLruCache.writeSettingsCookie(NanoTickClock.getApplet(86), -128, var9_ref_String);
              }
            }
            ShotEvent.closeClientSocket(55);
            ArchiveLoadStep.field_e = false;
            stackIn_53_0 = Bzip2DecoderState.field_c;
            return stackIn_53_0;
          }
          if (param1 <= 38) {
            LoginRequestSupport.releaseStatics(-57);
          }
          if (null == Atan2Support.field_c) {
            if (ArchiveLoadStep.field_e) {
              if (CushionSegment.millisSinceNetworkActivity((byte) 123) <= 30000L) {
                LoginTextValue.field_g = DialWidget.loginm2;
              } else {
                LoginTextValue.field_g = TabbedPane.loginm3;
              }
              ArchiveLoadStep.field_e = false;
              stackIn_62_0 = 249;
              return stackIn_62_0;
            }
            var9Lifetime3 = TextLineLayout.field_d;
            TextLineLayout.field_d = TutorialFactory.field_a;
            ArchiveLoadStep.field_e = true;
            TutorialFactory.field_a = var9Lifetime3;
          }
          stackIn_65_0 = -1;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_68_0 = var7;
          stackIn_68_1 = new StringBuilder().append("ih.B(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param5 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void rotateBallPreview(byte obfuscationGuard) {
        Quaternion var1 = new Quaternion();
        var1.setFromAxisAngle(86, 0, 0, 65536, 64);
        if (obfuscationGuard != 46) {
          LoginTextValue var2 = (LoginTextValue) null;
          LoginRequestSupport.pollAccountCreationRequest((String) null, (byte) -72, 28, true, (LoginTextValue) null, (LoginTextValue) null, 104);
        }
        var1.normalise(true);
        AppletUrlSupport.field_e.multiplyBy(obfuscationGuard ^ 45, var1);
    }

    static {
        fsUnavailable = "Unfortunately your configuration doesn't support fullscreen mode.";
        hsModeName = new String[]{"All scores", "My scores", "Best each"};
        field_c = new String[16];
    }
}
