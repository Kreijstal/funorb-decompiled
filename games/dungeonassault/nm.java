/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends sj implements vg {
    private ck field_kb;
    static String field_lb;
    static String field_jb;
    static int[] field_ib;
    static String field_mb;

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
        if (param1 == 98) {
          if (param0 == ((nm) this).field_kb) {
            this.m(110);
            return;
          } else {
            return;
          }
        } else {
          field_mb = null;
          if (param0 != ((nm) this).field_kb) {
            return;
          } else {
            this.m(110);
            return;
          }
        }
    }

    private final void m(int param0) {
        int var2 = 106 % ((47 - param0) / 49);
        if (!((nm) this).field_T) {
            return;
        }
        ((nm) this).field_T = false;
    }

    private final ck a(int param0, pg param1, String param2) {
        ck var4 = null;
        int var5 = 0;
        var4 = new ck(param2, param1);
        var4.field_o = (ca) (Object) new na();
        var5 = ((nm) this).field_s + -6;
        if (param0 != 26414) {
          ((nm) this).field_kb = null;
          ((nm) this).field_s = ((nm) this).field_s + 38;
          var4.b(0, -16 + (((nm) this).field_x - 14), var5, 15, 30);
          ((nm) this).b((byte) -127, (lm) (Object) var4);
          ((nm) this).f(12591);
          return var4;
        } else {
          ((nm) this).field_s = ((nm) this).field_s + 38;
          var4.b(0, -16 + (((nm) this).field_x - 14), var5, 15, 30);
          ((nm) this).b((byte) -127, (lm) (Object) var4);
          ((nm) this).f(12591);
          return var4;
        }
    }

    nm(ji param0, r param1) {
        super(param0, 200, 150);
        Object var5 = null;
        lm var6 = null;
        String var7 = null;
        lm var8 = null;
        String var9 = null;
        lm var10 = null;
        String var11 = null;
        lm var12 = null;
        String var13 = null;
        lm var14 = null;
        var5 = null;
        if (param1 == gl.field_Gb) {
          var13 = oh.field_a;
          var14 = new lm(var13, (pg) null);
          var14.field_s = 80;
          var14.field_x = ((nm) this).field_x;
          var14.field_v = 50;
          var14.field_q = 0;
          var14.field_o = (ca) (Object) new hh(ta.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((nm) this).b((byte) -66, var14);
          ((nm) this).field_kb = this.a(26414, (pg) this, sp.field_b);
        } else {
          if (param1 == of.field_g) {
            var9 = jg.field_b;
            ((nm) this).field_s = ((nm) this).field_s + 10;
            if (eh.b(119)) {
              ((nm) this).field_s = ((nm) this).field_s + 20;
              var11 = ti.field_v;
              var12 = new lm(var11, (pg) null);
              var12.field_s = 80;
              var12.field_x = ((nm) this).field_x;
              var12.field_v = 50;
              var12.field_q = 0;
              var12.field_o = (ca) (Object) new hh(ta.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((nm) this).b((byte) -66, var12);
              ((nm) this).field_kb = this.a(26414, (pg) this, sp.field_b);
            } else {
              var10 = new lm(var9, (pg) null);
              var10.field_s = 80;
              var10.field_x = ((nm) this).field_x;
              var10.field_v = 50;
              var10.field_q = 0;
              var10.field_o = (ca) (Object) new hh(ta.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((nm) this).b((byte) -66, var10);
              ((nm) this).field_kb = this.a(26414, (pg) this, sp.field_b);
            }
          } else {
            if (param1 == mc.field_x) {
              ((nm) this).field_s = ((nm) this).field_s + 30;
              var7 = id.field_g;
              var8 = new lm(var7, (pg) null);
              var8.field_s = 80;
              var8.field_x = ((nm) this).field_x;
              var8.field_v = 50;
              var8.field_q = 0;
              var8.field_o = (ca) (Object) new hh(ta.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((nm) this).b((byte) -66, var8);
              ((nm) this).field_kb = this.a(26414, (pg) this, sp.field_b);
            } else {
              var6 = new lm((String) var5, (pg) null);
              var6.field_s = 80;
              var6.field_x = ((nm) this).field_x;
              var6.field_v = 50;
              var6.field_q = 0;
              var6.field_o = (ca) (Object) new hh(ta.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((nm) this).b((byte) -66, var6);
              ((nm) this).field_kb = this.a(26414, (pg) this, sp.field_b);
            }
          }
        }
    }

    public static void n(int param0) {
        field_lb = null;
        field_jb = null;
        field_ib = null;
        if (param0 != 38) {
            return;
        }
        field_mb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_lb = "A pathetic wretch; the runt's sole redeeming feature is its expendability, so common is its kind in the realm of Dungaria that it can be easily replaced.";
        field_jb = "Treasure: ";
        field_mb = "Hidden Nails";
    }
}
