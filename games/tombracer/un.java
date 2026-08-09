/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un extends ci {
    static String field_q;
    private int field_o;
    private int[] field_n;
    private int field_m;
    private int field_p;
    static int[] field_r;

    final int[] c(int param0, int param1) {
        int var7 = 0;
        int[] var26 = null;
        int[] var9 = null;
        int[] var25 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var5 = 0;
        int var4 = 0;
        int var6 = 0;
        int var17 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
            this.field_m = 111;
        }
        int[] var18 = this.field_i.a((byte) 113, param1);
        int[] var3 = var18;
        if (this.field_i.field_d) {
            var7 = this.field_o * ooa.field_g >> -1117378100;
            var26 = this.c(0, -126, hba.field_b & -1 + param1);
            var9 = this.c(0, param0 ^ -36, param1);
            var25 = this.c(0, -116, param1 - -1 & hba.field_b);
            for (var11 = 0; var11 < ns.field_g; var11++) {
                var12 = (var25[var11] + -var26[var11]) * var7 >> -580672500;
                var13 = var7 * (var9[-1 + var11 & una.field_b] + -var9[una.field_b & var11 - -1]) >> 1557055244;
                var14 = var13 >> -577099804;
                var15 = var12 >> 397617732;
                if ((var14 ^ -1) > -1) {
                    var14 = -var14;
                }
                if (!(0 <= var15)) {
                    var15 = -var15;
                }
                if (var14 > 255) {
                    var14 = 255;
                }
                if ((var15 ^ -1) < -256) {
                    var15 = 255;
                }
                var16 = 255 & pda.field_b[var14 - -(var15 * (1 + var15) >> 885331841)];
                var5 = var12 * var16 >> -1744199224;
                var4 = var16 * var13 >> 2065884872;
                var6 = var16 * 4096 >> 1171917128;
                var6 = var6 * this.field_n[2] >> -463689204;
                var4 = this.field_n[0] * var4 >> 1113290092;
                var5 = var5 * this.field_n[1] >> 989269644;
                var18[var11] = var6 + var4 - -var5;
            }
        }
        return var18;
    }

    public un() {
        super(1, true);
        this.field_p = 3216;
        this.field_m = 3216;
        this.field_o = 4096;
        this.field_n = new int[3];
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int != 0) {
                if ((var4_int ^ -1) != -2) {
                  if (2 != var4_int) {
                    break L1;
                  } else {
                    this.field_m = param1.d(param0 + 20);
                    break L1;
                  }
                } else {
                  this.field_p = param1.d(123);
                  break L1;
                }
              } else {
                this.field_o = param1.d(param0 + 14);
                break L1;
              }
            }
            L2: {
              if (param0 == 107) {
                break L2;
              } else {
                this.c(24, 112);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("un.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
    }

    private final void c(int param0) {
        double var2 = Math.cos((double)((float)this.field_m / 4096.0f));
        this.field_n[0] = (int)(4096.0 * (Math.sin((double)((float)this.field_p / 4096.0f)) * var2));
        this.field_n[1] = (int)(Math.cos((double)((float)this.field_p / 4096.0f)) * var2 * 4096.0);
        this.field_n[2] = (int)(Math.sin((double)((float)this.field_m / 4096.0f)) * 4096.0);
        int var4 = this.field_n[0] * this.field_n[0] >> -2115637396;
        int var5 = this.field_n[1] * this.field_n[1] >> 885633420;
        int var6 = this.field_n[2] * this.field_n[2] >> -1271222740;
        if (param0 != 28427) {
            this.b((byte) -32);
        }
        int var7 = (int)(Math.sqrt((double)(var6 + var4 + var5 >> 291581964)) * 4096.0);
        if (var7 != 0) {
            this.field_n[0] = (this.field_n[0] << -2007394740) / var7;
            this.field_n[2] = (this.field_n[2] << 555811276) / var7;
            this.field_n[1] = (this.field_n[1] << -3381684) / var7;
        }
    }

    final void b(byte param0) {
        if (param0 != 116) {
            return;
        }
        this.c(28427);
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_r = null;
        field_q = null;
    }

    static {
        field_q = "Friends";
        field_r = new int[8192];
    }
}
