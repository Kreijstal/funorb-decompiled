/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.AppletContext;
import java.net.URL;

public abstract class wa extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_b;
    static String field_k;
    static String field_f;
    static String field_j;
    public static int field_e;
    public static int field_d;
    public static boolean field_g;
    public static int field_c;
    public static int field_a;
    public static boolean field_h;
    public static boolean field_i;

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) gl.field_h != this) {
                break L1;
              } else {
                if (kf.field_g) {
                  break L1;
                } else {
                  tc.field_j = 0L;
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dn.a((Throwable) (Object) runtimeException, "wa.start()");
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
            var5 = CrazyCrystals.field_B;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (un.field_e == null) {
                              break L5;
                            } else {
                              L6: {
                                var1 = (Object) (Object) un.field_e.toLowerCase();
                                if (((String) var1).indexOf("sun") != -1) {
                                  break L6;
                                } else {
                                  if (-1 == ((String) var1).indexOf("apple")) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              L7: {
                                L8: {
                                  var2 = un.field_m;
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
                                ((wa) this).a(0, "wrongjava");
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
                                      stackOut_47_0 = ag.a(var2.charAt(var3), 48);
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
                                  if (!cd.a((CharSequence) (Object) var4, (byte) -123)) {
                                    break L5;
                                  } else {
                                    if (ti.a(100, (CharSequence) (Object) var4) >= 10) {
                                      break L5;
                                    } else {
                                      ((wa) this).a(0, "wrongjava");
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
                          if (null == un.field_m) {
                            break L3;
                          } else {
                            stackOut_64_0 = un.field_m.startsWith("1.");
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
                                if (un.field_m.length() <= var1_int) {
                                  break L13;
                                } else {
                                  var3 = un.field_m.charAt(var1_int);
                                  stackOut_69_0 = 48;
                                  stackOut_69_1 = var3;
                                  stackIn_81_0 = stackOut_69_0;
                                  stackIn_81_1 = stackOut_69_1;
                                  stackIn_70_0 = stackOut_69_0;
                                  stackIn_70_1 = stackOut_69_1;
                                  if (var5 != 0) {
                                    break L12;
                                  } else {
                                    if (stackIn_70_0 > stackIn_70_1) {
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
                                      var2_int = 10 * var2_int + -48 + var3;
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
                              stackOut_80_0 = var2_int;
                              stackOut_80_1 = 5;
                              stackIn_81_0 = stackOut_80_0;
                              stackIn_81_1 = stackOut_80_1;
                              break L12;
                            }
                            if (stackIn_81_0 < stackIn_81_1) {
                              break L3;
                            } else {
                              jd.field_H = true;
                              break L3;
                            }
                          }
                        }
                      }
                      L15: {
                        var1 = (Object) (Object) gl.field_h;
                        if (null != tk.field_i) {
                          var1 = (Object) (Object) tk.field_i;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      L16: {
                        var2_ref = un.field_l;
                        if (var2_ref == null) {
                          break L16;
                        } else {
                          try {
                            L17: {
                              Object discarded$1 = var2_ref.invoke(var1, new Object[1]);
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
                      lc.b(24536);
                      ((wa) this).b(-42);
                      dk.field_o = oj.a(ap.field_r, 6641, (java.awt.Component) (Object) jd.field_D, rh.field_f);
                      ((wa) this).a((byte) -82);
                      jm.field_h = sn.a(27801);
                      L19: while (true) {
                        L20: {
                          L21: {
                            if (0L == tc.field_j) {
                              break L21;
                            } else {
                              stackOut_94_0 = (tc.field_j < lo.a((byte) -120) ? -1 : (tc.field_j == lo.a((byte) -120) ? 0 : 1));
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
                          hf.field_a = jm.field_h.b(s.field_k, -1);
                          stackOut_98_0 = 0;
                          stackIn_100_0 = stackOut_98_0;
                          break L20;
                        }
                        var3 = stackIn_100_0;
                        L22: while (true) {
                          L23: {
                            L24: {
                              if (~var3 <= ~hf.field_a) {
                                break L24;
                              } else {
                                this.d(2648);
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
                            this.b((byte) 122);
                            so.a((Object) (Object) jd.field_D, te.field_a, true);
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
                    wp.a((Throwable) var1, (String) null, 21862);
                    ((wa) this).a(0, "crash");
                    break L25;
                  }
                }
                this.a(false, true);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw dn.a((Throwable) var1, "wa.run()");
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
            if (uc.field_d == null) {
              L1: {
                if (null == tk.field_i) {
                  break L1;
                } else {
                  if ((Object) (Object) tk.field_i == this) {
                    break L1;
                  } else {
                    stackOut_7_0 = tk.field_i.getParameter(param0);
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
            stackOut_11_1 = new StringBuilder().append("wa.getParameter(");
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
          throw dn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_10_0;
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    private final void d(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Object var6 = null;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = lo.a((byte) 88);
              if (param0 == 2648) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            L2: {
              var4 = v.field_a[ak.field_m];
              v.field_a[ak.field_m] = var2_long;
              ak.field_m = 31 & ak.field_m - -1;
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
                mb.field_d = sl.field_t;
                break L3;
              }
            }
            ((wa) this).a(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw dn.a((Throwable) (Object) runtimeException, "wa.B(" + param0 + 41);
        }
    }

    private final void b(byte param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        int var6_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = lo.a((byte) 125);
              var4 = mc.field_p[ne.field_c];
              mc.field_p[ne.field_c] = var2_long;
              if (var4 == 0L) {
                break L1;
              } else {
                if (~var4 > ~var2_long) {
                  var6_int = (int)(-var4 + var2_long);
                  p.field_j = (32000 + (var6_int >> 1)) / var6_int;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              ne.field_c = ne.field_c + 1 & 31;
              int fieldTemp$2 = wf.field_h;
              wf.field_h = wf.field_h + 1;
              if (fieldTemp$2 <= 50) {
                break L2;
              } else {
                L3: {
                  al.field_f = true;
                  wf.field_h = wf.field_h - 50;
                  jd.field_D.setSize(ap.field_r, rh.field_f);
                  jd.field_D.setVisible(true);
                  if (uc.field_d == null) {
                    break L3;
                  } else {
                    if (null != vk.field_F) {
                      break L3;
                    } else {
                      var6 = uc.field_d.getInsets();
                      jd.field_D.setLocation(ui.field_a + var6.left, wm.field_e + var6.top);
                      if (CrazyCrystals.field_B == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                jd.field_D.setLocation(ui.field_a, wm.field_e);
                break L2;
              }
            }
            L4: {
              if (param0 == 122) {
                break L4;
              } else {
                field_f = null;
                break L4;
              }
            }
            ((wa) this).a(-123);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dn.a((Throwable) (Object) runtimeException, "wa.E(" + param0 + 41);
        }
    }

    abstract void a(byte param0);

    final void a(int param0, String param1) {
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
                if (!((wa) this).field_b) {
                  ((wa) this).field_b = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L1: {
                      L2: {
                        Object discarded$1 = hi.a(le.b((byte) -20), "loggedout", 28);
                        if (param0 == 0) {
                          break L2;
                        } else {
                          ((wa) this).field_b = false;
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
                      ((wa) this).getAppletContext().showDocument(new java.net.URL(((wa) this).getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
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
                stackOut_11_0 = (RuntimeException) var3_ref2;
                stackOut_11_1 = new StringBuilder().append("wa.G(").append(param0).append(44);
                stackIn_14_0 = stackOut_11_0;
                stackIn_14_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param1 == null) {
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
              throw dn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void c(int param0);

    abstract void c(byte param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    abstract void a(int param0);

    private final void a(boolean param0, boolean param1) {
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
                if (!param0) {
                  if (!kf.field_g) {
                    kf.field_g = true;
                    break L1;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
            L2: {
              if (tk.field_i != null) {
                tk.field_i.destroy();
                break L2;
              } else {
                break L2;
              }
            }
            try {
              L3: {
                ((wa) this).c(241);
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
              if (null != jd.field_D) {
                try {
                  L6: {
                    jd.field_D.removeFocusListener((java.awt.event.FocusListener) this);
                    jd.field_D.getParent().remove((java.awt.Component) (Object) jd.field_D);
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
              if (te.field_a != null) {
                try {
                  L9: {
                    te.field_a.a(113);
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
              ((wa) this).c((byte) 89);
              if (uc.field_d != null) {
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
              } else {
                break L11;
              }
            }
            System.out.println("Shutdown complete - clean:" + param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw dn.a((Throwable) (Object) runtimeException, "wa.K(" + param0 + 44 + param1 + 41);
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final boolean f(int param0) {
        return true;
    }

    final synchronized void b(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (null == jd.field_D) {
                break L1;
              } else {
                jd.field_D.removeFocusListener((java.awt.event.FocusListener) this);
                jd.field_D.getParent().setBackground(java.awt.Color.black);
                jd.field_D.getParent().remove((java.awt.Component) (Object) jd.field_D);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == vk.field_F) {
                  break L3;
                } else {
                  var2 = (Object) (Object) vk.field_F;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null != uc.field_d) {
                  break L4;
                } else {
                  L5: {
                    if (null != tk.field_i) {
                      break L5;
                    } else {
                      var2 = (Object) (Object) gl.field_h;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = (Object) (Object) tk.field_i;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var2 = (Object) (Object) uc.field_d;
              break L2;
            }
            ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
            jd.field_D = (java.awt.Canvas) (Object) new pg((java.awt.Component) this);
            java.awt.Component discarded$6 = ((java.awt.Container) var2).add((java.awt.Component) (Object) jd.field_D);
            jd.field_D.setSize(ap.field_r, rh.field_f);
            if (param0 < -38) {
              L6: {
                L7: {
                  jd.field_D.setVisible(true);
                  if (var2 != (Object) (Object) uc.field_d) {
                    break L7;
                  } else {
                    var3 = uc.field_d.getInsets();
                    jd.field_D.setLocation(var3.left - -ui.field_a, wm.field_e + var3.top);
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                jd.field_D.setLocation(ui.field_a, wm.field_e);
                break L6;
              }
              jd.field_D.addFocusListener((java.awt.event.FocusListener) this);
              jd.field_D.requestFocus();
              mb.field_d = true;
              sl.field_t = true;
              al.field_f = true;
              em.field_f = false;
              bd.field_m = lo.a((byte) 95);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw dn.a((Throwable) var2, "wa.D(" + param0 + 41);
        }
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) gl.field_h) {
                break L1;
              } else {
                if (!kf.field_g) {
                  tc.field_j = lo.a((byte) 119);
                  fh.a(true, 5000L);
                  rd.field_g = null;
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
          throw dn.a((Throwable) (Object) runtimeException, "wa.destroy()");
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
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
              if (this != (Object) (Object) gl.field_h) {
                break L1;
              } else {
                if (!kf.field_g) {
                  L2: {
                    al.field_f = true;
                    if (!jd.field_H) {
                      break L2;
                    } else {
                      if (-bd.field_m + lo.a((byte) -23) > 1000L) {
                        L3: {
                          var2_ref = param0.getClipBounds();
                          if (null == var2_ref) {
                            break L3;
                          } else {
                            if (~jm.field_c < ~var2_ref.width) {
                              break L2;
                            } else {
                              if (var2_ref.height >= wk.field_b) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        em.field_f = true;
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
            stackOut_20_1 = new StringBuilder().append("wa.paint(");
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
          throw dn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
    }

    public abstract void init();

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
            sl.field_t = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("wa.focusLost(");
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
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) gl.field_h) {
                break L1;
              } else {
                if (kf.field_g) {
                  break L1;
                } else {
                  tc.field_j = lo.a((byte) -9) - -4000L;
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dn.a((Throwable) (Object) runtimeException, "wa.stop()");
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
            ((wa) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("wa.update(");
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
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void a(byte param0, int param1, int param2, String param3, int param4, int param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            gb var8_ref2 = null;
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
            var9 = CrazyCrystals.field_B;
            try {
              try {
                L0: {
                  if (gl.field_h == null) {
                    me.field_e = param4;
                    wm.field_e = 0;
                    ui.field_a = 0;
                    gl.field_h = (wa) this;
                    if (param0 == 118) {
                      rh.field_f = param5;
                      wk.field_b = param5;
                      ap.field_r = param6;
                      jm.field_c = param6;
                      pj.field_w = le.b((byte) -20);
                      un dupTemp$1 = new un(param1, param3, param2, true);
                      te.field_a = dupTemp$1;
                      rd.field_g = dupTemp$1;
                      var8_ref2 = te.field_a.a((Runnable) this, 2, 1);
                      L1: while (true) {
                        L2: {
                          L3: {
                            if (0 != var8_ref2.field_a) {
                              break L3;
                            } else {
                              fh.a(true, 10L);
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
                  } else {
                    nj.field_e = nj.field_e + 1;
                    if (3 <= nj.field_e) {
                      ((wa) this).a(0, "alreadyloaded");
                      return;
                    } else {
                      ((wa) this).getAppletContext().showDocument(((wa) this).getDocumentBase(), "_self");
                      return;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  var8 = decompiledCaughtException;
                  wp.a(var8, (String) null, 21862);
                  ((wa) this).a(0, "crash");
                  break L4;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_22_0 = (RuntimeException) var8_ref;
                stackOut_22_1 = new StringBuilder().append("wa.M(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                stackIn_25_0 = stackOut_22_0;
                stackIn_25_1 = stackOut_22_1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                if (param3 == null) {
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
              throw dn.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected wa() {
        ((wa) this).field_b = false;
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void a(boolean param0);

    public static void e(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_k = null;
              field_j = null;
              if (param0 == 5) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "wa.C(" + param0 + 41);
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (uc.field_d != null) {
          return null;
        } else {
          L0: {
            if (null == tk.field_i) {
              break L0;
            } else {
              if ((Object) (Object) tk.field_i == this) {
                break L0;
              } else {
                return tk.field_i.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
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
            tk.field_i = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("wa.provideLoaderApplet(");
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
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
            sl.field_t = true;
            al.field_f = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("wa.focusGained(");
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
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
            ((wa) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("wa.windowClosing(");
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
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
            if (null != uc.field_d) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.applet.AppletContext) (Object) stackIn_4_0;
            } else {
              L1: {
                if (tk.field_i == null) {
                  break L1;
                } else {
                  if ((Object) (Object) tk.field_i != this) {
                    stackOut_11_0 = tk.field_i.getAppletContext();
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
          throw dn.a((Throwable) (Object) var1, "wa.getAppletContext()");
        }
        return stackIn_14_0;
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
            if (uc.field_d != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.net.URL) (Object) stackIn_4_0;
            } else {
              L1: {
                if (tk.field_i == null) {
                  break L1;
                } else {
                  if ((Object) (Object) tk.field_i != this) {
                    stackOut_11_0 = tk.field_i.getDocumentBase();
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
          throw dn.a((Throwable) (Object) var1, "wa.getDocumentBase()");
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Cancel";
        field_j = "This hole has been filled.<br>You may pass.";
        field_f = "Think before you leap. Which wall are these balls following?";
    }
}
