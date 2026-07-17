/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    static hl field_i;
    static String field_l;
    static int[] field_d;
    static lb field_e;
    int field_a;
    static String field_f;
    int field_h;
    static String field_g;
    int[] field_j;
    static int[] field_k;
    static int field_c;
    static String field_b;

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TetraLink.field_J;
        if (((bk) this).field_j != null) {
          if (0 != ((bk) this).field_j.length) {
            if (param0 >= 62) {
              var3 = 1;
              L0: while (true) {
                if (((bk) this).field_j.length > var3) {
                  if (param1 < ((bk) this).field_j[-1 + var3] - -((bk) this).field_j[var3] >> 1) {
                    return var3 + -1;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  return -1 + ((bk) this).field_j.length;
                }
              }
            } else {
              ((bk) this).field_h = -98;
              var3 = 1;
              L1: while (true) {
                if (((bk) this).field_j.length > var3) {
                  if (param1 < ((bk) this).field_j[-1 + var3] - -((bk) this).field_j[var3] >> 1) {
                    return var3 + -1;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  return -1 + ((bk) this).field_j.length;
                }
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_i = null;
        field_d = null;
        field_l = null;
        field_g = null;
        field_k = null;
        if (param0 <= 48) {
          bk.b(-43);
          field_f = null;
          field_e = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = TetraLink.field_J;
        s.field_f = false;
        wg.field_b = null;
        if (!qa.field_v) {
          var1 = pg.field_a;
          if (var1 > 0) {
            if (var1 == 1) {
              wg.field_b = pl.field_g;
              wg.field_b = kj.a((byte) 109, new CharSequence[3]);
              fl.field_u.r(-125);
              of.b(true);
              return;
            } else {
              wg.field_b = sk.a(new String[1], ll.field_z, 121);
              wg.field_b = kj.a((byte) 109, new CharSequence[3]);
              fl.field_u.r(-125);
              of.b(true);
              return;
            }
          } else {
            fl.field_u.r(-125);
            of.b(true);
            return;
          }
        } else {
          fl.field_u.p(128);
          return;
        }
    }

    bk(int param0, int param1, int param2) {
        ((bk) this).field_a = param1;
        ((bk) this).field_h = param0;
        ((bk) this).field_j = new int[1 + param2];
    }

    final int a(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 <= -12) {
          if (null != ((bk) this).field_j) {
            if (((bk) this).field_j.length == 0) {
              return 0;
            } else {
              return ((bk) this).field_j[-1 + ((bk) this).field_j.length];
            }
          } else {
            stackOut_9_0 = 0;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0;
          }
        } else {
          field_f = null;
          if (null == ((bk) this).field_j) {
            return 0;
          } else {
            L0: {
              if (((bk) this).field_j.length != 0) {
                stackOut_4_0 = ((bk) this).field_j[-1 + ((bk) this).field_j.length];
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 0;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "All players have left <%0>'s game.";
        field_f = "This is your RuneScape clan if you have one.";
        field_g = "You are offering to draw.";
        field_d = new int[8192];
        field_b = "<%0> has won!";
    }
}
