/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    private ad field_c;
    static ib field_b;
    private je field_a;
    private ad field_d;
    static int[] field_e;

    public static void a(int param0) {
        if (param0 != -18728) {
            field_b = (ib) null;
            field_b = null;
            field_e = null;
            return;
        }
        field_b = null;
        field_e = null;
    }

    final static void a(String[] args, boolean param1) {
        RuntimeException var2 = null;
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
            L1: {
              if (nf.field_F == null) {
                break L1;
              } else {
                nf.field_F.field_G.a(args, 560186724);
                break L1;
              }
            }
            L2: {
              if (param1) {
                break L2;
              } else {
                field_b = (ib) null;
                break L2;
              }
            }
            if (sc.field_f == null) {
              break L0;
            } else {
              sc.field_f.field_H.a(args, 560186724);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("wh.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (args == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final pi a(int param0, int param1) {
        pi var3 = null;
        byte[] var4 = null;
        var3 = (pi) (this.field_a.a((long)param0, (byte) 114));
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            L1: {
              if (param1 < (param0 ^ -1)) {
                break L1;
              } else {
                var4 = this.field_c.b(255, 32767 & param0, 1);
                if (!MonkeyPuzzle2.field_F) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = this.field_d.b(255, param0, 1);
            break L0;
          }
          L2: {
            var3 = new pi();
            if (var4 != null) {
              var3.a(new gk(var4), true);
              break L2;
            } else {
              break L2;
            }
          }
          if (param0 >= 32768) {
            var3.e(0);
            this.field_a.a((long)param0, var3, -92);
            return var3;
          } else {
            this.field_a.a((long)param0, var3, -92);
            return var3;
          }
        }
    }

    final static void a(byte param0, le param1) {
        int incrementValue$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        byte stackOut_13_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (-1 == (3 & (param1.field_j | param1.field_k) ^ -1)) {
                  break L2;
                } else {
                  var2_int = 4 + -(3 & param1.field_k);
                  var3 = -(3 & param1.field_j) + 4;
                  var4 = var2_int + param1.field_k;
                  var5 = new int[var4 * (param1.field_j - -var3)];
                  var6 = var3 * var4 - -var2_int;
                  var7 = 0;
                  L3: while (true) {
                    L4: {
                      if (param1.field_j <= var7) {
                        break L4;
                      } else {
                        stackOut_4_0 = 0;
                        stackIn_14_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var9 != 0) {
                          break L1;
                        } else {
                          var8 = stackIn_5_0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (param1.field_k <= var8) {
                                  break L7;
                                } else {
                                  incrementValue$1 = var6;
                                  var6++;
                                  var5[incrementValue$1] = param1.field_s[var7 * param1.field_k - -var8];
                                  var8++;
                                  if (var9 != 0) {
                                    break L6;
                                  } else {
                                    if (var9 == 0) {
                                      continue L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var6 = var6 + var2_int;
                              var7++;
                              break L6;
                            }
                            if (var9 == 0) {
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    param1.field_k = param1.field_k + var2_int;
                    param1.field_j = param1.field_j + var3;
                    param1.field_q = param1.field_q - var3;
                    param1.field_r = param1.field_r - var2_int;
                    param1.field_s = var5;
                    break L2;
                  }
                }
              }
              stackOut_13_0 = param0;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            }
            if (stackIn_14_0 < -66) {
              break L0;
            } else {
              wh.a(-77);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var2);
            stackOut_17_1 = new StringBuilder().append("wh.C(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    private wh() throws Throwable {
        throw new Error();
    }

    static {
        field_b = new ib();
    }
}
