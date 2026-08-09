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
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
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
              L3: {
                L4: {
                  if (var2 >= 5) {
                    break L4;
                  } else {
                    stackOut_5_0 = fd.field_o[var2];
                    stackIn_10_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var3 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (!stackIn_6_0) {
                          break L5;
                        } else {
                          var1_int++;
                          break L5;
                        }
                      }
                      var2++;
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackIn_10_0 = var1_int;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "hb.FB(" + param0 + ')');
        }
        return stackIn_10_0;
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
        int fieldTemp$1 = 0;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 118) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var5_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param2 <= var5_int) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        fieldTemp$1 = this.field_h;
                        this.field_h = this.field_h + 1;
                        param3[var5_int - -param1] = (byte)(this.field_g[fieldTemp$1] + -this.field_j.c(0));
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_11_0 = (RuntimeException) (var5);
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = new StringBuilder().append("hb.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_10_1 = stackIn_11_1;
                    if (param3 == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_12_2 = "{...}";
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_12_2 = "null";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        w.a((byte) -92, kj.field_G, fd.field_n, 0, true, ah.field_j, param1);
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2_int >= fd.field_n) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        hl.field_f[var2_int + param1] = var2_int;
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0 > 90) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        hb.a(-29, -107, -3, 17, 7, 5);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        w.a((byte) -78, fe.field_g, param1 + fd.field_n, param1, false, rh.field_C, param1 + param1);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (fd.field_n <= param1) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        fd.field_n = param1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var2), "hb.QA(" + param0 + ',' + param1 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        int incrementValue$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = MonkeyPuzzle2.field_F ? 1 : 0;
                    var3 = this.field_i >> -1303496093;
                    var4 = -(this.field_i & 7) + param0;
                    var5 = 0;
                    this.field_i = this.field_i + param1;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var4 >= param1) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    incrementValue$1 = var3;
                    var3++;
                    var5 = var5 + ((nd.field_d[var4] & this.field_g[incrementValue$1]) << param1 - var4);
                    param1 = param1 - var4;
                    var4 = 8;
                    if (var6 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param1 == var4) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var5 = var5 + (this.field_g[var3] >> var4 + -param1 & nd.field_d[param1]);
                    if (var6 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var5 = var5 + (this.field_g[var3] & nd.field_d[var4]);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
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
