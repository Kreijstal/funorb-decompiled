/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa implements Runnable {
    volatile la[] field_c;
    be field_g;
    static String field_a;
    static im field_d;
    volatile boolean field_h;
    volatile boolean field_b;
    static String[] field_i;
    static String field_e;
    static String field_f;

    final static String a(int param0, byte param1, int param2) {
        if (param1 != -2) {
            return null;
        }
        return param2 + "/" + param0;
    }

    final static df a(boolean param0, java.applet.Applet param1) {
        int var4 = 0;
        df var5 = null;
        int var6 = OrbDefence.field_D ? 1 : 0;
        String var2 = li.a(param1, "jagex-last-login-method", param0);
        if (var2 == null) {
            return jc.field_a;
        }
        df[] var3 = nd.a(-1);
        for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (!(!var5.a(-68, var2))) {
                return var5;
            }
        }
        return jc.field_a;
    }

    public final void run() {
        int var1_int = 0;
        la var2 = null;
        int var4 = OrbDefence.field_D ? 1 : 0;
        ((oa) this).field_b = true;
        try {
            while (!((oa) this).field_h) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = ((oa) this).field_c[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.a();
                    }
                }
                hb.a(10L, 116);
                vf.a((Object) null, 50, ((oa) this).field_g);
            }
        } catch (Exception exception) {
            Object var5 = null;
            pe.a((byte) -13, (Throwable) (Object) exception, (String) null);
        } finally {
            ((oa) this).field_b = false;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_i = null;
        field_d = null;
        field_a = null;
        field_f = null;
        if (param0 != 90) {
            field_d = null;
        }
    }

    oa() {
        ((oa) this).field_c = new la[2];
        ((oa) this).field_h = false;
        ((oa) this).field_b = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "No highscores";
        field_d = new im();
        field_i = new String[]{"<b>OBJECTIVE:<br><br>The Norbs are coming to attack your orbs and it is up to you to stop them! Build up your defences to push back the Norb advance. If the orbs are lost, you will fail!<br><br><b>CONTROLS:<br><br><img=0> - move your view<br><img=1> - select a turret type<br><img=2> - send in the next Norb wave<br><img=3> - construct or upgrade a turret.<br><img=4> - remove an existing turret.", "<b>ENERGY:<br><br>You gain energy over time from all your remaining orbs. You also gain energy from each Norb you destroy.<br><br>The more powerful turrets use lots of energy to construct, so you will have to save it up. If you manage to destroy one of the Norb bosses, you will be rewarded with a massive energy boost!", "<b>DEFENCES:<br><br><b><%0>Fast blast:<br><%0>Cheap, but weak.<br><b><%0>Chain shot:<br><%0>Short-ranged, yet bounces.<br><b><%0>Big shot:<br><%0>Powerful, with a large area of effect.<br><b><%0>Ice shot:<br><%0>Slows down Norbs.<br><b><%0>Beam blast:<br><%0>The pinnacle of anti-Norb defences!", "<b>NORMAL NORBS:<br><br><b><%0>Normo:<br><%0>Easy energy!<br><b><%0>Swarmo:<br><%0>Massively swarming!<br><b><%0>Zoomo:<br><%0>Fast and spinny!<br><b><%0>Tougho:<br><%0>Lots of health!", "<b>NASTY NORBS:<br><br><b><%0>Flybo:<br><%0>Cannot be hit by big shot or beam blast turrets!<br><b><%0>Bombo:<br><%0>Explodes on death!<br><b><%0>Chompo:<br><%0>Eats your turrets!<br><b><%0>Irono:<br><%0>Immune to big shots and ice shots!", "<b>TIPS:<br><br>If even one Norb reaches one of your orbs, it will be destroyed and become a new spawn point for more Norbs!<br><br>Turrets with a flashing light can be upgraded by clicking on them.<br><br>The Norbs are not as stupid as they might look; they will not always stay on the same route!", "<b>NEW NORBS:<br><br><b><%0>Sneako:<br><%0>Invisible unless hit with an electroshock turret!<br><b><%0>Splitto:<br><%0>Releases a swarm when destroyed!<br><br><b>NEW DEFENCES:<br><br><b><%0>Electroshock:<br><%0>Stuns groups of Norbs (and reveals sneakos)!<br><b><%0>Barrier:<br><%0>Deters Norbs, but takes damage if attacked!"};
        field_e = "Connection restored.";
        field_f = "Use this alternative as your account name";
    }
}
