/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rb extends rf {
    int field_g;
    static ge field_h;
    byte[] field_f;
    static int field_i;

    final void a(int param0, boolean param1) {
        if (!param1) {
            int discarded$0 = ((rb) this).g(63);
        }
        while (param0 > ((rb) this).field_g) {
            ((rb) this).field_g = ((rb) this).field_g + 1;
            ((rb) this).field_f[((rb) this).field_g] = (byte) 0;
        }
    }

    final void a(byte param0, String param1) {
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = StarCannon.field_A;
        var3 = 0L;
        var5 = 0L;
        var7 = param1.length();
        var8 = 19;
        L0: while (true) {
          if (0 > var8) {
            L1: {
              this.a(65, var3);
              this.a(-127, var5);
              if (param0 == -86) {
                break L1;
              } else {
                int discarded$1 = ((rb) this).f((byte) 81);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              var3 = var3 * 38L;
              if (var7 > var8) {
                L3: {
                  var9 = param1.charAt(var8);
                  if (65 > var9) {
                    break L3;
                  } else {
                    if (90 < var9) {
                      break L3;
                    } else {
                      var3 = var3 + (long)(-63 - -var9);
                      break L2;
                    }
                  }
                }
                L4: {
                  if (var9 < 97) {
                    break L4;
                  } else {
                    if (var9 <= 122) {
                      var3 = var3 + (long)(2 - (-var9 + 97));
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var9 < 48) {
                    break L5;
                  } else {
                    if (var9 > 57) {
                      break L5;
                    } else {
                      var3 = var3 + (long)(-48 + (var9 + 28));
                      break L2;
                    }
                  }
                }
                var3 = var3 + 1L;
                break L2;
              } else {
                break L2;
              }
            }
            if (10 == var8) {
              var5 = var3;
              var3 = 0L;
              var8--;
              continue L0;
            } else {
              var8--;
              continue L0;
            }
          }
        }
    }

    final int d(byte param0) {
        int var2 = ((rb) this).field_f[((rb) this).field_g] & 255;
        if (param0 <= 17) {
            int discarded$0 = ((rb) this).f((byte) 10);
        }
        if (var2 < 128) {
            return -64 + ((rb) this).j(7909);
        }
        return -49152 + ((rb) this).i(-1174051992);
    }

    private final void a(int param0, long param1) {
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)(param1 >> -293985360);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)(param1 >> -1174051992);
        int var4 = -20 / ((-54 - param0) / 33);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)(param1 >> -344273440);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)(param1 >> 383596760);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)(param1 >> -760470832);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)(param1 >> -1765463224);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)param1;
    }

    final static void a(java.applet.Applet param0, int param1) {
        CharSequence var4 = null;
        if (param1 != 65) {
            Object var3 = null;
            rb.a((java.applet.Applet) null, 75);
        }
        String var2 = param0.getParameter("username");
        if (var2 != null) {
            var4 = (CharSequence) (Object) var2;
            if (0L == ik.a(var4, (byte) 109)) {
                return;
            }
            return;
        }
    }

    final void c(byte param0, int param1) {
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(param1 >> -660130536);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(param1 >> 695291280);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(param1 >> 916613256);
        if (param0 >= -67) {
            ((rb) this).a(90, 18);
        }
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)param1;
    }

    final void b(int param0, int param1) {
        ((rb) this).field_f[-1 + (((rb) this).field_g - param0)] = (byte)param0;
        if (param1 != 31700) {
            field_i = 5;
        }
    }

    final int g(int param0) {
        int var2 = -39 % ((-27 - param0) / 60);
        ((rb) this).field_g = ((rb) this).field_g + 3;
        return (65280 & ((rb) this).field_f[((rb) this).field_g - 2] << 136812424) + ((16711680 & ((rb) this).field_f[((rb) this).field_g - 3] << -102940144) - -(255 & ((rb) this).field_f[-1 + ((rb) this).field_g]));
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4 = ((rb) this).field_g;
        ((rb) this).field_g = 0;
        byte[] var5 = new byte[var4];
        ((rb) this).a(var4, (byte) 88, var5, 0);
        java.math.BigInteger var6 = new java.math.BigInteger(var5);
        java.math.BigInteger var7 = var6.modPow(param0, param1);
        byte[] var8 = var7.toByteArray();
        ((rb) this).field_g = 0;
        ((rb) this).c(var8.length, param2 + 8093);
        if (param2 != -8399) {
            return;
        }
        ((rb) this).a(var8, var8.length, -20144, 0);
    }

    final void a(int param0, byte param1) {
        if (param1 != -39) {
            ((rb) this).a((byte) -99, 27);
        }
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(param0 >> 1217178960);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(param0 >> 364302472);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)param0;
    }

    final int d(int param0) {
        int var2 = 255 & ((rb) this).field_f[((rb) this).field_g];
        if (var2 < param0) {
            return ((rb) this).j(7909);
        }
        return ((rb) this).i(-1174051992) - 32768;
    }

    final void a(byte param0, long param1) {
        if (param0 > -41) {
            return;
        }
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)(param1 >> 802578336);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)(param1 >> 1628695192);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)(param1 >> 305511568);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)(param1 >> 1190794632);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)param1;
    }

    final byte a(boolean param0) {
        if (param0) {
            field_i = -29;
        }
        ((rb) this).field_g = ((rb) this).field_g + 1;
        return ((rb) this).field_f[((rb) this).field_g];
    }

    final void a(byte param0, int param1) {
        if (param0 != 88) {
            field_i = 116;
        }
        ((rb) this).field_f[-2 + -param1 + ((rb) this).field_g] = (byte)(param1 >> -1222119352);
        ((rb) this).field_f[-1 + (((rb) this).field_g + -param1)] = (byte)param1;
    }

    final static boolean e(byte param0) {
        if (param0 != -72) {
            field_i = 68;
            return true;
        }
        return true;
    }

    final int b(byte param0, int param1) {
        if (param0 > -46) {
            return -57;
        }
        int var3 = rj.a(param1, ((rb) this).field_g, (byte) 123, ((rb) this).field_f);
        ((rb) this).c((byte) -89, var3);
        return var3;
    }

    final void a(int[] param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = StarCannon.field_A;
        int var5 = ((rb) this).field_g;
        ((rb) this).field_g = param3;
        if (param2 > -30) {
            byte discarded$0 = ((rb) this).a(false);
        }
        int var6 = (-param3 + param1) / 8;
        for (var7 = 0; var6 > var7; var7++) {
            var8 = ((rb) this).f((byte) -128);
            var9 = ((rb) this).f((byte) -123);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
                var12--;
                if ((var12 ^ -1) >= -1) {
                    break;
                }
                var9 = var9 - ((var8 << 927022244 ^ var8 >>> 208147653) + var8 ^ param0[-310378493 & var10 >>> -16274549] + var10);
                var10 = var10 - var11;
                var8 = var8 - (var10 + param0[3 & var10] ^ var9 + (var9 >>> -1531742683 ^ var9 << -1395455644));
            }
            ((rb) this).field_g = ((rb) this).field_g - 8;
            ((rb) this).c((byte) -69, var8);
            ((rb) this).c((byte) -75, var9);
        }
        ((rb) this).field_g = var5;
    }

    final String b(byte param0) {
        if (((rb) this).field_f[((rb) this).field_g] == 0) {
            ((rb) this).field_g = ((rb) this).field_g + 1;
            return null;
        }
        int var2 = 118 % ((-18 - param0) / 37);
        return ((rb) this).a(-38);
    }

    final String a(int param0) {
        int var2 = ((rb) this).field_g;
        if (param0 >= -7) {
            this.a(15, 52L);
        }
        while (true) {
            ((rb) this).field_g = ((rb) this).field_g + 1;
            if (0 == ((rb) this).field_f[((rb) this).field_g]) {
                break;
            }
        }
        int var3 = -1 + (((rb) this).field_g - var2);
        if (var3 == 0) {
            return "";
        }
        return va.a(var2, 105, ((rb) this).field_f, var3);
    }

    final int i(int param0) {
        ((rb) this).field_g = ((rb) this).field_g + 2;
        if (param0 != -1174051992) {
            int discarded$0 = ((rb) this).j(82);
        }
        return (((rb) this).field_f[-2 + ((rb) this).field_g] << 431281960 & 65280) + (255 & ((rb) this).field_f[-1 + ((rb) this).field_g]);
    }

    final boolean f(int param0) {
        ((rb) this).field_g = ((rb) this).field_g - 4;
        int var2 = rj.a(param0, ((rb) this).field_g, (byte) 94, ((rb) this).field_f);
        int var3 = ((rb) this).f((byte) -89);
        if (var2 == var3) {
            return true;
        }
        return false;
    }

    final void a(boolean param0, long param1) {
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)(param1 >> 1987397560);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)(param1 >> -1325687824);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)(param1 >> 1267477736);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)(param1 >> 902856544);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)(param1 >> 1859421080);
        if (!param0) {
            return;
        }
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)(param1 >> 1618409936);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)(param1 >> 1791213320);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(int)param1;
    }

    final String h(int param0) {
        ((rb) this).field_g = ((rb) this).field_g + 1;
        int var2 = ((rb) this).field_f[((rb) this).field_g];
        if (!(0 == var2)) {
            throw new IllegalStateException("");
        }
        if (param0 != -12287) {
            ((rb) this).field_f = null;
        }
        int var3 = ((rb) this).field_g;
        while (true) {
            ((rb) this).field_g = ((rb) this).field_g + 1;
            if (0 == ((rb) this).field_f[((rb) this).field_g]) {
                break;
            }
        }
        int var4 = -1 + (-var3 + ((rb) this).field_g);
        if (var4 == 0) {
            return "";
        }
        return va.a(var3, param0 + 12372, ((rb) this).field_f, var4);
    }

    final void a(int param0, int param1) {
        if (param1 >= -49) {
            return;
        }
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)param0;
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        for (var5 = param3; var5 < param3 + param1; var5++) {
            ((rb) this).field_g = ((rb) this).field_g + 1;
            ((rb) this).field_f[((rb) this).field_g] = param0[var5];
        }
        if (param2 != -20144) {
            field_h = null;
        }
    }

    public static void g(byte param0) {
        field_h = null;
        if (param0 != -59) {
            field_i = -113;
        }
    }

    final int j(int param0) {
        if (param0 != 7909) {
            ((rb) this).a((byte) 45, -105);
        }
        ((rb) this).field_g = ((rb) this).field_g + 1;
        return ((rb) this).field_f[((rb) this).field_g] & 255;
    }

    final void b(boolean param0, String param1) {
        if (param0) {
            return;
        }
        int var3 = param1.indexOf(' ');
        if (-1 >= (var3 ^ -1)) {
            throw new IllegalArgumentException("");
        }
        CharSequence var4 = (CharSequence) (Object) param1;
        ((rb) this).field_g = ((rb) this).field_g + o.a(((rb) this).field_g, param1.length(), var4, 0, (byte) -80, ((rb) this).field_f);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte) 0;
    }

    final void a(byte param0, int[] param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var3 = ((rb) this).field_g / 8;
        if (param0 > -22) {
            Object var10 = null;
            ((rb) this).a((byte[]) null, -6, -89, 118);
        }
        ((rb) this).field_g = 0;
        for (var4 = 0; var3 > var4; var4++) {
            var5 = ((rb) this).f((byte) -121);
            var6 = ((rb) this).f((byte) -107);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
                var9--;
                if ((var9 ^ -1) >= -1) {
                    break;
                }
                var5 = var5 + (var7 - -param1[var7 & 3] ^ (var6 >>> 2054163973 ^ var6 << -2135801788) - -var6);
                var7 = var7 + var8;
                var6 = var6 + (var5 + (var5 << 2142061988 ^ var5 >>> 2030132901) ^ param1[-1736441853 & var7 >>> -548449397] + var7);
            }
            ((rb) this).field_g = ((rb) this).field_g - 8;
            ((rb) this).c((byte) -102, var5);
            ((rb) this).c((byte) -95, var6);
        }
    }

    final void a(int param0, byte param1, byte[] param2, int param3) {
        int var5 = 0;
        if (param1 != 88) {
            ((rb) this).field_f = null;
        }
        for (var5 = param3; var5 < param0 + param3; var5++) {
            ((rb) this).field_g = ((rb) this).field_g + 1;
            param2[var5] = ((rb) this).field_f[((rb) this).field_g];
        }
    }

    final void a(boolean param0, String param1) {
        int var3 = param1.indexOf(' ');
        if (var3 >= 0) {
            throw new IllegalArgumentException("");
        }
        if (param0) {
            return;
        }
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte) 0;
        CharSequence var4 = (CharSequence) (Object) param1;
        ((rb) this).field_g = ((rb) this).field_g + o.a(((rb) this).field_g, param1.length(), var4, 0, (byte) -84, ((rb) this).field_f);
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte) 0;
    }

    final void c(int param0, int param1) {
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)(param0 >> -97015448);
        if (param1 != -306) {
            ((rb) this).c((byte) 114, -102);
        }
        ((rb) this).field_g = ((rb) this).field_g + 1;
        ((rb) this).field_f[((rb) this).field_g] = (byte)param0;
    }

    rb(int param0) {
        ((rb) this).field_f = mc.a(65536, param0);
        ((rb) this).field_g = 0;
    }

    final int e(int param0) {
        int var2 = 109 % ((param0 - 12) / 47);
        if (((rb) this).field_f[((rb) this).field_g] >= 0) {
            return ((rb) this).i(-1174051992);
        }
        return 2147483647 & ((rb) this).f((byte) -109);
    }

    rb(byte[] param0) {
        ((rb) this).field_g = 0;
        ((rb) this).field_f = param0;
    }

    final long c(byte param0) {
        long var2 = (long)((rb) this).f((byte) -126) & 4294967295L;
        if (param0 != 5) {
            field_i = 82;
        }
        long var4 = 4294967295L & (long)((rb) this).f((byte) -104);
        return var4 + (var2 << 345511264);
    }

    final int f(byte param0) {
        ((rb) this).field_g = ((rb) this).field_g + 4;
        if (param0 >= -78) {
            return -5;
        }
        return ((((rb) this).field_f[((rb) this).field_g + -2] & 255) << -1724458328) + (((rb) this).field_f[-4 + ((rb) this).field_g] << -155940808 & -16777216) - (-((255 & ((rb) this).field_f[((rb) this).field_g + -3]) << -2088274576) + -(((rb) this).field_f[-1 + ((rb) this).field_g] & 255));
    }

    final void d(int param0, int param1) {
        if (param1 < 64) {
            if (!(63 < (param1 ^ -1))) {
                ((rb) this).a(64 + param1, -66);
                return;
            }
        }
        if (param0 != 5918) {
            field_i = 25;
        }
        if (16384 > param1) {
            if (!(-16384 > param1)) {
                ((rb) this).c(49152 + param1, -306);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new ge();
    }
}
