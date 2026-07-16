/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends gg {
    int field_t;
    int field_p;
    int field_l;
    long field_k;
    int[] field_m;
    static boolean field_r;
    int field_n;
    int field_s;
    int field_q;
    static String field_o;
    int field_u;

    public static void a(int param0) {
        field_o = null;
        if (param0 != 65535) {
            nf.a((byte) -8);
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        mk var3_ref_mk = null;
        int var3 = 0;
        le var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        ha var9 = null;
        byte[] var13 = null;
        var6 = stellarshard.field_B;
        var9 = ae.field_N;
        var2 = var9.f(4);
        if (param0 > 61) {
          if (0 != var2) {
            if (var2 == 1) {
              var3 = var9.b(false);
              var4 = (le) (Object) fg.field_G.b(-90);
              L0: while (true) {
                if (var4 != null) {
                  if (var4.field_o != var3) {
                    var4 = (le) (Object) fg.field_G.b((byte) 81);
                    continue L0;
                  } else {
                    if (var4 == null) {
                      oj.c(-2290);
                      return;
                    } else {
                      var4.c(20);
                      return;
                    }
                  }
                } else {
                  if (var4 == null) {
                    oj.c(-2290);
                    return;
                  } else {
                    var4.c(20);
                    return;
                  }
                }
              }
            } else {
              qe.a(-111, "A1: " + bh.b((byte) -127), (Throwable) null);
              oj.c(-2290);
              return;
            }
          } else {
            var3_ref_mk = (mk) (Object) gg.field_b.b(-96);
            if (var3_ref_mk == null) {
              oj.c(-2290);
              return;
            } else {
              L1: {
                var4_int = var9.f(4);
                if (-1 == (var4_int ^ -1)) {
                  var5 = null;
                  break L1;
                } else {
                  var13 = new byte[var4_int];
                  var9.a(0, (byte) -126, var4_int, var13);
                  break L1;
                }
              }
              var9.field_k = var9.field_k + 4;
              if (!var9.a(true)) {
                oj.c(-2290);
                return;
              } else {
                var3_ref_mk.c(20);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    nf(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((nf) this).field_m = param6;
        ((nf) this).field_n = param5;
        ((nf) this).field_l = param2;
        ((nf) this).field_q = param1;
        ((nf) this).field_t = param4;
        ((nf) this).field_s = param0;
        int fieldTemp$0 = sa.field_i;
        sa.field_i = sa.field_i + 1;
        ((nf) this).field_u = 65535 & fieldTemp$0;
        ((nf) this).field_p = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
