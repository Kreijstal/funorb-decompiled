/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends dl implements ae {
    static int field_V;
    static String field_R;
    static wk[] field_Q;
    static boolean[] field_U;
    private oa field_W;
    static int[] field_S;
    static wk[] field_T;
    static String field_ab;
    private oa field_Y;
    private oa field_P;
    static int field_X;
    static wk[] field_Z;

    public static void i(int param0) {
        field_S = null;
        field_ab = null;
        field_Z = null;
        if (param0 != -48) {
            Object var2 = null;
            String discarded$0 = pd.a(115, (CharSequence) null);
        }
        field_R = null;
        field_U = null;
        field_T = null;
        field_Q = null;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 >= -99) {
            return;
        }
        int var5 = ((pd) this).field_o - -param2;
        int var6 = param0 + ((pd) this).field_z;
        int discarded$0 = tj.field_e.a(qj.field_j, var5 + 20, var6 - -20, -40 + ((pd) this).field_x, -50 + ((pd) this).field_E, 16777215, -1, 1, 0, tj.field_e.field_G);
        super.a(param0, (byte) -106, param2, param3);
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = SteelSentinels.field_G;
          var6 = 70 % ((param1 - -85) / 36);
          if (((pd) this).field_Y == param3) {
            il.a(125);
            break L0;
          } else {
            if (param3 != ((pd) this).field_P) {
              if (((pd) this).field_W == param3) {
                qg.a((byte) -26);
                break L0;
              } else {
                break L0;
              }
            } else {
              nj.h((byte) 45);
              break L0;
            }
          }
        }
    }

    final static void j(int param0) {
        ib.field_b = 0;
        ba.b(false);
        if (param0 != 13171) {
            pd.j(39);
        }
    }

    public pd() {
        super(0, 0, 476, 225, (qk) null);
        ((pd) this).field_P = new oa(tk.field_n, (tn) null);
        ((pd) this).field_Y = new oa(hg.field_f, (tn) null);
        ((pd) this).field_W = new oa(lj.field_c, (tn) null);
        kh var1 = new kh();
        ((pd) this).field_P.field_p = (qk) (Object) var1;
        ((pd) this).field_Y.field_p = (qk) (Object) var1;
        ((pd) this).field_W.field_p = (qk) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> 909269441;
        ((pd) this).field_Y.a(((pd) this).field_x - var3 >> 2019550017, (byte) -108, -var2 + (((pd) this).field_E + -48), var4, 30);
        ((pd) this).field_W.a((-var3 + ((pd) this).field_x >> 791531489) + var4 + var2, (byte) -78, -48 + ((pd) this).field_E + -var2, var4, 30);
        ((pd) this).field_P.a(((pd) this).field_x - var3 >> 1986007937, (byte) -100, -(var2 * 2) + (((pd) this).field_E - 78), var3, 30);
        ((pd) this).field_Y.field_A = (tn) this;
        ((pd) this).field_P.field_A = (tn) this;
        ((pd) this).field_P.field_v = r.field_m;
        ((pd) this).field_W.field_A = (tn) this;
        ((pd) this).field_W.field_v = rg.field_g;
        ((pd) this).a((lh) (Object) ((pd) this).field_Y, -120);
        ((pd) this).a((lh) (Object) ((pd) this).field_P, -89);
        ((pd) this).a((lh) (Object) ((pd) this).field_W, -100);
    }

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = SteelSentinels.field_G;
          if (param0 <= -45) {
            break L0;
          } else {
            field_T = null;
            break L0;
          }
        }
        L1: {
          var2 = param1.length();
          if (var2 <= 20) {
            break L1;
          } else {
            var2 = 20;
            break L1;
          }
        }
        var8 = new char[var2];
        var7 = var8;
        var3 = var7;
        var4 = 0;
        L2: while (true) {
          if (var4 >= var2) {
            return new String(var8);
          } else {
            L3: {
              var5 = param1.charAt(var4);
              if (var5 < 65) {
                break L3;
              } else {
                if (var5 <= 90) {
                  var3[var4] = (char)(97 + var5 + -65);
                  var4++;
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                if (var5 < 97) {
                  break L5;
                } else {
                  if (var5 <= 122) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (48 > var5) {
                  break L6;
                } else {
                  if (var5 > 57) {
                    break L6;
                  } else {
                    break L4;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              continue L2;
            }
            var3[var4] = (char)var5;
            var4++;
            continue L2;
          }
        }
    }

    final static int a(int param0, CharSequence param1, char param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = SteelSentinels.field_G;
          var3 = 0;
          if (param0 == 2019550017) {
            break L0;
          } else {
            pd.j(42);
            break L0;
          }
        }
        var4 = param1.length();
        var5 = 0;
        L1: while (true) {
          if (var4 <= var5) {
            return var3;
          } else {
            if (param1.charAt(var5) == param2) {
              var3++;
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        if (super.a(param0, param1, param2, param3)) {
            return true;
        }
        if (!(-99 != (param1 ^ -1))) {
            return ((pd) this).b(param3, 121);
        }
        if ((param1 ^ -1) != -100) {
            return false;
        }
        return ((pd) this).b(-11963, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = 49;
        field_ab = "<%0>'s game";
        field_R = "This password contains your Player Name, and would be easy to guess";
        field_X = 0;
    }
}
