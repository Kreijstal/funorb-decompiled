/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends tj implements he {
    static wk[] field_F;
    static int[] field_I;
    static String field_P;
    static String field_H;
    static int field_J;
    private fw field_G;
    static int field_N;
    private fw field_E;
    static kl field_M;
    static int field_Q;
    static rf field_K;
    static int[] field_O;
    private fw field_L;

    final boolean a(kb param0, int param1, char param2, int param3) {
        if (this.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if ((param1 ^ -1) != -99) {
            if ((param1 ^ -1) == -100) {
              return ((ce) this).b((byte) -126, param0);
            } else {
              return false;
            }
          } else {
            return ((ce) this).a(false, param0);
          }
        }
    }

    final static int[] a(int param0) {
        if (param0 > -26) {
            return null;
        }
        return new int[8];
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = param0 + ((ce) this).field_B;
        var6 = ((ce) this).field_p + param1;
        if (param2 >= -82) {
          field_F = null;
          int discarded$2 = ArmiesOfGielinor.field_J.a(aq.field_a, 20 + var5, var6 - -20, -40 + ((ce) this).field_l, -50 + ((ce) this).field_w, 16777215, -1, 1, 0, ArmiesOfGielinor.field_J.field_H);
          this.a(param0, param1, (byte) -107, param3);
          return;
        } else {
          int discarded$3 = ArmiesOfGielinor.field_J.a(aq.field_a, 20 + var5, var6 - -20, -40 + ((ce) this).field_l, -50 + ((ce) this).field_w, 16777215, -1, 1, 0, ArmiesOfGielinor.field_J.field_H);
          this.a(param0, param1, (byte) -107, param3);
          return;
        }
    }

    public static void k(int param0) {
        field_P = null;
        field_I = null;
        field_M = null;
        if (param0 != 12000) {
          field_Q = -81;
          field_H = null;
          field_K = null;
          field_F = null;
          field_O = null;
          return;
        } else {
          field_H = null;
          field_K = null;
          field_F = null;
          field_O = null;
          return;
        }
    }

    public ce() {
        super(0, 0, 476, 225, (kh) null);
        ((ce) this).field_L = new fw(li.field_p, (qo) null);
        ((ce) this).field_G = new fw(pt.field_Y, (qo) null);
        ((ce) this).field_E = new fw(pi.field_O, (qo) null);
        nu var1 = new nu();
        ((ce) this).field_L.field_k = (kh) (Object) var1;
        ((ce) this).field_G.field_k = (kh) (Object) var1;
        ((ce) this).field_E.field_k = (kh) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -1319432543;
        ((ce) this).field_G.a(((ce) this).field_l + -var3 >> 568564289, var4, ((ce) this).field_w - 48 + -var2, 8192, 30);
        ((ce) this).field_E.a((-var3 + ((ce) this).field_l >> 158666433) - -var4 + var2, var4, -var2 + ((ce) this).field_w - 48, 8192, 30);
        ((ce) this).field_L.a(-var3 + ((ce) this).field_l >> 1666722785, var3, -(2 * var2) + ((ce) this).field_w + -78, 8192, 30);
        ((ce) this).field_G.field_x = (qo) this;
        ((ce) this).field_L.field_x = (qo) this;
        ((ce) this).field_E.field_x = (qo) this;
        ((ce) this).field_L.field_s = hb.field_b;
        ((ce) this).field_E.field_s = vn.field_e;
        ((ce) this).a((byte) 10, (kb) (Object) ((ce) this).field_G);
        ((ce) this).a((byte) 10, (kb) (Object) ((ce) this).field_L);
        ((ce) this).a((byte) 10, (kb) (Object) ((ce) this).field_E);
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        int var7 = 0;
        Object var8 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((ce) this).field_G == param4) {
          ou.b((byte) 126);
          if (param1 != 11) {
            var8 = null;
            ((ce) this).a(47, 86, -42, 41, (fw) null);
            return;
          } else {
            return;
          }
        } else {
          if (((ce) this).field_L != param4) {
            if (((ce) this).field_E != param4) {
              if (param1 != 11) {
                var8 = null;
                ((ce) this).a(47, 86, -42, 41, (fw) null);
                return;
              } else {
                return;
              }
            } else {
              di.c((byte) -127);
              if (param1 == 11) {
                return;
              } else {
                var8 = null;
                ((ce) this).a(47, 86, -42, 41, (fw) null);
                return;
              }
            }
          } else {
            rq.a(false);
            if (param1 == 11) {
              return;
            } else {
              var8 = null;
              ((ce) this).a(47, 86, -42, 41, (fw) null);
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "(Exit)";
        field_Q = 640;
        field_H = "Your turn";
        field_I = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_J = 10;
        field_O = new int[]{12000, 9000, 7500, 6000, 4500, 3000, 1500};
    }
}
