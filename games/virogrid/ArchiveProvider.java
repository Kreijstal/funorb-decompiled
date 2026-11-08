/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveProvider {
    static ModelMesh field_c;
    static int field_a;
    static String field_b;

    final static String getJoinFailureMessage(String param0, int param1, byte param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 3) {
            stackIn_3_0 = PopupMenuHelpers.field_c;
            return stackIn_3_0;
          }
          if (param2 != 83) {
            stackIn_6_0 = (String) null;
            return stackIn_6_0;
          }
          if (param1 == 6) {
            stackIn_9_0 = HelpPopup.field_Eb;
            return stackIn_9_0;
          }
          if (param1 == 7) {
            stackIn_13_0 = CipherPacketBuffer.field_o;
            return stackIn_13_0;
          }
          if (param1 == 8) {
            stackIn_16_0 = LinkTextPainter.field_c;
            return stackIn_16_0;
          }
          if (param1 == 9) {
            stackIn_20_0 = QuickChatCategoryCache.field_e;
            return stackIn_20_0;
          }
          if (param1 == 10) {
            stackIn_24_0 = LobbyJoinTextGlobals.field_a;
            return stackIn_24_0;
          }
          if (11 == param1) {
            stackIn_27_0 = MusicPatchEnvelope.field_g;
            return stackIn_27_0;
          }
          if (param1 != 14) {
            return null;
          }
          stackIn_31_0 = MenuScreen.formatIndexedText(new String[]{param0}, SessionSeedHelpers.field_d, param2 ^ 81);
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("ba.E(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    abstract int getGroupProgress(int param0, int param1);

    final static void emptyStaticHook(int param0) {
        if (param0 != 14) {
          ArchiveProvider.releaseStatics(-71);
        }
    }

    abstract ArchiveIndex getIndex(byte param0);

    abstract byte[] getPackedGroup(int param0, int param1);

    public static void releaseStatics(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 14) {
          field_b = (String) null;
        }
    }

    static {
        field_b = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
