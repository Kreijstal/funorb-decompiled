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
        if (param0) {
          return new vl[]{field_F, ae.field_I, rd.field_h};
        }
        pb.g(56);
        return new vl[]{field_F, ae.field_I, rd.field_h};
    }

    public static void g(int param0) {
        if (param0 == 50) {
          field_E = null;
          field_C = null;
          field_G = null;
          field_D = null;
          field_F = null;
          return;
        }
        pb.a(true);
        field_E = null;
        field_C = null;
        field_G = null;
        field_D = null;
        field_F = null;
    }

    pb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final li a(byte param0, li[] param1) {
        RuntimeException var3 = null;
        li stackIn_2_0 = null;
        li stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 84) {
            stackIn_4_0 = new li(rb.a((byte) -46, param1[0].b(param0 ^ -30412)));
            return stackIn_4_0;
          }
          stackIn_2_0 = (li) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_G = new String[]{"No room", "Save changes", "Squad full", "Already bidded", "Not enough money", "Empty team", "Too many auctions", "Stats maxed", "Single-player tutorial", "Diamond Division", "Promotion", "Choose a player to auction", "Kit menu", "Player Shop", "Squad Menu", "Pitch menu", "Auction menu", "League menu", "Create auction", "Bid on Auction", "Spend exp", "Auction house", "Trinkets Expansion", "Just-play mode", "Choose a trinket", "Please log in", "Complete training", "Achievements", "Menu Reset", "Confirm", "Confirm", "Your Auction", "Buyout Auction", "No Team", "Sell Player", "Kit Locked", "Kit Locked", "Buyout Auction", "Game Ended", "Unsigned Applet", "Complete Tutorial", "Trinket Refund", "Tournament Champion"};
        field_B = false;
        field_F = new vl("email");
        field_D = "Remove name";
        field_A = 50;
    }
}
