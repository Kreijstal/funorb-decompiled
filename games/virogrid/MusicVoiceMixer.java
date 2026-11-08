/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicVoiceMixer extends AudioStream {
    IntrusiveDeque field_k;
    private MidiPcmStream field_m;
    static StateToken field_l;
    static SpriteWidget field_o;
    PcmStreamMixer field_n;

    final static int[] createPitchYawRotation(int param0, int param1, int param2) {
        int var3 = UiTheme.sineLookup(param1, 32);
        int var4 = TextDecodeHelpers.cosineLookup(21855, param1);
        int var5 = UiTheme.sineLookup(param2, 32);
        int var6 = TextDecodeHelpers.cosineLookup(21855, param2);
        int var7 = (int)((long)var3 * (long)var5 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var11 = -89 % ((param0 + 71) / 53);
        int var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final void skipFrames(int param0) {
        int var2;
        MidiNote var3;
        int var4;
        var4 = Virogrid.field_F ? 1 : 0;
        this.field_n.skipFrames(param0);
        var3 = (MidiNote) (this.field_k.first((byte) -111));
        while (var3 != null) {
          if (!this.field_m.discardInactiveVoice(-109, var3)) {
            var2 = param0;
            do {
              if (var3.field_D >= var2) {
                this.skipVoice(true, var2, var3);
                var3.field_D = var3.field_D - var2;
                break;
              }
              this.skipVoice(true, var3.field_D, var3);
              var2 = var2 - var3.field_D;
            } while (!this.field_m.updateNote(0, (int[]) null, var2, 123, var3));
          }
          var3 = (MidiNote) (this.field_k.next(16213));
        }
    }

    final void mixInto(int[] param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        MidiNote var6 = null;
        int var7 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          this.field_n.mixInto(param0, param1, param2);
          var6 = (MidiNote) (this.field_k.first((byte) -93));
          while (var6 != null) {
            stackIn_4_0 = this.field_m.discardInactiveVoice(-124, var6);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var5 = param2;
              var4_int = param1;
              while (var5 > var6.field_D) {
                this.fillVoice(var6.field_D, var6, param0, (byte) 46, var4_int, var4_int + var5);
                var4_int = var4_int + var6.field_D;
                var5 = var5 - var6.field_D;
                if (this.field_m.updateNote(var4_int, param0, var5, 123, var6)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.fillVoice(var5, var6, param0, (byte) 46, var4_int, var4_int + var5);
                var6.field_D = var6.field_D - var5;
              }
            }
            var6 = (MidiNote) (this.field_k.next(16213));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("pa.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static int performLogin(String param0, boolean param1, int param2, byte param3, boolean param4, String param5) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_20_0 = 0;
          int stackIn_34_0 = 0;
          boolean stackIn_46_0 = false;
          boolean stackIn_49_0 = false;
          boolean stackIn_52_0 = false;
          boolean stackIn_58_0 = false;
          int stackIn_85_0 = 0;
          int stackIn_93_0 = 0;
          int stackIn_97_0 = 0;
          int stackIn_105_0 = 0;
          int stackIn_108_0 = 0;
          RuntimeException stackIn_111_0 = null;
          StringBuilder stackIn_111_1 = null;
          String stackIn_112_2 = null;
          StringBuilder stackIn_114_1 = null;
          String stackIn_115_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          CharSequence var10 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = Virogrid.field_F ? 1 : 0;
          try {
            if (QuickChatMenu.field_Ub == null &&
              !DraggableWidget.pollGameSocketConnection(-69, param1)) {
              stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (LoginCredentialType.field_c == DigestHelpers.field_a) {
              if (!param1) {
                BirthDateEntryPanel.field_G = StripedProgressBar.createLoginCredentials(param5, 16711935, param0, false);
              } else {
                BirthDateEntryPanel.field_G = CredentialHelpers.createCredentials(IntKeyLookup.field_a, (String) null, param3 + 184, param0, false);
              }
              IterableNodeHashTable.field_g.position = 0;
              IterableNodeHashTable.field_g.writeByte(14, -77);
              IterableNodeHashTable.field_g.writeByte(BirthDateEntryPanel.field_G.getCredentialType(true).field_d, 77);
              DateOfBirthValidator.flushPackets(-1, -1);
              DigestHelpers.field_a = QuickChatPhraseDefinition.field_t;
            }
            if (QuickChatPhraseDefinition.field_t == DigestHelpers.field_a &&
              FrameSkin.fillIncomingBuffer(1, param3 + 57)) {
              var6_int = ProgressMessageDialog.field_qb.readUnsignedByte(11132);
              if (0 == var6_int) {
                DigestHelpers.field_a = ContextMenu.field_Ob;
              } else {
                PasswordConfirmationValidator.field_q = var6_int;
                ArchiveProvider.field_a = -1;
                DigestHelpers.field_a = NetworkArchiveRequest.field_E;
              }
              ProgressMessageDialog.field_qb.position = 0;
            }
            if (param3 != -57) {
              stackIn_20_0 = -38;
              return stackIn_20_0;
            }
            if (DigestHelpers.field_a == ContextMenu.field_Ob &&
              FrameSkin.fillIncomingBuffer(8, 0)) {
              ProxySocketConnector.field_i = ProgressMessageDialog.field_qb.readLong((byte) -60);
              ProgressMessageDialog.field_qb.position = 0;
              IntKeyLookup.writeLoginPacket(param1, 0, param4, param2, BirthDateEntryPanel.field_G);
              DigestHelpers.field_a = SharedTextGlobals.field_d;
            }
            boolean decompiledFrameRemainder0 = true;
            if (DigestHelpers.field_a == SharedTextGlobals.field_d &&
              FrameSkin.fillIncomingBuffer(1, 0)) {
              var6_intLifetime1 = ProgressMessageDialog.field_qb.readUnsignedByte(11132);
              PasswordConfirmationValidator.field_q = var6_intLifetime1;
              StrongCacheReference.field_B = null;
              ProgressMessageDialog.field_qb.position = 0;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  ArchiveProvider.field_a = -1;
                  DigestHelpers.field_a = NetworkArchiveRequest.field_E;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  MenuInputState.closeGameConnection(false);
                  CameraAndLogoHelpers.field_e = false;
                  stackIn_34_0 = var6_intLifetime1;
                  return stackIn_34_0;
                }
              }
              if (decompiledFrameRemainder0) {
                DigestHelpers.field_a = TextDecodeHelpers.field_h;
                ArchiveProvider.field_a = -1;
              }
            }
            if (TextDecodeHelpers.field_h == DigestHelpers.field_a &&
              GameSession.isPacketPayloadReady((byte) 48)) {
              IntKeyLookup.field_a = ProgressMessageDialog.field_qb.readLong((byte) -60);
              LobbyGame.field_Wb = param0;
              ReflectionCheckHelpers.field_d = ProgressMessageDialog.field_qb.readUnsignedByte(11132);
              BoundedUrlRequest.field_s = ProgressMessageDialog.field_qb.readUnsignedByte(11132);
              NameCharacterHelpers.field_d = ProgressMessageDialog.field_qb.readUnsignedShort((byte) -64);
              var6 = ProgressMessageDialog.field_qb.readOptionalString(param3 ^ -97);
              var7 = ProgressMessageDialog.field_qb.readUnsignedByte(param3 ^ -11077);
              if ((var7 & 1) != 0) {
                SessionSeedHelpers.persistSessionSeedBytes(0);
              }
              if (!param1) {
                stackIn_46_0 = ((var7 & 2) != 0);
                RankingsRequest.field_n = stackIn_46_0;
                stackIn_49_0 = ((8 & var7) != 0);
                FrameSkin.field_f = stackIn_49_0;
                stackIn_52_0 = (0 != (4 & var7));
                ChatMessage.field_l = stackIn_52_0;
                if (FrameSkin.field_f) {
                  RankingsRequest.field_n = true;
                }
              }
              stackIn_58_0 = ((var7 & 16) != 0);
              MathAndCookieHelpers.field_a = stackIn_58_0;
              if (BufferedSocket.field_k) {
                ProgressMessageDialog.field_qb.readUnsignedByte(11132);
                ProgressMessageDialog.field_qb.readUnsignedByte(param3 + 11189);
                ProgressMessageDialog.field_qb.readInt((byte) 98);
                SocketConnector.field_e = ProgressMessageDialog.field_qb.readUnsignedShort((byte) 127);
                CheckboxPainter.field_d = new byte[SocketConnector.field_e];
                for (var8 = 0; SocketConnector.field_e > var8; var8++) {
                  CheckboxPainter.field_d[var8] = ProgressMessageDialog.field_qb.readByte((byte) 114);
                }
              }
              DebouncedValidator.field_d = ProgressMessageDialog.field_qb.readString(param3 - 69);
              var10 = (CharSequence) ((Object) DebouncedValidator.field_d);
              MidiNote.field_n = DisplayNameHelpers.normalizeDisplayName(var10, true);
              NanoTickClock.field_h = ProgressMessageDialog.field_qb.readUnsignedByte(11132);
              DigestHelpers.field_a = ClientServiceHelpers.field_c;
              if (BirthDateEntryPanel.field_G.getCredentialType(true) != RasterSnapshot.field_r) {
                if (BirthDateEntryPanel.field_G.getCredentialType(true) == IntrusiveDeque.field_b) {
                  Virogrid.field_O.saveAsLastLoginMethod(ContentTransitionDialog.getApplet((byte) -86), (byte) 100);
                }
              } else {
                QuickChatHelpHelpers.field_b.saveAsLastLoginMethod(ContentTransitionDialog.getApplet((byte) -86), (byte) 88);
              }
              CameraAndLogoHelpers.field_e = false;
              if (var6 != null) {
                GzipDecompressor.setSettingsCookie(-69, var6, ContentTransitionDialog.getApplet((byte) 13));
              }
              if (0 >= NameCharacterHelpers.field_d &&
                !ChatMessage.field_l) {
                try {
                  JavaScriptBridge.callJavaScript("unzap", 6168, ContentTransitionDialog.getApplet((byte) 32));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  JavaScriptBridge.callWithArguments(ContentTransitionDialog.getApplet((byte) 61), -8582, new Object[]{PasswordConfirmationValidator.decodeBase37Name(IntKeyLookup.field_a, 92)}, "zap");
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (NameCharacterHelpers.field_d > 0) {
                FrameSkin.field_c = true;
              }
              IterableNodeHashTable.field_g.initializeCipher(DiskCacheWorker.field_b, false);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                DiskCacheWorker.field_b[var8Lifetime1] = DiskCacheWorker.field_b[var8Lifetime1] + 50;
              }
              ProgressMessageDialog.field_qb.initializeCipher(DiskCacheWorker.field_b, false);
              stackIn_85_0 = PasswordConfirmationValidator.field_q;
              return stackIn_85_0;
            }
            if (NetworkArchiveRequest.field_E == DigestHelpers.field_a &&
              GameSession.isPacketPayloadReady((byte) 48)) {
              MenuInputState.closeGameConnection(false);
              if (PasswordConfirmationValidator.field_q == 7 &&
                !CameraAndLogoHelpers.field_e) {
                CameraAndLogoHelpers.field_e = true;
                stackIn_93_0 = -1;
                return stackIn_93_0;
              }
              if (7 == PasswordConfirmationValidator.field_q) {
                PasswordConfirmationValidator.field_q = 3;
              }
              GameKeyHandler.field_g = ProgressMessageDialog.field_qb.readString(param3 ^ 68);
              CameraAndLogoHelpers.field_e = false;
              stackIn_97_0 = PasswordConfirmationValidator.field_q;
              return stackIn_97_0;
            }
            if (null == QuickChatMenu.field_Ub) {
              if (CameraAndLogoHelpers.field_e) {
                if (AccountCreationSupport.getMillisSinceLastServerData(param3 ^ 69) <= 30000L) {
                  GameKeyHandler.field_g = TextJoinHelpers.field_a;
                } else {
                  GameKeyHandler.field_g = EditableTextWidget.field_L;
                }
                CameraAndLogoHelpers.field_e = false;
                stackIn_105_0 = 3;
                return stackIn_105_0;
              }
              var6_intLifetime2 = ConditionalTextValue.field_b;
              ConditionalTextValue.field_b = MenuInputState.field_i;
              CameraAndLogoHelpers.field_e = true;
              MenuInputState.field_i = var6_intLifetime2;
            }
            stackIn_108_0 = -1;
            return stackIn_108_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_111_0 = var6_ref;
            stackIn_111_1 = new StringBuilder().append("pa.H(");
            if (param0 == null) {
              stackIn_112_2 = "null";
            } else {
              stackIn_112_2 = "{...}";
            }
            stackIn_114_1 = ((StringBuilder) (Object) stackIn_111_1).append(stackIn_112_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_115_2 = "null";
            } else {
              stackIn_115_2 = "{...}";
            }
            throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_111_0), ((StringBuilder) (Object) stackIn_114_1).append(stackIn_115_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final AudioStream firstSubStream() {
        MidiNote var1 = (MidiNote) (this.field_k.first((byte) -77));
        if (var1 == null) {
          return null;
        }
        if (var1.field_p != null) {
          return (AudioStream) ((Object) var1.field_p);
        }
        return this.nextSubStream();
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          field_o = (SpriteWidget) null;
        }
        field_l = null;
        field_o = null;
    }

    final int activity() {
        return 0;
    }

    final static boolean isDecimalInteger(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -110) {
            stackIn_4_0 = LobbyLayout.isIntegerInRadix(10, 88, true, param0);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("pa.K(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void skipVoice(boolean param0, int param1, MidiNote param2) {
        MidiPcmStream stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int[] var6 = null;
        try {
          if (0 != (4 & this.field_m.field_U[param2.field_h]) &&
            param2.field_o < 0) {
            var4_int = this.field_m.field_I[param2.field_h] / AudioOutput.field_p;
            var5 = (-param2.field_B + (1048575 + var4_int)) / var4_int;
            param2.field_B = 1048575 & param2.field_B + param1 * var4_int;
            if (param1 >= var5) {
              if (this.field_m.field_S[param2.field_h] == 0) {
                param2.field_p = PcmSampleStream.createAtStepQ8(param2.field_q, param2.field_p.getSampleStepMagnitude(), param2.field_p.getTargetVolume(), param2.field_p.panQ14());
              } else {
                param2.field_p = PcmSampleStream.createAtStepQ8(param2.field_q, param2.field_p.getSampleStepMagnitude(), 0, param2.field_p.panQ14());
                stackIn_8_0 = this.field_m;
                stackIn_9_1 = !(param2.field_E.field_p[param2.field_l] >= 0);
                ((MidiPcmStream) (Object) stackIn_8_0).applyNoteSampleOffset(stackIn_9_1, -16257, param2);
              }
              if (param2.field_E.field_p[param2.field_l] < 0) {
                param2.field_p.setLoopCount(-1);
              }
              param1 = param2.field_B / var4_int;
            }
          }
          if (!param0) {
            var6 = (int[]) null;
            this.mixInto((int[]) null, 69, -108);
          }
          param2.field_p.skipFrames(param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("pa.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void fillVoice(int param0, MidiNote param1, int[] param2, byte param3, int param4, int param5) {
        MidiPcmStream stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        PcmSampleStream var11 = null;
        int var12 = 0;
        var12 = Virogrid.field_F ? 1 : 0;
        try {
          if ((4 & this.field_m.field_U[param1.field_h]) != 0 &&
            param1.field_o < 0) {
            var7_int = this.field_m.field_I[param1.field_h] / AudioOutput.field_p;
            while (true) {
              var8 = (var7_int + 1048575 - param1.field_B) / var7_int;
              if (var8 > param0) {
                param1.field_B = param1.field_B + var7_int * param0;
                break;
              }
              param1.field_p.mixInto(param2, param4, var8);
              param4 = param4 + var8;
              param1.field_B = param1.field_B + (var8 * var7_int - 1048576);
              param0 = param0 - var8;
              var9 = AudioOutput.field_p / 100;
              var10 = 262144 / var7_int;
              if (var9 > var10) {
                var9 = var10;
              }
              var11 = param1.field_p;
              if (this.field_m.field_S[param1.field_h] != 0) {
                param1.field_p = PcmSampleStream.createAtStepQ8(param1.field_q, var11.getSampleStepMagnitude(), 0, var11.panQ14());
                stackIn_14_0 = this.field_m;
                stackIn_15_1 = !(param1.field_E.field_p[param1.field_l] >= 0);
                ((MidiPcmStream) (Object) stackIn_14_0).applyNoteSampleOffset(stackIn_15_1, -16257, param1);
                param1.field_p.rampVolumeQ6(var9, var11.getTargetVolume());
              } else {
                param1.field_p = PcmSampleStream.createAtStepQ8(param1.field_q, var11.getSampleStepMagnitude(), var11.getTargetVolume(), var11.panQ14());
              }
              if (0 > param1.field_E.field_p[param1.field_l]) {
                param1.field_p.setLoopCount(-1);
              }
              var11.fadeOutAndUnlink(var9);
              var11.mixInto(param2, param4, -param4 + param5);
              if (!var11.hasRemainingRampFrames()) {
                continue;
              }
              this.field_n.addSubStream(var11);
            }
          }
          if (param3 != 46) {
            return;
          }
          param1.field_p.mixInto(param2, param4, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_29_0 = var7;
          stackIn_29_1 = new StringBuilder().append("pa.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final AudioStream nextSubStream() {
        MidiNote var1_ref = null;
        int var2 = Virogrid.field_F ? 1 : 0;
        do {
          var1_ref = (MidiNote) (this.field_k.next(16213));
          if (var1_ref == null) {
            return null;
          }
        } while (null == var1_ref.field_p);
        return (AudioStream) ((Object) var1_ref.field_p);
    }

    MusicVoiceMixer(MidiPcmStream param0) {
        this.field_k = new IntrusiveDeque();
        this.field_n = new PcmStreamMixer();
        try {
          this.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "pa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
