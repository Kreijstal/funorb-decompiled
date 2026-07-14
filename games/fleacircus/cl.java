/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static String field_c;
    static vc field_e;
    static String field_a;
    static int field_b;
    static int[] field_d;

    final static void a(byte param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        ih var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        ih var13 = null;
        int[] var15 = null;
        int[] var17 = null;
        Object var18 = null;
        hi var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        ia var20_ref = null;
        Object var21 = null;
        Object var22 = null;
        int[] var23 = null;
        Object var24 = null;
        ia var24_ref = null;
        Object var25 = null;
        hi var25_ref = null;
        Object var26 = null;
        ia var26_ref = null;
        int[] var27 = null;
        Object var28 = null;
        ia var28_ref = null;
        int[] var29 = null;
        int[] var30 = null;
        var18 = null;
        var19 = null;
        var20 = null;
        var21 = null;
        var22 = null;
        var24 = null;
        var25 = null;
        var26 = null;
        var28 = null;
        var8 = fleas.field_A ? 1 : 0;
        var13 = ae.field_a;
        if (param0 == -36) {
          var2 = var13.e(false);
          if (var2 == 0) {
            var11 = h.a((byte) -112);
            var30 = var11;
            var27 = var30;
            var17 = var27;
            var15 = var17;
            var3 = var15;
            var10 = var11;
            var4 = var10;
            var5 = var13;
            var6 = ((ni) (Object) var5).e(false);
            var7 = 0;
            L0: while (true) {
              if (var6 <= var7) {
                var28_ref = (ia) (Object) rj.field_i.c((byte) 47);
                if (var28_ref == null) {
                  k.c(-28354);
                  return;
                } else {
                  var28_ref.field_n = true;
                  var28_ref.field_k = var30[0];
                  var28_ref.field_i = var3;
                  var28_ref.c(-1);
                  return;
                }
              } else {
                var10[var7] = ((ni) (Object) var5).c((byte) -114);
                var7++;
                continue L0;
              }
            }
          } else {
            if (-2 != (var2 ^ -1)) {
              if (-3 == (var2 ^ -1)) {
                var26_ref = (ia) (Object) rj.field_i.c((byte) 47);
                if (var26_ref == null) {
                  k.c(-28354);
                  return;
                } else {
                  var26_ref.field_i = h.a((byte) -121);
                  var26_ref.field_n = true;
                  var26_ref.field_k = var26_ref.field_i[0];
                  var26_ref.c(-1);
                  return;
                }
              } else {
                ud.a("A1: " + ak.a(true), (Throwable) null, 0);
                k.c(-28354);
                return;
              }
            } else {
              var25_ref = (hi) (Object) bf.field_e.c((byte) 47);
              if (var25_ref == null) {
                k.c(param0 ^ 28386);
                return;
              } else {
                var25_ref.c(-1);
                return;
              }
            }
          }
        } else {
          field_c = null;
          var2 = var13.e(false);
          if (var2 == 0) {
            var11 = h.a((byte) -112);
            var29 = var11;
            var23 = var29;
            var17 = var23;
            var15 = var17;
            var3 = var15;
            var10 = var11;
            var4 = var10;
            var5 = var13;
            var6 = ((ni) (Object) var5).e(false);
            var7 = 0;
            L1: while (true) {
              if (var6 <= var7) {
                var24_ref = (ia) (Object) rj.field_i.c((byte) 47);
                if (var24_ref == null) {
                  k.c(-28354);
                  return;
                } else {
                  var24_ref.field_n = true;
                  var24_ref.field_k = var29[0];
                  var24_ref.field_i = var3;
                  var24_ref.c(-1);
                  return;
                }
              } else {
                var10[var7] = ((ni) (Object) var5).c((byte) -114);
                var7++;
                continue L1;
              }
            }
          } else {
            if (-2 != (var2 ^ -1)) {
              if (-3 == (var2 ^ -1)) {
                var20_ref = (ia) (Object) rj.field_i.c((byte) 47);
                if (var20_ref == null) {
                  k.c(-28354);
                  return;
                } else {
                  var20_ref.field_i = h.a((byte) -121);
                  var20_ref.field_n = true;
                  var20_ref.field_k = var20_ref.field_i[0];
                  var20_ref.c(-1);
                  return;
                }
              } else {
                ud.a("A1: " + ak.a(true), (Throwable) null, 0);
                k.c(-28354);
                return;
              }
            } else {
              var18_ref = (hi) (Object) bf.field_e.c((byte) 47);
              if (var18_ref == null) {
                k.c(param0 ^ 28386);
                return;
              } else {
                var18_ref.c(-1);
                return;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -2) {
          cl.a((byte) -43);
          field_d = null;
          field_a = null;
          field_c = null;
          field_e = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          field_c = null;
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "They cannot be directly removed, so be careful where you put them!";
        field_d = new int[40];
        field_b = -1;
    }
}
