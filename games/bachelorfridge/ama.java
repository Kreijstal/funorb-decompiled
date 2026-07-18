/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ama extends k {
    static String field_m;
    static kv[] field_o;
    private vo[] field_n;
    static String field_l;
    static String field_k;

    public ama() {
        super(0, true);
    }

    final int[] a(int param0, int param1) {
        int[] var4 = ((ama) this).field_j.a(param0, -1);
        int[] var3 = var4;
        if (param1 != 0) {
            ama.e((byte) 27);
        }
        if (((ama) this).field_j.field_m) {
            this.a((byte) 126, ((ama) this).field_j.a(false));
        }
        return var4;
    }

    final int[][] a(boolean param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int[][] var29 = null;
        int[][][] var30 = null;
        int var8 = 0;
        int[] var32 = null;
        int[][] var31 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = BachelorFridge.field_y;
        int[][] var3 = ((ama) this).field_h.a(param1, -858);
        if (param0) {
            return null;
        }
        if (!(!((ama) this).field_h.field_b)) {
            var4 = hh.field_d;
            var5 = bi.field_g;
            var29 = new int[var5][var4];
            var30 = ((ama) this).field_h.b(-108);
            this.a((byte) 106, var29);
            for (var8 = 0; var8 < bi.field_g; var8++) {
                var32 = var29[var8];
                var31 = var30[var8];
                var11 = var31[0];
                var12 = var31[1];
                var13 = var31[2];
                for (var14 = 0; hh.field_d > var14; var14++) {
                    var15 = var32[var14];
                    var13[var14] = dda.a(var15, 255) << 4;
                    var12[var14] = dda.a(65280, var15) >> 4;
                    var11[var14] = dda.a(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    final void a(byte param0, lu param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param2 != 0) {
                if (1 != param2) {
                  break L1;
                } else {
                  L2: {
                    stackOut_17_0 = this;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (param1.b(16711935) != 1) {
                      stackOut_19_0 = this;
                      stackOut_19_1 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L2;
                    } else {
                      stackOut_18_0 = this;
                      stackOut_18_1 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      break L2;
                    }
                  }
                  ((ama) this).field_f = stackIn_20_1 != 0;
                  break L1;
                }
              } else {
                ((ama) this).field_n = new vo[param1.b(param0 + 16712006)];
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= ((ama) this).field_n.length) {
                    break L1;
                  } else {
                    L4: {
                      var5 = param1.b(16711935);
                      var6 = var5;
                      if (0 != var6) {
                        if (var6 != 1) {
                          if (var6 == 2) {
                            ((ama) this).field_n[var4_int] = (vo) (Object) ig.a(0, param1);
                            break L4;
                          } else {
                            if (var6 == 3) {
                              int discarded$1 = -128;
                              ((ama) this).field_n[var4_int] = (vo) (Object) afa.a(param1);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        } else {
                          ((ama) this).field_n[var4_int] = (vo) (Object) ch.a(false, param1);
                          break L4;
                        }
                      } else {
                        ((ama) this).field_n[var4_int] = (vo) (Object) pka.a(param1, false);
                        break L4;
                      }
                    }
                    var4_int++;
                    continue L3;
                  }
                }
              }
            }
            L5: {
              if (param0 == -71) {
                break L5;
              } else {
                field_k = null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4;
            stackOut_24_1 = new StringBuilder().append("ama.E(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param2 + ')');
        }
    }

    public static void e(byte param0) {
        field_o = null;
        field_l = null;
        if (param0 > -107) {
            return;
        }
        field_m = null;
        field_k = null;
    }

    private final void a(byte param0, int[][] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        vo var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var3_int = hh.field_d;
              var4 = bi.field_g;
              int discarded$54 = -5;
              tma.a(param1);
              int discarded$55 = 0;
              int discarded$56 = -14702;
              bm.a(it.field_r, 0, wp.field_r);
              if (((ama) this).field_n != null) {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= ((ama) this).field_n.length) {
                    break L1;
                  } else {
                    L3: {
                      var6 = ((ama) this).field_n[var5];
                      var7 = var6.field_a;
                      var8 = var6.field_f;
                      if (var7 < 0) {
                        if (0 > var8) {
                          break L3;
                        } else {
                          var6.a(var3_int, -25222, var4);
                          break L3;
                        }
                      } else {
                        if (var8 >= 0) {
                          var6.a((byte) -80, var4, var3_int);
                          break L3;
                        } else {
                          var6.b(var3_int, 76, var4);
                          break L3;
                        }
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (param0 >= 72) {
                break L4;
              } else {
                field_l = null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("ama.C(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Set up new unrated game";
        field_l = "Unable to add friend - system busy";
        field_k = "Message game";
    }
}
