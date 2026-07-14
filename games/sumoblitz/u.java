/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends hf implements ai {
    private wp field_O;
    static int field_P;

    u(dg param0, vf param1) {
        super(param0, 200, 150);
        String var3 = null;
        String var5 = null;
        pk var6 = null;
        Object var7 = null;
        pk var8 = null;
        String var9 = null;
        pk var10 = null;
        pk var11 = null;
        var7 = null;
        if (ku.field_I != param1) {
          if (am.field_e == param1) {
            L0: {
              ((u) this).field_p = ((u) this).field_p + 10;
              var3 = sr.field_c;
              if (!jt.a((byte) -96)) {
                break L0;
              } else {
                ((u) this).field_p = ((u) this).field_p + 20;
                var3 = c.field_t;
                break L0;
              }
            }
            var11 = new pk(var3, (qm) null);
            var11.field_p = 80;
            var11.field_q = ((u) this).field_q;
            var11.field_v = 50;
            var11.field_r = 0;
            var11.field_w = (mh) (Object) new gm(jm.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((u) this).a(var11, 96);
            ((u) this).field_O = this.a((byte) -105, (qm) this, jh.field_I);
          } else {
            if (param1 == ta.field_f) {
              ((u) this).field_p = ((u) this).field_p + 30;
              var9 = ua.field_i;
              var3 = var9;
              var3 = var9;
              var10 = new pk(var9, (qm) null);
              var10.field_p = 80;
              var10.field_q = ((u) this).field_q;
              var10.field_v = 50;
              var10.field_r = 0;
              var10.field_w = (mh) (Object) new gm(jm.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((u) this).a(var10, 96);
              ((u) this).field_O = this.a((byte) -105, (qm) this, jh.field_I);
            } else {
              var8 = new pk((String) var7, (qm) null);
              var8.field_p = 80;
              var8.field_q = ((u) this).field_q;
              var8.field_v = 50;
              var8.field_r = 0;
              var8.field_w = (mh) (Object) new gm(jm.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((u) this).a(var8, 96);
              ((u) this).field_O = this.a((byte) -105, (qm) this, jh.field_I);
            }
          }
        } else {
          var5 = fr.field_lb;
          var6 = new pk(var5, (qm) null);
          var6.field_p = 80;
          var6.field_q = ((u) this).field_q;
          var6.field_v = 50;
          var6.field_r = 0;
          var6.field_w = (mh) (Object) new gm(jm.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((u) this).a(var6, 96);
          ((u) this).field_O = this.a((byte) -105, (qm) this, jh.field_I);
        }
    }

    final static td a(ki param0, int param1, int param2) {
        byte[] var3 = null;
        byte[] var4 = null;
        if (param2 == 0) {
          var4 = param0.c(-14296, param1);
          var3 = var4;
          if (var4 == null) {
            return null;
          } else {
            return new td(var4);
          }
        } else {
          field_P = 21;
          var4 = param0.c(-14296, param1);
          var3 = var4;
          if (var4 == null) {
            return null;
          } else {
            return new td(var4);
          }
        }
    }

    private final void k(int param0) {
        if (!(((u) this).field_D)) {
            return;
        }
        ((u) this).field_D = false;
        if (param0 != 38) {
            field_P = -104;
        }
    }

    private final wp a(byte param0, qm param1, String param2) {
        int var4 = 112 % ((-21 - param0) / 53);
        wp var5 = new wp(param2, param1);
        var5.field_w = (mh) (Object) new ue();
        int var6 = ((u) this).field_p - 6;
        ((u) this).field_p = ((u) this).field_p + 38;
        var5.a(104, 15, var6, 30, -30 + ((u) this).field_q);
        ((u) this).a((pk) (Object) var5, 102);
        ((u) this).c(false);
        return var5;
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        if (((u) this).field_O != param2) {
          if (param1 != 710) {
            field_P = 55;
            return;
          } else {
            return;
          }
        } else {
          this.k(38);
          if (param1 == 710) {
            return;
          } else {
            field_P = 55;
            return;
          }
        }
    }

    final static void a(tv param0, int param1, byte param2, int param3, boolean param4) {
        Object var6 = null;
        ud stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        tv stackIn_1_3 = null;
        ud stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        tv stackIn_2_3 = null;
        ud stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        tv stackIn_3_3 = null;
        int stackIn_3_4 = 0;
        ud stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        tv stackOut_0_3 = null;
        ud stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        tv stackOut_2_3 = null;
        int stackOut_2_4 = 0;
        ud stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        tv stackOut_1_3 = null;
        int stackOut_1_4 = 0;
        L0: {
          stackOut_0_0 = qr.field_b;
          stackOut_0_1 = param2 + 88;
          stackOut_0_2 = 1000000;
          stackOut_0_3 = (tv) param0;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (param4) {
            stackOut_2_0 = (ud) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = (tv) (Object) stackIn_2_3;
            stackOut_2_4 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (ud) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = (tv) (Object) stackIn_1_3;
            stackOut_1_4 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        ((ud) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4 != 0, param3, param1);
        if (param2 != -87) {
          var6 = null;
          td discarded$2 = u.a((ki) null, -117, -123);
          return;
        } else {
          return;
        }
    }

    static {
    }
}
