/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fw extends ta {
    private boolean field_I;
    static String field_H;
    static double field_G;
    private boolean field_F;

    final static kg a(sj param0, String param1, boolean param2, String param3) {
        if (!param2) {
            return null;
        }
        int var4 = param0.b(param1, -1);
        int var5 = param0.a((byte) -70, param3, var4);
        return aw.a(var5, var4, param0, 2);
    }

    final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        jt var6 = null;
        int var7 = 0;
        jt stackIn_5_0 = null;
        jt stackIn_6_0 = null;
        jt stackIn_7_0 = null;
        jt stackIn_8_0 = null;
        jt stackIn_9_0 = null;
        jt stackIn_10_0 = null;
        jt stackIn_11_0 = null;
        jt stackIn_12_0 = null;
        jt stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        jt stackOut_4_0 = null;
        jt stackOut_5_0 = null;
        jt stackOut_6_0 = null;
        jt stackOut_7_0 = null;
        jt stackOut_8_0 = null;
        jt stackOut_9_0 = null;
        jt stackOut_10_0 = null;
        jt stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        jt stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        var7 = Kickabout.field_G;
        super.a(0, param1, param2);
        ((fw) this).field_F = gf.a(nt.field_yb, param0, tk.field_Ib, 3231);
        ((fw) this).field_I = gf.a(nt.field_yb, 1, tk.field_Ib, 3231);
        cf.field_Gb.field_jb = new tf();
        var4 = 0;
        L0: while (true) {
          if (3 <= var4) {
            cf.field_Gb.field_s = 665;
            cf.field_Gb.b(0, false);
            return;
          } else {
            var5 = 0;
            L1: while (true) {
              if (4 <= var5) {
                var4++;
                continue L0;
              } else {
                L2: {
                  L3: {
                    var6 = new jt(ic.field_h, var4, var5);
                    var6.field_J = var4 * (2 + var6.field_mb);
                    var6.field_s = var5 * (5 + var6.field_q);
                    stackOut_4_0 = (jt) var6;
                    stackIn_11_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var4 == 0) {
                      break L3;
                    } else {
                      L4: {
                        stackOut_5_0 = (jt) (Object) stackIn_5_0;
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (1 != var4) {
                          break L4;
                        } else {
                          stackOut_6_0 = (jt) (Object) stackIn_6_0;
                          stackIn_11_0 = stackOut_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          if (((fw) this).field_F) {
                            break L3;
                          } else {
                            stackOut_7_0 = (jt) (Object) stackIn_7_0;
                            stackIn_8_0 = stackOut_7_0;
                            break L4;
                          }
                        }
                      }
                      L5: {
                        stackOut_8_0 = (jt) (Object) stackIn_8_0;
                        stackIn_12_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (2 != var4) {
                          break L5;
                        } else {
                          stackOut_9_0 = (jt) (Object) stackIn_9_0;
                          stackIn_12_0 = stackOut_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          if (!((fw) this).field_I) {
                            break L5;
                          } else {
                            stackOut_10_0 = (jt) (Object) stackIn_10_0;
                            stackIn_11_0 = stackOut_10_0;
                            break L3;
                          }
                        }
                      }
                      stackOut_12_0 = (jt) (Object) stackIn_12_0;
                      stackOut_12_1 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      break L2;
                    }
                  }
                  stackOut_11_0 = (jt) (Object) stackIn_11_0;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L2;
                }
                stackIn_13_0.field_lb = stackIn_13_1 != 0;
                cf.field_Gb.a((byte) -104, (hd) (Object) var6);
                var5++;
                continue L1;
              }
            }
          }
        }
    }

    public static void f(int param0) {
        field_H = null;
        int var1 = -127 % ((param0 - 61) / 56);
    }

    final void a(int param0, boolean param1) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        super.a(param0, param1);
        int var3 = ((fw) this).field_j + 18;
        on.a(((fw) this).field_j + 10, 53, 365, 371, 65793, 96);
        on.a(var3, 62, 348, 24, 6, 65793, 96);
        pb.field_C.a(e.field_o, 30 + ((fw) this).field_j, 80, 16777215, -1);
        on.a(var3, 95, 348, 106, 10, 65793, 96);
        on.a(var3, 207, 348, 102, 10, 65793, 96);
        on.a(var3, 314, 348, 100, 10, 65793, 96);
        for (var4 = 0; var4 < cf.field_Gb.field_jb.f(606511077).length; var4++) {
            ((jt) (Object) cf.field_Gb.field_jb.f(param0 ^ -606511074)[var4]).j(0);
        }
        cf.field_Gb.a(96, false);
        if (!(((fw) this).field_F)) {
            on.a(var3, 207, 348, 102, 10, 65793, 228);
            for (var4 = 0; var4 < 3; var4++) {
                sh.field_g.c(30 + (var3 + -var4), 241 + -(var4 * 2));
            }
            pb.field_C.a(fv.field_c, 70 + var3, 261, 16777215, -1);
            int discarded$0 = pb.field_C.a(we.field_d, var3, 269, 348, 40, 16777215, -1, 1, 1, 0);
        }
        if (!((fw) this).field_I) {
            on.a(var3, 314, 348, 100, 10, 65793, 228);
            for (var4 = 0; (var4 ^ -1) > -4; var4++) {
                sh.field_g.c(-var4 + (30 + var3), -(2 * var4) + 348);
            }
            pb.field_C.a(fv.field_c, var3 + 70, 368, 16777215, -1);
            int discarded$1 = pb.field_C.a(we.field_d, var3, 376, 348, 40, 16777215, -1, 1, 1, 0);
        }
        un.field_d.a(ca.field_a, ((fw) this).field_j + 25, 115, 16777215, -1);
        un.field_d.a(lr.field_j, 25 + ((fw) this).field_j, 223, 16777215, -1);
        un.field_d.a(tu.field_C, 25 + ((fw) this).field_j, 331, 16777215, -1);
    }

    final void b(int param0) {
        if (param0 != -38) {
            field_G = -0.01516130877366001;
        }
        cf.field_Gb = new hd();
        cf.field_Gb.a(true, 390, 25, 100, 440);
    }

    final void a(boolean param0, int param1) {
        if (param1 <= 99) {
            ((fw) this).field_I = true;
        }
        ig.b(((fw) this).field_j, -12452);
    }

    final void a(byte param0, boolean param1) {
        jt var3_ref_jt = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        super.a((byte) 101, param1);
        cf.field_Gb.field_s = ((fw) this).field_j + 25;
        cf.field_Gb.b(0, param1);
        var3_ref_jt = (jt) (Object) cf.field_Gb.field_jb.g(24009);
        L0: while (true) {
          if (var3_ref_jt == null) {
            tc.a(ic.field_h.field_x, 5464);
            var3 = 4 % ((param0 - 38) / 60);
            return;
          } else {
            L1: {
              L2: {
                var3_ref_jt.c(3784, param1);
                if (var3_ref_jt.field_Ab == null) {
                  break L2;
                } else {
                  if (var3_ref_jt.field_Ab.field_sb != 0) {
                    cb.a(var3_ref_jt, (byte) 125);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3_ref_jt.field_sb == 0) {
                break L1;
              } else {
                if (!var3_ref_jt.i(-29050)) {
                  break L1;
                } else {
                  if (!var3_ref_jt.k(-9)) {
                    rt.b(var3_ref_jt.field_Db, 97, var3_ref_jt.field_zb);
                    break L1;
                  } else {
                    var3_ref_jt = (jt) (Object) cf.field_Gb.field_jb.c(33);
                    continue L0;
                  }
                }
              }
            }
            var3_ref_jt = (jt) (Object) cf.field_Gb.field_jb.c(33);
            continue L0;
          }
        }
    }

    final static int h(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            iw var2 = null;
            int stackIn_16_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_37_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_15_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_36_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (gt.field_t.field_o > -5) {
                            statePc = 7;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (0 == gt.field_t.field_l) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return 3;
                    }
                    case 4: {
                        if (gt.field_t.field_l == -2) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return 1;
                    }
                    case 6: {
                        return 4;
                    }
                    case 7: {
                        if (param0 == 66) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        field_G = 1.4183330929861455;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        try {
                            if (ci.field_a == 0) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            iv.field_o = hf.field_e.a(true, tk.field_yb, nb.field_b);
                            ci.field_a = ci.field_a + 1;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (-2 != (ci.field_a ^ -1)) {
                                statePc = 20;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (iv.field_o.field_a == 2) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = vk.a(-120, -1);
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return stackIn_16_0;
                    }
                    case 17: {
                        try {
                            if (1 == iv.field_o.field_a) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ci.field_a = ci.field_a + 1;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (ci.field_a != 2) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            je.field_e = new bh((java.net.Socket) iv.field_o.field_b, hf.field_e);
                            var2 = new iw(13);
                            dh.a(or.field_c, rc.field_f, var2, -3210, wo.field_k);
                            var2.a(param0 + 52, 15);
                            var2.b(param0 ^ -44, gg.field_Db);
                            je.field_e.a(13, (byte) -127, 0, var2.field_f);
                            ci.field_a = ci.field_a + 1;
                            qq.field_I = 30000L + nj.a(93);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (ci.field_a == 3) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (-1 <= je.field_e.a((byte) 63)) {
                                statePc = 29;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var1_int = je.field_e.b(1);
                            if (-1 == var1_int) {
                                statePc = 28;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            stackOut_26_0 = vk.a(param0 + -182, var1_int);
                            stackIn_27_0 = stackOut_26_0;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        return stackIn_27_0;
                    }
                    case 28: {
                        try {
                            ci.field_a = ci.field_a + 1;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if ((nj.a(param0 ^ 102) ^ -1L) < (qq.field_I ^ -1L)) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            stackOut_31_0 = vk.a(-126, -2);
                            stackIn_32_0 = stackOut_31_0;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        return stackIn_32_0;
                    }
                    case 33: {
                        try {
                            if ((ci.field_a ^ -1) != -5) {
                                statePc = 36;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            gt.field_t.a((Object) (Object) je.field_e, 20, ac.field_f);
                            je.field_e = null;
                            ci.field_a = 0;
                            iv.field_o = null;
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        return stackIn_35_0;
                    }
                    case 36: {
                        try {
                            stackOut_36_0 = -1;
                            stackIn_37_0 = stackOut_36_0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        return stackIn_37_0;
                    }
                    case 38: {
                        var1 = (IOException) (Object) caughtException;
                        return vk.a(-125, -3);
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

    fw() {
        ((fw) this).field_I = false;
        ((fw) this).field_F = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = 0.0;
        field_H = "Loading music";
    }
}
