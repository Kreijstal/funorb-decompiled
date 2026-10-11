/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static java.security.SecureRandom field_b;
    static java.awt.Image field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1431655765) {
          field_a = (java.awt.Image) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int var4 = 0;
        int var2 = param0 * (param0 * param0 >> 12) >> 12;
        int var3 = param0 * 6 - 61440;
        if (param1 == -676121812) {
          var4 = 40960 + (var3 * param0 >> 12);
          return var2 * var4 >> 12;
        }
        return 110;
    }

    final static int a(int param0, byte param1) {
        param0 = (param0 & 1431655765) + ((-1431655765 & param0) >>> 1);
        param0 = (param0 & 858993459) + (param0 >>> 2 & -214748365);
        if (param1 == 81) {
          param0 = param0 + (param0 >>> 4) & 252645135;
          param0 = param0 + (param0 >>> 8);
          param0 = param0 + (param0 >>> 16);
          return 255 & param0;
        }
        gf.a(-54);
        param0 = param0 + (param0 >>> 4) & 252645135;
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return 255 & param0;
    }

    final static String a(char param0, String param1, boolean param2, String param3) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_3_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4_int = param1.length();
          if (param2) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var5 = param3.length();
          var6 = var4_int;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            while (true) {
              var8_int = param1.indexOf((int) param0, var8_int);
              if (var8_int < 0) {
                break;
              }
              var6 = var6 + var7;
              var8_int++;
            }
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = param1.indexOf((int) param0, var9);
            if (var10 < 0) {
              discarded$4 = var8.append(param1.substring(var9));
              stackIn_14_0 = var8.toString();
              return stackIn_14_0;
            }
            discarded$2 = var8.append(param1.substring(var9, var10));
            discarded$3 = var8.append(param3);
            var9 = 1 + var10;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("gf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
    }
}
