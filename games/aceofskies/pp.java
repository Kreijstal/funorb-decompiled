/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pp {
    static int field_a;
    co[] field_b;

    final int a(int param0, byte param1, int param2) {
        int var5 = 0;
        co var6 = null;
        int var7 = 0;
        int var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (this.field_b == null ||
          0 == this.field_b.length ||
          param2 < this.field_b[0].field_f) {
          return -1;
        }
        if (!(this.field_b[-1 + this.field_b.length].field_d >= param2)) {
          return -1;
        }
        if (1 == this.field_b.length) {
          return this.field_b[0].a(true, param0);
        }
        int var4 = 0;
        if (param1 < 34) {
          this.a(103);
        }
        for (var5 = 0; this.field_b.length > var5; var5++) {
          var6 = this.field_b[var5];
          if (param2 >= var6.field_f &&
            !(var6.field_d < param2)) {
            var7 = var6.a(true, param0);
            if (-1 == var7) {
              return -1;
            }
            return var7 + var4;
          }
          var4 = var4 + (var6.field_h.length - 1);
        }
        return -1;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        co var4 = null;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param0 != 1) {
          return 124;
        }
        for (var3 = 0; var3 < this.field_b.length; var3++) {
          var4 = this.field_b[var3];
          if (!(var4.field_h.length <= param1)) {
            return var3;
          }
          param1 = param1 - (var4.field_h.length - 1);
        }
        return this.field_b.length;
    }

    final int b(int param0, int param1) {
        co var5 = null;
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        co[] var7 = this.field_b;
        co[] var3 = var7;
        int var4 = 0;
        if (param1 >= -101) {
          return 7;
        }
        while (var4 < var7.length) {
          var5 = var7[var4];
          if (param0 < var5.field_h.length) {
            return var5.field_h[param0];
          }
          param0 = param0 - (var5.field_h.length - 1);
          var4++;
        }
        return 0;
    }

    final int a(int param0, int param1, String param2, int param3) {
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
        var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param2.length();
          for (var8 = 0; var7 > var8; var8++) {
            var9 = param2.charAt(var8);
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
          if (~var5_int < param1) {
            stackIn_20_0 = (-param3 + param0 << 8) / var5_int;
            return stackIn_20_0;
          }
          stackIn_22_0 = 0;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("pp.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(String[] args, int param1, String param2, int param3) {
        int var5 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_12_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param3 != 26326) {
            return;
          }
          ht.field_k = uk.field_j;
          if (param1 == 255) {
            stackIn_11_0 = 111;
            stackIn_12_1 = !(sd.field_h >= 13);
            ld.field_c = in.$cfr$intArgs$a$1ded6534de63(stackIn_11_0, stackIn_12_1);
          } else {
            if (param1 >= 100 &&
              param1 <= 105) {
              ld.field_c = oq.a((byte) -63, args);
              return;
            }
            ld.field_c = dq.a(param1, 32, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("pp.I(");
          if (args == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(byte param0) {
        int var4 = 0;
        int var2;
        co[] var3;
        co var5;
        int var7;
        String var8;
        int var6;
        var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        var2 = -1;
        if (param0 != 24) {
          var8 = (String) null;
          pp.a((String[]) null, -43, (String) null, -67);
        }
        if (null != this.field_b) {
          var3 = this.field_b;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a(true);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        if (param0 != 0) {
          this.a((byte) 95);
        }
        if (this.field_b != null &&
          this.field_b.length > 0) {
          stackIn_6_0 = this.field_b[-1 + this.field_b.length].field_d - this.field_b[0].field_f;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    static {
    }
}
