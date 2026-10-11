/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pib implements mda {
    int field_c;
    private int field_a;
    int field_d;
    qfa field_g;
    int field_b;
    private boolean field_f;
    private boolean field_e;

    private final void d(int param0) {
        this.field_g.a(117, this);
        if (!this.field_f) {
          jaggl.OpenGL.glTexParameteri(this.field_b, 10241, this.field_e ? 9984 : 9728);
          jaggl.OpenGL.glTexParameteri(this.field_b, 10240, 9728);
        } else {
          jaggl.OpenGL.glTexParameteri(this.field_b, 10241, this.field_e ? 9987 : 9729);
          jaggl.OpenGL.glTexParameteri(this.field_b, 10240, 9729);
        }
        if (param0 == -22416) {
          return;
        }
        this.field_d = -87;
    }

    protected final void finalize() throws Throwable {
        this.e(0);
        super.finalize();
    }

    private final void a(int param0, int param1) {
        if (param0 == 0) {
          this.field_g.field_sb = this.field_g.field_sb - param1;
          this.field_g.field_sb = this.field_g.field_sb + this.a((byte) 108);
          return;
        }
    }

    final static int b(byte param0) {
        if (param0 != 118) {
          return 29;
        }
        return pqa.a(false, nua.field_p);
    }

    final static phb[] a(asb param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        phb[] stackIn_2_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 0) {
            stackIn_2_0 = (phb[]) null;
            return stackIn_2_0;
          }
          if (pa.a(param2, 2, param0, param1)) {
            return uja.a(false);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("pib.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void e(int param0) {
        if (param0 < this.field_c) {
          this.field_g.a(this.field_c, 109, this.a((byte) 124));
          this.field_c = 0;
        }
    }

    final boolean c(int param0) {
        int var2 = 0;
        if (this.field_g.field_U) {
          var2 = this.a((byte) 98);
          this.field_g.a(69, this);
          jaggl.OpenGL.glGenerateMipmapEXT(this.field_b);
          this.field_e = true;
          this.d(-22416);
          this.a(param0 ^ 9729, var2);
          return true;
        }
        if (param0 == 9729) {
          return false;
        }
        return true;
    }

    final int b(int param0) {
        if (param0 != 23307) {
          this.field_a = -41;
          return this.field_c;
        }
        return this.field_c;
    }

    private final int a(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 >= 93) {
          var2 = this.field_g.e(this.field_d, 2) * this.field_a;
          return !this.field_e ? var2 : var2 * 4 / 3;
        }
        this.field_g = (qfa) null;
        var2Lifetime1 = this.field_g.e(this.field_d, 2) * this.field_a;
        return !this.field_e ? var2Lifetime1 : var2Lifetime1 * 4 / 3;
    }

    final void a(int param0, boolean param1) {
        int var3 = 31 / ((param0 + 20) / 52);
        if (this.field_f != param1) {
          this.field_f = param1 ? true : false;
          this.d(-22416);
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        if (param1 != this.field_e) {
          var3 = this.a((byte) 99);
          this.field_e = true;
          this.d(-22416);
          this.a(0, var3);
        }
        if (param0 == 62) {
          return;
        }
        this.field_b = -88;
    }

    pib(qfa param0, int param1, int param2, int param3, boolean param4) {
        this.field_f = false;
        try {
          this.field_g = param0;
          this.field_d = param2;
          this.field_b = param1;
          this.field_a = param3;
          this.field_e = param4 ? true : false;
          jaggl.OpenGL.glGenTextures(1, ika.field_a, 0);
          this.field_c = ika.field_a[0];
          this.a(0, 0);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "pib.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
