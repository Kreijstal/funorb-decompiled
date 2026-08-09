/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ttb extends shb {
    private phb field_F;
    private int field_t;
    private int field_E;
    private phb[] field_C;
    private int field_A;
    private phb field_u;
    private int field_H;
    boolean field_x;
    private phb field_y;
    private int field_G;
    int field_v;
    static char field_B;
    static String field_z;
    private int field_w;

    private final phb a(boolean param0, int param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = VoidHunters.field_G;
        phb var14 = new phb(this.field_E * 2, this.field_f);
        de.a(105, var14);
        int var5 = this.field_f >> 377376129;
        int var6 = 0;
        if (!param0) {
            this.field_G = -72;
        }
        while (this.field_f > var6) {
            var7 = (var6 >> 465803553) * (2 * this.field_E - 1) % (this.field_E * 2);
            var8 = param1 & 16711935;
            var9 = 65280 & param1;
            var10 = var6 + -var5;
            var11 = (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0) + 128;
            var12 = var11 < 256 ? (var8 * var11 & -16711936 | 16711680 & var9 * var11) >>> 723542824 : var9 | var8;
            dma.h(var7, var6, this.field_E, var12);
            dma.h(var7 + -(2 * this.field_E), var6, this.field_E, var12);
            var8 = 16711935 & param2;
            var9 = param2 & 65280;
            var12 = 256 <= var11 ? var8 | var9 : (16711680 & var9 * var11 | var8 * var11 & -16711936) >>> -1620171832;
            dma.h(this.field_E + var7, var6, this.field_E, var12);
            dma.h(-this.field_E + var7, var6, this.field_E, var12);
            var6++;
        }
        bia.a((byte) 124);
        return var14;
    }

    final void b(int param0, int param1, int param2) {
        this.field_G = 8355711 & param0 >> -1174227103;
        this.field_H = param0;
        this.field_t = param2;
        this.field_A = param2 >> -847754719 & 8355711;
        if (param1 != -21202) {
            ttb.d(87);
        }
        this.a(107);
    }

    final void a(int param0, int param1, int param2, shb param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (!this.field_x) {
                break L1;
              } else {
                this.field_w = this.field_w + 1;
                if (this.field_E * 2 >= this.field_w) {
                  break L1;
                } else {
                  this.field_w = this.field_w - this.field_E * 2;
                  break L1;
                }
              }
            }
            L2: {
              if (param2 == -981) {
                break L2;
              } else {
                ttb.d(-78);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("ttb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    private final phb b(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = VoidHunters.field_G;
        int var2 = this.field_f >> -1958507327;
        phb var3 = new phb(var2, this.field_f);
        de.a(78, var3);
        if (param0) {
            phb var10 = (phb) null;
            this.a(-50, -55, (phb) null, -43);
        }
        for (var4 = 0; this.field_f > var4; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (this.field_f - var4));
                var8 = 1;
                if (!(1.0 <= var6)) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = var6 >= 1.0 ? 255 : (int)(255.0 * var6);
                }
                dma.a(var5, var4, var8 << 52780784 | (var8 << -737248568 | var8));
            }
        }
        bia.a((byte) 124);
        return var3;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (-1 != (param1 ^ -1)) {
            return;
        }
        if (param2 < 47) {
            this.a(48, -94, 68, 84, -83);
        }
        int var5 = param0 - -this.field_g;
        int var6 = this.field_r + param3;
        this.a(2, var6, this.field_C[0], var5);
        if (!(-65537 >= (this.field_v ^ -1))) {
            qca.a(this.field_h + var5, this.field_f + var6, var5 - -(this.field_h * this.field_v >> 4875408), true, var6);
            this.a(2, var6, this.field_C[1], var5);
            bia.a((byte) 124);
        }
    }

    public static void d(int param0) {
        if (param0 != 16711935) {
            ttb.d(-30);
        }
        field_z = null;
    }

    private final void a(int param0) {
        if (param0 < 59) {
            return;
        }
        this.field_C = new phb[]{this.a(true, this.field_H, this.field_t), this.a(true, this.field_G, this.field_A)};
        this.field_y = this.b(false);
        this.field_u = this.field_y.a();
        this.field_F = new phb(this.field_f >> -1726365535, this.field_f);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a(param3 ^ 125);
    }

    private ttb(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_t = param6;
        this.field_A = param8;
        this.field_H = param5;
        this.field_E = param4;
        this.field_G = param7;
        this.a(param0, param2, param3, 1, param1);
    }

    private final void a(int param0, int param1, phb param2, int param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5_int = this.field_h + param3;
              qca.a(var5_int - this.field_y.field_q, this.field_f + param1, param3 + this.field_y.field_q, true, param1);
              var6 = param3 - this.field_w;
              if (param0 == 2) {
                break L1;
              } else {
                this.field_w = 28;
                break L1;
              }
            }
            L2: while (true) {
              if (var5_int <= var6) {
                L3: {
                  bia.a((byte) 124);
                  if (param3 - -this.field_y.field_q < dma.field_d) {
                    break L3;
                  } else {
                    de.a(param0 ^ 66, this.field_F);
                    param2.a(-this.field_w, 0);
                    param2.a(this.field_E * 2 - this.field_w, 0);
                    this.field_u.b(0, 0);
                    bia.a((byte) 124);
                    this.field_F.a(param3, param1);
                    break L3;
                  }
                }
                L4: {
                  if (dma.field_a < var5_int + -this.field_y.field_q) {
                    break L4;
                  } else {
                    de.a(param0 + 22, this.field_F);
                    var7 = this.field_h - this.field_y.field_q - -this.field_w;
                    L5: while (true) {
                      if (var7 <= 2 * this.field_E) {
                        param2.a(-var7, 0);
                        param2.a(this.field_E * 2 + -var7, 0);
                        this.field_y.b(0, 0);
                        bia.a((byte) 124);
                        this.field_F.a(-this.field_y.field_q + var5_int, param1);
                        break L4;
                      } else {
                        var7 = var7 - this.field_E * 2;
                        continue L5;
                      }
                    }
                  }
                }
                break L0;
              } else {
                param2.a(var6, param1);
                var6 = var6 + param2.field_q;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("ttb.DA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
    }

    ttb(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> 56249505, 8355711 & param6 >> 904868737);
    }

    static {
        field_B = '/';
        field_z = "Loading instruments";
    }
}
