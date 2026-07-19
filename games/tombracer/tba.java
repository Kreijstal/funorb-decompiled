/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tba extends vg {
    static int field_k;
    static byte[] field_m;
    static String[] field_i;
    int field_j;
    static oc field_l;
    static jpa[] field_f;
    int field_h;
    static String field_g;

    final static iu[] a(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        cn discarded$1 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object var10 = null;
        Object var11 = null;
        int[] var12 = null;
        int[] var15 = null;
        int[] var16 = null;
        iu var17 = null;
        iu var18 = null;
        iu var19 = null;
        iu var20 = null;
        iu var21 = null;
        iu var22 = null;
        var16 = bea.field_l;
        var15 = var16;
        var12 = var15;
        var6 = var12;
        if (param0 >= -62) {
          L0: {
            discarded$1 = tba.a((byte) -71);
            var7 = bea.field_g;
            var8 = bea.field_a;
            var17 = new iu(16, param2);
            var17.c();
            bea.b(0, 0, 16, param2, param3, param4);
            var10 = null;
            if (!param5) {
              break L0;
            } else {
              var18 = var17.a();
              var10 = var18;
              var18.c();
              bea.c(0, 0, 5, 0);
              bea.c(0, 1, 3, 0);
              bea.c(0, 2, 2, 0);
              bea.c(0, 3, 1, 0);
              bea.c(0, 4, 1, 0);
              break L0;
            }
          }
          L1: {
            var11 = null;
            if (param1) {
              var19 = var17.a();
              var11 = var19;
              var19.c();
              bea.c(11, 0, 5, 0);
              bea.c(13, 1, 3, 0);
              bea.c(14, 2, 2, 0);
              bea.c(15, 3, 1, 0);
              bea.c(15, 4, 1, 0);
              break L1;
            } else {
              break L1;
            }
          }
          bea.a(var16, var7, var8);
          return new iu[]{null, null, null, (iu) (var10), var17, (iu) (var11), null, null, null};
        } else {
          L2: {
            var7 = bea.field_g;
            var8 = bea.field_a;
            var20 = new iu(16, param2);
            var20.c();
            bea.b(0, 0, 16, param2, param3, param4);
            var10 = null;
            if (!param5) {
              break L2;
            } else {
              var21 = var20.a();
              var10 = var21;
              var21.c();
              bea.c(0, 0, 5, 0);
              bea.c(0, 1, 3, 0);
              bea.c(0, 2, 2, 0);
              bea.c(0, 3, 1, 0);
              bea.c(0, 4, 1, 0);
              break L2;
            }
          }
          L3: {
            var11 = null;
            if (param1) {
              var22 = var20.a();
              var11 = var22;
              var22.c();
              bea.c(11, 0, 5, 0);
              bea.c(13, 1, 3, 0);
              bea.c(14, 2, 2, 0);
              bea.c(15, 3, 1, 0);
              bea.c(15, 4, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          bea.a(var16, var7, var8);
          return new iu[]{null, null, null, (iu) (var10), var20, (iu) (var11), null, null, null};
        }
    }

    final static lr a(Throwable param0, String param1) {
        lr var2 = null;
        if (param0 instanceof lr) {
            var2 = (lr) ((Object) param0);
            var2.field_d = var2.field_d + ' ' + param1;
        } else {
            var2 = new lr(param0, param1);
        }
        return var2;
    }

    final static cn a(byte param0) {
        int var1 = 79 / ((param0 - 7) / 37);
        return gba.a(-94, vca.field_d.field_c);
    }

    public static void a(int param0) {
        field_m = null;
        field_l = null;
        field_g = null;
        field_f = null;
        if (param0 != 0) {
            return;
        }
        field_i = null;
    }

    tba(int param0, int param1) {
        this.field_j = param1;
        this.field_h = param0;
    }

    static {
        field_i = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
