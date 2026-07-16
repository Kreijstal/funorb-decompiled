/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.AppletContext;
import java.net.URL;

public abstract class cd extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_g;
    static dd field_b;
    boolean field_i;
    public static boolean field_e;
    public static int field_j;
    public static int field_d;
    public static int field_a;
    public static int field_c;
    public static boolean field_f;
    public static int field_h;

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (null == cb.field_t) {
          L0: {
            if (sd.field_j == null) {
              break L0;
            } else {
              if (this != (Object) (Object) sd.field_j) {
                return sd.field_j.getCodeBase();
              } else {
                break L0;
              }
            }
          }
          return super.getCodeBase();
        } else {
          return null;
        }
    }

    abstract void a(int param0);

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
            if (cb.field_t == null) {
              L1: {
                if (null == sd.field_j) {
                  break L1;
                } else {
                  if (this != (Object) (Object) sd.field_j) {
                    stackOut_9_0 = sd.field_j.getAppletContext();
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
          throw pf.a((Throwable) (Object) var1, "cd.getAppletContext()");
        }
        return stackIn_12_0;
    }

    private final void a(boolean param0, byte param1) {
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
                if (!o.field_l) {
                  o.field_l = true;
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (sd.field_j != null) {
                sd.field_j.destroy();
                break L2;
              } else {
                break L2;
              }
            }
            try {
              L3: {
                ((cd) this).b((byte) -61);
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
              if (null == ol.field_e) {
                break L5;
              } else {
                try {
                  L6: {
                    ol.field_e.removeFocusListener((java.awt.event.FocusListener) this);
                    ol.field_e.getParent().remove((java.awt.Component) (Object) ol.field_e);
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
              if (null != fg.field_q) {
                try {
                  L9: {
                    fg.field_q.a((byte) 125);
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
              ((cd) this).a(-1);
              if (param1 >= 71) {
                break L11;
              } else {
                ((cd) this).run();
                break L11;
              }
            }
            L12: {
              if (null != cb.field_t) {
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
            System.out.println("Shutdown complete - clean:" + param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw pf.a((Throwable) (Object) runtimeException, "cd.EA(" + param0 + 44 + param1 + 41);
        }
    }

    abstract void d(int param0);

    final static int a(ll param0, bh param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == param0) {
                break L1;
              } else {
                if (param0.field_p == null) {
                  break L1;
                } else {
                  if (null == param1) {
                    break L1;
                  } else {
                    if (param1.field_o != param0.field_k) {
                      break L1;
                    } else {
                      var4_int = param1.field_p.length;
                      var5 = param0.field_p[param3].length / var4_int;
                      var6 = param2;
                      L2: while (true) {
                        L3: {
                          L4: {
                            if (var6 >= var5) {
                              break L4;
                            } else {
                              stackOut_17_0 = (param1.field_k < param0.field_u[param3][var6] ? -1 : (param1.field_k == param0.field_u[param3][var6] ? 0 : 1));
                              stackIn_40_0 = stackOut_17_0;
                              stackIn_18_0 = stackOut_17_0;
                              if (var8 != 0) {
                                break L3;
                              } else {
                                L5: {
                                  if (stackIn_18_0 != 0) {
                                    break L5;
                                  } else {
                                    if (!ng.a(param0.field_i[param3][var6], (byte) 7)) {
                                      break L5;
                                    } else {
                                      var7 = 0;
                                      L6: while (true) {
                                        L7: {
                                          L8: {
                                            if ((var4_int ^ -1) >= (var7 ^ -1)) {
                                              break L8;
                                            } else {
                                              stackOut_26_0 = param0.field_p[param3][var7 + var4_int * var6];
                                              stackIn_37_0 = stackOut_26_0;
                                              stackIn_27_0 = stackOut_26_0;
                                              if (var8 != 0) {
                                                break L7;
                                              } else {
                                                L9: {
                                                  if (stackIn_27_0 == param1.field_p[var7]) {
                                                    break L9;
                                                  } else {
                                                    if (var8 == 0) {
                                                      break L5;
                                                    } else {
                                                      break L9;
                                                    }
                                                  }
                                                }
                                                var7++;
                                                if (var8 == 0) {
                                                  continue L6;
                                                } else {
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                          stackOut_36_0 = var6;
                                          stackIn_37_0 = stackOut_36_0;
                                          break L7;
                                        }
                                        return stackIn_37_0;
                                      }
                                    }
                                  }
                                }
                                var6++;
                                if (var8 == 0) {
                                  continue L2;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          stackOut_39_0 = -1;
                          stackIn_40_0 = stackOut_39_0;
                          break L3;
                        }
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackOut_13_0 = -1;
            stackIn_14_0 = stackOut_13_0;
            return stackIn_14_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var4;
            stackOut_41_1 = new StringBuilder().append("cd.V(");
            stackIn_44_0 = stackOut_41_0;
            stackIn_44_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L10;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L10;
            }
          }
          L11: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(44);
            stackIn_48_0 = stackOut_45_0;
            stackIn_48_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param1 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L11;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_49_0 = stackOut_46_0;
              stackIn_49_1 = stackOut_46_1;
              stackIn_49_2 = stackOut_46_2;
              break L11;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_40_0;
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
            sd.field_g = true;
            j.field_e = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("cd.focusGained(");
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
          throw pf.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public static void c(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            field_b = null;
            field_g = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "cd.BA(" + param0 + 41);
        }
    }

    final synchronized void c(int param0) {
        Object var2 = null;
        int var3 = 0;
        java.awt.Insets var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != ol.field_e) {
                ol.field_e.removeFocusListener((java.awt.event.FocusListener) this);
                ol.field_e.getParent().setBackground(java.awt.Color.black);
                ol.field_e.getParent().remove((java.awt.Component) (Object) ol.field_e);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (ug.field_b == null) {
                  break L3;
                } else {
                  var2 = (Object) (Object) ug.field_b;
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (cb.field_t == null) {
                  break L4;
                } else {
                  var2 = (Object) (Object) cb.field_t;
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (sd.field_j == null) {
                  break L5;
                } else {
                  var2 = (Object) (Object) sd.field_j;
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              var2 = (Object) (Object) pf.field_c;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
                ol.field_e = (java.awt.Canvas) (Object) new ld((java.awt.Component) this);
                java.awt.Component discarded$2 = ((java.awt.Container) var2).add((java.awt.Component) (Object) ol.field_e);
                ol.field_e.setSize(ki.field_a, gm.field_nb);
                var3 = 81 % ((param0 - 53) / 56);
                ol.field_e.setVisible(true);
                if (var2 != (Object) (Object) cb.field_t) {
                  break L7;
                } else {
                  var4 = cb.field_t.getInsets();
                  ol.field_e.setLocation(va.field_u + var4.left, rg.field_p + var4.top);
                  if (var5 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ol.field_e.setLocation(va.field_u, rg.field_p);
              break L6;
            }
            ol.field_e.addFocusListener((java.awt.event.FocusListener) this);
            ol.field_e.requestFocus();
            ha.field_k = true;
            sd.field_g = true;
            j.field_e = true;
            h.field_h = false;
            cg.field_z = lj.a((byte) -127);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw pf.a((Throwable) var2, "cd.AA(" + param0 + 41);
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final void a(int param0, int param1, int param2, int param3, String param4, int param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            od var8_ref2 = null;
            int var9 = 0;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            var9 = fleas.field_A ? 1 : 0;
            try {
              try {
                L0: {
                  if (null != pf.field_c) {
                    qk.field_a = qk.field_a + 1;
                    if (qk.field_a >= 3) {
                      ((cd) this).a(param6 ^ -6472, "alreadyloaded");
                      return;
                    } else {
                      ((cd) this).getAppletContext().showDocument(((cd) this).getDocumentBase(), "_self");
                      return;
                    }
                  } else {
                    L1: {
                      rc.field_a = param3;
                      if (param6 == 3) {
                        break L1;
                      } else {
                        ((cd) this).a(-29, 46, -49, 56, (String) null, -7, 122);
                        break L1;
                      }
                    }
                    gm.field_nb = param2;
                    di.field_c = param2;
                    rg.field_p = 0;
                    ki.field_a = param0;
                    o.field_m = param0;
                    va.field_u = 0;
                    pf.field_c = (cd) this;
                    tb.field_d = rl.a((byte) -61);
                    ce dupTemp$1 = new ce(param5, param4, param1, true);
                    fg.field_q = dupTemp$1;
                    fg.field_i = dupTemp$1;
                    var8_ref2 = fg.field_q.a(param6 ^ 4535, (Runnable) this, 1);
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (-1 != (var8_ref2.field_b ^ -1)) {
                            break L4;
                          } else {
                            vh.a(10L, param6 ^ 67);
                            if (var9 != 0) {
                              break L3;
                            } else {
                              if (var9 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        break L3;
                      }
                      break L0;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L5: {
                  var8 = decompiledCaughtException;
                  ud.a((String) null, var8, param6 ^ 3);
                  ((cd) this).a(param6 + -6472, "crash");
                  break L5;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_23_0 = (RuntimeException) var8_ref;
                stackOut_23_1 = new StringBuilder().append("cd.GA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
                stackIn_26_0 = stackOut_23_0;
                stackIn_26_1 = stackOut_23_1;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                if (param4 == null) {
                  stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                  stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                  stackOut_26_2 = "null";
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  break L6;
                } else {
                  stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                  stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                  stackOut_24_2 = "{...}";
                  stackIn_27_0 = stackOut_24_0;
                  stackIn_27_1 = stackOut_24_1;
                  stackIn_27_2 = stackOut_24_2;
                  break L6;
                }
              }
              throw pf.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param5 + 44 + param6 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
            sd.field_g = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("cd.focusLost(");
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
          throw pf.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2) {
        try {
            kb.field_r = param2;
            rf.field_a = param1;
            if (param0 != -25343) {
                cd.c(true);
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "cd.CA(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
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
                if (!((cd) this).field_i) {
                  L1: {
                    if (param0 == -6469) {
                      break L1;
                    } else {
                      ((cd) this).run();
                      break L1;
                    }
                  }
                  ((cd) this).field_i = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L2: {
                      Object discarded$1 = eb.a("loggedout", rl.a((byte) -80), -250);
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
                      ((cd) this).getAppletContext().showDocument(new java.net.URL(((cd) this).getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
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
                stackOut_13_1 = new StringBuilder().append("cd.FA(").append(param0).append(44);
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
              throw pf.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -11) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            L2: {
              var2_long = lj.a((byte) -113);
              var4 = bh.field_q[qj.field_K];
              bh.field_q[qj.field_K] = var2_long;
              if (0L == var4) {
                break L2;
              } else {
                if ((var4 ^ -1L) > (var2_long ^ -1L)) {
                  var6_int = (int)(-var4 + var2_long);
                  ak.field_c = (32000 - -(var6_int >> -1097305407)) / var6_int;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              qj.field_K = 31 & 1 + qj.field_K;
              int fieldTemp$2 = qc.field_b;
              qc.field_b = qc.field_b + 1;
              if (50 < fieldTemp$2) {
                L4: {
                  qc.field_b = qc.field_b - 50;
                  j.field_e = true;
                  ol.field_e.setSize(ki.field_a, gm.field_nb);
                  ol.field_e.setVisible(true);
                  if (cb.field_t == null) {
                    break L4;
                  } else {
                    if (null != ug.field_b) {
                      break L4;
                    } else {
                      var6 = cb.field_t.getInsets();
                      ol.field_e.setLocation(va.field_u + var6.left, rg.field_p + var6.top);
                      if (!fleas.field_A) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ol.field_e.setLocation(va.field_u, rg.field_p);
                break L3;
              } else {
                break L3;
              }
            }
            ((cd) this).d(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "cd.S(" + param0 + 41);
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
            ((cd) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("cd.update(");
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
          throw pf.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    static long a(long param0, long param1) {
        RuntimeException var4 = null;
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_0_0 = 0L;
        try {
          L0: {
            stackOut_0_0 = param0 | param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var4, "cd.U(" + param0 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    public final void run() {
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
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        if (null == ce.field_r) {
                          break L5;
                        } else {
                          L6: {
                            var1 = (Object) (Object) ce.field_r.toLowerCase();
                            if (((String) var1).indexOf("sun") != -1) {
                              break L6;
                            } else {
                              if ((((String) var1).indexOf("apple") ^ -1) != 0) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L7: {
                            L8: {
                              var2 = ce.field_n;
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
                            ((cd) this).a(-6469, "wrongjava");
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
                                if (var2.length() <= var3) {
                                  break L10;
                                } else {
                                  stackOut_49_0 = em.a((byte) -99, var2.charAt(var3));
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
                              if (!ii.a(12969, (CharSequence) (Object) var4)) {
                                break L5;
                              } else {
                                if (-11 < (pl.a((CharSequence) (Object) var4, -9816) ^ -1)) {
                                  ((cd) this).a(-6469, "wrongjava");
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
                        }
                      }
                      if (ce.field_n == null) {
                        break L3;
                      } else {
                        stackOut_66_0 = ce.field_n.startsWith("1.");
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
                            if ((ce.field_n.length() ^ -1) >= (var1_int ^ -1)) {
                              break L13;
                            } else {
                              var3 = ce.field_n.charAt(var1_int);
                              stackOut_71_0 = 48;
                              stackOut_71_1 = var3;
                              stackIn_80_0 = stackOut_71_0;
                              stackIn_80_1 = stackOut_71_1;
                              stackIn_72_0 = stackOut_71_0;
                              stackIn_72_1 = stackOut_71_1;
                              if (var5 != 0) {
                                break L12;
                              } else {
                                if (stackIn_72_0 > stackIn_72_1) {
                                  break L13;
                                } else {
                                  if (-58 > (var3 ^ -1)) {
                                    break L13;
                                  } else {
                                    var1_int++;
                                    var2_int = 10 * var2_int - (48 + -var3);
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
                          stackOut_79_0 = -6;
                          stackOut_79_1 = var2_int ^ -1;
                          stackIn_80_0 = stackOut_79_0;
                          stackIn_80_1 = stackOut_79_1;
                          break L12;
                        }
                        if (stackIn_80_0 < stackIn_80_1) {
                          break L3;
                        } else {
                          tj.field_d = true;
                          break L3;
                        }
                      }
                    }
                  }
                  L14: {
                    var1 = (Object) (Object) pf.field_c;
                    if (sd.field_j != null) {
                      var1 = (Object) (Object) sd.field_j;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    var2_ref = ce.field_b;
                    if (var2_ref != null) {
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
                  ea.a(8216);
                  ((cd) this).c(116);
                  gi.field_b = kb.a((java.awt.Component) (Object) ol.field_e, ki.field_a, gm.field_nb, 1024);
                  ((cd) this).a((byte) -14);
                  l.field_b = wf.c(0);
                  L18: while (true) {
                    L19: {
                      L20: {
                        if (0L == dh.field_a) {
                          break L20;
                        } else {
                          stackOut_95_0 = (dh.field_a < lj.a((byte) -93) ? -1 : (dh.field_a == lj.a((byte) -93) ? 0 : 1));
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
                      w.field_r = l.field_b.b(0, na.field_f);
                      stackOut_99_0 = 0;
                      stackIn_101_0 = stackOut_99_0;
                      break L19;
                    }
                    var3 = stackIn_101_0;
                    L21: while (true) {
                      L22: {
                        L23: {
                          if (w.field_r <= var3) {
                            break L23;
                          } else {
                            this.a(false);
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
                        this.b(-11);
                        aj.a((byte) -60, (Object) (Object) ol.field_e, fg.field_q);
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
                ud.a((String) null, (Throwable) var1, 0);
                ((cd) this).a(-6469, "crash");
                break L24;
              }
            }
            this.a(true, (byte) 95);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var1 = (Object) (Object) decompiledCaughtException;
          throw pf.a((Throwable) var1, "cd.run()");
        }
    }

    abstract void d(boolean param0);

    abstract void b(byte param0);

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) pf.field_c != this) {
                break L1;
              } else {
                if (o.field_l) {
                  break L1;
                } else {
                  dh.field_a = 0L;
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pf.a((Throwable) (Object) runtimeException, "cd.start()");
        }
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
            if (cb.field_t == null) {
              L1: {
                if (sd.field_j == null) {
                  break L1;
                } else {
                  if ((Object) (Object) sd.field_j == this) {
                    break L1;
                  } else {
                    stackOut_7_0 = sd.field_j.getParameter(param0);
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
            stackOut_11_1 = new StringBuilder().append("cd.getParameter(");
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
          throw pf.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_10_0;
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
            if (null != cb.field_t) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.net.URL) (Object) stackIn_4_0;
            } else {
              L1: {
                if (null == sd.field_j) {
                  break L1;
                } else {
                  if (this == (Object) (Object) sd.field_j) {
                    break L1;
                  } else {
                    stackOut_9_0 = sd.field_j.getDocumentBase();
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
          throw pf.a((Throwable) (Object) var1, "cd.getDocumentBase()");
        }
        return stackIn_12_0;
    }

    abstract void a(byte param0);

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
              if ((Object) (Object) pf.field_c != this) {
                break L1;
              } else {
                if (o.field_l) {
                  break L1;
                } else {
                  L2: {
                    j.field_e = true;
                    if (!tj.field_d) {
                      break L2;
                    } else {
                      if (1000L >= lj.a((byte) -109) + -cg.field_z) {
                        break L2;
                      } else {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (null == var2) {
                            break L3;
                          } else {
                            if (o.field_m > var2.width) {
                              break L2;
                            } else {
                              if (var2.height >= di.field_c) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        h.field_h = true;
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
            stackOut_22_1 = new StringBuilder().append("cd.paint(");
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
          throw pf.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    private final void a(boolean param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Object var6 = null;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = lj.a((byte) -88);
              if (!param0) {
                break L1;
              } else {
                ((cd) this).windowActivated((java.awt.event.WindowEvent) null);
                break L1;
              }
            }
            L2: {
              var4 = ub.field_c[r.field_l];
              ub.field_c[r.field_l] = var2_long;
              r.field_l = 31 & 1 + r.field_l;
              if (var4 == 0L) {
                break L2;
              } else {
                if (var2_long > var4) {
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            var6 = this;
            synchronized (var6) {
              L3: {
                ha.field_k = sd.field_g;
                break L3;
              }
            }
            ((cd) this).d(21434);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw pf.a((Throwable) (Object) runtimeException, "cd.DA(" + param0 + 41);
        }
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) pf.field_c != this) {
                break L1;
              } else {
                if (o.field_l) {
                  break L1;
                } else {
                  dh.field_a = lj.a((byte) -20);
                  vh.a(5000L, -112);
                  fg.field_i = null;
                  this.a(false, (byte) 122);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pf.a((Throwable) (Object) runtimeException, "cd.destroy()");
        }
    }

    final boolean b(boolean param0) {
        return true;
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
            ((cd) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("cd.windowClosing(");
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
          throw pf.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
            sd.field_j = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("cd.provideLoaderApplet(");
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
          throw pf.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    protected cd() {
        ((cd) this).field_i = false;
    }

    final static void a(String param0, fa param1, pi param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if ((param0.length() ^ -1) >= (var7 ^ -1)) {
                    break L3;
                  } else {
                    var8 = param0.charAt(var7);
                    stackOut_3_0 = var8;
                    stackOut_3_1 = 60;
                    stackIn_24_0 = stackOut_3_0;
                    stackIn_24_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 == stackIn_4_1) {
                          var6 = (var5_int >> -596710712) - (-param2.field_d[0] + -param1.b(param0.substring(0, var7)));
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          if (-1 == var6) {
                            break L6;
                          } else {
                            param2.field_d[var7] = var6;
                            if (var9 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (32 != var8) {
                            break L7;
                          } else {
                            var5_int = var5_int + param4;
                            break L7;
                          }
                        }
                        param2.field_d[var7] = (var5_int >> 1637257128) + (param2.field_d[0] - -param1.b(param0.substring(0, 1 + var7)) - param1.a((char) var8));
                        break L5;
                      }
                      L8: {
                        if (62 == var8) {
                          var6 = -1;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var7++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_23_0 = param3;
                stackOut_23_1 = 30988;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                break L2;
              }
              L9: {
                if (stackIn_24_0 == stackIn_24_1) {
                  break L9;
                } else {
                  cd.provideLoaderApplet((java.applet.Applet) null);
                  break L9;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var5;
            stackOut_28_1 = new StringBuilder().append("cd.T(");
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L10;
            }
          }
          L11: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44);
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L11;
            }
          }
          L12: {
            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(44);
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L12;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L12;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) pf.field_c != this) {
                break L1;
              } else {
                if (!o.field_l) {
                  dh.field_a = lj.a((byte) -35) - -4000L;
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
          throw pf.a((Throwable) (Object) runtimeException, "cd.stop()");
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
