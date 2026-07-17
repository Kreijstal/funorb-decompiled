/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uma extends sh {
    private lka field_N;
    private lka field_Q;
    static kv[] field_J;
    private boolean field_K;
    static String field_O;
    private lka field_L;
    static eaa field_M;
    static kga[] field_P;

    uma(qda param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
            ((uma) this).a(param2, param5, (byte) 59, param4, param3);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "uma.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final void a(gl param0, byte param1) {
        super.a(param0, (byte) 114);
        ((uma) this).field_Q.field_k = (pl) (Object) param0;
        if (param1 < 111) {
            return;
        }
        try {
            ((uma) this).field_N.field_k = (pl) (Object) param0;
            ((uma) this).field_L.field_k = (pl) (Object) param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "uma.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, kv param3, int param4, int[] param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              param4 -= 3;
              if (param3.field_q >= param0) {
                break L1;
              } else {
                param0 = param3.field_q;
                break L1;
              }
            }
            var6_int = 0;
            var7 = param2;
            L2: while (true) {
              if (param3.field_p <= var7) {
                break L0;
              } else {
                var8 = param5[param5.length * var7 / param3.field_p];
                var9 = 0;
                L3: while (true) {
                  if (var9 >= param0) {
                    var6_int = var6_int + (-param0 + param3.field_q);
                    var7++;
                    continue L2;
                  } else {
                    L4: {
                      if (param3.field_v[var6_int] < 0) {
                        break L4;
                      } else {
                        tla.a(param1 - -var9, -1898743704, var8, var7 + param4, param3.field_v[var6_int] & 255);
                        break L4;
                      }
                    }
                    var6_int++;
                    var9++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("uma.N(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param4).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param5 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final int f(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 20) {
                break L1;
              } else {
                field_J = null;
                break L1;
              }
            }
            stackOut_2_0 = Integer.parseInt(((uma) this).field_N.field_w) + -1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    final static void n(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        hw var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= bf.field_g.length) {
                var6 = 0;
                var1_int = var6;
                L2: while (true) {
                  if (hha.field_w.length <= var6) {
                    break L0;
                  } else {
                    L3: {
                      hha.field_w[var6] = new hw(-1);
                      if (-1 == rn.field_s.field_g.field_m[var6]) {
                        break L3;
                      } else {
                        hha.field_w[var6].field_vb = rn.field_s.field_g.field_m[var6];
                        break L3;
                      }
                    }
                    var2 = od.field_A[var6][0];
                    var3 = od.field_A[var6][1];
                    hha.field_w[var6].field_kb = -16 + var2;
                    hha.field_w[var6].field_rb = var3 + -16;
                    var4 = hha.field_w[var6];
                    hha.field_w[var6].field_p = 32;
                    var4.field_sb = 32;
                    var6++;
                    continue L2;
                  }
                }
              } else {
                bf.field_g[var1_int] = new hw(ko.field_f.field_b[var1_int]);
                var2 = ica.field_r[var1_int][0];
                var3 = ica.field_r[var1_int][1];
                bf.field_g[var1_int].field_kb = -16 + var2;
                bf.field_g[var1_int].field_rb = -16 + var3;
                bf.field_g[var1_int].field_sb = 32;
                bf.field_g[var1_int].field_p = 32;
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "uma.F(" + 1 + 41);
        }
    }

    final int j(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        if (param0 == -1) {
          try {
            L0: {
              stackOut_2_0 = Integer.parseInt(((uma) this).field_L.field_w);
              stackIn_3_0 = stackOut_2_0;
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            return -1;
          }
          return stackIn_3_0;
        } else {
          return 121;
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, (byte) 59, param3, param4);
        int var6 = -130 + param3 >> 1;
        if (!((uma) this).field_K) {
            ((uma) this).field_Q.a(var6, param1, (byte) 59, 25, 0);
            ((uma) this).field_N.a(var6 - -45, param1, (byte) 59, 25, 0);
        } else {
            ((uma) this).field_N.a(var6, param1, (byte) 59, 25, 0);
            ((uma) this).field_Q.a(45 + var6, param1, (byte) 59, 25, 0);
        }
        ((uma) this).field_L.a(var6 + 90, param1, param2, 40, 0);
    }

    private final void a(byte param0, wj param1, String param2, int param3, int param4) {
        if (param0 != -68) {
            return;
        }
        try {
            oc.field_l.a(param2, param4 - -param1.field_s - -(param1.field_p >> 1), -5 + param1.field_v + param3, 16777215, -1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "uma.Q(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    private uma(qda param0, boolean param1) {
        super(0, 0, 0, 0, (qda) null);
        try {
            ((uma) this).field_Q = (lka) (Object) new vn("", (pl) null, 2);
            ((uma) this).field_N = (lka) (Object) new vn("", (pl) null, 2);
            ((uma) this).field_L = (lka) (Object) new vn("", (pl) null, 4);
            ((uma) this).field_L.field_f = param0;
            ((uma) this).field_N.field_f = param0;
            ((uma) this).field_Q.field_f = param0;
            ((uma) this).field_K = param1 ? true : false;
            if (((uma) this).field_K) {
                ((uma) this).c((wj) (Object) ((uma) this).field_N, 42);
                ((uma) this).c((wj) (Object) ((uma) this).field_Q, -127);
            } else {
                ((uma) this).c((wj) (Object) ((uma) this).field_Q, -120);
                ((uma) this).c((wj) (Object) ((uma) this).field_N, -126);
            }
            ((uma) this).c((wj) (Object) ((uma) this).field_L, -128);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "uma.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void m(int param0) {
        field_O = null;
        field_P = null;
        field_J = null;
        field_M = null;
    }

    final String c(byte param0) {
        String var2 = ((uma) this).field_N.c(param0);
        if (var2 != null) {
            return var2;
        }
        if (!(!((uma) this).field_t)) {
            return ((uma) this).field_h != null ? ((uma) this).field_h : ((uma) this).field_w;
        }
        return null;
    }

    final boolean k(int param0) {
        if (null == ((uma) this).field_Q.field_w) {
          return true;
        } else {
          if (0 != ((uma) this).field_Q.field_w.length()) {
            if (param0 < -54) {
              L0: {
                if (null == ((uma) this).field_N.field_w) {
                  break L0;
                } else {
                  if (0 != ((uma) this).field_N.field_w.length()) {
                    L1: {
                      if (((uma) this).field_L.field_w == null) {
                        break L1;
                      } else {
                        if (0 != ((uma) this).field_L.field_w.length()) {
                          return false;
                        } else {
                          break L1;
                        }
                      }
                    }
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
              return true;
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final int d(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int stackIn_1_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            var2_int = -108 % ((-64 - param0) / 56);
            stackOut_0_0 = Integer.parseInt(((uma) this).field_Q.field_w);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_1_0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a((byte) 107, param1, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        param1 = param1 + ((uma) this).field_v;
        int var5 = 83 % ((param0 - -20) / 54);
        param3 = param3 + ((uma) this).field_s;
        this.a((byte) -68, (wj) (Object) ((uma) this).field_Q, tca.field_b, param1, param3);
        this.a((byte) -68, (wj) (Object) ((uma) this).field_N, ao.field_c, param1, param3);
        this.a((byte) -68, (wj) (Object) ((uma) this).field_L, ca.field_d, param1, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_P = new kga[8];
    }
}
