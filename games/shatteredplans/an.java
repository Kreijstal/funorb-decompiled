/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    static aa field_b;
    static int field_c;
    static qr field_d;
    static String field_a;

    final static void a() {
        df var1 = null;
        int var2 = ShatteredPlansClient.field_F ? 1 : 0;
        jo.field_d = null;
        r.field_c = 0;
        oi.field_e = 0;
        try {
            vd.field_j.a(0);
            fp.field_b.a(0);
            var1 = eg.field_q.c((byte) -86);
            while (var1 != null) {
                var1.a(16);
                var1 = eg.field_q.b((byte) -107);
            }
            var1 = sl.field_m.c((byte) -70);
            while (var1 != null) {
                var1.a(16);
                var1 = sl.field_m.b((byte) -107);
            }
            po.field_b = 0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "an.B(" + true + ')');
        }
    }

    public static void b() {
        field_a = null;
        field_d = null;
        field_b = null;
    }

    final static lp a(byte param0, boolean param1, sd param2) {
        RuntimeException var3 = null;
        String var4 = null;
        kb var5 = null;
        int var6_int = 0;
        b var6 = null;
        int var7 = 0;
        ff var7_ref_ff = null;
        int var8_int = 0;
        qk var8 = null;
        ff var9 = null;
        qk var9_ref = null;
        int var10 = 0;
        qk var11 = null;
        String var12 = null;
        lp var13 = null;
        lp stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        lp stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = new lp(0, 0, 209, 50);
              var13.field_h = (Object) (Object) param2;
              var12 = param2.field_q.field_I;
              var4 = var12;
              var4 = var12;
              if (!param1) {
                break L1;
              } else {
                var4 = var12 + " (" + param2.field_o.field_t + ")";
                break L1;
              }
            }
            var5 = new kb(0, 0, 209, param2.field_o.field_k, var4, 16777215, false);
            var13.a((vd) (Object) var5, 8);
            var6_int = 0;
            L2: while (true) {
              if (4 <= var6_int) {
                L3: {
                  var6 = new b(k.field_d.field_z / 2 + (fs.field_a[0].field_z - -5) * 4 + 40, 6 + var5.field_i, k.field_d.field_z * 2, -2 + k.field_d.field_w, 2, 534312);
                  var13.a((vd) (Object) var6, 8);
                  var7 = param2.field_r;
                  if (var7 >= 0) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L3;
                  }
                }
                var8 = new qk(k.field_d.field_z + 4 * (5 + fs.field_a[0].field_z) + 40, var5.field_i + (7 + fs.field_a[0].field_w / 8), 3 * k.field_d.field_z / 2, k.field_d.field_w, Integer.toString(var7));
                var13.a((vd) (Object) var8, 8);
                var9 = new ff(40 + 4 * (fs.field_a[0].field_z + 5), 5 + var5.field_i, k.field_d);
                var13.a((vd) (Object) var9, 8);
                var9.field_o = si.field_w;
                var8.field_o = si.field_w;
                var6.field_o = si.field_w;
                stackOut_10_0 = (lp) var13;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L4: {
                  var7_ref_ff = new ff(40 + var6_int * (5 + fs.field_a[var6_int].field_z), var5.field_i - -7, fs.field_a[var6_int]);
                  var13.a((vd) (Object) var7_ref_ff, 8);
                  var8_int = param2.field_r + param2.field_u[var6_int];
                  if (var8_int >= 0) {
                    break L4;
                  } else {
                    var8_int = 0;
                    break L4;
                  }
                }
                var11 = new qk(40 - -(var6_int * (fs.field_a[var6_int].field_z - -5)), 7 + var5.field_i + fs.field_a[var6_int].field_w / 8, fs.field_a[var6_int].field_z, fs.field_a[var6_int].field_w, Integer.toString(var8_int));
                var9_ref = var11;
                var13.a((vd) (Object) var11, 8);
                var11.field_o = ne.field_m[var6_int];
                var7_ref_ff.field_o = ne.field_m[var6_int];
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("an.A(").append(-76).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Warring Worlds";
    }
}
