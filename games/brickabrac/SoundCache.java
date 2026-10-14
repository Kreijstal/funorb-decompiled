/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundCache {
    static String field_i;
    private ResourceArchive soundEffectArchive;
    static TextFont field_c;
    static UiComponent field_k;
    private ResourceArchive musicSampleArchive;
    static NodeDeque field_f;
    private IntrusiveHashTable pendingMusicSamples;
    static char field_h;
    private IntrusiveHashTable decodedSounds;
    static String field_b;
    static String field_d;

    final static void a(int param0, int param1, boolean param2) {
        int var3;
        int var4;
        String var5;
        Object var6;
        String var7;
        CharSequence var8;
        Object var6Lifetime1;
        Object var6Lifetime2;
        var3 = -76 / ((81 - param0) / 37);
        if (MusicCrossfadeStream.nameEntryPopup != null) {
          var4 = MusicCrossfadeStream.nameEntryPopup.updateAndPollNameInput(param2, (byte) 95);
          if (var4 != 0) {
            if (2 == var4 &&
              MusicCrossfadeStream.nameEntryPopup.text != null &&
              !MusicCrossfadeStream.nameEntryPopup.text.equals("")) {
              if (MusicCrossfadeStream.nameEntryPopup.text.charAt(0) == 91) {
                var5 = MusicCrossfadeStream.nameEntryPopup.text;
                var6 = var5;
                var6Lifetime2 = var5;
              } else {
                var8 = (CharSequence) ((Object) MusicCrossfadeStream.nameEntryPopup.text);
                var5 = ChatMessage.normalizePlayerName(var8, 57);
              }
              var6Lifetime1 = null;
              if (GameUiController.field_d == 0) {
                var6Lifetime1 = jl.requestAddFriend(24943, var5, param1);
              }
              if (GameUiController.field_d == 1) {
                var6Lifetime1 = KeyboardInput.requestRemoveFriend(param1, false, var5);
              }
              if (GameUiController.field_d == 2) {
                var6Lifetime1 = LoginMethodPreference.requestAddIgnoredPlayer(var5, param1, 2);
              }
              if (GameUiController.field_d == 3) {
                var6Lifetime1 = uf.requestRemoveIgnoredPlayer(var5, param1, var5, -45);
              }
              if (var6Lifetime1 != null) {
                var7 = (String) null;
                SoundCache.appendSystemChatMessage((byte) 92, 0, (String) null, (String) (var6Lifetime1), var5, 2);
              }
              GameUiController.field_d = -1;
              MusicCrossfadeStream.nameEntryPopup = null;
            } else {
              GameUiController.field_d = -1;
              MusicCrossfadeStream.nameEntryPopup = null;
            }
          }
        }
    }

    private final PcmSound getSoundEffectByName(int[] budget, String fileName, int obfuscationGuard, String groupName) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        Object stackIn_7_0 = null;
        PcmSound stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.soundEffectArchive.getGroupId(groupName, false);
          if (var5_int < 0) {
            return null;
          }
          if (obfuscationGuard != 2) {
            var7 = (String) null;
            this.getMusicSampleByName((byte) -29, (String) null, (String) null);
          }
          var6 = this.soundEffectArchive.getFileId(var5_int, -100, fileName);
          if (var6 >= 0) {
            stackIn_9_0 = this.getSoundEffect(var6, 0, var5_int, budget);
            return stackIn_9_0;
          }
          stackIn_7_0 = null;
          return (PcmSound) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("wp.E(");
          if (budget == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (fileName == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(obfuscationGuard).append(',');
          if (groupName == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final PcmSound getMusicSample(int fileId, int groupId, int[] budget, int obfuscationGuard) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        PcmSound var8 = null;
        VorbisSample var9 = null;
        PcmSound stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_17_0 = null;
        PcmSound stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        PcmSound var8Lifetime1;
        try {
          var5_int = ((groupId & -536866817) << 4 | groupId >>> 12) ^ fileId;
          var5_int = var5_int | groupId << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (PcmSound) (this.decodedSounds.get(-87, var6));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (obfuscationGuard != 0) {
            field_d = (String) null;
          }
          if (budget != null &&
            budget[0] <= 0) {
            stackIn_8_0 = null;
            return (PcmSound) (stackIn_8_0);
          }
          var9 = (VorbisSample) (this.pendingMusicSamples.get(-87, var6));
          if (var9 == null) {
            var9 = VorbisSample.load(this.musicSampleArchive, groupId, fileId);
            if (var9 == null) {
              return null;
            }
            this.pendingMusicSamples.put(34, var9, var6);
          }
          var8Lifetime1 = var9.toPcmSoundBudgeted(budget);
          if (var8Lifetime1 == null) {
            stackIn_17_0 = null;
            return (PcmSound) (stackIn_17_0);
          }
          var9.unlink((byte) 111);
          this.decodedSounds.put(34, var8Lifetime1, var6);
          stackIn_19_0 = var8Lifetime1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("wp.K(").append(fileId).append(',').append(groupId).append(',');
          if (budget == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        ScorePopup.field_p = param1;
        if (null != m.musicSynthesizer) {
          m.musicSynthesizer.setMasterGain(param1, false);
        }
        if (null != MeshAttributeRecord.musicCrossfadeStream) {
          MeshAttributeRecord.musicCrossfadeStream.setMasterGain(true, param1);
        }
        if (param0 != 1) {
          field_i = (String) null;
        }
    }

    final static int a(String param0, boolean param1, boolean param2, boolean param3, int param4, String param5) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_29_0 = 0;
          boolean stackIn_41_0 = false;
          boolean stackIn_44_0 = false;
          boolean stackIn_47_0 = false;
          boolean stackIn_53_0 = false;
          int stackIn_81_0 = 0;
          int stackIn_91_0 = 0;
          int stackIn_95_0 = 0;
          int stackIn_104_0 = 0;
          int stackIn_106_0 = 0;
          RuntimeException stackIn_109_0 = null;
          StringBuilder stackIn_109_1 = null;
          String stackIn_110_2 = null;
          StringBuilder stackIn_112_1 = null;
          String stackIn_113_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          CharSequence var12 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = BrickABrac.field_J ? 1 : 0;
          try {
            if (WhirlpoolHasher.gameTransport == null &&
              !CappedUrlRequest.a(param1, 10000)) {
              stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (BitPacketBuffer.field_u == rf.field_b) {
              if (param1) {
                var10 = (String) null;
                NanoGameClock.field_s = AccountIntroductionPanel.createLoginCredentials(CacheEntry.field_v, 20, false, param5, (String) null);
              } else {
                NanoGameClock.field_s = ArchiveFetchClient.createCredentialsForAccount(param0, false, param5, (byte) -109);
              }
              TextFieldValidator.outgoingPackets.position = 0;
              TextFieldValidator.outgoingPackets.writeByte(28, 14);
              TextFieldValidator.outgoingPackets.writeByte(107, NanoGameClock.field_s.getCredentialKind(13).wireCode);
              ActivityIndicatorWidget.a(-1, 10000);
              rf.field_b = GameScreen.field_c;
            }
            if (rf.field_b == GameScreen.field_c &&
              vd.ensureGamePacketBytes(20, 1)) {
              var6_int = jl.incomingPackets.readUnsignedByte(255);
              jl.incomingPackets.position = 0;
              if (var6_int == 0) {
                rf.field_b = MeshAttributeRecord.field_f;
              } else {
                IntrusiveHashTable.currentPacketOpcode = var6_int;
                ga.incomingPacketLength = -1;
                rf.field_b = MenuScreen.field_k;
              }
            }
            if (rf.field_b == MeshAttributeRecord.field_f &&
              vd.ensureGamePacketBytes(20, 8)) {
              PopupWidgetLayer.field_ab = jl.incomingPackets.readLong(-32768);
              jl.incomingPackets.position = 0;
              SocialListEntry.a(param4, NanoGameClock.field_s, param1, param3, false);
              rf.field_b = rq.field_c;
            }
            boolean decompiledFrameRemainder0 = true;
            if (rf.field_b == rq.field_c &&
              vd.ensureGamePacketBytes(20, 1)) {
              var6_intLifetime1 = jl.incomingPackets.readUnsignedByte(255);
              ParisBackground.field_t = null;
              IntrusiveHashTable.currentPacketOpcode = var6_intLifetime1;
              jl.incomingPackets.position = 0;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  ga.incomingPacketLength = -1;
                  rf.field_b = MenuScreen.field_k;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  hn.a((byte) 52);
                  RadialSelectorRenderer.field_d = false;
                  stackIn_29_0 = var6_intLifetime1;
                  return stackIn_29_0;
                }
              }
              if (decompiledFrameRemainder0) {
                ga.incomingPacketLength = -1;
                rf.field_b = IsaacGenerator.field_g;
              }
            }
            if (rf.field_b == IsaacGenerator.field_g &&
              TextWidgetRenderer.ensureGamePacketBody((byte) -80)) {
              CacheEntry.field_v = jl.incomingPackets.readLong(-32768);
              gd.field_b = param5;
              QuickChatHelpDialog.field_Yb = jl.incomingPackets.readUnsignedByte(255);
              gh.field_f = jl.incomingPackets.readUnsignedByte(255);
              go.field_c = jl.incomingPackets.readUnsignedShort(65280);
              var11 = jl.incomingPackets.readNullableCp1252String(0);
              var7 = jl.incomingPackets.readUnsignedByte(255);
              if ((var7 & 1) != 0) {
                n.a(-1);
              }
              if (!param1) {
                stackIn_41_0 = ((var7 & 2) != 0);
                PlayerNameChooserPanel.field_I = stackIn_41_0;
                stackIn_44_0 = ((8 & var7) != 0);
                TextWidgetRenderer.field_e = stackIn_44_0;
                stackIn_47_0 = ((4 & var7) != 0);
                ChocolateBackground.field_r = stackIn_47_0;
                if (TextWidgetRenderer.field_e) {
                  PlayerNameChooserPanel.field_I = true;
                }
              }
              stackIn_53_0 = ((16 & var7) != 0);
              RasterSnapshot.field_j = stackIn_53_0;
              if (DialogMessagePanel.field_O) {
                jl.incomingPackets.readUnsignedByte(255);
                jl.incomingPackets.readUnsignedByte(255);
                jl.incomingPackets.readInt(255);
                NineSliceFrame.field_f = jl.incomingPackets.readUnsignedShort(65280);
                TextHotspotRegion.field_q = new byte[NineSliceFrame.field_f];
                for (var8 = 0; NineSliceFrame.field_f > var8; var8++) {
                  TextHotspotRegion.field_q[var8] = jl.incomingPackets.readByte(true);
                }
              }
              tb.field_cb = jl.incomingPackets.readCp1252String(-1);
              var12 = (CharSequence) ((Object) tb.field_cb);
              ArchiveFetchClient.localPlayerNameKey = ChatMessage.normalizePlayerName(var12, 65);
              OptionsScreen.field_x = jl.incomingPackets.readUnsignedByte(255);
              rf.field_b = MenuButton.field_i;
              if (NanoGameClock.field_s.getCredentialKind(13) == RadialSelectorWidget.emailLoginKind) {
                EmailConfirmationValidator.field_k.persistLoginMethod(100, EmailConfirmationValidator.e((byte) -66));
              } else {
                if (NanoGameClock.field_s.getCredentialKind(13) == MembershipBenefitsScreen.numericLoginKind) {
                  ll.field_d.persistLoginMethod(112, EmailConfirmationValidator.e((byte) -81));
                }
              }
              RadialSelectorRenderer.field_d = false;
              if (var11 != null) {
                ui.a(-70, EmailConfirmationValidator.e((byte) -112), var11);
              }
              if (0 >= go.field_c &&
                !ChocolateBackground.field_r) {
                try {
                  ne.a("unzap", -121, EmailConfirmationValidator.e((byte) -100));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  ne.a(new Object[]{GameplayAudioEvent.a(CacheEntry.field_v, (byte) 3)}, 116, EmailConfirmationValidator.e((byte) -75), "zap");
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (go.field_c > 0) {
                FarmBackground.field_u = true;
              }
              TextFieldValidator.outgoingPackets.initializeOpcodeCipher(LevelPackCard.field_a, -98);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                LevelPackCard.field_a[var8Lifetime1] = LevelPackCard.field_a[var8Lifetime1] + 50;
              }
              jl.incomingPackets.initializeOpcodeCipher(LevelPackCard.field_a, -62);
              stackIn_81_0 = IntrusiveHashTable.currentPacketOpcode;
              return stackIn_81_0;
            }
            if (!param2) {
              field_h = 'ﾢ';
            }
            if (rf.field_b == MenuScreen.field_k &&
              TextWidgetRenderer.ensureGamePacketBody((byte) -41)) {
              hn.a((byte) 58);
              if (IntrusiveHashTable.currentPacketOpcode == 7 &&
                !RadialSelectorRenderer.field_d) {
                RadialSelectorRenderer.field_d = true;
                stackIn_91_0 = -1;
                return stackIn_91_0;
              }
              if (IntrusiveHashTable.currentPacketOpcode == 7) {
                IntrusiveHashTable.currentPacketOpcode = 3;
              }
              DirectByteStorage.field_e = jl.incomingPackets.readCp1252String(-1);
              RadialSelectorRenderer.field_d = false;
              stackIn_95_0 = IntrusiveHashTable.currentPacketOpcode;
              return stackIn_95_0;
            }
            if (WhirlpoolHasher.gameTransport == null) {
              if (RadialSelectorRenderer.field_d) {
                if (30000L >= MembershipBenefitsScreen.f(-6792)) {
                  DirectByteStorage.field_e = gd.field_e;
                } else {
                  DirectByteStorage.field_e = hg.field_b;
                }
                RadialSelectorRenderer.field_d = false;
                stackIn_104_0 = 3;
                return stackIn_104_0;
              }
              var6_intLifetime2 = SocketConnector.field_b;
              SocketConnector.field_b = DebouncedValidationSource.field_a;
              RadialSelectorRenderer.field_d = true;
              DebouncedValidationSource.field_a = var6_intLifetime2;
            }
            stackIn_106_0 = -1;
            return stackIn_106_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_109_0 = var6;
            stackIn_109_1 = new StringBuilder().append("wp.L(");
            if (param0 == null) {
              stackIn_110_2 = "null";
            } else {
              stackIn_110_2 = "{...}";
            }
            stackIn_112_1 = ((StringBuilder) (Object) stackIn_109_1).append(stackIn_110_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_113_2 = "null";
            } else {
              stackIn_113_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_109_0), ((StringBuilder) (Object) stackIn_112_1).append(stackIn_113_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void appendSystemChatMessage(byte obfuscationGuard, int contextId, String contextLabel, String text, String senderName, int channel) {
        ChatMessage var6 = null;
        try {
          if (obfuscationGuard != 92) {
            SoundCache.a(100, 53);
          }
          var6 = new ChatMessage(channel, senderName, contextId, contextLabel, text);
          n.appendChatHistory(0, var6);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "wp.B(" + obfuscationGuard + ',' + contextId + ',' + (contextLabel != null ? "{...}" : "null") + ',' + (text != null ? "{...}" : "null") + ',' + (senderName != null ? "{...}" : "null") + ',' + channel + ')');
        }
    }

    private final PcmSound getMusicSampleByName(String groupName, byte obfuscationGuard, String fileName, int[] budget) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_7_0 = null;
        PcmSound stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.musicSampleArchive.getGroupId(groupName, false);
          if (var5_int < 0) {
            return null;
          }
          if (obfuscationGuard >= -45) {
            field_i = (String) null;
          }
          var6 = this.musicSampleArchive.getFileId(var5_int, -67, fileName);
          if (var6 >= 0) {
            stackIn_9_0 = this.getMusicSample(var6, var5_int, budget, 0);
            return stackIn_9_0;
          }
          stackIn_7_0 = null;
          return (PcmSound) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("wp.O(");
          if (groupName == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(',');
          if (fileName == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (budget == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void playUiSound(int obfuscationGuard, PcmSound sound) {
        if (obfuscationGuard != 8) {
          return;
        }
        try {
          TimedSplashScreen.playSound(obfuscationGuard ^ 100, sound);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "wp.A(" + obfuscationGuard + ',' + (sound != null ? "{...}" : "null") + ')');
        }
    }

    final PcmSound getSoundEffectByName(String fileName, String groupName, byte obfuscationGuard) {
        PcmSound discarded$1 = null;
        RuntimeException var4 = null;
        String var5 = null;
        PcmSound stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < 107) {
            var5 = (String) null;
            discarded$1 = this.getSoundEffectByName((int[]) null, (String) null, 67, (String) null);
          }
          stackIn_3_0 = this.getSoundEffectByName((int[]) null, fileName, 2, groupName);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("wp.I(");
          if (fileName == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (groupName == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final PcmSound getSoundEffectById(int[] budget, int id, int obfuscationGuard) {
        RuntimeException var4 = null;
        PcmSound stackIn_2_0 = null;
        PcmSound stackIn_5_0 = null;
        PcmSound stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.soundEffectArchive.getGroupCapacity(-97) == 1) {
            stackIn_2_0 = this.getSoundEffect(id, 0, 0, budget);
            return stackIn_2_0;
          }
          if (this.soundEffectArchive.getFileCapacity(-80, id) == 1) {
            stackIn_5_0 = this.getSoundEffect(0, 0, id, budget);
            return stackIn_5_0;
          }
          if (obfuscationGuard <= -124) {
            throw new RuntimeException();
          }
          stackIn_8_0 = (PcmSound) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("wp.J(");
          if (budget == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(id).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1) {
        int var2_int = 0;
        nj var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = SocketConnector.field_f;
          if (0 == var2_int) {
            uf.a(3, 0);
          }
          var3 = (nj) (PasswordFieldRenderer.field_E.first(-31));
          while (var3 != null) {
            var3.c(0);
            var3 = (nj) (PasswordFieldRenderer.field_E.next((byte) 116));
          }
          if (param0) {
            uf.a(var2_int - SocketConnector.field_f, 0);
          }
          if (param1 >= -30) {
            field_f = (NodeDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "wp.G(" + param0 + ',' + param1 + ')');
        }
    }

    final PcmSound getMusicSampleById(int id, int[] budget, int obfuscationGuard) {
        RuntimeException var4 = null;
        PcmSound stackIn_3_0 = null;
        PcmSound stackIn_6_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.musicSampleArchive.getGroupCapacity(-124) == 1) {
            stackIn_3_0 = this.getMusicSample(id, 0, budget, 0);
            return stackIn_3_0;
          }
          if (1 == this.musicSampleArchive.getFileCapacity(-90, id)) {
            stackIn_6_0 = this.getMusicSample(0, id, budget, 0);
            return stackIn_6_0;
          }
          if (obfuscationGuard <= 48) {
            SoundCache.a(-14, -17);
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("wp.M(").append(id).append(',');
          if (budget == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_d = null;
        field_i = null;
        field_k = null;
        if (param0 >= -99) {
          String var2 = (String) null;
          SoundCache.a((String) null, true, true, true, -106, (String) null);
        }
        field_b = null;
        field_c = null;
    }

    final PcmSound getMusicSampleByName(byte obfuscationGuard, String fileName, String groupName) {
        int var4_int = 0;
        RuntimeException var4 = null;
        PcmSound stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 11 / ((obfuscationGuard + 37) / 59);
          stackIn_1_0 = this.getMusicSampleByName(groupName, (byte) -109, fileName, (int[]) null);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("wp.C(").append(obfuscationGuard).append(',');
          if (fileName == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (groupName == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final PcmSound getSoundEffect(int fileId, int obfuscationGuard, int groupId, int[] budget) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        PcmSound var8 = null;
        SoundEffect var9 = null;
        PcmSound var10 = null;
        PcmSound stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        PcmSound stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        PcmSound var8Lifetime1;
        try {
          if (obfuscationGuard != 0) {
            this.soundEffectArchive = (ResourceArchive) null;
          }
          var5_int = fileId ^ (groupId >>> 12 | (-1342173185 & groupId) << 4);
          var5_int = var5_int | groupId << 16;
          var6 = (long)var5_int;
          var8 = (PcmSound) (this.decodedSounds.get(obfuscationGuard ^ -88, var6));
          if (var8 != null) {
            stackIn_4_0 = var8;
            return stackIn_4_0;
          }
          if (budget != null &&
            0 >= budget[0]) {
            stackIn_8_0 = null;
            return (PcmSound) (stackIn_8_0);
          }
          var9 = SoundEffect.load(this.soundEffectArchive, groupId, fileId);
          if (var9 == null) {
            stackIn_11_0 = null;
            return (PcmSound) (stackIn_11_0);
          }
          var10 = var9.toPcmSound();
          var8Lifetime1 = var10;
          this.decodedSounds.put(obfuscationGuard ^ 34, var8Lifetime1, var6);
          if (budget != null) {
            budget[0] = budget[0] - var10.samples.length;
          }
          stackIn_15_0 = var8Lifetime1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("wp.H(").append(fileId).append(',').append(obfuscationGuard).append(',').append(groupId).append(',');
          if (budget == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    SoundCache(ResourceArchive soundEffectArchive, ResourceArchive musicSampleArchive) {
        this.pendingMusicSamples = new IntrusiveHashTable(256);
        this.decodedSounds = new IntrusiveHashTable(256);
        try {
          this.soundEffectArchive = soundEffectArchive;
          this.musicSampleArchive = musicSampleArchive;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "wp.<init>(" + (soundEffectArchive != null ? "{...}" : "null") + ',' + (musicSampleArchive != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Play the game without logging in just yet";
        field_h = '/';
        field_b = "RuneScape clan";
        field_f = new NodeDeque();
    }
}
