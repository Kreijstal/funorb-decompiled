/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nb {
    int[] field_d;
    int field_g;
    static mh field_e;
    int field_f;
    static int field_a;
    java.awt.Image field_c;
    static pk[] field_b;

    abstract void a(int param0, int param1, int param2, java.awt.Graphics param3);

    final static void b(byte param0) {
        if (param0 != 40) {
            return;
        }
        ef.a(param0 ^ -54);
        kg.a((byte) 93, om.field_oc, ef.field_b[0].field_x, np.field_a, ec.field_J, re.field_g);
    }

    final void a(byte param0) {
        if (param0 < 72) {
            return;
        }
        lb.a(((nb) this).field_d, ((nb) this).field_g, ((nb) this).field_f);
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        int var1 = 112 % ((param0 - -44) / 63);
    }

    final static void a(int param0, int param1, int param2, jp param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        param2 = param2 + param3.field_E;
        param1 = param1 + param3.field_F;
        var4 = param1 * lb.field_c + param2;
        var5 = 0;
        var6 = param3.field_C;
        if (param0 <= -109) {
          L0: {
            var7 = param3.field_D;
            var8 = lb.field_c - var7;
            var9 = 0;
            if (lb.field_b > param1) {
              var10 = -param1 + lb.field_b;
              var6 = var6 - var10;
              var4 = var4 + var10 * lb.field_c;
              var5 = var5 + var7 * var10;
              param1 = lb.field_b;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (lb.field_i > param2) {
              var10 = lb.field_i + -param2;
              var4 = var4 + var10;
              var5 = var5 + var10;
              var9 = var9 + var10;
              param2 = lb.field_i;
              var8 = var8 + var10;
              var7 = var7 - var10;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param1 + var6 > lb.field_j) {
              var6 = var6 - (-lb.field_j + (var6 + param1));
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (lb.field_f >= param2 + var7) {
              break L3;
            } else {
              var10 = param2 + var7 - lb.field_f;
              var7 = var7 - var10;
              var9 = var9 + var10;
              var8 = var8 + var10;
              break L3;
            }
          }
          L4: {
            if (var7 <= 0) {
              break L4;
            } else {
              if (var6 <= 0) {
                break L4;
              } else {
                sp.a(lb.field_l, var8, 0, var5, var6, var9, var7, -1, var4, param3.field_G);
                return;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    abstract void a(java.awt.Component param0, int param1, boolean param2, int param3);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_b = new pk[255];
        for (var0 = 0; var0 < field_b.length; var0++) {
            field_b[var0] = new pk();
        }
    }
}
