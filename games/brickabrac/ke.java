/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.net.URL;
import java.applet.AppletContext;

public abstract class ke extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static mh field_e;
    static String field_k;
    boolean field_d;
    private static Calendar field_n;
    static int[] field_m;
    static String field_b;
    static String field_f;
    public static int field_l;
    public static int field_j;
    public static boolean field_i;
    public static int field_a;
    public static boolean field_g;
    public static int field_h;
    public static int field_c;

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    abstract void f(int param0);

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
            if (null == cb.field_o) {
              L1: {
                if (null == sl.field_x) {
                  break L1;
                } else {
                  if ((Object) (Object) sl.field_x == this) {
                    break L1;
                  } else {
                    stackOut_7_0 = sl.field_x.getDocumentBase();
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
          throw qb.a((Throwable) (Object) var1, "ke.getDocumentBase()");
        }
        return stackIn_10_0;
    }

    private final void c(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Object var6 = null;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = ue.a(false);
              if (param0 == 26573) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            L2: {
              var4 = sm.field_c[cq.field_t];
              sm.field_c[cq.field_t] = var2_long;
              cq.field_t = 31 & 1 + cq.field_t;
              if (0L == var4) {
                break L2;
              } else {
                if (~var4 > ~var2_long) {
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            var6 = this;
            synchronized (var6) {
              L3: {
                qa.field_r = no.field_r;
                break L3;
              }
            }
            ((ke) this).f(-107);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw qb.a((Throwable) (Object) runtimeException, "ke.S(" + param0 + 41);
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (null != cb.field_o) {
          return null;
        } else {
          L0: {
            if (null == sl.field_x) {
              break L0;
            } else {
              if ((Object) (Object) sl.field_x == this) {
                break L0;
              } else {
                return sl.field_x.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        }
    }

    final boolean e(int param0) {
        return true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            int var8_int = 0;
            ql var9 = null;
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
            var10 = BrickABrac.field_J ? 1 : 0;
            try {
              try {
                L0: {
                  if (so.field_f != null) {
                    sp.field_l = sp.field_l + 1;
                    if (sp.field_l < 3) {
                      ((ke) this).getAppletContext().showDocument(((ke) this).getDocumentBase(), "_self");
                      return;
                    } else {
                      ((ke) this).a("alreadyloaded", 4000);
                      return;
                    }
                  } else {
                    to.field_b = param3;
                    u.field_d = param3;
                    so.field_f = (ke) this;
                    to.field_i = 0;
                    var8_int = 88 / ((param1 - 24) / 56);
                    hk.field_W = 0;
                    oj.field_m = param4;
                    be.field_g = param2;
                    mc.field_d = param2;
                    mk.field_i = uc.e((byte) -64);
                    tg dupTemp$1 = new tg(param0, param5, param6, true);
                    lp.field_ub = dupTemp$1;
                    mq.field_e = dupTemp$1;
                    var9 = lp.field_ub.a(1, (Runnable) this, (byte) -124);
                    L1: while (true) {
                      L2: {
                        L3: {
                          if (var9.field_f != 0) {
                            break L3;
                          } else {
                            wj.a(-125, 10L);
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
                  rk.a((String) null, var8, 52);
                  ((ke) this).a("crash", 4000);
                  break L4;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_18_0 = (RuntimeException) var8_ref;
                stackOut_18_1 = new StringBuilder().append("ke.N(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
                stackIn_21_0 = stackOut_18_0;
                stackIn_21_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param5 == null) {
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
              throw qb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param6 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
            if (cb.field_o == null) {
              L1: {
                if (sl.field_x == null) {
                  break L1;
                } else {
                  if (this != (Object) (Object) sl.field_x) {
                    stackOut_9_0 = sl.field_x.getAppletContext();
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
          throw qb.a((Throwable) (Object) var1, "ke.getAppletContext()");
        }
        return stackIn_12_0;
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
          throw qb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static void a(int[] param0, byte param1, fo param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              vi.a(-122, param0, 5, param2);
              if (param1 == 39) {
                break L1;
              } else {
                byte[] discarded$3 = ke.a(false, (byte[]) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ke.U(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
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
              if ((Object) (Object) so.field_f != this) {
                break L1;
              } else {
                if (ai.field_s) {
                  break L1;
                } else {
                  L2: {
                    qc.field_i = true;
                    if (!tf.field_h) {
                      break L2;
                    } else {
                      if (-er.field_c + ue.a(false) > 1000L) {
                        L3: {
                          var2_ref = param0.getClipBounds();
                          if (var2_ref == null) {
                            break L3;
                          } else {
                            if (~var2_ref.width > ~u.field_d) {
                              break L2;
                            } else {
                              if (mc.field_d <= var2_ref.height) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        tn.field_A = true;
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
            stackOut_24_1 = new StringBuilder().append("ke.paint(");
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
          throw qb.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
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
            var5 = BrickABrac.field_J ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (null == tg.field_g) {
                              break L5;
                            } else {
                              L6: {
                                var1 = (Object) (Object) tg.field_g.toLowerCase();
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
                                  var2 = tg.field_o;
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
                                ((ke) this).a("wrongjava", 4000);
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
                                      stackOut_47_0 = eh.a(var2.charAt(var3), (byte) 86);
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
                                  if (!dc.a((CharSequence) (Object) var4, -102)) {
                                    break L5;
                                  } else {
                                    if (fl.a((CharSequence) (Object) var4, -28734) < 10) {
                                      ((ke) this).a("wrongjava", 4000);
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
                            }
                          }
                          if (tg.field_o == null) {
                            break L3;
                          } else {
                            stackOut_64_0 = tg.field_o.startsWith("1.");
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
                                if (~var1_int <= ~tg.field_o.length()) {
                                  break L13;
                                } else {
                                  var3 = tg.field_o.charAt(var1_int);
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
                                      if (var3 > 57) {
                                        break L13;
                                      } else {
                                        var1_int++;
                                        var2_int = var2_int * 10 - -var3 + -48;
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
                            if (stackIn_79_0 >= stackIn_79_1) {
                              tf.field_h = true;
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
                        var1 = (Object) (Object) so.field_f;
                        if (sl.field_x != null) {
                          var1 = (Object) (Object) sl.field_x;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        var2_ref = tg.field_x;
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
                      sh.b(1);
                      ((ke) this).c(false);
                      kc.field_q = jm.a((java.awt.Component) (Object) kj.field_D, to.field_b, -2414, be.field_g);
                      ((ke) this).b(false);
                      re.field_b = ja.a((byte) 123);
                      L18: while (true) {
                        L19: {
                          L20: {
                            if (0L == jg.field_k) {
                              break L20;
                            } else {
                              stackOut_92_0 = (jg.field_k < ue.a(false) ? -1 : (jg.field_k == ue.a(false) ? 0 : 1));
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
                          c.field_a = re.field_b.a(hb.field_x, (byte) -71);
                          stackOut_96_0 = 0;
                          stackIn_98_0 = stackOut_96_0;
                          break L19;
                        }
                        var3 = stackIn_98_0;
                        L21: while (true) {
                          L22: {
                            L23: {
                              if (c.field_a <= var3) {
                                break L23;
                              } else {
                                this.c(26573);
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
                            this.h(0);
                            kq.a(-4317, lp.field_ub, (Object) (Object) kj.field_D);
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
                    rk.a((String) null, (Throwable) var1, 77);
                    ((ke) this).a("crash", 4000);
                    break L24;
                  }
                }
                this.a(true, -93);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw qb.a((Throwable) var1, "ke.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void h(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = ue.a(false);
              var4 = ig.field_M[de.field_w];
              ig.field_M[de.field_w] = var2_long;
              de.field_w = 31 & 1 + de.field_w;
              if ((long)param0 == var4) {
                break L1;
              } else {
                if (var2_long <= var4) {
                  break L1;
                } else {
                  var6_int = (int)(var2_long + -var4);
                  d.field_H = (32000 - -(var6_int >> 1)) / var6_int;
                  break L1;
                }
              }
            }
            L2: {
              int fieldTemp$2 = gk.field_a;
              gk.field_a = gk.field_a + 1;
              if (50 >= fieldTemp$2) {
                break L2;
              } else {
                L3: {
                  qc.field_i = true;
                  gk.field_a = gk.field_a - 50;
                  kj.field_D.setSize(to.field_b, be.field_g);
                  kj.field_D.setVisible(true);
                  if (null == cb.field_o) {
                    break L3;
                  } else {
                    if (null != fd.field_e) {
                      break L3;
                    } else {
                      var6 = cb.field_o.getInsets();
                      kj.field_D.setLocation(var6.left + to.field_i, var6.top + hk.field_W);
                      if (!BrickABrac.field_J) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                kj.field_D.setLocation(to.field_i, hk.field_W);
                break L2;
              }
            }
            ((ke) this).g(param0 + 102);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qb.a((Throwable) (Object) runtimeException, "ke.W(" + param0 + 41);
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
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
            no.field_r = true;
            qc.field_i = true;
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
          throw qb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) so.field_f != this) {
                break L1;
              } else {
                if (!ai.field_s) {
                  jg.field_k = ue.a(false) + 4000L;
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
          throw qb.a((Throwable) (Object) runtimeException, "ke.stop()");
        }
    }

    public static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_m = null;
              if (param0 == 19254) {
                break L1;
              } else {
                ke.a((int[]) null, (byte) -57, (fo) null);
                break L1;
              }
            }
            field_b = null;
            field_f = null;
            field_n = null;
            field_k = null;
            field_e = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "ke.O(" + param0 + 41);
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    private final void a(boolean param0, int param1) {
        Exception exception = null;
        Exception var4_ref = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        int var3_int = 0;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3 = this;
            synchronized (var3) {
              L1: {
                if (ai.field_s) {
                  return;
                } else {
                  ai.field_s = true;
                  break L1;
                }
              }
            }
            L2: {
              if (null != sl.field_x) {
                sl.field_x.destroy();
                break L2;
              } else {
                break L2;
              }
            }
            try {
              L3: {
                ((ke) this).a(false);
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
              var3_int = -40 % ((-22 - param1) / 54);
              if (kj.field_D == null) {
                break L5;
              } else {
                try {
                  L6: {
                    kj.field_D.removeFocusListener((java.awt.event.FocusListener) this);
                    kj.field_D.getParent().remove((java.awt.Component) (Object) kj.field_D);
                    break L6;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L7: {
                    var4_ref = (Exception) (Object) decompiledCaughtException;
                    break L7;
                  }
                }
                break L5;
              }
            }
            L8: {
              if (lp.field_ub == null) {
                break L8;
              } else {
                try {
                  L9: {
                    lp.field_ub.a(true);
                    break L9;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L10: {
                    var4_ref = (Exception) (Object) decompiledCaughtException;
                    break L10;
                  }
                }
                break L8;
              }
            }
            L11: {
              ((ke) this).d(true);
              if (null != cb.field_o) {
                try {
                  L12: {
                    System.exit(0);
                    break L12;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L13: {
                    var4 = decompiledCaughtException;
                    break L13;
                  }
                }
                break L11;
              } else {
                break L11;
              }
            }
            System.out.println("Shutdown complete - clean:" + param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw qb.a((Throwable) (Object) runtimeException, "ke.BA(" + param0 + 44 + param1 + 41);
        }
    }

    final synchronized void c(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (kj.field_D != null) {
                kj.field_D.removeFocusListener((java.awt.event.FocusListener) this);
                kj.field_D.getParent().setBackground(java.awt.Color.black);
                kj.field_D.getParent().remove((java.awt.Component) (Object) kj.field_D);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (fd.field_e != null) {
                  break L3;
                } else {
                  L4: {
                    if (null == cb.field_o) {
                      break L4;
                    } else {
                      var2 = (Object) (Object) cb.field_o;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (null != sl.field_x) {
                      break L5;
                    } else {
                      var2 = (Object) (Object) so.field_f;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = (Object) (Object) sl.field_x;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = (Object) (Object) fd.field_e;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
                kj.field_D = (java.awt.Canvas) (Object) new od((java.awt.Component) this);
                java.awt.Component discarded$6 = ((java.awt.Container) var2).add((java.awt.Component) (Object) kj.field_D);
                kj.field_D.setSize(to.field_b, be.field_g);
                kj.field_D.setVisible(true);
                if ((Object) (Object) cb.field_o != var2) {
                  break L7;
                } else {
                  var3 = cb.field_o.getInsets();
                  kj.field_D.setLocation(var3.left - -to.field_i, var3.top - -hk.field_W);
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              kj.field_D.setLocation(to.field_i, hk.field_W);
              break L6;
            }
            kj.field_D.addFocusListener((java.awt.event.FocusListener) this);
            kj.field_D.requestFocus();
            no.field_r = true;
            qa.field_r = true;
            qc.field_i = true;
            tn.field_A = param0;
            er.field_c = ue.a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw qb.a((Throwable) var2, "ke.DA(" + param0 + 41);
        }
    }

    final static byte[] a(boolean param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
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
              if (!param0) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            var2_int = param1.length;
            var3 = new byte[var2_int];
            pm.a(param1, 0, var3, 0, var2_int);
            stackOut_3_0 = (byte[]) var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ke.R(").append(param0).append(44);
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_4_0;
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
            no.field_r = false;
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
          throw qb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void a(String param0, int param1) {
        try {
            Throwable throwable = null;
            Exception exception = null;
            RuntimeException runtimeException = null;
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
                if (((ke) this).field_d) {
                  return;
                } else {
                  ((ke) this).field_d = true;
                  System.out.println("error_game_" + param0);
                  try {
                    L1: {
                      Object discarded$3 = ne.a("loggedout", -123, uc.e((byte) -124));
                      break L1;
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L2: {
                      throwable = decompiledCaughtException;
                      break L2;
                    }
                  }
                  try {
                    L3: {
                      ((ke) this).getAppletContext().showDocument(new java.net.URL(((ke) this).getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      exception = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  L5: {
                    if (param1 == 4000) {
                      break L5;
                    } else {
                      field_k = null;
                      break L5;
                    }
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L6: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_14_0 = (RuntimeException) runtimeException;
                stackOut_14_1 = new StringBuilder().append("ke.CA(");
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
              throw qb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void b(boolean param0);

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) so.field_f) {
                break L1;
              } else {
                if (ai.field_s) {
                  break L1;
                } else {
                  jg.field_k = ue.a(false);
                  wj.a(-127, 5000L);
                  mq.field_e = null;
                  this.a(false, 46);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qb.a((Throwable) (Object) runtimeException, "ke.destroy()");
        }
    }

    abstract void a(boolean param0);

    abstract void d(boolean param0);

    final static String a(byte param0, long param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              field_n.setTime(new Date(param1));
              var3_int = field_n.get(7);
              var4 = field_n.get(5);
              var5 = field_n.get(2);
              var6 = field_n.get(1);
              var7 = field_n.get(11);
              if (param0 == -75) {
                break L1;
              } else {
                ke.a((int[]) null, (byte) -75, (fo) null);
                break L1;
              }
            }
            var8 = field_n.get(12);
            var9 = field_n.get(13);
            stackOut_3_0 = ip.field_u[-1 + var3_int] + ", " + var4 / 10 + var4 % 10 + "-" + ek.field_eb[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3, "ke.P(" + param0 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    abstract void g(int param0);

    public final void windowOpened(java.awt.event.WindowEvent param0) {
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
            sl.field_x = param0;
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
          throw qb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) so.field_f != this) {
                break L1;
              } else {
                if (!ai.field_s) {
                  jg.field_k = 0L;
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
          throw qb.a((Throwable) (Object) runtimeException, "ke.start()");
        }
    }

    public abstract void init();

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
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
            if (cb.field_o != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String) (Object) stackIn_4_0;
            } else {
              L1: {
                if (null == sl.field_x) {
                  break L1;
                } else {
                  if (this == (Object) (Object) sl.field_x) {
                    break L1;
                  } else {
                    stackOut_9_0 = sl.field_x.getParameter(param0);
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
          throw qb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_12_0;
    }

    protected ke() {
        ((ke) this).field_d = false;
    }

    final static void a(int param0, sp param1, int param2) {
        RuntimeException var3 = null;
        pi var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_ref = k.field_h;
              var3_ref.e(param2 ^ -3818, param0);
              var3_ref.field_l = var3_ref.field_l + 1;
              var4 = var3_ref.field_l;
              var3_ref.a(106, 1);
              var3_ref.b((byte) 116, param1.field_m);
              var3_ref.b((byte) 112, param1.field_o);
              var3_ref.b((byte) 127, param1.field_q);
              var3_ref.a(param1.field_k, (byte) -79);
              var3_ref.a(param1.field_n, (byte) -79);
              var3_ref.a(param1.field_r, (byte) -79);
              if (param2 == 14989) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            var3_ref.a(param1.field_j, (byte) -79);
            var3_ref.a(-28, param1.field_i.length);
            var5 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var5 >= param1.field_i.length) {
                    break L4;
                  } else {
                    var3_ref.a(param1.field_i[var5], (byte) -79);
                    var5++;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                int discarded$1 = var3_ref.d(3, var4);
                var3_ref.d((byte) 113, var3_ref.field_l + -var4);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("ke.Q(").append(param0).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
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
          throw qb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_n = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_m = new int[128];
        field_b = null;
        field_f = "Shrink: makes your paddle shorter.";
    }
}
