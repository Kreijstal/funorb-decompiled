/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vla extends ci {
    static String field_m;
    private int field_n;

    final void b(byte param0) {
        if (param0 != 116) {
          this.field_n = -128;
        }
        tka.b((byte) 48);
    }

    final int[][] b(int param0, int param1) {
        int[] var30 = null;
        int[] var31 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var32 = null;
        int var17 = TombRacer.field_G ? 1 : 0;
        if (param1 != -1) {
          this.b((byte) -123);
        }
        int[][] var23 = this.field_h.a(param0, (byte) 115);
        int[][] var19 = var23;
        int[][] var18 = var19;
        int[][] var3 = var18;
        if (this.field_h.field_f) {
          var30 = this.c(1, param1 - 21, param0);
          var31 = this.c(2, -45, param0);
          var6 = var23[0];
          var7 = var23[1];
          var8 = var23[2];
          for (var9 = 0; var9 < ns.field_g; var9++) {
            var10 = 255 & 255 * var30[var9] >> 12;
            var11 = this.field_n * var31[var9] >> 12;
            var12 = lm.field_r[var10] * var11 >> 12;
            var13 = ou.field_e[var10] * var11 >> 12;
            var14 = (var12 >> 12) + var9 & una.field_b;
            var15 = hba.field_b & (var13 >> 12) + param0;
            var32 = this.a(var15, 0, -1);
            var6[var9] = var32[0][var14];
            var7[var9] = var32[1][var14];
            var8[var9] = var32[2][var14];
          }
        }
        return var18;
    }

    public vla() {
        super(3, false);
        this.field_n = 32768;
    }

    final int[] c(int param0, int param1) {
        int[] var26 = null;
        int[] var27 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var28 = null;
        int var14 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
          uia var15 = (uia) null;
          this.a((byte) 85, (uia) null, -36);
        }
        int[] var16 = this.field_i.a((byte) -128, param1);
        int[] var3 = var16;
        if (this.field_i.field_d) {
          var26 = this.c(1, param0 - 85, param1);
          var27 = this.c(2, -119, param1);
          for (var6 = 0; var6 < ns.field_g; var6++) {
            var7 = (4094 & var26[var6]) >> 4;
            var8 = this.field_n * var27[var6] >> 12;
            var9 = lm.field_r[var7] * var8 >> 12;
            var10 = ou.field_e[var7] * var8 >> 12;
            var11 = var6 + (var9 >> 12) & una.field_b;
            var12 = hba.field_b & (var10 >> 12) + param1;
            var28 = this.c(0, -27, var12);
            var16[var6] = var28[var11];
          }
        }
        return var3;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param2;
          if (var4_int == 0) {
            this.field_n = param1.d(122) << 4;
          } else {
            if (1 == var4_int) {
              stackIn_7_1 = (param1.h(255) == 1);
              this.field_g = stackIn_7_1;
            }
          }
          if (param0 != 107) {
            this.field_n = -22;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("vla.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void c(int param0) {
        if (param0 != 2) {
          return;
        }
        field_m = null;
    }

    static {
        field_m = "Orb coins: <%0>";
    }
}
