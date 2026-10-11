/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e extends ma implements mj {
    private int[] field_K;
    private lh field_R;
    private fb[] field_S;
    static double field_L;
    static ci field_M;
    private vn field_N;
    private String field_P;
    private int field_Q;
    static int field_O;
    static String field_T;

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = Chess.field_G;
        if (this.field_Q >= param1) {
          return;
        }
        fb[] var7 = new fb[param1];
        fb[] var3 = var7;
        int[] var4 = new int[param1];
        if (param0 == 2116) {
          for (var5 = 0; this.field_Q > var5; var5++) {
            var7[var5] = this.field_S[var5];
            var4[var5] = this.field_K[var5];
          }
          this.field_S = var3;
          this.field_Q = param1;
          this.field_K = var4;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, -117, param3);
        this.field_R.a(this.field_P, 14 + (param3 + this.field_u), param0 - (-this.field_r - 10), -28 + this.field_y, this.field_C, 16777215, -1, 0, 0, this.field_R.field_C);
        if (param2 >= -80) {
          this.field_S = (fb[]) null;
        }
    }

    final static void h(byte param0) {
        cf.field_Jb = ud.a(2);
        s.field_K = 0;
        if (param0 != -120) {
          field_T = (String) null;
        }
    }

    public static void a(int param0) {
        field_M = null;
        if (param0 <= 39) {
          e.i((byte) -58);
          field_T = null;
          return;
        }
        field_T = null;
    }

    final fb a(byte param0, rg param1, String param2) {
        fb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        fb stackIn_2_0 = null;
        fb stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new fb(param2, param1);
          var4.field_n = (jm) ((Object) new sf());
          if (param0 != -114) {
            stackIn_2_0 = (fb) null;
            return stackIn_2_0;
          }
          var5 = this.field_C - 2;
          this.a(0, 34, 34 + this.field_C, this.field_y, 0);
          var4.a(var5, 34, 30, -14 + this.field_y, 7);
          this.b(var4, 95);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("e.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void g(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var1Lifetime1;
        int var2Lifetime1;
        int var3Lifetime1;
        vi.field_d = wb.field_h;
        fn.field_c = wb.field_c;
        tf.a(90);
        wf.field_W.a(ql.field_d.field_M, 0, 0, -2 + (ql.field_d.field_pb - 40), true);
        fe.field_h.a(0, dc.field_q.field_M, -2147483648, fe.field_g, 0);
        if (param0 <= -124) {
          var1 = fe.field_g + 2;
          bh.field_G.a(0, dc.field_q.field_M, -2147483648, dc.field_q.field_pb - (bo.field_c ? var1 : 0), bo.field_c ? var1 : 0);
          dj.g(2);
          ln.field_cc.a(0, ql.field_d.field_M, -2147483648, 40, ql.field_d.field_pb - 40);
          he.field_Hb.a(0, rb.field_c.field_M, -2147483648, 30, 0);
          oh.field_a.a(0, rb.field_c.field_M, -2147483648, -42 + rb.field_c.field_pb - 30, 30);
          ue.field_d.a(5, 68, -2147483648, 30, 5);
          in.field_b.a(75, 78, -2147483648, 30, 5);
          ca.field_g.a(155, 48, -2147483648, 30, 5);
          kh.field_l.a(205, 48, -2147483648, 30, 5);
          var2 = !bo.field_c ? 200 : 250;
          lg.field_c.a(5 + var2, -var2 + 363, -2147483648, 30, 5);
          vk.field_i.a(370, -5 + rb.field_c.field_M - 370, -2147483648, 30, 5);
          ci.field_zb.a(2, -5 + (oh.field_a.field_pb - 37), 37, -3, sc.field_e, 5, -5 + (-5 + oh.field_a.field_M));
          var3 = (2 + rb.field_c.field_M) / 2;
          si.field_l.a(0, -2 + var3, -2147483648, 40, rb.field_c.field_pb - 40);
          if (!bo.field_c) {
            var3 = 0;
          }
          wj.field_g.a(var3, -var3 + rb.field_c.field_M, -2147483648, 40, rb.field_c.field_pb - 40);
          return;
        }
        field_M = (ci) null;
        var1Lifetime1 = fe.field_g + 2;
        bh.field_G.a(0, dc.field_q.field_M, -2147483648, dc.field_q.field_pb - (bo.field_c ? var1Lifetime1 : 0), bo.field_c ? var1Lifetime1 : 0);
        dj.g(2);
        ln.field_cc.a(0, ql.field_d.field_M, -2147483648, 40, ql.field_d.field_pb - 40);
        he.field_Hb.a(0, rb.field_c.field_M, -2147483648, 30, 0);
        oh.field_a.a(0, rb.field_c.field_M, -2147483648, -42 + rb.field_c.field_pb - 30, 30);
        ue.field_d.a(5, 68, -2147483648, 30, 5);
        in.field_b.a(75, 78, -2147483648, 30, 5);
        ca.field_g.a(155, 48, -2147483648, 30, 5);
        kh.field_l.a(205, 48, -2147483648, 30, 5);
        var2Lifetime1 = !bo.field_c ? 200 : 250;
        lg.field_c.a(5 + var2Lifetime1, -var2Lifetime1 + 363, -2147483648, 30, 5);
        vk.field_i.a(370, -5 + rb.field_c.field_M - 370, -2147483648, 30, 5);
        ci.field_zb.a(2, -5 + (oh.field_a.field_pb - 37), 37, -3, sc.field_e, 5, -5 + (-5 + oh.field_a.field_M));
        var3Lifetime1 = (2 + rb.field_c.field_M) / 2;
        si.field_l.a(0, -2 + var3Lifetime1, -2147483648, 40, rb.field_c.field_pb - 40);
        if (!bo.field_c) {
          var3Lifetime1 = 0;
        }
        wj.field_g.a(var3Lifetime1, -var3Lifetime1 + rb.field_c.field_M, -2147483648, 40, rb.field_c.field_pb - 40);
    }

    final void a(int param0, int param1, String param2) {
        int var4_int = 0;
        try {
          if (param1 < 26) {
            this.field_N = (vn) null;
          }
          var4_int = this.field_Q;
          this.a(2116, var4_int + 1);
          this.field_S[var4_int] = this.a((byte) -114, (rg) (this), param2);
          this.field_K[var4_int] = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "e.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    e(vn param0, lh param1, String param2) {
        super(0, 0, 288, 0, (jm) null);
        int var4_int = 0;
        this.field_Q = 0;
        try {
          this.field_N = param0;
          this.field_P = param2;
          this.field_R = param1;
          var4_int = this.field_P != null ? this.field_R.b(this.field_P, 260, this.field_R.field_C) : 0;
          this.a(0, 34, 22 + var4_int, 288, 0);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "e.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void i(byte param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Chess.field_G;
        try {
          if (!mk.b(110)) {
            if (rm.field_R != null &&
              rm.field_R.field_b) {
              b.a(true);
              ji.field_V.b(new ge(ji.field_V, kh.field_k), (byte) -86);
            }
            return;
          }
          ji.field_V.a(-126, hn.field_m, tj.field_o, true);
          if (param0 < 109) {
            return;
          }
          ji.field_V.f((byte) 64);
          while (kf.d(18954)) {
            ji.field_V.a(d.field_Ib, -110, vg.field_a);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "e.J(" + param0 + ')');
        }
    }

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Chess.field_G;
        try {
          for (var6_int = 0; this.field_Q > var6_int; var6_int++) {
            if (param0 != this.field_S[var6_int]) {
              continue;
            }
            var7 = this.field_K[var6_int];
            if (var7 == -1) {
              this.field_N.k((byte) -114);
            } else {
              uk.a(false, this.field_K[var6_int]);
            }
            break;
          }
          if (param4 == -24221) {
            return;
          }
          field_O = -87;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("e.DA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_L = Math.atan2(1.0, 0.0);
        field_O = 480;
    }
}
