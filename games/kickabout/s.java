/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends wi {
    int field_L;
    int field_H;
    int field_I;
    static int field_E;
    static String[] field_M;
    int field_G;
    int field_K;
    static String field_F;
    int field_J;

    final boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Kickabout.field_G;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          var8 = param2 + (-((s) this).field_H + (-param5 + -((s) this).field_t));
          var9 = param4 - (((s) this).field_G + (param1 + ((s) this).field_g));
          if (var8 * var8 - -(var9 * var9) < ((s) this).field_J * ((s) this).field_J) {
            var10 = Math.atan2((double)var9, (double)var8) - vb.field_c;
            if (0.0 <= var10) {
              L0: {
                if (0.0 >= var10) {
                  break L0;
                } else {
                  var10 = var10 + 3.141592653589793 / (double)((s) this).field_K;
                  break L0;
                }
              }
              ((s) this).field_L = (int)((double)((s) this).field_K * var10 / 6.283185307179586);
              L1: while (true) {
                if (((s) this).field_L >= ((s) this).field_K) {
                  ((s) this).field_L = ((s) this).field_L - ((s) this).field_K;
                  continue L1;
                } else {
                  L2: while (true) {
                    if (((s) this).field_L >= 0) {
                      return true;
                    } else {
                      ((s) this).field_L = ((s) this).field_L + ((s) this).field_K;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)((s) this).field_K;
              ((s) this).field_L = (int)((double)((s) this).field_K * var10 / 6.283185307179586);
              L3: while (true) {
                if (((s) this).field_L >= ((s) this).field_K) {
                  ((s) this).field_L = ((s) this).field_L - ((s) this).field_K;
                  continue L3;
                } else {
                  L4: while (true) {
                    if (((s) this).field_L >= 0) {
                      return true;
                    } else {
                      ((s) this).field_L = ((s) this).field_L + ((s) this).field_K;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void i(int param0) {
        if (param0 != -1) {
            field_F = null;
            field_M = null;
            field_F = null;
            return;
        }
        field_M = null;
        field_F = null;
    }

    final static ec j(int param0) {
        String var1 = null;
        if (param0 < 33) {
          return null;
        } else {
          L0: {
            var1 = ls.g(-26370);
            if (var1 == null) {
              break L0;
            } else {
              if (-1 < (var1.indexOf('@') ^ -1)) {
                break L0;
              } else {
                var1 = "";
                break L0;
              }
            }
          }
          return new ec(ls.g(-26370), gu.b(-20010));
        }
    }

    final static int a(int param0, int param1, byte[] param2, int param3) {
        int var5 = 0;
        int var6 = Kickabout.field_G;
        int var4 = -1;
        for (var5 = param3; param0 > var5; var5++) {
            var4 = var4 >>> 1729461128 ^ cl.field_c[(param2[var5] ^ var4) & 255];
        }
        var5 = -114 % ((37 - param1) / 40);
        var4 = var4 ^ -1;
        return var4;
    }

    final static void c(int param0, int param1, int param2, int param3) {
        if (param0 != -1) {
            return;
        }
        np.field_Jb.a((gn) (Object) new ek(param3, param1, param2), 3);
    }

    private s() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new String[]{"<img=0>This is no-holds-barred football. Be as brutal as you like, but don't get left lying in the mud.", "<img=0>The ball cannot leave the pitch and is always in play.", "<img=0>Multiplayer games last for 4, 8, or 12 minutes. There is no half-time break.", "<img=0>All multiplayer games earn you EXP for the players used, league points and money.", "<img=0>Rated Games earn ten times the reward of Unrated Games, but you'll have to defeat your opponent 1-on-1 using your own team.", "<img=0>If a Rated Game finishes too quickly, or you've played the opponent recently, you'll only get the Unrated Game reward.", "<img=0>We recommend a PING time of under 200ms to fully enjoy Kickabout. Lag will affect gameplay; use the lag-o-meter bars in the corner of the game screen to see if there's a problem."};
        field_F = "Ok";
    }
}
