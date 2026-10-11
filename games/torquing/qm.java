/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qm {
    static la field_a;
    static String field_b;

    public static void a(int param0) {
        int var1 = -65 / ((-66 - param0) / 43);
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int[] var19 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var13Lifetime1;
        int var13Lifetime2;
        var15 = Torquing.field_u;
        try {
          var8_int = param5 + param2;
          var11 = -126 / ((-11 - param1) / 36);
          var9 = param0 - param5;
          for (var13 = param2; var8_int > var13; var13++) {
            di.a(param6, (byte) -115, param7, qd.field_a[var13], param4);
          }
          for (var13Lifetime1 = param0; var9 < var13Lifetime1; var13Lifetime1--) {
            di.a(param6, (byte) 75, param7, qd.field_a[var13Lifetime1], param4);
          }
          var12 = -param5 + param4;
          var10 = param5 + param6;
          for (var13Lifetime2 = var8_int; var9 >= var13Lifetime2; var13Lifetime2++) {
            var19 = qd.field_a[var13Lifetime2];
            di.a(param6, (byte) -110, param7, var19, var10);
            di.a(var10, (byte) -120, param3, var19, var12);
            di.a(var12, (byte) 57, param7, var19, param4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var8), "qm.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static int a(byte param0, int param1) {
        param1--;
        if (param0 == -106) {
          param1 = param1 | param1 >>> 1;
          param1 = param1 | param1 >>> 2;
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return 1 + param1;
        }
        field_a = (la) null;
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        param1 = param1 | param1 >>> 16;
        return 1 + param1;
    }

    final static ae a(String param0, byte param1) {
        String var2 = null;
        ae var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        ae stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        ae stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Torquing.field_u;
        try {
          if (null == sh.field_a) {
            return null;
          }
          if (param0 == null) {
            return null;
          }
          if (0 == param0.length()) {
            stackIn_7_0 = null;
            return (ae) (stackIn_7_0);
          }
          if (param1 != 45) {
            stackIn_10_0 = (ae) null;
            return stackIn_10_0;
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = hf.a(var6, 118);
          if (var2 == null) {
            stackIn_13_0 = null;
            return (ae) (stackIn_13_0);
          }
          var3 = (ae) (sh.field_a.a((long)var2.hashCode(), param1 ^ -8));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_ob);
            var4 = hf.a(var7, param1 + 68);
            if (!var4.equals(var2)) {
              var3 = (ae) (sh.field_a.b(-1));
              continue;
            }
            break;
          }
          stackIn_19_0 = var3;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("qm.E(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(boolean param0, int param1, int param2, int param3, int[] param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = param4[5 + param3] * (param5 - param4[param3 + 2]) + (-param4[param3] + param2) * param4[param3 + 3] + (param1 - param4[param3 + 1]) * param4[param3 + 4];
          if (!param0) {
            stackIn_2_0 = 67;
            return stackIn_2_0;
          }
          if (0 < var6_int) {
            stackIn_8_0 = 1;
          } else {
            stackIn_8_0 = (var6_int != 0) ? -1 : 0;
          }
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("qm.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_b = "Retry";
    }
}
