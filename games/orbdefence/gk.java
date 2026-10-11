/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_b;
    static hj field_a;

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != nk.field_q) {
            db.field_f = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gk.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static e a(String param0, byte param1) {
        e stackIn_3_0 = null;
        e stackIn_7_0 = null;
        e stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        e stackIn_26_0 = null;
        e stackIn_39_0 = null;
        e stackIn_43_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = oc.field_M;
            return stackIn_3_0;
          }
          if (var2_int > 64) {
            stackIn_7_0 = vj.field_c;
            return stackIn_7_0;
          }
          if (param0.charAt(0) == 34) {
            if (34 != param0.charAt(-1 + var2_int)) {
              stackIn_13_0 = ba.field_a;
              return stackIn_13_0;
            }
            var3 = 0;
            for (var4 = 1; -1 + var2_int > var4; var4++) {
              var5 = param0.charAt(var4);
              if (var5 == 92) {
                stackIn_22_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_22_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_26_0 = ba.field_a;
                  return stackIn_26_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var4Lifetime1 = -41 / ((param1 + 63) / 60);
          var3Lifetime1 = 0;
          for (var5Lifetime1 = 0; var5Lifetime1 < var2_int; var5Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var6 = param0.charAt(var5Lifetime1);
            if (var6 == 46) {
              if (var5Lifetime1 != 0 &&
                var5Lifetime1 != var2_int - 1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_39_0 = ba.field_a;
                return stackIn_39_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (pj.field_w.indexOf(var6) == -1) {
                stackIn_43_0 = ba.field_a;
                return stackIn_43_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_49_0 = var2;
          stackIn_49_1 = new StringBuilder().append("gk.A(");
          if (param0 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param1).append(')').toString());
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != nk.field_q) {
            nl.field_d = 0;
            bl.field_g = -1;
            ic.field_g = -1;
            tf.field_m = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gk.mouseExited(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static hf a(dl param0, byte param1) {
        RuntimeException var2 = null;
        hf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -11) {
            gk.a(-96);
          }
          stackIn_3_0 = ik.a(bb.a(param0, 100, 96), -129);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gk.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 8) {
          String var2 = (String) null;
          gk.a((String) null, (byte) -107);
        }
        field_a = null;
    }

    final static void b(int param0) {
        int var1 = 0;
        if (param0 != 2) {
          return;
        }
        if (ij.field_g < 224) {
          var1 = ij.field_g % 32;
          ia.b(32 + ij.field_g - var1, -23235);
        } else {
          ia.b(256, -23235);
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "gk.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (nk.field_q != null) {
            nl.field_d = 0;
            bl.field_g = param0.getX();
            ic.field_g = param0.getY();
            tf.field_m = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gk.mouseDragged(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != nk.field_q) {
            nl.field_d = 0;
            vg.field_p = param0.getX();
            id.field_b = param0.getY();
            ji.b(108);
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              eh.field_c = 1;
              db.field_f = 1;
            } else {
              eh.field_c = 2;
              db.field_f = 2;
            }
            var2_int = param0.getModifiers();
            if ((var2_int & 16) != 0) {
              sd.field_c = sd.field_c | 1;
            }
            if (0 != (8 & var2_int)) {
              sd.field_c = sd.field_c | 2;
            }
            if (0 != (4 & var2_int)) {
              sd.field_c = sd.field_c | 4;
            }
            tf.field_m = true;
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("gk.mousePressed(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (nk.field_q != null) {
            nl.field_d = 0;
            db.field_f = 0;
            tf.field_m = true;
            var2_int = param0.getModifiers();
            if ((16 & var2_int) != 0) {
              sd.field_c = sd.field_c & -2;
            }
            if ((var2_int & 8) != 0) {
              sd.field_c = sd.field_c & -3;
            }
            if ((4 & var2_int) != 0) {
              sd.field_c = sd.field_c & -5;
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("gk.mouseReleased(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (nk.field_q != null) {
            nl.field_d = 0;
            bl.field_g = param0.getX();
            ic.field_g = param0.getY();
            tf.field_m = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gk.mouseMoved(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
          if (nk.field_q != null) {
            nl.field_d = 0;
            bl.field_g = param0.getX();
            ic.field_g = param0.getY();
            tf.field_m = true;
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "gk.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = 50;
    }
}
