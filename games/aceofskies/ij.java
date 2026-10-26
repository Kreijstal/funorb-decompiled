/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends hh {
    static qm field_j;
    private qe field_f;
    static ResourceArchive field_h;
    private ju field_d;
    static nf field_g;
    private si field_e;
    static String field_i;

    final void a(int param0, boolean param1) {
        if (param0 == 4096) {
          this.field_a.a(260, -26625, 8448);
          return;
        }
        field_i = (String) null;
        this.field_a.a(260, -26625, 8448);
    }

    final void a(int param0, int param1, rt param2) {
        try {
          if (param1 != -1486691000) {
            ij.b(-8);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ij.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static ll a(ResourceArchive param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ll stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 1) {
            field_g = (nf) null;
          }
          var4_int = param0.b(param2, 0);
          var5 = param0.a(-122, var4_int, param1);
          stackIn_3_0 = hj.a(false, var5, var4_int, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ij.H(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final static tf c(int param0) {
        if (param0 == 8194) {
          return (tf) ((Object) new cr());
        }
        String var2 = (String) null;
        ij.a((ResourceArchive) null, (String) null, (String) null, 105);
        return (tf) ((Object) new cr());
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        if ((1 & param1) == 1) {
          if (!this.field_f.field_d) {
            var4 = this.field_a.field_hb % 4000 * 16 / 4000;
            this.field_a.a(this.field_f.field_h[var4], 1);
            if (param0 != -65) {
              this.b((byte) -110);
              return;
            }
            return;
          }
          this.field_a.a(this.field_f.field_j, param0 + 66);
          wl.field_Ub[2] = 0.0f;
          wl.field_Ub[0] = 0.0f;
          wl.field_Ub[3] = (float)(this.field_a.field_hb % 4000) / 4000.0f;
          wl.field_Ub[1] = 0.0f;
          jaggl.OpenGL.glTexGenfv(8194, 9473, wl.field_Ub, 0);
          if (param0 != -65) {
            this.b((byte) -110);
            return;
          }
          return;
        }
        if (!this.field_f.field_d) {
          this.field_a.a(this.field_f.field_h[0], param0 ^ -66);
          if (param0 == -65) {
            return;
          }
          this.b((byte) -110);
          return;
        }
        this.field_a.a(this.field_f.field_j, 1);
        wl.field_Ub[3] = 0.0f;
        wl.field_Ub[1] = 0.0f;
        wl.field_Ub[2] = 0.0f;
        wl.field_Ub[0] = 0.0f;
        jaggl.OpenGL.glTexGenfv(8194, 9473, wl.field_Ub, 0);
        if (param0 == -65) {
          return;
        }
        this.b((byte) -110);
    }

    final void a(boolean param0, boolean param1) {
        float var3 = 0.0f;
        if (!(this.field_a.field_C <= 0)) {
          var3 = -0.5f / (float)this.field_a.field_C;
          this.field_a.a(false, 1);
          wl.field_Ub[0] = 0.0f;
          wl.field_Ub[3] = this.field_a.field_Tb * var3 + 0.25f;
          wl.field_Ub[2] = var3;
          wl.field_Ub[1] = 0.0f;
          jaggl.OpenGL.glPushMatrix();
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glTexGenfv(8192, 9474, wl.field_Ub, 0);
          jaggl.OpenGL.glPopMatrix();
          this.field_a.a(0.5f, (float)this.field_a.field_C, 61);
          this.field_a.a(this.field_d, 1);
          this.field_a.a(false, 0);
        }
        this.field_e.a(-23085, '\0');
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glPushMatrix();
        jaggl.OpenGL.glScalef(0.25f, 0.25f, 1.0f);
        jaggl.OpenGL.glMatrixMode(5888);
        if (!param0) {
          return;
        }
        ij.b(-83);
    }

    final boolean a(byte param0) {
        int var2 = 45 % ((param0 + 11) / 63);
        return true;
    }

    ij(wl param0, qe param1) {
        super(param0);
        try {
          this.field_f = param1;
          this.c((byte) 118);
          this.field_d = new ju(this.field_a, 6406, 2, new byte[]{(byte) 0, (byte)-1}, 6406);
          this.field_d.b(false, false);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ij.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(byte param0) {
        if (param0 > 5) {
          this.field_e.a(-23085, '\001');
          if (!(this.field_a.field_C <= 0)) {
            this.field_a.a(false, 1);
            this.field_a.a((rt) null, 1);
            this.field_a.a(1.0f, 0.0f, 62);
            this.field_a.a(false, 0);
          }
          this.field_a.a(8448, -26625, 8448);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glPopMatrix();
          jaggl.OpenGL.glMatrixMode(5888);
          return;
        }
        this.a(89, true);
        this.field_e.a(-23085, '\001');
        if (!(this.field_a.field_C <= 0)) {
          this.field_a.a(false, 1);
          this.field_a.a((rt) null, 1);
          this.field_a.a(1.0f, 0.0f, 62);
          this.field_a.a(false, 0);
        }
        this.field_a.a(8448, -26625, 8448);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glPopMatrix();
        jaggl.OpenGL.glMatrixMode(5888);
    }

    public static void b(int param0) {
        field_i = null;
        field_g = null;
        field_h = null;
        if (param0 != 1822) {
          field_h = (ResourceArchive) null;
          field_j = null;
          return;
        }
        field_j = null;
    }

    private final void c(byte param0) {
        this.field_e = new si(this.field_a, 2);
        this.field_e.a((byte) -125, 0);
        this.field_a.a(false, 1);
        this.field_a.a(7681, -26625, 260);
        this.field_a.a(34168, 768, 34176, 0);
        jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
        jaggl.OpenGL.glEnable(3168);
        this.field_a.a(false, 0);
        jaggl.OpenGL.glTexEnvf(8960, 34163, 2.0f);
        if (this.field_f.field_d) {
          jaggl.OpenGL.glTexGeni(8194, 9472, 9217);
          jaggl.OpenGL.glTexGeni(8195, 9472, 9217);
          jaggl.OpenGL.glTexGenfv(8195, 9473, new float[]{0.0f, 0.0f, 0.0f, 1.0f}, 0);
          jaggl.OpenGL.glEnable(3170);
          jaggl.OpenGL.glEnable(3171);
          this.field_e.b(false);
          this.field_e.a((byte) 66, 1);
          if (param0 >= 100) {
            this.field_a.a(false, 1);
            this.field_a.a(8448, -26625, 8448);
            this.field_a.a(5890, 768, 34176, 0);
            jaggl.OpenGL.glDisable(3168);
            this.field_a.a(false, 0);
            jaggl.OpenGL.glTexEnvf(8960, 34163, 1.0f);
            if (this.field_f.field_d) {
              jaggl.OpenGL.glDisable(3170);
              jaggl.OpenGL.glDisable(3171);
            } else {
              this.field_e.b(false);
              return;
            }
            this.field_e.b(false);
            return;
          }
          field_j = (qm) null;
          this.field_a.a(false, 1);
          this.field_a.a(8448, -26625, 8448);
          this.field_a.a(5890, 768, 34176, 0);
          jaggl.OpenGL.glDisable(3168);
          this.field_a.a(false, 0);
          jaggl.OpenGL.glTexEnvf(8960, 34163, 1.0f);
          if (this.field_f.field_d) {
            jaggl.OpenGL.glDisable(3170);
            jaggl.OpenGL.glDisable(3171);
          } else {
            this.field_e.b(false);
            return;
          }
          this.field_e.b(false);
          return;
        }
        this.field_e.b(false);
        this.field_e.a((byte) 66, 1);
        if (param0 < 100) {
          field_j = (qm) null;
          this.field_a.a(false, 1);
          this.field_a.a(8448, -26625, 8448);
          this.field_a.a(5890, 768, 34176, 0);
          jaggl.OpenGL.glDisable(3168);
          this.field_a.a(false, 0);
          jaggl.OpenGL.glTexEnvf(8960, 34163, 1.0f);
          if (this.field_f.field_d) {
            jaggl.OpenGL.glDisable(3170);
            jaggl.OpenGL.glDisable(3171);
          } else {
            this.field_e.b(false);
            return;
          }
          this.field_e.b(false);
          return;
        }
        this.field_a.a(false, 1);
        this.field_a.a(8448, -26625, 8448);
        this.field_a.a(5890, 768, 34176, 0);
        jaggl.OpenGL.glDisable(3168);
        this.field_a.a(false, 0);
        jaggl.OpenGL.glTexEnvf(8960, 34163, 1.0f);
        if (this.field_f.field_d) {
          jaggl.OpenGL.glDisable(3170);
          jaggl.OpenGL.glDisable(3171);
        } else {
          this.field_e.b(false);
          return;
        }
        this.field_e.b(false);
    }

    static {
        field_g = new nf();
        field_i = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
