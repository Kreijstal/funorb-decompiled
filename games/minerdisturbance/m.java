/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.AppletContext;
import java.net.URL;

public abstract class m extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static int[] field_j;
    static ta field_c;
    static int field_e;
    boolean field_i;
    static ea field_m;
    static String[] field_g;
    public static boolean field_h;
    public static boolean field_b;
    public static int field_f;
    public static boolean field_k;
    public static int field_l;
    public static boolean field_a;
    public static boolean field_d;

    final void a(byte param0, String param1) {
        try {
            RuntimeException var3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            Exception var4_ref = null;
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
                if (((m) this).field_i) {
                  return;
                } else {
                  var3_int = -100 % ((-77 - param0) / 41);
                  ((m) this).field_i = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L1: {
                      Object discarded$1 = lk.a((byte) 18, "loggedout", bm.c(-86));
                      break L1;
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L2: {
                      var4 = decompiledCaughtException;
                      break L2;
                    }
                  }
                  try {
                    L3: {
                      ((m) this).getAppletContext().showDocument(new java.net.URL(((m) this).getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4_ref = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L5: {
                var3 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var3;
                stackOut_11_1 = new StringBuilder().append("m.LB(").append(param0).append(44);
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
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_15_0 = stackOut_12_0;
                  stackIn_15_1 = stackOut_12_1;
                  stackIn_15_2 = stackOut_12_2;
                  break L5;
                }
              }
              throw lj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) j.field_h != this) {
                break L1;
              } else {
                if (tn.field_J) {
                  break L1;
                } else {
                  mf.field_k = sf.a((byte) 124);
                  int discarded$2 = -10309;
                  gf.a(5000L);
                  hd.field_g = null;
                  this.a(true, false);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw lj.a((Throwable) (Object) runtimeException, "m.destroy()");
        }
    }

    abstract void b(boolean param0);

    abstract void a(boolean param0);

    private final void e() {
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
              var2_long = sf.a((byte) 100);
              var4 = si.field_f[pn.field_e];
              si.field_f[pn.field_e] = var2_long;
              pn.field_e = 31 & 1 + pn.field_e;
              if (var4 == 0L) {
                break L1;
              } else {
                if (var2_long <= var4) {
                  break L1;
                } else {
                  var6_int = (int)(var2_long + -var4);
                  fd.field_F = ((var6_int >> 1) + 32000) / var6_int;
                  break L1;
                }
              }
            }
            var6 = this;
            synchronized (var6) {
              L2: {
                rd.field_f = pe.field_rb;
                break L2;
              }
            }
            ((m) this).b((byte) 76);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "m.HB(" + 0 + 41);
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public static void f(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_m = null;
              if (param0 == -1) {
                break L1;
              } else {
                m.provideLoaderApplet((java.applet.Applet) null);
                break L1;
              }
            }
            field_j = null;
            field_c = null;
            field_g = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "m.GB(" + param0 + 41);
        }
    }

    abstract void a(int param0);

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) j.field_h != this) {
                break L1;
              } else {
                if (!tn.field_J) {
                  L2: {
                    bh.field_cb = true;
                    if (!dh.field_e) {
                      break L2;
                    } else {
                      if (-pk.field_e + sf.a((byte) 113) <= 1000L) {
                        break L2;
                      } else {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (var2 == null) {
                            break L3;
                          } else {
                            if (~var2.width > ~nf.field_h) {
                              break L2;
                            } else {
                              if (~an.field_h < ~var2.height) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        fa.field_a = true;
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
            var2_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2_ref;
            stackOut_17_1 = new StringBuilder().append("m.paint(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    abstract void b(byte param0);

    final boolean a(byte param0) {
        return true;
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) j.field_h != this) {
                break L1;
              } else {
                if (!tn.field_J) {
                  mf.field_k = 0L;
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
          throw lj.a((Throwable) (Object) runtimeException, "m.start()");
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
            if (nd.field_f != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.applet.AppletContext) (Object) stackIn_4_0;
            } else {
              L1: {
                if (of.field_b == null) {
                  break L1;
                } else {
                  if (this != (Object) (Object) of.field_b) {
                    stackOut_11_0 = of.field_b.getAppletContext();
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
          throw lj.a((Throwable) (Object) var1, "m.getAppletContext()");
        }
        return stackIn_14_0;
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
            int stackIn_73_0 = 0;
            int stackIn_73_1 = 0;
            int stackIn_84_0 = 0;
            int stackIn_84_1 = 0;
            int stackIn_96_0 = 0;
            int stackIn_101_0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_49_0 = false;
            boolean stackOut_66_0 = false;
            int stackOut_72_0 = 0;
            int stackOut_72_1 = 0;
            int stackOut_83_0 = 0;
            int stackOut_83_1 = 0;
            int stackOut_95_0 = 0;
            int stackOut_99_0 = 0;
            var5 = MinerDisturbance.field_ab;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (null != vf.field_s) {
                              L6: {
                                var1 = (Object) (Object) vf.field_s.toLowerCase();
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
                                  var2 = vf.field_b;
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
                                ((m) this).a((byte) 70, "wrongjava");
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
                                      int discarded$7 = -68;
                                      stackOut_49_0 = g.a(var2.charAt(var3));
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
                                  if (!oi.a(-19804, (CharSequence) (Object) var4)) {
                                    break L5;
                                  } else {
                                    int discarded$8 = 1;
                                    if (md.a((CharSequence) (Object) var4) < 10) {
                                      ((m) this).a((byte) -128, "wrongjava");
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
                              }
                            } else {
                              break L5;
                            }
                          }
                          if (vf.field_b == null) {
                            break L3;
                          } else {
                            stackOut_66_0 = vf.field_b.startsWith("1.");
                            stackIn_68_0 = stackOut_66_0;
                            break L4;
                          }
                        }
                        if (stackIn_68_0) {
                          var1_int = 2;
                          var2_int = 0;
                          L11: while (true) {
                            L12: {
                              L13: {
                                if (~var1_int <= ~vf.field_b.length()) {
                                  break L13;
                                } else {
                                  var3 = vf.field_b.charAt(var1_int);
                                  stackOut_72_0 = -49;
                                  stackOut_72_1 = ~var3;
                                  stackIn_84_0 = stackOut_72_0;
                                  stackIn_84_1 = stackOut_72_1;
                                  stackIn_73_0 = stackOut_72_0;
                                  stackIn_73_1 = stackOut_72_1;
                                  if (var5 != 0) {
                                    break L12;
                                  } else {
                                    if (stackIn_73_0 < stackIn_73_1) {
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
                                      var1_int++;
                                      var2_int = var3 + (-48 + 10 * var2_int);
                                      if (var5 == 0) {
                                        continue L11;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_83_0 = -6;
                              stackOut_83_1 = ~var2_int;
                              stackIn_84_0 = stackOut_83_0;
                              stackIn_84_1 = stackOut_83_1;
                              break L12;
                            }
                            if (stackIn_84_0 >= stackIn_84_1) {
                              dh.field_e = true;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                      L15: {
                        var1 = (Object) (Object) j.field_h;
                        if (of.field_b == null) {
                          break L15;
                        } else {
                          var1 = (Object) (Object) of.field_b;
                          break L15;
                        }
                      }
                      L16: {
                        var2_ref = vf.field_h;
                        if (var2_ref == null) {
                          break L16;
                        } else {
                          try {
                            L17: {
                              Object discarded$9 = var2_ref.invoke(var1, new Object[1]);
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
                      int discarded$10 = -71;
                      mb.a();
                      ((m) this).c(-10);
                      bj.field_e = ab.a((byte) -98, nk.field_x, (java.awt.Component) (Object) ef.field_c, ml.field_a);
                      ((m) this).a(47);
                      int discarded$11 = -2;
                      eb.field_d = ik.f();
                      L19: while (true) {
                        L20: {
                          L21: {
                            if (mf.field_k == 0L) {
                              break L21;
                            } else {
                              stackOut_95_0 = (mf.field_k < sf.a((byte) -74) ? -1 : (mf.field_k == sf.a((byte) -74) ? 0 : 1));
                              stackIn_101_0 = stackOut_95_0;
                              stackIn_96_0 = stackOut_95_0;
                              if (var5 != 0) {
                                break L20;
                              } else {
                                if (stackIn_96_0 <= 0) {
                                  break L2;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          ig.field_b = eb.field_d.a(rj.field_c, -114);
                          stackOut_99_0 = 0;
                          stackIn_101_0 = stackOut_99_0;
                          break L20;
                        }
                        var3 = stackIn_101_0;
                        L22: while (true) {
                          L23: {
                            L24: {
                              if (~ig.field_b >= ~var3) {
                                break L24;
                              } else {
                                int discarded$12 = 0;
                                this.e();
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
                            int discarded$13 = -23036;
                            this.d();
                            jk.a(-23765, qa.field_a, (Object) (Object) ef.field_c);
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
                    di.a((Throwable) var1, 1, (String) null);
                    ((m) this).a((byte) -125, "crash");
                    break L25;
                  }
                }
                this.a(true, true);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw lj.a((Throwable) var1, "m.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

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
                if (!tn.field_J) {
                  tn.field_J = true;
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (of.field_b != null) {
                of.field_b.destroy();
                break L2;
              } else {
                break L2;
              }
            }
            try {
              L3: {
                ((m) this).a(false);
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
              if (null != ef.field_c) {
                try {
                  L6: {
                    ef.field_c.removeFocusListener((java.awt.event.FocusListener) this);
                    ef.field_c.getParent().remove((java.awt.Component) (Object) ef.field_c);
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
              if (qa.field_a != null) {
                try {
                  L9: {
                    qa.field_a.a(-29109);
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
              ((m) this).b(1);
              if (nd.field_f != null) {
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
          throw lj.a((Throwable) (Object) runtimeException, "m.JB(" + 1 + 44 + param1 + 41);
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
            pe.field_rb = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("m.focusLost(");
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
          throw lj.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    private final void d() {
        RuntimeException var2 = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = sf.a((byte) -26);
              var4 = fb.field_e[wb.field_p];
              fb.field_e[wb.field_p] = var2_long;
              wb.field_p = wb.field_p + 1 & 31;
              if (var4 == 0L) {
                break L1;
              } else {
                if (~var2_long < ~var4) {
                  var6_int = (int)(-var4 + var2_long);
                  nd.field_b = ((var6_int >> 1) + 32000) / var6_int;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              int fieldTemp$1 = jb.field_p;
              jb.field_p = jb.field_p + 1;
              if (50 >= fieldTemp$1) {
                break L2;
              } else {
                L3: {
                  L4: {
                    jb.field_p = jb.field_p - 50;
                    bh.field_cb = true;
                    ef.field_c.setSize(nk.field_x, ml.field_a);
                    ef.field_c.setVisible(true);
                    if (null == nd.field_f) {
                      break L4;
                    } else {
                      if (null == hd.field_h) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ef.field_c.setLocation(tg.field_f, qi.field_j);
                  if (MinerDisturbance.field_ab == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                var6 = nd.field_f.getInsets();
                ef.field_c.setLocation(var6.left + tg.field_f, var6.top + qi.field_j);
                break L2;
              }
            }
            ((m) this).b(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "m.NB(" + -23036 + 41);
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
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
            ((m) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("m.windowClosing(");
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
          throw lj.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
            if (nd.field_f == null) {
              L1: {
                if (null == of.field_b) {
                  break L1;
                } else {
                  if ((Object) (Object) of.field_b != this) {
                    stackOut_9_0 = of.field_b.getDocumentBase();
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
          throw lj.a((Throwable) (Object) var1, "m.getDocumentBase()");
        }
        return stackIn_12_0;
    }

    public abstract void init();

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
            of.field_b = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("m.provideLoaderApplet(");
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
          throw lj.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final synchronized void c(int param0) {
        Object var2 = null;
        int var3 = 0;
        java.awt.Insets var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (null == ef.field_c) {
                break L1;
              } else {
                ef.field_c.removeFocusListener((java.awt.event.FocusListener) this);
                ef.field_c.getParent().setBackground(java.awt.Color.black);
                ef.field_c.getParent().remove((java.awt.Component) (Object) ef.field_c);
                break L1;
              }
            }
            L2: {
              L3: {
                if (hd.field_h == null) {
                  break L3;
                } else {
                  var2 = (Object) (Object) hd.field_h;
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (nd.field_f != null) {
                  break L4;
                } else {
                  L5: {
                    if (null != of.field_b) {
                      break L5;
                    } else {
                      var2 = (Object) (Object) j.field_h;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = (Object) (Object) of.field_b;
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var2 = (Object) (Object) nd.field_f;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
                ef.field_c = (java.awt.Canvas) (Object) new dc((java.awt.Component) this);
                java.awt.Component discarded$2 = ((java.awt.Container) var2).add((java.awt.Component) (Object) ef.field_c);
                ef.field_c.setSize(nk.field_x, ml.field_a);
                var3 = 9 / ((53 - param0) / 42);
                ef.field_c.setVisible(true);
                if (var2 != (Object) (Object) nd.field_f) {
                  break L7;
                } else {
                  var4 = nd.field_f.getInsets();
                  ef.field_c.setLocation(var4.left + tg.field_f, var4.top + qi.field_j);
                  if (var5 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ef.field_c.setLocation(tg.field_f, qi.field_j);
              break L6;
            }
            ef.field_c.addFocusListener((java.awt.event.FocusListener) this);
            ef.field_c.requestFocus();
            rd.field_f = true;
            pe.field_rb = true;
            bh.field_cb = true;
            fa.field_a = false;
            pk.field_e = sf.a((byte) 113);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw lj.a((Throwable) var2, "m.MB(" + param0 + 41);
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (nd.field_f == null) {
          L0: {
            if (null == of.field_b) {
              break L0;
            } else {
              if (this != (Object) (Object) of.field_b) {
                return of.field_b.getCodeBase();
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

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) j.field_h) {
                break L1;
              } else {
                if (!tn.field_J) {
                  mf.field_k = sf.a((byte) -2) - -4000L;
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
          throw lj.a((Throwable) (Object) runtimeException, "m.stop()");
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
            ((m) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("m.update(");
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
          throw lj.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    abstract void b(int param0);

    protected m() {
        ((m) this).field_i = false;
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
            pe.field_rb = true;
            bh.field_cb = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("m.focusGained(");
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
          throw lj.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
            if (nd.field_f == null) {
              L1: {
                if (null == of.field_b) {
                  break L1;
                } else {
                  if (this == (Object) (Object) of.field_b) {
                    break L1;
                  } else {
                    stackOut_7_0 = of.field_b.getParameter(param0);
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
            stackOut_11_1 = new StringBuilder().append("m.getParameter(");
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
          throw lj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_10_0;
    }

    final void a(int param0, int param1, int param2, int param3, String param4, int param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            ia var8_ref2 = null;
            int var9 = 0;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            var9 = MinerDisturbance.field_ab;
            try {
              try {
                L0: {
                  if (null == j.field_h) {
                    L1: {
                      tb.field_h = param2;
                      ml.field_a = param5;
                      an.field_h = param5;
                      nk.field_x = param0;
                      nf.field_h = param0;
                      tg.field_f = 0;
                      qi.field_j = 0;
                      if (param3 == 3) {
                        break L1;
                      } else {
                        field_m = null;
                        break L1;
                      }
                    }
                    j.field_h = (m) this;
                    aj.field_d = bm.c(-108);
                    vf dupTemp$2 = new vf(param6, param4, param1, true);
                    qa.field_a = dupTemp$2;
                    hd.field_g = dupTemp$2;
                    var8_ref2 = qa.field_a.a((Runnable) this, (byte) 52, 1);
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (0 != var8_ref2.field_c) {
                            break L4;
                          } else {
                            int discarded$3 = -10309;
                            gf.a(10L);
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
                    ij.field_v = ij.field_v + 1;
                    if (ij.field_v < 3) {
                      ((m) this).getAppletContext().showDocument(((m) this).getDocumentBase(), "_self");
                      return;
                    } else {
                      ((m) this).a((byte) -31, "alreadyloaded");
                      return;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L5: {
                  var8 = decompiledCaughtException;
                  di.a(var8, 1, (String) null);
                  ((m) this).a((byte) -121, "crash");
                  break L5;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_21_0 = (RuntimeException) var8_ref;
                stackOut_21_1 = new StringBuilder().append("m.IB(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
                stackIn_24_0 = stackOut_21_0;
                stackIn_24_1 = stackOut_21_1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                if (param4 == null) {
                  stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                  stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                  stackOut_24_2 = "null";
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  break L6;
                } else {
                  stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                  stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                  stackOut_22_2 = "{...}";
                  stackIn_25_0 = stackOut_22_0;
                  stackIn_25_1 = stackOut_22_1;
                  stackIn_25_2 = stackOut_22_2;
                  break L6;
                }
              }
              throw lj.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param5 + 44 + param6 + 41);
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
        field_c = null;
        field_e = 0;
        field_j = new int[36864];
        field_g = new String[26];
    }
}
