/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class jna extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static ka[] field_j;
    boolean field_b;
    public static boolean field_m;
    public static boolean field_k;
    public static boolean field_f;
    public static int field_n;
    public static boolean field_h;
    public static boolean field_e;
    public static int field_l;
    public static int field_a;
    public static boolean field_i;
    public static int field_g;
    public static int field_c;
    public static int field_o;
    public static boolean field_d;

    abstract void a(boolean param0);

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void d(int param0);

    final void a(int param0, String param1) {
        try {
            Throwable throwable = null;
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (this.field_b) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  this.field_b = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L1: {
                      lb.b(di.a(43), 2864, "loggedout");
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
                      this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
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
                    if (param0 == -6738) {
                      break L5;
                    } else {
                      this.start();
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L6: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_17_0 = (RuntimeException) (runtimeException);

                stackIn_17_1 = new StringBuilder().append("jna.S(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L6;
                } else {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L6;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
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
            if (rla.field_x == null) {
              L1: {
                if (cba.field_a == null) {
                  break L1;
                } else {
                  if (cba.field_a == this) {
                    break L1;
                  } else {
                    stackIn_8_0 = cba.field_a.getParameter(param0);
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

            stackIn_14_1 = new StringBuilder().append("jna.getParameter(");

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
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
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

    public static void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -87) {
                break L1;
              } else {
                jna.provideLoaderApplet((java.applet.Applet) null);
                break L1;
              }
            }
            field_j = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "jna.M(" + param0 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (kua.field_j != this) {
                break L1;
              } else {
                if (tla.field_b) {
                  break L1;
                } else {
                  boa.field_t = bva.b((byte) -107) - -4000L;
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
          throw tba.a((Throwable) ((Object) runtimeException), "jna.stop()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void f(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_long = bva.b((byte) -107);
            if (param0 == 270) {
              L1: {
                var4 = eia.field_r[sla.field_d];
                eia.field_r[sla.field_d] = var2_long;
                if (var4 == 0L) {
                  break L1;
                } else {
                  if (var2_long <= var4) {
                    break L1;
                  } else {
                    var6_int = (int)(-var4 + var2_long);
                    oea.field_f = (32000 - -(var6_int >> 175163937)) / var6_int;
                    break L1;
                  }
                }
              }
              L2: {
                sla.field_d = 31 & 1 + sla.field_d;
                fieldTemp$1 = nsa.field_d;
                nsa.field_d = nsa.field_d + 1;
                if (fieldTemp$1 <= 50) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      bsa.field_k = true;
                      nsa.field_d = nsa.field_d - 50;
                      nma.field_l.setSize(mma.field_a, qf.field_i);
                      nma.field_l.setVisible(true);
                      if (null == rla.field_x) {
                        break L4;
                      } else {
                        if (null == nb.field_d) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    nma.field_l.setLocation(lp.field_g, vu.field_f);
                    if (!TombRacer.field_G) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  var6 = rla.field_x.getInsets();
                  nma.field_l.setLocation(lp.field_g + var6.left, var6.top - -vu.field_f);
                  break L2;
                }
              }
              this.c(0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "jna.O(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(byte param0) {
        return true;
    }

    private final void g(int param0) {
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        Object var6 = null;
        try {
          L0: {
            L1: {
              if (param0 == -6) {
                break L1;
              } else {
                this.field_b = true;
                break L1;
              }
            }
            L2: {
              var2_long = bva.b((byte) -107);
              var4 = bv.field_xb[aaa.field_b];
              bv.field_xb[aaa.field_b] = var2_long;
              aaa.field_b = 31 & 1 + aaa.field_b;
              if (var4 == 0L) {
                break L2;
              } else {
                if ((var4 ^ -1L) <= (var2_long ^ -1L)) {
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            var6 = this;
            synchronized (var6) {
              L3: {
                bn.field_n = oea.field_k;
                break L3;
              }
            }
            this.a(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "jna.H(" + param0 + ')');
        }
    }

    abstract void h(int param0);

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != kua.field_j) {
                break L1;
              } else {
                if (tla.field_b) {
                  break L1;
                } else {
                  boa.field_t = bva.b((byte) -107);
                  vja.a(0, 5000L);
                  nea.field_c = null;
                  this.a((byte) 109, false);
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
          throw tba.a((Throwable) ((Object) runtimeException), "jna.destroy()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
            oea.field_k = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("jna.focusLost(");

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
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        java.applet.AppletContext stackIn_14_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (rla.field_x != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (cba.field_a == null) {
                  break L1;
                } else {
                  if (this != cba.field_a) {
                    stackIn_12_0 = cba.field_a.getAppletContext();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_14_0 = super.getAppletContext();
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "jna.getAppletContext()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.applet.AppletContext) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static boolean a(boolean param0, int param1, int param2, cn param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = param3.a(param0, param2, param1);
            if (null != var4) {
              ira.a(0, var4);
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4_ref);

            stackIn_8_1 = new StringBuilder().append("jna.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (rla.field_x != null) {
          return null;
        } else {
          L0: {
            if (cba.field_a == null) {
              break L0;
            } else {
              if (cba.field_a != this) {
                return cba.field_a.getCodeBase();
              } else {
                break L0;
              }
            }
          }
          return super.getCodeBase();
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (rla.field_x == null) {
              L1: {
                if (null == cba.field_a) {
                  break L1;
                } else {
                  if (this == cba.field_a) {
                    break L1;
                  } else {
                    stackIn_8_0 = cba.field_a.getDocumentBase();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_10_0 = super.getDocumentBase();
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
          throw tba.a((Throwable) ((Object) var1), "jna.getDocumentBase()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.net.URL) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
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

            stackIn_5_1 = new StringBuilder().append("jna.update(");

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
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (kua.field_j != this) {
                break L1;
              } else {
                if (tla.field_b) {
                  break L1;
                } else {
                  boa.field_t = 0L;
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
          throw tba.a((Throwable) ((Object) runtimeException), "jna.start()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void run() {
        try {
            boolean stackIn_48_0 = false;
            boolean stackIn_66_0 = false;
            int stackIn_71_0 = 0;
            int stackIn_71_1 = 0;
            int stackIn_82_0 = 0;
            int stackIn_82_1 = 0;
            int stackIn_94_0 = 0;
            int stackIn_99_0 = 0;
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
                        var5 = TombRacer.field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (fia.field_e != null) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var1 = fia.field_e.toLowerCase();
                            if (((String) (var1)).indexOf("sun") != -1) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (-1 == ((String) (var1)).indexOf("apple")) {
                                statePc = 61;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var2 = fia.field_v;
                            if (var2.equals("1.1")) {
                                statePc = 41;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            this.a(-6738, "wrongjava");
                            if (var5 == 0) {
                                statePc = 107;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (!var2.startsWith("1.6.0_")) {
                                statePc = 61;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var3 = 6;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if ((var2.length() ^ -1) >= (var3 ^ -1)) {
                                statePc = 54;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            stackIn_66_0 = dp.a(120, var2.charAt(var3));
                            stackIn_48_0 = stackIn_66_0;
                            if (var5 != 0) {
                                statePc = 66;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (!stackIn_48_0) {
                                statePc = 54;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var3++;
                            if (var5 == 0) {
                                statePc = 46;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var4 = var2.substring(6, var3);
                            if (!sqa.a((CharSequence) ((Object) var4), -3)) {
                                statePc = 61;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if ((jb.a((CharSequence) ((Object) var4), (byte) 70) ^ -1) <= -11) {
                                statePc = 61;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            this.a(-6738, "wrongjava");
                            if (var5 == 0) {
                                statePc = 107;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (null == fia.field_v) {
                                statePc = 85;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackIn_66_0 = fia.field_v.startsWith("1.");
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (stackIn_66_0) {
                                statePc = 68;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var1_int = 2;
                            var2_int = 0;
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (var1_int >= fia.field_v.length()) {
                                statePc = 81;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var3 = fia.field_v.charAt(var1_int);
                            stackIn_82_0 = 48;
                            stackIn_71_0 = stackIn_82_0;
                            stackIn_82_1 = var3;
                            stackIn_71_1 = stackIn_82_1;
                            if (var5 != 0) {
                                statePc = 82;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (stackIn_71_0 > stackIn_71_1) {
                                statePc = 81;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (57 >= var3) {
                                statePc = 80;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (var5 == 0) {
                                statePc = 81;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var1_int++;
                            var2_int = var2_int * 10 + (-48 + var3);
                            if (var5 == 0) {
                                statePc = 69;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            stackIn_82_0 = -6;
                            stackIn_82_1 = var2_int ^ -1;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (stackIn_82_0 < stackIn_82_1) {
                                statePc = 85;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            da.field_c = true;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var1 = kua.field_j;
                            if (null == cba.field_a) {
                                statePc = 87;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var1 = cba.field_a;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var2_ref = fia.field_b;
                            if (var2_ref == null) {
                                statePc = 91;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var3_ref_Throwable = caughtException;
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            wk.a((byte) -84);
                            this.b((byte) 68);
                            gn.field_C = ns.a(117, mma.field_a, (java.awt.Component) ((Object) nma.field_l), qf.field_i);
                            this.h(-71);
                            cq.field_a = bca.a(0);
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            if (boa.field_t == 0L) {
                                statePc = 97;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            stackIn_99_0 = ((boa.field_t ^ -1L) < (bva.b((byte) -107) ^ -1L) ? -1 : ((boa.field_t ^ -1L) == (bva.b((byte) -107) ^ -1L) ? 0 : 1));
                            stackIn_94_0 = stackIn_99_0;
                            if (var5 != 0) {
                                statePc = 99;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            if (stackIn_94_0 >= 0) {
                                statePc = 107;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            mt.field_a = cq.field_a.a((byte) 12, mga.field_i);
                            stackIn_99_0 = 0;
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var3 = stackIn_99_0;
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if (mt.field_a <= var3) {
                                statePc = 105;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            this.g(-6);
                            var3++;
                            if (var5 != 0) {
                                statePc = 106;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            if (var5 == 0) {
                                statePc = 100;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            this.f(270);
                            kla.a(dsa.field_c, (byte) 86, nma.field_l);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            if (var5 == 0) {
                                statePc = 92;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var1 = caughtException;
                            ssa.a((String) null, (byte) 127, (Throwable) (var1));
                            this.a(-6738, "crash");
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            this.a((byte) 109, true);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        var1 = caughtException;
                        throw tba.a((Throwable) (var1), "jna.run()");
                    }
                    case 112: {
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

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (kua.field_j != this) {
                break L1;
              } else {
                if (tla.field_b) {
                  break L1;
                } else {
                  L2: {
                    bsa.field_k = true;
                    if (!da.field_c) {
                      break L2;
                    } else {
                      if (-lt.field_b + bva.b((byte) -107) > 1000L) {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (var2 == null) {
                            break L3;
                          } else {
                            if (var2.width < rv.field_a) {
                              break L2;
                            } else {
                              if (var2.height < eca.field_a) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        wla.field_Cb = true;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
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
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2_ref);

            stackIn_26_1 = new StringBuilder().append("jna.paint(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L4;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
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

            stackIn_5_1 = new StringBuilder().append("jna.windowClosing(");

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
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public abstract void init();

    private final void a(byte param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        Throwable var3_ref2 = null;
        try {
          L0: {
            var3_ref = this;
            synchronized (var3_ref) {
              L1: {
                if (!tla.field_b) {
                  tla.field_b = true;
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (null == cba.field_a) {
                break L2;
              } else {
                cba.field_a.destroy();
                break L2;
              }
            }
            try {
              L3: {
                L4: {
                  if (param0 == 109) {
                    break L4;
                  } else {
                    jna.a(false, -94, 60, (cn) null);
                    break L4;
                  }
                }
                this.d(param0 ^ -45);
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L5: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L5;
              }
            }
            L6: {
              if (nma.field_l == null) {
                break L6;
              } else {
                try {
                  L7: {
                    nma.field_l.removeFocusListener((java.awt.event.FocusListener) (this));
                    nma.field_l.getParent().remove((java.awt.Component) ((Object) nma.field_l));
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
              }
            }
            L9: {
              if (dsa.field_c == null) {
                break L9;
              } else {
                try {
                  L10: {
                    dsa.field_c.b((byte) 59);
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
              this.e(-3666);
              if (rla.field_x != null) {
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
          throw tba.a((Throwable) ((Object) runtimeException), "jna.J(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void e(int param0);

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
            oea.field_k = true;
            bsa.field_k = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("jna.focusGained(");

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
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, String param6) {
        try {
            fia dupTemp$0 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            naa var8 = null;
            Throwable var8_ref = null;
            RuntimeException var8_ref2 = null;
            int var9 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = TombRacer.field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (kua.field_j == null) {
                                statePc = 9;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            lpa.field_v = lpa.field_v + 1;
                            if (-4 < (lpa.field_v ^ -1)) {
                                statePc = 7;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            this.a(-6738, "alreadyloaded");
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return;
                    }
                    case 7: {
                        try {
                            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return;
                    }
                    case 9: {
                        try {
                            kua.field_j = (jna) (this);
                            qf.field_i = param1;
                            eca.field_a = param1;
                            vu.field_f = 0;
                            mma.field_a = param2;
                            rv.field_a = param2;
                            sua.field_L = param4;
                            lp.field_g = 0;
                            if (!param0) {
                                statePc = 12;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            this.paint((java.awt.Graphics) null);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            dfa.field_e = di.a(49);
                            dupTemp$0 = new fia(param5, param6, param3, true);
                            dsa.field_c = dupTemp$0;
                            nea.field_c = dupTemp$0;
                            var8 = dsa.field_c.a((Runnable) (this), 425, 1);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if ((var8.field_b ^ -1) != -1) {
                                statePc = 18;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            vja.a(0, 10L);
                            if (var9 != 0) {
                                statePc = 26;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var9 == 0) {
                                statePc = 13;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var8_ref = caughtException;
                            ssa.a((String) null, (byte) 118, var8_ref);
                            this.a(-6738, "crash");
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        var8_ref2 = (RuntimeException) ((Object) caughtException);
                        stackIn_24_0 = (RuntimeException) (var8_ref2);
                        stackIn_22_0 = stackIn_24_0;
                        stackIn_24_1 = new StringBuilder().append("jna.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                        stackIn_22_1 = stackIn_24_1;
                        if (param6 == null) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        stackIn_25_0 = (RuntimeException) ((Object) stackIn_22_0);
                        stackIn_25_1 = (StringBuilder) ((Object) stackIn_22_1);
                        stackIn_25_2 = "{...}";
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 24: {
                        stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                        stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                        stackIn_25_2 = "null";
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
                    }
                    case 26: {
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
            cba.field_a = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("jna.provideLoaderApplet(");

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
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final synchronized void b(byte param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != nma.field_l) {
                nma.field_l.removeFocusListener((java.awt.event.FocusListener) (this));
                nma.field_l.getParent().setBackground(java.awt.Color.black);
                nma.field_l.getParent().remove((java.awt.Component) ((Object) nma.field_l));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (null != nb.field_d) {
                  break L3;
                } else {
                  L4: {
                    if (rla.field_x != null) {
                      break L4;
                    } else {
                      L5: {
                        if (null == cba.field_a) {
                          break L5;
                        } else {
                          var2 = cba.field_a;
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2 = kua.field_j;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2 = rla.field_x;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = nb.field_d;
              break L2;
            }
            ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
            nma.field_l = (java.awt.Canvas) ((Object) new he((java.awt.Component) (this)));
            ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) nma.field_l));
            nma.field_l.setSize(mma.field_a, qf.field_i);
            nma.field_l.setVisible(true);
            if (param0 > 9) {
              L6: {
                L7: {
                  if (rla.field_x == var2) {
                    break L7;
                  } else {
                    nma.field_l.setLocation(lp.field_g, vu.field_f);
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var3 = rla.field_x.getInsets();
                nma.field_l.setLocation(var3.left + lp.field_g, var3.top + vu.field_f);
                break L6;
              }
              nma.field_l.addFocusListener((java.awt.event.FocusListener) (this));
              nma.field_l.requestFocus();
              oea.field_k = true;
              bn.field_n = true;
              bsa.field_k = true;
              wla.field_Cb = false;
              lt.field_b = bva.b((byte) -107);
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
          throw tba.a((Throwable) (var2), "jna.Q(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    abstract void c(int param0);

    protected jna() {
        this.field_b = false;
    }

    final static int a(int param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
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
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 10) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = -40;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var2_int = 0;
                        var3 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var3 >= param1.length) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_9_0 = var2_int + param1[var3];
                        stackIn_7_0 = stackIn_9_0;
                        if (var4 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2_int = stackIn_7_0;
                        var3++;
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_9_0 = var2_int;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_13_0 = (RuntimeException) (var2);
                    stackIn_11_0 = stackIn_13_0;
                    stackIn_13_1 = new StringBuilder().append("jna.N(").append(param0).append(',');
                    stackIn_11_1 = stackIn_13_1;
                    if (param1 == null) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_14_2 = "{...}";
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_14_2 = "null";
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    static {
    }
}
