/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lea extends kna {
    static String field_F;

    final boolean s(int param0) {
        if (param0 != -15254) {
            boolean discarded$0 = ((lea) this).n((byte) 87);
            return false;
        }
        return false;
    }

    fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        var4 = new fsa(param2, param0);
        var4.b((byte) -11, ((lea) this).field_k, ((lea) this).field_l);
        var4.h(0, 0);
        var4.a(0, (byte) -12, true);
        var4.a((byte) -3, 0);
        var4.b((byte) 17, false);
        var4.e(true, 125);
        if (param1 != 3) {
          field_F = null;
          var4.a(98, true);
          return var4;
        } else {
          var4.a(98, true);
          return var4;
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
            return -111;
        }
        return 7;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
    }

    public static void r(byte param0) {
        field_F = null;
        int var1 = 92 / ((-13 - param0) / 58);
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return true;
        }
        return false;
    }

    lea(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        ((lea) this).b(param0 ^ 14, 2097152, 2097152);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_F = null;
            return false;
        }
        return false;
    }

    lea(la param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "My Best: <%0>";
    }
}
