/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static double field_c;
    static String field_d;
    static volatile int field_a;
    static String field_e;
    static String field_b;

    final static void c() {
        tg var1 = null;
        tg var2 = null;
        int var3 = 0;
        int var4 = Bounce.field_N;
        try {
            var1 = new tg(540, 140);
            int discarded$0 = 1;
            kh.a(var1);
            qk.c();
            na.a();
            oa.field_a = 0;
            jf.c(0);
            var2 = var1.b();
            for (var3 = 0; var3 < 15; var3++) {
                var2.e(-2, -2, 16777215);
                na.c(4, 4, 0, 0, 540, 140);
            }
            Bounce.field_G.d();
            var1.c(0, 0);
            ve.a(-122);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ta.B(" + 0 + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        long var4 = 0L;
        oh.field_e = true;
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        if (param0 != -118) {
            return;
        }
        try {
            var4 = -1L;
            lj.a(param1, var2, var3, (byte) -74, var4);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ta.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_b = null;
        field_d = null;
        field_e = null;
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = Bounce.field_N;
        ej.field_c = null;
        ng.field_b = false;
        if (param0 <= 86) {
            Object var3 = null;
            ta.a((byte) -73, (java.applet.Applet) null);
        }
        if (!fe.field_g) {
            var1 = nb.field_d;
            if (var1 <= 0) {
            } else {
                if (var1 == 1) {
                    ej.field_c = pg.field_d;
                } else {
                    ej.field_c = jf.a(md.field_v, new String[1], (byte) -126);
                }
                ej.field_c = rk.a(true, new CharSequence[3]);
            }
            nk.field_a.a(true);
            kb.b(808);
        } else {
            nk.field_a.n(1);
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
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
        byte[] stackIn_9_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_22_0 = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            var9 = new wi(param1);
            L1: {
              var3 = var9.d((byte) -66);
              var4 = var9.j(-3);
              if (var4 < 0) {
                break L1;
              } else {
                L2: {
                  if (lj.field_a == 0) {
                    break L2;
                  } else {
                    if (var4 > lj.field_a) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var3 != 0) {
                  L3: {
                    var5 = var9.j(-3);
                    if (var5 < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (lj.field_a == 0) {
                          break L4;
                        } else {
                          if (~lj.field_a > ~var5) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        var17 = new byte[var5];
                        var15 = var17;
                        var13 = var15;
                        var11 = var13;
                        var6 = var11;
                        if (var3 != 1) {
                          var7 = (Object) (Object) wg.field_u;
                          synchronized (var7) {
                            L6: {
                              wg.field_u.a(var9, var17, (byte) 115);
                              break L6;
                            }
                          }
                          break L5;
                        } else {
                          int discarded$2 = 9;
                          int discarded$3 = ad.a(var6, var5, param1, var4);
                          break L5;
                        }
                      }
                      stackOut_22_0 = (byte[]) var6;
                      stackIn_23_0 = stackOut_22_0;
                      break L0;
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
                  stackOut_8_0 = (byte[]) var5_ref_byte__;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("ta.D(").append(21125).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
        return stackIn_23_0;
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
