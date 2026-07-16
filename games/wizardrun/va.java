/*
 * Decompiled by CFR-JS 0.4.0.
 */
class va extends wl {
    static rc field_l;
    static ok field_o;
    byte[] field_k;
    int field_m;
    static vd field_i;
    static kl field_n;
    static ji field_j;

    final void a(int param0, boolean param1) {
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$0] = (byte)(param0 >> 654986384);
        int fieldTemp$1 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$1] = (byte)(param0 >> 727059944);
        if (param1) {
            field_l = null;
        }
        int fieldTemp$2 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$2] = (byte)param0;
    }

    final void a(String param0, int param1) {
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = wizardrun.field_H;
        var3 = 0L;
        var5 = 0L;
        if (param1 == -66) {
          var7 = param0.length();
          var8 = 19;
          L0: while (true) {
            if (0 > var8) {
              this.a(param1 + -17663, var3);
              this.a(-17729, var5);
              return;
            } else {
              L1: {
                var3 = var3 * 38L;
                if (var7 <= var8) {
                  break L1;
                } else {
                  L2: {
                    var9 = param0.charAt(var8);
                    if (var9 < 65) {
                      break L2;
                    } else {
                      if (var9 <= 90) {
                        var3 = var3 + (long)(2 + (var9 - 65));
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (var9 < 97) {
                      break L3;
                    } else {
                      if (var9 <= 122) {
                        var3 = var3 + (long)(2 + var9 - 97);
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (48 > var9) {
                      break L4;
                    } else {
                      if (57 >= var9) {
                        var3 = var3 + (long)(var9 + -20);
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var3 = var3 + 1L;
                  break L1;
                }
              }
              if ((var8 ^ -1) == -11) {
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
        } else {
          return;
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = wizardrun.field_H;
        int var5 = -119 % ((-47 - param3) / 41);
        for (var6 = param1; param2 + param1 > var6; var6++) {
            int fieldTemp$0 = ((va) this).field_m;
            ((va) this).field_m = ((va) this).field_m + 1;
            ((va) this).field_k[fieldTemp$0] = param0[var6];
        }
    }

    final String d(int param0) {
        if (param0 != 0) {
            ((va) this).c(44, -40);
        }
        int var2 = ((va) this).field_m;
        while (true) {
            int fieldTemp$0 = ((va) this).field_m;
            ((va) this).field_m = ((va) this).field_m + 1;
            if (((va) this).field_k[fieldTemp$0] == 0) {
                break;
            }
        }
        int var3 = ((va) this).field_m + -var2 - 1;
        if (!(var3 != 0)) {
            return "";
        }
        return bi.a(var2, var3, ((va) this).field_k, false);
    }

    final void b(byte param0, int param1) {
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$0] = (byte)param1;
        if (param0 != 11) {
            field_i = null;
        }
    }

    final void b(int param0, long param1) {
        Object var5 = null;
        L0: {
          int fieldTemp$8 = ((va) this).field_m;
          ((va) this).field_m = ((va) this).field_m + 1;
          ((va) this).field_k[fieldTemp$8] = (byte)(int)(param1 >> -195708040);
          if (param0 == 1290648728) {
            break L0;
          } else {
            var5 = null;
            ((va) this).a(true, -58, (byte[]) null, 44);
            break L0;
          }
        }
        int fieldTemp$9 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$9] = (byte)(int)(param1 >> 1088471216);
        int fieldTemp$10 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$10] = (byte)(int)(param1 >> -1278008792);
        int fieldTemp$11 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$11] = (byte)(int)(param1 >> -244826912);
        int fieldTemp$12 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$12] = (byte)(int)(param1 >> 1290648728);
        int fieldTemp$13 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$13] = (byte)(int)(param1 >> 1799809936);
        int fieldTemp$14 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$14] = (byte)(int)(param1 >> -79645368);
        int fieldTemp$15 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$15] = (byte)(int)param1;
    }

    final void a(boolean param0, int[] param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = wizardrun.field_H;
        int var5 = ((va) this).field_m;
        ((va) this).field_m = param2;
        if (param0) {
            return;
        }
        int var6 = (-param2 + param3) / 8;
        for (var7 = 0; var7 < var6; var7++) {
            var8 = ((va) this).i(255);
            var9 = ((va) this).i(255);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
                int incrementValue$0 = var12;
                var12--;
                if (0 >= incrementValue$0) {
                    break;
                }
                var9 = var9 - (param1[1470103555 & var10 >>> -1065531925] + var10 ^ (var8 << -126492316 ^ var8 >>> 1710370149) - -var8);
                var10 = var10 - var11;
                var8 = var8 - (var10 - -param1[3 & var10] ^ var9 + (var9 >>> -489249755 ^ var9 << 1492412868));
            }
            ((va) this).field_m = ((va) this).field_m - 8;
            ((va) this).f(var8, 613003928);
            ((va) this).f(var9, 613003928);
        }
        ((va) this).field_m = var5;
    }

    final void d(int param0, int param1) {
        if ((param1 ^ -1) > -65) {
            if (!((param1 ^ -1) > 63)) {
                ((va) this).b((byte) 11, 64 + param1);
                return;
            }
        }
        if (-16385 < (param1 ^ -1)) {
            if (!(16383 < (param1 ^ -1))) {
                ((va) this).b(-1947079288, 49152 + param1);
                return;
            }
        }
        if (param0 != 1710370149) {
            return;
        }
        throw new IllegalArgumentException();
    }

    final void a(byte param0, int param1) {
        if (!(-1 == (param1 & -128))) {
            if (!((param1 & -16384) == 0)) {
                if (!(0 == (param1 & -2097152))) {
                    if (-1 != (param1 & -268435456)) {
                        ((va) this).b((byte) 11, 128 | param1 >>> 1562880156);
                    }
                    ((va) this).b((byte) 11, 128 | param1 >>> 1206037813);
                }
                ((va) this).b((byte) 11, (param1 | 2107542) >>> 238958030);
            }
            ((va) this).b((byte) 11, (16440 | param1) >>> -1188281273);
        }
        if (param0 != -117) {
            ((va) this).field_k = null;
        }
        ((va) this).b((byte) 11, param1 & 127);
    }

    final long e(byte param0) {
        if (param0 != 0) {
            return 72L;
        }
        long var2 = (long)((va) this).i(255) & 4294967295L;
        long var4 = 4294967295L & (long)((va) this).i(255);
        return (var2 << -636290912) + var4;
    }

    final int a(int param0) {
        int var2 = 255 & ((va) this).field_k[((va) this).field_m];
        if (param0 != 20479) {
            return -111;
        }
        if (128 <= var2) {
            return -49152 + ((va) this).j(-14477);
        }
        return ((va) this).f(255) + -64;
    }

    final String c(int param0) {
        if (param0 == (((va) this).field_k[((va) this).field_m] ^ -1)) {
            ((va) this).field_m = ((va) this).field_m + 1;
            return null;
        }
        return ((va) this).d(0);
    }

    final int d(byte param0) {
        if (param0 <= 73) {
            return 26;
        }
        ((va) this).field_m = ((va) this).field_m + 3;
        return ((255 & ((va) this).field_k[-3 + ((va) this).field_m]) << -1933150128) + (((va) this).field_k[-2 + ((va) this).field_m] << 1893276136 & 65280) - -(255 & ((va) this).field_k[((va) this).field_m + -1]);
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$0] = (byte)(param1 >> -1947079288);
        int fieldTemp$1 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$1] = (byte)param1;
        if (param0 != -1947079288) {
            field_j = null;
        }
    }

    final int f(int param0) {
        if (param0 != 255) {
            field_l = null;
        }
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        return 255 & ((va) this).field_k[fieldTemp$0];
    }

    final void a(boolean param0, int param1, byte[] param2, int param3) {
        int var5 = 0;
        int var6 = wizardrun.field_H;
        if (!param0) {
            return;
        }
        for (var5 = param3; var5 < param3 - -param1; var5++) {
            int fieldTemp$0 = ((va) this).field_m;
            ((va) this).field_m = ((va) this).field_m + 1;
            param2[var5] = ((va) this).field_k[fieldTemp$0];
        }
    }

    final void a(String param0, boolean param1) {
        int var3 = param0.indexOf(' ');
        if (-1 >= (var3 ^ -1)) {
            throw new IllegalArgumentException("");
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        ((va) this).field_m = ((va) this).field_m + pg.a(8220, ((va) this).field_k, 0, var4, ((va) this).field_m, param0.length());
        if (param1) {
            return;
        }
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$0] = (byte) 0;
    }

    final String h(int param0) {
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        int var2 = ((va) this).field_k[fieldTemp$0];
        if (param0 != 727059944) {
            return null;
        }
        if (var2 != 0) {
            throw new IllegalStateException("");
        }
        int var3 = ((va) this).field_m;
        while (true) {
            int fieldTemp$1 = ((va) this).field_m;
            ((va) this).field_m = ((va) this).field_m + 1;
            if (((va) this).field_k[fieldTemp$1] == 0) {
                break;
            }
        }
        int var4 = -1 + -var3 + ((va) this).field_m;
        if (!(0 != var4)) {
            return "";
        }
        return bi.a(var3, var4, ((va) this).field_k, false);
    }

    final static void a(int param0, String param1) {
        if (param0 != -2) {
            return;
        }
        sf.field_b = param1;
    }

    final void a(int param0, int param1) {
        ((va) this).field_k[((va) this).field_m - (param0 - -1)] = (byte)param0;
        if (param1 >= -43) {
            int discarded$0 = ((va) this).e(108, -51);
        }
    }

    public static void g(byte param0) {
        field_o = null;
        field_n = null;
        field_l = null;
        int var1 = -88 % ((param0 - 78) / 38);
        field_i = null;
        field_j = null;
    }

    final int g(int param0) {
        if (param0 != 11681) {
            field_j = null;
        }
        int var2 = ((va) this).field_k[((va) this).field_m] & 255;
        if ((var2 ^ -1) <= -129) {
            return -32768 + ((va) this).j(param0 ^ -5422);
        }
        return ((va) this).f(255);
    }

    va(int param0) {
        ((va) this).field_m = 0;
        ((va) this).field_k = ej.a(param0, 1);
    }

    final void c(int param0, int param1) {
        int var4 = wizardrun.field_H;
        if (param1 <= 122) {
            String discarded$0 = ((va) this).d(-54);
        }
        while (((va) this).field_m < param0) {
            int fieldTemp$1 = ((va) this).field_m;
            ((va) this).field_m = ((va) this).field_m + 1;
            ((va) this).field_k[fieldTemp$1] = (byte) 0;
        }
    }

    final int i(int param0) {
        ((va) this).field_m = ((va) this).field_m + 4;
        if (param0 != 255) {
            ((va) this).field_k = null;
        }
        return (((va) this).field_k[-1 + ((va) this).field_m] & 255) + (((((va) this).field_k[((va) this).field_m - 3] & 255) << 1417994032) + (-16777216 & ((va) this).field_k[((va) this).field_m + -4] << 969891352) + ((255 & ((va) this).field_k[((va) this).field_m + -2]) << 1798033672));
    }

    final void b(int param0, String param1) {
        int var3 = param1.indexOf(' ');
        if (!(param0 > var3)) {
            throw new IllegalArgumentException("");
        }
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$0] = (byte) 0;
        CharSequence var4 = (CharSequence) (Object) param1;
        ((va) this).field_m = ((va) this).field_m + pg.a(8220, ((va) this).field_k, 0, var4, ((va) this).field_m, param1.length());
        int fieldTemp$1 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$1] = (byte) 0;
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$0] = (byte)(param0 >> 613003928);
        int fieldTemp$1 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$1] = (byte)(param0 >> 617378768);
        int fieldTemp$2 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$2] = (byte)(param0 >> 196155528);
        if (param1 != 613003928) {
            return;
        }
        int fieldTemp$3 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$3] = (byte)param0;
    }

    final void a(boolean param0, int[] param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = wizardrun.field_H;
        if (param0) {
        }
        int var3 = ((va) this).field_m / 8;
        ((va) this).field_m = 0;
        for (var4 = 0; var4 < var3; var4++) {
            var5 = ((va) this).i(255);
            var6 = ((va) this).i(255);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
                int incrementValue$0 = var9;
                var9--;
                if (incrementValue$0 <= 0) {
                    break;
                }
                var5 = var5 + (var7 - -param1[var7 & 3] ^ (var6 << -945565660 ^ var6 >>> -906239355) + var6);
                var7 = var7 + var8;
                var6 = var6 + (param1[(7920 & var7) >>> 1790305675] + var7 ^ var5 + (var5 << 1308459524 ^ var5 >>> 1833076325));
            }
            ((va) this).field_m = ((va) this).field_m - 8;
            ((va) this).f(var5, 613003928);
            ((va) this).f(var6, 613003928);
        }
    }

    final int a(byte param0) {
        if (param0 != -88) {
            return -55;
        }
        if (((va) this).field_k[((va) this).field_m] >= 0) {
            return ((va) this).j(-14477);
        }
        return 2147483647 & ((va) this).i(255);
    }

    final void b(int param0, byte param1) {
        ((va) this).field_k[-4 + (((va) this).field_m - param0)] = (byte)(param0 >> 226795928);
        ((va) this).field_k[-3 + (((va) this).field_m + -param0)] = (byte)(param0 >> 1902038032);
        ((va) this).field_k[-param0 + (((va) this).field_m + -2)] = (byte)(param0 >> 1559790984);
        if (param1 > -20) {
            Object var4 = null;
            va.a(27, (String) null);
        }
        ((va) this).field_k[-1 + (-param0 + ((va) this).field_m)] = (byte)param0;
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$0] = (byte)(int)(param0 >> 579952544);
        int fieldTemp$1 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$1] = (byte)(int)(param0 >> -2059590376);
        int fieldTemp$2 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$2] = (byte)(int)(param0 >> 93344400);
        int fieldTemp$3 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$3] = (byte)(int)(param0 >> 1271166344);
        int fieldTemp$4 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$4] = (byte)(int)param0;
        if (param1 <= 101) {
            field_j = null;
        }
    }

    final byte k(int param0) {
        if (param0 != 0) {
            ((va) this).field_m = 10;
        }
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        return ((va) this).field_k[fieldTemp$0];
    }

    final int j(int param0) {
        if (param0 != -14477) {
            return -34;
        }
        ((va) this).field_m = ((va) this).field_m + 2;
        return (255 & ((va) this).field_k[-1 + ((va) this).field_m]) + (((va) this).field_k[-2 + ((va) this).field_m] << -1956797176 & 65280);
    }

    final int e(int param0, int param1) {
        if (param1 != -1182887024) {
            String discarded$0 = ((va) this).d(-77);
        }
        int var3 = gh.a(((va) this).field_k, 107, param0, ((va) this).field_m);
        ((va) this).f(var3, 613003928);
        return var3;
    }

    final void a(int param0, byte param1) {
        ((va) this).field_k[-2 + -param0 + ((va) this).field_m] = (byte)(param0 >> -271081976);
        ((va) this).field_k[-1 + (((va) this).field_m - param0)] = (byte)param0;
        if (param1 != -67) {
            String discarded$0 = ((va) this).d(73);
        }
    }

    private final void a(int param0, long param1) {
        if (param0 != -17729) {
            return;
        }
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$0] = (byte)(int)(param1 >> -869651216);
        int fieldTemp$1 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$1] = (byte)(int)(param1 >> -724284184);
        int fieldTemp$2 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$2] = (byte)(int)(param1 >> -968117280);
        int fieldTemp$3 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$3] = (byte)(int)(param1 >> -1061967208);
        int fieldTemp$4 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$4] = (byte)(int)(param1 >> -1182887024);
        int fieldTemp$5 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$5] = (byte)(int)(param1 >> -721628152);
        int fieldTemp$6 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        ((va) this).field_k[fieldTemp$6] = (byte)(int)param1;
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        int var4 = ((va) this).field_m;
        ((va) this).field_m = 0;
        byte[] var5 = new byte[var4];
        ((va) this).a(true, var4, var5, 0);
        java.math.BigInteger var6 = new java.math.BigInteger(var5);
        if (param1 <= 17) {
            ((va) this).d(5, -27);
        }
        java.math.BigInteger var7 = var6.modPow(param2, param0);
        byte[] var8 = var7.toByteArray();
        ((va) this).field_m = 0;
        ((va) this).b(-1947079288, var8.length);
        ((va) this).a(var8, 0, var8.length, -3);
    }

    final int f(byte param0) {
        int var4 = wizardrun.field_H;
        int fieldTemp$0 = ((va) this).field_m;
        ((va) this).field_m = ((va) this).field_m + 1;
        int var2 = ((va) this).field_k[fieldTemp$0];
        if (param0 != -90) {
            field_l = null;
        }
        int var3 = 0;
        while (var2 < 0) {
            var3 = (var2 & 127 | var3) << -1473799097;
            int fieldTemp$1 = ((va) this).field_m;
            ((va) this).field_m = ((va) this).field_m + 1;
            var2 = ((va) this).field_k[fieldTemp$1];
        }
        return var3 | var2;
    }

    final boolean e(int param0) {
        if (param0 != -6142) {
            Object var4 = null;
            ((va) this).a((byte[]) null, 113, 122, -33);
        }
        ((va) this).field_m = ((va) this).field_m - 4;
        int var2 = gh.a(((va) this).field_k, 116, 0, ((va) this).field_m);
        int var3 = ((va) this).i(255);
        if (var3 == var2) {
            return true;
        }
        return false;
    }

    va(byte[] param0) {
        ((va) this).field_k = param0;
        ((va) this).field_m = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new rc();
        field_o = new ok();
    }
}
