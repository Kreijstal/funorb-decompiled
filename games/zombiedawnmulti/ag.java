/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.AppletContext;
import java.net.URL;

public abstract class ag extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_f;
    static ja field_b;
    static th field_i;
    static String field_g;
    public static boolean field_d;
    public static int field_e;
    public static boolean field_a;
    public static boolean field_h;
    public static int field_k;
    public static boolean field_c;
    public static int field_j;

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
            ((ag) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ag.windowClosing(");
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
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
            fd.field_L = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ag.provideLoaderApplet(");
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
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final void a(byte param0, boolean param1) {
        Exception exception = null;
        Object var3 = null;
        Throwable var3_ref = null;
        RuntimeException var3_ref2 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3 = this;
            synchronized (var3) {
              L1: {
                if (aq.field_t) {
                  return;
                } else {
                  L2: {
                    if (param0 >= 49) {
                      break L2;
                    } else {
                      this.a((byte) 54);
                      break L2;
                    }
                  }
                  aq.field_t = true;
                  break L1;
                }
              }
            }
            L3: {
              if (fd.field_L != null) {
                fd.field_L.destroy();
                break L3;
              } else {
                break L3;
              }
            }
            try {
              L4: {
                ((ag) this).d(-18941);
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L5: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L5;
              }
            }
            L6: {
              if (dk.field_Ib != null) {
                try {
                  L7: {
                    dk.field_Ib.removeFocusListener((java.awt.event.FocusListener) this);
                    dk.field_Ib.getParent().remove((java.awt.Component) (Object) dk.field_Ib);
                    break L7;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L8: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    break L8;
                  }
                }
                break L6;
              } else {
                break L6;
              }
            }
            L9: {
              if (pl.field_J == null) {
                break L9;
              } else {
                try {
                  L10: {
                    pl.field_J.b(124);
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
              }
            }
            L12: {
              ((ag) this).c(-97);
              if (null != cg.field_m) {
                try {
                  L13: {
                    System.exit(0);
                    break L13;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L14: {
                    var3_ref = decompiledCaughtException;
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
          var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3_ref2, "ag.SA(" + param0 + ',' + param1 + ')');
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void d(int param0);

    final void a(int param0, String param1) {
        try {
            Throwable throwable = null;
            Exception exception = null;
            RuntimeException runtimeException = null;
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
                if (!((ag) this).field_f) {
                  ((ag) this).field_f = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L1: {
                      Object discarded$3 = fo.b(jl.b(param0 ^ 27200), 13093, "loggedout");
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
                      ((ag) this).getAppletContext().showDocument(new java.net.URL(((ag) this).getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
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
                    if (param0 == 27200) {
                      break L5;
                    } else {
                      field_b = null;
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
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) runtimeException;
                stackOut_13_1 = new StringBuilder().append("ag.NA(").append(param0).append(',');
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
              throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = bl.a((byte) 88);
              var4 = pj.field_K[ik.field_c];
              pj.field_K[ik.field_c] = var2_long;
              ik.field_c = 1 + ik.field_c & 31;
              if (param0 >= 84) {
                break L1;
              } else {
                ((ag) this).focusGained((java.awt.event.FocusEvent) null);
                break L1;
              }
            }
            L2: {
              if (var4 == 0L) {
                break L2;
              } else {
                if (var2_long <= var4) {
                  break L2;
                } else {
                  var6_int = (int)(-var4 + var2_long);
                  ei.field_b = (32000 + (var6_int >> 1)) / var6_int;
                  break L2;
                }
              }
            }
            var6 = this;
            synchronized (var6) {
              L3: {
                ro.field_L = df.field_P;
                break L3;
              }
            }
            ((ag) this).e(-11);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw fa.a((Throwable) (Object) runtimeException, "ag.RA(" + param0 + ')');
        }
    }

    abstract void g(int param0);

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) tg.field_i) {
                break L1;
              } else {
                if (!aq.field_t) {
                  kj.field_n = 4000L + bl.a((byte) 107);
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
          throw fa.a((Throwable) (Object) runtimeException, "ag.stop()");
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
            df.field_P = true;
            cj.field_ub = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ag.focusGained(");
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
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        ga var2 = ma.field_a;
        var2.b((byte) -35, param0);
        var2.a(-28, 1);
        if (param1 != 98) {
            return;
        }
        try {
            var2.a(param1 + 13, 3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ag.UA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void f(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != dk.field_Ib) {
                dk.field_Ib.removeFocusListener((java.awt.event.FocusListener) this);
                dk.field_Ib.getParent().setBackground(java.awt.Color.black);
                dk.field_Ib.getParent().remove((java.awt.Component) (Object) dk.field_Ib);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (ll.field_g == null) {
                  break L3;
                } else {
                  var2 = (Object) (Object) ll.field_g;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (cg.field_m == null) {
                  break L4;
                } else {
                  var2 = (Object) (Object) cg.field_m;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (fd.field_L == null) {
                  break L5;
                } else {
                  var2 = (Object) (Object) fd.field_L;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              var2 = (Object) (Object) tg.field_i;
              break L2;
            }
            if (param0 == -58) {
              L6: {
                L7: {
                  ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
                  dk.field_Ib = (java.awt.Canvas) (Object) new kq((java.awt.Component) this);
                  java.awt.Component discarded$6 = ((java.awt.Container) var2).add((java.awt.Component) (Object) dk.field_Ib);
                  dk.field_Ib.setSize(ng.field_d, pi.field_i);
                  dk.field_Ib.setVisible(true);
                  if (var2 != (Object) (Object) cg.field_m) {
                    break L7;
                  } else {
                    var3 = cg.field_m.getInsets();
                    dk.field_Ib.setLocation(bl.field_a + var3.left, var3.top - -lo.field_d);
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                dk.field_Ib.setLocation(bl.field_a, lo.field_d);
                break L6;
              }
              dk.field_Ib.addFocusListener((java.awt.event.FocusListener) this);
              dk.field_Ib.requestFocus();
              df.field_P = true;
              ro.field_L = true;
              cj.field_ub = true;
              hn.field_h = false;
              eo.field_d = bl.a((byte) 64);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw fa.a((Throwable) var2, "ag.WA(" + param0 + ')');
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
            int stackIn_95_0 = 0;
            int stackIn_100_0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_49_0 = false;
            boolean stackOut_66_0 = false;
            int stackOut_71_0 = 0;
            int stackOut_71_1 = 0;
            int stackOut_82_0 = 0;
            int stackOut_82_1 = 0;
            int stackOut_94_0 = 0;
            int stackOut_98_0 = 0;
            var5 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (null == go.field_r) {
                              break L5;
                            } else {
                              L6: {
                                var1 = (Object) (Object) go.field_r.toLowerCase();
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
                                  var2 = go.field_q;
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
                                ((ag) this).a(27200, "wrongjava");
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
                                      int discarded$6 = 85;
                                      stackOut_49_0 = vh.a(var2.charAt(var3));
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
                                  if (!ti.a((byte) -121, (CharSequence) (Object) var4)) {
                                    break L5;
                                  } else {
                                    if (md.a((CharSequence) (Object) var4, -9159) >= 10) {
                                      break L5;
                                    } else {
                                      ((ag) this).a(27200, "wrongjava");
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
                          if (go.field_q == null) {
                            break L3;
                          } else {
                            stackOut_66_0 = go.field_q.startsWith("1.");
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
                                if (~var1_int <= ~go.field_q.length()) {
                                  break L13;
                                } else {
                                  var3 = go.field_q.charAt(var1_int);
                                  stackOut_71_0 = 48;
                                  stackOut_71_1 = var3;
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
                                      var2_int = 10 * var2_int - 48 - -var3;
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
                              stackOut_82_0 = ~var2_int;
                              stackOut_82_1 = -6;
                              stackIn_83_0 = stackOut_82_0;
                              stackIn_83_1 = stackOut_82_1;
                              break L12;
                            }
                            if (stackIn_83_0 <= stackIn_83_1) {
                              mj.field_Rb = true;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      L15: {
                        var1 = (Object) (Object) tg.field_i;
                        if (fd.field_L == null) {
                          break L15;
                        } else {
                          var1 = (Object) (Object) fd.field_L;
                          break L15;
                        }
                      }
                      L16: {
                        var2_ref = go.field_h;
                        if (null == var2_ref) {
                          break L16;
                        } else {
                          try {
                            L17: {
                              Object discarded$7 = var2_ref.invoke(var1, new Object[1]);
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
                        }
                      }
                      int discarded$8 = 43;
                      wa.a();
                      ((ag) this).f(-58);
                      dl.field_h = wb.a(1, (java.awt.Component) (Object) dk.field_Ib, ng.field_d, pi.field_i);
                      ((ag) this).a(73);
                      int discarded$9 = -92;
                      kj.field_r = hn.a();
                      L19: while (true) {
                        L20: {
                          L21: {
                            if (kj.field_n == 0L) {
                              break L21;
                            } else {
                              stackOut_94_0 = (kj.field_n < bl.a((byte) 76) ? -1 : (kj.field_n == bl.a((byte) 76) ? 0 : 1));
                              stackIn_100_0 = stackOut_94_0;
                              stackIn_95_0 = stackOut_94_0;
                              if (var5 != 0) {
                                break L20;
                              } else {
                                if (stackIn_95_0 <= 0) {
                                  break L2;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          ic.field_a = kj.field_r.b(td.field_g, false);
                          stackOut_98_0 = 0;
                          stackIn_100_0 = stackOut_98_0;
                          break L20;
                        }
                        var3 = stackIn_100_0;
                        L22: while (true) {
                          L23: {
                            L24: {
                              if (ic.field_a <= var3) {
                                break L24;
                              } else {
                                this.a((byte) 114);
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
                            int discarded$10 = 0;
                            this.a();
                            de.a(pl.field_J, (byte) 99, (Object) (Object) dk.field_Ib);
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
                    int discarded$11 = 0;
                    bd.a((String) null, (Throwable) var1);
                    ((ag) this).a(27200, "crash");
                    break L25;
                  }
                }
                this.a((byte) 87, true);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw fa.a((Throwable) var1, "ag.run()");
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
              if (this != (Object) (Object) tg.field_i) {
                break L1;
              } else {
                if (aq.field_t) {
                  break L1;
                } else {
                  kj.field_n = 0L;
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) (Object) runtimeException, "ag.start()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            di var8_ref2 = null;
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
            var9 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              try {
                L0: {
                  if (null == tg.field_i) {
                    L1: {
                      pi.field_i = param4;
                      lf.field_d = param4;
                      ng.field_d = param1;
                      mi.field_Hb = param1;
                      lo.field_d = 0;
                      pn.field_b = param0;
                      bl.field_a = 0;
                      tg.field_i = (ag) this;
                      if (param3 == 32000) {
                        break L1;
                      } else {
                        field_g = null;
                        break L1;
                      }
                    }
                    aq.field_w = jl.b(0);
                    go dupTemp$2 = new go(param2, param5, param6, true);
                    pl.field_J = dupTemp$2;
                    kk.field_y = dupTemp$2;
                    var8_ref2 = pl.field_J.a(param3 ^ 32125, (Runnable) this, 1);
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (var8_ref2.field_f != 0) {
                            break L4;
                          } else {
                            vd.a(false, 10L);
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
                    wb.field_Ab = wb.field_Ab + 1;
                    if (wb.field_Ab >= 3) {
                      ((ag) this).a(param3 + -4800, "alreadyloaded");
                      return;
                    } else {
                      ((ag) this).getAppletContext().showDocument(((ag) this).getDocumentBase(), "_self");
                      return;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L5: {
                  var8 = decompiledCaughtException;
                  int discarded$3 = 0;
                  bd.a((String) null, var8);
                  ((ag) this).a(27200, "crash");
                  break L5;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_23_0 = (RuntimeException) var8_ref;
                stackOut_23_1 = new StringBuilder().append("ag.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                stackIn_26_0 = stackOut_23_0;
                stackIn_26_1 = stackOut_23_1;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                if (param5 == null) {
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
              throw fa.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param6 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        java.applet.AppletContext stackOut_7_0 = null;
        java.applet.AppletContext stackOut_9_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (null == cg.field_m) {
              L1: {
                if (fd.field_L == null) {
                  break L1;
                } else {
                  if ((Object) (Object) fd.field_L == this) {
                    break L1;
                  } else {
                    stackOut_7_0 = fd.field_L.getAppletContext();
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
              stackOut_9_0 = super.getAppletContext();
              stackIn_10_0 = stackOut_9_0;
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
          throw fa.a((Throwable) (Object) var1, "ag.getAppletContext()");
        }
        return stackIn_10_0;
    }

    private final void a() {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = bl.a((byte) 47);
              var4 = dc.field_Ib[al.field_Z];
              dc.field_Ib[al.field_Z] = var2_long;
              if (var4 == 0L) {
                break L1;
              } else {
                if (~var4 <= ~var2_long) {
                  break L1;
                } else {
                  var6_int = (int)(-var4 + var2_long);
                  ji.field_b = ((var6_int >> 1) + 32000) / var6_int;
                  break L1;
                }
              }
            }
            L2: {
              al.field_Z = al.field_Z - -1 & 31;
              int fieldTemp$1 = mq.field_r;
              mq.field_r = mq.field_r + 1;
              if (fieldTemp$1 <= 50) {
                break L2;
              } else {
                L3: {
                  cj.field_ub = true;
                  mq.field_r = mq.field_r - 50;
                  dk.field_Ib.setSize(ng.field_d, pi.field_i);
                  dk.field_Ib.setVisible(true);
                  if (null == cg.field_m) {
                    break L3;
                  } else {
                    if (ll.field_g != null) {
                      break L3;
                    } else {
                      var6 = cg.field_m.getInsets();
                      dk.field_Ib.setLocation(var6.left - -bl.field_a, lo.field_d + var6.top);
                      if (!ZombieDawnMulti.field_E) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                dk.field_Ib.setLocation(bl.field_a, lo.field_d);
                break L2;
              }
            }
            ((ag) this).g(-30169);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ag.PA(" + false + ')');
        }
    }

    public static void b(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_b = null;
              field_g = null;
              if (param0) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            field_i = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "ag.VA(" + param0 + ')');
        }
    }

    protected ag() {
        ((ag) this).field_f = false;
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (cg.field_m == null) {
          L0: {
            if (null == fd.field_L) {
              break L0;
            } else {
              if (this == (Object) (Object) fd.field_L) {
                break L0;
              } else {
                return fd.field_L.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        } else {
          return null;
        }
    }

    public abstract void init();

    final static void a(byte param0, nh param1, int param2) {
        RuntimeException runtimeException = null;
        ga var3 = null;
        int var4 = 0;
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
            var4 = 8 / ((-46 - param0) / 37);
            var3 = ma.field_a;
            var3.b((byte) -35, param2);
            var3.a(-128, 5);
            var3.a(123, 0);
            var3.a(param1.field_l, (byte) -44);
            var3.a(126, param1.field_k);
            var3.a(111, param1.field_f);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ag.OA(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ')');
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final boolean b(int param0) {
        return true;
    }

    abstract void c(int param0);

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
            if (null != cg.field_m) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.net.URL) (Object) stackIn_4_0;
            } else {
              L1: {
                if (fd.field_L == null) {
                  break L1;
                } else {
                  if (this != (Object) (Object) fd.field_L) {
                    stackOut_11_0 = fd.field_L.getDocumentBase();
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
          throw fa.a((Throwable) (Object) var1, "ag.getDocumentBase()");
        }
        return stackIn_14_0;
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
            df.field_P = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ag.focusLost(");
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
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
            if (null == cg.field_m) {
              L1: {
                if (fd.field_L == null) {
                  break L1;
                } else {
                  if (this == (Object) (Object) fd.field_L) {
                    break L1;
                  } else {
                    stackOut_7_0 = fd.field_L.getParameter(param0);
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
            stackOut_11_1 = new StringBuilder().append("ag.getParameter(");
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
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0;
    }

    abstract void e(int param0);

    abstract void a(int param0);

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) tg.field_i) {
                break L1;
              } else {
                if (aq.field_t) {
                  break L1;
                } else {
                  L2: {
                    cj.field_ub = true;
                    if (!mj.field_Rb) {
                      break L2;
                    } else {
                      if (bl.a((byte) 124) - eo.field_d <= 1000L) {
                        break L2;
                      } else {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (null == var2) {
                            break L3;
                          } else {
                            if (~var2.width > ~mi.field_Hb) {
                              break L2;
                            } else {
                              if (~var2.height > ~lf.field_d) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        hn.field_h = true;
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
            stackOut_21_0 = (RuntimeException) var2_ref;
            stackOut_21_1 = new StringBuilder().append("ag.paint(");
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
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
            ((ag) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ag.update(");
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
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) tg.field_i != this) {
                break L1;
              } else {
                if (aq.field_t) {
                  break L1;
                } else {
                  kj.field_n = bl.a((byte) 40);
                  vd.a(false, 5000L);
                  kk.field_y = null;
                  this.a((byte) 73, false);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) (Object) runtimeException, "ag.destroy()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new th();
        field_g = "Hide players in <%0>'s game";
    }
}
