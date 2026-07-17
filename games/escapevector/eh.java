/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;
import java.applet.AppletContext;

public abstract class eh extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_f;
    boolean field_b;
    static String field_g;
    static boolean field_k;
    static int field_a;
    public static boolean field_h;
    public static boolean field_l;
    public static int field_e;
    public static int field_i;
    public static int field_d;
    public static boolean field_c;
    public static boolean field_j;

    final boolean a(boolean param0) {
        return true;
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, String param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            la var8_ref2 = null;
            int var9 = 0;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            var9 = EscapeVector.field_A;
            try {
              try {
                L0: {
                  if (null != he.field_r) {
                    na.field_b = na.field_b + 1;
                    if (na.field_b < 3) {
                      ((eh) this).getAppletContext().showDocument(((eh) this).getDocumentBase(), "_self");
                      return;
                    } else {
                      ((eh) this).a(-1, "alreadyloaded");
                      return;
                    }
                  } else {
                    pd.field_b = param3;
                    j.field_b = param3;
                    ad.field_d = param4;
                    qa.field_G = param4;
                    he.field_r = (eh) this;
                    s.field_D = 0;
                    pb.field_b = 0;
                    uf.field_n = param0;
                    hg.field_c = oc.d((byte) -109);
                    lk dupTemp$1 = new lk(param5, param6, param1, true);
                    g.field_r = dupTemp$1;
                    ae.field_a = dupTemp$1;
                    var8_ref2 = g.field_r.a(true, param2, (Runnable) this);
                    L1: while (true) {
                      L2: {
                        L3: {
                          if (var8_ref2.field_f != 0) {
                            break L3;
                          } else {
                            en.a((byte) 100, 10L);
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
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  var8 = decompiledCaughtException;
                  pf.a(false, (String) null, var8);
                  ((eh) this).a(-1, "crash");
                  break L4;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_18_0 = (RuntimeException) var8_ref;
                stackOut_18_1 = new StringBuilder().append("eh.M(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
                stackIn_21_0 = stackOut_18_0;
                stackIn_21_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param6 == null) {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "null";
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  break L5;
                } else {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "{...}";
                  stackIn_22_0 = stackOut_19_0;
                  stackIn_22_1 = stackOut_19_1;
                  stackIn_22_2 = stackOut_19_2;
                  break L5;
                }
              }
              throw t.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

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
            if (qj.field_i != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.net.URL) (Object) stackIn_4_0;
            } else {
              L1: {
                if (null == bb.field_P) {
                  break L1;
                } else {
                  if ((Object) (Object) bb.field_P == this) {
                    break L1;
                  } else {
                    stackOut_9_0 = bb.field_P.getDocumentBase();
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
          throw t.a((Throwable) (Object) var1, "eh.getDocumentBase()");
        }
        return stackIn_12_0;
    }

    abstract void b(boolean param0);

    abstract void a(byte param0);

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
            qd.field_l = false;
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
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public static void d(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_g = null;
              if (param0 == -111) {
                break L1;
              } else {
                field_k = false;
                break L1;
              }
            }
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "eh.Q(" + param0 + 41);
        }
    }

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
            if (null == qj.field_i) {
              L1: {
                if (null == bb.field_P) {
                  break L1;
                } else {
                  if (this != (Object) (Object) bb.field_P) {
                    stackOut_9_0 = bb.field_P.getAppletContext();
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
          throw t.a((Throwable) (Object) var1, "eh.getAppletContext()");
        }
        return stackIn_12_0;
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
            var2_long = td.b(128);
            var4 = c.field_t[r.field_z];
            c.field_t[r.field_z] = var2_long;
            r.field_z = 31 & r.field_z + 1;
            L1: {
              if (var4 == 0L) {
                break L1;
              } else {
                if (var2_long > var4) {
                  var6_int = (int)(var2_long + -var4);
                  qf.field_j = ((var6_int >> 1) + 32000) / var6_int;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var6 = this;
            synchronized (var6) {
              L2: {
                rk.field_b = qd.field_l;
                break L2;
              }
            }
            ((eh) this).c(-111);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "eh.N(" + 48 + 41);
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) he.field_r != this) {
                break L1;
              } else {
                if (!rl.field_j) {
                  me.field_p = 4000L + td.b(128);
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
          throw t.a((Throwable) (Object) runtimeException, "eh.stop()");
        }
    }

    final static boolean a(int param0, char param1) {
        RuntimeException var2 = null;
        char[] var2_array = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_11_0 = 0;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 <= 0) {
                  break L2;
                } else {
                  if (param1 < 128) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (param1 > 255) {
                    break L3;
                  } else {
                    break L1;
                  }
                }
              }
              L4: {
                L5: {
                  if (param1 != param0) {
                    var2_array = cn.field_c;
                    var3 = 0;
                    L6: while (true) {
                      if (~var2_array.length >= ~var3) {
                        break L5;
                      } else {
                        var4 = var2_array[var3];
                        stackOut_18_0 = ~param1;
                        stackIn_28_0 = stackOut_18_0;
                        stackIn_19_0 = stackOut_18_0;
                        if (var5 != 0) {
                          break L4;
                        } else {
                          if (stackIn_19_0 == ~var4) {
                            stackOut_24_0 = 1;
                            stackIn_25_0 = stackOut_24_0;
                            return stackIn_25_0 != 0;
                          } else {
                            var3++;
                            if (var5 == 0) {
                              continue L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L4;
              }
              break L0;
            }
            stackOut_11_0 = 1;
            stackIn_12_0 = stackOut_11_0;
            return stackIn_12_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "eh.K(" + param0 + 44 + param1 + 41);
        }
        return stackIn_28_0 != 0;
    }

    abstract void c(int param0);

    final void a(int param0, String param1) {
        try {
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
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
                L1: {
                  if (param0 == -1) {
                    break L1;
                  } else {
                    field_k = true;
                    break L1;
                  }
                }
                if (((eh) this).field_b) {
                  return;
                } else {
                  ((eh) this).field_b = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L2: {
                      Object discarded$1 = sd.a(oc.d((byte) -87), "loggedout", -29155);
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
                      ((eh) this).getAppletContext().showDocument(new java.net.URL(((eh) this).getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
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
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L6: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_15_0 = (RuntimeException) var3_ref2;
                stackOut_15_1 = new StringBuilder().append("eh.F(").append(param0).append(44);
                stackIn_18_0 = stackOut_15_0;
                stackIn_18_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param1 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "{...}";
                  stackIn_19_0 = stackOut_16_0;
                  stackIn_19_1 = stackOut_16_1;
                  stackIn_19_2 = stackOut_16_2;
                  break L6;
                }
              }
              throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) he.field_r) {
                break L1;
              } else {
                if (rl.field_j) {
                  break L1;
                } else {
                  me.field_p = td.b(128);
                  en.a((byte) 100, 5000L);
                  ae.field_a = null;
                  this.a((byte) 107, false);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw t.a((Throwable) (Object) runtimeException, "eh.destroy()");
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
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
        Object stackOut_3_0 = null;
        String stackOut_9_0 = null;
        String stackOut_11_0 = null;
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
            if (null != qj.field_i) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String) (Object) stackIn_4_0;
            } else {
              L1: {
                if (bb.field_P == null) {
                  break L1;
                } else {
                  if (this == (Object) (Object) bb.field_P) {
                    break L1;
                  } else {
                    stackOut_9_0 = bb.field_P.getParameter(param0);
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              }
              stackOut_11_0 = super.getParameter(param0);
              stackIn_12_0 = stackOut_11_0;
              break L0;
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
          throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_12_0;
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
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
            int stackIn_71_0 = 0;
            int stackIn_71_1 = 0;
            int stackIn_79_0 = 0;
            int stackIn_79_1 = 0;
            int stackIn_93_0 = 0;
            int stackIn_98_0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_47_0 = false;
            boolean stackOut_64_0 = false;
            int stackOut_70_0 = 0;
            int stackOut_70_1 = 0;
            int stackOut_78_0 = 0;
            int stackOut_78_1 = 0;
            int stackOut_92_0 = 0;
            int stackOut_96_0 = 0;
            var5 = EscapeVector.field_A;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (lk.field_s == null) {
                              break L5;
                            } else {
                              L6: {
                                var1 = (Object) (Object) lk.field_s.toLowerCase();
                                if (((String) var1).indexOf("sun") != -1) {
                                  break L6;
                                } else {
                                  if (-1 != ((String) var1).indexOf("apple")) {
                                    break L6;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L7: {
                                L8: {
                                  var2 = lk.field_v;
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
                                ((eh) this).a(-1, "wrongjava");
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
                                    if (~var3 <= ~var2.length()) {
                                      break L10;
                                    } else {
                                      int discarded$5 = 0;
                                      stackOut_47_0 = on.a(var2.charAt(var3));
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
                                  if (!fk.a(false, (CharSequence) (Object) var4)) {
                                    break L5;
                                  } else {
                                    if (gn.a(16777215, (CharSequence) (Object) var4) < 10) {
                                      ((eh) this).a(-1, "wrongjava");
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
                            }
                          }
                          if (null == lk.field_v) {
                            break L3;
                          } else {
                            stackOut_64_0 = lk.field_v.startsWith("1.");
                            stackIn_66_0 = stackOut_64_0;
                            break L4;
                          }
                        }
                        if (stackIn_66_0) {
                          var1_int = 2;
                          var2_int = 0;
                          L11: while (true) {
                            L12: {
                              L13: {
                                if (~lk.field_v.length() >= ~var1_int) {
                                  break L13;
                                } else {
                                  var3 = lk.field_v.charAt(var1_int);
                                  stackOut_70_0 = ~var3;
                                  stackOut_70_1 = -49;
                                  stackIn_79_0 = stackOut_70_0;
                                  stackIn_79_1 = stackOut_70_1;
                                  stackIn_71_0 = stackOut_70_0;
                                  stackIn_71_1 = stackOut_70_1;
                                  if (var5 != 0) {
                                    break L12;
                                  } else {
                                    if (stackIn_71_0 > stackIn_71_1) {
                                      break L13;
                                    } else {
                                      if (57 < var3) {
                                        break L13;
                                      } else {
                                        var1_int++;
                                        var2_int = var3 - 48 + var2_int * 10;
                                        if (var5 == 0) {
                                          continue L11;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_78_0 = -6;
                              stackOut_78_1 = ~var2_int;
                              stackIn_79_0 = stackOut_78_0;
                              stackIn_79_1 = stackOut_78_1;
                              break L12;
                            }
                            if (stackIn_79_0 < stackIn_79_1) {
                              break L3;
                            } else {
                              dh.field_c = true;
                              break L3;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                      L14: {
                        var1 = (Object) (Object) he.field_r;
                        if (bb.field_P != null) {
                          var1 = (Object) (Object) bb.field_P;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        var2_ref = lk.field_r;
                        if (var2_ref == null) {
                          break L15;
                        } else {
                          try {
                            L16: {
                              Object discarded$6 = var2_ref.invoke(var1, new Object[1]);
                              break L16;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L17: {
                              var3_ref_Throwable = decompiledCaughtException;
                              break L17;
                            }
                          }
                          break L15;
                        }
                      }
                      dm.a((byte) -61);
                      ((eh) this).d(2);
                      md.field_D = dd.a((java.awt.Component) (Object) of.field_d, ad.field_d, (byte) 125, pd.field_b);
                      ((eh) this).b((byte) -97);
                      int discarded$7 = 18863;
                      ib.field_f = pe.a();
                      L18: while (true) {
                        L19: {
                          L20: {
                            if (0L == me.field_p) {
                              break L20;
                            } else {
                              stackOut_92_0 = (me.field_p < td.b(128) ? -1 : (me.field_p == td.b(128) ? 0 : 1));
                              stackIn_98_0 = stackOut_92_0;
                              stackIn_93_0 = stackOut_92_0;
                              if (var5 != 0) {
                                break L19;
                              } else {
                                if (stackIn_93_0 <= 0) {
                                  break L2;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          s.field_z = ib.field_f.a(sn.field_d, 97);
                          stackOut_96_0 = 0;
                          stackIn_98_0 = stackOut_96_0;
                          break L19;
                        }
                        var3 = stackIn_98_0;
                        L21: while (true) {
                          L22: {
                            L23: {
                              if (~var3 <= ~s.field_z) {
                                break L23;
                              } else {
                                int discarded$8 = 48;
                                this.a();
                                var3++;
                                if (var5 != 0) {
                                  break L22;
                                } else {
                                  if (var5 == 0) {
                                    continue L21;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                            int discarded$9 = 92;
                            this.c();
                            af.a((byte) -61, g.field_r, (Object) (Object) of.field_d);
                            break L22;
                          }
                          if (var5 == 0) {
                            continue L18;
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
                  L24: {
                    var1 = (Object) (Object) decompiledCaughtException;
                    pf.a(false, (String) null, (Throwable) var1);
                    ((eh) this).a(-1, "crash");
                    break L24;
                  }
                }
                this.a((byte) 101, true);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw t.a((Throwable) var1, "eh.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void c() {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        int var6 = 0;
        java.awt.Insets var6_ref_java_awt_Insets = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = td.b(128);
              var4 = wi.field_d[rl.field_h];
              wi.field_d[rl.field_h] = var2_long;
              rl.field_h = 1 + rl.field_h & 31;
              if (var4 == 0L) {
                break L1;
              } else {
                if (~var4 > ~var2_long) {
                  var6 = (int)(-var4 + var2_long);
                  th.field_p = ((var6 >> 1) + 32000) / var6;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              int fieldTemp$1 = si.field_r;
              si.field_r = si.field_r + 1;
              if (fieldTemp$1 <= 50) {
                break L2;
              } else {
                L3: {
                  si.field_r = si.field_r - 50;
                  rh.field_H = true;
                  of.field_d.setSize(pd.field_b, ad.field_d);
                  of.field_d.setVisible(true);
                  if (null == qj.field_i) {
                    break L3;
                  } else {
                    if (null != qj.field_f) {
                      break L3;
                    } else {
                      var6_ref_java_awt_Insets = qj.field_i.getInsets();
                      of.field_d.setLocation(var6_ref_java_awt_Insets.left + pb.field_b, s.field_D + var6_ref_java_awt_Insets.top);
                      if (EscapeVector.field_A == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                of.field_d.setLocation(pb.field_b, s.field_D);
                break L2;
              }
            }
            ((eh) this).e((byte) 26);
            var6 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "eh.J(" + 92 + 41);
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
            qd.field_l = true;
            rh.field_H = true;
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
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    abstract void e(byte param0);

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (qj.field_i != null) {
          return null;
        } else {
          L0: {
            if (null == bb.field_P) {
              break L0;
            } else {
              if ((Object) (Object) bb.field_P != this) {
                return bb.field_P.getCodeBase();
              } else {
                break L0;
              }
            }
          }
          return super.getCodeBase();
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void b(byte param0);

    final static void b(int param0) {
        try {
            int discarded$4 = 63;
            de.a("", (String) null);
            if (param0 >= -12) {
                eh.d((byte) 116);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "eh.A(" + param0 + 41);
        }
    }

    protected eh() {
        ((eh) this).field_b = false;
    }

    public abstract void init();

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        RuntimeException var11 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              em.a(param1 + 1, param2 + 1, -2 + -param1 + param7, -2 + -param2 + param5, 0, param0);
              qi.a(param3, param7, param8, param4, param2, -28, param1, param5, param10);
              if (param6 == -3) {
                break L1;
              } else {
                eh.d((byte) 59);
                break L1;
              }
            }
            L2: {
              if (0 <= param9) {
                qi.a(param9, param7 - 3, param3, -1, param2 + 3, 110, 3 + param1, -3 + param5, param10);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var11, "eh.G(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 41);
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) he.field_r != this) {
                break L1;
              } else {
                if (rl.field_j) {
                  break L1;
                } else {
                  me.field_p = 0L;
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw t.a((Throwable) (Object) runtimeException, "eh.start()");
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
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
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
              if ((Object) (Object) he.field_r != this) {
                break L1;
              } else {
                if (!rl.field_j) {
                  L2: {
                    rh.field_H = true;
                    if (!dh.field_c) {
                      break L2;
                    } else {
                      if (-bn.field_c + td.b(128) > 1000L) {
                        L3: {
                          var2_ref = param0.getClipBounds();
                          if (null == var2_ref) {
                            break L3;
                          } else {
                            if (var2_ref.width < j.field_b) {
                              break L2;
                            } else {
                              if (var2_ref.height >= qa.field_G) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        n.field_i = true;
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
            stackOut_20_1 = new StringBuilder().append("eh.paint(");
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
          throw t.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
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
            bb.field_P = param0;
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
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final synchronized void d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Object var3 = null;
        java.awt.Insets var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (of.field_d == null) {
                break L1;
              } else {
                of.field_d.removeFocusListener((java.awt.event.FocusListener) this);
                of.field_d.getParent().setBackground(java.awt.Color.black);
                of.field_d.getParent().remove((java.awt.Component) (Object) of.field_d);
                break L1;
              }
            }
            L2: {
              L3: {
                var2_int = -119 % ((76 - param0) / 49);
                if (qj.field_f != null) {
                  break L3;
                } else {
                  L4: {
                    if (qj.field_i == null) {
                      break L4;
                    } else {
                      var3 = (Object) (Object) qj.field_i;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (bb.field_P == null) {
                      break L5;
                    } else {
                      var3 = (Object) (Object) bb.field_P;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var3 = (Object) (Object) he.field_r;
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var3 = (Object) (Object) qj.field_f;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) var3).setLayout((java.awt.LayoutManager) null);
                of.field_d = (java.awt.Canvas) (Object) new hd((java.awt.Component) this);
                java.awt.Component discarded$6 = ((java.awt.Container) var3).add((java.awt.Component) (Object) of.field_d);
                of.field_d.setSize(pd.field_b, ad.field_d);
                of.field_d.setVisible(true);
                if (var3 != (Object) (Object) qj.field_i) {
                  break L7;
                } else {
                  var4 = qj.field_i.getInsets();
                  of.field_d.setLocation(var4.left + pb.field_b, var4.top + s.field_D);
                  if (var5 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              of.field_d.setLocation(pb.field_b, s.field_D);
              break L6;
            }
            of.field_d.addFocusListener((java.awt.event.FocusListener) this);
            of.field_d.requestFocus();
            rk.field_b = true;
            qd.field_l = true;
            rh.field_H = true;
            n.field_i = false;
            bn.field_c = td.b(128);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "eh.L(" + param0 + 41);
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final static int a(int param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 27672) {
                break L1;
              } else {
                eh.a(31, -73, -54, 36, 120, -37, -8, -46, 86, 6, -127);
                break L1;
              }
            }
            int discarded$2 = 97;
            stackOut_3_0 = wk.a(true, param0, param2);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("eh.C(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_4_0;
    }

    private final void a(byte param0, boolean param1) {
        RuntimeException runtimeException = null;
        Object var3 = null;
        Object var3_ref = null;
        Exception var3_ref2 = null;
        Throwable var3_ref3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3_ref = this;
            synchronized (var3_ref) {
              L1: {
                if (!rl.field_j) {
                  rl.field_j = true;
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (null == bb.field_P) {
                break L2;
              } else {
                bb.field_P.destroy();
                break L2;
              }
            }
            try {
              L3: {
                L4: {
                  if (param0 >= 100) {
                    break L4;
                  } else {
                    ((eh) this).run();
                    break L4;
                  }
                }
                ((eh) this).b(true);
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L5: {
                var3_ref2 = (Exception) (Object) decompiledCaughtException;
                break L5;
              }
            }
            L6: {
              if (of.field_d != null) {
                try {
                  L7: {
                    of.field_d.removeFocusListener((java.awt.event.FocusListener) this);
                    of.field_d.getParent().remove((java.awt.Component) (Object) of.field_d);
                    break L7;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L8: {
                    var3_ref2 = (Exception) (Object) decompiledCaughtException;
                    break L8;
                  }
                }
                break L6;
              } else {
                break L6;
              }
            }
            L9: {
              if (g.field_r != null) {
                try {
                  L10: {
                    g.field_r.b(0);
                    break L10;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L11: {
                    var3_ref2 = (Exception) (Object) decompiledCaughtException;
                    break L11;
                  }
                }
                break L9;
              } else {
                break L9;
              }
            }
            L12: {
              ((eh) this).a((byte) -105);
              if (qj.field_i != null) {
                try {
                  L13: {
                    System.exit(0);
                    break L13;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L14: {
                    var3_ref3 = decompiledCaughtException;
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
          throw t.a((Throwable) (Object) runtimeException, "eh.I(" + param0 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "You are unable to access this level yet.";
        field_a = -1;
    }
}
