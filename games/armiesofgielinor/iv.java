/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;
import java.applet.AppletContext;

public abstract class iv extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static fl field_b;
    static String field_a;
    static String field_m;
    static int[][] field_e;
    static String field_c;
    boolean field_i;
    public static boolean field_k;
    public static boolean field_g;
    public static int field_f;
    public static int field_d;
    public static int field_j;
    public static int field_l;
    public static boolean field_h;

    public abstract void init();

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_9_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (g.field_f == null) {
              L1: {
                if (la.field_g == null) {
                  break L1;
                } else {
                  if (this == (Object) (Object) la.field_g) {
                    break L1;
                  } else {
                    stackOut_7_0 = la.field_g.getParameter(param0);
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
              stackOut_9_0 = super.getParameter(param0);
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("iv.getParameter(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0;
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) lr.field_a) {
                break L1;
              } else {
                if (rh.field_c) {
                  break L1;
                } else {
                  L2: {
                    ol.field_z = true;
                    if (!se.field_c) {
                      break L2;
                    } else {
                      if (-ns.field_P + vi.b(62) <= 1000L) {
                        break L2;
                      } else {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (null == var2) {
                            break L3;
                          } else {
                            if (~ce.field_N < ~var2.width) {
                              break L2;
                            } else {
                              if (~dm.field_D >= ~var2.height) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        tq.field_a = true;
                        break L2;
                      }
                    }
                  }
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2_ref;
            stackOut_22_1 = new StringBuilder().append("iv.paint(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) lr.field_a != this) {
                break L1;
              } else {
                if (rh.field_c) {
                  break L1;
                } else {
                  mn.field_s = vi.b(-46);
                  nu.a(5000L, 0);
                  vh.field_s = null;
                  this.a(false, -1251);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "iv.destroy()");
        }
    }

    public final void update(java.awt.Graphics param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((iv) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("iv.update(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            la.field_g = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("iv.provideLoaderApplet(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) lr.field_a != this) {
                break L1;
              } else {
                if (!rh.field_c) {
                  mn.field_s = 4000L + vi.b(-62);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "iv.stop()");
        }
    }

    final boolean e(int param0) {
        return true;
    }

    final void a(int param0, int param1, String param2, int param3, int param4, int param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            wo var8_ref2 = null;
            int var9 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            String stackIn_26_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            var9 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              try {
                L0: {
                  if (lr.field_a != null) {
                    gs.field_b = gs.field_b + 1;
                    if (gs.field_b >= 3) {
                      ((iv) this).a("alreadyloaded", (byte) -85);
                      return;
                    } else {
                      ((iv) this).getAppletContext().showDocument(((iv) this).getDocumentBase(), "_self");
                      return;
                    }
                  } else {
                    mh.field_c = 0;
                    bn.field_b = param0;
                    ce.field_N = param0;
                    sp.field_b = 0;
                    hw.field_B = param4;
                    dt.field_a = param6;
                    dm.field_D = param6;
                    lr.field_a = (iv) this;
                    if (param3 == 10) {
                      vu.field_L = ag.d((byte) 10);
                      hd dupTemp$1 = new hd(param1, param2, param5, true);
                      ft.field_m = dupTemp$1;
                      vh.field_s = dupTemp$1;
                      var8_ref2 = ft.field_m.a(1, 0, (Runnable) this);
                      L1: while (true) {
                        L2: {
                          L3: {
                            if (var8_ref2.field_g != 0) {
                              break L3;
                            } else {
                              nu.a(10L, param3 ^ 10);
                              if (var9 != 0) {
                                break L2;
                              } else {
                                if (var9 == 0) {
                                  continue L1;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                          break L2;
                        }
                        break L0;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  var8 = decompiledCaughtException;
                  af.a(var8, param3 + -118, (String) null);
                  ((iv) this).a("crash", (byte) -62);
                  break L4;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_22_0 = (RuntimeException) var8_ref;
                stackOut_22_1 = new StringBuilder().append("iv.AB(").append(param0).append(',').append(param1).append(',');
                stackIn_25_0 = stackOut_22_0;
                stackIn_25_1 = stackOut_22_1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                if (param2 == null) {
                  stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                  stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                  stackOut_25_2 = "null";
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  stackIn_26_2 = stackOut_25_2;
                  break L5;
                } else {
                  stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                  stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                  stackOut_23_2 = "{...}";
                  stackIn_26_0 = stackOut_23_0;
                  stackIn_26_1 = stackOut_23_1;
                  stackIn_26_2 = stackOut_23_2;
                  break L5;
                }
              }
              throw ig.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b() {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        Object var6 = null;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = vi.b(120);
              var4 = om.field_r[os.field_o];
              om.field_r[os.field_o] = var2_long;
              if (0L == var4) {
                break L1;
              } else {
                if (~var4 <= ~var2_long) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            os.field_o = 1 + os.field_o & 31;
            var6 = this;
            synchronized (var6) {
              L2: {
                ph.field_f = wj.field_l;
                break L2;
              }
            }
            ((iv) this).a((byte) -120);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "iv.WA(" + 17684 + ')');
        }
    }

    abstract void b(byte param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    final void a(String param0, byte param1) {
        try {
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            try {
              L0: {
                if (!((iv) this).field_i) {
                  ((iv) this).field_i = true;
                  System.out.println("error_game_" + param0);
                  try {
                    L1: {
                      Object discarded$1 = lj.a("loggedout", (byte) -121, ag.d((byte) -123));
                      break L1;
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L2: {
                      var3 = decompiledCaughtException;
                      break L2;
                    }
                  }
                  try {
                    L3: {
                      if (param1 < -35) {
                        ((iv) this).getAppletContext().showDocument(new java.net.URL(((iv) this).getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
                        break L3;
                      } else {
                        return;
                      }
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var3_ref = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_12_0 = (RuntimeException) var3_ref2;
                stackOut_12_1 = new StringBuilder().append("iv.TA(");
                stackIn_15_0 = stackOut_12_0;
                stackIn_15_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param0 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L5;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_16_1 = stackOut_13_1;
                  stackIn_16_2 = stackOut_13_2;
                  break L5;
                }
              }
              throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(boolean param0);

    private final void a(boolean param0, int param1) {
        Object var3 = null;
        Exception var3_ref = null;
        Throwable var3_ref2 = null;
        RuntimeException var3_ref3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3 = this;
            synchronized (var3) {
              L1: {
                if (rh.field_c) {
                  return;
                } else {
                  rh.field_c = true;
                  break L1;
                }
              }
            }
            L2: {
              if (la.field_g == null) {
                break L2;
              } else {
                la.field_g.destroy();
                break L2;
              }
            }
            try {
              L3: {
                ((iv) this).b((byte) 103);
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var3_ref = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
            L5: {
              if (null == si.field_b) {
                break L5;
              } else {
                try {
                  L6: {
                    si.field_b.removeFocusListener((java.awt.event.FocusListener) this);
                    si.field_b.getParent().remove((java.awt.Component) (Object) si.field_b);
                    break L6;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L7: {
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    break L7;
                  }
                }
                break L5;
              }
            }
            L8: {
              if (null == ft.field_m) {
                break L8;
              } else {
                try {
                  L9: {
                    ft.field_m.a(true);
                    break L9;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L10: {
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    break L10;
                  }
                }
                break L8;
              }
            }
            L11: {
              ((iv) this).d((byte) -72);
              if (null == g.field_f) {
                break L11;
              } else {
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
              }
            }
            System.out.println("Shutdown complete - clean:" + param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          var3_ref3 = (RuntimeException) (Object) decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3_ref3, "iv.CB(" + param0 + ',' + -1251 + ')');
        }
    }

    abstract void a(byte param0);

    final static void a(boolean param0, boolean param1, java.awt.Canvas param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (f.field_E < 10) {
                  break L2;
                } else {
                  L3: {
                    if (!lk.b(true)) {
                      break L3;
                    } else {
                      L4: {
                        if (p.field_b != 0) {
                          break L4;
                        } else {
                          tq.a(param1, false, 112);
                          int discarded$40 = 0;
                          pt.a(0, 12, param2);
                          if (var4 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      pr.a((byte) 111, param2);
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  qn.b();
                  int discarded$41 = -121;
                  int discarded$42 = 320;
                  int discarded$43 = 240;
                  sc.a();
                  int discarded$44 = 0;
                  pt.a(0, 12, param2);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L5: {
                var3_int = 0;
                if (ol.field_z) {
                  ol.field_z = false;
                  var3_int = 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              int discarded$45 = -15862;
              int discarded$46 = 0;
              tl.a(-5790, st.field_F, pj.g(), var3_int != 0, dd.a());
              break L1;
            }
            L6: {
              if (!param0) {
                break L6;
              } else {
                field_m = null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("iv.BB(").append(param0).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (null != g.field_f) {
          return null;
        } else {
          L0: {
            if (la.field_g == null) {
              break L0;
            } else {
              if ((Object) (Object) la.field_g == this) {
                break L0;
              } else {
                return la.field_g.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        }
    }

    public final void run() {
        try {
            Object var1 = null;
            int var1_int = 0;
            String var2 = null;
            java.lang.reflect.Method var2_ref = null;
            int var2_int = 0;
            Throwable var3_ref_Throwable = null;
            int var3 = 0;
            String var4 = null;
            int var5 = 0;
            boolean stackIn_50_0 = false;
            boolean stackIn_68_0 = false;
            int stackIn_72_0 = 0;
            int stackIn_72_1 = 0;
            int stackIn_83_0 = 0;
            int stackIn_83_1 = 0;
            int stackIn_97_0 = 0;
            int stackIn_102_0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_49_0 = false;
            boolean stackOut_66_0 = false;
            int stackOut_71_0 = 0;
            int stackOut_71_1 = 0;
            int stackOut_82_0 = 0;
            int stackOut_82_1 = 0;
            int stackOut_96_0 = 0;
            int stackOut_100_0 = 0;
            var5 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (null == hd.field_t) {
                              break L5;
                            } else {
                              L6: {
                                var1 = (Object) (Object) hd.field_t.toLowerCase();
                                if (((String) var1).indexOf("sun") != -1) {
                                  break L6;
                                } else {
                                  if (((String) var1).indexOf("apple") != -1) {
                                    break L6;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L7: {
                                L8: {
                                  var2 = hd.field_u;
                                  if (var2.equals((Object) (Object) "1.1")) {
                                    break L8;
                                  } else {
                                    if (var2.startsWith("1.1.")) {
                                      break L8;
                                    } else {
                                      if (var2.equals((Object) (Object) "1.2")) {
                                        break L8;
                                      } else {
                                        if (var2.startsWith("1.2.")) {
                                          break L8;
                                        } else {
                                          if (var2.equals((Object) (Object) "1.3")) {
                                            break L8;
                                          } else {
                                            if (var2.startsWith("1.3.")) {
                                              break L8;
                                            } else {
                                              if (var2.equals((Object) (Object) "1.4")) {
                                                break L8;
                                              } else {
                                                if (var2.startsWith("1.4.")) {
                                                  break L8;
                                                } else {
                                                  if (var2.equals((Object) (Object) "1.5")) {
                                                    break L8;
                                                  } else {
                                                    if (var2.startsWith("1.5.")) {
                                                      break L8;
                                                    } else {
                                                      if (!var2.equals((Object) (Object) "1.6.0")) {
                                                        break L7;
                                                      } else {
                                                        break L8;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                ((iv) this).a("wrongjava", (byte) -39);
                                if (var5 == 0) {
                                  break L2;
                                } else {
                                  break L7;
                                }
                              }
                              if (var2.startsWith("1.6.0_")) {
                                var3 = 6;
                                L9: while (true) {
                                  L10: {
                                    if (var3 >= var2.length()) {
                                      break L10;
                                    } else {
                                      stackOut_49_0 = mu.a(28799, var2.charAt(var3));
                                      stackIn_68_0 = stackOut_49_0;
                                      stackIn_50_0 = stackOut_49_0;
                                      if (var5 != 0) {
                                        break L4;
                                      } else {
                                        if (!stackIn_50_0) {
                                          break L10;
                                        } else {
                                          var3++;
                                          if (var5 == 0) {
                                            continue L9;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var4 = var2.substring(6, var3);
                                  if (!vv.a(-45, (CharSequence) (Object) var4)) {
                                    break L5;
                                  } else {
                                    if (dq.a(107, (CharSequence) (Object) var4) >= 10) {
                                      break L5;
                                    } else {
                                      ((iv) this).a("wrongjava", (byte) -101);
                                      if (var5 == 0) {
                                        break L2;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L5;
                              }
                            }
                          }
                          if (hd.field_u == null) {
                            break L3;
                          } else {
                            stackOut_66_0 = hd.field_u.startsWith("1.");
                            stackIn_68_0 = stackOut_66_0;
                            break L4;
                          }
                        }
                        if (!stackIn_68_0) {
                          break L3;
                        } else {
                          var1_int = 2;
                          var2_int = 0;
                          L11: while (true) {
                            L12: {
                              L13: {
                                if (~var1_int <= ~hd.field_u.length()) {
                                  break L13;
                                } else {
                                  var3 = hd.field_u.charAt(var1_int);
                                  stackOut_71_0 = ~var3;
                                  stackOut_71_1 = -49;
                                  stackIn_83_0 = stackOut_71_0;
                                  stackIn_83_1 = stackOut_71_1;
                                  stackIn_72_0 = stackOut_71_0;
                                  stackIn_72_1 = stackOut_71_1;
                                  if (var5 != 0) {
                                    break L12;
                                  } else {
                                    if (stackIn_72_0 > stackIn_72_1) {
                                      break L13;
                                    } else {
                                      L14: {
                                        if (var3 <= 57) {
                                          break L14;
                                        } else {
                                          if (var5 == 0) {
                                            break L13;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      var2_int = 10 * var2_int + (var3 + -48);
                                      var1_int++;
                                      if (var5 == 0) {
                                        continue L11;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_82_0 = -6;
                              stackOut_82_1 = ~var2_int;
                              stackIn_83_0 = stackOut_82_0;
                              stackIn_83_1 = stackOut_82_1;
                              break L12;
                            }
                            if (stackIn_83_0 < stackIn_83_1) {
                              break L3;
                            } else {
                              se.field_c = true;
                              break L3;
                            }
                          }
                        }
                      }
                      L15: {
                        var1 = (Object) (Object) lr.field_a;
                        if (null == la.field_g) {
                          break L15;
                        } else {
                          var1 = (Object) (Object) la.field_g;
                          break L15;
                        }
                      }
                      L16: {
                        var2_ref = hd.field_x;
                        if (var2_ref != null) {
                          try {
                            L17: {
                              Object discarded$5 = var2_ref.invoke(var1, new Object[1]);
                              break L17;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L18: {
                              var3_ref_Throwable = decompiledCaughtException;
                              break L18;
                            }
                          }
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      int discarded$6 = -76;
                      jh.c();
                      ((iv) this).c((byte) 87);
                      so.field_b = rj.a(bn.field_b, dt.field_a, 1423111778, (java.awt.Component) (Object) si.field_b);
                      ((iv) this).a(false);
                      int discarded$7 = 0;
                      qc.field_h = wc.c();
                      L19: while (true) {
                        L20: {
                          L21: {
                            if (0L == mn.field_s) {
                              break L21;
                            } else {
                              stackOut_96_0 = (mn.field_s < vi.b(-56) ? -1 : (mn.field_s == vi.b(-56) ? 0 : 1));
                              stackIn_102_0 = stackOut_96_0;
                              stackIn_97_0 = stackOut_96_0;
                              if (var5 != 0) {
                                break L20;
                              } else {
                                if (stackIn_97_0 <= 0) {
                                  break L2;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          kb.field_A = qc.field_h.a(-125, rd.field_i);
                          stackOut_100_0 = 0;
                          stackIn_102_0 = stackOut_100_0;
                          break L20;
                        }
                        var3 = stackIn_102_0;
                        L22: while (true) {
                          L23: {
                            L24: {
                              if (~kb.field_A >= ~var3) {
                                break L24;
                              } else {
                                int discarded$8 = 17684;
                                this.b();
                                var3++;
                                if (var5 != 0) {
                                  break L23;
                                } else {
                                  if (var5 == 0) {
                                    continue L22;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                            }
                            this.c(-11);
                            int discarded$9 = 1;
                            ne.a(ft.field_m, (Object) (Object) si.field_b);
                            break L23;
                          }
                          if (var5 == 0) {
                            continue L19;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L25: {
                    var1 = (Object) (Object) decompiledCaughtException;
                    af.a((Throwable) var1, -102, (String) null);
                    ((iv) this).a("crash", (byte) -121);
                    break L25;
                  }
                }
                this.a(true, -1251);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw ig.a((Throwable) var1, "iv.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowClosing(java.awt.event.WindowEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((iv) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("iv.windowClosing(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) lr.field_a != this) {
                break L1;
              } else {
                if (!rh.field_c) {
                  mn.field_s = 0L;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) (Object) runtimeException, "iv.start()");
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            wj.field_l = true;
            ol.field_z = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("iv.focusGained(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    abstract void d(byte param0);

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_12_0 = null;
        java.net.URL stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        java.net.URL stackOut_11_0 = null;
        java.net.URL stackOut_13_0 = null;
        try {
          L0: {
            if (g.field_f != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.net.URL) (Object) stackIn_4_0;
            } else {
              L1: {
                if (null == la.field_g) {
                  break L1;
                } else {
                  if (this != (Object) (Object) la.field_g) {
                    stackOut_11_0 = la.field_g.getDocumentBase();
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_13_0 = super.getDocumentBase();
              stackIn_14_0 = stackOut_13_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "iv.getDocumentBase()");
        }
        return stackIn_14_0;
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        java.applet.AppletContext stackOut_9_0 = null;
        java.applet.AppletContext stackOut_11_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (g.field_f == null) {
              L1: {
                if (la.field_g == null) {
                  break L1;
                } else {
                  if ((Object) (Object) la.field_g != this) {
                    stackOut_9_0 = la.field_g.getAppletContext();
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_11_0 = super.getAppletContext();
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (java.applet.AppletContext) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "iv.getAppletContext()");
        }
        return stackIn_12_0;
    }

    abstract void a(int param0);

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    private final void c(int param0) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = vi.b(94);
              var4 = jb.field_u[ih.field_ab];
              jb.field_u[ih.field_ab] = var2_long;
              ih.field_ab = ih.field_ab - -1 & 31;
              if (0L == var4) {
                break L1;
              } else {
                if (var4 >= var2_long) {
                  break L1;
                } else {
                  var6_int = (int)(-var4 + var2_long);
                  hr.field_i = (32000 + (var6_int >> 1)) / var6_int;
                  break L1;
                }
              }
            }
            L2: {
              int fieldTemp$3 = uh.field_d;
              uh.field_d = uh.field_d + 1;
              if (fieldTemp$3 <= 50) {
                break L2;
              } else {
                L3: {
                  uh.field_d = uh.field_d - 50;
                  ol.field_z = true;
                  si.field_b.setSize(bn.field_b, dt.field_a);
                  si.field_b.setVisible(true);
                  if (null == g.field_f) {
                    break L3;
                  } else {
                    if (cs.field_bb != null) {
                      break L3;
                    } else {
                      var6 = g.field_f.getInsets();
                      si.field_b.setLocation(sp.field_b + var6.left, mh.field_c + var6.top);
                      if (!ArmiesOfGielinor.field_M) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                si.field_b.setLocation(sp.field_b, mh.field_c);
                break L2;
              }
            }
            ((iv) this).a(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "iv.UA(" + -11 + ')');
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final synchronized void c(byte param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (si.field_b != null) {
                si.field_b.removeFocusListener((java.awt.event.FocusListener) this);
                si.field_b.getParent().setBackground(java.awt.Color.black);
                si.field_b.getParent().remove((java.awt.Component) (Object) si.field_b);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (cs.field_bb == null) {
                  break L3;
                } else {
                  var2 = (Object) (Object) cs.field_bb;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (g.field_f == null) {
                  break L4;
                } else {
                  var2 = (Object) (Object) g.field_f;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (la.field_g == null) {
                  break L5;
                } else {
                  var2 = (Object) (Object) la.field_g;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              var2 = (Object) (Object) lr.field_a;
              break L2;
            }
            ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
            si.field_b = (java.awt.Canvas) (Object) new le((java.awt.Component) this);
            java.awt.Component discarded$7 = ((java.awt.Container) var2).add((java.awt.Component) (Object) si.field_b);
            si.field_b.setSize(bn.field_b, dt.field_a);
            if (param0 == 87) {
              L6: {
                L7: {
                  si.field_b.setVisible(true);
                  if (var2 == (Object) (Object) g.field_f) {
                    break L7;
                  } else {
                    si.field_b.setLocation(sp.field_b, mh.field_c);
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var3 = g.field_f.getInsets();
                si.field_b.setLocation(var3.left + sp.field_b, var3.top + mh.field_c);
                break L6;
              }
              si.field_b.addFocusListener((java.awt.event.FocusListener) this);
              si.field_b.requestFocus();
              ph.field_f = true;
              wj.field_l = true;
              ol.field_z = true;
              tq.field_a = false;
              ns.field_P = vi.b(param0 + 7);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw ig.a((Throwable) var2, "iv.RA(" + param0 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            wj.field_l = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("iv.focusLost(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    protected iv() {
        ((iv) this).field_i = false;
    }

    public static void d(int param0) {
        field_m = null;
        field_c = null;
        if (param0 <= 86) {
            return;
        }
        try {
            field_a = null;
            field_b = null;
            field_e = null;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "iv.VA(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Curses";
        field_a = "Enter name of friend to add to list";
        field_c = "Unable to add friend - system busy";
    }
}
