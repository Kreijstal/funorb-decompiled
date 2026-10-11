/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends ci {
    static String field_Gb;
    ci field_Jb;
    static ci field_Ib;
    ci field_Kb;
    static String field_Hb;
    pd field_Eb;
    static wg field_Fb;

    public static void f(byte param0) {
        field_Ib = null;
        if (param0 == -33) {
          field_Gb = null;
          field_Fb = null;
          field_Hb = null;
          return;
        }
        nb.a(false);
        field_Gb = null;
        field_Fb = null;
        field_Hb = null;
    }

    nb(long param0, ci param1, ci param2, pd param3) {
        super(param0, (ci) null);
        try {
          this.field_Jb = new ci(0L, param2);
          this.field_Eb = new pd(0L, param3);
          this.a((byte) 124, this.field_Jb);
          this.a((byte) 123, this.field_Eb);
          this.field_Kb = param1;
          this.field_Jb.a((byte) 127, param1);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "nb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(int param0, boolean param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var8 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        if (param3 != -1) {
          return false;
        }
        if (param5) {
          var8 = 1;
          this.field_Kb.a(param0, this.field_Jb.field_pb, var8 != 0, -99);
          this.a(false, 50, param4, param2, param6);
          return var8 != 0;
        }
        if (!this.field_F) {
          var8Lifetime1 = 0;
          this.field_Kb.a(param0, this.field_Jb.field_pb, var8Lifetime1 != 0, -99);
          this.a(false, 50, param4, param2, param6);
          return var8Lifetime1 != 0;
        }
        if (!param1) {
          var8Lifetime2 = 1;
          this.field_Kb.a(param0, this.field_Jb.field_pb, var8Lifetime2 != 0, -99);
          this.a(false, 50, param4, param2, param6);
          return var8Lifetime2 != 0;
        }
        var8Lifetime3 = 0;
        this.field_Kb.a(param0, this.field_Jb.field_pb, var8Lifetime3 != 0, -99);
        this.a(false, 50, param4, param2, param6);
        return var8Lifetime3 != 0;
    }

    final boolean a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param5 == 0) {
          return this.a(param2, param1, param3, ~param5, param4, param0, this.field_Jb.field_pb);
        }
        this.a((byte) -56, 102, false, -69);
        return this.a(param2, param1, param3, ~param5, param4, param0, this.field_Jb.field_pb);
    }

    final static void b(int param0, int param1) {
        Object var3;
        qe var4;
        int var5;
        int var6;
        int var7;
        String var8;
        String var9;
        String var10;
        String var11;
        String var12;
        int var6Lifetime1;
        var7 = Chess.field_G;
        if (null == uh.i(23156)) {
          if (param0 == 0) {
            return;
          }
          field_Fb = (wg) null;
          return;
        }
        var3 = null;
        uh.i(23156).field_t.f(field_Fb.field_y, -1);
        var4 = uh.i(param0 ^ 23156).field_t.field_K;
        if (var4 == null) {
          var5 = -1;
        } else {
          if (!((uk) ((Object) var4)).a((byte) 61, 4096)) {
            if (((uk) ((Object) var4)).a((byte) 61, 0)) {
              var5 = 1;
            } else {
              if (!uh.i(param0 ^ 23156).field_B.field_d) {
                var5 = -1;
              } else {
                var5 = eg.a(uh.i(param0 + 23156).field_B.field_l, param0 + 0, uh.i(23156).field_B.field_k);
              }
            }
          } else {
            var5 = 0;
          }
        }
        var6 = var5;
        if (var6 == 0) {
          var8 = kl.field_l;
          wb.a(21, param1 - 3, 198, 96, 6, 1, 170);
          var6 = 32 + (10 - (-param1 - v.field_j.field_C / 2));
          v.field_j.b(var8, 120, var6, 16777215, -1);
          if (var3 != null) {
            jj.field_b.b((String) (var3), 120, var6 - (-v.field_j.field_C - v.field_j.field_t), 16777215, -1);
          }
          if (param0 != 0) {
            field_Fb = (wg) null;
          }
          return;
        }
        if (var6 == 1) {
          var9 = he.field_Eb;
          wb.a(21, param1 - 3, 198, 96, 6, 1, 170);
          var6 = 32 + (10 - (-param1 - v.field_j.field_C / 2));
          v.field_j.b(var9, 120, var6, 16777215, -1);
          if (var3 != null) {
            jj.field_b.b((String) (var3), 120, var6 - (-v.field_j.field_C - v.field_j.field_t), 16777215, -1);
          }
          if (param0 == 0) {
            return;
          }
          field_Fb = (wg) null;
          return;
        }
        if (var6 == -1) {
          var10 = pe.field_d;
          wb.a(21, param1 - 3, 198, 96, 6, 1, 170);
          var6 = 32 + (10 - (-param1 - v.field_j.field_C / 2));
          v.field_j.b(var10, 120, var6, 16777215, -1);
          if (var3 != null) {
            jj.field_b.b((String) (var3), 120, var6 - (-v.field_j.field_C - v.field_j.field_t), 16777215, -1);
          }
          if (param0 == 0) {
            return;
          }
          field_Fb = (wg) null;
          return;
        }
        if (var6 != -3) {
          var12 = pe.field_d;
          wb.a(21, param1 - 3, 198, 96, 6, 1, 170);
          var6 = 32 + (10 - (-param1 - v.field_j.field_C / 2));
          v.field_j.b(var12, 120, var6, 16777215, -1);
          if (var3 != null) {
            jj.field_b.b((String) (var3), 120, var6 - (-v.field_j.field_C - v.field_j.field_t), 16777215, -1);
          }
          if (param0 == 0) {
            return;
          }
          field_Fb = (wg) null;
          return;
        }
        var11 = ok.field_Nb;
        wb.a(21, param1 - 3, 198, 96, 6, 1, 170);
        var6Lifetime1 = 32 + (10 - (-param1 - v.field_j.field_C / 2));
        v.field_j.b(var11, 120, var6Lifetime1, 16777215, -1);
        if (var3 != null) {
          jj.field_b.b((String) (var3), 120, var6Lifetime1 - (-v.field_j.field_C - v.field_j.field_t), 16777215, -1);
        }
        if (param0 == 0) {
          return;
        }
        field_Fb = (wg) null;
        return;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_V = param2;
        this.field_mb = param5;
        this.field_pb = param1;
        this.field_M = param6;
        this.a(param4, (byte) -20, param0);
        if (param3 != -3) {
          nb.f((byte) 26);
        }
    }

    final static void a(boolean param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        nk var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        ac var11 = null;
        nk var12 = null;
        bk var13 = null;
        int[] var14 = null;
        bk var15 = null;
        int[] var16 = null;
        var8 = Chess.field_G;
        try {
          var12 = tk.field_h;
          var2 = var12.i(-86);
          if (!param0) {
            return;
          }
          if (var2 == 0) {
            var10 = in.a((byte) 20);
            var16 = var10;
            var14 = var16;
            var3 = var14;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((p) ((Object) var5)).i(-107);
            for (var7 = 0; var6 > var7; var7++) {
              var9[var7] = ((p) ((Object) var5)).e((byte) -99);
            }
            var15 = (bk) (bh.field_D.g(-18110));
            if (var15 == null) {
              si.d(65280);
              return;
            }
            var15.field_j = var16[0];
            var15.field_o = var3;
            var15.field_m = true;
            var15.c(-2193);
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              var13 = (bk) (bh.field_D.g(-18110));
              if (var13 == null) {
                si.d(65280);
                return;
              }
              var13.field_o = in.a((byte) 20);
              var13.field_j = var13.field_o[0];
              var13.field_m = true;
              var13.c(-2193);
            } else {
              fg.a((Throwable) null, (byte) -77, "A1: " + tm.b((byte) -122));
              si.d(65280);
            }
          } else {
            var11 = (ac) (vn.field_vb.g(-18110));
            if (var11 == null) {
              si.d(65280);
              return;
            }
            var11.c(-2193);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "nb.G(" + param0 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2) {
        this.field_Kb.field_mb = 0;
        if (param1 == -20) {
          this.field_Jb.field_pb = this.field_pb;
          this.field_Jb.field_M = this.field_M - param0 - param2;
          this.field_Kb.field_M = this.field_M - (param0 + param2);
          this.field_Eb.a(this.field_pb, this.field_Kb.field_pb, -this.field_Kb.field_V, this.field_Jb.field_pb, -param0 + this.field_M, 0, (byte) -65, param0);
          return;
        }
    }

    final void a(byte param0, int param1, boolean param2, int param3) {
        this.a(param2, 114, param1, param3, this.field_Jb.field_pb);
        if (param0 > -71) {
          field_Fb = (wg) null;
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6;
        if (this.field_Eb.k(3384)) {
          this.field_Kb.field_vb = this.field_Kb.field_vb + param2;
        }
        if (this.field_Eb.f((byte) -38)) {
          this.field_Kb.field_vb = this.field_Kb.field_vb - param2;
        }
        if (this.field_Eb.o(25708)) {
          this.field_Kb.field_vb = this.field_Kb.field_vb + param4;
        }
        if (this.field_Eb.l(0)) {
          this.field_Kb.field_vb = this.field_Kb.field_vb - param4;
        }
        var6 = -78 / ((param1 + 45) / 38);
        if (this.field_F) {
          this.field_Kb.field_vb = this.field_Kb.field_vb - param3;
        }
        if (param0) {
          if (-(this.field_Kb.field_vb + this.field_Kb.field_V) < 0) {
            this.field_Kb.field_vb = -this.field_Kb.field_V;
          }
          if (this.field_Kb.field_N + this.field_Kb.field_pb - this.field_Jb.field_pb < -(this.field_Kb.field_V + this.field_Kb.field_vb)) {
            this.field_Kb.field_vb = -(this.field_Kb.field_N + (this.field_Kb.field_pb - this.field_Jb.field_pb)) - this.field_Kb.field_V;
          }
        } else {
          if (-(this.field_Kb.field_V + this.field_Kb.field_vb) > this.field_Kb.field_N + this.field_Kb.field_pb - this.field_Jb.field_pb) {
            this.field_Kb.field_vb = -(-this.field_Jb.field_pb + (this.field_Kb.field_N + this.field_Kb.field_pb)) - this.field_Kb.field_V;
          }
          if (-(this.field_Kb.field_vb + this.field_Kb.field_V) < 0) {
            this.field_Kb.field_vb = -this.field_Kb.field_V;
          }
        }
        if (this.field_Eb.m(2)) {
          this.field_Kb.field_V = -this.field_Eb.b(-1, this.field_Kb.field_pb, param0, this.field_Jb.field_pb);
          this.field_Kb.field_vb = 0;
        }
        this.field_Eb.a(true, this.field_Jb.field_pb, -this.field_Kb.field_V, this.field_Kb.field_pb);
    }

    static {
        field_Gb = "Respect";
        field_Hb = "Your ignore list is full. Max of 100 hit.";
    }
}
