/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    int field_n;
    int field_f;
    int field_m;
    String[] field_i;
    boolean field_d;
    byte field_h;
    int field_c;
    int field_l;
    static ci field_o;
    int field_k;
    static int field_g;
    int field_j;
    static String field_a;
    int field_e;
    static String field_b;

    final void a(int param0, int param1, int param2) {
        ((af) this).field_n = param0;
        ((af) this).field_l = param2;
        if (param1 != 255) {
            Object var5 = null;
            ((af) this).a(82, 103, (uk) null, 11, 35);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_o = null;
        if (param0 >= -103) {
            field_a = null;
        }
    }

    final static km[] a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Chess.field_G;
        if (param0 > -86) {
            field_o = null;
        }
        km[] var1 = new km[h.field_n];
        for (var2 = 0; h.field_n > var2; var2++) {
            var3 = b.field_c[var2] * wm.field_b[var2];
            var4 = vk.field_d[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = uh.field_r[ce.a(255, (int) var4[var6])];
            }
            var1[var2] = new km(cd.field_p, ek.field_a, be.field_a[var2], a.field_c[var2], wm.field_b[var2], b.field_c[var2], var5);
        }
        ch.k(4210752);
        return var1;
    }

    final static boolean b(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 > 14) {
          L0: {
            L1: {
              if (me.field_a == null) {
                break L1;
              } else {
                if (!me.field_a.k(-1)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final void a(byte param0, int param1) {
        ((af) this).field_l = param1;
        ((af) this).field_d = true;
        if (param0 != 93) {
            km[] discarded$0 = af.a((byte) 21);
        }
    }

    final void a(int param0, p param1, uk param2, un param3) {
        if (param0 != 0) {
            Object var6 = null;
            ((af) this).a(68, -28, (uk) null, 40, 39);
        }
        param2.a(param3, param1, true);
    }

    af(int param0, String[] param1, int param2) {
        ((af) this).field_f = -2;
        ((af) this).field_j = param0;
        ((af) this).field_h = (byte)param1.length;
        ((af) this).field_l = param2;
        ((af) this).field_k = param2;
        ((af) this).field_i = param1;
    }

    final void a(int param0, int param1, uk param2, int param3, int param4) {
        if (((af) this).field_d) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (0 > param0) {
              break L0;
            } else {
              if (64 <= param0) {
                break L0;
              } else {
                if (0 > param4) {
                  break L0;
                } else {
                  if (-65 >= (param4 ^ -1)) {
                    break L0;
                  } else {
                    L1: {
                      if (param3 == -65) {
                        break L1;
                      } else {
                        ((af) this).field_l = -106;
                        break L1;
                      }
                    }
                    param2.a((byte) 19, param1, param0, param4);
                    return;
                  }
                }
              }
            }
          }
          throw new IllegalArgumentException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_b = "You appear to be telling someone your password - please don't!";
    }
}
