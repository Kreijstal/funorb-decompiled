/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bea extends bca {
    int field_t;
    int field_q;
    static int field_v;
    int[][] field_r;
    static String field_s;
    static sna field_u;

    bea(lu param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
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
            ((bea) this).field_k = param0.e((byte) 82);
            ((bea) this).field_o = new eaa();
            var2_int = param0.b(16711935);
            L1: while (true) {
              var2_int--;
              if (0 > var2_int) {
                ((bea) this).field_q = param0.b(16711935);
                ((bea) this).field_t = param0.b(16711935);
                var3 = param0.b(16711935);
                ((bea) this).field_r = new int[var3][2];
                var4 = 0;
                L2: while (true) {
                  if (var4 >= var3) {
                    break L0;
                  } else {
                    ((bea) this).field_r[var4] = new int[2];
                    var4++;
                    continue L2;
                  }
                }
              } else {
                ((bea) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("bea.<init>(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        lma stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        lma stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                bea.d(false);
                break L1;
              }
            }
            stackOut_2_0 = new lma(param1, (bea) this);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("bea.A(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return (at) (Object) stackIn_3_0;
    }

    final void a(byte param0, lu param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              super.a((byte) -126, param1);
              param1.d(((bea) this).field_q, 0);
              param1.d(((bea) this).field_t, 0);
              param1.d(((bea) this).field_r.length, 0);
              if (param0 < -12) {
                break L1;
              } else {
                field_v = 101;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (var3_int >= ((bea) this).field_r.length) {
                break L0;
              } else {
                param1.d(((bea) this).field_r[var3_int][0], 0);
                param1.d(((bea) this).field_r[var3_int][1], 0);
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("bea.F(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final static pp a(int param0, lu param1) {
        RuntimeException var2 = null;
        ic stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ic stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1547040176) {
                break L1;
              } else {
                field_v = -45;
                break L1;
              }
            }
            stackOut_2_0 = new ic();
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("bea.C(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return (pp) (Object) stackIn_3_0;
    }

    final int[][] c(boolean param0) {
        int[][] var2 = null;
        int[][] var3 = null;
        int[][] var4 = null;
        int[][] var5 = null;
        int[][] var6 = null;
        int[][] var7 = null;
        var7 = new int[17][17];
        var6 = var7;
        var5 = var6;
        var4 = var5;
        var3 = var4;
        var2 = var3;
        var7[6][7] = 1;
        var7[5][8] = 1;
        var7[6][8] = 1;
        var7[7][7] = 1;
        var7[6][9] = 1;
        var7[7][6] = 1;
        var7[8][5] = 1;
        var7[7][8] = 1;
        var7[7][9] = 1;
        var7[7][10] = 1;
        var7[8][7] = 1;
        var7[8][6] = 1;
        var7[8][10] = 1;
        var7[8][11] = 1;
        var7[8][9] = 1;
        var7[9][6] = 1;
        var7[9][7] = 1;
        var7[8][8] = 1;
        var7[10][7] = 1;
        var7[9][8] = 1;
        var7[9][10] = 1;
        var7[9][9] = 1;
        var7[10][8] = 1;
        if (!param0) {
          var7[10][9] = 1;
          var7[11][8] = 1;
          return var2;
        } else {
          field_u = null;
          var7[10][9] = 1;
          var7[11][8] = 1;
          return var2;
        }
    }

    final static void e(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0 > 83) {
              ada.field_p.d(0, 0);
              gla.field_j.c(137, 0);
              ml.field_a.d(127, 0);
              vj.field_p.e(154, 17);
              var1_int = 249;
              var2 = 10;
              var3 = -var1_int + 640 >> 1;
              var4 = 300;
              em.field_S.e(-8 + var3, -9 + var4);
              var5 = (int)(fla.field_r * (float)var1_int / 100.0f);
              var6 = 0;
              L1: while (true) {
                if (var5 <= var6) {
                  L2: {
                    if (jga.field_v == null) {
                      break L2;
                    } else {
                      jha.field_g.a(jga.field_v, 320, var4 + -20, 3826700, -1);
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  var7 = 74 + var6 * 177 / (-1 + var1_int);
                  var8 = var6 * 155 / (-1 + var1_int) + 59;
                  dg.f(var3 + var6, var4, var2, var7 << 16 | var8 << 8);
                  var6++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "bea.D(" + param0 + 41);
        }
    }

    final static void d(int param0) {
        jm.field_g.setLength(0);
        gk.field_d = 0;
        if (param0 > -100) {
            bea.e(110);
        }
    }

    bea(int param0, nq param1) {
        super(param0, param1);
        try {
            ((bea) this).field_r = new int[12][2];
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "bea.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(op param0, int param1) {
        try {
            ((bea) this).a(param0, (byte) -2);
            param0.a(((bea) this).field_r, (byte) 25, ((bea) this).field_r.length, 37, ((bea) this).field_q, ((bea) this).field_t);
            int var3_int = -52 / ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "bea.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, String param11, String param12) {
        try {
            ur.field_e[pe.field_m] = (oha) (Object) new hd(param5, param9, param10, param11, param12, param4, param2, param8, param7, param0, param3, param1);
            int var13_int = -79 % ((0 - param6) / 43);
            pe.field_m = pe.field_m + 1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "bea.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + (param11 != null ? "{...}" : "null") + 44 + (param12 != null ? "{...}" : "null") + 41);
        }
    }

    public static void d(boolean param0) {
        field_s = null;
        if (!param0) {
            field_s = null;
            field_u = null;
            return;
        }
        field_u = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = 4;
        field_s = "Spectate <%0>'s game";
    }
}
