/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.applet.AppletContext;
import java.net.URL;

public abstract class eh extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String[] field_k;
    static boolean field_m;
    static rh field_f;
    boolean field_i;
    static ci field_b;
    static gg[] field_g;
    static int field_d;
    public static boolean field_j;
    public static int field_a;
    public static int field_e;
    public static boolean field_h;
    public static boolean field_n;
    public static boolean field_c;
    public static boolean field_l;

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
            le.field_r = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("eh.provideLoaderApplet(");
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
          throw qk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
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
              if ((Object) (Object) gm.field_f != this) {
                break L1;
              } else {
                if (qi.field_f) {
                  break L1;
                } else {
                  L2: {
                    il.field_e = true;
                    if (!bh.field_f) {
                      break L2;
                    } else {
                      if (ll.a(1000) - oj.field_x > 1000L) {
                        L3: {
                          var2_ref = param0.getClipBounds();
                          if (var2_ref == null) {
                            break L3;
                          } else {
                            if (var2_ref.width < hd.field_i) {
                              break L2;
                            } else {
                              if (dj.field_a <= var2_ref.height) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        ai.field_h = true;
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
            stackOut_24_1 = new StringBuilder().append("eh.paint(");
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
          throw qk.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
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
            if (al.field_W == null) {
              L1: {
                if (null == le.field_r) {
                  break L1;
                } else {
                  if ((Object) (Object) le.field_r == this) {
                    break L1;
                  } else {
                    stackOut_7_0 = le.field_r.getAppletContext();
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
          throw qk.a((Throwable) (Object) var1, "eh.getAppletContext()");
        }
        return stackIn_10_0;
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
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
        String stackOut_9_0 = null;
        String stackOut_11_0 = null;
        Object stackOut_1_0 = null;
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
            if (al.field_W == null) {
              L1: {
                if (null == le.field_r) {
                  break L1;
                } else {
                  if (this != (Object) (Object) le.field_r) {
                    stackOut_9_0 = le.field_r.getParameter(param0);
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_11_0 = super.getParameter(param0);
              stackIn_12_0 = stackOut_11_0;
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
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("eh.getParameter(");
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
          throw qk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_12_0;
    }

    public static void c(int param0) {
        try {
            field_f = null;
            field_g = null;
            field_k = null;
            field_b = null;
            if (param0 != -25) {
                field_g = null;
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "eh.G(" + param0 + ')');
        }
    }

    abstract void a(int param0);

    public final void windowActivated(java.awt.event.WindowEvent param0) {
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
            ((eh) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("eh.windowClosing(");
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
          throw qk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
            int stackIn_73_0 = 0;
            int stackIn_73_1 = 0;
            int stackIn_84_0 = 0;
            int stackIn_84_1 = 0;
            int stackIn_98_0 = 0;
            int stackIn_103_0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_49_0 = false;
            boolean stackOut_66_0 = false;
            int stackOut_72_0 = 0;
            int stackOut_72_1 = 0;
            int stackOut_83_0 = 0;
            int stackOut_83_1 = 0;
            int stackOut_97_0 = 0;
            int stackOut_101_0 = 0;
            var5 = Terraphoenix.field_V;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (null != he.field_j) {
                              L6: {
                                var1 = (Object) (Object) he.field_j.toLowerCase();
                                if (((String) var1).indexOf("sun") != -1) {
                                  break L6;
                                } else {
                                  if (((String) var1).indexOf("apple") == -1) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              L7: {
                                L8: {
                                  var2 = he.field_d;
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
                                ((eh) this).a("wrongjava", true);
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
                                    if (~var3 <= ~var2.length()) {
                                      break L10;
                                    } else {
                                      stackOut_49_0 = gb.a((byte) 41, var2.charAt(var3));
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
                                  int discarded$4 = 1;
                                  if (!te.a((CharSequence) (Object) var4)) {
                                    break L5;
                                  } else {
                                    if (10 <= ta.a((CharSequence) (Object) var4, 121)) {
                                      break L5;
                                    } else {
                                      ((eh) this).a("wrongjava", true);
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
                            } else {
                              break L5;
                            }
                          }
                          if (null == he.field_d) {
                            break L3;
                          } else {
                            stackOut_66_0 = he.field_d.startsWith("1.");
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
                                if (~he.field_d.length() >= ~var1_int) {
                                  break L13;
                                } else {
                                  var3 = he.field_d.charAt(var1_int);
                                  stackOut_72_0 = 48;
                                  stackOut_72_1 = var3;
                                  stackIn_84_0 = stackOut_72_0;
                                  stackIn_84_1 = stackOut_72_1;
                                  stackIn_73_0 = stackOut_72_0;
                                  stackIn_73_1 = stackOut_72_1;
                                  if (var5 != 0) {
                                    break L12;
                                  } else {
                                    if (stackIn_73_0 > stackIn_73_1) {
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
                                      var2_int = var2_int * 10 - (-var3 + 48);
                                      if (var5 == 0) {
                                        continue L11;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_83_0 = 5;
                              stackOut_83_1 = var2_int;
                              stackIn_84_0 = stackOut_83_0;
                              stackIn_84_1 = stackOut_83_1;
                              break L12;
                            }
                            if (stackIn_84_0 <= stackIn_84_1) {
                              bh.field_f = true;
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
                        var1 = (Object) (Object) gm.field_f;
                        if (null == le.field_r) {
                          break L15;
                        } else {
                          var1 = (Object) (Object) le.field_r;
                          break L15;
                        }
                      }
                      L16: {
                        var2_ref = he.field_x;
                        if (null != var2_ref) {
                          try {
                            L17: {
                              Object discarded$5 = var2_ref.invoke(var1, new Object[1]);
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
                      int discarded$6 = -119;
                      oa.a();
                      ((eh) this).d(0);
                      k.field_f = bi.a(ja.field_j, -126, wc.field_p, (java.awt.Component) (Object) ae.field_G);
                      ((eh) this).f(-120);
                      ea.field_k = qc.a(-1);
                      L19: while (true) {
                        L20: {
                          L21: {
                            if (ae.field_M == 0L) {
                              break L21;
                            } else {
                              stackOut_97_0 = (ae.field_M < ll.a(1000) ? -1 : (ae.field_M == ll.a(1000) ? 0 : 1));
                              stackIn_103_0 = stackOut_97_0;
                              stackIn_98_0 = stackOut_97_0;
                              if (var5 != 0) {
                                break L20;
                              } else {
                                if (stackIn_98_0 <= 0) {
                                  break L2;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          bb.field_d = ea.field_k.a(dm.field_f, -121);
                          stackOut_101_0 = 0;
                          stackIn_103_0 = stackOut_101_0;
                          break L20;
                        }
                        var3 = stackIn_103_0;
                        L22: while (true) {
                          L23: {
                            L24: {
                              if (~var3 <= ~bb.field_d) {
                                break L24;
                              } else {
                                this.e(8028);
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
                            int discarded$7 = 0;
                            this.b();
                            cf.a(nj.field_l, false, (Object) (Object) ae.field_G);
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
                    bd.a((Throwable) var1, (String) null, -97);
                    ((eh) this).a("crash", true);
                    break L25;
                  }
                }
                this.a(true, true);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw qk.a((Throwable) var1, "eh.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (al.field_W != null) {
          return null;
        } else {
          L0: {
            if (le.field_r == null) {
              break L0;
            } else {
              if (this == (Object) (Object) le.field_r) {
                break L0;
              } else {
                return le.field_r.getCodeBase();
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
            wb.field_d = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("eh.focusLost(");
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
          throw qk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    abstract void a(byte param0);

    final void a(String param0, boolean param1) {
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
                if (((eh) this).field_i) {
                  return;
                } else {
                  ((eh) this).field_i = param1;
                  System.out.println("error_game_" + param0);
                  try {
                    L1: {
                      Object discarded$1 = cd.a((byte) -128, "loggedout", dg.a(false));
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
                      ((eh) this).getAppletContext().showDocument(new java.net.URL(((eh) this).getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
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
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var3_ref2;
                stackOut_11_1 = new StringBuilder().append("eh.M(");
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
              throw qk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
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
                if (!qi.field_f) {
                  qi.field_f = true;
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (le.field_r == null) {
                break L2;
              } else {
                le.field_r.destroy();
                break L2;
              }
            }
            try {
              L3: {
                ((eh) this).b((byte) 118);
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
              if (null == ae.field_G) {
                break L5;
              } else {
                try {
                  L6: {
                    ae.field_G.removeFocusListener((java.awt.event.FocusListener) this);
                    ae.field_G.getParent().remove((java.awt.Component) (Object) ae.field_G);
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
              if (null != nj.field_l) {
                try {
                  L9: {
                    nj.field_l.c(-7538);
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
              ((eh) this).a(102);
              if (al.field_W != null) {
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
          throw qk.a((Throwable) (Object) runtimeException, "eh.O(" + true + ',' + param1 + ')');
        }
    }

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
              var2_long = ll.a(1000);
              var4 = bb.field_f[ck.field_b];
              bb.field_f[ck.field_b] = var2_long;
              if (var4 == 0L) {
                break L1;
              } else {
                if (~var4 <= ~var2_long) {
                  break L1;
                } else {
                  var6_int = (int)(var2_long - var4);
                  gl.field_k = ((var6_int >> 1) + 32000) / var6_int;
                  break L1;
                }
              }
            }
            L2: {
              ck.field_b = ck.field_b - -1 & 31;
              int fieldTemp$1 = q.field_Db;
              q.field_Db = q.field_Db + 1;
              if (50 < fieldTemp$1) {
                L3: {
                  il.field_e = true;
                  q.field_Db = q.field_Db - 50;
                  ae.field_G.setSize(ja.field_j, wc.field_p);
                  ae.field_G.setVisible(true);
                  if (null == al.field_W) {
                    break L3;
                  } else {
                    if (jb.field_e != null) {
                      break L3;
                    } else {
                      var6 = al.field_W.getInsets();
                      ae.field_G.setLocation(var6.left + ng.field_v, uh.field_P + var6.top);
                      if (Terraphoenix.field_V == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ae.field_G.setLocation(ng.field_v, uh.field_P);
                break L2;
              } else {
                break L2;
              }
            }
            ((eh) this).a((byte) -89);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "eh.J(" + 0 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Object var6 = null;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = ll.a(1000);
              var4 = jb.field_d[o.field_b];
              jb.field_d[o.field_b] = var2_long;
              if (var4 == 0L) {
                break L1;
              } else {
                if (~var2_long >= ~var4) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 8028) {
                break L2;
              } else {
                ((eh) this).windowClosing((java.awt.event.WindowEvent) null);
                break L2;
              }
            }
            o.field_b = 1 + o.field_b & 31;
            var6 = this;
            synchronized (var6) {
              L3: {
                uk.field_c = wb.field_d;
                break L3;
              }
            }
            ((eh) this).a(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw qk.a((Throwable) (Object) runtimeException, "eh.H(" + param0 + ')');
        }
    }

    public abstract void init();

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) gm.field_f != this) {
                break L1;
              } else {
                if (!qi.field_f) {
                  ae.field_M = ll.a(1000);
                  gi.a((byte) -113, 5000L);
                  d.field_K = null;
                  this.a(true, false);
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
          throw qk.a((Throwable) (Object) runtimeException, "eh.destroy()");
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
            ((eh) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("eh.update(");
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
          throw qk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    abstract void f(int param0);

    final synchronized void d(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (null == ae.field_G) {
                break L1;
              } else {
                ae.field_G.removeFocusListener((java.awt.event.FocusListener) this);
                ae.field_G.getParent().setBackground(java.awt.Color.black);
                ae.field_G.getParent().remove((java.awt.Component) (Object) ae.field_G);
                break L1;
              }
            }
            L2: {
              L3: {
                if (jb.field_e != null) {
                  break L3;
                } else {
                  L4: {
                    if (al.field_W == null) {
                      break L4;
                    } else {
                      var2 = (Object) (Object) al.field_W;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (le.field_r != null) {
                      break L5;
                    } else {
                      var2 = (Object) (Object) gm.field_f;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = (Object) (Object) le.field_r;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = (Object) (Object) jb.field_e;
              break L2;
            }
            ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
            ae.field_G = (java.awt.Canvas) (Object) new jm((java.awt.Component) this);
            if (param0 == 0) {
              L6: {
                L7: {
                  java.awt.Component discarded$6 = ((java.awt.Container) var2).add((java.awt.Component) (Object) ae.field_G);
                  ae.field_G.setSize(ja.field_j, wc.field_p);
                  ae.field_G.setVisible(true);
                  if (var2 != (Object) (Object) al.field_W) {
                    break L7;
                  } else {
                    var3 = al.field_W.getInsets();
                    ae.field_G.setLocation(ng.field_v + var3.left, uh.field_P + var3.top);
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                ae.field_G.setLocation(ng.field_v, uh.field_P);
                break L6;
              }
              ae.field_G.addFocusListener((java.awt.event.FocusListener) this);
              ae.field_G.requestFocus();
              uk.field_c = true;
              wb.field_d = true;
              il.field_e = true;
              ai.field_h = false;
              oj.field_x = ll.a(1000);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw qk.a((Throwable) var2, "eh.E(" + param0 + ')');
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) gm.field_f) {
                break L1;
              } else {
                if (!qi.field_f) {
                  ae.field_M = ll.a(1000) + 4000L;
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
          throw qk.a((Throwable) (Object) runtimeException, "eh.stop()");
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    abstract void a(boolean param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) gm.field_f != this) {
                break L1;
              } else {
                if (!qi.field_f) {
                  ae.field_M = 0L;
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
          throw qk.a((Throwable) (Object) runtimeException, "eh.start()");
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
            if (null == al.field_W) {
              L1: {
                if (null == le.field_r) {
                  break L1;
                } else {
                  if ((Object) (Object) le.field_r != this) {
                    stackOut_9_0 = le.field_r.getDocumentBase();
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
          throw qk.a((Throwable) (Object) var1, "eh.getDocumentBase()");
        }
        return stackIn_12_0;
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    final boolean b(boolean param0) {
        return true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            mf var8_ref2 = null;
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
            var9 = Terraphoenix.field_V;
            try {
              try {
                L0: {
                  if (gm.field_f != null) {
                    jm.field_f = jm.field_f + 1;
                    if (jm.field_f >= 3) {
                      ((eh) this).a("alreadyloaded", true);
                      return;
                    } else {
                      ((eh) this).getAppletContext().showDocument(((eh) this).getDocumentBase(), "_self");
                      return;
                    }
                  } else {
                    L1: {
                      gm.field_f = (eh) this;
                      ng.field_v = 0;
                      ja.field_j = param4;
                      hd.field_i = param4;
                      wc.field_p = param6;
                      dj.field_a = param6;
                      if (param1 == 50) {
                        break L1;
                      } else {
                        this.e(-55);
                        break L1;
                      }
                    }
                    uh.field_P = 0;
                    ve.field_b = param3;
                    td.field_b = dg.a(false);
                    he dupTemp$1 = new he(param2, param5, param0, true);
                    nj.field_l = dupTemp$1;
                    d.field_K = dupTemp$1;
                    var8_ref2 = nj.field_l.a((Runnable) this, (byte) -21, 1);
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (var8_ref2.field_d != 0) {
                            break L4;
                          } else {
                            gi.a((byte) -56, 10L);
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
                  bd.a(var8, (String) null, 108);
                  ((eh) this).a("crash", true);
                  break L5;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_23_0 = (RuntimeException) var8_ref;
                stackOut_23_1 = new StringBuilder().append("eh.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
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
              throw qk.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param6 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void b(byte param0);

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
            wb.field_d = true;
            il.field_e = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("eh.focusGained(");
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
          throw qk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final static void a(int param0, dh param1) {
        try {
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            int var5 = 0;
            byte stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            RuntimeException stackIn_32_0 = null;
            StringBuilder stackIn_32_1 = null;
            RuntimeException stackIn_33_0 = null;
            StringBuilder stackIn_33_1 = null;
            String stackIn_33_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            byte stackOut_9_0 = 0;
            int stackOut_16_0 = 0;
            RuntimeException stackOut_29_0 = null;
            StringBuilder stackOut_29_1 = null;
            RuntimeException stackOut_32_0 = null;
            StringBuilder stackOut_32_1 = null;
            String stackOut_32_2 = null;
            RuntimeException stackOut_30_0 = null;
            StringBuilder stackOut_30_1 = null;
            String stackOut_30_2 = null;
            var5 = Terraphoenix.field_V;
            try {
              L0: {
                L1: {
                  var2 = new byte[24];
                  if (param0 == 9371) {
                    break L1;
                  } else {
                    field_g = null;
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    if (mh.field_b != null) {
                      try {
                        L4: {
                          mh.field_b.a(false, 0L);
                          mh.field_b.a(var2, param0 + -2766);
                          var3_int = 0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (var3_int >= 24) {
                                  break L7;
                                } else {
                                  stackOut_9_0 = var2[var3_int];
                                  stackIn_17_0 = stackOut_9_0;
                                  stackIn_10_0 = stackOut_9_0;
                                  if (var5 != 0) {
                                    break L6;
                                  } else {
                                    if (stackIn_10_0 != 0) {
                                      break L7;
                                    } else {
                                      var3_int++;
                                      if (var5 == 0) {
                                        continue L5;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_16_0 = -25;
                              stackIn_17_0 = stackOut_16_0;
                              break L6;
                            }
                            if (stackIn_17_0 < ~var3_int) {
                              decompiledRegionSelector0 = 0;
                              break L4;
                            } else {
                              throw new IOException();
                            }
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L8: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L9: while (true) {
                            L10: {
                              if (var4 >= 24) {
                                break L10;
                              } else {
                                var2[var4] = (byte) -1;
                                var4++;
                                if (var5 != 0) {
                                  decompiledRegionSelector0 = 1;
                                  break L8;
                                } else {
                                  if (var5 == 0) {
                                    continue L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            decompiledRegionSelector0 = 0;
                            break L8;
                          }
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L3;
                      } else {
                        break L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                  param1.a(-222449912, var2, 24, 0);
                  break L2;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L11: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_29_0 = (RuntimeException) runtimeException;
                stackOut_29_1 = new StringBuilder().append("eh.L(").append(param0).append(',');
                stackIn_32_0 = stackOut_29_0;
                stackIn_32_1 = stackOut_29_1;
                stackIn_30_0 = stackOut_29_0;
                stackIn_30_1 = stackOut_29_1;
                if (param1 == null) {
                  stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
                  stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
                  stackOut_32_2 = "null";
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  break L11;
                } else {
                  stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
                  stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
                  stackOut_30_2 = "{...}";
                  stackIn_33_0 = stackOut_30_0;
                  stackIn_33_1 = stackOut_30_1;
                  stackIn_33_2 = stackOut_30_2;
                  break L11;
                }
              }
              throw qk.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected eh() {
        ((eh) this).field_i = false;
    }

    final static void a(int param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (null == pe.field_b) {
                break L1;
              } else {
                pe.field_b.field_N.a(-11678, param1);
                break L1;
              }
            }
            L2: {
              if (rd.field_s == null) {
                break L2;
              } else {
                rd.field_s.field_N.a(-11678, param1);
                break L2;
              }
            }
            L3: {
              if (param0 == -32202) {
                break L3;
              } else {
                eh.a(-61, (String[]) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("eh.N(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new String[255];
        field_m = false;
        field_f = new rh(10, 2, 2, 0);
        field_d = 0;
    }
}
