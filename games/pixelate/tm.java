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
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
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
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final int f(byte param0) {
        int var2 = 108 / ((9 - param0) / 53);
        return ((tm) this).field_W.b(1);
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
        L0: {
          if (param1 < 0) {
            break L0;
          } else {
            if (param1 < ((tm) this).field_W.b(1)) {
              L1: {
                if (param0 <= -84) {
                  break L1;
                } else {
                  field_U = -103;
                  break L1;
                }
              }
              return ((tm) this).field_W.c(param1, -124);
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    final int k(int param0) {
        if (param0 != -1) {
            tm.d((byte) 62);
        }
        return ((tm) this).field_P;
    }

    final boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Pixelate.field_H ? 1 : 0;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
          return false;
        } else {
          L0: {
            var8 = -((tm) this).field_R + -param5 + param4;
            var9 = ((tm) this).field_E - 2 * ((tm) this).field_R;
            if (var9 < var8) {
              var8 = var9;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-1 < (var8 ^ -1)) {
              var8 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var8 = ((tm) this).field_P * var8 / var9;
            if (1 != param2) {
              if (param2 == 2) {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L3: while (true) {
                  if (var12 >= ((tm) this).field_W.b(1)) {
                    if (var11 >= 0) {
                      ((tm) this).field_W.a((byte) -84, var11);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var13 = ((tm) this).field_W.c(var12, -69) - var8;
                    var13 = var13 * var13;
                    if (var10 > var13) {
                      var11 = var12;
                      var10 = var13;
                      var12++;
                      continue L3;
                    } else {
                      var12++;
                      continue L3;
                    }
                  }
                }
              } else {
                return true;
              }
            } else {
              ((tm) this).field_W.a(true, var8);
              break L2;
            }
          }
          return true;
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
                field_N = null;
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
        int var4 = Pixelate.field_H ? 1 : 0;
        int var3 = 0;
        if (param1 != -23439) {
            field_O = null;
        }
        while ((param2 ^ -1) < -1) {
            var3 = param0 & 1 | var3 << -1595841631;
            param2--;
            param0 = param0 >>> 1;
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_V = -1;
        field_U = -1;
        field_Y = new int[]{5, 24, 50};
    }
}
