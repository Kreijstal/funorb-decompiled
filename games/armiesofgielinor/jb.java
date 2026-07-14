/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends tc {
    int field_m;
    int field_k;
    static String field_n;
    int field_s;
    static long[] field_u;
    float field_t;
    int field_o;
    int field_r;
    int field_q;
    static String field_v;
    int field_l;
    static int[] field_p;

    final static void e(int param0) {
        if (param0 != 17023) {
            field_p = null;
        }
        if (!(ra.field_e == null)) {
            ra.field_e.field_h = false;
        }
        ds.a(0, param0 ^ -16982);
    }

    public static void f(int param0) {
        field_p = null;
        int var1 = -70 / ((-47 - param0) / 52);
        field_u = null;
        field_v = null;
        field_n = null;
    }

    final boolean g(int param0) {
        int var2 = 75 / ((-13 - param0) / 54);
        return 0 != (((jb) this).field_k ^ -1) ? true : false;
    }

    final int a(byte param0, ej param1) {
        mn var4 = null;
        hw var3 = null;
        if (0 == (((jb) this).field_s ^ -1)) {
        } else {
            if ((((jb) this).field_l ^ -1) != 0) {
                var3 = new hw(((jb) this).field_m, ((jb) this).field_s, ((jb) this).field_q, ((jb) this).field_l);
                boolean discarded$0 = param1.a((mn) (Object) var3, -124);
            } else {
                param1.field_U.a(((jb) this).field_q, (byte) -116, ((jb) this).field_s);
                if (-1 <= (param1.field_U.field_m ^ -1)) {
                    if (((jb) this).field_k == 0) {
                        ((jb) this).field_r = -2;
                    }
                }
                if (!(0 == ((jb) this).field_k)) {
                    param1.field_U.field_l = -((jb) this).field_s + ((jb) this).field_k;
                    param1.field_U.field_j = ((jb) this).field_o - ((jb) this).field_q;
                }
                var4 = param1.field_U.a(param1.field_z, 103);
                if (!param1.a(var4, -125)) {
                    ((jb) this).field_r = -2;
                }
            }
        }
        if (param0 != 5) {
            ((jb) this).field_o = 65;
        }
        return ((jb) this).field_r;
    }

    final void h(int param0) {
        ((jb) this).field_m = -1;
        ((jb) this).field_t = 1.401298464324817e-45f;
        ((jb) this).field_s = -1;
        ((jb) this).field_l = -1;
        ((jb) this).field_q = -1;
        ((jb) this).field_r = -1;
        ((jb) this).field_o = param0;
        ((jb) this).field_k = -1;
    }

    final boolean a(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((jb) this).g(-25);
        }
        return (((jb) this).field_s ^ -1) != 0 ? true : false;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == 16150) {
          L0: {
            if (param0 <= 0) {
              break L0;
            } else {
              if (param0 < 128) {
                return true;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (param0 < 160) {
              break L1;
            } else {
              if (param0 > 255) {
                break L1;
              } else {
                return true;
              }
            }
          }
          L2: {
            if (param0 != 0) {
              var6 = ou.field_a;
              var2 = var6;
              var3 = 0;
              L3: while (true) {
                if (var3 >= var6.length) {
                  break L2;
                } else {
                  var4 = var6[var3];
                  if (var4 != param0) {
                    var3++;
                    continue L3;
                  } else {
                    return true;
                  }
                }
              }
            } else {
              break L2;
            }
          }
          return false;
        } else {
          return true;
        }
    }

    jb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new long[32];
        field_v = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_n = "Dragonhide armour deflects fire and acts as a barrier to heat.";
        field_p = new int[8192];
    }
}
