/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends k {
    static String field_k;
    private int field_n;
    static String field_m;
    static volatile int field_l;

    public static void d(int param0) {
        field_m = null;
        field_k = null;
        if (param0 != 4096) {
            field_m = (String) null;
        }
    }

    final int[] a(int param0, int param1) {
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_36_0 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int[] var10;
        int[] var11;
        var8 = BachelorFridge.field_y;
        if (param1 == 0) {
          var11 = this.field_j.a(param0, -1);
          var10 = var11;
          var9 = var10;
          var3 = var9;
          if (this.field_j.field_m) {
            var4 = tj.field_f[param0];
            var5 = 0;
            L0: while (true) {
              if (hh.field_d > var5) {
                L1: {
                  var6 = jq.field_k[var5];
                  if (this.field_n >= var6) {
                    break L1;
                  } else {
                    if (-this.field_n + 4096 <= var6) {
                      break L1;
                    } else {
                      if (2048 - this.field_n >= var4) {
                        break L1;
                      } else {
                        if (var4 < this.field_n + 2048) {
                          L2: {
                            var7 = -var6 + 2048;
                            if (-1 >= (var7 ^ -1)) {
                              stackIn_15_0 = var7;
                              break L2;
                            } else {
                              stackIn_15_0 = -var7;
                              break L2;
                            }
                          }
                          var7 = stackIn_15_0;
                          var7 = var7 << 12;
                          var7 = var7 / (-this.field_n + 2048);
                          var9[var5] = -var7 + 4096;
                          var5++;
                          continue L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                L3: {
                  if (2048 - this.field_n >= var6) {
                    break L3;
                  } else {
                    if (var6 < 2048 + this.field_n) {
                      L4: {
                        var7 = var4 - 2048;
                        if (-1 >= (var7 ^ -1)) {
                          stackIn_22_0 = var7;
                          break L4;
                        } else {
                          stackIn_22_0 = -var7;
                          break L4;
                        }
                      }
                      var7 = stackIn_22_0;
                      var7 = var7 - this.field_n;
                      var7 = var7 << 12;
                      var9[var5] = var7 / (-this.field_n + 2048);
                      var5++;
                      continue L0;
                    } else {
                      break L3;
                    }
                  }
                }
                L5: {
                  if (var4 < this.field_n) {
                    break L5;
                  } else {
                    if (-this.field_n + 4096 >= var4) {
                      L6: {
                        if (this.field_n > var6) {
                          break L6;
                        } else {
                          if (-this.field_n + 4096 >= var6) {
                            var11 = var10;
                            var11[var5] = 0;
                            var5++;
                            continue L0;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        var7 = -var4 + 2048;
                        if ((var7 ^ -1) > -1) {
                          stackIn_36_0 = -var7;
                          break L7;
                        } else {
                          stackIn_36_0 = var7;
                          break L7;
                        }
                      }
                      var7 = stackIn_36_0;
                      var7 = var7 << 12;
                      var7 = var7 / (2048 - this.field_n);
                      var9[var5] = -var7 + 4096;
                      var5++;
                      continue L0;
                    } else {
                      break L5;
                    }
                  }
                }
                L8: {
                  var7 = -2048 + var6;
                  if ((var7 ^ -1) <= -1) {
                    stackIn_29_0 = var7;
                    break L8;
                  } else {
                    stackIn_29_0 = -var7;
                    break L8;
                  }
                }
                var7 = stackIn_29_0;
                var7 = var7 - this.field_n;
                var7 = var7 << 12;
                var9[var5] = var7 / (2048 + -this.field_n);
                var5++;
                continue L0;
              } else {
                return var9;
              }
            }
          } else {
            return var9;
          }
        } else {
          return (int[]) null;
        }
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (0 != var4_int) {
                break L1;
              } else {
                this.field_n = param1.e((byte) 106);
                break L1;
              }
            }
            if (param0 == -71) {
              break L0;
            } else {
              jh.d(-90);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("jh.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
    }

    public jh() {
        super(0, true);
        this.field_n = 585;
    }

    static {
        field_k = "Show players in <%0>'s game";
        field_m = "Loading fonts";
        field_l = 0;
    }
}
