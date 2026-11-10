/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ByteArrayPool {
    static Sprite field_a;
    static int field_b;
    static String field_c;

    public static void releaseStatics(int param0) {
        field_c = null;
        if (param0 == 1426) {
          field_a = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        ByteArrayPool.isValidPlayerName((CharSequence) null, false, -68);
        field_a = null;
    }

    final static void stopMusic(int param0) {
        if (param0 <= 5) {
          return;
        }
        MusicTrack var2 = (MusicTrack) null;
        SpriteSheetArchiveHelpers.playMusicTrackDefault((byte) 62, (MusicTrack) null);
    }

    final static void skipEndingCutscene(byte param0) {
        AreaSelectionScreen.field_m = 1426;
        if (param0 != 80) {
          CharSequence var2 = (CharSequence) null;
          ByteArrayPool.isValidPlayerName((CharSequence) null, false, 20);
        }
    }

    final synchronized static byte[] acquireByteArray(int param0, int param1) {
        byte[][] fieldTemp$25 = null;
        int fieldTemp$26 = 0;
        int fieldTemp$22 = 0;
        int dupTemp$23 = 0;
        byte[][] arrayValue$24 = null;
        int dupTemp$17 = 0;
        byte[][] arrayValue$18 = null;
        int fieldTemp$21 = 0;
        int dupTemp$19 = 0;
        byte[][] arrayValue$20 = null;
        byte[][] fieldTemp$15 = null;
        int fieldTemp$16 = 0;
        int dupTemp$3 = 0;
        byte[][] arrayValue$4 = null;
        int fieldTemp$7 = 0;
        int dupTemp$5 = 0;
        byte[][] arrayValue$6 = null;
        byte[][] fieldTemp$13 = null;
        int fieldTemp$14 = 0;
        int dupTemp$8 = 0;
        byte[][] arrayValue$9 = null;
        int fieldTemp$12 = 0;
        int dupTemp$10 = 0;
        byte[][] arrayValue$11 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime1Lifetime1;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        byte[] var2_ref_byte__Lifetime3;
        byte[] var2_ref_byte__Lifetime4;
        byte[] var3Lifetime1;
        byte[] var3Lifetime2;
        byte[] var3Lifetime3;
        byte[] var2_ref_byte__Lifetime5;
        byte[] var3Lifetime4;
        byte[] var3Lifetime5;
        byte[] var3Lifetime1Lifetime1;
        if (100 != param1) {
          if (param0 != -5827) {
            return (byte[]) null;
          }
          if (param1 == 5000) {
            if (FullscreenExitHelpers.field_e > 0) {
              fieldTemp$25 = SoundEffectLibrary.field_e;
              fieldTemp$26 = FullscreenExitHelpers.field_e - 1;
              FullscreenExitHelpers.field_e = FullscreenExitHelpers.field_e - 1;
              var2_ref_byte__ = fieldTemp$25[fieldTemp$26];
              SoundEffectLibrary.field_e[FullscreenExitHelpers.field_e] = null;
              return var2_ref_byte__;
            }
            if (param1 == 30000 &&
              NameSuggestionsPanel.field_F > 0) {
              fieldTemp$22 = NameSuggestionsPanel.field_F - 1;
              NameSuggestionsPanel.field_F = NameSuggestionsPanel.field_F - 1;
              var2_ref_byte__ = ExceptionWrapper.field_j[fieldTemp$22];
              ExceptionWrapper.field_j[NameSuggestionsPanel.field_F] = null;
              return var2_ref_byte__;
            }
            if (QueuedStatSubmission.field_j == null) {
              return new byte[param1];
            }
            for (var2 = 0; AccountResultHelpers.field_d.length > var2; var2++) {
              if (param1 == AccountResultHelpers.field_d[var2] &&
                Bzip2State.field_w[var2] > 0) {
                dupTemp$23 = Bzip2State.field_w[var2] - 1;
                arrayValue$24 = QueuedStatSubmission.field_j[var2];
                Bzip2State.field_w[var2] = dupTemp$23;
                var3 = arrayValue$24[dupTemp$23];
                QueuedStatSubmission.field_j[var2][Bzip2State.field_w[var2]] = null;
                return var3;
              }
            }
            return new byte[param1];
          }
          if (param1 != 30000) {
            if (QueuedStatSubmission.field_j == null) {
              return new byte[param1];
            }
            for (var2Lifetime4 = 0; AccountResultHelpers.field_d.length > var2Lifetime4; var2Lifetime4++) {
              if (param1 == AccountResultHelpers.field_d[var2Lifetime4] &&
                Bzip2State.field_w[var2Lifetime4] > 0) {
                dupTemp$17 = Bzip2State.field_w[var2Lifetime4] - 1;
                arrayValue$18 = QueuedStatSubmission.field_j[var2Lifetime4];
                Bzip2State.field_w[var2Lifetime4] = dupTemp$17;
                var3Lifetime4 = arrayValue$18[dupTemp$17];
                QueuedStatSubmission.field_j[var2Lifetime4][Bzip2State.field_w[var2Lifetime4]] = null;
                return var3Lifetime4;
              }
            }
            return new byte[param1];
          }
          if (NameSuggestionsPanel.field_F > 0) {
            fieldTemp$21 = NameSuggestionsPanel.field_F - 1;
            NameSuggestionsPanel.field_F = NameSuggestionsPanel.field_F - 1;
            var2_ref_byte__Lifetime5 = ExceptionWrapper.field_j[fieldTemp$21];
            ExceptionWrapper.field_j[NameSuggestionsPanel.field_F] = null;
            return var2_ref_byte__Lifetime5;
          }
          if (QueuedStatSubmission.field_j == null) {
            return new byte[param1];
          }
          for (var2Lifetime5 = 0; AccountResultHelpers.field_d.length > var2Lifetime5; var2Lifetime5++) {
            if (param1 == AccountResultHelpers.field_d[var2Lifetime5] &&
              Bzip2State.field_w[var2Lifetime5] > 0) {
              dupTemp$19 = Bzip2State.field_w[var2Lifetime5] - 1;
              arrayValue$20 = QueuedStatSubmission.field_j[var2Lifetime5];
              Bzip2State.field_w[var2Lifetime5] = dupTemp$19;
              var3Lifetime5 = arrayValue$20[dupTemp$19];
              QueuedStatSubmission.field_j[var2Lifetime5][Bzip2State.field_w[var2Lifetime5]] = null;
              return var3Lifetime5;
            }
          }
          return new byte[param1];
        }
        if (SocketConnector.field_c > 0) {
          fieldTemp$15 = SettingsCookieHelpers.field_c;
          fieldTemp$16 = SocketConnector.field_c - 1;
          SocketConnector.field_c = SocketConnector.field_c - 1;
          var2_ref_byte__Lifetime1 = fieldTemp$15[fieldTemp$16];
          SettingsCookieHelpers.field_c[SocketConnector.field_c] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param0 != -5827) {
          return (byte[]) null;
        }
        if (param1 != 5000) {
          if (param1 != 30000) {
            if (QueuedStatSubmission.field_j == null) {
              return new byte[param1];
            }
            for (var2Lifetime1 = 0; AccountResultHelpers.field_d.length > var2Lifetime1; var2Lifetime1++) {
              if (param1 == AccountResultHelpers.field_d[var2Lifetime1] &&
                Bzip2State.field_w[var2Lifetime1] > 0) {
                dupTemp$3 = Bzip2State.field_w[var2Lifetime1] - 1;
                arrayValue$4 = QueuedStatSubmission.field_j[var2Lifetime1];
                Bzip2State.field_w[var2Lifetime1] = dupTemp$3;
                var3Lifetime1 = arrayValue$4[dupTemp$3];
                QueuedStatSubmission.field_j[var2Lifetime1][Bzip2State.field_w[var2Lifetime1]] = null;
                return var3Lifetime1;
              }
            }
            return new byte[param1];
          }
          if (NameSuggestionsPanel.field_F > 0) {
            fieldTemp$7 = NameSuggestionsPanel.field_F - 1;
            NameSuggestionsPanel.field_F = NameSuggestionsPanel.field_F - 1;
            var2_ref_byte__Lifetime2 = ExceptionWrapper.field_j[fieldTemp$7];
            ExceptionWrapper.field_j[NameSuggestionsPanel.field_F] = null;
            return var2_ref_byte__Lifetime2;
          }
          if (QueuedStatSubmission.field_j == null) {
            return new byte[param1];
          }
          for (var2Lifetime1Lifetime1 = 0; AccountResultHelpers.field_d.length > var2Lifetime1Lifetime1; var2Lifetime1Lifetime1++) {
            if (param1 == AccountResultHelpers.field_d[var2Lifetime1Lifetime1] &&
              Bzip2State.field_w[var2Lifetime1Lifetime1] > 0) {
              dupTemp$5 = Bzip2State.field_w[var2Lifetime1Lifetime1] - 1;
              arrayValue$6 = QueuedStatSubmission.field_j[var2Lifetime1Lifetime1];
              Bzip2State.field_w[var2Lifetime1Lifetime1] = dupTemp$5;
              var3Lifetime1Lifetime1 = arrayValue$6[dupTemp$5];
              QueuedStatSubmission.field_j[var2Lifetime1Lifetime1][Bzip2State.field_w[var2Lifetime1Lifetime1]] = null;
              return var3Lifetime1Lifetime1;
            }
          }
          return new byte[param1];
        }
        if (FullscreenExitHelpers.field_e > 0) {
          fieldTemp$13 = SoundEffectLibrary.field_e;
          fieldTemp$14 = FullscreenExitHelpers.field_e - 1;
          FullscreenExitHelpers.field_e = FullscreenExitHelpers.field_e - 1;
          var2_ref_byte__Lifetime3 = fieldTemp$13[fieldTemp$14];
          SoundEffectLibrary.field_e[FullscreenExitHelpers.field_e] = null;
          return var2_ref_byte__Lifetime3;
        }
        if (param1 != 30000) {
          if (QueuedStatSubmission.field_j == null) {
            return new byte[param1];
          }
          for (var2Lifetime2 = 0; AccountResultHelpers.field_d.length > var2Lifetime2; var2Lifetime2++) {
            if (param1 == AccountResultHelpers.field_d[var2Lifetime2] &&
              Bzip2State.field_w[var2Lifetime2] > 0) {
              dupTemp$8 = Bzip2State.field_w[var2Lifetime2] - 1;
              arrayValue$9 = QueuedStatSubmission.field_j[var2Lifetime2];
              Bzip2State.field_w[var2Lifetime2] = dupTemp$8;
              var3Lifetime2 = arrayValue$9[dupTemp$8];
              QueuedStatSubmission.field_j[var2Lifetime2][Bzip2State.field_w[var2Lifetime2]] = null;
              return var3Lifetime2;
            }
          }
          return new byte[param1];
        }
        if (NameSuggestionsPanel.field_F > 0) {
          fieldTemp$12 = NameSuggestionsPanel.field_F - 1;
          NameSuggestionsPanel.field_F = NameSuggestionsPanel.field_F - 1;
          var2_ref_byte__Lifetime4 = ExceptionWrapper.field_j[fieldTemp$12];
          ExceptionWrapper.field_j[NameSuggestionsPanel.field_F] = null;
          return var2_ref_byte__Lifetime4;
        }
        if (QueuedStatSubmission.field_j == null) {
          return new byte[param1];
        }
        for (var2Lifetime3 = 0; AccountResultHelpers.field_d.length > var2Lifetime3; var2Lifetime3++) {
          if (param1 == AccountResultHelpers.field_d[var2Lifetime3] &&
            Bzip2State.field_w[var2Lifetime3] > 0) {
            dupTemp$10 = Bzip2State.field_w[var2Lifetime3] - 1;
            arrayValue$11 = QueuedStatSubmission.field_j[var2Lifetime3];
            Bzip2State.field_w[var2Lifetime3] = dupTemp$10;
            var3Lifetime3 = arrayValue$11[dupTemp$10];
            QueuedStatSubmission.field_j[var2Lifetime3][Bzip2State.field_w[var2Lifetime3]] = null;
            return var3Lifetime3;
          }
        }
        return new byte[param1];
    }

    final static boolean isValidPlayerName(CharSequence param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          if (!PhantomZombie.isValidDisplayName(param2, param0, param1)) {
            return false;
          }
          for (var3_int = 0; param0.length() > var3_int; var3_int++) {
            if (!SpriteCheckboxPainter.isValidNameCharacter((byte) 27, param0.charAt(var3_int))) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ch.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_c = "You don't seem to have completed all of the Mall and Power Plant levels yet. We recommend you do so before attempting the UK levels.";
    }
}
