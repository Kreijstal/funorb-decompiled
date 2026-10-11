/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static nf field_c;
    static fe field_a;
    static int field_d;
    static String field_b;

    public final void focusGained(java.awt.event.FocusEvent param0) {
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
          stackIn_6_1 = new StringBuilder().append("qi.mouseClicked(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
          if (hi.field_e != null) {
            gj.field_l = 0;
            fc.field_g = -1;
            uj.field_i = -1;
            li.field_j = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "qi.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == hi.field_e) {
            return;
          }
          cg.field_k = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("qi.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != hi.field_e) {
            gj.field_l = 0;
            dh.field_w = param0.getX();
            ga.field_b = param0.getY();
            lk.a(0);
            if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              ad.field_b = 2;
              cg.field_k = 2;
            } else {
              ad.field_b = 1;
              cg.field_k = 1;
            }
            var2_int = param0.getModifiers();
            if (0 == (var2_int & 8)) {
            }
            if ((16 & var2_int) != 0) {
            }
            li.field_j = true;
            if ((var2_int & 4) == 0) {
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
          stackIn_13_1 = new StringBuilder().append("qi.mousePressed(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        try {
          if (hi.field_e != null) {
            gj.field_l = 0;
            fc.field_g = param0.getX();
            uj.field_i = param0.getY();
            li.field_j = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "qi.mouseMoved(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        try {
          if (null != hi.field_e) {
            gj.field_l = 0;
            fc.field_g = param0.getX();
            uj.field_i = param0.getY();
            li.field_j = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "qi.mouseDragged(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == hi.field_e) {
            return;
          }
          gj.field_l = 0;
          fc.field_g = param0.getX();
          uj.field_i = param0.getY();
          li.field_j = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("qi.mouseEntered(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
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
          if (null != hi.field_e) {
            gj.field_l = 0;
            cg.field_k = 0;
            li.field_j = true;
            var2_int = param0.getModifiers();
            if ((var2_int & 8) == 0) {
            }
            if ((4 & var2_int) == 0) {
            }
            if ((16 & var2_int) != 0) {
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
          stackIn_10_1 = new StringBuilder().append("qi.mouseReleased(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        int var2 = 0;
        int var3 = 0;
        sj var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var3Lifetime1;
        int var4_intLifetime1;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          var1 = null;
          if (null == od.field_g.field_e[11] &&
            oa.field_j >= 34 &&
            oa.field_j < 34 + wl.field_K.field_n * 12 &&
            bk.field_a >= 114 &&
            wl.field_K.field_m + 114 > bk.field_a) {
            var1 = od.field_g;
            var2 = (-34 + oa.field_j) / wl.field_K.field_n;
          } else {
            var2 = (oa.field_j - 34) / wl.field_K.field_n;
            if (var2 >= 0 &&
              var2 < 12 &&
              wk.field_a.field_e[var2] == null &&
              bk.field_a >= 190 &&
              bk.field_a < 190 + wl.field_K.field_m) {
              var1 = wk.field_a;
            } else {
              var2 = (-161 + oa.field_j) / wl.field_K.field_n;
              if (var2 >= 0 &&
                var2 < 8 &&
                null == si.field_i.field_e[var2] &&
                bk.field_a >= 247 &&
                wl.field_K.field_m + 247 > bk.field_a) {
                var1 = si.field_i;
              } else {
                var2 = -1;
              }
            }
          }
          if (param0 <= 44) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          if (od.field_g == var1) {
            while (0 < var2) {
              if (od.field_g.field_e[-1 + var2] == null) {
                var2--;
                continue;
              }
              break;
            }
            if (od.field_g == sg.field_d.field_o &&
              null == od.field_g.field_e[var2]) {
              var2--;
            }
            if (sg.field_d.field_o == od.field_g) {
              stackIn_34_0 = sg.field_d.field_t;
            } else {
              stackIn_34_0 = 12;
            }
            var3 = stackIn_34_0;
            if (var3 > var2) {
              for (var4_int = var3 - 1; var2 <= var4_int; var4_int--) {
                if (od.field_g.field_e[var4_int] != null) {
                  od.field_g.field_e[var4_int].a(var4_int + 1, 28, od.field_g);
                }
              }
              sg.field_d.a(var2, 28, od.field_g);
            } else {
              for (var4_intLifetime1 = 1 + var3; var2 >= var4_intLifetime1; var4_intLifetime1++) {
                if (null != od.field_g.field_e[var4_intLifetime1]) {
                  od.field_g.field_e[var4_intLifetime1].a(-1 + var4_intLifetime1, 28, od.field_g);
                }
              }
              sg.field_d.a(var2, 28, od.field_g);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (var1 != null) {
              if (sg.field_d.field_o == od.field_g) {
                var3Lifetime1 = sg.field_d.field_t + 1;
                while (12 > var3Lifetime1) {
                  if (od.field_g.field_e[var3Lifetime1] != null) {
                    od.field_g.field_e[var3Lifetime1].a(-1 + var3Lifetime1, 28, od.field_g);
                    var3Lifetime1++;
                    continue;
                  }
                  sg.field_d.a(var2, 28, (j) (var1));
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                sg.field_d.a(var2, 28, (j) (var1));
              }
            } else {
              if (sg.field_d.field_o == od.field_g) {
                for (var3Lifetime1 = 0; var3Lifetime1 < 12; var3Lifetime1++) {
                  var4 = od.field_g.field_e[var3Lifetime1];
                  if (var4 == null) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  var4.a(var4.field_t, 28, var4.field_o);
                }
                decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted0)) {
                sg.field_d.a(sg.field_d.field_t, 28, sg.field_d.field_o);
              }
            }
          }
          sg.field_d = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (var1), "qi.A(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 1 / ((-44 - param0) / 56);
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_d = -1;
        field_b = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
