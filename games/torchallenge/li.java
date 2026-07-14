/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends kj implements sg {
    static boolean field_N;
    static int field_K;
    static String[] field_J;
    private ng[] field_L;
    private String[] field_M;
    private tb field_P;
    static java.applet.Applet field_O;

    final void a(int param0, String[] param1) {
        int var3 = 0;
        int var4_int = 0;
        me var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = TorChallenge.field_F ? 1 : 0;
          ((li) this).field_F.a(param0 ^ 8671);
          if (param1 == null) {
            break L0;
          } else {
            if (-1 != (param1.length ^ -1)) {
              var3 = param1.length;
              ((li) this).field_M = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= var3) {
                  var4 = new me(oe.field_g, 0, 1);
                  ((li) this).field_L = new ng[var3 - -1];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var3) {
                      L3: {
                        if (param0 == -6620) {
                          break L3;
                        } else {
                          var7 = null;
                          boolean discarded$1 = li.a((byte) -109, (String) null);
                          break L3;
                        }
                      }
                      ((li) this).field_L[var3] = new ng(ee.field_y, (gg) this);
                      ((li) this).field_L[var3].field_q = (j) (Object) var4;
                      ((li) this).field_L[var3].a((byte) 118, 0, 15, 100, 16 - -(var3 * 16) + 20);
                      ((li) this).a(param0 + 6620, (ee) (Object) ((li) this).field_L[var3]);
                      return;
                    } else {
                      ((li) this).field_L[var5] = new ng(((li) this).field_M[var5], (gg) this);
                      ((li) this).field_L[var5].field_q = (j) (Object) var4;
                      ((li) this).field_L[var5].field_r = aa.field_c;
                      ((li) this).field_L[var5].a((byte) 116, 0, 15, 80, 20 + var5 * 16);
                      ((li) this).a(param0 ^ -6620, (ee) (Object) ((li) this).field_L[var5]);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  ((li) this).field_M[var4_int] = jl.a(TorChallenge.a(param0, 6625), (CharSequence) (Object) param1[var4_int]).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        ((li) this).field_M = null;
    }

    final static boolean a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        var2 = 0;
        if (param0 == -82) {
          L0: while (true) {
            if (var2 >= param1.length()) {
              return false;
            } else {
              var3 = param1.charAt(var2);
              if (!bk.a(32191, (char) var3)) {
                if (!qb.a((char) var3, true)) {
                  return true;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TorChallenge.field_F ? 1 : 0;
          if (!param4) {
            break L0;
          } else {
            ((li) this).field_L = null;
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (((li) this).field_M.length <= var6) {
            L2: {
              if (param0 != ((li) this).field_L[((li) this).field_M.length]) {
                break L2;
              } else {
                ((li) this).field_P.a(-23128);
                break L2;
              }
            }
            return;
          } else {
            if (((li) this).field_L[var6] == param0) {
              ((li) this).field_P.a(((li) this).field_M[var6], -95);
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
            Object var2 = null;
            boolean discarded$0 = li.a((byte) -66, (String) null);
        }
        field_O = null;
        field_J = null;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
            return;
        }
        eg var5 = oe.field_g;
        if (!(((li) this).field_M == null)) {
            int discarded$0 = var5.a(dg.field_Y, ((li) this).field_m + param1, ((li) this).field_i + param0, ((li) this).field_p, 20, 16777215, -1, 0, 0, var5.field_K + var5.field_x);
        }
    }

    li(tb param0) {
        super(0, 0, 0, 0, (j) null);
        ((li) this).field_P = param0;
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
        if (param2 < 9) {
            return true;
        }
        if (super.a(param0, param1, (byte) 38, param3)) {
            return true;
        }
        if (!(98 != param0)) {
            return ((li) this).a(param3, (byte) -16);
        }
        if (-100 != (param0 ^ -1)) {
            return false;
        }
        return ((li) this).b(95, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new String[]{"Master 1", "Master 2", "Master 3"};
    }
}
