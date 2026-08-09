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
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int[] var13;
        L0: {
          L1: {
            L2: {
              var10 = VoidHunters.field_G;
              var13 = this.field_f.a((byte) 121, param0);
              var12 = var13;
              var3 = var12;
              if (this.field_f.field_e) {
                var4 = sj.field_p[param0];
                if (-1 != (this.field_k ^ -1)) {
                  var5 = 0;
                  L3: while (true) {
                    if (hob.field_d <= var5) {
                      break L2;
                    } else {
                      var6 = 0;
                      var7 = 0;
                      var8 = grb.field_l[var5];
                      var9 = this.field_k;
                      stackIn_19_0 = var9;

                      stackIn_19_1 = 1;

                      L4: {
                        if (stackIn_19_0 != stackIn_19_1) {
                          if (2 != var9) {
                            if (var9 != 3) {
                              break L4;
                            } else {
                              var6 = 2048 - -(-var4 + var8 >> -1920400863);
                              break L4;
                            }
                          } else {
                            var6 = 2048 + (var8 - (4096 + -var4) >> -341085791);
                            break L4;
                          }
                        } else {
                          var6 = var8;
                          break L4;
                        }
                      }
                      var11 = 0;
                      var9 = var11;
                      L5: while (true) {
                        L6: {
                          if (var11 >= this.field_m) {
                            break L6;
                          } else {
                            if (var6 >= this.field_j[var11]) {
                              if (this.field_j[var11 - -1] > var6) {
                                if (this.field_i[var11] <= var6) {
                                  break L6;
                                } else {
                                  var7 = 4096;
                                  break L6;
                                }
                              } else {
                                var11++;
                                continue L5;
                              }
                            } else {
                              var11++;
                              continue L5;
                            }
                          }
                        }
                        var13 = var12;
                        var13[var5] = var7;
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  var5 = 0;
                  var6 = 0;
                  L7: while (true) {
                    L8: {
                      if (var6 >= this.field_m) {
                        break L8;
                      } else {
                        if ((var4 ^ -1) <= (this.field_j[var6] ^ -1)) {
                          if (var4 < this.field_j[1 + var6]) {
                            if (var4 >= this.field_i[var6]) {
                              break L8;
                            } else {
                              var5 = 4096;
                              break L8;
                            }
                          } else {
                            var6++;
                            continue L7;
                          }
                        } else {
                          var6++;
                          continue L7;
                        }
                      }
                    }
                    cua.a(var13, 0, hob.field_d, var5);
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            if (param1) {
              break L0;
            } else {
              break L1;
            }
          }
          return (int[]) null;
        }
        return var3;
    }

    private final void e(int param0) {
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        int var2 = 0;
        this.field_j = new int[1 + this.field_m];
        if (param0 > -51) {
            return;
        }
        this.field_i = new int[this.field_m + 1];
        int var3 = 4096 / this.field_m;
        int var4 = this.field_l * var3 >> -1077058228;
        for (var5 = 0; var5 < this.field_m; var5++) {
            this.field_j[var5] = var2;
            this.field_i[var5] = var2 - -var4;
            var2 = var2 + var3;
        }
        this.field_j[this.field_m] = 4096;
        this.field_i[this.field_m] = this.field_i[0] + 4096;
    }

    public static void d(int param0) {
        field_n = null;
        if (param0 != -120) {
            field_n = (String) null;
        }
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ds var6 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = param0;
              if (var4_int == 0) {
                this.field_m = param2.e((byte) -121);
                break L1;
              } else {
                if (-2 != (var4_int ^ -1)) {
                  if (2 != var4_int) {
                    break L1;
                  } else {
                    this.field_k = param2.e((byte) -103);
                    break L1;
                  }
                } else {
                  this.field_l = param2.e(1869);
                  break L1;
                }
              }
            }
            L2: {
              if (param1 <= -60) {
                break L2;
              } else {
                var6 = (ds) null;
                this.a(61, -61, (ds) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("moa.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public moa() {
        super(0, true);
        this.field_k = 0;
        this.field_l = 2048;
        this.field_m = 10;
    }

    final static void a(boolean param0) {
        int var1 = (gp.field_p - 640) / 2;
        int var2 = ldb.field_o * ldb.field_o;
        if (!param0) {
            field_n = (String) null;
        }
        int var3 = var2 + -(lia.field_b * lia.field_b);
        tb.field_a.a(var1 + -(var3 * 199 / var2), 32, 199, 90, -124 + dma.field_j - 90);
        bqa.field_d.a(438 * var3 / var2 + (var1 + 202), -126, 438, 0, -4 + (-120 + dma.field_j));
    }

    final void c(byte param0) {
        if (param0 > -35) {
            return;
        }
        this.e(-64);
    }

    static {
        field_n = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
