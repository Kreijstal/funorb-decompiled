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
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(param1 + this.field_j.c(0));
        if (!param0) {
            this.field_i = -91;
        }
    }

    final void a(int[] param0, int param1) {
        try {
            if (param1 != 0) {
                hb.b((byte) 106, 53);
            }
            this.field_j = new ol(param0);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "hb.DB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void p(int param0) {
        this.field_i = param0 * this.field_h;
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
            field_k = (int[]) null;
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
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        return this.field_g[fieldTemp$0] - this.field_j.c(0) & 255;
    }

    final static int a(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = 0;
              if (!param0) {
                break L1;
              } else {
                hb.d((byte) 17);
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= 5) {
                stackIn_9_0 = var1_int;
                break L0;
              } else {
                if (fd.field_o[var2]) {
                  var1_int++;
                  var2++;
                  continue L2;
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "hb.FB(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    public static void d(byte param0) {
        field_l = null;
        field_k = null;
        field_m = (le[][]) null;
        if (param0 < 108) {
            hb.b(91, true);
        }
    }

    final void a(byte param0, int param1, int param2, byte[] param3) {
        int fieldTemp$2 = 0;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == 118) {
              var5_int = 0;
              L1: while (true) {
                if (param2 <= var5_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  fieldTemp$2 = this.field_h;
                  this.field_h = this.field_h + 1;
                  param3[var5_int - -param1] = (byte)(this.field_g[fieldTemp$2] + -this.field_j.c(0));
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("hb.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void q(int param0) {
        int var2 = -106 % ((param0 - -25) / 59);
        this.field_h = (this.field_i + 7) / 8;
    }

    hb(byte[] param0) {
        super(param0);
    }

    final static void b(byte param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
          throw la.a((Throwable) ((Object) var2), "hb.QA(" + param0 + ',' + param1 + ')');
        }
    }

    hb(int param0) {
        super(param0);
    }

    final static int a(int param0, aj param1, aj param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -7468) {
                break L1;
              } else {
                field_l = (int[]) null;
                break L1;
              }
            }
            var4 = (String) null;
            stackIn_3_0 = qh.a(0, param1, -1, false, param2, 0, (String) null);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hb.SA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final int f(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var3 = this.field_i >> -1303496093;
        int var4 = -(this.field_i & 7) + param0;
        int var5 = 0;
        this.field_i = this.field_i + param1;
        while (var4 < param1) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((nd.field_d[var4] & this.field_g[incrementValue$0]) << param1 - var4);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (param1 != var4) {
            var5 = var5 + (this.field_g[var3] >> var4 + -param1 & nd.field_d[param1]);
        } else {
            var5 = var5 + (this.field_g[var3] & nd.field_d[var4]);
        }
        return var5;
    }

    final static void b(int param0, boolean param1) {
        int var2 = -57 % ((param0 - 52) / 40);
        cc.a(192, true, param1);
    }

    static {
        $cfr$clinit: {
            int var0;
            int var1;
            int var2;
            field_k = new int[256];
            field_l = new int[1024];
            field_m = new le[5][];
            var1 = 0;
            L0: while (true) {
              if (var1 >= 256) {
                break $cfr$clinit;
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
                      var0 = -306674912 ^ var0 >>> -751376063;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
