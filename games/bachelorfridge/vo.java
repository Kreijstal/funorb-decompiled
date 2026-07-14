/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vo {
    int field_e;
    static eq field_d;
    int field_f;
    int field_a;
    static sna field_b;
    static String field_c;

    abstract void a(int param0, int param1, int param2);

    abstract void a(byte param0, int param1, int param2);

    public static void a(byte param0) {
        Object var2 = null;
        field_d = null;
        field_b = null;
        if (param0 > -121) {
          var2 = null;
          pp discarded$2 = vo.a(-98, (lu) null);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final static pp a(int param0, lu param1) {
        nq var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = qi.a(param1, (byte) 96);
        var3 = param1.c((byte) -85);
        if (param0 > -37) {
          vo.a((byte) 104);
          var4 = param1.b(true);
          return (pp) (Object) new lia(var2, var3, var4);
        } else {
          var4 = param1.b(true);
          return (pp) (Object) new lia(var2, var3, var4);
        }
    }

    vo(int param0, int param1, int param2) {
        ((vo) this).field_e = param2;
        ((vo) this).field_f = param1;
        ((vo) this).field_a = param0;
    }

    abstract void b(int param0, int param1, int param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please enter a year between <%0> and <%1>";
    }
}
