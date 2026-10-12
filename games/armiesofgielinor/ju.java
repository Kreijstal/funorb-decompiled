/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ju {
    static RgbSprite[][] field_a;
    ts[] field_b;
    static int[] field_c;

    final int a(byte param0) {
        int var2;
        int stackIn_4_0 = 0;
        var2 = -76 / ((param0 - 74) / 32);
        if (this.field_b != null &&
          0 < this.field_b.length) {
          stackIn_4_0 = this.field_b[-1 + this.field_b.length].field_c - this.field_b[0].field_n;
        } else {
          stackIn_4_0 = 0;
        }
        return stackIn_4_0;
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        ts var6 = null;
        int var7 = 0;
        int var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_b == null ||
          0 == this.field_b.length ||
          this.field_b[0].field_n > param1) {
          return -1;
        }
        if (param1 > this.field_b[this.field_b.length + param2].field_c) {
          return -1;
        }
        if (this.field_b.length == 1) {
          return this.field_b[0].a(param0, (byte) 29);
        }
        int var4 = 0;
        for (var5 = 0; this.field_b.length > var5; var5++) {
          var6 = this.field_b[var5];
          if (param1 >= var6.field_n &&
            param1 <= var6.field_c) {
            var7 = var6.a(param0, (byte) 29);
            if (var7 == -1) {
              return -1;
            }
            return var4 + var7;
          }
          var4 = var4 + (-1 + var6.field_i.length);
        }
        return -1;
    }

    final static int a(CipherPacketBuffer param0, int param1, int param2, int param3, byte param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        CipherPacketBuffer var7 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 > -121) {
            var7 = (CipherPacketBuffer) null;
            ju.a((CipherPacketBuffer) null, 120, 29, -83, (byte) -93, 59);
          }
          var6_int = param0.readBits(-106, 1);
          if (0 != var6_int) {
            if (1 != var6_int) {
              throw new IllegalStateException();
            }
            stackIn_10_0 = param0.readBits(95, param3) + param1;
            return stackIn_10_0;
          }
          if (param5 > 0) {
            stackIn_6_0 = param0.readBits(-109, param5);
          } else {
            stackIn_6_0 = 0;
          }
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("ju.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static int a(int param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            ju.a(-112);
          }
          stackIn_3_0 = ob.a(param1, true, param2, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ju.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final int a(boolean param0) {
        int var4 = 0;
        int var2;
        ts[] var3;
        ts var5;
        int var7;
        int var6;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = -1;
        if (this.field_b != null) {
          var3 = this.field_b;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a(0);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        if (param0) {
          field_a = (RgbSprite[][]) null;
        }
        return var2;
    }

    final int a(byte param0, int param1) {
        int var4 = 0;
        ts[] var3;
        ts var5;
        int var6;
        ts[] var7;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var7 = this.field_b;
        var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
          var5 = var7[var4];
          if (var5.field_i.length > param1) {
            return var5.field_i[param1];
          }
          param1 = param1 - (-1 + var5.field_i.length);
        }
        if (param0 == -66) {
          return 0;
        }
        this.a(true);
        return 0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        ts var4 = null;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        for (var3 = param0; this.field_b.length > var3; var3++) {
          var4 = this.field_b[var3];
          if (!(var4.field_i.length <= param1)) {
            return var3;
          }
          param1 = param1 - (-1 + var4.field_i.length);
        }
        return this.field_b.length;
    }

    public static void a(int param0) {
        if (param0 >= -111) {
          CharSequence var2 = (CharSequence) null;
          ju.a(-42, 6, (CharSequence) null);
        }
        field_c = null;
        field_a = (RgbSprite[][]) null;
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param1.length();
          for (var8 = param0; var7 > var8; var8++) {
            var9 = param1.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
            } else {
              if (var9 == 62) {
                var6 = 0;
              } else {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              }
            }
          }
          if (var5_int > 0) {
            stackIn_19_0 = (-param3 + param2 << 8) / var5_int;
            return stackIn_19_0;
          }
          stackIn_21_0 = 0;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("ju.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_c = new int[8192];
    }
}
