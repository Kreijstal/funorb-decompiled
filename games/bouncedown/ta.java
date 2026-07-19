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
        tg var1 = null;
        tg var2 = null;
        int var3 = 0;
        int var4 = Bounce.field_N;
        try {
            var1 = new tg(540, 140);
            kh.a(var1, param0 + 1);
            qk.c();
            na.a();
            oa.field_a = 0;
            jf.c(param0);
            var2 = var1.b();
            for (var3 = 0; var3 < 15; var3++) {
                var2.e(-2, -2, 16777215);
                na.c(4, 4, 0, 0, 540, 140);
            }
            Bounce.field_G.d();
            var1.c(0, 0);
            ve.a(-122);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "ta.B(" + param0 + ')');
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
            throw ii.a((Throwable) ((Object) runtimeException), "ta.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
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
        java.applet.Applet var3 = null;
        L0: {
          var2 = Bounce.field_N;
          ej.field_c = null;
          ng.field_b = false;
          if (param0 > 86) {
            break L0;
          } else {
            var3 = (java.applet.Applet) null;
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
            if ((var1 ^ -1) < -1) {
              if (-2 != (var1 ^ -1)) {
                ej.field_c = jf.a(md.field_v, new String[]{Integer.toString(var1)}, (byte) -126);
                ej.field_c = rk.a(true, new CharSequence[]{(CharSequence) ((Object) ej.field_c), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) nd.field_G)});
                nk.field_a.a(true);
                kb.b(808);
                break L1;
              } else {
                ej.field_c = pg.field_d;
                ej.field_c = rk.a(true, new CharSequence[]{(CharSequence) ((Object) ej.field_c), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) nd.field_G)});
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
        int discarded$1 = 0;
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
        byte[] stackIn_2_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_23_0 = null;
        byte[] stackOut_9_0 = null;
        byte[] stackOut_1_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            var9 = new wi(param1);
            if (param0 == 21125) {
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
                      var5 = var9.j(param0 ^ -21128);
                      if (-1 < (var5 ^ -1)) {
                        break L3;
                      } else {
                        L4: {
                          if (-1 == (lj.field_a ^ -1)) {
                            break L4;
                          } else {
                            if (lj.field_a < var5) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          var13 = new byte[var5];
                          var11 = var13;
                          var6 = var11;
                          if (-2 != (var3 ^ -1)) {
                            var7 = wg.field_u;
                            synchronized (var7) {
                              L6: {
                                wg.field_u.a(var9, var13, (byte) 115);
                                break L6;
                              }
                            }
                            break L5;
                          } else {
                            discarded$1 = ad.a(var13, var5, param1, var4, 9);
                            break L5;
                          }
                        }
                        stackOut_23_0 = (byte[]) (var6);
                        stackIn_24_0 = stackOut_23_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    throw new RuntimeException();
                  } else {
                    var12 = new byte[var4];
                    var10 = var12;
                    var5_ref_byte__ = var10;
                    var9.a((byte) 126, var4, var12, 0);
                    stackOut_9_0 = (byte[]) (var5_ref_byte__);
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              throw new RuntimeException();
            } else {
              stackOut_1_0 = (byte[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("ta.D(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_24_0;
          }
        }
    }

    static {
        field_a = 0;
        field_c = 1.0;
        field_d = "Your email address is used to identify this account";
        field_b = "Connection lost. <%0>";
        field_e = "Reload game";
    }
}
