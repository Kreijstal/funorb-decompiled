/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DefaultPlayerFactory {
    static String field_a;
    static int field_b;

    final static PlayerStats createDefaultPlayer(boolean param0) {
        PlayerStats var2 = null;
        PlayerStats var1 = null;
        if (!param0) {
          var2 = new PlayerStats();
          var1 = var2;
          var1.power = 50;
          var1.speed = 50;
          var2.trinketIds = new int[]{110};
          var1.archetype = 4;
          var1.tackle = 50;
          return var1;
        }
        return (PlayerStats) null;
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          return;
        }
        field_a = null;
    }

    final static void buildSharedContextActions(byte param0) {
        if (param0 > 104) {
          ContextMenu.setMusicFadeOutStep(1, (byte) 60, ReceivedAuctionItem.field_E[3]);
          ContextMenu.setMusicFadeOutStep(2, (byte) 60, ReceivedAuctionItem.field_E[5]);
          NetworkArchiveRequest.a(0, Trinket.field_c, ReceivedAuctionItem.field_E[0], 2147483647);
          return;
        }
        field_b = 48;
        ContextMenu.setMusicFadeOutStep(1, (byte) 60, ReceivedAuctionItem.field_E[3]);
        ContextMenu.setMusicFadeOutStep(2, (byte) 60, ReceivedAuctionItem.field_E[5]);
        NetworkArchiveRequest.a(0, Trinket.field_c, ReceivedAuctionItem.field_E[0], 2147483647);
    }

    static {
        field_b = 3;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void buildSharedContextActions(int param0) {
        if (param0 > 104) {
          ContextMenu.setMusicFadeOutStep(1, (byte) 60, ReceivedAuctionItem.field_E[3]);
          ContextMenu.setMusicFadeOutStep(2, (byte) 60, ReceivedAuctionItem.field_E[5]);
          NetworkArchiveRequest.a(0, Trinket.field_c, ReceivedAuctionItem.field_E[0], 2147483647);
          return;
        }
        field_b = 48;
        ContextMenu.setMusicFadeOutStep(1, (byte) 60, ReceivedAuctionItem.field_E[3]);
        ContextMenu.setMusicFadeOutStep(2, (byte) 60, ReceivedAuctionItem.field_E[5]);
        NetworkArchiveRequest.a(0, Trinket.field_c, ReceivedAuctionItem.field_E[0], 2147483647);
    }
}
