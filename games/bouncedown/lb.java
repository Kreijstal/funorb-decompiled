/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static int[] field_c;
    int field_e;
    static int field_b;
    int field_d;
    int field_f;
    int field_a;
    static wi field_g;

    final static void a(tj param0, int param1, int param2, tj param3) {
        gk.field_a = param1;
        jc.field_h = param0;
        ba.field_E = param3;
        l.a(na.field_k / 2, (byte) 127, na.field_e / 2);
        int var4 = -4 % ((param2 - -34) / 39);
        hh.b(param0.field_x + param0.field_F, param3.field_F, param0.field_F, param3.field_F + param3.field_x, 0);
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -3) {
            field_b = -113;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final static a[] a(int param0, ii param1) {
        int var2 = 0;
        int var3 = 0;
        a[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        a var6_ref = null;
        int var7 = 0;
        a[] var8 = null;
        a[] var9 = null;
        var7 = Bounce.field_N;
        var2 = param1.f(7, 8);
        if (param0 >= 42) {
          if (0 < var2) {
            return null;
          } else {
            var3 = param1.f(7, 12);
            var9 = new a[var3];
            var4 = var9;
            var5 = 0;
            L0: while (true) {
              if (var3 <= var5) {
                return var4;
              } else {
                if (!re.a(101, param1)) {
                  var6 = param1.f(7, wd.a(var5 + -1, -95));
                  var4[var5] = var9[var6];
                  var5++;
                  var5++;
                  continue L0;
                } else {
                  var6_ref = new a();
                  int discarded$12 = param1.f(7, 24);
                  int discarded$13 = param1.f(7, 24);
                  var6_ref.field_d = param1.f(7, 24);
                  int discarded$14 = param1.f(7, 9);
                  int discarded$15 = param1.f(7, 12);
                  int discarded$16 = param1.f(7, 12);
                  int discarded$17 = param1.f(7, 12);
                  var4[var5] = var6_ref;
                  var5++;
                  var5++;
                  continue L0;
                }
              }
            }
          }
        } else {
          lb.a((byte) 78);
          if (0 < var2) {
            return null;
          } else {
            L1: {
              var3 = param1.f(7, 12);
              var8 = new a[var3];
              var4 = var8;
              var5 = 0;
              if (var3 <= var5) {
                break L1;
              } else {
                L2: {
                  if (!re.a(101, param1)) {
                    var6 = param1.f(7, wd.a(var5 + -1, -95));
                    var4[var5] = var8[var6];
                    break L2;
                  } else {
                    var6_ref = new a();
                    int discarded$18 = param1.f(7, 24);
                    int discarded$19 = param1.f(7, 24);
                    var6_ref.field_d = param1.f(7, 24);
                    int discarded$20 = param1.f(7, 9);
                    int discarded$21 = param1.f(7, 12);
                    int discarded$22 = param1.f(7, 12);
                    int discarded$23 = param1.f(7, 12);
                    var4[var5] = var6_ref;
                    var5++;
                    break L2;
                  }
                }
                var5++;
                var5++;
                var5++;
                break L1;
              }
            }
            return var4;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_c = new int[16384];
        field_g = new wi(256);
    }
}
