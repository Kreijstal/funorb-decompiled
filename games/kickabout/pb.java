/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb extends tm {
    static String[] field_G;
    static vl field_F;
    static boolean field_B;
    static int field_H;
    static uo field_C;
    static String field_D;
    static int field_A;
    static pd field_E;

    final static vl[] a(boolean param0) {
        if (!param0) {
          pb.g(56);
          return new vl[]{field_F, ae.field_I, rd.field_h};
        } else {
          return new vl[]{field_F, ae.field_I, rd.field_h};
        }
    }

    public static void g(int param0) {
        if (param0 != 50) {
          vl[] discarded$2 = pb.a(true);
          field_E = null;
          field_C = null;
          field_G = null;
          field_D = null;
          field_F = null;
          return;
        } else {
          field_E = null;
          field_C = null;
          field_G = null;
          field_D = null;
          field_F = null;
          return;
        }
    }

    pb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final li a(byte param0, li[] param1) {
        if (param0 != 84) {
          return null;
        } else {
          return new li(rb.a((byte) -46, param1[0].b(param0 ^ -30412)));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new String[]{"No room", "Save changes", "Squad full", "Already bidded", "Not enough money", "Empty team", "Too many auctions", "Stats maxed", "Single-player tutorial", "Diamond Division", "Promotion", "Choose a player to auction", "Kit menu", "Player Shop", "Squad Menu", "Pitch menu", "Auction menu", "League menu", "Create auction", "Bid on Auction", "Spend exp", "Auction house", "Trinkets Expansion", "Just-play mode", "Choose a trinket", "Please log in", "Complete training", "Achievements", "Menu Reset", "Confirm", "Confirm", "Your Auction", "Buyout Auction", "No Team", "Sell Player", "Kit Locked", "Kit Locked", "Buyout Auction", "Game Ended", "Unsigned Applet", "Complete Tutorial", "Trinket Refund", "Tournament Champion"};
        field_B = false;
        field_F = new vl("email");
        field_D = "Remove name";
        field_A = 50;
    }
}
