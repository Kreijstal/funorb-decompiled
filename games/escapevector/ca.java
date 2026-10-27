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
        if (null != bk.field_r) {
          bk.field_r.a((byte) -34);
        }
    }

    final static void a(int param0, int param1, bd param2) {
        try {
          rd.field_b.addLast(-12328, param2);
          r.a(-110, param2, param1);
          if (param0 != 1) {
            field_a = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ca.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 == 104) {
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        }
        String var2 = (String) null;
        ca.a(-29, 'ﾠ', (String) null, (String) null);
        field_c = null;
        field_d = null;
        field_a = null;
    }

    final static String a(int param0, char param1, String param2, String param3) {
        String stackIn_16_2 = null;
        String stackIn_19_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          int var4_int = param2.length();
          int var5 = param3.length();
          int var6 = var4_int;
          int var7 = param0 + var5;
          if (var7 != 0) {
            int var8_int = 0;
            while (true) {
              var8_int = param2.indexOf((int) param1, var8_int);
              if (var8_int < 0) {
                break;
              }
              var6 = var6 + var7;
              var8_int++;
            }
          }
          StringBuilder var8 = new StringBuilder(var6);
          int var9 = 0;
          while (true) {
            int var10 = param2.indexOf((int) param1, var9);
            if (var10 < 0) {
              StringBuilder discarded$2 = var8.append(param2.substring(var9));
              String stackIn_12_0 = var8.toString();
              return stackIn_12_0;
            }
            StringBuilder discarded$0 = var8.append(param2.substring(var9, var10));
            var9 = 1 + var10;
            StringBuilder discarded$1 = var8.append(param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var4;
          StringBuilder stackIn_15_1 = new StringBuilder().append("ca.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          StringBuilder stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    abstract void a(int param0, java.awt.Component param1);

    static {
        field_d = null;
    }
}
