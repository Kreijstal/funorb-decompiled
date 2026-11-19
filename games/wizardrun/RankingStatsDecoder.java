/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RankingStatsDecoder {
    static int[] field_b;
    static int[] field_a;
    static String field_c;

    public static void releaseStatics(boolean param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0) {
          RankingStatsDecoder.beginAccountReconnect((byte) 31);
        }
    }

    final static void readPackedRankingStats(int param0, PacketBuffer param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          if (param0 != 2026380485) {
            RankingStatsDecoder.releaseStatics(false);
          }
          LoginChoicePanel.field_M = param1.readUnsignedShort(-14477) << 5;
          var2_int = param1.readUnsignedByte(255);
          LoginChoicePanel.field_M = LoginChoicePanel.field_M + (var2_int >> 3);
          FriendLookupState.field_a = 1835008 & var2_int << 18;
          FriendLookupState.field_a = FriendLookupState.field_a + (param1.readUnsignedShort(-14477) << 2);
          var2_intLifetime1 = param1.readUnsignedByte(255);
          FriendLookupState.field_a = FriendLookupState.field_a + (var2_intLifetime1 >> 6);
          Cp1252DecodingHelpers.field_a = (var2_intLifetime1 & 63) << 15;
          Cp1252DecodingHelpers.field_a = Cp1252DecodingHelpers.field_a + (param1.readUnsignedByte(255) << 7);
          var2_intLifetime2 = param1.readUnsignedByte(param0 ^ 2026380346);
          NanoTickClock.field_j = var2_intLifetime2 << 16 & 65536;
          Cp1252DecodingHelpers.field_a = Cp1252DecodingHelpers.field_a + (var2_intLifetime2 >> 1);
          NanoTickClock.field_j = NanoTickClock.field_j + param1.readUnsignedShort(-14477);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ci.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void beginAccountReconnect(byte param0) {
        if (10 == ArchiveRequest.field_t) {
          LabeledField.beginGameLogin(5);
          ArchiveRequest.field_t = 11;
        } else {
          if (!StripedProgressBar.supportsAccountReconnect((byte) 100)) {
            LabeledField.beginGameLogin(5);
            ArchiveRequest.field_t = 11;
          }
        }
        if (param0 >= -123) {
          field_b = (int[]) null;
        }
        BeveledFrameFactory.field_c = true;
    }

    static {
        field_b = new int[8192];
        field_a = new int[12];
        field_c = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
