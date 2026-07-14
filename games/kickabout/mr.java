/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mr extends ga implements cw {
    static String field_F;
    static se field_Z;
    static String field_bb;
    static String[] field_X;
    static int[] field_Y;
    private l field_V;
    private int field_ab;
    static hd[] field_W;

    final void m(byte param0) {
        super.m((byte) -97);
        if (param0 >= -57) {
            mr.a(true, 93);
        }
        if (((mr) this).field_V != null) {
            ((mr) this).field_V.a(113);
        }
    }

    mr(String param0, jv param1, int param2) {
        super(param0, param1, param2);
    }

    final static void a(boolean param0, int param1) {
        vb.field_j = 0;
        pj.field_C = new int[3];
        if (param0) {
            Object var3 = null;
            ak discarded$0 = mr.a((ob) null, true);
        }
        at.field_Hb = param1;
        fu.field_b = new tv[param1 * 15];
    }

    public static void n(byte param0) {
        field_Z = null;
        if (param0 <= 40) {
            field_Y = null;
        }
        field_F = null;
        field_Y = null;
        field_bb = null;
        field_X = null;
        field_W = null;
    }

    public final l a(byte param0) {
        if (param0 > -107) {
            mr.a((byte) -36, 39);
        }
        return ((mr) this).field_V;
    }

    final static ak a(ob param0, boolean param1) {
        if (param1) {
            mr.n((byte) -2);
        }
        ak var2 = new ak(2);
        var2.field_h = param0;
        return var2;
    }

    final void a(byte param0, fd param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((mr) this).field_ab = -param2 + el.field_A + -((mr) this).field_t;
    }

    final static void a(byte param0, int param1) {
        int var3 = Kickabout.field_G;
        hn var2 = (hn) (Object) da.field_h.g(24009);
        while (var2 != null) {
            if (6 == var2.field_i) {
                var2.c((byte) -109);
            }
            var2 = (hn) (Object) da.field_h.c(33);
        }
        hn var2_ref = new hn(6, new int[1]);
        if (param0 < 16) {
            mr.n((byte) 103);
        }
        ii.a(var2_ref, 71);
    }

    final void a(int param0, l param1) {
        ((mr) this).field_V = param1;
        if (param0 != 6) {
            field_F = null;
        }
    }

    final String f(int param0) {
        if (!((mr) this).field_m) {
            return null;
        }
        if (((mr) this).field_u == null) {
            return null;
        }
        if (param0 != -1) {
            String discarded$0 = ((mr) this).f(54);
        }
        nq.b(n.field_m, 0, ((mr) this).field_n + -((mr) this).field_ab + el.field_A);
        return ((mr) this).field_u;
    }

    final static ld a(int param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = Kickabout.field_G;
        int var2 = param1.length();
        if (param0 != 6) {
            return null;
        }
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        return lm.field_F;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "<%0> has left the game.";
        field_bb = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
