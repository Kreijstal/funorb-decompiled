/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;
import java.applet.AppletContext;
import java.awt.Frame;
import java.applet.Applet;

public abstract class tn extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String[] field_k;
    static String field_m;
    static String[] field_n;
    static String field_f;
    static int field_i;
    static int[] field_j;
    boolean field_c;
    static int field_o;
    static String field_d;
    public static int field_l;
    public static int field_h;
    public static boolean field_g;
    public static boolean field_b;
    public static int field_a;
    public static int field_e;
    public static boolean field_p;

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
            int stackIn_81_0 = 0;
            int stackIn_81_1 = 0;
            int stackIn_95_0 = 0;
            int stackIn_100_0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_49_0 = false;
            boolean stackOut_66_0 = false;
            int stackOut_72_0 = 0;
            int stackOut_72_1 = 0;
            int stackOut_80_0 = 0;
            int stackOut_80_1 = 0;
            int stackOut_94_0 = 0;
            int stackOut_98_0 = 0;
            var5 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (cb.field_o == null) {
                              break L5;
                            } else {
                              L6: {
                                var1 = (Object) (Object) cb.field_o.toLowerCase();
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
                                  var2 = cb.field_l;
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
                                ((tn) this).a(-18310, "wrongjava");
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
                                      stackOut_49_0 = ti.a(89, var2.charAt(var3));
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
                                  if (!td.a(-128, (CharSequence) (Object) var4)) {
                                    break L5;
                                  } else {
                                    if (na.a((CharSequence) (Object) var4, (byte) -33) >= 10) {
                                      break L5;
                                    } else {
                                      ((tn) this).a(-18310, "wrongjava");
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
                          if (cb.field_l == null) {
                            break L3;
                          } else {
                            stackOut_66_0 = cb.field_l.startsWith("1.");
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
                                if (~cb.field_l.length() >= ~var1_int) {
                                  break L13;
                                } else {
                                  var3 = cb.field_l.charAt(var1_int);
                                  stackOut_72_0 = ~var3;
                                  stackOut_72_1 = -49;
                                  stackIn_81_0 = stackOut_72_0;
                                  stackIn_81_1 = stackOut_72_1;
                                  stackIn_73_0 = stackOut_72_0;
                                  stackIn_73_1 = stackOut_72_1;
                                  if (var5 != 0) {
                                    break L12;
                                  } else {
                                    if (stackIn_73_0 > stackIn_73_1) {
                                      break L13;
                                    } else {
                                      if (57 < var3) {
                                        break L13;
                                      } else {
                                        var2_int = var2_int * 10 - (48 + -var3);
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
                              stackOut_80_0 = -6;
                              stackOut_80_1 = ~var2_int;
                              stackIn_81_0 = stackOut_80_0;
                              stackIn_81_1 = stackOut_80_1;
                              break L12;
                            }
                            if (stackIn_81_0 >= stackIn_81_1) {
                              il.field_g = true;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                      L14: {
                        var1 = (Object) (Object) ne.field_I;
                        if (null != bd.field_b) {
                          var1 = (Object) (Object) bd.field_b;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        var2_ref = cb.field_j;
                        if (var2_ref == null) {
                          break L15;
                        } else {
                          try {
                            L16: {
                              Object discarded$1 = var2_ref.invoke(var1, new Object[1]);
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
                      gh.a((byte) 90);
                      ((tn) this).a(-27106);
                      qa.field_f = vk.a(wp.field_c, -88, (java.awt.Component) (Object) ec.field_u, uo.field_i);
                      ((tn) this).a((byte) -15);
                      gn.field_y = rj.j(-30272);
                      L18: while (true) {
                        L19: {
                          L20: {
                            if (bf.field_m == 0L) {
                              break L20;
                            } else {
                              stackOut_94_0 = (~hm.a(64) < ~bf.field_m ? -1 : (~hm.a(64) == ~bf.field_m ? 0 : 1));
                              stackIn_100_0 = stackOut_94_0;
                              stackIn_95_0 = stackOut_94_0;
                              if (var5 != 0) {
                                break L19;
                              } else {
                                if (stackIn_95_0 <= 0) {
                                  break L2;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          id.field_b = gn.field_y.a((byte) 42, wa.field_b);
                          stackOut_98_0 = 0;
                          stackIn_100_0 = stackOut_98_0;
                          break L19;
                        }
                        var3 = stackIn_100_0;
                        L21: while (true) {
                          L22: {
                            L23: {
                              if (var3 >= id.field_b) {
                                break L23;
                              } else {
                                this.f(5176);
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
                            this.e(-1);
                            fm.a(mc.field_k, (Object) (Object) ec.field_u, (byte) -52);
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
                    jo.a(1, (String) null, (Throwable) var1);
                    ((tn) this).a(-18310, "crash");
                    break L24;
                  }
                }
                this.a(true, -238);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw aa.a((Throwable) var1, "tn.run()");
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
            ((tn) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("tn.update(");
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
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    abstract void d(int param0);

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
            if (eg.field_j != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.net.URL) (Object) stackIn_4_0;
            } else {
              L1: {
                if (bd.field_b == null) {
                  break L1;
                } else {
                  if ((Object) (Object) bd.field_b != this) {
                    stackOut_11_0 = bd.field_b.getDocumentBase();
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
          throw aa.a((Throwable) (Object) var1, "tn.getDocumentBase()");
        }
        return stackIn_14_0;
    }

    private final void e(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = hm.a(64);
              var4 = rh.field_x[la.field_b];
              rh.field_x[la.field_b] = var2_long;
              if (var4 == 0L) {
                break L1;
              } else {
                if (var2_long <= var4) {
                  break L1;
                } else {
                  var6_int = (int)(var2_long - var4);
                  kk.field_k = ((var6_int >> 1) + 32000) / var6_int;
                  break L1;
                }
              }
            }
            L2: {
              la.field_b = la.field_b - param0 & 31;
              int fieldTemp$2 = oh.field_e;
              oh.field_e = oh.field_e + 1;
              if (50 >= fieldTemp$2) {
                break L2;
              } else {
                L3: {
                  L4: {
                    oh.field_e = oh.field_e - 50;
                    sn.field_s = true;
                    ec.field_u.setSize(uo.field_i, wp.field_c);
                    ec.field_u.setVisible(true);
                    if (eg.field_j == null) {
                      break L4;
                    } else {
                      if (eg.field_i == null) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ec.field_u.setLocation(ae.field_a, mc.field_m);
                  if (!Pixelate.field_H) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                var6 = eg.field_j.getInsets();
                ec.field_u.setLocation(var6.left + ae.field_a, var6.top + mc.field_m);
                break L2;
              }
            }
            ((tn) this).d(124);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "tn.QA(" + param0 + 41);
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
            ((tn) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("tn.windowClosing(");
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
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public abstract void init();

    final void a(int param0, byte param1, int param2, int param3, int param4, String param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            ei var8_ref2 = null;
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
            var9 = Pixelate.field_H ? 1 : 0;
            try {
              try {
                L0: {
                  if (null != ne.field_I) {
                    ki.field_j = ki.field_j + 1;
                    if (ki.field_j < 3) {
                      ((tn) this).getAppletContext().showDocument(((tn) this).getDocumentBase(), "_self");
                      return;
                    } else {
                      ((tn) this).a(param1 + -18206, "alreadyloaded");
                      return;
                    }
                  } else {
                    ne.field_I = (tn) this;
                    ae.field_a = 0;
                    uo.field_i = param2;
                    gk.field_ib = param2;
                    wp.field_c = param0;
                    de.field_j = param0;
                    jh.field_M = param4;
                    mc.field_m = 0;
                    qm.field_L = ao.a(13867);
                    cb dupTemp$1 = new cb(param6, param5, param3, true);
                    mc.field_k = dupTemp$1;
                    fp.field_c = dupTemp$1;
                    var8_ref2 = mc.field_k.a(1, (Runnable) this, (byte) -123);
                    L1: while (true) {
                      L2: {
                        L3: {
                          if (var8_ref2.field_b != 0) {
                            break L3;
                          } else {
                            vg.a(10L, (byte) 23);
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
                        if (param1 == -104) {
                          break L2;
                        } else {
                          field_o = 50;
                          break L2;
                        }
                      }
                      break L0;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  var8 = decompiledCaughtException;
                  jo.a(1, (String) null, var8);
                  ((tn) this).a(-18310, "crash");
                  break L4;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_21_0 = (RuntimeException) var8_ref;
                stackOut_21_1 = new StringBuilder().append("tn.UA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
                stackIn_24_0 = stackOut_21_0;
                stackIn_24_1 = stackOut_21_1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                if (param5 == null) {
                  stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                  stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                  stackOut_24_2 = "null";
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  break L5;
                } else {
                  stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                  stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                  stackOut_22_2 = "{...}";
                  stackIn_25_0 = stackOut_22_0;
                  stackIn_25_1 = stackOut_22_1;
                  stackIn_25_2 = stackOut_22_2;
                  break L5;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param6 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void f(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Object var6 = null;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = hm.a(64);
              if (param0 == 5176) {
                break L1;
              } else {
                ((tn) this).update((java.awt.Graphics) null);
                break L1;
              }
            }
            L2: {
              var4 = gf.field_a[wf.field_b];
              gf.field_a[wf.field_b] = var2_long;
              if (var4 == 0L) {
                break L2;
              } else {
                if (~var2_long >= ~var4) {
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            wf.field_b = 31 & 1 + wf.field_b;
            var6 = this;
            synchronized (var6) {
              L3: {
                ro.field_d = kn.field_K;
                break L3;
              }
            }
            ((tn) this).a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "tn.PA(" + param0 + 41);
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) ne.field_I) {
                break L1;
              } else {
                if (si.field_U) {
                  break L1;
                } else {
                  L2: {
                    sn.field_s = true;
                    if (!il.field_g) {
                      break L2;
                    } else {
                      if (hm.a(64) + -um.field_m <= 1000L) {
                        break L2;
                      } else {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (var2 == null) {
                            break L3;
                          } else {
                            if (~gk.field_ib < ~var2.width) {
                              break L2;
                            } else {
                              if (var2.height < de.field_j) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        wl.field_i = true;
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
            stackOut_21_0 = (RuntimeException) var2_ref;
            stackOut_21_1 = new StringBuilder().append("tn.paint(");
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) ne.field_I != this) {
                break L1;
              } else {
                if (!si.field_U) {
                  bf.field_m = 0L;
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
          throw aa.a((Throwable) (Object) runtimeException, "tn.start()");
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
            kn.field_K = true;
            sn.field_s = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("tn.focusGained(");
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
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void a(int param0, String param1) {
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
                L1: {
                  if (param0 == -18310) {
                    break L1;
                  } else {
                    ((tn) this).a((byte) -44);
                    break L1;
                  }
                }
                if (!((tn) this).field_c) {
                  ((tn) this).field_c = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L2: {
                      Object discarded$1 = cq.a("loggedout", (byte) -84, ao.a(13867));
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
                      ((tn) this).getAppletContext().showDocument(new java.net.URL(((tn) this).getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
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
                stackOut_13_0 = (RuntimeException) var3_ref2;
                stackOut_13_1 = new StringBuilder().append("tn.OA(").append(param0).append(44);
                stackIn_16_0 = stackOut_13_0;
                stackIn_16_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param1 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L6;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_17_0 = stackOut_14_0;
                  stackIn_17_1 = stackOut_14_1;
                  stackIn_17_2 = stackOut_14_2;
                  break L6;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
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
              if (this != (Object) (Object) ne.field_I) {
                break L1;
              } else {
                if (si.field_U) {
                  break L1;
                } else {
                  bf.field_m = hm.a(64);
                  vg.a(5000L, (byte) 23);
                  fp.field_c = null;
                  this.a(false, -238);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "tn.destroy()");
        }
    }

    private final void a(boolean param0, int param1) {
        Exception exception = null;
        Object var3 = null;
        Throwable var3_ref = null;
        RuntimeException var3_ref2 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3 = this;
            synchronized (var3) {
              L1: {
                if (!si.field_U) {
                  L2: {
                    if (param1 == -238) {
                      break L2;
                    } else {
                      field_k = null;
                      break L2;
                    }
                  }
                  si.field_U = true;
                  break L1;
                } else {
                  return;
                }
              }
            }
            L3: {
              if (bd.field_b != null) {
                bd.field_b.destroy();
                break L3;
              } else {
                break L3;
              }
            }
            try {
              L4: {
                ((tn) this).b(-90);
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
              if (ec.field_u != null) {
                try {
                  L7: {
                    ec.field_u.removeFocusListener((java.awt.event.FocusListener) this);
                    ec.field_u.getParent().remove((java.awt.Component) (Object) ec.field_u);
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
              if (null == mc.field_k) {
                break L9;
              } else {
                try {
                  L10: {
                    mc.field_k.a(-1204);
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
              ((tn) this).c(23118);
              if (eg.field_j != null) {
                try {
                  L13: {
                    System.exit(0);
                    break L13;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L14: {
                    var3_ref = decompiledCaughtException;
                    break L14;
                  }
                }
                break L12;
              } else {
                break L12;
              }
            }
            System.out.println("Shutdown complete - clean:" + param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3_ref2, "tn.SA(" + param0 + 44 + param1 + 41);
        }
    }

    final synchronized void a(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ec.field_u == null) {
                break L1;
              } else {
                ec.field_u.removeFocusListener((java.awt.event.FocusListener) this);
                ec.field_u.getParent().setBackground(java.awt.Color.black);
                ec.field_u.getParent().remove((java.awt.Component) (Object) ec.field_u);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null != eg.field_i) {
                  break L3;
                } else {
                  L4: {
                    if (null == eg.field_j) {
                      break L4;
                    } else {
                      var2 = (Object) (Object) eg.field_j;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (bd.field_b != null) {
                      break L5;
                    } else {
                      var2 = (Object) (Object) ne.field_I;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = (Object) (Object) bd.field_b;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = (Object) (Object) eg.field_i;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
                ec.field_u = (java.awt.Canvas) (Object) new hk((java.awt.Component) this);
                java.awt.Component discarded$6 = ((java.awt.Container) var2).add((java.awt.Component) (Object) ec.field_u);
                ec.field_u.setSize(uo.field_i, wp.field_c);
                ec.field_u.setVisible(true);
                if (var2 != (Object) (Object) eg.field_j) {
                  break L7;
                } else {
                  var3 = eg.field_j.getInsets();
                  ec.field_u.setLocation(ae.field_a + var3.left, var3.top - -mc.field_m);
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ec.field_u.setLocation(ae.field_a, mc.field_m);
              break L6;
            }
            ec.field_u.addFocusListener((java.awt.event.FocusListener) this);
            ec.field_u.requestFocus();
            kn.field_K = true;
            ro.field_d = true;
            if (param0 == -27106) {
              sn.field_s = true;
              wl.field_i = false;
              um.field_m = hm.a(64);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw aa.a((Throwable) var2, "tn.VA(" + param0 + 41);
        }
    }

    abstract void b(int param0);

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) ne.field_I != this) {
                break L1;
              } else {
                if (!si.field_U) {
                  bf.field_m = 4000L + hm.a(64);
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
          throw aa.a((Throwable) (Object) runtimeException, "tn.stop()");
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    final boolean c(byte param0) {
        return true;
    }

    abstract void a(byte param0);

    abstract void c(int param0);

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (null == eg.field_j) {
          L0: {
            if (bd.field_b == null) {
              break L0;
            } else {
              if (this == (Object) (Object) bd.field_b) {
                break L0;
              } else {
                return bd.field_b.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        } else {
          return null;
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
            kn.field_K = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("tn.focusLost(");
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
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    abstract void a(boolean param0);

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
            if (eg.field_j == null) {
              L1: {
                if (bd.field_b == null) {
                  break L1;
                } else {
                  if (this == (Object) (Object) bd.field_b) {
                    break L1;
                  } else {
                    stackOut_7_0 = bd.field_b.getParameter(param0);
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
            stackOut_11_1 = new StringBuilder().append("tn.getParameter(");
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
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_10_0;
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
            if (eg.field_j == null) {
              L1: {
                if (bd.field_b == null) {
                  break L1;
                } else {
                  if (this == (Object) (Object) bd.field_b) {
                    break L1;
                  } else {
                    stackOut_7_0 = bd.field_b.getAppletContext();
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
          throw aa.a((Throwable) (Object) var1, "tn.getAppletContext()");
        }
        return stackIn_10_0;
    }

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        try {
            field_f = null;
            field_d = null;
            field_m = null;
            field_n = null;
            field_k = null;
            field_j = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "tn.TA(" + param0 + 41);
        }
    }

    final static java.awt.Container b(byte param0) {
        RuntimeException var1 = null;
        java.awt.Frame stackIn_4_0 = null;
        java.applet.Applet stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Frame stackOut_3_0 = null;
        java.applet.Applet stackOut_8_0 = null;
        try {
          L0: {
            if (eg.field_j != null) {
              stackOut_3_0 = eg.field_j;
              stackIn_4_0 = stackOut_3_0;
              return (java.awt.Container) (Object) stackIn_4_0;
            } else {
              L1: {
                if (param0 > 41) {
                  break L1;
                } else {
                  tn.b(false);
                  break L1;
                }
              }
              stackOut_8_0 = ao.a(13867);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "tn.NA(" + param0 + 41);
        }
        return (java.awt.Container) (Object) stackIn_9_0;
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
            bd.field_b = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("tn.provideLoaderApplet(");
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
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    protected tn() {
        ((tn) this).field_c = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_n = new String[]{"Pixel Artist", "Pixel Master", "Pixel Legend", "Pixel Perfect", "The Difficult", "The Very Difficult", "The Impossible", "Take Your Time", "Excellence", "Brilliance", "Perfection", "Relentless", "Pixel Player", "Pixel Addict", "Elementary", "Puzzling", "Diligence", "Relentless 2", "Negative", "Backwards", "Straightforward", "Timewaster"};
        field_k = new String[]{"Your target picture always appears on the left. There are five pictures per level and each level is played on a different type of grid.", "The background <col=FF9900>skin</col> changes as you play - try not to lose your concentration!"};
        field_f = "Puzzles";
        field_j = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_d = "Visit the Account Management section on the main site to view.";
    }
}
