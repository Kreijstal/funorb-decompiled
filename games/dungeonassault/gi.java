/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends ii implements vg {
    private mg field_N;
    static int[] field_L;
    static String[] field_K;
    static String field_P;
    private String[] field_M;
    static java.awt.Canvas field_R;
    private ck[] field_O;
    static String field_Q;
    static uo field_S;

    final void a(byte param0, String[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        oa var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = DungeonAssault.field_K;
          ((gi) this).field_B.b(-4);
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length != 0) {
              var3 = param1.length;
              var4 = -105 / ((-51 - param0) / 49);
              ((gi) this).field_M = new String[var3];
              var5_int = 0;
              L1: while (true) {
                if (var5_int >= var3) {
                  var5 = new oa(lp.field_C, 0, 1);
                  ((gi) this).field_O = new ck[var3 - -1];
                  var6 = 0;
                  L2: while (true) {
                    if (var3 <= var6) {
                      ((gi) this).field_O[var3] = new ck(li.field_i, (pg) this);
                      ((gi) this).field_O[var3].field_o = (ca) (Object) var5;
                      ((gi) this).field_O[var3].b(0, 100, 16 + (16 * var3 + 20), 0, 15);
                      ((gi) this).b((byte) -117, (lm) (Object) ((gi) this).field_O[var3]);
                      return;
                    } else {
                      ((gi) this).field_O[var6] = new ck(((gi) this).field_M[var6], (pg) this);
                      ((gi) this).field_O[var6].field_o = (ca) (Object) var5;
                      ((gi) this).field_O[var6].field_i = ln.field_c;
                      ((gi) this).field_O[var6].b(0, 80, var6 * 16 + 20, 0, 15);
                      ((gi) this).b((byte) -123, (lm) (Object) ((gi) this).field_O[var6]);
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  ((gi) this).field_M[var5_int] = kl.a((CharSequence) (Object) param1[var5_int], (byte) -49).replace(' ', ' ');
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        ((gi) this).field_M = null;
    }

    public static void f(byte param0) {
        field_K = null;
        field_S = null;
        field_P = null;
        if (param0 >= -27) {
            return;
        }
        field_R = null;
        field_Q = null;
        field_L = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!(param0 == 0)) {
            return;
        }
        se var5 = lp.field_C;
        if (!(null == ((gi) this).field_M)) {
            int discarded$0 = var5.a(sc.field_p, param1 + ((gi) this).field_q, param3 + ((gi) this).field_v, ((gi) this).field_x, 20, 16777215, -1, 0, 0, var5.field_E + var5.field_H);
        }
    }

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = DungeonAssault.field_K;
          if (param1 == 98) {
            break L0;
          } else {
            ((gi) this).field_O = null;
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (((gi) this).field_M.length <= var6) {
            L2: {
              if (param0 == ((gi) this).field_O[((gi) this).field_M.length]) {
                ((gi) this).field_N.a(125);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            if (param0 == ((gi) this).field_O[var6]) {
              ((gi) this).field_N.a((byte) -67, ((gi) this).field_M[var6]);
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    gi(mg param0) {
        super(0, 0, 0, 0, (ca) null);
        ((gi) this).field_N = param0;
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        if (super.a(param0, param1, param2, (byte) 125)) {
            return true;
        }
        if (98 == param2) {
            return ((gi) this).a(param0, (byte) 71);
        }
        if (-100 == (param2 ^ -1)) {
            return ((gi) this).a((byte) -5, param0);
        }
        if (param3 < 55) {
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Corrosive Slime";
        field_K = new String[]{"Scout", "Scout next room. (Single use)"};
        field_L = new int[8192];
        field_Q = "<col=2E5D17>Advance</col> - Engage monster";
    }
}
