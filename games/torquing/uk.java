/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static int[] field_a;
    static int[] field_b;
    private ta field_f;
    private int field_e;
    private ta[] field_c;
    private long field_d;

    final ta b(int param0) {
        ta var2 = null;
        ta var3 = null;
        int var4 = 0;
        var4 = Torquing.field_u;
        if (null != ((uk) this).field_f) {
          var2 = ((uk) this).field_c[(int)(((uk) this).field_d & (long)(((uk) this).field_e + param0))];
          L0: while (true) {
            if (((uk) this).field_f != var2) {
              if (((uk) this).field_f.field_l == ((uk) this).field_d) {
                var3 = ((uk) this).field_f;
                ((uk) this).field_f = ((uk) this).field_f.field_p;
                return var3;
              } else {
                ((uk) this).field_f = ((uk) this).field_f.field_p;
                continue L0;
              }
            } else {
              ((uk) this).field_f = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final ta a(long param0, int param1) {
        ta var4 = null;
        int var5_int = 0;
        ta var5 = null;
        int var6 = 0;
        var6 = Torquing.field_u;
        ((uk) this).field_d = param0;
        var4 = ((uk) this).field_c[(int)(param0 & (long)(((uk) this).field_e + -1))];
        ((uk) this).field_f = var4.field_p;
        L0: while (true) {
          if (var4 != ((uk) this).field_f) {
            if (param0 == ((uk) this).field_f.field_l) {
              var5 = ((uk) this).field_f;
              ((uk) this).field_f = ((uk) this).field_f.field_p;
              return var5;
            } else {
              ((uk) this).field_f = ((uk) this).field_f.field_p;
              continue L0;
            }
          } else {
            var5_int = -54 / ((24 - param1) / 36);
            ((uk) this).field_f = null;
            return null;
          }
        }
    }

    final void a(ta param0, long param1, int param2) {
        ta var5 = null;
        try {
            if (param2 != 0) {
                ta discarded$0 = ((uk) this).a(-67L, 6);
            }
            if (param0.field_j != null) {
                param0.h(0);
            }
            var5 = ((uk) this).field_c[(int)((long)(-1 + ((uk) this).field_e) & param1)];
            param0.field_p = var5;
            param0.field_j = var5.field_j;
            param0.field_j.field_p = param0;
            param0.field_p.field_j = param0;
            param0.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "uk.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static boolean a(boolean param0, int param1) {
        return ~param1 == ~(-param1 & param1);
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    uk(int param0) {
        int var2 = 0;
        ta var3 = null;
        ((uk) this).field_c = new ta[param0];
        ((uk) this).field_e = param0;
        for (var2 = 0; param0 > var2; var2++) {
            ta dupTemp$0 = new ta();
            var3 = dupTemp$0;
            ((uk) this).field_c[var2] = dupTemp$0;
            var3.field_p = var3;
            var3.field_j = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[256];
    }
}
