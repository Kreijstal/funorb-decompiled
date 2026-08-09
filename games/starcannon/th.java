/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class th extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_b;
    static rb field_d;
    static int field_c;
    public static boolean field_i;
    public static int field_f;
    public static boolean field_j;
    public static boolean field_e;
    public static boolean field_h;
    public static int field_g;
    public static boolean field_a;

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
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
            if (null != ic.field_d) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (oj.field_f == null) {
                  break L1;
                } else {
                  if (oj.field_f == this) {
                    break L1;
                  } else {
                    stackIn_10_0 = oj.field_f.getParameter(param0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_12_0 = super.getParameter(param0);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("th.getParameter(");

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
          throw sd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    abstract void f(int param0);

    final void a(byte param0, String param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ka dupTemp$0 = null;
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
            bk var8 = null;
            Throwable var8_ref = null;
            RuntimeException var8_ref2 = null;
            int var9 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = StarCannon.field_A;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != ic.field_b) {
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
                            pd.field_c = pd.field_c + 1;
                            if ((pd.field_c ^ -1) > -4) {
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
                            this.a("alreadyloaded", false);
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
                            k.field_a = 0;
                            ac.field_f = param2;
                            lf.field_ab = 0;
                            eh.field_n = param5;
                            cg.field_b = param5;
                            ic.field_b = (th) (this);
                            ef.field_d = param4;
                            ig.field_i = param4;
                            ek.field_b = ll.b(125);
                            if (param0 > 125) {
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
                            this.paint((java.awt.Graphics) null);
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
                            dupTemp$0 = new ka(param3, param1, param6, true);
                            nb.field_e = dupTemp$0;
                            kg.field_d = dupTemp$0;
                            var8 = nb.field_e.a(1, 105, (Runnable) (this));
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
                            if ((var8.field_b ^ -1) != -1) {
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
                            uc.a(-125, 10L);
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
                            hc.a(var8_ref, (String) null, (byte) 126);
                            this.a("crash", false);
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
                        stackIn_24_1 = new StringBuilder().append("th.G(").append(param0).append(',');
                        stackIn_22_1 = stackIn_24_1;
                        if (param1 == null) {
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
                        throw sd.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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

    public final void windowClosed(java.awt.event.WindowEvent param0) {
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
            nf.field_k = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("th.focusLost(");

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
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    abstract void b(int param0);

    final void a(String param0, boolean param1) {
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
                if (!this.field_b) {
                  this.field_b = true;
                  System.out.println("error_game_" + param0);
                  try {
                    L1: {
                      mb.a(ll.b(104), "loggedout", true);
                      break L1;
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L2: {
                      var3 = decompiledCaughtException;
                      break L2;
                    }
                  }
                  L3: {
                    if (!param1) {
                      break L3;
                    } else {
                      th.c(81);
                      break L3;
                    }
                  }
                  try {
                    L4: {
                      this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
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
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L6: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var3_ref2);

                stackIn_16_1 = new StringBuilder().append("th.F(");

                if (param0 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L6;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L6;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
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

    public abstract void init();

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void run() {
        try {
            boolean stackIn_46_0 = false;
            boolean stackIn_64_0 = false;
            int stackIn_68_0 = 0;
            int stackIn_68_1 = 0;
            int stackIn_79_0 = 0;
            int stackIn_79_1 = 0;
            int stackIn_93_0 = 0;
            int stackIn_98_0 = 0;
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
                        var5 = StarCannon.field_A;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (ka.field_l == null) {
                                statePc = 59;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var1 = ka.field_l.toLowerCase();
                            if (-1 != ((String) (var1)).indexOf("sun")) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (0 == (((String) (var1)).indexOf("apple") ^ -1)) {
                                statePc = 59;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var2 = ka.field_o;
                            if (var2.equals("1.1")) {
                                statePc = 37;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            this.a("wrongjava", false);
                            if (var5 == 0) {
                                statePc = 106;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 107;
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
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            stackIn_64_0 = wc.a(48, var2.charAt(var3));
                            stackIn_46_0 = stackIn_64_0;
                            if (var5 != 0) {
                                statePc = 64;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var4 = var2.substring(6, var3);
                            if (!ba.a(6, (CharSequence) ((Object) var4))) {
                                statePc = 59;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (-11 >= (pd.a((CharSequence) ((Object) var4), 10) ^ -1)) {
                                statePc = 59;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            this.a("wrongjava", false);
                            if (var5 == 0) {
                                statePc = 106;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (null == ka.field_o) {
                                statePc = 82;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            stackIn_64_0 = ka.field_o.startsWith("1.");
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (!stackIn_64_0) {
                                statePc = 82;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var1_int = 2;
                            var2_int = 0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (var1_int >= ka.field_o.length()) {
                                statePc = 78;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var3 = ka.field_o.charAt(var1_int);
                            stackIn_79_0 = var3 ^ -1;
                            stackIn_68_0 = stackIn_79_0;
                            stackIn_79_1 = -49;
                            stackIn_68_1 = stackIn_79_1;
                            if (var5 != 0) {
                                statePc = 79;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (stackIn_68_0 > stackIn_68_1) {
                                statePc = 78;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (57 >= var3) {
                                statePc = 77;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (var5 == 0) {
                                statePc = 78;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var2_int = 10 * var2_int + var3 - 48;
                            var1_int++;
                            if (var5 == 0) {
                                statePc = 66;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            stackIn_79_0 = 5;
                            stackIn_79_1 = var2_int;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (stackIn_79_0 > stackIn_79_1) {
                                statePc = 82;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            fi.field_b = true;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            var1 = ic.field_b;
                            if (oj.field_f != null) {
                                statePc = 85;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var1 = oj.field_f;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var2_ref = ka.field_p;
                            if (null == var2_ref) {
                                statePc = 90;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var3_ref_Throwable = caughtException;
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            mi.e((byte) -6);
                            this.e(-121);
                            hg.field_y = mf.a(eh.field_n, (java.awt.Component) ((Object) kj.field_E), ef.field_d, -21880);
                            this.f(-108);
                            p.field_d = qb.a(true);
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            if (0L == ci.field_b) {
                                statePc = 96;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            stackIn_98_0 = ((dd.b(72) ^ -1L) < (ci.field_b ^ -1L) ? -1 : ((dd.b(72) ^ -1L) == (ci.field_b ^ -1L) ? 0 : 1));
                            stackIn_93_0 = stackIn_98_0;
                            if (var5 != 0) {
                                statePc = 98;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            if (stackIn_93_0 <= 0) {
                                statePc = 106;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            sg.field_k = p.field_d.a(fd.field_c, 109);
                            stackIn_98_0 = 0;
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            var3 = stackIn_98_0;
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            if (sg.field_k <= var3) {
                                statePc = 104;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            this.a((byte) 85);
                            var3++;
                            if (var5 != 0) {
                                statePc = 105;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            if (var5 == 0) {
                                statePc = 99;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            this.b((byte) -99);
                            ea.a(kj.field_E, -90, nb.field_e);
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            if (var5 == 0) {
                                statePc = 91;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 110;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            var1 = caughtException;
                            hc.a((Throwable) (var1), (String) null, (byte) 118);
                            this.a("crash", false);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 110;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            this.a(22865, true);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = 110;
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        var1 = caughtException;
                        throw sd.a((Throwable) (var1), "th.run()");
                    }
                    case 111: {
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

    abstract void d(byte param0);

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (ic.field_b != this) {
                break L1;
              } else {
                if (kd.field_E) {
                  break L1;
                } else {
                  L2: {
                    v.field_b = true;
                    if (!fi.field_b) {
                      break L2;
                    } else {
                      if (-1001L > (-nh.field_b + dd.b(82) ^ -1L)) {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (var2 == null) {
                            break L3;
                          } else {
                            if ((var2.width ^ -1) > (cg.field_b ^ -1)) {
                              break L2;
                            } else {
                              if ((var2.height ^ -1) <= (ig.field_i ^ -1)) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        jj.field_E = true;
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
            stackIn_27_0 = (RuntimeException) (var2_ref);

            stackIn_27_1 = new StringBuilder().append("th.paint(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L4;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, boolean param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          L0: {
            if (param0 == 22865) {
              var3_ref = this;
              synchronized (var3_ref) {
                L1: {
                  if (!kd.field_E) {
                    kd.field_E = true;
                    break L1;
                  } else {
                    return;
                  }
                }
              }
              L2: {
                if (oj.field_f != null) {
                  oj.field_f.destroy();
                  break L2;
                } else {
                  break L2;
                }
              }
              try {
                L3: {
                  this.a(-25109);
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
                if (kj.field_E == null) {
                  break L5;
                } else {
                  try {
                    L6: {
                      kj.field_E.removeFocusListener((java.awt.event.FocusListener) (this));
                      kj.field_E.getParent().remove((java.awt.Component) ((Object) kj.field_E));
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
                if (nb.field_e == null) {
                  break L8;
                } else {
                  try {
                    L9: {
                      nb.field_e.b(0);
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
                this.c((byte) -127);
                if (null == ic.field_d) {
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
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw sd.a((Throwable) ((Object) runtimeException), "th.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
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

            stackIn_5_1 = new StringBuilder().append("th.update(");

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
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != ic.field_d) {
          return null;
        } else {
          L0: {
            if (null == oj.field_f) {
              break L0;
            } else {
              if (this != oj.field_f) {
                return oj.field_f.getCodeBase();
              } else {
                break L0;
              }
            }
          }
          return super.getCodeBase();
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public static void c(int param0) {
        try {
            field_d = null;
            if (param0 != 1719) {
                field_c = -109;
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "th.H(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        int fieldTemp$1 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        java.awt.Insets var6 = null;
        try {
          L0: {
            L1: {
              if (param0 == -99) {
                break L1;
              } else {
                this.b(-40);
                break L1;
              }
            }
            L2: {
              var2_long = dd.b(param0 + 160);
              var4 = jb.field_j[kg.field_b];
              jb.field_j[kg.field_b] = var2_long;
              kg.field_b = 31 & kg.field_b + 1;
              if ((var4 ^ -1L) == -1L) {
                break L2;
              } else {
                if ((var2_long ^ -1L) < (var4 ^ -1L)) {
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              fieldTemp$1 = ue.field_f;
              ue.field_f = ue.field_f + 1;
              if (-51 > (fieldTemp$1 ^ -1)) {
                L4: {
                  ue.field_f = ue.field_f - 50;
                  v.field_b = true;
                  kj.field_E.setSize(eh.field_n, ef.field_d);
                  kj.field_E.setVisible(true);
                  if (ic.field_d == null) {
                    break L4;
                  } else {
                    if (null != sg.field_i) {
                      break L4;
                    } else {
                      var6 = ic.field_d.getInsets();
                      kj.field_E.setLocation(k.field_a + var6.left, lf.field_ab + var6.top);
                      if (StarCannon.field_A == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                kj.field_E.setLocation(k.field_a, lf.field_ab);
                break L3;
              } else {
                break L3;
              }
            }
            this.d((byte) 22);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "th.M(" + param0 + ')');
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        if (this != ic.field_b || kd.field_E) {
            return;
        }
        try {
            ci.field_b = 0L;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "th.start()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
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
            nf.field_k = true;
            v.field_b = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("th.focusGained(");

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
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final synchronized void e(int param0) {
        Object var2 = null;
        java.awt.Insets var3_ref_java_awt_Insets = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (kj.field_E == null) {
                break L1;
              } else {
                kj.field_E.removeFocusListener((java.awt.event.FocusListener) (this));
                kj.field_E.getParent().setBackground(java.awt.Color.black);
                kj.field_E.getParent().remove((java.awt.Component) ((Object) kj.field_E));
                break L1;
              }
            }
            L2: {
              L3: {
                if (sg.field_i == null) {
                  break L3;
                } else {
                  var2 = sg.field_i;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null == ic.field_d) {
                  break L4;
                } else {
                  var2 = ic.field_d;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (null == oj.field_f) {
                  break L5;
                } else {
                  var2 = oj.field_f;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              var2 = ic.field_b;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
                kj.field_E = (java.awt.Canvas) ((Object) new hi((java.awt.Component) (this)));
                ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) kj.field_E));
                kj.field_E.setSize(eh.field_n, ef.field_d);
                kj.field_E.setVisible(true);
                if (ic.field_d != var2) {
                  break L7;
                } else {
                  var3_ref_java_awt_Insets = ic.field_d.getInsets();
                  kj.field_E.setLocation(k.field_a + var3_ref_java_awt_Insets.left, var3_ref_java_awt_Insets.top - -lf.field_ab);
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              kj.field_E.setLocation(k.field_a, lf.field_ab);
              break L6;
            }
            kj.field_E.addFocusListener((java.awt.event.FocusListener) (this));
            kj.field_E.requestFocus();
            nf.field_k = true;
            dl.field_d = true;
            v.field_b = true;
            jj.field_E = false;
            var3 = -95 / ((param0 - -36) / 45);
            nh.field_b = dd.b(63);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (var2), "th.L(" + param0 + ')');
        }
    }

    abstract void c(byte param0);

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ic.field_d == null) {
              L1: {
                if (null == oj.field_f) {
                  break L1;
                } else {
                  if (oj.field_f == this) {
                    break L1;
                  } else {
                    stackIn_8_0 = oj.field_f.getAppletContext();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_10_0 = super.getAppletContext();
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
          throw sd.a((Throwable) ((Object) var1), "th.getAppletContext()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.applet.AppletContext) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final boolean d(int param0) {
        return true;
    }

    abstract void a(int param0);

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

            stackIn_5_1 = new StringBuilder().append("th.windowClosing(");

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
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
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
            if (null == ic.field_d) {
              L1: {
                if (oj.field_f == null) {
                  break L1;
                } else {
                  if (this == oj.field_f) {
                    break L1;
                  } else {
                    stackIn_8_0 = oj.field_f.getDocumentBase();
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
          throw sd.a((Throwable) ((Object) var1), "th.getDocumentBase()");
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

    public final void destroy() {
        if (ic.field_b != this || kd.field_E) {
            return;
        }
        try {
            ci.field_b = dd.b(100);
            uc.a(-118, 5000L);
            kg.field_d = null;
            this.a(22865, false);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "th.destroy()");
        }
    }

    public final void stop() {
        if (this != ic.field_b || kd.field_E) {
            return;
        }
        try {
            ci.field_b = dd.b(111) + 4000L;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "th.stop()");
        }
    }

    protected th() {
        this.field_b = false;
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
              var2_long = dd.b(56);
              if (param0 > 40) {
                break L1;
              } else {
                this.b(29);
                break L1;
              }
            }
            L2: {
              var4 = vd.field_g[jj.field_D];
              vd.field_g[jj.field_D] = var2_long;
              jj.field_D = 31 & 1 + jj.field_D;
              if ((var4 ^ -1L) == -1L) {
                break L2;
              } else {
                if (var2_long > var4) {
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            var6 = this;
            synchronized (var6) {
              L3: {
                dl.field_d = nf.field_k;
                break L3;
              }
            }
            this.b(320);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw sd.a((Throwable) ((Object) runtimeException), "th.D(" + param0 + ')');
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
            oj.field_f = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("th.provideLoaderApplet(");

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
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
    }
}
