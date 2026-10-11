/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int[] field_b;
    static boolean field_e;
    static int[] field_a;
    static boolean field_c;
    static String field_f;
    static int field_d;

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (pj.field_G != null) {
            th.field_e = 0;
            tf.field_mb = 0;
            lk.field_j = true;
            var2_int = param0.getModifiers();
            if ((16 & var2_int) != 0) {
            }
            if (0 != (var2_int & 4)) {
            }
            if ((var2_int & 8) == 0) {
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("aj.mouseReleased(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          wj.g(param1, param2, 1 + param0, 10000536);
          wj.g(param1, param2 + param3, param0 + 1, 12105912);
          var5_int = 1;
          if (param2 + var5_int < wj.field_e) {
            var5_int = wj.field_e - param2;
          }
          var6 = param3;
          if (param4 <= 42) {
            return;
          }
          if (wj.field_j < param2 + var6) {
            var6 = wj.field_j - param2;
          }
          for (var7 = var5_int; var7 < var6; var7++) {
            var8 = 152 + 48 * var7 / param3;
            var9 = var8 << 16 | var8 << 8 | var8;
            wj.field_l[wj.field_k * (param2 + var7) + param1] = var9;
            wj.field_l[wj.field_k * (var7 + param2) - (-param1 - param0)] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var5), "aj.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
          String var6 = null;
          String var5 = null;
          String var4 = null;
          String var7 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            ih.field_J = param2;
            var6 = param0.getParameter("cookieprefix");
            var5 = var6;
            var5Lifetime1 = var6;
            var4 = param0.getParameter("cookiehost");
            var5Lifetime2 = var4;
            var5Lifetime3 = var4;
            var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
            var5Lifetime4 = var7;
            var5Lifetime5 = var7;
            if (param2.length() == 0) {
              var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
              var5Lifetime6 = var7 + "; Expires=" + bf.a(la.a(false) + 94608000000L, (byte) -29) + "; Max-Age=" + 94608000L;
            }
            pb.a(true, "document.cookie=\"" + var5Lifetime6 + "\"", param0);
            if (param1 <= 6) {
              aj.a(true);
            }
            ti.a((byte) -101, param0);
          } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "aj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != pj.field_G) {
            th.field_e = 0;
            e.field_q = param0.getX();
            mj.field_u = param0.getY();
            lk.field_j = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("aj.mouseMoved(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (pj.field_G != null) {
            th.field_e = 0;
            e.field_q = param0.getX();
            mj.field_u = param0.getY();
            lk.field_j = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("aj.mouseDragged(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
          if (pj.field_G != null) {
            th.field_e = 0;
            e.field_q = param0.getX();
            mj.field_u = param0.getY();
            lk.field_j = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "aj.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0) {
        ek var1 = (ek) (tg.field_g.a((byte) -114));
        if (var1 == null) {
          var1 = new ek();
        }
        var1.a(wj.field_j, wj.field_l, wj.field_b, wj.field_c, (byte) 69, wj.field_k, wj.field_g, wj.field_e);
        hl.field_c.a(var1, 255);
        if (!param0) {
          field_f = (String) null;
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = -42 % ((-14 - param0) / 46);
        field_b = null;
        field_f = null;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (pj.field_G != null) {
            tf.field_mb = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("aj.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "aj.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
          if (null != pj.field_G) {
            th.field_e = 0;
            e.field_q = -1;
            mj.field_u = -1;
            lk.field_j = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "aj.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != pj.field_G) {
            th.field_e = 0;
            ee.field_d = param0.getX();
            fj.field_j = param0.getY();
            la.a(false);
            if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              f.field_h = 2;
              tf.field_mb = 2;
            } else {
              f.field_h = 1;
              tf.field_mb = 1;
            }
            var2_int = param0.getModifiers();
            lk.field_j = true;
            if (0 != (16 & var2_int)) {
            }
            if ((4 & var2_int) != 0) {
            }
            if ((8 & var2_int) != 0) {
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("aj.mousePressed(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(nh param0, byte param1) {
        try {
          aj.a(true);
          wj.a(param0.field_B, param0.field_z, param0.field_C);
          if (param1 < 46) {
            field_d = -91;
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "aj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = new int[8192];
        field_f = "Mouse-over icons to select level";
        field_d = 0;
    }
}
