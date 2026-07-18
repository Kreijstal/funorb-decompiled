/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ib implements dg {
    private long field_b;
    static String field_d;
    static boolean field_a;
    static int field_c;
    static int field_e;

    final static void a(int param0, int[] param1, int param2, int param3, int param4) {
        int[] var9 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = Geoblox.field_C;
        try {
            while (true) {
                param4--;
                if (param4 < 0) {
                    break;
                }
                var9 = param1;
                int[] var5 = var9;
                var6 = param2;
                var7 = param3;
                var9[var6] = var7 + cd.a(var9[var6] >> 1, 8355711);
                param2++;
            }
            int var5_int = -30 % ((-2 - param0) / 40);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ib.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
    }

    public final String c(int param0) {
        if (!((ib) this).a(-26556)) {
          if (oa.a(param0 ^ 25670) >= 350L + ((ib) this).field_b) {
            if (param0 != -21666) {
              return null;
            } else {
              return ((ib) this).b((byte) -103);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    abstract String b(byte param0);

    public final void b(int param0) {
        ((ib) this).field_b = oa.a(param0 ^ 23811);
        if (param0 != -28133) {
            field_e = 55;
        }
    }

    final static void a(int param0, int param1, mg param2) {
        pk var3 = null;
        try {
            var3 = fj.field_q;
            var3.a(3, (byte) -82);
            var3.d((byte) 124, 5);
            var3.d((byte) -66, 0);
            var3.e(param2.field_i, 28695);
            var3.d((byte) -84, param2.field_f);
            var3.d((byte) 125, param2.field_l);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ib.DA(" + 3 + ',' + 5 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final lh a(byte param0) {
        if (param0 == -105) {
          if (!((ib) this).a(param0 ^ 26579)) {
            if (~(350L + ((ib) this).field_b) < ~oa.a(-12520)) {
              return bf.field_g;
            } else {
              return ((ib) this).e(32);
            }
          } else {
            return oj.field_d;
          }
        } else {
          field_e = -117;
          if (!((ib) this).a(param0 ^ 26579)) {
            if (~(350L + ((ib) this).field_b) < ~oa.a(-12520)) {
              return bf.field_g;
            } else {
              return ((ib) this).e(32);
            }
          } else {
            return oj.field_d;
          }
        }
    }

    final static void d(int param0) {
        Object var2 = null;
        f.b("", (String) null, 7697781);
        if (param0 != 24107) {
            field_a = false;
        }
    }

    abstract lh e(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Not achieved";
    }
}
