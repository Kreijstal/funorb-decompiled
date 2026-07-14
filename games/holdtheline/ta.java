/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static gn field_a;
    static String field_b;

    final static ql a(int param0, int param1, gn param2, gn param3, int param4) {
        if (param4 >= -69) {
            field_b = null;
        }
        if (!qg.a(param0, param1, (byte) -27, param2)) {
            return null;
        }
        return dd.a((byte) -100, param3.a(param0, true, param1));
    }

    public static void b(byte param0) {
        if (param0 != 16) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static tn a(byte param0) {
        if (param0 != 72) {
            field_a = null;
        }
        return sj.a(1, param0 ^ 19867);
    }

    final static void a(int param0, int param1, int[] param2, byte param3, byte[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = HoldTheLine.field_D;
        for (var5 = 0; var5 < qg.field_d.length; var5++) {
            param1 = qg.field_d[var5];
            var6 = var5 << 2036285700;
            while (true) {
                param1--;
                if (param1 == 0) {
                    break;
                }
                var6++;
                param0 = al.field_b[var6];
                param2[param4[param0]] = param2[param4[param0]] + 1;
                al.field_b[param2[param4[param0]]] = param0;
            }
        }
        if (param3 != -83) {
            field_a = null;
        }
    }

    final static String a(int param0, th param1, boolean param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_4_0 = null;
        L0: {
          if (!param2) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        try {
          L1: {
            var3_int = param1.e(128);
            if (var3_int <= param0) {
              break L1;
            } else {
              var3_int = param0;
              break L1;
            }
          }
          var4 = new byte[var3_int];
          param1.field_l = param1.field_l + ti.field_u.a(var3_int, true, 0, var4, param1.field_i, param1.field_l);
          var5 = sm.a(var3_int, 0, -129, var4);
          stackOut_4_0 = (String) var5;
          stackIn_5_0 = stackOut_4_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_5_0;
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
