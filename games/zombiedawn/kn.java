/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends hp implements hh {
    static String field_J;
    static String field_I;
    private ri field_K;
    static vo field_L;
    private an[] field_G;
    private String[] field_H;
    static int field_F;

    public static void b(boolean param0) {
        field_I = null;
        if (param0) {
            return;
        }
        field_J = null;
        field_L = null;
    }

    kn(ri param0) {
        super(0, 0, 0, 0, (io) null);
        ((kn) this).field_K = param0;
    }

    final void a(String[] param0, byte param1) {
        int var3 = 0;
        int var4_int = 0;
        dp var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ZombieDawn.field_J;
          ((kn) this).field_x.b(97);
          if (param0 == null) {
            break L0;
          } else {
            if (-1 == (param0.length ^ -1)) {
              break L0;
            } else {
              var3 = param0.length;
              ((kn) this).field_H = new String[var3];
              if (param1 > 18) {
                var4_int = 0;
                L1: while (true) {
                  if (var4_int >= var3) {
                    var4 = new dp(ia.field_e, 0, 1);
                    ((kn) this).field_G = new an[var3 + 1];
                    var5 = 0;
                    L2: while (true) {
                      if (var3 <= var5) {
                        ((kn) this).field_G[var3] = new an(mm.field_j, (sk) this);
                        ((kn) this).field_G[var3].field_h = (io) (Object) var4;
                        ((kn) this).field_G[var3].a(52, 20 - -((1 + var3) * 16), 0, 100, 15);
                        ((kn) this).a((ga) (Object) ((kn) this).field_G[var3], 10);
                        return;
                      } else {
                        ((kn) this).field_G[var5] = new an(((kn) this).field_H[var5], (sk) this);
                        ((kn) this).field_G[var5].field_h = (io) (Object) var4;
                        ((kn) this).field_G[var5].field_s = sj.field_b;
                        ((kn) this).field_G[var5].a(-94, 16 * var5 + 20, 0, 80, 15);
                        ((kn) this).a((ga) (Object) ((kn) this).field_G[var5], 10);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    ((kn) this).field_H[var4_int] = nh.a((CharSequence) (Object) param0[var4_int], 126).replace(' ', ' ');
                    var4_int++;
                    continue L1;
                  }
                }
              } else {
                return;
              }
            }
          }
        }
        ((kn) this).field_H = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, 0);
        if (!(param3 == param1)) {
            return;
        }
        rb var5 = ia.field_e;
        if (null != ((kn) this).field_H) {
            int discarded$0 = var5.a(ic.field_Q, param2 - -((kn) this).field_k, param0 - -((kn) this).field_j, ((kn) this).field_i, 20, 16777215, -1, 0, 0, var5.field_I - -var5.field_x);
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        if (super.a(-126, param1, param2, param3)) {
            return true;
        }
        if (!(98 != param1)) {
            return ((kn) this).b((byte) 119, param2);
        }
        int var5 = -57 / ((param0 - -83) / 32);
        if (-100 != (param1 ^ -1)) {
            return false;
        }
        return ((kn) this).a(1, param2);
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = ZombieDawn.field_J;
        var6 = 0;
        L0: while (true) {
          if (((kn) this).field_H.length <= var6) {
            L1: {
              if (param1 == -6) {
                break L1;
              } else {
                var8 = null;
                ((kn) this).a((String[]) null, (byte) -97);
                break L1;
              }
            }
            L2: {
              if (((kn) this).field_G[((kn) this).field_H.length] != param2) {
                break L2;
              } else {
                ((kn) this).field_K.a(param1 + 127);
                break L2;
              }
            }
            return;
          } else {
            if (((kn) this).field_G[var6] == param2) {
              ((kn) this).field_K.a((byte) 103, ((kn) this).field_H[var6]);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Humans captured: ";
        field_J = "You have <%0> unread messages!";
        field_L = new vo();
        field_F = 0;
    }
}
