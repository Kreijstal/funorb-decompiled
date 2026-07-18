/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rs extends qr {
    static pf field_Bb;
    private qr field_Ab;
    private qr field_xb;
    static int field_Fb;
    static vd field_Db;
    static String field_yb;
    static String field_zb;
    static th field_Cb;
    static qr field_Eb;

    private rs(long param0, qr param1, qr param2, String param3) {
        super(param0, (qr) null);
        try {
            ((rs) this).field_xb = new qr(0L, param1);
            ((rs) this).field_Ab = new qr(0L, param2);
            ((rs) this).field_Ab.field_z = param3;
            ((rs) this).a(4, ((rs) this).field_xb);
            ((rs) this).a(4, ((rs) this).field_Ab);
            ((rs) this).e((byte) -123);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "rs.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    rs(long param0, rs param1, String param2) {
        this(param0, param1.field_xb, param1.field_Ab, param2);
    }

    private final void b(int param0, byte param1) {
        ((rs) this).field_xb.a(((rs) this).field_xb.e(false), ((rs) this).field_mb, (byte) 69, 0, 0);
        int var3 = ((rs) this).field_xb.field_K + param0;
        ((rs) this).field_Ab.a(-var3 + ((rs) this).field_K, ((rs) this).field_mb, (byte) 112, 0, var3);
        int var4 = 8;
    }

    public static void h(int param0) {
        field_yb = null;
        field_zb = null;
        field_Eb = null;
        field_Bb = null;
        field_Cb = null;
        field_Db = null;
    }

    rs(long param0, bi param1, bi param2, int param3, qr param4, String param5) {
        this(param0, (qr) null, param4, param5);
        try {
            ((rs) this).field_xb.field_pb = param2;
            ((rs) this).field_xb.field_G = param3;
            ((rs) this).field_xb.field_Z = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "rs.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void g(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (im.field_c == null) {
          return;
        } else {
          var1 = (Object) (Object) im.field_c;
          synchronized (var1) {
            L0: {
              im.field_c = null;
              break L0;
            }
          }
          return;
        }
    }

    final int c(int param0, int param1) {
        if (param1 != 0) {
          field_Fb = 86;
          return ((rs) this).field_xb.e(false) + (param0 + ((rs) this).field_Ab.e(false));
        } else {
          return ((rs) this).field_xb.e(false) + (param0 + ((rs) this).field_Ab.e(false));
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((rs) this).a(param0, param4, (byte) 42, param5, param1);
        int var7 = 89 % ((1 - param2) / 60);
        this.b(param3, (byte) -34);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Fb = -1;
        field_Bb = new pf();
        field_yb = "To server list";
        field_zb = "Music: ";
    }
}
