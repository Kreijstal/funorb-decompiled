/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends af {
    static t[] field_g;
    int field_c;
    static int field_h;
    static String field_m;
    int field_d;
    static pp field_i;
    static String field_j;
    private int field_l;
    static uc field_e;
    private sm field_k;
    static double[][] field_f;

    final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param1 = param1 + (((dg) this).field_k.field_a - -((dg) this).field_c);
          param2 = param2 + (((dg) this).field_d + ((dg) this).field_k.field_g);
          var4 = param2 * ph.field_j + param1;
          if (!param0) {
            break L0;
          } else {
            ((dg) this).b(97);
            break L0;
          }
        }
        L1: {
          var5 = 0;
          var6 = ((dg) this).field_k.field_d;
          var7 = ((dg) this).field_k.field_c;
          var8 = -var7 + ph.field_j;
          if (param2 < ph.field_c) {
            var10 = -param2 + ph.field_c;
            var4 = var4 + ph.field_j * var10;
            var6 = var6 - var10;
            param2 = ph.field_c;
            var5 = var5 + var10 * var7;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var9 = 0;
          if (ph.field_k <= param1) {
            break L2;
          } else {
            var10 = ph.field_k + -param1;
            var5 = var5 + var10;
            var9 = var9 + var10;
            var4 = var4 + var10;
            var8 = var8 + var10;
            param1 = ph.field_k;
            var7 = var7 - var10;
            break L2;
          }
        }
        L3: {
          if (ph.field_h >= var6 + param2) {
            break L3;
          } else {
            var6 = var6 - (-ph.field_h + (var6 + param2));
            break L3;
          }
        }
        L4: {
          if (ph.field_a < var7 + param1) {
            var10 = -ph.field_a + param1 - -var7;
            var7 = var7 - var10;
            var8 = var8 + var10;
            var9 = var9 + var10;
            break L4;
          } else {
            break L4;
          }
        }
        if (0 < var7) {
          if (-1 <= (var6 ^ -1)) {
            return;
          } else {
            wh.a(0, var5, ((dg) this).field_k.field_l, var6, ((dg) this).field_l, var8, ph.field_e, (byte) 29, var9, var4, var7, ((dg) this).field_k.field_k);
            return;
          }
        } else {
          return;
        }
    }

    final void b(int param0) {
        if (param0 != 6) {
            field_j = null;
            ((dg) this).a(false, 0, 0);
            return;
        }
        ((dg) this).a(false, 0, 0);
    }

    public static void c(int param0) {
        field_g = null;
        field_e = null;
        field_i = null;
        field_j = null;
        if (param0 != 12949) {
            return;
        }
        field_m = null;
        field_f = null;
    }

    dg(sm param0, int param1, int param2, int param3) {
        ((dg) this).field_l = param3;
        ((dg) this).field_k = param0;
        ((dg) this).field_c = param1;
        ((dg) this).field_d = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 50;
        field_j = "Cancel";
        field_f = new double[8][3];
    }
}
