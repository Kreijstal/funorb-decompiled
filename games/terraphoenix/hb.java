/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hb extends nb {
    static int[] field_h;
    static int field_j;
    static ci field_m;
    static String field_o;
    static int field_l;
    private String field_q;
    private long field_k;
    static ci[] field_p;
    static int field_i;
    static int field_n;

    final static int a(gf param0, int param1, boolean param2) {
        if (param1 < 124) {
            field_o = null;
        }
        return param0.a(param2, (byte) -50);
    }

    final static void a(pk param0, int param1, int param2, String param3, em param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Terraphoenix.field_V;
        if (param2 > 36) {
          var5 = 0;
          var6 = -1;
          var7 = 1;
          L0: while (true) {
            if (var7 >= param3.length()) {
              return;
            } else {
              L1: {
                var8 = param3.charAt(var7);
                if (var8 != 60) {
                  break L1;
                } else {
                  var6 = param4.field_d[0] + (var5 >> -283400984) + param0.b(param3.substring(0, var7));
                  break L1;
                }
              }
              L2: {
                if (0 != (var6 ^ -1)) {
                  param4.field_d[var7] = var6;
                  break L2;
                } else {
                  L3: {
                    if (var8 != 32) {
                      break L3;
                    } else {
                      var5 = var5 + param1;
                      break L3;
                    }
                  }
                  param4.field_d[var7] = (var5 >> -805985624) - -param4.field_d[0] + param0.b(param3.substring(0, var7 - -1)) + -param0.a((char) var8);
                  break L2;
                }
              }
              if (62 == var8) {
                var6 = -1;
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    cm c(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            int discarded$0 = hb.a((gf) null, 1, true);
        }
        return hf.field_s;
    }

    final void a(byte param0, dh param1) {
        param1.a(((hb) this).field_k, 76);
        param1.a(-97, ((hb) this).field_q);
        if (param0 != -2) {
            Object var4 = null;
            ((hb) this).a((byte) -36, (dh) null);
        }
    }

    public static void d(int param0) {
        if (param0 >= -120) {
            field_n = 114;
        }
        field_h = null;
        field_m = null;
        field_p = null;
        field_o = null;
    }

    hb(long param0, String param1) {
        ((hb) this).field_q = param1;
        ((hb) this).field_k = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[]{2, 3, -1, 2, -1, -1, -1, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 71, 71, 71, -1, 72, 73, 74, 75, 76, 77, 78, 79};
        field_l = 9;
    }
}
