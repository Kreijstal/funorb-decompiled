/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static String field_b;
    static int field_c;
    static long field_d;
    static ic field_a;

    final static int a(byte param0, int param1) {
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param0 >= 84) {
          if (param1 == 0) {
            return 0;
          }
          if (param1 <= 0) {
            var2 = 2;
            if (param1 < -65536) {
              param1 = param1 >> 16;
              var2 += 16;
            }
            if (param1 < -256) {
              var2 += 8;
              param1 = param1 >> 8;
            }
            if (param1 < -16) {
              var2 += 4;
              param1 = param1 >> 4;
            }
            if (param1 < -4) {
              var2 += 2;
              param1 = param1 >> 2;
            }
            if (param1 < -2) {
              var2++;
              param1 = param1 >> 1;
            }
            return var2;
          }
          var2Lifetime2 = 1;
          if (param1 > 65535) {
            var2Lifetime2 += 16;
            param1 = param1 >> 16;
          }
          if (param1 > 255) {
            var2Lifetime2 += 8;
            param1 = param1 >> 8;
          }
          if (param1 > 15) {
            param1 = param1 >> 4;
            var2Lifetime2 += 4;
          }
          if (param1 > 3) {
            var2Lifetime2 += 2;
            param1 = param1 >> 2;
          }
          if (param1 > 1) {
            var2Lifetime2++;
            param1 = param1 >> 1;
          }
          return var2Lifetime2;
        }
        qg.a(-76);
        if (param1 == 0) {
          return 0;
        }
        if (param1 <= 0) {
          var2Lifetime1 = 2;
          if (param1 < -65536) {
            param1 = param1 >> 16;
            var2Lifetime1 += 16;
          }
          if (param1 < -256) {
            var2Lifetime1 += 8;
            param1 = param1 >> 8;
          }
          if (param1 < -16) {
            var2Lifetime1 += 4;
            param1 = param1 >> 4;
          }
          if (param1 < -4) {
            var2Lifetime1 += 2;
            param1 = param1 >> 2;
          }
          if (param1 < -2) {
            var2Lifetime1++;
            param1 = param1 >> 1;
          }
        } else {
          var2Lifetime1 = 1;
          if (param1 > 65535) {
            var2Lifetime1 += 16;
            param1 = param1 >> 16;
          }
          if (param1 > 255) {
            var2Lifetime1 += 8;
            param1 = param1 >> 8;
          }
          if (param1 > 15) {
            param1 = param1 >> 4;
            var2Lifetime1 += 4;
          }
          if (param1 > 3) {
            var2Lifetime1 += 2;
            param1 = param1 >> 2;
          }
          if (param1 > 1) {
            var2Lifetime1++;
            param1 = param1 >> 1;
          }
        }
        return var2Lifetime1;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 1) {
          field_b = (String) null;
        }
    }

    final static r a(int param0, int param1, int param2, md param3, byte param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        r var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        r stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = pd.a(0, param5, param3, param0, param2, param1);
          var6 = var8;
          if (var8 == null) {
            stackIn_2_0 = null;
            return (r) (stackIn_2_0);
          }
          var7 = new r();
          var7.field_c = var8;
          var7.field_c.add((java.awt.Component) ((Object) var7));
          if (param4 != -73) {
            field_c = 104;
          }
          var7.setBounds(0, 0, param0, param1);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_6_0 = var7;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("qg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_c = 0;
        field_b = "OFF";
    }
}
