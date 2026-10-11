/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends lq {
    private int[][] field_j;
    private qm[] field_p;
    static String field_m;
    ru[] field_k;
    int[] field_n;
    private int[] field_l;
    int field_o;
    private int[] field_i;

    final int d() {
        return 2;
    }

    final synchronized void a(int param0, int param1, byte param2) {
        if (param2 != -85) {
          this.field_l = (int[]) null;
        }
        if (param0 >= 0 &&
          this.field_o > param0) {
          if (param1 >= 0 &&
            256 >= param1) {
            this.field_l[param0] = param1;
            return;
          }
          throw new IllegalArgumentException("Illegal volume: " + param1);
        }
        throw new IllegalArgumentException("Illegal midiplayer: " + param0);
    }

    final void a(int[] param0, int param1, int param2) {
        int[] array$0 = null;
        int var10 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var5Lifetime1;
        int var6_intLifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var7Lifetime1;
        var11 = Kickabout.field_G;
        try {
          var4_int = 1;
          for (var5 = 0; this.field_l.length > var5; var5++) {
            if (this.field_l[var5] != 0) {
              var4_int = 0;
            }
          }
          if (var4_int != 0) {
            this.a(param2);
            return;
          }
          var5Lifetime1 = 0;
          for (var6_int = 0; var6_int < this.field_p.length; var6_int++) {
            if (this.field_p[var6_int] != null) {
              var5Lifetime1++;
            }
          }
          for (var6_intLifetime1 = 0; var6_intLifetime1 < this.field_n.length; var6_intLifetime1++) {
            if (this.field_n[var6_intLifetime1] != 0) {
              this.field_i[var6_intLifetime1] = this.field_i[var6_intLifetime1] + this.field_n[var6_intLifetime1] * param2;
              if (this.field_i[var6_intLifetime1] >= 1048576) {
                this.field_i[var6_intLifetime1] = 1048576;
                this.field_n[var6_intLifetime1] = 0;
              }
              if (this.field_i[var6_intLifetime1] <= 0) {
                this.field_i[var6_intLifetime1] = 0;
                this.field_n[var6_intLifetime1] = 0;
                if (this.field_p[var6_intLifetime1] != null) {
                  this.field_k[var6_intLifetime1].b(21404);
                }
                this.field_p[var6_intLifetime1] = null;
              }
            }
          }
          var13 = new int[this.field_o];
          var12 = var13;
          var6 = var12;
          for (var7 = 0; var7 < var13.length; var7++) {
            var6[var7] = (this.field_i[var7] >> 12) * this.field_l[var7] / 256;
          }
          if (var5Lifetime1 == 0) {
            return;
          }
          if (!uh.field_o) {
            stackIn_39_0 = param2;
          } else {
            stackIn_39_0 = param2 << 1;
          }
          var7Lifetime1 = stackIn_39_0;
          if (this.field_j[0] != null &&
            var7Lifetime1 <= this.field_j[0].length) {
            for (var8 = 0; this.field_j.length > var8; var8++) {
              dv.a(this.field_j[var8], 0, var7Lifetime1);
            }
          } else {
            for (var8 = 0; var8 < this.field_j.length; var8++) {
              array$0 = new int[var7Lifetime1];
              this.field_j[var8] = array$0;
            }
          }
          for (var8Lifetime1 = 0; var8Lifetime1 < this.field_p.length; var8Lifetime1++) {
            if (this.field_p[var8Lifetime1] != null) {
              this.field_k[var8Lifetime1].a(this.field_j[var8Lifetime1], param1, param2);
            }
          }
          if (uh.field_o) {
            param1 = param1 << 1;
          }
          for (var8Lifetime2 = 0; var8Lifetime2 < var7Lifetime1; var8Lifetime2++) {
            var9 = 0;
            for (var10 = 0; this.field_j.length > var10; var10++) {
              if (null != this.field_p[var10]) {
                var9 = var9 + this.field_j[var10][var8Lifetime2] * var13[var10];
              }
            }
            param0[var8Lifetime2 + param1] = param0[var8Lifetime2 + param1] + (var9 >> 8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_68_0 = var4;
          stackIn_68_1 = new StringBuilder().append("jj.E(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final lq b() {
        return null;
    }

    final void a(boolean param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param4 >= 0 &&
            this.field_o > param4) {
            if (null != this.field_p[param4]) {
              this.field_k[param4].b(21404);
            }
            this.field_p[param4] = param2;
            if (param2 != null) {
              this.field_n[param4] = param5;
              this.field_k[param4].d(-1, -1, param6);
              this.field_k[param4].a(param0, 19134, param2);
              this.field_k[param4].c(param1, 107342216);
            }
            if (param3 != -9017) {
              field_m = (String) null;
            }
            return;
          }
          throw new IllegalArgumentException("Illegal midiplayer: " + param4);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("jj.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        for (var4 = param0; this.field_k.length > var4; var4++) {
          this.field_k[var4].b(param2, param1, (byte) -73);
        }
    }

    final static byte[] a(int param0, byte[] param1, byte param2, int param3) {
        int var6_int = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var8 = 0;
        byte[] var9 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        m var6 = null;
        byte[] var7 = null;
        var8 = Kickabout.field_G;
        try {
          var5 = 34 / ((param2 + 65) / 52);
          if (param3 > 0) {
            var9 = new byte[param0];
            var4 = var9;
            for (var6_int = 0; param0 > var6_int; var6_int++) {
              var9[var6_int] = param1[param3 + var6_int];
            }
          } else {
            var4 = param1;
          }
          var6 = new m();
          var6.a(true);
          var6.a((byte) 126, (long)(param0 * 8), var4);
          var7 = new byte[64];
          var6.a(var7, 21024, 0);
          stackIn_7_0 = var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("jj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0) {
        int var2_int = 0;
        int[] var2;
        int var3;
        int var4;
        int[] var5;
        int var6;
        int[] var7;
        int[] var8;
        int var3Lifetime1;
        var4 = Kickabout.field_G;
        for (var2_int = 0; this.field_k.length > var2_int; var2_int++) {
          if (null != this.field_p[var2_int]) {
            this.field_k[var2_int].a(param0);
          }
        }
        var8 = new int[this.field_o];
        var7 = var8;
        var5 = var7;
        var2 = var5;
        for (var3 = 0; var3 < var8.length; var3++) {
          var5[var3] = (this.field_i[var3] >> 12) * this.field_l[var3] / 256;
        }
        var6 = 0;
        var3Lifetime1 = var6;
        while (this.field_n.length > var6) {
          if (0 != this.field_n[var6]) {
            this.field_i[var6] = this.field_i[var6] + param0 * this.field_n[var6];
            if (this.field_i[var6] >= 1048576) {
              this.field_i[var6] = 1048576;
              this.field_n[var6] = 0;
            }
            if (this.field_i[var6] <= 0) {
              this.field_i[var6] = 0;
              this.field_n[var6] = 0;
              if (this.field_p[var6] != null) {
                this.field_k[var6].b(21404);
              }
              this.field_p[var6] = null;
            }
          }
          var6++;
        }
    }

    public static void a(byte param0) {
        field_m = null;
        if (param0 > -77) {
          field_m = (String) null;
        }
    }

    final lq c() {
        return null;
    }

    jj(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        this.field_o = 3;
        this.field_o = param0;
        this.field_l = new int[param0];
        for (var2 = 0; var2 < this.field_l.length; var2++) {
          this.field_l[var2] = 256;
        }
        this.field_i = new int[this.field_o];
        this.field_j = new int[this.field_o][];
        this.field_k = new ru[this.field_o];
        this.field_n = new int[this.field_o];
        this.field_p = new qm[this.field_o];
        int var4 = 0;
        var2Lifetime1 = var4;
        while (var4 < this.field_k.length) {
          if (var4 == 0) {
            this.field_k[var4] = new ru();
          } else {
            this.field_k[var4] = new ru(this.field_k[-1 + var4]);
          }
          this.field_i[var4] = 1048576;
          var4++;
        }
    }

    static {
        field_m = "<%0> has left the lobby.";
    }
}
