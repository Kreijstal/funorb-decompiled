/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iv extends jea {
    static int field_ub;
    jea field_tb;
    jea field_vb;
    oj field_wb;

    final static void f(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ik var4 = null;
        int var4_int = 0;
        int var5 = 0;
        toa var5_ref_toa = null;
        int[] var6 = null;
        int var8 = 0;
        kh var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          var10 = vc.field_q;
          var2 = var10.h(255);
          var3 = var10.h(param0 + 255);
          if (var2 == param0) {
            var4 = (ik) (hca.field_I.f(param0 ^ -80));
            if (var4 == null) {
              dea.a(60);
              return;
            }
            var5 = -var10.field_h + uca.field_d;
            var12 = var4.field_i;
            var11 = var12;
            var6 = var11;
            if (var12.length << 2 < var5) {
              var5 = var12.length << 2;
            }
            for (var7 = 0; var5 > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var10.h(255) << sea.c(768, var7 << 8));
            }
            var4.p(param0 + 79);
            return;
          }
          if (var2 == 1) {
            var4_int = var10.f((byte) -128);
            var5_ref_toa = (toa) (vsa.field_m.f(-80));
            while (var5_ref_toa != null) {
              if (var5_ref_toa.field_i != var3 ||
                var4_int != var5_ref_toa.field_k) {
                var5_ref_toa = (toa) (vsa.field_m.e(param0 + 123));
                continue;
              }
              break;
            }
            if (var5_ref_toa != null) {
              var5_ref_toa.p(103);
              return;
            }
            dea.a(60);
            return;
          }
          ssa.a("LR1: " + kk.a(32), (byte) 122, (Throwable) null);
          dea.a(60);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "iv.F(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        this.field_vb.field_G = -param1 + this.field_G - param0;
        this.field_tb.field_qb = 0;
        this.field_vb.field_t = this.field_t;
        this.field_tb.field_G = -param1 + this.field_G - param0;
        int var4 = 127 % ((84 - param2) / 41);
        this.field_wb.a(this.field_tb.field_t, -this.field_tb.field_T, param0, false, this.field_G - param0, this.field_t, this.field_vb.field_t, 0);
    }

    iv(long param0, jea param1, jea param2, oj param3) {
        super(param0, (jea) null);
        try {
          this.field_vb = new jea(0L, param2);
          this.field_wb = new oj(0L, param3);
          this.b(-123, this.field_vb);
          this.b(-128, this.field_wb);
          this.field_tb = param1;
          this.field_vb.b(-122, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "iv.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3, byte param4) {
        int var6;
        if (this.field_wb.e((byte) -115)) {
          this.field_tb.field_K = this.field_tb.field_K + param3;
        }
        if (this.field_wb.d((byte) 40)) {
          this.field_tb.field_K = this.field_tb.field_K - param3;
        }
        if (this.field_wb.f(-1)) {
          this.field_tb.field_K = this.field_tb.field_K + param2;
        }
        if (this.field_wb.g(-101)) {
          this.field_tb.field_K = this.field_tb.field_K - param2;
        }
        var6 = -87 / ((67 - param4) / 45);
        if (this.field_o) {
          this.field_tb.field_K = this.field_tb.field_K - param0;
        }
        if (param1) {
          if (-(this.field_tb.field_K + this.field_tb.field_T) < 0) {
            this.field_tb.field_K = -this.field_tb.field_T;
          }
          if (-(this.field_tb.field_K + this.field_tb.field_T) > -this.field_vb.field_t + this.field_tb.field_O + this.field_tb.field_t) {
            this.field_tb.field_K = -(this.field_tb.field_O + (this.field_tb.field_t - this.field_vb.field_t)) - this.field_tb.field_T;
          }
        } else {
          if (this.field_tb.field_O + this.field_tb.field_t - this.field_vb.field_t < -(this.field_tb.field_K + this.field_tb.field_T)) {
            this.field_tb.field_K = -(-this.field_vb.field_t + (this.field_tb.field_t + this.field_tb.field_O)) - this.field_tb.field_T;
          }
          if (-(this.field_tb.field_K + this.field_tb.field_T) < 0) {
            this.field_tb.field_K = -this.field_tb.field_T;
          }
        }
        if (this.field_wb.h(-1)) {
          this.field_tb.field_T = -this.field_wb.a(param1, (byte) 108, this.field_vb.field_t, this.field_tb.field_t);
          this.field_tb.field_K = 0;
        }
        this.field_wb.a(this.field_vb.field_t, this.field_tb.field_t, (byte) -74, -this.field_tb.field_T);
    }

    private final boolean a(boolean param0, int param1, int param2, int param3, int param4, boolean param5, boolean param6) {
        int var8;
        int var8Lifetime1;
        if (param0) {
          var8 = 1;
          this.field_tb.a(var8 != 0, param2, 120, this.field_vb.field_t);
          this.a(param1, false, param3, param4, (byte) 114);
          if (!param6) {
            return false;
          }
          return var8 != 0;
        }
        if (!this.field_o) {
          var8Lifetime1 = 0;
        } else {
          if (!param5) {
            var8Lifetime1 = 1;
          } else {
            var8Lifetime1 = 0;
          }
        }
        this.field_tb.a(var8Lifetime1 != 0, param2, 120, this.field_vb.field_t);
        this.a(param1, false, param3, param4, (byte) 114);
        if (!param6) {
          return false;
        }
        return var8Lifetime1 != 0;
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        if (param2 == 127) {
          this.field_qb = param3;
          this.field_t = param5;
          this.field_G = param0;
          this.field_T = param6;
          this.a(param4, param1, (byte) 125);
          return;
        }
        field_ub = 74;
        this.field_qb = param3;
        this.field_t = param5;
        this.field_G = param0;
        this.field_T = param6;
        this.a(param4, param1, (byte) 125);
    }

    final boolean a(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        if (param2 <= 68) {
          return true;
        }
        return this.a(param5, param3, param0, this.field_vb.field_t, param4, param1, true);
    }

    final void b(boolean param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        this.a(param2, param0, this.field_vb.field_t, param3, (byte) 117);
        if (param1 != 0) {
          discarded$0 = this.a(false, -87, -125, 47, 100, false, true);
        }
    }

    static {
    }
}
