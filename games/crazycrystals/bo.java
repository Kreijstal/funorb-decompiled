/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bo extends pn {
    static int field_o;
    static int field_n;
    static String field_m;

    protected Object clone() {
        pn var1 = (pn) super.clone();
        var1.field_l = (f) ((bo) this).field_l.clone();
        return (Object) (Object) var1;
    }

    final void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        if (param0 < 92) {
            Object discarded$0 = ((bo) this).clone();
        }
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
            Object var5 = null;
            bo.a((un) null, (java.awt.Frame) null, -60);
            return (f) this;
        }
        return (f) this;
    }

    bo(f param0) {
        super(param0);
    }

    final static void a(un param0, java.awt.Frame param1, int param2) {
        gb var3 = null;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        L0: while (true) {
          var3 = param0.a(param1, (byte) -116);
          L1: while (true) {
            if (0 != var3.field_a) {
              if (var3.field_a != 1) {
                fh.a(true, 100L);
                continue L0;
              } else {
                if (param2 != 1) {
                  field_o = 104;
                  param1.setVisible(false);
                  param1.dispose();
                  return;
                } else {
                  param1.setVisible(false);
                  param1.dispose();
                  return;
                }
              }
            } else {
              fh.a(true, 10L);
              continue L1;
            }
          }
        }
    }

    public static void f(int param0) {
        if (param0 != 0) {
            bo.f(-4);
            field_m = null;
            return;
        }
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_m = "Unfortunately we are unable to create an account for you at this time.";
    }
}
