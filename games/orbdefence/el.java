/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends ta implements bf, ai {
    private s field_H;
    static int[] field_A;
    private s field_J;
    we field_I;
    static long field_G;
    private oc field_C;
    static int field_D;
    static long field_F;

    public static void c(boolean param0) {
        if (param0) {
            field_F = 22L;
            field_A = null;
            return;
        }
        field_A = null;
    }

    private final void k(int param0) {
        if (!this.l(30765)) {
            return;
        }
        if (param0 > -39) {
            return;
        }
        qk.a(((el) this).field_C.field_l, (byte) 111);
    }

    private final int a(int param0, pj param1, String param2, int param3, int param4, String param5, int param6) {
        kk var9 = null;
        h var10 = null;
        if (param0 < 108) {
          return 63;
        } else {
          var10 = new h(20, param4, param3 + 120, 25, param1, false, 120, 3, lm.field_f, 16777215, param2);
          ((el) this).a((pj) (Object) var10, (byte) 74);
          var9 = new kk(((ib) (Object) param1).a((byte) -118), param5, 126, var10.field_r + param4, 25 + param3, param6);
          var9.field_h = (ag) this;
          ((el) this).a((pj) (Object) var9, (byte) 74);
          return var10.field_r + var9.field_r;
        }
    }

    public final void a(byte param0) {
        ((bc) (Object) ((el) this).field_C.a((byte) -104)).b((byte) 60);
        if (param0 != -8) {
            ((el) this).field_J = null;
        }
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (98 != param1) {
            if ((param1 ^ -1) != -100) {
              return false;
            } else {
              return ((el) this).b(param2, false);
            }
          } else {
            return ((el) this).a(param2, false);
          }
        }
    }

    private final boolean l(int param0) {
        Object var3 = null;
        if (!this.a(20, (ib) (Object) ((el) this).field_C)) {
          return false;
        } else {
          if (param0 != 30765) {
            var3 = null;
            boolean discarded$2 = this.a(123, (ib) null);
            return true;
          } else {
            return true;
          }
        }
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        int var6 = 0;
        if (param3 != ((el) this).field_H) {
          if (param3 == ((el) this).field_J) {
            this.k(-126);
            var6 = 45 / ((param0 - -3) / 62);
            return;
          } else {
            var6 = 45 / ((param0 - -3) / 62);
            return;
          }
        } else {
          sg.k(-16);
          var6 = 45 / ((param0 - -3) / 62);
          return;
        }
    }

    public el() {
        super(0, 0, 496, 0, (td) null);
        ((el) this).field_C = new oc("", (ag) null, 12);
        jc var1 = new jc(pc.field_bb, 0, 0, 0, 0, 16777215, -1, 3, 0, lm.field_f.field_H, -1, 2147483647, true);
        pj var2 = new pj(rf.field_A, (td) (Object) var1, (ag) null);
        ((el) this).field_J = new s(qk.field_b, (ag) null);
        ((el) this).field_H = new s(ob.field_D, (ag) null);
        ((el) this).field_C.field_i = bg.field_b;
        ((el) this).field_C.a((ga) (Object) new bc((vi) (Object) ((el) this).field_C), 22);
        ((el) this).field_J.field_F = false;
        ((el) this).field_J.field_j = (td) (Object) new vk();
        ((el) this).field_H.field_j = (td) (Object) new qc();
        ((el) this).field_C.field_j = (td) (Object) new fg(10000536);
        int var3 = 20;
        int var4 = 4;
        var2.a(20, var3, 50, (byte) -90, 270);
        int var5 = 200;
        var3 += 50;
        ((el) this).a(var2, (byte) 74);
        var3 = var3 + (5 + this.a(ja.field_b, (pj) (Object) ((el) this).field_C, var3, -53, 170, bh.field_a));
        ((el) this).field_J.a(-var5 + 496 >> -197427967, var3, 40, (byte) -90, var5);
        ((el) this).field_H.a(3 + var4, 15 + var3, 40, (byte) -90, 60);
        ((el) this).field_H.field_h = (ag) this;
        ((el) this).field_J.field_h = (ag) this;
        ((el) this).a((pj) (Object) ((el) this).field_J, (byte) 74);
        ((el) this).a((pj) (Object) ((el) this).field_H, (byte) 74);
        ((el) this).field_I = new we((bf) this);
        ((el) this).field_I.a(60 + ((el) this).field_C.field_m + ((el) this).field_C.field_s, 20, 150, (byte) -90, -((el) this).field_C.field_m + ((el) this).field_m + (-((el) this).field_C.field_s - 60));
        ((el) this).a((pj) (Object) ((el) this).field_I, (byte) 74);
        ((el) this).a(0, 0, var3 + 55 - -var4, (byte) -90, 496);
    }

    private final int a(String param0, pj param1, int param2, int param3, int param4, String param5) {
        int var7 = 120 % ((param3 - -5) / 42);
        return this.a(122, param1, param5, param4, param2, param0, 35);
    }

    public final void a(int param0, String param1) {
        oc var3 = null;
        String var4 = null;
        var3 = ((el) this).field_C;
        var4 = param1;
        ((vi) (Object) var3).a(0, false, var4);
        if (param0 <= 104) {
          ((el) this).field_J = null;
          return;
        } else {
          return;
        }
    }

    private final boolean a(int param0, ib param1) {
        ga var3 = null;
        qd var4 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var3 = param1.a((byte) 17);
        if (var3 == null) {
          return true;
        } else {
          if (param0 != 20) {
            return false;
          } else {
            L0: {
              var4 = var3.d(-7847);
              if (var4 != nc.field_bb) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((el) this).field_J.field_F = this.l(30765);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new int[8192];
    }
}
