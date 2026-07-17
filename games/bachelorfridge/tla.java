/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tla extends bca {
    static eaa field_q;
    int field_r;
    int field_v;
    aj[] field_t;
    static String field_s;
    int field_u;

    final static void d(int param0) {
        int var1 = 0;
        if (null == cr.field_c) {
          if (sla.field_a != null) {
            L0: {
              rp.a(true, sla.field_a);
              if (null != m.field_b) {
                rp.a(true, m.field_b);
                break L0;
              } else {
                break L0;
              }
            }
            var1 = -27 % ((param0 - -33) / 39);
            return;
          } else {
            L1: {
              if (null != m.field_b) {
                rp.a(true, m.field_b);
                break L1;
              } else {
                break L1;
              }
            }
            var1 = -27 % ((param0 - -33) / 39);
            return;
          }
        } else {
          rp.a(true, cr.field_c);
          if (sla.field_a == null) {
            L2: {
              if (null != m.field_b) {
                rp.a(true, m.field_b);
                break L2;
              } else {
                break L2;
              }
            }
            var1 = -27 % ((param0 - -33) / 39);
            return;
          } else {
            L3: {
              rp.a(true, sla.field_a);
              if (null != m.field_b) {
                rp.a(true, m.field_b);
                break L3;
              } else {
                break L3;
              }
            }
            var1 = -27 % ((param0 - -33) / 39);
            return;
          }
        }
    }

    tla(int param0, nq param1) {
        super(param0, param1);
        try {
            ((tla) this).field_u = 0;
            ((tla) this).field_t = new aj[6];
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tla.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (param0 >= dg.field_f) {
          if (param0 >= dg.field_h) {
            return;
          } else {
            if (param3 >= dg.field_j) {
              if (dg.field_k > param3) {
                var5 = 65280 & param2;
                if (param1 != -1898743704) {
                  return;
                } else {
                  var5 = var5 * param4;
                  param2 = param2 & 16711935;
                  param2 = param2 * param4;
                  var5 = var5 & 16711680;
                  param2 = param2 & -16711936;
                  var6 = dg.field_i * param3 + param0;
                  var7 = dg.field_e[var6];
                  var5 = var5 + (16711680 & (var7 & 65280) * (256 - param4));
                  param2 = param2 + ((16711935 & var7) * (256 + -param4) & -16711936);
                  dg.field_e[var6] = mp.a(param2, var5) >>> 8;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        fd stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        fd stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 5) {
              stackOut_3_0 = new fd(param1, (tla) this);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (at) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("tla.A(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return (at) (Object) stackIn_4_0;
    }

    tla(lu param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            ((tla) this).field_k = param0.e((byte) 46);
            ((tla) this).field_o = new eaa();
            var2_int = param0.b(16711935);
            L1: while (true) {
              var2_int--;
              if (0 > var2_int) {
                ((tla) this).field_v = param0.b(16711935);
                ((tla) this).field_r = param0.b(16711935);
                ((tla) this).field_u = param0.b(16711935);
                ((tla) this).field_t = new aj[((tla) this).field_u];
                var3 = 0;
                L2: while (true) {
                  if (((tla) this).field_u <= var3) {
                    break L0;
                  } else {
                    ((tla) this).field_t[var3] = new aj(param0.b(16711935), param0.b(16711935));
                    var3++;
                    continue L2;
                  }
                }
              } else {
                ((tla) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("tla.<init>(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final void a(byte param0, lu param1) {
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
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            super.a((byte) -82, param1);
            param1.d(((tla) this).field_v, 0);
            param1.d(((tla) this).field_r, 0);
            param1.d(((tla) this).field_u, 0);
            if (param0 < -12) {
              var3_int = 0;
              L1: while (true) {
                if (((tla) this).field_u <= var3_int) {
                  break L0;
                } else {
                  param1.d(((tla) this).field_t[var3_int].field_c, 0);
                  param1.d(((tla) this).field_t[var3_int].field_a, 0);
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("tla.F(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final int[][] d(boolean param0) {
        int[][] var2 = null;
        int[][] var3 = null;
        int[][] var4 = null;
        int[][] var5 = null;
        int[][] var6 = null;
        int[][] var7 = null;
        L0: {
          var7 = new int[17][17];
          var6 = var7;
          var5 = var6;
          var4 = var5;
          var3 = var4;
          var2 = var3;
          var7[5][8] = 1;
          if (!param0) {
            break L0;
          } else {
            tla.c(false);
            break L0;
          }
        }
        var7[6][7] = 1;
        var7[7][7] = 1;
        var7[7][6] = 1;
        var7[6][9] = 1;
        var7[6][8] = 1;
        var7[7][10] = 1;
        var7[8][7] = 1;
        var7[8][6] = 1;
        var7[7][9] = 1;
        var7[7][8] = 1;
        var7[8][5] = 1;
        var7[8][8] = 1;
        var7[9][7] = 1;
        var7[9][6] = 1;
        var7[8][9] = 1;
        var7[8][10] = 1;
        var7[8][11] = 1;
        var7[9][10] = 1;
        var7[9][9] = 1;
        var7[9][8] = 1;
        var7[10][7] = 1;
        var7[10][9] = 1;
        var7[10][8] = 1;
        var7[11][8] = 1;
        return var2;
    }

    public static void c(boolean param0) {
        field_q = null;
        field_s = null;
        if (param0) {
            tla.c(true);
        }
    }

    final void a(op param0, int param1) {
        try {
            int var3_int = -53 / ((param1 - 12) / 35);
            ((tla) this).a(param0, (byte) -2);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tla.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Click";
        field_q = new eaa();
    }
}
