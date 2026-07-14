/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm extends al implements in {
    static int field_hb;
    static String[] field_gb;
    static ja field_lb;
    private gn field_kb;
    static int field_ib;
    static String field_jb;

    final static dm a(long param0, byte param1) {
        if (param1 > -35) {
            return null;
        }
        return (dm) (Object) kp.field_o.a(param0, -22877);
    }

    private final void l(int param0) {
        if (param0 != 0) {
            return;
        }
        if (!((vm) this).field_R) {
            return;
        }
        ((vm) this).field_R = false;
    }

    final static void d(int param0, int param1, int param2) {
        int var3 = -36 / ((param0 - 11) / 62);
        wp.a(param2, param1, 255, 0);
    }

    vm(vk param0, db param1) {
        super(param0, 200, 150);
        String var3 = null;
        String var5 = null;
        cf var6 = null;
        Object var7 = null;
        cf var8 = null;
        String var9 = null;
        cf var10 = null;
        cf var11 = null;
        var7 = null;
        if (param1 != gb.field_c) {
          if (hl.field_b == param1) {
            L0: {
              ((vm) this).field_w = ((vm) this).field_w + 10;
              var3 = on.field_cb;
              if (!gj.b(-26966)) {
                break L0;
              } else {
                var3 = sk.field_r;
                ((vm) this).field_w = ((vm) this).field_w + 20;
                break L0;
              }
            }
            var11 = new cf(var3, (bj) null);
            var11.field_n = ((vm) this).field_n;
            var11.field_i = 50;
            var11.field_w = 80;
            var11.field_y = 0;
            var11.field_h = (nl) (Object) new hq(cp.field_H, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((vm) this).b((byte) 70, var11);
            ((vm) this).field_kb = this.a((byte) -103, (bj) this, ic.field_f);
          } else {
            if (param1 == lp.field_s) {
              var9 = ga.field_t;
              var3 = var9;
              var3 = var9;
              ((vm) this).field_w = ((vm) this).field_w + 30;
              var10 = new cf(var9, (bj) null);
              var10.field_n = ((vm) this).field_n;
              var10.field_i = 50;
              var10.field_w = 80;
              var10.field_y = 0;
              var10.field_h = (nl) (Object) new hq(cp.field_H, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((vm) this).b((byte) 70, var10);
              ((vm) this).field_kb = this.a((byte) -103, (bj) this, ic.field_f);
            } else {
              var8 = new cf((String) var7, (bj) null);
              var8.field_n = ((vm) this).field_n;
              var8.field_i = 50;
              var8.field_w = 80;
              var8.field_y = 0;
              var8.field_h = (nl) (Object) new hq(cp.field_H, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((vm) this).b((byte) 70, var8);
              ((vm) this).field_kb = this.a((byte) -103, (bj) this, ic.field_f);
            }
          }
        } else {
          var5 = aa.field_j;
          var6 = new cf(var5, (bj) null);
          var6.field_n = ((vm) this).field_n;
          var6.field_i = 50;
          var6.field_w = 80;
          var6.field_y = 0;
          var6.field_h = (nl) (Object) new hq(cp.field_H, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((vm) this).b((byte) 70, var6);
          ((vm) this).field_kb = this.a((byte) -103, (bj) this, ic.field_f);
        }
    }

    public static void k(byte param0) {
        field_lb = null;
        if (param0 != -29) {
            field_lb = null;
            field_jb = null;
            field_gb = null;
            return;
        }
        field_jb = null;
        field_gb = null;
    }

    private final gn a(byte param0, bj param1, String param2) {
        gn var4 = null;
        int var5 = 0;
        var4 = new gn(param2, param1);
        var4.field_h = (nl) (Object) new oq();
        var5 = -6 + ((vm) this).field_w;
        ((vm) this).field_w = ((vm) this).field_w + 38;
        var4.b(15, var5, 28972, -16 + (-14 + ((vm) this).field_n), 30);
        ((vm) this).b((byte) 83, (cf) (Object) var4);
        if (param0 >= -71) {
          field_jb = null;
          ((vm) this).e(-1);
          return var4;
        } else {
          ((vm) this).e(-1);
          return var4;
        }
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        if (param3 > -83) {
            return;
        }
        if (((vm) this).field_kb == param2) {
            this.l(0);
        }
    }

    final static void a(String param0, int param1, String param2, String param3, int param4, int param5) {
        ka var6 = null;
        Object var7 = null;
        if (param5 != 0) {
          var7 = null;
          vm.a((String) null, -13, (String) null, (String) null, -118, 91);
          var6 = new ka(param4, param0, param1, param2, param3);
          vk.a(var6, (byte) 83);
          return;
        } else {
          var6 = new ka(param4, param0, param1, param2, param3);
          vk.a(var6, (byte) 83);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_jb = "Fear";
        field_ib = 4;
    }
}
