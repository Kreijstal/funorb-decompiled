/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vr {
    static String field_b;
    static String field_a;

    final static void c() {
        Object var2 = null;
        ui.a(ld.field_a, (byte) 111, (String) null);
    }

    final static int a(int param0, int param1) {
        int[] var3 = na.field_zb[rm.field_C];
        int[] var2 = var3;
        return param1 < var3.length ? var3[param1] : 100;
    }

    public static void a() {
        field_b = null;
        field_a = null;
    }

    final static void a(java.applet.Applet param0) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                int discarded$2 = 3;
                param0.getAppletContext().showDocument(qr.a(param0, var2), "_top");
                return;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref2;
                stackOut_4_1 = new StringBuilder().append("vr.C(");
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param0 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L0;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L0;
                }
              }
              throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 23607 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              hw.field_k = false;
              uv.field_i = null;
              ow.field_b = null;
              if (rp.field_B == null) {
                break L1;
              } else {
                rp.field_B.b(22997);
                rp.field_B = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "vr.B(" + -2 + 41);
        }
    }

    final static void b() {
        np.field_Jb.a((gn) (Object) new aw(), 3);
    }

    final static boolean d() {
        return true;
    }

    final static int a(int param0, int param1, byte param2) {
        if (!(null == cv.field_b[param1][param0])) {
            return -1;
        }
        Object var3 = null;
        if (0 == param1) {
            var3 = (Object) (Object) "park";
        }
        if (!(1 != param1)) {
            var3 = (Object) (Object) "beach";
        }
        if (param1 == 2) {
            var3 = (Object) (Object) "street";
        }
        String var5 = var3 + "_surface" + param0;
        String var6 = var5;
        if (!bo.field_Cb.a(false, var6)) {
            return bo.field_Cb.a(var6, -16248);
        }
        cv.field_b[param1][param0] = wa.a((byte) 113, var6, bo.field_Cb, "");
        if (param1 != 1) {
            return -1;
        }
        if (param0 != 3) {
            return -1;
        }
        nh.a(cv.field_b[param1][param0], 0.0, 1.6, 1.0);
        return -1;
    }

    final static void b(int param0) {
        mc.a(-106);
        if (param0 != 1) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_a = "Real-life threats";
    }
}
