/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends ub {
    private o field_K;
    private int field_B;
    static uf field_C;
    private o[] field_G;
    private int field_H;
    private o field_y;
    private int field_A;
    private int field_J;
    private int field_L;
    int field_z;
    static String field_E;
    boolean field_I;
    private int field_F;
    private o field_D;

    private final void a() {
        ((hd) this).field_G = new o[]{this.a(((hd) this).field_B, ((hd) this).field_H, (byte) -11), this.a(((hd) this).field_L, ((hd) this).field_F, (byte) -11)};
        int discarded$0 = 10706;
        ((hd) this).field_D = this.d();
        ((hd) this).field_y = ((hd) this).field_D.c();
        ((hd) this).field_K = new o(((hd) this).field_n >> 1, ((hd) this).field_n);
    }

    private final o a(int param0, int param1, byte param2) {
        o var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = wizardrun.field_H;
        var4 = new o(((hd) this).field_J * 2, ((hd) this).field_n);
        int discarded$2 = 0;
        ud.a(var4);
        var5 = ((hd) this).field_n >> 1;
        var6 = 0;
        L0: while (true) {
          if (((hd) this).field_n <= var6) {
            int discarded$3 = 4;
            bb.b();
            return var4;
          } else {
            L1: {
              var7 = (-1 + 2 * ((hd) this).field_J) * (var6 >> 1) % (((hd) this).field_J * 2);
              var8 = param1 & 16711935;
              var9 = param1 & 65280;
              var10 = -var5 + var6;
              var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
              if (var11 >= 256) {
                stackOut_4_0 = var8 | var9;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = (-16711936 & var8 * var11 | 16711680 & var11 * var9) >>> 8;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              ed.f(var7, var6, ((hd) this).field_J, var12);
              var9 = 65280 & param0;
              ed.f(-(((hd) this).field_J * 2) + var7, var6, ((hd) this).field_J, var12);
              var8 = param0 & 16711935;
              if (var11 < 256) {
                stackOut_7_0 = (-16711936 & var11 * var8 | 16711680 & var9 * var11) >>> 8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = var8 | var9;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            ed.f(var7 - -((hd) this).field_J, var6, ((hd) this).field_J, var12);
            ed.f(var7 - ((hd) this).field_J, var6, ((hd) this).field_J, var12);
            var6++;
            continue L0;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        ((hd) this).field_L = (param2 & 16711422) >> 1;
        ((hd) this).field_F = (param0 & 16711422) >> 1;
        ((hd) this).field_H = param0;
        ((hd) this).field_B = param2;
        int discarded$0 = -24060;
        this.a();
        if (param1 != -1028717695) {
            ((hd) this).field_A = 0;
        }
    }

    private final void a(o param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = wizardrun.field_H;
        try {
          L0: {
            var5_int = param2 + ((hd) this).field_r;
            eb.a(param3, param1 + ((hd) this).field_n, param2 - -((hd) this).field_D.field_z, param1, var5_int + -((hd) this).field_D.field_z);
            var6 = param2 + -((hd) this).field_A;
            L1: while (true) {
              if (var5_int <= var6) {
                L2: {
                  int discarded$5 = 4;
                  bb.b();
                  if (ed.field_c > param2 - -((hd) this).field_D.field_z) {
                    break L2;
                  } else {
                    int discarded$6 = 0;
                    ud.a(((hd) this).field_K);
                    param0.e(-((hd) this).field_A, 0);
                    param0.e(((hd) this).field_J * 2 + -((hd) this).field_A, 0);
                    ((hd) this).field_y.f(0, 0);
                    int discarded$7 = 4;
                    bb.b();
                    ((hd) this).field_K.e(param2, param1);
                    break L2;
                  }
                }
                L3: {
                  if (var5_int + -((hd) this).field_D.field_z > ed.field_l) {
                    break L3;
                  } else {
                    int discarded$8 = 0;
                    ud.a(((hd) this).field_K);
                    var7 = ((hd) this).field_r + -((hd) this).field_D.field_z + ((hd) this).field_A;
                    L4: while (true) {
                      if (((hd) this).field_J * 2 >= var7) {
                        param0.e(-var7, 0);
                        param0.e(-var7 + 2 * ((hd) this).field_J, 0);
                        ((hd) this).field_D.f(0, 0);
                        int discarded$9 = 4;
                        bb.b();
                        ((hd) this).field_K.e(var5_int - ((hd) this).field_D.field_z, param1);
                        break L3;
                      } else {
                        var7 = var7 - ((hd) this).field_J * 2;
                        continue L4;
                      }
                    }
                  }
                }
                break L0;
              } else {
                param0.e(var6, param1);
                var6 = var6 + param0.field_z;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("hd.GA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final o d() {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = wizardrun.field_H;
        int var2 = ((hd) this).field_n >> 1;
        o var3 = new o(var2, ((hd) this).field_n);
        int discarded$0 = 0;
        ud.a(var3);
        for (var4 = 0; var4 < ((hd) this).field_n; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((((hd) this).field_n + -var4) * var4);
                var8 = 1;
                if (1.0 > var6) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(var6 * 255.0) : 255;
                }
                ed.a(var5, var4, var8 << 8 | var8 | var8 << 16);
            }
        }
        int discarded$1 = 4;
        bb.b();
        return var3;
    }

    hd(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, param6 >> 1 & 8355711);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 <= 108) {
            ((hd) this).field_K = null;
        }
        super.a(122, param1, param2, param3, param4);
        int discarded$0 = -24060;
        this.a();
    }

    final static void a(kl param0) {
        nc var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            nc.a(param0.a(-85, "", "headers.packvorbis"));
            var2 = nc.a(param0, "jagex logo2.packvorbis", "");
            je discarded$2 = var2.b();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("hd.FA(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -125 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param2 == 0)) {
            return;
        }
        int var5 = param0 + ((hd) this).field_o;
        int var6 = param3 - -((hd) this).field_l;
        this.a(((hd) this).field_G[param1], var6, var5, param1);
        if (((hd) this).field_z < 65536) {
            eb.a(0, ((hd) this).field_n + var6, var5 - -(((hd) this).field_r * ((hd) this).field_z >> 16), var6, var5 + ((hd) this).field_r);
            this.a(((hd) this).field_G[1], var6, var5, 0);
            int discarded$0 = 4;
            bb.b();
        }
    }

    final void a(int param0, int param1, int param2, ub param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 == 10000536) {
              L1: {
                if (!((hd) this).field_I) {
                  break L1;
                } else {
                  ((hd) this).field_A = ((hd) this).field_A + 1;
                  if (2 * ((hd) this).field_J < ((hd) this).field_A) {
                    ((hd) this).field_A = ((hd) this).field_A - 2 * ((hd) this).field_J;
                    break L1;
                  } else {
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
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("hd.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final static boolean g(byte param0) {
        int var1 = -126 % ((param0 - -10) / 63);
        return true;
    }

    public static void a(byte param0) {
        if (param0 < 96) {
            hd.a((byte) -5);
        }
        field_C = null;
        field_E = null;
    }

    private hd(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((hd) this).field_J = param4;
        ((hd) this).field_F = param7;
        ((hd) this).field_L = param8;
        ((hd) this).field_B = param6;
        ((hd) this).field_H = param5;
        ((hd) this).a(113, param1, param3, param2, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new uf("email");
        field_E = "to return to the normal view.";
    }
}
