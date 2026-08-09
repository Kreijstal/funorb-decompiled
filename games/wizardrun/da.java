/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (he.field_u != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null == fl.field_F) {
                  break L1;
                } else {
                  if (fl.field_F == this) {
                    break L1;
                  } else {
                    stackIn_10_0 = fl.field_F.getDocumentBase();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_12_0 = super.getDocumentBase();
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "da.getDocumentBase()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.net.URL) ((Object) stackIn_4_0);
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
            se.field_b = true;
            pk.field_o = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("da.focusGained(");

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
          throw bd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    final static java.net.URL a(int param0, int param1, String param2, java.net.URL param3, String param4) {
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
            java.net.URL stackIn_3_0 = null;
            java.net.URL stackIn_58_0 = null;
            java.net.URL stackIn_60_0 = null;
            RuntimeException stackIn_64_0 = null;
            StringBuilder stackIn_64_1 = null;
            RuntimeException stackIn_65_0 = null;
            StringBuilder stackIn_65_1 = null;
            String stackIn_65_2 = null;
            StringBuilder stackIn_68_1 = null;
            StringBuilder stackIn_69_1 = null;
            String stackIn_69_2 = null;
            StringBuilder stackIn_72_1 = null;
            StringBuilder stackIn_73_1 = null;
            String stackIn_73_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = wizardrun.field_H;
            try {
              L0: {
                var5 = param3.getFile();
                var6 = 0;
                if (param0 >= 75) {
                  L1: while (true) {
                    L2: {
                      if (var5.regionMatches(var6, "/l=", 0, 3)) {
                        var7_int = var5.indexOf('/', var6 - -1);
                        if ((var7_int ^ -1) <= -1) {
                          if ((param1 ^ -1) > -1) {
                            var6 = var7_int;
                            continue L1;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
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
                      if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                        break L3;
                      } else {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (-1 < (var7_int ^ -1)) {
                          break L3;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      }
                    }
                    L4: {
                      if (var5.regionMatches(var6, "/p=", 0, 3)) {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (-1 >= (var7_int ^ -1)) {
                          if (param4 == null) {
                            var6 = var7_int;
                            continue L1;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
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
                        if (var5.regionMatches(var6, "/s=", 0, 3)) {
                          break L6;
                        } else {
                          if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7_int = var5.indexOf('/', 1 + var6);
                      if ((var7_int ^ -1) > -1) {
                        break L5;
                      } else {
                        if (null != param2) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      }
                    }
                    L7: {
                      var7 = new StringBuilder(var6);
                      discarded$0 = var7.append(var5.substring(0, var6));
                      if (param1 > 0) {
                        discarded$1 = var7.append("/l=");
                        discarded$2 = var7.append(Integer.toString(param1));
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (null == param4) {
                        break L8;
                      } else {
                        if (-1 <= (param4.length() ^ -1)) {
                          break L8;
                        } else {
                          discarded$3 = var7.append("/p=");
                          discarded$4 = var7.append(param4);
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (param2 == null) {
                        break L9;
                      } else {
                        if (-1 <= (param2.length() ^ -1)) {
                          break L9;
                        } else {
                          discarded$5 = var7.append("/s=");
                          discarded$6 = var7.append(param2);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (var5.length() > var6) {
                        discarded$7 = var7.append(var5.substring(var6, var5.length()));
                        break L10;
                      } else {
                        discarded$8 = var7.append('/');
                        break L10;
                      }
                    }
                    try {
                      L11: {
                        stackIn_58_0 = new java.net.URL(param3, var7.toString());
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackIn_60_0 = (java.net.URL) (param3);
                      return stackIn_60_0;
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackIn_3_0 = (java.net.URL) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_64_0 = (RuntimeException) (var5_ref);

                stackIn_64_1 = new StringBuilder().append("da.C(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
                  stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
                  stackIn_65_2 = "null";
                  break L12;
                } else {
                  stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
                  stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
                  stackIn_65_2 = "{...}";
                  break L12;
                }
              }
              L13: {


                stackIn_68_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',');

                if (param3 == null) {
                  stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
                  stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
                  stackIn_69_2 = "null";
                  break L13;
                } else {
                  stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
                  stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
                  stackIn_69_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');

                if (param4 == null) {
                  stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
                  stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
                  stackIn_73_2 = "null";
                  break L14;
                } else {
                  stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
                  stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
                  stackIn_73_2 = "{...}";
                  break L14;
                }
              }
              throw bd.a((Throwable) ((Object) stackIn_65_0), stackIn_73_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_3_0;
            } else {
              return stackIn_58_0;
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
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (he.field_u != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (fl.field_F == null) {
                  break L1;
                } else {
                  if (fl.field_F != this) {
                    stackIn_12_0 = fl.field_F.getParameter(param0);
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

            stackIn_18_1 = new StringBuilder().append("da.getParameter(");

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
          throw bd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
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

    final boolean g(int param0) {
        return true;
    }

    public final void destroy() {
        if (ca.field_c != this || mk.field_d) {
            return;
        }
        try {
            lc.field_b = d.a((byte) 53);
            tg.a(5000L, false);
            qf.field_m = null;
            this.b(77, false);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "da.destroy()");
        }
    }

    static long a(long param0, long param1) {
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            stackIn_1_0 = param0 ^ param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var4), "da.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final synchronized void e(int param0) {
        Object var2 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Insets var3 = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0 >= 54) {
                break L1;
              } else {
                field_j = (String) null;
                break L1;
              }
            }
            L2: {
              if (null == wizardrun.field_G) {
                break L2;
              } else {
                wizardrun.field_G.removeFocusListener((java.awt.event.FocusListener) (this));
                wizardrun.field_G.getParent().setBackground(java.awt.Color.black);
                wizardrun.field_G.getParent().remove((java.awt.Component) ((Object) wizardrun.field_G));
                break L2;
              }
            }
            L3: {
              if (fl.field_H == null) {
                if (he.field_u != null) {
                  var2 = he.field_u;
                  break L3;
                } else {
                  if (null != fl.field_F) {
                    var2 = fl.field_F;
                    break L3;
                  } else {
                    var2 = ca.field_c;
                    break L3;
                  }
                }
              } else {
                var2 = fl.field_H;
                break L3;
              }
            }
            L4: {
              ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
              wizardrun.field_G = (java.awt.Canvas) ((Object) new gd((java.awt.Component) (this)));
              ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) wizardrun.field_G));
              wizardrun.field_G.setSize(rg.field_R, rg.field_P);
              wizardrun.field_G.setVisible(true);
              if (var2 == he.field_u) {
                var3 = he.field_u.getInsets();
                wizardrun.field_G.setLocation(var3.left - -ph.field_o, hb.field_n + var3.top);
                break L4;
              } else {
                wizardrun.field_G.setLocation(ph.field_o, hb.field_n);
                break L4;
              }
            }
            wizardrun.field_G.addFocusListener((java.awt.event.FocusListener) (this));
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
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (var2), "da.A(" + param0 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    abstract void a(int param0);

    abstract void f(int param0);

    final static void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if ((param1 ^ -1) >= -3) {
                  break L2;
                } else {
                  if (tc.field_j) {
                    break L2;
                  } else {
                    if (e.a(-73)) {
                      break L2;
                    } else {
                      ei.field_k = param1;
                      fa.field_a = mg.a(wg.field_b, new int[]{param1}, ic.field_a, 3, (byte) 99, me.field_f, qh.field_g + hi.field_c, 65533, 2);
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
                field_j = (String) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "da.J(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        java.awt.Insets var6 = null;
        try {
          L0: {
            L1: {
              var2_long = d.a((byte) 22);
              var4 = pc.field_k[jk.field_e];
              pc.field_k[jk.field_e] = var2_long;
              if (param0 == -107) {
                break L1;
              } else {
                da.a(-58, 96, (String) null, (java.net.URL) null, (String) null);
                break L1;
              }
            }
            L2: {
              if (0L == var4) {
                break L2;
              } else {
                if (var4 >= var2_long) {
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              jk.field_e = 1 + jk.field_e & 31;
              fieldTemp$1 = kk.field_zb;
              kk.field_zb = kk.field_zb + 1;
              if ((fieldTemp$1 ^ -1) < -51) {
                L4: {
                  pk.field_o = true;
                  kk.field_zb = kk.field_zb - 50;
                  wizardrun.field_G.setSize(rg.field_R, rg.field_P);
                  wizardrun.field_G.setVisible(true);
                  if (null == he.field_u) {
                    break L4;
                  } else {
                    if (null == fl.field_H) {
                      var6 = he.field_u.getInsets();
                      wizardrun.field_G.setLocation(ph.field_o + var6.left, hb.field_n + var6.top);
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                wizardrun.field_G.setLocation(ph.field_o, hb.field_n);
                break L3;
              } else {
                break L3;
              }
            }
            this.f(-103);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) runtimeException), "da.D(" + param0 + ')');
        }
    }

    private final void b(int param0, boolean param1) {
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
                this.a(false);
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
                    wizardrun.field_G.removeFocusListener((java.awt.event.FocusListener) (this));
                    wizardrun.field_G.getParent().remove((java.awt.Component) ((Object) wizardrun.field_G));
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
              this.d(7069);
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
          throw bd.a((Throwable) ((Object) runtimeException), "da.F(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          L0: {
            L1: {
              var2_long = d.a((byte) 69);
              var4 = ql.field_b[oj.field_c];
              ql.field_b[oj.field_c] = var2_long;
              oj.field_c = 31 & oj.field_c + 1;
              if (var4 == (long)param0) {
                break L1;
              } else {
                if ((var4 ^ -1L) > (var2_long ^ -1L)) {
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
            this.i(-103);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw bd.a((Throwable) ((Object) runtimeException), "da.H(" + param0 + ')');
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
            se.field_b = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("da.focusLost(");

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
          throw bd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 > 54) {
                break L1;
              } else {
                field_j = (String) null;
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
          throw bd.a((Throwable) ((Object) var1), "da.I(" + param0 + ')');
        }
    }

    public abstract void init();

    final static void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
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
                da.a(-116, false);
                break L3;
              }
            }
            nh.c((byte) 95);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "da.O(" + param0 + ')');
        }
    }

    public final void stop() {
        if (this != ca.field_c || mk.field_d) {
            return;
        }
        try {
            lc.field_b = 4000L + d.a((byte) 67);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "da.stop()");
        }
    }

    public final void run() {
        try {
            boolean stackIn_70_0 = false;
            int stackIn_86_0 = 0;
            int stackIn_86_1 = 0;
            int stackIn_107_0 = 0;
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
            var5 = wizardrun.field_H;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (vh.field_p != null) {
                              L6: {
                                var1 = vh.field_p.toLowerCase();
                                if (((String) (var1)).indexOf("sun") != -1) {
                                  break L6;
                                } else {
                                  if (((String) (var1)).indexOf("apple") != -1) {
                                    break L6;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L7: {
                                var2 = vh.field_b;
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
                                                            if ((var3 ^ -1) <= (var2.length() ^ -1)) {
                                                              break L9;
                                                            } else {
                                                              stackIn_70_0 = vl.a(var2.charAt(var3), -5717);

                                                              if (!stackIn_70_0) {
                                                                break L9;
                                                              } else {
                                                                var3++;
                                                                continue L8;
                                                              }
                                                            }
                                                          }
                                                          var4 = var2.substring(6, var3);
                                                          if (!af.a((CharSequence) ((Object) var4), (byte) 78)) {
                                                            break L5;
                                                          } else {
                                                            if (-11 < (ph.a(1124, (CharSequence) ((Object) var4)) ^ -1)) {
                                                              this.a("wrongjava", (byte) 126);
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
                              this.a("wrongjava", (byte) 126);
                              break L2;
                            } else {
                              break L5;
                            }
                          }
                          if (null == vh.field_b) {
                            break L3;
                          } else {
                            stackIn_70_0 = vh.field_b.startsWith("1.");
                            break L4;
                          }
                        }
                        if (stackIn_70_0) {
                          var1_int = 2;
                          var2_int = 0;
                          L10: while (true) {
                            L11: {
                              L12: {
                                if (var1_int >= vh.field_b.length()) {
                                  break L12;
                                } else {
                                  var3 = vh.field_b.charAt(var1_int);
                                  stackIn_86_0 = 48;

                                  stackIn_86_1 = var3;

                                  if (stackIn_86_0 > stackIn_86_1) {
                                    break L12;
                                  } else {
                                    if (-58 <= (var3 ^ -1)) {
                                      var2_int = -48 - -var3 + 10 * var2_int;
                                      var1_int++;
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              stackIn_86_0 = 5;
                              stackIn_86_1 = var2_int;
                              break L11;
                            }
                            if (stackIn_86_0 <= stackIn_86_1) {
                              ug.field_Q = true;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                      L13: {
                        var1 = ca.field_c;
                        if (null != fl.field_F) {
                          var1 = fl.field_F;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        var2_ref = vh.field_q;
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
                      kj.a(47);
                      this.e(81);
                      hl.field_b = bh.a((java.awt.Component) ((Object) wizardrun.field_G), (byte) 105, rg.field_R, rg.field_P);
                      this.a(6);
                      pe.field_y = wl.b(250);
                      L17: while (true) {
                        L18: {
                          L19: {
                            if ((lc.field_b ^ -1L) == -1L) {
                              break L19;
                            } else {
                              stackIn_107_0 = ((lc.field_b ^ -1L) < (d.a((byte) 76) ^ -1L) ? -1 : ((lc.field_b ^ -1L) == (d.a((byte) 76) ^ -1L) ? 0 : 1));

                              if (stackIn_107_0 >= 0) {
                                break L2;
                              } else {
                                break L19;
                              }
                            }
                          }
                          uh.field_c = pe.field_y.a(wj.field_E, 0);
                          stackIn_107_0 = 0;
                          break L18;
                        }
                        var3 = stackIn_107_0;
                        L20: while (true) {
                          if (var3 >= uh.field_c) {
                            this.a((byte) -107);
                            bi.a(ld.field_g, (byte) -88, wizardrun.field_G);
                            continue L17;
                          } else {
                            this.c(0);
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
                    rg.a((Throwable) (var1), (String) null, -562);
                    this.a("crash", (byte) 126);
                    break L21;
                  }
                }
                this.b(118, true);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw bd.a((Throwable) (var1), "da.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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

            stackIn_5_1 = new StringBuilder().append("da.windowClosing(");

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
          throw bd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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

            stackIn_5_1 = new StringBuilder().append("da.update(");

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
          throw bd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != he.field_u) {
          return null;
        } else {
          L0: {
            if (fl.field_F == null) {
              break L0;
            } else {
              if (this == fl.field_F) {
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
              if (ca.field_c != this) {
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
                            if ((le.field_b ^ -1) < (var2.width ^ -1)) {
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

            stackIn_25_1 = new StringBuilder().append("da.paint(");

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
          throw bd.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(String param0, byte param1) {
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
                if (param1 > 125) {
                  if (this.field_c) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_c = true;
                    System.out.println("error_game_" + param0);
                    try {
                      L1: {
                        cl.a(jg.f(1), -3264, "loggedout");
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
                        this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L4: {
                        var3_ref = (Exception) (Object) decompiledCaughtException;
                        break L4;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var3_ref2);

                stackIn_16_1 = new StringBuilder().append("da.Q(");

                if (param0 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L5;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L5;
                }
              }
              throw bd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              if (decompiledRegionSelector0 == 1) {
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

    abstract void i(int param0);

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    abstract void a(boolean param0);

    abstract void d(int param0);

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
            fl.field_F = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("da.provideLoaderApplet(");

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
          throw bd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void start() {
        if (ca.field_c != this || mk.field_d) {
            return;
        }
        try {
            lc.field_b = 0L;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "da.start()");
        }
    }

    final static int a(int param0, boolean param1) {
        int stackIn_2_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_40_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            if (0 != param0) {
              if (0 < param0) {
                L1: {
                  var2_int = 1;
                  if (-65536 > (param0 ^ -1)) {
                    var2_int += 16;
                    param0 = param0 >> 16;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if ((param0 ^ -1) >= -256) {
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
                  if ((param0 ^ -1) < -4) {
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
                stackIn_23_0 = var2_int;
                decompiledRegionSelector0 = 1;
                break L0;
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
                  if ((param0 ^ -1) <= 65535) {
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
                  if (15 >= (param0 ^ -1)) {
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
                  if (1 >= (param0 ^ -1)) {
                    break L11;
                  } else {
                    param0 = param0 >> 1;
                    var2_int++;
                    break L11;
                  }
                }
                stackIn_40_0 = var2_int;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "da.L(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_23_0;
          } else {
            return stackIn_40_0;
          }
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (he.field_u != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null == fl.field_F) {
                  break L1;
                } else {
                  if (fl.field_F == this) {
                    break L1;
                  } else {
                    stackIn_10_0 = fl.field_F.getAppletContext();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_12_0 = super.getAppletContext();
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "da.getAppletContext()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.applet.AppletContext) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    protected da() {
        this.field_c = false;
    }

    final void a(int param0, int param1, byte param2, String param3, int param4, int param5, int param6) {
        try {
            vh dupTemp$0 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int var8_int = 0;
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            jh var9 = null;
            int var10 = 0;
            var10 = wizardrun.field_H;
            try {
              L0: {
                try {
                  L1: {
                    if (ca.field_c != null) {
                      dg.field_e = dg.field_e + 1;
                      if (dg.field_e < 3) {
                        this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        this.a("alreadyloaded", (byte) 126);
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
                    } else {
                      rg.field_R = param5;
                      le.field_b = param5;
                      fi.field_A = param0;
                      ph.field_o = 0;
                      hb.field_n = 0;
                      var8_int = 118 / ((param2 - -8) / 54);
                      ca.field_c = (da) (this);
                      rg.field_P = param4;
                      oj.field_b = param4;
                      ej.field_a = jg.f(1);
                      dupTemp$0 = new vh(param6, param3, param1, true);
                      ld.field_g = dupTemp$0;
                      qf.field_m = dupTemp$0;
                      var9 = ld.field_g.a((byte) -88, (Runnable) (this), 1);
                      L2: while (true) {
                        if ((var9.field_a ^ -1) != -1) {
                          decompiledRegionSelector0 = 2;
                          break L1;
                        } else {
                          tg.a(10L, false);
                          continue L2;
                        }
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var8 = decompiledCaughtException;
                    rg.a(var8, (String) null, -562);
                    this.a("crash", (byte) 126);
                    decompiledRegionSelector0 = 2;
                    break L3;
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
              L4: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_20_0 = (RuntimeException) (var8_ref);

                stackIn_20_1 = new StringBuilder().append("da.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "null";
                  break L4;
                } else {
                  stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "{...}";
                  break L4;
                }
              }
              throw bd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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

    final static java.awt.Frame a(int param0, int param1, int param2, vh param3, int param4, int param5) {
        Object stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_46_0 = null;
        java.awt.Frame stackIn_48_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rb[] var6 = null;
        jh var6_ref = null;
        RuntimeException var6_ref2 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = wizardrun.field_H;
        try {
          L0: {
            if (param3.a(169978736)) {
              L1: {
                if (param2 == param4) {
                  var6 = cd.a(true, param3);
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if ((var8 ^ -1) <= (var6.length ^ -1)) {
                        if (var7_int == 0) {
                          stackIn_37_0 = null;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L1;
                        }
                      } else {
                        L3: {
                          if ((param1 ^ -1) != (var6[var8].field_g ^ -1)) {
                            break L3;
                          } else {
                            if ((var6[var8].field_h ^ -1) == (param0 ^ -1)) {
                              L4: {
                                if (param5 == 0) {
                                  break L4;
                                } else {
                                  if (var6[var8].field_f != param5) {
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
                                  if (var6[var8].field_c > param4) {
                                    break L5;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              var7_int = 1;
                              param4 = var6[var8].field_c;
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
                    stackIn_9_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              var6_ref = param3.a(param4, 114, param5, param1, param0);
              L6: while (true) {
                if (-1 != (var6_ref.field_a ^ -1)) {
                  var7 = (java.awt.Frame) (var6_ref.field_e);
                  if (null != var7) {
                    if (var6_ref.field_a != 2) {
                      stackIn_48_0 = (java.awt.Frame) (var7);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      q.a(62, var7, param3);
                      stackIn_46_0 = null;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_43_0 = null;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  tg.a(10L, false);
                  continue L6;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6_ref2 = decompiledCaughtException;
            stackIn_52_0 = (RuntimeException) (var6_ref2);

            stackIn_52_1 = new StringBuilder().append("da.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L7;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L7;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_9_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_37_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (java.awt.Frame) ((Object) stackIn_43_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (java.awt.Frame) ((Object) stackIn_46_0);
                } else {
                  return stackIn_48_0;
                }
              }
            }
          }
        }
    }

    static {
        field_g = false;
        field_j = "Reload game";
    }
}
