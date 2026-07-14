/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo extends sd {
    private db field_z;
    static String field_A;
    static int field_B;

    final void k(int param0) {
        ((lo) this).field_u = new int[4];
        ((lo) this).field_r = param0;
        ((lo) this).field_x = 0;
        ((lo) this).field_q = null;
        ((lo) this).field_w = new int[4];
    }

    final static br a(bc param0, byte param1, int param2) {
        byte[] var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        var4 = 34 / ((param1 - -77) / 39);
        var5 = param0.a(false, param2);
        var3 = var5;
        if (var5 == null) {
          return null;
        } else {
          return new br(var5);
        }
    }

    final ln j(int param0) {
        Object var3 = null;
        if (param0 != 18229) {
          var3 = null;
          br discarded$2 = lo.a((bc) null, (byte) -92, -64);
          return (ln) (Object) ((lo) this).field_z.c(-127);
        } else {
          return (ln) (Object) ((lo) this).field_z.c(-127);
        }
    }

    final ln i(int param0) {
        if (param0 > -16) {
            return null;
        }
        return (ln) (Object) ((lo) this).field_z.a(-118);
    }

    final void a(int param0, ln param1) {
        ((lo) this).field_z.a((df) (Object) param1, 32);
        if (param0 != -21771) {
            field_A = null;
        }
    }

    lo(fs param0, ln param1) {
        super(param0, param1);
        ((lo) this).field_z = new db();
    }

    final int g(int param0) {
        int var2 = -24 % ((5 - param0) / 51);
        return ((lo) this).field_z.c((byte) 67);
    }

    final void a(pf param0, int param1) {
        if (param1 != -9332) {
            field_B = -68;
            throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    final ln h(int param0) {
        if (param0 != -23410) {
          ((lo) this).field_z = null;
          return (ln) (Object) ((lo) this).field_z.b(32);
        } else {
          return (ln) (Object) ((lo) this).field_z.b(32);
        }
    }

    public static void l(int param0) {
        if (param0 != 0) {
            return;
        }
        field_A = null;
    }

    final boolean e(int param0) {
        if (param0 != 27650) {
            return false;
        }
        return ((lo) this).field_z.a((byte) 25);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Find opponents";
    }
}
