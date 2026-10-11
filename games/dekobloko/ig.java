/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends w {
    private int field_fc;
    private int field_Vb;
    static ud field_ac;
    private int field_bc;
    private int field_ec;
    private int[] field_Nb;
    private qd[] field_gc;
    private int field_Ob;
    private int field_Qb;
    private char[] field_Wb;
    static String field_Sb;
    static String field_Xb;
    private int field_Zb;
    private ig[] field_Pb;
    static int field_Yb;
    private int field_Rb;
    static int field_dc;
    static nh[] field_cc;
    private ig field_Ub;
    static String field_Tb;

    private final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        String var9;
        var8 = client.field_A ? 1 : 0;
        var5 = 2 % ((param2 - 61) / 40);
        if (param1 != this.field_Rb) {
          if (this.field_Pb[param1] != null) {
            this.e(0);
            this.b((byte) 67, 0);
            this.field_Rb = param1;
            this.field_Ub = this.field_Pb[this.field_Rb];
            vm.a(107, this.field_Ub);
            this.field_Ub.b((byte) 67, 12);
          } else {
            if (this.field_Nb[param1] != -1) {
              var6 = this.field_Nb[param1] | 32768;
              var7 = pk.field_r;
              if (var7 == 0 &&
                null != cd.field_m) {
                var7 = 1;
              }
              if (rf.a(0, var7) == 2) {
                eg.a(var7, param0, 1, (byte) 123);
              }
              var9 = (String) null;
              ce.a(param3, (byte) -85, pk.field_r, ed.field_c, var6, (String) null);
              rb.a(fm.field_d, ed.field_c, -94, pk.field_r, var6);
              pf.a(false);
              h.a((byte) 11);
            } else {
              cc.a(8);
              pf.a(false);
            }
          }
        } else {
          this.e(0);
          this.b((byte) 67, 0);
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int var6 = 0;
        int var4;
        int var5;
        int var7;
        int stackIn_3_0 = 0;
        var7 = client.field_A ? 1 : 0;
        stackIn_3_0 = (wh.field_c != 85) ? 0 : 1;
        var4 = stackIn_3_0;
        if (null != this.field_Ub) {
          if (var4 != 0 &&
            this.field_Ub.field_Rb == -1) {
            this.e(param1 - 15028);
            this.b((byte) 67, 0);
            return true;
          }
          return this.field_Ub.b(param0, param1 ^ 0, param2);
        }
        if (this.field_Ub == null &&
          this == mg.field_bc &&
          var4 != 0) {
          pf.a(false);
          return true;
        }
        if (param1 != 15028) {
          return true;
        }
        var5 = el.field_G;
        if (var5 > 0) {
          if (aa.field_b == var5) {
            var5 = 63;
          }
          for (var6 = 0; this.field_Wb.length > var6; var6++) {
            if (this.field_Wb[var6] == var5) {
              this.a(param0, var6, 107, param2);
              return true;
            }
          }
        }
        return false;
    }

    final int g(int param0) {
        if (param0 > -87) {
          field_cc = (nh[]) null;
        }
        return this.field_bc + (null != this.field_Ub ? this.field_Ub.g(-119) : 0);
    }

    private final void b(byte param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        int var3 = 0;
        int var6 = client.field_A ? 1 : 0;
        this.field_ec = param1;
        if (param0 != 67) {
          this.field_Wb = (char[]) null;
        }
        for (var5 = 0; this.field_Ob > var5; var5++) {
          var4 = this.field_ec * this.field_ec;
          var3 = var5 * this.field_Vb;
          this.field_gc[var5].field_Ib = (var3 * (-var4 + 144) + (this.field_Zb - this.field_pb) * var4) / 144;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        qd var5;
        int var6;
        qd stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        ig var4;
        ig var7;
        var6 = client.field_A ? 1 : 0;
        if (param2 > -97) {
          field_Tb = (String) null;
        }
        for (var4_int = 0; var4_int < this.field_gc.length; var4_int++) {
          var5 = this.field_gc[var4_int];
          if (var5.field_ob == 1) {
            this.a(param1, var4_int, -90, param0);
            stackIn_9_0 = var5;
            stackIn_10_1 = (var4_int == this.field_Rb);
            stackIn_9_0.field_ab = stackIn_10_1;
          }
        }
        if (this.field_Rb != -1) {
          var7 = this.field_Pb[this.field_Rb];
          var4 = var7;
          if (var4 != null) {
            var7.a(param0, param1, -99);
          }
        }
        if (this.field_ec > 0) {
          this.b((byte) 67, this.field_ec - 1);
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        var9 = client.field_A ? 1 : 0;
        this.field_bc = this.field_fc + param0 * 2;
        this.a(this.field_bc, 0, -this.field_Qb + param2, this.field_Qb, param1);
        if (param4 != -18) {
          this.field_Qb = 30;
        }
        if (param5 != this.field_Zb) {
          this.field_Zb = param5;
          this.b((byte) 67, this.field_ec);
        }
        for (var7 = 0; this.field_Ob > var7; var7++) {
          this.field_gc[var7].a(this.field_Vb, param0, 0, this.field_gc[var7].field_Ib, this.field_bc, param3, 500);
        }
        if (this.field_Rb != -1 &&
          null != this.field_Pb[this.field_Rb]) {
          var7Lifetime1 = this.field_Pb[this.field_Rb].field_Ob;
          for (var8 = (var7Lifetime1 + this.field_Rb) * this.field_Vb + this.field_Ib; param2 < var8; var8 = var8 - this.field_Vb) {
          }
          this.field_Pb[this.field_Rb].a(param0, this.field_bc + param1, var8, param3, (byte) -18, this.field_gc[this.field_Rb].field_pb);
        }
    }

    final boolean f(int param0) {
        int var4 = 0;
        qd var5 = null;
        int var6 = client.field_A ? 1 : 0;
        if (param0 != -1) {
          return false;
        }
        int var2 = 0;
        qd[] var3 = this.field_gc;
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          var2 = var2 | (0 != var5.field_ob ? 1 : 0);
        }
        if (var2 == 0 && -1 != this.field_Rb &&
          this.field_Pb[this.field_Rb] != null) {
          var2 = this.field_Pb[this.field_Rb].f(-1) ? 1 : 0;
        }
        return var2 != 0;
    }

    final void e(int param0) {
        int var3 = 0;
        qd var4 = null;
        int var5 = client.field_A ? 1 : 0;
        qd[] var6 = this.field_gc;
        qd[] var2 = var6;
        for (var3 = param0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          var4.field_ab = false;
          var4.field_ob = 0;
        }
        if (null != this.field_Ub) {
          this.field_Ub.e(0);
          this.field_Ub.b((byte) 104);
        }
        this.field_Rb = -1;
        this.field_Ub = null;
        this.b((byte) 67, 12);
    }

    final static boolean a(int param0, int param1, int param2, byte param3) {
        if (param3 != 69) {
          return true;
        }
        if (w.field_H != null &&
          w.field_H.c(param3 - 72)) {
          tf.i((byte) -125);
          return true;
        }
        if (pd.field_f != null &&
          pd.field_f.b(false)) {
          pd.field_f = null;
          tf.i((byte) -97);
          return true;
        }
        if (ve.g((byte) 119)) {
          return true;
        }
        if (!rm.a(param1, param0, (byte) 10, param2)) {
          return false;
        }
        return true;
    }

    public static void g(byte param0) {
        field_Xb = null;
        if (param0 < 18) {
          return;
        }
        field_cc = null;
        field_ac = null;
        field_Sb = null;
        field_Tb = null;
    }

    ig(long param0, w param1, w param2, w param3, ig[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        int var13 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        Object var14 = null;
        int var15 = 0;
        mm var17 = null;
        mm var18 = null;
        this.field_Rb = -1;
        try {
          this.field_Wb = param7;
          this.field_Nb = param5;
          this.field_Pb = param4;
          this.field_Ob = this.field_Nb.length;
          var17 = param3.field_J;
          var18 = var17;
          this.field_Vb = var18.field_K + 2 + var18.field_R;
          this.field_fc = 0;
          this.field_gc = new qd[this.field_Ob];
          this.field_Qb = this.field_Vb * this.field_Ob;
          var11 = "<col=999999>";
          var12 = "</col>";
          for (var13 = 0; this.field_Ob > var13; var13++) {
            if (0 < this.field_Wb[var13]) {
              param6[var13] = var11 + pf.a(this.field_Wb[var13], (byte) -9).toUpperCase() + ": " + var12 + param6[var13];
            }
            var14 = null;
            if (this.field_Pb[var13] != null ||
              this.field_Nb[var13] == -1) {
              var14 = qb.field_q;
            }
            this.field_gc[var13] = new qd(0L, param2, (w) null, param3, (ck) (var14), param6[var13]);
            this.a(this.field_gc[var13], -16834);
            var15 = var17.a(param6[var13]);
            if (var15 > this.field_fc) {
              this.field_fc = var15;
            }
          }
          this.field_fc = this.field_fc + (qb.field_q.field_K + 10);
          this.b((byte) 67, 12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("ig.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param5 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param7 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static boolean b(boolean param0) {
        if (!param0) {
          field_ac = (ud) null;
        }
        return uc.field_g == cd.field_m.field_Xb ? true : false;
    }

    static {
        field_Sb = "This game option has not yet been unlocked for use.";
        field_Yb = 0;
        field_Xb = "Set up new game";
        field_Tb = "Quit to website";
    }
}
