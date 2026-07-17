/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;
import java.applet.AppletContext;

public abstract class og extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_c;
    static String field_i;
    boolean field_f;
    static String field_k;
    public static int field_a;
    public static int field_e;
    public static boolean field_h;
    public static boolean field_g;
    public static int field_j;
    public static int field_d;
    public static int field_b;

    abstract void d(int param0);

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, String param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            wk var8_ref2 = null;
            int var9 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            var9 = Vertigo2.field_L ? 1 : 0;
            try {
              try {
                L0: {
                  if (qe.field_T != null) {
                    rh.field_H = rh.field_H + 1;
                    if (rh.field_H < 3) {
                      ((og) this).getAppletContext().showDocument(((og) this).getDocumentBase(), "_self");
                      return;
                    } else {
                      ((og) this).a(0, "alreadyloaded");
                      return;
                    }
                  } else {
                    oq.field_I = param3;
                    op.field_c = param5;
                    lc.field_a = param5;
                    qe.field_T = (og) this;
                    to.field_e = 0;
                    bk.field_f = 0;
                    gh.field_a = param4;
                    hk.field_m = param4;
                    nh.field_h = ob.e((byte) -106);
                    if (param1 >= 8) {
                      jj dupTemp$1 = new jj(param0, param6, param2, true);
                      gi.field_s = dupTemp$1;
                      mr.field_b = dupTemp$1;
                      var8_ref2 = gi.field_s.a(1, (Runnable) this, 0);
                      L1: while (true) {
                        L2: {
                          L3: {
                            if (0 != var8_ref2.field_b) {
                              break L3;
                            } else {
                              um.a(true, 10L);
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
                  ke.a(var8, (String) null, 0);
                  ((og) this).a(0, "crash");
                  break L4;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_20_0 = (RuntimeException) var8_ref;
                stackOut_20_1 = new StringBuilder().append("og.DA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
                stackIn_23_0 = stackOut_20_0;
                stackIn_23_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param6 == null) {
                  stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                  stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                  stackOut_23_2 = "null";
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  break L5;
                } else {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "{...}";
                  stackIn_24_0 = stackOut_21_0;
                  stackIn_24_1 = stackOut_21_1;
                  stackIn_24_2 = stackOut_21_2;
                  break L5;
                }
              }
              throw wn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        String stackOut_11_0 = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (eo.field_k != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String) (Object) stackIn_4_0;
            } else {
              L1: {
                if (va.field_o == null) {
                  break L1;
                } else {
                  if (this != (Object) (Object) va.field_o) {
                    stackOut_11_0 = va.field_o.getParameter(param0);
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_13_0 = super.getParameter(param0);
              stackIn_14_0 = stackOut_13_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("og.getParameter(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_14_0;
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
            sj.field_b = true;
            uh.field_sc = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("og.focusGained(");
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
          throw wn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) qe.field_T != this) {
                break L1;
              } else {
                if (gf.field_g) {
                  break L1;
                } else {
                  lf.field_B = gk.a(52);
                  um.a(true, 5000L);
                  mr.field_b = null;
                  this.a((byte) -53, false);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) (Object) runtimeException, "og.destroy()");
        }
    }

    final boolean c(int param0) {
        return true;
    }

    public abstract void init();

    final void a(int param0, String param1) {
        try {
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            try {
              L0: {
                if (!((og) this).field_f) {
                  L1: {
                    if (param0 == 0) {
                      break L1;
                    } else {
                      ((og) this).a(110, -90, 45, 6, 64, 46, (String) null);
                      break L1;
                    }
                  }
                  ((og) this).field_f = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L2: {
                      Object discarded$1 = je.a(ob.e((byte) -121), false, "loggedout");
                      break L2;
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = decompiledCaughtException;
                      break L3;
                    }
                  }
                  try {
                    L4: {
                      ((og) this).getAppletContext().showDocument(new java.net.URL(((og) this).getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3_ref = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L6: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) var3_ref2;
                stackOut_13_1 = new StringBuilder().append("og.FA(").append(param0).append(44);
                stackIn_16_0 = stackOut_13_0;
                stackIn_16_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param1 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L6;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_17_0 = stackOut_14_0;
                  stackIn_17_1 = stackOut_14_1;
                  stackIn_17_2 = stackOut_14_2;
                  break L6;
                }
              }
              throw wn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) qe.field_T) {
                break L1;
              } else {
                if (!gf.field_g) {
                  lf.field_B = 0L;
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
          throw wn.a((Throwable) (Object) runtimeException, "og.start()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    abstract void b(byte param0);

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
            va.field_o = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("og.provideLoaderApplet(");
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
          throw wn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    abstract void b(int param0);

    private final void e(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = gk.a(50);
              var4 = hd.field_d[nl.field_d];
              hd.field_d[nl.field_d] = var2_long;
              nl.field_d = nl.field_d + 1 & 31;
              var6 = -101 % ((param0 - 59) / 36);
              if (0L == var4) {
                break L1;
              } else {
                if (var2_long <= var4) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var7 = this;
            synchronized (var7) {
              L2: {
                uj.field_g = sj.field_b;
                break L2;
              }
            }
            ((og) this).f(69);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw wn.a((Throwable) (Object) runtimeException, "og.CA(" + param0 + 41);
        }
    }

    final static int a(CharSequence param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            if (param1 < -88) {
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_int <= var4) {
                      break L3;
                    } else {
                      stackOut_6_0 = (var3 << 5) - var3 + ke.a(param0.charAt(var4), (byte) -120);
                      stackIn_9_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        var3 = stackIn_7_0;
                        var4++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_8_0 = var3;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = -78;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("og.T(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_9_0;
    }

    final synchronized void a(byte param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != ne.field_F) {
                ne.field_F.removeFocusListener((java.awt.event.FocusListener) this);
                ne.field_F.getParent().setBackground(java.awt.Color.black);
                ne.field_F.getParent().remove((java.awt.Component) (Object) ne.field_F);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (lo.field_j != null) {
                  break L3;
                } else {
                  L4: {
                    if (null == eo.field_k) {
                      break L4;
                    } else {
                      var2 = (Object) (Object) eo.field_k;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (null == va.field_o) {
                      break L5;
                    } else {
                      var2 = (Object) (Object) va.field_o;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = (Object) (Object) qe.field_T;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = (Object) (Object) lo.field_j;
              break L2;
            }
            if (param0 == -57) {
              L6: {
                L7: {
                  ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
                  ne.field_F = (java.awt.Canvas) (Object) new tg((java.awt.Component) this);
                  java.awt.Component discarded$6 = ((java.awt.Container) var2).add((java.awt.Component) (Object) ne.field_F);
                  ne.field_F.setSize(op.field_c, gh.field_a);
                  ne.field_F.setVisible(true);
                  if (var2 != (Object) (Object) eo.field_k) {
                    break L7;
                  } else {
                    var3 = eo.field_k.getInsets();
                    ne.field_F.setLocation(bk.field_f + var3.left, var3.top - -to.field_e);
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                ne.field_F.setLocation(bk.field_f, to.field_e);
                break L6;
              }
              ne.field_F.addFocusListener((java.awt.event.FocusListener) this);
              ne.field_F.requestFocus();
              sj.field_b = true;
              uj.field_g = true;
              uh.field_sc = true;
              oh.field_F = false;
              nf.field_x = gk.a(89);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw wn.a((Throwable) var2, "og.EA(" + param0 + 41);
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (eo.field_k != null) {
          return null;
        } else {
          L0: {
            if (va.field_o == null) {
              break L0;
            } else {
              if (this != (Object) (Object) va.field_o) {
                return va.field_o.getCodeBase();
              } else {
                break L0;
              }
            }
          }
          return super.getCodeBase();
        }
    }

    abstract void d(byte param0);

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) qe.field_T != this) {
                break L1;
              } else {
                if (gf.field_g) {
                  break L1;
                } else {
                  lf.field_B = 4000L + gk.a(113);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) (Object) runtimeException, "og.stop()");
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    static long a(long param0, long param1) {
        RuntimeException var4 = null;
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_0_0 = 0L;
        try {
          L0: {
            stackOut_0_0 = param0 ^ param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var4, "og.BA(" + param0 + 44 + param1 + 41);
        }
        return stackIn_1_0;
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
            ((og) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("og.windowClosing(");
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
          throw wn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15_ref_int__ = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        int var23 = 0;
        int stackIn_73_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_72_0 = 0;
        int stackOut_70_0 = 0;
        var23 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              jk.a(2, param4);
              var7_int = 0;
              var8 = -param6 + param4;
              if (0 > var8) {
                var8 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var9 = param4;
              var10 = -param4;
              var11 = var8;
              var12 = -var8;
              var13 = param2;
              var14 = -1;
              if (param5 < ua.field_e) {
                break L2;
              } else {
                if (cj.field_D < param5) {
                  break L2;
                } else {
                  var15_ref_int__ = vl.field_e[param5];
                  var16 = pk.a((byte) -14, ib.field_a, -param4 + param3, ap.field_e);
                  var17 = pk.a((byte) -14, ib.field_a, param4 + param3, ap.field_e);
                  var18 = pk.a((byte) -14, ib.field_a, param3 - var8, ap.field_e);
                  var19 = pk.a((byte) -14, ib.field_a, param3 - -var8, ap.field_e);
                  ki.a(-99, var16, var15_ref_int__, var18, param0);
                  ki.a(param2 + -84, var18, var15_ref_int__, var19, param1);
                  ki.a(-125, var19, var15_ref_int__, var17, param0);
                  break L2;
                }
              }
            }
            L3: while (true) {
              L4: {
                L5: {
                  if (var9 <= var7_int) {
                    break L5;
                  } else {
                    var14 += 2;
                    var13 += 2;
                    var10 = var10 + var13;
                    var12 = var12 + var14;
                    if (var23 != 0) {
                      break L4;
                    } else {
                      L6: {
                        if (var12 < 0) {
                          break L6;
                        } else {
                          if (var11 >= 1) {
                            var11--;
                            var12 = var12 - (var11 << 1);
                            jo.field_h[var11] = var7_int;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        var7_int++;
                        if (var10 >= 0) {
                          var9--;
                          var10 = var10 - (var9 << 1);
                          var15 = -var9 + param5;
                          var16 = var9 + param5;
                          if (~var16 > ~ua.field_e) {
                            break L7;
                          } else {
                            if (var15 > cj.field_D) {
                              break L7;
                            } else {
                              L8: {
                                if (var8 <= var9) {
                                  break L8;
                                } else {
                                  L9: {
                                    var17 = jo.field_h[var9];
                                    var18 = pk.a((byte) -14, ib.field_a, param3 - -var7_int, ap.field_e);
                                    var19 = pk.a((byte) -14, ib.field_a, param3 + -var7_int, ap.field_e);
                                    var20 = pk.a((byte) -14, ib.field_a, param3 - -var17, ap.field_e);
                                    var21 = pk.a((byte) -14, ib.field_a, -var17 + param3, ap.field_e);
                                    if (~cj.field_D <= ~var16) {
                                      var22 = vl.field_e[var16];
                                      ki.a(-102, var19, var22, var21, param0);
                                      ki.a(-98, var21, var22, var20, param1);
                                      ki.a(-106, var20, var22, var18, param0);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    if (var15 < ua.field_e) {
                                      break L10;
                                    } else {
                                      var22 = vl.field_e[var15];
                                      ki.a(-75, var19, var22, var21, param0);
                                      ki.a(-104, var21, var22, var20, param1);
                                      ki.a(-79, var20, var22, var18, param0);
                                      break L10;
                                    }
                                  }
                                  if (var23 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L11: {
                                var17 = pk.a((byte) -14, ib.field_a, var7_int + param3, ap.field_e);
                                var18 = pk.a((byte) -14, ib.field_a, -var7_int + param3, ap.field_e);
                                if (var16 <= cj.field_D) {
                                  ki.a(param2 ^ 87, var18, vl.field_e[var16], var17, param0);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              if (var15 < ua.field_e) {
                                break L7;
                              } else {
                                ki.a(-83, var18, vl.field_e[var15], var17, param0);
                                break L7;
                              }
                            }
                          }
                        } else {
                          break L7;
                        }
                      }
                      L12: {
                        var15 = -var7_int + param5;
                        var16 = param5 + var7_int;
                        if (var16 < ua.field_e) {
                          break L12;
                        } else {
                          if (var15 <= cj.field_D) {
                            var17 = param3 + var9;
                            var18 = -var9 + param3;
                            if (~var17 > ~ap.field_e) {
                              break L12;
                            } else {
                              if (~var18 >= ~ib.field_a) {
                                L13: {
                                  var17 = pk.a((byte) -14, ib.field_a, var17, ap.field_e);
                                  var18 = pk.a((byte) -14, ib.field_a, var18, ap.field_e);
                                  if (~var8 < ~var7_int) {
                                    break L13;
                                  } else {
                                    L14: {
                                      if (~cj.field_D > ~var16) {
                                        break L14;
                                      } else {
                                        ki.a(-91, var18, vl.field_e[var16], var17, param0);
                                        break L14;
                                      }
                                    }
                                    if (var15 >= ua.field_e) {
                                      ki.a(-96, var18, vl.field_e[var15], var17, param0);
                                      if (var23 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                L15: {
                                  if (~var11 <= ~var7_int) {
                                    stackOut_72_0 = var11;
                                    stackIn_73_0 = stackOut_72_0;
                                    break L15;
                                  } else {
                                    stackOut_70_0 = jo.field_h[var7_int];
                                    stackIn_73_0 = stackOut_70_0;
                                    break L15;
                                  }
                                }
                                L16: {
                                  var19 = stackIn_73_0;
                                  var20 = pk.a((byte) -14, ib.field_a, param3 - -var19, ap.field_e);
                                  var21 = pk.a((byte) -14, ib.field_a, param3 + -var19, ap.field_e);
                                  if (var16 > cj.field_D) {
                                    break L16;
                                  } else {
                                    var22 = vl.field_e[var16];
                                    ki.a(-95, var18, var22, var21, param0);
                                    ki.a(param2 + -98, var21, var22, var20, param1);
                                    ki.a(-80, var20, var22, var17, param0);
                                    break L16;
                                  }
                                }
                                if (ua.field_e <= var15) {
                                  var22 = vl.field_e[var15];
                                  ki.a(-82, var18, var22, var21, param0);
                                  ki.a(param2 ^ 125, var21, var22, var20, param1);
                                  ki.a(-97, var20, var22, var17, param0);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              } else {
                                break L12;
                              }
                            }
                          } else {
                            break L12;
                          }
                        }
                      }
                      if (var23 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var7, "og.W(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
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
            ((og) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("og.update(");
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
          throw wn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public static void c(byte param0) {
        field_i = null;
        field_c = null;
        if (param0 != 26) {
            return;
        }
        try {
            field_k = null;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "og.GA(" + param0 + 41);
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        java.net.URL stackOut_9_0 = null;
        java.net.URL stackOut_11_0 = null;
        try {
          L0: {
            if (null != eo.field_k) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.net.URL) (Object) stackIn_4_0;
            } else {
              L1: {
                if (null == va.field_o) {
                  break L1;
                } else {
                  if (this == (Object) (Object) va.field_o) {
                    break L1;
                  } else {
                    stackOut_9_0 = va.field_o.getDocumentBase();
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              }
              stackOut_11_0 = super.getDocumentBase();
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "og.getDocumentBase()");
        }
        return stackIn_12_0;
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
            sj.field_b = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("og.focusLost(");
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
          throw wn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    abstract void f(int param0);

    protected og() {
        ((og) this).field_f = false;
    }

    private final void a(byte param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Object var3_ref = null;
        Throwable var3_ref2 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3_ref = this;
            synchronized (var3_ref) {
              L1: {
                if (!gf.field_g) {
                  gf.field_g = true;
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (null == va.field_o) {
                break L2;
              } else {
                va.field_o.destroy();
                break L2;
              }
            }
            try {
              L3: {
                ((og) this).b((byte) -123);
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
              if (null != ne.field_F) {
                try {
                  L6: {
                    ne.field_F.removeFocusListener((java.awt.event.FocusListener) this);
                    ne.field_F.getParent().remove((java.awt.Component) (Object) ne.field_F);
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
              } else {
                break L5;
              }
            }
            L8: {
              if (param0 == -53) {
                break L8;
              } else {
                field_i = null;
                break L8;
              }
            }
            L9: {
              if (null != gi.field_s) {
                try {
                  L10: {
                    gi.field_s.a(false);
                    break L10;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L11: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    break L11;
                  }
                }
                break L9;
              } else {
                break L9;
              }
            }
            L12: {
              ((og) this).d((byte) 108);
              if (null != eo.field_k) {
                try {
                  L13: {
                    System.exit(0);
                    break L13;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L14: {
                    var3_ref2 = decompiledCaughtException;
                    break L14;
                  }
                }
                break L12;
              } else {
                break L12;
              }
            }
            System.out.println("Shutdown complete - clean:" + param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw wn.a((Throwable) (Object) runtimeException, "og.AA(" + param0 + 44 + param1 + 41);
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException var2 = null;
        java.awt.Rectangle var2_ref = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) qe.field_T != this) {
                break L1;
              } else {
                if (gf.field_g) {
                  break L1;
                } else {
                  L2: {
                    uh.field_sc = true;
                    if (!kj.field_E) {
                      break L2;
                    } else {
                      if (gk.a(88) - nf.field_x > 1000L) {
                        L3: {
                          var2_ref = param0.getClipBounds();
                          if (null == var2_ref) {
                            break L3;
                          } else {
                            if (~lc.field_a < ~var2_ref.width) {
                              break L2;
                            } else {
                              if (~var2_ref.height > ~hk.field_m) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        oh.field_F = true;
                        break L2;
                      } else {
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
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("og.paint(");
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    private final void a(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = gk.a(param0 ^ 91);
              var4 = l.field_b[eb.field_e];
              l.field_b[eb.field_e] = var2_long;
              eb.field_e = param0 & eb.field_e - -1;
              if (var4 == 0L) {
                break L1;
              } else {
                if (var2_long > var4) {
                  var6_int = (int)(var2_long - var4);
                  li.field_d = ((var6_int >> 1) + 32000) / var6_int;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              int fieldTemp$2 = km.field_x;
              km.field_x = km.field_x + 1;
              if (fieldTemp$2 > 50) {
                L3: {
                  km.field_x = km.field_x - 50;
                  uh.field_sc = true;
                  ne.field_F.setSize(op.field_c, gh.field_a);
                  ne.field_F.setVisible(true);
                  if (eo.field_k == null) {
                    break L3;
                  } else {
                    if (null != lo.field_j) {
                      break L3;
                    } else {
                      var6 = eo.field_k.getInsets();
                      ne.field_F.setLocation(bk.field_f + var6.left, var6.top + to.field_e);
                      if (!Vertigo2.field_L) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ne.field_F.setLocation(bk.field_f, to.field_e);
                break L2;
              } else {
                break L2;
              }
            }
            ((og) this).d(param0 + -48);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) (Object) runtimeException, "og.V(" + param0 + 41);
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
            int stackIn_80_0 = 0;
            int stackIn_80_1 = 0;
            int stackIn_96_0 = 0;
            int stackIn_101_0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_49_0 = false;
            boolean stackOut_66_0 = false;
            int stackOut_71_0 = 0;
            int stackOut_71_1 = 0;
            int stackOut_79_0 = 0;
            int stackOut_79_1 = 0;
            int stackOut_95_0 = 0;
            int stackOut_99_0 = 0;
            var5 = Vertigo2.field_L ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (jj.field_m != null) {
                              L6: {
                                var1 = (Object) (Object) jj.field_m.toLowerCase();
                                if (((String) var1).indexOf("sun") != -1) {
                                  break L6;
                                } else {
                                  if (((String) var1).indexOf("apple") == -1) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              L7: {
                                L8: {
                                  var2 = jj.field_d;
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
                                                      if (var2.equals((Object) (Object) "1.6.0")) {
                                                        break L8;
                                                      } else {
                                                        break L7;
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
                                ((og) this).a(0, "wrongjava");
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
                                    if (~var2.length() >= ~var3) {
                                      break L10;
                                    } else {
                                      stackOut_49_0 = ab.a(false, var2.charAt(var3));
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
                                  if (!qb.a((CharSequence) (Object) var4, -69)) {
                                    break L5;
                                  } else {
                                    if (10 > cf.a(86, (CharSequence) (Object) var4)) {
                                      ((og) this).a(0, "wrongjava");
                                      if (var5 == 0) {
                                        break L2;
                                      } else {
                                        break L5;
                                      }
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                          if (jj.field_d == null) {
                            break L3;
                          } else {
                            stackOut_66_0 = jj.field_d.startsWith("1.");
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
                                if (~var1_int <= ~jj.field_d.length()) {
                                  break L13;
                                } else {
                                  var3 = jj.field_d.charAt(var1_int);
                                  stackOut_71_0 = var3;
                                  stackOut_71_1 = 48;
                                  stackIn_80_0 = stackOut_71_0;
                                  stackIn_80_1 = stackOut_71_1;
                                  stackIn_72_0 = stackOut_71_0;
                                  stackIn_72_1 = stackOut_71_1;
                                  if (var5 != 0) {
                                    break L12;
                                  } else {
                                    if (stackIn_72_0 < stackIn_72_1) {
                                      break L13;
                                    } else {
                                      if (57 < var3) {
                                        break L13;
                                      } else {
                                        var1_int++;
                                        var2_int = -48 + (var3 + var2_int * 10);
                                        if (var5 == 0) {
                                          continue L11;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_79_0 = 5;
                              stackOut_79_1 = var2_int;
                              stackIn_80_0 = stackOut_79_0;
                              stackIn_80_1 = stackOut_79_1;
                              break L12;
                            }
                            if (stackIn_80_0 <= stackIn_80_1) {
                              kj.field_E = true;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      L14: {
                        var1 = (Object) (Object) qe.field_T;
                        if (null != va.field_o) {
                          var1 = (Object) (Object) va.field_o;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        var2_ref = jj.field_e;
                        if (null != var2_ref) {
                          try {
                            L16: {
                              Object discarded$1 = var2_ref.invoke(var1, new Object[1]);
                              break L16;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L17: {
                              var3_ref_Throwable = decompiledCaughtException;
                              break L17;
                            }
                          }
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      nf.a(true);
                      ((og) this).a((byte) -57);
                      ro.field_g = nn.a(gh.field_a, (java.awt.Component) (Object) ne.field_F, true, op.field_c);
                      ((og) this).b(255);
                      wa.field_i = bl.c(true);
                      L18: while (true) {
                        L19: {
                          L20: {
                            if (lf.field_B == 0L) {
                              break L20;
                            } else {
                              stackOut_95_0 = (~gk.a(73) < ~lf.field_B ? -1 : (~gk.a(73) == ~lf.field_B ? 0 : 1));
                              stackIn_101_0 = stackOut_95_0;
                              stackIn_96_0 = stackOut_95_0;
                              if (var5 != 0) {
                                break L19;
                              } else {
                                if (stackIn_96_0 <= 0) {
                                  break L2;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          tf.field_n = wa.field_i.a(sl.field_w, true);
                          stackOut_99_0 = 0;
                          stackIn_101_0 = stackOut_99_0;
                          break L19;
                        }
                        var3 = stackIn_101_0;
                        L21: while (true) {
                          L22: {
                            L23: {
                              if (var3 >= tf.field_n) {
                                break L23;
                              } else {
                                this.e(11);
                                var3++;
                                if (var5 != 0) {
                                  break L22;
                                } else {
                                  if (var5 == 0) {
                                    continue L21;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                            this.a(31);
                            e.a(gi.field_s, (Object) (Object) ne.field_F, -29785);
                            break L22;
                          }
                          if (var5 == 0) {
                            continue L18;
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
                  L24: {
                    var1 = (Object) (Object) decompiledCaughtException;
                    ke.a((Throwable) var1, (String) null, 0);
                    ((og) this).a(0, "crash");
                    break L24;
                  }
                }
                this.a((byte) -53, true);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw wn.a((Throwable) var1, "og.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        java.applet.AppletContext stackOut_9_0 = null;
        java.applet.AppletContext stackOut_11_0 = null;
        try {
          L0: {
            if (eo.field_k != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.applet.AppletContext) (Object) stackIn_4_0;
            } else {
              L1: {
                if (null == va.field_o) {
                  break L1;
                } else {
                  if (this == (Object) (Object) va.field_o) {
                    break L1;
                  } else {
                    stackOut_9_0 = va.field_o.getAppletContext();
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              }
              stackOut_11_0 = super.getAppletContext();
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "og.getAppletContext()");
        }
        return stackIn_12_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "<%0> has left the lobby.";
        field_c = "The block with the green vortex is a portal. This takes you to another point on the level. At the top of the level there are cracked blocks. Move onto them and they start to shake; they'll crumble once you move off of them. Since they are blue, you must get rid of them to complete the level.";
        field_k = "Use this alternative as your account name";
    }
}
