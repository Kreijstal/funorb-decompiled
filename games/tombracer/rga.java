/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rga {
    static int[] field_b;
    int field_a;
    private int field_c;

    public static void a(byte param0) {
        if (param0 <= 56) {
          field_b = (int[]) null;
        }
        field_b = null;
    }

    final static String[] a(int param0, String param1, char param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        CharSequence var11 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          var11 = (CharSequence) ((Object) param1);
          var3_int = sd.a(param2, (byte) 93, var11);
          var4 = new String[1 + var3_int];
          var5 = 0;
          var6 = 0;
          if (param0 != 32287) {
            var10 = (String) null;
            rga.a(65, (String) null, 'ﾭ');
          }
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param2 != param1.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param1.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param1.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("rga.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var18 = null;
        int var12Lifetime1;
        int var12Lifetime2;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          var9 = param7 - param0;
          var8_int = param0 + param4;
          for (var12 = param4; var8_int > var12; var12++) {
            nra.a((byte) -55, param5, param6, vaa.field_a[var12], param3);
          }
          if (param1 <= 97) {
            rga.a((byte) -93);
          }
          for (var12Lifetime1 = param7; var12Lifetime1 > var9; var12Lifetime1--) {
            nra.a((byte) -55, param5, param6, vaa.field_a[var12Lifetime1], param3);
          }
          var11 = param6 - param0;
          var10 = param3 + param0;
          for (var12Lifetime2 = var8_int; var9 >= var12Lifetime2; var12Lifetime2++) {
            var18 = vaa.field_a[var12Lifetime2];
            nra.a((byte) -55, param5, var10, var18, param3);
            nra.a((byte) -55, param2, var11, var18, var10);
            nra.a((byte) -55, param5, param6, var18, var11);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var8), "rga.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static ka a(ka param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ka stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -57 % ((param2 + 32) / 49);
          if (param0 == null) {
            return null;
          }
          stackIn_4_0 = param0.a(param1, 654255, false);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("rga.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final rga a(int param0, int param1) {
        if (param0 != 0) {
          ka var4 = (ka) null;
          rga.a((ka) null, (byte) 71, 47);
        }
        return new rga(this.field_c, param1);
    }

    final static int b(int param0, int param1) {
        if (param0 != 26499) {
          String var3 = (String) null;
          rga.a(121, (String) null, 'J');
        }
        if (cm.field_a == null) {
          return 0;
        }
        g[] var4 = cm.field_a[param1].field_c;
        g[] var2 = var4;
        return var4.length;
    }

    rga(int param0, int param1) {
        this.field_c = param0;
        this.field_a = param1;
    }

    static {
    }
}
