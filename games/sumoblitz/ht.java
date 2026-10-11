/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ht implements ft {
    int field_j;
    private boolean field_f;
    fr field_d;
    int field_a;
    private int field_g;
    int field_c;
    static volatile int field_h;
    static String field_b;
    private boolean field_i;
    static hr[] field_e;

    final int c(int param0) {
        if (param0 > -97) {
          field_e = (hr[]) null;
          return this.field_j;
        }
        return this.field_j;
    }

    private final int b(boolean param0) {
        int var2 = this.field_d.d(this.field_a, -120) * this.field_g;
        if (!param0) {
          return this.field_f ? var2 * 4 / 3 : var2;
        }
        return -30;
    }

    final boolean a(boolean param0) {
        int var2 = 0;
        if (param0) {
          return false;
        }
        if (this.field_d.field_xc) {
          var2 = this.b(false);
          this.field_d.a(92, this);
          jaggl.OpenGL.glGenerateMipmapEXT(this.field_c);
          this.field_f = true;
          this.b(-71);
          this.a((byte) 86, var2);
          return true;
        }
        return false;
    }

    final void b(byte param0) {
        if (0 < this.field_j) {
          this.field_d.a(this.field_j, this.b(false), (byte) -10);
          this.field_j = 0;
        }
        if (param0 > 84) {
          return;
        }
        field_h = -53;
    }

    public static void a(byte param0) {
        if (param0 != -81) {
          ht.a((byte) 94);
          field_e = null;
          field_b = null;
          return;
        }
        field_e = null;
        field_b = null;
    }

    final void a(boolean param0, int param1) {
        if (param1 == 0) {
          if ((param0 ? 1 : 0) == (!this.field_i ? 1 : 0)) {
            this.field_i = param0 ? true : false;
            this.b(param1 ^ -112);
          }
          return;
        }
        this.field_a = 22;
        if ((param0 ? 1 : 0) == (!this.field_i ? 1 : 0)) {
          this.field_i = param0 ? true : false;
          this.b(param1 ^ -112);
        }
    }

    final static oh a(qj[] param0, on param1, byte param2) {
        int var3_int = 0;
        Object stackIn_25_0 = null;
        oh stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        int var5Lifetime1;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          for (var3_int = 0; param0.length > var3_int; var3_int++) {
            if (param0[var3_int] == null) {
              return null;
            }
            if (param0[var3_int].field_a <= 0L) {
              return null;
            }
          }
          var4 = 12 % ((param2 - 40) / 55);
          var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
          for (var5 = 0; param0.length > var5; var5++) {
            jaggl.OpenGL.glAttachObjectARB(var3_long, param0[var5].field_a);
          }
          jaggl.OpenGL.glLinkProgramARB(var3_long);
          jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, kh.field_b, 0);
          if (kh.field_b[0] == 0) {
            if (kh.field_b[0] == 0) {
              System.out.println("Shader linking failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, kh.field_b, 1);
            if (kh.field_b[1] > 1) {
              var11 = new byte[kh.field_b[1]];
              jaggl.OpenGL.glGetInfoLogARB(var3_long, kh.field_b[1], kh.field_b, 0, var11, 0);
              System.out.println(new String(var11));
            }
            if (kh.field_b[0] == 0) {
              var7 = 0;
              var5Lifetime1 = var7;
              while (param0.length > var7) {
                jaggl.OpenGL.glDetachObjectARB(var3_long, param0[var7].field_a);
                var7++;
              }
              jaggl.OpenGL.glDeleteObjectARB(var3_long);
              stackIn_25_0 = null;
              return (oh) (stackIn_25_0);
            }
          }
          stackIn_27_0 = new oh(param1, var3_long, param0);
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("ht.P(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        this.field_d.a(12, this);
        if (param0 <= -70) {
          if (this.field_i) {
            stackIn_8_0 = this.field_c;
            stackIn_8_1 = 10241;
            stackIn_9_2 = (this.field_f) ? 9987 : 9729;
            jaggl.OpenGL.glTexParameteri(stackIn_8_0, stackIn_8_1, stackIn_9_2);
            jaggl.OpenGL.glTexParameteri(this.field_c, 10240, 9729);
          } else {
            stackIn_4_0 = this.field_c;
            stackIn_4_1 = 10241;
            stackIn_5_2 = (!this.field_f) ? 9728 : 9984;
            jaggl.OpenGL.glTexParameteri(stackIn_4_0, stackIn_4_1, stackIn_5_2);
            jaggl.OpenGL.glTexParameteri(this.field_c, 10240, 9728);
          }
        } else {
          this.field_d = (fr) null;
          if (this.field_i) {
            stackIn_18_0 = this.field_c;
            stackIn_18_1 = 10241;
            stackIn_19_2 = (this.field_f) ? 9987 : 9729;
            jaggl.OpenGL.glTexParameteri(stackIn_18_0, stackIn_18_1, stackIn_19_2);
            jaggl.OpenGL.glTexParameteri(this.field_c, 10240, 9729);
          } else {
            stackIn_14_0 = this.field_c;
            stackIn_14_1 = 10241;
            stackIn_15_2 = (!this.field_f) ? 9728 : 9984;
            jaggl.OpenGL.glTexParameteri(stackIn_14_0, stackIn_14_1, stackIn_15_2);
            jaggl.OpenGL.glTexParameteri(this.field_c, 10240, 9728);
          }
        }
    }

    final void a(boolean param0, boolean param1) {
        int var3 = 0;
        if (param0) {
          if ((!param1 ? 1 : 0) != (!this.field_f ? 1 : 0)) {
            var3 = this.b(false);
            this.field_f = true;
            this.b(-119);
            this.a((byte) 45, var3);
          }
          return;
        }
    }

    protected final void finalize() throws Throwable {
        this.b((byte) 112);
        super.finalize();
    }

    private final void a(byte param0, int param1) {
        this.field_d.field_p = this.field_d.field_p - param1;
        if (param0 > 38) {
          this.field_d.field_p = this.field_d.field_p + this.b(false);
          return;
        }
    }

    final static lj c(boolean param0) {
        if (!param0) {
          return (lj) null;
        }
        return new lj(of.c(100), bt.b(77));
    }

    ht(fr param0, int param1, int param2, int param3, boolean param4) {
        this.field_i = false;
        try {
          this.field_g = param3;
          this.field_a = param2;
          this.field_f = param4 ? true : false;
          this.field_d = param0;
          this.field_c = param1;
          jaggl.OpenGL.glGenTextures(1, hg.field_m, 0);
          this.field_j = hg.field_m[0];
          this.a((byte) 78, 0);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ht.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_h = 0;
        field_b = "Confirm Password: ";
    }
}
