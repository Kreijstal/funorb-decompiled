/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static ib field_a;
    static int[] field_d;
    static int field_b;
    static int field_c;

    final static String a(byte param0, gk param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var3_int = param1.o(-1);
                  if (var3_int > param2) {
                    var3_int = param2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var4 = new byte[var3_int];
                  if (param0 == 90) {
                    break L3;
                  } else {
                    ea.a(-85);
                    break L3;
                  }
                }
                param1.field_h = param1.field_h + jc.field_d.a(-1, 0, param1.field_h, var3_int, var4, param1.field_g);
                var5 = sc.a(var4, var3_int, param0 ^ -106, 0);
                stackIn_6_0 = (String) (var5);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackIn_8_0 = "Cabbage";
              return stackIn_8_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("ea.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_c = 117;
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    static {
        field_a = new ib();
        field_d = new int[8192];
    }
}
