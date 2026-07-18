/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends jl {
    private String[] field_w;
    int[] field_s;
    private int[][] field_t;
    static int[] field_u;
    private int[] field_v;

    final void a(int param0, kg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
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
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var3_int = 17 / ((-60 - param0) / 57);
            L1: while (true) {
              var4 = param1.c(32);
              if (var4 == 0) {
                break L0;
              } else {
                this.a(0, param1, var4);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("lb.A(").append(param0).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    private final void a(int param0, kg param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        e var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (1 != param2) {
                if (param2 != 2) {
                  if (param2 != 3) {
                    if (param2 == 4) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_int = param1.c(32);
                    ((lb) this).field_v = new int[var4_int];
                    ((lb) this).field_t = new int[var4_int][];
                    var5 = 0;
                    L2: while (true) {
                      if (var4_int <= var5) {
                        break L1;
                      } else {
                        L3: {
                          var6 = param1.a((byte) 25);
                          var7 = jf.a((byte) 126, var6);
                          if (var7 == null) {
                            break L3;
                          } else {
                            ((lb) this).field_v[var5] = var6;
                            ((lb) this).field_t[var5] = new int[var7.field_b];
                            var8 = 0;
                            L4: while (true) {
                              if (var7.field_b <= var8) {
                                break L3;
                              } else {
                                ((lb) this).field_t[var5][var8] = param1.a((byte) 25);
                                var8++;
                                continue L4;
                              }
                            }
                          }
                        }
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var4_int = param1.c(32);
                  ((lb) this).field_s = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var4_int <= var5) {
                      break L1;
                    } else {
                      ((lb) this).field_s[var5] = param1.a((byte) 25);
                      var5++;
                      continue L5;
                    }
                  }
                }
              } else {
                ((lb) this).field_w = ij.a(0, '<', param1.d(true));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("lb.C(").append(0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, double param4, od param5) {
        ti.a(param3 + 24, 283);
        int var7_int = (int)(Math.cos((double)(qn.field_r & 511) * 0.03681553890925539) * 65536.0);
        int var8 = (int)(65536.0 * Math.sin(0.03681553890925539 * (double)(511 & qn.field_r)));
        sk var9 = (sk) (Object) param5.a(96, 455, -var8 / 256, -192, var7_int / 256);
        rl.field_u[11] = -var7_int;
        rl.field_u[9] = -var8;
        if (param1 < 32) {
            return;
        }
        try {
            rl.field_u[2] = (int)(param4 * (16.666666666666668 * (double)128));
            rl.field_u[3] = -var7_int;
            rl.field_u[5] = var8;
            var9.a(tj.field_A, rl.field_u);
            ti.a();
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "lb.F(" + 259 + ',' + param1 + ',' + 128 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        field_u = null;
        if (param0 <= 113) {
            field_u = null;
        }
    }

    final String e(byte param0) {
        int var3 = 0;
        int var4 = Confined.field_J ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (!(null != ((lb) this).field_w)) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((lb) this).field_w[0]);
        for (var3 = 1; ((lb) this).field_w.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((lb) this).field_w[var3]);
        }
        var3 = -120 % ((param0 - 12) / 50);
        return var2.toString();
    }

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        if (param0 != 675001474) {
            int discarded$0 = lb.a(-62, -60);
        }
        param1 = param1 | param1 >>> 16;
        return param1 - -1;
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = Confined.field_J ? 1 : 0;
        if (null != ((lb) this).field_s) {
            for (var2 = 0; ((lb) this).field_s.length > var2; var2++) {
                ((lb) this).field_s[var2] = nl.a(((lb) this).field_s[var2], 32768);
            }
        }
        if (param0 != 0) {
            lb.e(93);
        }
    }

    lb() {
    }

    final static void d(int param0) {
        if (param0 > -98) {
            field_u = null;
        }
    }

    final static int c() {
        return 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[8192];
    }
}
