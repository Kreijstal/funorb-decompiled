/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en {
    private hm field_b;
    static String field_a;
    static String field_d;
    static hj field_c;
    static String field_e;

    final static boolean a(int param0, int param1, int param2) {
        boolean stackIn_5_0 = false;
        boolean stackIn_10_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_26_0 = false;
        boolean stackIn_32_0 = false;
        boolean stackIn_37_0 = false;
        boolean stackIn_42_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_55_0 = false;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = Pool.field_O;
        if (param2 >= 91) {
          var3 = param1;
          if (-1 == var3) {
            stackIn_32_0 = (fr.field_n == param0);
            return stackIn_32_0;
          }
          if (1 == var3) {
            stackIn_37_0 = (param0 == er.field_W);
            return stackIn_37_0;
          }
          if (var3 == 2) {
            stackIn_42_0 = (param0 == re.field_f);
            return stackIn_42_0;
          }
          if (var3 == 0) {
            stackIn_55_0 = (la.field_a == param0);
            return stackIn_55_0;
          }
          if (var3 != 3) {
            return true;
          }
          stackIn_50_0 = (param0 == un.field_e);
          return stackIn_50_0;
        }
        en.a(93, 66, 62);
        var3Lifetime1 = param1;
        if (-1 == var3Lifetime1) {
          stackIn_5_0 = (fr.field_n == param0);
          return stackIn_5_0;
        }
        if (1 == var3Lifetime1) {
          stackIn_10_0 = (param0 == er.field_W);
          return stackIn_10_0;
        }
        if (var3Lifetime1 == 2) {
          stackIn_15_0 = (param0 == re.field_f);
          return stackIn_15_0;
        }
        if (var3Lifetime1 == 0) {
          stackIn_20_0 = (la.field_a == param0);
          return stackIn_20_0;
        }
        if (var3Lifetime1 != 3) {
          return true;
        }
        stackIn_26_0 = (param0 == un.field_e);
        return stackIn_26_0;
    }

    final static void b(int param0) {
        if (param0 != 0) {
          return;
        }
        if (ne.field_w != sq.field_b) {
          qh.f(0, 0, qh.field_l, qh.field_f, 0);
          return;
        }
        qh.d();
    }

    private en() throws Throwable {
        throw new Error();
    }

    final void a(boolean param0, int param1, int param2) {
        hm var4 = new hm();
        if (!param0) {
          var4.a(66, 0, 0, 65536, 64);
          var4.b(true);
          this.field_b.a(3, var4);
          return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 == 8352) {
          field_c = null;
          field_a = null;
          field_e = null;
          return;
        }
        field_a = (String) null;
        field_c = null;
        field_a = null;
        field_e = null;
    }

    static {
        field_e = "<%0>";
        field_a = "<%0> has not yet unlocked this option for use.";
        field_d = "When in shot mode, the power bar will appear on the right. <u=ffffff>Rotating the cue</u> is the same as rotating around the table: <col=99ff99>Hold</col> the <img=2> <col=99ff99>right mouse button</col> (or <img=9>+<img=0> left mouse button) and <col=99ff99>drag the mouse</col>. Alternatively, you can use <img=6> and <img=5>, or <img=13> and <img=15>.";
        field_c = new hj(6, 0, 4, 2);
    }
}
