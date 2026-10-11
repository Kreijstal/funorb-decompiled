/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends qs {
    static StringBuilder field_E;
    int field_J;
    static String field_F;
    static java.awt.Frame field_K;
    static int field_I;
    static qr field_A;
    static String[] field_B;
    static String field_G;
    static qr field_C;

    public cg() {
        super(0, 0, 0, 0, (iq) null, (ko) null);
        this.field_J = 256;
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -41) {
            field_B = (String[]) null;
          }
          if (param1 != null &&
            param1.length() >= np.field_o &&
            param1.length() <= oq.field_c) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("cg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        bi var6 = null;
        if (0 != param0) {
          return;
        }
        if (this.field_z == null) {
          return;
        }
        if (this.field_J == 0) {
          return;
        }
        if (this.field_J != 256) {
          var6 = new bi(this.field_z.field_x, this.field_z.field_n);
          aq.a((byte) 114, var6);
          this.field_z.a(param0, param1, 0, 0);
          ln.f((byte) -78);
          var6.a(param3 + this.field_m, param2 + this.field_q, this.field_J);
          return;
        }
        this.field_z.a(param0, -11857, param2 + this.field_q, param3 + this.field_m);
    }

    final static bi[] a(int param0, bi param1) {
        bi[] var2 = null;
        RuntimeException var2_ref = null;
        aa var3 = null;
        bi[] var4 = null;
        bi[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -15338) {
            var3 = (aa) null;
            cg.a((String) null, false, (String) null, -21, (String) null, (aa) null, -88);
          }
          var4 = new bi[9];
          var2 = var4;
          var4[4] = param1;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("cg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean a(String param0, boolean param1, String param2, int param3, String param4, aa param5, int param6) {
        RuntimeException var7 = null;
        oj var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 != -13037) {
            return false;
          }
          if (oj.field_Fb != ee.field_l) {
            return false;
          }
          var8 = new oj(le.field_e, param5);
          le.field_e.a(true, var8);
          if (go.j(0)) {
            var8.f(false);
            return true;
          }
          ee.field_l = ue.field_a;
          np.field_m = param1;
          aa.field_G = param4;
          um.field_j = param2;
          wh.field_c = null;
          ae.field_g = param0;
          jm.field_t = param3;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_17_0 = var7;
          stackIn_17_1 = new StringBuilder().append("cg.F(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param5 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void i(int param0) {
        ra.field_k = ra.field_k - 1;
        gf.a(bc.field_c[ra.field_k], oj.field_Cb[ra.field_k], vp.field_s[ra.field_k]);
        gf.field_i = cb.field_f[ra.field_k];
        if (param0 == 0) {
          gf.field_l = dk.field_b[ra.field_k];
          gf.field_a = bf.field_c[ra.field_k];
          gf.field_f = da.field_d[ra.field_k];
          return;
        }
        field_A = (qr) null;
        gf.field_l = dk.field_b[ra.field_k];
        gf.field_a = bf.field_c[ra.field_k];
        gf.field_f = da.field_d[ra.field_k];
    }

    final static ib e(boolean param0) {
        try {
          Throwable var1 = null;
          ib stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          if (!param0) {
            field_E = (StringBuilder) null;
          }
          try {
            stackIn_3_0 = (ib) (Class.forName("rb").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void j(int param0) {
        field_B = null;
        field_E = null;
        field_F = null;
        field_C = null;
        field_A = null;
        if (param0 >= 104) {
          field_K = null;
          field_G = null;
          return;
        }
        aa var2 = (aa) null;
        cg.a((String) null, false, (String) null, 41, (String) null, (aa) null, 17);
        field_K = null;
        field_G = null;
    }

    cg(vg param0) {
        super(param0.field_m, param0.field_q, param0.field_x, param0.field_n, (iq) null, (ko) null);
        try {
          param0.a(0, this.field_n, (byte) 120, 0, this.field_x);
          this.field_z = param0;
          this.field_J = 256;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "cg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_E = new StringBuilder(80);
        field_F = null;
        field_I = 0;
        field_B = new String[]{"Perhaps you could consider...", "...adding game-specific benefits...", "...to ShatteredPlansText.text_benefits."};
        field_G = "Asking for or providing contact information";
    }
}
