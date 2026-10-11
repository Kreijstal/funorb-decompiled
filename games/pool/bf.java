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
          return rl.a((byte) -104) - ob.field_v;
        }
        return rl.a((byte) -104) - ob.field_v;
    }

    final static void b(byte param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var1 = 256;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        uh.field_t[0] = (var1 >> 1) - ml.field_l[0];
        uh.field_t[1] = -ml.field_l[1];
        uh.field_t[2] = -ml.field_l[2] + var1;
        int var2 = uh.field_t[1] * ml.field_l[4] + ml.field_l[3] * uh.field_t[0] + ml.field_l[5] * uh.field_t[2] >> 7;
        int var3 = uh.field_t[2] * ml.field_l[8] + (ml.field_l[7] * uh.field_t[1] + uh.field_t[0] * ml.field_l[6]) >> 7;
        uh.field_t[2] = ml.field_l[10] * uh.field_t[1] + uh.field_t[0] * ml.field_l[9] + ml.field_l[11] * uh.field_t[2] >> 16;
        if (uh.field_t[2] == 0) {
          uh.field_t[2] = -1;
          uh.field_t[1] = var3 / uh.field_t[2] + 240;
          if (param0 < 75) {
            field_c = (vh) null;
          }
          uh.field_t[0] = var2 / uh.field_t[2] + 320;
          if (!(0 < uh.field_t[2])) {
            return;
          }
          var4 = uh.field_t[0];
          uh.field_t[0] = -ml.field_l[0];
          var5 = uh.field_t[1];
          uh.field_t[2] = var1 - ml.field_l[2];
          uh.field_t[1] = -ml.field_l[1];
          var6 = ml.field_l[4] * uh.field_t[1] + (ml.field_l[3] * uh.field_t[0] + uh.field_t[2] * ml.field_l[5]) >> 7;
          var7 = ml.field_l[7] * uh.field_t[1] + uh.field_t[0] * ml.field_l[6] + ml.field_l[8] * uh.field_t[2] >> 7;
          uh.field_t[2] = uh.field_t[2] * ml.field_l[11] + (uh.field_t[0] * ml.field_l[9] + uh.field_t[1] * ml.field_l[10]) >> 16;
          if (uh.field_t[2] != 0) {
            uh.field_t[0] = 320 + var6 / uh.field_t[2];
            uh.field_t[1] = var7 / uh.field_t[2] + 240;
            if (uh.field_t[2] > 0) {
              qk.field_d = tj.c(uh.field_t[0] - var4, var5 - uh.field_t[1], 4096) << 3;
              return;
            }
            return;
          }
          uh.field_t[2] = -1;
          uh.field_t[0] = 320 + var6 / uh.field_t[2];
          uh.field_t[1] = var7 / uh.field_t[2] + 240;
          if (uh.field_t[2] > 0) {
            qk.field_d = tj.c(uh.field_t[0] - var4, var5 - uh.field_t[1], 4096) << 3;
            return;
          }
          return;
        }
        uh.field_t[1] = var3 / uh.field_t[2] + 240;
        if (param0 < 75) {
          field_c = (vh) null;
          uh.field_t[0] = var2 / uh.field_t[2] + 320;
          if (!(0 < uh.field_t[2])) {
            return;
          }
          var4Lifetime1 = uh.field_t[0];
          uh.field_t[0] = -ml.field_l[0];
          var5Lifetime1 = uh.field_t[1];
          uh.field_t[2] = var1 - ml.field_l[2];
          uh.field_t[1] = -ml.field_l[1];
          var6Lifetime1 = ml.field_l[4] * uh.field_t[1] + (ml.field_l[3] * uh.field_t[0] + uh.field_t[2] * ml.field_l[5]) >> 7;
          var7Lifetime1 = ml.field_l[7] * uh.field_t[1] + uh.field_t[0] * ml.field_l[6] + ml.field_l[8] * uh.field_t[2] >> 7;
          uh.field_t[2] = uh.field_t[2] * ml.field_l[11] + (uh.field_t[0] * ml.field_l[9] + uh.field_t[1] * ml.field_l[10]) >> 16;
          if (uh.field_t[2] != 0) {
            uh.field_t[0] = 320 + var6Lifetime1 / uh.field_t[2];
            uh.field_t[1] = var7Lifetime1 / uh.field_t[2] + 240;
            if (uh.field_t[2] > 0) {
              qk.field_d = tj.c(uh.field_t[0] - var4Lifetime1, var5Lifetime1 - uh.field_t[1], 4096) << 3;
              return;
            }
            return;
          }
          uh.field_t[2] = -1;
          uh.field_t[0] = 320 + var6Lifetime1 / uh.field_t[2];
          uh.field_t[1] = var7Lifetime1 / uh.field_t[2] + 240;
          if (uh.field_t[2] > 0) {
            qk.field_d = tj.c(uh.field_t[0] - var4Lifetime1, var5Lifetime1 - uh.field_t[1], 4096) << 3;
            return;
          }
          return;
        }
        uh.field_t[0] = var2 / uh.field_t[2] + 320;
        if (!(0 < uh.field_t[2])) {
          return;
        }
        var4Lifetime2 = uh.field_t[0];
        uh.field_t[0] = -ml.field_l[0];
        var5Lifetime2 = uh.field_t[1];
        uh.field_t[2] = var1 - ml.field_l[2];
        uh.field_t[1] = -ml.field_l[1];
        var6Lifetime2 = ml.field_l[4] * uh.field_t[1] + (ml.field_l[3] * uh.field_t[0] + uh.field_t[2] * ml.field_l[5]) >> 7;
        var7Lifetime2 = ml.field_l[7] * uh.field_t[1] + uh.field_t[0] * ml.field_l[6] + ml.field_l[8] * uh.field_t[2] >> 7;
        uh.field_t[2] = uh.field_t[2] * ml.field_l[11] + (uh.field_t[0] * ml.field_l[9] + uh.field_t[1] * ml.field_l[10]) >> 16;
        if (uh.field_t[2] == 0) {
          uh.field_t[2] = -1;
          uh.field_t[0] = 320 + var6Lifetime2 / uh.field_t[2];
          uh.field_t[1] = var7Lifetime2 / uh.field_t[2] + 240;
          if (uh.field_t[2] > 0) {
            qk.field_d = tj.c(uh.field_t[0] - var4Lifetime2, var5Lifetime2 - uh.field_t[1], 4096) << 3;
            return;
          }
          return;
        }
        uh.field_t[0] = 320 + var6Lifetime2 / uh.field_t[2];
        uh.field_t[1] = var7Lifetime2 / uh.field_t[2] + 240;
        if (uh.field_t[2] > 0) {
          qk.field_d = tj.c(uh.field_t[0] - var4Lifetime2, var5Lifetime2 - uh.field_t[1], 4096) << 3;
          return;
        }
    }

    final int a(int param0) {
        if (param0 > 82) {
          return (this.field_f + this.field_a) / 2;
        }
        this.a((byte) -110);
        return (this.field_f + this.field_a) / 2;
    }

    public static void c(byte param0) {
        if (param0 >= 28) {
          field_e = null;
          field_c = null;
          field_i = null;
          field_h = null;
          return;
        }
        field_k = -55;
        field_e = null;
        field_c = null;
        field_i = null;
        field_h = null;
    }

    bf(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_l = param3;
        this.field_f = param2;
        this.field_a = param0;
        this.field_b = param4;
        this.field_j = param1;
        this.field_d = param5;
    }

    final int a(byte param0) {
        if (param0 == -127) {
          return (this.field_l + this.field_j) / 2;
        }
        this.field_j = 107;
        return (this.field_l + this.field_j) / 2;
    }

    static {
        field_e = "Timer";
        field_i = new int[12];
    }
}
