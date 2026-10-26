/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rt implements ws {
    private int field_i;
    private boolean field_c;
    wl field_j;
    private boolean field_a;
    int field_b;
    int field_d;
    static String field_e;
    static tp field_h;
    int field_f;
    static String field_g;

    public static void c(byte param0) {
        if (param0 <= -30) {
          field_e = null;
          field_h = null;
          field_g = null;
          return;
        }
        field_e = (String) null;
        field_e = null;
        field_h = null;
        field_g = null;
    }

    private final void a(int param0, byte param1) {
        this.field_j.field_lb = this.field_j.field_lb - param0;
        this.field_j.field_lb = this.field_j.field_lb + this.c(4);
        if (param1 != 1) {
          this.field_j = (wl) null;
        }
    }

    final int a(int param0) {
        if (param0 < 58) {
          return -2;
        }
        return this.field_d;
    }

    protected final void finalize() throws Throwable {
        this.b((byte) -2);
        super.finalize();
    }

    final boolean a(boolean param0) {
        int var2 = 0;
        if (this.field_j.field_A) {
          var2 = this.c(4);
          this.field_j.a(this, 1);
          jaggl.OpenGL.glGenerateMipmapEXT(this.field_f);
          this.field_c = true;
          this.b(9987);
          this.a(var2, (byte) 1);
          return true;
        }
        if (!param0) {
          return false;
        }
        return true;
    }

    final void b(byte param0) {
        if (0 < this.field_d) {
          this.field_j.b(this.field_d, this.c(4), 121);
          this.field_d = 0;
        }
        int var2 = 81 / ((58 - param0) / 49);
    }

    private final int c(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 == 4) {
          var2 = this.field_j.e(param0 - 32338, this.field_b) * this.field_i;
          return this.field_c ? var2 * 4 / 3 : var2;
        }
        field_e = (String) null;
        var2Lifetime1 = this.field_j.e(param0 - 32338, this.field_b) * this.field_i;
        return this.field_c ? var2Lifetime1 * 4 / 3 : var2Lifetime1;
    }

    final void a(boolean param0, boolean param1) {
        int var3 = 0;
        if ((!param0 ? 1 : 0) != (!this.field_c ? 1 : 0)) {
          var3 = this.c(4);
          this.field_c = true;
          this.b(9987);
          this.a(var3, (byte) 1);
        }
        if (!param1) {
          return;
        }
        field_h = (tp) null;
    }

    final static void b(int param0, byte param1) {
        SoundPlayback var2 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        SoundPlayback var2Lifetime1;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          gn.field_a = param0;
          var2 = (SoundPlayback) (di.field_M.first(268435455));
          while (var2 != null) {
            if (!var2.field_i.isLinked((byte) 99)) {
              var2.unlink(-128);
            } else {
              var2.field_g.f(gn.field_a * var2.field_h + 128 >> 8);
            }
            var2 = (SoundPlayback) (di.field_M.next((byte) 103));
          }
          var3 = -52 % ((-46 - param1) / 52);
          if (null != ao.field_c) {
            var2Lifetime1 = (SoundPlayback) (ao.field_c.first(268435455));
            while (var2Lifetime1 != null) {
              if (var2Lifetime1.field_i.isLinked((byte) 82)) {
                var2Lifetime1.field_g.f(128 + var2Lifetime1.field_h * gn.field_a >> 8);
              } else {
                var2Lifetime1.unlink(-125);
              }
              var2Lifetime1 = (SoundPlayback) (ao.field_c.next((byte) 103));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2_ref), "rt.N(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        if ((!this.field_a ? 1 : 0) == (param0 ? 1 : 0)) {
          this.field_a = param0 ? true : false;
          this.b(9987);
          if (param1 != -128) {
            this.field_b = -89;
            return;
          }
          return;
        }
        if (param1 == -128) {
          return;
        }
        this.field_b = -89;
    }

    private final void b(int param0) {
        this.field_j.a(this, 1);
        if (!this.field_a) {
          jaggl.OpenGL.glTexParameteri(this.field_f, 10241, this.field_c ? 9984 : 9728);
          jaggl.OpenGL.glTexParameteri(this.field_f, 10240, 9728);
        } else {
          jaggl.OpenGL.glTexParameteri(this.field_f, 10241, this.field_c ? 9987 : 9729);
          jaggl.OpenGL.glTexParameteri(this.field_f, 10240, 9729);
        }
        if (param0 == 9987) {
          return;
        }
        this.field_j = (wl) null;
    }

    rt(wl param0, int param1, int param2, int param3, boolean param4) {
        this.field_a = false;
        try {
          this.field_f = param1;
          this.field_b = param2;
          this.field_i = param3;
          this.field_j = param0;
          this.field_c = param4 ? true : false;
          jaggl.OpenGL.glGenTextures(1, hd.field_c, 0);
          this.field_d = hd.field_c[0];
          this.a(0, (byte) 1);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "rt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_g = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
