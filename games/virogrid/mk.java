/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends dc implements ta {
    private tg field_db;
    static java.awt.Frame field_cb;
    static int[] field_gb;
    static int[] field_eb;
    static String field_fb;
    static mg field_bb;

    private final void g(boolean param0) {
        if (!((mk) this).field_G) {
            return;
        }
        ((mk) this).field_G = param0 ? true : false;
    }

    private final tg a(String param0, cd param1, byte param2) {
        tg var4 = new tg(param0, param1);
        var4.field_w = (ol) (Object) new hf();
        int var5 = -6 + ((mk) this).field_m;
        ((mk) this).field_m = ((mk) this).field_m + 38;
        var4.a(30, true, var5, 15, -14 + ((mk) this).field_g + -16);
        ((mk) this).a((fi) (Object) var4, (byte) -78);
        int var6 = -20 % ((param2 - -24) / 62);
        ((mk) this).d(false);
        return var4;
    }

    public static void k(int param0) {
        if (param0 != -16) {
            return;
        }
        field_gb = null;
        field_fb = null;
        field_cb = null;
        field_eb = null;
        field_bb = null;
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        if (!(param1 != ((mk) this).field_db)) {
            this.g(false);
        }
        if (param0 != 12085) {
            field_fb = null;
            return;
        }
    }

    final static boolean a(jc param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = param0.g(11132);
        if (param1 > -41) {
          L0: {
            mk.k(-49);
            if ((var2 ^ -1) != -2) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          var3 = stackIn_8_0;
          return var3 != 0;
        } else {
          L1: {
            if ((var2 ^ -1) != -2) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var3 = stackIn_4_0;
          return var3 != 0;
        }
    }

    mk(je param0, ra param1) {
        super(param0, 200, 150);
        String var3 = null;
        String var5 = null;
        fi var6 = null;
        Object var7 = null;
        fi var8 = null;
        String var9 = null;
        fi var10 = null;
        fi var11 = null;
        var7 = null;
        if (param1 != bj.field_h) {
          if (rg.field_b == param1) {
            L0: {
              var3 = tl.field_j;
              ((mk) this).field_m = ((mk) this).field_m + 10;
              if (!pb.a(4)) {
                break L0;
              } else {
                ((mk) this).field_m = ((mk) this).field_m + 20;
                var3 = ob.field_d;
                break L0;
              }
            }
            var11 = new fi(var3, (cd) null);
            var11.field_u = 50;
            var11.field_m = 80;
            var11.field_l = 0;
            var11.field_g = ((mk) this).field_g;
            var11.field_w = (ol) (Object) new aj(dk.field_j, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((mk) this).a(var11, (byte) -78);
            ((mk) this).field_db = this.a(je.field_I, (cd) this, (byte) 75);
            return;
          } else {
            if (param1 == lb.field_a) {
              ((mk) this).field_m = ((mk) this).field_m + 30;
              var9 = el.field_i;
              var3 = var9;
              var3 = var9;
              var10 = new fi(var9, (cd) null);
              var10.field_u = 50;
              var10.field_m = 80;
              var10.field_l = 0;
              var10.field_g = ((mk) this).field_g;
              var10.field_w = (ol) (Object) new aj(dk.field_j, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((mk) this).a(var10, (byte) -78);
              ((mk) this).field_db = this.a(je.field_I, (cd) this, (byte) 75);
              return;
            } else {
              var8 = new fi((String) var7, (cd) null);
              var8.field_u = 50;
              var8.field_m = 80;
              var8.field_l = 0;
              var8.field_g = ((mk) this).field_g;
              var8.field_w = (ol) (Object) new aj(dk.field_j, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((mk) this).a(var8, (byte) -78);
              ((mk) this).field_db = this.a(je.field_I, (cd) this, (byte) 75);
              return;
            }
          }
        } else {
          var5 = fd.field_x;
          var6 = new fi(var5, (cd) null);
          var6.field_u = 50;
          var6.field_m = 80;
          var6.field_l = 0;
          var6.field_g = ((mk) this).field_g;
          var6.field_w = (ol) (Object) new aj(dk.field_j, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((mk) this).a(var6, (byte) -78);
          ((mk) this).field_db = this.a(je.field_I, (cd) this, (byte) 75);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = "Scamming";
        field_eb = new int[5];
        field_gb = new int[8192];
    }
}
