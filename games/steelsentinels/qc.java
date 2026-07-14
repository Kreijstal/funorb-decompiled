/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc extends dl implements oj, ae {
    static int field_P;
    static int[] field_S;
    private oa field_T;
    static gh field_V;
    private bc field_Q;
    ij field_R;
    private oa field_U;

    private final boolean a(int param0, qn param1) {
        tl var3 = null;
        vd var4 = null;
        Object var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var3 = param1.a(false);
        if (var3 != null) {
          if (param0 <= 97) {
            L0: {
              var5 = null;
              boolean discarded$2 = ((qc) this).a(-76, 19, 'ￂ', (lh) null);
              var4 = var3.a((byte) 21);
              if (var4 != vf.field_b) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            L1: {
              var4 = var3.a((byte) 21);
              if (var4 != vf.field_b) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return true;
        }
    }

    public qc() {
        super(0, 0, 496, 0, (qk) null);
        ((qc) this).field_Q = new bc("", (tn) null, 12);
        cn var1 = new cn(rc.field_m, 0, 0, 0, 0, 16777215, -1, 3, 0, tj.field_e.field_G, -1, 2147483647, true);
        lh var2 = new lh(na.field_h, (qk) (Object) var1, (tn) null);
        ((qc) this).field_U = new oa(mb.field_D, (tn) null);
        ((qc) this).field_T = new oa(tj.field_b, (tn) null);
        ((qc) this).field_Q.field_v = lc.field_i;
        ((qc) this).field_Q.a(true, (tl) (Object) new ei((jf) (Object) ((qc) this).field_Q));
        ((qc) this).field_U.field_K = false;
        ((qc) this).field_U.field_p = (qk) (Object) new kh();
        ((qc) this).field_T.field_p = (qk) (Object) new bl();
        ((qc) this).field_Q.field_p = (qk) (Object) new ag(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(20, (byte) -117, var3, 270, 50);
        ((qc) this).a(var2, -100);
        var3 += 50;
        var3 = var3 + (this.a(170, var3, -95, (lh) (Object) ((qc) this).field_Q, bl.field_b, cf.field_s) - -5);
        ((qc) this).field_U.a(496 + -var5 >> -886189887, (byte) -82, var3, var5, 40);
        ((qc) this).field_T.a(3 + var4, (byte) -86, 15 + var3, 60, 40);
        ((qc) this).field_T.field_A = (tn) this;
        ((qc) this).field_U.field_A = (tn) this;
        ((qc) this).a((lh) (Object) ((qc) this).field_U, -89);
        ((qc) this).a((lh) (Object) ((qc) this).field_T, -116);
        ((qc) this).field_R = new ij((oj) this);
        ((qc) this).field_R.a(((qc) this).field_Q.field_x + (((qc) this).field_Q.field_o + 60), (byte) -126, 20, -((qc) this).field_Q.field_x + (-((qc) this).field_Q.field_o + ((qc) this).field_x - 60), 150);
        ((qc) this).a((lh) (Object) ((qc) this).field_R, -103);
        ((qc) this).a(0, (byte) -123, 0, 496, var4 + 55 + var3);
    }

    public final void a(int param0, String param1) {
        if (param0 != 20522) {
            return;
        }
        bc var3 = ((qc) this).field_Q;
        String var4 = param1;
        ((jf) (Object) var3).a(var4, 29597, false);
    }

    private final void i(int param0) {
        if (!this.h((byte) -100)) {
            return;
        }
        k.a((byte) 120, ((qc) this).field_Q.field_y);
        if (param0 != 55) {
            ((qc) this).a((byte) 61);
        }
    }

    public final void a(byte param0) {
        Object var3 = null;
        if (param0 != 86) {
          var3 = null;
          boolean discarded$2 = this.a(45, (qn) null);
          ((ei) (Object) ((qc) this).field_Q.a(false)).d(78);
          return;
        } else {
          ((ei) (Object) ((qc) this).field_Q.a(false)).d(78);
          return;
        }
    }

    private final boolean h(byte param0) {
        Object var3 = null;
        if (param0 <= -50) {
          if (!this.a(127, (qn) (Object) ((qc) this).field_Q)) {
            return false;
          } else {
            return true;
          }
        } else {
          var3 = null;
          int discarded$2 = this.a((String) null, -50, (lh) null, 71, (String) null, 5, -8);
          if (!this.a(127, (qn) (Object) ((qc) this).field_Q)) {
            return false;
          } else {
            return true;
          }
        }
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (98 == param1) {
            return ((qc) this).b(param3, 114);
          } else {
            if (-100 == (param1 ^ -1)) {
              return ((qc) this).b(-11963, param3);
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    private final int a(int param0, int param1, int param2, lh param3, String param4, String param5) {
        if (param2 > -68) {
          field_V = null;
          return this.a(param4, param1, param3, 35, param5, 3, param0);
        } else {
          return this.a(param4, param1, param3, 35, param5, 3, param0);
        }
    }

    private final int a(String param0, int param1, lh param2, int param3, String param4, int param5, int param6) {
        hc var10 = new hc(20, param1, 120 - -param6, 25, param2, false, 120, param5, tj.field_e, 16777215, param0);
        ((qc) this).a((lh) (Object) var10, param5 ^ -106);
        ff var9 = new ff(((qn) (Object) param2).a(false), param4, 126, var10.field_E + param1, 25 + param6, param3);
        var9.field_A = (tn) this;
        ((qc) this).a((lh) (Object) var9, -108);
        return var9.field_E + var10.field_E;
    }

    public static void j(int param0) {
        field_S = null;
        if (param0 != 60) {
            field_S = null;
            field_V = null;
            return;
        }
        field_V = null;
    }

    final void a(int param0, int param1, lh param2, int param3) {
        super.a(param0, 122, param2, param3);
        ((qc) this).field_U.field_K = this.h((byte) -103);
        if (param1 <= 56) {
            boolean discarded$0 = this.h((byte) 6);
        }
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        int var6 = 0;
        if (((qc) this).field_T != param3) {
          if (param3 != ((qc) this).field_U) {
            var6 = -2 % ((-85 - param1) / 36);
            return;
          } else {
            this.i(55);
            var6 = -2 % ((-85 - param1) / 36);
            return;
          }
        } else {
          il.a(103);
          var6 = -2 % ((-85 - param1) / 36);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = new int[]{40, 150, 135, 40, 85, 75, 70, 30, 0, 70, 100, 90};
    }
}
