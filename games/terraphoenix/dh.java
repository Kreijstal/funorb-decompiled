/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dh extends uf {
    static int field_h;
    byte[] field_i;
    static int field_l;
    static boolean field_j;
    int field_k;

    final void a(java.math.BigInteger param0, byte param1, java.math.BigInteger param2) {
        int var4 = ((dh) this).field_k;
        ((dh) this).field_k = 0;
        byte[] var5 = new byte[var4];
        int var7 = 14 / ((64 - param1) / 40);
        ((dh) this).a(var4, 0, 91, var5);
        java.math.BigInteger var6 = new java.math.BigInteger(var5);
        java.math.BigInteger var8 = var6.modPow(param0, param2);
        byte[] var9 = var8.toByteArray();
        ((dh) this).field_k = 0;
        ((dh) this).h(-1564407352, var9.length);
        ((dh) this).a(-222449912, var9, var9.length, 0);
    }

    final int i(int param0) {
        ((dh) this).field_k = ((dh) this).field_k + 2;
        if (param0 != -25578) {
            return 62;
        }
        return (255 & ((dh) this).field_i[-1 + ((dh) this).field_k]) + ((((dh) this).field_i[-2 + ((dh) this).field_k] & 255) << -1915115064);
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var4 = param0.getCodeBase();
                            var3 = bb.a((byte) 122, var4, param0).getFile();
                            Object discarded$6 = cd.a(param0, "updatelinks", new Object[2], 10056);
                            Object discarded$7 = cd.a(param0, "updatelinks", new Object[2], 10056);
                            Object discarded$8 = cd.a(param0, "updatelinks", new Object[2], 10056);
                            Object discarded$9 = cd.a(param0, "updatelinks", new Object[2], 10056);
                            Object discarded$10 = cd.a(param0, "updatelinks", new Object[2], 10056);
                            Object discarded$11 = cd.a(param0, "updatelinks", new Object[2], 10056);
                            if (param1) {
                                statePc = 4;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            field_l = -99;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var2 = caughtException;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String e(int param0) {
        int var2 = ((dh) this).field_k;
        while (true) {
            ((dh) this).field_k = ((dh) this).field_k + 1;
            if (((dh) this).field_i[((dh) this).field_k] == -1) {
                break;
            }
        }
        int var3 = -var2 + ((dh) this).field_k + param0;
        if (!(-1 != var3)) {
            return "";
        }
        return tc.a((byte) -114, ((dh) this).field_i, var3, var2);
    }

    final void a(int param0, int[] param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Terraphoenix.field_V;
        int var3 = ((dh) this).field_k / 8;
        ((dh) this).field_k = 0;
        for (var4 = 0; var3 > var4; var4++) {
            var5 = ((dh) this).f((byte) -107);
            var6 = ((dh) this).f((byte) -107);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
                var9--;
                if (0 >= var9) {
                    break;
                }
                var5 = var5 + (var7 + param1[var7 & 3] ^ var6 + (var6 >>> -1739618747 ^ var6 << 1843789828));
                var7 = var7 + var8;
                var6 = var6 + (param1[293601283 & var7 >>> -248618325] + var7 ^ var5 + (var5 << 803487044 ^ var5 >>> 1902111397));
            }
            ((dh) this).field_k = ((dh) this).field_k - 8;
            ((dh) this).e(var5, 8959);
            ((dh) this).e(var6, 8959);
        }
        if (param0 != -6716) {
            boolean discarded$0 = ((dh) this).c(0);
        }
    }

    final void b(int param0, int param1) {
        ((dh) this).field_i[((dh) this).field_k + -param1 + -4] = (byte)(param1 >> 657947576);
        ((dh) this).field_i[-3 + (((dh) this).field_k + -param1)] = (byte)(param1 >> -1633837360);
        ((dh) this).field_i[-2 + ((dh) this).field_k - param1] = (byte)(param1 >> -764694520);
        ((dh) this).field_i[param0 + -param1 + ((dh) this).field_k] = (byte)param1;
    }

    final boolean c(int param0) {
        ((dh) this).field_k = ((dh) this).field_k - 4;
        int var2 = gj.a(((dh) this).field_k, param0, 255, ((dh) this).field_i);
        int var3 = ((dh) this).f((byte) -107);
        if (var3 == var2) {
            return true;
        }
        return false;
    }

    final void j(int param0, int param1) {
        if (param1 != -119) {
            int discarded$0 = ((dh) this).a(79);
        }
        ((dh) this).field_i[((dh) this).field_k - param0 - 1] = (byte)param0;
    }

    final void i(int param0, int param1) {
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)param0;
        int var3 = -106 % ((param1 - -56) / 34);
    }

    final void a(byte param0, int param1) {
        if (param0 != -107) {
            ((dh) this).field_i = null;
        }
        if (64 > param1) {
            if (63 >= (param1 ^ -1)) {
                ((dh) this).i(param1 + 64, 125);
                return;
            }
        }
        if ((param1 ^ -1) > -16385) {
            if (!(-16384 > param1)) {
                ((dh) this).h(-1564407352, param1 - -49152);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    final String j(int param0) {
        if (0 == ((dh) this).field_i[((dh) this).field_k]) {
            ((dh) this).field_k = ((dh) this).field_k + 1;
            return null;
        }
        if (param0 != -1915115064) {
            Object var3 = null;
            ((dh) this).a((String) null, 123);
        }
        return ((dh) this).e(-1);
    }

    final int e(byte param0) {
        int var2 = ((dh) this).field_i[((dh) this).field_k] & 255;
        if (param0 < 91) {
            int discarded$0 = ((dh) this).a(-53);
        }
        if (-129 >= (var2 ^ -1)) {
            return -49152 + ((dh) this).i(-25578);
        }
        return ((dh) this).a(-16384) + -64;
    }

    final int h(int param0) {
        int var2 = 255 & ((dh) this).field_i[((dh) this).field_k];
        int var3 = 109 / ((param0 - 21) / 63);
        if (128 > var2) {
            return ((dh) this).a(-16384);
        }
        return ((dh) this).i(-25578) - 32768;
    }

    final static void g(byte param0) {
        qi.field_b = false;
        fd.field_k = false;
        bm.a(-1, (byte) 1);
        if (param0 != -124) {
            return;
        }
        pe.field_a = og.field_a;
        qe.field_f = og.field_a;
    }

    final int i(byte param0) {
        int var4 = Terraphoenix.field_V;
        ((dh) this).field_k = ((dh) this).field_k + 1;
        int var2 = ((dh) this).field_i[((dh) this).field_k];
        if (param0 != 13) {
            return -108;
        }
        int var3 = 0;
        while (var2 < 0) {
            var3 = (var2 & 127 | var3) << 1192620327;
            ((dh) this).field_k = ((dh) this).field_k + 1;
            var2 = ((dh) this).field_i[((dh) this).field_k];
        }
        return var2 | var3;
    }

    final void a(String param0, int param1) {
        int var3 = param0.indexOf(' ');
        if (!((var3 ^ -1) > -1)) {
            throw new IllegalArgumentException("");
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        ((dh) this).field_k = ((dh) this).field_k + ed.a(0, (byte) -97, var4, ((dh) this).field_i, ((dh) this).field_k, param0.length());
        if (param1 != 2295) {
            return;
        }
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte) 0;
    }

    final void a(int param0, byte param1) {
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(param0 >> 1477402160);
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(param0 >> -1954921848);
        if (param1 >= -74) {
            return;
        }
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)param0;
    }

    final void h(int param0, int param1) {
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(param1 >> -1564407352);
        if (param0 != -1564407352) {
            ((dh) this).field_i = null;
        }
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)param1;
    }

    final void a(int param0, int[] param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = Terraphoenix.field_V;
        int var5 = ((dh) this).field_k;
        ((dh) this).field_k = param2;
        int var6 = (-param2 + param3) / 8;
        if (param0 != -14328) {
            String discarded$0 = ((dh) this).c((byte) 63);
        }
        for (var7 = 0; var7 < var6; var7++) {
            var8 = ((dh) this).f((byte) -107);
            var9 = ((dh) this).f((byte) -107);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
                var12--;
                if (-1 <= (var12 ^ -1)) {
                    break;
                }
                var9 = var9 - (var8 + (var8 >>> -1117374139 ^ var8 << -1028121212) ^ var10 - -param1[(var10 & 7501) >>> 207624107]);
                var10 = var10 - var11;
                var8 = var8 - (param1[3 & var10] + var10 ^ var9 + (var9 << -358556668 ^ var9 >>> 407878853));
            }
            ((dh) this).field_k = ((dh) this).field_k - 8;
            ((dh) this).e(var8, param0 ^ -5385);
            ((dh) this).e(var9, param0 ^ -5385);
        }
        ((dh) this).field_k = var5;
    }

    final void a(int param0, String param1) {
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Terraphoenix.field_V;
          var3 = 0L;
          var5 = 0L;
          var7 = param1.length();
          var8 = 19;
          if (param0 == -97) {
            break L0;
          } else {
            String discarded$2 = ((dh) this).c((byte) 109);
            break L0;
          }
        }
        L1: while (true) {
          if (var8 < 0) {
            this.a(var3, (byte) 99);
            this.a(var5, (byte) 111);
            return;
          } else {
            L2: {
              var3 = var3 * 38L;
              if (var8 >= var7) {
                break L2;
              } else {
                L3: {
                  var9 = param1.charAt(var8);
                  if (var9 < 65) {
                    break L3;
                  } else {
                    if (var9 > 90) {
                      break L3;
                    } else {
                      var3 = var3 + (long)(-65 + (2 - -var9));
                      break L2;
                    }
                  }
                }
                L4: {
                  if (var9 < 97) {
                    break L4;
                  } else {
                    if (var9 <= 122) {
                      var3 = var3 + (long)(var9 + 2 + -97);
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
                    if (57 < var9) {
                      break L5;
                    } else {
                      var3 = var3 + (long)(var9 + 28 + -48);
                      break L2;
                    }
                  }
                }
                var3 = var3 + 1L;
                break L2;
              }
            }
            if (10 == var8) {
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

    final void e(int param0, int param1) {
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(param0 >> 282766872);
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(param0 >> -455653488);
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(param0 >> -705825688);
        if (param1 != 8959) {
            return;
        }
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)param0;
    }

    final int f(byte param0) {
        if (param0 != -107) {
            ((dh) this).a(58L, 30);
        }
        ((dh) this).field_k = ((dh) this).field_k + 4;
        return (((dh) this).field_i[((dh) this).field_k - 2] << -1765248664 & 65280) + (((((dh) this).field_i[((dh) this).field_k + -3] & 255) << -393875568) + ((255 & ((dh) this).field_i[-4 + ((dh) this).field_k]) << 1703593848)) - -(255 & ((dh) this).field_i[-1 + ((dh) this).field_k]);
    }

    final void f(int param0, int param1) {
        int var4 = Terraphoenix.field_V;
        while (param0 > ((dh) this).field_k) {
            ((dh) this).field_k = ((dh) this).field_k + 1;
            ((dh) this).field_i[((dh) this).field_k] = (byte) 0;
        }
        if (param1 != -2108648176) {
            ((dh) this).field_k = 38;
        }
    }

    final void a(long param0, int param1) {
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)(param0 >> -1671198088);
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)(param0 >> -2036200912);
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)(param0 >> 1097567400);
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)(param0 >> 273079200);
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)(param0 >> 361340120);
        if (param1 <= 18) {
            ((dh) this).field_i = null;
        }
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)(param0 >> 137249936);
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)(param0 >> 2125782280);
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)param0;
    }

    final int a(int param0) {
        if (param0 != -16384) {
            return -93;
        }
        ((dh) this).field_k = ((dh) this).field_k + 1;
        return 255 & ((dh) this).field_i[((dh) this).field_k];
    }

    final void b(long param0, int param1) {
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)(param0 >> 1180682272);
        if (param1 != -2108648176) {
            return;
        }
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)(param0 >> 1418683864);
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)(param0 >> -2108648176);
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)(param0 >> -222449912);
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)param0;
    }

    final int d(int param0, int param1) {
        int var3 = gj.a(((dh) this).field_k, param0, param1 ^ 8551, ((dh) this).field_i);
        ((dh) this).e(var3, 8959);
        if (param1 != 8600) {
            ((dh) this).field_k = 47;
        }
        return var3;
    }

    final byte f(int param0) {
        if (param0 != 2) {
            field_h = 75;
        }
        ((dh) this).field_k = ((dh) this).field_k + 1;
        return ((dh) this).field_i[((dh) this).field_k];
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Terraphoenix.field_V;
        for (var5 = param3; param2 + param3 > var5; var5++) {
            ((dh) this).field_k = ((dh) this).field_k + 1;
            ((dh) this).field_i[((dh) this).field_k] = param1[var5];
        }
        if (param0 != -222449912) {
            field_h = 53;
        }
    }

    final String c(byte param0) {
        ((dh) this).field_k = ((dh) this).field_k + 1;
        int var2 = ((dh) this).field_i[((dh) this).field_k];
        if (!(var2 == 0)) {
            throw new IllegalStateException("");
        }
        int var3 = ((dh) this).field_k;
        while (true) {
            ((dh) this).field_k = ((dh) this).field_k + 1;
            if (((dh) this).field_i[((dh) this).field_k] == 0) {
                break;
            }
        }
        int var4 = -var3 + (((dh) this).field_k + -1);
        int var5 = -27 % ((-56 - param0) / 60);
        if (0 == var4) {
            return "";
        }
        return tc.a((byte) -114, ((dh) this).field_i, var4, var3);
    }

    private final void a(long param0, byte param1) {
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)(param0 >> -1968452688);
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)(param0 >> 1740995624);
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)(param0 >> 1286847392);
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)(param0 >> -127007144);
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)(param0 >> -1442479792);
        if (param1 < 90) {
            field_j = false;
        }
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)(param0 >> 2067663624);
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte)(int)param0;
    }

    final static void g(int param0) {
        if (-uf.field_e + 0 != kf.field_f) {
            if (-uf.field_e + 250 == kf.field_f) {
            }
        }
        kf.field_f = kf.field_f + 1;
        if (param0 <= 67) {
            field_j = true;
        }
    }

    final void c(int param0, int param1) {
        if (!(0 == (-128 & param1))) {
            if (!(-1 == (param1 & -16384))) {
                if (!(-1 == (param1 & -2097152))) {
                    if (!((param1 & -268435456) == 0)) {
                        ((dh) this).i(param1 >>> 698486044 | 128, -14);
                    }
                    ((dh) this).i((268611395 | param1) >>> -1868064235, param0 + 37);
                }
                ((dh) this).i((param1 | 2111024) >>> -1156246098, -99);
            }
            ((dh) this).i(param1 >>> 769844839 | 128, param0 + -5);
        }
        if (param0 != 0) {
            int discarded$0 = ((dh) this).i((byte) -56);
        }
        ((dh) this).i(127 & param1, 15);
    }

    final void g(int param0, int param1) {
        ((dh) this).field_i[((dh) this).field_k + (-param0 + -2)] = (byte)(param0 >> -1771206520);
        ((dh) this).field_i[((dh) this).field_k - (param0 + 1)] = (byte)param0;
        if (param1 != -20125) {
            ((dh) this).field_i = null;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int var6 = 0;
        int var7 = Terraphoenix.field_V;
        int var5 = 52 / ((30 - param2) / 56);
        for (var6 = param1; param1 - -param0 > var6; var6++) {
            ((dh) this).field_k = ((dh) this).field_k + 1;
            param3[var6] = ((dh) this).field_i[((dh) this).field_k];
        }
    }

    final int d(byte param0) {
        ((dh) this).field_k = ((dh) this).field_k + 3;
        if (param0 > -112) {
            ((dh) this).field_k = -17;
        }
        return (((dh) this).field_i[-1 + ((dh) this).field_k] & 255) + ((((dh) this).field_i[((dh) this).field_k - 2] << 1679937224 & 65280) + ((255 & ((dh) this).field_i[-3 + ((dh) this).field_k]) << -1017524688));
    }

    final int d(int param0) {
        if (param0 != -10355) {
            return -125;
        }
        if (0 <= ((dh) this).field_i[((dh) this).field_k]) {
            return ((dh) this).i(param0 ^ 19355);
        }
        return ((dh) this).f((byte) -107) & 2147483647;
    }

    dh(int param0) {
        ((dh) this).field_k = 0;
        ((dh) this).field_i = qg.a(90, param0);
    }

    final void b(String param0, int param1) {
        if (param1 > -19) {
            ((dh) this).field_k = 65;
        }
        int var3 = param0.indexOf(' ');
        if (var3 >= 0) {
            throw new IllegalArgumentException("");
        }
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte) 0;
        CharSequence var4 = (CharSequence) (Object) param0;
        ((dh) this).field_k = ((dh) this).field_k + ed.a(0, (byte) 115, var4, ((dh) this).field_i, ((dh) this).field_k, param0.length());
        ((dh) this).field_k = ((dh) this).field_k + 1;
        ((dh) this).field_i[((dh) this).field_k] = (byte) 0;
    }

    final long h(byte param0) {
        long var2 = 4294967295L & (long)((dh) this).f((byte) -107);
        long var4 = (long)((dh) this).f((byte) -107) & 4294967295L;
        if (param0 != 78) {
            return -96L;
        }
        return (var2 << 1581314336) + var4;
    }

    dh(byte[] param0) {
        ((dh) this).field_i = param0;
        ((dh) this).field_k = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 10;
        field_j = true;
    }
}
