/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pi {
    static int[] field_h;
    pi field_c;
    static pd field_g;
    long field_d;
    static int field_a;
    pi field_f;
    static int[] field_i;
    static boolean[] field_j;
    static boolean[] field_e;
    static ea field_b;
    static int[] field_l;
    static int[] field_m;
    static boolean[] field_k;

    final boolean c(int param0) {
        if (((pi) this).field_c == null) {
            return false;
        }
        if (param0 < 115) {
            ((pi) this).b(95);
            return true;
        }
        return true;
    }

    public static void d(int param0) {
        field_m = null;
        field_i = null;
        field_b = null;
        field_e = null;
        field_l = null;
        field_k = null;
        if (param0 != 2) {
          return;
        } else {
          field_g = null;
          field_j = null;
          field_h = null;
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        tm var4 = null;
        var3 = MinerDisturbance.field_ab;
        if (param1 == 2) {
          var4 = (tm) (Object) ec.field_c.b(106);
          if (var4 == null) {
            var4 = (tm) (Object) ok.field_b.b(127);
            if (var4 == null) {
              ja.field_u = ja.field_u + 1;
              if (-1501 > (ja.field_u ^ -1)) {
                if (ke.field_X[23]) {
                  ag.a(true, 22, -1, -1);
                  return;
                } else {
                  ag.a(true, 23, -1, -1);
                  return;
                }
              } else {
                return;
              }
            } else {
              var4.a(param0, (byte) 37);
              if (!var4.e(3)) {
                return;
              } else {
                pi discarded$2 = ok.field_b.e(63854);
                return;
              }
            }
          } else {
            var4.a(param0, (byte) 41);
            return;
          }
        } else {
          return;
        }
    }

    final void b(int param0) {
        if (null == ((pi) this).field_c) {
          return;
        } else {
          ((pi) this).field_c.field_f = ((pi) this).field_f;
          ((pi) this).field_f.field_c = ((pi) this).field_c;
          if (param0 != 34) {
            return;
          } else {
            ((pi) this).field_f = null;
            ((pi) this).field_c = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        field_a = 0;
        field_g = new pd();
        field_i = new int[34];
        field_m = new int[34];
        field_k = new boolean[34];
        field_j = new boolean[34];
        field_e = new boolean[34];
        field_m[11] = 2;
        field_m[27] = 2;
        field_m[23] = 2;
        field_m[16] = 5;
        field_m[7] = 3;
        field_m[31] = 5;
        field_m[22] = 3;
        field_m[4] = 2;
        field_m[28] = 3;
        field_m[18] = 2;
        field_m[2] = 5;
        field_m[12] = 3;
        field_m[30] = 5;
        field_m[9] = 3;
        field_m[3] = 10;
        field_m[8] = 3;
        field_m[24] = 2;
        field_m[29] = 3;
        field_m[1] = 3;
        field_m[32] = 2;
        field_m[14] = 2;
        field_m[10] = 1;
        field_m[20] = 5;
        field_m[5] = 2;
        field_m[0] = 2;
        field_m[15] = 3;
        field_m[19] = 3;
        field_m[17] = 10;
        field_m[33] = 3;
        field_m[13] = 5;
        field_m[26] = 3;
        field_m[6] = 2;
        field_m[25] = 1;
        field_m[21] = 3;
        var0 = 0;
        L0: while (true) {
          if (-35 >= (var0 ^ -1)) {
            var1 = 14;
            var0 = var1;
            L1: while (true) {
              if (29 < var1) {
                field_j[22] = true;
                field_k[17] = true;
                field_j[30] = true;
                field_k[23] = true;
                field_k[32] = true;
                field_j[25] = true;
              } else {
                field_e[var1] = true;
                var1++;
                continue L1;
              }
            }
          } else {
            field_i[var0] = 100 * field_m[var0];
            var0++;
            continue L0;
          }
        }
    }
}
