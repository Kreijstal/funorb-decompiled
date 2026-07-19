/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends fh {
    int[] field_n;
    private String[] field_k;
    private int[][] field_l;
    private int[] field_m;

    private final void a(ds param0, int param1, int param2) {
        int[] array$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ri var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                pi.a((byte) 3, false, false);
                break L1;
              }
            }
            L2: {
              if ((param1 ^ -1) == -2) {
                this.field_k = up.a((byte) -67, '<', param0.a(-1));
                break L2;
              } else {
                if ((param1 ^ -1) == -3) {
                  var4_int = param0.e((byte) -113);
                  this.field_n = new int[var4_int];
                  var5 = 0;
                  L3: while (true) {
                    if (var4_int <= var5) {
                      break L2;
                    } else {
                      this.field_n[var5] = param0.e(1869);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  if (-4 == (param1 ^ -1)) {
                    var4_int = param0.e((byte) -107);
                    this.field_m = new int[var4_int];
                    this.field_l = new int[var4_int][];
                    var5 = 0;
                    L4: while (true) {
                      if (var4_int <= var5) {
                        break L2;
                      } else {
                        L5: {
                          var6 = param0.e(param2 ^ 1869);
                          var7 = itb.a(0, var6);
                          if (var7 == null) {
                            break L5;
                          } else {
                            this.field_m[var5] = var6;
                            array$1 = new int[var7.field_c];
                            this.field_l[var5] = array$1;
                            var8 = 0;
                            L6: while (true) {
                              if (var8 >= var7.field_c) {
                                break L5;
                              } else {
                                this.field_l[var5][var8] = param0.e(1869);
                                var8++;
                                continue L6;
                              }
                            }
                          }
                        }
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    if ((param1 ^ -1) == -5) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4);
            stackOut_20_1 = new StringBuilder().append("pi.C(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final String a(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = VoidHunters.field_G;
        StringBuilder var5 = new StringBuilder(param0);
        StringBuilder var2 = var5;
        if (null == this.field_k) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_k[0]);
        for (var3 = 1; this.field_k.length > var3; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var5.append(this.field_k[var3]);
        }
        return var2.toString();
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (param0 != 97) {
            return;
        }
        if (null != this.field_n) {
            for (var2 = 0; this.field_n.length > var2; var2++) {
                this.field_n[var2] = knb.a(this.field_n[var2], 32768);
            }
        }
    }

    final void a(ds param0, int param1) {
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
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: while (true) {
              var3_int = param0.e((byte) -104);
              if (var3_int != 0) {
                this.a(param0, var3_int, 0);
                continue L1;
              } else {
                L2: {
                  if (param1 == -1) {
                    break L2;
                  } else {
                    this.field_n = (int[]) null;
                    break L2;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("pi.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        if (param0 > -6) {
            return;
        }
        if (!param1) {
            dma.a();
        } else {
            dma.e(0, 0, dma.field_g, dma.field_j, 0, 192);
        }
        vqb.a(param1, 76);
    }

    pi() {
    }

    static {
    }
}
