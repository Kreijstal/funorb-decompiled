/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kv extends tj implements he {
    private String[] field_H;
    static String field_J;
    private fw[] field_E;
    private mf field_G;
    static String field_I;
    static int field_F;

    final void a(int param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((kv) this).field_D.b(param0 + -11);
        if (param1 != null) {
            // ifeq L28
        } else {
            ((kv) this).field_H = null;
            return;
        }
        int var3 = param1.length;
        ((kv) this).field_H = new String[var3];
        for (var4_int = 0; var4_int < var3; var4_int++) {
            ((kv) this).field_H[var4_int] = ug.a(kf.b(param0, 116), (CharSequence) (Object) param1[var4_int]).replace(' ', ' ');
        }
        td var4 = new td(ArmiesOfGielinor.field_J, 0, 1);
        ((kv) this).field_E = new fw[var3 + 1];
        for (var5 = 0; var5 < var3; var5++) {
            ((kv) this).field_E[var5] = new fw(((kv) this).field_H[var5], (qo) this);
            ((kv) this).field_E[var5].field_k = (kh) (Object) var4;
            ((kv) this).field_E[var5].field_s = wl.field_J;
            ((kv) this).field_E[var5].a(0, 80, 20 - -(16 * var5), 8192, 15);
            ((kv) this).a((byte) 10, (kb) (Object) ((kv) this).field_E[var5]);
        }
        ((kv) this).field_E[var3] = new fw(h.field_h, (qo) this);
        ((kv) this).field_E[var3].field_k = (kh) (Object) var4;
        ((kv) this).field_E[var3].a(0, param0, var3 * 16 + 16 + 20, param0 ^ 8292, 15);
        ((kv) this).a((byte) 10, (kb) (Object) ((kv) this).field_E[var3]);
    }

    final static void a(int param0) {
        int[] var2 = new int[3];
        int[] var1 = var2;
        var2[0] = 1;
        var2[2] = 16777215;
        var2[1] = 14737632;
        ll.field_Rb = new vn(oh.field_J, ga.field_k, rs.field_n, var2, 0, 0);
        if (param0 != -28541) {
            field_F = 18;
        }
        le.field_b = new cg();
        tm.a();
        tm.b(0.75f);
    }

    final static fl k(int param0) {
        if (param0 != 5) {
            field_J = null;
        }
        if (iv.field_b == null) {
            iv.field_b = new fl();
            iv.field_b.a(13421772, ArmiesOfGielinor.field_J);
            iv.field_b.field_s = 7697781;
            iv.field_b.field_o = 14;
            iv.field_b.field_h = 0;
            iv.field_b.field_c = 2763306;
            iv.field_b.field_m = gl.field_e;
            iv.field_b.field_d = 4;
            iv.field_b.field_x = 6;
            iv.field_b.field_r = 5;
        }
        return iv.field_b;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        this.a(param0, param1, (byte) -95, param3);
        if (!(0 == param3)) {
            return;
        }
        ka var5 = ArmiesOfGielinor.field_J;
        if (param2 > -82) {
            kv.b(true);
        }
        if (!(((kv) this).field_H == null)) {
            int discarded$0 = var5.a(we.field_i, param0 + ((kv) this).field_B, param1 + ((kv) this).field_p, ((kv) this).field_l, 20, 16777215, -1, 0, 0, var5.field_L + var5.field_H);
        }
    }

    final static boolean a(boolean param0, CharSequence param1, char param2) {
        if (!(ph.a(-19, param2))) {
            return false;
        }
        if (param1 == null) {
            return false;
        }
        int var3 = param1.length();
        if (param0) {
            field_F = 103;
        }
        if (-13 >= (var3 ^ -1)) {
            return false;
        }
        if (!rs.a(param2, (byte) -87)) {
            return true;
        }
        if (var3 == 0) {
            return false;
        }
        return true;
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        if (param3 != -12215) {
            return false;
        }
        if (this.a(param0, param1, param2, param3 ^ 0)) {
            return true;
        }
        if (98 == param1) {
            return ((kv) this).a(false, param0);
        }
        if (-100 != (param1 ^ -1)) {
            return false;
        }
        return ((kv) this).b((byte) -125, param0);
    }

    kv(mf param0) {
        super(0, 0, 0, 0, (kh) null);
        ((kv) this).field_G = param0;
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 == 11) {
            break L0;
          } else {
            boolean discarded$2 = kv.a(false, (CharSequence) null, 'ﾪ');
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (((kv) this).field_H.length <= var6) {
            L2: {
              if (((kv) this).field_E[((kv) this).field_H.length] != param4) {
                break L2;
              } else {
                ((kv) this).field_G.a((byte) -116);
                break L2;
              }
            }
            return;
          } else {
            if (param4 == ((kv) this).field_E[var6]) {
              ((kv) this).field_G.a(-1, ((kv) this).field_H[var6]);
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_I = null;
        if (!param0) {
            return;
        }
        field_J = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "No special action";
        field_I = "You cannot use this equipment until turn <%0>.";
    }
}
