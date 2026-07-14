/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends bd {
    static String field_y;
    static String field_v;
    static char[] field_u;
    private int field_w;
    private ik field_x;
    static boolean field_t;
    static boolean field_s;

    final static void b(int param0, int param1) {
        if (param0 != 8) {
            return;
        }
        ps.a(param1, true);
    }

    final void a(int param0, ha param1) {
        param1.field_l.a((byte) -119, (tc) (Object) new pj(((ua) this).field_x, ((ua) this).field_w, ((ua) this).field_m));
        if (param0 != 64) {
            return;
        }
        ((ua) this).field_x.a(param1, param0 + -1700635504);
    }

    final static byte[] a(int param0, int param1, byte[] param2, int param3) {
        byte[] var9 = null;
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3 <= 0) {
            var4 = param2;
        } else {
            var9 = new byte[param1];
            var4 = var9;
            for (var5_int = 0; var5_int < param1; var5_int++) {
                var9[var5_int] = param2[var5_int + param3];
            }
        }
        bw var5 = new bw();
        var5.b(200);
        var5.a((byte) -57, (long)(8 * param1), var4);
        if (param0 != -18423) {
            Object var8 = null;
            String discarded$0 = ua.a(44, (byte) 45, (String) null);
        }
        byte[] var6 = new byte[64];
        var5.a(var6, 0, true);
        return var6;
    }

    final static String a(int param0, byte param1, String param2) {
        if (param1 < 51) {
            Object var6 = null;
            ua.a((java.applet.Applet) null, 31, (String) null, false);
        }
        String var3 = pt.field_W[param0];
        String var4 = db.a(true, '_');
        String var5 = var3 + var4 + param2;
        return var5;
    }

    final static void a(java.applet.Applet param0, int param1, String param2, boolean param3) {
        try {
            if (!(!hd.field_n.startsWith("win"))) {
                if (br.a(param2, true)) {
                    return;
                }
            }
            int var4 = -80 / ((param1 - 12) / 48);
            try {
                param0.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                af.a((Throwable) null, 107, "MGR1: " + param2);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ua(ik param0, int param1, int param2) {
        ((ua) this).field_w = param1;
        ((ua) this).field_x = param0;
        ((ua) this).field_m = param2;
        if (0 > (((ua) this).field_w ^ -1)) {
        }
    }

    public static void e(int param0) {
        field_v = null;
        field_u = null;
        field_y = null;
        if (param0 != -4541) {
            ua.b(-26, 75);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Respect";
        field_u = new char[128];
        field_v = "Mute this player for 48 hours";
    }
}
