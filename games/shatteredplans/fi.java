/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends oh implements ag {
    ln field_k;
    static String field_i;
    static String field_j;
    static String field_h;
    private int field_l;
    static String field_m;

    final static String a(int param0, int param1, String param2) {
        if (!(3 != param0)) {
            return uo.field_c;
        }
        if (!(param0 != 6)) {
            return vi.field_m;
        }
        if (!(7 != param0)) {
            return dc.field_a;
        }
        if (8 == param0) {
            return jg.field_g;
        }
        if (9 == param0) {
            return vs.field_e;
        }
        if ((param0 ^ -1) == param1) {
            return l.field_d;
        }
        if (!((param0 ^ -1) != -12)) {
            return gl.field_b;
        }
        if (!((param0 ^ -1) != -15)) {
            return re.a(tl.field_o, 4371, new String[1]);
        }
        return null;
    }

    public static void a(int param0) {
        field_i = null;
        field_j = null;
        if (param0 < 20) {
            return;
        }
        field_m = null;
        field_h = null;
    }

    final static nk a(byte param0, nk param1, int[] param2) {
        int var3 = 70 / ((param0 - -38) / 36);
        nk var4 = new nk(0, 0, 0);
        var4.field_g = param1.field_g;
        var4.field_i = param1.field_i;
        var4.field_k = param2;
        var4.field_c = param1.field_c;
        var4.field_b = param1.field_b;
        var4.field_a = param1.field_a;
        var4.field_j = param1.field_j;
        var4.field_d = param1.field_d;
        return var4;
    }

    fi(ln param0, ln param1) {
        ((fi) this).field_k = param1;
        ((fi) this).field_l = (int)(0.5 + Math.sqrt((double)((-param0.field_A + param1.field_A) * (-param0.field_A + param1.field_A) + (param1.field_S + -param0.field_S) * (-param0.field_S + param1.field_S))));
    }

    public final int a(ag param0, int param1) {
        Object var4 = null;
        if (param1 >= -87) {
          var4 = null;
          int discarded$2 = ((fi) this).a((ag) null, 77);
          return -((fi) this).field_l + ((fi) (Object) param0).field_l;
        } else {
          return -((fi) this).field_l + ((fi) (Object) param0).field_l;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Animations play automatically at the start of the turn. Click to disable.";
        field_j = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_h = "System HUD frame";
        field_m = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
    }
}
