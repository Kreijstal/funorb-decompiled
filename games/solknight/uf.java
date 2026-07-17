/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uf extends af {
    static int field_q;
    static byte[][] field_s;
    static String field_r;
    static int field_p;

    uf(mg param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_F, -1, 2147483647, false);
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        try {
            if (param0 < 113) {
                Object var7 = null;
                ((uf) this).a((byte) 62, -71, true, -109, (rc) null);
            }
            if (!(!param2)) {
                pl.a(true, param4.field_x, param4.field_t, param4.field_j + param1, param3 + param4.field_m);
            }
            super.a((byte) 117, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "uf.T(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    uf(int param0) {
        this(ua.field_G, param0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = SolKnight.field_L ? 1 : 0;
        if (param6 >= param7) {
          if (param0 <= param6) {
            if (param7 < param0) {
              qb.a(param7, param6, param1, param2, param5, param3, 75, mi.field_f, param0);
              return;
            } else {
              qb.a(param0, param6, param3, param2, param5, param1, 95, mi.field_f, param7);
              return;
            }
          } else {
            qb.a(param7, param0, param5, param2, param1, param3, 48, mi.field_f, param6);
            return;
          }
        } else {
          if (param0 <= param7) {
            if (param0 <= param6) {
              qb.a(param0, param7, param5, param2, param3, param1, 73, mi.field_f, param6);
              return;
            } else {
              qb.a(param6, param7, param1, param2, param3, param5, 38, mi.field_f, param0);
              return;
            }
          } else {
            qb.a(param6, param0, param3, param2, param1, param5, 98, mi.field_f, param7);
            return;
          }
        }
    }

    final static ff a(int param0, byte param1) {
        ff[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        ff[] var5 = null;
        var4 = SolKnight.field_L ? 1 : 0;
        var5 = qh.a(-89);
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var5.length > var3) {
            if (param0 == var5[var3].field_a) {
              return var5[var3];
            } else {
              var3++;
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, rl param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        Throwable var6 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            var4_int = 123;
            if (null != ah.field_a) {
              kd.a(256, (byte) 101, param3, 1048576, param0);
              break L0;
            } else {
              break L0;
            }
          }
          if (null != ua.field_I) {
            var5 = (Object) (Object) kj.field_P;
            synchronized (var5) {
              L1: {
                ua.field_I.b(256, -1, -129);
                if (param3 == dj.field_j) {
                  return;
                } else {
                  L2: {
                    ua.field_I.a((byte) 97);
                    kj.field_P.h();
                    dj.field_j = param3;
                    if (null == dj.field_j) {
                      break L2;
                    } else {
                      ua.field_I.a(param0, dj.field_j, true);
                      break L2;
                    }
                  }
                  break L1;
                }
              }
            }
            return;
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("uf.HA(").append(param0).append(44).append(123).append(44).append(256).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    public static void e() {
        field_s = null;
        field_r = null;
    }

    final static void a(byte param0, int param1, int param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          try {
            L0: {
              var4 = param3.getGraphics();
              hj.field_e.a(0, 0, 0, var4);
              var4.dispose();
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param3.repaint();
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref2;
            stackOut_4_1 = new StringBuilder().append("uf.FA(").append(99).append(44).append(0).append(44).append(0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final static void d() {
        try {
            Exception var1 = null;
            Throwable decompiledCaughtException = null;
            if (null != pj.field_D) {
              try {
                L0: {
                  pj.field_D.a(0L, (byte) 45);
                  pj.field_D.a(te.field_N.field_l, -20291, 24, te.field_N.field_m);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (Exception) (Object) decompiledCaughtException;
                te.field_N.field_m = te.field_N.field_m + 24;
                return;
              }
              te.field_N.field_m = te.field_N.field_m + 24;
              return;
            } else {
              te.field_N.field_m = te.field_N.field_m + 24;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, boolean param1) {
        u.field_b.a(19550, 0, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = -1;
    }
}
