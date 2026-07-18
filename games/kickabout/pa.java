/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends dg {
    static String field_i;
    private int field_h;
    private ut field_k;
    static String field_j;
    static fn[] field_g;

    public static void c() {
        field_j = null;
        field_g = null;
        field_i = null;
    }

    final static void a(gn param0, gn param1, byte param2) {
        try {
            if (!(param0.field_b == null)) {
                param0.c((byte) -109);
            }
            param0.field_d = param1.field_d;
            param0.field_b = param1;
            param0.field_b.field_d = param0;
            param0.field_d.field_b = param0;
            int var3_int = -56 % ((84 - param2) / 35);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "pa.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        Object var7 = null;
        if (param4 == 3) {
          if (null != ((pa) this).field_k) {
            if (((pa) this).field_k.field_o == param3) {
              return;
            } else {
              ae.a(false, (byte) -52, ((pa) this).field_h, param3, 13386922).c(param0, param2);
              return;
            }
          } else {
            ae.a(false, (byte) -52, ((pa) this).field_h, param3, 13386922).c(param0, param2);
            return;
          }
        } else {
          var7 = null;
          pa.a((gn) null, (gn) null, (byte) 126);
          if (null != ((pa) this).field_k) {
            if (((pa) this).field_k.field_o == param3) {
              return;
            } else {
              ae.a(false, (byte) -52, ((pa) this).field_h, param3, 13386922).c(param0, param2);
              return;
            }
          } else {
            ae.a(false, (byte) -52, ((pa) this).field_h, param3, 13386922).c(param0, param2);
            return;
          }
        }
    }

    pa(boolean param0) {
        ((pa) this).field_h = param0 ? 1 : 0;
    }

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var1 = (ea.field_a - 640) / 2;
        var2 = rb.field_Bb * rb.field_Bb;
        var3 = var2 - ns.field_a * ns.field_a;
        if (param0 <= 81) {
          field_j = null;
          ss.field_c.a(true, 199, var1 + -(199 * var3 / var2), 90, -90 + (on.field_f - 124));
          af.field_d.a(true, 438, 202 + var1 + 438 * var3 / var2, 0, -4 + (-120 + on.field_f));
          return;
        } else {
          ss.field_c.a(true, 199, var1 + -(199 * var3 / var2), 90, -90 + (on.field_f - 124));
          af.field_d.a(true, 438, 202 + var1 + 438 * var3 / var2, 0, -4 + (-120 + on.field_f));
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Click to turn off the buyout for this auction";
        field_j = "Off";
    }
}
