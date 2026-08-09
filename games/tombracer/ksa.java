/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ksa extends ci {
    static String field_n;
    private int field_m;
    static int field_p;
    private int field_q;
    private int field_o;

    public ksa() {
        super(1, false);
        this.field_q = 2048;
        this.field_m = 1024;
        this.field_o = 3072;
    }

    public static void c(int param0) {
        field_n = null;
        if (param0 != -19514) {
            ksa.c(80);
        }
    }

    final static void a(boolean param0, kia param1) {
        try {
            kh.a(param0, param1, qla.field_f);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ksa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int[] c(int param0, int param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
            this.b(79, -115);
        }
        int[] var7 = this.field_i.a((byte) 64, param1);
        int[] var3 = var7;
        if (this.field_i.field_d) {
            var4 = this.c(0, -10, param1);
            for (var5 = 0; var5 < ns.field_g; var5++) {
                var7[var5] = (this.field_q * var4[var5] >> 571722540) + this.field_m;
            }
        }
        return var3;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (0 == var4_int) {
                this.field_m = param1.d(param0 ^ 18);
                break L1;
              } else {
                if (-2 != (var4_int ^ -1)) {
                  if (var4_int == 2) {
                    L2: {
                      stackIn_10_0 = this;

                      if (-2 != (param1.h(255) ^ -1)) {
                        stackIn_11_0 = this;
                        stackIn_11_1 = 0;
                        break L2;
                      } else {
                        stackIn_11_0 = this;
                        stackIn_11_1 = 1;
                        break L2;
                      }
                    }
                    ((ksa) (this)).field_g = stackIn_11_1 != 0;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  this.field_o = param1.d(param0 ^ 20);
                  break L1;
                }
              }
            }
            L3: {
              if (param0 == 107) {
                break L3;
              } else {
                field_n = (String) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("ksa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
    }

    final void b(byte param0) {
        if (param0 != 116) {
            this.field_m = 0;
        }
        this.field_q = -this.field_m + this.field_o;
    }

    final int[][] b(int param0, int param1) {
        int[][] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = TombRacer.field_G ? 1 : 0;
        int[][] var21 = this.field_h.a(param0, (byte) -46);
        int[][] var16 = var21;
        int[][] var14 = var16;
        int[][] var3 = var14;
        if (!(!this.field_h.field_f)) {
            var29 = this.a(param0, 0, -1);
            var30 = var29[0];
            var31 = var29[1];
            var32 = var29[2];
            var8 = var21[0];
            var9 = var21[1];
            var10 = var21[2];
            for (var11 = 0; ns.field_g > var11; var11++) {
                var8[var11] = this.field_m + (var30[var11] * this.field_q >> 123289932);
                var9[var11] = (this.field_q * var31[var11] >> -579643476) + this.field_m;
                var10[var11] = (this.field_q * var32[var11] >> -1156571636) + this.field_m;
            }
        }
        if (param1 != -1) {
            kia var13 = (kia) null;
            ksa.a(true, (kia) null);
        }
        return var3;
    }

    static {
        field_n = "Software";
        field_p = 0;
    }
}
