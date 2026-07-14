/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends ab implements dn {
    static String field_u;
    private mi[] field_y;
    static boolean field_t;
    private oo field_x;
    private String field_z;
    private int field_v;
    private hc field_w;
    private int[] field_A;

    jn(oo param0, hc param1, String param2) {
        super(0, 0, 288, 0, (ir) null);
        ((jn) this).field_v = 0;
        ((jn) this).field_x = param0;
        ((jn) this).field_z = param2;
        ((jn) this).field_w = param1;
        int var4 = null != ((jn) this).field_z ? ((jn) this).field_w.a(((jn) this).field_z, 260, ((jn) this).field_w.field_I) : 0;
        ((jn) this).a(22 + var4, 0, 0, 288, (byte) 127);
    }

    public static void h(int param0) {
        if (param0 > -55) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            jn.a((byte) -63, (java.applet.Applet) null);
        }
        field_u = null;
    }

    final mi a(no param0, int param1, String param2) {
        mi var4 = new mi(param2, param0);
        var4.field_e = (ir) (Object) new qb();
        if (param1 != 17547) {
            String var6 = (String) null;
            mi discarded$0 = ((jn) this).a((no) null, 91, (String) null);
        }
        int var5 = -2 + ((jn) this).field_n;
        ((jn) this).a(34 + ((jn) this).field_n, 0, 0, ((jn) this).field_q, (byte) 123);
        var4.a(30, 7, var5, -14 + ((jn) this).field_q, (byte) 123);
        ((jn) this).a((ea) (Object) var4, param1 + -17546);
        return var4;
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = AceOfSkies.field_G ? 1 : 0;
        for (var6 = 0; var6 < ((jn) this).field_v; var6++) {
            if (((jn) this).field_y[var6] == param1) {
                var7 = ((jn) this).field_A[var6];
                if (0 == (var7 ^ -1)) {
                    ((jn) this).field_x.h((byte) -67);
                    break;
                }
                oi.a(((jn) this).field_A[var6], 20665);
                break;
            }
        }
        var6 = 101 % ((param4 - -27) / 61);
    }

    final static void g(int param0) {
        if (param0 != 4) {
            field_t = true;
        }
        if (!(cn.b(true))) {
            if (!ml.field_p) {
                if (fa.field_b == null) {
                    fa.field_b = sc.a(false, 4);
                }
                if (fa.field_b.field_g) {
                    r.field_n = r.field_n & (fa.field_b.field_e ^ -1);
                    hg.field_D = hg.field_D | fa.field_b.field_e;
                    ml.field_p = true;
                    fa.field_b = null;
                }
            }
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        if (!(((jn) this).field_v < param1)) {
            return;
        }
        mi[] var7 = new mi[param1];
        mi[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < ((jn) this).field_v; var5++) {
            var7[var5] = ((jn) this).field_y[var5];
            var4[var5] = ((jn) this).field_A[var5];
        }
        ((jn) this).field_y = (mi[]) var3;
        if (param0 != 1) {
            return;
        }
        ((jn) this).field_A = var4;
        ((jn) this).field_v = param1;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            try {
                if (param0 < 118) {
                    field_t = true;
                }
                var2 = param1.getDocumentBase().getFile();
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if (!((var3 ^ -1) > -1)) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param1.getCodeBase(), var4);
                param1.getAppletContext().showDocument(jf.a(param1, var5, 56), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param0 <= 64) {
            ((jn) this).field_y = (mi[]) null;
        }
        this.a((byte) 119, param1, param2, param3);
        int discarded$0 = ((jn) this).field_w.a(((jn) this).field_z, ((jn) this).field_p + param3 + 14, 10 + ((jn) this).field_h + param2, ((jn) this).field_q + -28, ((jn) this).field_n, 16777215, -1, 0, 0, ((jn) this).field_w.field_I);
    }

    final void a(int param0, byte param1, String param2) {
        int var4 = ((jn) this).field_v;
        this.a(1, 1 + var4);
        ((jn) this).field_y[var4] = ((jn) this).a((no) this, 17547, param2);
        ((jn) this).field_A[var4] = param0;
        int var5 = -116 % ((param1 - 17) / 58);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Names cannot contain consecutive spaces";
    }
}
