/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kma extends k {
    static String field_p;
    static String field_m;
    private int field_k;
    private int[] field_n;
    private int field_l;
    static eaa field_o;
    private int field_q;

    final void a(byte param0, lu param1, int param2) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 == 0) {
            this.field_l = param1.e((byte) 60);
          }
          if (param0 != -71) {
            field_o = (eaa) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("kma.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final int[][] a(boolean param0, int param1) {
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int[][] var3;
        int var4;
        int[] var5;
        int[] var6;
        int[] var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[][] var12;
        int[][] var13;
        int[][] var14;
        int stackIn_6_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_1 = 0;
        int var4Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int[][] var3Lifetime1;
        int[] var5Lifetime1;
        int[] var6Lifetime1;
        int[] var7Lifetime1;
        int[][] var12Lifetime1;
        int[][] var13Lifetime1;
        int[][] var14Lifetime1;
        var11 = BachelorFridge.field_y;
        if (!param0) {
          var14 = this.field_h.a(param1, -858);
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (!this.field_h.field_b) {
            return var3;
          }
          stackIn_22_0 = this.field_k;
          if (this.field_q == bi.field_g) {
            stackIn_23_1 = param1;
          } else {
            stackIn_23_1 = this.field_q * param1 / bi.field_g;
          }
          var4 = stackIn_22_0 * stackIn_23_1;
          var5 = var14[0];
          var6 = var14[1];
          var7 = var14[2];
          if (hh.field_d != this.field_k) {
            for (var8 = 0; hh.field_d > var8; var8++) {
              var9 = this.field_k * var8 / hh.field_d;
              var10 = this.field_n[var4 + var9];
              var7[var8] = dda.a(4080, var10 << 4);
              var6[var8] = dda.a(var10, 65280) >> 4;
              var5[var8] = dda.a(4080, var10 >> 12);
            }
          } else {
            for (var8 = 0; hh.field_d > var8; var8++) {
              incrementValue$1 = var4;
              var4++;
              var9 = this.field_n[incrementValue$1];
              var7[var8] = dda.a(4080, var9 << 4);
              var6[var8] = dda.a(var9, 65280) >> 4;
              var5[var8] = dda.a(4080, var9 >> 12);
            }
          }
          return var3;
        }
        this.c((byte) 116);
        var14Lifetime1 = this.field_h.a(param1, -858);
        var13Lifetime1 = var14Lifetime1;
        var12Lifetime1 = var13Lifetime1;
        var3Lifetime1 = var12Lifetime1;
        if (!this.field_h.field_b) {
          return var3Lifetime1;
        }
        stackIn_6_0 = this.field_k;
        if (this.field_q == bi.field_g) {
          stackIn_7_1 = param1;
        } else {
          stackIn_7_1 = this.field_q * param1 / bi.field_g;
        }
        var4Lifetime1 = stackIn_6_0 * stackIn_7_1;
        var5Lifetime1 = var14Lifetime1[0];
        var6Lifetime1 = var14Lifetime1[1];
        var7Lifetime1 = var14Lifetime1[2];
        if (hh.field_d != this.field_k) {
          for (var8Lifetime1 = 0; hh.field_d > var8Lifetime1; var8Lifetime1++) {
            var9Lifetime1 = this.field_k * var8Lifetime1 / hh.field_d;
            var10Lifetime1 = this.field_n[var4Lifetime1 + var9Lifetime1];
            var7Lifetime1[var8Lifetime1] = dda.a(4080, var10Lifetime1 << 4);
            var6Lifetime1[var8Lifetime1] = dda.a(var10Lifetime1, 65280) >> 4;
            var5Lifetime1[var8Lifetime1] = dda.a(4080, var10Lifetime1 >> 12);
          }
        } else {
          for (var8Lifetime1 = 0; hh.field_d > var8Lifetime1; var8Lifetime1++) {
            incrementValue$2 = var4Lifetime1;
            var4Lifetime1++;
            var9Lifetime1 = this.field_n[incrementValue$2];
            var7Lifetime1[var8Lifetime1] = dda.a(4080, var9Lifetime1 << 4);
            var6Lifetime1[var8Lifetime1] = dda.a(var9Lifetime1, 65280) >> 4;
            var5Lifetime1[var8Lifetime1] = dda.a(4080, var9Lifetime1 >> 12);
          }
        }
        return var3Lifetime1;
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        if (param1 > -9) {
          return;
        }
        super.a(param0, (byte) -95, param2);
        if (this.field_l < 0) {
          return;
        }
        if (da.field_c != null) {
          var4 = !da.field_c.c(this.field_l, 0).field_d ? 128 : 64;
          this.field_n = da.field_c.a(0, false, var4, 1.0f, this.field_l, var4);
          this.field_q = var4;
          this.field_k = var4;
          return;
        }
    }

    public kma() {
        super(0, false);
        this.field_l = -1;
    }

    final int c(byte param0) {
        if (param0 <= 35) {
          kma.d(-92);
          return this.field_l;
        }
        return this.field_l;
    }

    final void b(int param0) {
        super.b(param0);
        this.field_n = null;
    }

    final static void d(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = BachelorFridge.field_y;
        try {
          ng.field_f = new js(32);
          if (param0 > -93) {
            return;
          }
          for (var1_int = 0; fj.field_m.length > var1_int; var1_int++) {
            ng.field_f.a((long)fj.field_m[var1_int].toLowerCase().hashCode(), (byte) -114, new ji(var1_int));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "kma.D(" + param0 + ')');
        }
    }

    public static void e(int param0) {
        if (param0 == -1) {
          field_p = null;
          field_m = null;
          field_o = null;
          return;
        }
        field_p = (String) null;
        field_p = null;
        field_m = null;
        field_o = null;
    }

    static {
        field_p = "Enter name of player to delete from list";
        field_m = "All";
        field_o = new eaa();
    }
}
