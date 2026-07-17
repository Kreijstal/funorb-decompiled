/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.AppletContext;
import java.net.URL;

public abstract class md extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static go[] field_j;
    boolean field_b;
    static gn field_i;
    static String field_c;
    public static boolean field_h;
    public static int field_k;
    public static int field_g;
    public static boolean field_f;
    public static boolean field_a;
    public static int field_e;
    public static boolean field_d;

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) vf.field_j != this) {
                break L1;
              } else {
                if (cf.field_y) {
                  break L1;
                } else {
                  im.field_c = 4000L + bb.b(-1);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kk.a((Throwable) (Object) runtimeException, "md.stop()");
        }
    }

    public static void g(int param0) {
        field_c = null;
        field_i = null;
        if (param0 != -1) {
            return;
        }
        try {
            field_j = null;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "md.KA(" + param0 + 41);
        }
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
            if (fm.field_a == null) {
              L1: {
                if (null == ne.field_b) {
                  break L1;
                } else {
                  if ((Object) (Object) ne.field_b != this) {
                    stackOut_9_0 = ne.field_b.getAppletContext();
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
          throw kk.a((Throwable) (Object) var1, "md.getAppletContext()");
        }
        return stackIn_12_0;
    }

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
            if (fm.field_a != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.net.URL) (Object) stackIn_4_0;
            } else {
              L1: {
                if (ne.field_b == null) {
                  break L1;
                } else {
                  if ((Object) (Object) ne.field_b != this) {
                    stackOut_11_0 = ne.field_b.getDocumentBase();
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
          throw kk.a((Throwable) (Object) var1, "md.getDocumentBase()");
        }
        return stackIn_14_0;
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
            ((md) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("md.windowClosing(");
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
          throw kk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static fn a(int param0, byte[] param1) {
        fn var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_7_0 = null;
        fn stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        fn stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -24327) {
                break L1;
              } else {
                md.provideLoaderApplet((java.applet.Applet) null);
                break L1;
              }
            }
            if (null == param1) {
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (fn) (Object) stackIn_7_0;
            } else {
              var2 = new fn(param1, la.field_j, wb.field_g, nk.field_K, ad.field_d, lk.field_e);
              tk.a(false);
              stackOut_8_0 = (fn) var2;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2_ref;
            stackOut_10_1 = new StringBuilder().append("md.W(").append(param0).append(44);
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_9_0;
    }

    private final void a() {
        RuntimeException var2 = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = bb.b(-1);
              var4 = bf.field_b[d.field_e];
              bf.field_b[d.field_e] = var2_long;
              if (0L == var4) {
                break L1;
              } else {
                if (var2_long <= var4) {
                  break L1;
                } else {
                  var6_int = (int)(var2_long - var4);
                  lk.field_f = ((var6_int >> 1) + 32000) / var6_int;
                  break L1;
                }
              }
            }
            L2: {
              d.field_e = 31 & d.field_e - -1;
              int fieldTemp$1 = ek.field_j;
              ek.field_j = ek.field_j + 1;
              if (50 < fieldTemp$1) {
                L3: {
                  L4: {
                    cg.field_a = true;
                    ek.field_j = ek.field_j - 50;
                    kd.field_b.setSize(lj.field_f, g.field_i);
                    kd.field_b.setVisible(true);
                    if (null == fm.field_a) {
                      break L4;
                    } else {
                      if (null == mg.field_f) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  kd.field_b.setLocation(vm.field_Bb, ko.field_b);
                  if (HoldTheLine.field_D == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                var6 = fm.field_a.getInsets();
                kd.field_b.setLocation(var6.left + vm.field_Bb, ko.field_b + var6.top);
                break L2;
              } else {
                break L2;
              }
            }
            ((md) this).c(256);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2, "md.JA(" + 32 + 41);
        }
    }

    abstract void b(int param0);

    abstract void f(int param0);

    abstract void b(byte param0);

    public abstract void init();

    final synchronized void c(byte param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (kd.field_b != null) {
                kd.field_b.removeFocusListener((java.awt.event.FocusListener) this);
                kd.field_b.getParent().setBackground(java.awt.Color.black);
                kd.field_b.getParent().remove((java.awt.Component) (Object) kd.field_b);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (mg.field_f == null) {
                  break L3;
                } else {
                  var2 = (Object) (Object) mg.field_f;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null != fm.field_a) {
                  break L4;
                } else {
                  L5: {
                    if (ne.field_b == null) {
                      break L5;
                    } else {
                      var2 = (Object) (Object) ne.field_b;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = (Object) (Object) vf.field_j;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var2 = (Object) (Object) fm.field_a;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
                kd.field_b = (java.awt.Canvas) (Object) new mi((java.awt.Component) this);
                java.awt.Component discarded$2 = ((java.awt.Container) var2).add((java.awt.Component) (Object) kd.field_b);
                kd.field_b.setSize(lj.field_f, g.field_i);
                kd.field_b.setVisible(true);
                if (var2 == (Object) (Object) fm.field_a) {
                  break L7;
                } else {
                  kd.field_b.setLocation(vm.field_Bb, ko.field_b);
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              var3 = fm.field_a.getInsets();
              kd.field_b.setLocation(var3.left - -vm.field_Bb, ko.field_b + var3.top);
              break L6;
            }
            kd.field_b.addFocusListener((java.awt.event.FocusListener) this);
            kd.field_b.requestFocus();
            if (param0 > 25) {
              td.field_c = true;
              vk.field_a = true;
              cg.field_a = true;
              ud.field_n = false;
              n.field_n = bb.b(-1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw kk.a((Throwable) var2, "md.CA(" + param0 + 41);
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (null != fm.field_a) {
          return null;
        } else {
          L0: {
            if (ne.field_b == null) {
              break L0;
            } else {
              if (this == (Object) (Object) ne.field_b) {
                break L0;
              } else {
                return ne.field_b.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
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
            td.field_c = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("md.focusLost(");
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
          throw kk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void a(String param0, int param1) {
        try {
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            Throwable decompiledCaughtException = null;
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
                if (!((md) this).field_b) {
                  ((md) this).field_b = true;
                  System.out.println("error_game_" + param0);
                  try {
                    L1: {
                      Object discarded$1 = eo.a(21896, "loggedout", en.a(param1 ^ 182));
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
                      L4: {
                        ((md) this).getAppletContext().showDocument(new java.net.URL(((md) this).getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
                        if (param1 == 221) {
                          break L4;
                        } else {
                          field_i = null;
                          break L4;
                        }
                      }
                      break L3;
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
                stackOut_11_0 = (RuntimeException) var3_ref2;
                stackOut_11_1 = new StringBuilder().append("md.EA(");
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
                  break L6;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_15_0 = stackOut_12_0;
                  stackIn_15_1 = stackOut_12_1;
                  stackIn_15_2 = stackOut_12_2;
                  break L6;
                }
              }
              throw kk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) vf.field_j) {
                break L1;
              } else {
                if (!cf.field_y) {
                  im.field_c = 0L;
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
          throw kk.a((Throwable) (Object) runtimeException, "md.start()");
        }
    }

    abstract void a(int param0);

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
            td.field_c = true;
            cg.field_a = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("md.focusGained(");
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
          throw kk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException var2 = null;
        java.awt.Rectangle var2_ref = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) vf.field_j != this) {
                break L1;
              } else {
                if (cf.field_y) {
                  break L1;
                } else {
                  L2: {
                    cg.field_a = true;
                    if (!hl.field_b) {
                      break L2;
                    } else {
                      if (-n.field_n + bb.b(-1) > 1000L) {
                        L3: {
                          var2_ref = param0.getClipBounds();
                          if (var2_ref == null) {
                            break L3;
                          } else {
                            if (var2_ref.width < sa.field_b) {
                              break L2;
                            } else {
                              if (~rg.field_j >= ~var2_ref.height) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        ud.field_n = true;
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
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("md.paint(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L4;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
    }

    final void a(String param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            af var8_ref2 = null;
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
            var9 = HoldTheLine.field_D;
            try {
              try {
                L0: {
                  if (null == vf.field_j) {
                    L1: {
                      ko.field_b = 0;
                      vf.field_j = (md) this;
                      if (param4 < -74) {
                        break L1;
                      } else {
                        ((md) this).update((java.awt.Graphics) null);
                        break L1;
                      }
                    }
                    lj.field_f = param1;
                    sa.field_b = param1;
                    vm.field_Bb = 0;
                    im.field_a = param5;
                    g.field_i = param3;
                    rg.field_j = param3;
                    rd.field_d = en.a(105);
                    ib dupTemp$2 = new ib(param6, param0, param2, true);
                    wi.field_b = dupTemp$2;
                    te.field_d = dupTemp$2;
                    var8_ref2 = wi.field_b.a((byte) -28, 1, (Runnable) this);
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (0 != var8_ref2.field_d) {
                            break L4;
                          } else {
                            int discarded$3 = 45;
                            qe.a(10L);
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
                  } else {
                    cb.field_l = cb.field_l + 1;
                    if (cb.field_l >= 3) {
                      ((md) this).a("alreadyloaded", 221);
                      return;
                    } else {
                      ((md) this).getAppletContext().showDocument(((md) this).getDocumentBase(), "_self");
                      return;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L5: {
                  var8 = decompiledCaughtException;
                  bl.a(var8, (byte) -46, (String) null);
                  ((md) this).a("crash", 221);
                  break L5;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_23_0 = (RuntimeException) var8_ref;
                stackOut_23_1 = new StringBuilder().append("md.AA(");
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
              throw kk.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

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
                if (!cf.field_y) {
                  cf.field_y = true;
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (ne.field_b != null) {
                ne.field_b.destroy();
                break L2;
              } else {
                break L2;
              }
            }
            try {
              L3: {
                ((md) this).b(30);
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
              if (kd.field_b != null) {
                try {
                  L6: {
                    kd.field_b.removeFocusListener((java.awt.event.FocusListener) this);
                    kd.field_b.getParent().remove((java.awt.Component) (Object) kd.field_b);
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
              } else {
                break L5;
              }
            }
            L8: {
              if (null == wi.field_b) {
                break L8;
              } else {
                try {
                  L9: {
                    wi.field_b.a((byte) 55);
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
              ((md) this).f(128);
              if (fm.field_a == null) {
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
          throw kk.a((Throwable) (Object) var3_ref3, "md.GA(" + param0 + 44 + 0 + 41);
        }
    }

    private final void d() {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        Object var6 = null;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = bb.b(-1);
              var4 = lb.field_w[de.field_G];
              lb.field_w[de.field_G] = var2_long;
              de.field_G = de.field_G - -1 & 31;
              if (var4 == 0L) {
                break L1;
              } else {
                if (var2_long > var4) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var6 = this;
            synchronized (var6) {
              L2: {
                vk.field_a = td.field_c;
                break L2;
              }
            }
            ((md) this).a(-88);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2, "md.HA(" + 0 + 41);
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) vf.field_j != this) {
                break L1;
              } else {
                if (cf.field_y) {
                  break L1;
                } else {
                  im.field_c = bb.b(-1);
                  int discarded$2 = 45;
                  qe.a(5000L);
                  te.field_d = null;
                  this.a(false, 0);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kk.a((Throwable) (Object) runtimeException, "md.destroy()");
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    protected md() {
        ((md) this).field_b = false;
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
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
            ((md) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("md.update(");
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
          throw kk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        String stackOut_9_0 = null;
        String stackOut_11_0 = null;
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
            if (null != fm.field_a) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String) (Object) stackIn_4_0;
            } else {
              L1: {
                if (ne.field_b == null) {
                  break L1;
                } else {
                  if (this == (Object) (Object) ne.field_b) {
                    break L1;
                  } else {
                    stackOut_9_0 = ne.field_b.getParameter(param0);
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              }
              stackOut_11_0 = super.getParameter(param0);
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("md.getParameter(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_12_0;
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
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
            boolean stackIn_48_0 = false;
            boolean stackIn_66_0 = false;
            int stackIn_70_0 = 0;
            int stackIn_70_1 = 0;
            int stackIn_81_0 = 0;
            int stackIn_81_1 = 0;
            int stackIn_95_0 = 0;
            int stackIn_100_0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_47_0 = false;
            boolean stackOut_64_0 = false;
            int stackOut_69_0 = 0;
            int stackOut_69_1 = 0;
            int stackOut_80_0 = 0;
            int stackOut_80_1 = 0;
            int stackOut_94_0 = 0;
            int stackOut_98_0 = 0;
            var5 = HoldTheLine.field_D;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (ib.field_p == null) {
                              break L5;
                            } else {
                              L6: {
                                var1 = (Object) (Object) ib.field_p.toLowerCase();
                                if (-1 != ((String) var1).indexOf("sun")) {
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
                                  var2 = ib.field_j;
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
                                ((md) this).a("wrongjava", 221);
                                if (var5 == 0) {
                                  break L2;
                                } else {
                                  break L7;
                                }
                              }
                              if (!var2.startsWith("1.6.0_")) {
                                break L5;
                              } else {
                                var3 = 6;
                                L9: while (true) {
                                  L10: {
                                    if (~var2.length() >= ~var3) {
                                      break L10;
                                    } else {
                                      stackOut_47_0 = ii.a(48, var2.charAt(var3));
                                      stackIn_66_0 = stackOut_47_0;
                                      stackIn_48_0 = stackOut_47_0;
                                      if (var5 != 0) {
                                        break L4;
                                      } else {
                                        if (!stackIn_48_0) {
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
                                  int discarded$5 = 1;
                                  if (!ik.a((CharSequence) (Object) var4)) {
                                    break L5;
                                  } else {
                                    if (mo.a((CharSequence) (Object) var4, (byte) -116) >= 10) {
                                      break L5;
                                    } else {
                                      ((md) this).a("wrongjava", 221);
                                      if (var5 == 0) {
                                        break L2;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (null == ib.field_j) {
                            break L3;
                          } else {
                            stackOut_64_0 = ib.field_j.startsWith("1.");
                            stackIn_66_0 = stackOut_64_0;
                            break L4;
                          }
                        }
                        if (!stackIn_66_0) {
                          break L3;
                        } else {
                          var1_int = 2;
                          var2_int = 0;
                          L11: while (true) {
                            L12: {
                              L13: {
                                if (ib.field_j.length() <= var1_int) {
                                  break L13;
                                } else {
                                  var3 = ib.field_j.charAt(var1_int);
                                  stackOut_69_0 = -49;
                                  stackOut_69_1 = ~var3;
                                  stackIn_81_0 = stackOut_69_0;
                                  stackIn_81_1 = stackOut_69_1;
                                  stackIn_70_0 = stackOut_69_0;
                                  stackIn_70_1 = stackOut_69_1;
                                  if (var5 != 0) {
                                    break L12;
                                  } else {
                                    if (stackIn_70_0 < stackIn_70_1) {
                                      break L13;
                                    } else {
                                      L14: {
                                        if (57 >= var3) {
                                          break L14;
                                        } else {
                                          if (var5 == 0) {
                                            break L13;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      var1_int++;
                                      var2_int = 10 * var2_int + var3 - 48;
                                      if (var5 == 0) {
                                        continue L11;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_80_0 = ~var2_int;
                              stackOut_80_1 = -6;
                              stackIn_81_0 = stackOut_80_0;
                              stackIn_81_1 = stackOut_80_1;
                              break L12;
                            }
                            if (stackIn_81_0 > stackIn_81_1) {
                              break L3;
                            } else {
                              hl.field_b = true;
                              break L3;
                            }
                          }
                        }
                      }
                      L15: {
                        var1 = (Object) (Object) vf.field_j;
                        if (null == ne.field_b) {
                          break L15;
                        } else {
                          var1 = (Object) (Object) ne.field_b;
                          break L15;
                        }
                      }
                      L16: {
                        var2_ref = ib.field_c;
                        if (var2_ref != null) {
                          try {
                            L17: {
                              Object discarded$6 = var2_ref.invoke(var1, new Object[1]);
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
                      int discarded$7 = 0;
                      kh.a();
                      ((md) this).c((byte) 36);
                      b.field_c = rd.a(g.field_i, -89, (java.awt.Component) (Object) kd.field_b, lj.field_f);
                      ((md) this).b((byte) 101);
                      oi.field_e = od.a(false);
                      L19: while (true) {
                        L20: {
                          L21: {
                            if (im.field_c == 0L) {
                              break L21;
                            } else {
                              stackOut_94_0 = (bb.b(-1) < im.field_c ? -1 : (bb.b(-1) == im.field_c ? 0 : 1));
                              stackIn_100_0 = stackOut_94_0;
                              stackIn_95_0 = stackOut_94_0;
                              if (var5 != 0) {
                                break L20;
                              } else {
                                if (stackIn_95_0 >= 0) {
                                  break L2;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          uj.field_h = oi.field_e.b(tm.field_c, 68);
                          stackOut_98_0 = 0;
                          stackIn_100_0 = stackOut_98_0;
                          break L20;
                        }
                        var3 = stackIn_100_0;
                        L22: while (true) {
                          L23: {
                            L24: {
                              if (~var3 <= ~uj.field_h) {
                                break L24;
                              } else {
                                int discarded$8 = 0;
                                this.d();
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
                            int discarded$9 = 32;
                            this.a();
                            vn.a(0, (Object) (Object) kd.field_b, wi.field_b);
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
                    bl.a((Throwable) var1, (byte) -128, (String) null);
                    ((md) this).a("crash", 221);
                    break L25;
                  }
                }
                this.a(true, 0);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw kk.a((Throwable) var1, "md.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void c(int param0);

    final boolean e(int param0) {
        return true;
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
            ne.field_b = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("md.provideLoaderApplet(");
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
          throw kk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Passwords can only contain letters and numbers";
    }
}
