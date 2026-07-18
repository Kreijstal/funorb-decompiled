/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    final static void a(int param0, la param1) {
        RuntimeException var2 = null;
        df var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        of var5 = null;
        int[] var6 = null;
        int var7 = 0;
        df var8 = null;
        int var9 = 0;
        df var10 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = Torquing.field_u;
        try {
          L0: {
            var8 = new df(param1.a(-125, "", "logo.fo3d"));
            var10 = var8;
            var2_ref = var10;
            var3 = var10.i((byte) -101);
            var10.j((byte) -100);
            ha.field_d = pe.a((byte) -59, var10);
            db.field_a = new of[var3];
            eo.field_d = new int[var3][];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3) {
                var10.j(-128);
                var9 = 0;
                var4 = var9;
                L2: while (true) {
                  if (var9 >= var3) {
                    break L0;
                  } else {
                    var5 = db.field_a[var9];
                    var5.a(1, 6, 6, 6, (byte) -123);
                    var5.a(32767);
                    var6 = new int[]{var5.field_g + var5.field_A >> 1, var5.field_H + var5.field_x >> 1, var5.field_p - -var5.field_e >> 1};
                    eo.field_d[var9] = var6;
                    var5.a(-var6[2], (byte) -6, -var6[0], -var6[1]);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                db.field_a[var4] = mh.a(255, var8);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("le.B(").append(6).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final static void a(byte param0, int param1, qk param2) {
        if (param0 < 82) {
            return;
        }
        try {
            kc.field_z.a((byte) 54, (q) (Object) param2);
            ii.a(32, 5, param2);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "le.A(" + param0 + ',' + 5 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
