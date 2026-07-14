/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lu extends lk {
    static je field_u;
    static String field_v;

    lu(ka param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_H, -1, 2147483647, false);
    }

    public static void a(int param0) {
        field_v = null;
        field_u = null;
        if (param0 != 1) {
            field_v = null;
        }
    }

    lu(int param0) {
        this(ArmiesOfGielinor.field_J, param0);
    }

    final static void a(int param0, int param1) {
        bv var2 = null;
        var2 = vl.field_n;
        var2.h(32161, param1);
        if (param0 >= -99) {
          field_u = null;
          var2.b(1, 1);
          var2.b(1, 1);
          return;
        } else {
          var2.b(1, 1);
          var2.b(1, 1);
          return;
        }
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        L0: {
          if (param3) {
            qq.a(param0.field_l, param0.field_B + param1, param0.field_w, 94, param4 + param0.field_p);
            break L0;
          } else {
            break L0;
          }
        }
        this.a(param0, param1, -120, param3, param4);
        if (param2 > -79) {
          lu.a(-66, -37);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "<%0> / <%1> (+<%2>)";
    }
}
