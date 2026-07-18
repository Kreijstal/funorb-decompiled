/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class td {
    static byte[] field_c;
    static int field_a;
    static long field_b;

    abstract void a(int param0);

    abstract int a(long param0, int param1);

    abstract long c(int param0);

    final int a(byte param0, long param1) {
        int var4 = 0;
        long var5 = 0L;
        var4 = 27 / ((-40 - param0) / 61);
        var5 = ((td) this).c(0);
        if (var5 > 0L) {
          pg.a(var5, -114);
          return ((td) this).a(param1, -122);
        } else {
          return ((td) this).a(param1, -122);
        }
    }

    public static void b() {
        field_c = null;
    }

    final static void a(int param0, boolean param1, String param2, boolean param3) {
        try {
            he.b((byte) -87);
            ci.field_f.k(31410);
            ok.field_a = new ff(ob.field_F, (String) null, lb.field_d, param3, param1);
            l.field_d = new rf(ci.field_f, (qg) (Object) ok.field_a);
            ci.field_f.b((qg) (Object) l.field_d, (byte) -71);
            int var4_int = 70 % ((param0 - 41) / 32);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "td.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(wf param0, byte param1, wf param2) {
        try {
            if (param2.field_f != null) {
                param2.c(5);
            }
            int var3_int = 0;
            param2.field_b = param0;
            param2.field_f = param0.field_f;
            param2.field_f.field_b = param2;
            param2.field_b.field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "td.L(" + (param0 != null ? "{...}" : "null") + ',' + 125 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
