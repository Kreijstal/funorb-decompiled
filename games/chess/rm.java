/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm extends mf {
    static dd field_H;
    static tk field_J;
    static int field_S;
    static lb field_M;
    boolean field_W;
    private int field_G;
    private km field_P;
    private int field_K;
    private int field_T;
    static int field_U;
    private km field_N;
    private km field_I;
    static String field_D;
    private int field_F;
    private int field_X;
    static int field_Q;
    int field_L;
    private km[] field_O;
    private int field_V;
    static a field_R;

    final static void a(byte param0, String param1) {
        RuntimeException var2 = null;
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
            lf.field_N = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("rm.A(").append(-122).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw fk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    private final void e(byte param0) {
        ((rm) this).field_O = new km[]{this.c(-72, ((rm) this).field_K, ((rm) this).field_F), this.c(-43, ((rm) this).field_X, ((rm) this).field_V)};
        int var2 = -46 / ((-5 - param0) / 54);
        int discarded$0 = 8;
        ((rm) this).field_P = this.f();
        ((rm) this).field_N = ((rm) this).field_P.b();
        ((rm) this).field_I = new km(((rm) this).field_C >> 1, ((rm) this).field_C);
    }

    rm(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 1, 8355711 & param6 >> 1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, (int) (char)param1, param2, param3, param4);
        this.e((byte) 53);
    }

    private final void a(int param0, km param1, int param2, int param3) {
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
        var8 = Chess.field_G;
        try {
          L0: {
            var5_int = param3 - -((rm) this).field_y;
            cf.b(param0 + ((rm) this).field_C, -((rm) this).field_P.field_w + var5_int, param0, 80, param3 - -((rm) this).field_P.field_w);
            var6 = param3 - ((rm) this).field_G;
            L1: while (true) {
              if (var5_int <= var6) {
                L2: {
                  int discarded$3 = 28773;
                  fd.a();
                  if (wb.field_i > param3 + ((rm) this).field_P.field_w) {
                    break L2;
                  } else {
                    tl.a((byte) -67, ((rm) this).field_I);
                    param1.b(-((rm) this).field_G, 0);
                    param1.b(((rm) this).field_T * 2 - ((rm) this).field_G, 0);
                    ((rm) this).field_N.e(0, 0);
                    int discarded$4 = 28773;
                    fd.a();
                    ((rm) this).field_I.b(param3, param0);
                    break L2;
                  }
                }
                L3: {
                  if (-((rm) this).field_P.field_w + var5_int > wb.field_j) {
                    break L3;
                  } else {
                    tl.a((byte) -67, ((rm) this).field_I);
                    var7 = ((rm) this).field_G + -((rm) this).field_P.field_w + ((rm) this).field_y;
                    L4: while (true) {
                      if (var7 <= ((rm) this).field_T * 2) {
                        param1.b(-var7, 0);
                        param1.b(2 * ((rm) this).field_T - var7, 0);
                        ((rm) this).field_P.e(0, 0);
                        int discarded$5 = 28773;
                        fd.a();
                        ((rm) this).field_I.b(var5_int - ((rm) this).field_P.field_w, param0);
                        break L3;
                      } else {
                        var7 = var7 - ((rm) this).field_T * 2;
                        continue L4;
                      }
                    }
                  }
                }
                break L0;
              } else {
                param1.b(var6, param0);
                var6 = var6 + param1.field_w;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("rm.H(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          throw fk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + 0 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
            return;
        }
        if (param2 > -80) {
            return;
        }
        int var5 = ((rm) this).field_u + param3;
        int var6 = ((rm) this).field_r + param0;
        this.a(var6, ((rm) this).field_O[0], 0, var5);
        if (((rm) this).field_L < 65536) {
            cf.b(((rm) this).field_C + var6, ((rm) this).field_y + var5, var6, 80, var5 + (((rm) this).field_y * ((rm) this).field_L >> 16));
            this.a(var6, ((rm) this).field_O[1], 0, var5);
            int discarded$0 = 28773;
            fd.a();
        }
    }

    public static void a() {
        field_D = null;
        field_J = null;
        field_H = null;
        field_M = null;
        field_R = null;
    }

    final void a(int param0, int param1, mf param2, int param3) {
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
            if (param1 < -6) {
              L1: {
                if (!((rm) this).field_W) {
                  break L1;
                } else {
                  ((rm) this).field_G = ((rm) this).field_G + 1;
                  if (((rm) this).field_G <= 2 * ((rm) this).field_T) {
                    break L1;
                  } else {
                    ((rm) this).field_G = ((rm) this).field_G - 2 * ((rm) this).field_T;
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
            stackOut_6_1 = new StringBuilder().append("rm.G(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw fk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
    }

    private final km f() {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Chess.field_G;
        int var2 = ((rm) this).field_C >> 1;
        km var3 = new km(var2, ((rm) this).field_C);
        tl.a((byte) -67, var3);
        for (var4 = 0; var4 < ((rm) this).field_C; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((((rm) this).field_C + -var4) * var4);
                var8 = 1;
                if (1.0 > var6) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = 1.0 <= var6 ? 255 : (int)(var6 * 255.0);
                }
                wb.a(var5, var4, var8 << 16 | (var8 | var8 << 8));
            }
        }
        int discarded$0 = 28773;
        fd.a();
        return var3;
    }

    final static int a(p param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var3_int = param0.field_l;
            var5 = (CharSequence) (Object) param1;
            var4 = dj.a(var5, 0);
            param0.b((byte) -127, var4.length);
            param0.field_l = param0.field_l + cg.field_c.a(true, var4.length, 0, var4, param0.field_o, param0.field_l);
            stackOut_0_0 = -var3_int + param0.field_l;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("rm.K(");
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw fk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 16711422 + ')');
        }
        return stackIn_1_0;
    }

    private final km c(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        km var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = Chess.field_G;
        var14 = new km(((rm) this).field_T * 2, ((rm) this).field_C);
        tl.a((byte) -67, var14);
        var5 = ((rm) this).field_C >> 1;
        var6 = 0;
        L0: while (true) {
          if (((rm) this).field_C <= var6) {
            L1: {
              if (param0 <= -14) {
                break L1;
              } else {
                field_Q = -78;
                break L1;
              }
            }
            int discarded$1 = 28773;
            fd.a();
            return var14;
          } else {
            L2: {
              var7 = (((rm) this).field_T * 2 + -1) * (var6 >> 1) % (((rm) this).field_T * 2);
              var8 = param2 & 16711935;
              var9 = param2 & 65280;
              var10 = var6 - var5;
              var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
              if (var11 >= 256) {
                stackOut_4_0 = var9 | var8;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (16711680 & var9 * var11 | -16711936 & var11 * var8) >>> 8;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_5_0;
              wb.a(var7, var6, ((rm) this).field_T, var12);
              wb.a(-(((rm) this).field_T * 2) + var7, var6, ((rm) this).field_T, var12);
              var8 = param1 & 16711935;
              var9 = param1 & 65280;
              if (var11 < 256) {
                stackOut_7_0 = (16711680 & var11 * var9 | -16711936 & var11 * var8) >>> 8;
                stackIn_8_0 = stackOut_7_0;
                break L3;
              } else {
                stackOut_6_0 = var9 | var8;
                stackIn_8_0 = stackOut_6_0;
                break L3;
              }
            }
            var12 = stackIn_8_0;
            wb.a(var7 - -((rm) this).field_T, var6, ((rm) this).field_T, var12);
            wb.a(var7 + -((rm) this).field_T, var6, ((rm) this).field_T, var12);
            var6++;
            continue L0;
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        ((rm) this).field_K = param2;
        ((rm) this).field_X = (16711422 & param2) >> 1;
        ((rm) this).field_F = param0;
        ((rm) this).field_V = (16711422 & param0) >> 1;
        if (param1 != 15016) {
            ((rm) this).b(-91, -5, 76);
        }
        this.e((byte) -73);
    }

    private rm(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((rm) this).field_F = param5;
        ((rm) this).field_V = param7;
        ((rm) this).field_X = param8;
        ((rm) this).field_K = param6;
        ((rm) this).field_T = param4;
        ((rm) this).a(param1, 34, param3, param2, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Please enter your age in years";
        field_J = new tk();
    }
}
