/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    private um field_f;
    static String field_e;
    private um field_a;
    static byte[] field_d;
    static ci field_h;
    static int field_g;
    private kl field_b;
    private kl field_c;

    final lm a(int param0, int[] param1, byte param2) {
        int var4 = -64 / ((-8 - param2) / 36);
        if (((fe) this).field_f.a(false) == -2) {
            return this.a(param1, (byte) 12, param0, 0);
        }
        if (-2 == ((fe) this).field_f.a((byte) -107, param0)) {
            return this.a(param1, (byte) 12, 0, param0);
        }
        throw new RuntimeException();
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 < 100) {
            int discarded$0 = fe.a(-13, 48, 13);
        }
        field_h = null;
        field_d = null;
    }

    final lm a(String param0, boolean param1, String param2) {
        if (param1) {
            Object var5 = null;
            fe.a((String) null, false, (byte) 17, (java.applet.Applet) null);
        }
        return this.a(param2, 1, param0, (int[]) null);
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Chess.field_G;
          if (param1 == 1) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        var3 = 0;
        var4 = ak.field_j;
        L1: while (true) {
          if (var3 >= ka.field_g.length) {
            return -1;
          } else {
            var5 = cb.field_k[var3];
            if (var5 >= 0) {
              var6 = kn.a(true, false, ka.field_g[var3]);
              var4 = var4 + ek.field_b;
              var7 = ob.field_C - (var6 >> 925442497);
              if (ve.a(var4, -m.field_d + var7, var6 - -(m.field_d << -1321741823), param2, (kl.field_i << 314478561) + vh.field_c, param1 ^ 3, param0)) {
                return var5;
              } else {
                var4 = var4 + (vh.field_c + (kl.field_i << -452242975) - -ek.field_b);
                var3++;
                continue L1;
              }
            } else {
              var4 = var4 + fd.field_n;
              var3++;
              continue L1;
            }
          }
        }
    }

    private final lm a(String param0, int param1, String param2, int[] param3) {
        int var5 = ((fe) this).field_f.a(param0, 0);
        if (0 > var5) {
            return null;
        }
        if (param1 != 1) {
            return null;
        }
        int var6 = ((fe) this).field_f.a(param2, 7, var5);
        if (-1 < (var6 ^ -1)) {
            return null;
        }
        return this.a(param3, (byte) 12, var6, var5);
    }

    final static void a(String param0, boolean param1, byte param2, java.applet.Applet param3) {
        try {
            if (jk.field_c.startsWith("win")) {
                if (ek.a(param0, false)) {
                    return;
                }
            }
            try {
                param3.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                fg.a((Throwable) null, (byte) -77, "MGR1: " + param0);
            }
            int var4 = -128 / ((63 - param2) / 40);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final lm a(String param0, String param1, int param2) {
        if (param2 != -12983) {
            return null;
        }
        return this.a((int[]) null, param1, 21887, param0);
    }

    private final lm a(int[] param0, byte param1, int param2, int param3) {
        int var5 = param2 ^ ((536875007 & param3) << 2048493348 | param3 >>> 533276620);
        var5 = var5 | param3 << 1367696464;
        long var6 = (long)var5 ^ 4294967296L;
        lm var8 = (lm) (Object) ((fe) this).field_c.a(41, var6);
        if (var8 != null) {
            return var8;
        }
        if (param0 != null) {
            if (-1 <= (param0[0] ^ -1)) {
                return null;
            }
        }
        if (param1 != 12) {
            field_d = null;
        }
        hi var9 = (hi) (Object) ((fe) this).field_b.a(-115, var6);
        if (!(var9 != null)) {
            var9 = hi.a(((fe) this).field_f, param3, param2);
            if (var9 == null) {
                return null;
            }
            ((fe) this).field_b.a(param1 ^ -97, var6, (o) (Object) var9);
        }
        var8 = var9.a(param0);
        if (var8 == null) {
            return null;
        }
        var9.c(param1 + -2205);
        ((fe) this).field_c.a(param1 ^ -111, var6, (o) (Object) var8);
        return var8;
    }

    private final lm a(int[] param0, String param1, int param2, String param3) {
        int var5 = ((fe) this).field_a.a(param1, 0);
        if (-1 < (var5 ^ -1)) {
            return null;
        }
        if (param2 != 21887) {
            Object var7 = null;
            fe.a((String) null, false, (byte) -34, (java.applet.Applet) null);
        }
        int var6 = ((fe) this).field_a.a(param3, 7, var5);
        if ((var6 ^ -1) > -1) {
            return null;
        }
        return this.a(true, var6, var5, param0);
    }

    private final lm a(boolean param0, int param1, int param2, int[] param3) {
        int var5 = param1 ^ (param2 >>> 32083660 | param2 << 122872548 & 65524);
        var5 = var5 | param2 << 968449200;
        long var6 = (long)var5;
        lm var8 = (lm) (Object) ((fe) this).field_c.a(92, var6);
        if (!param0) {
            int discarded$0 = fe.a(8, 56, 11);
        }
        if (var8 != null) {
            return var8;
        }
        if (param3 != null) {
            if (-1 <= (param3[0] ^ -1)) {
                return null;
            }
        }
        ck var9 = ck.a(((fe) this).field_a, param2, param1);
        if (var9 == null) {
            return null;
        }
        lm var10 = var9.a();
        var8 = var10;
        ((fe) this).field_c.a(29, var6, (o) (Object) var8);
        if (param3 != null) {
            param3[0] = param3[0] - var10.field_m.length;
        }
        return var8;
    }

    final static void a(long param0, int param1) {
        try {
            if (false) throw (InterruptedException) null;
            Thread.sleep(param0);
        } catch (InterruptedException interruptedException) {
        }
        if (param1 > -44) {
            fe.a((byte) -60);
        }
    }

    final lm a(int[] param0, int param1, int param2) {
        if (((fe) this).field_a.a(false) == 1) {
            return this.a(true, param1, 0, param0);
        }
        if (param2 != 968449200) {
            field_d = null;
        }
        if (1 == ((fe) this).field_a.a((byte) -84, param1)) {
            return this.a(true, 0, param1, param0);
        }
        throw new RuntimeException();
    }

    fe(um param0, um param1) {
        ((fe) this).field_b = new kl(256);
        ((fe) this).field_c = new kl(256);
        ((fe) this).field_a = param0;
        ((fe) this).field_f = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
