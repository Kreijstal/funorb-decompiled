/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static int field_c;
    static dl[] field_b;
    static long[] field_a;
    static int field_d;
    private int[] field_e;

    final static int a(vc param0, String param1, int param2, int param3, String[] param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = CrazyCrystals.field_B;
        try {
          var5_int = param0.a(param1);
          if (param3 >= var5_int &&
            param1.indexOf("<br>") == -1) {
            param4[0] = param1;
            stackIn_4_0 = 1;
            return stackIn_4_0;
          }
          var6 = (-1 + (param3 + var5_int)) / param3;
          param3 = var5_int / var6;
          if (param2 != -27815) {
            stackIn_7_0 = -21;
            return stackIn_7_0;
          }
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param1.length();
          for (var9 = 0; var9 < var8; var9++) {
            var10 = param1.charAt(var9);
            if (32 == var10 ||
              var10 == 45) {
              var11 = param1.substring(var7, 1 + var9).trim();
              var12 = param0.a(var11);
              if (var12 >= param3) {
                var7 = 1 + var9;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param4[incrementValue$1] = var11;
              }
            }
            if (62 == var10 &&
              param1.regionMatches(var9 - 3, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param4[incrementValue$2] = param1.substring(var7, -3 + var9).trim();
              var7 = var9 + 1;
            }
          }
          if (var7 < var8) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param4[incrementValue$0] = param1.substring(var7, var8).trim();
          }
          stackIn_29_0 = var6Lifetime1;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("v.E(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 <= 83) {
          field_a = (long[]) null;
        }
        field_b = null;
        field_a = null;
    }

    final static int a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = CrazyCrystals.field_B;
        try {
          var2_int = param1.length();
          var3 = 0;
          for (var4 = 0; var4 < var2_int; var4++) {
            var3 = dg.a(param1.charAt(var4), 17176) - var3 + (var3 << 5);
          }
          if (param0 != -2057727803) {
            field_d = -119;
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("v.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        var3 = (this.field_e.length >> 1) - 1;
        if (param0 != 0) {
          field_d = -81;
        }
        var4 = param1 & var3;
        while (true) {
          var5 = this.field_e[var4 + (var4 + 1)];
          if (-1 == var5) {
            return -1;
          }
          if (param1 == this.field_e[var4 + var4]) {
            return var5;
          }
          var4 = var3 & 1 + var4;
        }
    }

    final static wj a(int param0, int param1, int param2, db param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 28297) {
            field_d = -9;
          }
          if (gm.a(param3, param2, true, param1)) {
            return ql.d(-128);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("v.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    v(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while (var2_int <= param0.length + (param0.length >> 1)) {
            var2_int = var2_int << 1;
          }
          this.field_e = new int[var2_int + var2_int];
          for (var3 = 0; var3 < var2_int + var2_int; var3++) {
            this.field_e[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = param0[var3Lifetime1] & -1 + var2_int;
            while (this.field_e[var4 + (var4 + 1)] != -1) {
              var4 = -1 + var2_int & 1 + var4;
            }
            this.field_e[var4 + var4] = param0[var3Lifetime1];
            this.field_e[1 + var4 + var4] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("v.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_a = new long[32];
        field_c = 0;
    }
}
