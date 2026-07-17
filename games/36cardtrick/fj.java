/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.AppletContext;
import java.net.URL;

public abstract class fj extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_b;
    static String field_f;
    static String field_c;
    public static boolean field_g;
    public static int field_j;
    public static boolean field_h;
    public static int field_a;
    public static int field_i;
    public static int field_d;
    public static int field_e;

    abstract void b(byte param0);

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
            ((fj) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fj.update(");
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
          throw ma.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) jj.field_a) {
                break L1;
              } else {
                if (tk.field_q) {
                  break L1;
                } else {
                  t.field_h = 0L;
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ma.a((Throwable) (Object) runtimeException, "fj.start()");
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
            gh.field_j = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fj.focusLost(");
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
          throw ma.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        java.applet.AppletContext stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        java.applet.AppletContext stackOut_11_0 = null;
        java.applet.AppletContext stackOut_13_0 = null;
        try {
          L0: {
            if (null != q.field_g) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.applet.AppletContext) (Object) stackIn_4_0;
            } else {
              L1: {
                if (uh.field_i == null) {
                  break L1;
                } else {
                  if (this != (Object) (Object) uh.field_i) {
                    stackOut_11_0 = uh.field_i.getAppletContext();
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_13_0 = super.getAppletContext();
              stackIn_14_0 = stackOut_13_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "fj.getAppletContext()");
        }
        return stackIn_14_0;
    }

    private final void a(boolean param0, boolean param1) {
        Object var3 = null;
        Object var3_ref = null;
        Exception var3_ref2 = null;
        Throwable var3_ref3 = null;
        RuntimeException var3_ref4 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3_ref = this;
            synchronized (var3_ref) {
              L1: {
                if (!tk.field_q) {
                  tk.field_q = true;
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (uh.field_i != null) {
                uh.field_i.destroy();
                break L2;
              } else {
                break L2;
              }
            }
            try {
              L3: {
                ((fj) this).f(-58);
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var3_ref2 = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
            L5: {
              if (null != tb.field_c) {
                try {
                  L6: {
                    tb.field_c.removeFocusListener((java.awt.event.FocusListener) this);
                    tb.field_c.getParent().remove((java.awt.Component) (Object) tb.field_c);
                    break L6;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L7: {
                    var3_ref2 = (Exception) (Object) decompiledCaughtException;
                    break L7;
                  }
                }
                break L5;
              } else {
                break L5;
              }
            }
            L8: {
              if (jk.field_a != null) {
                try {
                  L9: {
                    jk.field_a.a(0);
                    break L9;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L10: {
                    var3_ref2 = (Exception) (Object) decompiledCaughtException;
                    break L10;
                  }
                }
                break L8;
              } else {
                break L8;
              }
            }
            L11: {
              ((fj) this).a(0);
              if (q.field_g == null) {
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
                    var3_ref3 = decompiledCaughtException;
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
          var3_ref4 = (RuntimeException) (Object) decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3_ref4, "fj.OB(" + param0 + 44 + 0 + 41);
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
            boolean stackIn_48_0 = false;
            boolean stackIn_66_0 = false;
            int stackIn_70_0 = 0;
            int stackIn_70_1 = 0;
            int stackIn_81_0 = 0;
            int stackIn_81_1 = 0;
            int stackIn_97_0 = 0;
            int stackIn_102_0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_47_0 = false;
            boolean stackOut_64_0 = false;
            int stackOut_69_0 = 0;
            int stackOut_69_1 = 0;
            int stackOut_80_0 = 0;
            int stackOut_80_1 = 0;
            int stackOut_96_0 = 0;
            int stackOut_100_0 = 0;
            var5 = Main.field_T;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (null == le.field_v) {
                              break L5;
                            } else {
                              L6: {
                                var1 = (Object) (Object) le.field_v.toLowerCase();
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
                                  var2 = le.field_w;
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
                                ((fj) this).a((byte) -96, "wrongjava");
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
                                      stackOut_47_0 = Main.a(-49, var2.charAt(var3));
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
                                  if (!pg.a(false, (CharSequence) (Object) var4)) {
                                    break L5;
                                  } else {
                                    if (ie.a(false, (CharSequence) (Object) var4) >= 10) {
                                      break L5;
                                    } else {
                                      ((fj) this).a((byte) -41, "wrongjava");
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
                          if (le.field_w == null) {
                            break L3;
                          } else {
                            stackOut_64_0 = le.field_w.startsWith("1.");
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
                                if (var1_int >= le.field_w.length()) {
                                  break L13;
                                } else {
                                  var3 = le.field_w.charAt(var1_int);
                                  stackOut_69_0 = var3;
                                  stackOut_69_1 = 48;
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
                                      var2_int = var3 + (-48 + 10 * var2_int);
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
                              stackOut_80_0 = ~var2_int;
                              stackOut_80_1 = -6;
                              stackIn_81_0 = stackOut_80_0;
                              stackIn_81_1 = stackOut_80_1;
                              break L12;
                            }
                            if (stackIn_81_0 > stackIn_81_1) {
                              break L3;
                            } else {
                              hi.field_a = true;
                              break L3;
                            }
                          }
                        }
                      }
                      L15: {
                        var1 = (Object) (Object) jj.field_a;
                        if (null != uh.field_i) {
                          var1 = (Object) (Object) uh.field_i;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      L16: {
                        var2_ref = le.field_g;
                        if (var2_ref != null) {
                          try {
                            L17: {
                              Object discarded$2 = var2_ref.invoke(var1, new Object[1]);
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
                      int discarded$3 = 7400;
                      ac.a();
                      ((fj) this).d(-1775094552);
                      gf.field_e = ij.a(-114, (java.awt.Component) (Object) tb.field_c, hj.field_j, gg.field_d);
                      ((fj) this).c(4405028);
                      ag.field_b = ca.a(false);
                      L19: while (true) {
                        L20: {
                          L21: {
                            if (t.field_h == 0L) {
                              break L21;
                            } else {
                              stackOut_96_0 = (id.a(127) < t.field_h ? -1 : (id.a(127) == t.field_h ? 0 : 1));
                              stackIn_102_0 = stackOut_96_0;
                              stackIn_97_0 = stackOut_96_0;
                              if (var5 != 0) {
                                break L20;
                              } else {
                                if (stackIn_97_0 >= 0) {
                                  break L2;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          de.field_c = ag.field_b.a(qb.field_f, -127);
                          stackOut_100_0 = 0;
                          stackIn_102_0 = stackOut_100_0;
                          break L20;
                        }
                        var3 = stackIn_102_0;
                        L22: while (true) {
                          L23: {
                            L24: {
                              if (de.field_c <= var3) {
                                break L24;
                              } else {
                                this.b(31);
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
                            this.e(5);
                            Main.a((Object) (Object) tb.field_c, jk.field_a, (byte) 119);
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
                    k.a((Throwable) var1, (byte) -126, (String) null);
                    ((fj) this).a((byte) -56, "crash");
                    break L25;
                  }
                }
                this.a(true, false);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw ma.a((Throwable) var1, "fj.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
              if ((Object) (Object) jj.field_a != this) {
                break L1;
              } else {
                if (!tk.field_q) {
                  t.field_h = id.a(56);
                  wk.a((byte) -123, 5000L);
                  Main.field_W = null;
                  this.a(false, false);
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
          throw ma.a((Throwable) (Object) runtimeException, "fj.destroy()");
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
            if (q.field_g != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String) (Object) stackIn_4_0;
            } else {
              L1: {
                if (uh.field_i == null) {
                  break L1;
                } else {
                  if (this != (Object) (Object) uh.field_i) {
                    stackOut_11_0 = uh.field_i.getParameter(param0);
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
            stackOut_15_1 = new StringBuilder().append("fj.getParameter(");
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
          throw ma.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_14_0;
    }

    final void a(byte param0, String param1) {
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
                if (!((fj) this).field_b) {
                  ((fj) this).field_b = true;
                  if (param0 <= -30) {
                    System.out.println("error_game_" + param1);
                    try {
                      L1: {
                        Object discarded$1 = vh.a("loggedout", -12151, mk.g(-125));
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
                        ((fj) this).getAppletContext().showDocument(new java.net.URL(((fj) this).getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
                        break L3;
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
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_12_0 = (RuntimeException) var3_ref2;
                stackOut_12_1 = new StringBuilder().append("fj.RB(").append(param0).append(44);
                stackIn_15_0 = stackOut_12_0;
                stackIn_15_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param1 == null) {
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
              throw ma.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(boolean param0);

    final synchronized void d(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Main.field_T;
        try {
          L0: {
            L1: {
              if (null != tb.field_c) {
                tb.field_c.removeFocusListener((java.awt.event.FocusListener) this);
                tb.field_c.getParent().setBackground(java.awt.Color.black);
                tb.field_c.getParent().remove((java.awt.Component) (Object) tb.field_c);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (fg.field_n != null) {
                  break L3;
                } else {
                  L4: {
                    if (q.field_g == null) {
                      break L4;
                    } else {
                      var2 = (Object) (Object) q.field_g;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (null == uh.field_i) {
                      break L5;
                    } else {
                      var2 = (Object) (Object) uh.field_i;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = (Object) (Object) jj.field_a;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = (Object) (Object) fg.field_n;
              break L2;
            }
            ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
            tb.field_c = (java.awt.Canvas) (Object) new ce((java.awt.Component) this);
            if (param0 == -1775094552) {
              L6: {
                L7: {
                  java.awt.Component discarded$7 = ((java.awt.Container) var2).add((java.awt.Component) (Object) tb.field_c);
                  tb.field_c.setSize(gg.field_d, hj.field_j);
                  tb.field_c.setVisible(true);
                  if (var2 == (Object) (Object) q.field_g) {
                    break L7;
                  } else {
                    tb.field_c.setLocation(sk.field_d, rh.field_k);
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var3 = q.field_g.getInsets();
                tb.field_c.setLocation(var3.left - -sk.field_d, var3.top + rh.field_k);
                break L6;
              }
              tb.field_c.addFocusListener((java.awt.event.FocusListener) this);
              tb.field_c.requestFocus();
              gh.field_j = true;
              r.field_q = true;
              ii.field_a = true;
              vd.field_w = false;
              ej.field_jb = id.a(33);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw ma.a((Throwable) var2, "fj.PB(" + param0 + 41);
        }
    }

    abstract void a(int param0);

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    private final void e(int param0) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_long = id.a(24);
            var4 = ak.field_P[ud.field_b];
            ak.field_P[ud.field_b] = var2_long;
            L1: {
              ud.field_b = 31 & 1 + ud.field_b;
              if (var4 == 0L) {
                break L1;
              } else {
                if (~var2_long >= ~var4) {
                  break L1;
                } else {
                  var6_int = (int)(-var4 + var2_long);
                  ma.field_c = ((var6_int >> 1) + 32000) / var6_int;
                  break L1;
                }
              }
            }
            L2: {
              int fieldTemp$1 = ag.field_f;
              ag.field_f = ag.field_f + 1;
              if (fieldTemp$1 > 50) {
                L3: {
                  ag.field_f = ag.field_f - 50;
                  ii.field_a = true;
                  tb.field_c.setSize(gg.field_d, hj.field_j);
                  tb.field_c.setVisible(true);
                  if (q.field_g == null) {
                    break L3;
                  } else {
                    if (fg.field_n != null) {
                      break L3;
                    } else {
                      var6 = q.field_g.getInsets();
                      tb.field_c.setLocation(var6.left + sk.field_d, rh.field_k + var6.top);
                      if (Main.field_T == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                tb.field_c.setLocation(sk.field_d, rh.field_k);
                break L2;
              } else {
                break L2;
              }
            }
            ((fj) this).b((byte) 59);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "fj.VB(" + 5 + 41);
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
            ((fj) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fj.windowClosing(");
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
          throw ma.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final boolean c(byte param0) {
        return true;
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (q.field_g == null) {
          L0: {
            if (null == uh.field_i) {
              break L0;
            } else {
              if ((Object) (Object) uh.field_i == this) {
                break L0;
              } else {
                return uh.field_i.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        } else {
          return null;
        }
    }

    abstract void c(int param0);

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) jj.field_a) {
                break L1;
              } else {
                if (!tk.field_q) {
                  t.field_h = 4000L + id.a(30);
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
          throw ma.a((Throwable) (Object) runtimeException, "fj.stop()");
        }
    }

    private final void b(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Object var6 = null;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = id.a(60);
              var4 = hj.field_n[kh.field_e];
              hj.field_n[kh.field_e] = var2_long;
              if (0L == var4) {
                break L1;
              } else {
                if (~var4 > ~var2_long) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            kh.field_e = 31 & 1 + kh.field_e;
            var6 = this;
            synchronized (var6) {
              L2: {
                r.field_q = gh.field_j;
                break L2;
              }
            }
            ((fj) this).a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ma.a((Throwable) (Object) runtimeException, "fj.TB(" + 31 + 41);
        }
    }

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
              if (this != (Object) (Object) jj.field_a) {
                break L1;
              } else {
                if (tk.field_q) {
                  break L1;
                } else {
                  L2: {
                    ii.field_a = true;
                    if (!hi.field_a) {
                      break L2;
                    } else {
                      if (-ej.field_jb + id.a(124) <= 1000L) {
                        break L2;
                      } else {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (var2 == null) {
                            break L3;
                          } else {
                            if (vk.field_b > var2.width) {
                              break L2;
                            } else {
                              if (~var2.height > ~qe.field_I) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        vd.field_w = true;
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
            stackOut_21_1 = new StringBuilder().append("fj.paint(");
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
          throw ma.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    static int a(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = param0 | param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "fj.MB(" + param0 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_f = null;
              if (param0 == -67) {
                break L1;
              } else {
                fj.a(102, 66, -111, -47, 21, -43, (mg) null, 86);
                break L1;
              }
            }
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "fj.NB(" + param0 + 41);
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
            gh.field_j = true;
            ii.field_a = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fj.focusGained(");
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
          throw ma.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
            uh.field_i = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fj.provideLoaderApplet(");
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
          throw ma.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    abstract void f(int param0);

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
            if (q.field_g != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.net.URL) (Object) stackIn_4_0;
            } else {
              L1: {
                if (uh.field_i == null) {
                  break L1;
                } else {
                  if (this == (Object) (Object) uh.field_i) {
                    break L1;
                  } else {
                    stackOut_9_0 = uh.field_i.getDocumentBase();
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
          throw ma.a((Throwable) (Object) var1, "fj.getDocumentBase()");
        }
        return stackIn_12_0;
    }

    public abstract void init();

    protected fj() {
        ((fj) this).field_b = false;
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, mg param6, int param7) {
        RuntimeException var8 = null;
        mg var8_ref = null;
        int[] var8_array = null;
        int[] var9 = null;
        byte[] var9_array = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        ha var21_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int stackIn_13_0 = 0;
        int stackIn_25_0 = 0;
        int[] stackIn_26_0 = null;
        int[] stackIn_28_0 = null;
        int[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        ha stackIn_64_0 = null;
        int stackIn_72_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int[] stackOut_25_0 = null;
        int[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_39_0 = 0;
        short stackOut_37_0 = 0;
        int stackOut_43_0 = 0;
        short stackOut_41_0 = 0;
        short stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        ha stackOut_63_0 = null;
        Object stackOut_61_0 = null;
        int stackOut_71_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_74_0 = 0;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        var40 = Main.field_T;
        try {
          L0: {
            if (param0 <= -14) {
              L1: {
                L2: {
                  var8_ref = param6;
                  if (null == var8_ref.field_D) {
                    break L2;
                  } else {
                    if (1 >= var8_ref.field_E) {
                      break L2;
                    } else {
                      var9_array = var8_ref.field_D;
                      int discarded$2 = 80;
                      wh.a(var9_array, 0, 0, tb.field_h);
                      if (var40 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                int discarded$3 = 124;
                cc.b();
                break L1;
              }
              var8_array = new int[param6.field_c];
              var9 = new int[param6.field_c];
              var10 = ve.field_d;
              var11 = mc.field_b;
              var12 = oa.field_e;
              var13 = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (param6.field_c <= var13) {
                      break L5;
                    } else {
                      var14 = var11[var13] * param1 + var10[var13] * param5 - -(var12[var13] * param4) >> 8;
                      stackOut_12_0 = var14;
                      stackIn_31_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (var40 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (stackIn_13_0 < 0) {
                            var14 = -var14;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (var14 >= 0) {
                            if (var14 >= 128) {
                              stackOut_24_0 = 256;
                              stackIn_25_0 = stackOut_24_0;
                              break L7;
                            } else {
                              stackOut_22_0 = var14 + 128;
                              stackIn_25_0 = stackOut_22_0;
                              break L7;
                            }
                          } else {
                            stackOut_19_0 = 128;
                            stackIn_25_0 = stackOut_19_0;
                            break L7;
                          }
                        }
                        L8: {
                          var14 = stackIn_25_0;
                          var15 = var12[var13] * param3 + (var10[var13] * param2 + var11[var13] * param7) >> 8;
                          stackOut_25_0 = sh.field_l;
                          stackIn_28_0 = stackOut_25_0;
                          stackIn_26_0 = stackOut_25_0;
                          if (var15 < 0) {
                            stackOut_28_0 = (int[]) (Object) stackIn_28_0;
                            stackOut_28_1 = -var15;
                            stackIn_29_0 = stackOut_28_0;
                            stackIn_29_1 = stackOut_28_1;
                            break L8;
                          } else {
                            stackOut_26_0 = (int[]) (Object) stackIn_26_0;
                            stackOut_26_1 = var15;
                            stackIn_29_0 = stackOut_26_0;
                            stackIn_29_1 = stackOut_26_1;
                            break L8;
                          }
                        }
                        var15 = stackIn_29_0[stackIn_29_1];
                        var14 = var14 * (-var15 + 256) >>> 8;
                        var8_array[var13] = var14;
                        var9[var13] = var15;
                        var13++;
                        if (var40 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  stackOut_30_0 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  break L4;
                }
                var13 = stackIn_31_0;
                L9: while (true) {
                  L10: {
                    L11: {
                      if (var13 >= ol.field_X) {
                        break L11;
                      } else {
                        var14 = lf.field_a[var13];
                        var15 = param6.field_a[var14];
                        var16 = param6.field_Q[var14];
                        var17 = param6.field_d[var14];
                        if (var40 != 0) {
                          break L10;
                        } else {
                          L12: {
                            if (~ve.field_d.length >= ~param6.field_g[var14]) {
                              stackOut_39_0 = -1;
                              stackIn_40_0 = stackOut_39_0;
                              break L12;
                            } else {
                              stackOut_37_0 = param6.field_g[var14];
                              stackIn_40_0 = stackOut_37_0;
                              break L12;
                            }
                          }
                          L13: {
                            var18 = stackIn_40_0;
                            if (~ve.field_d.length >= ~param6.field_v[var14]) {
                              stackOut_43_0 = -1;
                              stackIn_44_0 = stackOut_43_0;
                              break L13;
                            } else {
                              stackOut_41_0 = param6.field_v[var14];
                              stackIn_44_0 = stackOut_41_0;
                              break L13;
                            }
                          }
                          L14: {
                            var19 = stackIn_44_0;
                            if (~ve.field_d.length < ~param6.field_p[var14]) {
                              stackOut_47_0 = param6.field_p[var14];
                              stackIn_48_0 = stackOut_47_0;
                              break L14;
                            } else {
                              stackOut_45_0 = -1;
                              stackIn_48_0 = stackOut_45_0;
                              break L14;
                            }
                          }
                          L15: {
                            L16: {
                              var20 = stackIn_48_0;
                              if (ga.field_b == null) {
                                break L16;
                              } else {
                                if (param6.field_N == null) {
                                  break L16;
                                } else {
                                  if (~var14 <= ~param6.field_N.length) {
                                    break L16;
                                  } else {
                                    if (param6.field_N[var14] == -1) {
                                      break L16;
                                    } else {
                                      if (~param6.field_N[var14] > ~ga.field_b.length) {
                                        stackOut_63_0 = ga.field_b[param6.field_N[var14]];
                                        stackIn_64_0 = stackOut_63_0;
                                        break L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_61_0 = null;
                            stackIn_64_0 = (ha) (Object) stackOut_61_0;
                            break L15;
                          }
                          L17: {
                            L18: {
                              var21_ref = stackIn_64_0;
                              var22 = se.field_F[var15];
                              var23 = ai.field_j[var15];
                              var24 = se.field_F[var16];
                              var25 = ai.field_j[var16];
                              var26 = se.field_F[var17];
                              var27 = ai.field_j[var17];
                              if (var19 != var18) {
                                break L18;
                              } else {
                                if (var20 != var19) {
                                  break L18;
                                } else {
                                  L19: {
                                    var28 = var8_array[var18];
                                    var29 = var9[var18];
                                    if (null == var21_ref) {
                                      stackOut_71_0 = 8355711;
                                      stackIn_72_0 = stackOut_71_0;
                                      break L19;
                                    } else {
                                      stackOut_69_0 = var21_ref.field_b;
                                      stackIn_72_0 = stackOut_69_0;
                                      break L19;
                                    }
                                  }
                                  var30 = stackIn_72_0;
                                  var31 = var30 & 16711935;
                                  var32 = 65280 & var30;
                                  var33 = var28 * var32 >>> 8 & -1308557568 | (var31 * var28 & -16711773) >>> 8;
                                  var33 = var33 + 65793 * var29;
                                  cd.a(var23, var27, var25, -1, var22, var24, (var33 & 16711422) >> 1, var26);
                                  if (var40 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                            L20: {
                              var28 = var8_array[var18];
                              var29 = var8_array[var19];
                              var30 = var8_array[var20];
                              var31 = var9[var18];
                              var32 = var9[var19];
                              var33 = var9[var20];
                              if (var21_ref != null) {
                                stackOut_76_0 = var21_ref.field_b;
                                stackIn_77_0 = stackOut_76_0;
                                break L20;
                              } else {
                                stackOut_74_0 = 8355711;
                                stackIn_77_0 = stackOut_74_0;
                                break L20;
                              }
                            }
                            var34 = stackIn_77_0;
                            var35 = 16711935 & var34;
                            var36 = 65280 & var34;
                            var37 = var36 * var28 >>> 8 & 587267840 | var28 * var35 >>> 8 & 1258225919;
                            var38 = 1509884159 & var35 * var29 >>> 8 | -234815744 & var36 * var29 >>> 8;
                            var37 = var37 + var31 * 65793;
                            var39 = var35 * var30 >>> 8 & 469696767 | (var36 * var30 & 16711689) >>> 8;
                            var38 = var38 + var32 * 65793;
                            var39 = var39 + var33 * 65793;
                            gi.a(var39 >> 16, var38 & 255, (65465 & var39) >> 8, var39 & 255, var37 >> 16, var38 >> 16, var22, var23, 255 & var38 >> 8, 0, var25, var27, (65354 & var37) >> 8, var26, var24, var37 & 255);
                            break L17;
                          }
                          var13++;
                          if (var40 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    break L10;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var8 = decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) var8;
            stackOut_80_1 = new StringBuilder().append("fj.SB(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_83_0 = stackOut_80_0;
            stackIn_83_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param6 == null) {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L21;
            } else {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "{...}";
              stackIn_84_0 = stackOut_81_0;
              stackIn_84_1 = stackOut_81_1;
              stackIn_84_2 = stackOut_81_2;
              break L21;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_84_0, stackIn_84_2 + 44 + param7 + 41);
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    final void a(byte param0, String param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            vi var8_ref2 = null;
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
            var9 = Main.field_T;
            try {
              try {
                L0: {
                  if (jj.field_a == null) {
                    L1: {
                      gg.field_d = param5;
                      vk.field_b = param5;
                      hj.field_j = param4;
                      qe.field_I = param4;
                      ca.field_d = param3;
                      jj.field_a = (fj) this;
                      sk.field_d = 0;
                      rh.field_k = 0;
                      tk.field_o = mk.g(-118);
                      le dupTemp$1 = new le(param6, param1, param2, true);
                      jk.field_a = dupTemp$1;
                      Main.field_W = dupTemp$1;
                      if (param0 > 38) {
                        break L1;
                      } else {
                        ((fj) this).a(-62);
                        break L1;
                      }
                    }
                    var8_ref2 = jk.field_a.a(0, 1, (Runnable) this);
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (var8_ref2.field_a != 0) {
                            break L4;
                          } else {
                            wk.a((byte) -94, 10L);
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
                    sk.field_e = sk.field_e + 1;
                    if (sk.field_e >= 3) {
                      ((fj) this).a((byte) -126, "alreadyloaded");
                      return;
                    } else {
                      ((fj) this).getAppletContext().showDocument(((fj) this).getDocumentBase(), "_self");
                      return;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L5: {
                  var8 = decompiledCaughtException;
                  k.a(var8, (byte) -106, (String) null);
                  ((fj) this).a((byte) -118, "crash");
                  break L5;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_23_0 = (RuntimeException) var8_ref;
                stackOut_23_1 = new StringBuilder().append("fj.QB(").append(param0).append(44);
                stackIn_26_0 = stackOut_23_0;
                stackIn_26_1 = stackOut_23_1;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                if (param1 == null) {
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
              throw ma.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
