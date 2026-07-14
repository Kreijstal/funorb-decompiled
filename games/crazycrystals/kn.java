/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends bo implements Cloneable {
    private int field_r;
    static int field_q;
    static dl field_p;

    final void c(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        if (param0) {
          var3 = -1 + s.field_o.length;
          var4 = (int)(3.0 * ((double)var3 * Math.random()));
          if (var4 >= 0) {
            if (var4 >= var3) {
              return;
            } else {
              ((kn) this).field_r = 1 - -var4;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    protected final Object clone() {
        kn var1 = (kn) super.clone();
        var1.field_r = var1.field_r;
        return (Object) (Object) var1;
    }

    final nj a(int param0, nj param1) {
        if (param0 != 23525) {
          f discarded$2 = ((kn) this).a(-78, (ea) null, 7, -88, (byte) 87, 74, (f[][]) null);
          return ng.a(dq.field_H, param1, (f) (Object) new kn((f) (Object) new kp(-1)), (byte) -83, wi.field_b);
        } else {
          return ng.a(dq.field_H, param1, (f) (Object) new kn((f) (Object) new kp(-1)), (byte) -83, wi.field_b);
        }
    }

    final f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        fq var10 = null;
        fq var11 = null;
        fn.field_j = fn.field_j - 3;
        if (param4 > -87) {
          f discarded$1 = ((kn) this).a(-12, (ea) null, -116, -77, (byte) 28, -29, (f[][]) null);
          mb.field_g = mb.field_g - 3;
          wd.field_j = wd.field_j - 1;
          mb.field_g = mb.field_g - ob.field_l;
          tm.field_f.a(32, (param5 + param2) * 12, (param3 - -param0) * 12, 60, (byte) -111);
          var10 = (fq) (Object) param1;
          ((kn) this).field_l.a(1 << var10.field_u, true, tm.field_e);
          return ((kn) this).field_l.a(param0, param1, param2, param3, (byte) -98, param5, param6);
        } else {
          mb.field_g = mb.field_g - 3;
          wd.field_j = wd.field_j - 1;
          mb.field_g = mb.field_g - ob.field_l;
          tm.field_f.a(32, (param5 + param2) * 12, (param3 - -param0) * 12, 60, (byte) -111);
          var11 = (fq) (Object) param1;
          ((kn) this).field_l.a(1 << var11.field_u, true, tm.field_e);
          return ((kn) this).field_l.a(param0, param1, param2, param3, (byte) -98, param5, param6);
        }
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        if (param0 != -21) {
            field_q = -71;
            return true;
        }
        return true;
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        dl[] stackIn_2_0 = null;
        dl[] stackIn_3_0 = null;
        dl[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        dl[] stackIn_7_0 = null;
        dl[] stackIn_8_0 = null;
        dl[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        dl[] stackIn_11_0 = null;
        dl[] stackIn_12_0 = null;
        dl[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        dl[] stackOut_10_0 = null;
        dl[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        dl[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        dl[] stackOut_6_0 = null;
        dl[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        dl[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        dl[] stackOut_1_0 = null;
        dl[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        dl[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var7 = 122 % ((param0 - 74) / 41);
        if (param1 == 24) {
          if (-25 != (param2 ^ -1)) {
            L0: {
              stackOut_10_0 = s.field_o;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (!jm.field_j) {
                stackOut_12_0 = (dl[]) (Object) stackIn_12_0;
                stackOut_12_1 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L0;
              } else {
                stackOut_11_0 = (dl[]) (Object) stackIn_11_0;
                stackOut_11_1 = ((kn) this).field_r;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L0;
              }
            }
            ((dl) (Object) stackIn_13_0[stackIn_13_1]).b(param4, param5 + -param2, param1 * 2, param2 * 3);
            return;
          } else {
            L1: {
              stackOut_6_0 = s.field_o;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (jm.field_j) {
                stackOut_8_0 = (dl[]) (Object) stackIn_8_0;
                stackOut_8_1 = ((kn) this).field_r;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L1;
              } else {
                stackOut_7_0 = (dl[]) (Object) stackIn_7_0;
                stackOut_7_1 = 0;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L1;
              }
            }
            ((dl) (Object) stackIn_9_0[stackIn_9_1]).a(param4, param5 + -param2);
            return;
          }
        } else {
          L2: {
            stackOut_1_0 = s.field_o;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!jm.field_j) {
              stackOut_3_0 = (dl[]) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L2;
            } else {
              stackOut_2_0 = (dl[]) (Object) stackIn_2_0;
              stackOut_2_1 = ((kn) this).field_r;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L2;
            }
          }
          ((dl) (Object) stackIn_4_0[stackIn_4_1]).b(param4, param5 + -param2, param1 * 2, param2 * 3);
          return;
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            field_q = 34;
            return 0;
        }
        return 0;
    }

    kn(f param0) {
        super(param0);
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        if (param5 != -87) {
          ((kn) this).field_r = 127;
          je.field_j = je.field_j + 64;
          b.field_a = b.field_a + 64;
          we.field_h = we.field_h + 128;
          fp.field_a = fp.field_a + 128;
          cn.field_e.a(64, param2 * 12, 12 * param1, 0, (byte) -111);
          ((kn) this).field_l.a((byte) 108, param0);
          return (f) (Object) new ig(param0, bd.field_n, ((kn) this).field_l, true);
        } else {
          je.field_j = je.field_j + 64;
          b.field_a = b.field_a + 64;
          we.field_h = we.field_h + 128;
          fp.field_a = fp.field_a + 128;
          cn.field_e.a(64, param2 * 12, 12 * param1, 0, (byte) -111);
          ((kn) this).field_l.a((byte) 108, param0);
          return (f) (Object) new ig(param0, bd.field_n, ((kn) this).field_l, true);
        }
    }

    public static void g(int param0) {
        int var1 = -57 % ((-51 - param0) / 48);
        field_p = null;
    }

    static {
    }
}
