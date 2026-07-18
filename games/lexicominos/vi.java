/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends kd {
    int field_i;
    static boolean field_j;
    static tf field_l;
    boolean field_h;
    int[] field_k;

    final static void a(byte param0) {
        ni.a(75, 17);
    }

    final static db[] b(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Lexicominos.field_L ? 1 : 0;
        db[] var1 = new db[th.field_t];
        for (var2 = 0; var2 < th.field_t; var2++) {
            var3 = pb.field_h[var2] * bd.field_m[var2];
            var4 = be.field_f[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = ci.field_b[vg.a((int) var4[var6], 255)];
            }
            var1[var2] = new db(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var5);
        }
        gk.a(12428);
        return var1;
    }

    final static void a(int param0, vb param1, int param2) {
        th var5 = null;
        int var4 = 0;
        try {
            var5 = ed.field_q;
            var5.h(4, 0);
            var5.field_h = var5.field_h + 1;
            var4 = var5.field_h;
            var5.c(1, -1);
            var5.c(param1.field_n, -1);
            var5.c(param1.field_p, -1);
            var5.f(param1.field_j, -32287);
            var5.f(param1.field_q, -32287);
            var5.f(param1.field_h, -32287);
            var5.f(param1.field_o, -32287);
            int discarded$0 = var5.a(var4, (byte) 119);
            var5.d(-var4 + var5.field_h, (byte) -122);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "vi.A(" + 4 + ',' + (param1 != null ? "{...}" : "null") + ',' + 1 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 0;
        field_l = null;
    }

    final static cd a(byte[] param0, byte param1) {
        cd var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        cd stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        cd stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new cd(param0, mg.field_x, rg.field_c, pb.field_h, bd.field_m, be.field_f);
              gk.a(12428);
              stackOut_4_0 = (cd) var2;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (cd) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("vi.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 107 + ')');
        }
        return stackIn_5_0;
    }

    vi() {
        ((vi) this).field_h = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new tf();
    }
}
