/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uia extends vg {
    int field_h;
    byte[] field_g;
    static String field_f;

    final void a(byte param0, int[] param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = TombRacer.field_G ? 1 : 0;
        if (param0 != -48) {
        }
        int var3 = ((uia) this).field_h / 8;
        ((uia) this).field_h = 0;
        for (var4 = 0; var4 < var3; var4++) {
            var5 = ((uia) this).e(-51);
            var6 = ((uia) this).e(param0 ^ 120);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
                var9--;
                if (0 >= var9) {
                    break;
                }
                var5 = var5 + (var6 + (var6 << 6495012 ^ var6 >>> 667175365) ^ param1[3 & var7] + var7);
                var7 = var7 + var8;
                var6 = var6 + (var5 + (var5 << -1078122204 ^ var5 >>> 1857023237) ^ var7 + param1[var7 >>> -2039820597 & -866123773]);
            }
            ((uia) this).field_h = ((uia) this).field_h - 8;
            ((uia) this).a(var5, (byte) 0);
            ((uia) this).a(var6, (byte) -98);
        }
    }

    final int b(boolean param0) {
        ((uia) this).field_h = ((uia) this).field_h + 2;
        int var2 = (((uia) this).field_g[((uia) this).field_h + -1] & 255) + (65280 & ((uia) this).field_g[-2 + ((uia) this).field_h] << 1060535304);
        if (!(-32768 <= (var2 ^ -1))) {
            var2 = var2 - 65536;
        }
        if (param0) {
            return 56;
        }
        return var2;
    }

    final void a(int param0, byte param1) {
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(param0 >> -1710571272);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(param0 >> 290159088);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(param0 >> -30232408);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)param0;
        int var3 = 125 % ((43 - param1) / 33);
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var6 = TombRacer.field_G ? 1 : 0;
        int var5 = param1;
        if (param2 >= -79) {
            return;
        }
        while (param1 + param3 > var5) {
            ((uia) this).field_h = ((uia) this).field_h + 1;
            param0[var5] = ((uia) this).field_g[((uia) this).field_h];
            var5++;
        }
    }

    final byte c(byte param0) {
        if (param0 < 27) {
            return (byte) -82;
        }
        ((uia) this).field_h = ((uia) this).field_h + 1;
        return ((uia) this).field_g[((uia) this).field_h];
    }

    final int b(byte param0) {
        int var5 = TombRacer.field_G ? 1 : 0;
        int var2 = -48 % ((-58 - param0) / 58);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        int var3 = ((uia) this).field_g[((uia) this).field_h];
        int var4 = 0;
        while (0 > var3) {
            var4 = (var4 | var3 & 127) << 556823879;
            ((uia) this).field_h = ((uia) this).field_h + 1;
            var3 = ((uia) this).field_g[((uia) this).field_h];
        }
        return var3 | var4;
    }

    final void a(byte param0, int param1) {
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)param1;
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(param1 >> 211588552);
        if (param0 != -35) {
            return;
        }
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(param1 >> 1907167760);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(param1 >> 1252846936);
    }

    final String e(byte param0) {
        int var2 = ((uia) this).field_h;
        if (param0 != -76) {
            byte discarded$0 = ((uia) this).c((byte) -16);
        }
        while (true) {
            ((uia) this).field_h = ((uia) this).field_h + 1;
            if (-1 == (((uia) this).field_g[((uia) this).field_h] ^ -1)) {
                break;
            }
        }
        int var3 = ((uia) this).field_h - (var2 + 1);
        if (var3 == 0) {
            return "";
        }
        return nia.a(((uia) this).field_g, var2, var3, 255);
    }

    final void a(int param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4 = ((uia) this).field_h;
        ((uia) this).field_h = 0;
        byte[] var5 = new byte[var4];
        ((uia) this).a(var5, 0, -102, var4);
        java.math.BigInteger var6 = new java.math.BigInteger(var5);
        java.math.BigInteger var7 = var6.modPow(param1, param2);
        byte[] var8 = var7.toByteArray();
        ((uia) this).field_h = 0;
        ((uia) this).f(-1477662136, var8.length);
        if (param0 <= 87) {
            int discarded$0 = ((uia) this).b(false);
        }
        ((uia) this).a(0, var8, var8.length, 107);
    }

    final void a(int param0, int param1) {
        ((uia) this).field_g[((uia) this).field_h - param0 - 4] = (byte)(param0 >> -1707865544);
        ((uia) this).field_g[-3 + (-param0 + ((uia) this).field_h)] = (byte)(param0 >> 37118480);
        if (param1 != 22726) {
            Object var4 = null;
            ((uia) this).a((byte) 83, (int[]) null);
        }
        ((uia) this).field_g[-2 + (-param0 + ((uia) this).field_h)] = (byte)(param0 >> 1309099624);
        ((uia) this).field_g[((uia) this).field_h + -param0 - 1] = (byte)param0;
    }

    final int a(int param0) {
        ((uia) this).field_h = ((uia) this).field_h + 3;
        if (param0 != -32768) {
            return 55;
        }
        return ((((uia) this).field_g[-2 + ((uia) this).field_h] & 255) << -1050845912) + (((uia) this).field_g[-3 + ((uia) this).field_h] << 82551280 & 16711680) + (255 & ((uia) this).field_g[((uia) this).field_h + -1]);
    }

    final void a(int param0, long param1) {
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)(param1 >> -3295240);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)(param1 >> 2030501872);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)(param1 >> 824278056);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)(param1 >> 1571217440);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)(param1 >> -827831080);
        if (param0 != 1736565456) {
            ((uia) this).field_g = null;
        }
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)(param1 >> -747943600);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)(param1 >> 1038839112);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)param1;
    }

    final void c(int param0, byte param1) {
        if (0 <= param0) {
            if (!(128 <= param0)) {
                ((uia) this).i(param0, 0);
                return;
            }
        }
        int var3 = -126 % ((param1 - -18) / 58);
        if ((param0 ^ -1) <= -1) {
            if (!(32768 <= param0)) {
                ((uia) this).f(-1477662136, 32768 + param0);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public static void a(boolean param0) {
        field_f = null;
        if (!param0) {
            field_f = null;
        }
    }

    final void b(int param0, byte param1) {
        ((uia) this).field_g[-2 + (((uia) this).field_h - param0)] = (byte)(param0 >> -1816306392);
        ((uia) this).field_g[-param0 + (((uia) this).field_h - 1)] = (byte)param0;
        int var3 = -48 % ((param1 - 56) / 42);
    }

    final void a(int param0, int param1, int[] param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = TombRacer.field_G ? 1 : 0;
        if (param1 != -84984444) {
            ((uia) this).i(54, 87);
        }
        int var5 = ((uia) this).field_h;
        ((uia) this).field_h = param3;
        int var6 = (-param3 + param0) / 8;
        for (var7 = 0; var6 > var7; var7++) {
            var8 = ((uia) this).e(-88);
            var9 = ((uia) this).e(-102);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
                var12--;
                if (var12 <= 0) {
                    break;
                }
                var9 = var9 - (param2[(7261 & var10) >>> -466648565] + var10 ^ (var8 << -345170716 ^ var8 >>> 1107703013) - -var8);
                var10 = var10 - var11;
                var8 = var8 - (var9 + (var9 << -84984444 ^ var9 >>> -462897083) ^ param2[var10 & 3] + var10);
            }
            ((uia) this).field_h = ((uia) this).field_h - 8;
            ((uia) this).a(var8, (byte) -9);
            ((uia) this).a(var9, (byte) 95);
        }
        ((uia) this).field_h = var5;
    }

    final void a(String param0, int param1) {
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        var3 = 0L;
        var5 = 0L;
        var7 = param0.length();
        var8 = 19;
        L0: while (true) {
          if (-1 < (var8 ^ -1)) {
            L1: {
              this.a(var3, -106);
              if (param1 < -122) {
                break L1;
              } else {
                ((uia) this).field_g = null;
                break L1;
              }
            }
            this.a(var5, -120);
            return;
          } else {
            L2: {
              var3 = var3 * 38L;
              if (var7 <= var8) {
                break L2;
              } else {
                L3: {
                  var9 = param0.charAt(var8);
                  if (var9 < 65) {
                    break L3;
                  } else {
                    if (var9 <= 90) {
                      var3 = var3 + (long)(var9 + -63);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var9 < 97) {
                    break L4;
                  } else {
                    if (122 < var9) {
                      break L4;
                    } else {
                      var3 = var3 + (long)(-95 - -var9);
                      break L2;
                    }
                  }
                }
                L5: {
                  if (var9 < 48) {
                    break L5;
                  } else {
                    if (var9 <= 57) {
                      var3 = var3 + (long)(-48 + (28 - -var9));
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                var3 = var3 + 1L;
                break L2;
              }
            }
            if (-11 == (var8 ^ -1)) {
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

    uia(int param0) {
        ((uia) this).field_h = 0;
        ((uia) this).field_g = fba.a(param0, 0);
    }

    final void b(int param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param0 != 716148936) {
            return;
        }
        while (((uia) this).field_h < param1) {
            ((uia) this).field_h = ((uia) this).field_h + 1;
            ((uia) this).field_g[((uia) this).field_h] = (byte) 0;
        }
    }

    final void e(int param0, int param1) {
        if (param0 != -5338) {
            return;
        }
        if (param1 < 64) {
            if (63 >= (param1 ^ -1)) {
                ((uia) this).i(64 + param1, 0);
                return;
            }
        }
        if ((param1 ^ -1) > -16385) {
            if (!(param1 < -16384)) {
                ((uia) this).f(-1477662136, 49152 + param1);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final int d(byte param0) {
        if (param0 != -46) {
            return -59;
        }
        int var2 = ((uia) this).field_g[((uia) this).field_h] & 255;
        if (-129 >= (var2 ^ -1)) {
            return -32768 + ((uia) this).d(param0 + 168);
        }
        return ((uia) this).h(255);
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int var6 = TombRacer.field_G ? 1 : 0;
        int var5 = param0;
        if (param3 < 52) {
            ((uia) this).field_h = -97;
        }
        while (var5 < param2 + param0) {
            ((uia) this).field_h = ((uia) this).field_h + 1;
            ((uia) this).field_g[((uia) this).field_h] = param1[var5];
            var5++;
        }
    }

    final int d(int param0) {
        if (param0 <= 120) {
            field_f = null;
        }
        ((uia) this).field_h = ((uia) this).field_h + 2;
        return (((uia) this).field_g[-2 + ((uia) this).field_h] << 716148936 & 65280) - -(((uia) this).field_g[-1 + ((uia) this).field_h] & 255);
    }

    final void d(int param0, byte param1) {
        ((uia) this).field_g[-1 + -param0 + ((uia) this).field_h] = (byte)param0;
        int var3 = -105 % ((-62 - param1) / 33);
    }

    final void h(int param0, int param1) {
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(param1 >> -5086288);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(param1 >> 863439720);
        int var3 = 1 % ((param0 - -36) / 40);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)param1;
    }

    final String f(int param0) {
        ((uia) this).field_h = ((uia) this).field_h + 1;
        int var2 = ((uia) this).field_g[((uia) this).field_h];
        if (!(var2 == 0)) {
            throw new IllegalStateException("");
        }
        int var3 = ((uia) this).field_h;
        while (true) {
            ((uia) this).field_h = ((uia) this).field_h + 1;
            if (-1 == (((uia) this).field_g[((uia) this).field_h] ^ -1)) {
                break;
            }
        }
        if (param0 <= 113) {
            field_f = null;
        }
        int var4 = ((uia) this).field_h - (var3 + 1);
        if (var4 == 0) {
            return "";
        }
        return nia.a(((uia) this).field_g, var3, var4, 255);
    }

    uia(byte[] param0) {
        ((uia) this).field_h = 0;
        ((uia) this).field_g = param0;
    }

    final void d(int param0, int param1) {
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)param0;
        int var3 = -23 / ((73 - param1) / 46);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(param0 >> 1205899464);
    }

    final long b(int param0) {
        if (param0 != 290646880) {
            return 127L;
        }
        long var2 = (long)((uia) this).e(-81) & 4294967295L;
        long var4 = 4294967295L & (long)((uia) this).e(111);
        return var4 + (var2 << 290646880);
    }

    final int f(byte param0) {
        if (param0 >= -127) {
            return 93;
        }
        int var2 = ((uia) this).field_g[((uia) this).field_h] & 255;
        if (-129 >= (var2 ^ -1)) {
            return -49152 + ((uia) this).d(127);
        }
        return -64 + ((uia) this).h(255);
    }

    private final void a(long param0, int param1) {
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)(param0 >> -1751904208);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)(param0 >> -1815801560);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)(param0 >> 1497053856);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)(param0 >> -1743780008);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)(param0 >> -62340976);
        if (param1 > -37) {
            field_f = null;
        }
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)(param0 >> 1744286280);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)param0;
    }

    final void a(boolean param0, long param1) {
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)(param1 >> -450899168);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)(param1 >> 389604056);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)(param1 >> 1736565456);
        if (!param0) {
            return;
        }
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)(param1 >> 439472968);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(int)param1;
    }

    final void a(String param0, boolean param1) {
        int var3 = param0.indexOf(' ');
        if (-1 >= (var3 ^ -1)) {
            throw new IllegalArgumentException("");
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        ((uia) this).field_h = ((uia) this).field_h + laa.a(((uia) this).field_h, param0.length(), ((uia) this).field_g, 0, var4, (byte) -4);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte) 0;
        if (param1) {
            ((uia) this).field_g = null;
        }
    }

    final int g(int param0) {
        if (param0 != -48) {
            return 3;
        }
        if (-1 < (((uia) this).field_g[((uia) this).field_h] ^ -1)) {
            return ((uia) this).e(-16) & 2147483647;
        }
        return ((uia) this).d(param0 ^ -82);
    }

    final void i(int param0, int param1) {
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)param0;
        if (param1 != 0) {
            Object var4 = null;
            ((uia) this).a(13, (byte[]) null, 70, -102);
        }
    }

    final int e(int param0) {
        ((uia) this).field_h = ((uia) this).field_h + 4;
        int var2 = -60 / ((param0 - 44) / 50);
        return ((255 & ((uia) this).field_g[-2 + ((uia) this).field_h]) << -521640376) + ((-16777216 & ((uia) this).field_g[((uia) this).field_h - 4] << 925247704) - -((255 & ((uia) this).field_g[-3 + ((uia) this).field_h]) << 1980335824) + (255 & ((uia) this).field_g[((uia) this).field_h - 1]));
    }

    final int g(int param0, int param1) {
        int var3 = aia.a(((uia) this).field_g, ((uia) this).field_h, 80, param0);
        ((uia) this).a(var3, (byte) -60);
        if (param1 != 64) {
            field_f = null;
        }
        return var3;
    }

    final void f(int param0, int param1) {
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)(param1 >> -1477662136);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)param1;
        if (param0 != -1477662136) {
            String discarded$0 = ((uia) this).f(64);
        }
    }

    final boolean a(byte param0) {
        ((uia) this).field_h = ((uia) this).field_h - 4;
        int var2 = aia.a(((uia) this).field_g, ((uia) this).field_h, param0 ^ -27, 0);
        int var3 = ((uia) this).e(-56);
        if (param0 != 114) {
            String discarded$0 = ((uia) this).c(20);
        }
        if (var2 == var3) {
            return true;
        }
        return false;
    }

    final void a(String param0, byte param1) {
        int var3 = param0.indexOf(' ');
        if (!(-1 < (var3 ^ -1))) {
            throw new IllegalArgumentException("");
        }
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte)param1;
        CharSequence var4 = (CharSequence) (Object) param0;
        ((uia) this).field_h = ((uia) this).field_h + laa.a(((uia) this).field_h, param0.length(), ((uia) this).field_g, 0, var4, (byte) -4);
        ((uia) this).field_h = ((uia) this).field_h + 1;
        ((uia) this).field_g[((uia) this).field_h] = (byte) 0;
    }

    final int h(int param0) {
        if (param0 != 255) {
            field_f = null;
        }
        ((uia) this).field_h = ((uia) this).field_h + 1;
        return 255 & ((uia) this).field_g[((uia) this).field_h];
    }

    final String c(int param0) {
        if (param0 != -28690) {
            return null;
        }
        if (((uia) this).field_g[((uia) this).field_h] == 0) {
            ((uia) this).field_h = ((uia) this).field_h + 1;
            return null;
        }
        return ((uia) this).e((byte) -76);
    }

    final void c(int param0, int param1) {
        int var3 = -74 % ((78 - param1) / 41);
        if (!((param0 & -128) == 0)) {
            if (0 != (param0 & -16384)) {
                if (!((-2097152 & param0) == 0)) {
                    if ((-268435456 & param0) != 0) {
                        ((uia) this).i(param0 >>> -1622567204 | 128, 0);
                    }
                    ((uia) this).i(param0 >>> -986885067 | 128, 0);
                }
                ((uia) this).i(param0 >>> 1559526094 | 128, 0);
            }
            ((uia) this).i(128 | param0 >>> -645660505, 0);
        }
        ((uia) this).i(param0 & 127, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Open";
    }
}
