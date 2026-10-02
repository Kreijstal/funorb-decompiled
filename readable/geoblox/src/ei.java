/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends qf {
    static uj field_hb;
    static String fullscreenUnavailableTrySignedAppletText;

    final static void a(boolean param0, int param1, java.awt.Canvas param2) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        java.awt.Canvas var5 = null;
        var4 = Geoblox.field_C;
        try {
          if (mi.field_C < 10) {
            var3_int = 0;
            if (dl.field_c) {
              var3_int = 1;
              dl.field_c = false;
            }
            pb.a(tj.a((byte) 73), v.field_q, var3_int != 0, false, kh.a((byte) -85));
          } else {
            if (wj.f(7426)) {
              if (hj.field_a == 0) {
                ue.a(param0, false, (byte) -102);
                i.a(0, (byte) 42, param2, 0);
              } else {
                fc.a(true, param2);
              }
            } else {
              SoftwareRasterizer.c();
              eh.a(240, 320, -51);
              i.a(0, (byte) 51, param2, 0);
            }
          }
          if (param1 != 0) {
            var5 = (java.awt.Canvas) null;
            ei.a(true, -122, (java.awt.Canvas) null);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = (RuntimeException) (var3);

          stackIn_16_1 = new StringBuilder().append("ei.OB(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
            stackIn_17_2 = "null";
          } else {
            stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static String a(boolean param0, boolean param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            var3 = ab.a(param0, 2, param2);
            if (var3 != null) {
              stackIn_4_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
            } else {
              if (!param1) {
                var4 = 0;
                L1: while (true) {
                  if (var4 < param2.length()) {
                    if (q.a(param2.charAt(var4), (byte) 97)) {
                      var4++;
                      continue L1;
                    } else {
                      stackIn_13_0 = kc.createNameCharacterAlertText;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_7_0 = (String) null;
                decompiledRegionSelector0 = 1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = (RuntimeException) (var3_ref);

          stackIn_18_1 = new StringBuilder().append("ei.QB(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
            stackIn_19_2 = "null";
          } else {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    public static void n(int param0) {
        if (param0 > -59) {
            return;
        }
        field_hb = null;
        fullscreenUnavailableTrySignedAppletText = null;
    }

    final void b(el param0, int param1) {
        try {
            if (param1 > -10) {
                fullscreenUnavailableTrySignedAppletText = (String) null;
            }
            super.b(param0, -22);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ei.PB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ei(ng param0, el param1) {
        super(param0, param1, 33, 20, 30);
    }

    static {
        field_hb = new uj();
        fullscreenUnavailableTrySignedAppletText = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
