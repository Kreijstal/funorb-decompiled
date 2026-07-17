/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;
import java.applet.AppletContext;

public abstract class ke extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_j;
    static al field_c;
    static int field_b;
    static int field_h;
    public static int field_f;
    public static boolean field_g;
    public static int field_a;
    public static int field_e;
    public static int field_k;
    public static int field_d;
    public static int field_i;

    abstract void e(byte param0);

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (sj.field_a == null) {
          L0: {
            if (null == bh.field_i) {
              break L0;
            } else {
              if (this != (Object) (Object) bh.field_i) {
                return bh.field_i.getCodeBase();
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
            ((ke) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ke.update(");
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
          throw sh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final synchronized void a(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (cj.field_d != null) {
                cj.field_d.removeFocusListener((java.awt.event.FocusListener) this);
                cj.field_d.getParent().setBackground(java.awt.Color.black);
                cj.field_d.getParent().remove((java.awt.Component) (Object) cj.field_d);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == n.field_p) {
                  break L3;
                } else {
                  var2 = (Object) (Object) n.field_p;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null == sj.field_a) {
                  break L4;
                } else {
                  var2 = (Object) (Object) sj.field_a;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (null == bh.field_i) {
                  break L5;
                } else {
                  var2 = (Object) (Object) bh.field_i;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              var2 = (Object) (Object) nh.field_J;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
                cj.field_d = (java.awt.Canvas) (Object) new rm((java.awt.Component) this);
                java.awt.Component discarded$2 = ((java.awt.Container) var2).add((java.awt.Component) (Object) cj.field_d);
                cj.field_d.setSize(te.field_eb, kj.field_c);
                cj.field_d.setVisible(true);
                if (var2 == (Object) (Object) sj.field_a) {
                  break L7;
                } else {
                  cj.field_d.setLocation(rg.field_I, vb.field_I);
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              var3 = sj.field_a.getInsets();
              cj.field_d.setLocation(var3.left + rg.field_I, vb.field_I + var3.top);
              break L6;
            }
            cj.field_d.addFocusListener((java.awt.event.FocusListener) this);
            cj.field_d.requestFocus();
            mp.field_c = param0;
            lc.field_d = true;
            nd.field_b = true;
            rl.field_f = false;
            qj.field_g = pd.a(-22826);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw sh.a((Throwable) var2, "ke.FB(" + param0 + 41);
        }
    }

    abstract void c(byte param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    abstract void b(byte param0);

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
            ((ke) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ke.windowClosing(");
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
          throw sh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public static void b(int param0) {
        try {
            field_c = null;
            int var1_int = 19 / ((param0 - -39) / 54);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "ke.GB(" + param0 + 41);
        }
    }

    final static void a(int param0, int param1, vn[] param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param3 > 0) {
                  L2: {
                    var5_int = param2[0].field_r;
                    if (param0 > 10) {
                      break L2;
                    } else {
                      ke.a(-53, 77, (vn[]) null, 65, -32);
                      break L2;
                    }
                  }
                  var6 = param2[2].field_r;
                  var7 = param2[1].field_r;
                  param2[0].b(param1, param4);
                  param2[2].b(-var6 + param1 - -param3, param4);
                  bi.b(eo.field_c);
                  bi.c(var5_int + param1, param4, -var6 + param3 + param1, param4 + param2[1].field_q);
                  var8 = var5_int + param1;
                  var9 = param1 + param3 - var6;
                  param1 = var8;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (~var9 >= ~param1) {
                          break L5;
                        } else {
                          param2[1].b(param1, param4);
                          param1 = param1 + var7;
                          if (var10 != 0) {
                            break L4;
                          } else {
                            if (var10 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      bi.a(eo.field_c);
                      break L4;
                    }
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("ke.EB(").append(param0).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, int param1, int[] param2, byte[] param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            var5_int = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var5_int <= ~je.field_b.length) {
                    break L3;
                  } else {
                    param4 = je.field_b[var5_int];
                    if (var7 != 0) {
                      break L2;
                    } else {
                      var6 = var5_int << 4;
                      L4: while (true) {
                        L5: {
                          L6: {
                            int incrementValue$6 = param4;
                            param4--;
                            if (0 == incrementValue$6) {
                              break L6;
                            } else {
                              int incrementValue$7 = var6;
                              var6++;
                              param1 = uf.field_o[incrementValue$7];
                              param2[param3[param1]] = param2[param3[param1]] + 1;
                              uf.field_o[param2[param3[param1]]] = param1;
                              if (var7 != 0) {
                                break L5;
                              } else {
                                if (var7 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var5_int++;
                          break L5;
                        }
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("ke.CB(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L7;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L7;
            }
          }
          L8: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
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
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L8;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param4 + 41);
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
            lc.field_d = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ke.focusLost(");
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
          throw sh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final boolean b(boolean param0) {
        return true;
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) nh.field_J) {
                break L1;
              } else {
                if (!qn.field_j) {
                  mp.field_a = 4000L + pd.a(-22826);
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
          throw sh.a((Throwable) (Object) runtimeException, "ke.stop()");
        }
    }

    final void a(int param0, int param1, String param2, int param3, int param4, int param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            op var8_ref2 = null;
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
            var9 = ZombieDawn.field_J;
            try {
              try {
                L0: {
                  if (null != nh.field_J) {
                    mc.field_k = mc.field_k + 1;
                    if (mc.field_k < 3) {
                      ((ke) this).getAppletContext().showDocument(((ke) this).getDocumentBase(), "_self");
                      return;
                    } else {
                      ((ke) this).a("alreadyloaded", 50);
                      return;
                    }
                  } else {
                    L1: {
                      rg.field_I = 0;
                      kj.field_c = param0;
                      id.field_D = param0;
                      vb.field_I = 0;
                      field_b = param5;
                      te.field_eb = param3;
                      ul.field_d = param3;
                      nh.field_J = (ke) this;
                      b.field_m = hc.a(0);
                      if (param4 == -14384) {
                        break L1;
                      } else {
                        field_h = -97;
                        break L1;
                      }
                    }
                    ec dupTemp$1 = new ec(param6, param2, param1, true);
                    vh.field_a = dupTemp$1;
                    mh.field_E = dupTemp$1;
                    var8_ref2 = vh.field_a.a(1, (Runnable) this, true);
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (var8_ref2.field_f != 0) {
                            break L4;
                          } else {
                            ld.a(10L, (byte) 95);
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
                  ae.a(var8, 10331, (String) null);
                  ((ke) this).a("crash", 50);
                  break L5;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_21_0 = (RuntimeException) var8_ref;
                stackOut_21_1 = new StringBuilder().append("ke.AB(").append(param0).append(44).append(param1).append(44);
                stackIn_24_0 = stackOut_21_0;
                stackIn_24_1 = stackOut_21_1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                if (param2 == null) {
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
              throw sh.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void c(int param0);

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
            if (null == sj.field_a) {
              L1: {
                if (null == bh.field_i) {
                  break L1;
                } else {
                  if ((Object) (Object) bh.field_i == this) {
                    break L1;
                  } else {
                    stackOut_7_0 = bh.field_i.getDocumentBase();
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
          throw sh.a((Throwable) (Object) var1, "ke.getDocumentBase()");
        }
        return stackIn_10_0;
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
            bh.field_i = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ke.provideLoaderApplet(");
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
          throw sh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    private final void d(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        int var6_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = pd.a(-22826);
              if (param0 == 6) {
                break L1;
              } else {
                this.d(120);
                break L1;
              }
            }
            L2: {
              var4 = ji.field_c[qk.field_Db];
              ji.field_c[qk.field_Db] = var2_long;
              qk.field_Db = qk.field_Db - -1 & 31;
              if (var4 == 0L) {
                break L2;
              } else {
                if (var2_long > var4) {
                  var6_int = (int)(var2_long + -var4);
                  mf.field_d = ((var6_int >> 1) + 32000) / var6_int;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              int fieldTemp$2 = e.field_O;
              e.field_O = e.field_O + 1;
              if (50 >= fieldTemp$2) {
                break L3;
              } else {
                L4: {
                  nd.field_b = true;
                  e.field_O = e.field_O - 50;
                  cj.field_d.setSize(te.field_eb, kj.field_c);
                  cj.field_d.setVisible(true);
                  if (null == sj.field_a) {
                    break L4;
                  } else {
                    if (null != n.field_p) {
                      break L4;
                    } else {
                      var6 = sj.field_a.getInsets();
                      cj.field_d.setLocation(rg.field_I + var6.left, var6.top + vb.field_I);
                      if (ZombieDawn.field_J == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                cj.field_d.setLocation(rg.field_I, vb.field_I);
                break L3;
              }
            }
            ((ke) this).c((byte) 67);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sh.a((Throwable) (Object) runtimeException, "ke.HB(" + param0 + 41);
        }
    }

    public abstract void init();

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) nh.field_J != this) {
                break L1;
              } else {
                if (qn.field_j) {
                  break L1;
                } else {
                  mp.field_a = pd.a(-22826);
                  ld.a(5000L, (byte) 34);
                  mh.field_E = null;
                  this.a((byte) 96, false);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sh.a((Throwable) (Object) runtimeException, "ke.destroy()");
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
            lc.field_d = true;
            nd.field_b = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ke.focusGained(");
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
          throw sh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
            if (sj.field_a != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.applet.AppletContext) (Object) stackIn_4_0;
            } else {
              L1: {
                if (null == bh.field_i) {
                  break L1;
                } else {
                  if ((Object) (Object) bh.field_i != this) {
                    stackOut_11_0 = bh.field_i.getAppletContext();
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
          throw sh.a((Throwable) (Object) var1, "ke.getAppletContext()");
        }
        return stackIn_14_0;
    }

    private final void a(byte param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable var3_ref = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 96) {
              var3 = this;
              synchronized (var3) {
                L1: {
                  if (!qn.field_j) {
                    qn.field_j = true;
                    break L1;
                  } else {
                    return;
                  }
                }
              }
              L2: {
                if (bh.field_i != null) {
                  bh.field_i.destroy();
                  break L2;
                } else {
                  break L2;
                }
              }
              try {
                L3: {
                  ((ke) this).c(param0 + 16754);
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
                if (cj.field_d != null) {
                  try {
                    L6: {
                      cj.field_d.removeFocusListener((java.awt.event.FocusListener) this);
                      cj.field_d.getParent().remove((java.awt.Component) (Object) cj.field_d);
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
                if (null != vh.field_a) {
                  try {
                    L9: {
                      vh.field_a.b(0);
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
                ((ke) this).c(false);
                if (sj.field_a != null) {
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
              System.out.println("Shutdown complete - clean:" + param1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw sh.a((Throwable) (Object) runtimeException, "ke.JB(" + param0 + 44 + param1 + 41);
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

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
              if ((Object) (Object) nh.field_J != this) {
                break L1;
              } else {
                if (!qn.field_j) {
                  L2: {
                    nd.field_b = true;
                    if (!gf.field_a) {
                      break L2;
                    } else {
                      if (pd.a(-22826) - qj.field_g > 1000L) {
                        L3: {
                          var2_ref = param0.getClipBounds();
                          if (var2_ref == null) {
                            break L3;
                          } else {
                            if (~var2_ref.width > ~ul.field_d) {
                              break L2;
                            } else {
                              if (var2_ref.height < id.field_D) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        rl.field_f = true;
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
            stackOut_19_1 = new StringBuilder().append("ke.paint(");
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
          throw sh.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    abstract void c(boolean param0);

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) nh.field_J) {
                break L1;
              } else {
                if (!qn.field_j) {
                  mp.field_a = 0L;
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
          throw sh.a((Throwable) (Object) runtimeException, "ke.start()");
        }
    }

    private final void d() {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        Object var6 = null;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = pd.a(-22826);
              var4 = ZombieDawn.field_E[mc.field_f];
              ZombieDawn.field_E[mc.field_f] = var2_long;
              if (0L == var4) {
                break L1;
              } else {
                if (~var2_long < ~var4) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            mc.field_f = 1 + mc.field_f & 31;
            var6 = this;
            synchronized (var6) {
              L2: {
                mp.field_c = lc.field_d;
                break L2;
              }
            }
            ((ke) this).e((byte) 15);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2, "ke.BB(" + 47 + 41);
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    final void a(String param0, int param1) {
        try {
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              L0: {
                if (((ke) this).field_j) {
                  return;
                } else {
                  L1: {
                    if (param1 == 50) {
                      break L1;
                    } else {
                      this.a((byte) -17, true);
                      break L1;
                    }
                  }
                  ((ke) this).field_j = true;
                  System.out.println("error_game_" + param0);
                  try {
                    L2: {
                      Object discarded$1 = qe.a(hc.a(0), "loggedout", -90);
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
                      ((ke) this).getAppletContext().showDocument(new java.net.URL(((ke) this).getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
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
                stackOut_14_0 = (RuntimeException) var3_ref2;
                stackOut_14_1 = new StringBuilder().append("ke.IB(");
                stackIn_17_0 = stackOut_14_0;
                stackIn_17_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param0 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L6;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_18_0 = stackOut_15_0;
                  stackIn_18_1 = stackOut_15_1;
                  stackIn_18_2 = stackOut_15_2;
                  break L6;
                }
              }
              throw sh.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected ke() {
        ((ke) this).field_j = false;
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
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
            if (sj.field_a != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String) (Object) stackIn_4_0;
            } else {
              L1: {
                if (null == bh.field_i) {
                  break L1;
                } else {
                  if ((Object) (Object) bh.field_i == this) {
                    break L1;
                  } else {
                    stackOut_9_0 = bh.field_i.getParameter(param0);
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
            stackOut_13_1 = new StringBuilder().append("ke.getParameter(");
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
          throw sh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_12_0;
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
            boolean stackIn_46_0 = false;
            boolean stackIn_64_0 = false;
            int stackIn_68_0 = 0;
            int stackIn_68_1 = 0;
            int stackIn_76_0 = 0;
            int stackIn_76_1 = 0;
            int stackIn_88_0 = 0;
            int stackIn_93_0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_45_0 = false;
            boolean stackOut_62_0 = false;
            int stackOut_67_0 = 0;
            int stackOut_67_1 = 0;
            int stackOut_75_0 = 0;
            int stackOut_75_1 = 0;
            int stackOut_87_0 = 0;
            int stackOut_91_0 = 0;
            var5 = ZombieDawn.field_J;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (null == ec.field_h) {
                              break L5;
                            } else {
                              L6: {
                                var1 = (Object) (Object) ec.field_h.toLowerCase();
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
                                  var2 = ec.field_g;
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
                                ((ke) this).a("wrongjava", 50);
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
                                      stackOut_45_0 = bj.a(var2.charAt(var3), 117);
                                      stackIn_64_0 = stackOut_45_0;
                                      stackIn_46_0 = stackOut_45_0;
                                      if (var5 != 0) {
                                        break L4;
                                      } else {
                                        if (!stackIn_46_0) {
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
                                  if (!sj.a((byte) -118, (CharSequence) (Object) var4)) {
                                    break L5;
                                  } else {
                                    if (ra.a((CharSequence) (Object) var4, -84) >= 10) {
                                      break L5;
                                    } else {
                                      ((ke) this).a("wrongjava", 50);
                                      if (var5 == 0) {
                                        break L2;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (ec.field_g == null) {
                            break L3;
                          } else {
                            stackOut_62_0 = ec.field_g.startsWith("1.");
                            stackIn_64_0 = stackOut_62_0;
                            break L4;
                          }
                        }
                        if (!stackIn_64_0) {
                          break L3;
                        } else {
                          var1_int = 2;
                          var2_int = 0;
                          L11: while (true) {
                            L12: {
                              L13: {
                                if (~ec.field_g.length() >= ~var1_int) {
                                  break L13;
                                } else {
                                  var3 = ec.field_g.charAt(var1_int);
                                  stackOut_67_0 = ~var3;
                                  stackOut_67_1 = -49;
                                  stackIn_76_0 = stackOut_67_0;
                                  stackIn_76_1 = stackOut_67_1;
                                  stackIn_68_0 = stackOut_67_0;
                                  stackIn_68_1 = stackOut_67_1;
                                  if (var5 != 0) {
                                    break L12;
                                  } else {
                                    if (stackIn_68_0 > stackIn_68_1) {
                                      break L13;
                                    } else {
                                      if (57 < var3) {
                                        break L13;
                                      } else {
                                        var2_int = var3 - (48 - 10 * var2_int);
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
                              }
                              stackOut_75_0 = 5;
                              stackOut_75_1 = var2_int;
                              stackIn_76_0 = stackOut_75_0;
                              stackIn_76_1 = stackOut_75_1;
                              break L12;
                            }
                            if (stackIn_76_0 > stackIn_76_1) {
                              break L3;
                            } else {
                              gf.field_a = true;
                              break L3;
                            }
                          }
                        }
                      }
                      L14: {
                        var1 = (Object) (Object) nh.field_J;
                        if (null == bh.field_i) {
                          break L14;
                        } else {
                          var1 = (Object) (Object) bh.field_i;
                          break L14;
                        }
                      }
                      L15: {
                        var2_ref = ec.field_d;
                        if (null == var2_ref) {
                          break L15;
                        } else {
                          try {
                            L16: {
                              Object discarded$4 = var2_ref.invoke(var1, new Object[1]);
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
                      int discarded$5 = 1818;
                      bn.c();
                      ((ke) this).a(true);
                      cn.field_f = l.a(-1, kj.field_c, (java.awt.Component) (Object) cj.field_d, te.field_eb);
                      ((ke) this).b((byte) 94);
                      int discarded$6 = 16516;
                      wo.field_yb = lk.e();
                      L18: while (true) {
                        L19: {
                          L20: {
                            if (mp.field_a == 0L) {
                              break L20;
                            } else {
                              stackOut_87_0 = (~mp.field_a < ~pd.a(-22826) ? -1 : (~mp.field_a == ~pd.a(-22826) ? 0 : 1));
                              stackIn_93_0 = stackOut_87_0;
                              stackIn_88_0 = stackOut_87_0;
                              if (var5 != 0) {
                                break L19;
                              } else {
                                if (stackIn_88_0 >= 0) {
                                  break L2;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          fc.field_Ob = wo.field_yb.a(ea.field_a, 0);
                          stackOut_91_0 = 0;
                          stackIn_93_0 = stackOut_91_0;
                          break L19;
                        }
                        var3 = stackIn_93_0;
                        L21: while (true) {
                          L22: {
                            L23: {
                              if (var3 >= fc.field_Ob) {
                                break L23;
                              } else {
                                int discarded$7 = 47;
                                this.d();
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
                            this.d(6);
                            an.a(0, vh.field_a, (Object) (Object) cj.field_d);
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
                    ae.a((Throwable) var1, 10331, (String) null);
                    ((ke) this).a("crash", 50);
                    break L24;
                  }
                }
                this.a((byte) 96, true);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw sh.a((Throwable) var1, "ke.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 500;
    }
}
