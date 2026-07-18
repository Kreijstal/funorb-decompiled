/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha extends w {
    private w field_Nb;
    static ud[] field_Pb;
    private w field_Ob;

    ha(long param0, ck param1, ck param2, int param3, w param4, String param5) {
        this(param0, (w) null, param4, param5);
        try {
            ((ha) this).field_Ob.field_I = param2;
            ((ha) this).field_Ob.field_sb = param1;
            ((ha) this).field_Ob.field_W = param3;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ha.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(int param0) {
        if (param0 != 3) {
            return;
        }
        field_Pb = null;
    }

    final static void e() {
        da.field_e = new tf();
        de.field_W.c((ce) (Object) da.field_e, (byte) 62);
    }

    final int c(int param0, int param1) {
        if (param1 != -4168) {
          ha.f(-106);
          return param0 + (((ha) this).field_Ob.a(true) - -((ha) this).field_Nb.a(true));
        } else {
          return param0 + (((ha) this).field_Ob.a(true) - -((ha) this).field_Nb.a(true));
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((ha) this).a(param0, 0, param2, param5, param3);
        this.d(param4, param1 ^ param1);
    }

    private final void d(int param0, int param1) {
        ((ha) this).field_Ob.a(((ha) this).field_Ob.a(true), param1, 0, ((ha) this).field_N, 0);
        int var3 = ((ha) this).field_Ob.field_mb - -param0;
        ((ha) this).field_Nb.a(((ha) this).field_mb + -var3, 0, 0, ((ha) this).field_N, var3);
    }

    private ha(long param0, w param1, w param2, String param3) {
        super(param0, (w) null);
        try {
            ((ha) this).field_Ob = new w(0L, param1);
            ((ha) this).field_Nb = new w(0L, param2);
            ((ha) this).field_Nb.field_Y = param3;
            ((ha) this).a(((ha) this).field_Ob, -16834);
            ((ha) this).a(((ha) this).field_Nb, -16834);
            ((ha) this).d(-126);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ha.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = 0;
          if (0 != (7 & param0)) {
            var2 = 8 - (param0 & 7);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != -126) {
          int discarded$2 = ha.a(-69, (byte) 62);
          var3 = param0 - -var2;
          return var3;
        } else {
          var3 = param0 - -var2;
          return var3;
        }
    }

    ha(long param0, ha param1, String param2) {
        this(param0, param1.field_Ob, param1.field_Nb, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Pb = new ud[3];
    }
}
