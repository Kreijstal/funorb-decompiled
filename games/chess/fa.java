/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class fa extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static int[] field_d;
    static jc field_j;
    boolean field_g;
    static km field_e;
    static String field_k;
    public static boolean field_b;
    public static int field_c;
    public static boolean field_l;
    public static int field_f;
    public static int field_a;
    public static boolean field_h;
    public static boolean field_i;

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

            stackIn_5_1 = new StringBuilder().append("fa.windowClosing(");

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
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void b(int param0);

    final static void a(ac param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        nk var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = qn.field_U;
              var3.f(param2, -65);
              var3.field_l = var3.field_l + 1;
              var4 = var3.field_l;
              var3.c(1, (byte) -114);
              var3.c(param0.field_q, (byte) 124);
              if (param1 == 15079) {
                break L1;
              } else {
                field_d = (int[]) null;
                break L1;
              }
            }
            var3.c(param0.field_m, (byte) -90);
            var3.d(param0.field_r, (byte) -81);
            var3.d(param0.field_s, (byte) -81);
            var3.d(param0.field_o, (byte) -81);
            var3.d(param0.field_n, (byte) -81);
            var3.b(var4, (byte) -126);
            var3.a(var3.field_l + -var4, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("fa.D(");

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
          throw fk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public abstract void init();

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
            qe.field_B = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fa.provideLoaderApplet(");

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
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    abstract void a(boolean param0);

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (nk.field_w != this) {
                break L1;
              } else {
                if (jf.field_a) {
                  break L1;
                } else {
                  L2: {
                    od.field_W = true;
                    if (!om.field_l) {
                      break L2;
                    } else {
                      if ((ud.a(2) + -pj.field_g ^ -1L) >= -1001L) {
                        break L2;
                      } else {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (var2 == null) {
                            break L3;
                          } else {
                            if (sl.field_c > var2.width) {
                              break L2;
                            } else {
                              if (hk.field_H <= var2.height) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        hf.field_a = true;
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
            stackIn_25_0 = (RuntimeException) (var2_ref);

            stackIn_25_1 = new StringBuilder().append("fa.paint(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
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
            b.field_f = true;
            od.field_W = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fa.focusGained(");

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
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    abstract void e(byte param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
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

            stackIn_5_1 = new StringBuilder().append("fa.update(");

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
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(String param0, int param1) {
        try {
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              L0: {
                if (this.field_g) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  this.field_g = true;
                  System.out.println("error_game_" + param0);
                  try {
                    L1: {
                      L2: {
                        u.a(true, "loggedout", bh.i(81));
                        if (param1 == -58) {
                          break L2;
                        } else {
                          fa.a((byte) -79);
                          break L2;
                        }
                      }
                      break L1;
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
                      this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
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
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L6: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var3_ref2);

                stackIn_15_1 = new StringBuilder().append("fa.I(");

                if (param0 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L6;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L6;
                }
              }
              throw fk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
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

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void stop() {
        if (nk.field_w != this || jf.field_a) {
            return;
        }
        try {
            mk.field_b = 4000L + ud.a(2);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "fa.stop()");
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != nk.field_w) {
                break L1;
              } else {
                if (jf.field_a) {
                  break L1;
                } else {
                  mk.field_b = 0L;
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
          throw fk.a((Throwable) ((Object) runtimeException), "fa.start()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null == lk.field_a) {
          L0: {
            if (null == qe.field_B) {
              break L0;
            } else {
              if (this != qe.field_B) {
                return qe.field_B.getCodeBase();
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

    final static ld a(int param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        int[] stackIn_39_0 = null;
        ld stackIn_43_0 = null;
        Throwable decompiledCaughtException = null;
        nk var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dj var6 = null;
        Exception var6_ref = null;
        int var7 = 0;
        var7 = Chess.field_G;
        try {
          L0: {
            L1: {
              var2 = tk.field_h;
              var3 = var2.i(-118);
              if (-1 == (128 & var3 ^ -1)) {
                stackIn_5_0 = 0;
                break L1;
              } else {
                stackIn_5_0 = 1;
                break L1;
              }
            }
            L2: {
              L3: {
                ue.field_c = stackIn_5_0 != 0;
                tk.field_b = var3 & 127;
                fj.field_a = var2.i(-118);
                sa.field_e = var2.d((byte) 115);
                if (tk.field_b != 2) {
                  break L3;
                } else {
                  va.field_a = var2.f(674914976);
                  ud.field_a = var2.k(1389913160);
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              va.field_a = 0;
              ud.field_a = 0;
              break L2;
            }
            L4: {
              if ((var2.i(-107) ^ -1) != -2) {
                stackIn_15_0 = 0;
                break L4;
              } else {
                stackIn_15_0 = 1;
                break L4;
              }
            }
            L5: {
              L6: {
                var4 = stackIn_15_0;
                an.field_a = var2.d(param0 + param0);
                if (var4 != 0) {
                  break L6;
                } else {
                  oh.field_e = an.field_a;
                  if (var7 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              oh.field_e = var2.d(0);
              break L5;
            }
            L7: {
              L8: {
                if (1 == tk.field_b) {
                  break L8;
                } else {
                  if ((tk.field_b ^ -1) == -5) {
                    break L8;
                  } else {
                    qn.field_M = 0;
                    bh.field_H = null;
                    if (var7 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              qn.field_M = var2.f(674914976);
              bh.field_H = var2.d(0);
              break L7;
            }
            L9: {
              L10: {
                if (param1) {
                  break L10;
                } else {
                  sn.field_g = am.a(var2, 80, (byte) 89);
                  mk.field_d = null;
                  if (var7 == 0) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              var5 = var2.f(674914976);
              try {
                L11: {
                  L12: {
                    var6 = oa.field_b.a((byte) 79, var5);
                    sn.field_g = var6.e((byte) -125);
                    if (!oh.field_e.equals(ci.field_J)) {
                      stackIn_39_0 = var6.field_u;
                      break L12;
                    } else {
                      stackIn_39_0 = null;
                      break L12;
                    }
                  }
                  mk.field_d = stackIn_39_0;
                  break L11;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L13: {
                  var6_ref = (Exception) (Object) decompiledCaughtException;
                  fg.a((Throwable) ((Object) var6_ref), (byte) -77, "CC1");
                  mk.field_d = null;
                  sn.field_g = null;
                  break L13;
                }
              }
              break L9;
            }
            stackIn_43_0 = new ld(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2_ref), "fa.K(" + param0 + ',' + param1 + ')');
        }
        return stackIn_43_0;
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void run() {
        try {
            boolean stackIn_46_0 = false;
            boolean stackIn_64_0 = false;
            int stackIn_68_0 = 0;
            int stackIn_68_1 = 0;
            int stackIn_76_0 = 0;
            int stackIn_76_1 = 0;
            int stackIn_90_0 = 0;
            int stackIn_95_0 = 0;
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
                        var5 = Chess.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (jk.field_o == null) {
                                statePc = 59;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var1 = jk.field_o.toLowerCase();
                            if (((String) (var1)).indexOf("sun") != -1) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (((String) (var1)).indexOf("apple") == -1) {
                                statePc = 59;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var2 = jk.field_i;
                            if (var2.equals("1.1")) {
                                statePc = 39;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var2.startsWith("1.1.")) {
                                statePc = 39;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (var2.equals("1.2")) {
                                statePc = 39;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var2.startsWith("1.2.")) {
                                statePc = 39;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var2.equals("1.3")) {
                                statePc = 39;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var2.startsWith("1.3.")) {
                                statePc = 39;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var2.equals("1.4")) {
                                statePc = 39;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var2.startsWith("1.4.")) {
                                statePc = 39;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var2.equals("1.5")) {
                                statePc = 39;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var2.startsWith("1.5.")) {
                                statePc = 39;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var2.equals("1.6.0")) {
                                statePc = 39;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            this.a("wrongjava", -58);
                            if (var5 == 0) {
                                statePc = 103;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (!var2.startsWith("1.6.0_")) {
                                statePc = 59;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var3 = 6;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var2.length() <= var3) {
                                statePc = 52;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            stackIn_64_0 = di.a(-49, var2.charAt(var3));
                            stackIn_46_0 = stackIn_64_0;
                            if (var5 != 0) {
                                statePc = 64;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (!stackIn_46_0) {
                                statePc = 52;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var3++;
                            if (var5 == 0) {
                                statePc = 44;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var4 = var2.substring(6, var3);
                            if (!lg.a((byte) 88, (CharSequence) ((Object) var4))) {
                                statePc = 59;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (-11 < (fn.a((CharSequence) ((Object) var4), 0) ^ -1)) {
                                statePc = 58;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            this.a("wrongjava", -58);
                            if (var5 == 0) {
                                statePc = 103;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (jk.field_i == null) {
                                statePc = 79;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            stackIn_64_0 = jk.field_i.startsWith("1.");
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (!stackIn_64_0) {
                                statePc = 79;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var1_int = 2;
                            var2_int = 0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (var1_int >= jk.field_i.length()) {
                                statePc = 75;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var3 = jk.field_i.charAt(var1_int);
                            stackIn_76_0 = var3 ^ -1;
                            stackIn_68_0 = stackIn_76_0;
                            stackIn_76_1 = -49;
                            stackIn_68_1 = stackIn_76_1;
                            if (var5 != 0) {
                                statePc = 76;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (stackIn_68_0 > stackIn_68_1) {
                                statePc = 75;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if ((var3 ^ -1) < -58) {
                                statePc = 75;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var1_int++;
                            var2_int = var3 + -48 + var2_int * 10;
                            if (var5 == 0) {
                                statePc = 66;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            stackIn_76_0 = var2_int ^ -1;
                            stackIn_76_1 = -6;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (stackIn_76_0 <= stackIn_76_1) {
                                statePc = 78;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            om.field_l = true;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var1 = nk.field_w;
                            if (null == qe.field_B) {
                                statePc = 81;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var1 = qe.field_B;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var2_ref = jk.field_m;
                            if (null != var2_ref) {
                                statePc = 84;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var3_ref_Throwable = caughtException;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            bb.a(75);
                            this.d((byte) 125);
                            ph.field_j = ad.a((java.awt.Component) ((Object) ja.field_h), (byte) -80, em.field_O, tm.field_c);
                            this.b(2);
                            v.field_e = dj.h(-13154);
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            if (0L == mk.field_b) {
                                statePc = 93;
                            } else {
                                statePc = 89;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            stackIn_95_0 = (mk.field_b < ud.a(2) ? -1 : (mk.field_b == ud.a(2) ? 0 : 1));
                            stackIn_90_0 = stackIn_95_0;
                            if (var5 != 0) {
                                statePc = 95;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            if (stackIn_90_0 <= 0) {
                                statePc = 103;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            hk.field_M = v.field_e.b(ji.field_U, -102);
                            stackIn_95_0 = 0;
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var3 = stackIn_95_0;
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            if (hk.field_M <= var3) {
                                statePc = 101;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            this.c(-120);
                            var3++;
                            if (var5 != 0) {
                                statePc = 102;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            if (var5 == 0) {
                                statePc = 96;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            statePc = 101;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            this.c((byte) 119);
                            ak.a(oc.field_l, (byte) 111, ja.field_h);
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            if (var5 == 0) {
                                statePc = 88;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var1 = caughtException;
                            fg.a((Throwable) (var1), (byte) -77, (String) null);
                            this.a("crash", -58);
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            this.a((byte) 33, true);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        var1 = caughtException;
                        throw fk.a((Throwable) (var1), "fa.run()");
                    }
                    case 108: {
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

    abstract void b(byte param0);

    private final void c(int param0) {
        long var2_long = 0L;
        long var4 = 0L;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        Object var6 = null;
        try {
          L0: {
            var2_long = ud.a(2);
            var4 = fi.field_d[qm.field_b];
            fi.field_d[qm.field_b] = var2_long;
            qm.field_b = qm.field_b + 1 & 31;
            if (param0 <= -87) {
              L1: {
                if ((var4 ^ -1L) == -1L) {
                  break L1;
                } else {
                  if ((var2_long ^ -1L) >= (var4 ^ -1L)) {
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              var6 = this;
              synchronized (var6) {
                L2: {
                  wc.field_x = b.field_f;
                  break L2;
                }
              }
              this.b((byte) 122);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "fa.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (lk.field_a == null) {
              L1: {
                if (null == qe.field_B) {
                  break L1;
                } else {
                  if (qe.field_B == this) {
                    break L1;
                  } else {
                    stackIn_8_0 = qe.field_B.getAppletContext();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_10_0 = super.getAppletContext();
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
          throw fk.a((Throwable) ((Object) var1), "fa.getAppletContext()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.applet.AppletContext) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
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
            if (lk.field_a == null) {
              L1: {
                if (null == qe.field_B) {
                  break L1;
                } else {
                  if (this != qe.field_B) {
                    stackIn_10_0 = qe.field_B.getDocumentBase();
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
          throw fk.a((Throwable) ((Object) var1), "fa.getDocumentBase()");
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

    private final void a(byte param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Throwable var3_ref = null;
        try {
          L0: {
            var3 = this;
            synchronized (var3) {
              L1: {
                if (jf.field_a) {
                  return;
                } else {
                  jf.field_a = true;
                  break L1;
                }
              }
            }
            L2: {
              if (qe.field_B != null) {
                qe.field_B.destroy();
                break L2;
              } else {
                break L2;
              }
            }
            try {
              L3: {
                this.e((byte) 12);
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
              if (null == ja.field_h) {
                break L5;
              } else {
                try {
                  L6: {
                    ja.field_h.removeFocusListener((java.awt.event.FocusListener) (this));
                    ja.field_h.getParent().remove((java.awt.Component) ((Object) ja.field_h));
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
              if (null != oc.field_l) {
                try {
                  L9: {
                    oc.field_l.b(param0 + -33);
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
              this.f((byte) 53);
              if (lk.field_a != null) {
                try {
                  L12: {
                    System.exit(0);
                    break L12;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L13: {
                    var3_ref = decompiledCaughtException;
                    break L13;
                  }
                }
                break L11;
              } else {
                break L11;
              }
            }
            L14: {
              System.out.println("Shutdown complete - clean:" + param1);
              if (param0 == 33) {
                break L14;
              } else {
                field_d = (int[]) null;
                break L14;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw fk.a((Throwable) ((Object) runtimeException), "fa.C(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void f(byte param0);

    final void a(int param0, int param1, String param2, int param3, int param4, int param5, int param6) {
        try {
            jk dupTemp$0 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            nl var8 = null;
            Throwable var8_ref = null;
            RuntimeException var8_ref2 = null;
            int var9 = 0;
            int var10 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var10 = Chess.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null == nk.field_w) {
                                statePc = 11;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            ih.field_O = ih.field_O + 1;
                            if (ih.field_O >= 3) {
                                statePc = 7;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            this.a("alreadyloaded", -58);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 18;
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
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        try {
                            tm.field_c = param5;
                            sl.field_c = param5;
                            nk.field_w = (fa) (this);
                            ka.field_c = 0;
                            db.field_p = 0;
                            cg.field_a = param3;
                            em.field_O = param0;
                            hk.field_H = param0;
                            ba.field_L = bh.i(81);
                            dupTemp$0 = new jk(param4, param2, param6, true);
                            oc.field_l = dupTemp$0;
                            um.field_g = dupTemp$0;
                            var8 = oc.field_l.a(1, true, (Runnable) (this));
                            var9 = 75 % ((-48 - param1) / 46);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (var8.field_f != 0) {
                                statePc = 17;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            bc.a(10L, (byte) 62);
                            if (var10 != 0) {
                                statePc = 25;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (var10 == 0) {
                                statePc = 12;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var8_ref = caughtException;
                            fg.a(var8_ref, (byte) -77, (String) null);
                            this.a("crash", -58);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var8_ref2 = (RuntimeException) ((Object) caughtException);
                        stackIn_23_0 = (RuntimeException) (var8_ref2);
                        stackIn_21_0 = stackIn_23_0;
                        stackIn_23_1 = new StringBuilder().append("fa.L(").append(param0).append(',').append(param1).append(',');
                        stackIn_21_1 = stackIn_23_1;
                        if (param2 == null) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        stackIn_24_0 = (RuntimeException) ((Object) stackIn_21_0);
                        stackIn_24_1 = (StringBuilder) ((Object) stackIn_21_1);
                        stackIn_24_2 = "{...}";
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 23: {
                        stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                        stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                        stackIn_24_2 = "null";
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        throw fk.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                    }
                    case 25: {
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

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == -53) {
                break L1;
              } else {
                field_k = (String) null;
                break L1;
              }
            }
            field_d = null;
            field_e = null;
            field_k = null;
            field_j = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "fa.M(" + param0 + ')');
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
            b.field_f = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fa.focusLost(");

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
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void c(byte param0) {
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
              var2_long = ud.a(2);
              var4 = vj.field_f[qk.field_e];
              vj.field_f[qk.field_e] = var2_long;
              if (var4 == 0L) {
                break L1;
              } else {
                if ((var4 ^ -1L) <= (var2_long ^ -1L)) {
                  break L1;
                } else {
                  var6_int = (int)(-var4 + var2_long);
                  ie.field_a = ((var6_int >> -737483807) + 32000) / var6_int;
                  break L1;
                }
              }
            }
            L2: {
              qk.field_e = qk.field_e - -1 & 31;
              fieldTemp$1 = td.field_p;
              td.field_p = td.field_p + 1;
              if (50 >= fieldTemp$1) {
                break L2;
              } else {
                L3: {
                  L4: {
                    td.field_p = td.field_p - 50;
                    od.field_W = true;
                    ja.field_h.setSize(tm.field_c, em.field_O);
                    ja.field_h.setVisible(true);
                    if (null == lk.field_a) {
                      break L4;
                    } else {
                      if (null == ec.field_e) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ja.field_h.setLocation(db.field_p, ka.field_c);
                  if (Chess.field_G == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                var6 = lk.field_a.getInsets();
                ja.field_h.setLocation(var6.left - -db.field_p, var6.top + ka.field_c);
                break L2;
              }
            }
            L5: {
              this.a(true);
              if (param0 >= 116) {
                break L5;
              } else {
                field_e = (km) null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) runtimeException), "fa.F(" + param0 + ')');
        }
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != nk.field_w) {
                break L1;
              } else {
                if (jf.field_a) {
                  break L1;
                } else {
                  mk.field_b = ud.a(2);
                  bc.a(5000L, (byte) -92);
                  um.field_g = null;
                  this.a((byte) 33, false);
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
          throw fk.a((Throwable) ((Object) runtimeException), "fa.destroy()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    final synchronized void d(byte param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (null != ja.field_h) {
                ja.field_h.removeFocusListener((java.awt.event.FocusListener) (this));
                ja.field_h.getParent().setBackground(java.awt.Color.black);
                ja.field_h.getParent().remove((java.awt.Component) ((Object) ja.field_h));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (ec.field_e != null) {
                  break L3;
                } else {
                  L4: {
                    if (lk.field_a == null) {
                      break L4;
                    } else {
                      var2 = lk.field_a;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (null != qe.field_B) {
                      break L5;
                    } else {
                      var2 = nk.field_w;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = qe.field_B;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = ec.field_e;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
                ja.field_h = (java.awt.Canvas) ((Object) new g((java.awt.Component) (this)));
                ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) ja.field_h));
                ja.field_h.setSize(tm.field_c, em.field_O);
                ja.field_h.setVisible(true);
                if (var2 == lk.field_a) {
                  break L7;
                } else {
                  ja.field_h.setLocation(db.field_p, ka.field_c);
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              var3 = lk.field_a.getInsets();
              ja.field_h.setLocation(var3.left + db.field_p, ka.field_c + var3.top);
              break L6;
            }
            L8: {
              ja.field_h.addFocusListener((java.awt.event.FocusListener) (this));
              ja.field_h.requestFocus();
              wc.field_x = true;
              b.field_f = true;
              od.field_W = true;
              hf.field_a = false;
              pj.field_g = ud.a(2);
              if (param0 == 125) {
                break L8;
              } else {
                field_k = (String) null;
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (var2), "fa.O(" + param0 + ')');
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
            if (lk.field_a == null) {
              L1: {
                if (null == qe.field_B) {
                  break L1;
                } else {
                  if (this == qe.field_B) {
                    break L1;
                  } else {
                    stackIn_8_0 = qe.field_B.getParameter(param0);
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

            stackIn_14_1 = new StringBuilder().append("fa.getParameter(");

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
          throw fk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
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

    final boolean a(int param0) {
        return true;
    }

    protected fa() {
        this.field_g = false;
    }

    static {
        field_d = new int[4];
        field_j = new jc();
        field_k = "Back";
    }
}
