/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends ub {
    static String field_J;
    private ah field_K;
    static long field_H;
    static ge field_M;
    static sh field_F;
    static tk field_G;
    static int[] field_N;
    static int field_I;
    static int field_L;

    final n a(byte param0) {
        tm var2 = null;
        rl var3 = null;
        int var4 = 0;
        L0: {
          var4 = HoldTheLine.field_D;
          var2 = new tm(((qj) this).field_K);
          if (param0 >= 120) {
            break L0;
          } else {
            field_L = 15;
            break L0;
          }
        }
        var3 = (rl) (Object) var2.c((byte) -120);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_F) {
              return var3.f((byte) 119);
            } else {
              var3 = (rl) (Object) var2.a((byte) -104);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final rl i(byte param0) {
        tm var2 = null;
        rl var3 = null;
        int var4 = 0;
        L0: {
          var4 = HoldTheLine.field_D;
          var2 = new tm(((qj) this).field_K);
          var3 = (rl) (Object) var2.c((byte) 89);
          if (param0 < -74) {
            break L0;
          } else {
            ((qj) this).field_K = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_F) {
              var3 = (rl) (Object) var2.a((byte) -104);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final void f(byte param0) {
        int var5 = HoldTheLine.field_D;
        tm var2 = new tm(((qj) this).field_K);
        int var4 = -22 % ((90 - param0) / 36);
        rl var3 = (rl) (Object) var2.c((byte) 30);
        while (var3 != null) {
            if (!(!var3.a(true))) {
                var3.d(0);
            }
            var3 = (rl) (Object) var2.a((byte) -104);
        }
    }

    public qj() {
        super(0, 0, ho.field_i, pe.field_e, (dh) null, (tb) null);
        ((qj) this).field_K = new ah();
    }

    final static void h(byte param0) {
        cg.field_b = new a();
        sm.field_c.a((n) (Object) cg.field_b, (byte) -99);
        int var1 = 95 / ((param0 - -54) / 53);
    }

    final void a(boolean param0) {
        int var4 = HoldTheLine.field_D;
        tm var2 = new tm(((qj) this).field_K);
        rl var3 = (rl) (Object) var2.c((byte) -2);
        while (var3 != null) {
            var3.field_F = false;
            var3 = (rl) (Object) var2.a((byte) -104);
        }
        ((qj) this).field_B = null;
        if (param0) {
            field_H = -70L;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = HoldTheLine.field_D;
        if (param0 != -9532) {
            qj.b(true);
        }
        if (null != ((qj) this).field_l) {
            ((qj) this).field_l.a(true, param2, -115, (n) this, param1);
        }
        tm var5 = new tm(((qj) this).field_K);
        n var6 = (n) (Object) var5.a(8115);
        while (var6 != null) {
            var6.a(param0, ((qj) this).field_o + param1, param2 - -((qj) this).field_k, param3);
            var6 = (n) (Object) var5.a(false);
        }
    }

    final void a(n param0, boolean param1) {
        rl var3 = null;
        try {
            if (!(param0 instanceof rl)) {
                throw new IllegalArgumentException();
            }
            var3 = (rl) (Object) param0;
            ((qj) this).field_K.a((hl) (Object) var3, param1);
            var3.field_F = true;
            boolean discarded$0 = var3.a((n) this, -25823);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "qj.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(boolean param0) {
        field_N = null;
        field_F = null;
        field_G = null;
        field_M = null;
        field_J = null;
    }

    final static void h(int param0) {
        pc.field_b = si.n(-49);
        ka.field_b = new qj();
        cg.a((byte) -109, true, true);
    }

    final void g(byte param0) {
        int var4 = HoldTheLine.field_D;
        tm var2 = new tm(((qj) this).field_K);
        if (param0 != -59) {
            Object var5 = null;
            ((qj) this).a((n) null, false);
        }
        rl var3 = (rl) (Object) var2.c((byte) 63);
        while (var3 != null) {
            if (!(!var3.g((byte) 39))) {
                var3.d(0);
            }
            var3 = (rl) (Object) var2.a((byte) -104);
        }
        ((qj) this).field_B = (n) (Object) ((qj) this).i((byte) -116);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Retry";
        field_M = new ge();
        field_F = new sh();
        field_N = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_I = -1;
        field_L = 0;
    }
}
