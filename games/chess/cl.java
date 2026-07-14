/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static jc field_e;
    static long field_b;
    static km field_g;
    static int field_d;
    static String field_f;
    static km[][][][] field_c;
    static String field_a;
    static String field_h;

    final static void a(int param0, boolean param1) {
        Object var3 = null;
        if (param0 != -1) {
          var3 = null;
          fn[] discarded$2 = cl.a(-24, (nk) null);
          pi.field_c.a(param1, -1730123902);
          return;
        } else {
          pi.field_c.a(param1, -1730123902);
          return;
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        if ((bc.field_b ^ -1) > -71) {
          rf.b(80, 10 + bc.field_b);
          var1 = -102 % ((param0 - -89) / 32);
          return;
        } else {
          rf.b(80, 80);
          var1 = -102 % ((param0 - -89) / 32);
          return;
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_h = null;
        field_g = null;
        field_a = null;
        if (param0 != 12) {
          cl.a(40);
          field_c = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          return;
        }
    }

    final static fn[] a(int param0, nk param1) {
        int var2 = 0;
        int var3 = 0;
        fn[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        fn var6_ref = null;
        int var7 = 0;
        fn[] var8 = null;
        fn[] var9 = null;
        var7 = Chess.field_G;
        if (param0 == -4974) {
          var2 = param1.e(-16, 8);
          if (-1 > (var2 ^ -1)) {
            return null;
          } else {
            var3 = param1.e(param0 + 5082, 12);
            var9 = new fn[var3];
            var4 = var9;
            var5 = 0;
            L0: while (true) {
              if (var3 <= var5) {
                return var4;
              } else {
                if (!r.a(true, param1)) {
                  var6 = param1.e(-63, kb.a(-1 + var5, param0 ^ -4904));
                  var4[var5] = var9[var6];
                  var5++;
                  var5++;
                  continue L0;
                } else {
                  var6_ref = new fn();
                  int discarded$12 = param1.e(param0 + 5096, 24);
                  int discarded$13 = param1.e(-33, 24);
                  var6_ref.field_g = param1.e(-94, 24);
                  int discarded$14 = param1.e(123, 9);
                  int discarded$15 = param1.e(-18, 12);
                  int discarded$16 = param1.e(110, 12);
                  int discarded$17 = param1.e(105, 12);
                  var4[var5] = var6_ref;
                  var5++;
                  var5++;
                  continue L0;
                }
              }
            }
          }
        } else {
          field_g = null;
          var2 = param1.e(-16, 8);
          if (-1 > (var2 ^ -1)) {
            return null;
          } else {
            L1: {
              var3 = param1.e(param0 + 5082, 12);
              var8 = new fn[var3];
              var4 = var8;
              var5 = 0;
              if (var3 <= var5) {
                break L1;
              } else {
                L2: {
                  if (!r.a(true, param1)) {
                    var6 = param1.e(-63, kb.a(-1 + var5, param0 ^ -4904));
                    var4[var5] = var8[var6];
                    break L2;
                  } else {
                    var6_ref = new fn();
                    int discarded$18 = param1.e(param0 + 5096, 24);
                    int discarded$19 = param1.e(-33, 24);
                    var6_ref.field_g = param1.e(-94, 24);
                    int discarded$20 = param1.e(123, 9);
                    int discarded$21 = param1.e(-18, 12);
                    int discarded$22 = param1.e(110, 12);
                    int discarded$23 = param1.e(105, 12);
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
        field_g = new km(0, 0);
        field_f = "Create unrated game";
        field_c = new km[2][2][2][7];
        field_a = "Match by...";
        field_h = "Honour";
    }
}
