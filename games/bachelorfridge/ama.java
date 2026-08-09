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
        int[] var4 = this.field_j.a(param0, -1);
        int[] var3 = var4;
        if (param1 != 0) {
            ama.e((byte) 27);
        }
        if (this.field_j.field_m) {
            this.a((byte) 126, this.field_j.a(false));
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
        int[][] var3 = this.field_h.a(param1, -858);
        if (param0) {
            return (int[][]) null;
        }
        if (!(!this.field_h.field_b)) {
            var4 = hh.field_d;
            var5 = bi.field_g;
            var29 = new int[var5][var4];
            var30 = this.field_h.b(-108);
            this.a((byte) 106, var29);
            for (var8 = 0; var8 < bi.field_g; var8++) {
                var32 = var29[var8];
                var31 = var30[var8];
                var11 = var31[0];
                var12 = var31[1];
                var13 = var31[2];
                for (var14 = 0; hh.field_d > var14; var14++) {
                    var15 = var32[var14];
                    var13[var14] = dda.a(var15, 255) << -892567228;
                    var12[var14] = dda.a(65280, var15) >> 294872388;
                    var11[var14] = dda.a(var15 >> 357549900, 4080);
                }
            }
        }
        return var3;
    }

    final void a(byte param0, lu param1, int param2) {
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (-1 != (param2 ^ -1)) {
                if (1 != param2) {
                  break L1;
                } else {
                  L2: {
                    stackIn_20_0 = this;

                    if (param1.b(16711935) != 1) {
                      stackIn_21_0 = this;
                      stackIn_21_1 = 0;
                      break L2;
                    } else {
                      stackIn_21_0 = this;
                      stackIn_21_1 = 1;
                      break L2;
                    }
                  }
                  ((ama) (this)).field_f = stackIn_21_1 != 0;
                  break L1;
                }
              } else {
                this.field_n = new vo[param1.b(param0 + 16712006)];
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= this.field_n.length) {
                    break L1;
                  } else {
                    L4: {
                      var5 = param1.b(16711935);
                      var6 = var5;
                      if (0 != var6) {
                        if (-2 != (var6 ^ -1)) {
                          if (var6 == 2) {
                            this.field_n[var4_int] = (vo) ((Object) ig.a(0, param1));
                            break L4;
                          } else {
                            if ((var6 ^ -1) == -4) {
                              this.field_n[var4_int] = (vo) ((Object) afa.a(param1, -128));
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        } else {
                          this.field_n[var4_int] = (vo) ((Object) ch.a(false, param1));
                          break L4;
                        }
                      } else {
                        this.field_n[var4_int] = (vo) ((Object) pka.a(param1, false));
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
                field_k = (String) null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4);

            stackIn_27_1 = new StringBuilder().append("ama.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ')');
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
        int var4 = 0;
        int var5 = 0;
        vo var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var3_int = hh.field_d;
              var4 = bi.field_g;
              tma.a(param1, -5);
              bm.a(it.field_r, 0, wp.field_r, -14702, 0);
              if (this.field_n != null) {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= this.field_n.length) {
                    break L1;
                  } else {
                    L3: {
                      var6 = this.field_n[var5];
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
                field_l = (String) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("ama.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    static {
        field_m = "Set up new unrated game";
        field_l = "Unable to add friend - system busy";
        field_k = "Message game";
    }
}
