/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends hn {
    static String field_K;
    static boolean field_L;

    final void a(boolean param0, kh param1) {
        if (param0) {
            field_K = null;
            super.a(param0, param1);
            return;
        }
        super.a(param0, param1);
    }

    uc(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean D(int param0) {
        if (param0 != 0) {
            ((uc) this).a(false, (kh) null);
            return true;
        }
        return true;
    }

    final fsa a(la param0, boolean param1, boolean param2) {
        if (!param1) {
            return null;
        }
        return null;
    }

    final fsa a(int param0, boolean param1, la param2) {
        eq var5 = null;
        cu var6 = null;
        kpa var7 = null;
        fsa var10 = null;
        mfa var11 = null;
        boa var12 = null;
        mfa var13 = null;
        boa var14 = null;
        var10 = new fsa(param2, param1);
        var10.b((byte) -11, 2097152, 2097152);
        var10.a((byte) -3, 4);
        var10.h(3, 0);
        var10.e(true, param0 + 116);
        var10.g(124, 1);
        var10.b((byte) 17, false);
        var10.b(false, 11468);
        var10.a(1, (byte) -12, true);
        var5 = new eq(param2, param1);
        var10.a((byte) 83, (nv) (Object) var5);
        var10.d(25, -1);
        var6 = new cu(param2, param1);
        var6.b((byte) 0, true);
        var6.b(1, 50, param0 + -5);
        var7 = var6.j((byte) -112);
        var7.a(false, 67);
        var7.a(0, -17075, true);
        var10.a((byte) 83, (nv) (Object) var6);
        if (param0 != 5) {
          field_L = true;
          var11 = rm.field_a;
          var12 = (boa) (Object) var11.a(7, 75);
          var12.b(124, 0);
          var10.a((gr) null, (byte) 124, (dg) (Object) var12);
          return var10;
        } else {
          var13 = rm.field_a;
          var14 = (boa) (Object) var13.a(7, 75);
          var14.b(124, 0);
          var10.a((gr) null, (byte) 124, (dg) (Object) var14);
          return var10;
        }
    }

    final boolean C(int param0) {
        if (param0 != 1) {
            uc.E(94);
            return true;
        }
        return true;
    }

    uc(la param0, int param1) {
        super(param0, param1);
    }

    public static void E(int param0) {
        if (param0 != 7) {
            uc.E(126);
            field_K = null;
            return;
        }
        field_K = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Hold to grab and drag objects. Press to drop a carried object.";
    }
}
