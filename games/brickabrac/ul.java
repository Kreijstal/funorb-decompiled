/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends nm {
    static String field_j;
    String field_o;
    int field_n;
    static jp[] field_r;
    int field_i;
    static mf field_l;
    static hl field_m;
    static int field_p;
    static jp[] field_k;
    int field_q;

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            mg.c();
            lc.field_k = 11;
            v.field_a = new int[260];
            var2 = -120 / ((param0 - 32) / 49);
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 256) {
                var6 = 256;
                var1_int = var6;
                L2: while (true) {
                  if (v.field_a.length <= var6) {
                    break L0;
                  } else {
                    v.field_a[var6] = 255;
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var3 = 15.0;
                v.field_a[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var3) * 255.0);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "ul.D(" + param0 + ')');
        }
    }

    public static void a() {
        field_l = null;
        field_k = null;
        field_m = null;
        field_r = null;
        field_j = null;
    }

    final static jp[] a(int param0, int param1, byte param2, int param3) {
        if (param2 <= 34) {
            ul.a(19);
        }
        return hj.a(1, (byte) -110, param1, param3, param0);
    }

    final static void a(int param0, vm param1) {
        try {
            dc.field_e.a(256, false, 1048576, (byte) 22, 1000000, param1);
            int var5_int = 44;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ul.F(" + 1048576 + ',' + (param1 != null ? "{...}" : "null") + ',' + 256 + ',' + true + ',' + -104 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int discarded$0 = 255;
        int discarded$1 = 255;
        return la.a(param1);
    }

    final boolean b(boolean param0) {
        ((ul) this).field_n = ((ul) this).field_n - 256;
        if (param0) {
            return false;
        }
        int fieldTemp$0 = ((ul) this).field_q - 1;
        ((ul) this).field_q = ((ul) this).field_q - 1;
        return fieldTemp$0 != 0 ? true : false;
    }

    ul(int param0, int param1, int param2) {
        ((ul) this).field_n = param2;
        ((ul) this).field_q = 50;
        ((ul) this).field_i = param1;
        ((ul) this).field_o = Integer.toString(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_p = 256;
    }
}
