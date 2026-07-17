/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;
import java.applet.AppletContext;
import java.awt.Frame;

public abstract class da extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_j;
    boolean field_c;
    static boolean field_g;
    static ph field_e;
    public static boolean field_h;
    public static boolean field_a;
    public static int field_k;
    public static boolean field_b;
    public static int field_d;
    public static boolean field_f;
    public static int field_i;

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
            if (he.field_u != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.net.URL) (Object) stackIn_4_0;
            } else {
              L1: {
                if (null == fl.field_F) {
                  break L1;
                } else {
                  if ((Object) (Object) fl.field_F == this) {
                    break L1;
                  } else {
                    stackOut_9_0 = fl.field_F.getDocumentBase();
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
          throw bd.a((Throwable) (Object) var1, "da.getDocumentBase()");
        }
        return stackIn_12_0;
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
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
            se.field_b = true;
            pk.field_o = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("da.focusGained(");
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
          throw bd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    final static java.net.URL a(int param0, int param1, String param2, java.net.URL param3, String param4) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            Object stackIn_3_0 = null;
            java.net.URL stackIn_58_0 = null;
            java.net.URL stackIn_60_0 = null;
            RuntimeException stackIn_62_0 = null;
            StringBuilder stackIn_62_1 = null;
            RuntimeException stackIn_64_0 = null;
            StringBuilder stackIn_64_1 = null;
            RuntimeException stackIn_65_0 = null;
            StringBuilder stackIn_65_1 = null;
            String stackIn_65_2 = null;
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            String stackIn_69_2 = null;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            String stackIn_73_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_57_0 = null;
            java.net.URL stackOut_59_0 = null;
            Object stackOut_2_0 = null;
            RuntimeException stackOut_61_0 = null;
            StringBuilder stackOut_61_1 = null;
            RuntimeException stackOut_64_0 = null;
            StringBuilder stackOut_64_1 = null;
            String stackOut_64_2 = null;
            RuntimeException stackOut_62_0 = null;
            StringBuilder stackOut_62_1 = null;
            String stackOut_62_2 = null;
            RuntimeException stackOut_65_0 = null;
            StringBuilder stackOut_65_1 = null;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            String stackOut_68_2 = null;
            RuntimeException stackOut_66_0 = null;
            StringBuilder stackOut_66_1 = null;
            String stackOut_66_2 = null;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            String stackOut_72_2 = null;
            RuntimeException stackOut_70_0 = null;
            StringBuilder stackOut_70_1 = null;
            String stackOut_70_2 = null;
            var9 = wizardrun.field_H;
            try {
              var5_ref = param3.getFile();
              var6 = 0;
              if (param0 >= 75) {
                L0: while (true) {
                  L1: {
                    if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if (var7_int >= 0) {
                        if (param1 < 0) {
                          var6 = var7_int;
                          continue L0;
                        } else {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
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
                    if (!var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                      break L2;
                    } else {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (var7_int < 0) {
                        break L2;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    }
                  }
                  L3: {
                    if (var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (var7_int >= 0) {
                        if (param4 == null) {
                          var6 = var7_int;
                          continue L0;
                        } else {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
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
                      if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                        break L5;
                      } else {
                        if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int < 0) {
                      break L4;
                    } else {
                      if (null != param2) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    }
                  }
                  L6: {
                    var7 = new StringBuilder(var6);
                    StringBuilder discarded$9 = var7.append(var5_ref.substring(0, var6));
                    if (param1 > 0) {
                      StringBuilder discarded$10 = var7.append("/l=");
                      StringBuilder discarded$11 = var7.append(Integer.toString(param1));
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (null == param4) {
                      break L7;
                    } else {
                      if (param4.length() <= 0) {
                        break L7;
                      } else {
                        StringBuilder discarded$12 = var7.append("/p=");
                        StringBuilder discarded$13 = var7.append(param4);
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (param2 == null) {
                      break L8;
                    } else {
                      if (param2.length() <= 0) {
                        break L8;
                      } else {
                        StringBuilder discarded$14 = var7.append("/s=");
                        StringBuilder discarded$15 = var7.append(param2);
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var5_ref.length() > var6) {
                      StringBuilder discarded$16 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      break L9;
                    } else {
                      StringBuilder discarded$17 = var7.append(47);
                      break L9;
                    }
                  }
                  try {
                    L10: {
                      stackOut_57_0 = new java.net.URL(param3, var7.toString());
                      stackIn_58_0 = stackOut_57_0;
                      break L10;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_59_0 = (java.net.URL) param3;
                    stackIn_60_0 = stackOut_59_0;
                    return stackIn_60_0;
                  }
                  return stackIn_58_0;
                }
              } else {
                stackOut_2_0 = null;
                stackIn_3_0 = stackOut_2_0;
                return (java.net.URL) (Object) stackIn_3_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L11: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_61_0 = (RuntimeException) var5;
                stackOut_61_1 = new StringBuilder().append("da.C(").append(param0).append(44).append(param1).append(44);
                stackIn_64_0 = stackOut_61_0;
                stackIn_64_1 = stackOut_61_1;
                stackIn_62_0 = stackOut_61_0;
                stackIn_62_1 = stackOut_61_1;
                if (param2 == null) {
                  stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
                  stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
                  stackOut_64_2 = "null";
                  stackIn_65_0 = stackOut_64_0;
                  stackIn_65_1 = stackOut_64_1;
                  stackIn_65_2 = stackOut_64_2;
                  break L11;
                } else {
                  stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
                  stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
                  stackOut_62_2 = "{...}";
                  stackIn_65_0 = stackOut_62_0;
                  stackIn_65_1 = stackOut_62_1;
                  stackIn_65_2 = stackOut_62_2;
                  break L11;
                }
              }
              L12: {
                stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
                stackOut_65_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(44);
                stackIn_68_0 = stackOut_65_0;
                stackIn_68_1 = stackOut_65_1;
                stackIn_66_0 = stackOut_65_0;
                stackIn_66_1 = stackOut_65_1;
                if (param3 == null) {
                  stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
                  stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
                  stackOut_68_2 = "null";
                  stackIn_69_0 = stackOut_68_0;
                  stackIn_69_1 = stackOut_68_1;
                  stackIn_69_2 = stackOut_68_2;
                  break L12;
                } else {
                  stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
                  stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
                  stackOut_66_2 = "{...}";
                  stackIn_69_0 = stackOut_66_0;
                  stackIn_69_1 = stackOut_66_1;
                  stackIn_69_2 = stackOut_66_2;
                  break L12;
                }
              }
              L13: {
                stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
                stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(44);
                stackIn_72_0 = stackOut_69_0;
                stackIn_72_1 = stackOut_69_1;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                if (param4 == null) {
                  stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
                  stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
                  stackOut_72_2 = "null";
                  stackIn_73_0 = stackOut_72_0;
                  stackIn_73_1 = stackOut_72_1;
                  stackIn_73_2 = stackOut_72_2;
                  break L13;
                } else {
                  stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
                  stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
                  stackOut_70_2 = "{...}";
                  stackIn_73_0 = stackOut_70_0;
                  stackIn_73_1 = stackOut_70_1;
                  stackIn_73_2 = stackOut_70_2;
                  break L13;
                }
              }
              throw bd.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
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
            if (he.field_u != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String) (Object) stackIn_4_0;
            } else {
              L1: {
                if (fl.field_F == null) {
                  break L1;
                } else {
                  if ((Object) (Object) fl.field_F != this) {
                    stackOut_11_0 = fl.field_F.getParameter(param0);
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
            stackOut_15_1 = new StringBuilder().append("da.getParameter(");
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
          throw bd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_14_0;
    }

    final boolean g(int param0) {
        return true;
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) ca.field_c != this) {
                break L1;
              } else {
                if (!mk.field_d) {
                  lc.field_b = d.a((byte) 53);
                  int discarded$2 = 0;
                  tg.a(5000L);
                  qf.field_m = null;
                  this.b(77, false);
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
          throw bd.a((Throwable) (Object) runtimeException, "da.destroy()");
        }
    }

    static long a(long param0, long param1) {
        RuntimeException var4 = null;
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_0_0 = 0L;
        try {
          L0: {
            stackOut_0_0 = param0 ^ param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var4, "da.B(" + param0 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    final synchronized void e(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0 >= 54) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            L2: {
              if (null == wizardrun.field_G) {
                break L2;
              } else {
                wizardrun.field_G.removeFocusListener((java.awt.event.FocusListener) this);
                wizardrun.field_G.getParent().setBackground(java.awt.Color.black);
                wizardrun.field_G.getParent().remove((java.awt.Component) (Object) wizardrun.field_G);
                break L2;
              }
            }
            L3: {
              if (fl.field_H == null) {
                if (he.field_u != null) {
                  var2 = (Object) (Object) he.field_u;
                  break L3;
                } else {
                  if (null != fl.field_F) {
                    var2 = (Object) (Object) fl.field_F;
                    break L3;
                  } else {
                    var2 = (Object) (Object) ca.field_c;
                    break L3;
                  }
                }
              } else {
                var2 = (Object) (Object) fl.field_H;
                break L3;
              }
            }
            L4: {
              ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
              wizardrun.field_G = (java.awt.Canvas) (Object) new gd((java.awt.Component) this);
              java.awt.Component discarded$1 = ((java.awt.Container) var2).add((java.awt.Component) (Object) wizardrun.field_G);
              wizardrun.field_G.setSize(rg.field_R, rg.field_P);
              wizardrun.field_G.setVisible(true);
              if (var2 == (Object) (Object) he.field_u) {
                var3 = he.field_u.getInsets();
                wizardrun.field_G.setLocation(var3.left - -ph.field_o, hb.field_n + var3.top);
                break L4;
              } else {
                wizardrun.field_G.setLocation(ph.field_o, hb.field_n);
                break L4;
              }
            }
            wizardrun.field_G.addFocusListener((java.awt.event.FocusListener) this);
            wizardrun.field_G.requestFocus();
            jg.field_n = true;
            se.field_b = true;
            pk.field_o = true;
            tj.field_F = false;
            me.field_e = d.a((byte) 23);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw bd.a((Throwable) var2, "da.A(" + param0 + 41);
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    abstract void a(int param0);

    abstract void f(int param0);

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 <= 2) {
                  break L2;
                } else {
                  if (tc.field_j) {
                    break L2;
                  } else {
                    if (e.a(-73)) {
                      break L2;
                    } else {
                      ei.field_k = param1;
                      int discarded$148 = 2;
                      int discarded$149 = 65533;
                      fa.field_a = mg.a(wg.field_b, new int[1], ic.field_a, 3, (byte) 99, me.field_f, qh.field_g + hi.field_c);
                      th.field_g = ff.a(10, 2, (byte) 59, 3, 1);
                      break L1;
                    }
                  }
                }
              }
              tc.field_j = false;
              ei.field_k = 0;
              break L1;
            }
            L3: {
              if (param0 == 7775) {
                break L3;
              } else {
                field_j = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "da.J(" + param0 + 44 + param1 + 41);
        }
    }

    private final void a() {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_long = d.a((byte) 22);
            var4 = pc.field_k[jk.field_e];
            pc.field_k[jk.field_e] = var2_long;
            L1: {
              if (0L == var4) {
                break L1;
              } else {
                if (var4 >= var2_long) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              jk.field_e = 1 + jk.field_e & 31;
              int fieldTemp$1 = kk.field_zb;
              kk.field_zb = kk.field_zb + 1;
              if (fieldTemp$1 > 50) {
                L3: {
                  pk.field_o = true;
                  kk.field_zb = kk.field_zb - 50;
                  wizardrun.field_G.setSize(rg.field_R, rg.field_P);
                  wizardrun.field_G.setVisible(true);
                  if (null == he.field_u) {
                    break L3;
                  } else {
                    if (null == fl.field_H) {
                      var6 = he.field_u.getInsets();
                      wizardrun.field_G.setLocation(ph.field_o + var6.left, hb.field_n + var6.top);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                wizardrun.field_G.setLocation(ph.field_o, hb.field_n);
                break L2;
              } else {
                break L2;
              }
            }
            ((da) this).f(-103);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "da.D(" + -107 + 41);
        }
    }

    private final void b(int param0, boolean param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3 = this;
            synchronized (var3) {
              L1: {
                if (param0 >= 48) {
                  if (mk.field_d) {
                    return;
                  } else {
                    mk.field_d = true;
                    break L1;
                  }
                } else {
                  return;
                }
              }
            }
            L2: {
              if (fl.field_F != null) {
                fl.field_F.destroy();
                break L2;
              } else {
                break L2;
              }
            }
            try {
              L3: {
                ((da) this).a(false);
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
              if (null == wizardrun.field_G) {
                break L5;
              } else {
                try {
                  L6: {
                    wizardrun.field_G.removeFocusListener((java.awt.event.FocusListener) this);
                    wizardrun.field_G.getParent().remove((java.awt.Component) (Object) wizardrun.field_G);
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
              if (ld.field_g != null) {
                try {
                  L9: {
                    ld.field_g.b(-3);
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
              ((da) this).d(7069);
              if (null == he.field_u) {
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
          throw bd.a((Throwable) (Object) runtimeException, "da.F(" + param0 + 44 + param1 + 41);
        }
    }

    private final void c() {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Object var6 = null;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = d.a((byte) 69);
              var4 = ql.field_b[oj.field_c];
              ql.field_b[oj.field_c] = var2_long;
              oj.field_c = 31 & oj.field_c + 1;
              if (var4 == 0L) {
                break L1;
              } else {
                if (~var4 > ~var2_long) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var6 = this;
            synchronized (var6) {
              L2: {
                jg.field_n = se.field_b;
                break L2;
              }
            }
            ((da) this).i(-103);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw bd.a((Throwable) (Object) runtimeException, "da.H(" + 0 + 41);
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
            se.field_b = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("da.focusLost(");
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
          throw bd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 54) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            field_j = null;
            field_e = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "da.I(" + param0 + 41);
        }
    }

    public abstract void init();

    final static void h(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (u.field_A != null) {
                u.field_A.g(-5903);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (ea.field_e != null) {
                ea.field_e.k(param0 + 21);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 == 0) {
                break L3;
              } else {
                int discarded$2 = da.a(-116, false);
                break L3;
              }
            }
            nh.c((byte) 95);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "da.O(" + param0 + 41);
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) ca.field_c) {
                break L1;
              } else {
                if (!mk.field_d) {
                  lc.field_b = 4000L + d.a((byte) 67);
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
          throw bd.a((Throwable) (Object) runtimeException, "da.stop()");
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
            boolean stackIn_69_0 = false;
            int stackIn_103_0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_67_0 = false;
            int stackOut_101_0 = 0;
            var5 = wizardrun.field_H;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        if (vh.field_p != null) {
                          L4: {
                            var1 = (Object) (Object) vh.field_p.toLowerCase();
                            if (((String) var1).indexOf("sun") != -1) {
                              break L4;
                            } else {
                              if (((String) var1).indexOf("apple") != -1) {
                                break L4;
                              } else {
                                break L3;
                              }
                            }
                          }
                          L5: {
                            var2 = vh.field_b;
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
                                                        if (~var3 <= ~var2.length()) {
                                                          break L7;
                                                        } else {
                                                          int discarded$4 = -5717;
                                                          if (!vl.a(var2.charAt(var3))) {
                                                            break L7;
                                                          } else {
                                                            var3++;
                                                            continue L6;
                                                          }
                                                        }
                                                      }
                                                      var4 = var2.substring(6, var3);
                                                      if (!af.a((CharSequence) (Object) var4, (byte) 78)) {
                                                        break L3;
                                                      } else {
                                                        if (ph.a(1124, (CharSequence) (Object) var4) < 10) {
                                                          ((da) this).a("wrongjava", (byte) 126);
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
                          ((da) this).a("wrongjava", (byte) 126);
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                      L8: {
                        if (null == vh.field_b) {
                          break L8;
                        } else {
                          stackOut_67_0 = vh.field_b.startsWith("1.");
                          stackIn_69_0 = stackOut_67_0;
                          if (stackIn_69_0) {
                            var1_int = 2;
                            var2_int = 0;
                            L9: while (true) {
                              L10: {
                                if (var1_int >= vh.field_b.length()) {
                                  break L10;
                                } else {
                                  var3 = vh.field_b.charAt(var1_int);
                                  if (48 > var3) {
                                    break L10;
                                  } else {
                                    if (var3 <= 57) {
                                      var2_int = -48 - -var3 + 10 * var2_int;
                                      var1_int++;
                                      continue L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              if (5 <= var2_int) {
                                ug.field_Q = true;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      L11: {
                        var1 = (Object) (Object) ca.field_c;
                        if (null != fl.field_F) {
                          var1 = (Object) (Object) fl.field_F;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        var2_ref = vh.field_q;
                        if (var2_ref != null) {
                          try {
                            L13: {
                              Object discarded$5 = var2_ref.invoke(var1, new Object[1]);
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
                      kj.a(47);
                      ((da) this).e(81);
                      hl.field_b = bh.a((java.awt.Component) (Object) wizardrun.field_G, (byte) 105, rg.field_R, rg.field_P);
                      ((da) this).a(6);
                      pe.field_y = wl.b(250);
                      L15: while (true) {
                        L16: {
                          if (lc.field_b == 0L) {
                            break L16;
                          } else {
                            if (~lc.field_b >= ~d.a((byte) 76)) {
                              break L2;
                            } else {
                              break L16;
                            }
                          }
                        }
                        uh.field_c = pe.field_y.a(wj.field_E, 0);
                        stackOut_101_0 = 0;
                        stackIn_103_0 = stackOut_101_0;
                        var3 = stackIn_103_0;
                        L17: while (true) {
                          if (var3 >= uh.field_c) {
                            int discarded$6 = -107;
                            this.a();
                            bi.a(ld.field_g, (byte) -88, (Object) (Object) wizardrun.field_G);
                            continue L15;
                          } else {
                            int discarded$7 = 0;
                            this.c();
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
                    rg.a((Throwable) var1, (String) null, -562);
                    ((da) this).a("crash", (byte) 126);
                    break L18;
                  }
                }
                this.b(118, true);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw bd.a((Throwable) var1, "da.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
            ((da) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("da.windowClosing(");
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
          throw bd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
            ((da) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("da.update(");
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
          throw bd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (null != he.field_u) {
          return null;
        } else {
          L0: {
            if (fl.field_F == null) {
              break L0;
            } else {
              if (this == (Object) (Object) fl.field_F) {
                break L0;
              } else {
                return fl.field_F.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) ca.field_c != this) {
                break L1;
              } else {
                if (mk.field_d) {
                  break L1;
                } else {
                  L2: {
                    pk.field_o = true;
                    if (!ug.field_Q) {
                      break L2;
                    } else {
                      if (-me.field_e + d.a((byte) 92) <= 1000L) {
                        break L2;
                      } else {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (var2 == null) {
                            break L3;
                          } else {
                            if (~le.field_b < ~var2.width) {
                              break L2;
                            } else {
                              if (oj.field_b <= var2.height) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        tj.field_F = true;
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
            stackOut_22_0 = (RuntimeException) var2_ref;
            stackOut_22_1 = new StringBuilder().append("da.paint(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L4;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    final void a(String param0, byte param1) {
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
                if (param1 > 125) {
                  if (((da) this).field_c) {
                    return;
                  } else {
                    ((da) this).field_c = true;
                    System.out.println("error_game_" + param0);
                    try {
                      L1: {
                        Object discarded$1 = cl.a(jg.f(1), -3264, "loggedout");
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
                        ((da) this).getAppletContext().showDocument(new java.net.URL(((da) this).getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
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
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) var3_ref2;
                stackOut_13_1 = new StringBuilder().append("da.Q(");
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
                  break L5;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_17_0 = stackOut_14_0;
                  stackIn_17_1 = stackOut_14_1;
                  stackIn_17_2 = stackOut_14_2;
                  break L5;
                }
              }
              throw bd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void i(int param0);

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    abstract void a(boolean param0);

    abstract void d(int param0);

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
            fl.field_F = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("da.provideLoaderApplet(");
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
          throw bd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) ca.field_c != this) {
                break L1;
              } else {
                if (!mk.field_d) {
                  lc.field_b = 0L;
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
          throw bd.a((Throwable) (Object) runtimeException, "da.start()");
        }
    }

    final static int a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int stackIn_2_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (0 != param0) {
              if (0 < param0) {
                L1: {
                  var2_int = 1;
                  if (param0 > 65535) {
                    var2_int += 16;
                    param0 = param0 >> 16;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param0 <= 255) {
                    break L2;
                  } else {
                    var2_int += 8;
                    param0 = param0 >> 8;
                    break L2;
                  }
                }
                L3: {
                  if (param0 <= 15) {
                    break L3;
                  } else {
                    param0 = param0 >> 4;
                    var2_int += 4;
                    break L3;
                  }
                }
                L4: {
                  if (param0 > 3) {
                    param0 = param0 >> 2;
                    var2_int += 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param0 > 1) {
                    param0 = param0 >> 1;
                    var2_int++;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                stackOut_22_0 = var2_int;
                stackIn_23_0 = stackOut_22_0;
                return stackIn_23_0;
              } else {
                L6: {
                  var2_int = 2;
                  if (param1) {
                    break L6;
                  } else {
                    field_g = false;
                    break L6;
                  }
                }
                L7: {
                  if (param0 >= -65536) {
                    break L7;
                  } else {
                    var2_int += 16;
                    param0 = param0 >> 16;
                    break L7;
                  }
                }
                L8: {
                  if (param0 >= -256) {
                    break L8;
                  } else {
                    var2_int += 8;
                    param0 = param0 >> 8;
                    break L8;
                  }
                }
                L9: {
                  if (param0 >= -16) {
                    break L9;
                  } else {
                    var2_int += 4;
                    param0 = param0 >> 4;
                    break L9;
                  }
                }
                L10: {
                  if (param0 < -4) {
                    param0 = param0 >> 2;
                    var2_int += 2;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param0 >= -2) {
                    break L11;
                  } else {
                    param0 = param0 >> 1;
                    var2_int++;
                    break L11;
                  }
                }
                stackOut_39_0 = var2_int;
                stackIn_40_0 = stackOut_39_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "da.L(" + param0 + 44 + param1 + 41);
        }
        return stackIn_40_0;
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        java.applet.AppletContext stackOut_9_0 = null;
        java.applet.AppletContext stackOut_11_0 = null;
        try {
          L0: {
            if (he.field_u != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.applet.AppletContext) (Object) stackIn_4_0;
            } else {
              L1: {
                if (null == fl.field_F) {
                  break L1;
                } else {
                  if ((Object) (Object) fl.field_F == this) {
                    break L1;
                  } else {
                    stackOut_9_0 = fl.field_F.getAppletContext();
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              }
              stackOut_11_0 = super.getAppletContext();
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "da.getAppletContext()");
        }
        return stackIn_12_0;
    }

    protected da() {
        ((da) this).field_c = false;
    }

    final void a(int param0, int param1, byte param2, String param3, int param4, int param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            int var8_int = 0;
            jh var9 = null;
            int var10 = 0;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            var10 = wizardrun.field_H;
            try {
              try {
                L0: {
                  if (ca.field_c != null) {
                    dg.field_e = dg.field_e + 1;
                    if (dg.field_e < 3) {
                      ((da) this).getAppletContext().showDocument(((da) this).getDocumentBase(), "_self");
                      return;
                    } else {
                      ((da) this).a("alreadyloaded", (byte) 126);
                      return;
                    }
                  } else {
                    rg.field_R = param5;
                    le.field_b = param5;
                    fi.field_A = param0;
                    ph.field_o = 0;
                    hb.field_n = 0;
                    var8_int = 118 / ((param2 - -8) / 54);
                    ca.field_c = (da) this;
                    rg.field_P = param4;
                    oj.field_b = param4;
                    ej.field_a = jg.f(1);
                    vh dupTemp$2 = new vh(param6, param3, param1, true);
                    ld.field_g = dupTemp$2;
                    qf.field_m = dupTemp$2;
                    var9 = ld.field_g.a((byte) -88, (Runnable) this, 1);
                    L1: while (true) {
                      if (var9.field_a != 0) {
                        break L0;
                      } else {
                        int discarded$3 = 0;
                        tg.a(10L);
                        continue L1;
                      }
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var8 = decompiledCaughtException;
                  rg.a(var8, (String) null, -562);
                  ((da) this).a("crash", (byte) 126);
                  break L2;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_17_0 = (RuntimeException) var8_ref;
                stackOut_17_1 = new StringBuilder().append("da.N(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                stackIn_20_0 = stackOut_17_0;
                stackIn_20_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param3 == null) {
                  stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                  stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                  stackOut_20_2 = "null";
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  break L3;
                } else {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "{...}";
                  stackIn_21_0 = stackOut_18_0;
                  stackIn_21_1 = stackOut_18_1;
                  stackIn_21_2 = stackOut_18_2;
                  break L3;
                }
              }
              throw bd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.awt.Frame a(int param0, int param1, int param2, vh param3, int param4, int param5) {
        RuntimeException var6 = null;
        rb[] var6_array = null;
        jh var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_46_0 = null;
        java.awt.Frame stackIn_48_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_36_0 = null;
        Object stackOut_8_0 = null;
        java.awt.Frame stackOut_47_0 = null;
        Object stackOut_45_0 = null;
        Object stackOut_42_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var9 = wizardrun.field_H;
        try {
          L0: {
            if (param3.a(169978736)) {
              L1: {
                if (param2 == param4) {
                  var6_array = cd.a(true, param3);
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (~var8 <= ~var6_array.length) {
                        if (var7_int == 0) {
                          stackOut_36_0 = null;
                          stackIn_37_0 = stackOut_36_0;
                          return (java.awt.Frame) (Object) stackIn_37_0;
                        } else {
                          break L1;
                        }
                      } else {
                        L3: {
                          if (~param1 != ~var6_array[var8].field_g) {
                            break L3;
                          } else {
                            if (~var6_array[var8].field_h == ~param0) {
                              L4: {
                                if (param5 == 0) {
                                  break L4;
                                } else {
                                  if (var6_array[var8].field_f != param5) {
                                    break L3;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (var6_array[var8].field_c > param4) {
                                    break L5;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              var7_int = 1;
                              param4 = var6_array[var8].field_c;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (java.awt.Frame) (Object) stackIn_9_0;
                  }
                } else {
                  break L1;
                }
              }
              var6_ref = param3.a(param4, 114, param5, param1, param0);
              L6: while (true) {
                if (var6_ref.field_a != 0) {
                  var7 = (java.awt.Frame) var6_ref.field_e;
                  if (null != var7) {
                    if (var6_ref.field_a != 2) {
                      stackOut_47_0 = (java.awt.Frame) var7;
                      stackIn_48_0 = stackOut_47_0;
                      break L0;
                    } else {
                      q.a(62, var7, param3);
                      stackOut_45_0 = null;
                      stackIn_46_0 = stackOut_45_0;
                      return (java.awt.Frame) (Object) stackIn_46_0;
                    }
                  } else {
                    stackOut_42_0 = null;
                    stackIn_43_0 = stackOut_42_0;
                    return (java.awt.Frame) (Object) stackIn_43_0;
                  }
                } else {
                  int discarded$1 = 0;
                  tg.a(10L);
                  continue L6;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (java.awt.Frame) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var6;
            stackOut_49_1 = new StringBuilder().append("da.S(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_52_0 = stackOut_49_0;
            stackIn_52_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param3 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L7;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_53_0 = stackOut_50_0;
              stackIn_53_1 = stackOut_50_1;
              stackIn_53_2 = stackOut_50_2;
              break L7;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_48_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = false;
        field_j = "Reload game";
    }
}
