/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends rqa {
    static String field_p;
    static int field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        si.a(77, 62, param0[0].a(40));
        return new nc((Object) (Object) "void");
    }

    fb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        int[] var9 = null;
        faa var5 = null;
        int var6 = 0;
        int var7 = 0;
        iea var14 = null;
        int[] var10 = null;
        ea var11 = null;
        iea var12 = null;
        int var8 = VoidHunters.field_G;
        faa var13 = qga.field_b;
        int var2 = var13.e((byte) -89);
        if (var2 == param0) {
            var10 = oea.f((byte) -85);
            int[] var3 = var10;
            var9 = var10;
            int[] var4 = var9;
            var5 = var13;
            var6 = ((ds) (Object) var5).e((byte) -89);
            for (var7 = 0; var7 < var6; var7++) {
                var9[var7] = ((ds) (Object) var5).h(92);
            }
            var14 = (iea) (Object) klb.field_q.d(0);
            if (var14 == null) {
                ifb.l(-121);
                return;
            }
            var14.b(param0 ^ -3846);
        } else {
            if ((var2 ^ -1) == -2) {
                var11 = (ea) (Object) oaa.field_k.d(0);
                if (var11 == null) {
                    ifb.l(-125);
                    return;
                }
                var11.b(-3846);
            } else {
                if (var2 == 2) {
                    var12 = (iea) (Object) klb.field_q.d(0);
                    if (!(var12 != null)) {
                        ifb.l(-119);
                        return;
                    }
                    int[] discarded$0 = oea.f((byte) -80);
                    var12.b(-3846);
                } else {
                    gna.a((Throwable) null, "A1: " + hm.e(-13514), 0);
                    ifb.l(param0 + -117);
                }
            }
        }
    }

    final static String a(byte[] param0, byte param1) {
        if (param1 != -116) {
            return null;
        }
        return ac.a(1, param0.length, 0, param0);
    }

    public static void e(byte param0) {
        if (param0 != 42) {
            fb.e((byte) -19);
        }
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Spawn asteroid at mouse";
    }
}
