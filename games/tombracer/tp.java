/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tp extends ge {
    static String field_L;
    static String field_J;
    static nh field_K;

    final static la a(int param0, boolean param1, dt param2, int param3) {
        Object var5 = null;
        g var5_ref = null;
        RuntimeException var5_ref2 = null;
        la stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        la stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var5 = null;
            var5_ref = kq.a(95, param0);
            stackOut_0_0 = gba.a(param3, param1, var5_ref, 21789, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref2;
            stackOut_2_1 = new StringBuilder().append("tp.WB(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param3 + ',' + -125 + ')');
        }
        return stackIn_1_0;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            field_K = null;
            return false;
        }
        return false;
    }

    final boolean C(int param0) {
        if (param0 != 128) {
            boolean discarded$0 = ((tp) this).B(18);
            return true;
        }
        return true;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            ((tp) this).q((byte) -23);
        }
        return false;
    }

    tp(la param0, int param1) {
        super(param0, param1);
    }

    final static boolean a(int param0, byte param1, int param2) {
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if ((458752 & param2) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          L2: {
            if (stackIn_3_0 != 0 | ir.a(param2, param0, (byte) -94)) {
              break L2;
            } else {
              if (!uu.a(true, param2, param0)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return true;
        }
        return true;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var7_int = 0;
            L1: while (true) {
              if (var7_int >= 2) {
                break L0;
              } else {
                ra.a(param6 + -(2 * var7_int), 5242880, param2 + var7_int, -(var7_int * 2) + param5, false, var7_int + param0);
                var7_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var7, "tp.GC(" + param0 + ',' + -85 + ',' + param2 + ',' + 5242880 + ',' + 2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
            return -57;
        }
        return 7;
    }

    final void q(byte param0) {
        super.q(param0);
        ((tp) this).b(-88, 2097152, 2097152);
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tp.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void t() {
        field_J = null;
        int var1 = 0;
        field_K = null;
        field_L = null;
    }

    final boolean A(int param0) {
        if (param0 != -1) {
            field_L = null;
            return true;
        }
        return true;
    }

    final boolean B(int param0) {
        if (param0 != -23309) {
            return true;
        }
        return true;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        ov var5 = null;
        mfa var6 = null;
        boa var7 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = new fsa(param2, param0);
            var4.b((byte) -11, ((tp) this).field_k, ((tp) this).field_l);
            var4.h(param1, 0);
            var4.a((byte) 83, (nv) (Object) new eq(param2, param0));
            var5 = new ov(param2, param0);
            var5.a(new up(6, 10), true);
            ((tp) this).a((byte) 43, (mra) (Object) var5, param2);
            var4.a((byte) 83, (nv) (Object) var5);
            var6 = rm.field_a;
            var7 = (boa) (Object) var6.a(7, param1 ^ 77);
            var7.b(113, 15);
            var4.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
            stackOut_0_0 = (fsa) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("tp.AC(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    tp(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Press <img=7> or <img=5> to change view";
        field_L = "This game option is not available in rated games.";
    }
}
