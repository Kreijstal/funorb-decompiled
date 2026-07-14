/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends kj {
    String field_gb;
    static qk field_db;
    String field_cb;
    static String field_fb;
    int field_eb;

    aa() {
        super(0L, (kj) null);
    }

    final static void a(ad param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        w var7 = null;
        w var8 = null;
        var6 = Main.field_T;
        var7 = na.field_r;
        var8 = var7;
        var8.h(param2, 0);
        ((w) var8).field_i = ((w) var8).field_i + 1;
        var4 = ((w) var8).field_i;
        var8.b(-9469, 1);
        var8.e(((ad) param0).field_p, param1 + 22742);
        var8.e(((ad) param0).field_r, 26040);
        var8.e(((ad) param0).field_m, 26040);
        var8.a(-246, ((ad) param0).field_k);
        var8.a(-246, ((ad) param0).field_l);
        var8.a(param1 ^ -3096, ((ad) param0).field_n);
        var8.a(param1 + -3544, ((ad) param0).field_s);
        var8.b(-9469, ((ad) param0).field_o.length);
        var5 = 0;
        L0: while (true) {
          if (((ad) param0).field_o.length <= var5) {
            if (param1 != 3298) {
              field_fb = (String) null;
              int discarded$4 = var8.b(var4, (byte) 5);
              var8.f(((w) var8).field_i + -var4, 8049);
              return;
            } else {
              int discarded$5 = var8.b(var4, (byte) 5);
              var8.f(((w) var8).field_i + -var4, 8049);
              return;
            }
          } else {
            var7.a(-246, ((ad) param0).field_o[var5]);
            var5++;
            continue L0;
          }
        }
    }

    public static void d(byte param0) {
        field_fb = null;
        field_db = null;
        if (param0 != -49) {
            ad var2 = (ad) null;
            aa.a((ad) null, 19, 27);
        }
    }

    static {
    }
}
