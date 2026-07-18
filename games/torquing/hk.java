/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.applet.AppletContext;

public abstract class hk extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_e;
    public static boolean field_a;
    public static int field_b;
    public static int field_g;
    public static boolean field_f;
    public static boolean field_c;
    public static boolean field_h;
    public static int field_d;

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_7_0 = null;
        java.net.URL stackOut_9_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (null == un.field_b) {
              L1: {
                if (wj.field_g == null) {
                  break L1;
                } else {
                  if ((Object) (Object) wj.field_g == this) {
                    break L1;
                  } else {
                    stackOut_7_0 = wj.field_g.getDocumentBase();
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
              stackOut_9_0 = super.getDocumentBase();
              stackIn_10_0 = stackOut_9_0;
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
          throw rb.a((Throwable) (Object) var1, "hk.getDocumentBase()");
        }
        return stackIn_10_0;
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final static void a(df param0, int param1) {
        try {
            RuntimeException var2 = null;
            pm var2_ref = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            InvalidClassException var6_ref = null;
            StreamCorruptedException var6_ref2 = null;
            OptionalDataException var6_ref3 = null;
            IllegalAccessException var6_ref4 = null;
            IllegalArgumentException var6_ref5 = null;
            java.lang.reflect.InvocationTargetException var6_ref6 = null;
            SecurityException var6_ref7 = null;
            IOException var6_ref8 = null;
            NullPointerException var6_ref9 = null;
            Exception var6_ref10 = null;
            Throwable var6_ref11 = null;
            int var6_int = 0;
            java.lang.reflect.Field var7 = null;
            java.lang.reflect.Method var7_ref = null;
            int var8 = 0;
            byte[][] var8_ref_byte____ = null;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            int stackIn_34_0 = 0;
            int stackIn_95_0 = 0;
            RuntimeException stackIn_98_0 = null;
            StringBuilder stackIn_98_1 = null;
            RuntimeException stackIn_100_0 = null;
            StringBuilder stackIn_100_1 = null;
            RuntimeException stackIn_101_0 = null;
            StringBuilder stackIn_101_1 = null;
            String stackIn_101_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_33_0 = 0;
            int stackOut_94_0 = 0;
            RuntimeException stackOut_97_0 = null;
            StringBuilder stackOut_97_1 = null;
            RuntimeException stackOut_100_0 = null;
            StringBuilder stackOut_100_1 = null;
            String stackOut_100_2 = null;
            RuntimeException stackOut_98_0 = null;
            StringBuilder stackOut_98_1 = null;
            String stackOut_98_2 = null;
            var12 = Torquing.field_u;
            try {
              L0: {
                var2_ref = (pm) (Object) ul.field_e.b(param1 ^ -2933);
                if (var2_ref != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (~var4 <= ~var2_ref.field_l) {
                          break L3;
                        } else {
                          if (var12 != 0) {
                            break L2;
                          } else {
                            L4: {
                              if (null != var2_ref.field_u[var4]) {
                                L5: {
                                  if (var2_ref.field_u[var4].field_a == 2) {
                                    var2_ref.field_t[var4] = -5;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                if (0 == var2_ref.field_u[var4].field_a) {
                                  var3 = 1;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L4;
                              }
                            }
                            L6: {
                              if (null == var2_ref.field_n[var4]) {
                                break L6;
                              } else {
                                L7: {
                                  if (var2_ref.field_n[var4].field_a != 2) {
                                    break L7;
                                  } else {
                                    var2_ref.field_t[var4] = -6;
                                    break L7;
                                  }
                                }
                                if (var2_ref.field_n[var4].field_a != 0) {
                                  break L6;
                                } else {
                                  var3 = 1;
                                  break L6;
                                }
                              }
                            }
                            var4++;
                            if (var12 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      if (var3 == 0) {
                        var4 = param0.field_n;
                        param0.b((byte) 60, var2_ref.field_j);
                        break L2;
                      } else {
                        return;
                      }
                    }
                    var5 = 0;
                    L8: while (true) {
                      L9: {
                        L10: {
                          if (var5 >= var2_ref.field_l) {
                            break L10;
                          } else {
                            stackOut_33_0 = -1;
                            stackIn_95_0 = stackOut_33_0;
                            stackIn_34_0 = stackOut_33_0;
                            if (var12 != 0) {
                              break L9;
                            } else {
                              L11: {
                                L12: {
                                  if (stackIn_34_0 == ~var2_ref.field_t[var5]) {
                                    break L12;
                                  } else {
                                    param0.b(90, var2_ref.field_t[var5]);
                                    if (var12 == 0) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                try {
                                  L13: {
                                    L14: {
                                      L15: {
                                        var6_int = var2_ref.field_q[var5];
                                        if (var6_int != 0) {
                                          break L15;
                                        } else {
                                          var7 = (java.lang.reflect.Field) var2_ref.field_u[var5].field_d;
                                          var8 = var7.getInt((Object) null);
                                          param0.b(90, 0);
                                          param0.b((byte) 60, var8);
                                          if (var12 == 0) {
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      L16: {
                                        if (1 != var6_int) {
                                          break L16;
                                        } else {
                                          var7 = (java.lang.reflect.Field) var2_ref.field_u[var5].field_d;
                                          var7.setInt((Object) null, var2_ref.field_k[var5]);
                                          param0.b(90, 0);
                                          if (var12 == 0) {
                                            break L14;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      if (var6_int != 2) {
                                        break L14;
                                      } else {
                                        var7 = (java.lang.reflect.Field) var2_ref.field_u[var5].field_d;
                                        var8 = var7.getModifiers();
                                        param0.b(90, 0);
                                        param0.b((byte) 60, var8);
                                        break L14;
                                      }
                                    }
                                    L17: {
                                      L18: {
                                        if (var6_int != 3) {
                                          break L18;
                                        } else {
                                          var7_ref = (java.lang.reflect.Method) var2_ref.field_n[var5].field_d;
                                          var8_ref_byte____ = var2_ref.field_o[var5];
                                          var9 = new Object[var8_ref_byte____.length];
                                          var10_int = 0;
                                          L19: while (true) {
                                            L20: {
                                              if (~var8_ref_byte____.length >= ~var10_int) {
                                                break L20;
                                              } else {
                                                var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var8_ref_byte____[var10_int]));
                                                var9[var10_int] = var11.readObject();
                                                var10_int++;
                                                if (var12 != 0) {
                                                  break L17;
                                                } else {
                                                  if (var12 == 0) {
                                                    continue L19;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                            }
                                            L21: {
                                              L22: {
                                                var10 = var7_ref.invoke((Object) null, var9);
                                                if (null == var10) {
                                                  break L22;
                                                } else {
                                                  L23: {
                                                    if (var10 instanceof Number) {
                                                      break L23;
                                                    } else {
                                                      L24: {
                                                        if (!(var10 instanceof String)) {
                                                          break L24;
                                                        } else {
                                                          param0.b(90, 2);
                                                          param0.b((byte) 4, (String) var10);
                                                          if (var12 == 0) {
                                                            break L21;
                                                          } else {
                                                            break L24;
                                                          }
                                                        }
                                                      }
                                                      param0.b(90, 4);
                                                      if (var12 == 0) {
                                                        break L21;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                  param0.b(90, 1);
                                                  param0.a(102, ((Number) var10).longValue());
                                                  if (var12 == 0) {
                                                    break L21;
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                              }
                                              param0.b(90, 0);
                                              break L21;
                                            }
                                            if (var12 == 0) {
                                              break L17;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                      }
                                      if (var6_int != 4) {
                                        break L17;
                                      } else {
                                        var7_ref = (java.lang.reflect.Method) var2_ref.field_n[var5].field_d;
                                        var8 = var7_ref.getModifiers();
                                        param0.b(90, 0);
                                        param0.b((byte) 60, var8);
                                        break L17;
                                      }
                                    }
                                    break L13;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L29: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param0.b(90, -14);
                                    break L29;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L30: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.b(90, -15);
                                    break L30;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L31: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.b(90, -16);
                                    break L31;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L33: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.b(90, -18);
                                    break L33;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L34: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.b(90, -19);
                                    break L34;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L35: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.b(90, -20);
                                    break L35;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L36: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.b(90, -21);
                                    break L36;
                                  }
                                }
                                break L11;
                              }
                              var5++;
                              if (var12 == 0) {
                                continue L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        stackOut_94_0 = param0.a(var4, true);
                        stackIn_95_0 = stackOut_94_0;
                        break L9;
                      }
                      var2_ref.f(param1 ^ param1);
                      break L0;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L37: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_97_0 = (RuntimeException) var2;
                stackOut_97_1 = new StringBuilder().append("hk.BA(");
                stackIn_100_0 = stackOut_97_0;
                stackIn_100_1 = stackOut_97_1;
                stackIn_98_0 = stackOut_97_0;
                stackIn_98_1 = stackOut_97_1;
                if (param0 == null) {
                  stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
                  stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
                  stackOut_100_2 = "null";
                  stackIn_101_0 = stackOut_100_0;
                  stackIn_101_1 = stackOut_100_1;
                  stackIn_101_2 = stackOut_100_2;
                  break L37;
                } else {
                  stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
                  stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
                  stackOut_98_2 = "{...}";
                  stackIn_101_0 = stackOut_98_0;
                  stackIn_101_1 = stackOut_98_1;
                  stackIn_101_2 = stackOut_98_2;
                  break L37;
                }
              }
              throw rb.a((Throwable) (Object) stackIn_101_0, stackIn_101_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
            ((hk) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("hk.update(");
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
          throw rb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    abstract void b(byte param0);

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) vk.field_B != this) {
                break L1;
              } else {
                if (!fq.field_E) {
                  eq.field_d = km.b(-1) - -4000L;
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
          throw rb.a((Throwable) (Object) runtimeException, "hk.stop()");
        }
    }

    public abstract void init();

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
            if (un.field_b == null) {
              L1: {
                if (null == wj.field_g) {
                  break L1;
                } else {
                  if (this == (Object) (Object) wj.field_g) {
                    break L1;
                  } else {
                    stackOut_7_0 = wj.field_g.getAppletContext();
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
          throw rb.a((Throwable) (Object) var1, "hk.getAppletContext()");
        }
        return stackIn_10_0;
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
              var2_long = km.b(-1);
              var4 = jl.field_V[bo.field_k];
              jl.field_V[bo.field_k] = var2_long;
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
            bo.field_k = 31 & bo.field_k - param0;
            var6 = this;
            synchronized (var6) {
              L2: {
                ae.field_ib = bn.field_b;
                break L2;
              }
            }
            ((hk) this).a((byte) -30);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw rb.a((Throwable) (Object) runtimeException, "hk.LA(" + param0 + ')');
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
            bn.field_b = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("hk.focusLost(");
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
          throw rb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final synchronized void a(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (k.field_d != null) {
                k.field_d.removeFocusListener((java.awt.event.FocusListener) this);
                k.field_d.getParent().setBackground(java.awt.Color.black);
                k.field_d.getParent().remove((java.awt.Component) (Object) k.field_d);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (null != il.field_q) {
                  break L3;
                } else {
                  L4: {
                    if (null == un.field_b) {
                      break L4;
                    } else {
                      var2 = (Object) (Object) un.field_b;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (wj.field_g == null) {
                      break L5;
                    } else {
                      var2 = (Object) (Object) wj.field_g;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = (Object) (Object) vk.field_B;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = (Object) (Object) il.field_q;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
                k.field_d = (java.awt.Canvas) (Object) new md((java.awt.Component) this);
                java.awt.Component discarded$2 = ((java.awt.Container) var2).add((java.awt.Component) (Object) k.field_d);
                k.field_d.setSize(wk.field_d, ul.field_a);
                k.field_d.setVisible(true);
                if (var2 == (Object) (Object) un.field_b) {
                  break L7;
                } else {
                  k.field_d.setLocation(aq.field_d, hg.field_a);
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              var3 = un.field_b.getInsets();
              k.field_d.setLocation(aq.field_d + var3.left, hg.field_a + var3.top);
              break L6;
            }
            k.field_d.addFocusListener((java.awt.event.FocusListener) this);
            k.field_d.requestFocus();
            bn.field_b = true;
            ae.field_ib = true;
            cf.field_c = true;
            b.field_v = param0;
            aa.field_Q = km.b(-1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw rb.a((Throwable) var2, "hk.KA(" + param0 + ')');
        }
    }

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
                if (!((hk) this).field_e) {
                  ((hk) this).field_e = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L1: {
                      L2: {
                        Object discarded$1 = hp.a(ip.a(9), (byte) -85, "loggedout");
                        if (param0 == 10) {
                          break L2;
                        } else {
                          ((hk) this).stop();
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
                      ((hk) this).getAppletContext().showDocument(new java.net.URL(((hk) this).getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
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
                stackOut_11_1 = new StringBuilder().append("hk.FA(").append(param0).append(',');
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
              throw rb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
            boolean stackIn_52_0 = false;
            boolean stackIn_70_0 = false;
            int stackIn_75_0 = 0;
            int stackIn_75_1 = 0;
            int stackIn_86_0 = 0;
            int stackIn_86_1 = 0;
            int stackIn_98_0 = 0;
            int stackIn_103_0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_51_0 = false;
            boolean stackOut_68_0 = false;
            int stackOut_74_0 = 0;
            int stackOut_74_1 = 0;
            int stackOut_85_0 = 0;
            int stackOut_85_1 = 0;
            int stackOut_97_0 = 0;
            int stackOut_101_0 = 0;
            var5 = Torquing.field_u;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (null != vh.field_u) {
                              L6: {
                                var1 = (Object) (Object) vh.field_u.toLowerCase();
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
                                  var2 = vh.field_v;
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
                                                      if (var2.equals((Object) (Object) "1.6.0")) {
                                                        break L8;
                                                      } else {
                                                        break L7;
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
                                ((hk) this).a(10, "wrongjava");
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
                                      stackOut_51_0 = ui.a(-110, var2.charAt(var3));
                                      stackIn_70_0 = stackOut_51_0;
                                      stackIn_52_0 = stackOut_51_0;
                                      if (var5 != 0) {
                                        break L4;
                                      } else {
                                        if (!stackIn_52_0) {
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
                                  if (!ip.a((byte) -104, (CharSequence) (Object) var4)) {
                                    break L5;
                                  } else {
                                    if (kc.a((byte) -85, (CharSequence) (Object) var4) < 10) {
                                      ((hk) this).a(10, "wrongjava");
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
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                          if (vh.field_v == null) {
                            break L3;
                          } else {
                            stackOut_68_0 = vh.field_v.startsWith("1.");
                            stackIn_70_0 = stackOut_68_0;
                            break L4;
                          }
                        }
                        if (stackIn_70_0) {
                          var1_int = 2;
                          var2_int = 0;
                          L11: while (true) {
                            L12: {
                              L13: {
                                if (~vh.field_v.length() >= ~var1_int) {
                                  break L13;
                                } else {
                                  var3 = vh.field_v.charAt(var1_int);
                                  stackOut_74_0 = -49;
                                  stackOut_74_1 = ~var3;
                                  stackIn_86_0 = stackOut_74_0;
                                  stackIn_86_1 = stackOut_74_1;
                                  stackIn_75_0 = stackOut_74_0;
                                  stackIn_75_1 = stackOut_74_1;
                                  if (var5 != 0) {
                                    break L12;
                                  } else {
                                    if (stackIn_75_0 < stackIn_75_1) {
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
                                      var2_int = -48 + (var3 + 10 * var2_int);
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
                              stackOut_85_0 = var2_int;
                              stackOut_85_1 = 5;
                              stackIn_86_0 = stackOut_85_0;
                              stackIn_86_1 = stackOut_85_1;
                              break L12;
                            }
                            if (stackIn_86_0 < stackIn_86_1) {
                              break L3;
                            } else {
                              fn.field_b = true;
                              break L3;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                      L15: {
                        var1 = (Object) (Object) vk.field_B;
                        if (wj.field_g == null) {
                          break L15;
                        } else {
                          var1 = (Object) (Object) wj.field_g;
                          break L15;
                        }
                      }
                      L16: {
                        var2_ref = vh.field_j;
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
                      rd.b(36);
                      ((hk) this).a(false);
                      mk.field_b = fd.a(0, ul.field_a, wk.field_d, (java.awt.Component) (Object) k.field_d);
                      ((hk) this).c(-593);
                      df.field_q = lh.a(-24858);
                      L19: while (true) {
                        L20: {
                          L21: {
                            if (eq.field_d == 0L) {
                              break L21;
                            } else {
                              stackOut_97_0 = (eq.field_d < km.b(-1) ? -1 : (eq.field_d == km.b(-1) ? 0 : 1));
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
                          oi.field_b = df.field_q.a((byte) -117, eg.field_u);
                          stackOut_101_0 = 0;
                          stackIn_103_0 = stackOut_101_0;
                          break L20;
                        }
                        var3 = stackIn_103_0;
                        L22: while (true) {
                          L23: {
                            L24: {
                              if (~oi.field_b >= ~var3) {
                                break L24;
                              } else {
                                this.e(-1);
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
                            this.d(-18222);
                            oe.a(nk.field_u, 0, (Object) (Object) k.field_d);
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
                    nn.a((String) null, (Throwable) var1, -9958);
                    ((hk) this).a(10, "crash");
                    break L25;
                  }
                }
                this.a(true, -11);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw rb.a((Throwable) var1, "hk.run()");
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
              if (this != (Object) (Object) vk.field_B) {
                break L1;
              } else {
                if (fq.field_E) {
                  break L1;
                } else {
                  eq.field_d = km.b(-1);
                  ub.a(1976, 5000L);
                  pp.field_f = null;
                  this.a(false, -11);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rb.a((Throwable) (Object) runtimeException, "hk.destroy()");
        }
    }

    private final void d(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = km.b(param0 ^ 18221);
              var4 = ui.field_l[ub.field_C];
              ui.field_l[ub.field_C] = var2_long;
              ub.field_C = 1 + ub.field_C & 31;
              if (var4 == 0L) {
                break L1;
              } else {
                if (var4 < var2_long) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              int fieldTemp$2 = jk.field_a;
              jk.field_a = jk.field_a + 1;
              if (fieldTemp$2 <= 50) {
                break L2;
              } else {
                L3: {
                  L4: {
                    cf.field_c = true;
                    jk.field_a = jk.field_a - 50;
                    k.field_d.setSize(wk.field_d, ul.field_a);
                    k.field_d.setVisible(true);
                    if (un.field_b == null) {
                      break L4;
                    } else {
                      if (null == il.field_q) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  k.field_d.setLocation(aq.field_d, hg.field_a);
                  if (Torquing.field_u == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                var6 = un.field_b.getInsets();
                k.field_d.setLocation(aq.field_d + var6.left, hg.field_a + var6.top);
                break L2;
              }
            }
            L5: {
              ((hk) this).b((byte) 73);
              if (param0 == -18222) {
                break L5;
              } else {
                ((hk) this).a(68, (String) null);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rb.a((Throwable) (Object) runtimeException, "hk.CA(" + param0 + ')');
        }
    }

    final static boolean a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_13_0 = 0;
        boolean stackIn_16_0 = false;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_12_0 = 0;
        boolean stackOut_15_0 = false;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= param1.length()) {
                    break L3;
                  } else {
                    var3 = param1.charAt(var2_int);
                    stackOut_3_0 = ra.a((char) var3, (byte) -55);
                    stackIn_16_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0) {
                          break L4;
                        } else {
                          if (!ui.a(-59, (char) var3)) {
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0 != 0;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var2_int++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_15_0 = param0;
                stackIn_16_0 = stackOut_15_0;
                break L2;
              }
              L5: {
                if (stackIn_16_0) {
                  break L5;
                } else {
                  boolean discarded$2 = hk.a(true, (String) null);
                  break L5;
                }
              }
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("hk.IA(").append(param0).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
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
          throw rb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) vk.field_B) {
                break L1;
              } else {
                if (fq.field_E) {
                  break L1;
                } else {
                  eq.field_d = 0L;
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rb.a((Throwable) (Object) runtimeException, "hk.start()");
        }
    }

    abstract void b(int param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
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
            wj.field_g = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("hk.provideLoaderApplet(");
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
          throw rb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
            if (null != un.field_b) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String) (Object) stackIn_4_0;
            } else {
              L1: {
                if (wj.field_g == null) {
                  break L1;
                } else {
                  if ((Object) (Object) wj.field_g == this) {
                    break L1;
                  } else {
                    stackOut_9_0 = wj.field_g.getParameter(param0);
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
            stackOut_13_1 = new StringBuilder().append("hk.getParameter(");
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
          throw rb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_12_0;
    }

    abstract void c(int param0);

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException var2 = null;
        java.awt.Rectangle var2_ref = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) vk.field_B != this) {
                break L1;
              } else {
                if (!fq.field_E) {
                  L2: {
                    cf.field_c = true;
                    if (!fn.field_b) {
                      break L2;
                    } else {
                      if (km.b(-1) - aa.field_Q > 1000L) {
                        L3: {
                          var2_ref = param0.getClipBounds();
                          if (var2_ref == null) {
                            break L3;
                          } else {
                            if (th.field_G > var2_ref.width) {
                              break L2;
                            } else {
                              if (mi.field_s > var2_ref.height) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        b.field_v = true;
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
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("hk.paint(");
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (un.field_b == null) {
          L0: {
            if (wj.field_g == null) {
              break L0;
            } else {
              if ((Object) (Object) wj.field_g == this) {
                break L0;
              } else {
                return wj.field_g.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        } else {
          return null;
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
            bn.field_b = true;
            cf.field_c = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("hk.focusGained(");
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
          throw rb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void a(int param0, int param1, String param2, int param3, int param4, int param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            int var8_int = 0;
            rc var9 = null;
            int var10 = 0;
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
            var10 = Torquing.field_u;
            try {
              try {
                L0: {
                  if (vk.field_B != null) {
                    cf.field_g = cf.field_g + 1;
                    if (cf.field_g < 3) {
                      ((hk) this).getAppletContext().showDocument(((hk) this).getDocumentBase(), "_self");
                      return;
                    } else {
                      ((hk) this).a(10, "alreadyloaded");
                      return;
                    }
                  } else {
                    wk.field_d = param4;
                    th.field_G = param4;
                    vk.field_B = (hk) this;
                    dq.field_m = param0;
                    hg.field_a = 0;
                    ul.field_a = param3;
                    mi.field_s = param3;
                    aq.field_d = 0;
                    lg.field_B = ip.a(9);
                    vh dupTemp$1 = new vh(param5, param2, param6, true);
                    nk.field_u = dupTemp$1;
                    pp.field_f = dupTemp$1;
                    var8_int = 117 % ((param1 - 76) / 34);
                    var9 = nk.field_u.a((byte) -91, 1, (Runnable) this);
                    L1: while (true) {
                      L2: {
                        L3: {
                          if (var9.field_a != 0) {
                            break L3;
                          } else {
                            ub.a(1976, 10L);
                            if (var10 != 0) {
                              break L2;
                            } else {
                              if (var10 == 0) {
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
                  nn.a((String) null, var8, -9958);
                  ((hk) this).a(10, "crash");
                  break L4;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_18_0 = (RuntimeException) var8_ref;
                stackOut_18_1 = new StringBuilder().append("hk.V(").append(param0).append(',').append(param1).append(',');
                stackIn_21_0 = stackOut_18_0;
                stackIn_21_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param2 == null) {
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
              throw rb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    private final void a(boolean param0, int param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -11) {
                break L1;
              } else {
                ((hk) this).a(94);
                break L1;
              }
            }
            var3 = this;
            synchronized (var3) {
              L2: {
                if (!fq.field_E) {
                  fq.field_E = true;
                  break L2;
                } else {
                  return;
                }
              }
            }
            L3: {
              if (wj.field_g == null) {
                break L3;
              } else {
                wj.field_g.destroy();
                break L3;
              }
            }
            try {
              L4: {
                ((hk) this).b(6);
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L5: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L5;
              }
            }
            L6: {
              if (null != k.field_d) {
                try {
                  L7: {
                    k.field_d.removeFocusListener((java.awt.event.FocusListener) this);
                    k.field_d.getParent().remove((java.awt.Component) (Object) k.field_d);
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
              } else {
                break L6;
              }
            }
            L9: {
              if (nk.field_u == null) {
                break L9;
              } else {
                try {
                  L10: {
                    nk.field_u.b(6);
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
              ((hk) this).a(param1 + 15);
              if (un.field_b == null) {
                break L12;
              } else {
                try {
                  L13: {
                    System.exit(0);
                    break L13;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L14: {
                    throwable = decompiledCaughtException;
                    break L14;
                  }
                }
                break L12;
              }
            }
            System.out.println("Shutdown complete - clean:" + param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw rb.a((Throwable) (Object) runtimeException, "hk.W(" + param0 + ',' + param1 + ')');
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
            ((hk) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("hk.windowClosing(");
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
          throw rb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    protected hk() {
        ((hk) this).field_e = false;
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void a(byte param0);

    final boolean b(boolean param0) {
        return true;
    }

    abstract void a(int param0);

    final static String a(int param0, boolean param1, int param2, byte[] param3) {
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_21_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var9 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var4 = new char[param0];
              if (param1) {
                break L1;
              } else {
                hk.a((df) null, -7);
                break L1;
              }
            }
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              L3: {
                if (~param0 >= ~var6) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var7 = param3[var6 + param2] & 255;
                      if (var7 != 0) {
                        break L5;
                      } else {
                        if (var9 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var7 < 128) {
                        break L6;
                      } else {
                        if (var7 >= 160) {
                          break L6;
                        } else {
                          L7: {
                            var8 = ef.field_c[-128 + var7];
                            if (0 != var8) {
                              break L7;
                            } else {
                              var8 = 63;
                              break L7;
                            }
                          }
                          var7 = var8;
                          break L6;
                        }
                      }
                    }
                    int incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = (char)var7;
                    break L4;
                  }
                  var6++;
                  if (var9 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_21_0 = new String(var4, 0, var5);
              stackIn_22_0 = stackOut_21_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4_ref = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4_ref;
            stackOut_23_1 = new StringBuilder().append("hk.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L8;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
        return stackIn_22_0;
    }

    static {
    }
}
