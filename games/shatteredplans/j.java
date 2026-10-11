/*
 * Decompiled by CFR-JS 0.4.0.
 */
class j extends ka {
    static String[] field_q;
    static bi[] field_s;
    static fg field_r;
    static String field_p;

    void g(int param0) {
        int var5_int = 0;
        int var11 = 0;
        int stackIn_52_0 = 0;
        int[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_55_2 = 0;
        int stackIn_70_0 = 0;
        int var2;
        int[][] var3;
        boolean[] var4;
        int[] var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var12;
        int var13;
        int[][] var14;
        int[][] var15;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = this.field_g.field_r;
        var15 = new int[var2][];
        var14 = var15;
        var3 = var14;
        if (param0 != -18484) {
          this.g(93);
        }
        this.field_k = -1;
        var4 = new boolean[this.field_o];
        for (var5_int = 0; var2 > var5_int; var5_int++) {
          var3[var5_int] = this.a((byte) -122, this.field_g.field_v[var5_int]);
        }
        var5 = var3[this.field_n.field_x];
        var6 = 0;
        for (var7 = 0; var7 < this.field_o; var7++) {
          L12: {
            if (this.field_g.field_g.field_e[var7].field_y != this.field_n) {
              var8 = 1;
              var9 = 0;
              while (var2 > var9) {
                if (~var9 != ~this.field_n.field_x &&
                  this.field_n.field_h[var9] &&
                  var5[var7] >= var15[var9][var7]) {
                  var8 = 0;
                } else {
                  var9++;
                  continue;
                }
                break;
              }
              var4[var7] = var8 != 0;
              if ((var8 != 0)) {
                var6++;
              }
              break L12;
            }
            var4[var7] = false;
          }
        }
        for (var7Lifetime1 = 0; var2 > var7Lifetime1; var7Lifetime1++) {
          var8Lifetime1 = this.field_g.field_m[-var7Lifetime1 + (-1 + var2)];
          if (this.field_n.field_x != var8Lifetime1 &&
            !this.field_n.field_h[var8Lifetime1] &&
            (this.field_g.field_w & 1 << var8Lifetime1) == 0) {
            var9Lifetime1 = var6;
            for (var10 = 0; var10 < this.field_o; var10++) {
              if (var4[var10] &&
                var5[var10] >= var15[var8Lifetime1][var10]) {
                var9Lifetime1--;
              }
            }
            stackIn_52_0 = (5 > var9Lifetime1) ? 0 : 1;
            var10Lifetime1 = stackIn_52_0;
            stackIn_54_0 = this.field_b;
            stackIn_54_1 = var7Lifetime1;
            if (var10Lifetime1 != 0) {
              stackIn_55_2 = -3;
            } else {
              stackIn_55_2 = 4;
            }
            stackIn_54_0[stackIn_54_1] = stackIn_55_2;
            if (var10Lifetime1 != 0 &&
              this.field_k == -1) {
              this.field_k = var7Lifetime1;
              for (var11 = 0; var11 < this.field_o; var11++) {
                if (var4[var11]) {
                  stackIn_70_0 = (var3[this.field_k][var11] <= var5[var11]) ? 0 : 1;
                  var12 = stackIn_70_0;
                  var4[var11] = var12 != 0;
                  if (var12 == 0) {
                    var6--;
                  }
                }
              }
            }
          }
        }
    }

    int d(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = super.d(param0, param1);
          if (1 != this.field_h) {
            stackIn_3_0 = var3_int;
          } else {
            stackIn_3_0 = 2 * var3_int;
          }
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("j.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void i(int param0) {
        field_r = null;
        field_q = null;
        field_p = null;
        field_s = null;
        if (param0 != 19333) {
          field_r = (fg) null;
        }
    }

    final int a(int param0, byte param1) {
        if (param1 > -25) {
          this.g(104);
        }
        return 1 != this.field_h ? param0 * 3 >> 2 : 7 * param0 >> 3;
    }

    j(dc param0, fs param1, mn param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final int b(byte param0, ln param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -43 / ((param0 + 44) / 62);
          var4 = super.b((byte) 28, param1);
          if (this.field_h == 1) {
            var4 = 3 * var4 >> 1;
          }
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("j.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int[] param1, String param2, int param3, long param4) {
        RuntimeException var6 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2) {
            field_s = (bi[]) null;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 != null && (param3 != 2 ||
            ShatteredPlansClient.a(16, param4, param2))) {
            stackIn_8_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_8_0 = false;
          }
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("j.EB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_q = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_r = new fg();
        field_p = "Your email address is used to identify this account";
    }
}
