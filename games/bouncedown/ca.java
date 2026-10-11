/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    static int[] field_a;
    static gk field_e;
    static int[] field_c;
    static fe field_b;
    static ef field_d;

    final static void a(boolean param0) {
        ud dupTemp$4 = null;
        ud dupTemp$0 = null;
        ud dupTemp$1 = null;
        ud dupTemp$2 = null;
        ud dupTemp$3 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean[] var5 = null;
        int var6 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var3Lifetime1;
        var4 = Bounce.field_N;
        try {
          var5 = new boolean[]{false, false, param0};
          var1 = var5;
          for (var2 = 0; vk.field_b > var2; var2++) {
            if (he.field_n[var2].field_l == -1) {
              var5[var2] = true;
            }
            if (0 < he.field_n[var2].field_l) {
              var5[he.field_n[var2].field_l - 1] = true;
            }
            he.field_n[var2].field_l = 0;
          }
          for (var2Lifetime1 = 0; var2Lifetime1 < vk.field_b; var2Lifetime1++) {
            if (var5[var2Lifetime1] &&
              0 == he.field_n[var2Lifetime1].field_i) {
              he.field_n[var2Lifetime1].field_i = 100;
              dupTemp$4 = he.field_n[var2Lifetime1];
              dupTemp$4.field_n = dupTemp$4.field_n - 1;
              he.field_n[var2Lifetime1].field_q = -4.0;
              he.field_n[var2Lifetime1].field_t = -1;
            }
          }
          for (var2Lifetime2 = vk.field_b; var2Lifetime2 < 3; var2Lifetime2++) {
            ua.field_c[-3 + ua.field_b + var2Lifetime2].field_h = 580.0;
          }
          for (var2Lifetime3 = 0; var2Lifetime3 < vk.field_b; var2Lifetime3++) {
            if (he.field_n[var2Lifetime3].field_n <= 0 &&
              he.field_n[var2Lifetime3].field_p == 0) {
              he.field_n[var2Lifetime3].field_j = -100.0;
              he.field_n[var2Lifetime3].field_t = -1;
            }
            ua.field_c[var2Lifetime3 + (ua.field_b - 3)].field_c = he.field_n[var2Lifetime3].field_u;
            ua.field_c[var2Lifetime3 + (-3 + ua.field_b)].field_h = he.field_n[var2Lifetime3].field_j - 0.88 * he.field_n[var2Lifetime3].field_e;
            ua.field_c[ua.field_b - 3 + var2Lifetime3].field_b = (int)(he.field_n[var2Lifetime3].field_e / 2.0);
            if (ua.field_b - 3 <= he.field_n[var2Lifetime3].field_t) {
              var3 = he.field_n[var2Lifetime3].field_t - ua.field_b + 3;
              if (he.field_n[var2Lifetime3].field_o > he.field_n[var3].field_o + 16.0) {
                he.field_n[var2Lifetime3].field_l = 1 + var3;
                he.field_n[var2Lifetime3].field_q = -4.0;
                he.field_n[var2Lifetime3].field_t = -1;
                if (wd.field_x) {
                  nj.field_l.a(il.field_a[9], 100, 96 * md.field_w / 256);
                }
                if (he.field_n[var3].field_i <= 0) {
                  he.field_n[var3].field_p = 2;
                  he.field_n[var3].field_f = 99;
                }
              }
              if (he.field_n[var3].field_d > 0.0 &&
                he.field_n[var3].field_j > he.field_n[var2Lifetime3].field_j) {
                he.field_n[var3].field_l = var2Lifetime3 + 1;
                he.field_n[var2Lifetime3].field_q = -4.0;
                he.field_n[var2Lifetime3].field_t = -1;
                if (wd.field_x) {
                  nj.field_l.a(il.field_a[11], 100, 96 * md.field_w / 256);
                }
                if (0 >= he.field_n[var2Lifetime3].field_i) {
                  he.field_n[var2Lifetime3].field_p = 3;
                  he.field_n[var2Lifetime3].field_f = 10;
                }
              }
            }
          }
          for (var2Lifetime4 = 0; var2Lifetime4 < vk.field_b; var2Lifetime4++) {
            var6 = 1 + var2Lifetime4;
            var3Lifetime1 = var6;
            while (var6 < vk.field_b) {
              if (he.field_n[var2Lifetime4].field_j > he.field_n[var6].field_j - he.field_n[var6].field_e + 5.0 &&
                -he.field_n[var2Lifetime4].field_e + he.field_n[var2Lifetime4].field_j + 5.0 < he.field_n[var6].field_j &&
                var2Lifetime4 != var6 &&
                he.field_n[var2Lifetime4].field_e / 2.0 + he.field_n[var2Lifetime4].field_u > he.field_n[var6].field_u - he.field_n[var6].field_e / 2.0 &&
                he.field_n[var6].field_e / 2.0 + he.field_n[var6].field_u > -(he.field_n[var2Lifetime4].field_e / 2.0) + he.field_n[var2Lifetime4].field_u) {
                if (!(he.field_n[var2Lifetime4].field_u < he.field_n[var6].field_u)) {
                  dupTemp$0 = he.field_n[var2Lifetime4];
                  dupTemp$0.field_c = dupTemp$0.field_c + (he.field_n[var2Lifetime4].field_o + he.field_n[var6].field_o) / he.field_n[var2Lifetime4].field_o;
                  dupTemp$1 = he.field_n[var6];
                  dupTemp$1.field_c = dupTemp$1.field_c - (he.field_n[var6].field_o + he.field_n[var2Lifetime4].field_o) / he.field_n[var6].field_o;
                } else {
                  dupTemp$2 = he.field_n[var2Lifetime4];
                  dupTemp$2.field_c = dupTemp$2.field_c - (he.field_n[var2Lifetime4].field_o + he.field_n[var6].field_o) / he.field_n[var2Lifetime4].field_o;
                  dupTemp$3 = he.field_n[var6];
                  dupTemp$3.field_c = dupTemp$3.field_c + (he.field_n[var6].field_o + he.field_n[var2Lifetime4].field_o) / he.field_n[var6].field_o;
                }
                if (he.field_n[var2Lifetime4].field_d > 0.0 ||
                  0.0 < he.field_n[var6].field_d) {
                  if (wd.field_x) {
                    nj.field_l.a(il.field_a[11], 100, md.field_w * 96 / 256);
                  } else {
                    if (wd.field_x) {
                      nj.field_l.a(il.field_a[14], 100, 96 * md.field_w / 256);
                    }
                  }
                }
                if (he.field_n[var2Lifetime4].field_d > 0.0 &&
                  he.field_n[var6].field_j < he.field_n[var2Lifetime4].field_j) {
                  he.field_n[var2Lifetime4].field_l = var6 + 1;
                  he.field_n[var2Lifetime4].field_d = 0.0;
                  if (he.field_n[var6].field_i <= 0) {
                    he.field_n[var6].field_p = 3;
                    he.field_n[var6].field_f = 10;
                  }
                }
                if (0.0 < he.field_n[var6].field_d &&
                  he.field_n[var2Lifetime4].field_j < he.field_n[var6].field_j) {
                  he.field_n[var6].field_l = 1 + var2Lifetime4;
                  he.field_n[var6].field_d = 0.0;
                  if (0 >= he.field_n[var2Lifetime4].field_i) {
                    he.field_n[var2Lifetime4].field_p = 3;
                    he.field_n[var2Lifetime4].field_f = 10;
                  }
                }
              }
              var6++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1_ref), "ca.C(" + param0 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if ((param0 & 7) != 0) {
          var2 = 8 - (7 & param0);
        }
        int var3 = param0 + var2;
        if (param1 != 27) {
          ca.a(-69, (byte) 34);
        }
        return var3;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -79) {
          return;
        }
        field_e = null;
        field_d = null;
        field_c = null;
        field_b = null;
    }

    static {
        field_c = new int[8192];
    }
}
