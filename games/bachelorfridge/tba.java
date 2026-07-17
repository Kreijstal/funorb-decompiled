/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tba extends bca {
    int field_q;
    static String field_r;
    int field_s;
    int[][] field_t;
    static volatile int field_u;

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
            super.a((byte) -26, param1);
            param1.d(((tba) this).field_q, 0);
            param1.d(((tba) this).field_s, 0);
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= 6) {
                L2: {
                  if (param0 <= -12) {
                    break L2;
                  } else {
                    field_u = 75;
                    break L2;
                  }
                }
                break L0;
              } else {
                param1.d(((tba) this).field_t[var3_int][0], 0);
                param1.d(((tba) this).field_t[var3_int][1], 0);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("tba.F(").append(param0).append(44);
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

    public static void d(int param0) {
        field_r = null;
    }

    final void a(op param0, int param1) {
        try {
            ((tba) this).a(param0, (byte) -2);
            int var3_int = 64 / ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tba.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        if (param0 < 84) {
            return;
        }
        dm.field_g.field_g = 0;
        dm.field_g.d(12, 0);
        dm.field_g.e(ia.field_k.nextInt(), -1615464796);
        dm.field_g.e(ia.field_k.nextInt(), -1615464796);
        dm.field_g.d(param3, 0);
        dm.field_g.d(param2, 0);
        dm.field_g.b(param1, -113);
        dm.field_g.a(tg.field_p, 0, sm.field_q);
        sja.field_fb.c(18, (byte) 123);
        int fieldTemp$0 = sja.field_fb.field_g + 1;
        sja.field_fb.field_g = sja.field_fb.field_g + 1;
        int var4 = fieldTemp$0;
        sja.field_fb.a(0, -126, dm.field_g.field_g, dm.field_g.field_h);
        sja.field_fb.b((byte) 118, sja.field_fb.field_g - var4);
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        qr stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        qr stackOut_2_0 = null;
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
                ((tba) this).field_s = -125;
                break L1;
              }
            }
            stackOut_2_0 = new qr(param1, (tba) this);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("tba.A(").append(param0).append(44);
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

    tba(int param0, nq param1) {
        super(param0, param1);
        try {
            ((tba) this).field_t = new int[6][2];
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tba.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int[][] e(int param0) {
        int[][] var7 = new int[17][17];
        int[][] var6 = var7;
        int[][] var5 = var6;
        int[][] var4 = var5;
        int[][] var3 = var4;
        int[][] var2 = var3;
        var7[6][7] = 1;
        var7[5][8] = 1;
        var7[6][8] = 1;
        var7[7][6] = 1;
        var7[7][7] = 1;
        var7[param0][9] = 1;
        var7[7][9] = 1;
        var7[8][7] = 1;
        var7[7][8] = 1;
        var7[8][6] = 1;
        var7[7][10] = 1;
        var7[8][5] = 1;
        var7[9][7] = 1;
        var7[9][6] = 1;
        var7[8][10] = 1;
        var7[8][8] = 1;
        var7[8][11] = 1;
        var7[8][9] = 1;
        var7[9][10] = 1;
        var7[10][7] = 1;
        var7[9][8] = 1;
        var7[9][9] = 1;
        var7[10][8] = 1;
        var7[10][9] = 1;
        var7[11][8] = 1;
        return var2;
    }

    tba(lu param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
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
            ((tba) this).field_k = param0.e((byte) 84);
            ((tba) this).field_o = new eaa();
            var2_int = param0.b(16711935);
            L1: while (true) {
              var2_int--;
              if (0 > var2_int) {
                ((tba) this).field_q = param0.b(16711935);
                ((tba) this).field_s = param0.b(16711935);
                ((tba) this).field_t = new int[6][2];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= 6) {
                    break L0;
                  } else {
                    ((tba) this).field_t[var3] = new int[2];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                ((tba) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("tba.<init>(");
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "You cannot delete this creature:";
        field_u = 0;
    }
}
