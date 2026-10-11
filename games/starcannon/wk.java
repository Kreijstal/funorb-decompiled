/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static ae field_b;
    static String field_a;

    final static void a(java.awt.Component param0, byte param1) {
        try {
          param0.removeMouseListener(rc.field_d);
          param0.removeMouseMotionListener(rc.field_d);
          param0.removeFocusListener(rc.field_d);
          uh.field_i = 0;
          if (param1 != -64) {
            field_a = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "wk.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (rc.field_d != null) {
            pg.field_g = 0;
            hj.field_d = param0.getX();
            wj.field_a = param0.getY();
            vj.field_Y = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("wk.mouseEntered(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
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
          if (rc.field_d != null) {
            pg.field_g = 0;
            fb.field_j = param0.getX();
            oi.field_f = param0.getY();
            dd.b(68);
            if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              na.field_c = 2;
              uh.field_i = 2;
            } else {
              na.field_c = 1;
              uh.field_i = 1;
            }
            var2_int = param0.getModifiers();
            if ((var2_int & 16) == 0) {
            }
            vj.field_Y = true;
            if ((var2_int & 8) == 0) {
            }
            if ((4 & var2_int) != 0) {
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
          stackIn_12_1 = new StringBuilder().append("wk.mousePressed(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        if (!param0) {
          field_a = (String) null;
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
          if (null != rc.field_d) {
            pg.field_g = 0;
            uh.field_i = 0;
            vj.field_Y = true;
            var2_int = param0.getModifiers();
            if ((16 & var2_int) != 0) {
            }
            if ((var2_int & 8) != 0) {
            }
            if ((4 & var2_int) == 0) {
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
          stackIn_10_1 = new StringBuilder().append("wk.mouseReleased(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, rb param1, ka param2, boolean param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_38_0 = null;
          StringBuilder stackIn_38_1 = null;
          String stackIn_39_2 = null;
          StringBuilder stackIn_41_1 = null;
          String stackIn_42_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          va var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          String var21 = null;
          byte[][] var22 = null;
          int var13Lifetime1;
          var14 = StarCannon.field_A;
          try {
            var18 = new va();
            var18.field_n = param1.j(7909);
            var18.field_k = param1.f((byte) -79);
            var18.field_r = new int[var18.field_n];
            var18.field_i = new bk[var18.field_n];
            var18.field_l = new byte[var18.field_n][][];
            var18.field_g = new int[var18.field_n];
            var18.field_p = new bk[var18.field_n];
            var18.field_q = new int[var18.field_n];
            if (param3) {
              return;
            }
            for (var5 = 0; var5 < var18.field_n; var5++) {
              try {
                var6_int = param1.j(7909);
                if (var6_int != 0 &&
                  var6_int != 1 &&
                  2 != var6_int) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    var20 = param1.a(-73);
                    var21 = param1.a(-114);
                    var9 = param1.j(7909);
                    var10 = new String[var9];
                    for (var11_int = 0; var9 > var11_int; var11_int++) {
                      var10[var11_int] = param1.a(-121);
                    }
                    var22 = new byte[var9][];
                    var19 = var22;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var12_int < var9; var12_int++) {
                        var13 = param1.f((byte) -101);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param1.a(var13, (byte) 88, var22[var12_int], 0);
                      }
                    }
                    var18.field_r[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var17 < var9) {
                      var12[var17] = oe.a(var10[var17], param3);
                      var17++;
                    }
                    var18.field_i[var5] = param2.a(oe.a(var20, false), var21, var12, 29389);
                    var18.field_l[var5] = var22;
                  }
                } else {
                  var15 = param1.a(-58);
                  var16 = param1.a(-20);
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param1.f((byte) -87);
                  }
                  var18.field_r[var5] = var6_int;
                  var18.field_q[var5] = var9;
                  var18.field_p[var5] = param2.a(oe.a(var15, false), -92, var16);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_g[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_g[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_g[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_g[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_g[var5] = -5;
              }
            }
            ee.field_a.b(84, var18);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_38_0 = var4;
            stackIn_38_1 = new StringBuilder().append("wk.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_39_2 = "null";
            } else {
              stackIn_39_2 = "{...}";
            }
            stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
            if (param2 == null) {
              stackIn_42_2 = "null";
            } else {
              stackIn_42_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        try {
          if (null != rc.field_d) {
            pg.field_g = 0;
            hj.field_d = param0.getX();
            wj.field_a = param0.getY();
            vj.field_Y = true;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "wk.mouseMoved(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 <= 31) {
          return true;
        }
        return ai.field_c;
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "wk.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static ld a(String param0, int param1) {
        String var2 = null;
        ld var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ld stackIn_9_0 = null;
        ld stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = StarCannon.field_A;
        try {
          if (null == td.field_o) {
            return null;
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = ni.a(114, var6);
          if (var2 == null) {
            var2 = param0;
          }
          var3 = (ld) (td.field_o.a((long)var2.hashCode(), 55));
          if (param1 < 44) {
            stackIn_9_0 = (ld) null;
            return stackIn_9_0;
          }
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_kb);
            var4 = ni.a(117, var7);
            if (var4 == null) {
              var4 = var3.field_kb;
            }
            if (var4.equals(var2)) {
              stackIn_18_0 = var3;
              return stackIn_18_0;
            }
            var3 = (ld) (td.field_o.b(1));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("wk.E(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
          if (null != rc.field_d) {
            pg.field_g = 0;
            hj.field_d = -1;
            wj.field_a = -1;
            vj.field_Y = true;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "wk.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != rc.field_d) {
            pg.field_g = 0;
            hj.field_d = param0.getX();
            wj.field_a = param0.getY();
            vj.field_Y = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("wk.mouseDragged(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (rc.field_d != null) {
            uh.field_i = 0;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "wk.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new ae();
        field_a = "Create";
    }
}
