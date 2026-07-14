/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wk extends pg {
    byte[] field_j;
    static int field_m;
    static String field_h;
    static String field_k;
    int field_g;
    static String field_i;
    static qb field_l;

    final static kc f(byte param0) {
        if (param0 != -125) {
            field_i = null;
        }
        return ja.d((byte) 90);
    }

    final int f(int param0) {
        int var2 = ((wk) this).field_j[((wk) this).field_g] & 255;
        if (param0 <= var2) {
            return -32768 + ((wk) this).n(-98);
        }
        return ((wk) this).e((byte) -119);
    }

    public static void b(boolean param0) {
        field_h = null;
        field_i = null;
        field_l = null;
        if (!param0) {
            field_i = null;
        }
        field_k = null;
    }

    final int a(byte param0) {
        if (param0 != -29) {
            String discarded$0 = ((wk) this).g(-102);
        }
        if (((wk) this).field_j[((wk) this).field_g] < 0) {
            return ((wk) this).d(param0 ^ 10669) & 2147483647;
        }
        return ((wk) this).n(-98);
    }

    final void a(int param0, byte param1) {
        if (param1 != -101) {
            Object var4 = null;
            ((wk) this).a(41, (int[]) null);
        }
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(param0 >> 1272759800);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(param0 >> 1049741168);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(param0 >> -73712088);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)param0;
    }

    final void d(int param0, byte param1) {
        if (param0 >= 0) {
            if (-129 < (param0 ^ -1)) {
                ((wk) this).f(param0, (byte) -62);
                return;
            }
        }
        if (param1 >= -95) {
            ((wk) this).d(-48, (byte) -23);
        }
        if ((param0 ^ -1) <= -1) {
            if (32768 > param0) {
                ((wk) this).c(32768 - -param0, (byte) -100);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    private final void b(long param0, byte param1) {
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)(param0 >> -1558543760);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)(param0 >> -623183064);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)(param0 >> 1153188320);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)(param0 >> -26116392);
        if (param1 != 12) {
            ((wk) this).b(21, -6);
        }
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)(param0 >> -399845552);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)(param0 >> -1394062584);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)param0;
    }

    final void a(byte param0, int param1, byte[] param2, int param3) {
        int var5 = 0;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 < 37) {
            int discarded$0 = ((wk) this).a(true, 13);
        }
        for (var5 = param1; param1 - -param3 > var5; var5++) {
            ((wk) this).field_g = ((wk) this).field_g + 1;
            param2[var5] = ((wk) this).field_j[((wk) this).field_g];
        }
    }

    final long c(int param0) {
        if (param0 != -943038560) {
            field_i = null;
        }
        long var2 = 4294967295L & (long)((wk) this).d(-10674);
        long var4 = 4294967295L & (long)((wk) this).d(-10674);
        return (var2 << -943038560) - -var4;
    }

    final int i(int param0) {
        if (param0 != -1) {
            field_h = null;
        }
        int var2 = ((wk) this).field_j[((wk) this).field_g] & 255;
        if ((var2 ^ -1) > -129) {
            return -64 + ((wk) this).e((byte) -99);
        }
        return -49152 + ((wk) this).n(-98);
    }

    final void a(int[] param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = ArcanistsMulti.field_G ? 1 : 0;
        int var5 = ((wk) this).field_g;
        ((wk) this).field_g = param1;
        int var6 = (param2 - param1) / 8;
        if (param3 < 122) {
            field_m = -95;
        }
        for (var7 = 0; var6 > var7; var7++) {
            var8 = ((wk) this).d(-10674);
            var9 = ((wk) this).d(-10674);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
                var12--;
                if (-1 <= (var12 ^ -1)) {
                    break;
                }
                var9 = var9 - (param0[-469762045 & var10 >>> 1436356491] + var10 ^ (var8 >>> -2006786491 ^ var8 << -557303068) - -var8);
                var10 = var10 - var11;
                var8 = var8 - (var9 + (var9 << 1515341732 ^ var9 >>> 610338213) ^ var10 - -param0[var10 & 3]);
            }
            ((wk) this).field_g = ((wk) this).field_g - 8;
            ((wk) this).a(var8, (byte) -101);
            ((wk) this).a(var9, (byte) -101);
        }
        ((wk) this).field_g = var5;
    }

    final void a(int param0, int[] param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = ArcanistsMulti.field_G ? 1 : 0;
        int var3 = ((wk) this).field_g / 8;
        ((wk) this).field_g = 0;
        for (var4 = 0; var3 > var4; var4++) {
            var5 = ((wk) this).d(-10674);
            var6 = ((wk) this).d(-10674);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
                var9--;
                if (var9 <= 0) {
                    break;
                }
                var5 = var5 + (param1[3 & var7] + var7 ^ (var6 >>> 855212869 ^ var6 << 1324090308) - -var6);
                var7 = var7 + var8;
                var6 = var6 + ((var5 << 970210916 ^ var5 >>> 1446562245) - -var5 ^ var7 + param1[(var7 & 7037) >>> -737428149]);
            }
            ((wk) this).field_g = ((wk) this).field_g - 8;
            ((wk) this).a(var5, (byte) -101);
            ((wk) this).a(var6, (byte) -101);
        }
        if (param0 < 75) {
            Object var11 = null;
            ((wk) this).a((byte) -5, (String) null);
        }
    }

    final static void j(int param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        vn var1 = rk.field_O.g((byte) 34);
        if (param0 != 13805) {
            wk.b(false);
        }
        int var2 = 0;
        ml var3 = (ml) (Object) var1.b(12623);
        while (var3 != null) {
            if (var3.field_jb == 11) {
                var2++;
            }
            var3 = (ml) (Object) var1.a(0);
        }
        if (3 > var2) {
            rk.field_O.a(0, 0, -1, param0 + -13767, 6);
        } else {
            rk.field_O.a(0, 0, 0, 104, 6);
        }
    }

    final void a(long param0, byte param1) {
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)(param0 >> -1348293576);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)(param0 >> -1194900688);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)(param0 >> -1612424280);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)(param0 >> -621592160);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)(param0 >> -2003381288);
        if (param1 <= 34) {
            return;
        }
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)(param0 >> 974658448);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)(param0 >> 1948968776);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)param0;
    }

    final String g(int param0) {
        if (0 == ((wk) this).field_j[((wk) this).field_g]) {
            ((wk) this).field_g = ((wk) this).field_g + 1;
            return null;
        }
        int var2 = 76 % ((58 - param0) / 32);
        return ((wk) this).l(-1);
    }

    final void a(byte param0, int param1) {
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(param1 >> 1589432496);
        if (param0 != -120) {
            field_h = null;
        }
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(param1 >> 2033090184);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)param1;
    }

    final void b(int param0, int param1) {
        if (!((param1 & -128) == 0)) {
            if ((-16384 & param1) != -1) {
                if (!(-1 == (-2097152 & param1))) {
                    if (0 != (-268435456 & param1)) {
                        ((wk) this).f(param1 >>> 671756124 | 128, (byte) -12);
                    }
                    ((wk) this).f((param1 | 270515212) >>> 332506165, (byte) -103);
                }
                ((wk) this).f((2106311 | param1) >>> 1646896974, (byte) -67);
            }
            ((wk) this).f((param1 | 16401) >>> 1144125927, (byte) -43);
        }
        if (param0 != 10888) {
            return;
        }
        ((wk) this).f(param1 & 127, (byte) -44);
    }

    final void a(int param0, int param1) {
        ((wk) this).field_j[((wk) this).field_g + -param0 + -2] = (byte)(param0 >> 1495961416);
        if (param1 != -19571) {
            ((wk) this).d(44, (byte) -106);
        }
        ((wk) this).field_j[-param0 + (((wk) this).field_g + -1)] = (byte)param0;
    }

    final void a(byte[] param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        for (var5 = param1; var5 < param1 + param3; var5++) {
            ((wk) this).field_g = ((wk) this).field_g + 1;
            ((wk) this).field_j[((wk) this).field_g] = param0[var5];
        }
        if (param2 != -86) {
            ((wk) this).a(114, (byte) 115);
        }
    }

    final int h(int param0) {
        if (param0 != 11609) {
            wk.b(true);
        }
        ((wk) this).field_g = ((wk) this).field_g + 3;
        return (((wk) this).field_j[-1 + ((wk) this).field_g] & 255) + ((((wk) this).field_j[((wk) this).field_g - 3] & 255) << 178756240) - -((((wk) this).field_j[-2 + ((wk) this).field_g] & 255) << -1301685336);
    }

    final String e(int param0) {
        ((wk) this).field_g = ((wk) this).field_g + 1;
        int var2 = ((wk) this).field_j[((wk) this).field_g];
        if (var2 != 0) {
            throw new IllegalStateException("");
        }
        if (param0 != -32461) {
            Object var5 = null;
            ((wk) this).a((String) null, 112);
        }
        int var3 = ((wk) this).field_g;
        while (true) {
            ((wk) this).field_g = ((wk) this).field_g + 1;
            if (0 == ((wk) this).field_j[((wk) this).field_g]) {
                break;
            }
        }
        int var4 = ((wk) this).field_g - (var3 - -1);
        if (!(-1 != (var4 ^ -1))) {
            return "";
        }
        return ba.a(var3, var4, (byte) -126, ((wk) this).field_j);
    }

    final String l(int param0) {
        int var2 = ((wk) this).field_g;
        while (true) {
            ((wk) this).field_g = ((wk) this).field_g + 1;
            if (-1 == ((wk) this).field_j[((wk) this).field_g]) {
                break;
            }
        }
        int var3 = -var2 + (((wk) this).field_g + -1);
        if (!(param0 != var3)) {
            return "";
        }
        return ba.a(var2, var3, (byte) -124, ((wk) this).field_j);
    }

    final void a(byte param0, String param1) {
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = ArcanistsMulti.field_G ? 1 : 0;
          var3 = 0L;
          var5 = 0L;
          var7 = param1.length();
          if (param0 == 7) {
            break L0;
          } else {
            int discarded$1 = ((wk) this).a(true, 75);
            break L0;
          }
        }
        var8 = 19;
        L1: while (true) {
          if (-1 < (var8 ^ -1)) {
            this.b(var3, (byte) 12);
            this.b(var5, (byte) 12);
            return;
          } else {
            var3 = var3 * 38L;
            if (var7 <= var8) {
              if ((var8 ^ -1) != -11) {
                var8--;
                continue L1;
              } else {
                var5 = var3;
                var3 = 0L;
                var8--;
                continue L1;
              }
            } else {
              L2: {
                L3: {
                  var9 = param1.charAt(var8);
                  if (var9 < 65) {
                    break L3;
                  } else {
                    if (var9 > 90) {
                      break L3;
                    } else {
                      var3 = var3 + (long)(var9 + -63);
                      break L2;
                    }
                  }
                }
                L4: {
                  if (var9 < 97) {
                    break L4;
                  } else {
                    if (var9 > 122) {
                      break L4;
                    } else {
                      var3 = var3 + (long)(var9 + 2 - 97);
                      break L2;
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
                      var3 = var3 + (long)(-48 + var9 + 28);
                      break L2;
                    }
                  }
                }
                var3 = var3 + 1L;
                break L2;
              }
              if ((var8 ^ -1) == -11) {
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
    }

    final static void k(int param0) {
        da.field_d = new ln();
        g.field_e.a((byte) -92, (qm) (Object) da.field_d);
        if (param0 != 970210916) {
            field_i = null;
        }
    }

    final int n(int param0) {
        if (param0 != -98) {
            return 125;
        }
        ((wk) this).field_g = ((wk) this).field_g + 2;
        return ((255 & ((wk) this).field_j[-2 + ((wk) this).field_g]) << -943682680) + (255 & ((wk) this).field_j[((wk) this).field_g + -1]);
    }

    final int a(int param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        ((wk) this).field_g = ((wk) this).field_g + 1;
        int var2 = ((wk) this).field_j[((wk) this).field_g];
        if (param0 < 10) {
            ((wk) this).field_g = -57;
        }
        int var3 = 0;
        while (-1 < (var2 ^ -1)) {
            var3 = (var2 & 127 | var3) << 1647834823;
            ((wk) this).field_g = ((wk) this).field_g + 1;
            var2 = ((wk) this).field_j[((wk) this).field_g];
        }
        return var3 | var2;
    }

    final void c(int param0, int param1) {
        ((wk) this).field_j[((wk) this).field_g - (param1 + 4)] = (byte)(param1 >> 1432663128);
        ((wk) this).field_j[-3 + -param1 + ((wk) this).field_g] = (byte)(param1 >> -1623294384);
        ((wk) this).field_j[-2 + ((wk) this).field_g + -param1] = (byte)(param1 >> -1246222936);
        if (param0 != 10089) {
            field_h = null;
        }
        ((wk) this).field_j[-param1 + (((wk) this).field_g + -1)] = (byte)param1;
    }

    final void a(byte param0, long param1) {
        if (param0 > -115) {
            int discarded$0 = ((wk) this).h(-89);
        }
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)(param1 >> 1723987488);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)(param1 >> 850469080);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)(param1 >> 425709392);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)(param1 >> -1940940728);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(int)param1;
    }

    final void a(String param0, int param1) {
        if (param1 != 23333) {
            Object var4 = null;
            ((wk) this).a((String) null, (byte) 74);
        }
        int var3 = param0.indexOf(' ');
        if (0 <= var3) {
            throw new IllegalArgumentException("");
        }
        CharSequence var5 = (CharSequence) (Object) param0;
        ((wk) this).field_g = ((wk) this).field_g + ji.a(0, ((wk) this).field_j, ((wk) this).field_g, (byte) 89, var5, param0.length());
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte) 0;
    }

    final void a(String param0, byte param1) {
        if (param1 >= -80) {
            return;
        }
        int var3 = param0.indexOf(' ');
        if ((var3 ^ -1) <= -1) {
            throw new IllegalArgumentException("");
        }
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte) 0;
        CharSequence var4 = (CharSequence) (Object) param0;
        ((wk) this).field_g = ((wk) this).field_g + ji.a(0, ((wk) this).field_j, ((wk) this).field_g, (byte) 89, var4, param0.length());
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte) 0;
    }

    final int d(int param0) {
        if (param0 != -10674) {
            int discarded$0 = ((wk) this).a((byte) -7);
        }
        ((wk) this).field_g = ((wk) this).field_g + 4;
        return ((255 & ((wk) this).field_j[-2 + ((wk) this).field_g]) << -1800654552) + ((((wk) this).field_j[((wk) this).field_g - 4] & 255) << 1978038808) + (((wk) this).field_j[((wk) this).field_g + -3] << -231141840 & 16711680) + (((wk) this).field_j[-1 + ((wk) this).field_g] & 255);
    }

    final int a(boolean param0, int param1) {
        if (!param0) {
            return -101;
        }
        int var3 = db.a(((wk) this).field_g, false, ((wk) this).field_j, param1);
        ((wk) this).a(var3, (byte) -101);
        return var3;
    }

    final int m(int param0) {
        ((wk) this).field_g = ((wk) this).field_g + 2;
        if (param0 != 0) {
            field_i = null;
        }
        int var2 = (((wk) this).field_j[-1 + ((wk) this).field_g] & 255) + (65280 & ((wk) this).field_j[-2 + ((wk) this).field_g] << -2019620376);
        if (var2 > 32767) {
            var2 = var2 - 65536;
        }
        return var2;
    }

    final static void d(byte param0) {
        int var1 = 0;
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        da.a((byte) -101);
        int var2 = 122 % ((param0 - -21) / 48);
        for (var1 = 0; var1 < 17; var1++) {
            tl.field_f[var1] = new lc(var1);
        }
        mn.field_r = 13;
        si.field_g = 13;
        qn.a(16, 50);
        sm.a(-107, 50);
        if (!(lc.a((byte) 112))) {
            ce.field_i = tj.a(4, -21402);
            ci.field_d = ld.a(6, false);
        }
        bk.a(2);
    }

    final void e(int param0, byte param1) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        int var3 = -8 % ((40 - param1) / 37);
        while (((wk) this).field_g < param0) {
            ((wk) this).field_g = ((wk) this).field_g + 1;
            ((wk) this).field_j[((wk) this).field_g] = (byte) 0;
        }
    }

    final int e(byte param0) {
        int var2 = 69 / ((param0 - -28) / 58);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        return ((wk) this).field_j[((wk) this).field_g] & 255;
    }

    wk(int param0) {
        ((wk) this).field_g = 0;
        ((wk) this).field_j = bb.a(param0, 56);
    }

    final void f(int param0, byte param1) {
        if (param1 >= -2) {
            ((wk) this).e(51, (byte) -125);
        }
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)param0;
    }

    final void a(java.math.BigInteger param0, byte param1, java.math.BigInteger param2) {
        int var4 = ((wk) this).field_g;
        ((wk) this).field_g = 0;
        byte[] var5 = new byte[var4];
        ((wk) this).a((byte) 81, 0, var5, var4);
        java.math.BigInteger var6 = new java.math.BigInteger(var5);
        if (param1 <= 71) {
            ((wk) this).field_g = -16;
        }
        java.math.BigInteger var7 = var6.modPow(param0, param2);
        byte[] var8 = var7.toByteArray();
        ((wk) this).field_g = 0;
        ((wk) this).c(var8.length, (byte) -62);
        ((wk) this).a(var8, 0, (byte) -86, var8.length);
    }

    final void c(int param0, byte param1) {
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)(param0 >> 1735521672);
        ((wk) this).field_g = ((wk) this).field_g + 1;
        ((wk) this).field_j[((wk) this).field_g] = (byte)param0;
        if (param1 > -53) {
            wk.d((byte) 112);
        }
    }

    final byte o(int param0) {
        if (param0 != 6) {
            return (byte) 103;
        }
        ((wk) this).field_g = ((wk) this).field_g + 1;
        return ((wk) this).field_j[((wk) this).field_g];
    }

    wk(byte[] param0) {
        ((wk) this).field_j = param0;
        ((wk) this).field_g = 0;
    }

    final void b(int param0, byte param1) {
        ((wk) this).field_j[-param0 + (((wk) this).field_g - 1)] = (byte)param0;
        if (param1 != 43) {
            ((wk) this).a(120, (byte) 58);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        co.field_e[je.field_b] = param2;
        ki.field_r[je.field_b] = je.field_b;
        nf.field_z[je.field_b] = param4;
        if (!(ao.field_g <= param4)) {
            ld.field_m = param4;
        }
        if (param4 > tm.field_g) {
            qa.field_m = param4;
        }
        hc.field_e[je.field_b] = param1;
        tj.field_u[je.field_b] = param5;
        ba.field_o[je.field_b] = param3;
        int var6 = param3 + param5 + param1;
        int var7 = (var6 ^ -1) != param0 ? param1 * 1000 / var6 : 0;
        lm.field_i[je.field_b] = var7;
        if (ld.field_m > var7) {
            ld.field_m = var7;
        }
        je.field_b = je.field_b + 1;
        if (!(var7 <= qa.field_m)) {
            qa.field_m = var7;
        }
    }

    final boolean c(boolean param0) {
        if (!param0) {
            field_k = null;
        }
        ((wk) this).field_g = ((wk) this).field_g - 4;
        int var2 = db.a(((wk) this).field_g, !param0 ? true : false, ((wk) this).field_j, 0);
        int var3 = ((wk) this).d(-10674);
        if (var2 == var3) {
            return true;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_h = "MOST USELESS - ";
        field_k = "This is a hidden Achievement. The requirements and rewards for it will be shown once it has been achieved.";
        field_i = "Name is available";
    }
}
