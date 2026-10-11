/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends am {
    static byte[][] field_t;
    private int field_s;
    private int field_w;
    private int field_u;
    static dq field_v;

    public lk() {
        super(1, false);
        this.field_s = 4096;
        this.field_w = 4096;
        this.field_u = 4096;
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_27_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Torquing.field_u;
        try {
          if (param2 == null) {
            stackIn_3_0 = ml.field_b;
            return stackIn_3_0;
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = hf.a(param2, 116);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!ra.a(var4.charAt(0), 252) &&
                !ra.a(var4.charAt(var4.length() - 1), 252)) {
                var5 = 0;
                for (var6 = 0; var6 < param2.length(); var6++) {
                  var7 = param2.charAt(var6);
                  if (ra.a((char) var7, 252)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (var5 >= 2 &&
                    !param0) {
                    stackIn_27_0 = am.field_q;
                    return stackIn_27_0;
                  }
                }
                if (param1 <= 16) {
                  field_v = (dq) null;
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_34_0 = cc.field_b;
                return stackIn_34_0;
              }
              stackIn_18_0 = cc.field_b;
              return stackIn_18_0;
            }
            stackIn_13_0 = ml.field_b;
            return stackIn_13_0;
          }
          stackIn_8_0 = ml.field_b;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("lk.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final int[][] a(int param0, int param1) {
        int var11 = 0;
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var12;
        int var13;
        int var14;
        int var15;
        int[][] var16;
        int[][] var18;
        int[][] var23;
        int[][] var31;
        int[] var32;
        int[] var33;
        int[] var34;
        var15 = Torquing.field_u;
        var23 = this.field_r.a(15142, param1);
        var18 = var23;
        var16 = var18;
        var3 = var16;
        if (param0 != -29116) {
          lk.b(-110);
        }
        if (this.field_r.field_b) {
          var31 = this.c(24066, param1, 0);
          var32 = var31[0];
          var34 = var31[1];
          var33 = var31[2];
          var8 = var23[0];
          var9 = var23[1];
          var10 = var23[2];
          for (var11 = 0; ci.field_c > var11; var11++) {
            var12 = var32[var11];
            var13 = var33[var11];
            var14 = var34[var11];
            if (var12 == var13 &&
              var14 == var13) {
              var8[var11] = var12 * this.field_s >> 12;
              var9[var11] = var13 * this.field_u >> 12;
              var10[var11] = this.field_w * var14 >> 12;
            } else {
              var8[var11] = this.field_s;
              var9[var11] = this.field_u;
              var10[var11] = this.field_w;
            }
          }
        }
        return var3;
    }

    public static void b(int param0) {
        if (param0 != 0) {
          lk.b(60);
        }
        field_t = (byte[][]) null;
        field_v = null;
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Torquing.field_u;
        try {
          var4_int = param2;
          if (var4_int != 0) {
            if (1 != var4_int) {
              if (var4_int == 2) {
                this.field_w = param0.i(param1 ^ 7059);
              }
            } else {
              this.field_u = param0.i(7088);
            }
          } else {
            this.field_s = param0.i(7088);
          }
          if (param1 != 35) {
            lk.a('ﾻ', -28);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("lk.H(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(char param0, int param1) {
        if (param1 != 97) {
          return -54;
        }
        if (param0 >= 48 &&
          57 >= param0) {
          return param0 - 48;
        }
        if (param0 >= 97 &&
          param0 <= 122) {
          return 10 - (97 - param0);
        }
        if (65 <= param0 &&
          param0 <= 90) {
          return param0 - 65 + 36;
        }
        return param0 != 43 ? 63 : 62;
    }

    static {
        field_t = new byte[50][];
    }
}
