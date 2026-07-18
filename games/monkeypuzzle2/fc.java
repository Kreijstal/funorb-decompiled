/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.AppletContext;
import java.net.URL;

public abstract class fc extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_l;
    static te field_j;
    static String field_m;
    static te field_g;
    static va field_k;
    static String field_b;
    public static boolean field_c;
    public static int field_e;
    public static boolean field_f;
    public static int field_i;
    public static int field_h;
    public static int field_a;
    public static int field_d;

    final boolean b(byte param0) {
        return true;
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
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
            hh.field_o = true;
            gb.field_j = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fc.focusGained(");
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
          throw la.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
            hh.field_o = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fc.focusLost(");
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
          throw la.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
            ((fc) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fc.windowClosing(");
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
          throw la.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void b(boolean param0);

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
            if (hk.field_e == null) {
              L1: {
                if (ll.field_b == null) {
                  break L1;
                } else {
                  if (this != (Object) (Object) ll.field_b) {
                    stackOut_9_0 = ll.field_b.getAppletContext();
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
          throw la.a((Throwable) (Object) var1, "fc.getAppletContext()");
        }
        return stackIn_12_0;
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) m.field_f != this) {
                break L1;
              } else {
                if (dl.field_b) {
                  break L1;
                } else {
                  hj.field_db = pf.a(0);
                  int discarded$2 = 0;
                  em.a(5000L);
                  fk.field_c = null;
                  this.a(false, false);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw la.a((Throwable) (Object) runtimeException, "fc.destroy()");
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
            boolean stackIn_67_0 = false;
            int stackIn_98_0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_65_0 = false;
            int stackOut_96_0 = 0;
            var5 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        if (null != md.field_l) {
                          L4: {
                            var1 = (Object) (Object) md.field_l.toLowerCase();
                            if (((String) var1).indexOf("sun") != -1) {
                              break L4;
                            } else {
                              if (((String) var1).indexOf("apple") == -1) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          L5: {
                            var2 = md.field_m;
                            if (var2.equals((Object) (Object) "1.1")) {
                              break L5;
                            } else {
                              if (var2.startsWith("1.1.")) {
                                break L5;
                              } else {
                                if (var2.equals((Object) (Object) "1.2")) {
                                  break L5;
                                } else {
                                  if (var2.startsWith("1.2.")) {
                                    break L5;
                                  } else {
                                    if (var2.equals((Object) (Object) "1.3")) {
                                      break L5;
                                    } else {
                                      if (var2.startsWith("1.3.")) {
                                        break L5;
                                      } else {
                                        if (var2.equals((Object) (Object) "1.4")) {
                                          break L5;
                                        } else {
                                          if (var2.startsWith("1.4.")) {
                                            break L5;
                                          } else {
                                            if (var2.equals((Object) (Object) "1.5")) {
                                              break L5;
                                            } else {
                                              if (var2.startsWith("1.5.")) {
                                                break L5;
                                              } else {
                                                if (var2.equals((Object) (Object) "1.6.0")) {
                                                  break L5;
                                                } else {
                                                  if (var2.startsWith("1.6.0_")) {
                                                    var3 = 6;
                                                    L6: while (true) {
                                                      L7: {
                                                        if (var3 >= var2.length()) {
                                                          break L7;
                                                        } else {
                                                          if (!re.a(-49, var2.charAt(var3))) {
                                                            break L7;
                                                          } else {
                                                            var3++;
                                                            continue L6;
                                                          }
                                                        }
                                                      }
                                                      var4 = var2.substring(6, var3);
                                                      if (!ra.a((CharSequence) (Object) var4, (byte) -116)) {
                                                        break L3;
                                                      } else {
                                                        if (vi.a(63, (CharSequence) (Object) var4) < 10) {
                                                          ((fc) this).a((byte) 123, "wrongjava");
                                                          break L2;
                                                        } else {
                                                          break L3;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    break L3;
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
                          }
                          ((fc) this).a((byte) 75, "wrongjava");
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                      L8: {
                        if (null == md.field_m) {
                          break L8;
                        } else {
                          stackOut_65_0 = md.field_m.startsWith("1.");
                          stackIn_67_0 = stackOut_65_0;
                          if (!stackIn_67_0) {
                            break L8;
                          } else {
                            var1_int = 2;
                            var2_int = 0;
                            L9: while (true) {
                              L10: {
                                if (~var1_int <= ~md.field_m.length()) {
                                  break L10;
                                } else {
                                  var3 = md.field_m.charAt(var1_int);
                                  if (var3 < 48) {
                                    break L10;
                                  } else {
                                    if (var3 <= 57) {
                                      var1_int++;
                                      var2_int = var2_int * 10 + (var3 - 48);
                                      continue L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              if (5 <= var2_int) {
                                sd.field_c = true;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                      L11: {
                        var1 = (Object) (Object) m.field_f;
                        if (ll.field_b == null) {
                          break L11;
                        } else {
                          var1 = (Object) (Object) ll.field_b;
                          break L11;
                        }
                      }
                      L12: {
                        var2_ref = md.field_h;
                        if (var2_ref != null) {
                          try {
                            L13: {
                              Object discarded$4 = var2_ref.invoke(var1, new Object[1]);
                              break L13;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L14: {
                              var3_ref_Throwable = decompiledCaughtException;
                              break L14;
                            }
                          }
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      pf.a(true);
                      ((fc) this).a(false);
                      ac.field_a = ub.a((byte) -85, ub.field_b, (java.awt.Component) (Object) ie.field_e, lb.field_z);
                      ((fc) this).a(-17);
                      int discarded$5 = -20601;
                      ne.field_c = il.a();
                      L15: while (true) {
                        L16: {
                          if (hj.field_db == 0L) {
                            break L16;
                          } else {
                            if (~pf.a(0) <= ~hj.field_db) {
                              break L2;
                            } else {
                              break L16;
                            }
                          }
                        }
                        bg.field_E = ne.field_c.a(ed.field_d, -128);
                        stackOut_96_0 = 0;
                        stackIn_98_0 = stackOut_96_0;
                        var3 = stackIn_98_0;
                        L17: while (true) {
                          if (var3 >= bg.field_E) {
                            int discarded$6 = 57;
                            this.b();
                            em.a((Object) (Object) ie.field_e, (byte) -101, rc.field_k);
                            continue L15;
                          } else {
                            int discarded$7 = -85;
                            this.a();
                            var3++;
                            continue L17;
                          }
                        }
                      }
                    }
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L18: {
                    var1 = (Object) (Object) decompiledCaughtException;
                    kk.a((String) null, (byte) 124, (Throwable) var1);
                    ((fc) this).a((byte) 98, "crash");
                    break L18;
                  }
                }
                this.a(false, true);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw la.a((Throwable) var1, "fc.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException var2 = null;
        java.awt.Rectangle var2_ref = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) m.field_f) {
                break L1;
              } else {
                if (!dl.field_b) {
                  L2: {
                    gb.field_j = true;
                    if (!sd.field_c) {
                      break L2;
                    } else {
                      if (pf.a(0) - ah.field_e > 1000L) {
                        L3: {
                          var2_ref = param0.getClipBounds();
                          if (var2_ref == null) {
                            break L3;
                          } else {
                            if (var2_ref.width < kk.field_b) {
                              break L2;
                            } else {
                              if (~var2_ref.height <= ~ih.field_b) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        aj.field_c = true;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
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
          L4: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("fc.paint(");
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    public static void c(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_j = null;
              if (!param0) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            field_k = null;
            field_g = null;
            field_b = null;
            field_m = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "fc.EA(" + param0 + ')');
        }
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
            if (hk.field_e != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String) (Object) stackIn_4_0;
            } else {
              L1: {
                if (null == ll.field_b) {
                  break L1;
                } else {
                  if (this != (Object) (Object) ll.field_b) {
                    stackOut_11_0 = ll.field_b.getParameter(param0);
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
            stackOut_15_1 = new StringBuilder().append("fc.getParameter(");
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
          throw la.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_14_0;
    }

    abstract void c(int param0);

    private final void a(boolean param0, boolean param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Object var3_ref = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3_ref = this;
            synchronized (var3_ref) {
              L1: {
                if (!dl.field_b) {
                  dl.field_b = true;
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (ll.field_b != null) {
                ll.field_b.destroy();
                break L2;
              } else {
                break L2;
              }
            }
            try {
              L3: {
                ((fc) this).b(false);
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
              if (ie.field_e == null) {
                break L5;
              } else {
                try {
                  L6: {
                    ie.field_e.removeFocusListener((java.awt.event.FocusListener) this);
                    ie.field_e.getParent().remove((java.awt.Component) (Object) ie.field_e);
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
              if (null != rc.field_k) {
                try {
                  L9: {
                    rc.field_k.a((byte) -84);
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
              ((fc) this).c((byte) 26);
              if (null == hk.field_e) {
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
                    throwable = decompiledCaughtException;
                    break L13;
                  }
                }
                break L11;
              }
            }
            System.out.println("Shutdown complete - clean:" + param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw la.a((Throwable) (Object) runtimeException, "fc.DA(" + false + ',' + param1 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (hk.field_e == null) {
          L0: {
            if (null == ll.field_b) {
              break L0;
            } else {
              if (this == (Object) (Object) ll.field_b) {
                break L0;
              } else {
                return ll.field_b.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        } else {
          return null;
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_9_0 = null;
        java.net.URL stackOut_11_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (hk.field_e == null) {
              L1: {
                if (null == ll.field_b) {
                  break L1;
                } else {
                  if ((Object) (Object) ll.field_b != this) {
                    stackOut_9_0 = ll.field_b.getDocumentBase();
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_11_0 = super.getDocumentBase();
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (java.net.URL) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "fc.getDocumentBase()");
        }
        return stackIn_12_0;
    }

    final static java.net.URL a(String param0, java.net.URL param1, String param2, int param3, int param4) {
        try {
            RuntimeException var5 = null;
            int var5_int = 0;
            String var6 = null;
            int var7 = 0;
            int var8_int = 0;
            StringBuilder var8 = null;
            Exception var9 = null;
            int var10 = 0;
            java.net.URL stackIn_60_0 = null;
            java.net.URL stackIn_62_0 = null;
            RuntimeException stackIn_64_0 = null;
            StringBuilder stackIn_64_1 = null;
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            String stackIn_67_2 = null;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            RuntimeException stackIn_71_0 = null;
            StringBuilder stackIn_71_1 = null;
            String stackIn_71_2 = null;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            RuntimeException stackIn_75_0 = null;
            StringBuilder stackIn_75_1 = null;
            String stackIn_75_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_59_0 = null;
            java.net.URL stackOut_61_0 = null;
            RuntimeException stackOut_63_0 = null;
            StringBuilder stackOut_63_1 = null;
            RuntimeException stackOut_66_0 = null;
            StringBuilder stackOut_66_1 = null;
            String stackOut_66_2 = null;
            RuntimeException stackOut_64_0 = null;
            StringBuilder stackOut_64_1 = null;
            String stackOut_64_2 = null;
            RuntimeException stackOut_67_0 = null;
            StringBuilder stackOut_67_1 = null;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            String stackOut_70_2 = null;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            String stackOut_68_2 = null;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            RuntimeException stackOut_74_0 = null;
            StringBuilder stackOut_74_1 = null;
            String stackOut_74_2 = null;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            String stackOut_72_2 = null;
            var10 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              var5_int = -123 / ((-26 - param4) / 60);
              var6 = param1.getFile();
              var7 = 0;
              L0: while (true) {
                L1: {
                  if (var6.regionMatches(var7, "/l=", 0, 3)) {
                    var8_int = var6.indexOf('/', var7 - -1);
                    if (var8_int >= 0) {
                      if (0 <= param3) {
                        var6 = var6.substring(0, var7) + var6.substring(var8_int);
                        continue L0;
                      } else {
                        var7 = var8_int;
                        continue L0;
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (!var6.regionMatches(var7, "/a=", 0, 3)) {
                    break L2;
                  } else {
                    var8_int = var6.indexOf('/', var7 - -1);
                    if (var8_int >= 0) {
                      var7 = var8_int;
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var6.regionMatches(var7, "/p=", 0, 3)) {
                    var8_int = var6.indexOf('/', var7 - -1);
                    if (var8_int >= 0) {
                      if (null == param0) {
                        var7 = var8_int;
                        continue L0;
                      } else {
                        var6 = var6.substring(0, var7) + var6.substring(var8_int);
                        continue L0;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    if (var6.regionMatches(var7, "/s=", 0, 3)) {
                      break L5;
                    } else {
                      if (var6.regionMatches(var7, "/c=", 0, 3)) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var8_int = var6.indexOf('/', var7 + 1);
                  if (var8_int < 0) {
                    break L4;
                  } else {
                    if (null == param2) {
                      var7 = var8_int;
                      continue L0;
                    } else {
                      var6 = var6.substring(0, var7) + var6.substring(var8_int);
                      continue L0;
                    }
                  }
                }
                L6: {
                  var8 = new StringBuilder(var7);
                  StringBuilder discarded$9 = var8.append(var6.substring(0, var7));
                  if (param3 <= 0) {
                    break L6;
                  } else {
                    StringBuilder discarded$10 = var8.append("/l=");
                    StringBuilder discarded$11 = var8.append(Integer.toString(param3));
                    break L6;
                  }
                }
                L7: {
                  if (param0 == null) {
                    break L7;
                  } else {
                    if (param0.length() > 0) {
                      StringBuilder discarded$12 = var8.append("/p=");
                      StringBuilder discarded$13 = var8.append(param0);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (null == param2) {
                    break L8;
                  } else {
                    if (param2.length() <= 0) {
                      break L8;
                    } else {
                      StringBuilder discarded$14 = var8.append("/s=");
                      StringBuilder discarded$15 = var8.append(param2);
                      break L8;
                    }
                  }
                }
                L9: {
                  if (var7 < var6.length()) {
                    StringBuilder discarded$16 = var8.append(var6.substring(var7, var6.length()));
                    break L9;
                  } else {
                    StringBuilder discarded$17 = var8.append('/');
                    break L9;
                  }
                }
                try {
                  L10: {
                    stackOut_59_0 = new java.net.URL(param1, var8.toString());
                    stackIn_60_0 = stackOut_59_0;
                    break L10;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var9 = (Exception) (Object) decompiledCaughtException;
                  var9.printStackTrace();
                  stackOut_61_0 = (java.net.URL) param1;
                  stackIn_62_0 = stackOut_61_0;
                  return stackIn_62_0;
                }
                return stackIn_60_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L11: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_63_0 = (RuntimeException) var5;
                stackOut_63_1 = new StringBuilder().append("fc.LA(");
                stackIn_66_0 = stackOut_63_0;
                stackIn_66_1 = stackOut_63_1;
                stackIn_64_0 = stackOut_63_0;
                stackIn_64_1 = stackOut_63_1;
                if (param0 == null) {
                  stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
                  stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
                  stackOut_66_2 = "null";
                  stackIn_67_0 = stackOut_66_0;
                  stackIn_67_1 = stackOut_66_1;
                  stackIn_67_2 = stackOut_66_2;
                  break L11;
                } else {
                  stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
                  stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
                  stackOut_64_2 = "{...}";
                  stackIn_67_0 = stackOut_64_0;
                  stackIn_67_1 = stackOut_64_1;
                  stackIn_67_2 = stackOut_64_2;
                  break L11;
                }
              }
              L12: {
                stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
                stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');
                stackIn_70_0 = stackOut_67_0;
                stackIn_70_1 = stackOut_67_1;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                if (param1 == null) {
                  stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
                  stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
                  stackOut_70_2 = "null";
                  stackIn_71_0 = stackOut_70_0;
                  stackIn_71_1 = stackOut_70_1;
                  stackIn_71_2 = stackOut_70_2;
                  break L12;
                } else {
                  stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
                  stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
                  stackOut_68_2 = "{...}";
                  stackIn_71_0 = stackOut_68_0;
                  stackIn_71_1 = stackOut_68_1;
                  stackIn_71_2 = stackOut_68_2;
                  break L12;
                }
              }
              L13: {
                stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
                stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
                stackIn_74_0 = stackOut_71_0;
                stackIn_74_1 = stackOut_71_1;
                stackIn_72_0 = stackOut_71_0;
                stackIn_72_1 = stackOut_71_1;
                if (param2 == null) {
                  stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
                  stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
                  stackOut_74_2 = "null";
                  stackIn_75_0 = stackOut_74_0;
                  stackIn_75_1 = stackOut_74_1;
                  stackIn_75_2 = stackOut_74_2;
                  break L13;
                } else {
                  stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
                  stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
                  stackOut_72_2 = "{...}";
                  stackIn_75_0 = stackOut_72_0;
                  stackIn_75_1 = stackOut_72_1;
                  stackIn_75_2 = stackOut_72_2;
                  break L13;
                }
              }
              throw la.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void d(int param0);

    private final void b() {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = pf.a(0);
              var4 = dl.field_a[bh.field_f];
              dl.field_a[bh.field_f] = var2_long;
              if (var4 == 0L) {
                break L1;
              } else {
                if (~var2_long < ~var4) {
                  var6_int = (int)(var2_long - var4);
                  s.field_T = (32000 - -(var6_int >> 1)) / var6_int;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            bh.field_f = bh.field_f + 1 & 31;
            L2: {
              int fieldTemp$1 = ud.field_d;
              ud.field_d = ud.field_d + 1;
              if (fieldTemp$1 > 50) {
                L3: {
                  gb.field_j = true;
                  ud.field_d = ud.field_d - 50;
                  ie.field_e.setSize(ub.field_b, lb.field_z);
                  ie.field_e.setVisible(true);
                  if (hk.field_e == null) {
                    break L3;
                  } else {
                    if (b.field_i != null) {
                      break L3;
                    } else {
                      var6 = hk.field_e.getInsets();
                      ie.field_e.setLocation(var6.left + ue.field_D, var6.top + wi.field_c);
                      break L2;
                    }
                  }
                }
                ie.field_e.setLocation(ue.field_D, wi.field_c);
                break L2;
              } else {
                break L2;
              }
            }
            ((fc) this).d(-25976);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "fc.MA(" + 57 + ')');
        }
    }

    final static void a(mk param0, byte param1, int param2) {
        hb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              var3 = gf.field_c;
              var3.b(true, param2);
              var3.field_h = var3.field_h + 1;
              var4 = var3.field_h;
              var3.b(1, -49152);
              if (param1 > 106) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            L2: {
              if (null == param0.field_g) {
                var3.b(0, -49152);
                break L2;
              } else {
                var3.b(param0.field_g.length, -49152);
                var3.b(param0.field_g, param0.field_g.length, -2, 0);
                break L2;
              }
            }
            int discarded$1 = var3.a((byte) -76, var4);
            var3.field_h = var3.field_h - 4;
            param0.field_e = var3.e(126);
            var3.a(-var4 + var3.field_h, (byte) 29);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("fc.KA(");
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(mj param0, byte param1, ad param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              ea.field_b = gg.c(param1 + -111) * param3 / 1000;
              if (param1 == 111) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            ed.a(param2, param1 ^ 31);
            nc.a(param2, 2);
            dl.a(param1 ^ 11490, param2);
            int discarded$4 = 1;
            cc.b();
            int discarded$5 = 15;
            cm.a();
            uj.field_i = -ea.field_b;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("fc.IA(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ')');
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) m.field_f) {
                break L1;
              } else {
                if (!dl.field_b) {
                  hj.field_db = 0L;
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
          throw la.a((Throwable) (Object) runtimeException, "fc.start()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    private final void a() {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        int var6_int = 0;
        Object var6 = null;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = pf.a(0);
              var4 = ve.field_w[fe.field_d];
              ve.field_w[fe.field_d] = var2_long;
              if (var4 == 0L) {
                break L1;
              } else {
                if (var2_long > var4) {
                  var6_int = (int)(-var4 + var2_long);
                  jf.field_g = (32000 + (var6_int >> 1)) / var6_int;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            fe.field_d = 1 + fe.field_d & 31;
            var6 = this;
            synchronized (var6) {
              L2: {
                ke.field_a = hh.field_o;
                break L2;
              }
            }
            ((fc) this).c(15245);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "fc.GA(" + -85 + ')');
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
            ((fc) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fc.update(");
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
          throw la.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5, byte param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            ic var8_ref2 = null;
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
            var9 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              try {
                L0: {
                  L1: {
                    if (param6 == -48) {
                      break L1;
                    } else {
                      field_g = null;
                      break L1;
                    }
                  }
                  if (null != m.field_f) {
                    nf.field_N = nf.field_N + 1;
                    if (nf.field_N < 3) {
                      ((fc) this).getAppletContext().showDocument(((fc) this).getDocumentBase(), "_self");
                      return;
                    } else {
                      ((fc) this).a((byte) 75, "alreadyloaded");
                      return;
                    }
                  } else {
                    lb.field_z = param3;
                    ih.field_b = param3;
                    ub.field_b = param1;
                    kk.field_b = param1;
                    wi.field_c = 0;
                    ue.field_D = 0;
                    kd.field_c = param2;
                    m.field_f = (fc) this;
                    int discarded$3 = 0;
                    ni.field_e = ii.a();
                    md dupTemp$4 = new md(param4, param5, param0, true);
                    rc.field_k = dupTemp$4;
                    fk.field_c = dupTemp$4;
                    var8_ref2 = rc.field_k.a((Runnable) this, 1, 0);
                    L2: while (true) {
                      if (var8_ref2.field_g != 0) {
                        break L0;
                      } else {
                        int discarded$5 = 0;
                        em.a(10L);
                        continue L2;
                      }
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var8 = decompiledCaughtException;
                  kk.a((String) null, (byte) 78, var8);
                  ((fc) this).a((byte) 79, "crash");
                  break L3;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_20_0 = (RuntimeException) var8_ref;
                stackOut_20_1 = new StringBuilder().append("fc.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                stackIn_23_0 = stackOut_20_0;
                stackIn_23_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param5 == null) {
                  stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                  stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                  stackOut_23_2 = "null";
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  break L4;
                } else {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "{...}";
                  stackIn_24_0 = stackOut_21_0;
                  stackIn_24_1 = stackOut_21_1;
                  stackIn_24_2 = stackOut_21_2;
                  break L4;
                }
              }
              throw la.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param6 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) m.field_f) {
                break L1;
              } else {
                if (dl.field_b) {
                  break L1;
                } else {
                  hj.field_db = 4000L + pf.a(0);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw la.a((Throwable) (Object) runtimeException, "fc.stop()");
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
            ll.field_b = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fc.provideLoaderApplet(");
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
          throw la.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    abstract void a(int param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    abstract void c(byte param0);

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public abstract void init();

    final synchronized void a(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == ie.field_e) {
                break L1;
              } else {
                ie.field_e.removeFocusListener((java.awt.event.FocusListener) this);
                ie.field_e.getParent().setBackground(java.awt.Color.black);
                ie.field_e.getParent().remove((java.awt.Component) (Object) ie.field_e);
                break L1;
              }
            }
            L2: {
              if (b.field_i != null) {
                var2 = (Object) (Object) b.field_i;
                break L2;
              } else {
                if (hk.field_e != null) {
                  var2 = (Object) (Object) hk.field_e;
                  break L2;
                } else {
                  if (ll.field_b != null) {
                    var2 = (Object) (Object) ll.field_b;
                    break L2;
                  } else {
                    var2 = (Object) (Object) m.field_f;
                    break L2;
                  }
                }
              }
            }
            L3: {
              ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
              ie.field_e = (java.awt.Canvas) (Object) new ji((java.awt.Component) this);
              java.awt.Component discarded$1 = ((java.awt.Container) var2).add((java.awt.Component) (Object) ie.field_e);
              ie.field_e.setSize(ub.field_b, lb.field_z);
              ie.field_e.setVisible(true);
              if (var2 != (Object) (Object) hk.field_e) {
                ie.field_e.setLocation(ue.field_D, wi.field_c);
                break L3;
              } else {
                var3 = hk.field_e.getInsets();
                ie.field_e.setLocation(ue.field_D + var3.left, wi.field_c + var3.top);
                break L3;
              }
            }
            ie.field_e.addFocusListener((java.awt.event.FocusListener) this);
            ie.field_e.requestFocus();
            ke.field_a = true;
            hh.field_o = true;
            gb.field_j = true;
            aj.field_c = param0;
            ah.field_e = pf.a(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw la.a((Throwable) var2, "fc.PA(" + param0 + ')');
        }
    }

    final void a(byte param0, String param1) {
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
                if (!((fc) this).field_l) {
                  L1: {
                    if (param0 >= 41) {
                      break L1;
                    } else {
                      field_k = null;
                      break L1;
                    }
                  }
                  ((fc) this).field_l = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L2: {
                      int discarded$2 = 0;
                      Object discarded$3 = mf.a(-26159, "loggedout", ii.a());
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
                      ((fc) this).getAppletContext().showDocument(new java.net.URL(((fc) this).getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
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
                stackOut_13_1 = new StringBuilder().append("fc.OA(").append(param0).append(',');
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
              throw la.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected fc() {
        ((fc) this).field_l = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new te(8, 0, 4, 1);
        field_m = "To server list";
        field_g = new te(1, 2, 2, 0);
        field_b = "This password contains your Player Name, and would be easy to guess";
    }
}
