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

    final static phb[] a(int param0, int param1, int param2, int param3, int param4) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        phb var9 = null;
        phb var10 = null;
        phb var11 = null;
        phb var12 = null;
        phb var13 = null;
        Object var14 = null;
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
        var9 = new phb(3, param1 + -6);
        var9.b();
        dma.c(0, 0, 3, param1 + -6, param0, param3);
        var10 = new phb(3, 3);
        if (param4 <= 86) {
          return null;
        } else {
          L0: {
            var10.b();
            dma.d(0, 0, 3, 3, param0);
            var11 = new phb(16, 3);
            var11.b();
            dma.d(0, 0, 16, 3, param0);
            var12 = new phb(3, 3);
            var12.b();
            dma.d(0, 0, 3, 3, param3);
            var13 = new phb(16, 3);
            var13.b();
            dma.d(0, 0, 16, 3, param3);
            var14 = null;
            if (param2 > 0) {
              var16 = new phb(16, 16);
              var14 = (Object) (Object) var16;
              var16.b();
              dma.d(0, 0, 16, 16, param2);
              break L0;
            } else {
              break L0;
            }
          }
          dma.a(var20, var7, var8);
          return new phb[]{var10, var11, var10, var9, (phb) var14, var9, var12, var13, var12};
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, anb param7, int param8, int param9) {
        try {
            if (param6 < 7) {
                ((uwa) this).field_e = null;
            }
            ((uwa) this).field_h = param9;
            ((uwa) this).field_a = param5;
            ((uwa) this).field_b = param8;
            ((uwa) this).field_f = param1;
            ((uwa) this).field_g = param2;
            ((uwa) this).field_c = param4;
            ((uwa) this).field_e = param7;
            ((uwa) this).field_d = param3;
            ((uwa) this).field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "uwa.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static int a(int param0, faa param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = (param1.i(0, param0) ^ 1 << -1 + param0) - (1 << -1 + param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("uwa.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + 20 + ')');
        }
        return stackIn_3_0;
    }

    static {
    }
}
