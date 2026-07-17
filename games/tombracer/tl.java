/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends nv implements ut {
    static String field_p;
    private jma field_s;
    static int field_r;
    private mg field_o;
    static long[] field_q;
    static jpa field_n;

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param1--;
              if (param1 < 0) {
                break L0;
              } else {
                var9 = param4;
                var5 = var9;
                var6 = param0;
                var7 = param2;
                var9[var6] = var7 - -(sea.c(16711422, var9[var6]) >> 1);
                param0++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("tl.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(1535993377).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            ((tl) this).field_s.a(((tl) this).h((byte) 123), (byte) 76, param1);
            ((tl) this).field_o.a(15637, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tl.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final int c(int param0) {
        if (param0 != 17832) {
            jma discarded$0 = ((tl) this).k((byte) 44);
            return 5570594;
        }
        return 5570594;
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
          ((tl) this).field_o = null;
          return ((tl) this).field_s.a(86, param0);
        } else {
          return ((tl) this).field_s.a(86, param0);
        }
    }

    final void g(int param0) {
        super.g(param0);
        ((tl) this).field_s.a((byte) 48, ((tl) this).h((byte) 119));
    }

    final void a(mg param0, byte param1) {
        if (param1 >= -60) {
            return;
        }
        try {
            ((tl) this).field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tl.L(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param1 >= pka.field_b) {
          if (ss.field_c >= param3) {
            if (gca.field_d <= param2) {
              if (param4 > hc.field_h) {
                pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
                return;
              } else {
                rga.a(param5, 107, param6, param1, param2, param7, param3, param4);
                return;
              }
            } else {
              pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
              return;
            }
          } else {
            pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
            return;
          }
        } else {
          pra.a(param1, param7, param5, 99, param3, param4, param2, param6);
          return;
        }
    }

    public final int b(int param0) {
        int var2 = -99 % ((-46 - param0) / 45);
        return ((tl) this).field_o.a(false);
    }

    tl(la param0, boolean param1) {
        super(param0, param1);
        try {
            ((tl) this).field_s = new jma(15);
            ((tl) this).field_o = new mg();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final jma k(byte param0) {
        if (param0 >= -67) {
            return null;
        }
        return ((tl) this).field_s;
    }

    final int a(boolean param0) {
        if (param0) {
            ((tl) this).field_s = null;
            return 21;
        }
        return 21;
    }

    public static void l() {
        field_n = null;
        field_p = null;
        field_q = null;
    }

    public final int j(byte param0) {
        if (param0 != -108) {
          field_p = null;
          return ((tl) this).field_o.a(false) - ((tl) this).field_o.b(12);
        } else {
          return ((tl) this).field_o.a(false) - ((tl) this).field_o.b(12);
        }
    }

    public final int g(byte param0) {
        if (param0 != -108) {
            return 116;
        }
        return 16711782;
    }

    tl(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            ((tl) this).field_s = new jma(15, param0, param1);
            ((tl) this).field_o = new mg(param0.field_E, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void k(int param0) {
        if (param0 == 5418) {
          if (((tl) this).field_s.f((byte) -56)) {
            ((tl) this).c(false);
            ((tl) this).field_o.d(0);
            ((tl) this).field_s.a((byte) -14, ((tl) this).field_o.c(0));
            return;
          } else {
            ((tl) this).field_o.d(0);
            ((tl) this).field_s.a((byte) -14, ((tl) this).field_o.c(0));
            return;
          }
        } else {
          int discarded$1 = ((tl) this).b(27);
          if (!((tl) this).field_s.f((byte) -56)) {
            ((tl) this).field_o.d(0);
            ((tl) this).field_s.a((byte) -14, ((tl) this).field_o.c(0));
            return;
          } else {
            ((tl) this).c(false);
            ((tl) this).field_o.d(0);
            ((tl) this).field_s.a((byte) -14, ((tl) this).field_o.c(0));
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
