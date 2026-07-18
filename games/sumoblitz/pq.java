/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq extends pk {
    static String field_N;
    private int field_H;
    private wb field_M;
    boolean field_J;
    private wb[] field_z;
    private int field_K;
    int field_I;
    static float[] field_y;
    private int field_x;
    private int field_A;
    private wb field_G;
    private int field_B;
    private int field_D;
    private wb field_E;
    static ri[] field_F;

    public static void a(int param0) {
        field_y = null;
        field_N = null;
        if (param0 != -1346554936) {
            pq.a(-63);
        }
        field_F = null;
    }

    private final void g() {
        ((pq) this).field_z = new wb[]{this.a(((pq) this).field_K, (byte) -110, ((pq) this).field_x), this.a(((pq) this).field_D, (byte) -5, ((pq) this).field_B)};
        int discarded$0 = -53;
        ((pq) this).field_M = this.f();
        ((pq) this).field_G = ((pq) this).field_M.a();
        ((pq) this).field_E = new wb(((pq) this).field_p >> 1, ((pq) this).field_p);
    }

    final void b(int param0, int param1, int param2) {
        ((pq) this).field_K = param1;
        ((pq) this).field_B = 8355711 & param0 >> 1;
        ((pq) this).field_D = (param1 & 16711422) >> 1;
        if (param2 <= 16) {
            return;
        }
        ((pq) this).field_x = param0;
        int discarded$0 = 880072001;
        this.g();
    }

    final void a(int param0, int param1, pk param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var5_int = 94 / ((param1 - -25) / 45);
              if (!((pq) this).field_J) {
                break L1;
              } else {
                ((pq) this).field_A = ((pq) this).field_A + 1;
                if (((pq) this).field_A > ((pq) this).field_H * 2) {
                  ((pq) this).field_A = ((pq) this).field_A - ((pq) this).field_H * 2;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("pq.U(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ')');
        }
    }

    private final wb f() {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Sumoblitz.field_L ? 1 : 0;
        int var2 = ((pq) this).field_p >> 1;
        wb var3 = new wb(var2, ((pq) this).field_p);
        jq.a(7161, var3);
        for (var4 = 0; ((pq) this).field_p > var4; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((-var4 + ((pq) this).field_p) * var4);
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = 1.0 > var6 ? (int)(var6 * 255.0) : 255;
                }
                lk.a(var5, var4, var8 << 16 | (var8 | var8 << 8));
            }
        }
        su.a((byte) -94);
        return var3;
    }

    private final wb a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wb var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = Sumoblitz.field_L ? 1 : 0;
        var14 = new wb(2 * ((pq) this).field_H, ((pq) this).field_p);
        jq.a(7161, var14);
        var5 = ((pq) this).field_p >> 1;
        var6 = 0;
        L0: while (true) {
          if (((pq) this).field_p <= var6) {
            var6 = 21 % ((param1 - -50) / 32);
            su.a((byte) 44);
            return var14;
          } else {
            L1: {
              var7 = (var6 >> 1) * (-1 + ((pq) this).field_H * 2) % (2 * ((pq) this).field_H);
              var8 = param2 & 16711935;
              var9 = 65280 & param2;
              var10 = var6 + -var5;
              var11 = 128 - -(int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0);
              if (var11 >= 256) {
                stackOut_4_0 = var9 | var8;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = (var9 * var11 & 16711680 | -16711936 & var11 * var8) >>> 8;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              lk.f(var7, var6, ((pq) this).field_H, var12);
              var9 = param0 & 65280;
              var8 = 16711935 & param0;
              lk.f(-(2 * ((pq) this).field_H) + var7, var6, ((pq) this).field_H, var12);
              if (256 <= var11) {
                stackOut_7_0 = var8 | var9;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = (16711680 & var11 * var9 | var8 * var11 & -16711936) >>> 8;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            lk.f(((pq) this).field_H + var7, var6, ((pq) this).field_H, var12);
            lk.f(-((pq) this).field_H + var7, var6, ((pq) this).field_H, var12);
            var6++;
            continue L0;
          }
        }
    }

    private final void a(wb param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = param3 - -((pq) this).field_q;
            kw.a(((pq) this).field_p + param1, param1, 1, param3 + ((pq) this).field_M.field_x, -((pq) this).field_M.field_x + var5_int);
            var6 = param3 - ((pq) this).field_A;
            L1: while (true) {
              if (var6 >= var5_int) {
                L2: {
                  su.a((byte) -51);
                  if (param3 + ((pq) this).field_M.field_x >= lk.field_k) {
                    jq.a(7161, ((pq) this).field_E);
                    param0.a(-((pq) this).field_A, 0);
                    param0.a(((pq) this).field_H * 2 + -((pq) this).field_A, 0);
                    ((pq) this).field_G.d(0, 0);
                    su.a((byte) -105);
                    ((pq) this).field_E.a(param3, param1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (lk.field_j >= -((pq) this).field_M.field_x + var5_int) {
                    jq.a(7161, ((pq) this).field_E);
                    var7 = ((pq) this).field_A + ((pq) this).field_q - ((pq) this).field_M.field_x;
                    L4: while (true) {
                      if (((pq) this).field_H * 2 >= var7) {
                        param0.a(-var7, 0);
                        param0.a(2 * ((pq) this).field_H + -var7, 0);
                        ((pq) this).field_M.d(0, 0);
                        su.a((byte) 106);
                        ((pq) this).field_E.a(var5_int - ((pq) this).field_M.field_x, param1);
                        break L3;
                      } else {
                        var7 = var7 - ((pq) this).field_H * 2;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                param0.a(var6, param1);
                var6 = var6 + param0.field_x;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("pq.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + 256 + ',' + param3 + ')');
        }
    }

    pq(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> 1, (16711422 & param6) >> 1);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if ((param1 & 7) != 0) {
            var2 = -(7 & param1) + 8;
        }
        int var3 = var2 + param1;
        return var3;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-57, param1, param2, param3, param4);
        int discarded$0 = 880072001;
        this.g();
        int var6 = 85 % ((28 - param0) / 63);
    }

    private pq(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((pq) this).field_B = param7;
        ((pq) this).field_D = param8;
        ((pq) this).field_K = param6;
        ((pq) this).field_x = param5;
        ((pq) this).field_H = param4;
        ((pq) this).a(-79, param0, param1, param3, param2);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param3 != 0) {
            return;
        }
        int var5 = param0 + ((pq) this).field_r;
        if (param2 >= -35) {
            ((pq) this).field_z = null;
        }
        int var6 = ((pq) this).field_v + param1;
        this.a(((pq) this).field_z[0], var6, 256, var5);
        if (((pq) this).field_I < 65536) {
            kw.a(var6 - -((pq) this).field_p, var6, 1, var5 - -(((pq) this).field_I * ((pq) this).field_q >> 16), ((pq) this).field_q + var5);
            this.a(((pq) this).field_z[1], var6, 256, var5);
            su.a((byte) -110);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Confirm Email:";
        field_y = new float[16];
    }
}
