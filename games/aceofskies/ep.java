/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ep extends ab implements bh, dn {
    private mi field_v;
    static kp field_z;
    ek field_t;
    private kk field_w;
    static int[] field_u;
    private mi field_y;
    static String field_x;

    private final int a(ea param0, int param1, int param2, byte param3, String param4, String param5) {
        if (param3 <= 63) {
            return -73;
        }
        return this.a(param4, 126, param2, param0, 35, param5, param1);
    }

    public ep() {
        super(0, 0, 496, 0, (ir) null);
        ((ep) this).field_w = new kk("", (no) null, 12);
        qm var1 = new qm(oi.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, qo.field_b.field_I, -1, 2147483647, true);
        ea var2 = new ea(ta.field_f, (ir) (Object) var1, (no) null);
        ((ep) this).field_v = new mi(qf.field_k, (no) null);
        ((ep) this).field_y = new mi(dd.field_d, (no) null);
        ((ep) this).field_w.field_k = ht.field_e;
        ((ep) this).field_w.a((sp) (Object) new mp((bm) (Object) ((ep) this).field_w), 1472);
        ((ep) this).field_v.field_u = false;
        ((ep) this).field_v.field_e = (ir) (Object) new qb();
        ((ep) this).field_y.field_e = (ir) (Object) new wg();
        ((ep) this).field_w.field_e = (ir) (Object) new sl(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(50, 20, var3, 270, (byte) 124);
        var3 += 50;
        ((ep) this).a(var2, 1);
        var3 = var3 + (5 + this.a((ea) (Object) ((ep) this).field_w, 170, var3, (byte) 107, es.field_g, sc.field_b));
        ((ep) this).field_v.a(40, -var5 + 496 >> 1770372449, var3, var5, (byte) 126);
        ((ep) this).field_y.a(40, 3 + var4, var3 + 15, 60, (byte) 125);
        ((ep) this).field_y.field_o = (no) this;
        ((ep) this).field_v.field_o = (no) this;
        ((ep) this).a((ea) (Object) ((ep) this).field_v, 1);
        ((ep) this).a((ea) (Object) ((ep) this).field_y, 1);
        ((ep) this).field_t = new ek((bh) this);
        ((ep) this).field_t.a(150, ((ep) this).field_w.field_q + ((ep) this).field_w.field_p - -60, 20, -60 + -((ep) this).field_w.field_q + (-((ep) this).field_w.field_p + ((ep) this).field_q), (byte) 124);
        ((ep) this).a((ea) (Object) ((ep) this).field_t, 1);
        ((ep) this).a(var4 + 55 + var3, 0, 0, 496, (byte) 126);
    }

    public final void a(byte param0) {
        if (param0 != -77) {
          boolean discarded$2 = this.h(-43);
          ((mp) ((ep) this).field_w.a(0)).e(-104);
          return;
        } else {
          ((mp) ((ep) this).field_w.a(0)).e(-104);
          return;
        }
    }

    private final void d(byte param0) {
        if (!(this.h(25))) {
            return;
        }
        int var2 = 9 % ((param0 - -69) / 49);
        gj.a(true, ((ep) this).field_w.field_f);
    }

    private final int a(String param0, int param1, int param2, ea param3, int param4, String param5, int param6) {
        bc var10 = new bc(20, param2, 120 - -param6, 25, param3, false, 120, 3, qo.field_b, 16777215, param0);
        ((ep) this).a((ea) (Object) var10, param1 + -125);
        kb var9 = new kb(((mc) param3).a(0), param5, param1, param2 - -((bc) var10).field_n, 25 + param6, param4);
        var9.field_o = (no) this;
        ((ep) this).a((ea) (Object) var9, 1);
        return ((kb) var9).field_n + ((bc) var10).field_n;
    }

    private final boolean a(int param0, mc param1) {
        sp var3 = ((mc) param1).a(param0);
        if (!(var3 != null)) {
            return true;
        }
        pt var4 = ((sp) var3).b(true);
        return var4 == fd.field_a ? true : false;
    }

    final static void a(boolean param0, int param1) {
        if (param1 != 0) {
            return;
        }
        hg.a(param0, true, false);
    }

    final boolean a(int param0, int param1, char param2, ea param3) {
        int var5 = 0;
        if (this.a(108, param1, param2, param3)) {
          return true;
        } else {
          if (param1 == 98) {
            return ((ep) this).b(param3, -72);
          } else {
            var5 = 42 / ((param0 - -53) / 33);
            if ((param1 ^ -1) == -100) {
              return ((ep) this).a(80, param3);
            } else {
              return false;
            }
          }
        }
    }

    public static void g(int param0) {
        field_x = null;
        field_u = null;
        int var1 = -64 / ((param0 - 42) / 44);
        field_z = null;
    }

    final void a(byte param0, ea param1, int param2, int param3) {
        if (param0 <= 13) {
          ((ep) this).field_y = (mi) null;
          this.a((byte) 103, param1, param2, param3);
          ((ep) this).field_v.field_u = this.h(25);
          return;
        } else {
          this.a((byte) 103, param1, param2, param3);
          ((ep) this).field_v.field_u = this.h(25);
          return;
        }
    }

    public final void a(String param0, int param1) {
        kk var3 = null;
        String var4 = null;
        var3 = ((ep) this).field_w;
        var4 = param0;
        ((bm) (Object) var3).a(-20975, var4, false);
        if (param1 != 10000536) {
          boolean discarded$2 = this.h(50);
          return;
        } else {
          return;
        }
    }

    private final boolean h(int param0) {
        if (param0 == 25) {
          if (!this.a(0, (mc) (Object) ((ep) this).field_w)) {
            return false;
          } else {
            return true;
          }
        } else {
          field_z = (kp) null;
          if (!this.a(0, (mc) (Object) ((ep) this).field_w)) {
            return false;
          } else {
            return true;
          }
        }
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        int var6 = 0;
        if (param1 != ((ep) this).field_y) {
          if (((ep) this).field_v != param1) {
            var6 = 96 % ((param4 - -27) / 61);
            return;
          } else {
            this.d((byte) -128);
            var6 = 96 % ((param4 - -27) / 61);
            return;
          }
        } else {
          ua.e(4754);
          var6 = 96 % ((param4 - -27) / 61);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[8192];
        field_z = new kp();
    }
}
