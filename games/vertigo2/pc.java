/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static cr field_b;
    static int[] field_a;
    static er field_c;
    static String field_d;

    final static byte[] a(byte param0, boolean param1, Object param2) {
        byte[] var3 = null;
        dh var4 = null;
        if (param2 == null) {
            return null;
        }
        if (!(!(param2 instanceof byte[]))) {
            var3 = (byte[]) param2;
            if (param1) {
                return kk.a(var3, (byte) 103);
            }
            return var3;
        }
        if (param0 != 6) {
            field_c = null;
            if (!(!(param2 instanceof dh))) {
                var4 = (dh) param2;
                return var4.b(117);
            }
            throw new IllegalArgumentException();
        }
        if (!(!(param2 instanceof dh))) {
            var4 = (dh) param2;
            return var4.b(117);
        }
        throw new IllegalArgumentException();
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final static void a(byte param0) {
        Object var2 = null;
        if (df.field_l == null) {
          lj.field_m = new ne();
          if (param0 < 50) {
            var2 = null;
            byte[] discarded$4 = pc.a((byte) 93, true, (Object) null);
            n.field_b.a(false, (iq) (Object) lj.field_m);
            return;
          } else {
            n.field_b.a(false, (iq) (Object) lj.field_m);
            return;
          }
        } else {
          df.field_l.h((byte) 125);
          lj.field_m = new ne();
          if (param0 >= 50) {
            n.field_b.a(false, (iq) (Object) lj.field_m);
            return;
          } else {
            var2 = null;
            byte[] discarded$5 = pc.a((byte) 93, true, (Object) null);
            n.field_b.a(false, (iq) (Object) lj.field_m);
            return;
          }
        }
    }

    final static void b(byte param0) {
        if (param0 != -111) {
            field_c = null;
        }
    }

    final static u a(u param0, int[] param1, int param2) {
        u var3 = null;
        if (param2 > -8) {
          return null;
        } else {
          var3 = new u(0, 0, 0);
          var3.field_l = param0.field_l;
          var3.field_k = param0.field_k;
          var3.field_h = param0.field_h;
          var3.field_m = param1;
          var3.field_e = param0.field_e;
          var3.field_c = param0.field_c;
          var3.field_n = param0.field_n;
          var3.field_d = param0.field_d;
          return var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<%0> has entered a game.";
    }
}
