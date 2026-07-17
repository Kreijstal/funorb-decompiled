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

    final static void a(p param0) {
        try {
            rh.field_a.a(-81, (hf) (Object) param0);
            int discarded$0 = 30175;
            ol.a(4, param0);
            int var3_int = 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "sj.A(" + (param0 != null ? "{...}" : "null") + 44 + -56 + 44 + 4 + 41);
        }
    }

    public static void a() {
        field_g = null;
        field_e = null;
        field_b = null;
        int var1 = 116;
    }

    final void a(int param0, int param1) {
        if (param0 <= param1) {
          if (param1 <= ((sj) this).field_d) {
            if (param1 != ((sj) this).field_d) {
              sf.a(((sj) this).field_f, 1 + param1, ((sj) this).field_f, param1, -param1 + ((sj) this).field_d);
              ((sj) this).field_d = ((sj) this).field_d - 1;
              return;
            } else {
              ((sj) this).field_d = ((sj) this).field_d - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    private final int b(int param0) {
        int var3 = 0;
        int var4 = 0;
        var4 = Geoblox.field_C;
        var3 = ((sj) this).field_f.length;
        L0: while (true) {
          if (param0 < var3) {
            return var3;
          } else {
            if (((sj) this).field_c) {
              if (0 == var3) {
                var3 = 1;
                continue L0;
              } else {
                var3 = var3 * ((sj) this).field_a;
                continue L0;
              }
            } else {
              var3 = var3 + ((sj) this).field_a;
              continue L0;
            }
          }
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != 94) {
            field_b = null;
            if (!(param0 <= ((sj) this).field_d)) {
                throw new ArrayIndexOutOfBoundsException(param0);
            }
            return ((sj) this).field_f[param0];
        }
        if (!(param0 <= ((sj) this).field_d)) {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        return ((sj) this).field_f[param0];
    }

    final int a(byte param0) {
        if (param0 <= 28) {
            this.c(-55, 84);
            return ((sj) this).field_d + 1;
        }
        return ((sj) this).field_d + 1;
    }

    private final void a(int param0, int param1, int param2) {
        if (!(((sj) this).field_d >= param2)) {
            ((sj) this).field_d = param2;
        }
        if (!(((sj) this).field_f.length > param2)) {
            this.c(param2, 25177);
        }
        ((sj) this).field_f[param2] = param0;
    }

    private final void c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int discarded$2 = 1;
        var4 = new int[this.b(param0)];
        var3 = var4;
        if (param1 != 25177) {
          ((sj) this).field_f = null;
          sf.a(((sj) this).field_f, 0, var4, 0, ((sj) this).field_f.length);
          ((sj) this).field_f = var4;
          return;
        } else {
          sf.a(((sj) this).field_f, 0, var4, 0, ((sj) this).field_f.length);
          ((sj) this).field_f = var4;
          return;
        }
    }

    final void b(int param0, byte param1) {
        this.a(param0, 1, 1 + ((sj) this).field_d);
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
            throw t.a((Throwable) (Object) runtimeException, "sj.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private sj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new tf();
        field_e = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_b = "This entry doesn't match";
    }
}
