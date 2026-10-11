/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uka extends ra {
    static jea field_M;

    final boolean C(int param0) {
        if (param0 != 1760) {
          field_M = (jea) null;
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
        mu var3Lifetime1;
        lja var4Lifetime1;
        String var5_ref_StringLifetime1;
        lja var4Lifetime2;
        lja var4Lifetime1Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param1 < -76) {
          var3 = vna.a(param2, param0, -117);
          if (var3 != null) {
            hka.field_b.a((byte) -22, false);
            var4 = hka.field_b;
            var5_ref_String = ai.field_d;
            var4.field_f.a((byte) -101, 5, var5_ref_String);
            var4Lifetime2 = hka.field_b;
            var5 = jm.field_m;
            var6 = lba.field_p;
            var4Lifetime2.field_f.b(var6, 0, -100, 0, var5);
          }
          iea.a(param2, (byte) -56, param0);
          return;
        }
        String var7 = (String) null;
        uka.a((cn) null, (String) null, -33, (String) null);
        var3Lifetime1 = vna.a(param2, param0, -117);
        if (var3Lifetime1 != null) {
          hka.field_b.a((byte) -22, false);
          var4Lifetime1 = hka.field_b;
          var5_ref_StringLifetime1 = ai.field_d;
          var4Lifetime1.field_f.a((byte) -101, 5, var5_ref_StringLifetime1);
          var4Lifetime1Lifetime1 = hka.field_b;
          var5Lifetime1 = jm.field_m;
          var6Lifetime1 = lba.field_p;
          var4Lifetime1Lifetime1.field_f.b(var6Lifetime1, 0, -100, 0, var5Lifetime1);
        }
        iea.a(param2, (byte) -56, param0);
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uka.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static iu[] a(cn param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        iu[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.b(param1, -7768);
          if (param2 != 5) {
            field_M = (jea) null;
          }
          var5 = param0.a(true, param3, var4_int);
          stackIn_3_0 = rj.a(param0, var5, var4_int, (byte) -82);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("uka.BC(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
          field_M = (jea) null;
          return true;
        }
        return true;
    }

    final static void s(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = wna.field_n;
        synchronized (var1) {
          if (param0 != -44) {
            uka.t((byte) 73);
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11 = new fsa(param2, param0);
          var11.b((byte) -11, this.field_k, this.field_l);
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
          var11.a((byte) 83, (nv) (var5));
          var7 = new eq(param2, param0);
          var11.a((byte) 83, (nv) (var7));
          var8 = this.a((byte) -30, param2, param0);
          var11.a(var8, 0);
          var9 = rm.field_a;
          var10 = (fu) (var9.a(8, param1 ^ 76));
          var10.a(false, 0);
          var11.a(var5, (byte) 124, var10);
          stackIn_1_0 = var11;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("uka.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
          field_M = (jea) null;
          return false;
        }
        return false;
    }

    public static void t(byte param0) {
        if (param0 <= 60) {
          field_M = (jea) null;
          field_M = null;
          return;
        }
        field_M = null;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
          field_M = (jea) null;
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
        this.b(-110, 4194304, 4194304);
    }

    final boolean A(int param0) {
        int var2 = -18 / ((param0 - 0) / 60);
        return true;
    }

    static {
    }
}
