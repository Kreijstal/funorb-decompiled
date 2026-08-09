/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends qm {
    int field_R;
    static String field_Q;
    int field_T;
    static int field_U;
    static String[] field_S;
    static int[] field_Y;
    static sb field_N;
    static ge field_X;
    static int[] field_O;
    private int field_P;
    static int field_V;
    private wd field_W;

    final static boolean a(byte param0) {
        int stackIn_9_0 = 0;
        L0: {
          if (param0 >= 108) {
            break L0;
          } else {
            field_U = -99;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null != eg.field_n) {
              break L2;
            } else {
              if (sc.b(-10093)) {
                break L2;
              } else {
                if (null != hc.field_M) {
                  break L2;
                } else {
                  if (!ha.b(12742)) {
                    stackIn_9_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final int f(byte param0) {
        int var2 = 108 / ((9 - param0) / 53);
        return this.field_W.b(1);
    }

    final static void a(int param0) {
        if (!lo.field_Nb) {
            throw new IllegalStateException();
        }
        sd.field_I = true;
        if (param0 != -20822) {
            tm.a(-68);
        }
        nl.a(0, true);
        el.field_b = 0;
    }

    final int a(byte param0, int param1) {
        if (param1 < 0 || param1 >= this.field_W.b(1)) {
            return -1;
        }
        if (param0 > -84) {
            field_U = -103;
        }
        return this.field_W.c(param1, -124);
    }

    final int k(int param0) {
        if (param0 != -1) {
            tm.d((byte) 62);
        }
        return this.field_P;
    }

    final boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_23_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = -this.field_R + -param5 + param4;
                var9 = this.field_E - 2 * this.field_R;
                if (var9 < var8_int) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (-1 < (var8_int ^ -1)) {
                  var8_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var8_int = this.field_P * var8_int / var9;
                if (1 != param2) {
                  if (param2 == 2) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= this.field_W.b(1)) {
                        if (var11 >= 0) {
                          this.field_W.a((byte) -84, var11);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        var13 = this.field_W.c(var12, -69) - var8_int;
                        var13 = var13 * var13;
                        if (var10 > var13) {
                          var11 = var12;
                          var10 = var13;
                          var12++;
                          continue L4;
                        } else {
                          var12++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  this.field_W.a(true, var8_int);
                  break L3;
                }
              }
              stackIn_21_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var8);

            stackIn_26_1 = new StringBuilder().append("tm.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0 != 0;
        } else {
          return stackIn_23_0 != 0;
        }
    }

    final static void d(byte param0) {
        try {
            if (!(null == vi.field_p)) {
                try {
                    vi.field_p.a(0L, -112);
                    vi.field_p.a(24, vi.field_o.field_m, (byte) -121, vi.field_o.field_k);
                } catch (Exception exception) {
                }
            }
            if (param0 >= -45) {
                field_N = (sb) null;
            }
            vi.field_o.field_m = vi.field_o.field_m + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(byte param0) {
        field_Q = null;
        field_O = null;
        field_X = null;
        if (param0 != -89) {
            return;
        }
        field_Y = null;
        field_S = null;
        field_N = null;
    }

    private tm() throws Throwable {
        throw new Error();
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 == -23439) {
                break L1;
              } else {
                field_O = (int[]) null;
                break L1;
              }
            }
            L2: while (true) {
              if ((param2 ^ -1) >= -1) {
                stackIn_6_0 = var3_int;
                break L0;
              } else {
                var3_int = param0 & 1 | var3_int << -1595841631;
                param2--;
                param0 = param0 >>> 1;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "tm.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    static {
        field_Q = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_V = -1;
        field_U = -1;
        field_Y = new int[]{5, 24, 50};
    }
}
