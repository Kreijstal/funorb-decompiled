/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uwa {
    int field_c;
    int field_i;
    int field_f;
    int field_g;
    int field_h;
    int field_d;
    int field_b;
    int field_a;
    anb field_e;

    final static phb[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        phb var9 = null;
        phb var10 = null;
        phb var11 = null;
        phb var12 = null;
        phb var13 = null;
        phb var14 = null;
        int[] var15 = null;
        phb var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        var20 = dma.field_i;
        var19 = var20;
        var18 = var19;
        var17 = var18;
        var15 = var17;
        var6 = var15;
        var7 = dma.field_g;
        var8 = dma.field_j;
        var9 = new phb(param5, param1 + -(param5 * 2));
        var9.b();
        dma.c(0, 0, param5, param1 + -(param5 * 2), param0, param3);
        var10 = new phb(param5, param5);
        if (param4 <= 86) {
          return null;
        } else {
          L0: {
            var10.b();
            dma.d(0, 0, param5, param5, param0);
            var11 = new phb(16, param5);
            var11.b();
            dma.d(0, 0, 16, param5, param0);
            var12 = new phb(param5, param5);
            var12.b();
            dma.d(0, 0, param5, param5, param3);
            var13 = new phb(16, param5);
            var13.b();
            dma.d(0, 0, 16, param5, param3);
            var14 = null;
            if (param2 > 0) {
              var16 = new phb(16, 16);
              var14 = var16;
              var16.b();
              dma.d(0, 0, 16, 16, param2);
              break L0;
            } else {
              break L0;
            }
          }
          dma.a(var20, var7, var8);
          return new phb[]{var10, var11, var10, var9, var14, var9, var12, var13, var12};
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, anb param7, int param8, int param9) {
        if (param6 < 7) {
          ((uwa) this).field_e = null;
          ((uwa) this).field_h = param9;
          ((uwa) this).field_a = param5;
          ((uwa) this).field_b = param8;
          ((uwa) this).field_f = param1;
          ((uwa) this).field_g = param2;
          ((uwa) this).field_c = param4;
          ((uwa) this).field_e = param7;
          ((uwa) this).field_d = param3;
          ((uwa) this).field_i = param0;
          return;
        } else {
          ((uwa) this).field_h = param9;
          ((uwa) this).field_a = param5;
          ((uwa) this).field_b = param8;
          ((uwa) this).field_f = param1;
          ((uwa) this).field_g = param2;
          ((uwa) this).field_c = param4;
          ((uwa) this).field_e = param7;
          ((uwa) this).field_d = param3;
          ((uwa) this).field_i = param0;
          return;
        }
    }

    final static int a(int param0, faa param1, byte param2) {
        if (param2 != 20) {
          return -29;
        } else {
          return (param1.i(0, param0) ^ 1 << -1 + param0) - (1 << -1 + param0);
        }
    }

    static {
    }
}
