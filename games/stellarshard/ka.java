/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ka extends gg {
    static int field_q;
    static int field_p;
    static pf field_n;
    int field_k;
    static String field_l;
    static ba field_m;
    static long field_o;
    byte[] field_r;

    final int h(int param0) {
        if (param0 != 26491) {
            return 2;
        }
        if (-1 < (((ka) this).field_r[((ka) this).field_k] ^ -1)) {
            return ((ka) this).b(false) & 2147483647;
        }
        return ((ka) this).c((byte) 100);
    }

    final void b(int param0, int param1) {
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(param1 >> -274395144);
        if (param0 != 0) {
            return;
        }
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(param1 >> 1862955024);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(param1 >> -935552856);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)param1;
    }

    final void a(int param0, int param1) {
        int var4 = stellarshard.field_B;
        while (((ka) this).field_k < param0) {
            ((ka) this).field_k = ((ka) this).field_k + 1;
            ((ka) this).field_r[((ka) this).field_k] = (byte) 0;
        }
        if (param1 != -18920) {
            field_q = 77;
            return;
        }
    }

    final String f(byte param0) {
        ((ka) this).field_k = ((ka) this).field_k + 1;
        int var2 = ((ka) this).field_r[((ka) this).field_k];
        if (!(-1 == (var2 ^ -1))) {
            throw new IllegalStateException("");
        }
        if (param0 != 94) {
            return null;
        }
        int var3 = ((ka) this).field_k;
        while (true) {
            ((ka) this).field_k = ((ka) this).field_k + 1;
            if (((ka) this).field_r[((ka) this).field_k] == 0) {
                break;
            }
        }
        int var4 = ((ka) this).field_k + (-var3 + -1);
        if (!(0 != var4)) {
            return "";
        }
        return kk.a(var4, (byte) 121, var3, ((ka) this).field_r);
    }

    final void a(boolean param0, int param1) {
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)param1;
        if (param0) {
            field_p = 77;
        }
    }

    final String e(byte param0) {
        int var2 = ((ka) this).field_k;
        while (true) {
            ((ka) this).field_k = ((ka) this).field_k + 1;
            if (((ka) this).field_r[((ka) this).field_k] == 0) {
                break;
            }
        }
        int var3 = -1 + (((ka) this).field_k - var2);
        if (!(var3 != 0)) {
            return "";
        }
        if (param0 < 78) {
            return null;
        }
        return kk.a(var3, (byte) 93, var2, ((ka) this).field_r);
    }

    final void a(int param0, long param1) {
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)(param1 >> 368955104);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)(param1 >> 1944319256);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)(param1 >> -804629296);
        if (param0 <= 9) {
            ((ka) this).field_r = null;
            ((ka) this).field_k = ((ka) this).field_k + 1;
            ((ka) this).field_r[((ka) this).field_k] = (byte)(int)(param1 >> 237753544);
            ((ka) this).field_k = ((ka) this).field_k + 1;
            ((ka) this).field_r[((ka) this).field_k] = (byte)(int)param1;
            return;
        }
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)(param1 >> 237753544);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)param1;
    }

    final boolean a(boolean param0) {
        ((ka) this).field_k = ((ka) this).field_k - 4;
        int var2 = jj.a(0, ((ka) this).field_r, ((ka) this).field_k, -107);
        int var3 = ((ka) this).b(false);
        if (var3 == var2) {
            return true;
        }
        if (!param0) {
            return true;
        }
        return false;
    }

    final void c(int param0, int param1) {
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(param0 >> 1838063176);
        if (param1 > -110) {
            ((ka) this).field_k = 36;
            ((ka) this).field_k = ((ka) this).field_k + 1;
            ((ka) this).field_r[((ka) this).field_k] = (byte)param0;
            return;
        }
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)param0;
    }

    final byte g(int param0) {
        int var2 = 103 % ((param0 - 45) / 56);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        return ((ka) this).field_r[((ka) this).field_k];
    }

    final String a(int param0) {
        if (!(((ka) this).field_r[((ka) this).field_k] != param0)) {
            ((ka) this).field_k = ((ka) this).field_k + 1;
            return null;
        }
        return ((ka) this).e((byte) 87);
    }

    final int c(int param0, byte param1) {
        int var3 = 0;
        if (param1 != -3) {
            field_l = null;
            var3 = jj.a(param0, ((ka) this).field_r, ((ka) this).field_k, -65);
            ((ka) this).b(0, var3);
            return var3;
        }
        var3 = jj.a(param0, ((ka) this).field_r, ((ka) this).field_k, -65);
        ((ka) this).b(0, var3);
        return var3;
    }

    final void a(int param0, int[] param1, int param2, int param3) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = stellarshard.field_B;
        int var5 = ((ka) this).field_k;
        ((ka) this).field_k = param2;
        int var6 = (-param2 + param3) / 8;
        int var7 = 0;
        int var8 = -113 % ((param0 - 29) / 33);
        while (var6 > var7) {
            var9 = ((ka) this).b(false);
            var10 = ((ka) this).b(false);
            var11 = -957401312;
            var12 = -1640531527;
            var13 = 32;
            while (true) {
                var13--;
                if (var13 <= 0) {
                    break;
                }
                var10 = var10 - (var9 + (var9 >>> -2077916315 ^ var9 << 1297130020) ^ var11 + param1[(7205 & var11) >>> 2055919595]);
                var11 = var11 - var12;
                var9 = var9 - (var11 + param1[3 & var11] ^ (var10 >>> 1403350469 ^ var10 << -1823794492) + var10);
            }
            ((ka) this).field_k = ((ka) this).field_k - 8;
            ((ka) this).b(0, var9);
            ((ka) this).b(0, var10);
            var7++;
        }
        ((ka) this).field_k = var5;
    }

    final int c(byte param0) {
        if (param0 < 21) {
            return 45;
        }
        ((ka) this).field_k = ((ka) this).field_k + 2;
        return (((ka) this).field_r[((ka) this).field_k + -2] << -1574619128 & 65280) + (255 & ((ka) this).field_r[((ka) this).field_k - 1]);
    }

    public static void a(byte param0) {
        field_n = null;
        field_l = null;
        field_m = null;
        int var1 = -51 / ((param0 - -64) / 48);
    }

    final void a(byte param0, int param1) {
        if (param1 <= -65) {
            if (16384 <= param1) {
                if (param0 < 3) {
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (16383 > param1) {
                if (param0 < 3) {
                    return;
                }
                throw new IllegalArgumentException();
            }
            ((ka) this).c(param1 - -49152, -128);
            return;
        }
        if (param1 < -64) {
            if (16384 <= param1) {
                if (param0 < 3) {
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (16383 < (param1 ^ -1)) {
                if (param0 < 3) {
                    return;
                }
                throw new IllegalArgumentException();
            }
            ((ka) this).c(param1 - -49152, -128);
            return;
        }
        ((ka) this).a(false, param1 + 64);
    }

    final void b(String param0, int param1) {
        if (param1 != -9799) {
            return;
        }
        int var3 = param0.indexOf(' ');
        if (!(-1 < (var3 ^ -1))) {
            throw new IllegalArgumentException("");
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        ((ka) this).field_k = ((ka) this).field_k + qi.a(((ka) this).field_r, param1 + 9689, ((ka) this).field_k, 0, var4, param0.length());
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte) 0;
    }

    final void a(boolean param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4 = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        if (param0) {
            ((ka) this).field_r = null;
            var4 = ((ka) this).field_k;
            ((ka) this).field_k = 0;
            var5 = new byte[var4];
            ((ka) this).a(0, (byte) -108, var4, var5);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param2, param1);
            var8 = var7.toByteArray();
            ((ka) this).field_k = 0;
            ((ka) this).c(var8.length, -123);
            ((ka) this).a(var8.length, 0, (byte) -13, var8);
            return;
        }
        var4 = ((ka) this).field_k;
        ((ka) this).field_k = 0;
        var5 = new byte[var4];
        ((ka) this).a(0, (byte) -108, var4, var5);
        var6 = new java.math.BigInteger(var5);
        var7 = var6.modPow(param2, param1);
        var8 = var7.toByteArray();
        ((ka) this).field_k = 0;
        ((ka) this).c(var8.length, -123);
        ((ka) this).a(var8.length, 0, (byte) -13, var8);
    }

    final void a(int param0, int param1, byte param2, byte[] param3) {
        int var5 = 0;
        int var6 = stellarshard.field_B;
        if (param2 != -13) {
            return;
        }
        for (var5 = param1; param1 - -param0 > var5; var5++) {
            ((ka) this).field_k = ((ka) this).field_k + 1;
            ((ka) this).field_r[((ka) this).field_k] = param3[var5];
        }
    }

    final void a(int param0, byte param1, int param2, byte[] param3) {
        int var5 = 0;
        int var6 = stellarshard.field_B;
        if (param1 >= -99) {
            Object var7 = null;
            ((ka) this).a(true, (String) null);
            for (var5 = param0; var5 < param2 + param0; var5++) {
                ((ka) this).field_k = ((ka) this).field_k + 1;
                param3[var5] = ((ka) this).field_r[((ka) this).field_k];
            }
            return;
        }
        for (var5 = param0; var5 < param2 + param0; var5++) {
            ((ka) this).field_k = ((ka) this).field_k + 1;
            param3[var5] = ((ka) this).field_r[((ka) this).field_k];
        }
    }

    final int f(int param0) {
        if (param0 != 4) {
            ((ka) this).field_k = 119;
            ((ka) this).field_k = ((ka) this).field_k + 1;
            return 255 & ((ka) this).field_r[((ka) this).field_k];
        }
        ((ka) this).field_k = ((ka) this).field_k + 1;
        return 255 & ((ka) this).field_r[((ka) this).field_k];
    }

    final long d(int param0) {
        if (param0 != 0) {
            return 47L;
        }
        long var2 = (long)((ka) this).b(false) & 4294967295L;
        long var4 = 4294967295L & (long)((ka) this).b(false);
        return var4 + (var2 << 859560608);
    }

    final void b(int param0, byte param1) {
        if (param1 <= 118) {
            return;
        }
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(param0 >> -377866992);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(param0 >> -1782445016);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)param0;
    }

    final int d(byte param0) {
        int var2 = 255 & ((ka) this).field_r[((ka) this).field_k];
        int var3 = -99 / ((58 - param0) / 37);
        if ((var2 ^ -1) > -129) {
            return ((ka) this).f(4);
        }
        return -32768 + ((ka) this).c((byte) 24);
    }

    final int b(boolean param0) {
        ((ka) this).field_k = ((ka) this).field_k + 4;
        if (param0) {
            field_o = 122L;
            return (((ka) this).field_r[((ka) this).field_k + -1] & 255) + ((((ka) this).field_r[((ka) this).field_k - 2] << 1479795464 & 65280) + ((((ka) this).field_r[-3 + ((ka) this).field_k] & 255) << -57909872)) + (-16777216 & ((ka) this).field_r[-4 + ((ka) this).field_k] << -84261640);
        }
        return (((ka) this).field_r[((ka) this).field_k + -1] & 255) + ((((ka) this).field_r[((ka) this).field_k - 2] << 1479795464 & 65280) + ((((ka) this).field_r[-3 + ((ka) this).field_k] & 255) << -57909872)) + (-16777216 & ((ka) this).field_r[-4 + ((ka) this).field_k] << -84261640);
    }

    final void a(int param0, byte param1) {
        ((ka) this).field_r[-param0 + ((ka) this).field_k - 1] = (byte)param0;
        int var3 = 41 % ((param1 - -11) / 53);
    }

    final void a(int param0, String param1) {
        int var3 = param1.indexOf(' ');
        if ((var3 ^ -1) <= -1) {
            throw new IllegalArgumentException("");
        }
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte) 0;
        CharSequence var5 = (CharSequence) (Object) param1;
        ((ka) this).field_k = ((ka) this).field_k + qi.a(((ka) this).field_r, -53, ((ka) this).field_k, 0, var5, param1.length());
        int var4 = 89 % ((37 - param0) / 39);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte) 0;
    }

    final void a(byte param0, int[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = stellarshard.field_B;
        var3 = ((ka) this).field_k / 8;
        ((ka) this).field_k = 0;
        if (param0 == 12) {
          var4 = 0;
          L0: while (true) {
            if (var3 <= var4) {
              return;
            } else {
              var5 = ((ka) this).b(false);
              var6 = ((ka) this).b(false);
              var7 = 0;
              var8 = -1640531527;
              var9 = 32;
              L1: while (true) {
                var9--;
                if ((var9 ^ -1) >= -1) {
                  ((ka) this).field_k = ((ka) this).field_k - 8;
                  ((ka) this).b(0, var5);
                  ((ka) this).b(0, var6);
                  var4++;
                  continue L0;
                } else {
                  var5 = var5 + (var6 + (var6 << 1431928932 ^ var6 >>> -828520987) ^ param1[3 & var7] + var7);
                  var7 = var7 + var8;
                  var6 = var6 + (var7 + param1[729808899 & var7 >>> 384099851] ^ var5 + (var5 >>> -1213983067 ^ var5 << 1603365380));
                  continue L1;
                }
              }
            }
          }
        } else {
          ((ka) this).field_r = null;
          var4 = 0;
          L2: while (true) {
            if (var3 <= var4) {
              return;
            } else {
              var5 = ((ka) this).b(false);
              var6 = ((ka) this).b(false);
              var7 = 0;
              var8 = -1640531527;
              var9 = 32;
              L3: while (true) {
                var9--;
                if ((var9 ^ -1) >= -1) {
                  ((ka) this).field_k = ((ka) this).field_k - 8;
                  ((ka) this).b(0, var5);
                  ((ka) this).b(0, var6);
                  var4++;
                  continue L2;
                } else {
                  var5 = var5 + (var6 + (var6 << 1431928932 ^ var6 >>> -828520987) ^ param1[3 & var7] + var7);
                  var7 = var7 + var8;
                  var6 = var6 + (var7 + param1[729808899 & var7 >>> 384099851] ^ var5 + (var5 >>> -1213983067 ^ var5 << 1603365380));
                  continue L3;
                }
              }
            }
          }
        }
    }

    final void a(boolean param0, String param1) {
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = stellarshard.field_B;
        var3 = 0L;
        var5 = 0L;
        var7 = param1.length();
        var8 = 19;
        L0: while (true) {
          if (0 > var8) {
            this.b(8, var3);
            if (!param0) {
              this.b(8, var5);
              return;
            } else {
              return;
            }
          } else {
            L1: {
              var3 = var3 * 38L;
              if (var8 >= var7) {
                if (var8 == 10) {
                  break L1;
                } else {
                  var8--;
                  continue L0;
                }
              } else {
                L2: {
                  L3: {
                    var9 = param1.charAt(var8);
                    if (var9 < 65) {
                      break L3;
                    } else {
                      if (90 < var9) {
                        break L3;
                      } else {
                        var3 = var3 + (long)(2 - (-var9 + 65));
                        break L2;
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
                        var3 = var3 + (long)(var9 + 2 + -97);
                        break L2;
                      }
                    }
                  }
                  L5: {
                    if (var9 < 48) {
                      break L5;
                    } else {
                      if (57 >= var9) {
                        var3 = var3 + (long)(var9 + -20);
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var3 = var3 + 1L;
                  break L2;
                }
                if (var8 == 10) {
                  break L1;
                } else {
                  var8--;
                  continue L0;
                }
              }
            }
            var5 = var3;
            var3 = 0L;
            var8--;
            continue L0;
          }
        }
    }

    final int e(int param0) {
        int var2 = 0;
        if (param0 != -64) {
            field_n = null;
            var2 = ((ka) this).field_r[((ka) this).field_k] & 255;
            if (var2 >= 128) {
                return -49152 + ((ka) this).c((byte) 43);
            }
            return ((ka) this).f(4) + -64;
        }
        var2 = ((ka) this).field_r[((ka) this).field_k] & 255;
        if (var2 >= 128) {
            return -49152 + ((ka) this).c((byte) 43);
        }
        return ((ka) this).f(4) + -64;
    }

    final int c(boolean param0) {
        ((ka) this).field_k = ((ka) this).field_k + 3;
        if (!param0) {
            int discarded$0 = ((ka) this).c(true);
            return (255 & ((ka) this).field_r[((ka) this).field_k - 1]) + ((((ka) this).field_r[-3 + ((ka) this).field_k] << -2000515184 & 16711680) + ((255 & ((ka) this).field_r[-2 + ((ka) this).field_k]) << 1211683144));
        }
        return (255 & ((ka) this).field_r[((ka) this).field_k - 1]) + ((((ka) this).field_r[-3 + ((ka) this).field_k] << -2000515184 & 16711680) + ((255 & ((ka) this).field_r[-2 + ((ka) this).field_k]) << 1211683144));
    }

    ka(int param0) {
        ((ka) this).field_k = 0;
        ((ka) this).field_r = ee.a(param0, true);
    }

    private final void b(int param0, long param1) {
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)(param1 >> 1665079024);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)(param1 >> -25460248);
        if (param0 != 8) {
            return;
        }
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)(param1 >> 1710510432);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)(param1 >> -1738731240);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)(param1 >> -2006976624);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)(param1 >> -1215580088);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)param1;
    }

    ka(byte[] param0) {
        ((ka) this).field_k = 0;
        ((ka) this).field_r = param0;
    }

    final void a(byte param0, long param1) {
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)(param1 >> 915467640);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)(param1 >> -1677939344);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)(param1 >> -106987672);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)(param1 >> 669430048);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)(param1 >> 1265997336);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)(param1 >> 1205230352);
        if (param0 < 116) {
            return;
        }
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)(param1 >> 411852040);
        ((ka) this).field_k = ((ka) this).field_k + 1;
        ((ka) this).field_r[((ka) this).field_k] = (byte)(int)param1;
    }

    final void d(int param0, int param1) {
        ((ka) this).field_r[-2 + -param1 + ((ka) this).field_k] = (byte)(param1 >> -1342869272);
        ((ka) this).field_r[-param1 + (((ka) this).field_k + param0)] = (byte)param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Bounce gun";
    }
}
