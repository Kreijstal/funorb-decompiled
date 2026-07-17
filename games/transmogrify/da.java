/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da extends fi {
    static String field_B;
    private qj field_D;
    static String field_A;
    static String field_z;
    static int field_C;
    static int field_y;

    public static void i(int param0) {
        field_z = null;
        if (param0 != 0) {
            return;
        }
        field_A = null;
        field_B = null;
    }

    final static void a(boolean param0, byte param1, java.awt.Canvas param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (bi.field_L >= 10) {
                int discarded$45 = 1;
                if (!ki.b()) {
                  sb.c();
                  ub.a(320, 240, (byte) 116);
                  ah.a(0, 0, (byte) 110, param2);
                  break L1;
                } else {
                  if (gl.field_y == 0) {
                    ec.a(false, param0, -124);
                    ah.a(0, 0, (byte) 104, param2);
                    break L1;
                  } else {
                    ng.a(false, param2);
                    break L1;
                  }
                }
              } else {
                L2: {
                  var3_int = 0;
                  if (!kb.field_l) {
                    break L2;
                  } else {
                    kb.field_l = false;
                    var3_int = 1;
                    break L2;
                  }
                }
                int discarded$46 = 71;
                int discarded$47 = 100;
                jk.a(gj.field_a, (byte) -119, be.b(), mh.b(), var3_int != 0);
                break L1;
              }
            }
            L3: {
              if (param1 > 63) {
                break L3;
              } else {
                var5 = null;
                da.a(false, (byte) -103, (java.awt.Canvas) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("da.GA(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    public da() {
        super(0, 0, cd.field_b, wj.field_h, (ui) null, (ma) null);
        ((da) this).field_D = new qj();
    }

    final mk e(byte param0) {
        int var2 = 0;
        tl var3 = null;
        mk var4 = null;
        int var5 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        var2 = -31 % ((param0 - -59) / 47);
        var3 = new tl(((da) this).field_D);
        var4 = (mk) (Object) var3.c(-101);
        L0: while (true) {
          if (var4 != null) {
            if (var4.field_A) {
              return var4;
            } else {
              var4 = (mk) (Object) var3.a(405142401);
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void k(int param0) {
        int var4 = Transmogrify.field_A ? 1 : 0;
        tl var2 = new tl(((da) this).field_D);
        if (param0 != 31410) {
            field_B = null;
        }
        mk var3 = (mk) (Object) var2.c(-121);
        while (var3 != null) {
            var3.field_A = false;
            var3 = (mk) (Object) var2.a(param0 ^ 405111091);
        }
        ((da) this).field_v = null;
    }

    final qg d(byte param0) {
        tl var2 = null;
        mk var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        var2 = new tl(((da) this).field_D);
        var4 = 71 % ((51 - param0) / 48);
        var3 = (mk) (Object) var2.c(-116);
        L0: while (true) {
          if (var3 != null) {
            if (!var3.field_A) {
              var3 = (mk) (Object) var2.a(405142401);
              continue L0;
            } else {
              return var3.i(-116);
            }
          } else {
            return null;
          }
        }
    }

    final void l(int param0) {
        int var4 = Transmogrify.field_A ? 1 : 0;
        tl var2 = new tl(((da) this).field_D);
        mk var3 = (mk) (Object) var2.c(-116);
        if (param0 != 0) {
            field_A = null;
        }
        while (var3 != null) {
            if (var3.m(0)) {
                var3.c(param0 ^ 5);
            }
            var3 = (mk) (Object) var2.a(param0 ^ 405142401);
        }
        ((da) this).field_v = (qg) (Object) ((da) this).e((byte) -107);
    }

    final static String a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
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
            stackOut_0_0 = tg.a(-54, false, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("da.D(").append(1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var8 = Transmogrify.field_A ? 1 : 0;
        if (((da) this).field_q != null) {
            ((da) this).field_q.a(param0, param1, true, (byte) 126, (qg) this);
        }
        tl var5 = new tl(((da) this).field_D);
        qg var6 = (qg) (Object) var5.a((byte) 62);
        int var7 = -24 % ((param3 - 77) / 34);
        while (var6 != null) {
            var6.a(param0 - -((da) this).field_p, ((da) this).field_n + param1, param2, (byte) -95);
            var6 = (qg) (Object) var5.b(-29339);
        }
    }

    final void j(int param0) {
        int var4 = Transmogrify.field_A ? 1 : 0;
        if (param0 <= 124) {
            field_y = -112;
        }
        tl var2 = new tl(((da) this).field_D);
        mk var3 = (mk) (Object) var2.c(-120);
        while (var3 != null) {
            if (!(!var3.a((byte) -97))) {
                var3.c(5);
            }
            var3 = (mk) (Object) var2.a(405142401);
        }
    }

    final void b(qg param0, byte param1) {
        mk var3 = null;
        try {
            if (!(param0 instanceof mk)) {
                throw new IllegalArgumentException();
            }
            var3 = (mk) (Object) param0;
            if (param1 != -71) {
                field_C = 1;
            }
            ((da) this).field_D.a((wf) (Object) var3, (byte) 33);
            var3.field_A = true;
            boolean discarded$0 = var3.a((qg) this, param1 + 51);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "da.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Create";
        field_C = 0;
        field_B = "Log in";
        field_z = "Submit";
        field_y = 0;
    }
}
