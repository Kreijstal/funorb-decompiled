/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    final static void a(int param0, la param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        of var5 = null;
        int[] var6 = null;
        int var7 = 0;
        qk var8 = null;
        df var9 = null;
        int var10 = 0;
        df var11 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = Torquing.field_u;
        try {
          L0: {
            var9 = new df(param1.a(-125, "", "logo.fo3d"));
            var11 = var9;
            var3 = var11.i((byte) -101);
            var11.j((byte) -100);
            ha.field_d = pe.a((byte) -59, var11);
            db.field_a = new of[var3];
            eo.field_d = new int[var3][];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3) {
                L2: {
                  var11.j(-128);
                  if (param0 == 6) {
                    break L2;
                  } else {
                    var8 = (qk) null;
                    le.a((byte) -43, -40, (qk) null);
                    break L2;
                  }
                }
                var10 = 0;
                var4 = var10;
                L3: while (true) {
                  if (var10 >= var3) {
                    break L0;
                  } else {
                    var5 = db.field_a[var10];
                    var5.a(1, 6, 6, 6, (byte) -123);
                    var5.a(32767);
                    var6 = new int[]{var5.field_g + var5.field_A >> -187202207, var5.field_H + var5.field_x >> 1688882529, var5.field_p - -var5.field_e >> -288496383};
                    eo.field_d[var10] = var6;
                    var5.a(-var6[2], (byte) -6, -var6[0], -var6[1]);
                    var10++;
                    continue L3;
                  }
                }
              } else {
                db.field_a[var4] = mh.a(255, var9);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("le.B(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final static void a(byte param0, int param1, qk param2) {
        if (param0 < 82) {
            return;
        }
        try {
            kc.field_z.a((byte) 54, param2);
            ii.a(32, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "le.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
