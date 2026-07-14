/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pr {
    private kda field_a;
    long field_c;
    private static String[] field_b;

    final static boolean a(int param0, int param1, int param2) {
        if (param1 != -23611) {
          field_b = null;
          return uk.a(param2, (byte) -128, param0) & foa.a(param0, param2, 0);
        } else {
          return uk.a(param2, (byte) -128, param0) & foa.a(param0, param2, 0);
        }
    }

    protected final void finalize() throws Throwable {
        ((pr) this).field_a.a(((pr) this).field_c, -6115);
        super.finalize();
    }

    final static void a(int param0, String param1, String param2) {
        L0: {
          if (ci.field_l != null) {
            ci.field_l.i((byte) 20);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 0) {
          field_b = null;
          vn.field_b = new jw(param1, param2, false, true, true);
          um.field_l.a(101, (ae) (Object) vn.field_b);
          return;
        } else {
          vn.field_b = new jw(param1, param2, false, true, true);
          um.field_l.a(101, (ae) (Object) vn.field_b);
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 28122) {
            boolean discarded$0 = pr.a(-61, 4, -35);
        }
    }

    pr(kda param0, long param1, int param2) {
        ((pr) this).field_a = param0;
        ((pr) this).field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[2];
        field_b[0] = "2x2";
        field_b[1] = "3x3";
    }
}
