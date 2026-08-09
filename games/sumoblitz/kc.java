/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class kc extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_d;
    static int field_l;
    static float[] field_e;
    public static boolean field_o;
    public static boolean field_p;
    public static boolean field_k;
    public static boolean field_m;
    public static int field_h;
    public static int field_i;
    public static boolean field_b;
    public static boolean field_a;
    public static boolean field_g;
    public static boolean field_f;
    public static int field_j;
    public static int field_c;
    public static int field_n;

    public static void b(byte param0) {
        try {
            field_e = null;
            if (param0 != -19) {
                field_l = -112;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "kc.B(" + param0 + ')');
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ck.field_c == null) {
              L1: {
                if (qj.field_c == null) {
                  break L1;
                } else {
                  if (this == qj.field_c) {
                    break L1;
                  } else {
                    stackIn_8_0 = qj.field_c.getParameter(param0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_10_0 = super.getParameter(param0);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("kc.getParameter(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            qj.field_c = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kc.provideLoaderApplet(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ck.field_c != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (qj.field_c == null) {
                  break L1;
                } else {
                  if (qj.field_c == this) {
                    break L1;
                  } else {
                    stackIn_10_0 = qj.field_c.getAppletContext();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_12_0 = super.getAppletContext();
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "kc.getAppletContext()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.applet.AppletContext) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    abstract void b(int param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    private final void a(boolean param0, int param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        int var3_int = 0;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        Throwable var3_ref2 = null;
        try {
          L0: {
            var3_ref = this;
            synchronized (var3_ref) {
              L1: {
                if (!gr.field_e) {
                  gr.field_e = true;
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (null != qj.field_c) {
                qj.field_c.destroy();
                break L2;
              } else {
                break L2;
              }
            }
            try {
              L3: {
                this.g(-15254);
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
            L5: {
              if (null == qn.field_f) {
                break L5;
              } else {
                try {
                  L6: {
                    qn.field_f.removeFocusListener((java.awt.event.FocusListener) (this));
                    qn.field_f.getParent().remove((java.awt.Component) ((Object) qn.field_f));
                    break L6;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L7: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    break L7;
                  }
                }
                break L5;
              }
            }
            L8: {
              if (lt.field_m != null) {
                try {
                  L9: {
                    lt.field_m.a(false);
                    break L9;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L10: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    break L10;
                  }
                }
                break L8;
              } else {
                break L8;
              }
            }
            L11: {
              this.a(true);
              if (ck.field_c != null) {
                try {
                  L12: {
                    System.exit(0);
                    break L12;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L13: {
                    var3_ref2 = decompiledCaughtException;
                    break L13;
                  }
                }
                break L11;
              } else {
                break L11;
              }
            }
            var3_int = 34 / ((param1 - 14) / 33);
            System.out.println("Shutdown complete - clean:" + param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw qo.a((Throwable) ((Object) runtimeException), "kc.N(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void f(int param0);

    final static void j(int param0) {
        rl var1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        try {
          L0: {
            L1: {
              if (param0 >= 40) {
                break L1;
              } else {
                kc.provideLoaderApplet((java.applet.Applet) null);
                break L1;
              }
            }
            L2: {
              var1 = (rl) ((Object) ko.field_m.b((byte) -127));
              if (var1 == null) {
                var1 = new rl();
                break L2;
              } else {
                break L2;
              }
            }
            var1.a(lk.field_b, lk.field_c, lk.field_a, lk.field_j, (byte) -94, lk.field_i, lk.field_k, lk.field_e);
            te.field_g.a((ms) (var1), (byte) 39);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1_ref), "kc.M(" + param0 + ')');
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (ke.field_a != this) {
                break L1;
              } else {
                if (!gr.field_e) {
                  L2: {
                    pt.field_a = true;
                    if (!om.field_l) {
                      break L2;
                    } else {
                      if (-bt.field_f + wq.a(-97) <= 1000L) {
                        break L2;
                      } else {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (null == var2) {
                            break L3;
                          } else {
                            if (var2.width < vs.field_b) {
                              break L2;
                            } else {
                              if (var2.height >= lw.field_b) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        aj.field_A = true;
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2_ref);

            stackIn_21_1 = new StringBuilder().append("kc.paint(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ue.field_o = true;
            pt.field_a = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kc.focusGained(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final boolean i(int param0) {
        return true;
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (ck.field_c != null) {
          return null;
        } else {
          L0: {
            if (null == qj.field_c) {
              break L0;
            } else {
              if (this == qj.field_c) {
                break L0;
              } else {
                return qj.field_c.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ue.field_o = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kc.focusLost(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, String param5, int param6) {
        try {
            wi dupTemp$0 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            String stackIn_26_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            jr var8 = null;
            Throwable var8_ref = null;
            RuntimeException var8_ref2 = null;
            int var9 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Sumoblitz.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (ke.field_a != null) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ps.field_a = ps.field_a + 1;
                            if (-4 >= (ps.field_a ^ -1)) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            this.a("alreadyloaded", 21253);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return;
                    }
                    case 9: {
                        try {
                            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        try {
                            if (param2 == 44) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return;
                    }
                    case 13: {
                        try {
                            ke.field_a = (kc) (this);
                            th.field_H = 0;
                            mu.field_s = param4;
                            gi.field_h = param3;
                            vs.field_b = param3;
                            si.field_c = 0;
                            wq.field_b = param1;
                            lw.field_b = param1;
                            ct.field_z = ra.c(2);
                            dupTemp$0 = new wi(param0, param5, param6, true);
                            lt.field_m = dupTemp$0;
                            gk.field_O = dupTemp$0;
                            var8 = lt.field_m.a(true, (Runnable) (this), 1);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if ((var8.field_c ^ -1) != -1) {
                                statePc = 19;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            tg.a(10L, (byte) 73);
                            if (var9 != 0) {
                                statePc = 27;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var9 == 0) {
                                statePc = 14;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var8_ref = caughtException;
                            ms.a((String) null, var8_ref, 0);
                            this.a("crash", 21253);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        var8_ref2 = (RuntimeException) ((Object) caughtException);
                        stackIn_25_0 = (RuntimeException) (var8_ref2);
                        stackIn_23_0 = stackIn_25_0;
                        stackIn_25_1 = new StringBuilder().append("kc.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                        stackIn_23_1 = stackIn_25_1;
                        if (param5 == null) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        stackIn_26_0 = (RuntimeException) ((Object) stackIn_23_0);
                        stackIn_26_1 = (StringBuilder) ((Object) stackIn_23_1);
                        stackIn_26_2 = "{...}";
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 25: {
                        stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                        stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                        stackIn_26_2 = "null";
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 26: {
                        throw qo.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param6 + ')');
                    }
                    case 27: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != ck.field_c) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (qj.field_c == null) {
                  break L1;
                } else {
                  if (qj.field_c == this) {
                    break L1;
                  } else {
                    stackIn_10_0 = qj.field_c.getDocumentBase();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_12_0 = super.getDocumentBase();
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "kc.getDocumentBase()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.net.URL) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != ke.field_a) {
                break L1;
              } else {
                if (gr.field_e) {
                  break L1;
                } else {
                  fd.field_k = 4000L + wq.a(-46);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) runtimeException), "kc.stop()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void h(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = wq.a(-126);
              var4 = gd.field_k[ql.field_B];
              gd.field_k[ql.field_B] = var2_long;
              if (var4 == (long)param0) {
                break L1;
              } else {
                if (var4 >= var2_long) {
                  break L1;
                } else {
                  var6_int = (int)(var2_long - var4);
                  aj.field_B = (32000 - -(var6_int >> 636757665)) / var6_int;
                  break L1;
                }
              }
            }
            L2: {
              ql.field_B = 1 + ql.field_B & 31;
              fieldTemp$1 = rb.field_b;
              rb.field_b = rb.field_b + 1;
              if (-51 <= (fieldTemp$1 ^ -1)) {
                break L2;
              } else {
                L3: {
                  rb.field_b = rb.field_b - 50;
                  pt.field_a = true;
                  qn.field_f.setSize(gi.field_h, wq.field_b);
                  qn.field_f.setVisible(true);
                  if (null == ck.field_c) {
                    break L3;
                  } else {
                    if (null != of.field_n) {
                      break L3;
                    } else {
                      var6 = ck.field_c.getInsets();
                      qn.field_f.setLocation(var6.left + th.field_H, var6.top + si.field_c);
                      if (!Sumoblitz.field_L) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                qn.field_f.setLocation(th.field_H, si.field_c);
                break L2;
              }
            }
            this.d(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) runtimeException), "kc.A(" + param0 + ')');
        }
    }

    abstract void d(int param0);

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          L0: {
            L1: {
              var2_long = wq.a(-66);
              var4 = fa.field_a[ka.field_b];
              fa.field_a[ka.field_b] = var2_long;
              ka.field_b = ka.field_b + 1 & 31;
              if (var4 == 0L) {
                break L1;
              } else {
                if ((var4 ^ -1L) <= (var2_long ^ -1L)) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var6 = this;
            synchronized (var6) {
              L2: {
                L3: {
                  if (param0 >= 95) {
                    break L3;
                  } else {
                    field_e = (float[]) null;
                    break L3;
                  }
                }
                ii.field_a = ue.field_o;
                break L2;
              }
            }
            this.b(-64);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw qo.a((Throwable) ((Object) runtimeException), "kc.J(" + param0 + ')');
        }
    }

    abstract void g(int param0);

    public final void destroy() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (ke.field_a != this) {
                break L1;
              } else {
                if (gr.field_e) {
                  break L1;
                } else {
                  fd.field_k = wq.a(-125);
                  tg.a(5000L, (byte) 119);
                  gk.field_O = null;
                  this.a(false, -32);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) runtimeException), "kc.destroy()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void update(java.awt.Graphics param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kc.update(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (ke.field_a != this) {
                break L1;
              } else {
                if (gr.field_e) {
                  break L1;
                } else {
                  fd.field_k = 0L;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) runtimeException), "kc.start()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized void e(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (qn.field_f == null) {
                break L1;
              } else {
                qn.field_f.removeFocusListener((java.awt.event.FocusListener) (this));
                qn.field_f.getParent().setBackground(java.awt.Color.black);
                qn.field_f.getParent().remove((java.awt.Component) ((Object) qn.field_f));
                break L1;
              }
            }
            L2: {
              L3: {
                if (null != of.field_n) {
                  break L3;
                } else {
                  L4: {
                    if (ck.field_c != null) {
                      break L4;
                    } else {
                      L5: {
                        if (null == qj.field_c) {
                          break L5;
                        } else {
                          var2 = qj.field_c;
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2 = ke.field_a;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2 = ck.field_c;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = of.field_n;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
                qn.field_f = (java.awt.Canvas) ((Object) new wo((java.awt.Component) (this)));
                ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) qn.field_f));
                qn.field_f.setSize(gi.field_h, wq.field_b);
                qn.field_f.setVisible(true);
                if (ck.field_c == var2) {
                  break L7;
                } else {
                  qn.field_f.setLocation(th.field_H, si.field_c);
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              var3 = ck.field_c.getInsets();
              qn.field_f.setLocation(var3.left + th.field_H, var3.top + si.field_c);
              break L6;
            }
            qn.field_f.addFocusListener((java.awt.event.FocusListener) (this));
            qn.field_f.requestFocus();
            ii.field_a = true;
            ue.field_o = true;
            pt.field_a = true;
            if (param0 == 1000) {
              aj.field_A = false;
              bt.field_f = wq.a(param0 ^ -912);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (var2), "kc.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void windowClosing(java.awt.event.WindowEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kc.windowClosing(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static byte[] c(int param0) {
        fs var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_16_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == -5204) {
              var1 = new fs(30000);
              var1.b((byte) 117, 3);
              var1.b((byte) 90, bl.field_e);
              var1.b((byte) 46, ki.field_f);
              var1.b((byte) 39, iv.field_i);
              var1.b((byte) 52, hc.field_f);
              var2 = 0;
              L1: while (true) {
                L2: {
                  if (36 <= var2) {
                    break L2;
                  } else {
                    L3: {
                      if (var2 >= 25) {
                        break L3;
                      } else {
                        L4: {
                          var1.d(go.field_j[var2], 112);
                          var1.b(-58, ql.field_z[var2]);
                          var3 = ql.field_A[var2] - -1;
                          if (!qn.field_d[var2]) {
                            break L4;
                          } else {
                            var3 = var3 | 128;
                            break L4;
                          }
                        }
                        L5: {
                          if (up.field_g[var2]) {
                            var3 = var3 | 64;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var1.b((byte) 105, var3);
                        break L3;
                      }
                    }
                    var2++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_16_0 = var1.d((byte) 120);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1_ref), "kc.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_16_0;
        }
    }

    public abstract void init();

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final void a(String param0, int param1) {
        try {
            Throwable throwable = null;
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (!this.field_d) {
                  this.field_d = true;
                  System.out.println("error_game_" + param0);
                  try {
                    L1: {
                      tw.a(ra.c(2), param1 ^ -21354, "loggedout");
                      break L1;
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L2: {
                      throwable = decompiledCaughtException;
                      break L2;
                    }
                  }
                  try {
                    L3: {
                      this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      exception = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  L5: {
                    if (param1 == 21253) {
                      break L5;
                    } else {
                      field_l = -65;
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L6: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (runtimeException);

                stackIn_16_1 = new StringBuilder().append("kc.K(");

                if (param0 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L6;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L6;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    protected kc() {
        this.field_d = false;
    }

    public final void run() {
        try {
            boolean stackIn_50_0 = false;
            boolean stackIn_68_0 = false;
            int stackIn_73_0 = 0;
            int stackIn_73_1 = 0;
            int stackIn_84_0 = 0;
            int stackIn_84_1 = 0;
            int stackIn_100_0 = 0;
            int stackIn_105_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            Object var1 = null;
            int var1_int = 0;
            String var2 = null;
            int var2_int = 0;
            java.lang.reflect.Method var2_ref = null;
            int var3 = 0;
            Throwable var3_ref_Throwable = null;
            String var4 = null;
            int var5 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Sumoblitz.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (wi.field_u == null) {
                                statePc = 63;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var1 = wi.field_u.toLowerCase();
                            if (-1 != ((String) (var1)).indexOf("sun")) {
                                statePc = 8;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (-1 != ((String) (var1)).indexOf("apple")) {
                                statePc = 8;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var2 = wi.field_q;
                            if (var2.equals("1.1")) {
                                statePc = 41;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (var2.startsWith("1.1.")) {
                                statePc = 41;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (var2.equals("1.2")) {
                                statePc = 41;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var2.startsWith("1.2.")) {
                                statePc = 41;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var2.equals("1.3")) {
                                statePc = 41;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var2.startsWith("1.3.")) {
                                statePc = 41;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var2.equals("1.4")) {
                                statePc = 41;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (var2.startsWith("1.4.")) {
                                statePc = 41;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var2.equals("1.5")) {
                                statePc = 41;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var2.startsWith("1.5.")) {
                                statePc = 41;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var2.equals("1.6.0")) {
                                statePc = 41;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            this.a("wrongjava", 21253);
                            if (var5 == 0) {
                                statePc = 113;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var2.startsWith("1.6.0_")) {
                                statePc = 47;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var3 = 6;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var3 >= var2.length()) {
                                statePc = 56;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            stackIn_68_0 = ea.a((byte) -54, var2.charAt(var3));
                            stackIn_50_0 = stackIn_68_0;
                            if (var5 != 0) {
                                statePc = 68;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (!stackIn_50_0) {
                                statePc = 56;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var3++;
                            if (var5 == 0) {
                                statePc = 48;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var4 = var2.substring(6, var3);
                            if (!jf.a(-13181, (CharSequence) ((Object) var4))) {
                                statePc = 63;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (10 > no.a((byte) -128, (CharSequence) ((Object) var4))) {
                                statePc = 62;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            this.a("wrongjava", 21253);
                            if (var5 == 0) {
                                statePc = 113;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (null == wi.field_q) {
                                statePc = 87;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            stackIn_68_0 = wi.field_q.startsWith("1.");
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (stackIn_68_0) {
                                statePc = 70;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var1_int = 2;
                            var2_int = 0;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if ((var1_int ^ -1) <= (wi.field_q.length() ^ -1)) {
                                statePc = 83;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var3 = wi.field_q.charAt(var1_int);
                            stackIn_84_0 = 48;
                            stackIn_73_0 = stackIn_84_0;
                            stackIn_84_1 = var3;
                            stackIn_73_1 = stackIn_84_1;
                            if (var5 != 0) {
                                statePc = 84;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (stackIn_73_0 > stackIn_73_1) {
                                statePc = 83;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if ((var3 ^ -1) >= -58) {
                                statePc = 82;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (var5 == 0) {
                                statePc = 83;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            var2_int = var3 - (48 - 10 * var2_int);
                            var1_int++;
                            if (var5 == 0) {
                                statePc = 71;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            stackIn_84_0 = -6;
                            stackIn_84_1 = var2_int ^ -1;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            if (stackIn_84_0 >= stackIn_84_1) {
                                statePc = 86;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            om.field_l = true;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var1 = ke.field_a;
                            if (qj.field_c != null) {
                                statePc = 90;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var1 = qj.field_c;
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            var2_ref = wi.field_e;
                            if (null != var2_ref) {
                                statePc = 94;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 96;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            var3_ref_Throwable = caughtException;
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            gk.b(true);
                            this.e(1000);
                            m.field_R = sd.a(wq.field_b, gi.field_h, 0, (java.awt.Component) ((Object) qn.field_f));
                            this.f(28196);
                            jl.field_a = bt.a(false);
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            if ((fd.field_k ^ -1L) == -1L) {
                                statePc = 103;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            stackIn_105_0 = ((wq.a(-122) ^ -1L) < (fd.field_k ^ -1L) ? -1 : ((wq.a(-122) ^ -1L) == (fd.field_k ^ -1L) ? 0 : 1));
                            stackIn_100_0 = stackIn_105_0;
                            if (var5 != 0) {
                                statePc = 105;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if (stackIn_100_0 <= 0) {
                                statePc = 113;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            vt.field_t = jl.field_a.b(4007, pj.field_p);
                            stackIn_105_0 = 0;
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            var3 = stackIn_105_0;
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            if (vt.field_t <= var3) {
                                statePc = 111;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            this.a((byte) 101);
                            var3++;
                            if (var5 != 0) {
                                statePc = 112;
                            } else {
                                statePc = 108;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            if (var5 == 0) {
                                statePc = 106;
                            } else {
                                statePc = 109;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            this.h(0);
                            rd.a(qn.field_f, lt.field_m, -11030);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            if (var5 == 0) {
                                statePc = 98;
                            } else {
                                statePc = 113;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = 117;
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            var1 = caughtException;
                            ms.a((String) null, (Throwable) (var1), 0);
                            this.a("crash", 21253);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = 117;
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        try {
                            this.a(true, -99);
                            statePc = 118;
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = 117;
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        var1 = caughtException;
                        throw qo.a((Throwable) (var1), "kc.run()");
                    }
                    case 118: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var1_int = -117 / ((param0 - -43) / 61);
              if (vm.field_c != ad.field_p) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "kc.O(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    abstract void a(boolean param0);

    static {
        field_e = new float[4];
    }
}
