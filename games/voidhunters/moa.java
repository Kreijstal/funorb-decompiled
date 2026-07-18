/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class moa extends le {
    private int field_k;
    static String field_n;
    private int[] field_i;
    private int[] field_j;
    private int field_m;
    private int field_l;

    final int[] a(int param0, boolean param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = VoidHunters.field_G;
          var15 = ((moa) this).field_f.a((byte) 121, param0);
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (((moa) this).field_f.field_e) {
            var4 = sj.field_p[param0];
            if (((moa) this).field_k != 0) {
              var5 = 0;
              L1: while (true) {
                if (hob.field_d <= var5) {
                  break L0;
                } else {
                  L2: {
                    var6 = 0;
                    var7 = 0;
                    var8 = grb.field_l[var5];
                    var9 = ((moa) this).field_k;
                    if (var9 != 1) {
                      if (2 != var9) {
                        if (var9 != 3) {
                          break L2;
                        } else {
                          var6 = 2048 - -(-var4 + var8 >> 1);
                          break L2;
                        }
                      } else {
                        var6 = 2048 + (var8 - (4096 + -var4) >> 1);
                        break L2;
                      }
                    } else {
                      var6 = var8;
                      break L2;
                    }
                  }
                  var11 = 0;
                  var9 = var11;
                  L3: while (true) {
                    L4: {
                      if (var11 >= ((moa) this).field_m) {
                        break L4;
                      } else {
                        if (var6 >= ((moa) this).field_j[var11]) {
                          if (((moa) this).field_j[var11 - -1] > var6) {
                            if (((moa) this).field_i[var11] <= var6) {
                              break L4;
                            } else {
                              var7 = 4096;
                              break L4;
                            }
                          } else {
                            var11++;
                            continue L3;
                          }
                        } else {
                          var11++;
                          continue L3;
                        }
                      }
                    }
                    var15[var5] = var7;
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              var5 = 0;
              var6 = 0;
              L5: while (true) {
                L6: {
                  if (var6 >= ((moa) this).field_m) {
                    break L6;
                  } else {
                    if (var4 >= ((moa) this).field_j[var6]) {
                      if (var4 < ((moa) this).field_j[1 + var6]) {
                        if (var4 >= ((moa) this).field_i[var6]) {
                          break L6;
                        } else {
                          var5 = 4096;
                          break L6;
                        }
                      } else {
                        var6++;
                        continue L5;
                      }
                    } else {
                      var6++;
                      continue L5;
                    }
                  }
                }
                cua.a(var15, 0, hob.field_d, var5);
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        if (param1) {
          return var3;
        } else {
          return null;
        }
    }

    private final void e() {
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        int var2 = 0;
        ((moa) this).field_j = new int[1 + ((moa) this).field_m];
        ((moa) this).field_i = new int[((moa) this).field_m + 1];
        int var3 = 4096 / ((moa) this).field_m;
        int var4 = ((moa) this).field_l * var3 >> 12;
        for (var5 = 0; var5 < ((moa) this).field_m; var5++) {
            ((moa) this).field_j[var5] = var2;
            ((moa) this).field_i[var5] = var2 - -var4;
            var2 = var2 + var3;
        }
        ((moa) this).field_j[((moa) this).field_m] = 4096;
        ((moa) this).field_i[((moa) this).field_m] = ((moa) this).field_i[0] + 4096;
    }

    public static void d() {
        field_n = null;
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = param0;
              if (var4_int == 0) {
                ((moa) this).field_m = param2.e((byte) -121);
                break L1;
              } else {
                if (var4_int != 1) {
                  if (2 != var4_int) {
                    break L1;
                  } else {
                    ((moa) this).field_k = param2.e((byte) -103);
                    break L1;
                  }
                } else {
                  ((moa) this).field_l = param2.e(1869);
                  break L1;
                }
              }
            }
            L2: {
              if (param1 <= -60) {
                break L2;
              } else {
                var6 = null;
                ((moa) this).a(61, -61, (ds) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("moa.F(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    public moa() {
        super(0, true);
        ((moa) this).field_k = 0;
        ((moa) this).field_l = 2048;
        ((moa) this).field_m = 10;
    }

    final static void a() {
        int var1 = (gp.field_p - 640) / 2;
        int var2 = ldb.field_o * ldb.field_o;
        int var3 = var2 + -(lia.field_b * lia.field_b);
        tb.field_a.a(var1 + -(var3 * 199 / var2), 32, 199, 90, -124 + dma.field_j - 90);
        bqa.field_d.a(438 * var3 / var2 + (var1 + 202), -126, 438, 0, -4 + (-120 + dma.field_j));
    }

    final void c(byte param0) {
        if (param0 > -35) {
            return;
        }
        int discarded$0 = -64;
        this.e();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
