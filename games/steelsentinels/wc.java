/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String[][] field_g;
    static java.awt.Font field_f;
    static fm field_c;
    static int field_j;
    static wk[] field_d;
    static i field_i;
    static gh[] field_h;
    static vb field_e;
    static wk[] field_k;
    static String[] field_b;
    static boolean field_a;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (ub.field_e != null) {
              ob.field_q = 0;
              ji.field_j = param0.getX();
              hc.field_G = param0.getY();
              ce.field_w = true;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("wc.mouseMoved(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (null == ub.field_e) {
                break L1;
              } else {
                ob.field_q = 0;
                ji.field_j = param0.getX();
                hc.field_G = param0.getY();
                ce.field_w = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("wc.mouseDragged(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("wc.mouseClicked(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (ub.field_e != null) {
                L2: {
                  ob.field_q = 0;
                  wn.field_d = 0;
                  ce.field_w = true;
                  var2_int = param0.getModifiers();
                  if (-1 == (16 & var2_int ^ -1)) {
                    break L2;
                  } else {
                    rb.field_a = rb.field_a & -2;
                    break L2;
                  }
                }
                L3: {
                  if (-1 == (var2_int & 8 ^ -1)) {
                    break L3;
                  } else {
                    rb.field_a = rb.field_a & -3;
                    break L3;
                  }
                }
                if (-1 != (4 & var2_int ^ -1)) {
                  rb.field_a = rb.field_a & -5;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (!param0.isPopupTrigger()) {
              break L0;
            } else {
              param0.consume();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("wc.mouseReleased(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (null == ub.field_e) {
                break L1;
              } else {
                ob.field_q = 0;
                ji.field_j = param0.getX();
                hc.field_G = param0.getY();
                ce.field_w = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("wc.mouseEntered(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (null != ub.field_e) {
              ob.field_q = 0;
              ji.field_j = -1;
              hc.field_G = -1;
              ce.field_w = true;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("wc.mouseExited(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void a(mg param0, int param1) {
        try {
            if (param1 > -22) {
                field_f = (java.awt.Font) null;
            }
            qf.field_c.a(param0, 126);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "wc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (null != ub.field_e) {
                L2: {
                  ob.field_q = 0;
                  fg.field_Rb = param0.getX();
                  me.field_d = param0.getY();
                  if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                    ad.field_c = 2;
                    wn.field_d = 2;
                    break L2;
                  } else {
                    ad.field_c = 1;
                    wn.field_d = 1;
                    break L2;
                  }
                }
                L3: {
                  var2_int = param0.getModifiers();
                  if (-1 == (16 & var2_int ^ -1)) {
                    break L3;
                  } else {
                    rb.field_a = rb.field_a | 1;
                    break L3;
                  }
                }
                L4: {
                  if (-1 == (8 & var2_int ^ -1)) {
                    break L4;
                  } else {
                    rb.field_a = rb.field_a | 2;
                    break L4;
                  }
                }
                L5: {
                  if (-1 != (var2_int & 4 ^ -1)) {
                    rb.field_a = rb.field_a | 4;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ce.field_w = true;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var2);
            stackOut_17_1 = new StringBuilder().append("wc.mousePressed(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (ub.field_e != null) {
              wn.field_d = 0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("wc.focusLost(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void a(int param0, boolean param1, long param2, int param3, String param4, int param5) {
        int var7_int = 0;
        mm.field_g.a(param5, (byte) -117);
        if (param0 != 0) {
            return;
        }
        try {
            mm.field_g.field_p = mm.field_g.field_p + 1;
            var7_int = mm.field_g.field_p;
            mm.field_g.b(-28875, param2);
            mm.field_g.a(param4, -88);
            mm.field_g.a((byte) 115, param3);
            mm.field_g.a((byte) 115, !param1 ? 0 : 1);
            mm.field_g.b((byte) 83, -var7_int + mm.field_g.field_p);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "wc.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static void a(int param0) {
        hh.field_a = null;
        vc.field_f = null;
        te.field_f = null;
        cc.field_bc = null;
        jn.field_g = true;
        if (param0 != 23825) {
          return;
        } else {
          L0: {
            if (tj.field_f != null) {
              wh.field_e = sb.field_ab;
              vd.field_d = tj.field_f;
              vd.field_d.field_xb = -1;
              vd.field_d.field_rb = -1;
              tj.field_f = null;
              sb.field_ab = null;
              break L0;
            } else {
              break L0;
            }
          }
          qa.field_N = null;
          return;
        }
    }

    final static int a(byte param0, ie param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            if (-1 <= (param2 ^ -1)) {
              throw new IllegalArgumentException();
            } else {
              if (de.a(param2, (byte) -99)) {
                stackOut_6_0 = (int)((long)param2 * ((long)param1.c(param0 ^ 100) & 4294967295L) >> 631931936);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L1: {
                  if (param0 == -61) {
                    break L1;
                  } else {
                    field_c = (fm) null;
                    break L1;
                  }
                }
                var3_int = -2147483648 + -(int)(4294967296L % (long)param2);
                L2: while (true) {
                  var4 = param1.c(-111);
                  if (var3_int <= var4) {
                    continue L2;
                  } else {
                    stackOut_12_0 = uh.a(false, var4, param2);
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("wc.B(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_13_0;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          wc.a(-28);
          field_c = null;
          field_g = (String[][]) null;
          field_k = null;
          field_f = null;
          field_h = null;
          field_i = null;
          field_e = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_c = null;
          field_g = (String[][]) null;
          field_k = null;
          field_f = null;
          field_h = null;
          field_i = null;
          field_e = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    static {
        field_g = new String[][]{new String[]{"<h>Introduction"}, new String[]{"<top>Congratulations on joining the Sentinel Combat Division.<br><br>Battles are raging between giant armoured robots, known as sentinels. As a sentinel commander, you will learn to control a variety of sentinels with different armaments and abilities.<br>By learning the art of sentinel engineering, you can design new and better sentinels, combining the best features of other models, and incorporating new technology you have acquired.<br><br>Welcome to <col=1f76a6>Steel Sentinels</col>.", "<pic0>"}, new String[]{"<h>Basic Controls"}, new String[]{"<top><img=12> <img=13> <img=14> <img=15><br><col=1f76a6>Scroll around map</col><br><br><img=16><br><col=1f76a6>Centre camera on your sentinel</col><br><br><img=1> and <img=2><br><col=1f76a6>Switch weapons</col><br><br><img=3> and <img=5><br><col=1f76a6>Start sentinel movement</col><br><br><img=4><br><col=1f76a6>Halt sentinel movement</col>", "<top><img=6> left click<br><col=1f76a6>Fire selected weapon</col><br><br><img=10>+<img=6> or <img=7><br><col=1f76a6>Jump or thrust</col><br><br><img=11>+<img=6><br><col=1f76a6>Target enemy</col><br><br><img=0><br><col=1f76a6>Close-combat attack (if available)</col>"}, new String[]{"<h>Game-time Modes"}, new String[]{"Sentinels are usually sent to battle on alien planets and controlled remotely. Part of the skill of a sentinel commander is allowing for the time it takes for your instructions to be received and acted upon by your sentinel. The amount of time depends on the game-time mode."}, new String[]{"<col=1f76a6>Tactical mode</col><br>Each of your actions is delayed by two seconds before it takes place. This mode results in a more involved game of out-thinking your opponents and preparing for their every move."}, new String[]{"<col=1f76a6>Action mode</col><br>There is very little delay between your instructions being sent and your sentinel acting on them. This makes for fast, hectic gameplay, but it is only recommended for players with a fast internet connection."}, new String[]{"In tactical mode, each firing command you issue will appear in your weapon queue. This shows the different pending firing actions, moving rightwards as their execution approaches."}, new String[]{"<h>Movement"}, new String[]{"<img=3>  <col=1f76a6>Start moving left</col><br><br><img=5>  <col=1f76a6>Start moving right</col><br><br><img=4>  <col=1f76a6>Stop moving</col>"}, new String[]{"Sentinels continue moving in the direction they are told until their orders change."}, new String[]{"<pic3>", "<col=1f76a6>Jumping</col><br><img=10> + move mouse  <col=1f76a6>Show jumping trajectory</col><br><img=10> + <img=6>  <col=1f76a6>Jump</col><br>Alternatively:<br><img=7> + move mouse  <col=1f76a6>Show jumping trajectory</col><br>Release <img=7>  <col=1f76a6>Jump</col>"}, new String[]{"<pic4>", "<col=1f76a6>Thrusting</col><br>Use the jumping controls while in the air to thrust.<br>Thrusting uses up energy and can result in energy loss (see <col=1f76a6>ENERGY</col>)."}, new String[]{"Not every sentinel can jump or thrust. Your sentinel's abilities are shown in the 'Configuration' screen."}, new String[]{"<h>Shooting and Targeting"}, new String[]{"<img=6> left click  <col=1f76a6>Fire weapon</col><br><br><img=6> held down  <col=1f76a6>Continue firing the weapon at its optimum firing rate</col><br>"}, new String[]{"If you click to fire multiple times in rapid succession, you will fill your sentinel's action queue with firing actions, which may prevent you taking other actions."}, new String[]{"<br><img=1> and <img=2>  <col=1f76a6>Switch weapons</col>"}, new String[]{"You can also switch weapons by clicking on the icons at the base of the screen, or by pressing the number keys.<br> "}, new String[]{"<pic6>"}, new String[]{"<br><col=1f76a6>Targeting</col>"}, new String[]{"<br><img=11> +<img=6>  <col=1f76a6>Target the sentinel at your mouse pointer</col><br> "}, new String[]{"<pic5>", "Targeting requires the targeter module to be installed on your sentinel."}, new String[]{"<pic7>", "Red markers around a sentinel indicate your current target lock. While you have a target lock, missiles (but not rockets) will home in on your target. Also, direct fire weapons (guns and lasers) will fire directly at your target."}, new String[]{"A target lock only lasts for a brief time, and will be lost much more quickly if your enemy has the missile scrambler module.<br>Targeting a sentinel will also expend 1 unit of energy from your capacitors."}, new String[]{"<br><img=11> +<img=17>  <col=1f76a6>Drop target lock</col><br>(Alternatively, click on the LOCK icon in your HUD.)<br>Be careful of accidentally pressing <img=17> while trying to target.<br><rmbcancelonoff>"}, new String[]{"<col=1f76a6>Complete training mission 6 to be trained in targeting.</col>"}, new String[]{"<h>Energy"}, new String[]{"Your sentinel has a finite store of energy to use in battle, which recharges over<nbsp>time."}, new String[]{"The following actions deplete your energy:<br><col=1f76a6>Firing energy weapons</col> (such as lasers)<br><col=1f76a6>Mid-air thrusting</col><br><col=1f76a6>Getting a target lock</col>"}, new String[]{"Your sentinel will recharge its energy faster when it is stationary and not engaged in battle.<br>Equip reactor modules to recharge energy faster.<br>Equip capacitor modules to increase the capacity of your energy bank."}, new String[]{"<pic8>", "If an action causes your sentinel to use up all its remaining energy, it will shut down for a few seconds and emit steam.<br>During energy loss you cannot move, jump, or use any ability that requires energy.<br>Weapons that do not use energy can still be fired. While in an energy loss state your sentinel is very vulnerable to attack, so it is best avoided."}, new String[]{"Energy generation is affected by EMP weapons (see below)."}, new String[]{"<h>Damage Types"}, new String[]{"<pic9>", "<col=1f76a6>Kinetic Damage</col><br>Includes miniguns, rail guns and flak weapons. Kinetic damage is reduced if the recipient has the reinforced armour module."}, new String[]{"<pic10>", "<col=1f76a6>Explosive Damage</col><br>Includes shells, rockets and missiles. Explosive damage is reduced if the recipient has the reactive armour module. Indirect explosive damage can be absorbed by shields."}, new String[]{"<pic11>", "<col=1f76a6>Energy Damage</col><br>Includes lasers and plasma weapons. Energy damage is absorbed efficiently by shielding systems."}, new String[]{"<pic12>", "<col=1f76a6>EMP Damage</col><br>Weapons based on electromagnetic pulse (EMP) technology drain their target's shields and energy, and stop affected sentinels from charging their capacitors or recovering from energy loss.<br>The energy draining effects can be nullified by the EMP hardening module, though shields are still affected."}, new String[]{"The different classes of weapons and their effects are described in Appendix<nbsp>B."}, new String[]{"<h>Sentinel Configuration"}, new String[]{"Once you have unlocked some sentinels, you can use the 'Configuration' menu to select and customise the sentinel you want to take into battle. The steps involved in designing a sentinel are:<br>"}, new String[]{"<col=1f76a6>Select chassis</col><br>This gives you a standard model sentinel with that chassis."}, new String[]{"<col=1f76a6>Attach components</col><br>This typically means choosing the head, arms and shoulder."}, new String[]{"<col=1f76a6>Fit weapons</col><br>The number and size of weapons you can fit depends on the chassis and components you are using."}, new String[]{"<col=1f76a6>Equip modules</col><br>These affect the abilities of your sentinel, each in a different way.<br><br>The first time you enter the 'Configuration' screen, the <col=1f76a6>Config Training Program</col> will begin, to guide you through the processes of configuration and engineering. To repeat the training program, go to the 'Configuration' screen and press the <col=1f76a6>HELP</col> button at the bottom left of the screen."}, new String[]{"<h>Tech Value"}, new String[]{"Every chassis, component, weapon and module has a number associated with the cost of producing the technology that it uses. This  number is called the tech value. As you acquire better technology and equip it on your sentinel, the total tech value of your sentinel will increase, as shown in the tech value gauge on the 'Configuration' screen.<br> "}, new String[]{"<pic25>"}, new String[]{"<br>In any battle, destroying sentinels with a higher tech value is worth more to your score.<br>Sentinels over a certain tech value are classed as <col=1f76a6>advanced</col>. Advanced and standard sentinels will not typically participate in the same battles. <br>In the multiplayer lobby, you can select the <col=1f76a6>technology level</col> of the battles you want to participate in.<br><br><col=1f76a6>Basic</col><br>This only permits players using the default models of the Golem<shy>, Slave<shy> and Aquila-class sentinels."}, new String[]{"<col=1f76a6>Standard</col><br>This will not permit players with sentinels of an advanced tech value."}, new String[]{"<col=1f76a6>Advanced</col><br>This permits players using sentinels of any tech value.<br><br>If you choose to go into advanced tech level games, you have the opportunity to earn more solarite, but you will be facing players with all the most deadly technology."}, new String[]{"<h>Engineering"}, new String[]{"One way to acquire new technology is to expend <col=1f76a6>solarite</col> on engineering. Solarite can be earned in multiplayer games, particularly Rated games. In each tab of the 'Configuration' screen there is a list of engineered items followed by a list of items that you have not yet engineered. More items appear on this list as you advance in technology.<br> "}, new String[]{"<pic22>", "Any item that has a green engineer button is something you can engineer right away by clicking on the button. Once the item has been engineered, you can add it to any sentinel with a suitable slot."}, new String[]{" <br>On the chassis tab, point your mouse at an engineer button to see the list of default items on that sentinel. When you have unlocked every item in that list, the new chassis will be unlocked as well."}, new String[]{"Many items can be unlocked by completing training and campaign missions."}, new String[]{"<h>Gameplay Modes"}, new String[]{"<col=1f76a6>BATTLEFIELDS</col><br>There are several nearby planets where sentinels vie for supremacy. Each battlefield has its own environment that affects the battle."}, new String[]{"<top><col=1f76a6>War Zone</col><br>A ruined landscape with rocks and caves. Every other sentinel here is your enemy. You should also watch out for automated combat drones drawn by the sound of battle."}, new String[]{"<top><col=1f76a6>Lost World</col><br>Your team struggle against opposing forces on a barren world while star cruisers battle in orbit. It can only be a matter of time before the battle in space reaches the surface."}, new String[]{"<top><col=1f76a6>City</col><br>Among the ruins of a once mighty metropolis there is a valuable piece of technology to retrieve. Destroy whoever has it, steal it for yourself and earn points all the time you hold on to it."}, new String[]{"<top><col=1f76a6>Moon</col><br>A crashed cruiser occupies this world. Its still-working shields block energy weapons. Earn points for occupying the shields."}, new String[]{"<top><col=1f76a6>Star Fleet</col><br>Two teams battle in orbit on giant star cruisers. If you can reach the enemy cruiser and return safely, your ship will be able to charge its enormo-laser. Make sure someone is on your ship to defend it against invaders."}, new String[]{"<col=1f76a6>CAMPAIGNS</col><br>To advance in rank and help your people develop new technology fast, there are numerous missions you can undertake. Each one gives you a specific sentinel design and sends you out to defeat the enemies' forces.<br>The first ten are <col=1f76a6>training missions</col>. Progressing through these unlocks the three basic models of sentinel in common use.<br>Further missions are available on the <col=1f76a6>Campaigns</col> screen. These give you access to more technology as you complete them. In these missions you will have a limited number of respawns, which will test your skills as a sentinel commander."}, new String[]{"<col=1f76a6>CO-OP</col>"}, new String[]{"<pic19>"}, new String[]{"You and an ally go to war against waves of enemies.<br>You and your ally start with a limited number of sentinel respawns, which are used up when either of your sentinels is destroyed. Gaining enough points earns you extra respawns. Any damage you inflict on your ally will reduce your score."}, new String[]{"<col=1f76a6>TAGS</col><br>At the end of a multiplayer game, you may be awarded one or more 'tags'. Tags are awarded for success in a number of categories, such as 'Most Kills' or 'Most Damage'. The numbers of tags you have acquired in Rated games are shown at the sides of the Achievements screen."}, new String[]{"<h>Appendix A: History"}, new String[]{"In the year 4200, a scout ship of the Terran fleet reported on the presence of intense solaris energy reserves in the Ilolian star system. If correctly tapped, the solarite production could topple the galactic economy. News of the discovery was suppressed, but, soon, multiple mining organisations rushed to the system.<br>40 years on, the battle still rages for control of the system. Sentinel pilots from all sectors of the galaxy now come to the Ilolian system for glory and fortune. Alliances are only ever temporary, as the drive for solarite thunders forwards."}, new String[]{"<h>Appendix B: Weapon<nbsp>Classes"}, new String[]{"Different weapons are based on different technology and have widely differing effects. "}, new String[]{"<pic104>", "<col=1f76a6>Close assault guns</col><br>Non energy-based weapons that inflict kinetic damage. These have a limited range.", "<pic105>", "<col=1f76a6>Flak cannons</col><br>Defensive weapons used to detonate rockets and missiles in the air. Flak inflicts kinetic damage."}, new String[]{"<pic106>", "<col=1f76a6>Explosive cannons</col><br>Non energy-based weapons that launch shells that inflict explosive damage.", "<pic107>", "<col=1f76a6>Rifled cannons</col><br>Long-range, non energy-based guns that inflict explosive damage. They are particularly effective at long range."}, new String[]{"<pic108>", "<col=1f76a6>Artillery</col><br>Explosive ballistic weapons that are only armed after going some distance. Less effective at short range.", "<pic123>", "<col=1f76a6>Bombs</col><br>These fall on your enemies, inflicting explosive damage."}, new String[]{"<pic109>", "<col=1f76a6>Energised kinetic weapons</col><br>High-speed weapons that use energy in firing and inflict kinetic damage.", "<pic110>", "<col=1f76a6>Laser weapons</col><br>Lasers use up energy and inflict energy damage on their target."}, new String[]{"<pic111>", "<col=1f76a6>Super laser weapons</col><br>Super lasers use up a lot of energy to inflict extreme energy damage.", "<pic112>", "<col=1f76a6>Plasma weapons</col><br>Energy-based weapons that spray ionised gas, inflicting energy damage."}, new String[]{"<pic113>", "<col=1f76a6>EMP weapons</col><br>These weapons deplete shields, and drain the energy of any targets that do not possess the EMP hardening module.", "<pic114>", "<col=1f76a6>Rapier missiles</col><br>Basic air disruption missiles that inflict explosive damage."}, new String[]{"<pic115>", "<col=1f76a6>Air death missiles</col><br>Powerful missiles that make aerial combat hard to maintain.", "<pic116>", "<col=1f76a6>Piercer rockets</col><br>Basic, long-range rockets that inflict explosive damage."}, new String[]{"<pic117>", "<col=1f76a6>EMP rockets</col><br>An EMP attack delivered by rocket.", "<pic118>", "<col=1f76a6>Airburst rockets</col><br>Rockets that explode in the sky, filling the air with disruptive shrapnel."}, new String[]{"<pic119>", "<col=1f76a6>Multirockets</col><br>Long-range rockets that explode into multiple warheads.", "<pic120>", "<col=1f76a6>Heavy rockets</col><br>High-powered rockets that fire over a long distance and deliver explosive damage over a wide radius."}, new String[]{"<pic121>", "<col=1f76a6>Destructor rockets</col><br>Extremely powerful rockets, capable of destroying anything in their path."}, new String[]{"<br>Be aware that weapon classes are distinct from weapon sizes.<br>A weapon size can be <col=1f76a6>light</col>, <col=1f76a6>heavy</col>, <col=1f76a6>ordnance</col>, while rockets and missiles may be categorised as <col=1f76a6>rocket</col> or <col=1f76a6>large rocket</col> size.<br>A weapon can only be equipped in a slot of the appropriate size."}, new String[]{"For instance, in the <col=ffff80>plasma</col> weapon class:<br>The <col=1f76a6>light</col> plasma weapon is the <col=ffff80>plasma spray</col>,<br>the <col=1f76a6>heavy</col> plasma weapon is the <col=ffff80>plasma cannon</col>,<br>and the <col=1f76a6>ordnance</col> plasma weapon is the <col=ffff80>fusion cannon</col>.<br>These weapons are similar in effect, but they differ in power, range and tech value."}, new String[]{"<h>Appendix C: Power<shy>ups"}, new String[]{"During combat you may encounter technology that you can immediately scavenge and put to work. Such technology may deteriorate after a brief time, or may only function once, but it can give your sentinel a short-term advantage in battle."}, new String[]{"These <col=1f76a6>power-ups</col> are usually modules from other destroyed sentinels, but some are rare pieces of technology that yield powers not available in modules. Some are activated immediately they are picked up, and some can be held for a fixed duration. A sentinel can only hold one power-up at a time."}, new String[]{"<pic234>", "<col=1f76a6>Hyper reloader</col><br>Allows your sentinel to reload small rockets and missiles with hardly any delay.", "<pic235>", "<col=1f76a6>Health plus</col><br>Increases your sentinel's maximum health and instantly repairs any damage your sentinel sustained prior to getting the power-up."}, new String[]{"<pic236>", "<col=1f76a6>Infinite energy</col><br>Continuously replenishes your sentinel's energy, giving you a limitless resource until the power-up expires.", "<pic237>", "<col=1f76a6>Impervious</col><br>Protects your sentinel from harm and keeps it at maximum health until the power-up expires."}, new String[]{"<pic238>", "<col=1f76a6>Speed</col><br>Enables your sentinel to move very quickly along the ground.", "<pic239>", "<col=1f76a6>Quadra plating</col><br>Gives your sentinel the benefit of reactive armour, reinforced armour, EMP hardening and energised armour."}, new String[]{"<pic240>", "<col=1f76a6>Quadra damage</col><br>Makes all of your weapons four times as powerful.", "<pic241>", "<col=1f76a6>EMP weapons</col><br>Adds an EMP effect to all your weapons."}, new String[]{"<pic243>", "<col=1f76a6>Rocket strike</col><br>Sends out an immediate signal to a ship in orbit, which bombards the battlefield with heavy rockets.", "<pic242>", "<col=1f76a6>MGFN</col><br>You earn points all the time you are holding this valuable technology, but lose the technology when your sentinel is destroyed."}, new String[]{"<pic244>", "<col=1f76a6>1-Up</col><br>Gives your sentinel an extra chance to respawn."}};
        field_c = new fm(7, 0, 1, 1);
        field_i = new i();
        field_h = new gh[4];
        field_e = new vb();
        field_b = new String[]{"By rating", "By win percentage"};
        field_a = false;
    }
}
