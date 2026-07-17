/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uka extends ra {
    static jea field_M;

    final boolean C(int param0) {
        if (param0 != 1760) {
            field_M = null;
            return true;
        }
        return true;
    }

    final static void b(int param0, int param1, boolean param2) {
        mu var3 = null;
        lja var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        if (param1 >= -76) {
          L0: {
            var7 = null;
            iu[] discarded$1 = uka.a((cn) null, (String) null, -33, (String) null);
            var3 = vna.a(param2, param0, -117);
            if (var3 == null) {
              break L0;
            } else {
              hka.field_b.a((byte) -22, false);
              var4 = hka.field_b;
              var5_ref_String = ai.field_d;
              var4.field_f.a((byte) -101, 5, var5_ref_String);
              var4 = hka.field_b;
              var5 = jm.field_m;
              var6 = lba.field_p;
              var4.field_f.b(var6, 0, -100, 0, var5);
              break L0;
            }
          }
          iea.a(param2, (byte) -56, param0);
          return;
        } else {
          L1: {
            var3 = vna.a(param2, param0, -117);
            if (var3 == null) {
              break L1;
            } else {
              hka.field_b.a((byte) -22, false);
              var4 = hka.field_b;
              var5_ref_String = ai.field_d;
              var4.field_f.a((byte) -101, 5, var5_ref_String);
              var4 = hka.field_b;
              var5 = jm.field_m;
              var6 = lba.field_p;
              var4.field_f.b(var6, 0, -100, 0, var5);
              break L1;
            }
          }
          iea.a(param2, (byte) -56, param0);
          return;
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "uka.V(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static iu[] a(cn param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        iu[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        iu[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param0.b(param1, -7768);
              if (param2 == 5) {
                break L1;
              } else {
                field_M = null;
                break L1;
              }
            }
            var5 = param0.a(true, param3, var4_int);
            stackOut_2_0 = rj.a(param0, var5, var4_int, (byte) -82);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("uka.BC(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            field_M = null;
            return true;
        }
        return true;
    }

    final static void s(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) wna.field_n;
        synchronized (var1) {
          L0: {
            L1: {
              if (param0 == -44) {
                break L1;
              } else {
                uka.t((byte) 73);
                break L1;
              }
            }
            tu.field_h = tu.field_h + 1;
            ksa.field_p = tka.field_n;
            jba.field_j = ena.field_n;
            sta.field_B = ee.field_a;
            qma.field_c = lja.field_c;
            lja.field_c = false;
            hf.field_b = at.field_X;
            jm.field_m = cr.field_d;
            lba.field_p = ria.field_m;
            at.field_X = 0;
            break L0;
          }
        }
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        fra var5 = null;
        up var6 = null;
        eq var7 = null;
        ro var8 = null;
        mfa var9 = null;
        fu var10 = null;
        fsa var11 = null;
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
            var11 = new fsa(param2, param0);
            var11.b((byte) -11, ((uka) this).field_k, ((uka) this).field_l);
            var11.h(param1, 0);
            var11.a(3, (byte) -12, true);
            var11.a((byte) -3, 10);
            var11.b((byte) 17, false);
            var11.g(108, 2);
            var11.l(2, 146366800);
            var5 = new fra(param2, param0);
            var6 = new up(0, 10);
            var6.b(1, 14);
            var5.a(true, var6);
            var11.a((byte) 83, (nv) (Object) var5);
            var7 = new eq(param2, param0);
            var11.a((byte) 83, (nv) (Object) var7);
            var8 = ((uka) this).a((byte) -30, param2, param0);
            var11.a((wda) (Object) var8, 0);
            var9 = rm.field_a;
            var10 = (fu) (Object) var9.a(8, param1 ^ 76);
            var10.a(false, 0);
            var11.a((gr) (Object) var5, (byte) 124, (dg) (Object) var10);
            stackOut_0_0 = (fsa) var11;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("uka.AC(").append(param0).append(44).append(param1).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_M = null;
            return false;
        }
        return false;
    }

    public static void t(byte param0) {
        if (param0 <= 60) {
            field_M = null;
            field_M = null;
            return;
        }
        field_M = null;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            field_M = null;
            return false;
        }
        return false;
    }

    uka(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    uka(la param0, int param1) {
        super(param0, param1);
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return true;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            uka.s((byte) -23);
            return 7;
        }
        return 7;
    }

    final void q(byte param0) {
        super.q(param0);
        ((uka) this).b(-110, 4194304, 4194304);
    }

    final boolean A(int param0) {
        int var2 = -18 / (param0 / 60);
        return true;
    }

    static {
    }
}
