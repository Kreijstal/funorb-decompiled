/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bta extends vw {
    private gf field_p;
    private mf field_r;
    private mf field_o;
    static java.awt.Color field_i;
    private boolean field_m;
    private boolean field_g;
    private boolean field_j;
    static il field_d;
    static int[] field_f;
    static int field_q;
    private float[] field_h;
    private boolean field_k;
    static int[] field_n;
    private mf field_e;
    private mf field_l;

    final void a(byte param0, int param1, int param2) {
        if (param0 != 55) {
          this.a(-124, false);
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
          field_i = (java.awt.Color) null;
        }
    }

    final void a(int param0, boolean param1) {
        this.field_k = param1 ? true : false;
        this.field_c.e(1, false);
        this.field_c.a(true, this.field_p);
        this.field_c.a(ln.field_F, (byte) -110, r.field_m);
        this.field_c.a(pea.field_c, 0, -30);
        this.field_c.a(ej.field_c, 2, -6219, true, false);
        this.field_c.a(0, false, lja.field_j);
        int var3 = -29 % ((param0 - 41) / 62);
        this.field_c.e(0, false);
        this.d(-124);
    }

    public static void d(boolean param0) {
        if (!param0) {
          field_f = null;
          field_i = null;
          field_n = null;
          field_d = null;
          return;
        }
        field_d = (il) null;
        field_f = null;
        field_i = null;
        field_n = null;
        field_d = null;
    }

    bta(kda param0, cn param1) {
        super(param0);
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        this.field_j = false;
        this.field_h = new float[4];
        try {
          if (param1 == null) {
            this.field_m = false;
            return;
          }
          if (!param0.field_qd) {
            this.field_m = false;
            return;
          }
          this.field_e = wd.a((byte) -70, param0, param1.a("gl", (byte) 122, "uw_ground_unlit"), 34336);
          this.field_l = wd.a((byte) -70, param0, param1.a("gl", (byte) 126, "uw_ground_lit"), 34336);
          this.field_r = wd.a((byte) -70, param0, param1.a("gl", (byte) 121, "uw_model_unlit"), 34336);
          this.field_o = wd.a((byte) -70, param0, param1.a("gl", (byte) 115, "uw_model_lit"), 34336);
          stackIn_6_0 = (this.field_r == null) ? 0 : 1;
          if (this.field_e == null) {
            stackIn_9_1 = 0;
          } else {
            stackIn_9_1 = 1;
          }
          if (null == this.field_l) {
            stackIn_12_2 = 0;
          } else {
            stackIn_12_2 = 1;
          }
          stackIn_14_0 = stackIn_6_0 & (stackIn_9_1 & stackIn_12_2);
          if (this.field_o == null) {
            stackIn_15_1 = 0;
          } else {
            stackIn_15_1 = 1;
          }
          if ((stackIn_14_0 & stackIn_15_1) == 0) {
            this.field_m = false;
            return;
          }
          this.field_p = this.field_c.a(true, 1, false, 2, new int[]{0, -1});
          this.field_p.a((byte) -77, false, false);
          this.field_m = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("bta.<init>(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var2Lifetime1;
        int var3Lifetime1;
        float var4Lifetime1;
        float var5Lifetime1;
        if (param0) {
          if (this.field_g) {
            var2 = this.field_c.XA();
            var3 = this.field_c.i();
            var4 = (float)var2 - (float)(var2 - var3) * 0.125f;
            var5 = (float)var2 - (float)(-var3 + var2) * 0.25f;
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0f / (float)this.field_c.g(false), (float)this.field_c.A(-2903) / 255.0f);
            this.field_c.e(1, false);
            this.field_c.g(3625, this.field_c.t(65280));
            this.field_c.e(0, false);
          }
          return;
        }
        this.a(false);
        if (this.field_g) {
          var2Lifetime1 = this.field_c.XA();
          var3Lifetime1 = this.field_c.i();
          var4Lifetime1 = (float)var2Lifetime1 - (float)(var2Lifetime1 - var3Lifetime1) * 0.125f;
          var5Lifetime1 = (float)var2Lifetime1 - (float)(-var3Lifetime1 + var2Lifetime1) * 0.25f;
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var5Lifetime1, var4Lifetime1, 1.0f / (float)this.field_c.g(false), (float)this.field_c.A(-2903) / 255.0f);
          this.field_c.e(1, false);
          this.field_c.g(3625, this.field_c.t(65280));
          this.field_c.e(0, false);
        }
    }

    final void a(int param0) {
        this.field_c.e(1, false);
        if (param0 < -4) {
          this.field_c.a(true, (iva) null);
          this.field_c.a(iw.field_c, (byte) -110, iw.field_c);
          this.field_c.a(ej.field_c, 0, -49);
          this.field_c.a(pea.field_c, 2, -53);
          this.field_c.a(0, false, ej.field_c);
          this.field_c.e(0, false);
          if (this.field_j) {
            this.field_c.a(ej.field_c, 0, -107);
            this.field_c.a(0, false, ej.field_c);
            this.field_j = false;
          }
          if (this.field_g) {
            jaggl.OpenGL.glBindProgramARB(34336, 0);
            jaggl.OpenGL.glDisable(34820);
            jaggl.OpenGL.glDisable(34336);
            this.field_g = false;
          }
          return;
        }
        this.a(73);
        this.field_c.a(true, (iva) null);
        this.field_c.a(iw.field_c, (byte) -110, iw.field_c);
        this.field_c.a(ej.field_c, 0, -49);
        this.field_c.a(pea.field_c, 2, -53);
        this.field_c.a(0, false, ej.field_c);
        this.field_c.e(0, false);
        if (this.field_j) {
          this.field_c.a(ej.field_c, 0, -107);
          this.field_c.a(0, false, ej.field_c);
          this.field_j = false;
        }
        if (this.field_g) {
          jaggl.OpenGL.glBindProgramARB(34336, 0);
          jaggl.OpenGL.glDisable(34820);
          jaggl.OpenGL.glDisable(34336);
          this.field_g = false;
        }
    }

    final void a(int param0, iva param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 24595) {
            return;
          }
          if (param1 != null) {
            if (this.field_j) {
              this.field_c.a(ej.field_c, 0, param2 ^ -24583);
              this.field_c.a(0, false, ej.field_c);
              this.field_j = false;
            }
            this.field_c.a(true, param1);
            this.field_c.a((byte) 114, param0);
          } else {
            if (!this.field_j) {
              this.field_c.a(true, this.field_c.field_Jb);
              this.field_c.a((byte) 120, 1);
              this.field_c.a(lja.field_j, 0, -21);
              this.field_c.a(0, false, lja.field_j);
              this.field_j = true;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("bta.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
          this.field_p = (gf) null;
          return this.field_m;
        }
        return this.field_m;
    }

    private final void d(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_1 = 0;
        int var2;
        asa var3;
        var2 = this.field_c.d(false);
        var3 = this.field_c.E(43);
        if (this.field_k) {
          stackIn_7_0 = 34336;
          if (var2 == 2147483647) {
            stackIn_8_1 = this.field_l.field_b;
          } else {
            stackIn_8_1 = this.field_o.field_b;
          }
          jaggl.OpenGL.glBindProgramARB(stackIn_7_0, stackIn_8_1);
        } else {
          stackIn_3_0 = 34336;
          if (var2 == 2147483647) {
            stackIn_4_1 = this.field_e.field_b;
          } else {
            stackIn_4_1 = this.field_r.field_b;
          }
          jaggl.OpenGL.glBindProgramARB(stackIn_3_0, stackIn_4_1);
        }
        jaggl.OpenGL.glEnable(34336);
        this.field_g = true;
        var3.a(32560, 0.0f, 0.0f, this.field_h, (float)var2, -1.0f);
        if (param0 > -123) {
          return;
        }
        jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field_h[0], this.field_h[1], this.field_h[2], this.field_h[3]);
        this.a(true);
    }

    static {
        field_i = new java.awt.Color(10040319);
        field_q = 0;
        field_n = new int[7];
        field_n[6] = 2;
        field_f = new int[7];
        field_n[2] = 0;
        field_n[0] = 0;
        field_n[3] = 1;
        field_n[4] = 1;
        field_n[5] = 2;
        field_n[1] = 0;
        field_f[4] = 3;
        field_f[0] = 6;
        field_f[3] = 2;
        field_f[2] = 4;
        field_f[5] = 0;
        field_f[6] = 1;
        field_f[1] = 5;
    }
}
