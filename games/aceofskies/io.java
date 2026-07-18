/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io {
    private jc field_b;
    static String field_e;
    long field_d;
    static tf field_c;
    static String[] field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != -32537) {
            return;
        }
        field_a = null;
        field_e = null;
    }

    protected final void finalize() throws Throwable {
        ((io) this).field_b.a(-25160, ((io) this).field_d);
        super.finalize();
    }

    final static void a() {
        fp var5 = null;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        try {
            var5 = (fp) (Object) ks.field_d.d(268435455);
            while (var5 != null) {
                int discarded$0 = 2;
                int discarded$1 = 115;
                po.a(var5);
                var5 = (fp) (Object) ks.field_d.b((byte) 103);
            }
            int var3 = 0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "io.B(" + -117 + ',' + 2 + ')');
        }
    }

    io(jc param0, long param1, vj[] param2) {
        try {
            ((io) this).field_b = param0;
            ((io) this).field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "io.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Username: ";
        field_a = new String[]{"<b>Aim of the Game:<br><br>You're the best the good old RAF has to offer, and you're going to give those jerries a jolly good wallop! Do us proud - pip pip and all that rot! <br><br><b>Controls:<br><br><img=0> - move your plane<br><img=1> - double tap and hold to perform stall turns<br><img=2> -  hold to fire your gun, but make sure you don't overheat it!<br><img=3> - upgrade allied planes", "<b>Upgrades:<br><br>Upgrading the allied forces is the key to victory. Earn points with which to purchase upgrades by shooting down enemies. <br><br> <img=4> - speed increase<br> <img=5> - improved fire rate<br> <img=6> - improved manoeuvrability<br> <img=7> - extra armour<br> <img=8> - extra life <br> <img=9> - extra wingmen<br> <img=10> - score multiplier<br>", "<b>Wingmen:<br><br><br>Your wingmen are invaluable members of your team. When you call for backup, the wingmen that will come to your aid will be every bit as capable as you.<br>When you receive new upgrades, your wingmen will also receive those upgrades, improving the whole air force!<br>Keep in mind that you can't take all the credit for their kills, however, so you'll only get half points for the enemies they take out.", "<b>Tips:<br><br>Fly sharp and keep your eyes peeled - it can be hard to spot enemies among the clouds.<br>Upgrade wisely. One good wingman is easily a better companion than ten new recruits.<br>There have been rumours that the enemy is developing some strange new technologies, some of which might not even show up on the radar, so remain vigilant!<br>Keep a stiff upper lip at all times!"};
    }
}
