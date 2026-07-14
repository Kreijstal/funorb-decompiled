/*
 * Decompiled by CFR-JS 0.4.0.
 */
class aa extends ps {
    private long field_g;
    private String field_i;
    static String field_h;
    static ut field_f;

    final static void a(byte param0, int param1, mp param2) {
        ml var3 = null;
        int var4 = 0;
        Object var5 = null;
        ml var6 = null;
        var6 = or.field_d;
        var3 = var6;
        var6.b(param1, (byte) 113);
        var6.field_n = var6.field_n + 1;
        var4 = var6.field_n;
        var6.a(116, 1);
        if (null == param2.field_o) {
          var6.a(102, 0);
          int discarded$4 = var6.a(var4, false);
          var6.field_n = var6.field_n - 4;
          param2.field_m = var6.k(4);
          var6.c(param0 ^ 42, -var4 + var6.field_n);
          if (param0 == 20) {
            return;
          } else {
            var5 = null;
            aa.a((byte) -56, 113, (mp) null);
            return;
          }
        } else {
          var6.a(111, param2.field_o.length);
          var6.a(0, param2.field_o.length, 1991220144, param2.field_o);
          int discarded$5 = var6.a(var4, false);
          var6.field_n = var6.field_n - 4;
          param2.field_m = var6.k(4);
          var6.c(param0 ^ 42, -var4 + var6.field_n);
          if (param0 == 20) {
            return;
          } else {
            var5 = null;
            aa.a((byte) -56, 113, (mp) null);
            return;
          }
        }
    }

    final void a(iw param0, int param1) {
        param0.a(((aa) this).field_g, -1781890008);
        param0.a((byte) -85, ((aa) this).field_i);
        if (param1 != 17053) {
            Object var4 = null;
            aa.a((byte) 56, -49, (mp) null);
        }
    }

    public static void b(byte param0) {
        if (param0 > -101) {
            field_f = null;
            field_h = null;
            field_f = null;
            return;
        }
        field_h = null;
        field_f = null;
    }

    final static long c(int param0) {
        if (param0 != 29680) {
            return nj.a(108) - ci.field_c;
        }
        return nj.a(108) - ci.field_c;
    }

    kj a(byte param0) {
        if (param0 > -77) {
            return null;
        }
        return ap.field_w;
    }

    aa(long param0, String param1) {
        ((aa) this).field_i = param1;
        ((aa) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "There are no auctions in progress.";
    }
}
