/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lha extends kl {
    int field_r;
    int field_q;
    private int field_n;
    static jpa field_l;
    int field_o;
    static String field_m;
    private int field_p;

    public final void a(int param0) {
        jaggl.OpenGL.glFramebufferTexture3DEXT(((lha) this).field_n, ((lha) this).field_p, ((lha) this).field_e, 0, 0, 0);
        int var2 = -20 % ((14 - param0) / 56);
        ((lha) this).field_n = -1;
        ((lha) this).field_p = -1;
    }

    lha(cka param0, int param1, int param2, int param3, int param4) {
        super(param0, 32879, param1, param3 * param2 * param4, false);
        ((lha) this).field_n = -1;
        ((lha) this).field_p = -1;
        ((lha) this).field_o = param4;
        ((lha) this).field_r = param2;
        ((lha) this).field_q = param3;
        ((lha) this).field_h.a(true, (kl) this);
        jaggl.OpenGL.glTexImage3Dub(((lha) this).field_e, 0, ((lha) this).field_c, ((lha) this).field_r, ((lha) this).field_q, ((lha) this).field_o, 0, sja.b(((lha) this).field_c, 20934), 5121, (byte[]) null, 0);
        ((lha) this).b(true, 3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((lha) this).field_h.a(true, (kl) this);
        jaggl.OpenGL.glCopyTexSubImage3D(((lha) this).field_e, param6, param3, param0, param2, param1, param4, param5, param7);
        jaggl.OpenGL.glFlush();
    }

    lha(cka param0, int param1, int param2, int param3, int param4, byte[] param5, int param6) {
        super(param0, 32879, param1, param4 * (param2 * param3), false);
        ((lha) this).field_n = -1;
        ((lha) this).field_p = -1;
        ((lha) this).field_o = param4;
        ((lha) this).field_r = param2;
        ((lha) this).field_q = param3;
        ((lha) this).field_h.a(true, (kl) this);
        jaggl.OpenGL.glPixelStorei(3317, 1);
        jaggl.OpenGL.glTexImage3Dub(((lha) this).field_e, 0, ((lha) this).field_c, ((lha) this).field_r, ((lha) this).field_q, ((lha) this).field_o, 0, param6, 5121, param5, 0);
        jaggl.OpenGL.glPixelStorei(3317, 4);
        ((lha) this).b(true, 3);
    }

    public static void a(byte param0) {
        field_l = null;
        field_m = null;
        if (param0 < 5) {
            lha.a((byte) 104);
        }
    }

    final static void a(String param0, String param1, byte param2, long param3, java.applet.Applet param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var8 = param4.getParameter("cookiehost");
                var7 = var8;
                var7 = var8;
                var9 = param1 + "=" + param0 + "; version=1; path=/; domain=" + var8;
                var7 = var9;
                var7 = var9;
                if (param2 >= 109) {
                  break L0;
                } else {
                  lha.a((byte) -114);
                  break L0;
                }
              }
              L1: {
                if (0L <= param3) {
                  var7 = var9 + "; Expires=" + ida.a(param3 * 1000L + bva.b((byte) -107), -1) + "; Max-Age=" + param3;
                  break L1;
                } else {
                  var7 = var9 + "; Discard;";
                  break L1;
                }
              }
              lb.a(param4, 19467, "document.cookie=\"" + var7 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var6 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "You do not have a suitable number of players for the current options.";
    }
}
