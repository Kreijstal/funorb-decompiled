/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends a {
    static pj field_u;
    private int field_q;
    private int field_t;
    private int field_s;
    private le[] field_r;

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                            param1.getAppletContext().showDocument(uf.a(param1, (byte) 103, var2), "_top");
                            if (param0) {
                                statePc = 4;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            java.awt.Container discarded$2 = hd.b(false);
                            return;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var2_ref = (Exception) (Object) caughtException;
                        var2_ref.printStackTrace();
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
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

    public static void c(int param0) {
        field_u = null;
        if (param0 != 0) {
            field_u = null;
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public hd() {
        this(2188450, 2591221, 9543);
    }

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          if (!param1.field_g) {
            if (param1.b((byte) 80)) {
              L1: {
                var6 = 1;
                if (!(param1 instanceof t)) {
                  break L1;
                } else {
                  param0 = param0 & ((t) (Object) param1).field_w;
                  break L1;
                }
              }
              L2: {
                if (param0) {
                  if (var6 != 0) {
                    stackOut_10_0 = ((hd) this).field_s;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = ((hd) this).field_q;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                } else {
                  stackOut_7_0 = ((hd) this).field_t;
                  stackIn_11_0 = stackOut_7_0;
                  break L2;
                }
              }
              L3: {
                var7 = stackIn_11_0;
                ab.a(param1.field_l, var7, ((hd) this).field_r, (-((hd) this).field_r[0].field_n + param1.field_p >> 216225601) + param1.field_e + param2, param3 - -param1.field_r, (byte) 42);
                if (!param0) {
                  stackOut_13_0 = 7105644;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = 16777215;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
              }
              var8 = stackIn_14_0;
              if (param4 <= 19) {
                return;
              } else {
                int discarded$2 = ((hd) this).field_p.a(param1.field_s, param1.field_r + param3, param2 + (param1.field_e + -2), param1.field_l, param1.field_p, var8, -1, 1, 1, ((hd) this).field_p.field_C);
                return;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_18_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_18_0 = stackOut_1_0;
            break L0;
          }
        }
        L4: {
          var6 = stackIn_18_0;
          if (!(param1 instanceof t)) {
            break L4;
          } else {
            param0 = param0 & ((t) (Object) param1).field_w;
            break L4;
          }
        }
        L5: {
          if (param0) {
            if (var6 != 0) {
              stackOut_24_0 = ((hd) this).field_s;
              stackIn_25_0 = stackOut_24_0;
              break L5;
            } else {
              stackOut_23_0 = ((hd) this).field_q;
              stackIn_25_0 = stackOut_23_0;
              break L5;
            }
          } else {
            stackOut_21_0 = ((hd) this).field_t;
            stackIn_25_0 = stackOut_21_0;
            break L5;
          }
        }
        L6: {
          var7 = stackIn_25_0;
          ab.a(param1.field_l, var7, ((hd) this).field_r, (-((hd) this).field_r[0].field_n + param1.field_p >> 216225601) + param1.field_e + param2, param3 - -param1.field_r, (byte) 42);
          if (!param0) {
            stackOut_27_0 = 7105644;
            stackIn_28_0 = stackOut_27_0;
            break L6;
          } else {
            stackOut_26_0 = 16777215;
            stackIn_28_0 = stackOut_26_0;
            break L6;
          }
        }
        var8 = stackIn_28_0;
        if (param4 <= 19) {
          return;
        } else {
          int discarded$3 = ((hd) this).field_p.a(param1.field_s, param1.field_r + param3, param2 + (param1.field_e + -2), param1.field_l, param1.field_p, var8, -1, 1, 1, ((hd) this).field_p.field_C);
          return;
        }
    }

    final static java.awt.Container b(boolean param0) {
        Object var2 = null;
        if (hk.field_e == null) {
          if (!param0) {
            var2 = null;
            hd.a(false, (java.applet.Applet) null);
            return (java.awt.Container) (Object) ii.a(false);
          } else {
            return (java.awt.Container) (Object) ii.a(false);
          }
        } else {
          return (java.awt.Container) (Object) hk.field_e;
        }
    }

    private hd(int param0, int param1, int param2) {
        ((hd) this).field_p = pj.field_c;
        ((hd) this).field_q = param0;
        ((hd) this).field_r = qj.field_C;
        ((hd) this).field_s = param1;
        ((hd) this).field_t = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new pj();
    }
}
