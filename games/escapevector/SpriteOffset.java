/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteOffset {
    static int[] field_e;
    static PcmSample field_f;
    static String field_d;
    int x;
    static String field_a;
    int y;

    final static boolean handleLoginOrDiscardPrompt(boolean pointerDriven, int guard) {
        if (HighscorePlayerRecord.field_d.selectionChanged) {
          ObjectSpriteSet.field_e.playSampleWithPan(ArchiveRequest.field_w, 100, 1536 * IterableNodeHashTable.field_c / 64, 8192);
        }
        if (guard != 0) {
          return false;
        }
        if (!HighscorePlayerRecord.field_d.isInitialActivation((byte) -18)) {
          return false;
        }
        if (HighscorePlayerRecord.field_d.selectedIndex == 0) {
          GuestLoginSupport.beginAccountLogin(true);
          LoginHandshakeSupport.field_d = 0;
          SimulatorSpriteAssets.field_h = 2;
          ChatMessage.clearFrameOffsets((byte) -74);
          return true;
        }
        if (HighscorePlayerRecord.field_d.selectedIndex == 1) {
          IntValueNode.field_i = null;
          TrackerMusicDefinition.field_f = new AchievementTracker();
          GameProgressSupport.field_c = new GameProgressTracker();
          LoginHandshakeSupport.field_d = 0;
          PacketBuffer.field_h = false;
          AlternateUsernameCredentials.field_q.updatePointerSelection(-26480, pointerDriven);
          ChatMessage.clearFrameOffsets((byte) -66);
          return true;
        }
        return false;
    }

    public static void releaseStatics(int guard) {
        field_a = null;
        if (guard > 120) {
          field_d = null;
          field_f = null;
          field_e = null;
          return;
        }
        field_e = (int[]) null;
        field_d = null;
        field_f = null;
        field_e = null;
    }

    final static int pollLegacyMenuAction(int guard) {
        int var7 = EscapeVector.obfuscationControl;
        try {
          boolean var1_int = false;
          boolean var2 = false;
          if (guard != -14) {
            field_a = (String) null;
          }
          while (AccountRequestDialog.pollKeyEvent(-108)) {
            LegacyMenuState.input.handleKeyEvent((byte) 6);
            if (LegacyMenuState.input.isInitialActivation((byte) -18)) {
              var1_int = true;
            }
            if (PasswordValidator.field_n != 13) {
              continue;
            }
            var2 = true;
          }
          LegacyMenuState.input.updatePointer(CachedArchiveProvider.hitTestLegacyMenuAction((byte) 122, SessionCounterState.field_c, LoginDialog.field_ob), (byte) 120, CachedArchiveProvider.hitTestLegacyMenuAction((byte) 122, GzipDecoder.field_d, UiContainer.field_y));
          if (LegacyMenuState.input.isInitialActivation((byte) -18)) {
            var1_int = true;
          }
          int var3 = 0;
          if (var1_int &&
            LegacyMenuState.input.selectedIndex >= 0) {
            var3 = CachedTextLayout.field_j[LegacyMenuState.input.selectedIndex];
            if (2 == var3) {
              TextFieldValidator.clearLegacyMenuState(0);
            } else if (var3 == 5) {
              TextFieldValidator.clearLegacyMenuState(0);
            }
          } else if (var2 &&
            ArchiveIndex.field_j != 2) {
            TextFieldValidator.clearLegacyMenuState(0);
          }
          if (var3 == 0 &&
            ArchiveIndex.field_j == 2) {
            long var4 = -SavedDataWrite.field_k + MonotonicClockSupport.monotonicMillis(guard + 142);
            int var6 = (int)((-var4 + 10999L) / 1000L);
            if (0 >= var6) {
              LoginText.buildLegacyMenu(5, 0, true);
              var3 = 2;
            }
          }
          int stackIn_27_0 = var3;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1), "fn.E(" + guard + ')');
        }
    }

    static long bitwiseAnd(long left, long right) {
        return left & right;
    }

    final static String readHuffmanString(PacketBuffer input, int guard, int maximumLength) {
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            if (guard != 10241) {
              field_a = (String) null;
            }
            int var3_int = input.readUnsignedSmart(true);
            if (maximumLength < var3_int) {
              var3_int = maximumLength;
            }
            byte[] var4 = new byte[var3_int];
            input.position = input.position + ReflectionCheck.field_q.decode(var4, true, 0, input.position, var3_int, input.payload);
            String var5 = AccountMessagePanel.decodeCp1252(var3_int, 0, var4, (byte) -94);
            String stackIn_5_0 = var5;
            return stackIn_5_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            Exception var3 = (Exception) (Object) decompiledCaughtException;
            String stackIn_7_0 = "Cabbage";
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3_ref;
          StringBuilder stackIn_10_1 = new StringBuilder().append("fn.G(");
          if (input == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(',').append(maximumLength).append(')').toString());
        }
    }

    final static boolean isAccountNameCharacter(char character, byte guard) {
        if (Character.isISOControl(character)) {
          return false;
        }
        if (TextWidgetPainter.isAsciiAlphanumeric(true, character)) {
          return true;
        }
        if (guard != -124) {
          field_d = (String) null;
          if (45 == character) {
            return true;
          }
          if (character == 160) {
            return true;
          }
          if (character == 32) {
            return true;
          }
          if (character != 95) {
            return false;
          }
          return true;
        }
        if (45 == character) {
          return true;
        }
        if (character == 160) {
          return true;
        }
        if (character == 32) {
          return true;
        }
        if (character != 95) {
          return false;
        }
        return true;
    }

    SpriteOffset(int x, int y) {
        this.y = y;
        this.x = x;
    }

    final static void resetFrameTiming(byte guard) {
        int var2 = EscapeVector.obfuscationControl;
        try {
          if (guard <= 30) {
            SpriteOffset.resetFrameTiming((byte) 80);
          }
          IntrusiveNodeHashTable.field_f.resetTiming(237);
          for (int var1_int = 0; 32 > var1_int; var1_int++) {
            TileSpriteCacheEntry.field_d[var1_int] = 0L;
          }
          for (int var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            CipherPacketBuffer.field_t[var1_intLifetime1] = 0L;
          }
          Js5NetworkRequest.field_z = 0;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "fn.F(" + guard + ')');
        }
    }

    static {
        field_e = new int[]{21, 1, 22};
        field_d = "If you do nothing the game will revert to normal view in <%0> second.";
        field_a = "CTRL";
    }
}
