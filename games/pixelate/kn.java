/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends ie {
    static int field_O;
    static boolean field_L;
    static volatile boolean field_K;
    static String field_J;
    static int field_I;
    private bb field_N;
    static wm field_M;
    static String field_P;

    final void d(byte param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        nm var2 = new nm(((kn) this).field_N);
        ud var3 = (ud) (Object) var2.d(0);
        while (var3 != null) {
            if (!(!var3.c(false))) {
                var3.c(2779);
            }
            var3 = (ud) (Object) var2.a((byte) -104);
        }
        if (param0 < 99) {
            ((kn) this).a(-63, 101, 32, (byte) 105);
        }
        ((kn) this).field_H = (ng) (Object) ((kn) this).n(640);
    }

    final void b(int param0, ng param1) {
        if (!(param1 instanceof ud)) {
            throw new IllegalArgumentException();
        }
        ud var3 = (ud) (Object) param1;
        if (param0 != -6183) {
            field_L = true;
        }
        ((kn) this).field_N.b(param0 ^ -1392505192, (fa) (Object) var3);
        var3.field_N = true;
        boolean discarded$0 = var3.a((ng) this, 27);
    }

    final ng l(int param0) {
        nm var2 = null;
        ud var3 = null;
        int var4 = 0;
        L0: {
          var4 = Pixelate.field_H ? 1 : 0;
          if (param0 >= 48) {
            break L0;
          } else {
            ((kn) this).a((byte) 24);
            break L0;
          }
        }
        var2 = new nm(((kn) this).field_N);
        var3 = (ud) (Object) var2.d(0);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_N) {
              return var3.k(97);
            } else {
              var3 = (ud) (Object) var2.a((byte) -104);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var8 = Pixelate.field_H ? 1 : 0;
        if (((kn) this).field_y != null) {
            ((kn) this).field_y.a((ng) this, (byte) -124, param0, param2, true);
        }
        nm var5 = new nm(((kn) this).field_N);
        ng var6 = (ng) (Object) var5.b(-1);
        int var7 = 47 / ((param3 - 70) / 49);
        while (var6 != null) {
            var6.a(param0 - -((kn) this).field_p, param1, param2 + ((kn) this).field_z, (byte) 124);
            var6 = (ng) (Object) var5.e(-105);
        }
    }

    public kn() {
        super(0, 0, field_O, sl.field_c, (eb) null, (fn) null);
        ((kn) this).field_N = new bb();
    }

    final ud n(int param0) {
        nm var2 = null;
        ud var3 = null;
        int var4 = 0;
        L0: {
          var4 = Pixelate.field_H ? 1 : 0;
          if (param0 == 640) {
            break L0;
          } else {
            field_I = 105;
            break L0;
          }
        }
        var2 = new nm(((kn) this).field_N);
        var3 = (ud) (Object) var2.d(0);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_N) {
              return var3;
            } else {
              var3 = (ud) (Object) var2.a((byte) -104);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final static boolean a(boolean param0, int param1) {
        if (!param0) {
            field_J = null;
        }
        return param1 >= 2 ? true : false;
    }

    final void e(byte param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        if (param0 != 54) {
            ((kn) this).field_N = null;
        }
        nm var2 = new nm(((kn) this).field_N);
        ud var3 = (ud) (Object) var2.d(param0 ^ 54);
        while (var3 != null) {
            var3.field_N = false;
            var3 = (ud) (Object) var2.a((byte) -104);
        }
        ((kn) this).field_H = null;
    }

    public static void m(int param0) {
        if (param0 != 10504) {
            field_L = true;
        }
        field_M = null;
        field_J = null;
        field_P = null;
    }

    final void a(byte param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        if (param0 != -22) {
            ((kn) this).field_N = null;
        }
        nm var2 = new nm(((kn) this).field_N);
        ud var3 = (ud) (Object) var2.d(0);
        while (var3 != null) {
            if (!(!var3.a((byte) 123))) {
                var3.c(2779);
            }
            var3 = (ud) (Object) var2.a((byte) -104);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = true;
        field_O = 640;
        field_M = new wm(12, 0, 1, 0);
        field_P = "Next Puzzle";
    }
}
