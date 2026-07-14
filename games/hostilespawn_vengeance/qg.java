/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends lf {
    static int field_u;
    static String field_o;
    static String field_j;
    static bd field_q;
    static bd field_i;
    static bd field_m;
    private int field_f;
    static String field_s;
    static int field_p;
    static String field_r;
    static int field_n;
    static int field_l;
    private int field_k;
    private int field_h;
    private int field_t;
    static bd[] field_g;

    final static void b(byte param0) {
        if (param0 < 8) {
            field_n = 51;
        }
    }

    private final void a(int param0, byte param1) {
        ((qg) this).field_f = param0 * param0;
        if (param1 != 21) {
            qg.a(false);
        }
    }

    final void a(int param0, int param1, oj param2) {
        double var4 = 0.0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        if (param1 == 576) {
          var4 = param2.field_l.field_f + (double)param2.field_j.field_e - (double)((qg) this).field_k;
          var6 = (double)(-((qg) this).field_h) + (param2.field_l.field_a + (double)param2.field_j.field_g);
          var8 = (int)(var6 * var6 + var4 * var4);
          if (var8 > ((qg) this).field_f) {
            if (var8 < ((qg) this).field_t) {
              ((qg) this).field_d = (-var8 + ((qg) this).field_t) * (-((qg) this).field_b + ((qg) this).field_a) / (-((qg) this).field_f + ((qg) this).field_t) + ((qg) this).field_b;
              return;
            } else {
              ((qg) this).field_d = ((qg) this).field_b;
              return;
            }
          } else {
            ((qg) this).field_d = ((qg) this).field_a;
            return;
          }
        } else {
          var10 = null;
          ((qg) this).a(-75, -9, (oj) null);
          var4 = param2.field_l.field_f + (double)param2.field_j.field_e - (double)((qg) this).field_k;
          var6 = (double)(-((qg) this).field_h) + (param2.field_l.field_a + (double)param2.field_j.field_g);
          var8 = (int)(var6 * var6 + var4 * var4);
          if (var8 > ((qg) this).field_f) {
            if (var8 < ((qg) this).field_t) {
              ((qg) this).field_d = (-var8 + ((qg) this).field_t) * (-((qg) this).field_b + ((qg) this).field_a) / (-((qg) this).field_f + ((qg) this).field_t) + ((qg) this).field_b;
              return;
            } else {
              ((qg) this).field_d = ((qg) this).field_b;
              return;
            }
          } else {
            ((qg) this).field_d = ((qg) this).field_a;
            return;
          }
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public static void a(boolean param0) {
        field_r = null;
        field_s = null;
        field_m = null;
        field_g = null;
        field_q = null;
        if (!param0) {
          qg.a(false);
          field_j = null;
          field_o = null;
          field_i = null;
          return;
        } else {
          field_j = null;
          field_o = null;
          field_i = null;
          return;
        }
    }

    private final void a(int param0, int param1) {
        if (param1 < 34) {
          this.a(-118, -110);
          ((qg) this).field_t = param0 * param0;
          return;
        } else {
          ((qg) this).field_t = param0 * param0;
          return;
        }
    }

    qg(vi param0) {
        this.a(256, param0);
    }

    private final void a(int param0, vi param1) {
        Object var4 = null;
        ((qg) this).field_c = param1.l(param0 + 32014);
        ((qg) this).field_b = param1.l(32270);
        ((qg) this).field_a = param1.l(32270);
        if (param0 != 256) {
          var4 = null;
          ((qg) this).a(-53, -22, (oj) null);
          ((qg) this).field_k = param1.e(param0 + -248);
          ((qg) this).field_h = param1.e(8);
          this.a(param1.l(32270), (byte) 21);
          this.a(param1.l(32270), 42);
          return;
        } else {
          ((qg) this).field_k = param1.e(param0 + -248);
          ((qg) this).field_h = param1.e(8);
          this.a(param1.l(32270), (byte) 21);
          this.a(param1.l(32270), 42);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Loading extra data";
        field_u = 250;
        field_p = 256;
        field_s = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
