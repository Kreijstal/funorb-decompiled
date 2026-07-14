/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends tm {
    static cg field_m;
    static String field_l;

    public static void a(byte param0) {
        field_m = null;
        if (param0 >= -5) {
            return;
        }
        field_l = null;
    }

    final static void i(int param0) {
        if (param0 != 3) {
            return;
        }
        ea.field_z = false;
        hr.field_y = 0 == kn.field_e.g(-83) ? true : false;
    }

    final int a(int param0, boolean param1) {
        if (0 == param0) {
            return 16777215;
        }
        if ((param0 ^ -1) == -9) {
            return 3355443;
        }
        if (!param1) {
            String discarded$0 = ((ul) this).a((byte) -72, -37);
        }
        return 7824981;
    }

    final static boolean a(char param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        if (Character.isISOControl(param0)) {
            return false;
        }
        if (!(!td.a(param0, (byte) 123))) {
            return true;
        }
        char[] var5 = pd.field_d;
        char[] var2 = var5;
        for (var3 = 0; var3 < var5.length; var3++) {
            var4 = var5[var3];
            if (param0 == var4) {
                return true;
            }
        }
        char[] var6 = g.field_o;
        var2 = var6;
        int var7 = 0;
        var3 = var7;
        while (var7 < var6.length) {
            var4 = var6[var7];
            if (!(param0 != var4)) {
                return true;
            }
            var7++;
        }
        if (param1 <= 123) {
            boolean discarded$0 = ul.a('￉', (byte) 82);
            return false;
        }
        return false;
    }

    final String a(byte param0, int param1) {
        if (param0 < 9) {
            return null;
        }
        return ae.field_b;
    }

    final void a(int param0, byte param1, pq[] param2) {
        int var4 = 0;
        int var5 = 0;
        eg var6 = null;
        eg stackIn_7_0 = null;
        eg stackOut_6_0 = null;
        eg stackOut_5_0 = null;
        L0: {
          if (param1 == -37) {
            break L0;
          } else {
            ul.a((byte) 26);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (-15 >= (var4 ^ -1)) {
            return;
          } else {
            L2: {
              var5 = 1 - (-var4 - var4 / 7);
              if (param0 == var5) {
                stackOut_6_0 = sf.field_E;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = jp.field_P;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var6 = stackIn_7_0;
            if (((ul) this).field_a[var5] != var6) {
              ((ul) this).field_a[var5] = var6;
              ((ul) this).a(false, param2[var5].field_G, var5);
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final static String a(byte param0, String param1, int param2) {
        eo var7 = null;
        CharSequence var10 = (CharSequence) (Object) param1;
        if (!(gj.a(-25908, var10))) {
            return p.field_g;
        }
        if (2 != th.field_a) {
            return qe.field_K;
        }
        eo var8 = gf.a(-83, param1);
        if (!(var8 != null)) {
            return nr.a(new String[1], -1, aa.field_f);
        }
        ma discarded$0 = cf.field_k.a((ma) (Object) var8, 0);
        while (true) {
            var7 = (eo) (Object) cf.field_k.f((byte) -5);
            if (var7 == null) {
                break;
            }
            var7.field_Mb = var7.field_Mb - 1;
        }
        var8.a((byte) -117);
        var8.a(false);
        nr.field_S = nr.field_S - 1;
        oq var9 = ej.field_j;
        var9.b(false, param2);
        var9.field_v = var9.field_v + 1;
        int var6 = -10 % ((param0 - 20) / 53);
        int var5 = var9.field_v;
        var9.a(1, false);
        var9.a(-9946, param1);
        var9.b(var9.field_v + -var5, true);
        return null;
    }

    final boolean c(int param0) {
        if (param0 != 2) {
            return true;
        }
        return false;
    }

    final void a(int param0, di param1) {
        if (param0 != 198123656) {
            field_l = null;
        }
    }

    final void a(di param0, byte param1) {
        Object var4 = null;
        L0: {
          if (param1 == 117) {
            break L0;
          } else {
            var4 = null;
            ((ul) this).a(-110, (byte) 38, (pq[]) null);
            break L0;
          }
        }
        if (((ul) this).field_a == null) {
          jp.field_P = eg.a(param0, "", "balls/TIKI/tiki_ball_halloween");
          sf.field_E = eg.a(param0, "", "balls/TIKI/tiki_ball_halloween_lit");
          jp.field_P.a(8, 8, 8, 8);
          sf.field_E.a(8, 8, 8, 8);
          ((ul) this).field_a = new eg[16];
          ((ul) this).field_a[0] = al.field_B[2].field_a[0];
          ((ul) this).field_a[15] = jp.field_P;
          ((ul) this).field_a[14] = jp.field_P;
          ((ul) this).field_a[13] = jp.field_P;
          ((ul) this).field_a[12] = jp.field_P;
          ((ul) this).field_a[11] = jp.field_P;
          ((ul) this).field_a[10] = jp.field_P;
          ((ul) this).field_a[9] = jp.field_P;
          ((ul) this).field_a[7] = jp.field_P;
          ((ul) this).field_a[6] = jp.field_P;
          ((ul) this).field_a[5] = jp.field_P;
          ((ul) this).field_a[4] = jp.field_P;
          ((ul) this).field_a[3] = jp.field_P;
          ((ul) this).field_a[2] = jp.field_P;
          ((ul) this).field_a[1] = jp.field_P;
          ((ul) this).field_a[8] = al.field_B[2].field_a[8];
          return;
        } else {
          return;
        }
    }

    ul() {
        ((ul) this).field_g = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "FULL ACCESS";
    }
}
