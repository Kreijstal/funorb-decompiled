/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kha {
    private int field_b;
    private rpa field_o;
    private int field_g;
    private ij field_i;
    private rpa field_s;
    private qfa field_t;
    private boolean field_k;
    private int field_q;
    static int field_v;
    private rpa field_h;
    private int field_m;
    static String field_d;
    private aia field_w;
    private boolean field_e;
    private aia[] field_l;
    private nv field_n;
    private int field_p;
    private boolean field_f;
    private boolean field_a;
    private int field_r;
    private boolean field_c;
    private nv field_u;
    private boolean field_j;

    private final void a(mea param0, boolean param1) {
        try {
          param0.field_f = param1 ? true : false;
          param0.c((byte) 66);
          param0.b(-3846);
          this.c(false);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "kha.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void c(boolean param0) {
        int var5 = 0;
        int var6 = 0;
        int var8 = VoidHunters.field_G;
        int var2 = param0 ? 1 : 0;
        int var3 = 0;
        int var4 = 0;
        mea var9 = (mea) (this.field_i.d(0));
        int var6Lifetime1;
        while (var9 != null) {
          var6 = var9.d((byte) 7);
          if (var6 > var3) {
            var3 = var6;
          }
          var4 = var4 + var9.d(23230);
          var2 = var2 != 0 | var9.e(0) ? 1 : 0;
          var9 = (mea) (this.field_i.a((byte) 72));
        }
        if (2 == var3) {
          var5 = 34836;
        } else {
          if (var3 == 1) {
            var5 = 34842;
          } else {
            var5 = 6408;
          }
        }
        if (var5 != this.field_r) {
          this.field_e = true;
          this.field_r = var5;
        }
        var6Lifetime1 = 2 < this.field_p ? 2 : this.field_p;
        int var7 = var4 <= 2 ? var4 : 2;
        this.field_p = var4;
        if (var6Lifetime1 != var7) {
          this.field_e = true;
          this.field_j = true;
        }
        if ((var2 == 0 ? 1 : 0) == (this.field_c ? 1 : 0)) {
          this.field_c = var2 != 0 ? true : false;
          this.field_f = true;
        }
    }

    final boolean a(int param0, mea param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2998) {
            this.field_h = (rpa) null;
          }
          if (null != this.field_h) {
            if (param1.f(-257) ||
              param1.a(param0 - 2907)) {
              this.field_i.b(-10258, param1);
              this.c(false);
              if (this.b(false)) {
                if (this.field_q != -1 &&
                  -1 != this.field_b) {
                  param1.a(this.field_b, this.field_q, -19454);
                }
                param1.field_f = true;
                return true;
              }
            }
            this.a(param1, false);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("kha.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        ksa var6;
        int var7;
        var7 = VoidHunters.field_G;
        if (param4 != -5214) {
          this.field_i = (ij) null;
        }
        if (null != this.field_h &&
          !this.field_i.b(118)) {
          if (this.field_q != param2 ||
            param3 != this.field_b) {
            this.field_b = param3;
            this.field_q = param2;
            var6 = this.field_i.d(param4 + 5214);
            while (var6 != this.field_i.field_a) {
              ((mea) (var6)).a(this.field_b, this.field_q, -19454);
              var6 = var6.field_c;
            }
            this.field_j = true;
            this.field_f = true;
            this.field_e = true;
          }
          if (!this.b(false)) {
            return false;
          }
          this.field_g = param1;
          this.field_m = param0;
          this.field_k = true;
          this.field_t.a((byte) -120, (jaa) (this.field_h));
          this.field_h.a(0, 0);
          this.field_t.c(this.field_b + this.field_g - this.field_t.field_Y, -this.field_m, 0);
          return true;
        }
        return false;
    }

    private final boolean b(boolean param0) {
        aia[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        aia stackIn_34_2 = null;
        boolean stackIn_55_1 = false;
        boolean stackIn_59_0 = false;
        int var3;
        mea var4;
        var3 = VoidHunters.field_G;
        if (this.field_f) {
          if (null != this.field_u) {
            this.field_u.e((byte) 119);
            this.field_u = null;
          }
          if (null != this.field_w) {
            this.field_w.e(0);
            this.field_w = null;
          }
          if (null != this.field_s) {
            this.field_u = new nv(this.field_t, 6402, this.field_q, this.field_b, this.field_t.field_Kc);
          }
          if (!this.field_c) {
            if (this.field_u == null) {
              this.field_u = new nv(this.field_t, 6402, this.field_q, this.field_b);
            }
          } else {
            this.field_w = new aia(this.field_t, 34037, 6402, this.field_q, this.field_b);
          }
          this.field_j = true;
          this.field_f = false;
          this.field_a = true;
        }
        if (param0) {
          var4 = (mea) null;
          this.a(120, (mea) null);
        }
        if (this.field_e) {
          if (this.field_n != null) {
            this.field_n.e((byte) 110);
            this.field_n = null;
          }
          if (null != this.field_l[0]) {
            this.field_l[0].e(0);
            this.field_l[0] = null;
          }
          if (null != this.field_l[1]) {
            this.field_l[1].e(0);
            this.field_l[1] = null;
          }
          if (this.field_s != null) {
            this.field_n = new nv(this.field_t, this.field_r, this.field_q, this.field_b, this.field_t.field_Kc);
          }
          this.field_l[0] = new aia(this.field_t, 34037, this.field_r, this.field_q, this.field_b);
          stackIn_33_0 = this.field_l;
          stackIn_33_1 = 1;
          if (1 >= this.field_p) {
            stackIn_34_2 = null;
          } else {
            stackIn_34_2 = new aia(this.field_t, 34037, this.field_r, this.field_q, this.field_b);
          }
          stackIn_33_0[stackIn_33_1] = stackIn_34_2;
          this.field_j = true;
          this.field_a = true;
          this.field_e = false;
        }
        if (this.field_j) {
          if (this.field_s != null) {
            this.field_t.a((byte) -126, (jaa) (this.field_o));
            this.field_o.a(0, (byte) -27);
            this.field_o.a(1, (byte) -27);
            this.field_o.a(8, (byte) 110);
            this.field_o.a(0, (byte) -126, this.field_l[0]);
            if (this.field_p > 1) {
              this.field_o.a(1, (byte) -126, this.field_l[1]);
            }
            if (this.field_c) {
              this.field_o.a(8, (byte) -128, this.field_w);
            }
            this.field_t.a(this.field_o, 2896);
            this.field_t.a((byte) -122, (jaa) (this.field_s));
            this.field_s.a(0, (byte) -48);
            this.field_s.a(8, (byte) -80);
            this.field_s.a(0, this.field_n, (byte) -20);
            this.field_s.a(8, this.field_u, (byte) -20);
            this.field_t.a(this.field_s, 2896);
          } else {
            this.field_t.a((byte) -125, (jaa) (this.field_o));
            this.field_o.a(0, (byte) -36);
            this.field_o.a(1, (byte) -61);
            this.field_o.a(8, (byte) -5);
            this.field_o.a(0, (byte) -127, this.field_l[0]);
            if (this.field_p > 1) {
              this.field_o.a(1, (byte) -127, this.field_l[1]);
            }
            if (!this.field_c) {
              this.field_o.a(8, this.field_u, (byte) -20);
            } else {
              this.field_o.a(8, (byte) -126, this.field_w);
            }
            this.field_t.a(this.field_o, 2896);
          }
          this.field_j = false;
          this.field_a = true;
        }
        if (this.field_a) {
          this.field_t.a((byte) -121, (jaa) (this.field_h));
          stackIn_55_1 = !(this.field_h.g(93));
          this.field_a = stackIn_55_1;
          this.field_t.a(this.field_h, 2896);
        }
        stackIn_59_0 = !(this.field_a);
        return stackIn_59_0;
    }

    final void c(int param0) {
        int var7 = 0;
        int var2;
        int var3;
        mea var4_ref_mea;
        int var4;
        mea var5;
        int var6;
        int var8;
        int var2Lifetime1;
        var8 = VoidHunters.field_G;
        if (!this.field_k) {
          return;
        }
        if (null != this.field_s) {
          var2 = 16384;
          this.field_t.b((byte) 101, (jaa) (this.field_s));
          this.field_t.b(0, this.field_o);
          this.field_s.b(119, 0);
          this.field_o.a(0, 0);
          if (this.field_c) {
            var2 = var2 | 256;
          }
          jaggl.OpenGL.glBlitFramebufferEXT(0, 0, this.field_q, this.field_b, 0, 0, this.field_q, this.field_b, var2, 9728);
          this.field_t.a((jaa) (this.field_s), (byte) -94);
          this.field_t.a(56, this.field_o);
        }
        this.field_t.n(27841);
        this.field_t.d(0, 127);
        this.field_t.c(0, 1);
        this.field_t.t(110);
        var2Lifetime1 = 0;
        var3 = 1;
        var4_ref_mea = (mea) (this.field_i.d(0));
        while (null != var4_ref_mea) {
          var5 = (mea) (this.field_i.a((byte) 112));
          var6 = var4_ref_mea.d(23230);
          for (var7 = 0; var6 > var7; var7++) {
            var4_ref_mea.a(this.field_l[var2Lifetime1], -3009, this.field_w, var7);
            if (null == var5 &&
              -1 + var6 == var7) {
              this.field_t.a(this.field_o, 2896);
              this.field_t.c(0, 0, 0);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.field_b);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 1.0f);
              jaggl.OpenGL.glVertex2i(this.field_m, this.field_g);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(this.field_m, this.field_b + this.field_g);
              jaggl.OpenGL.glTexCoord2f((float)this.field_q, 0.0f);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(this.field_m + this.field_q, this.field_b + this.field_g);
              jaggl.OpenGL.glTexCoord2f((float)this.field_q, (float)this.field_b);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 1.0f);
              jaggl.OpenGL.glVertex2i(this.field_q + this.field_m, this.field_g);
              jaggl.OpenGL.glEnd();
            } else {
              this.field_o.a(0, 0 + var3);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.field_b);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 1.0f);
              jaggl.OpenGL.glVertex2i(0, 0);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(0, this.field_b);
              jaggl.OpenGL.glTexCoord2f((float)this.field_q, 0.0f);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(this.field_q, this.field_b);
              jaggl.OpenGL.glTexCoord2f((float)this.field_q, (float)this.field_b);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 1.0f);
              jaggl.OpenGL.glVertex2i(this.field_q, 0);
              jaggl.OpenGL.glEnd();
            }
            var2Lifetime1 = 1 + var2Lifetime1 & 1;
            var4_ref_mea.a(var7, 1);
            var3 = var3 + 1 & 1;
          }
          var4_ref_mea = var5;
        }
        this.field_k = false;
        var4 = -21 / ((55 - param0) / 61);
    }

    public static void b(int param0) {
        if (param0 != 1) {
          return;
        }
        field_d = null;
    }

    final void a(boolean param0) {
        ksa var2 = null;
        int var3 = VoidHunters.field_G;
        this.field_s = null;
        this.field_l = null;
        this.field_w = null;
        this.field_u = null;
        this.field_h = null;
        this.field_n = null;
        if (!param0) {
          kha.b(0);
        }
        this.field_o = null;
        if (!this.field_i.b(8)) {
          var2 = this.field_i.d(0);
          while (var2 != this.field_i.field_a) {
            ((mea) (var2)).c((byte) 66);
            var2 = var2.field_c;
          }
        }
        this.field_b = 1;
        this.field_q = 1;
    }

    final boolean a(int param0) {
        if (param0 > -125) {
          mea var3 = (mea) null;
          this.a((mea) null, true);
        }
        return this.field_h != null ? true : false;
    }

    kha(qfa param0) {
        rpa dupTemp$2 = null;
        rpa dupTemp$3 = null;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_g = 0;
        this.field_q = 1;
        this.field_b = 1;
        this.field_m = 0;
        this.field_i = new ij();
        this.field_l = new aia[2];
        this.field_p = 0;
        this.field_a = true;
        this.field_f = true;
        this.field_r = -1;
        this.field_e = true;
        this.field_c = false;
        this.field_j = true;
        try {
          this.field_t = param0;
          if (this.field_t.field_U &&
            this.field_t.field_g) {
            dupTemp$2 = new rpa(this.field_t);
            this.field_o = dupTemp$2;
            this.field_h = dupTemp$2;
            if (1 < this.field_t.field_Kc &&
              this.field_t.field_Ob) {
              if (!this.field_t.field_gb) {
                return;
              }
              dupTemp$3 = new rpa(this.field_t);
              this.field_s = dupTemp$3;
              this.field_h = dupTemp$3;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("kha.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_d = "Uses energy to block projectiles";
    }
}
