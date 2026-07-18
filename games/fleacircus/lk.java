/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends qa {
    static vc field_O;
    int field_I;
    private int field_N;
    private dd[] field_E;
    private dd field_F;
    private int field_B;
    private int field_L;
    private int field_K;
    private int field_C;
    private dd field_P;
    static vg field_D;
    static volatile int field_J;
    private int field_G;
    static fh field_A;
    private dd field_M;
    static fa field_Q;
    boolean field_H;

    private final dd b(int param0, int param1, int param2) {
        dd var4 = null;
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
        var13 = fleas.field_A ? 1 : 0;
        var4 = new dd(((lk) this).field_N * 2, ((lk) this).field_j);
        int discarded$1 = 45;
        r.a(var4);
        var5 = ((lk) this).field_j >> 1;
        var6 = 0;
        L0: while (true) {
          if (((lk) this).field_j <= var6) {
            ia.a(-121);
            var6 = 83 % ((9 - param2) / 48);
            return var4;
          } else {
            L1: {
              var7 = (((lk) this).field_N * 2 - 1) * (var6 >> 1) % (2 * ((lk) this).field_N);
              var8 = 16711935 & param1;
              var9 = param1 & 65280;
              var10 = var6 + -var5;
              var11 = 128 + (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0);
              if (var11 < 256) {
                stackOut_4_0 = (16711680 & var11 * var9 | -16711936 & var8 * var11) >>> 8;
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
              gb.b(var7, var6, ((lk) this).field_N, var12);
              var8 = 16711935 & param0;
              var9 = param0 & 65280;
              gb.b(var7 + -(((lk) this).field_N * 2), var6, ((lk) this).field_N, var12);
              if (256 <= var11) {
                stackOut_7_0 = var9 | var8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = (16711680 & var9 * var11 | var8 * var11 & -16711936) >>> 8;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            gb.b(var7 + ((lk) this).field_N, var6, ((lk) this).field_N, var12);
            gb.b(-((lk) this).field_N + var7, var6, ((lk) this).field_N, var12);
            var6++;
            continue L0;
          }
        }
    }

    final static void a(int param0, String param1) {
        fg.field_m = param1;
        try {
            cg.a((byte) -105, 12);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "lk.HA(" + -15493 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, qa param2, byte param3) {
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
            if (param3 <= -85) {
              L1: {
                if (((lk) this).field_H) {
                  ((lk) this).field_B = ((lk) this).field_B + 1;
                  if (((lk) this).field_N * 2 >= ((lk) this).field_B) {
                    break L1;
                  } else {
                    ((lk) this).field_B = ((lk) this).field_B - ((lk) this).field_N * 2;
                    break L1;
                  }
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
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("lk.I(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
        }
    }

    final static kc a(String param0, boolean param1, byte param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        kc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        kc stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
              var4_long = 0L;
              var6 = null;
              if (param3.indexOf('@') != -1) {
                var6 = (Object) (Object) param3;
                break L1;
              } else {
                var7 = (CharSequence) (Object) param3;
                var4_long = uj.a(var7, (byte) -126);
                break L1;
              }
            }
            stackOut_3_0 = r.a(false, var4_long, (byte) 84, (String) var6, param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("lk.AA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(false).append(',').append(-35).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        if (!(0 == param3)) {
            return;
        }
        if (!param2) {
            return;
        }
        int var5 = param1 - -((lk) this).field_y;
        int var6 = ((lk) this).field_z + param0;
        this.a(((lk) this).field_E[0], var6, 0, var5);
        if (((lk) this).field_I < 65536) {
            mi.a((byte) -52, var5 - -((lk) this).field_u, var5 + (((lk) this).field_u * ((lk) this).field_I >> 16), var6 - -((lk) this).field_j, var6);
            this.a(((lk) this).field_E[1], var6, 0, var5);
            ia.a(-68);
        }
    }

    final static int k() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var7 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!wf.b(-113)) {
                L2: {
                  bk.field_a.b(105, bg.a(pb.field_d, ob.field_e, 96), bg.a(ag.field_f, kc.field_b, 115));
                  if (!bk.field_a.b(-46)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                stackOut_10_0 = 108;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L3: {
                  bk.field_a.h(0);
                  if (!bk.field_a.b(-66)) {
                    break L3;
                  } else {
                    var1_int = 1;
                    break L3;
                  }
                }
                if (ji.field_a == 13) {
                  var2 = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "lk.EA(" + 67 + ')');
        }
        return stackIn_11_0;
    }

    private final dd d() {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = fleas.field_A ? 1 : 0;
        int var2 = ((lk) this).field_j >> 1;
        dd var3 = new dd(var2, ((lk) this).field_j);
        int discarded$0 = 45;
        r.a(var3);
        for (var4 = 0; ((lk) this).field_j > var4; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + ((lk) this).field_j));
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = 1.0 > var6 ? (int)(255.0 * var6) : 255;
                }
                gb.a(var5, var4, var8 << 8 | var8 | var8 << 16);
            }
        }
        ia.a(-106);
        return var3;
    }

    lk(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 1, (16711422 & param6) >> 1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.j(124);
    }

    private final void a(dd param0, int param1, int param2, int param3) {
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
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = ((lk) this).field_u + param3;
            mi.a((byte) -52, var5_int + -((lk) this).field_P.field_w, param3 - -((lk) this).field_P.field_w, param1 + ((lk) this).field_j, param1);
            var6 = -((lk) this).field_B + param3;
            L1: while (true) {
              if (var5_int <= var6) {
                L2: {
                  ia.a(-81);
                  if (gb.field_l > ((lk) this).field_P.field_w + param3) {
                    break L2;
                  } else {
                    int discarded$2 = 45;
                    r.a(((lk) this).field_M);
                    param0.d(-((lk) this).field_B, 0);
                    param0.d(((lk) this).field_N * 2 - ((lk) this).field_B, 0);
                    ((lk) this).field_F.a(0, 0);
                    ia.a(-70);
                    ((lk) this).field_M.d(param3, param1);
                    break L2;
                  }
                }
                L3: {
                  if (var5_int - ((lk) this).field_P.field_w > gb.field_h) {
                    break L3;
                  } else {
                    int discarded$3 = 45;
                    r.a(((lk) this).field_M);
                    var7 = ((lk) this).field_B + (-((lk) this).field_P.field_w + ((lk) this).field_u);
                    L4: while (true) {
                      if (var7 <= ((lk) this).field_N * 2) {
                        param0.d(-var7, 0);
                        param0.d(-var7 + ((lk) this).field_N * 2, 0);
                        ((lk) this).field_P.a(0, 0);
                        ia.a(-79);
                        ((lk) this).field_M.d(-((lk) this).field_P.field_w + var5_int, param1);
                        break L3;
                      } else {
                        var7 = var7 - 2 * ((lk) this).field_N;
                        continue L4;
                      }
                    }
                  }
                }
                break L0;
              } else {
                param0.d(var6, param1);
                var6 = var6 + param0.field_w;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("lk.JA(");
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
          throw pf.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + 0 + ',' + param3 + ')');
        }
    }

    final static boolean a(int param0) {
        int var1 = 2 / ((param0 - -62) / 39);
        return true;
    }

    public static void c(boolean param0) {
        field_O = null;
        field_D = null;
        field_Q = null;
        field_A = null;
        if (!param0) {
            lk.c(true);
        }
    }

    final static void a() {
        if (vg.field_z != -wf.field_c) {
            if (vg.field_z != -wf.field_c + 250) {
            }
        }
        vg.field_z = vg.field_z + 1;
    }

    private final void j(int param0) {
        if (param0 < 116) {
            return;
        }
        ((lk) this).field_E = new dd[]{this.b(((lk) this).field_G, ((lk) this).field_C, -117), this.b(((lk) this).field_L, ((lk) this).field_K, 118)};
        int discarded$0 = -15;
        ((lk) this).field_P = this.d();
        ((lk) this).field_F = ((lk) this).field_P.b();
        ((lk) this).field_M = new dd(((lk) this).field_j >> 1, ((lk) this).field_j);
    }

    final static boolean i(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 10) {
            break L0;
          } else {
            int discarded$6 = 67;
            int discarded$7 = lk.k();
            break L0;
          }
        }
        L1: {
          L2: {
            if (10 > bh.field_t) {
              break L2;
            } else {
              if (ci.field_f) {
                break L2;
              } else {
                int discarded$8 = 32391;
                if (qh.j()) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void a(byte param0, int param1, int param2) {
        ((lk) this).field_L = (param1 & 16711422) >> 1;
        ((lk) this).field_G = param1;
        ((lk) this).field_C = param2;
        ((lk) this).field_K = 8355711 & param2 >> 1;
        if (param0 <= 77) {
            lk.c(false);
        }
        this.j(119);
    }

    private lk(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((lk) this).field_L = param8;
        ((lk) this).field_C = param5;
        ((lk) this).field_G = param6;
        ((lk) this).field_K = param7;
        ((lk) this).field_N = param4;
        ((lk) this).a(param0, param2, param1, param3, 80);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new vc();
        field_J = 0;
        field_A = new fh(6, 0, 4, 2);
    }
}
