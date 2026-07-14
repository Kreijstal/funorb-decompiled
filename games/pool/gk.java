/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk extends tj implements tb {
    static String field_jb;
    static String field_lb;
    static int field_ib;
    static int field_hb;
    private fe field_gb;
    static boolean field_kb;

    private final void j(byte param0) {
        if (!(((gk) this).field_R)) {
            return;
        }
        ((gk) this).field_R = false;
        if (param0 != -59) {
            field_jb = null;
        }
    }

    final static boolean a(byte param0, oq param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 118) {
          L0: {
            gk.i((byte) 80);
            if (-2 != param1.e(1, 63)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-2 != param1.e(1, 63)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    gk(lq param0, he param1) {
        super(param0, 200, 150);
        String var3 = null;
        String var5 = null;
        ei var6 = null;
        Object var7 = null;
        ei var8 = null;
        String var9 = null;
        ei var10 = null;
        ei var11 = null;
        var7 = null;
        if (param1 != ic.field_c) {
          if (el.field_K == param1) {
            L0: {
              var3 = wh.field_i;
              ((gk) this).field_y = ((gk) this).field_y + 10;
              if (!je.b((byte) 124)) {
                break L0;
              } else {
                ((gk) this).field_y = ((gk) this).field_y + 20;
                var3 = rk.field_g;
                break L0;
              }
            }
            var11 = new ei(var3, (cc) null);
            var11.field_y = 80;
            var11.field_C = 0;
            var11.field_D = 50;
            var11.field_l = ((gk) this).field_l;
            var11.field_z = (fp) (Object) new am(qk.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((gk) this).a(true, var11);
            ((gk) this).field_gb = this.a(2391, hi.field_i, (cc) this);
          } else {
            if (param1 == ni.field_eb) {
              var9 = de.field_c;
              var3 = var9;
              var3 = var9;
              ((gk) this).field_y = ((gk) this).field_y + 30;
              var10 = new ei(var9, (cc) null);
              var10.field_y = 80;
              var10.field_C = 0;
              var10.field_D = 50;
              var10.field_l = ((gk) this).field_l;
              var10.field_z = (fp) (Object) new am(qk.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((gk) this).a(true, var10);
              ((gk) this).field_gb = this.a(2391, hi.field_i, (cc) this);
            } else {
              var8 = new ei((String) var7, (cc) null);
              var8.field_y = 80;
              var8.field_C = 0;
              var8.field_D = 50;
              var8.field_l = ((gk) this).field_l;
              var8.field_z = (fp) (Object) new am(qk.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((gk) this).a(true, var8);
              ((gk) this).field_gb = this.a(2391, hi.field_i, (cc) this);
            }
          }
        } else {
          var5 = lc.field_T;
          var6 = new ei(var5, (cc) null);
          var6.field_y = 80;
          var6.field_C = 0;
          var6.field_D = 50;
          var6.field_l = ((gk) this).field_l;
          var6.field_z = (fp) (Object) new am(qk.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((gk) this).a(true, var6);
          ((gk) this).field_gb = this.a(2391, hi.field_i, (cc) this);
        }
    }

    public static void i(byte param0) {
        if (param0 >= -44) {
            gk.i((byte) -8);
            field_jb = null;
            field_lb = null;
            return;
        }
        field_jb = null;
        field_lb = null;
    }

    private final fe a(int param0, String param1, cc param2) {
        fe var4 = null;
        int var5 = 0;
        var4 = new fe(param1, param2);
        var4.field_z = (fp) (Object) new ng();
        var5 = -6 + ((gk) this).field_y;
        ((gk) this).field_y = ((gk) this).field_y + 38;
        var4.a(-14 + ((gk) this).field_l - 16, 15, 30, false, var5);
        if (param0 != 2391) {
          return null;
        } else {
          ((gk) this).a(true, (ei) (Object) var4);
          ((gk) this).e((byte) -126);
          return var4;
        }
    }

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        if (!(param3 != ((gk) this).field_gb)) {
            this.j((byte) -59);
        }
        if (!param0) {
            field_lb = null;
            return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_lb = "Use the mouse wheel <img=1>, drag <img=11><img=0>, or <img=7>/<img=8>, or <img=12>/<img=14> to set the power.";
        field_jb = "<%0> and <%1> have won!";
        field_kb = true;
    }
}
