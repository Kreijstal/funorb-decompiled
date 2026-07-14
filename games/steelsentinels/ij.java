/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends dl implements ae {
    static int field_X;
    private oj field_R;
    static String field_Q;
    static int field_W;
    static String field_P;
    private oa[] field_U;
    static String field_T;
    static int field_Y;
    static String field_S;
    static String field_V;
    private String[] field_Z;

    public static void a(byte param0) {
        field_T = null;
        if (param0 != -42) {
            field_Q = null;
        }
        field_S = null;
        field_V = null;
        field_P = null;
        field_Q = null;
    }

    final void a(boolean param0, String[] param1) {
        int var3 = 0;
        int var4_int = 0;
        bl var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = SteelSentinels.field_G;
          ((ij) this).field_K.g(6);
          if (param0) {
            break L0;
          } else {
            ((ij) this).field_Z = null;
            break L0;
          }
        }
        L1: {
          if (param1 == null) {
            break L1;
          } else {
            if (-1 != (param1.length ^ -1)) {
              var3 = param1.length;
              ((ij) this).field_Z = new String[var3];
              var4_int = 0;
              L2: while (true) {
                if (var4_int >= var3) {
                  var4 = new bl(tj.field_e, 0, 1);
                  ((ij) this).field_U = new oa[var3 - -1];
                  var5 = 0;
                  L3: while (true) {
                    if (var3 <= var5) {
                      ((ij) this).field_U[var3] = new oa(rc.field_f, (tn) this);
                      ((ij) this).field_U[var3].field_p = (qk) (Object) var4;
                      ((ij) this).field_U[var3].a(0, (byte) -126, 16 + (var3 * 16 + 20), 100, 15);
                      ((ij) this).a((lh) (Object) ((ij) this).field_U[var3], -114);
                      return;
                    } else {
                      ((ij) this).field_U[var5] = new oa(((ij) this).field_Z[var5], (tn) this);
                      ((ij) this).field_U[var5].field_p = (qk) (Object) var4;
                      ((ij) this).field_U[var5].field_v = un.field_f;
                      ((ij) this).field_U[var5].a(0, (byte) -120, var5 * 16 + 20, 80, 15);
                      ((ij) this).a((lh) (Object) ((ij) this).field_U[var5], -95);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  ((ij) this).field_Z[var4_int] = cn.a((byte) 90, (CharSequence) (Object) param1[var4_int]).replace(' ', ' ');
                  var4_int++;
                  continue L2;
                }
              }
            } else {
              break L1;
            }
          }
        }
        ((ij) this).field_Z = null;
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = SteelSentinels.field_G;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((ij) this).field_Z.length) {
            L1: {
              var6 = -108 % ((-85 - param1) / 36);
              if (((ij) this).field_U[((ij) this).field_Z.length] != param3) {
                break L1;
              } else {
                ((ij) this).field_R.a((byte) 86);
                break L1;
              }
            }
            return;
          } else {
            if (param3 == ((ij) this).field_U[var6]) {
              ((ij) this).field_R.a(20522, ((ij) this).field_Z[var6]);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if ((param1 ^ -1) == -99) {
            return ((ij) this).b(param3, 92);
        }
        if ((param1 ^ -1) == -100) {
            return ((ij) this).b(param0 ^ -22560, param3);
        }
        return false;
    }

    ij(oj param0) {
        super(0, 0, 0, 0, (qk) null);
        ((ij) this).field_R = param0;
    }

    final static int a(CharSequence param0, boolean param1) {
        int var4 = 0;
        int var5 = SteelSentinels.field_G;
        int var2 = param0.length();
        int var3 = 0;
        if (param1) {
            return -89;
        }
        for (var4 = 0; var2 > var4; var4++) {
            var3 = -var3 + ((var3 << -1503039835) + e.a(param0.charAt(var4), 732));
        }
        return var3;
    }

    final static void k(int param0) {
        int var1 = 0;
        if (32 >= lb.field_ac) {
            bb.a(0, (byte) 64);
        } else {
            var1 = lb.field_ac % 32;
            if (!(var1 != 0)) {
                var1 = 32;
            }
            bb.a(-var1 + lb.field_ac, (byte) 64);
        }
        if (param0 >= -15) {
            wk discarded$0 = ij.j(111);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -113, param2, param3);
        if (-1 != (param3 ^ -1)) {
            return;
        }
        if (param1 >= -99) {
            Object var6 = null;
            ((ij) this).a(false, (String[]) null);
        }
        mi var5 = tj.field_e;
        if (null != ((ij) this).field_Z) {
            int discarded$0 = var5.a(qi.field_h, param2 + ((ij) this).field_o, ((ij) this).field_z + param0, ((ij) this).field_x, 20, 16777215, -1, 0, 0, var5.field_F + var5.field_G);
        }
    }

    final static wk j(int param0) {
        int var4_int = 0;
        int var5 = SteelSentinels.field_G;
        int var1 = ca.field_r[0] * le.field_L[0];
        if (param0 != -100) {
            return null;
        }
        byte[] var2 = dl.field_L[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = ba.field_d[ec.a(255, (int) var2[var4_int])];
        }
        wk var4 = new wk(un.field_n, eb.field_n, rl.field_a[0], oa.field_M[0], le.field_L[0], ca.field_r[0], var3);
        uh.a(9324);
        return var4;
    }

    final static gk[] i(int param0) {
        int var2 = 0;
        int var3 = SteelSentinels.field_G;
        gk[] var1 = new gk[rl.field_d];
        for (var2 = 0; rl.field_d > var2; var2++) {
            var1[var2] = new gk(un.field_n, eb.field_n, rl.field_a[var2], oa.field_M[var2], le.field_L[var2], ca.field_r[var2], dl.field_L[var2], ba.field_d);
        }
        if (param0 >= -66) {
            field_W = 104;
        }
        uh.a(9324);
        return var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = "Training Complete";
        field_Y = -1;
        field_Q = "Average rating";
        field_V = "You can join this game";
        field_X = 0;
        field_S = "Enter name of friend to add to list";
    }
}
