/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends qe {
    private tla field_d;
    private boolean field_c;
    static int field_e;
    static int[] field_f;
    static int field_g;

    final void a(int param0, int param1, kl param2) {
        try {
          if (param1 != 32221) {
            this.b(true, -91);
          }
          this.field_a.a(true, param2);
          this.field_a.d(1, param0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ma.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        int var3 = 33 % ((56 - param1) / 48);
        hoa var4 = this.field_a.n(16664);
        if (this.field_d == null) {
          this.field_a.b(34168, 3, 0, 770);
          return;
        }
        if (var4 == null) {
          this.field_a.b(34168, 3, 0, 770);
          return;
        }
        if (param0) {
          this.field_d.a(4864, '\0');
          this.field_a.e(1, true);
          this.field_a.a(true, var4);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadMatrixf(this.field_a.field_Tc.b((byte) 57), 0);
          jaggl.OpenGL.glMatrixMode(5888);
          this.field_a.e(0, true);
          this.field_c = true;
          return;
        }
        this.field_a.b(34168, 3, 0, 770);
    }

    final void a(boolean param0) {
        if (!this.field_c) {
          this.field_a.b(5890, 3, 0, 770);
        } else {
          this.field_d.a(4864, '\001');
          this.field_a.e(1, true);
          this.field_a.a(!param0 ? true : false, (kl) null);
          this.field_a.e(0, true);
        }
        this.field_a.setTextureCombineOperations(8448, 8960, 8448);
        this.field_c = param0 ? true : false;
    }

    final void a(int param0, int param1, int param2) {
        if (param2 < 117) {
          this.field_d = (tla) null;
        }
    }

    ma(OpenGlToolkit param0) {
        super(param0);
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = false;
        try {
          if (!param0.field_Kc) {
            return;
          }
          this.field_d = new tla(param0, 2);
          this.field_d.a((byte) 6, 0);
          this.field_a.e(1, true);
          this.field_a.setTextureCombineOperations(34165, 8960, 7681);
          this.field_a.setTextureCombineOperands(2, 0, 34168, 770);
          this.field_a.b(34167, 3, 0, 770);
          jaggl.OpenGL.glTexGeni(8192, 9472, 34066);
          jaggl.OpenGL.glTexGeni(8193, 9472, 34066);
          jaggl.OpenGL.glTexGeni(8194, 9472, 34066);
          jaggl.OpenGL.glEnable(3168);
          jaggl.OpenGL.glEnable(3169);
          jaggl.OpenGL.glEnable(3170);
          this.field_a.e(0, true);
          this.field_d.b((byte) 5);
          this.field_d.a((byte) 6, 1);
          this.field_a.e(1, true);
          this.field_a.setTextureCombineOperations(8448, 8960, 8448);
          this.field_a.setTextureCombineOperands(2, 0, 34166, 770);
          this.field_a.b(5890, 3, 0, 770);
          jaggl.OpenGL.glDisable(3168);
          jaggl.OpenGL.glDisable(3169);
          jaggl.OpenGL.glDisable(3170);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glMatrixMode(5888);
          this.field_a.e(0, true);
          this.field_d.b((byte) 22);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ma.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 9681) {
          ma.releaseStatics(37);
          field_f = null;
          return;
        }
        field_f = null;
    }

    final boolean b(int param0) {
        if (param0 != -11921) {
          ma.releaseStatics(-2);
          return true;
        }
        return true;
    }

    final void b(boolean param0, int param1) {
        if (param1 < 77) {
          return;
        }
        this.field_a.setTextureCombineOperations(8448, 8960, 7681);
    }

    static {
        field_e = 4;
        field_f = new int[]{15, 12, 18, 41, 16};
    }
}
