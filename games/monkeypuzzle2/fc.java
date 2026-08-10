/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fc.focusGained(");

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
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
            hh.field_o = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fc.focusLost(");

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
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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

            stackIn_5_1 = new StringBuilder().append("fc.windowClosing(");

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
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (hk.field_e == null) {
              L1: {
                if (ll.field_b == null) {
                  break L1;
                } else {
                  if (this != ll.field_b) {
                    stackIn_10_0 = ll.field_b.getAppletContext();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_12_0 = super.getAppletContext();
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
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "fc.getAppletContext()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.applet.AppletContext) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (m.field_f != this) {
                break L1;
              } else {
                if (dl.field_b) {
                  break L1;
                } else {
                  hj.field_db = pf.a(0);
                  em.a(5000L, false);
                  fk.field_c = null;
                  this.a(false, false);
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
          throw la.a((Throwable) ((Object) runtimeException), "fc.destroy()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void run() {
        try {
            boolean stackIn_68_0 = false;
            int stackIn_83_0 = 0;
            int stackIn_83_1 = 0;
            int stackIn_102_0 = 0;
            Throwable decompiledCaughtException = null;
            Object var1 = null;
            int var1_int = 0;
            String var2 = null;
            int var2_int = 0;
            java.lang.reflect.Method var2_ref = null;
            int var3 = 0;
            Throwable var3_ref_Throwable = null;
            String var4 = null;
            int var5 = 0;
            var5 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (null != md.field_l) {
                              L6: {
                                var1 = md.field_l.toLowerCase();
                                if (((String) (var1)).indexOf("sun") != -1) {
                                  break L6;
                                } else {
                                  if (0 == (((String) (var1)).indexOf("apple") ^ -1)) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              L7: {
                                var2 = md.field_m;
                                if (var2.equals("1.1")) {
                                  break L7;
                                } else {
                                  if (var2.startsWith("1.1.")) {
                                    break L7;
                                  } else {
                                    if (var2.equals("1.2")) {
                                      break L7;
                                    } else {
                                      if (var2.startsWith("1.2.")) {
                                        break L7;
                                      } else {
                                        if (var2.equals("1.3")) {
                                          break L7;
                                        } else {
                                          if (var2.startsWith("1.3.")) {
                                            break L7;
                                          } else {
                                            if (var2.equals("1.4")) {
                                              break L7;
                                            } else {
                                              if (var2.startsWith("1.4.")) {
                                                break L7;
                                              } else {
                                                if (var2.equals("1.5")) {
                                                  break L7;
                                                } else {
                                                  if (var2.startsWith("1.5.")) {
                                                    break L7;
                                                  } else {
                                                    if (var2.equals("1.6.0")) {
                                                      break L7;
                                                    } else {
                                                      if (var2.startsWith("1.6.0_")) {
                                                        var3 = 6;
                                                        L8: while (true) {
                                                          L9: {
                                                            if (var3 >= var2.length()) {
                                                              break L9;
                                                            } else {
                                                              stackIn_68_0 = re.a(-49, var2.charAt(var3));

                                                              if (!stackIn_68_0) {
                                                                break L9;
                                                              } else {
                                                                var3++;
                                                                continue L8;
                                                              }
                                                            }
                                                          }
                                                          var4 = var2.substring(6, var3);
                                                          if (!ra.a((CharSequence) ((Object) var4), (byte) -116)) {
                                                            break L5;
                                                          } else {
                                                            if (vi.a(63, (CharSequence) ((Object) var4)) < 10) {
                                                              this.a((byte) 123, "wrongjava");
                                                              break L2;
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
                              this.a((byte) 75, "wrongjava");
                              break L2;
                            } else {
                              break L5;
                            }
                          }
                          if (null == md.field_m) {
                            break L3;
                          } else {
                            stackIn_68_0 = md.field_m.startsWith("1.");
                            break L4;
                          }
                        }
                        if (!stackIn_68_0) {
                          break L3;
                        } else {
                          var1_int = 2;
                          var2_int = 0;
                          L10: while (true) {
                            L11: {
                              L12: {
                                if ((var1_int ^ -1) <= (md.field_m.length() ^ -1)) {
                                  break L12;
                                } else {
                                  var3 = md.field_m.charAt(var1_int);
                                  stackIn_83_0 = var3;

                                  stackIn_83_1 = 48;

                                  if (stackIn_83_0 < stackIn_83_1) {
                                    break L12;
                                  } else {
                                    if (-58 <= (var3 ^ -1)) {
                                      var1_int++;
                                      var2_int = var2_int * 10 + (var3 - 48);
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              stackIn_83_0 = 5;
                              stackIn_83_1 = var2_int;
                              break L11;
                            }
                            if (stackIn_83_0 <= stackIn_83_1) {
                              sd.field_c = true;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      L13: {
                        var1 = m.field_f;
                        if (ll.field_b == null) {
                          break L13;
                        } else {
                          var1 = ll.field_b;
                          break L13;
                        }
                      }
                      L14: {
                        var2_ref = md.field_h;
                        if (var2_ref != null) {
                          try {
                            L15: {
                              var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                              break L15;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L16: {
                              var3_ref_Throwable = decompiledCaughtException;
                              break L16;
                            }
                          }
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      pf.a(true);
                      this.a(false);
                      ac.field_a = ub.a((byte) -85, ub.field_b, (java.awt.Component) ((Object) ie.field_e), lb.field_z);
                      this.a(-17);
                      ne.field_c = il.a(-20601);
                      L17: while (true) {
                        L18: {
                          L19: {
                            if (-1L == (hj.field_db ^ -1L)) {
                              break L19;
                            } else {
                              stackIn_102_0 = ((pf.a(0) ^ -1L) < (hj.field_db ^ -1L) ? -1 : ((pf.a(0) ^ -1L) == (hj.field_db ^ -1L) ? 0 : 1));

                              if (stackIn_102_0 <= 0) {
                                break L2;
                              } else {
                                break L19;
                              }
                            }
                          }
                          bg.field_E = ne.field_c.a(ed.field_d, -128);
                          stackIn_102_0 = 0;
                          break L18;
                        }
                        var3 = stackIn_102_0;
                        L20: while (true) {
                          if (var3 >= bg.field_E) {
                            this.b(57);
                            em.a(ie.field_e, (byte) -101, rc.field_k);
                            continue L17;
                          } else {
                            this.a((byte) -85);
                            var3++;
                            continue L20;
                          }
                        }
                      }
                    }
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L21: {
                    var1 = decompiledCaughtException;
                    kk.a((String) null, (byte) 124, (Throwable) (var1));
                    this.a((byte) 98, "crash");
                    break L21;
                  }
                }
                this.a(false, true);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw la.a((Throwable) (var1), "fc.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (this != m.field_f) {
                break L1;
              } else {
                if (!dl.field_b) {
                  L2: {
                    gb.field_j = true;
                    if (!sd.field_c) {
                      break L2;
                    } else {
                      if (-1001L > (pf.a(0) - ah.field_e ^ -1L)) {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (var2 == null) {
                            break L3;
                          } else {
                            if (var2.width < kk.field_b) {
                              break L2;
                            } else {
                              if ((var2.height ^ -1) <= (ih.field_b ^ -1)) {
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
            stackIn_23_0 = (RuntimeException) (var2_ref);

            stackIn_23_1 = new StringBuilder().append("fc.paint(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_j = null;
              if (!param0) {
                break L1;
              } else {
                field_g = (te) null;
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
          throw la.a((Throwable) ((Object) var1), "fc.EA(" + param0 + ')');
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (hk.field_e != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null == ll.field_b) {
                  break L1;
                } else {
                  if (this != ll.field_b) {
                    stackIn_12_0 = ll.field_b.getParameter(param0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_14_0 = super.getParameter(param0);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("fc.getParameter(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    abstract void c(int param0);

    private final void a(boolean param0, boolean param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
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
                this.b(param0);
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
                    ie.field_e.removeFocusListener((java.awt.event.FocusListener) (this));
                    ie.field_e.getParent().remove((java.awt.Component) ((Object) ie.field_e));
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
              this.c((byte) 26);
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
          throw la.a((Throwable) ((Object) runtimeException), "fc.DA(" + param0 + ',' + param1 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (hk.field_e == null) {
          L0: {
            if (null == ll.field_b) {
              break L0;
            } else {
              if (this == ll.field_b) {
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (hk.field_e == null) {
              L1: {
                if (null == ll.field_b) {
                  break L1;
                } else {
                  if (ll.field_b != this) {
                    stackIn_10_0 = ll.field_b.getDocumentBase();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_12_0 = super.getDocumentBase();
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
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "fc.getDocumentBase()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.net.URL) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final static java.net.URL a(String param0, java.net.URL param1, String param2, int param3, int param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_60_0 = null;
            java.net.URL stackIn_62_0 = null;
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            String stackIn_67_2 = null;
            StringBuilder stackIn_70_1 = null;
            StringBuilder stackIn_71_1 = null;
            String stackIn_71_2 = null;
            StringBuilder stackIn_74_1 = null;
            StringBuilder stackIn_75_1 = null;
            String stackIn_75_2 = null;
            Throwable decompiledCaughtException = null;
            int var5_int = 0;
            RuntimeException var5 = null;
            String var6 = null;
            int var7 = 0;
            int var8_int = 0;
            StringBuilder var8 = null;
            Exception var9 = null;
            int var10 = 0;
            var10 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                var5_int = -123 / ((-26 - param4) / 60);
                var6 = param1.getFile();
                var7 = 0;
                L1: while (true) {
                  L2: {
                    if (var6.regionMatches(var7, "/l=", 0, 3)) {
                      var8_int = var6.indexOf('/', var7 - -1);
                      if ((var8_int ^ -1) <= -1) {
                        if (0 <= param3) {
                          var6 = var6.substring(0, var7) + var6.substring(var8_int);
                          continue L1;
                        } else {
                          var7 = var8_int;
                          continue L1;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (!var6.regionMatches(var7, "/a=", 0, 3)) {
                      break L3;
                    } else {
                      var8_int = var6.indexOf('/', var7 - -1);
                      if (var8_int >= 0) {
                        var7 = var8_int;
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var6.regionMatches(var7, "/p=", 0, 3)) {
                      var8_int = var6.indexOf('/', var7 - -1);
                      if (var8_int >= 0) {
                        if (null == param0) {
                          var7 = var8_int;
                          continue L1;
                        } else {
                          var6 = var6.substring(0, var7) + var6.substring(var8_int);
                          continue L1;
                        }
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      if (var6.regionMatches(var7, "/s=", 0, 3)) {
                        break L6;
                      } else {
                        if (var6.regionMatches(var7, "/c=", 0, 3)) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var8_int = var6.indexOf('/', var7 + 1);
                    if ((var8_int ^ -1) > -1) {
                      break L5;
                    } else {
                      if (null == param2) {
                        var7 = var8_int;
                        continue L1;
                      } else {
                        var6 = var6.substring(0, var7) + var6.substring(var8_int);
                        continue L1;
                      }
                    }
                  }
                  L7: {
                    var8 = new StringBuilder(var7);
                    discarded$0 = var8.append(var6.substring(0, var7));
                    if (-1 <= (param3 ^ -1)) {
                      break L7;
                    } else {
                      discarded$1 = var8.append("/l=");
                      discarded$2 = var8.append(Integer.toString(param3));
                      break L7;
                    }
                  }
                  L8: {
                    if (param0 == null) {
                      break L8;
                    } else {
                      if (-1 > (param0.length() ^ -1)) {
                        discarded$3 = var8.append("/p=");
                        discarded$4 = var8.append(param0);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (null == param2) {
                      break L9;
                    } else {
                      if (-1 <= (param2.length() ^ -1)) {
                        break L9;
                      } else {
                        discarded$5 = var8.append("/s=");
                        discarded$6 = var8.append(param2);
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (var7 < var6.length()) {
                      discarded$7 = var8.append(var6.substring(var7, var6.length()));
                      break L10;
                    } else {
                      discarded$8 = var8.append('/');
                      break L10;
                    }
                  }
                  try {
                    L11: {
                      stackIn_60_0 = new java.net.URL(param1, var8.toString());
                      break L11;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var9 = (Exception) (Object) decompiledCaughtException;
                    var9.printStackTrace();
                    stackIn_62_0 = (java.net.URL) (param1);
                    return stackIn_62_0;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_66_0 = (RuntimeException) (var5);

                stackIn_66_1 = new StringBuilder().append("fc.LA(");

                if (param0 == null) {
                  stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
                  stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
                  stackIn_67_2 = "null";
                  break L12;
                } else {
                  stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
                  stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
                  stackIn_67_2 = "{...}";
                  break L12;
                }
              }
              L13: {


                stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');

                if (param1 == null) {
                  stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
                  stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
                  stackIn_71_2 = "null";
                  break L13;
                } else {
                  stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
                  stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
                  stackIn_71_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');

                if (param2 == null) {
                  stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
                  stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                  stackIn_75_2 = "null";
                  break L14;
                } else {
                  stackIn_67_0 = (RuntimeException) ((Object) stackIn_67_0);
                  stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                  stackIn_75_2 = "{...}";
                  break L14;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_67_0), stackIn_75_2 + ',' + param3 + ',' + param4 + ')');
            }
            return stackIn_60_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void d(int param0);

    private final void b(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        try {
          L0: {
            L1: {
              var2_long = pf.a(0);
              var4 = dl.field_a[bh.field_f];
              dl.field_a[bh.field_f] = var2_long;
              if (var4 == 0L) {
                break L1;
              } else {
                if ((var2_long ^ -1L) < (var4 ^ -1L)) {
                  var6_int = (int)(var2_long - var4);
                  s.field_T = (32000 - -(var6_int >> -1703689151)) / var6_int;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              bh.field_f = bh.field_f + 1 & 31;
              if (param0 == 57) {
                break L2;
              } else {
                this.run();
                break L2;
              }
            }
            L3: {
              fieldTemp$1 = ud.field_d;
              ud.field_d = ud.field_d + 1;
              if (fieldTemp$1 > 50) {
                L4: {
                  gb.field_j = true;
                  ud.field_d = ud.field_d - 50;
                  ie.field_e.setSize(ub.field_b, lb.field_z);
                  ie.field_e.setVisible(true);
                  if (hk.field_e == null) {
                    break L4;
                  } else {
                    if (b.field_i != null) {
                      break L4;
                    } else {
                      var6 = hk.field_e.getInsets();
                      ie.field_e.setLocation(var6.left + ue.field_D, var6.top + wi.field_c);
                      break L3;
                    }
                  }
                }
                ie.field_e.setLocation(ue.field_D, wi.field_c);
                break L3;
              } else {
                break L3;
              }
            }
            this.d(-25976);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw la.a((Throwable) ((Object) runtimeException), "fc.MA(" + param0 + ')');
        }
    }

    final static void a(mk param0, byte param1, int param2) {
        hb var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
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
                field_j = (te) null;
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
            var3.a((byte) -76, var4);
            var3.field_h = var3.field_h - 4;
            param0.field_e = var3.e(126);
            var3.a(-var4 + var3.field_h, (byte) 29);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("fc.KA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(mj param0, byte param1, ad param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              ea.field_b = gg.c(param1 + -111) * param3 / 1000;
              if (param1 == 111) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            ed.a(param2, param1 ^ 31);
            nc.a(param2, 2);
            dl.a(param1 ^ 11490, param2);
            cc.b(true);
            cm.a(15);
            uj.field_i = -ea.field_b + 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("fc.IA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_13_2 + ',' + param3 + ')');
        }
    }

    public final void start() {
        if (this != m.field_f || dl.field_b) {
            return;
        }
        try {
            hj.field_db = 0L;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "fc.start()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          L0: {
            L1: {
              var2_long = pf.a(0);
              var4 = ve.field_w[fe.field_d];
              ve.field_w[fe.field_d] = var2_long;
              if (-1L == (var4 ^ -1L)) {
                break L1;
              } else {
                if (var2_long > var4) {
                  var6_int = (int)(-var4 + var2_long);
                  jf.field_g = (32000 + (var6_int >> -127391487)) / var6_int;
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
            L3: {
              if (param0 < -52) {
                break L3;
              } else {
                this.a(false);
                break L3;
              }
            }
            this.c(15245);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw la.a((Throwable) ((Object) runtimeException), "fc.GA(" + param0 + ')');
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

            stackIn_5_1 = new StringBuilder().append("fc.update(");

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
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5, byte param6) {
        try {
            md dupTemp$0 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            ic var8 = null;
            Throwable var8_ref = null;
            RuntimeException var8_ref2 = null;
            int var9 = 0;
            var9 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param6 == -48) {
                        break L2;
                      } else {
                        field_g = (te) null;
                        break L2;
                      }
                    }
                    if (null != m.field_f) {
                      nf.field_N = nf.field_N + 1;
                      if ((nf.field_N ^ -1) > -4) {
                        this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        this.a((byte) 75, "alreadyloaded");
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
                    } else {
                      lb.field_z = param3;
                      ih.field_b = param3;
                      ub.field_b = param1;
                      kk.field_b = param1;
                      wi.field_c = 0;
                      ue.field_D = 0;
                      kd.field_c = param2;
                      m.field_f = (fc) (this);
                      ni.field_e = ii.a(false);
                      dupTemp$0 = new md(param4, param5, param0, true);
                      rc.field_k = dupTemp$0;
                      fk.field_c = dupTemp$0;
                      var8 = rc.field_k.a((Runnable) (this), 1, 0);
                      L3: while (true) {
                        if (var8.field_g != 0) {
                          decompiledRegionSelector0 = 2;
                          break L1;
                        } else {
                          em.a(10L, false);
                          continue L3;
                        }
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var8_ref = decompiledCaughtException;
                    kk.a((String) null, (byte) 78, var8_ref);
                    this.a((byte) 79, "crash");
                    decompiledRegionSelector0 = 2;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_23_0 = (RuntimeException) (var8_ref2);

                stackIn_23_1 = new StringBuilder().append("fc.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

                if (param5 == null) {
                  stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackIn_24_2 = "null";
                  break L5;
                } else {
                  stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackIn_24_2 = "{...}";
                  break L5;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param6 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != m.field_f) {
                break L1;
              } else {
                if (dl.field_b) {
                  break L1;
                } else {
                  hj.field_db = 4000L + pf.a(0);
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
          throw la.a((Throwable) ((Object) runtimeException), "fc.stop()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
            ll.field_b = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fc.provideLoaderApplet(");

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
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Insets var3 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == ie.field_e) {
                break L1;
              } else {
                ie.field_e.removeFocusListener((java.awt.event.FocusListener) (this));
                ie.field_e.getParent().setBackground(java.awt.Color.black);
                ie.field_e.getParent().remove((java.awt.Component) ((Object) ie.field_e));
                break L1;
              }
            }
            L2: {
              if (b.field_i != null) {
                var2 = b.field_i;
                break L2;
              } else {
                if (hk.field_e != null) {
                  var2 = hk.field_e;
                  break L2;
                } else {
                  if (ll.field_b != null) {
                    var2 = ll.field_b;
                    break L2;
                  } else {
                    var2 = m.field_f;
                    break L2;
                  }
                }
              }
            }
            L3: {
              ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
              ie.field_e = (java.awt.Canvas) ((Object) new ji((java.awt.Component) (this)));
              ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) ie.field_e));
              ie.field_e.setSize(ub.field_b, lb.field_z);
              ie.field_e.setVisible(true);
              if (var2 != hk.field_e) {
                ie.field_e.setLocation(ue.field_D, wi.field_c);
                break L3;
              } else {
                var3 = hk.field_e.getInsets();
                ie.field_e.setLocation(ue.field_D + var3.left, wi.field_c + var3.top);
                break L3;
              }
            }
            ie.field_e.addFocusListener((java.awt.event.FocusListener) (this));
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
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (var2), "fc.PA(" + param0 + ')');
        }
    }

    final void a(byte param0, String param1) {
        try {
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              L0: {
                if (!this.field_l) {
                  L1: {
                    if (param0 >= 41) {
                      break L1;
                    } else {
                      field_k = (va) null;
                      break L1;
                    }
                  }
                  this.field_l = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L2: {
                      mf.a(-26159, "loggedout", ii.a(false));
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
                      this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3_ref = (Exception) (Object) decompiledCaughtException;
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
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var3_ref2);

                stackIn_16_1 = new StringBuilder().append("fc.OA(").append(param0).append(',');

                if (param1 == null) {
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
              throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
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

    protected fc() {
        this.field_l = false;
    }

    static {
        field_j = new te(8, 0, 4, 1);
        field_m = "To server list";
        field_g = new te(1, 2, 2, 0);
        field_b = "This password contains your Player Name, and would be easy to guess";
    }
}
