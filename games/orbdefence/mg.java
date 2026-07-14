/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mg extends ca {
    static va field_m;
    static boolean field_g;
    int field_i;
    static String field_h;
    byte[] field_j;
    static ea field_k;
    static int field_f;
    static im field_l;

    final void a(int param0, int param1) {
        if (param1 > -3) {
            field_m = null;
        }
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)param0;
    }

    final int b(byte param0) {
        if (param0 != 90) {
            Object var3 = null;
            ((mg) this).a((String) null, -65);
        }
        ((mg) this).field_i = ((mg) this).field_i + 1;
        return 255 & ((mg) this).field_j[((mg) this).field_i];
    }

    final void a(int[] param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = OrbDefence.field_D ? 1 : 0;
        int var4 = -102 % ((param1 - 53) / 53);
        int var3 = ((mg) this).field_i / 8;
        ((mg) this).field_i = 0;
        for (var5 = 0; var5 < var3; var5++) {
            var6 = ((mg) this).l(0);
            var7 = ((mg) this).l(0);
            var8 = 0;
            var9 = -1640531527;
            var10 = 32;
            while (true) {
                var10--;
                if (0 >= var10) {
                    break;
                }
                var6 = var6 + ((var7 >>> 119209125 ^ var7 << 1312358276) + var7 ^ param0[3 & var8] + var8);
                var8 = var8 + var9;
                var7 = var7 + ((var6 << -635681948 ^ var6 >>> 1078662949) - -var6 ^ param0[1648361475 & var8 >>> 1831296107] + var8);
            }
            ((mg) this).field_i = ((mg) this).field_i - 8;
            ((mg) this).b(var6, -1);
            ((mg) this).b(var7, -1);
        }
    }

    final void c(int param0, int param1) {
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(param0 >> 1390313680);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(param0 >> -446829976);
        if (param1 <= 100) {
            boolean discarded$0 = ((mg) this).h(47);
        }
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)param0;
    }

    final int a(byte param0) {
        ((mg) this).field_i = ((mg) this).field_i + 3;
        if (param0 != -30) {
            Object var3 = null;
            ((mg) this).a(false, (String) null);
        }
        return ((((mg) this).field_j[-3 + ((mg) this).field_i] & 255) << 361300720) + ((((mg) this).field_j[-2 + ((mg) this).field_i] << -797337784 & 65280) - -(255 & ((mg) this).field_j[-1 + ((mg) this).field_i]));
    }

    final void a(long param0, int param1) {
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)(param0 >> -843177800);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)(param0 >> 779055664);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)(param0 >> 98203176);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)(param0 >> 92422688);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)(param0 >> -1741323048);
        if (param1 != -16943) {
            field_k = null;
        }
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)(param0 >> 1687801808);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)(param0 >> 1922328584);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)param0;
    }

    public static void c(int param0) {
        field_k = null;
        if (param0 != 10) {
            mg.c(-9);
        }
        field_l = null;
        field_h = null;
        field_m = null;
    }

    final String f(int param0) {
        ((mg) this).field_i = ((mg) this).field_i + 1;
        int var2 = ((mg) this).field_j[((mg) this).field_i];
        if (var2 != 0) {
            throw new IllegalStateException("");
        }
        if (param0 < 77) {
            ((mg) this).f(-19, -48);
        }
        int var3 = ((mg) this).field_i;
        while (true) {
            ((mg) this).field_i = ((mg) this).field_i + 1;
            if (((mg) this).field_j[((mg) this).field_i] == 0) {
                break;
            }
        }
        int var4 = -1 + ((mg) this).field_i - var3;
        if (var4 == 0) {
            return "";
        }
        return tj.a(var4, var3, 0, ((mg) this).field_j);
    }

    final void a(int param0, int param1, byte param2, byte[] param3) {
        int var5 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        if (param2 != -11) {
            return;
        }
        for (var5 = param0; param0 - -param1 > var5; var5++) {
            ((mg) this).field_i = ((mg) this).field_i + 1;
            ((mg) this).field_j[((mg) this).field_i] = param3[var5];
        }
    }

    final String i(int param0) {
        if (!(param0 != (((mg) this).field_j[((mg) this).field_i] ^ -1))) {
            ((mg) this).field_i = ((mg) this).field_i + 1;
            return null;
        }
        return ((mg) this).g(param0 ^ -3);
    }

    final void d(int param0, int param1) {
        ((mg) this).field_j[param1 + (-param0 + ((mg) this).field_i)] = (byte)(param0 >> -1614606616);
        ((mg) this).field_j[((mg) this).field_i - (param0 - -1)] = (byte)param0;
    }

    final int e(int param0) {
        if (param0 <= 118) {
            return 9;
        }
        int var2 = ((mg) this).field_j[((mg) this).field_i] & 255;
        if ((var2 ^ -1) <= -129) {
            return -32768 + ((mg) this).j(98203176);
        }
        return ((mg) this).b((byte) 90);
    }

    final static void d(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) nk.field_q;
                    // monitorenter nk.field_q
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        of.field_G = db.field_f;
                        nl.field_d = nl.field_d + 1;
                        ua.field_a = bl.field_g;
                        if (param0 < -13) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        int discarded$3 = mg.a(-118, (byte) -31);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        vl.field_d = ic.field_g;
                        kd.field_d = tf.field_m;
                        tf.field_m = false;
                        gi.field_e = eh.field_c;
                        ig.field_fb = vg.field_p;
                        bg.field_c = id.field_b;
                        eh.field_c = 0;
                        lg.field_a = sd.field_c;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var2;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int k(int param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        ((mg) this).field_i = ((mg) this).field_i + 1;
        int var2 = ((mg) this).field_j[((mg) this).field_i];
        int var3 = param0;
        while (0 > var2) {
            var3 = (var3 | var2 & 127) << 1188136647;
            ((mg) this).field_i = ((mg) this).field_i + 1;
            var2 = ((mg) this).field_j[((mg) this).field_i];
        }
        return var3 | var2;
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (param1 <= -19) {
          L0: {
            var2 = param0;
            if (-12 == param0) {
              var2 = 10;
              break L0;
            } else {
              if (-8 != param0) {
                break L0;
              } else {
                if (ok.a(0, false)) {
                  var2 = 11;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          return var2;
        } else {
          return -63;
        }
    }

    final void g(int param0, int param1) {
        if (param1 != 1) {
            int discarded$0 = ((mg) this).d(true);
        }
        ((mg) this).field_j[-4 + ((mg) this).field_i - param0] = (byte)(param0 >> -2124841352);
        ((mg) this).field_j[-3 + (-param0 + ((mg) this).field_i)] = (byte)(param0 >> -828528912);
        ((mg) this).field_j[-param0 + (((mg) this).field_i - 2)] = (byte)(param0 >> -1911583416);
        ((mg) this).field_j[-1 + ((mg) this).field_i + -param0] = (byte)param0;
    }

    final void a(boolean param0, String param1) {
        if (param0) {
            field_g = false;
        }
        int var3 = param1.indexOf(' ');
        if (!(-1 < (var3 ^ -1))) {
            throw new IllegalArgumentException("");
        }
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte) 0;
        CharSequence var4 = (CharSequence) (Object) param1;
        ((mg) this).field_i = ((mg) this).field_i + ue.a(param1.length(), var4, (byte) -86, 0, ((mg) this).field_j, ((mg) this).field_i);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte) 0;
    }

    final int c(boolean param0) {
        if (!param0) {
            return -10;
        }
        int var2 = ((mg) this).field_j[((mg) this).field_i] & 255;
        if (128 <= var2) {
            return -49152 + ((mg) this).j(98203176);
        }
        return -64 + ((mg) this).b((byte) 90);
    }

    final void a(byte param0, byte[] param1, int param2, int param3) {
        int var6 = OrbDefence.field_D ? 1 : 0;
        int var5 = param2;
        if (param0 < 90) {
            return;
        }
        while (var5 < param2 + param3) {
            ((mg) this).field_i = ((mg) this).field_i + 1;
            param1[var5] = ((mg) this).field_j[((mg) this).field_i];
            var5++;
        }
    }

    final byte d(int param0) {
        if (param0 != -20398) {
            ((mg) this).field_i = -110;
        }
        ((mg) this).field_i = ((mg) this).field_i + 1;
        return ((mg) this).field_j[((mg) this).field_i];
    }

    final void d(byte param0, int param1) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != -115) {
            return;
        }
        while (((mg) this).field_i < param1) {
            ((mg) this).field_i = ((mg) this).field_i + 1;
            ((mg) this).field_j[((mg) this).field_i] = (byte) 0;
        }
    }

    final void a(String param0, int param1) {
        if (param1 != -6528) {
            ((mg) this).field_j = null;
        }
        int var3 = param0.indexOf(' ');
        if (-1 >= (var3 ^ -1)) {
            throw new IllegalArgumentException("");
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        ((mg) this).field_i = ((mg) this).field_i + ue.a(param0.length(), var4, (byte) -86, 0, ((mg) this).field_j, ((mg) this).field_i);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte) 0;
    }

    final long c(byte param0) {
        long var2 = (long)((mg) this).l(0) & 4294967295L;
        if (param0 != -89) {
            ((mg) this).d(61, -62);
        }
        long var4 = 4294967295L & (long)((mg) this).l(0);
        return var4 + (var2 << 513915424);
    }

    final String g(int param0) {
        int var2 = ((mg) this).field_i;
        if (param0 != 2) {
            int discarded$0 = ((mg) this).e(-29, -98);
        }
        while (true) {
            ((mg) this).field_i = ((mg) this).field_i + 1;
            if (-1 == (((mg) this).field_j[((mg) this).field_i] ^ -1)) {
                break;
            }
        }
        int var3 = -1 + -var2 + ((mg) this).field_i;
        if (!(var3 != 0)) {
            return "";
        }
        return tj.a(var3, var2, param0 + -2, ((mg) this).field_j);
    }

    final void a(byte param0, String param1) {
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        var7 = -105 % ((-7 - param0) / 62);
        var3 = 0L;
        var5 = 0L;
        var8 = param1.length();
        var9 = 19;
        L0: while (true) {
          if (-1 < (var9 ^ -1)) {
            this.a(-3357, var3);
            this.a(-3357, var5);
            return;
          } else {
            L1: {
              var3 = var3 * 38L;
              if (var9 < var8) {
                L2: {
                  var10 = param1.charAt(var9);
                  if (var10 < 65) {
                    break L2;
                  } else {
                    if (90 >= var10) {
                      var3 = var3 + (long)(2 + var10 - 65);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var10 < 97) {
                    break L3;
                  } else {
                    if (122 >= var10) {
                      var3 = var3 + (long)(var10 + 2 - 97);
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (48 > var10) {
                    break L4;
                  } else {
                    if (57 >= var10) {
                      var3 = var3 + (long)(-48 + (28 + var10));
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                var3 = var3 + 1L;
                break L1;
              } else {
                break L1;
              }
            }
            if (var9 == 10) {
              var5 = var3;
              var3 = 0L;
              var9--;
              continue L0;
            } else {
              var9--;
              continue L0;
            }
          }
        }
    }

    final int j(int param0) {
        ((mg) this).field_i = ((mg) this).field_i + 2;
        if (param0 != 98203176) {
            field_g = true;
        }
        return (((mg) this).field_j[((mg) this).field_i - 1] & 255) + (((mg) this).field_j[-2 + ((mg) this).field_i] << 2011737416 & 65280);
    }

    final void a(int param0, int param1, boolean param2, int[] param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = OrbDefence.field_D ? 1 : 0;
        int var5 = ((mg) this).field_i;
        ((mg) this).field_i = param0;
        int var6 = (-param0 + param1) / 8;
        for (var7 = 0; var7 < var6; var7++) {
            var8 = ((mg) this).l(0);
            var9 = ((mg) this).l(0);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
                var12--;
                if ((var12 ^ -1) >= -1) {
                    break;
                }
                var9 = var9 - (var10 + param3[(6167 & var10) >>> 306977099] ^ var8 + (var8 >>> -1388264155 ^ var8 << 1070781060));
                var10 = var10 - var11;
                var8 = var8 - (var10 + param3[3 & var10] ^ (var9 << -571053468 ^ var9 >>> -1535481179) + var9);
            }
            ((mg) this).field_i = ((mg) this).field_i - 8;
            ((mg) this).b(var8, -1);
            ((mg) this).b(var9, -1);
        }
        if (param2) {
            ((mg) this).field_j = null;
        }
        ((mg) this).field_i = var5;
    }

    private final void a(int param0, long param1) {
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)(param1 >> 1590742960);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)(param1 >> 1464822120);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)(param1 >> -988339232);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)(param1 >> 1162468248);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)(param1 >> 1085564560);
        if (param0 != -3357) {
            ((mg) this).b((byte) 14, -76);
        }
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)(param1 >> -2118823160);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)param1;
    }

    final void b(byte param0, int param1) {
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(param1 >> -406696856);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)param1;
        if (param0 != -60) {
            this.a(-11, 63L);
        }
    }

    final void b(int param0, int param1) {
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(param0 >> -207545960);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(param0 >> 890593296);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(param0 >> 557505480);
        if (param1 != -1) {
            Object var4 = null;
            ((mg) this).a((byte) -60, (byte[]) null, -13, 28);
        }
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)param0;
    }

    final void c(byte param0, int param1) {
        ((mg) this).field_j[-1 + ((mg) this).field_i + -param1] = (byte)param1;
        int var3 = -29 % ((param0 - 66) / 46);
    }

    final int e(int param0, int param1) {
        if (param0 != -18951) {
            return 41;
        }
        int var3 = sd.a(param1, ((mg) this).field_j, ((mg) this).field_i, 0);
        ((mg) this).b(var3, param0 + 18950);
        return var3;
    }

    final boolean h(int param0) {
        ((mg) this).field_i = ((mg) this).field_i - 4;
        int var2 = sd.a(0, ((mg) this).field_j, ((mg) this).field_i, 0);
        int var3 = ((mg) this).l(0);
        if (!(var3 != var2)) {
            return true;
        }
        if (param0 != 9982) {
            return false;
        }
        return false;
    }

    mg(int param0) {
        ((mg) this).field_i = 0;
        ((mg) this).field_j = q.a(param0, (byte) 121);
    }

    final int d(boolean param0) {
        if (!param0) {
            Object var3 = null;
            ((mg) this).a((byte) -88, (byte[]) null, -94, -42);
        }
        if (((mg) this).field_j[((mg) this).field_i] >= 0) {
            return ((mg) this).j(98203176);
        }
        return ((mg) this).l(0) & 2147483647;
    }

    final void f(int param0, int param1) {
        if (param0 != -1) {
            ((mg) this).c((byte) 106, -63);
        }
        if ((param1 ^ -1) > -65) {
            if (!(-64 > param1)) {
                ((mg) this).a(64 + param1, param0 + -102);
                return;
            }
        }
        if ((param1 ^ -1) > -16385) {
            if ((param1 ^ -1) <= 16383) {
                ((mg) this).b((byte) -60, 49152 + param1);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final void a(byte param0, int param1) {
        if (param0 > -31) {
            return;
        }
        if (!(-1 == (param1 & -128 ^ -1))) {
            if (!((param1 & -16384) == -1)) {
                if ((param1 & -2097152) != 0) {
                    if (!(-1 == (param1 & -268435456))) {
                        ((mg) this).a(128 | param1 >>> -88120900, -102);
                    }
                    ((mg) this).a(param1 >>> -767907307 | 128, -4);
                }
                ((mg) this).a(128 | param1 >>> -176701746, -106);
            }
            ((mg) this).a(128 | param1 >>> 431540743, -90);
        }
        ((mg) this).a(param1 & 127, -70);
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4 = ((mg) this).field_i;
        ((mg) this).field_i = 0;
        byte[] var5 = new byte[var4];
        ((mg) this).a((byte) 91, var5, 0, var4);
        if (param2 != 27551) {
            ((mg) this).d(59, 73);
        }
        java.math.BigInteger var6 = new java.math.BigInteger(var5);
        java.math.BigInteger var7 = var6.modPow(param0, param1);
        byte[] var8 = var7.toByteArray();
        ((mg) this).field_i = 0;
        ((mg) this).b((byte) -60, var8.length);
        ((mg) this).a(0, var8.length, (byte) -11, var8);
    }

    mg(byte[] param0) {
        ((mg) this).field_j = param0;
        ((mg) this).field_i = 0;
    }

    final int l(int param0) {
        ((mg) this).field_i = ((mg) this).field_i + 4;
        if (param0 != 0) {
            ((mg) this).field_j = null;
        }
        return ((((mg) this).field_j[((mg) this).field_i - 2] & 255) << -373962616) + ((255 & ((mg) this).field_j[-3 + ((mg) this).field_i]) << -299752560) + (((255 & ((mg) this).field_j[((mg) this).field_i - 4]) << -1552594376) + (((mg) this).field_j[-1 + ((mg) this).field_i] & 255));
    }

    final void b(int param0, long param1) {
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)(param1 >> -1176418848);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)(param1 >> -1780835944);
        if (param0 < 99) {
            return;
        }
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)(param1 >> -572516720);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)(param1 >> 1533620424);
        ((mg) this).field_i = ((mg) this).field_i + 1;
        ((mg) this).field_j[((mg) this).field_i] = (byte)(int)param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Awesomo";
        field_m = new va();
        field_f = 64;
        field_l = new im();
    }
}
