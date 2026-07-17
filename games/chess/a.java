/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class a extends java.awt.Canvas implements java.awt.event.FocusListener {
    static long field_f;
    static String field_j;
    static String field_k;
    static String field_e;
    static int[] field_c;
    static String field_i;
    static boolean field_d;
    volatile boolean field_b;
    java.awt.Frame field_g;
    static tg field_a;
    static float field_h;

    final void a(jk param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              wf.a(((a) this).field_g, param0, param1 ^ -103);
              if (param1 == -3) {
                break L1;
              } else {
                String discarded$2 = a.a((byte) 81, 'O', -12);
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
            stackOut_3_1 = new StringBuilder().append("a.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static String a(int param0, String param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        nk var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_12_0 = null;
        Object stackOut_21_0 = null;
        String stackOut_18_0 = null;
        String stackOut_15_0 = null;
        String stackOut_8_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            var6 = (CharSequence) (Object) param1;
            int discarded$17 = 21257;
            if (!ed.a(var6)) {
              stackOut_2_0 = qj.field_a;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (!qd.a((byte) 13, param1)) {
                if (ld.field_g == 2) {
                  int discarded$18 = -19554;
                  if (va.a(param1)) {
                    stackOut_12_0 = oc.a(dh.field_g, new String[1], (byte) -94);
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    if (wc.field_v < 100) {
                      if (!ah.a(param1, -52)) {
                        var5 = qn.field_U;
                        var5.f(param0, -101);
                        var5.field_l = var5.field_l + 1;
                        var4 = var5.field_l;
                        var5.c(2, (byte) 68);
                        var5.a(-121, param1);
                        var5.a(-var4 + var5.field_l, -1);
                        stackOut_21_0 = null;
                        stackIn_22_0 = stackOut_21_0;
                        break L0;
                      } else {
                        stackOut_18_0 = oc.a(mf.field_B, new String[1], (byte) -85);
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      }
                    } else {
                      stackOut_15_0 = nb.field_Hb;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  }
                } else {
                  stackOut_8_0 = td.field_j;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = ed.field_a;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("a.E(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L1;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + 64 + 41);
        }
        return (String) (Object) stackIn_22_0;
    }

    final static aj a(String[] args, int param1) {
        aj var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        aj stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        aj stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new aj(false);
            var3 = -37 / ((-21 - param1) / 51);
            var2.field_a = args;
            stackOut_0_0 = (aj) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("a.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (args == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    public static void a(int param0) {
        field_e = null;
        field_i = null;
        field_k = null;
        field_j = null;
        field_c = null;
        field_a = null;
    }

    final static java.awt.Container a() {
        if (lk.field_a != null) {
            return (java.awt.Container) (Object) lk.field_a;
        }
        return (java.awt.Container) (Object) bh.i(81);
    }

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_12_0 = null;
        String stackOut_16_0 = null;
        String stackOut_20_0 = null;
        String stackOut_24_0 = null;
        String stackOut_28_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            if (param0 != 3) {
              if (param0 != 6) {
                if (param0 == 7) {
                  stackOut_8_0 = jf.field_g;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  if (param0 == 8) {
                    stackOut_12_0 = lf.field_P;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    if (param0 == 9) {
                      stackOut_16_0 = ma.field_F;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    } else {
                      if (param0 == 10) {
                        stackOut_20_0 = dj.field_q;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      } else {
                        if (param0 == 11) {
                          stackOut_24_0 = hk.field_N;
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        } else {
                          if (param0 == 14) {
                            stackOut_28_0 = oc.a(hn.field_b, new String[1], (byte) -119);
                            stackIn_29_0 = stackOut_28_0;
                            break L0;
                          } else {
                            return null;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                stackOut_4_0 = hk.field_L;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = uj.field_o;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var3;
            stackOut_31_1 = new StringBuilder().append("a.F(").append(param0).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L1;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + -3 + 41);
        }
        return stackIn_29_0;
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.setFocusTraversalKeysEnabled(false);
            int var2_int = 15;
            param1.addKeyListener((java.awt.event.KeyListener) (Object) lg.field_d);
            param1.addFocusListener((java.awt.event.FocusListener) (Object) lg.field_d);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "a.A(" + 102 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((a) this).field_b = true;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "a.focusLost(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    a() {
    }

    final static String a(byte param0, char param1, int param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = Chess.field_G;
        var6 = new char[param2];
        var3 = var6;
        var4 = 0;
        L0: while (true) {
          if (param2 <= var4) {
            if (param0 < 55) {
              field_k = null;
              return new String(var3);
            } else {
              return new String(var3);
            }
          } else {
            var6[var4] = param1;
            var4++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Chat is currently disabled.";
        field_i = "Enter name of friend to delete from list";
        field_k = "Private";
        field_j = "You are invited to <%0>'s game.";
    }
}
