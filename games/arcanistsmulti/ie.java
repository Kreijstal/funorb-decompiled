/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ie extends ed implements vb {
    static String field_Lb;
    private ln field_Kb;
    static String field_Ub;
    static String field_Rb;
    static int field_Sb;
    static boolean field_Pb;
    static int field_Vb;
    static ll[] field_Tb;
    private boolean field_Wb;
    static String field_Mb;
    private boolean field_Ob;
    static String field_Jb;
    static String field_Nb;
    static mo field_Qb;

    final static boolean a(int param0, boolean param1) {
        // ifnull L9
        // goto L25
        nn.field_o = qg.field_b.a(ng.field_G, true, ka.field_q);
        // if_icmplt L39
        ie.l((byte) 23);
        // goto L39
        // if_icmpeq L52
        // goto L54
        return false;
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        if (!param0) {
            field_Tb = null;
        }
        if (((ie) this).field_Wb) {
            sc.a(true, false, false);
            return;
        }
        mo.g(-1);
        ((ie) this).h(77);
    }

    ie(h param0, ln param1) {
        super(param0, go.field_k, qe.field_l, false, false);
        ((ie) this).field_Kb = param1;
    }

    final boolean a(byte param0) {
        ho var2 = null;
        if (param0 <= 19) {
            return false;
        }
        if (((ie) this).field_G) {
            if (!((ie) this).field_Ob) {
                var2 = pe.e(false);
                if (var2 != null) {
                    this.a(var2, (byte) 119, false);
                }
            }
        }
        return this.a((byte) 83);
    }

    final static boolean b(byte param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (dl.field_s.startsWith("win")) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (param1.startsWith("http://")) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!param1.startsWith("https://")) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var3 >= param1.length()) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var2.indexOf((int) param1.charAt(var3)) == -1) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0 != 0;
                }
                case 15: {
                    try {
                        var3++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4 = -39 / ((param0 - 77) / 37);
                        Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void m(byte param0) {
        field_Qb = null;
        field_Lb = null;
        if (param0 <= 13) {
            ie.m((byte) 103);
        }
        field_Jb = null;
        field_Nb = null;
        field_Mb = null;
        field_Ub = null;
        field_Rb = null;
        field_Tb = null;
    }

    final void l(int param0) {
        this.a(ab.a(0, param0, g.field_c), (byte) 124, true);
    }

    private final void a(ho param0, byte param1, boolean param2) {
        String var4 = null;
        me var5 = null;
        int var6 = 0;
        L0: {
          var6 = ArcanistsMulti.field_G ? 1 : 0;
          ((ie) this).field_Ob = true;
          if (param1 >= 115) {
            break L0;
          } else {
            field_Mb = null;
            break L0;
          }
        }
        L1: {
          if (!param0.field_f) {
            if (param0.field_b == null) {
              var4 = param0.field_e;
              if ((param0.field_a ^ -1) == -249) {
                L2: {
                  if (!param2) {
                    na.i((byte) 105);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4 = g.field_c;
                ((ie) this).field_Wb = true;
                break L1;
              } else {
                break L1;
              }
            } else {
              var4 = ec.field_e;
              if (((ie) this).field_Kb != null) {
                ((ie) this).field_Kb.a((byte) -7);
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            var4 = aa.field_h;
            break L1;
          }
        }
        L3: {
          var5 = new me((ed) this, go.field_k, var4);
          if (param0.field_f) {
            if (param0.field_h) {
              ((ie) this).a((byte) -92, (qm) (Object) new ng((ie) this));
              return;
            } else {
              ag discarded$2 = var5.a(73, qn.field_lb, (wc) this);
              break L3;
            }
          } else {
            L4: {
              if (!((ie) this).field_Wb) {
                if (5 != param0.field_a) {
                  var5.a(ae.field_b, (byte) 115, -1);
                  break L4;
                } else {
                  var5.a(ee.field_f, (byte) 111, 11);
                  var5.a(ki.field_u, (byte) 10, 17);
                  break L4;
                }
              } else {
                ag discarded$3 = var5.a(116, qn.field_lb, (wc) this);
                break L4;
              }
            }
            if (3 == param0.field_a) {
              var5.a(bd.field_b, (byte) 10, 7);
              break L3;
            } else {
              if (-7 != (param0.field_a ^ -1)) {
                break L3;
              } else {
                var5.a(ea.field_B, (byte) -121, 9);
                break L3;
              }
            }
          }
        }
        ((ie) this).a((byte) -92, (qm) (Object) var5);
    }

    final static void l(byte param0) {
        uc.field_d.a(-(!fc.field_a ? 0 : 40 + (2 + (nn.field_p - -2))) + mj.field_s.field_x, 0, 0, 18, (byte) -120);
        nh.field_z.a(nn.field_p + 42, -40 + (-nn.field_p + mj.field_s.field_x) + -2, 0, 18, (byte) -120);
        nj.field_m.a(20, nn.field_p, mj.field_s.field_x, false, 0, mj.field_s.field_I - 20, 2);
        int var1 = -112 % ((param0 - 45) / 37);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = "Character Creation";
        field_Rb = "<shad><col=<%0>>COGS</col></shad>";
        field_Ub = "Try changing the following settings:  ";
        field_Vb = 1;
        field_Jb = "This is the Book of Frost. Frost spells focus on high damage attacks and the summoning of powerful minions. You require 5 wands to purchase this spellbook; you currently have ";
        field_Mb = "Select the Lava Bomb spell below.";
    }
}
