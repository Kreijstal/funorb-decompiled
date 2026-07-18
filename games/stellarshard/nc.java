/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends rj {
    private int field_O;
    private pb[] field_C;
    private int field_N;
    private pb field_I;
    int field_K;
    private int field_M;
    static ek[] field_F;
    private pb field_P;
    private int field_L;
    private int field_D;
    static int field_G;
    boolean field_B;
    static int field_A;
    private int field_z;
    static pf field_y;
    static int field_H;
    private pb field_E;

    private final pb d() {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = stellarshard.field_B;
        int var2 = ((nc) this).field_t >> 1;
        pb var3 = new pb(var2, ((nc) this).field_t);
        hj.a(var3, 1);
        for (var4 = 0; var4 < ((nc) this).field_t; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (((nc) this).field_t + -var4));
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(255.0 * var6) : 255;
                }
                ti.a(var5, var4, var8 << 16 | (var8 | var8 << 8));
            }
        }
        id.b((byte) -58);
        return var3;
    }

    final void c(int param0, int param1, int param2) {
        ((nc) this).field_O = (param2 & 16711422) >> 1;
        ((nc) this).field_D = param2;
        ((nc) this).field_N = 8355711 & param1 >> 1;
        if (param0 != 65280) {
            return;
        }
        ((nc) this).field_L = param1;
        int discarded$0 = 15035;
        this.a();
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (!(param0 == 0)) {
            return;
        }
        int var5 = param3 - -((nc) this).field_w;
        if (param1 != -57) {
            return;
        }
        int var6 = param2 - -((nc) this).field_k;
        this.a(var5, (byte) 46, var6, ((nc) this).field_C[0]);
        if (((nc) this).field_K < 65536) {
            gg.a(20, ((nc) this).field_p + var5, var6, var6 + ((nc) this).field_t, (((nc) this).field_K * ((nc) this).field_p >> 16) + var5);
            this.a(var5, (byte) 46, var6, ((nc) this).field_C[1]);
            id.b((byte) -58);
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 23987) {
            ((nc) this).field_K = -78;
        }
        super.b(param0, param1, param2, param3, param4);
        int discarded$0 = 15035;
        this.a();
    }

    public static void e() {
        field_y = null;
        field_F = null;
    }

    private final void a() {
        int discarded$0 = 0;
        int discarded$1 = 0;
        ((nc) this).field_C = new pb[]{this.b(((nc) this).field_L, ((nc) this).field_D), this.b(((nc) this).field_N, ((nc) this).field_O)};
        int discarded$2 = 0;
        ((nc) this).field_P = this.d();
        ((nc) this).field_E = ((nc) this).field_P.f();
        ((nc) this).field_I = new pb(((nc) this).field_t >> 1, ((nc) this).field_t);
    }

    final static void b(byte param0, int param1, int param2) {
        wg.field_c = param2;
        vk.field_b = param1;
    }

    final void a(int param0, boolean param1, int param2, rj param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (!param1) {
              L1: {
                if (!((nc) this).field_B) {
                  break L1;
                } else {
                  ((nc) this).field_z = ((nc) this).field_z + 1;
                  if (((nc) this).field_z <= ((nc) this).field_M * 2) {
                    break L1;
                  } else {
                    ((nc) this).field_z = ((nc) this).field_z - ((nc) this).field_M * 2;
                    break L1;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("nc.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    nc(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> 1, 8355711 & param6 >> 1);
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            fk.a(-28092, (java.awt.Component) (Object) param0);
            if (param1 > 84) {
              L1: {
                int discarded$12 = -41;
                ge.a((java.awt.Component) (Object) param0);
                if (null != og.field_c) {
                  og.field_c.a((byte) -93, (java.awt.Component) (Object) param0);
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("nc.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, pb param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = stellarshard.field_B;
        try {
          L0: {
            var5_int = param0 + ((nc) this).field_p;
            gg.a(42, var5_int - ((nc) this).field_P.field_v, param2, ((nc) this).field_t + param2, ((nc) this).field_P.field_v + param0);
            var6 = -((nc) this).field_z + param0;
            L1: while (true) {
              if (var6 >= var5_int) {
                L2: {
                  id.b((byte) -58);
                  if (((nc) this).field_P.field_v + param0 >= ti.field_e) {
                    hj.a(((nc) this).field_I, 1);
                    param3.e(-((nc) this).field_z, 0);
                    param3.e(-((nc) this).field_z + 2 * ((nc) this).field_M, 0);
                    ((nc) this).field_E.c(0, 0);
                    id.b((byte) -58);
                    ((nc) this).field_I.e(param0, param2);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (ti.field_c < var5_int - ((nc) this).field_P.field_v) {
                    break L3;
                  } else {
                    hj.a(((nc) this).field_I, 1);
                    var7 = ((nc) this).field_z + -((nc) this).field_P.field_v + ((nc) this).field_p;
                    L4: while (true) {
                      if (2 * ((nc) this).field_M >= var7) {
                        param3.e(-var7, 0);
                        param3.e(2 * ((nc) this).field_M - var7, 0);
                        ((nc) this).field_P.c(0, 0);
                        id.b((byte) -58);
                        ((nc) this).field_I.e(var5_int - ((nc) this).field_P.field_v, param2);
                        break L3;
                      } else {
                        var7 = var7 - 2 * ((nc) this).field_M;
                        continue L4;
                      }
                    }
                  }
                }
                break L0;
              } else {
                param3.e(var6, param2);
                var6 = var6 + param3.field_v;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("nc.H(").append(param0).append(',').append(46).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    private final pb b(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        pb var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = stellarshard.field_B;
        var14 = new pb(((nc) this).field_M * 2, ((nc) this).field_t);
        hj.a(var14, 1);
        var5 = ((nc) this).field_t >> 1;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((nc) this).field_t) {
            id.b((byte) -58);
            return var14;
          } else {
            L1: {
              var7 = (-1 + ((nc) this).field_M * 2) * (var6 >> 1) % (2 * ((nc) this).field_M);
              var8 = param1 & 16711935;
              var9 = param1 & 65280;
              var10 = -var5 + var6;
              var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
              if (256 > var11) {
                stackOut_4_0 = (var11 * var9 & 16711680 | var8 * var11 & -16711936) >>> 8;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = var9 | var8;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              ti.g(var7, var6, ((nc) this).field_M, var12);
              ti.g(var7 - ((nc) this).field_M * 2, var6, ((nc) this).field_M, var12);
              var9 = param0 & 65280;
              var8 = param0 & 16711935;
              if (256 > var11) {
                stackOut_7_0 = (-16711936 & var11 * var8 | 16711680 & var9 * var11) >>> 8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = var9 | var8;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            ti.g(var7 + ((nc) this).field_M, var6, ((nc) this).field_M, var12);
            ti.g(-((nc) this).field_M + var7, var6, ((nc) this).field_M, var12);
            var6++;
            continue L0;
          }
        }
    }

    private nc(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((nc) this).field_N = param8;
        ((nc) this).field_O = param7;
        ((nc) this).field_L = param6;
        ((nc) this).field_M = param4;
        ((nc) this).field_D = param5;
        ((nc) this).b(param2, param0, param1, param3, 23987);
    }

    static {
    }
}
