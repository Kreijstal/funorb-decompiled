/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends nb {
    int field_E;
    gl field_I;
    static p field_D;
    static String field_G;
    byte[] field_C;
    static int field_z;
    static String field_A;
    static boolean field_B;
    static int field_F;
    static String field_H;

    final int e(int param0) {
        if (param0 != 0) {
            field_F = -67;
        }
        if (((bl) this).field_t) {
            return 0;
        }
        return 100;
    }

    final byte[] b(byte param0) {
        if (param0 != 39) {
            return null;
        }
        if (((bl) this).field_t) {
            throw new RuntimeException();
        }
        return ((bl) this).field_C;
    }

    public static void d(boolean param0) {
        field_D = null;
        field_A = null;
        field_G = null;
        if (param0) {
            int discarded$0 = bl.f(-30);
        }
        field_H = null;
    }

    final static int f(int param0) {
        if (param0 != 0) {
            return -60;
        }
        return 1;
    }

    final static void a(int param0, int param1, java.math.BigInteger param2, jc param3, byte[] param4, java.math.BigInteger param5, int param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = Virogrid.field_F ? 1 : 0;
          var7 = el.a(126, param1);
          if (dk.field_m != null) {
            break L0;
          } else {
            dk.field_m = new java.security.SecureRandom();
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L1: while (true) {
          if (-5 >= (var9 ^ -1)) {
            L2: {
              L3: {
                if (am.field_e == null) {
                  break L3;
                } else {
                  if (am.field_e.field_g.length >= var7) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              am.field_e = new jc(var7);
              break L2;
            }
            L4: {
              L5: {
                am.field_e.field_l = 0;
                am.field_e.a(param4, param1, param6, (byte) 72);
                am.field_e.b(var7, (byte) 0);
                am.field_e.a(32768, var15);
                if (lc.field_b == null) {
                  break L5;
                } else {
                  if (-101 < (lc.field_b.field_g.length ^ -1)) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              lc.field_b = new jc(100);
              break L4;
            }
            lc.field_b.field_l = param0;
            lc.field_b.a(10, 120);
            var11 = 0;
            var9 = var11;
            L6: while (true) {
              if (var11 >= 4) {
                lc.field_b.a((byte) -68, param1);
                lc.field_b.a(param2, param5, (byte) 122);
                param3.a(lc.field_b.field_g, lc.field_b.field_l, 0, (byte) 20);
                param3.a(am.field_e.field_g, am.field_e.field_l, 0, (byte) 9);
                return;
              } else {
                lc.field_b.a(var15[var11], (byte) -42);
                var11++;
                continue L6;
              }
            }
          } else {
            var8[var9] = dk.field_m.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    bl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "<%0> has been removed.";
        field_D = new p();
        field_z = 3;
        field_A = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_H = "<%0> is offering a rematch.";
        field_B = true;
    }
}
