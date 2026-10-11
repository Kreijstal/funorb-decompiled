/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wv extends le {
    private int field_j;
    private int field_m;
    private int field_i;
    private int[] field_k;
    static String field_l;

    public wv() {
        super(0, false);
        this.field_i = -1;
    }

    final void a(int param0, int param1, ds param2) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 > -60) {
            wv.d(-72);
          }
          if (param0 == 0) {
            this.field_i = param2.e(1869);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("wv.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        if (param0 != 65280) {
          return;
        }
        field_l = null;
    }

    final void c(int param0) {
        super.c(-115);
        this.field_k = null;
        if (param0 > -23) {
          this.field_i = 99;
        }
    }

    final int d(byte param0) {
        if (param0 < 62) {
          this.c(111);
        }
        return this.field_i;
    }

    final int[][] a(int param0, int param1) {
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_1 = 0;
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
        var11 = VoidHunters.field_G;
        if (param0 != 255) {
          return (int[][]) null;
        }
        var14 = this.field_d.a(param1, (byte) -101);
        var13 = var14;
        var12 = var13;
        var3 = var12;
        if (this.field_d.field_g) {
          stackIn_5_0 = this.field_m;
          if (noa.field_o != this.field_j) {
            stackIn_6_1 = this.field_j * param1 / noa.field_o;
          } else {
            stackIn_6_1 = param1;
          }
          var4 = stackIn_5_0 * stackIn_6_1;
          var5 = var14[0];
          var6 = var14[1];
          var7 = var14[2];
          if (this.field_m != hob.field_d) {
            for (var8 = 0; var8 < hob.field_d; var8++) {
              var9 = var8 * this.field_m / hob.field_d;
              var10 = this.field_k[var4 + var9];
              var7[var8] = dla.a(255, var10) << 4;
              var6[var8] = dla.a(var10 >> 4, 4080);
              var5[var8] = dla.a(16711680, var10) >> 12;
            }
          } else {
            for (var8 = 0; hob.field_d > var8; var8++) {
              incrementValue$0 = var4;
              var4++;
              var9 = this.field_k[incrementValue$0];
              var7[var8] = dla.a(var9 << 4, 4080);
              var6[var8] = dla.a(var9, 65280) >> 4;
              var5[var8] = dla.a(var9 >> 12, 4080);
            }
          }
        }
        return var3;
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        super.b(param0, param1, param2);
        if (this.field_i >= 0 &&
          nl.field_e != null) {
          var4 = nl.field_e.a(-20292, this.field_i).field_h ? 64 : 128;
          this.field_k = nl.field_e.a(var4, 1.0f, true, this.field_i, var4, false);
          this.field_j = var4;
          this.field_m = var4;
        }
    }

    static {
        field_l = "Back";
    }
}
