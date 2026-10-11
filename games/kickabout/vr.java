/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vr {
    static String field_b;
    static String field_a;

    final static void c(int param0) {
        if (param0 != -3) {
          return;
        }
        String var2 = (String) null;
        ui.a(ld.field_a, (byte) 111, (String) null);
    }

    final static int a(int param0, int param1) {
        int[] var3 = null;
        int[] var2 = null;
        int[] var3Lifetime1;
        int[] var2Lifetime1;
        if (param0 == -2) {
          var3 = na.field_zb[rm.field_C];
          var2 = var3;
          return param1 < var3.length ? var3[param1] : 100;
        }
        field_b = (String) null;
        var3Lifetime1 = na.field_zb[rm.field_C];
        var2Lifetime1 = var3Lifetime1;
        return param1 < var3Lifetime1.length ? var3Lifetime1[param1] : 100;
    }

    public static void a(byte param0) {
        if (param0 >= -117) {
          field_b = (String) null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
              param0.getAppletContext().showDocument(qr.a(param0, var2, 3), "_top");
              if (param1 == 23607) {
                return;
              }
              field_a = (String) null;
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("vr.C(");
            if (param0 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
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
        he var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = Kickabout.field_G;
        try {
          hw.field_k = false;
          uv.field_i = null;
          ow.field_b = null;
          if (rp.field_B != null) {
            rp.field_B.b(param0 + 22999);
            rp.field_B = null;
          }
          if (param0 != -2) {
            return;
          }
          pq.field_N = null;
          if (kq.field_yb != null) {
            kq.field_yb.b(param0 ^ -22997);
            kq.field_yb = null;
          }
          sr.field_f = null;
          if (null != lw.field_d) {
            lw.field_d.b(param0 ^ -22997);
            lw.field_d = null;
          }
          pu.field_Eb = null;
          if (null == pq.field_N) {
            return;
          }
          var3 = (he) (pq.field_N.b((byte) 72));
          while (var3 != null) {
            var3.f(57);
            var3 = (he) (pq.field_N.a(0));
          }
          pq.field_N = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "vr.B(" + param0 + ')');
        }
    }

    final static void b(byte param0) {
        np.field_Jb.a(new aw(), 3);
        if (param0 > -114) {
          vr.a((byte) -74);
        }
    }

    final static boolean d(int param0) {
        if (param0 != 1) {
          vr.a(8, 93, (byte) -111);
          return true;
        }
        return true;
    }

    final static int a(int param0, int param1, byte param2) {
        Object var3;
        String var5;
        String var6;
        if (null != cv.field_b[param1][param0]) {
          return -1;
        }
        var3 = null;
        if (0 == param1) {
          var3 = "park";
        }
        if (1 == param1) {
          var3 = "beach";
        }
        if (param1 == 2) {
          var3 = "street";
        }
        var5 = (String) (var3) + "_surface" + param0;
        var6 = var5;
        if (param2 > -48) {
          vr.a(22);
        }
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
          field_b = (String) null;
        }
    }

    static {
        field_b = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_a = "Real-life threats";
    }
}
