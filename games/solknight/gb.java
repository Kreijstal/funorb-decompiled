/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gb extends gg {
    static o[] field_k;
    static ef field_i;
    int field_m;
    static pc field_h;
    static int field_j;
    byte[] field_l;

    final long a(int param0) {
        long var2 = (long)((gb) this).e(true) & 4294967295L;
        if (param0 != 10526) {
            field_h = null;
        }
        long var4 = 4294967295L & (long)((gb) this).e(true);
        return var4 + (var2 << -746915296);
    }

    final void c(int param0, int param1) {
        int var3 = 16 % ((-52 - param0) / 49);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)param1;
    }

    final int e(boolean param0) {
        if (!param0) {
            return -122;
        }
        ((gb) this).field_m = ((gb) this).field_m + 4;
        return ((((gb) this).field_l[((gb) this).field_m + -2] & 255) << -934697176) + ((-16777216 & ((gb) this).field_l[-4 + ((gb) this).field_m] << 682343608) - -((255 & ((gb) this).field_l[-3 + ((gb) this).field_m]) << 548596112) + (255 & ((gb) this).field_l[((gb) this).field_m + -1]));
    }

    final static wg a(String param0, byte param1) {
        L0: {
          if (param1 >= 98) {
            break L0;
          } else {
            boolean discarded$2 = gb.a('*', 15);
            break L0;
          }
        }
        if (gf.field_Z != field_i) {
          L1: {
            if (field_i != da.field_d) {
              break L1;
            } else {
              if (param0.equals((Object) (Object) uh.field_r)) {
                field_i = el.field_p;
                return a.field_h;
              } else {
                break L1;
              }
            }
          }
          uh.field_r = param0;
          a.field_h = null;
          field_i = gf.field_Z;
          return null;
        } else {
          return null;
        }
    }

    final int e(int param0) {
        if (param0 != 6715) {
            return -126;
        }
        if (((gb) this).field_l[((gb) this).field_m] >= 0) {
            return ((gb) this).i(59);
        }
        return 2147483647 & ((gb) this).e(true);
    }

    final int c(boolean param0) {
        int var2 = ((gb) this).field_l[((gb) this).field_m] & 255;
        if (param0) {
            ((gb) this).b((byte) 69, 86);
        }
        if (-129 < (var2 ^ -1)) {
            return ((gb) this).j(255);
        }
        return -32768 + ((gb) this).i(-118);
    }

    private final void a(int param0, long param1) {
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)(param1 >> -524918224);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)(param1 >> 1986540712);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)(param1 >> -1572448416);
        if (param0 != -37) {
            return;
        }
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)(param1 >> 73216600);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)(param1 >> -1076860400);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)(param1 >> -654249592);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)param1;
    }

    final void a(int param0, String param1) {
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = SolKnight.field_L ? 1 : 0;
          var3 = 0L;
          var5 = 0L;
          if (param0 >= 41) {
            break L0;
          } else {
            field_j = 105;
            break L0;
          }
        }
        var7 = param1.length();
        var8 = 19;
        L1: while (true) {
          if (0 > var8) {
            this.a(-37, var3);
            this.a(-37, var5);
            return;
          } else {
            L2: {
              var3 = var3 * 38L;
              if (var8 < var7) {
                L3: {
                  var9 = param1.charAt(var8);
                  if (var9 < 65) {
                    break L3;
                  } else {
                    if (var9 > 90) {
                      break L3;
                    } else {
                      var3 = var3 + (long)(-65 + (var9 + 2));
                      break L2;
                    }
                  }
                }
                L4: {
                  if (97 > var9) {
                    break L4;
                  } else {
                    if (122 < var9) {
                      break L4;
                    } else {
                      var3 = var3 + (long)(2 + (var9 - 97));
                      break L2;
                    }
                  }
                }
                L5: {
                  if (var9 < 48) {
                    break L5;
                  } else {
                    if (57 >= var9) {
                      var3 = var3 + (long)(-48 + (28 + var9));
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                var3 = var3 + 1L;
                break L2;
              } else {
                break L2;
              }
            }
            if (-11 == (var8 ^ -1)) {
              var5 = var3;
              var3 = 0L;
              var8--;
              continue L1;
            } else {
              var8--;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var6 = SolKnight.field_L ? 1 : 0;
        for (var5 = param1; param1 - -param0 > var5; var5++) {
            ((gb) this).field_m = ((gb) this).field_m + 1;
            param3[var5] = ((gb) this).field_l[((gb) this).field_m];
        }
        if (param2 >= -109) {
            this.a(-27, 8L);
        }
    }

    final void a(byte param0, int param1) {
        if (!((-128 & param1) == 0)) {
            if (!((param1 & -16384) == 0)) {
                if (0 != (-2097152 & param1)) {
                    if ((-268435456 & param1) != 0) {
                        ((gb) this).c(-115, 128 | param1 >>> 649166492);
                    }
                    ((gb) this).c(38, 128 | param1 >>> 244562069);
                }
                ((gb) this).c(-128, param1 >>> 703317902 | 128);
            }
            ((gb) this).c(param0 + -83, 128 | param1 >>> -2082394169);
        }
        ((gb) this).c(param0 + 97, 127 & param1);
        if (param0 != -25) {
            field_h = null;
        }
    }

    final void b(byte param0, int param1) {
        int var4 = SolKnight.field_L ? 1 : 0;
        if (param0 != -65) {
            field_j = 4;
        }
        while (param1 > ((gb) this).field_m) {
            ((gb) this).field_m = ((gb) this).field_m + 1;
            ((gb) this).field_l[((gb) this).field_m] = (byte) 0;
        }
    }

    final int d(int param0) {
        int var2 = 101 / ((-54 - param0) / 41);
        int var3 = 255 & ((gb) this).field_l[((gb) this).field_m];
        if (128 <= var3) {
            return ((gb) this).i(91) + -49152;
        }
        return -64 + ((gb) this).j(255);
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int var5 = 0;
        int var6 = SolKnight.field_L ? 1 : 0;
        if (param0 != 8) {
            field_h = null;
        }
        for (var5 = param3; var5 < param3 - -param1; var5++) {
            ((gb) this).field_m = ((gb) this).field_m + 1;
            ((gb) this).field_l[((gb) this).field_m] = param2[var5];
        }
    }

    final int j(int param0) {
        if (param0 != 255) {
            ((gb) this).a((byte) 56, -16);
        }
        ((gb) this).field_m = ((gb) this).field_m + 1;
        return 255 & ((gb) this).field_l[((gb) this).field_m];
    }

    final boolean k(int param0) {
        ((gb) this).field_m = ((gb) this).field_m - param0;
        int var2 = ki.a(-27129, ((gb) this).field_l, ((gb) this).field_m, 0);
        int var3 = ((gb) this).e(true);
        if (var3 == var2) {
            return true;
        }
        return false;
    }

    final byte a(byte param0) {
        if (param0 != -14) {
            return (byte) -103;
        }
        ((gb) this).field_m = ((gb) this).field_m + 1;
        return ((gb) this).field_l[((gb) this).field_m];
    }

    final String g(int param0) {
        if (param0 <= 73) {
            field_j = -112;
        }
        if (!(0 != ((gb) this).field_l[((gb) this).field_m])) {
            ((gb) this).field_m = ((gb) this).field_m + 1;
            return null;
        }
        return ((gb) this).h(72);
    }

    final void a(boolean param0, int param1) {
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(param1 >> 98792136);
        if (!param0) {
            return;
        }
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)param1;
    }

    final String d(boolean param0) {
        ((gb) this).field_m = ((gb) this).field_m + 1;
        int var2 = ((gb) this).field_l[((gb) this).field_m];
        if (0 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = ((gb) this).field_m;
        while (true) {
            ((gb) this).field_m = ((gb) this).field_m + 1;
            if (-1 == (((gb) this).field_l[((gb) this).field_m] ^ -1)) {
                break;
            }
        }
        if (param0) {
            return null;
        }
        int var4 = ((gb) this).field_m - (var3 + 1);
        if (!(var4 != 0)) {
            return "";
        }
        return vd.a(((gb) this).field_l, var3, var4, 160);
    }

    final int c(byte param0) {
        int var4 = SolKnight.field_L ? 1 : 0;
        ((gb) this).field_m = ((gb) this).field_m + 1;
        int var2 = ((gb) this).field_l[((gb) this).field_m];
        if (param0 != 120) {
            return -115;
        }
        int var3 = 0;
        while (var2 < 0) {
            var3 = (var2 & 127 | var3) << -2064068153;
            ((gb) this).field_m = ((gb) this).field_m + 1;
            var2 = ((gb) this).field_l[((gb) this).field_m];
        }
        return var3 | var2;
    }

    final void a(byte param0, int[] param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = SolKnight.field_L ? 1 : 0;
        int var3 = ((gb) this).field_m / 8;
        ((gb) this).field_m = 0;
        for (var4 = 0; var4 < var3; var4++) {
            var5 = ((gb) this).e(true);
            var6 = ((gb) this).e(true);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
                var9--;
                if (-1 <= (var9 ^ -1)) {
                    break;
                }
                var5 = var5 + (var6 + (var6 >>> 1884979013 ^ var6 << -1752101500) ^ var7 + param1[var7 & 3]);
                var7 = var7 + var8;
                var6 = var6 + (var5 + (var5 >>> 355017509 ^ var5 << -181367068) ^ param1[(var7 & 6297) >>> -1853278261] + var7);
            }
            ((gb) this).field_m = ((gb) this).field_m - 8;
            ((gb) this).b(var5, false);
            ((gb) this).b(var6, false);
        }
        if (param0 <= 21) {
            field_h = null;
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        ua.field_H = 0;
        ri.field_f = param1;
        if (param2 >= -126) {
            field_h = null;
        }
        if ((ri.field_f ^ -1) <= -1) {
            vd.field_d[ri.field_f].b(param0, 3367);
        }
    }

    final void b(int param0, String param1) {
        int var3 = param1.indexOf(' ');
        if (var3 >= 0) {
            throw new IllegalArgumentException("");
        }
        if (param0 != -1955895016) {
            return;
        }
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte) 0;
        CharSequence var4 = (CharSequence) (Object) param1;
        ((gb) this).field_m = ((gb) this).field_m + ue.a(((gb) this).field_m, var4, param1.length(), 352, ((gb) this).field_l, 0);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte) 0;
    }

    final static boolean a(char param0, int param1) {
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (param1 > 119) {
          L0: {
            L1: {
              L2: {
                if (param0 < 48) {
                  break L2;
                } else {
                  if (param0 <= 57) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (65 > param0) {
                  break L3;
                } else {
                  if (param0 <= 90) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param0 < 97) {
                  break L4;
                } else {
                  if (param0 > 122) {
                    break L4;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L0;
          }
          return stackIn_13_0 != 0;
        } else {
          return false;
        }
    }

    final void a(long param0, byte param1) {
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)(param0 >> 1051615416);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)(param0 >> -1091926544);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)(param0 >> -324552152);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)(param0 >> 1185922144);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)(param0 >> -163415656);
        if (param1 <= 16) {
            boolean discarded$0 = gb.a('$', -122);
        }
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)(param0 >> 432517392);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)(param0 >> -110421176);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)param0;
    }

    final int b(boolean param0) {
        ((gb) this).field_m = ((gb) this).field_m + 3;
        if (param0) {
            return -116;
        }
        return ((255 & ((gb) this).field_l[((gb) this).field_m + -3]) << 893077712) + (((((gb) this).field_l[((gb) this).field_m - 2] & 255) << -1780793208) - -(((gb) this).field_l[((gb) this).field_m + -1] & 255));
    }

    final void a(long param0, int param1) {
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)(param0 >> 59769888);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)(param0 >> -1955895016);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)(param0 >> 291434832);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)(param0 >> -1541109560);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(int)param0;
        if (param1 != 25576) {
            boolean discarded$0 = ((gb) this).k(-66);
        }
    }

    final void a(int param0, byte param1) {
        if (param1 < 64) {
            field_j = -15;
        }
        if (-65 < (param0 ^ -1)) {
            if ((param0 ^ -1) <= 63) {
                ((gb) this).c(-116, param0 - -64);
                return;
            }
        }
        if (16384 > param0) {
            if (!((param0 ^ -1) > 16383)) {
                ((gb) this).a(true, param0 + 49152);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final String h(int param0) {
        if (param0 < 8) {
            ((gb) this).a(80L, 109);
        }
        int var2 = ((gb) this).field_m;
        while (true) {
            ((gb) this).field_m = ((gb) this).field_m + 1;
            if (((gb) this).field_l[((gb) this).field_m] == 0) {
                break;
            }
        }
        int var3 = ((gb) this).field_m + -var2 + -1;
        if (0 == var3) {
            return "";
        }
        return vd.a(((gb) this).field_l, var2, var3, 160);
    }

    final void b(int param0, boolean param1) {
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(param0 >> -1075421320);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(param0 >> 1425944624);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(param0 >> -1485137016);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)param0;
        if (param1) {
            ((gb) this).field_m = 84;
        }
    }

    final void a(String param0, int param1) {
        int var3 = param0.indexOf(' ');
        if (!((var3 ^ -1) > -1)) {
            throw new IllegalArgumentException("");
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        ((gb) this).field_m = ((gb) this).field_m + ue.a(((gb) this).field_m, var4, param0.length(), 352, ((gb) this).field_l, param1);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte) 0;
    }

    final void b(int param0, int param1) {
        ((gb) this).field_l[-param1 + (((gb) this).field_m - param0)] = (byte)param1;
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        int var4 = ((gb) this).field_m;
        ((gb) this).field_m = 0;
        byte[] var5 = new byte[var4];
        if (param1 != 59769888) {
            ((gb) this).a(false, 58);
        }
        ((gb) this).a(var4, 0, -111, var5);
        java.math.BigInteger var6 = new java.math.BigInteger(var5);
        java.math.BigInteger var7 = var6.modPow(param2, param0);
        byte[] var8 = var7.toByteArray();
        ((gb) this).field_m = 0;
        ((gb) this).a(true, var8.length);
        ((gb) this).a(8, var8.length, var8, 0);
    }

    final void a(int param0, boolean param1) {
        ((gb) this).field_l[-param0 + (((gb) this).field_m + -2)] = (byte)(param0 >> 1643933288);
        ((gb) this).field_l[((gb) this).field_m + (-param0 - 1)] = (byte)param0;
        if (!param1) {
            Object var4 = null;
            ((gb) this).a((String) null, -30);
        }
    }

    public static void f(int param0) {
        field_k = null;
        if (param0 != -11) {
            gb.a(false, -86, 67);
        }
        field_h = null;
        field_i = null;
    }

    final int i(int param0) {
        ((gb) this).field_m = ((gb) this).field_m + 2;
        int var2 = -76 / ((-63 - param0) / 36);
        return (255 & ((gb) this).field_l[-1 + ((gb) this).field_m]) + ((255 & ((gb) this).field_l[-2 + ((gb) this).field_m]) << -420067992);
    }

    final void a(int[] param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = SolKnight.field_L ? 1 : 0;
        int var5 = ((gb) this).field_m;
        ((gb) this).field_m = param1;
        int var6 = (-param1 + param3) / 8;
        if (param2 != 5838) {
            return;
        }
        for (var7 = 0; var7 < var6; var7++) {
            var8 = ((gb) this).e(true);
            var9 = ((gb) this).e(true);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
                var12--;
                if ((var12 ^ -1) >= -1) {
                    break;
                }
                var9 = var9 - ((var8 >>> -256341883 ^ var8 << 1640343396) - -var8 ^ var10 + param0[(6680 & var10) >>> 955889419]);
                var10 = var10 - var11;
                var8 = var8 - (param0[3 & var10] + var10 ^ var9 + (var9 << 663740644 ^ var9 >>> -1389103419));
            }
            ((gb) this).field_m = ((gb) this).field_m - 8;
            ((gb) this).b(var8, false);
            ((gb) this).b(var9, false);
        }
        ((gb) this).field_m = var5;
    }

    final void c(byte param0, int param1) {
        if (param0 > -10) {
            ((gb) this).c((byte) -13, 19);
        }
        ((gb) this).field_l[((gb) this).field_m + (-param1 - 4)] = (byte)(param1 >> -776055784);
        ((gb) this).field_l[-3 + (-param1 + ((gb) this).field_m)] = (byte)(param1 >> -1506003216);
        ((gb) this).field_l[-2 + -param1 + ((gb) this).field_m] = (byte)(param1 >> 1218233000);
        ((gb) this).field_l[-param1 + ((gb) this).field_m - 1] = (byte)param1;
    }

    final int b(boolean param0, int param1) {
        if (!param0) {
            ((gb) this).field_m = -7;
        }
        int var3 = ki.a(-27129, ((gb) this).field_l, ((gb) this).field_m, param1);
        ((gb) this).b(var3, false);
        return var3;
    }

    final void d(int param0, int param1) {
        if (param1 != 2132504424) {
            ((gb) this).field_m = 1;
        }
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(param0 >> 1488527344);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)(param0 >> 2132504424);
        ((gb) this).field_m = ((gb) this).field_m + 1;
        ((gb) this).field_l[((gb) this).field_m] = (byte)param0;
    }

    gb(int param0) {
        ((gb) this).field_m = 0;
        ((gb) this).field_l = fl.a(param0, -1);
    }

    gb(byte[] param0) {
        ((gb) this).field_m = 0;
        ((gb) this).field_l = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new pc();
        field_j = 0;
    }
}
