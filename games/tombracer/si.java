/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends kna {
    static String[] field_F;

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        eq var9 = null;
        cu var10 = null;
        kpa var11 = null;
        mfa var12 = null;
        boa var13 = null;
        int var14 = 0;
        fsa var15 = null;
        fsa stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var15 = new fsa(param2, param0);
              var15.b((byte) -11, ((si) this).field_k, ((si) this).field_l);
              if (((si) this).field_m == 49) {
                var7 = 10;
                var5 = 8;
                var8 = 50;
                var6 = 50;
                break L1;
              } else {
                L2: {
                  if (((si) this).field_m == 0) {
                    var6 = 25;
                    var7 = 0;
                    var8 = 50;
                    break L2;
                  } else {
                    var8 = 1;
                    var6 = 5;
                    var7 = 1;
                    break L2;
                  }
                }
                var5 = 4;
                break L1;
              }
            }
            var15.a((byte) -3, var5);
            var15.h(param1, 0);
            var15.e(true, param1 + 119);
            var15.g(param1 + 97, 1);
            var15.b((byte) 17, false);
            var15.a(1, (byte) -12, true);
            var9 = new eq(param2, param0);
            var15.a((byte) 83, (nv) (Object) var9);
            var15.d(var6, -1);
            var10 = new cu(param2, param0);
            var10.b(1, var8, param1 + -3);
            var11 = var10.j((byte) -106);
            var11.a(false, 67);
            var11.a(0, -17075, true);
            var15.a((byte) 83, (nv) (Object) var10);
            var12 = rm.field_a;
            var13 = (boa) (Object) var12.a(7, 92);
            var13.b(107, var7);
            var15.a((gr) null, (byte) 124, (dg) (Object) var13);
            stackOut_7_0 = (fsa) var15;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("si.AC(").append(param0).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            boolean discarded$0 = ((si) this).v(16);
            return false;
        }
        return false;
    }

    public static void B() {
        field_F = null;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            ((si) this).q((byte) 98);
            return false;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "si.V(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            fsa discarded$0 = ((si) this).a(false, -29, (la) null);
            return false;
        }
        return false;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            field_F = null;
            return false;
        }
        return false;
    }

    si(la param0, int param1) {
        super(param0, param1);
    }

    final static int A(int param0) {
        if (param0 > 12) {
          uja.field_a.a(-121);
          if (!wg.field_l.c(81)) {
            return qda.b((byte) -66);
          } else {
            return 0;
          }
        } else {
          int discarded$6 = si.A(-47);
          uja.field_a.a(-121);
          if (!wg.field_l.c(81)) {
            return qda.b((byte) -66);
          } else {
            return 0;
          }
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
            ((si) this).q((byte) 57);
            return 7;
        }
        return 7;
    }

    si(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final static int a(int param0, int param1, int param2, boolean param3) {
        return rl.r(-95);
    }

    final void q(byte param0) {
        super.q(param0);
        if (((si) this).field_m == 49) {
          ((si) this).b(param0 ^ -82, 4194304, 4194304);
          return;
        } else {
          ((si) this).b(-78, 2097152, 2097152);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new String[]{"<%0> reset", "<%0> tried again", "<%0> lost the will to carry on", "<%0> goofed", "<%0> decided they were trapped", "<%0> had a rethink", "<%0> restarted the room", "<%0> realised that failure was inevitable", "<%0>'s lack of concentration got them into trouble"};
    }
}
