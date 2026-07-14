/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends ql implements jk {
    private kf field_R;

    ii(eg param0, oc param1) {
        super(param0, 200, 150);
        Object var5 = null;
        w var6 = null;
        String var7 = null;
        w var8 = null;
        String var9 = null;
        w var10 = null;
        String var11 = null;
        w var12 = null;
        String var13 = null;
        w var14 = null;
        var5 = null;
        if (ri.field_c == param1) {
          var13 = lb.field_a;
          var14 = new w(var13, (vd) null);
          var14.field_j = ((ii) this).field_j;
          var14.field_v = 80;
          var14.field_t = 0;
          var14.field_o = 50;
          var14.field_i = (rd) (Object) new ik(cl.field_T, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((ii) this).b((byte) 104, var14);
          ((ii) this).field_R = this.a((vd) this, true, vk.field_d);
        } else {
          if (qg.field_a == param1) {
            ((ii) this).field_v = ((ii) this).field_v + 10;
            var9 = pj.field_B;
            if (n.c(-2147483648)) {
              var11 = ge.field_e;
              ((ii) this).field_v = ((ii) this).field_v + 20;
              var12 = new w(var11, (vd) null);
              var12.field_j = ((ii) this).field_j;
              var12.field_v = 80;
              var12.field_t = 0;
              var12.field_o = 50;
              var12.field_i = (rd) (Object) new ik(cl.field_T, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ii) this).b((byte) 104, var12);
              ((ii) this).field_R = this.a((vd) this, true, vk.field_d);
            } else {
              var10 = new w(var9, (vd) null);
              var10.field_j = ((ii) this).field_j;
              var10.field_v = 80;
              var10.field_t = 0;
              var10.field_o = 50;
              var10.field_i = (rd) (Object) new ik(cl.field_T, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ii) this).b((byte) 104, var10);
              ((ii) this).field_R = this.a((vd) this, true, vk.field_d);
            }
          } else {
            if (param1 == sg.field_i) {
              var7 = qj.field_db;
              ((ii) this).field_v = ((ii) this).field_v + 30;
              var8 = new w(var7, (vd) null);
              var8.field_j = ((ii) this).field_j;
              var8.field_v = 80;
              var8.field_t = 0;
              var8.field_o = 50;
              var8.field_i = (rd) (Object) new ik(cl.field_T, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ii) this).b((byte) 104, var8);
              ((ii) this).field_R = this.a((vd) this, true, vk.field_d);
            } else {
              var6 = new w((String) var5, (vd) null);
              var6.field_j = ((ii) this).field_j;
              var6.field_v = 80;
              var6.field_t = 0;
              var6.field_o = 50;
              var6.field_i = (rd) (Object) new ik(cl.field_T, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ii) this).b((byte) 104, var6);
              ((ii) this).field_R = this.a((vd) this, true, vk.field_d);
            }
          }
        }
    }

    private final void i(byte param0) {
        if (!(((ii) this).field_D)) {
            return;
        }
        ((ii) this).field_D = false;
        if (param0 != 124) {
            this.i((byte) -101);
        }
    }

    final static int a(String param0, boolean param1, int param2) {
        if (param2 != 0) {
            return 119;
        }
        if (param1) {
            return fb.field_m.b(param0);
        }
        return pb.field_i.b(param0);
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        Object var7 = null;
        L0: {
          if (((ii) this).field_R == param4) {
            this.i((byte) 124);
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 != 215535458) {
          var7 = null;
          kf discarded$2 = this.a((vd) null, true, (String) null);
          return;
        } else {
          return;
        }
    }

    private final kf a(vd param0, boolean param1, String param2) {
        kf var4 = new kf(param2, param0);
        var4.field_i = (rd) (Object) new v();
        int var5 = ((ii) this).field_v - 6;
        ((ii) this).field_v = ((ii) this).field_v + 38;
        var4.a(30, -30 + ((ii) this).field_j, param1, var5, 15);
        ((ii) this).b((byte) 56, (w) (Object) var4);
        ((ii) this).d(59);
        return var4;
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = 0;
          if (param0) {
            var4 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        var5 = 82 % ((-19 - param2) / 41);
        if (!param3) {
          if (param1) {
            var4++;
            return jf.field_C[var4];
          } else {
            return jf.field_C[var4];
          }
        } else {
          var4 += 2;
          if (!param1) {
            return jf.field_C[var4];
          } else {
            var4++;
            return jf.field_C[var4];
          }
        }
    }

    static {
    }
}
