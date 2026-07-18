/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends gk {
    private ol field_j;
    private int field_i;
    static le[][] field_m;
    static int field_n;
    static int[] field_k;
    static int[] field_l;

    final void b(boolean param0, int param1) {
        int fieldTemp$0 = ((hb) this).field_h;
        ((hb) this).field_h = ((hb) this).field_h + 1;
        ((hb) this).field_g[fieldTemp$0] = (byte)(param1 + ((hb) this).field_j.c(0));
        if (!param0) {
            ((hb) this).field_i = -91;
        }
    }

    final void a(int[] param0, int param1) {
        try {
            if (param1 != 0) {
                hb.b((byte) 106, 53);
            }
            ((hb) this).field_j = new ol(param0);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "hb.DB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void p(int param0) {
        ((hb) this).field_i = param0 * ((hb) this).field_h;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        nc.field_b[fd.field_n] = param1;
        hl.field_f[fd.field_n] = fd.field_n;
        gi.field_e[fd.field_n] = param3;
        if (param3 > kj.field_G) {
            fe.field_g = param3;
        }
        if (ah.field_j > param3) {
            rh.field_C = param3;
        }
        jc.field_a[fd.field_n] = param2;
        hf.field_c[fd.field_n] = param0;
        rb.field_fb[fd.field_n] = param5;
        int var6 = param0 + (param2 + param5);
        int var7 = var6 == 0 ? 0 : param2 * 1000 / var6;
        cj.field_c[fd.field_n] = var7;
        if (param4 != 1000) {
            field_k = null;
        }
        if (!(var7 >= rh.field_C)) {
            rh.field_C = var7;
        }
        if (fe.field_g < var7) {
            fe.field_g = var7;
        }
        fd.field_n = fd.field_n + 1;
    }

    final int r(int param0) {
        int var2 = -21 % ((-81 - param0) / 36);
        int fieldTemp$0 = ((hb) this).field_h;
        ((hb) this).field_h = ((hb) this).field_h + 1;
        return ((hb) this).field_g[fieldTemp$0] - ((hb) this).field_j.c(0) & 255;
    }

    final static int a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 5) {
                stackOut_6_0 = var1_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                L2: {
                  if (!fd.field_o[var2]) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "hb.FB(" + false + ')');
        }
        return stackIn_7_0;
    }

    public static void d() {
        field_l = null;
        field_k = null;
        field_m = null;
    }

    final void a(byte param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == 118) {
              var5_int = 0;
              L1: while (true) {
                if (param2 <= var5_int) {
                  break L0;
                } else {
                  int fieldTemp$5 = ((hb) this).field_h;
                  ((hb) this).field_h = ((hb) this).field_h + 1;
                  param3[var5_int - -param1] = (byte)(((hb) this).field_g[fieldTemp$5] + -((hb) this).field_j.c(0));
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("hb.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw la.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final void q(int param0) {
        int var2 = -106 % ((param0 - -25) / 59);
        ((hb) this).field_h = (((hb) this).field_i + 7) / 8;
    }

    hb(byte[] param0) {
        super(param0);
    }

    final static void b(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            w.a((byte) -92, kj.field_G, fd.field_n, 0, true, ah.field_j, param1);
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= fd.field_n) {
                L2: {
                  if (param0 > 90) {
                    break L2;
                  } else {
                    hb.a(-29, -107, -3, 17, 7, 5);
                    break L2;
                  }
                }
                L3: {
                  w.a((byte) -78, fe.field_g, param1 + fd.field_n, param1, false, rh.field_C, param1 + param1);
                  if (fd.field_n <= param1) {
                    break L3;
                  } else {
                    fd.field_n = param1;
                    break L3;
                  }
                }
                break L0;
              } else {
                hl.field_f[var2_int + param1] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "hb.QA(" + param0 + ',' + param1 + ')');
        }
    }

    hb(int param0) {
        super(param0);
    }

    final static int a(int param0, aj param1, aj param2) {
        RuntimeException var3 = null;
        Object var4 = null;
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
            var4 = null;
            stackOut_0_0 = qh.a(0, param1, -1, false, param2, 0, (String) null);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("hb.SA(").append(-7468).append(',');
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
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
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final int f(int param0, int param1) {
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var3 = ((hb) this).field_i >> 3;
        int var4 = -(((hb) this).field_i & 7) + param0;
        int var5 = 0;
        ((hb) this).field_i = ((hb) this).field_i + param1;
        while (var4 < param1) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((nd.field_d[var4] & ((hb) this).field_g[incrementValue$0]) << param1 - var4);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (param1 != var4) {
            var5 = var5 + (((hb) this).field_g[var3] >> var4 + -param1 & nd.field_d[param1]);
        } else {
            var5 = var5 + (((hb) this).field_g[var3] & nd.field_d[var4]);
        }
        return var5;
    }

    final static void b() {
        int var2 = -57 % 0;
        cc.a(192, true, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_k = new int[256];
        field_l = new int[1024];
        field_m = new le[5][];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 256) {
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                field_k[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((1 & var0) != 1) {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                } else {
                  var0 = -306674912 ^ var0 >>> 1;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
