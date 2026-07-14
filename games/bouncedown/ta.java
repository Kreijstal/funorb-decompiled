/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static double field_c;
    static String field_d;
    static volatile int field_a;
    static String field_e;
    static String field_b;

    final static void c(int param0) {
        int var3 = 0;
        int var4 = Bounce.field_N;
        tg var1 = new tg(540, 140);
        kh.a(var1, param0 + 1);
        qk.c();
        na.a();
        oa.field_a = 0;
        jf.c(param0);
        tg var2 = var1.b();
        for (var3 = 0; var3 < 15; var3++) {
            var2.e(-2, -2, 16777215);
            na.c(4, 4, 0, 0, 540, 140);
        }
        Bounce.field_G.d();
        var1.c(0, 0);
        ve.a(-122);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        oh.field_e = true;
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        if (param0 != -118) {
            return;
        }
        long var4 = -1L;
        lj.a(param1, var2, var3, (byte) -74, var4);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            field_c = 0.9648385806292417;
        }
        field_d = null;
        field_e = null;
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        Object var3 = null;
        L0: {
          var2 = Bounce.field_N;
          ej.field_c = null;
          ng.field_b = false;
          if (param0 > 86) {
            break L0;
          } else {
            var3 = null;
            ta.a((byte) -73, (java.applet.Applet) null);
            break L0;
          }
        }
        L1: {
          if (fe.field_g) {
            nk.field_a.n(1);
            break L1;
          } else {
            var1 = nb.field_d;
            if (var1 < -1) {
              if (-2 != var1) {
                ej.field_c = jf.a(md.field_v, new String[1], (byte) -126);
                ej.field_c = rk.a(true, new CharSequence[3]);
                nk.field_a.a(true);
                kb.b(808);
                break L1;
              } else {
                ej.field_c = pg.field_d;
                ej.field_c = rk.a(true, new CharSequence[3]);
                nk.field_a.a(true);
                kb.b(808);
                break L1;
              }
            } else {
              nk.field_a.a(true);
              kb.b(808);
              break L1;
            }
          }
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        wi var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        Throwable decompiledCaughtException = null;
        var9 = new wi(param1);
        if (param0 == 21125) {
          L0: {
            var3 = var9.d((byte) -66);
            var4 = var9.j(-3);
            if (var4 < 0) {
              break L0;
            } else {
              L1: {
                if (lj.field_a == 0) {
                  break L1;
                } else {
                  if (var4 > lj.field_a) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (var3 != 0) {
                L2: {
                  var5 = var9.j(param0 ^ -21128);
                  if (-1 < var5) {
                    break L2;
                  } else {
                    L3: {
                      if (-1 == lj.field_a) {
                        break L3;
                      } else {
                        if (lj.field_a < var5) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      var17 = new byte[var5];
                      var15 = var17;
                      var13 = var15;
                      var11 = var13;
                      var6 = var11;
                      if (-2 != (var3 ^ -1)) {
                        var7 = (Object) (Object) wg.field_u;
                        synchronized (var7) {
                          wg.field_u.a(var9, var17, (byte) 115);
                        }
                        break L4;
                      } else {
                        int discarded$4 = ad.a(var17, var5, param1, var4, 9);
                        break L4;
                      }
                    }
                    return var6;
                  }
                }
                throw new RuntimeException();
              } else {
                var16 = new byte[var4];
                var14 = var16;
                var12 = var14;
                var10 = var12;
                var5_ref_byte__ = var10;
                var9.a((byte) 126, var4, var16, 0);
                return var5_ref_byte__;
              }
            }
          }
          throw new RuntimeException();
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_c = 1.0;
        field_d = "Your email address is used to identify this account";
        field_b = "Connection lost. <%0>";
        field_e = "Reload game";
    }
}
