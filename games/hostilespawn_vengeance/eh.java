/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static String field_h;
    static bd field_a;
    static int field_g;
    static boolean field_e;
    static bd field_b;
    static int[] field_f;
    static int field_d;
    static wm field_c;

    public static void a(boolean param0) {
        field_a = null;
        field_h = null;
        field_c = null;
        if (!param0) {
            return;
        }
        field_b = null;
        field_f = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        L0: {
          var6 = si.field_e;
          var7 = si.field_k;
          param4 = param4 - param2;
          param5 = param5 - param3;
          param3 = param3 - param2;
          param5 = param5 - param4;
          param2 = param2 << 16;
          param3 = param3 << 8;
          param3 = param3 * 10;
          param4 = param4 << 8;
          param4 = param4 * 10;
          param5 = param5 * 100;
          var11 = 24;
          var12 = 24;
          if (param1 >= 0) {
            break L0;
          } else {
            var12 = var12 + param1;
            param2 = param2 - param4 * param1;
            param3 = param3 - param5 * param1;
            param1 = 0;
            break L0;
          }
        }
        L1: {
          if (param1 + var12 <= var7) {
            break L1;
          } else {
            var12 = var7 - param1;
            break L1;
          }
        }
        L2: {
          if (param0 >= 0) {
            break L2;
          } else {
            var11 = var11 + param0;
            param0 = 0;
            param2 = param2 - param3 * param0;
            param4 = param4 - param5 * param0;
            break L2;
          }
        }
        L3: {
          if (param0 + var11 <= var6) {
            break L3;
          } else {
            var11 = var6 - param0;
            break L3;
          }
        }
        var13 = param0 + var6 * param1;
        var14 = var6 - var11;
        var15 = -var12;
        L4: while (true) {
          if (var15 >= 0) {
            return;
          } else {
            var8 = param2;
            var16 = -var11;
            L5: while (true) {
              if (var16 >= 0) {
                param2 = param2 + param4;
                param3 = param3 + param5;
                var13 = var13 + var14;
                var15++;
                continue L4;
              } else {
                var9 = var8 >> 16;
                var10 = si.field_i[var13];
                var13++;
                si.field_i[var13] = ((var10 & 16711935) * var9 & -16711936 | (var10 & 65280) * var9 & 16711680) >> 8;
                var8 = var8 + param3;
                var16++;
                continue L5;
              }
            }
          }
        }
    }

    final static void b(boolean param0) {
        if (param0) {
            eh.a(false);
        }
        hk var1 = (hk) (Object) ak.field_i.b(-27493);
        if (var1 == null) {
            throw new IllegalStateException();
        }
        si.a(var1.field_i, var1.field_j, var1.field_p);
        si.d(var1.field_m, var1.field_o, var1.field_r, var1.field_n);
        var1.field_i = null;
        ij.field_J.a((am) (Object) var1, 114);
    }

    final static int a(byte param0) {
        if (param0 >= -56) {
            return 34;
        }
        return (int)(1000000000L / ch.field_a);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "The marine's armour is fitted with a state of the art biomedical system that helps to absorb damage. The suit's refractory carbon composite also provides protection from radiated heat.";
        field_e = false;
        field_g = 128;
        field_f = new int[]{1, 22, 12, 13, 4, 7};
        field_a = new bd(96, 96);
    }
}
