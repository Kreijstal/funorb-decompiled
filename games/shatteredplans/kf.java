/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        if (this != ts.field_G || fc.field_a) {
            return;
        }
        try {
            oe.field_a = 0L;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "kf.start()");
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (uf.field_b != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null == hb.field_a) {
                  break L1;
                } else {
                  if (hb.field_a == this) {
                    break L1;
                  } else {
                    stackIn_10_0 = hb.field_a.getAppletContext();
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
          throw r.a((Throwable) ((Object) var1), "kf.getAppletContext()");
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

    public final void stop() {
        if (ts.field_G != this || fc.field_a) {
            return;
        }
        try {
            oe.field_a = pr.a(14274) - -4000L;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "kf.stop()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    abstract void a(int param0);

    abstract void d(int param0);

    final static void e(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "kf.QA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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

            stackIn_5_1 = new StringBuilder().append("kf.update(");

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
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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

            stackIn_5_1 = new StringBuilder().append("kf.windowClosing(");

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
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static String[] a(String param0, byte param1, char param2) {
        int incrementValue$1 = 0;
        String[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        Object stackIn_13_0 = null;
        String[] stackIn_21_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3 = so.a(param0, param2, 90);
            var5 = 0;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var4 ^ -1) <= (var3.length ^ -1)) {
                    break L3;
                  } else {
                    stackIn_10_0 = 0;

                    stackIn_10_1 = var3[var4].trim().length();

                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_10_0 >= stackIn_10_1) {
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
                stackIn_10_0 = -1;
                stackIn_10_1 = var5 ^ -1;
                break L2;
              }
              if (stackIn_10_0 == stackIn_10_1) {
                stackIn_13_0 = null;
                decompiledRegionSelector0 = 0;
                break L0;
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
                        if (-1 <= (var3[var4].trim().length() ^ -1)) {
                          break L7;
                        } else {
                          incrementValue$1 = var5;
                          var5++;
                          var6[incrementValue$1] = var3[var4].trim();
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
                  stackIn_21_0 = (String[]) (var6);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3_ref = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3_ref);

            stackIn_25_1 = new StringBuilder().append("kf.PA(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String[]) ((Object) stackIn_13_0);
        } else {
          return stackIn_21_0;
        }
    }

    protected kf() {
        this.field_e = false;
    }

    public final void run() {
        try {
            boolean stackIn_48_0 = false;
            boolean stackIn_66_0 = false;
            int stackIn_70_0 = 0;
            int stackIn_70_1 = 0;
            int stackIn_78_0 = 0;
            int stackIn_78_1 = 0;
            int stackIn_92_0 = 0;
            int stackIn_97_0 = 0;
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
                        var5 = ShatteredPlansClient.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (qb.field_r == null) {
                                statePc = 61;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var1 = qb.field_r.toLowerCase();
                            if (((String) (var1)).indexOf("sun") != -1) {
                                statePc = 8;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (-1 != ((String) (var1)).indexOf("apple")) {
                                statePc = 8;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var2 = qb.field_i;
                            if (var2.equals("1.1")) {
                                statePc = 39;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (var2.startsWith("1.1.")) {
                                statePc = 39;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (var2.equals("1.2")) {
                                statePc = 39;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var2.startsWith("1.2.")) {
                                statePc = 39;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var2.equals("1.3")) {
                                statePc = 39;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var2.startsWith("1.3.")) {
                                statePc = 39;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var2.equals("1.4")) {
                                statePc = 39;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (var2.startsWith("1.4.")) {
                                statePc = 39;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var2.equals("1.5")) {
                                statePc = 39;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var2.startsWith("1.5.")) {
                                statePc = 39;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (!var2.equals("1.6.0")) {
                                statePc = 42;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            this.a((byte) 9, "wrongjava");
                            if (var5 == 0) {
                                statePc = 105;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (!var2.startsWith("1.6.0_")) {
                                statePc = 61;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var3 = 6;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var3 >= var2.length()) {
                                statePc = 54;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            stackIn_66_0 = dk.a((byte) 63, var2.charAt(var3));
                            stackIn_48_0 = stackIn_66_0;
                            if (var5 != 0) {
                                statePc = 66;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (!stackIn_48_0) {
                                statePc = 54;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var3++;
                            if (var5 == 0) {
                                statePc = 46;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var4 = var2.substring(6, var3);
                            if (!go.a(0, (CharSequence) ((Object) var4))) {
                                statePc = 61;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (-11 >= (ma.a((CharSequence) ((Object) var4), 2) ^ -1)) {
                                statePc = 61;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            this.a((byte) -113, "wrongjava");
                            if (var5 == 0) {
                                statePc = 105;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (null == qb.field_i) {
                                statePc = 81;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackIn_66_0 = qb.field_i.startsWith("1.");
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (!stackIn_66_0) {
                                statePc = 81;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var1_int = 2;
                            var2_int = 0;
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if ((var1_int ^ -1) <= (qb.field_i.length() ^ -1)) {
                                statePc = 77;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var3 = qb.field_i.charAt(var1_int);
                            stackIn_78_0 = 48;
                            stackIn_70_0 = stackIn_78_0;
                            stackIn_78_1 = var3;
                            stackIn_70_1 = stackIn_78_1;
                            if (var5 != 0) {
                                statePc = 78;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (stackIn_70_0 > stackIn_70_1) {
                                statePc = 77;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if ((var3 ^ -1) < -58) {
                                statePc = 77;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var1_int++;
                            var2_int = var2_int * 10 - 48 - -var3;
                            if (var5 == 0) {
                                statePc = 68;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            stackIn_78_0 = 5;
                            stackIn_78_1 = var2_int;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if (stackIn_78_0 > stackIn_78_1) {
                                statePc = 81;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            me.field_a = true;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var1 = ts.field_G;
                            if (hb.field_a != null) {
                                statePc = 84;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var1 = hb.field_a;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var2_ref = qb.field_v;
                            if (null == var2_ref) {
                                statePc = 89;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var3_ref_Throwable = caughtException;
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            dc.d(22943);
                            this.f(0);
                            so.field_q = in.a((java.awt.Component) ((Object) tm.field_i), 16, me.field_e, nn.field_b);
                            this.c(-1);
                            oe.field_d = ij.b(115);
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            if (0L == oe.field_a) {
                                statePc = 95;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            stackIn_97_0 = (oe.field_a < pr.a(14274) ? -1 : (oe.field_a == pr.a(14274) ? 0 : 1));
                            stackIn_92_0 = stackIn_97_0;
                            if (var5 != 0) {
                                statePc = 97;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            if (stackIn_92_0 <= 0) {
                                statePc = 105;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            hp.field_p = oe.field_d.a(vg.field_i, -1);
                            stackIn_97_0 = 0;
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            var3 = stackIn_97_0;
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            if (hp.field_p <= var3) {
                                statePc = 103;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            this.a((byte) -23);
                            var3++;
                            if (var5 != 0) {
                                statePc = 104;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if (var5 == 0) {
                                statePc = 98;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            this.c((byte) 58);
                            ud.a(-22, fa.field_W, tm.field_i);
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            if (var5 == 0) {
                                statePc = 90;
                            } else {
                                statePc = 105;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var1 = caughtException;
                            jq.a(-29901, (Throwable) (var1), (String) null);
                            this.a((byte) -105, "crash");
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            this.a(-78, true);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        var1 = caughtException;
                        throw r.a((Throwable) (var1), "kf.run()");
                    }
                    case 110: {
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

    public static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_f = null;
              field_a = null;
              if (param0 > 113) {
                break L1;
              } else {
                kf.a((String) null, 22, (bc) null, (String) null);
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
          throw r.a((Throwable) ((Object) var1), "kf.UA(" + param0 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != uf.field_b) {
          return null;
        } else {
          L0: {
            if (null == hb.field_a) {
              break L0;
            } else {
              if (this == hb.field_a) {
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 > 83) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_i = 66;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2_int = param0.length;
                        var3 = new int[var2_int];
                        var4 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 >= var2_int) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_11_0 = (int[]) (var3);
                        stackIn_7_0 = stackIn_11_0;
                        if (var5 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_7_0[param0[var4]] = var4;
                        var4++;
                        if (var5 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = (int[]) (var3);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (var2);
                    stackIn_13_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("kf.NA(");
                    stackIn_13_1 = stackIn_15_1;
                    if (param0 == null) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (uf.field_b == null) {
              L1: {
                if (hb.field_a == null) {
                  break L1;
                } else {
                  if (hb.field_a == this) {
                    break L1;
                  } else {
                    stackIn_8_0 = hb.field_a.getParameter(param0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_10_0 = super.getParameter(param0);
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
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("kf.getParameter(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
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
            lq.field_q = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kf.focusLost(");

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
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == uf.field_b) {
              L1: {
                if (null == hb.field_a) {
                  break L1;
                } else {
                  if (hb.field_a == this) {
                    break L1;
                  } else {
                    stackIn_8_0 = hb.field_a.getDocumentBase();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_10_0 = super.getDocumentBase();
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
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "kf.getDocumentBase()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.net.URL) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3, String param4, int param5, int param6) {
        try {
            qb dupTemp$0 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            pb var8 = null;
            Throwable var8_ref = null;
            RuntimeException var8_ref2 = null;
            int var9 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = ShatteredPlansClient.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != ts.field_G) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            js.field_d = js.field_d + 1;
                            if ((js.field_d ^ -1) > -4) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            this.a((byte) -107, "alreadyloaded");
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 19;
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
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return;
                    }
                    case 9: {
                        try {
                            nn.field_b = param2;
                            b.field_u = param2;
                            if (param0 == -50) {
                                statePc = 12;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            field_f = (int[]) null;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            gn.field_B = 0;
                            ts.field_G = (kf) (this);
                            me.field_e = param6;
                            tj.field_h = param6;
                            td.field_G = param5;
                            gs.field_k = 0;
                            ei.field_c = kq.f((byte) 126);
                            dupTemp$0 = new qb(param3, param4, param1, true);
                            fa.field_W = dupTemp$0;
                            jl.field_S = dupTemp$0;
                            var8 = fa.field_W.a(true, 1, (Runnable) (this));
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (0 != var8.field_d) {
                                statePc = 18;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            jb.a((byte) -120, 10L);
                            if (var9 != 0) {
                                statePc = 26;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var9 == 0) {
                                statePc = 13;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var8_ref = caughtException;
                            jq.a(-29901, var8_ref, (String) null);
                            this.a((byte) -95, "crash");
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        var8_ref2 = (RuntimeException) ((Object) caughtException);
                        stackIn_24_0 = (RuntimeException) (var8_ref2);
                        stackIn_22_0 = stackIn_24_0;
                        stackIn_24_1 = new StringBuilder().append("kf.AB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                        stackIn_22_1 = stackIn_24_1;
                        if (param4 == null) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        stackIn_25_0 = (RuntimeException) ((Object) stackIn_22_0);
                        stackIn_25_1 = (StringBuilder) ((Object) stackIn_22_1);
                        stackIn_25_2 = "{...}";
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 24: {
                        stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                        stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                        stackIn_25_2 = "null";
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        throw r.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param5 + ',' + param6 + ')');
                    }
                    case 26: {
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

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (ts.field_G != this) {
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
                      if (-1001L > (pr.a(14274) - nh.field_m ^ -1L)) {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (null == var2) {
                            break L3;
                          } else {
                            if ((var2.width ^ -1) > (tj.field_h ^ -1)) {
                              break L2;
                            } else {
                              if ((var2.height ^ -1) > (b.field_u ^ -1)) {
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
            stackIn_26_0 = (RuntimeException) (var2_ref);

            stackIn_26_1 = new StringBuilder().append("kf.paint(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L4;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
            hb.field_a = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kf.provideLoaderApplet(");

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
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static nk a(String param0, int param1, bc param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        nk stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = -40 / ((-13 - param1) / 47);
            var4_int = param2.a(127, param0);
            var6 = param2.a(var4_int, (byte) 106, param3);
            stackIn_1_0 = lg.a(-78, var6, var4_int, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var4);

            stackIn_5_1 = new StringBuilder().append("kf.SA(");

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
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_14_2 + ')');
        }
        return stackIn_1_0;
    }

    public abstract void init();

    final void a(byte param0, String param1) {
        try {
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            int var3_int = 0;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              L0: {
                if (!this.field_e) {
                  this.field_e = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L1: {
                      ll.a("loggedout", kq.f((byte) 126), (byte) 55);
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
                      this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
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
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_13_0 = (RuntimeException) (var3_ref2);

                stackIn_13_1 = new StringBuilder().append("kf.TA(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L5;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L5;
                }
              }
              throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
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

    abstract void c(int param0);

    final boolean b(byte param0) {
        return true;
    }

    private final void c(byte param0) {
        int fieldTemp$1 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        java.awt.Insets var6 = null;
        try {
          L0: {
            var2_long = pr.a(param0 ^ 14328);
            var4 = nm.field_b[qo.field_a];
            nm.field_b[qo.field_a] = var2_long;
            qo.field_a = 1 + qo.field_a & 31;
            if (param0 == 58) {
              L1: {
                if (-1L == (var4 ^ -1L)) {
                  break L1;
                } else {
                  if ((var2_long ^ -1L) >= (var4 ^ -1L)) {
                    break L1;
                  } else {
                    var6_int = (int)(var2_long - var4);
                    rq.field_i = ((var6_int >> -539410527) + 32000) / var6_int;
                    break L1;
                  }
                }
              }
              L2: {
                fieldTemp$1 = mk.field_a;
                mk.field_a = mk.field_a + 1;
                if (fieldTemp$1 > 50) {
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
              this.d(1);
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
          throw r.a((Throwable) ((Object) var2), "kf.BB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void destroy() {
        if (ts.field_G != this || fc.field_a) {
            return;
        }
        try {
            oe.field_a = pr.a(14274);
            jb.a((byte) -108, 5000L);
            jl.field_S = null;
            this.a(-113, false);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "kf.destroy()");
        }
    }

    final static gr a(byte param0, int param1, int param2, int param3) {
        gr var4 = null;
        int var5 = 0;
        gr stackIn_9_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        gr stackIn_16_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (gr) ((Object) qa.field_r.d(0));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    stackIn_12_0 = param1;

                    stackIn_12_1 = var4.field_k;

                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (stackIn_12_0 == stackIn_12_1) {
                        stackIn_9_0 = (gr) (var4);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        var4 = (gr) ((Object) qa.field_r.a((byte) -71));
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
                qa.field_r.a((byte) -113, var4);
                uf.a(var4, param2, false);
                stackIn_12_0 = param0;
                stackIn_12_1 = 29;
                break L2;
              }
              L4: {
                if (stackIn_12_0 >= stackIn_12_1) {
                  break L4;
                } else {
                  kf.a((String) null, -57, (bc) null, (String) null);
                  break L4;
                }
              }
              stackIn_16_0 = (gr) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var4_ref), "kf.VA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_16_0;
        }
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
                L3: {
                  br.field_i = lq.field_q;
                  if (param0 < -20) {
                    break L3;
                  } else {
                    field_i = -95;
                    break L3;
                  }
                }
                break L2;
              }
            }
            this.a(-96);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "kf.WA(" + param0 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Throwable var3_ref = null;
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
            if (param0 <= -15) {
              L5: {
                if (null == tm.field_i) {
                  break L5;
                } else {
                  try {
                    L6: {
                      tm.field_i.removeFocusListener((java.awt.event.FocusListener) (this));
                      tm.field_i.getParent().remove((java.awt.Component) ((Object) tm.field_i));
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
                this.g(-24069);
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "kf.OA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
            lq.field_q = true;
            oq.field_e = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kf.focusGained(");

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
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
                tm.field_i.removeFocusListener((java.awt.event.FocusListener) (this));
                tm.field_i.getParent().setBackground(java.awt.Color.black);
                tm.field_i.getParent().remove((java.awt.Component) ((Object) tm.field_i));
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
                          var2 = ts.field_G;
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var2 = hb.field_a;
                      if (var4 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = uf.field_b;
                  if (var4 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var2 = cg.field_K;
              break L3;
            }
            L7: {
              L8: {
                ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
                tm.field_i = (java.awt.Canvas) ((Object) new af((java.awt.Component) (this)));
                ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) tm.field_i));
                tm.field_i.setSize(me.field_e, nn.field_b);
                tm.field_i.setVisible(true);
                if (uf.field_b != var2) {
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
            tm.field_i.addFocusListener((java.awt.event.FocusListener) (this));
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
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (var2), "kf.RA(" + param0 + ')');
        }
    }

    static {
        field_c = new gq(7, 0, 1, 1);
        field_i = 2;
        field_a = "Play rated game";
        field_h = "You have 1 unread message!";
    }
}
