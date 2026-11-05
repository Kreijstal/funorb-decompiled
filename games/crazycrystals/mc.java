/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mc extends ij {
    static long[] field_p;
    int field_o;
    int field_n;
    static int[] field_m;
    int field_t;
    static int field_s;
    static int field_r;
    static int field_q;
    int field_l;
    int field_u;
    int field_v;

    public static void b(byte param0) {
        if (param0 <= 104) {
          mc.b((byte) 31);
          field_m = null;
          field_p = null;
          return;
        }
        field_m = null;
        field_p = null;
    }

    final static String a(byte param0) {
        if (co.field_F) {
          if (param0 != 6) {
            return (String) null;
          }
          return null;
        }
        if (cl.field_o < ih.field_a) {
          if (param0 != 6) {
            return (String) null;
          }
          return null;
        }
        if (cl.field_o < ih.field_a + u.field_a) {
          return kf.field_f;
        }
        if (param0 != 6) {
          return (String) null;
        }
        return null;
    }

    final static dl a(int param0, int param1, int param2) {
        dl var6 = null;
        dl var3 = null;
        int var4 = 0;
        int var5 = CrazyCrystals.field_B;
        dl var6Lifetime1;
        dl var3Lifetime1;
        int var4Lifetime1;
        if (param1 >= -10) {
          field_m = (int[]) null;
        } else {
          var6 = new dl(param0, param0);
          var3 = var6;
          for (var4 = 0; var3.field_w.length > var4; var4++) {
            var6.field_w[var4] = param2;
          }
          return var3;
        }
        var6Lifetime1 = new dl(param0, param0);
        var3Lifetime1 = var6Lifetime1;
        for (var4Lifetime1 = 0; var3Lifetime1.field_w.length > var4Lifetime1; var4Lifetime1++) {
          var6Lifetime1.field_w[var4Lifetime1] = param2;
        }
        return var3Lifetime1;
    }

    mc() {
    }

    static {
        field_p = new long[32];
        field_m = new int[4];
    }
}
