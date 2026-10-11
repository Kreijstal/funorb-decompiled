/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends jc implements qh {
    static int field_W;
    private hl field_Y;
    static int field_X;

    final static wb[] a(int param0, qk param1, int param2, int param3) {
        RuntimeException var4 = null;
        wb[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 505437496) {
            field_W = 25;
          }
          if (!tc.a(param0, param2, param3 ^ 505429695, param1)) {
            return null;
          }
          stackIn_6_0 = hc.a(param3 - 502094224);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ol.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        int var6_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          var6_int = -98 / ((-62 - param1) / 32);
          if (this.field_Y == param3) {
            this.r(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_5_0 = var6;
          stackIn_5_1 = new StringBuilder().append("ol.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param4).append(')').toString());
        }
    }

    private final hl a(String param0, int param1, pl param2) {
        hl var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        qk var6 = null;
        hl stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new hl(param0, param2);
          if (param1 != -29995) {
            var6 = (qk) null;
            ol.a(76, (qk) null, 39, 118);
          }
          var4.field_v = (ci) ((Object) new ki());
          var5 = -6 + this.field_q;
          this.field_q = this.field_q + 38;
          var4.a(30, var5, -14 + this.field_h - 16, 15, true);
          this.b(var4, (byte) 118);
          this.g(26947);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("ol.GA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    ol(j param0, ml param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        lk var4 = null;
        try {
          var3 = null;
          if (param1 == rc.field_l) {
            var3 = ll.field_a;
          } else {
            if (param1 == tk.field_b) {
              var3 = fe.field_d;
              this.field_q = this.field_q + 10;
              if (kb.a(false)) {
                this.field_q = this.field_q + 20;
                var3 = fj.field_f;
              }
            } else {
              if (uk.field_d == param1) {
                var3 = ij.field_b;
                this.field_q = this.field_q + 30;
              }
            }
          }
          var4 = new lk((String) (var3), (pl) null);
          var4.field_o = 0;
          var4.field_q = 80;
          var4.field_i = 50;
          var4.field_h = this.field_h;
          var4.field_v = (ci) ((Object) new ek(me.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.b(var4, (byte) 118);
          this.field_Y = this.a(gh.field_i, -29995, (pl) (this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ol.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void r(int param0) {
        if (param0 != 0) {
          return;
        }
        if (!this.field_E) {
          return;
        }
        this.field_E = false;
    }

    final static kc[] s(int param0) {
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        kc[] var1;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var11;
        int[] var13;
        byte[] var15;
        int[] var17;
        byte[] var21;
        int[] var22;
        var8 = Main.field_T;
        var1 = new kc[cf.field_c];
        for (var2 = 0; var2 < cf.field_c; var2++) {
          var3 = na.field_q[var2] * hb.field_a[var2];
          var21 = rd.field_k[var2];
          if (!hl.field_y[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6 = 0; var6 < var3; var6++) {
              var10[var6] = jf.field_i[bc.a((int) var21[var6], 255)];
            }
            var1[var2] = new kc(p.field_l, gk.field_a, kb.field_c[var2], ml.field_b[var2], na.field_q[var2], hb.field_a[var2], var22);
          } else {
            var15 = vd.field_r[var2];
            var11 = var15;
            var9 = var11;
            var5 = var9;
            var17 = new int[var3];
            var13 = var17;
            var6_ref_int__ = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6_ref_int__[var7] = fj.a(bc.a(255, (int) var15[var7]) << 24, jf.field_i[bc.a((int) var21[var7], 255)]);
            }
            var1[var2] = (kc) ((Object) new si(p.field_l, gk.field_a, kb.field_c[var2], ml.field_b[var2], na.field_q[var2], hb.field_a[var2], var17));
          }
        }
        rh.d(79);
        if (param0 >= -84) {
          ol.s(-125);
        }
        return var1;
    }

    static {
        field_X = 0;
    }
}
