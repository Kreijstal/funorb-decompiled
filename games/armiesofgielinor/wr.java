/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wr extends hs implements he {
    static int field_J;
    private no field_M;
    static int field_L;
    private fw field_K;

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) -114, param3);
        if (param2 >= -82) {
            Object var6 = null;
            ((wr) this).a(51, -1, -80, (kb) null);
        }
        gl.field_e.b(mq.field_Nb, param0 - (-((wr) this).field_B + -4), 4 + (param1 + ((wr) this).field_p) - -gl.field_e.field_H, 16777215, -1);
    }

    wr(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (kh) null);
        ((wr) this).field_M = new no((kh) (Object) new lu(10000536), c.field_c, 0, 0, 140, 25);
        ((wr) this).field_M.a((byte) -101, new sb());
        ((wr) this).field_K = new fw(ro.field_kb, (qo) this);
        ((wr) this).field_C = new kb[]{(kb) (Object) ((wr) this).field_M, (kb) (Object) ((wr) this).field_K};
        ((wr) this).field_K.field_k = (kh) (Object) new nu();
        ((wr) this).e(0);
    }

    final void d(byte param0) {
        int var2 = 250;
        if (param0 < 84) {
            ((wr) this).field_M = null;
        }
        ((wr) this).field_M.a(-var2 + ((wr) this).field_l >> 1, 140, -25 + (((wr) this).field_w - -20) >> 1, 8192, 25);
        ((wr) this).field_K.a(10 + ((-var2 + ((wr) this).field_l >> 1) - -140), 100, 2 + (-30 + ((wr) this).field_w + 20 >> 1), 8192, 30);
    }

    final static void a(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        try {
            bw.field_g = true;
            vu.field_Q.field_X = param1;
            var2_int = so.field_b.field_a;
            var3 = so.field_b.field_g;
            var4 = vu.field_Q.field_Z.a(param1, 272, vu.field_Q.field_pb);
            var5 = -(var4 / 2) + var3 / 2 - 103;
            if (param0 < 27) {
                field_J = -20;
            }
            qc.field_c.a(-(var5 * 2) + (-120 + var3), -20500, 320, var5, (var2_int + -320) / 2);
            qc.field_c.field_G = tq.a(11579568, false, qc.field_c.field_ob, 2105376, 3, 8421504);
            vu.field_Q.a(-20 + (qc.field_c.field_ob - 24), -20500, qc.field_c.field_gb + -48, 16, 24);
            td.field_g.a(24, -20500, 80, qc.field_c.field_ob - 44, 120);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "wr.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        if (!(((wr) this).field_M.a(-918933630).a(false) == oo.field_g)) {
            return;
        }
        if (param1 != 11) {
            return;
        }
        try {
            ak.a(((wr) this).field_M.l(param1 ^ 35), ((wr) this).field_M.m(-26458), ((wr) this).field_M.a((byte) -77), 30);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "wr.N(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            if (param0 == 32) {
              break L1;
            } else {
              if (param0 == 40) {
                break L1;
              } else {
                if (param0 != 41) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          stackOut_4_0 = 1;
          stackIn_6_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    final void a(int param0, int param1, int param2, kb param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((wr) this).field_K.field_I = ((wr) this).field_M.a(-918933630).a(false) == oo.field_g ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "wr.P(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(byte param0, aj param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        bv var8 = null;
        bv var9 = null;
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
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var8 = vl.field_n;
            var9 = var8;
            var9.h(32161, param2);
            var9.field_q = var9.field_q + 1;
            var4 = var9.field_q;
            var9.b(1, 1);
            var9.b(true, param1.field_s);
            var9.b(true, param1.field_n);
            var9.b(true, param1.field_q);
            var9.a((byte) -99, param1.field_k);
            var9.a((byte) -92, param1.field_m);
            var9.a((byte) -103, param1.field_o);
            var9.a((byte) -62, param1.field_r);
            var9.b(1, param1.field_l.length);
            var5 = 0;
            L1: while (true) {
              if (var5 >= param1.field_l.length) {
                L2: {
                  if (param0 < -26) {
                    break L2;
                  } else {
                    var7 = null;
                    wr.a((byte) -126, (aj) null, 112);
                    break L2;
                  }
                }
                int discarded$1 = var9.b((byte) -39, var4);
                var9.e(var9.field_q + -var4, 5930);
                break L0;
              } else {
                var8.a((byte) -70, param1.field_l[var5]);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("wr.B(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
    }

    static {
    }
}
