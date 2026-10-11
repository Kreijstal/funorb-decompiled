/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_e;
    static String field_g;
    static ck field_c;
    static ji field_h;
    static qm field_a;
    static ck field_b;
    static int field_d;
    static boolean field_f;
    static long field_i;

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
          if (null != ik.field_f) {
            pf.field_g = 0;
            lc.field_f = param0.getX();
            te.field_r = param0.getY();
            ml.field_b = true;
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "wg.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(boolean param0, CharSequence param1, char param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          var3_int = 0;
          var4 = param1.length();
          for (var5 = 0; var4 > var5; var5++) {
            if (~param1.charAt(var5) == ~param2) {
              var3_int++;
            }
          }
          if (!param0) {
            field_e = 126;
          }
          stackIn_12_0 = var3_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("wg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_c = null;
        field_a = null;
        field_h = null;
        if (!param0) {
          return;
        }
        field_b = null;
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != ik.field_f) {
            pf.field_g = 0;
            pa.field_bb = 0;
            ml.field_b = true;
            var2_int = param0.getModifiers();
            if ((8 & var2_int) == 0) {
            }
            if (0 == (16 & var2_int)) {
            }
            if (0 != (var2_int & 4)) {
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
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("wg.mouseReleased(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ik.field_f == null) {
            return;
          }
          pf.field_g = 0;
          lc.field_f = param0.getX();
          te.field_r = param0.getY();
          ml.field_b = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("wg.mouseMoved(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(boolean param0, wl param1, ve param2, byte param3) {
        int var8 = 0;
        ve stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        ve stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        ve stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        ve stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        ve stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        ve stackIn_22_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        try {
          if (param0) {
            param2.field_rc = param1.d((byte) -75);
          }
          param2.field_mc = param1.d((byte) -75);
          param2.field_Wb = param1.d((byte) -62);
          var4_int = param1.d((byte) -95);
          stackIn_6_0 = (ve) (param2);
          stackIn_7_1 = ((128 & var4_int) != 0);
          stackIn_6_0.field_Cc = stackIn_7_1;
          stackIn_9_0 = (ve) (param2);
          stackIn_10_1 = ((32 & var4_int) != 0);
          stackIn_9_0.field_Ic = stackIn_10_1;
          stackIn_13_0 = (ve) (param2);
          stackIn_14_1 = (param2.field_Cc) && (param2.field_rc < param2.field_mc);
          stackIn_13_0.field_gc = stackIn_14_1;
          stackIn_16_0 = (ve) (param2);
          stackIn_17_1 = ((64 & var4_int) != 0);
          stackIn_16_0.field_lc = stackIn_17_1;
          stackIn_19_0 = (ve) (param2);
          stackIn_20_1 = ((var4_int & 8) != 0);
          stackIn_19_0.field_wc = stackIn_20_1;
          stackIn_22_0 = (ve) (param2);
          if (0 != (16 & var4_int)) {
            stackIn_23_1 = 2;
          } else {
            stackIn_23_1 = 1;
          }
          stackIn_22_0.field_qc = stackIn_23_1;
          stackIn_26_0 = (0 == (4 & var4_int)) ? 0 : 1;
          var5 = stackIn_26_0;
          stackIn_29_0 = ((var4_int & 2) == 0) ? 0 : 1;
          var6 = stackIn_29_0;
          param1.a(param2.field_kc, 0, (byte) 126, param2.field_kc.length);
          param2.field_Ub = param1.e(3);
          param2.field_tc = ik.a(4) - (long)param1.i(7553);
          if (var5 == 0) {
            param2.field_Nb = -1;
          } else {
            param2.field_Nb = param1.i(7553);
          }
          if (param3 > -41) {
            return;
          }
          param2.field_Xb = param1.f((byte) -108);
          var7 = param1.field_n;
          param2.field_Vb = param1.c((byte) -38);
          if (var6 == 0) {
            param2.field_xc = null;
            return;
          }
          param2.field_xc = new String[param2.field_rc];
          param1.field_n = var7;
          for (var8 = 0; param2.field_rc > var8; var8++) {
            param2.field_xc[var8] = param1.c((byte) -38);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("wg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(uf param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 82 % ((-69 - param1) / 43);
          stackIn_3_0 = (param0.a(1, (byte) 53) == 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("wg.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ik.field_f == null) {
            return;
          }
          pa.field_bb = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("wg.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ik.field_f != null) {
            pf.field_g = 0;
            ge.field_a = param0.getX();
            qa.field_t = param0.getY();
            ik.a(4);
            if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              nk.field_l = 2;
              pa.field_bb = 2;
            } else {
              nk.field_l = 1;
              pa.field_bb = 1;
            }
            var2_int = param0.getModifiers();
            if (0 != (4 & var2_int)) {
            }
            ml.field_b = true;
            if ((var2_int & 16) == 0) {
            }
            if ((var2_int & 8) == 0) {
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
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("wg.mousePressed(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ik.field_f == null) {
            return;
          }
          pf.field_g = 0;
          lc.field_f = param0.getX();
          te.field_r = param0.getY();
          ml.field_b = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("wg.mouseDragged(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
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
          stackIn_6_1 = new StringBuilder().append("wg.mouseClicked(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
          if (ik.field_f != null) {
            pf.field_g = 0;
            lc.field_f = -1;
            te.field_r = -1;
            ml.field_b = true;
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "wg.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Find opponents";
        field_a = new qm(11, 0, 1, 2);
    }
}
