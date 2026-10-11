/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cw {
    private int field_o;
    private cka field_t;
    private int field_q;
    private cb field_e;
    private boolean field_a;
    private int field_g;
    private int field_k;
    private cb field_i;
    private cb field_d;
    private vna field_j;
    private boolean field_c;
    private kba field_l;
    private boolean field_h;
    private kba field_b;
    private boolean field_n;
    private rt[] field_r;
    private rt field_m;
    private boolean field_u;
    private int field_s;
    private int field_p;
    private boolean field_f;

    private final boolean c(int param0) {
        rt[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        rt stackIn_32_2 = null;
        boolean stackIn_55_1 = false;
        boolean stackIn_59_0 = false;
        int var3;
        oga var4;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != -739) {
          var4 = (oga) null;
          this.a(22, (oga) null);
        }
        if (this.field_c) {
          if (null != this.field_b) {
            this.field_b.g(param0 ^ 653);
            this.field_b = null;
          }
          if (null != this.field_m) {
            this.field_m.b(0);
            this.field_m = null;
          }
          if (this.field_e != null) {
            this.field_b = new kba(this.field_t, 6402, this.field_k, this.field_g, this.field_t.field_gb);
          }
          if (this.field_u) {
            this.field_m = new rt(this.field_t, 34037, 6402, this.field_k, this.field_g);
          } else {
            if (null == this.field_b) {
              this.field_b = new kba(this.field_t, 6402, this.field_k, this.field_g);
            }
          }
          this.field_n = true;
          this.field_c = false;
          this.field_h = true;
        }
        if (this.field_f) {
          if (this.field_l != null) {
            this.field_l.g(80);
            this.field_l = null;
          }
          if (null != this.field_r[0]) {
            this.field_r[0].b(0);
            this.field_r[0] = null;
          }
          if (null != this.field_r[1]) {
            this.field_r[1].b(0);
            this.field_r[1] = null;
          }
          if (this.field_e != null) {
            this.field_l = new kba(this.field_t, this.field_s, this.field_k, this.field_g, this.field_t.field_gb);
          }
          this.field_r[0] = new rt(this.field_t, 34037, this.field_s, this.field_k, this.field_g);
          stackIn_31_0 = this.field_r;
          stackIn_31_1 = 1;
          if (this.field_p <= 1) {
            stackIn_32_2 = null;
          } else {
            stackIn_32_2 = new rt(this.field_t, 34037, this.field_s, this.field_k, this.field_g);
          }
          stackIn_31_0[stackIn_31_1] = stackIn_32_2;
          this.field_f = false;
          this.field_n = true;
          this.field_h = true;
        }
        if (this.field_h) {
          if (this.field_e == null) {
            this.field_t.b((ks) (this.field_i), (byte) 81);
            this.field_i.a(-110, 0);
            this.field_i.a(-114, 1);
            this.field_i.a(36, 8);
            this.field_i.a(true, this.field_r[0], 0);
            if (1 < this.field_p) {
              this.field_i.a(true, this.field_r[1], 1);
            }
            if (this.field_u) {
              this.field_i.a(true, this.field_m, 8);
            } else {
              this.field_i.a(8, this.field_b, true);
            }
            this.field_t.b(this.field_i, 0);
          } else {
            this.field_t.b((ks) (this.field_i), (byte) 81);
            this.field_i.a(-93, 0);
            this.field_i.a(-123, 1);
            this.field_i.a(107, 8);
            this.field_i.a(true, this.field_r[0], 0);
            if (1 < this.field_p) {
              this.field_i.a(true, this.field_r[1], 1);
            }
            if (this.field_u) {
              this.field_i.a(true, this.field_m, 8);
            }
            this.field_t.b(this.field_i, 0);
            this.field_t.b((ks) (this.field_e), (byte) 81);
            this.field_e.a(124, 0);
            this.field_e.a(71, 8);
            this.field_e.a(0, this.field_l, true);
            this.field_e.a(8, this.field_b, true);
            this.field_t.b(this.field_e, 0);
          }
          this.field_h = false;
          this.field_n = true;
        }
        if (this.field_n) {
          this.field_t.b((ks) (this.field_d), (byte) 81);
          stackIn_55_1 = !(this.field_d.c(20));
          this.field_n = stackIn_55_1;
          this.field_t.b(this.field_d, param0 + 739);
        }
        stackIn_59_0 = !(this.field_n);
        return stackIn_59_0;
    }

    final boolean a(int param0, oga param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            this.field_p = 84;
          }
          if (this.field_d == null) {
            return false;
          }
          if (param1.c((byte) 99) ||
            param1.a((byte) 65)) {
            this.field_j.b((byte) -59, param1);
            this.b(114);
            if (this.c(-739)) {
              if (-1 != this.field_k &&
                this.field_g != -1) {
                param1.a(this.field_g, (byte) -71, this.field_k);
              }
              param1.field_h = true;
              return true;
            }
          }
          this.a(false, param1);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("cw.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        vg var6 = null;
        boolean discarded$0 = false;
        int var7 = TombRacer.field_G ? 1 : 0;
        if (null == this.field_d) {
          return false;
        }
        if (this.field_j.d((byte) 14)) {
          return false;
        }
        if (param0 != this.field_k ||
          param2 != this.field_g) {
          this.field_k = param0;
          this.field_g = param2;
          var6 = this.field_j.f(-80);
          while (this.field_j.field_e != var6) {
            ((oga) (var6)).a(this.field_g, (byte) -71, this.field_k);
            var6 = var6.field_a;
          }
          this.field_h = true;
          this.field_c = true;
          this.field_f = true;
        }
        if (this.c(-739)) {
          this.field_q = param3;
          this.field_a = true;
          this.field_o = param1;
          this.field_t.b((ks) (this.field_d), (byte) 81);
          this.field_d.a(0, (byte) -91);
          this.field_t.a(4, -this.field_t.field_I + (this.field_g + this.field_q), -this.field_o);
          return true;
        }
        if (param4 != 0) {
          discarded$0 = this.c(39);
        }
        return false;
    }

    private final void a(boolean param0, oga param1) {
        try {
          param1.field_h = param0 ? true : false;
          param1.d((byte) -71);
          param1.p(72);
          this.b(64);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "cw.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0) {
        int var7 = 0;
        int var2;
        int var3;
        oga var4;
        oga var5;
        int var6;
        int var8;
        int var2Lifetime1;
        var8 = TombRacer.field_G ? 1 : 0;
        if (param0 >= -43) {
          this.b((byte) -49);
        }
        if (!this.field_a) {
          return;
        }
        if (null != this.field_e) {
          var2 = 16384;
          this.field_t.a(this.field_e, -1090);
          this.field_t.a(0, this.field_i);
          this.field_e.b(-1, 0);
          this.field_i.a(0, (byte) -91);
          if (this.field_u) {
            var2 = var2 | 256;
          }
          jaggl.OpenGL.glBlitFramebufferEXT(0, 0, this.field_k, this.field_g, 0, 0, this.field_k, this.field_g, var2, 9728);
          this.field_t.a((ks) (this.field_e), (byte) -38);
          this.field_t.c(this.field_i, -4);
        }
        this.field_t.q(2);
        this.field_t.a((byte) 66, 0);
        this.field_t.d(1, 1);
        this.field_t.la();
        var2Lifetime1 = 0;
        var3 = 1;
        var4 = (oga) (this.field_j.f(-80));
        while (var4 != null) {
          var5 = (oga) (this.field_j.e(125));
          var6 = var4.c(1);
          for (var7 = 0; var6 > var7; var7++) {
            var4.a(this.field_r[var2Lifetime1], var7, (byte) -100, this.field_m);
            if (var5 == null &&
              -1 + var6 == var7) {
              this.field_t.b(this.field_i, 0);
              this.field_t.a(4, 0, 0);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.field_g);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 1.0f);
              jaggl.OpenGL.glVertex2i(this.field_o, this.field_q);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(this.field_o, this.field_q + this.field_g);
              jaggl.OpenGL.glTexCoord2f((float)this.field_k, 0.0f);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(this.field_o + this.field_k, this.field_q + this.field_g);
              jaggl.OpenGL.glTexCoord2f((float)this.field_k, (float)this.field_g);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 1.0f);
              jaggl.OpenGL.glVertex2i(this.field_k + this.field_o, this.field_q);
              jaggl.OpenGL.glEnd();
            } else {
              this.field_i.a(0 + var3, (byte) -91);
              jaggl.OpenGL.glBegin(7);
              jaggl.OpenGL.glTexCoord2f(0.0f, (float)this.field_g);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 1.0f);
              jaggl.OpenGL.glVertex2i(0, 0);
              jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(0, this.field_g);
              jaggl.OpenGL.glTexCoord2f((float)this.field_k, 0.0f);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 0.0f);
              jaggl.OpenGL.glVertex2i(this.field_k, this.field_g);
              jaggl.OpenGL.glTexCoord2f((float)this.field_k, (float)this.field_g);
              jaggl.OpenGL.glMultiTexCoord2f(33985, 1.0f, 1.0f);
              jaggl.OpenGL.glVertex2i(this.field_k, 0);
              jaggl.OpenGL.glEnd();
            }
            var3 = 1 & var3 + 1;
            var2Lifetime1 = 1 + var2Lifetime1 & 1;
            var4.a(var7, (byte) 120);
          }
          var4 = var5;
        }
        this.field_a = false;
    }

    private final void b(int param0) {
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_1 = 0;
        boolean stackIn_34_1 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        oga var9;
        int var6Lifetime1;
        var8 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        var3 = 0;
        var4 = 0;
        var9 = (oga) (this.field_j.f(-80));
        if (param0 < 35) {
          this.field_f = false;
        }
        while (var9 != null) {
          var6 = var9.b(13727);
          if (var6 > var3) {
            var3 = var6;
          }
          var4 = var4 + var9.c(1);
          var2 = var2 != 0 | var9.a(1) ? 1 : 0;
          var9 = (oga) (this.field_j.e(107));
        }
        if (var3 != 2) {
          if (var3 == 1) {
            var5 = 34842;
          } else {
            var5 = 6408;
          }
        } else {
          var5 = 34836;
        }
        if (this.field_s != var5) {
          this.field_f = true;
          this.field_s = var5;
        }
        if (this.field_p <= 2) {
          stackIn_18_0 = this.field_p;
        } else {
          stackIn_18_0 = 2;
        }
        var6Lifetime1 = stackIn_18_0;
        stackIn_21_0 = (var4 <= 2) ? var4 : 2;
        var7 = stackIn_21_0;
        if (var7 != var6Lifetime1) {
          this.field_f = true;
          this.field_h = true;
        }
        stackIn_26_0 = (this.field_u) ? 0 : 1;
        stackIn_29_1 = (var2 != 0) ? 0 : 1;
        if (stackIn_26_0 != stackIn_29_1) {
          stackIn_34_1 = (var2 != 0);
          this.field_u = stackIn_34_1;
          this.field_c = true;
        }
        this.field_p = var4;
    }

    final boolean b(byte param0) {
        if (param0 != -43) {
          this.field_d = (cb) null;
        }
        return this.field_d != null ? true : false;
    }

    final void a(int param0) {
        vg var2 = null;
        int var3 = TombRacer.field_G ? 1 : 0;
        this.field_l = null;
        this.field_m = null;
        this.field_i = null;
        this.field_r = null;
        this.field_b = null;
        this.field_e = null;
        this.field_d = null;
        if (!this.field_j.d((byte) 14)) {
          var2 = this.field_j.f(-80);
          while (this.field_j.field_e != var2) {
            ((oga) (var2)).d((byte) -35);
            var2 = var2.field_a;
          }
        }
        if (param0 < -43) {
          this.field_k = 1;
          this.field_g = 1;
          return;
        }
    }

    cw(cka param0) {
        cb dupTemp$2 = null;
        cb dupTemp$3 = null;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_g = 1;
        this.field_k = 1;
        this.field_q = 0;
        this.field_o = 0;
        this.field_j = new vna();
        this.field_c = true;
        this.field_h = true;
        this.field_u = false;
        this.field_n = true;
        this.field_r = new rt[2];
        this.field_s = -1;
        this.field_p = 0;
        this.field_f = true;
        try {
          this.field_t = param0;
          if (this.field_t.field_id) {
            if (!this.field_t.field_Cc) {
              return;
            }
            dupTemp$2 = new cb(this.field_t);
            this.field_i = dupTemp$2;
            this.field_d = dupTemp$2;
            if (1 < this.field_t.field_gb &&
              this.field_t.field_hc) {
              if (!this.field_t.field_ed) {
                return;
              }
              dupTemp$3 = new cb(this.field_t);
              this.field_e = dupTemp$3;
              this.field_d = dupTemp$3;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("cw.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
    }
}
