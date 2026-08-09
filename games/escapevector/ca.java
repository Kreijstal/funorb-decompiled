/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ca {
    static String field_d;
    static String field_a;
    static lk field_c;
    static String field_b;

    abstract void a(java.awt.Component param0, boolean param1);

    abstract int a(int param0);

    final static void b(byte param0) {
        if (param0 != 76) {
            return;
        }
        if (!(null == bk.field_r)) {
            bk.field_r.a((byte) -34);
        }
    }

    final static void a(int param0, int param1, bd param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              rd.field_b.a(-12328, param2);
              r.a(-110, param2, param1);
              if (param0 == 1) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ca.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void a(byte param0) {
        String var2;
        field_b = null;
        if (param0 != 104) {
          var2 = (String) null;
          ca.a(-29, 'ﾠ', (String) null, (String) null);
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final static String a(int param0, char param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var4_int = param2.length();
              var5 = param3.length();
              var6 = var4_int;
              var7 = param0 + var5;
              if (-1 != (var7 ^ -1)) {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param2.indexOf((int) param1, var8_int);
                  if ((var8_int ^ -1) <= -1) {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param2.indexOf((int) param1, var9);
              if ((var10 ^ -1) <= -1) {
                discarded$0 = var8.append(param2.substring(var9, var10));
                var9 = 1 + var10;
                discarded$1 = var8.append(param3);
                continue L3;
              } else {
                discarded$2 = var8.append(param2.substring(var9));
                stackIn_12_0 = var8.toString();
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ca.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        return stackIn_12_0;
    }

    abstract void a(int param0, java.awt.Component param1);

    static {
        field_d = null;
    }
}
