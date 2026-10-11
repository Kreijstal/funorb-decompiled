/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static java.awt.Font field_a;

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (lb.field_y != null) {
            t.field_c = 0;
            al.field_n = param0.getX();
            vl.field_G = param0.getY();
            sf.a((byte) -42);
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              ic.field_n = 1;
              qd.field_J = 1;
            } else {
              ic.field_n = 2;
              qd.field_J = 2;
            }
            var2_int = param0.getModifiers();
            kk.field_d = true;
            if ((4 & var2_int) != 0) {
            }
            if ((var2_int & 8) != 0) {
            }
            if ((var2_int & 16) == 0) {
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("kh.mousePressed(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "kh.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          id var2 = (id) null;
          kh.a((id) null, -124);
        }
        field_a = null;
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (lb.field_y != null) {
            t.field_c = 0;
            sa.field_o = param0.getX();
            nm.field_a = param0.getY();
            kk.field_d = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("kh.mouseMoved(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
          if (lb.field_y != null) {
            t.field_c = 0;
            sa.field_o = -1;
            nm.field_a = -1;
            kk.field_d = true;
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "kh.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -16) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          var2_int = param0.length;
          var3 = new byte[var2_int];
          ai.a(param0, 0, var3, 0, var2_int);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("kh.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        bi var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = MinerDisturbance.field_ab;
        try {
          if (param0 != -1) {
            kh.a(-47, -60);
          }
          var4 = (bi) (bb.field_a.b(92));
          while (var4 != null) {
            tk.a(var4, param1, (byte) -102);
            var4 = (bi) (bb.field_a.b((byte) 56));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "kh.D(" + param0 + ',' + param1 + ')');
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (lb.field_y != null) {
            t.field_c = 0;
            sa.field_o = param0.getX();
            nm.field_a = param0.getY();
            kk.field_d = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("kh.mouseEntered(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(id param0, int param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        byte[] var6 = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = MinerDisturbance.field_ab;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            c.field_c[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < sb.field_p; var2_intLifetime1++) {
            if (param0.field_g == im.field_a[var2_intLifetime1].field_g) {
              dupTemp$3 = im.field_a[var2_intLifetime1].a(126);
              c.field_c[dupTemp$3] = c.field_c[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param0.a(119);
          c.field_c[dupTemp$0] = c.field_c[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; sb.field_p > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (param0.field_g == im.field_a[var3].field_g) {
              var4 = im.field_a[var3].a(60);
              if (bn.field_c < c.field_c[var4]) {
                c.field_c[var4] = c.field_c[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              im.field_a[incrementValue$2] = im.field_a[var3];
            }
          }
          if (param1 != 14288) {
            var6 = (byte[]) null;
            kh.a((byte[]) null, (byte) -81);
          }
          sb.field_p = var2_intLifetime2;
          fieldTemp$1 = sb.field_p;
          sb.field_p = sb.field_p + 1;
          im.field_a[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("kh.E(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (lb.field_y != null) {
            t.field_c = 0;
            qd.field_J = 0;
            kk.field_d = true;
            var2_int = param0.getModifiers();
            if ((16 & var2_int) != 0) {
            }
            if ((4 & var2_int) == 0) {
            }
            if ((var2_int & 8) != 0) {
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("kh.mouseReleased(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        try {
          if (null != lb.field_y) {
            t.field_c = 0;
            sa.field_o = param0.getX();
            nm.field_a = param0.getY();
            kk.field_d = true;
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "kh.mouseDragged(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (lb.field_y != null) {
            qd.field_J = 0;
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "kh.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = MinerDisturbance.field_ab;
        try {
          for (var1_int = 0; var1_int < 25; var1_int++) {
            if (dn.field_t[var1_int] != null) {
              if (dn.field_t[var1_int].k()) {
                dn.field_t[var1_int] = null;
              } else {
                mg.a(1963987425, dn.field_t[var1_int]);
              }
            }
            if (gl.field_u[var1_int] != null) {
              if (gl.field_u[var1_int].k()) {
                gl.field_u[var1_int] = null;
              } else {
                mg.a(param0 ^ 1963987389, gl.field_u[var1_int]);
              }
            }
          }
          if (param0 != 92) {
            field_a = (java.awt.Font) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "kh.C(" + param0 + ')');
        }
    }

    static {
    }
}
