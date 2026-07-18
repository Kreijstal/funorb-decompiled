/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends uj {
    private hl field_H;
    static boolean field_E;
    private hl field_J;
    static String field_z;
    static ph field_G;
    private int field_w;
    private int field_C;
    private int field_I;
    boolean field_D;
    private hl[] field_y;
    private int field_B;
    static String[] field_A;
    private hl field_v;
    private int field_u;
    static String field_t;
    int field_x;
    private int field_F;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        oh.field_c[ed.field_p] = param1;
        jk.field_c[ed.field_p] = ed.field_p;
        tk.field_f[ed.field_p] = param2;
        if (param2 > lh.field_s) {
            mh.field_j = param2;
        }
        if (param2 < og.field_b) {
            t.field_u = param2;
        }
        nf.field_b[ed.field_p] = param4;
        gj.field_f[ed.field_p] = param0;
        ab.field_G[ed.field_p] = param3;
        int var6 = 27 % ((-39 - param5) / 50);
        int var7 = param3 + (param4 + param0);
        int var8 = var7 != 0 ? param4 * 1000 / var7 : 0;
        fg.field_b[ed.field_p] = var8;
        if (!(var8 >= t.field_u)) {
            t.field_u = var8;
        }
        if (mh.field_j < var8) {
            mh.field_j = var8;
        }
        ed.field_p = ed.field_p + 1;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (!(param0 == 0)) {
            return;
        }
        if (param2 != 49) {
            return;
        }
        int var5 = ((fa) this).field_s + param1;
        int var6 = param3 - -((fa) this).field_j;
        this.a(((fa) this).field_y[0], var5, var6, -22917);
        if (!(((fa) this).field_x >= 65536)) {
            cl.a(true, ((fa) this).field_f + var6, (((fa) this).field_x * ((fa) this).field_i >> 16) + var5, var6, var5 - -((fa) this).field_i);
            this.a(((fa) this).field_y[1], var5, var6, -22917);
            wf.a(-127);
        }
    }

    final void b(int param0, int param1, int param2) {
        ((fa) this).field_B = param0;
        ((fa) this).field_F = param2;
        ((fa) this).field_w = (param2 & 16711422) >> 1;
        ((fa) this).field_u = 8355711 & param0 >> 1;
        this.e((byte) 34);
        if (param1 != 2) {
            ((fa) this).field_y = null;
        }
    }

    public static void a(int param0) {
        field_A = null;
        field_G = null;
        field_z = null;
        field_t = null;
    }

    private final hl a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        hl var13 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = new hl(2 * ((fa) this).field_C, ((fa) this).field_f);
        bc.a(var13, 26095);
        var5 = ((fa) this).field_f >> 1;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((fa) this).field_f) {
            wf.a(-68);
            return var13;
          } else {
            L1: {
              var7 = (var6 >> 1) * (((fa) this).field_C * 2 - 1) % (2 * ((fa) this).field_C);
              var8 = param2 & 16711935;
              var9 = 65280 & param2;
              var10 = var6 - var5;
              var11 = 128 + (int)(Math.sqrt((double)(var5 * var5 + -(var10 * var10))) / (double)var5 * 128.0);
              if (var11 < 256) {
                stackOut_4_0 = (var11 * var8 & -16711936 | 16711680 & var9 * var11) >>> 8;
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
              ki.b(var7, var6, ((fa) this).field_C, var12);
              ki.b(var7 - 2 * ((fa) this).field_C, var6, ((fa) this).field_C, var12);
              var8 = 16711935 & param1;
              var9 = 65280 & param1;
              if (var11 < 256) {
                stackOut_7_0 = (var8 * var11 & -16711936 | 16711680 & var11 * var9) >>> 8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = var8 | var9;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            ki.b(var7 - -((fa) this).field_C, var6, ((fa) this).field_C, var12);
            ki.b(-((fa) this).field_C + var7, var6, ((fa) this).field_C, var12);
            var6++;
            continue L0;
          }
        }
    }

    fa(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 1, 8355711 & param6 >> 1);
    }

    private final void e(byte param0) {
        ((fa) this).field_y = new hl[]{this.a(0, ((fa) this).field_F, ((fa) this).field_B), this.a(0, ((fa) this).field_w, ((fa) this).field_u)};
        ((fa) this).field_v = this.a(true);
        ((fa) this).field_J = ((fa) this).field_v.g();
        ((fa) this).field_H = new hl(((fa) this).field_f >> 1, ((fa) this).field_f);
    }

    private final hl a(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var2 = ((fa) this).field_f >> 1;
        hl var3 = new hl(var2, ((fa) this).field_f);
        bc.a(var3, 26095);
        for (var4 = 0; var4 < ((fa) this).field_f; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((((fa) this).field_f + -var4) * var4);
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = var6 < 1.0 ? (int)(255.0 * var6) : 255;
                }
                ki.a(var5, var4, var8 << 8 | var8 | var8 << 16);
            }
        }
        wf.a(-117);
        return var3;
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, (byte) 124, param3, param4);
        this.e((byte) 34);
        if (param2 <= 115) {
            ((fa) this).field_w = 40;
        }
    }

    private fa(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((fa) this).field_F = param6;
        ((fa) this).field_w = param8;
        ((fa) this).field_u = param7;
        ((fa) this).field_B = param5;
        ((fa) this).field_C = param4;
        ((fa) this).a(param0, param2, (byte) 118, param3, param1);
    }

    final void a(int param0, int param1, uj param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (((fa) this).field_D) {
                ((fa) this).field_I = ((fa) this).field_I + 1;
                if (2 * ((fa) this).field_C < ((fa) this).field_I) {
                  ((fa) this).field_I = ((fa) this).field_I - ((fa) this).field_C * 2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 > 27) {
                break L2;
              } else {
                fa.a(-88, -96, -61, 15, 61, 62);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("fa.U(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ')');
        }
    }

    private final void a(hl param0, int param1, int param2, int param3) {
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
        var8 = StarCannon.field_A;
        try {
          L0: {
            var5_int = ((fa) this).field_i + param1;
            cl.a(true, ((fa) this).field_f + param2, ((fa) this).field_v.field_u + param1, param2, var5_int - ((fa) this).field_v.field_u);
            var6 = -((fa) this).field_I + param1;
            L1: while (true) {
              if (var6 >= var5_int) {
                L2: {
                  wf.a(-87);
                  if (param1 - -((fa) this).field_v.field_u >= ki.field_l) {
                    bc.a(((fa) this).field_H, 26095);
                    param0.e(-((fa) this).field_I, 0);
                    param0.e(-((fa) this).field_I + ((fa) this).field_C * 2, 0);
                    ((fa) this).field_J.f(0, 0);
                    wf.a(-103);
                    ((fa) this).field_H.e(param1, param2);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var5_int - ((fa) this).field_v.field_u > ki.field_g) {
                    break L3;
                  } else {
                    bc.a(((fa) this).field_H, 26095);
                    var7 = ((fa) this).field_i + (-((fa) this).field_v.field_u - -((fa) this).field_I);
                    L4: while (true) {
                      if (2 * ((fa) this).field_C >= var7) {
                        param0.e(-var7, 0);
                        param0.e(((fa) this).field_C * 2 + -var7, 0);
                        ((fa) this).field_v.f(0, 0);
                        wf.a(-72);
                        ((fa) this).field_H.e(var5_int - ((fa) this).field_v.field_u, param2);
                        break L3;
                      } else {
                        var7 = var7 - 2 * ((fa) this).field_C;
                        continue L4;
                      }
                    }
                  }
                }
                break L0;
              } else {
                param0.e(var6, param2);
                var6 = var6 + param0.field_u;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("fa.D(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + -22917 + ')');
        }
    }

    final static int a(int param0, boolean param1, int param2, byte param3) {
        return mg.a((byte) -78);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Unpacking sound effects";
        field_A = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_t = "This password contains your Player Name, and would be easy to guess";
    }
}
