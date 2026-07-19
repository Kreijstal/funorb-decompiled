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
        Object var14 = null;
        int[] var15 = null;
        phb var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        var18 = dma.field_i;
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
          return (phb[]) null;
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
          dma.a(var18, var7, var8);
          return new phb[]{var10, var11, var10, var9, (phb) (var14), var9, var12, var13, var12};
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, anb param7, int param8, int param9) {
        try {
            if (param6 < 7) {
                this.field_e = (anb) null;
            }
            this.field_h = param9;
            this.field_a = param5;
            this.field_b = param8;
            this.field_f = param1;
            this.field_g = param2;
            this.field_c = param4;
            this.field_e = param7;
            this.field_d = param3;
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "uwa.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static int a(int param0, faa param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param2 == 20) {
              stackOut_3_0 = (param1.i(0, param0) ^ 1 << -1 + param0) - (1 << -1 + param0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = -29;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("uwa.B(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
    }
}
