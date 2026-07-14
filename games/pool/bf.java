/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    static int field_k;
    int field_d;
    int field_b;
    static int[] field_i;
    int field_j;
    static String field_e;
    int field_f;
    static boolean field_g;
    static dd field_h;
    int field_a;
    int field_l;
    static vh field_c;

    final static long d(byte param0) {
        if (param0 < 117) {
            bf.c((byte) 7);
            return rl.a((byte) -104) + -ob.field_v;
        }
        return rl.a((byte) -104) + -ob.field_v;
    }

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var1 = 256;
        uh.field_t[0] = (var1 >> -1787850847) - ml.field_l[0];
        uh.field_t[1] = -ml.field_l[1];
        uh.field_t[2] = -ml.field_l[2] + var1;
        var2 = uh.field_t[1] * ml.field_l[4] + ml.field_l[3] * uh.field_t[0] - -(ml.field_l[5] * uh.field_t[2]) >> 1879067847;
        var3 = uh.field_t[2] * ml.field_l[8] + (ml.field_l[7] * uh.field_t[1] + uh.field_t[0] * ml.field_l[6]) >> -1426670841;
        uh.field_t[2] = ml.field_l[10] * uh.field_t[1] + uh.field_t[0] * ml.field_l[9] + ml.field_l[11] * uh.field_t[2] >> -945182032;
        if (uh.field_t[2] != 0) {
          uh.field_t[1] = var3 / uh.field_t[2] + 240;
          if (param0 >= 75) {
            uh.field_t[0] = var2 / uh.field_t[2] + 320;
            if (0 >= uh.field_t[2]) {
              return;
            } else {
              var4 = uh.field_t[0];
              uh.field_t[0] = -ml.field_l[0];
              var5 = uh.field_t[1];
              uh.field_t[2] = var1 + -ml.field_l[2];
              uh.field_t[1] = -ml.field_l[1];
              var6 = ml.field_l[4] * uh.field_t[1] + (ml.field_l[3] * uh.field_t[0] + uh.field_t[2] * ml.field_l[5]) >> -299591705;
              var7 = ml.field_l[7] * uh.field_t[1] + uh.field_t[0] * ml.field_l[6] + ml.field_l[8] * uh.field_t[2] >> -629509593;
              uh.field_t[2] = uh.field_t[2] * ml.field_l[11] + (uh.field_t[0] * ml.field_l[9] - -(uh.field_t[1] * ml.field_l[10])) >> -478222608;
              if (-1 != (uh.field_t[2] ^ -1)) {
                uh.field_t[0] = 320 - -(var6 / uh.field_t[2]);
                uh.field_t[1] = var7 / uh.field_t[2] + 240;
                if (uh.field_t[2] <= 0) {
                  return;
                } else {
                  qk.field_d = tj.c(uh.field_t[0] + -var4, var5 + -uh.field_t[1], 4096) << 643325251;
                  return;
                }
              } else {
                uh.field_t[2] = -1;
                uh.field_t[0] = 320 - -(var6 / uh.field_t[2]);
                uh.field_t[1] = var7 / uh.field_t[2] + 240;
                if (uh.field_t[2] <= 0) {
                  return;
                } else {
                  qk.field_d = tj.c(uh.field_t[0] + -var4, var5 + -uh.field_t[1], 4096) << 643325251;
                  return;
                }
              }
            }
          } else {
            field_c = null;
            uh.field_t[0] = var2 / uh.field_t[2] + 320;
            if (0 >= uh.field_t[2]) {
              return;
            } else {
              var4 = uh.field_t[0];
              uh.field_t[0] = -ml.field_l[0];
              var5 = uh.field_t[1];
              uh.field_t[2] = var1 + -ml.field_l[2];
              uh.field_t[1] = -ml.field_l[1];
              var6 = ml.field_l[4] * uh.field_t[1] + (ml.field_l[3] * uh.field_t[0] + uh.field_t[2] * ml.field_l[5]) >> -299591705;
              var7 = ml.field_l[7] * uh.field_t[1] + uh.field_t[0] * ml.field_l[6] + ml.field_l[8] * uh.field_t[2] >> -629509593;
              uh.field_t[2] = uh.field_t[2] * ml.field_l[11] + (uh.field_t[0] * ml.field_l[9] - -(uh.field_t[1] * ml.field_l[10])) >> -478222608;
              if (-1 == (uh.field_t[2] ^ -1)) {
                uh.field_t[2] = -1;
                uh.field_t[0] = 320 - -(var6 / uh.field_t[2]);
                uh.field_t[1] = var7 / uh.field_t[2] + 240;
                if (uh.field_t[2] <= 0) {
                  return;
                } else {
                  qk.field_d = tj.c(uh.field_t[0] + -var4, var5 + -uh.field_t[1], 4096) << 643325251;
                  return;
                }
              } else {
                uh.field_t[0] = 320 - -(var6 / uh.field_t[2]);
                uh.field_t[1] = var7 / uh.field_t[2] + 240;
                if (uh.field_t[2] <= 0) {
                  return;
                } else {
                  qk.field_d = tj.c(uh.field_t[0] + -var4, var5 + -uh.field_t[1], 4096) << 643325251;
                  return;
                }
              }
            }
          }
        } else {
          L0: {
            uh.field_t[2] = -1;
            uh.field_t[1] = var3 / uh.field_t[2] + 240;
            if (param0 >= 75) {
              break L0;
            } else {
              field_c = null;
              break L0;
            }
          }
          uh.field_t[0] = var2 / uh.field_t[2] + 320;
          if (0 >= uh.field_t[2]) {
            return;
          } else {
            var4 = uh.field_t[0];
            uh.field_t[0] = -ml.field_l[0];
            var5 = uh.field_t[1];
            uh.field_t[2] = var1 + -ml.field_l[2];
            uh.field_t[1] = -ml.field_l[1];
            var6 = ml.field_l[4] * uh.field_t[1] + (ml.field_l[3] * uh.field_t[0] + uh.field_t[2] * ml.field_l[5]) >> -299591705;
            var7 = ml.field_l[7] * uh.field_t[1] + uh.field_t[0] * ml.field_l[6] + ml.field_l[8] * uh.field_t[2] >> -629509593;
            uh.field_t[2] = uh.field_t[2] * ml.field_l[11] + (uh.field_t[0] * ml.field_l[9] - -(uh.field_t[1] * ml.field_l[10])) >> -478222608;
            if (-1 == (uh.field_t[2] ^ -1)) {
              uh.field_t[2] = -1;
              uh.field_t[0] = 320 - -(var6 / uh.field_t[2]);
              uh.field_t[1] = var7 / uh.field_t[2] + 240;
              if (uh.field_t[2] <= 0) {
                return;
              } else {
                qk.field_d = tj.c(uh.field_t[0] + -var4, var5 + -uh.field_t[1], 4096) << 643325251;
                return;
              }
            } else {
              uh.field_t[0] = 320 - -(var6 / uh.field_t[2]);
              uh.field_t[1] = var7 / uh.field_t[2] + 240;
              if (uh.field_t[2] <= 0) {
                return;
              } else {
                qk.field_d = tj.c(uh.field_t[0] + -var4, var5 + -uh.field_t[1], 4096) << 643325251;
                return;
              }
            }
          }
        }
    }

    final int a(int param0) {
        if (param0 <= 82) {
          int discarded$2 = ((bf) this).a((byte) -110);
          return (((bf) this).field_f + ((bf) this).field_a) / 2;
        } else {
          return (((bf) this).field_f + ((bf) this).field_a) / 2;
        }
    }

    public static void c(byte param0) {
        if (param0 < 28) {
          field_k = -55;
          field_e = null;
          field_c = null;
          field_i = null;
          field_h = null;
          return;
        } else {
          field_e = null;
          field_c = null;
          field_i = null;
          field_h = null;
          return;
        }
    }

    bf(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((bf) this).field_l = param3;
        ((bf) this).field_f = param2;
        ((bf) this).field_a = param0;
        ((bf) this).field_b = param4;
        ((bf) this).field_j = param1;
        ((bf) this).field_d = param5;
    }

    final int a(byte param0) {
        if (param0 != -127) {
          ((bf) this).field_j = 107;
          return (((bf) this).field_l + ((bf) this).field_j) / 2;
        } else {
          return (((bf) this).field_l + ((bf) this).field_j) / 2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Timer";
        field_i = new int[12];
    }
}
