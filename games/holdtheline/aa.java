/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends hl {
    static String field_m;
    long field_o;
    static String[] field_j;
    static uf field_q;
    static String field_p;
    int field_l;
    static int field_n;
    static boolean field_k;
    byte[] field_i;

    final static int a(boolean param0, int param1, int param2, int param3) {
        if (param2 != 1) {
            Object var5 = null;
            aa.a(-70, (gn) null);
            return em.a(true);
        }
        return em.a(true);
    }

    final static boolean a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        var2 = param0.charAt(0);
        var3 = param1;
        L0: while (true) {
          if (param0.length() > var3) {
            if (var2 == param0.charAt(var3)) {
              var3++;
              continue L0;
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        field_m = null;
        if (param0 <= 30) {
          aa.a(-108);
          field_j = null;
          field_p = null;
          field_q = null;
          return;
        } else {
          field_j = null;
          field_p = null;
          field_q = null;
          return;
        }
    }

    final static void a(int param0, gn param1) {
        hj var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = new hj(param1.a("", false, "final_frame.jpg"), (java.awt.Component) (Object) kd.field_b);
        var3 = var2.field_s;
        var4 = var2.field_y;
        lj.a((byte) -120);
        w.field_c = new hj(var3, var4 * 3 / 4);
        w.field_c.f();
        var2.b(0, 0);
        kh.field_l = new hj(var3, var4 - w.field_c.field_y);
        kh.field_l.f();
        var2.b(0, -w.field_c.field_y);
        kh.field_l.field_x = w.field_c.field_y;
        dm.b((byte) -10);
        if (param0 != -18916) {
          aa.a(-19);
          return;
        } else {
          return;
        }
    }

    aa(long param0, int param1, byte[] param2) {
        ((aa) this).field_o = param0;
        ((aa) this).field_l = param1;
        ((aa) this).field_i = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Powerups are activated by pressing <img=0>.";
        field_k = false;
    }
}
