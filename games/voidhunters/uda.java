/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uda {
    static String field_c;
    static int field_b;
    pf field_d;
    static String field_a;

    abstract void a(int param0, int param1, int param2);

    void a(boolean param0) {
        if (!param0) {
            ((uda) this).d(-18);
        }
    }

    abstract void b(int param0, boolean param1);

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = VoidHunters.field_G;
        if (!po.field_o) {
          return;
        } else {
          nma.field_b = new da[5];
          var1 = 0;
          L0: while (true) {
            if (nma.field_b.length <= var1) {
              nkb.a(false, "Finished building fonts");
              if (param0 != -2283) {
                uda.b((byte) 81);
                return;
              } else {
                return;
              }
            } else {
              nma.field_b[var1] = og.field_r.a(ok.field_b[var1], djb.field_s[var1], smb.a((byte) -26, var1));
              var1++;
              continue L0;
            }
          }
        }
    }

    abstract void a(int param0, boolean param1);

    void c(int param0) {
        if (param0 != 5) {
            ((uda) this).a(-37);
        }
    }

    abstract void a(int param0);

    public static void b(byte param0) {
        field_a = null;
        if (param0 > -6) {
            uda.b(-56);
            field_c = null;
            return;
        }
        field_c = null;
    }

    void b(boolean param0) {
        if (!param0) {
            field_b = -18;
        }
    }

    void c(byte param0) {
        if (param0 != 15) {
            field_c = null;
        }
    }

    abstract boolean a(byte param0);

    abstract void a(byte param0, int param1, ura param2);

    uda(pf param0) {
        ((uda) this).field_d = param0;
    }

    void d(int param0) {
        if (param0 != 8) {
            ((uda) this).a(-80, -4, -126);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 8;
        field_a = "Players";
        field_c = "Add <%0> to ignore list";
    }
}
