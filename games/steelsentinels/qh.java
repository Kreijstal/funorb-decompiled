/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qh extends gh {
    static boolean field_Wb;
    static String field_Vb;
    gh field_Tb;
    static int field_Yb;
    static ak field_Xb;
    private gh field_Sb;
    static String field_Ub;

    final static int d(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            gi var2 = null;
            int stackIn_12_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_34_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_33_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (ne.field_N.field_f < 4) {
                            statePc = 7;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (ne.field_N.field_t == -1) {
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
                        if (ne.field_N.field_t != -2) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return 4;
                    }
                    case 6: {
                        return 1;
                    }
                    case 7: {
                        try {
                            if (wh.field_d != 0) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ha.field_T = km.field_k.a(rl.field_f, ih.field_n, 376255344);
                            wh.field_d = wh.field_d + 1;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (1 != wh.field_d) {
                                statePc = 16;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if ((ha.field_T.field_a ^ -1) != -3) {
                                statePc = 13;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = gf.a(-1, 16777215);
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return stackIn_12_0;
                    }
                    case 13: {
                        try {
                            if (ha.field_T.field_a == 1) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            wh.field_d = wh.field_d + 1;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (2 != wh.field_d) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            nf.field_c = new sg((java.net.Socket) ha.field_T.field_c, km.field_k);
                            var2 = new gi(13);
                            s.a(var2, 12, jf.field_ib, rb.field_f, sh.field_a);
                            var2.a((byte) 120, 15);
                            var2.b(true, wn.field_g);
                            nf.field_c.a(13, var2.field_t, -100, 0);
                            wh.field_d = wh.field_d + 1;
                            na.field_f = 30000L + mm.a(-57);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (param0 <= -65) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            field_Wb = false;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (-4 == (wh.field_d ^ -1)) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if ((nf.field_c.a(-124) ^ -1) < -1) {
                                statePc = 27;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (na.field_f < mm.a(40)) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            stackOut_25_0 = gf.a(-2, 16777215);
                            stackIn_26_0 = stackOut_25_0;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        return stackIn_26_0;
                    }
                    case 27: {
                        try {
                            var1_int = nf.field_c.b((byte) -94);
                            if (0 == var1_int) {
                                statePc = 30;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            stackOut_28_0 = gf.a(var1_int, 16777215);
                            stackIn_29_0 = stackOut_28_0;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        return stackIn_29_0;
                    }
                    case 30: {
                        try {
                            wh.field_d = wh.field_d + 1;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (-5 == (wh.field_d ^ -1)) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            return -1;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            ne.field_N.a((Object) (Object) nf.field_c, fk.field_h, 6);
                            wh.field_d = 0;
                            ha.field_T = null;
                            nf.field_c = null;
                            stackOut_33_0 = 0;
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0;
                    }
                    case 35: {
                        var1 = (IOException) (Object) caughtException;
                        return gf.a(-3, 16777215);
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

    final static boolean a(byte param0, char param1) {
        int var4 = 0;
        int var5 = SteelSentinels.field_G;
        if (Character.isISOControl(param1)) {
            return false;
        }
        if (dn.a(param1, -91)) {
            return true;
        }
        char[] var2 = cd.field_b;
        int var3 = 0;
        if (param0 != -30) {
            boolean discarded$0 = qh.a((byte) -42, 'A');
        }
        while (var3 < var2.length) {
            var4 = var2[var3];
            if (param1 == var4) {
                return true;
            }
            var3++;
        }
        var2 = ua.field_H;
        for (var3 = 0; var2.length > var3; var3++) {
            var4 = var2[var3];
            if (!(param1 != var4)) {
                return true;
            }
        }
        return false;
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var4 = -param0;
          var5 = -param0;
          if (null == ((qh) this).field_Sb) {
            break L0;
          } else {
            var4 = ((qh) this).field_Sb.g(-2147483648);
            break L0;
          }
        }
        L1: {
          if (null != ((qh) this).field_Tb) {
            var5 = ((qh) this).field_Tb.b(-113, -param1 + -param0 + (-var4 + -param1 + ((qh) this).field_zb));
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var6 = param1 + (param1 - -var4 - (-param0 - var5));
          if (((qh) this).field_zb >= var6) {
            break L2;
          } else {
            var5 = var5 + (-var6 + ((qh) this).field_zb);
            var6 = ((qh) this).field_zb;
            break L2;
          }
        }
        L3: {
          if (-2 == (((qh) this).field_Kb ^ -1)) {
            param1 = param1 + (((qh) this).field_zb - var6) / 2;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (2 != ((qh) this).field_Kb) {
            break L4;
          } else {
            param1 = param1 + (((qh) this).field_zb - var6);
            break L4;
          }
        }
        L5: {
          if (((qh) this).field_Sb == null) {
            break L5;
          } else {
            ((qh) this).field_Sb.a(0, 0, ((qh) this).field_Lb, param1, var4);
            ((qh) this).field_Sb.field_Fb = ((qh) this).field_Fb;
            break L5;
          }
        }
        L6: {
          if (null == ((qh) this).field_Tb) {
            break L6;
          } else {
            L7: {
              ((qh) this).field_Tb.a(0, 0, ((qh) this).field_Lb, param1 - -var4 - -param0, var5);
              if (((qh) this).field_Sb == null) {
                ((qh) this).field_Tb.field_Kb = ((qh) this).field_Kb;
                break L7;
              } else {
                ((qh) this).field_Tb.field_Kb = 0;
                break L7;
              }
            }
            ((qh) this).field_Tb.field_Fb = ((qh) this).field_Fb;
            break L6;
          }
        }
        var7 = -115 % ((param2 - -45) / 46);
    }

    final int a(byte param0, int param1, int param2) {
        int var4 = -param1;
        if (param0 < 126) {
            return 116;
        }
        int var5 = -param1;
        if (((qh) this).field_Sb != null) {
            var4 = ((qh) this).field_Sb.g(-2147483648);
        }
        if (!(((qh) this).field_Tb == null)) {
            var5 = ((qh) this).field_Tb.g(-2147483648);
        }
        return var5 + param2 - -var4 - (-param1 + -param2);
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        var32 = SteelSentinels.field_G;
        if (-307201 < (pb.field_g.length ^ -1)) {
          return;
        } else {
          L0: {
            var5 = param3;
            var6 = param1;
            if (1000 <= param0) {
              break L0;
            } else {
              param0 = 1000;
              break L0;
            }
          }
          L1: {
            var7 = param4 * param4;
            var8 = var5 - param4 >> 1848522148;
            var9 = param2 + var5 >> 1552010532;
            var10 = var5 + param4 + 15 >> -1356064668;
            var11 = -param4 + var6 >> 1304757444;
            var12 = var6 - -15 >> 1183681572;
            if ((var10 ^ -1) < -641) {
              var10 = 640;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var8 < 0) {
              var8 = 0;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var13 = 15 + param4 + var6 >> 683624612;
            if (var11 <= -1) {
              break L3;
            } else {
              var11 = 0;
              break L3;
            }
          }
          L4: {
            if (-481 >= var13) {
              break L4;
            } else {
              var13 = 480;
              break L4;
            }
          }
          L5: {
            if (var9 >= 0) {
              break L5;
            } else {
              var9 = 0;
              break L5;
            }
          }
          L6: {
            if (640 < var9) {
              var9 = 640;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (-1 < (var12 ^ -1)) {
              var12 = 0;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (var12 <= 480) {
              break L8;
            } else {
              var12 = 480;
              break L8;
            }
          }
          var14 = (var9 << -884234204) - var5;
          var14 = var14 * var14;
          var15 = -var5 + (1 + var9 << 1996187780);
          var15 = var15 * var15;
          var16 = (var9 + 2 << -770490844) - var5;
          var16 = var16 * var16;
          var17 = var15 + -var14;
          var18 = -var15 + var16;
          var19 = var18 - var17;
          var20 = -var6 + (var12 << 706061476);
          var20 = var20 * var20;
          var21 = (1 + var12 << -909378780) + -var6;
          var21 = var21 * var21;
          var22 = -var6 + (2 + var12 << -364001916);
          var22 = var22 * var22;
          var23 = -var20 + var21;
          var24 = var22 + -var21;
          var25 = var24 - var23;
          var26 = 16;
          var27 = var7;
          L9: while (true) {
            if (var7 <= 2147483647 >>> var26) {
              var28 = var12 * 640 - -var9;
              var29 = var14 + var20;
              var30 = var23;
              var31 = var12;
              L10: while (true) {
                if (var31 >= var13) {
                  var28 = 640 * var12 - -var9;
                  var30 = var23;
                  var29 = var20 + var14;
                  var31 = var12 + -1;
                  L11: while (true) {
                    if (var11 > var31) {
                      return;
                    } else {
                      var30 = var30 - var25;
                      var29 = var29 - var30;
                      // wide iinc 28 -640
                      wl.a(var31, var29, var17, var19, var26, var7, var27, var8, var9, var10, param0, var28, var5, var6);
                      var31--;
                      continue L11;
                    }
                  }
                } else {
                  ig.a((byte) -88, var26, var31, var27, var9, param0, var8, var17, var6, var7, var10, var5, var19, var29, var28);
                  var29 = var29 + var30;
                  // wide iinc 28 640
                  var30 = var30 + var25;
                  var31++;
                  continue L10;
                }
              }
            } else {
              var26--;
              var27 = var27 + 1 >>> 377044545;
              continue L9;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        ((qh) this).a(0, param5, param0, param3, param1);
        this.a(param4, param2, -96);
        if (param6 < 120) {
            field_Yb = 4;
        }
    }

    qh(long param0, gh param1, gh param2, gh param3, wk param4, String param5) {
        super(param0, param1);
        if (param4 != null) {
            ((qh) this).field_Sb = new gh(0L, param2);
            ((qh) this).field_Sb.field_Pb = param4;
            ((qh) this).a(((qh) this).field_Sb, 119);
        }
        if (param5 != null) {
            ((qh) this).field_Tb = new gh(0L, param3, param5);
            ((qh) this).a(((qh) this).field_Tb, 119);
        }
        ((qh) this).h(99);
    }

    final static String k(int param0) {
        if (param0 != 8347) {
            qh.j(-70);
        }
        return rf.field_d.h(param0 ^ 8346);
    }

    public static void j(int param0) {
        field_Ub = null;
        field_Vb = null;
        if (param0 != 15) {
            boolean discarded$0 = qh.a((byte) -26, 'ﾳ');
        }
        field_Xb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Wb = true;
        field_Vb = "This game is full.";
        field_Ub = "ESC - cancel private message";
    }
}
