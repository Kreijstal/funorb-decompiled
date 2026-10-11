/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static String field_b;
    static int[] field_a;

    final static String a(int param0, String param1, String param2, char param3) {
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
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var11 = Terraphoenix.field_V;
        try {
          var4_int = param2.length();
          var5 = param1.length();
          if (param0 < 54) {
            je.a(-16, 65);
          }
          var6 = var4_int;
          var7 = -1 + var5;
          if (0 != var7) {
            var8_int = 0;
            while (true) {
              var8_int = param2.indexOf((int) param3, var8_int);
              if (0 > var8_int) {
                break;
              }
              var8_int++;
              var6 = var6 + var7;
            }
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = param2.indexOf((int) param3, var9);
            if (var10 < 0) {
              discarded$4 = var8.append(param2.substring(var9));
              stackIn_12_0 = var8.toString();
              return stackIn_12_0;
            }
            discarded$2 = var8.append(param2.substring(var9, var10));
            discarded$3 = var8.append(param1);
            var9 = 1 + var10;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("je.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        if (param0 > -63) {
          return -121;
        }
        var2 = 0;
        if (0 > param1) {
          param1 = param1 >>> 16;
          var2 += 16;
        } else {
          if (param1 >= 65536) {
            param1 = param1 >>> 16;
            var2 += 16;
          }
        }
        if (256 <= param1) {
          var2 += 8;
          param1 = param1 >>> 8;
        }
        if (param1 >= 16) {
          param1 = param1 >>> 4;
          var2 += 4;
        }
        if (param1 >= 4) {
          param1 = param1 >>> 2;
          var2 += 2;
        }
        if (param1 >= 1) {
          var2++;
          param1 = param1 >>> 1;
        }
        return param1 + var2;
    }

    final static fh a(int param0) {
        if (df.field_K == null) {
          df.field_K = new fh();
          df.field_K.a(qk.field_e, (byte) -106);
          df.field_K.field_b = ra.field_l;
          df.field_K.field_u = 2763306;
          df.field_K.field_k = 4;
          df.field_K.field_v = 6;
          df.field_K.field_r = 7697781;
          df.field_K.field_p = 14;
          df.field_K.field_o = 5;
          df.field_K.field_m = 0;
          if (param0 != 5) {
            field_a = (int[]) null;
            return df.field_K;
          }
          return df.field_K;
        }
        if (param0 == 5) {
          return df.field_K;
        }
        field_a = (int[]) null;
        return df.field_K;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -110) {
          field_b = (String) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_b = "Abort mission";
    }
}
