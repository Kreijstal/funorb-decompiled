/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HighscorePlayerRecord {
    String label;
    static EmailAvailabilityRequest field_g;
    static MenuInputState field_d;
    static String field_f;
    String playerName;
    static String field_b;
    static String field_c;
    boolean selectedForBest;

    final static void shutdownClient(int guard) {
        DisplayAndRatingSupport.exitFullscreen(guard ^ -25124);
        if (null != SpriteDecodeSupport.field_d) {
          Checkbox.detachCanvasInput(SpriteDecodeSupport.field_d, (byte) 118);
        }
        if (guard != 1) {
          field_c = (String) null;
          GradientOutlineTextPainter.clearSharedKeyHandler(2);
          MatchingTextValidator.c(true);
          KeyboardStateSupport.closeCacheServices(-16802);
          if (ClientException.a(-31879)) {
            QuickChatDynamicCommand.outgoingPackets.writeCipheredOpcode(1, true);
            ClientException.a(0, 30785);
            ConnectionSupport.closeTransport(16);
            return;
          }
          ConnectionSupport.closeTransport(16);
          return;
        }
        GradientOutlineTextPainter.clearSharedKeyHandler(2);
        MatchingTextValidator.c(true);
        KeyboardStateSupport.closeCacheServices(-16802);
        if (!ClientException.a(-31879)) {
          ConnectionSupport.closeTransport(16);
          return;
        }
        QuickChatDynamicCommand.outgoingPackets.writeCipheredOpcode(1, true);
        ClientException.a(0, 30785);
        ConnectionSupport.closeTransport(16);
    }

    final static void resendArchiveKeyRequests(int guard, int opcode) {
        int var3 = EscapeVector.obfuscationControl;
        try {
          if (guard >= -75) {
            field_c = (String) null;
          }
          ArchiveKeyRequest var4 = (ArchiveKeyRequest) (LegacyTextBlock.field_n.first(false));
          while (var4 != null) {
            BoundedRandomAccessFile.writeArchiveKeyRequest(-109, opcode, var4);
            var4 = (ArchiveKeyRequest) (LegacyTextBlock.field_n.next((byte) 70));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "di.A(" + guard + ',' + opcode + ')');
        }
    }

    public static void releaseStatics(int guard) {
        field_f = null;
        field_d = null;
        if (guard == 0) {
          field_g = null;
          field_c = null;
          field_b = null;
          return;
        }
        field_b = (String) null;
        field_g = null;
        field_c = null;
        field_b = null;
    }

    final static void configureLegacyMenuTheme(Sprite[] param0, int param1, int param2, int param3, int param4, int param5, BitmapFont param6, int param7, Sprite[] param8, boolean param9, int param10, int param11, BitmapFont param12, byte param13, int param14) {
        try {
          Sprite[] var16 = (Sprite[]) null;
          LegacyMenuThemeSupport.configureFromSprites(param8, param10, param1, param5, param11, 480, 0, param4, param3, MenuTitleSupport.field_e, param12, ModeProgressSupport.field_d, param2, param7, (Sprite[]) null, 2, param14, 0, ValidatedTextWidget.field_X, param6, param0);
          DebouncedValidator.a(false, param9);
          if (param13 > -5) {
            field_g = (EmailAvailabilityRequest) null;
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "di.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ',' + param11 + ',' + (param12 != null ? "{...}" : "null") + ',' + param13 + ',' + param14 + ')');
        }
    }

    static {
        field_b = "Fuel: ";
        field_c = "Warning! Auto-destruct timer initiated! Escape!";
    }
}
