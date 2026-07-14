/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d extends jc {
    static boolean field_H;
    static int field_M;
    static String field_O;
    private jj field_A;
    static bg[] field_N;
    static int[] field_L;
    static he field_K;
    static String field_J;
    static nk field_I;

    final void b(boolean param0) {
        int var4 = Terraphoenix.field_V;
        k var2 = new k(((d) this).field_A);
        kh var3 = (kh) (Object) var2.a((byte) -13);
        if (param0) {
            field_N = null;
        }
        while (var3 != null) {
            var3.field_J = false;
            var3 = (kh) (Object) var2.c(55);
        }
        ((d) this).field_F = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = Terraphoenix.field_V;
        if (!(null == ((d) this).field_l)) {
            ((d) this).field_l.a(param3, (gl) this, param0, -24381, true);
        }
        k var5 = new k(((d) this).field_A);
        gl var6 = (gl) (Object) var5.b(94);
        while (var6 != null) {
            var6.a(param0 - -((d) this).field_w, -122, param2, param3 - -((d) this).field_u);
            var6 = (gl) (Object) var5.d(-96);
        }
        if (param1 > -106) {
            field_H = false;
        }
    }

    final void i(byte param0) {
        int var4 = Terraphoenix.field_V;
        k var2 = new k(((d) this).field_A);
        kh var3 = (kh) (Object) var2.a((byte) -13);
        if (param0 < 122) {
            field_I = null;
        }
        while (var3 != null) {
            if (var3.f((byte) -121)) {
                var3.b((byte) 12);
            }
            var3 = (kh) (Object) var2.c(101);
        }
        ((d) this).field_F = (gl) (Object) ((d) this).c(true);
    }

    final kh c(boolean param0) {
        k var2 = null;
        kh var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = Terraphoenix.field_V;
          var2 = new k(((d) this).field_A);
          var3 = (kh) (Object) var2.a((byte) -13);
          if (param0) {
            break L0;
          } else {
            var5 = null;
            ((d) this).a((gl) null, (byte) -108);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_J) {
              var3 = (kh) (Object) var2.c(42);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    public d() {
        super(0, 0, vk.field_c, be.field_v, (cj) null, (sc) null);
        ((d) this).field_A = new jj();
    }

    final void h(byte param0) {
        int var5 = Terraphoenix.field_V;
        k var2 = new k(((d) this).field_A);
        int var4 = -99 % ((param0 - 39) / 45);
        kh var3 = (kh) (Object) var2.a((byte) -13);
        while (var3 != null) {
            if (var3.i(113)) {
                var3.b((byte) 12);
            }
            var3 = (kh) (Object) var2.c(8);
        }
    }

    final gl e(byte param0) {
        k var2 = null;
        kh var3 = null;
        int var4 = 0;
        L0: {
          var4 = Terraphoenix.field_V;
          if (param0 == 82) {
            break L0;
          } else {
            ((d) this).a(-6, -54, -122, -16);
            break L0;
          }
        }
        var2 = new k(((d) this).field_A);
        var3 = (kh) (Object) var2.a((byte) -13);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_J) {
              var3 = (kh) (Object) var2.c(74);
              continue L1;
            } else {
              return var3.e((byte) -116);
            }
          } else {
            return null;
          }
        }
    }

    public static void g(byte param0) {
        field_J = null;
        field_I = null;
        field_L = null;
        field_N = null;
        field_K = null;
        field_O = null;
        int var1 = 17 / ((54 - param0) / 56);
    }

    final void a(gl param0, byte param1) {
        if (!(param0 instanceof kh)) {
            throw new IllegalArgumentException();
        }
        if (param1 != -1) {
            return;
        }
        kh var3 = (kh) (Object) param0;
        ((d) this).field_A.a((uf) (Object) var3, (byte) 0);
        var3.field_J = true;
        boolean discarded$0 = var3.a((byte) 14, (gl) this);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = " has fallen unconscious.";
        field_H = false;
        field_J = "FULL ACCESS";
        field_L = new int[]{100, 100, 100, 200, 300, 200, 300, 200, 200, 200, 300, 500, 500, 1000, 1000, 1000, 300};
        field_M = 0;
    }
}
