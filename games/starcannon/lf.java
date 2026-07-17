/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends kc {
    static int field_cb;
    private String field_db;
    private String field_X;
    static int field_ab;
    static ue field_eb;
    private boolean field_fb;
    private boolean field_Y;
    private fa field_W;
    static String[] field_gb;
    static fb[] field_bb;
    static int field_Z;
    static hl field_V;

    final void a(String param0, boolean param1, float param2, boolean param3) {
        try {
            if ((!((lf) this).field_Y ? 1 : 0) == (param1 ? 1 : 0)) {
                ((lf) this).field_Y = param1 ? true : false;
                if (((lf) this).field_Y) {
                    ((lf) this).field_W.b(8405024, 2, 4210752);
                    ((lf) this).field_W.field_D = true;
                } else {
                    ((lf) this).field_W.b(2113632, 2, 4210752);
                    if (!(!((lf) this).field_fb)) {
                        ((lf) this).field_W.field_D = false;
                    }
                }
            }
            ((lf) this).field_W.field_x = (int)(param2 / 100.0f * 65536.0f);
            if (!param3) {
                ((lf) this).l(37);
            }
            ((lf) this).field_db = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "lf.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void l(int param0) {
        ((lf) this).field_fb = true;
        if (param0 != 260) {
          field_V = null;
          ((lf) this).field_W.field_D = false;
          return;
        } else {
          ((lf) this).field_W.field_D = false;
          return;
        }
    }

    lf(tc param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((lf) this).field_X = param1;
            if (null != ((lf) this).field_X) {
                var3_int = tk.field_a.a(((lf) this).field_X, 260, tk.field_a.field_p);
                ((lf) this).b(300, (byte) 57, var3_int + 150);
            }
            ((lf) this).field_W = new fa(13, 50, 274, 30, 15, 2113632, 4210752);
            ((lf) this).field_Y = false;
            ((lf) this).field_fb = false;
            ((lf) this).field_W.field_D = true;
            ((lf) this).a(true, (uj) (Object) ((lf) this).field_W);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "lf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void c(int param0, byte param1, int param2) {
        int var4 = 0;
        var4 = -66 % ((param1 - -57) / 53);
        super.c(param0, (byte) -127, param2);
        tk.field_a.b(((lf) this).field_db, param0 - -(((lf) this).field_i >> 1), param2 + 103, 16777215, -1);
        if (null != ((lf) this).field_X) {
          ki.b(param0 + 20, 120 + param2 + -7, 260, 8421504);
          int discarded$2 = tk.field_a.a(((lf) this).field_X, param0 + 20, 120 + (param2 - -8), 260, 100, 16777215, -1, 1, 0, tk.field_a.field_p);
          return;
        } else {
          return;
        }
    }

    public static void e() {
        field_gb = null;
        field_eb = null;
        field_V = null;
        field_bb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = 0;
        field_ab = 0;
        field_gb = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
