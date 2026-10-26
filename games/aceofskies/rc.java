/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends hh {
    static ej field_e;
    private si field_f;
    private qe field_g;
    static Vector2 field_d;

    final void b(byte param0) {
        if (param0 <= 5) {
          return;
        }
        this.field_f.a(-23085, '\001');
        this.field_a.a(false, 1);
        this.field_a.a((rt) null, 1);
        this.field_a.a(false, 0);
    }

    rc(wl param0, qe param1) {
        super(param0);
        try {
          this.field_g = param1;
          this.field_f = new si(param0, 2);
          this.field_f.a((byte) 82, 0);
          this.field_a.a(false, 1);
          if (this.field_g.field_d) {
            jaggl.OpenGL.glTexGeni(8194, 9472, 9217);
            jaggl.OpenGL.glEnable(3170);
          }
          jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
          jaggl.OpenGL.glTexGeni(8193, 9472, 9216);
          jaggl.OpenGL.glEnable(3168);
          jaggl.OpenGL.glEnable(3169);
          this.field_a.a(false, 0);
          this.field_f.b(false);
          this.field_f.a((byte) -110, 1);
          this.field_a.a(false, 1);
          if (this.field_g.field_d) {
            jaggl.OpenGL.glDisable(3170);
          }
          jaggl.OpenGL.glDisable(3168);
          jaggl.OpenGL.glDisable(3169);
          this.field_a.a(false, 0);
          this.field_f.b(false);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "rc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != 4096) {
          this.b((byte) 51);
        }
    }

    final void a(int param0, int param1, rt param2) {
        try {
          if (param1 != -1486691000) {
            this.field_f = (si) null;
          }
          this.field_a.a(param2, 1);
          this.field_a.a(param0, (byte) -39);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "rc.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != -29304) {
          return;
        }
        field_e = null;
        field_d = null;
    }

    final static void c(byte param0) {
        if (SoundCache.field_d == 10 ||
          !ur.b(-125)) {
          rl.a((byte) 0);
          SoundCache.field_d = 11;
        }
        int var1 = 8 % ((63 - param0) / 57);
        w.field_a = true;
    }

    final boolean a(byte param0) {
        int var2 = -10 / ((-11 - param0) / 63);
        return true;
    }

    final void a(byte param0, int param1, int param2) {
        int var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        float var4 = -0.0005000000237487257f * (float)(1 + (param1 & 3));
        float var5 = (float)(1 + ((param1 & 27) >> 3)) * 0.0005000000237487257f;
        float stackIn_3_0 = ((param1 & 64) == 0) ? 0.00048828125f : 0.0009765625f;
        float var6 = stackIn_3_0;
        boolean stackIn_6_0 = !((param1 & 128) == 0);
        boolean var7 = stackIn_6_0;
        this.field_a.a(false, 1);
        if (!var7) {
          rn.field_b[2] = var6;
          rn.field_b[0] = 0.0f;
          rn.field_b[1] = 0.0f;
          rn.field_b[3] = 0.0f;
        } else {
          rn.field_b[1] = 0.0f;
          rn.field_b[2] = 0.0f;
          rn.field_b[3] = 0.0f;
          rn.field_b[0] = var6;
        }
        jaggl.OpenGL.glTexGenfv(8192, 9474, rn.field_b, 0);
        rn.field_b[1] = var6;
        rn.field_b[0] = 0.0f;
        rn.field_b[2] = 0.0f;
        rn.field_b[3] = (float)this.field_a.field_hb * var4 % 1.0f;
        jaggl.OpenGL.glTexGenfv(8193, 9474, rn.field_b, 0);
        if (param0 != -65) {
          field_d = (Vector2) null;
        }
        if (!this.field_g.field_d) {
          int var8 = (int)(var5 * (float)this.field_a.field_hb * 16.0f);
          this.field_a.a(this.field_g.field_c[var8 % 16], param0 ^ -66);
        } else {
          rn.field_b[2] = 0.0f;
          rn.field_b[0] = 0.0f;
          rn.field_b[1] = 0.0f;
          rn.field_b[3] = (float)this.field_a.field_hb * var5 % 1.0f;
          jaggl.OpenGL.glTexGenfv(8194, 9473, rn.field_b, 0);
        }
        this.field_a.a(false, 0);
    }

    final static int b(byte param0, int param1, int param2) {
        int var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param0 > -64) {
            field_d = (Vector2) null;
          }
          int var3_int = 0;
          int var4 = pt.field_a;
          while (var3_int < ne.field_g.length) {
            int var5 = rn.field_a[var3_int];
            if (0 <= var5) {
              int var6 = IntrusiveDeque.a(true, ne.field_g[var3_int], true);
              int var7 = -(var6 >> 1) + ri.field_a;
              var4 = var4 + pp.field_a;
              if (rl.a((byte) -21, param1, param2, var6 + (ud.field_g << 1), lp.field_h + (as.field_c << 1), -ud.field_g + var7, var4)) {
                int stackIn_9_0 = var5;
                return stackIn_9_0;
              }
              var4 = var4 + (pp.field_a + (as.field_c << 1) + lp.field_h);
            } else {
              var4 = var4 + ce.field_u;
            }
            var3_int++;
          }
          int stackIn_13_0 = -1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "rc.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        this.field_f.a(-23085, '\0');
        if (this.field_g.field_d) {
          this.field_a.a(false, 1);
          this.field_a.a(this.field_g.field_g, 1);
          this.field_a.a(false, 0);
        }
        if (param0) {
          field_e = (ej) null;
        }
    }

    static {
        field_e = new ej(12, 0, 1, 0);
        field_d = new Vector2();
    }
}
