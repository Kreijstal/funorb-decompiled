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
        if (!(!this.field_h.field_f)) {
            var30 = this.c(1, param1 + -21, param0);
            var31 = this.c(2, -45, param0);
            var6 = var23[0];
            var7 = var23[1];
            var8 = var23[2];
            for (var9 = 0; var9 < ns.field_g; var9++) {
                var10 = 255 & 255 * var30[var9] >> 161605196;
                var11 = this.field_n * var31[var9] >> 823153740;
                var12 = lm.field_r[var10] * var11 >> 1097848812;
                var13 = ou.field_e[var10] * var11 >> 537874092;
                var14 = (var12 >> 1381407564) + var9 & una.field_b;
                var15 = hba.field_b & (var13 >> -983615444) + param0;
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
            var26 = this.c(1, param0 + -85, param1);
            var27 = this.c(2, -119, param1);
            for (var6 = 0; var6 < ns.field_g; var6++) {
                var7 = (4094 & var26[var6]) >> -2094747676;
                var8 = this.field_n * var27[var6] >> 1537868108;
                var9 = lm.field_r[var7] * var8 >> -300688436;
                var10 = ou.field_e[var7] * var8 >> -1312890356;
                var11 = var6 + (var9 >> -2001009108) & una.field_b;
                var12 = hba.field_b & (var10 >> -846579476) + param1;
                var28 = this.c(0, -27, var12);
                var16[var6] = var28[var11];
            }
        }
        return var3;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (-1 == (var4_int ^ -1)) {
                this.field_n = param1.d(122) << 157721188;
                break L1;
              } else {
                if (1 == var4_int) {
                  L2: {
                    stackIn_6_0 = this;

                    if (-2 != (param1.h(255) ^ -1)) {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 0;
                      break L2;
                    } else {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 1;
                      break L2;
                    }
                  }
                  ((vla) (this)).field_g = stackIn_7_1 != 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param0 == 107) {
                break L3;
              } else {
                this.field_n = -22;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("vla.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
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
