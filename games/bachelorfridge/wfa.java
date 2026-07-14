/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wfa extends bca {
    static String field_q;
    static int field_s;
    static String field_r;

    wfa(int param0, nq param1) {
        super(param0, param1);
    }

    wfa(lu param0) {
        super(param0);
        ((wfa) this).field_k = param0.e((byte) 104);
        ((wfa) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if ((var2 ^ -1) > -1) {
                break;
            }
            ((wfa) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    final static kv a(String param0, vr param1, String param2, byte param3) {
        int var6 = -111 / ((23 - param3) / 32);
        int var4 = param1.a(param2, false);
        int var5 = param1.a((byte) 6, var4, param0);
        return bn.a(param1, (byte) -117, var5, var4);
    }

    final void a(op param0, int param1) {
        ((wfa) this).a(param0, (byte) -2);
        int var3 = 10 / ((param1 - 12) / 35);
    }

    final at a(int param0, gj param1) {
        Object var4 = null;
        if (param0 != 5) {
          var4 = null;
          kv discarded$2 = wfa.a((String) null, (vr) null, (String) null, (byte) -5);
          return (at) (Object) new uga(param1, (wfa) this);
        } else {
          return (at) (Object) new uga(param1, (wfa) this);
        }
    }

    public static void c(boolean param0) {
        field_q = null;
        field_r = null;
        if (param0) {
            Object var2 = null;
            kv discarded$0 = wfa.a((String) null, (vr) null, (String) null, (byte) -111);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "You can't use this move right now.";
        field_q = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
