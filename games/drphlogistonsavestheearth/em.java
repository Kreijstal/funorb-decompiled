/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class em {
    static boolean field_b;
    mi[] field_a;
    static int field_e;
    static int field_d;
    static boolean field_c;

    final int a(int param0) {
        int var4 = 0;
        int var2;
        mi[] var3;
        mi var5;
        int var7;
        int var6;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = -1;
        if (param0 != -17287) {
          this.a(9, -34, -21);
        }
        if (this.field_a != null) {
          var3 = this.field_a;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a((byte) 112);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        mi var6;
        int var7;
        int var8;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (null != this.field_a &&
          0 != this.field_a.length &&
          this.field_a[0].field_e <= param2) {
          if (param2 > this.field_a[this.field_a.length - 1].field_b) {
            return -1;
          }
          if (this.field_a.length == 1) {
            return this.field_a[0].a(-21878, param0);
          }
          var4 = param1;
          for (var5 = 0; var5 < this.field_a.length; var5++) {
            var6 = this.field_a[var5];
            if (param2 >= var6.field_e &&
              param2 <= var6.field_b) {
              var7 = var6.a(-21878, param0);
              if (var7 == -1) {
                return -1;
              }
              return var4 + var7;
            }
            var4 = var4 + (-1 + var6.field_a.length);
          }
          return -1;
        }
        return -1;
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        mi var4 = null;
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        for (var3 = 0; this.field_a.length > var3; var3++) {
          var4 = this.field_a[var3];
          if (param0 < var4.field_a.length) {
            return var3;
          }
          param0 = param0 - (-1 + var4.field_a.length);
        }
        if (param1 != -12280) {
          this.a(-67, -51);
        }
        return this.field_a.length;
    }

    final int a(int param0, int param1) {
        int var5 = 0;
        mi var6 = null;
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var3 = 58 / ((19 - param0) / 48);
        mi[] var4 = this.field_a;
        for (var5 = 0; var4.length > var5; var5++) {
          var6 = var4[var5];
          if (var6.field_a.length > param1) {
            return var6.field_a[param1];
          }
          param1 = param1 - (var6.field_a.length - 1);
        }
        return 0;
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param1.length();
          for (var8 = 0; var8 < var7; var8++) {
            var9 = param1.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
            } else {
              if (var9 != 62) {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            }
          }
          if (var5_int > param3) {
            stackIn_20_0 = (-param2 + param0 << 8) / var5_int;
            return stackIn_20_0;
          }
          stackIn_22_0 = 0;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("em.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        if (param0 != 20111) {
          field_e = -56;
        }
        if (this.field_a != null &&
          this.field_a.length > 0) {
          stackIn_6_0 = -this.field_a[0].field_e + this.field_a[this.field_a.length - 1].field_b;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    static {
        field_e = 64;
        field_c = false;
        field_d = 100;
    }
}
