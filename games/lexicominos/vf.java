/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf extends kd {
    private int field_j;
    private int field_t;
    int field_n;
    private int field_p;
    private int field_k;
    static aj field_m;
    private int field_q;
    int field_i;
    private String field_l;
    static int field_r;
    private int field_h;
    static String field_s;
    private int field_o;

    final void a(int param0, int param1, int param2) {
        ((vf) this).a(param2, (byte) 108, param0 * 24 + ((vf) this).field_k, ((vf) this).field_t);
        if (param1 != 32211) {
            ((vf) this).a(88, (byte) -108, 54, -70);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 82 / ((param1 - 28) / 58);
        ((vf) this).field_q = ((vf) this).field_n;
        ((vf) this).field_t = param3;
        ((vf) this).field_p = ((vf) this).field_i;
        ((vf) this).field_k = param2;
        ((vf) this).field_o = ((vf) this).field_h;
        ((vf) this).field_j = param0;
    }

    final void a(int param0, boolean param1) {
        if (!(-1 != (param0 ^ -1))) {
            ((vf) this).field_i = ((vf) this).field_t;
            ((vf) this).field_n = ((vf) this).field_k;
            ((vf) this).field_h = 0;
            return;
        }
        ((vf) this).field_h = ((vf) this).field_o * param0 / ((vf) this).field_j;
        ((vf) this).field_i = (((vf) this).field_p + -((vf) this).field_t) * param0 / ((vf) this).field_j + ((vf) this).field_t;
        ((vf) this).field_n = ((vf) this).field_k + param0 * (-((vf) this).field_k + ((vf) this).field_q) / ((vf) this).field_j;
        if (!param1) {
            field_s = null;
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 >= -14) {
          var2 = null;
          vf.a((kd) null, -20, (kd) null);
          field_m = null;
          field_s = null;
          return;
        } else {
          field_m = null;
          field_s = null;
          return;
        }
    }

    final static void a(boolean param0, sh param1) {
        db var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = new db(param1.a((byte) 127, "", "final_frame.jpg"), (java.awt.Component) (Object) ug.field_y);
        var3 = var2.field_p;
        var4 = var2.field_u;
        ja.b((byte) -126);
        nc.field_n = new db(var3, var4 * 3 / 4);
        if (param0) {
          return;
        } else {
          nc.field_n.b();
          var2.b(0, 0);
          jg.field_m = new db(var3, -nc.field_n.field_u + var4);
          jg.field_m.b();
          var2.b(0, -nc.field_n.field_u);
          jg.field_m.field_w = nc.field_n.field_u;
          pd.a(-22949);
          return;
        }
    }

    final void a(int param0, oj param1, int param2) {
        db var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        db var19 = null;
        var18 = Lexicominos.field_L ? 1 : 0;
        if (0 == ((vf) this).field_h) {
          eh.a(0, lg.field_c, param2 - -((vf) this).field_i, 0, ((vf) this).field_l, ((vf) this).field_n);
          if (param0 == 17517) {
            return;
          } else {
            ((vf) this).field_n = 31;
            return;
          }
        } else {
          var19 = ne.field_b[((vf) this).field_h % 32];
          var4 = var19;
          var5 = (ia.field_H.field_p + -var19.field_p) / 2;
          var6 = ((vf) this).field_l.length();
          var7 = (double)((vf) this).field_h * 3.141592653589793 / 64.0;
          var9 = (double)(var5 + (((vf) this).field_i + param2));
          var11 = (double)(var5 + ((vf) this).field_n);
          var13 = 24.0 * Math.cos(var7);
          var15 = 24.0 * Math.sin(var7);
          var17 = 0;
          L0: while (true) {
            if (var6 <= var17) {
              if (param0 != 17517) {
                ((vf) this).field_n = 31;
                return;
              } else {
                return;
              }
            } else {
              eb.a(29, param1, 0, var4, ((vf) this).field_l.charAt(var17), (int)Math.round(var11), (int)Math.round(var9));
              var11 = var11 + var15;
              var9 = var9 + var13;
              var17++;
              continue L0;
            }
          }
        }
    }

    final static void a(kd param0, int param1, kd param2) {
        Object var4 = null;
        L0: {
          if (null != param2.field_c) {
            param2.b((byte) -120);
            break L0;
          } else {
            break L0;
          }
        }
        param2.field_f = param0;
        param2.field_c = param0.field_c;
        param2.field_c.field_f = param2;
        param2.field_f.field_c = param2;
        if (param1 != 0) {
          var4 = null;
          vf.a((kd) null, 14, (kd) null);
          return;
        } else {
          return;
        }
    }

    vf(String param0, int param1, int param2, boolean param3) {
        ((vf) this).field_n = param2;
        ((vf) this).field_h = param3 ? 32 : 0;
        ((vf) this).field_l = param0;
        ((vf) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = -1;
        field_s = "This password is part of your Player Name, and would be easy to guess";
        field_m = new aj(13, 0, 1, 0);
    }
}
