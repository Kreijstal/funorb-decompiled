/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tp extends ge {
    static String field_L;
    static String field_J;
    static nh field_K;

    final static la a(int param0, boolean param1, dt param2, int param3, byte param4) {
        boolean discarded$2 = false;
        Object var5 = null;
        g var5_ref = null;
        RuntimeException var5_ref2 = null;
        la stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        la stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param4 <= -120) {
                break L1;
              } else {
                discarded$2 = tp.a(106, (byte) 37, 71);
                break L1;
              }
            }
            var5 = null;
            var5_ref = kq.a(95, param0);
            stackOut_2_0 = gba.a(param3, param1, var5_ref, 21789, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5_ref2);
            stackOut_4_1 = new StringBuilder().append("tp.WB(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            field_K = (nh) null;
            return false;
        }
        return false;
    }

    final boolean C(int param0) {
        boolean discarded$0 = false;
        if (param0 != 128) {
            discarded$0 = this.B(18);
            return true;
        }
        return true;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            this.q((byte) -23);
            return false;
        }
        return false;
    }

    tp(la param0, int param1) {
        super(param0, param1);
    }

    final static boolean a(int param0, byte param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 == 3) {
          L0: {
            if ((458752 & param2) == 0) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          if (stackIn_5_0 == 0 | ir.a(param2, param0, (byte) -94)) {
            if (uu.a(true, param2, param0)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            return stackIn_8_0 != 0;
          }
        } else {
          return true;
        }
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
              L2: {
                if (var7_int >= param4) {
                  if (param1 == -85) {
                    break L2;
                  } else {
                    field_L = (String) null;
                    return;
                  }
                } else {
                  ra.a(param6 + -(2 * var7_int), param3, param2 + var7_int, -(var7_int * 2) + param5, false, var7_int + param0);
                  var7_int++;
                  if (var8 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var7), "tp.GC(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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
        this.b(-88, 2097152, 2097152);
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tp.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void t(byte param0) {
        field_J = null;
        int var1 = 95 % ((param0 - -24) / 54);
        field_K = null;
        field_L = null;
    }

    final boolean A(int param0) {
        if (param0 != -1) {
            field_L = (String) null;
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
            var4.b((byte) -11, this.field_k, this.field_l);
            var4.h(param1, 0);
            var4.a((byte) 83, (nv) (new eq(param2, param0)));
            var5 = new ov(param2, param0);
            var5.a(new up(6, 10), true);
            this.a((byte) 43, var5, param2);
            var4.a((byte) 83, (nv) (var5));
            var6 = rm.field_a;
            var7 = (boa) ((Object) var6.a(7, param1 ^ 77));
            var7.b(113, 15);
            var4.a(var5, (byte) 124, var7);
            stackOut_0_0 = (fsa) (var4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4_ref);
            stackOut_2_1 = new StringBuilder().append("tp.AC(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    tp(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    static {
        field_J = "Press <img=7> or <img=5> to change view";
        field_L = "This game option is not available in rated games.";
    }
}
