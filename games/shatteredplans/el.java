/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el {
    static String[] field_d;
    static boolean field_b;
    static volatile int field_e;
    static int field_c;
    private vp field_g;
    static int field_f;
    private vp field_a;

    final static ik a(int param0, int param1, int param2) {
        ik var3 = kr.b((byte) -103);
        var3.a(param2, (byte) 38, param1);
        return var3;
    }

    final void a(byte param0, vp param1) {
        if (param0 < 9) {
            return;
        }
        try {
            if (!(param1.field_p == null)) {
                param1.d(true);
            }
            param1.field_q = ((el) this).field_g;
            param1.field_p = ((el) this).field_g.field_p;
            param1.field_p.field_q = param1;
            param1.field_q.field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "el.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final vp a(boolean param0) {
        vp var2 = null;
        var2 = ((el) this).field_g.field_q;
        if (param0) {
          if (var2 == ((el) this).field_g) {
            ((el) this).field_a = null;
            return null;
          } else {
            ((el) this).field_a = var2.field_q;
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a(df param0, int param1, df param2) {
        try {
            if (param0.field_j != null) {
                param0.a(16);
            }
            param0.field_j = param2.field_j;
            param0.field_h = param2;
            if (param1 != 0) {
                Object var4 = null;
                el.a((df) null, 13, (df) null);
            }
            param0.field_j.field_h = param0;
            param0.field_h.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "el.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_d = null;
    }

    final int b(int param0) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = param0;
        vp var3 = ((el) this).field_g.field_q;
        while (((el) this).field_g != var3) {
            var3 = var3.field_q;
            var2++;
        }
        return var2;
    }

    final vp a(byte param0) {
        vp var2 = null;
        if (param0 == -68) {
          var2 = ((el) this).field_a;
          if (((el) this).field_g == var2) {
            ((el) this).field_a = null;
            return null;
          } else {
            ((el) this).field_a = var2.field_q;
            return var2;
          }
        } else {
          vp discarded$2 = ((el) this).a(true);
          var2 = ((el) this).field_a;
          if (((el) this).field_g == var2) {
            ((el) this).field_a = null;
            return null;
          } else {
            ((el) this).field_a = var2.field_q;
            return var2;
          }
        }
    }

    public el() {
        ((el) this).field_g = new vp();
        ((el) this).field_g.field_q = ((el) this).field_g;
        ((el) this).field_g.field_p = ((el) this).field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
    }
}
