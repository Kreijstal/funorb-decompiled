/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jf {
    le[] field_c;
    static bc field_a;
    static String field_b;

    final int a(int param0, int param1, int param2, String param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          if (param2 != 21107) {
            var11 = (String) null;
            this.a(-66, 103, -92, (String) null);
          }
          var5_int = 0;
          var6 = 0;
          var7 = param3.length();
          for (var8 = 0; var7 > var8; var8++) {
            var9 = param3.charAt(var8);
            if (var9 != 60) {
              if (var9 == 62) {
                var6 = 0;
              } else {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              }
            } else {
              var6 = 1;
            }
          }
          if (0 >= var5_int) {
            stackIn_22_0 = 0;
            return stackIn_22_0;
          }
          stackIn_20_0 = (-param0 + param1 << 8) / var5_int;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("jf.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        le var6;
        int var7;
        int var8;
        var8 = SolKnight.field_L ? 1 : 0;
        if (this.field_c != null &&
          0 != this.field_c.length &&
          param1 >= this.field_c[0].field_g) {
          if (param1 > this.field_c[this.field_c.length - 1].field_e) {
            return -1;
          }
          if (1 == this.field_c.length) {
            return this.field_c[0].a(param2, false);
          }
          if (param0 != -2592) {
            return -51;
          }
          var4 = 0;
          for (var5 = 0; var5 < this.field_c.length; var5++) {
            var6 = this.field_c[var5];
            if (var6.field_g <= param1 &&
              var6.field_e >= param1) {
              var7 = var6.a(param2, false);
              if (var7 != -1) {
                return var7 + var4;
              }
              return -1;
            }
            var4 = var4 + (var6.field_c.length - 1);
          }
          return -1;
        }
        return -1;
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        le var5 = null;
        int var6 = SolKnight.field_L ? 1 : 0;
        le[] var7 = this.field_c;
        le[] var3 = var7;
        for (var4 = param0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (!(var5.field_c.length <= param1)) {
            return var5.field_c[param1];
          }
          param1 = param1 - (var5.field_c.length - 1);
        }
        return 0;
    }

    final int b(int param0) {
        int var4 = 0;
        int var2;
        le[] var3;
        le var5;
        int var7;
        int var6;
        var7 = SolKnight.field_L ? 1 : 0;
        var2 = -1;
        if (null != this.field_c) {
          var3 = this.field_c;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a((byte) 110);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        if (param0 != 62) {
          this.a((byte) 22);
        }
        return var2;
    }

    final int a(byte param0) {
        int var2;
        int stackIn_5_0 = 0;
        var2 = 5 % ((60 - param0) / 43);
        if (this.field_c != null &&
          this.field_c.length > 0) {
          stackIn_5_0 = -this.field_c[0].field_g + this.field_c[this.field_c.length - 1].field_e;
        } else {
          stackIn_5_0 = 0;
        }
        return stackIn_5_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -25616) {
          field_b = (String) null;
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        le var4 = null;
        int var5 = SolKnight.field_L ? 1 : 0;
        for (var3 = 0; this.field_c.length > var3; var3++) {
          var4 = this.field_c[var3];
          if (var4.field_c.length > param1) {
            return var3;
          }
          param1 = param1 - (var4.field_c.length - 1);
        }
        if (param0 > -87) {
          field_b = (String) null;
        }
        return this.field_c.length;
    }

    static {
    }
}
