/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static int[] field_c;
    static int[] field_d;
    static int field_a;
    static int field_b;

    final static od a(bb param0, int param1) {
        od var2 = null;
        Object var3 = null;
        if (param1 != 4) {
          var3 = null;
          od discarded$2 = ic.a((bb) null, -1);
          var2 = new od(param0, (wf) (Object) param0);
          lb.field_f.a((wf) (Object) var2, param1 ^ -112);
          of.field_a.a((ag) (Object) param0);
          return var2;
        } else {
          var2 = new od(param0, (wf) (Object) param0);
          lb.field_f.a((wf) (Object) var2, param1 ^ -112);
          of.field_a.a((ag) (Object) param0);
          return var2;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 1) {
            field_c = null;
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        if (param1 >= -18) {
          field_c = null;
          var3 = param2 >> -1304712577 & param0 - 1;
          return var3 + ((param2 >>> -1375802817) + param2) % param0;
        } else {
          var3 = param2 >> -1304712577 & param0 - 1;
          return var3 + ((param2 >>> -1375802817) + param2) % param0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[4];
        field_c = new int[256];
    }
}
