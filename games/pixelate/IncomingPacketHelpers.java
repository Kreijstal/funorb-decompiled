/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IncomingPacketHelpers {
    static Sprite field_a;
    static String field_b;
    static ScoreMarkerDemo field_c;

    public static void releaseStatics(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != -31476) {
          field_a = (Sprite) null;
        }
    }

    final static boolean pollIncomingPacket(boolean param0, int[] param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        LaggedPacket var4_ref_ug = null;
        int var4 = 0;
        LaggedPacket var5 = null;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          if (Pixelate.field_G != GameModeSelectScreen.field_s) {
            return false;
          }
          if (!param0) {
            field_c = (ScoreMarkerDemo) null;
          }
          var2_long = ClockHelpers.monotonicMillis(64);
          if (0 != BlankScreen.field_s &&
            0 > AudioService.field_c) {
            var4_ref_ug = (LaggedPacket) (AccountRequestReply.field_d.first(1504642273));
            if (var4_ref_ug != null &&
              var2_long > var4_ref_ug.field_o) {
              var4_ref_ug.unlink(2779);
              BackgroundScene.field_b = var4_ref_ug.field_r.length;
              MusicCrossfadeStream.field_o.position = 0;
              for (var5_int = 0; BackgroundScene.field_b > var5_int; var5_int++) {
                MusicCrossfadeStream.field_o.payload[var5_int] = var4_ref_ug.field_r[var5_int];
              }
              BirthDateEntryPanel.field_G = ReportAbuseHelpers.field_d;
              ReportAbuseHelpers.field_d = MarkerSlider.field_U;
              MarkerSlider.field_U = TextLayoutLine.field_e;
              TextLayoutLine.field_e = var4_ref_ug.field_m;
              return true;
            }
          }
          while (true) {
            if (AudioService.field_c < 0) {
              MusicCrossfadeStream.field_o.position = 0;
              if (!QueuedInput.fillIncomingBuffer(1, false)) {
                return false;
              }
              AudioService.field_c = MusicCrossfadeStream.field_o.readOpcode((byte) 114);
              MusicCrossfadeStream.field_o.position = 0;
              BackgroundScene.field_b = param1[AudioService.field_c];
            }
            if (!MusicPatchNode.readPacketHeader(-18481)) {
              return false;
            }
            if (0 == BlankScreen.field_s) {
              BirthDateEntryPanel.field_G = ReportAbuseHelpers.field_d;
              ReportAbuseHelpers.field_d = MarkerSlider.field_U;
              MarkerSlider.field_U = TextLayoutLine.field_e;
              TextLayoutLine.field_e = AudioService.field_c;
              AudioService.field_c = -1;
              return true;
            }
            var4 = BlankScreen.field_s;
            if (NanoTickClock.field_h != 0.0) {
              var4 = (int)((double)var4 + Bzip2State.field_d.nextGaussian() * NanoTickClock.field_h);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new LaggedPacket(var2_long + (long)var4, AudioService.field_c, new byte[BackgroundScene.field_b]);
            for (var6 = 0; var6 < BackgroundScene.field_b; var6++) {
              var5.field_r[var6] = MusicCrossfadeStream.field_o.payload[var6];
            }
            AccountRequestReply.field_d.addLast(22125, var5);
            AudioService.field_c = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("jf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final static String requestAddFriend(String param0, int param1, byte param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        CipherPacketBuffer var5 = null;
        CharSequence var6 = null;
        try {
          var6 = (CharSequence) ((Object) param0);
          if (!Bzip2State.isValidPlayerName((byte) -126, var6)) {
            stackIn_3_0 = PatchNoteUsage.field_n;
            return stackIn_3_0;
          }
          if (ValidatedTextWidget.field_db != 2) {
            stackIn_6_0 = Bzip2State.field_C;
            return stackIn_6_0;
          }
          if (QueuedLobbyRequest.isLocalPlayerName(param0, -1)) {
            stackIn_9_0 = GrowableIntList.field_h;
            return stackIn_9_0;
          }
          if (CanvasRasterBuffer.isFriendName(param0, (byte) 37)) {
            stackIn_13_0 = AlphaContainer.formatTemplate(BufferedSocket.field_b, 34, new String[]{param0});
            return stackIn_13_0;
          }
          if (DialWidgetPainter.field_q >= 100 &&
            BufferedRandomAccessFile.field_j <= 0) {
            stackIn_18_0 = MarkerSlider.field_Q;
            return stackIn_18_0;
          }
          if (param2 < 57) {
            field_c = (ScoreMarkerDemo) null;
          }
          if (DialWidgetPainter.field_q >= 200) {
            stackIn_24_0 = MarkerSlider.field_Q;
            return stackIn_24_0;
          }
          if (ImageProducerRasterBuffer.isFriend(-640, param0)) {
            stackIn_27_0 = AlphaContainer.formatTemplate(EmergentBehaviourBackground.field_r, 85, new String[]{param0});
            return stackIn_27_0;
          }
          var5 = ChatMessage.field_f;
          var5.writeOpcode(param1, 15514);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(160, 0);
          var5.writeString((byte) -41, param0);
          var5.backpatchByteLength(-var4 + var5.position, -1);
          stackIn_29_0 = null;
          return (String) (stackIn_29_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("jf.C(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static EmailValidationState validateEmailDomain(String param0, int param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        EmailValidationState var7 = null;
        int var8 = 0;
        EmailValidationState stackIn_4_0 = null;
        EmailValidationState stackIn_7_0 = null;
        EmailValidationState stackIn_10_0 = null;
        EmailValidationState stackIn_13_0 = null;
        EmailValidationState stackIn_19_0 = null;
        EmailValidationState stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          var2_int = param0.length();
          if (0 == var2_int) {
            stackIn_4_0 = ScrollPaneWithFooter.field_Kb;
            return stackIn_4_0;
          }
          if (var2_int > 255) {
            stackIn_7_0 = FullscreenFocusCanvas.field_a;
            return stackIn_7_0;
          }
          var3 = Puzzle.split(param0, (byte) -96, '.');
          if (2 > var3.length) {
            stackIn_10_0 = ScrollPaneWithFooter.field_Kb;
            return stackIn_10_0;
          }
          var4 = var3;
          if (param1 != -4384) {
            stackIn_13_0 = (EmailValidationState) null;
            return stackIn_13_0;
          }
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = IndexedSpriteState.validateEmailLabel(var6, (byte) 120);
            if (var7 != null) {
              stackIn_19_0 = var7;
              return stackIn_19_0;
            }
          }
          stackIn_22_0 = BufferedRandomAccessFile.classifyNumericLabel(-58, var3[var3.length - 1]);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("jf.E(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final static PaletteBitmapFont loadPaletteFont(ResourceArchive param0, int param1, ResourceArchive param2, int param3, byte param4) {
        RuntimeException var5 = null;
        String var6 = null;
        Object stackIn_4_0 = null;
        PaletteBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 <= 96) {
            var6 = (String) null;
            IncomingPacketHelpers.requestAddFriend((String) null, -39, (byte) 9);
          }
          if (PieceTiming.decodeSpriteSheetFromArchive(param3, false, param2, param1)) {
            stackIn_6_0 = PaletteFontFactory.createPaletteBitmapFont(param0.getFile(param1, param3, true), -28628);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (PaletteBitmapFont) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("jf.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_b = "Type your email address again to make sure it's correct";
    }
}
