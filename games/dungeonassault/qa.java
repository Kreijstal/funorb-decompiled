/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qa {
    static String field_d;
    static ef field_c;
    static int[][] field_a;
    static String[] field_e;
    static String field_b;

    abstract byte[] a(int param0, int param1);

    abstract int b(int param0, int param1);

    final static q[] a(int param0, String param1, String param2, nh param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 != 15322) {
          return null;
        } else {
          var4 = param3.a(param2, 1000);
          var5 = param3.a(0, param1, var4);
          return rf.a(var5, (byte) -71, param3, var4);
        }
    }

    abstract tm a(int param0);

    public static void b(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != -2544) {
          field_a = null;
          field_b = null;
          field_c = null;
          field_e = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<col=8B8B2E>Flee</col>";
        field_c = new ef();
        field_b = "Visit the Account Management section on the main site to view.";
        field_e = new String[]{"Special Abilities", "Some raiders, such as <%raidertype> possess a <%col_useskill>special ability</col>. You can find out what they are by reviewing the raider's description. When the raider's portrait in the party display is surrounded by a <%highlight>blue glow</col>, the ability is ready to use.<br><br><%command>Click the blue star symbol</col> at the bottom-right of the screen to employ it. Most abilities can only be used at specific times, and most can only be used once per raid.</col>"};
    }
}
