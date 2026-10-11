/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qv extends ci {
    private int field_q;
    private int field_n;
    private int field_p;
    private int field_r;
    static int field_m;
    static kb field_o;

    final int[] c(int param0, int param1) {
        int var4 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_12_2 = 0;
        int[] var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int[] var15;
        var14 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
          this.c(94, -103);
        }
        var15 = this.field_i.a((byte) 20, param1);
        var3 = var15;
        if (this.field_i.field_d) {
          for (var4 = 0; var4 < ns.field_g; var4++) {
            var5 = (ht.field_Fb[var4] << 12) / this.field_q + this.field_n;
            var6 = (sj.field_b[param1] << 12) / this.field_q + this.field_p;
            var7 = var5;
            var8 = var6;
            var9 = var5;
            var10 = var6;
            var11 = var5 * var5 >> 12;
            var12 = var6 * var6 >> 12;
            var13 = 0;
            while (16384 > var12 + var11) {
              if (this.field_r > var13) {
                var10 = 2 * (var9 * var10 >> 12) + var8;
                var9 = var7 + var11 - var12;
                var11 = var9 * var9 >> 12;
                var12 = var10 * var10 >> 12;
                var13++;
                continue;
              }
              break;
            }
            stackIn_11_0 = var15;
            stackIn_11_1 = var4;
            if (this.field_r - 1 <= var13) {
              stackIn_12_2 = 0;
            } else {
              stackIn_12_2 = (var13 << 12) / this.field_r;
            }
            stackIn_11_0[stackIn_11_1] = stackIn_12_2;
          }
        }
        return var15;
    }

    final static int[][] a(boolean param0, int param1, int param2, float param3, int param4, byte param5, int param6, int param7, int param8) {
        int var11 = 0;
        int var12 = TombRacer.field_G ? 1 : 0;
        if (param5 >= -46) {
          field_m = -82;
        }
        int[][] var15 = new int[param8][param4];
        int[][] var14 = var15;
        int[][] var13 = var14;
        int[][] var9 = var13;
        lva var10 = new lva();
        var10.field_x = (int)(param3 * 4096.0f);
        var10.field_n = param2;
        var10.field_s = param0 ? true : false;
        var10.field_w = param7;
        var10.field_u = param6;
        var10.b((byte) 116);
        uta.a(0, param8, param4);
        for (var11 = 0; var11 < param8; var11++) {
          var10.a(var15[var11], -1, var11);
        }
        return var9;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 107) {
            return;
          }
          var4_int = param2;
          if (var4_int != 0) {
            if (1 == var4_int) {
              this.field_r = param1.d(121);
            } else {
              if (var4_int == 2) {
                this.field_n = param1.d(124);
              } else {
                if (3 == var4_int) {
                  this.field_p = param1.d(121);
                }
              }
            }
          } else {
            this.field_q = param1.d(param0 + 16);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("qv.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        if (!param0) {
          qv.a(false, 72, -128, 0.8583102226257324f, -87, (byte) 7, -60, -76, -111);
        }
    }

    public qv() {
        super(0, true);
        this.field_q = 1365;
        this.field_n = 0;
        this.field_p = 0;
        this.field_r = 20;
    }

    static {
        field_o = null;
    }
}
