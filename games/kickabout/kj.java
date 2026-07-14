/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static String field_c;
    int field_a;
    static byte[][] field_b;

    final static void a(int param0, int param1) {
        np.field_Jb.a((gn) (Object) new pv(param1), 3);
        if (param0 != 63) {
            field_c = null;
        }
    }

    final static ot a(int param0, int param1, up param2, int param3, int param4, boolean param5) {
        int var6_int = 0;
        long var6 = 0L;
        vs var7 = null;
        int var8 = 0;
        boolean stackIn_11_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_13_0 = false;
        int stackIn_13_1 = 0;
        boolean stackOut_10_0 = false;
        boolean stackOut_12_0 = false;
        int stackOut_12_1 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_11_1 = 0;
        var8 = Kickabout.field_G;
        var6_int = param1;
        L0: while (true) {
          if ((var6_int ^ -1) <= -65) {
            var6 = nj.a(-53);
            if (-bk.field_b + var6 >= 80L) {
              if (ra.field_G == null) {
                bk.field_b = var6;
                ue.field_f[63].a(param1 + 184, param3, param0, param2, param5, param4);
                dc.a(63, (byte) 88);
                return ue.field_f[0].field_h;
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            var7 = ue.field_f[var6_int];
            if (param0 == var7.field_e) {
              if (param4 == var7.field_b) {
                if (param3 == var7.field_a) {
                  if (var7.field_d.b((byte) -98, param2)) {
                    L1: {
                      stackOut_10_0 = var7.field_j;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (param5) {
                        stackOut_12_0 = stackIn_12_0;
                        stackOut_12_1 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L1;
                      } else {
                        stackOut_11_0 = stackIn_11_0;
                        stackOut_11_1 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        break L1;
                      }
                    }
                    if ((stackIn_13_0 ? 1 : 0) != stackIn_13_1) {
                      dc.a(var6_int, (byte) 46);
                      return ue.field_f[0].field_h;
                    } else {
                      var6_int++;
                      continue L0;
                    }
                  } else {
                    var6_int++;
                    continue L0;
                  }
                } else {
                  var6_int++;
                  continue L0;
                }
              } else {
                var6_int++;
                continue L0;
              }
            } else {
              var6_int++;
              continue L0;
            }
          }
        }
    }

    final static void a(byte param0) {
        wh discarded$0 = sp.c(44, -96);
        int var1 = 45 % ((param0 - -37) / 58);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    kj(int param0) {
        ((kj) this).field_a = param0;
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 >= -35) {
            field_c = null;
        }
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Kickabout.field_G;
        on.f(param2, param1, 1 + param4, 10000536);
        on.f(param2, param3 + param1, param4 + 1, param0);
        int var5 = 1;
        if (!(param1 - -var5 >= on.field_e)) {
            var5 = -param1 + on.field_e;
        }
        int var6 = param3;
        if (param1 - -var6 > on.field_h) {
            var6 = on.field_h - param1;
        }
        for (var7 = var5; var6 > var7; var7++) {
            var8 = 152 + var7 * 48 / param3;
            var9 = var8 | (var8 << 1054704968 | var8 << -1218881264);
            on.field_a[(param1 + var7) * on.field_g - -param2] = var9;
            on.field_a[param4 + (param2 + (var7 + param1) * on.field_g)] = var9;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Online Auctions";
    }
}
