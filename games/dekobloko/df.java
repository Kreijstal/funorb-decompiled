/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends kf implements vn {
    static String field_Z;
    static pi[] field_Y;
    static w field_ab;
    private String[] field_V;
    private ek[] field_bb;
    private fi field_W;
    static int[][] field_U;
    static String field_X;
    static String field_T;
    static String field_S;

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = client.field_A ? 1 : 0;
          var6 = 0;
          if (param0 == 67) {
            break L0;
          } else {
            ck[] discarded$2 = df.a(123, -2, -15);
            break L0;
          }
        }
        L1: while (true) {
          if (var6 >= ((df) this).field_V.length) {
            L2: {
              if (param2 == ((df) this).field_bb[((df) this).field_V.length]) {
                ((df) this).field_W.a(25);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            if (((df) this).field_bb[var6] == param2) {
              ((df) this).field_W.a(((df) this).field_V[var6], param0 + -28531);
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        if (!(!super.a(86, param1, param2, param3))) {
            return true;
        }
        int var5 = 11 / ((-22 - param0) / 49);
        if (!((param1 ^ -1) != -99)) {
            return ((df) this).a(param2, (byte) -121);
        }
        if (param1 != 99) {
            return false;
        }
        return ((df) this).a(32, param2);
    }

    df(fi param0) {
        super(0, 0, 0, 0, (gl) null);
        ((df) this).field_W = param0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, -124, param2, param3);
        if (!(-1 == (param2 ^ -1))) {
            return;
        }
        if (param1 > -103) {
            ((df) this).a(-127, -2, -30, -66);
        }
        mm var5 = hh.field_e;
        if (((df) this).field_V != null) {
            int discarded$0 = var5.a(g.field_K, param0 - -((df) this).field_u, param3 + ((df) this).field_D, ((df) this).field_t, 20, 16777215, -1, 0, 0, var5.field_R - -var5.field_K);
        }
    }

    public static void a(int param0) {
        field_ab = null;
        field_Y = null;
        field_X = null;
        field_U = null;
        field_T = null;
        if (param0 != 1) {
            df.a(-31);
        }
        field_Z = null;
        field_S = null;
    }

    final static w i(int param0) {
        int var1 = -96 / ((45 - param0) / 63);
        return ec.field_k.field_Ob;
    }

    final static ck[] a(int param0, int param1, int param2) {
        if (param1 != 0) {
            df.a(10);
        }
        return ob.a(param2, param0, -3932, 1);
    }

    final void a(int param0, String[] param1) {
        int var3 = 0;
        int var4_int = 0;
        on var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = client.field_A ? 1 : 0;
          ((df) this).field_H.c(126);
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length != 0) {
              L1: {
                if (param0 == 32) {
                  break L1;
                } else {
                  ck[] discarded$1 = df.a(-125, -89, -29);
                  break L1;
                }
              }
              var3 = param1.length;
              ((df) this).field_V = new String[var3];
              var4_int = 0;
              L2: while (true) {
                if (var3 <= var4_int) {
                  var4 = new on(hh.field_e, 0, 1);
                  ((df) this).field_bb = new ek[1 + var3];
                  var5 = 0;
                  L3: while (true) {
                    if (var3 <= var5) {
                      ((df) this).field_bb[var3] = new ek(cc.field_e, (kg) this);
                      ((df) this).field_bb[var3].field_p = (gl) (Object) var4;
                      ((df) this).field_bb[var3].b(15, 100, 0, 20 + 16 * (1 + var3), -16555);
                      ((df) this).b((ce) (Object) ((df) this).field_bb[var3], (byte) -55);
                      return;
                    } else {
                      ((df) this).field_bb[var5] = new ek(((df) this).field_V[var5], (kg) this);
                      ((df) this).field_bb[var5].field_p = (gl) (Object) var4;
                      ((df) this).field_bb[var5].field_B = client.field_B;
                      ((df) this).field_bb[var5].b(15, 80, 0, var5 * 16 + 20, -16555);
                      ((df) this).b((ce) (Object) ((df) this).field_bb[var5], (byte) -55);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  ((df) this).field_V[var4_int] = ua.a((CharSequence) (Object) param1[var4_int], true).replace(' ', ' ');
                  var4_int++;
                  continue L2;
                }
              }
            } else {
              break L0;
            }
          }
        }
        ((df) this).field_V = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = "(Including <%0>)";
        field_X = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_S = "Press TAB to chat or F10 to open Quick Chat.";
        field_T = "Reject <%0> from this game";
    }
}
