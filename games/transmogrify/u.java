/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static tf field_c;
    static int field_d;
    static int field_b;
    static qh field_a;

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> -816856703;
        param1 = param1 | param1 >>> -343087198;
        param1 = param1 | param1 >>> -1759701692;
        param1 = param1 | param1 >>> 476893576;
        if (param0 != -816856703) {
            Object var3 = null;
            oe[] discarded$0 = u.a((hj) null, (byte) 92);
        }
        param1 = param1 | param1 >>> 155990192;
        return 1 + param1;
    }

    final static oe[] a(hj param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        oe[] var4 = null;
        int var5 = 0;
        oe var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Transmogrify.field_A ? 1 : 0;
        var2 = param0.k(8, 1522829539);
        if (-1 <= (var2 ^ -1)) {
          var3 = param0.k(12, 1522829539);
          var4 = new oe[var3];
          var5 = 0;
          L0: while (true) {
            if (var5 >= var3) {
              var5 = 70 / ((param1 - -47) / 36);
              return var4;
            } else {
              if (!w.a(-1, param0)) {
                var6 = param0.k(ol.a(-23755, var5 + -1), 1522829539);
                var4[var5] = var4[var6];
                var5++;
                continue L0;
              } else {
                var6_ref = new oe();
                int discarded$156 = param0.k(24, 1522829539);
                int discarded$157 = param0.k(24, 1522829539);
                var6_ref.field_b = param0.k(24, 1522829539);
                int discarded$158 = param0.k(9, 1522829539);
                int discarded$159 = param0.k(12, 1522829539);
                int discarded$160 = param0.k(12, 1522829539);
                int discarded$161 = param0.k(12, 1522829539);
                var4[var5] = var6_ref;
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static String a(String param0, String param1, ci param2, boolean param3) {
        if (!param3) {
            field_a = null;
        }
        if (!param2.a((byte) -125)) {
            return param0;
        }
        return param1 + " - " + param2.b(-22884) + "%";
    }

    final static String a(boolean param0, int param1, oa param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        Object stackIn_4_0 = null;
        String stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        String stackOut_5_0 = null;
        try {
          L0: {
            var3_int = param2.f(-120);
            if (var3_int <= param1) {
              break L0;
            } else {
              var3_int = param1;
              break L0;
            }
          }
          if (!param0) {
            return (String) (Object) stackIn_4_0;
          } else {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          var4 = new byte[var3_int];
          param2.field_h = param2.field_h + bf.field_C.a(var3_int, var4, 0, param2.field_g, 0, param2.field_h);
          var5 = cc.a(0, 15923, var3_int, var4);
          stackOut_5_0 = (String) var5;
          stackIn_6_0 = stackOut_5_0;
        }
        return null;
    }

    public static void a(byte param0) {
        if (param0 < 99) {
            Object var2 = null;
            String discarded$0 = u.a((String) null, (String) null, (ci) null, false);
        }
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new tf(12, 0, 1, 0);
    }
}
