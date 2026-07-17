/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.AppletContext;
import java.net.URL;

public abstract class kf extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_e;
    static gq field_c;
    static int field_i;
    static int field_g;
    static String field_a;
    static String field_h;
    static int[] field_f;
    public static int field_l;
    public static int field_j;
    public static int field_b;
    public static int field_m;
    public static boolean field_d;
    public static boolean field_n;
    public static int field_k;

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) ts.field_G) {
                break L1;
              } else {
                if (!fc.field_a) {
                  oe.field_a = 0L;
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
          throw r.a((Throwable) (Object) runtimeException, "kf.start()");
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void g(int param0);

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
            if (uf.field_b != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.applet.AppletContext) (Object) stackIn_4_0;
            } else {
              L1: {
                if (null == hb.field_a) {
                  break L1;
                } else {
                  if ((Object) (Object) hb.field_a == this) {
                    break L1;
                  } else {
                    stackOut_9_0 = hb.field_a.getAppletContext();
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
          throw r.a((Throwable) (Object) var1, "kf.getAppletContext()");
        }
        return stackIn_12_0;
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) ts.field_G != this) {
                break L1;
              } else {
                if (!fc.field_a) {
                  oe.field_a = pr.a(14274) - -4000L;
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
          throw r.a((Throwable) (Object) runtimeException, "kf.stop()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    abstract void a(int param0);

    abstract void d(int param0);

    final static void e(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 112) {
              L1: {
                if (null == aj.field_e) {
                  break L1;
                } else {
                  aj.field_e.c();
                  break L1;
                }
              }
              L2: {
                if (null != hg.field_q) {
                  hg.field_q.c();
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "kf.QA(" + param0 + 41);
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
            ((kf) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("kf.update(");
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
          throw r.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
            ((kf) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("kf.windowClosing(");
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
          throw r.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static String[] a(String param0, byte param1, char param2) {
        String[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        Object stackIn_13_0 = null;
        String[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        Object stackOut_12_0 = null;
        String[] stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3 = so.a(param0, param2, 90);
            var5 = 0;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var4 <= ~var3.length) {
                    break L3;
                  } else {
                    stackOut_3_0 = 0;
                    stackOut_3_1 = var3[var4].trim().length();
                    stackIn_10_0 = stackOut_3_0;
                    stackIn_10_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 >= stackIn_4_1) {
                          break L4;
                        } else {
                          var5++;
                          break L4;
                        }
                      }
                      var4++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_9_0 = -1;
                stackOut_9_1 = ~var5;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L2;
              }
              if (stackIn_10_0 == stackIn_10_1) {
                stackOut_12_0 = null;
                stackIn_13_0 = stackOut_12_0;
                return (String[]) (Object) stackIn_13_0;
              } else {
                var6 = new String[var5];
                var7 = 49 / ((29 - param1) / 56);
                var5 = 0;
                var4 = 0;
                L5: while (true) {
                  L6: {
                    if (var4 >= var3.length) {
                      break L6;
                    } else {
                      L7: {
                        if (var3[var4].trim().length() <= 0) {
                          break L7;
                        } else {
                          int incrementValue$2 = var5;
                          var5++;
                          var6[incrementValue$2] = var3[var4].trim();
                          break L7;
                        }
                      }
                      var4++;
                      if (var8 == 0) {
                        continue L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  stackOut_20_0 = (String[]) var6;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3_ref;
            stackOut_22_1 = new StringBuilder().append("kf.PA(");
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
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_21_0;
    }

    protected kf() {
        ((kf) this).field_e = false;
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
            int stackIn_78_0 = 0;
            int stackIn_78_1 = 0;
            int stackIn_92_0 = 0;
            int stackIn_97_0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_47_0 = false;
            boolean stackOut_64_0 = false;
            int stackOut_69_0 = 0;
            int stackOut_69_1 = 0;
            int stackOut_77_0 = 0;
            int stackOut_77_1 = 0;
            int stackOut_91_0 = 0;
            int stackOut_95_0 = 0;
            var5 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (qb.field_r == null) {
                              break L5;
                            } else {
                              L6: {
                                var1 = (Object) (Object) qb.field_r.toLowerCase();
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
                                  var2 = qb.field_i;
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
                                ((kf) this).a((byte) 9, "wrongjava");
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
                                    if (var3 >= var2.length()) {
                                      break L10;
                                    } else {
                                      stackOut_47_0 = dk.a((byte) 63, var2.charAt(var3));
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
                                  if (!go.a(0, (CharSequence) (Object) var4)) {
                                    break L5;
                                  } else {
                                    if (ma.a((CharSequence) (Object) var4, 2) >= 10) {
                                      break L5;
                                    } else {
                                      ((kf) this).a((byte) -113, "wrongjava");
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
                          if (null == qb.field_i) {
                            break L3;
                          } else {
                            stackOut_64_0 = qb.field_i.startsWith("1.");
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
                                if (~var1_int <= ~qb.field_i.length()) {
                                  break L13;
                                } else {
                                  var3 = qb.field_i.charAt(var1_int);
                                  stackOut_69_0 = 48;
                                  stackOut_69_1 = var3;
                                  stackIn_78_0 = stackOut_69_0;
                                  stackIn_78_1 = stackOut_69_1;
                                  stackIn_70_0 = stackOut_69_0;
                                  stackIn_70_1 = stackOut_69_1;
                                  if (var5 != 0) {
                                    break L12;
                                  } else {
                                    if (stackIn_70_0 > stackIn_70_1) {
                                      break L13;
                                    } else {
                                      if (var3 > 57) {
                                        break L13;
                                      } else {
                                        var1_int++;
                                        var2_int = var2_int * 10 - 48 - -var3;
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
                              stackOut_77_0 = 5;
                              stackOut_77_1 = var2_int;
                              stackIn_78_0 = stackOut_77_0;
                              stackIn_78_1 = stackOut_77_1;
                              break L12;
                            }
                            if (stackIn_78_0 > stackIn_78_1) {
                              break L3;
                            } else {
                              me.field_a = true;
                              break L3;
                            }
                          }
                        }
                      }
                      L14: {
                        var1 = (Object) (Object) ts.field_G;
                        if (hb.field_a != null) {
                          var1 = (Object) (Object) hb.field_a;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        var2_ref = qb.field_v;
                        if (null == var2_ref) {
                          break L15;
                        } else {
                          try {
                            L16: {
                              Object discarded$2 = var2_ref.invoke(var1, new Object[1]);
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
                      dc.d(22943);
                      ((kf) this).f(0);
                      so.field_q = in.a((java.awt.Component) (Object) tm.field_i, 16, me.field_e, nn.field_b);
                      ((kf) this).c(-1);
                      oe.field_d = ij.b(115);
                      L18: while (true) {
                        L19: {
                          L20: {
                            if (0L == oe.field_a) {
                              break L20;
                            } else {
                              stackOut_91_0 = (oe.field_a < pr.a(14274) ? -1 : (oe.field_a == pr.a(14274) ? 0 : 1));
                              stackIn_97_0 = stackOut_91_0;
                              stackIn_92_0 = stackOut_91_0;
                              if (var5 != 0) {
                                break L19;
                              } else {
                                if (stackIn_92_0 <= 0) {
                                  break L2;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          hp.field_p = oe.field_d.a(vg.field_i, -1);
                          stackOut_95_0 = 0;
                          stackIn_97_0 = stackOut_95_0;
                          break L19;
                        }
                        var3 = stackIn_97_0;
                        L21: while (true) {
                          L22: {
                            L23: {
                              if (hp.field_p <= var3) {
                                break L23;
                              } else {
                                int discarded$3 = -23;
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
                            this.c((byte) 58);
                            ud.a(-22, fa.field_W, (Object) (Object) tm.field_i);
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
                    jq.a(-29901, (Throwable) var1, (String) null);
                    ((kf) this).a((byte) -105, "crash");
                    break L24;
                  }
                }
                this.a(-78, true);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw r.a((Throwable) var1, "kf.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_f = null;
              field_a = null;
              if (param0 > 113) {
                break L1;
              } else {
                nk discarded$2 = kf.a((String) null, 22, (bc) null, (String) null);
                break L1;
              }
            }
            field_h = null;
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "kf.UA(" + param0 + 41);
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (null != uf.field_b) {
          return null;
        } else {
          L0: {
            if (null == hb.field_a) {
              break L0;
            } else {
              if (this == (Object) (Object) hb.field_a) {
                break L0;
              } else {
                return hb.field_a.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final static int[] a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_7_0 = null;
        int[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_6_0 = null;
        int[] stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 83) {
                break L1;
              } else {
                field_i = 66;
                break L1;
              }
            }
            var2_int = param0.length;
            var3 = new int[var2_int];
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var4 >= var2_int) {
                    break L4;
                  } else {
                    stackOut_6_0 = (int[]) var3;
                    stackIn_11_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      stackIn_7_0[param0[var4]] = var4;
                      var4++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_10_0 = (int[]) var3;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("kf.NA(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        return stackIn_11_0;
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
            if (uf.field_b == null) {
              L1: {
                if (hb.field_a == null) {
                  break L1;
                } else {
                  if ((Object) (Object) hb.field_a == this) {
                    break L1;
                  } else {
                    stackOut_7_0 = hb.field_a.getParameter(param0);
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
            stackOut_11_1 = new StringBuilder().append("kf.getParameter(");
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
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_10_0;
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
            lq.field_q = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("kf.focusLost(");
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
          throw r.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

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
            if (null == uf.field_b) {
              L1: {
                if (null == hb.field_a) {
                  break L1;
                } else {
                  if ((Object) (Object) hb.field_a == this) {
                    break L1;
                  } else {
                    stackOut_7_0 = hb.field_a.getDocumentBase();
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
          throw r.a((Throwable) (Object) var1, "kf.getDocumentBase()");
        }
        return stackIn_10_0;
    }

    final void a(byte param0, int param1, int param2, int param3, String param4, int param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            pb var8_ref2 = null;
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
            var9 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
              try {
                L0: {
                  if (null != ts.field_G) {
                    js.field_d = js.field_d + 1;
                    if (js.field_d < 3) {
                      ((kf) this).getAppletContext().showDocument(((kf) this).getDocumentBase(), "_self");
                      return;
                    } else {
                      ((kf) this).a((byte) -107, "alreadyloaded");
                      return;
                    }
                  } else {
                    L1: {
                      nn.field_b = param2;
                      b.field_u = param2;
                      if (param0 == -50) {
                        break L1;
                      } else {
                        field_f = null;
                        break L1;
                      }
                    }
                    gn.field_B = 0;
                    ts.field_G = (kf) this;
                    me.field_e = param6;
                    tj.field_h = param6;
                    td.field_G = param5;
                    gs.field_k = 0;
                    ei.field_c = kq.f((byte) 126);
                    qb dupTemp$1 = new qb(param3, param4, param1, true);
                    fa.field_W = dupTemp$1;
                    jl.field_S = dupTemp$1;
                    var8_ref2 = fa.field_W.a(true, 1, (Runnable) this);
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (0 != var8_ref2.field_d) {
                            break L4;
                          } else {
                            jb.a((byte) -120, 10L);
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
                  jq.a(-29901, var8, (String) null);
                  ((kf) this).a((byte) -95, "crash");
                  break L5;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_21_0 = (RuntimeException) var8_ref;
                stackOut_21_1 = new StringBuilder().append("kf.AB(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
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
              throw r.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param5 + 44 + param6 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException var2 = null;
        java.awt.Rectangle var2_ref = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) ts.field_G != this) {
                break L1;
              } else {
                if (fc.field_a) {
                  break L1;
                } else {
                  L2: {
                    oq.field_e = true;
                    if (!me.field_a) {
                      break L2;
                    } else {
                      if (pr.a(14274) - nh.field_m > 1000L) {
                        L3: {
                          var2_ref = param0.getClipBounds();
                          if (null == var2_ref) {
                            break L3;
                          } else {
                            if (~var2_ref.width > ~tj.field_h) {
                              break L2;
                            } else {
                              if (~var2_ref.height > ~b.field_u) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        pf.field_c = true;
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
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("kf.paint(");
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
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
            hb.field_a = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("kf.provideLoaderApplet(");
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
          throw r.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static nk a(String param0, int param1, bc param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        nk stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        nk stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
            var5 = -40 / ((-13 - param1) / 47);
            var4_int = param2.a(127, param0);
            var6 = param2.a(var4_int, (byte) 106, param3);
            stackOut_0_0 = lg.a(-78, var6, var4_int, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("kf.SA(");
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
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_1_0;
    }

    public abstract void init();

    final void a(byte param0, String param1) {
        try {
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            int var3_int = 0;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            Throwable decompiledCaughtException = null;
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
                if (!((kf) this).field_e) {
                  ((kf) this).field_e = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L1: {
                      Object discarded$1 = ll.a("loggedout", kq.f((byte) 126), (byte) 55);
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
                      ((kf) this).getAppletContext().showDocument(new java.net.URL(((kf) this).getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
                      var3_int = -31 % ((-37 - param0) / 44);
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
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_10_0 = (RuntimeException) var3_ref2;
                stackOut_10_1 = new StringBuilder().append("kf.TA(").append(param0).append(44);
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
                  break L5;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_14_0 = stackOut_11_0;
                  stackIn_14_1 = stackOut_11_1;
                  stackIn_14_2 = stackOut_11_2;
                  break L5;
                }
              }
              throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void c(int param0);

    final boolean b(byte param0) {
        return true;
    }

    private final void c(byte param0) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_long = pr.a(param0 ^ 14328);
            var4 = nm.field_b[qo.field_a];
            nm.field_b[qo.field_a] = var2_long;
            qo.field_a = 1 + qo.field_a & 31;
            if (param0 == 58) {
              L1: {
                if (var4 == 0L) {
                  break L1;
                } else {
                  if (~var2_long >= ~var4) {
                    break L1;
                  } else {
                    var6_int = (int)(var2_long - var4);
                    rq.field_i = ((var6_int >> 1) + 32000) / var6_int;
                    break L1;
                  }
                }
              }
              L2: {
                int fieldTemp$2 = mk.field_a;
                mk.field_a = mk.field_a + 1;
                if (fieldTemp$2 > 50) {
                  L3: {
                    mk.field_a = mk.field_a - 50;
                    oq.field_e = true;
                    tm.field_i.setSize(me.field_e, nn.field_b);
                    tm.field_i.setVisible(true);
                    if (uf.field_b == null) {
                      break L3;
                    } else {
                      if (null != cg.field_K) {
                        break L3;
                      } else {
                        var6 = uf.field_b.getInsets();
                        tm.field_i.setLocation(var6.left + gs.field_k, var6.top - -gn.field_B);
                        if (!ShatteredPlansClient.field_F) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  tm.field_i.setLocation(gs.field_k, gn.field_B);
                  break L2;
                } else {
                  break L2;
                }
              }
              ((kf) this).d(1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kf.BB(" + param0 + 41);
        }
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) ts.field_G != this) {
                break L1;
              } else {
                if (!fc.field_a) {
                  oe.field_a = pr.a(14274);
                  jb.a((byte) -108, 5000L);
                  jl.field_S = null;
                  this.a(-113, false);
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
          throw r.a((Throwable) (Object) runtimeException, "kf.destroy()");
        }
    }

    final static gr a(byte param0, int param1, int param2, int param3) {
        gr var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        gr stackIn_9_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        gr stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        gr stackOut_8_0 = null;
        byte stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        gr stackOut_15_0 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (gr) (Object) qa.field_r.d(0);
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = param1;
                    stackOut_3_1 = var4.field_k;
                    stackIn_12_0 = stackOut_3_0;
                    stackIn_12_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 == stackIn_4_1) {
                        stackOut_8_0 = (gr) var4;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0;
                      } else {
                        var4 = (gr) (Object) qa.field_r.a((byte) -71);
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var4 = new gr();
                var4.field_k = param1;
                var4.field_j = param3;
                qa.field_r.a((byte) -113, (oh) (Object) var4);
                int discarded$2 = 0;
                uf.a(var4, param2);
                stackOut_11_0 = param0;
                stackOut_11_1 = 29;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L2;
              }
              L4: {
                if (stackIn_12_0 >= stackIn_12_1) {
                  break L4;
                } else {
                  nk discarded$3 = kf.a((String) null, -57, (bc) null, (String) null);
                  break L4;
                }
              }
              stackOut_15_0 = (gr) var4;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var4_ref, "kf.VA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_16_0;
    }

    private final void a() {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        Object var6 = null;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = pr.a(14274);
              var4 = fb.field_Cb[ca.field_j];
              fb.field_Cb[ca.field_j] = var2_long;
              if (0L == var4) {
                break L1;
              } else {
                if (var4 < var2_long) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            ca.field_j = ca.field_j - -1 & 31;
            var6 = this;
            synchronized (var6) {
              L2: {
                br.field_i = lq.field_q;
                break L2;
              }
            }
            ((kf) this).a(-96);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kf.WA(" + -23 + 41);
        }
    }

    private final void a(int param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable var3_ref = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3 = this;
            synchronized (var3) {
              L1: {
                if (fc.field_a) {
                  return;
                } else {
                  fc.field_a = true;
                  break L1;
                }
              }
            }
            L2: {
              if (null == hb.field_a) {
                break L2;
              } else {
                hb.field_a.destroy();
                break L2;
              }
            }
            try {
              L3: {
                ((kf) this).a(false);
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
            if (param0 <= -15) {
              L5: {
                if (null == tm.field_i) {
                  break L5;
                } else {
                  try {
                    L6: {
                      tm.field_i.removeFocusListener((java.awt.event.FocusListener) this);
                      tm.field_i.getParent().remove((java.awt.Component) (Object) tm.field_i);
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
                if (fa.field_W != null) {
                  try {
                    L9: {
                      fa.field_W.b(58);
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
                ((kf) this).g(-24069);
                if (uf.field_b != null) {
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
          throw r.a((Throwable) (Object) runtimeException, "kf.OA(" + param0 + 44 + param1 + 41);
        }
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
            lq.field_q = true;
            oq.field_e = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("kf.focusGained(");
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
          throw r.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    abstract void a(boolean param0);

    final synchronized void f(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != tm.field_i) {
                tm.field_i.removeFocusListener((java.awt.event.FocusListener) this);
                tm.field_i.getParent().setBackground(java.awt.Color.black);
                tm.field_i.getParent().remove((java.awt.Component) (Object) tm.field_i);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                this.c((byte) -79);
                break L2;
              }
            }
            L3: {
              L4: {
                if (null != cg.field_K) {
                  break L4;
                } else {
                  L5: {
                    if (null != uf.field_b) {
                      break L5;
                    } else {
                      L6: {
                        if (hb.field_a != null) {
                          break L6;
                        } else {
                          var2 = (Object) (Object) ts.field_G;
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var2 = (Object) (Object) hb.field_a;
                      if (var4 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = (Object) (Object) uf.field_b;
                  if (var4 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var2 = (Object) (Object) cg.field_K;
              break L3;
            }
            L7: {
              L8: {
                ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
                tm.field_i = (java.awt.Canvas) (Object) new af((java.awt.Component) this);
                java.awt.Component discarded$6 = ((java.awt.Container) var2).add((java.awt.Component) (Object) tm.field_i);
                tm.field_i.setSize(me.field_e, nn.field_b);
                tm.field_i.setVisible(true);
                if ((Object) (Object) uf.field_b != var2) {
                  break L8;
                } else {
                  var3 = uf.field_b.getInsets();
                  tm.field_i.setLocation(gs.field_k + var3.left, var3.top - -gn.field_B);
                  if (var4 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              tm.field_i.setLocation(gs.field_k, gn.field_B);
              break L7;
            }
            tm.field_i.addFocusListener((java.awt.event.FocusListener) this);
            tm.field_i.requestFocus();
            br.field_i = true;
            lq.field_q = true;
            oq.field_e = true;
            pf.field_c = false;
            nh.field_m = pr.a(14274);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw r.a((Throwable) var2, "kf.RA(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new gq(7, 0, 1, 1);
        field_i = 2;
        field_a = "Play rated game";
        field_h = "You have 1 unread message!";
    }
}
