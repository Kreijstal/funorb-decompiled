/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_a;
    static boolean field_d;
    static int field_b;
    static int[] field_e;
    static boolean field_c;

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        try {
          if (null != ng.field_b) {
            wc.field_Ob = 0;
            lf.field_m = param0.getX();
            vg.field_c = param0.getY();
            kg.field_l = true;
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "h.mouseDragged(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        try {
          if (null != ng.field_b) {
            wc.field_Ob = 0;
            lf.field_m = param0.getX();
            vg.field_c = param0.getY();
            kg.field_l = true;
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "h.mouseMoved(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(vn[] param0, int param1, int param2, byte param3, int param4) {
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var5_intLifetime1;
        int var5_intLifetime2;
        int var5_intLifetime3;
        int var5_intLifetime4;
        int var5_intLifetime5;
        int var5_intLifetime6;
        int var5_intLifetime7;
        var6 = ZombieDawn.field_J;
        try {
          if (param3 != -17) {
            return;
          }
          if (param1 == 0) {
            param0[param2].a();
            param0[param4].e(0, 0);
            bi.a(0, 0, 24, 24, 0, 128);
            cn.field_f.b(-124);
          } else {
            if (param1 == 1) {
              param0[param2].a();
              param0[param4].e(0, 0);
              for (var5_int = 0; var5_int < 24; var5_int++) {
                bi.g(var5_int, 0, 24, 0, 5 * var5_int);
              }
              cn.field_f.b(-124);
              return;
            }
            if (param1 == 2) {
              param0[param2].a();
              param0[param4].e(0, 0);
              for (var5_intLifetime1 = 0; 24 > var5_intLifetime1; var5_intLifetime1++) {
                bi.g(var5_intLifetime1, 0, 24, 0, -(var5_intLifetime1 * 5) + 120);
              }
              cn.field_f.b(-124);
              return;
            }
            if (param1 == 3) {
              param0[param2].a();
              param0[param4].e(0, 0);
              for (var5_intLifetime2 = 0; var5_intLifetime2 < 24; var5_intLifetime2++) {
                bi.a(0, var5_intLifetime2, 24, 0, 5 * var5_intLifetime2);
              }
              cn.field_f.b(-124);
              return;
            }
            if (param1 == 4) {
              param0[param2].a();
              param0[param4].e(0, 0);
              for (var5_intLifetime3 = 0; var5_intLifetime3 < 24; var5_intLifetime3++) {
                bi.a(0, var5_intLifetime3, 24, 0, -(var5_intLifetime3 * 5) + 120);
              }
              cn.field_f.b(-124);
              return;
            }
            if (6 == param1) {
              param0[param2].a();
              param0[param4].e(0, 0);
              for (var5_intLifetime4 = 0; 24 > var5_intLifetime4; var5_intLifetime4++) {
                bi.a(var5_intLifetime4 + 1, var5_intLifetime4, -var5_intLifetime4 + 24, 0, var5_intLifetime4 * 5);
                bi.g(var5_intLifetime4, var5_intLifetime4, 24 - var5_intLifetime4, 0, 5 * var5_intLifetime4);
              }
              cn.field_f.b(-124);
              return;
            }
            if (param1 == 8) {
              param0[param2].a();
              param0[param4].e(0, 0);
              for (var5_intLifetime5 = 0; var5_intLifetime5 < 24; var5_intLifetime5++) {
                bi.a(0, var5_intLifetime5, var5_intLifetime5 + 1, 0, -(5 * var5_intLifetime5) + 120);
                bi.g(var5_intLifetime5, 0, var5_intLifetime5, 0, -(5 * var5_intLifetime5) + 120);
              }
              cn.field_f.b(-124);
              return;
            }
            if (param1 == 7) {
              param0[param2].a();
              param0[param4].e(0, 0);
              for (var5_intLifetime6 = 0; var5_intLifetime6 < 24; var5_intLifetime6++) {
                bi.a(0, var5_intLifetime6, 24 - var5_intLifetime6, 0, var5_intLifetime6 * 5);
                bi.g(var5_intLifetime6, -var5_intLifetime6 + 24, var5_intLifetime6, 0, 120 - var5_intLifetime6 * 5);
              }
              cn.field_f.b(-124);
              return;
            }
            if (param1 == 5) {
              param0[param2].a();
              param0[param4].e(0, 0);
              for (var5_intLifetime7 = 0; var5_intLifetime7 < 24; var5_intLifetime7++) {
                bi.a(24 - var5_intLifetime7, var5_intLifetime7, var5_intLifetime7, 0, -(var5_intLifetime7 * 5) + 120);
                bi.g(var5_intLifetime7, 0, 24 - var5_intLifetime7, 0, 5 * var5_intLifetime7);
              }
              cn.field_f.b(-124);
              return;
            }
            cn.field_f.b(-124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_50_0 = var5;
          stackIn_50_1 = new StringBuilder().append("h.A(");
          if (param0 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "h.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static v[] a(dj param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        vn[] var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -68) {
            var5 = (vn[]) null;
            h.a((vn[]) null, -98, 92, (byte) 28, 20);
          }
          if (ph.a(param1, 31043, param3, param0)) {
            return di.a(-79);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("h.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
          if (ng.field_b != null) {
            wc.field_Ob = 0;
            lf.field_m = -1;
            vg.field_c = -1;
            kg.field_l = true;
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "h.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != ng.field_b) {
            wc.field_Ob = 0;
            ep.field_m = param0.getX();
            pf.field_c = param0.getY();
            pd.a(-22826);
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              nb.field_j = 1;
              le.field_c = 1;
            } else {
              nb.field_j = 2;
              le.field_c = 2;
            }
            var2_int = param0.getModifiers();
            kg.field_l = true;
            if ((var2_int & 8) != 0) {
            }
            if ((var2_int & 16) == 0) {
            }
            if (0 != (var2_int & 4)) {
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
          stackIn_12_1 = new StringBuilder().append("h.mousePressed(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (ng.field_b != null) {
            wc.field_Ob = 0;
            le.field_c = 0;
            kg.field_l = true;
            var2_int = param0.getModifiers();
            if ((var2_int & 4) != 0) {
            }
            if ((var2_int & 8) == 0) {
            }
            if ((var2_int & 16) != 0) {
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
          stackIn_10_1 = new StringBuilder().append("h.mouseReleased(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != ng.field_b) {
            le.field_c = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("h.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != -14380) {
          h.a(-106);
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != ng.field_b) {
            wc.field_Ob = 0;
            lf.field_m = param0.getX();
            vg.field_c = param0.getY();
            kg.field_l = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("h.mouseEntered(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_a = 25;
        field_e = new int[61];
    }
}
