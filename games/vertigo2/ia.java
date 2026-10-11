/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends rk {
    static String field_I;
    static String field_H;
    ed field_J;
    byte field_B;
    static String field_E;
    static int field_G;
    int field_F;
    static int field_C;

    final int i(int param0) {
        if (this.field_J == null) {
          return 0;
        }
        if (param0 <= 100) {
          this.a((byte) -73);
        }
        return 100 * this.field_J.field_u / (-this.field_B + this.field_J.field_p.length);
    }

    final byte[] a(byte param0) {
        if (param0 != -106) {
          bs var3 = (bs) null;
          ia.a((byte) -71, (bs) null);
        }
        if (this.field_z ||
          this.field_J.field_p.length - this.field_B > this.field_J.field_u) {
          throw new RuntimeException();
        }
        return this.field_J.field_p;
    }

    final static String a(int param0, int param1, String param2) {
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        mi var5 = null;
        CharSequence var6 = null;
        try {
          var6 = (CharSequence) ((Object) param2);
          if (!hi.a((byte) 118, var6)) {
            stackIn_2_0 = or.field_a;
            return stackIn_2_0;
          }
          if (ba.field_d != 2) {
            stackIn_6_0 = ce.field_d;
            return stackIn_6_0;
          }
          if (wc.a(param2, true)) {
            stackIn_10_0 = Vertigo2.field_K;
            return stackIn_10_0;
          }
          if (c.a(param2, (byte) -108)) {
            stackIn_13_0 = Vertigo2.a(new String[]{param2}, nh.field_n, 4);
            return stackIn_13_0;
          }
          if (sq.field_b >= 100 &&
            0 >= q.field_y) {
            stackIn_17_0 = wh.field_B;
            return stackIn_17_0;
          }
          if (200 <= sq.field_b) {
            stackIn_20_0 = wh.field_B;
            return stackIn_20_0;
          }
          if (iq.b(param2, 101)) {
            stackIn_24_0 = Vertigo2.a(new String[]{param2}, p.field_a, 6);
            return stackIn_24_0;
          }
          var5 = uh.field_Wb;
          var5.j(param1, 127);
          if (param0 > -38) {
            stackIn_27_0 = (String) null;
            return stackIn_27_0;
          }
          var5.field_u = var5.field_u + 1;
          var4 = var5.field_u;
          var5.f(0, 127);
          var5.a((byte) 0, param2);
          var5.b((byte) 66, -var4 + var5.field_u);
          stackIn_29_0 = null;
          return (String) (stackIn_29_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("ia.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final static void a(byte param0, bs param1) {
        bs var2 = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 77) {
            field_I = (String) null;
          }
          param1.c(param0 - 75);
          var2 = (bs) (mk.field_J.a((byte) 100));
          while (var2 != null) {
            if (var2.a(param1, false)) {
              var2 = (bs) (mk.field_J.b(param0 - 34));
              continue;
            }
            break;
          }
          if (var2 == null) {
            mk.field_J.a(param1, false);
          } else {
            jn.a(param1, var2, 18724);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("ia.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(fc param0, byte param1, fc param2, int param3, int param4, int param5, int param6, int param7, int param8, fc param9) {
        byte fieldTemp$0 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_90_2 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_93_2 = null;
        RuntimeException decompiledCaughtException = null;
        fc var10 = null;
        int var10_int = 0;
        RuntimeException var10_ref = null;
        int var11 = 0;
        fc var10Lifetime1;
        fc var10Lifetime2;
        fc var10Lifetime3;
        fc var10Lifetime4;
        int var10_intLifetime1;
        int var10_intLifetime2;
        int var10_intLifetime3;
        int var10_intLifetime4;
        int var10_intLifetime5;
        int var10_intLifetime1Lifetime1;
        int var10_intLifetime2Lifetime1;
        int var10_intLifetime3Lifetime1;
        int var10_intLifetime4Lifetime1;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          da.field_k = param0.field_E;
          hm.field_C = param0.field_u;
          or.field_e = param0.field_i;
          pd.field_a = param0.field_D;
          kc.field_e = param0.field_X;
          ga.field_hb = param9.field_C;
          qp.field_g = param0.field_N;
          vm.field_a = param0.field_o;
          sa.field_c = param0.field_A;
          hn.field_s = param9.field_X;
          vf.field_y = param9.field_i;
          jr.field_f = param9.field_bb;
          rn.field_z = param9.field_A;
          ln.field_g = param9.field_D;
          al.field_s = param0.field_a;
          vp.field_d = param0.field_bb;
          tf.field_p = param9.field_a;
          kh.field_c = param0.field_k;
          vj.field_f = param9.field_u;
          b.field_m = param9.field_o;
          lf.field_z = param9.field_k;
          hk.field_q = param0.field_C;
          cg.field_e = param9.field_E;
          ga.field_jb = param9.field_N;
          nq.a(param2.field_w, param2.field_C, param6, param2.field_u, param2.field_N, (byte[]) null, param2.field_A, param2.field_bb, param2.field_D, param2.field_i, param2.field_X, param2.field_L, param2.field_E, param4, param2.field_T, param8, param7, param2.field_k, param2.field_o, -92, (lg) null, param5, param3, param2.field_a);
          param0.field_u = hm.field_C;
          param0.field_X = kc.field_e;
          param0.field_E = da.field_k;
          param0.field_L = br.field_T;
          param0.field_N = qp.field_g;
          param0.field_w = eb.field_b;
          param0.field_T = jd.field_d;
          param0.field_C = hk.field_q;
          param0.field_W = wc.field_n;
          param0.field_i = or.field_e;
          param0.field_A = sa.field_c;
          param0.field_bb = vp.field_d;
          param0.field_D = pd.field_a;
          param0.field_a = al.field_s;
          param0.field_o = vm.field_a;
          param0.field_k = kh.field_c;
          if (param1 >= -19) {
            return;
          }
          param9.field_X = hn.field_s;
          param9.field_C = ga.field_hb;
          param9.field_bb = jr.field_f;
          param9.field_A = rn.field_z;
          param9.field_o = b.field_m;
          param9.field_u = vj.field_f;
          param9.field_D = ln.field_g;
          param9.field_N = ga.field_jb;
          param9.field_k = lf.field_z;
          param9.field_i = vf.field_y;
          param9.field_L = qn.field_u;
          param9.field_T = no.field_b;
          param9.field_W = vo.field_x;
          param9.field_w = rm.field_y;
          param9.field_E = cg.field_e;
          param9.field_a = tf.field_p;
          if (param2.field_H != null) {
            if (param0.field_H == null ||
              !(param0.field_H.length >= param0.field_w)) {
              param0.field_H = new byte[param0.field_w + 100];
            }
            if (null == param9.field_H ||
              !(param9.field_H.length >= param9.field_w)) {
              param9.field_H = new byte[param9.field_w + 100];
            }
            for (var10_int = 0; var10_int < param0.field_w; var10_int++) {
              param0.field_H[var10_int] = param2.field_H[ba.field_e[var10_int]];
            }
            for (var10_intLifetime5 = 0; param9.field_w > var10_intLifetime5; var10_intLifetime5++) {
              param9.field_H[var10_intLifetime5] = param2.field_H[la.field_d[var10_intLifetime5]];
            }
          } else {
            var10 = param0;
            param9.field_H = null;
            fieldTemp$0 = param2.field_M;
            param9.field_M = param2.field_M;
            param0.field_M = fieldTemp$0;
            var10.field_H = null;
          }
          if (null != param2.field_R) {
            if (param0.field_R == null ||
              !(param0.field_R.length >= param0.field_w)) {
              param0.field_R = new byte[100 + param0.field_w];
            }
            if (null == param9.field_R ||
              !(param9.field_R.length >= param9.field_w)) {
              param9.field_R = new byte[100 + param9.field_w];
            }
            for (var10_intLifetime1 = 0; param0.field_w > var10_intLifetime1; var10_intLifetime1++) {
              param0.field_R[var10_intLifetime1] = param2.field_R[ba.field_e[var10_intLifetime1]];
            }
            for (var10_intLifetime1Lifetime1 = 0; var10_intLifetime1Lifetime1 < param9.field_w; var10_intLifetime1Lifetime1++) {
              param9.field_R[var10_intLifetime1Lifetime1] = param2.field_R[la.field_d[var10_intLifetime1Lifetime1]];
            }
          } else {
            param9.field_R = null;
            var10Lifetime1 = param0;
            var10Lifetime1.field_R = null;
          }
          if (null != param2.field_eb) {
            if (null == param0.field_eb ||
              !(param0.field_eb.length >= param0.field_w)) {
              param0.field_eb = new byte[100 + param0.field_w];
            }
            if (null == param9.field_eb ||
              !(param9.field_w <= param9.field_eb.length)) {
              param9.field_eb = new byte[100 + param9.field_w];
            }
            for (var10_intLifetime2 = 0; var10_intLifetime2 < param0.field_w; var10_intLifetime2++) {
              param0.field_eb[var10_intLifetime2] = param2.field_eb[ba.field_e[var10_intLifetime2]];
            }
            for (var10_intLifetime2Lifetime1 = 0; var10_intLifetime2Lifetime1 < param9.field_w; var10_intLifetime2Lifetime1++) {
              param9.field_eb[var10_intLifetime2Lifetime1] = param2.field_eb[la.field_d[var10_intLifetime2Lifetime1]];
            }
          } else {
            var10Lifetime2 = param0;
            param9.field_eb = null;
            var10Lifetime2.field_eb = null;
          }
          if (null != param2.field_F) {
            if (param0.field_F == null ||
              !(param0.field_F.length >= param0.field_w)) {
              param0.field_F = new short[100 + param0.field_w];
            }
            if (null == param9.field_F ||
              !(param9.field_w <= param9.field_F.length)) {
              param9.field_F = new short[param9.field_w + 100];
            }
            for (var10_intLifetime3 = 0; param0.field_w > var10_intLifetime3; var10_intLifetime3++) {
              param0.field_F[var10_intLifetime3] = param2.field_F[ba.field_e[var10_intLifetime3]];
            }
            for (var10_intLifetime3Lifetime1 = 0; var10_intLifetime3Lifetime1 < param9.field_w; var10_intLifetime3Lifetime1++) {
              param9.field_F[var10_intLifetime3Lifetime1] = param2.field_F[la.field_d[var10_intLifetime3Lifetime1]];
            }
          } else {
            param9.field_F = null;
            var10Lifetime3 = param0;
            var10Lifetime3.field_F = null;
          }
          if (param2.field_d != null) {
            if (param0.field_d == null ||
              !(param0.field_w <= param0.field_d.length)) {
              param0.field_d = new short[param0.field_w + 100];
            }
            if (param9.field_d == null ||
              !(param9.field_d.length >= param9.field_w)) {
              param9.field_d = new short[param9.field_w + 100];
            }
            for (var10_intLifetime4 = 0; var10_intLifetime4 < param0.field_w; var10_intLifetime4++) {
              param0.field_d[var10_intLifetime4] = param2.field_d[ba.field_e[var10_intLifetime4]];
            }
            for (var10_intLifetime4Lifetime1 = 0; param9.field_w > var10_intLifetime4Lifetime1; var10_intLifetime4Lifetime1++) {
              param9.field_d[var10_intLifetime4Lifetime1] = param2.field_d[la.field_d[var10_intLifetime4Lifetime1]];
            }
            return;
          }
          var10Lifetime4 = param0;
          param9.field_d = null;
          var10Lifetime4.field_d = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_86_0 = var10_ref;
          stackIn_86_1 = new StringBuilder().append("ia.C(");
          if (param0 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          stackIn_89_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_90_2 = "null";
          } else {
            stackIn_90_2 = "{...}";
          }
          stackIn_92_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_86_0), ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_I = null;
        if (param0 != -20657) {
          field_C = -5;
        }
        field_H = null;
        field_E = null;
    }

    ia() {
    }

    static {
        field_I = "You finished the last level! Well done!";
        field_H = "Please select options in the following rows:  ";
        field_E = "You cannot join this game - it is in progress";
        field_C = 53;
    }
}
