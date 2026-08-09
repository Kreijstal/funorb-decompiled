/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class ac extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static java.applet.Applet field_c;
    static sb field_k;
    static sb field_n;
    boolean field_g;
    static ba field_h;
    static char[] field_i;
    static volatile int field_e;
    public static int field_m;
    public static boolean field_b;
    public static boolean field_j;
    public static boolean field_a;
    public static boolean field_l;
    public static boolean field_d;
    public static boolean field_f;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, String param6) {
        try {
            ej dupTemp$0 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            int var8_int = 0;
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            re var9 = null;
            int var10 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var10 = stellarshard.field_B;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var8_int = -5 / ((-44 - param4) / 51);
                            if (bc.field_j != null) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            aj.field_b = aj.field_b + 1;
                            if (3 > aj.field_b) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            this.a(1, "alreadyloaded");
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return;
                    }
                    case 7: {
                        try {
                            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return;
                    }
                    case 9: {
                        try {
                            lg.field_d = param3;
                            td.field_d = param2;
                            dd.field_d = param2;
                            bc.field_j = (ac) (this);
                            df.field_c = 0;
                            fb.field_f = 0;
                            lk.field_j = param5;
                            kg.field_H = param5;
                            tc.field_u = hf.a((byte) -96);
                            dupTemp$0 = new ej(param0, param6, param1, true);
                            ic.field_d = dupTemp$0;
                            fb.field_d = dupTemp$0;
                            var9 = ic.field_d.a((Runnable) (this), 1, 0);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (-1 != (var9.field_f ^ -1)) {
                                statePc = 15;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            jj.a((byte) -127, 10L);
                            if (var10 != 0) {
                                statePc = 23;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (var10 == 0) {
                                statePc = 10;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var8 = caughtException;
                            qe.a(-25, (String) null, var8);
                            this.a(1, "crash");
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var8_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_21_0 = (RuntimeException) (var8_ref);
                        stackIn_19_0 = stackIn_21_0;
                        stackIn_21_1 = new StringBuilder().append("ac.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                        stackIn_19_1 = stackIn_21_1;
                        if (param6 == null) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        stackIn_22_0 = (RuntimeException) ((Object) stackIn_19_0);
                        stackIn_22_1 = (StringBuilder) ((Object) stackIn_19_1);
                        stackIn_22_2 = "{...}";
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 21: {
                        stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                        stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                        stackIn_22_2 = "null";
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        throw ma.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
                    }
                    case 23: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        java.applet.AppletContext stackIn_14_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ah.field_q != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null == field_c) {
                  break L1;
                } else {
                  if (field_c != this) {
                    stackIn_12_0 = field_c.getAppletContext();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_14_0 = super.getAppletContext();
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "ac.getAppletContext()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.applet.AppletContext) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final void a(int param0, String param1) {
        try {
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              L0: {
                if (this.field_g) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L1: {
                    if (param0 == 1) {
                      break L1;
                    } else {
                      field_i = (char[]) null;
                      break L1;
                    }
                  }
                  this.field_g = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L2: {
                      sh.a("loggedout", hf.a((byte) -7), (byte) 78);
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
                      this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3_ref = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L6: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_17_0 = (RuntimeException) (var3_ref2);

                stackIn_17_1 = new StringBuilder().append("ac.MA(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L6;
                } else {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L6;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 >= -25) {
            return;
        }
        try {
            field_n = null;
            field_i = null;
            field_h = null;
            field_c = null;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ac.HA(" + param0 + ')');
        }
    }

    abstract void a(boolean param0);

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == ah.field_q) {
              L1: {
                if (null == field_c) {
                  break L1;
                } else {
                  if (this != field_c) {
                    stackIn_10_0 = field_c.getParameter(param0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_12_0 = super.getParameter(param0);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("ac.getParameter(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
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

            stackIn_5_1 = new StringBuilder().append("ac.windowClosing(");

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
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

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
            field_c = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ac.provideLoaderApplet(");

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
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void start() {
        if (bc.field_j != this || qc.field_b) {
            return;
        }
        try {
            gk.field_h = 0L;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ac.start()");
        }
    }

    abstract void c(byte param0);

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

            stackIn_5_1 = new StringBuilder().append("ac.update(");

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
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final static int[] d(byte param0) {
        RuntimeException var1 = null;
        int[] stackIn_2_0 = null;
        int[] stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 116) {
              stackIn_4_0 = new int[8];
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (int[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "ac.RA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (ah.field_q != null) {
          return null;
        } else {
          L0: {
            if (null == field_c) {
              break L0;
            } else {
              if (field_c == this) {
                break L0;
              } else {
                return field_c.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        }
    }

    abstract void f(byte param0);

    public abstract void init();

    protected ac() {
        this.field_g = false;
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          L0: {
            L1: {
              var2_long = ih.a((byte) -98);
              var4 = ce.field_c[qi.field_b];
              ce.field_c[qi.field_b] = var2_long;
              if ((var4 ^ -1L) == -1L) {
                break L1;
              } else {
                if (var4 >= var2_long) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            qi.field_b = 1 + qi.field_b & 31;
            var6 = this;
            synchronized (var6) {
              L2: {
                L3: {
                  ua.field_b = lh.field_f;
                  if (param0 < -102) {
                    break L3;
                  } else {
                    this.a((byte) 48);
                    break L3;
                  }
                }
                break L2;
              }
            }
            this.a(48);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ma.a((Throwable) ((Object) runtimeException), "ac.JA(" + param0 + ')');
        }
    }

    public final void run() {
        try {
            boolean stackIn_46_0 = false;
            boolean stackIn_64_0 = false;
            int stackIn_69_0 = 0;
            int stackIn_69_1 = 0;
            int stackIn_77_0 = 0;
            int stackIn_77_1 = 0;
            int stackIn_91_0 = 0;
            int stackIn_96_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            Object var1 = null;
            int var1_int = 0;
            String var2 = null;
            int var2_int = 0;
            java.lang.reflect.Method var2_ref = null;
            int var3 = 0;
            Throwable var3_ref_Throwable = null;
            String var4 = null;
            int var5 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = stellarshard.field_B;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (ej.field_g == null) {
                                statePc = 59;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var1 = ej.field_g.toLowerCase();
                            if (((String) (var1)).indexOf("sun") != -1) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (((String) (var1)).indexOf("apple") == -1) {
                                statePc = 59;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var2 = ej.field_r;
                            if (var2.equals("1.1")) {
                                statePc = 37;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var2.startsWith("1.1.")) {
                                statePc = 37;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (var2.equals("1.2")) {
                                statePc = 37;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var2.startsWith("1.2.")) {
                                statePc = 37;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var2.equals("1.3")) {
                                statePc = 37;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var2.startsWith("1.3.")) {
                                statePc = 37;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var2.equals("1.4")) {
                                statePc = 37;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var2.startsWith("1.4.")) {
                                statePc = 37;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var2.equals("1.5")) {
                                statePc = 37;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var2.startsWith("1.5.")) {
                                statePc = 37;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (!var2.equals("1.6.0")) {
                                statePc = 40;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            this.a(1, "wrongjava");
                            if (var5 == 0) {
                                statePc = 104;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (!var2.startsWith("1.6.0_")) {
                                statePc = 59;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var3 = 6;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var3 >= var2.length()) {
                                statePc = 52;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            stackIn_64_0 = bh.a(-1, var2.charAt(var3));
                            stackIn_46_0 = stackIn_64_0;
                            if (var5 != 0) {
                                statePc = 64;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (!stackIn_46_0) {
                                statePc = 52;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var3++;
                            if (var5 == 0) {
                                statePc = 44;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var4 = var2.substring(6, var3);
                            if (!rg.a((byte) 19, (CharSequence) ((Object) var4))) {
                                statePc = 59;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (10 > pf.a((CharSequence) ((Object) var4), (byte) 125)) {
                                statePc = 58;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            this.a(1, "wrongjava");
                            if (var5 == 0) {
                                statePc = 104;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (ej.field_r == null) {
                                statePc = 80;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            stackIn_64_0 = ej.field_r.startsWith("1.");
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (stackIn_64_0) {
                                statePc = 66;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var1_int = 2;
                            var2_int = 0;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (ej.field_r.length() <= var1_int) {
                                statePc = 76;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var3 = ej.field_r.charAt(var1_int);
                            stackIn_77_0 = var3 ^ -1;
                            stackIn_69_0 = stackIn_77_0;
                            stackIn_77_1 = -49;
                            stackIn_69_1 = stackIn_77_1;
                            if (var5 != 0) {
                                statePc = 77;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (stackIn_69_0 > stackIn_69_1) {
                                statePc = 76;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (var3 > 57) {
                                statePc = 76;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            var2_int = -48 - (-var3 - 10 * var2_int);
                            var1_int++;
                            if (var5 == 0) {
                                statePc = 67;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            stackIn_77_0 = var2_int;
                            stackIn_77_1 = 5;
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (stackIn_77_0 >= stackIn_77_1) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            wl.field_ab = true;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var1 = bc.field_j;
                            if (null == field_c) {
                                statePc = 82;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var1 = field_c;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            var2_ref = ej.field_w;
                            if (null != var2_ref) {
                                statePc = 85;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 87;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var3_ref_Throwable = caughtException;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            k.a(3);
                            this.c(31178);
                            pd.field_h = cg.a((java.awt.Component) ((Object) qd.field_j), false, lk.field_j, td.field_d);
                            this.a(true);
                            rb.field_u = qb.f(-17887);
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if (gk.field_h == 0L) {
                                statePc = 94;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            stackIn_96_0 = (ih.a((byte) -98) < gk.field_h ? -1 : (ih.a((byte) -98) == gk.field_h ? 0 : 1));
                            stackIn_91_0 = stackIn_96_0;
                            if (var5 != 0) {
                                statePc = 96;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            if (stackIn_91_0 >= 0) {
                                statePc = 104;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            ol.field_c = rb.field_u.a(ph.field_B, 1);
                            stackIn_96_0 = 0;
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            var3 = stackIn_96_0;
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            if (ol.field_c <= var3) {
                                statePc = 102;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            this.a((byte) -128);
                            var3++;
                            if (var5 != 0) {
                                statePc = 103;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            if (var5 == 0) {
                                statePc = 97;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            this.e((byte) 56);
                            ni.a(ic.field_d, qd.field_j, -127);
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            if (var5 == 0) {
                                statePc = 89;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            var1 = caughtException;
                            qe.a(36, (String) null, (Throwable) (var1));
                            this.a(1, "crash");
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            this.a(-1, true);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        var1 = caughtException;
                        throw ma.a((Throwable) (var1), "ac.run()");
                    }
                    case 109: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean b(byte param0) {
        RuntimeException var1 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 107) {
                break L1;
              } else {
                ac.b(-49);
                break L1;
              }
            }
            L2: {
              L3: {
                if (ja.field_m == null) {
                  break L3;
                } else {
                  if (!ja.field_m.d(2)) {
                    break L3;
                  } else {
                    stackIn_10_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "ac.SA(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final synchronized void c(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (qd.field_j != null) {
                qd.field_j.removeFocusListener((java.awt.event.FocusListener) (this));
                qd.field_j.getParent().setBackground(java.awt.Color.black);
                qd.field_j.getParent().remove((java.awt.Component) ((Object) qd.field_j));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (la.field_L == null) {
                  break L3;
                } else {
                  var2 = la.field_L;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (ah.field_q != null) {
                  break L4;
                } else {
                  L5: {
                    if (null != field_c) {
                      break L5;
                    } else {
                      var2 = bc.field_j;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = field_c;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var2 = ah.field_q;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
                qd.field_j = (java.awt.Canvas) ((Object) new hi((java.awt.Component) (this)));
                ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) qd.field_j));
                qd.field_j.setSize(lk.field_j, td.field_d);
                qd.field_j.setVisible(true);
                if (ah.field_q != var2) {
                  break L7;
                } else {
                  var3 = ah.field_q.getInsets();
                  qd.field_j.setLocation(fb.field_f + var3.left, df.field_c + var3.top);
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              qd.field_j.setLocation(fb.field_f, df.field_c);
              break L6;
            }
            qd.field_j.addFocusListener((java.awt.event.FocusListener) (this));
            qd.field_j.requestFocus();
            lh.field_f = true;
            ua.field_b = true;
            of.field_F = true;
            if (param0 == 31178) {
              tl.field_d = false;
              kk.field_m = ih.a((byte) -98);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (var2), "ac.KA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    private final void a(int param0, boolean param1) {
        Exception exception = null;
        Throwable throwable = null;
        Object var3 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        RuntimeException var3_ref2 = null;
        try {
          L0: {
            var3_ref = this;
            synchronized (var3_ref) {
              L1: {
                if (!qc.field_b) {
                  qc.field_b = true;
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (field_c != null) {
                field_c.destroy();
                break L2;
              } else {
                break L2;
              }
            }
            if (param0 == -1) {
              try {
                L3: {
                  this.f((byte) 100);
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
                if (null != qd.field_j) {
                  try {
                    L6: {
                      qd.field_j.removeFocusListener((java.awt.event.FocusListener) (this));
                      qd.field_j.getParent().remove((java.awt.Component) ((Object) qd.field_j));
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
                if (ic.field_d == null) {
                  break L8;
                } else {
                  try {
                    L9: {
                      ic.field_d.c(param0 ^ -1);
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
                }
              }
              L11: {
                this.c((byte) -128);
                if (null == ah.field_q) {
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3_ref2), "ac.OA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    abstract void d(int param0);

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
            lh.field_f = true;
            of.field_F = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ac.focusGained(");

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
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (this != bc.field_j) {
                break L1;
              } else {
                if (!qc.field_b) {
                  L2: {
                    of.field_F = true;
                    if (!wl.field_ab) {
                      break L2;
                    } else {
                      if (ih.a((byte) -98) + -kk.field_m > 1000L) {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (var2 == null) {
                            break L3;
                          } else {
                            if ((var2.width ^ -1) > (kg.field_H ^ -1)) {
                              break L2;
                            } else {
                              if (var2.height >= dd.field_d) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        tl.field_d = true;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
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
            stackIn_23_0 = (RuntimeException) (var2_ref);

            stackIn_23_1 = new StringBuilder().append("ac.paint(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != ah.field_q) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null == field_c) {
                  break L1;
                } else {
                  if (field_c == this) {
                    break L1;
                  } else {
                    stackIn_10_0 = field_c.getDocumentBase();
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
          throw ma.a((Throwable) ((Object) var1), "ac.getDocumentBase()");
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

    final boolean g(byte param0) {
        return true;
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
            lh.field_f = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ac.focusLost(");

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
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void e(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Insets var6 = null;
        try {
          L0: {
            if (param0 == 56) {
              L1: {
                var2_long = ih.a((byte) -98);
                var4 = vg.field_t[bl.field_b];
                vg.field_t[bl.field_b] = var2_long;
                bl.field_b = bl.field_b - -1 & 31;
                if (var4 == 0L) {
                  break L1;
                } else {
                  if (var2_long > var4) {
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                fieldTemp$1 = ab.field_a;
                ab.field_a = ab.field_a + 1;
                if (fieldTemp$1 > 50) {
                  L3: {
                    L4: {
                      ab.field_a = ab.field_a - 50;
                      of.field_F = true;
                      qd.field_j.setSize(lk.field_j, td.field_d);
                      qd.field_j.setVisible(true);
                      if (null == ah.field_q) {
                        break L4;
                      } else {
                        if (la.field_L == null) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    qd.field_j.setLocation(fb.field_f, df.field_c);
                    if (stellarshard.field_B == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  var6 = ah.field_q.getInsets();
                  qd.field_j.setLocation(var6.left - -fb.field_f, var6.top - -df.field_c);
                  break L2;
                } else {
                  break L2;
                }
              }
              this.d(-20880);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) runtimeException), "ac.PA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != bc.field_j) {
                break L1;
              } else {
                if (qc.field_b) {
                  break L1;
                } else {
                  gk.field_h = ih.a((byte) -98);
                  jj.a((byte) -127, 5000L);
                  fb.field_d = null;
                  this.a(-1, false);
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
          runtimeException = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) runtimeException), "ac.destroy()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void stop() {
        if (bc.field_j != this || qc.field_b) {
            return;
        }
        try {
            gk.field_h = 4000L + ih.a((byte) -98);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ac.stop()");
        }
    }

    abstract void a(int param0);

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    static {
        field_e = 0;
        field_i = new char[128];
    }
}
