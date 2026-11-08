/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TransformSupport {
    static Sprite field_b;
    static int[] field_a;
    static QuickChatDynamicCommand field_d;
    static String[][] field_c;
    static boolean field_e;

    final static int[] identityTransform(int param0) {
        if (param0 == -31121) {
          return new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        }
        return (int[]) null;
    }

    static long bitwiseAnd(long param0, long param1) {
        return param0 & param1;
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_a = null;
        int var1 = 34 % ((param0 + 21) / 40);
        field_d = null;
        field_c = (String[][]) null;
    }

    final static void advanceInterfaceTransitions(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          TransformSupport.identityTransform(-35);
          WhirlpoolHasher.advanceBottomPanelLayout((byte) -120);
          MenuSelection.advanceSlidingGamePanels(-13953);
          return;
        }
        WhirlpoolHasher.advanceBottomPanelLayout((byte) -120);
        MenuSelection.advanceSlidingGamePanels(-13953);
    }

    final static void clearLobbyState(int obfuscationGuard) {
        RuntimeException var1 = null;
        int var2 = 0;
        LobbyPlayer var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = Pool.field_O;
        try {
          LobbyGame.field_Ac = false;
          LookupRetrySupport.field_e = null;
          HighscoresScreen.field_L = null;
          if (obfuscationGuard != 0) {
            TransformSupport.sendChatFilterSettings(99, 12);
          }
          if (null != IntrusiveNode.field_i) {
            IntrusiveNode.field_i.clear((byte) 49);
            IntrusiveNode.field_i = null;
          }
          ModelOriginSupport.field_n = null;
          if (NetworkGameClient.field_A != null) {
            NetworkGameClient.field_A.clear((byte) 117);
            NetworkGameClient.field_A = null;
          }
          LoginEncryptionSupport.field_a = null;
          if (ValidationMessageWidget.field_W != null) {
            ValidationMessageWidget.field_W.clear((byte) 78);
            ValidationMessageWidget.field_W = null;
          }
          LobbyPlayer.field_Qb = null;
          if (ModelOriginSupport.field_n == null) {
            return;
          }
          var3 = (LobbyPlayer) (ModelOriginSupport.field_n.firstForIteration((byte) -127));
          while (var3 != null) {
            var3.unlinkNode(false);
            var3 = (LobbyPlayer) (ModelOriginSupport.field_n.nextForIteration(obfuscationGuard ^ 29));
          }
          ModelOriginSupport.field_n = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "mj.D(" + obfuscationGuard + ')');
        }
    }

    final static void sendChatFilterSettings(int opcode, int obfuscationGuard) {
        CipherPacketBuffer var2 = JaggrabDownloader.field_j;
        if (obfuscationGuard == 27712) {
          var2.writeCipheredOpcode(false, opcode);
          var2.writeByte(2, false);
          var2.writeByte(4, false);
          var2.writeByte(HuffmanCodec.packChatFilterModes(true), false);
          return;
        }
        TransformSupport.advanceInterfaceTransitions(true);
        var2.writeCipheredOpcode(false, opcode);
        var2.writeByte(2, false);
        var2.writeByte(4, false);
        var2.writeByte(HuffmanCodec.packChatFilterModes(true), false);
    }

    static {
        field_d = new QuickChatDynamicCommand(10, 2, 2, 0);
    }
}
