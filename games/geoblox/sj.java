/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static tf field_g;
    private boolean field_c;
    private int field_d;
    private int[] field_f;
    static String field_e;
    static String field_b;
    private int field_a;

    final static void a(p param0, int param1, int param2) {
        try {
            rh.field_a.a(-81, param0);
            ol.a(param2, param0, 30175);
            int var3_int = -18 % ((param1 - 3) / 40);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "sj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        field_b = null;
        int var1 = -116 / ((param0 - 72) / 36);
    }

    final void a(int param0, int param1) {
        if (param0 > param1) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param1 > this.field_d) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param1 == this.field_d) {
            this.field_d = this.field_d - 1;
            return;
        }
        sf.a(this.field_f, 1 + param1, this.field_f, param1, -param1 + this.field_d);
        this.field_d = this.field_d - 1;
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        var4 = Geoblox.field_C;
        if (param1 != 1) {
          return 80;
        }
        var3 = this.field_f.length;
        while (param0 >= var3) {
          if (!this.field_c) {
            var3 = var3 + this.field_a;
            continue;
          }
          if (0 == var3) {
            var3 = 1;
            continue;
          }
          var3 = var3 * this.field_a;
        }
        return var3;
    }

    final int a(int param0, byte param1) {
        if (param1 != 94) {
            field_b = (String) null;
            if (param0 > this.field_d) {
                throw new ArrayIndexOutOfBoundsException(param0);
            }
            return this.field_f[param0];
        }
        if (param0 > this.field_d) {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        return this.field_f[param0];
    }

    final int a(byte param0) {
        if (param0 <= 28) {
            this.c(-55, 84);
            return this.field_d + 1;
        }
        return this.field_d + 1;
    }

    private final void a(int param0, int param1, int param2) {
        if (param1 == 1) {
            if (this.field_d < param2) {
                this.field_d = param2;
            }
            if (this.field_f.length <= param2) {
                this.c(param2, param1 ^ 25176);
            }
            this.field_f[param2] = param0;
            return;
        }
    }

    private final void c(int param0, int param1) {
        int[] var4 = new int[this.b(param0, 1)];
        int[] var3 = var4;
        if (param1 == 25177) {
            sf.a(this.field_f, 0, var4, 0, this.field_f.length);
            this.field_f = var4;
            return;
        }
        this.field_f = (int[]) null;
        sf.a(this.field_f, 0, var4, 0, this.field_f.length);
        this.field_f = var4;
    }

    final void b(int param0, byte param1) {
        this.a(param0, 1, 1 + this.field_d);
        int var3 = -48 % ((-39 - param1) / 50);
    }

    final static void a(java.applet.Applet param0, byte param1) {
        td.field_H = true;
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        long var4 = -1L;
        if (param1 <= 98) {
            return;
        }
        try {
            ea.a((byte) 115, var4, param0, var2, var3);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "sj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private sj() throws Throwable {
        throw new Error();
    }

    static {
        field_g = new tf();
        field_e = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_b = "This entry doesn't match";
    }
}
