/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kw extends qe {
    private tla field_g;
    static hea field_e;
    private uga field_d;
    private aaa field_c;
    private static String[] field_f;

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if ((param0 & 1) == 1) {
          if (!((kw) this).field_c.field_g) {
            var4 = ((kw) this).field_a.field_Oc % 4000 * 16 / 4000;
            ((kw) this).field_a.a(true, (kl) (Object) ((kw) this).field_c.field_f[var4]);
            if (param2 <= 117) {
              boolean discarded$4 = ((kw) this).b(-10);
              return;
            } else {
              return;
            }
          } else {
            ((kw) this).field_a.a(true, (kl) (Object) ((kw) this).field_c.field_h);
            hba.field_a[1] = 0.0f;
            hba.field_a[0] = 0.0f;
            hba.field_a[2] = 0.0f;
            hba.field_a[3] = (float)(((kw) this).field_a.field_Oc % 4000) / 4000.0f;
            jaggl.OpenGL.glTexGenfv(8194, 9473, hba.field_a, 0);
            if (param2 <= 117) {
              boolean discarded$5 = ((kw) this).b(-10);
              return;
            } else {
              return;
            }
          }
        } else {
          if (!((kw) this).field_c.field_g) {
            ((kw) this).field_a.a(true, (kl) (Object) ((kw) this).field_c.field_f[0]);
            if (param2 > 117) {
              return;
            } else {
              boolean discarded$6 = ((kw) this).b(-10);
              return;
            }
          } else {
            ((kw) this).field_a.a(true, (kl) (Object) ((kw) this).field_c.field_h);
            hba.field_a[3] = 0.0f;
            hba.field_a[2] = 0.0f;
            hba.field_a[0] = 0.0f;
            hba.field_a[1] = 0.0f;
            jaggl.OpenGL.glTexGenfv(8194, 9473, hba.field_a, 0);
            if (param2 > 117) {
              return;
            } else {
              boolean discarded$7 = ((kw) this).b(-10);
              return;
            }
          }
        }
    }

    final static java.awt.Canvas b() {
        return null != dq.field_f ? (java.awt.Canvas) (Object) dq.field_f : nma.field_l;
    }

    private final void a() {
        L0: {
          ((kw) this).field_g = new tla(((kw) this).field_a, 2);
          ((kw) this).field_g.a((byte) 6, 0);
          ((kw) this).field_a.e(1, true);
          ((kw) this).field_a.b(7681, 8960, 260);
          ((kw) this).field_a.c(0, 0, 34168, 768);
          jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
          jaggl.OpenGL.glEnable(3168);
          ((kw) this).field_a.e(0, true);
          jaggl.OpenGL.glTexEnvf(8960, 34163, 2.0f);
          if (((kw) this).field_c.field_g) {
            jaggl.OpenGL.glTexGeni(8194, 9472, 9217);
            jaggl.OpenGL.glTexGeni(8195, 9472, 9217);
            jaggl.OpenGL.glTexGenfv(8195, 9473, new float[4], 0);
            jaggl.OpenGL.glEnable(3170);
            jaggl.OpenGL.glEnable(3171);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          ((kw) this).field_g.b((byte) -119);
          ((kw) this).field_g.a((byte) 6, 1);
          ((kw) this).field_a.e(1, true);
          ((kw) this).field_a.b(8448, 8960, 8448);
          ((kw) this).field_a.c(0, 0, 5890, 768);
          jaggl.OpenGL.glDisable(3168);
          ((kw) this).field_a.e(0, true);
          jaggl.OpenGL.glTexEnvf(8960, 34163, 1.0f);
          if (((kw) this).field_c.field_g) {
            jaggl.OpenGL.glDisable(3170);
            jaggl.OpenGL.glDisable(3171);
            break L1;
          } else {
            break L1;
          }
        }
        ((kw) this).field_g.b((byte) 89);
    }

    kw(cka param0, aaa param1) {
        super(param0);
        try {
            ((kw) this).field_c = param1;
            int discarded$0 = -122;
            this.a();
            ((kw) this).field_d = new uga(((kw) this).field_a, 6406, 2, new byte[2], 6406);
            ((kw) this).field_d.a(76, false);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "kw.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        kh var3 = ql.field_k;
        var3.k(param0, -2988);
        var3.i(3, 0);
        var3.i(10, 0);
        var3.f(-1477662136, param2);
    }

    final boolean b(int param0) {
        if (param0 != -11921) {
            ((kw) this).field_d = null;
            return true;
        }
        return true;
    }

    final void a(int param0, int param1, kl param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 32221) {
                break L1;
              } else {
                ((kw) this).a(false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("kw.A(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void a(boolean param0, int param1) {
        float var4 = 0.0f;
        int var3 = -115 % ((56 - param1) / 48);
        if (((kw) this).field_a.field_Kb > 0) {
            var4 = -0.5f / (float)((kw) this).field_a.field_Kb;
            ((kw) this).field_a.e(1, true);
            hba.field_a[2] = var4;
            hba.field_a[0] = 0.0f;
            hba.field_a[3] = 0.25f + var4 * ((kw) this).field_a.field_Uc;
            hba.field_a[1] = 0.0f;
            jaggl.OpenGL.glPushMatrix();
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glTexGenfv(8192, 9474, hba.field_a, 0);
            jaggl.OpenGL.glPopMatrix();
            ((kw) this).field_a.a((float)((kw) this).field_a.field_Kb, true, 0.5f);
            ((kw) this).field_a.a(true, (kl) (Object) ((kw) this).field_d);
            ((kw) this).field_a.e(0, true);
        }
        ((kw) this).field_g.a(4864, ' ');
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glPushMatrix();
        jaggl.OpenGL.glScalef(0.25f, 0.25f, 1.0f);
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final static int a(int param0, int param1) {
        int var2 = (param0 * param0 >> 12) * param0 >> 12;
        int var3 = 6 * param0 - 61440;
        int var4 = (var3 * param0 >> 12) + 40960;
        return var4 * var2 >> 12;
    }

    public static void c() {
        field_e = null;
        field_f = null;
        int var1 = 0;
    }

    final void a(boolean param0) {
        L0: {
          ((kw) this).field_g.a(4864, '');
          if (((kw) this).field_a.field_Kb > 0) {
            ((kw) this).field_a.e(1, true);
            ((kw) this).field_a.a(true, (kl) null);
            ((kw) this).field_a.a(0.0f, true, 1.0f);
            ((kw) this).field_a.e(0, true);
            break L0;
          } else {
            break L0;
          }
        }
        ((kw) this).field_a.b(8448, 8960, 8448);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glPopMatrix();
        jaggl.OpenGL.glMatrixMode(5888);
        if (param0) {
          ((kw) this).b(true, 64);
          return;
        } else {
          return;
        }
    }

    final void b(boolean param0, int param1) {
        ((kw) this).field_a.b(260, 8960, 8448);
        if (param1 < 77) {
            kw.a(34, false, -44);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[4];
        field_f[2] = "bigticktime";
        field_f[1] = "quickticktime";
        field_f[0] = "info";
        field_f[3] = "mainlooptime";
    }
}
