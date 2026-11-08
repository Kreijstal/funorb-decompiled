/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GuestLoginSupport {
    static int[] field_a;
    static String field_b;

    final static void drawQuickChatToggleHint(byte param0, int param1, int param2) {
        MouseInputHandler.drawQuickChatToggleHint(16777215, FriendsListPanel.getHudOpacity(false, (byte) 66), param2, -1, param1, 0);
        if (param0 >= -126) {
          GuestLoginSupport.releaseStatics((byte) 70);
        }
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != -98) {
          field_a = (int[]) null;
        }
    }

    final static boolean isGuestLoginEnabled(int param0) {
        if (param0 != 3) {
          GuestLoginSupport.releaseStatics((byte) -84);
          return AuctionBidDialog.field_G;
        }
        return AuctionBidDialog.field_G;
    }

    static {
        field_b = "At the end of every game, you are awarded <col=ffff00>league points</col>.<br><br><br><br><br><br><br><img=0>Your team is promoted through the leagues as these accumulate - from the Pebble Playoffs all the way up to the Diamond<nbsp>Division!<br><br><img=0>There are no relegations in Kickabout. Once you reach the number of points required to enter a league, your score can't drop below that value.";
        field_a = new int[4];
        field_a[1] = 16;
        field_a[2] = 20;
        field_a[0] = 13;
        field_a[3] = 12;
    }
}
