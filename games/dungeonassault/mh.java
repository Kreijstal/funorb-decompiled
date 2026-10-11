/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static vk field_b;
    static ef field_c;
    static int field_g;
    static int field_a;
    static gl field_e;
    static char[] field_d;
    static cf field_f;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ib.field_f != null) {
            fc.field_m = 0;
            ak.field_k = param0.getX();
            em.field_C = param0.getY();
            kd.c(-2456);
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              wm.field_g = 1;
              ua.field_a = 1;
            } else {
              wm.field_g = 2;
              ua.field_a = 2;
            }
            var2_int = param0.getModifiers();
            if ((8 & var2_int) != 0) {
            }
            if ((var2_int & 4) != 0) {
            }
            lj.field_g = true;
            if (0 == (16 & var2_int)) {
            }
          }
          if (!param0.isPopupTrigger()) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("mh.mousePressed(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ib.field_f == null) {
            return;
          }
          fc.field_m = 0;
          wi.field_tb = param0.getX();
          dj.field_d = param0.getY();
          lj.field_g = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("mh.mouseMoved(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (ib.field_f != null) {
            ua.field_a = 0;
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "mh.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        try {
          if (ib.field_f != null) {
            fc.field_m = 0;
            wi.field_tb = param0.getX();
            dj.field_d = param0.getY();
            lj.field_g = true;
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "mh.mouseDragged(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0) {
          var3 = param1 >> 16;
          var4 = 65535 & param1;
          var5 = param2 >> 16;
          var6 = 65535 & param2;
          return (var6 * var4 >> 16) + var4 * var5 + var3 * param2;
        }
        return -9;
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
          if (null != ib.field_f) {
            fc.field_m = 0;
            wi.field_tb = -1;
            dj.field_d = -1;
            lj.field_g = true;
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "mh.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        of.field_k = false;
        nf.field_y = param0;
        eh.field_o.field_N = true;
        ed var4 = eh.field_o;
        ed var5 = var4;
        var5.field_w = true;
        ed var2 = og.field_e;
        og.field_e.field_N = false;
        var2.field_w = false;
    }

    final static boolean a(int param0, int param1) {
        if (param1 == ek.field_c) {
          return true;
        }
        param1 = param1 & 127;
        if (wh.field_a <= param1) {
          return gg.field_g.length > param1 - wh.field_a ? true : false;
        }
        if (param1 >= cp.field_R) {
          return -cp.field_R + param1 < id.field_j.length ? true : false;
        }
        if (param1 >= ok.field_z) {
          return bl.field_n.length > -ok.field_z + param1 ? true : false;
        }
        if (!(gn.field_d > param1)) {
          return -gn.field_d + param1 < ci.field_s.length ? true : false;
        }
        if (param0 < 76) {
          return false;
        }
        if (!(param1 < uf.field_a)) {
          return -uf.field_a + param1 < hb.field_m.length ? true : false;
        }
        if (wm.field_a <= param1) {
          return dc.field_p.length > -wm.field_a + param1 ? true : false;
        }
        return false;
    }

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        field_d = null;
        field_c = null;
        field_e = null;
        if (param0 != 16) {
          field_e = (gl) null;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == ib.field_f) {
            return;
          }
          fc.field_m = 0;
          wi.field_tb = param0.getX();
          dj.field_d = param0.getY();
          lj.field_g = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("mh.mouseEntered(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.isPopupTrigger()) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("mh.mouseClicked(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ib.field_f != null) {
            fc.field_m = 0;
            ua.field_a = 0;
            lj.field_g = true;
            var2_int = param0.getModifiers();
            if (0 != (16 & var2_int)) {
            }
            if ((var2_int & 4) == 0) {
            }
            if (0 != (var2_int & 8)) {
            }
          }
          if (!param0.isPopupTrigger()) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("mh.mouseReleased(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_c = new ef();
        field_d = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
