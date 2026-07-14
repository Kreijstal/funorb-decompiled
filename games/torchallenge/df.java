/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class df extends ng {
    static int field_Q;
    static int field_R;
    private String[] field_U;
    private sl field_T;
    private ia field_S;
    static boolean field_O;
    static String field_P;

    void a(ee param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param2 >= -97) {
            field_O = false;
        }
        super.a(param0, param1, (byte) -105, param3);
        ((df) this).field_S = null;
        if (!(!((df) this).field_w)) {
            var5 = -((df) this).field_m + kc.field_u - param1;
            var6 = -((df) this).field_i + (ph.field_d + -param3);
            ((df) this).field_S = this.b(var6, var5, 59);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = -((df) this).field_m + param2;
        int var6 = -((df) this).field_i + param0;
        ia var7 = this.b(var6, var5, 91);
        if (var7 != null) {
            if (!(null == ((df) this).field_k)) {
                ((tl) (Object) ((df) this).field_k).a((df) this, var7.field_s, param3, true);
            }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param1 != 2) {
            ((df) this).d(false);
        }
        ((df) this).a((byte) 122, param3, ((gd) (Object) ((df) this).field_q).b((ee) this, (byte) -117), param2, param0);
    }

    void a(int param0, int param1, boolean param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param2) {
            Object var9 = null;
            String discarded$0 = df.a((String) null, '￢', (String) null, (byte) -27);
        }
        if (0 != param3) {
            return;
        }
        gd var10 = (gd) (Object) ((df) this).field_q;
        ia var6 = ((df) this).field_S;
        if (var6 != null) {
            var7 = var10.a(param1, (ee) this, false);
            var8 = var10.a((ee) this, 3, param0);
            do {
                jc.a((byte) -128, -2 + (var7 + var6.field_r), var6.field_m - -2, var6.field_n + 2, -2 + var6.field_o + var8);
                var6 = var6.field_k;
            } while (var6 != null);
        }
    }

    final static int c(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            uf var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_22_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_36_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_21_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_30_0 = 0;
            int stackOut_35_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (gb.field_d.field_h > -5) {
                            statePc = 7;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (gb.field_d.field_b == -1) {
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
                        if (1 == gb.field_d.field_b) {
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
                        try {
                            if (-1 == (nh.field_jb ^ -1)) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            n.field_cb = rc.field_t.a(wb.field_d, mc.field_o, 431890200);
                            nh.field_jb = nh.field_jb + 1;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (nh.field_jb != -2) {
                                statePc = 17;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (n.field_cb.field_d == 2) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = je.a(-1, true);
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0;
                    }
                    case 15: {
                        try {
                            if (-2 != n.field_cb.field_d) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            nh.field_jb = nh.field_jb + 1;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if ((nh.field_jb ^ -1) == -3) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            bl.field_V = new wb((java.net.Socket) n.field_cb.field_g, rc.field_t);
                            var2 = new uf(13);
                            hl.a(var2, 12, vk.field_j, vf.field_d, vb.field_r);
                            var2.d(15, (byte) 122);
                            var2.a(mg.field_e, false);
                            bl.field_V.a(13, 0, (byte) 120, var2.field_m);
                            nh.field_jb = nh.field_jb + 1;
                            il.field_m = 30000L + ol.a(256);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (param0 == 35) {
                                statePc = 23;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            stackOut_21_0 = 21;
                            stackIn_22_0 = stackOut_21_0;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        return stackIn_22_0;
                    }
                    case 23: {
                        try {
                            if (-4 != (nh.field_jb ^ -1)) {
                                statePc = 33;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (bl.field_V.a(0) > 0) {
                                statePc = 29;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (il.field_m < ol.a(256)) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            stackOut_27_0 = je.a(-2, true);
                            stackIn_28_0 = stackOut_27_0;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        return stackIn_28_0;
                    }
                    case 29: {
                        try {
                            var1_int = bl.field_V.c(0);
                            if (var1_int == 0) {
                                statePc = 32;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            stackOut_30_0 = je.a(var1_int, true);
                            stackIn_31_0 = stackOut_30_0;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        return stackIn_31_0;
                    }
                    case 32: {
                        try {
                            nh.field_jb = nh.field_jb + 1;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if ((nh.field_jb ^ -1) == -5) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            return -1;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            gb.field_d.a(md.field_f, (Object) (Object) bl.field_V, (byte) 115);
                            bl.field_V = null;
                            nh.field_jb = 0;
                            n.field_cb = null;
                            stackOut_35_0 = 0;
                            stackIn_36_0 = stackOut_35_0;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        return stackIn_36_0;
                    }
                    case 37: {
                        var1 = (IOException) (Object) caughtException;
                        return je.a(-3, true);
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

    final static String a(String param0, char param1, String param2, byte param3) {
        int var8_int = 0;
        int var10 = 0;
        int var11 = TorChallenge.field_F ? 1 : 0;
        int var4 = param0.length();
        int var5 = param2.length();
        int var6 = var4;
        int var7 = var5 - 1;
        if (!(var7 == 0)) {
            var8_int = 0;
            while (true) {
                var8_int = param0.indexOf((int) param1, var8_int);
                if ((var8_int ^ -1) > -1) {
                    break;
                }
                var6 = var6 + var7;
                var8_int++;
            }
        }
        if (param3 < 124) {
            Object var12 = null;
            String discarded$0 = df.a(-50, true, (CharSequence) null);
        }
        StringBuilder var8 = new StringBuilder(var6);
        int var9 = 0;
        while (true) {
            var10 = param0.indexOf((int) param1, var9);
            if (0 > var10) {
                break;
            }
            StringBuilder discarded$1 = var8.append(param0.substring(var9, var10));
            var9 = 1 + var10;
            StringBuilder discarded$2 = var8.append(param2);
        }
        StringBuilder discarded$3 = var8.append(param0.substring(var9));
        return var8.toString();
    }

    private final ia b(int param0, int param1, int param2) {
        ia var4 = null;
        ia var5 = null;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        if (param2 > 46) {
          var4 = (ia) (Object) ((df) this).field_T.c((byte) -19);
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (ia) (Object) ((df) this).field_T.c(-270);
                  continue L0;
                } else {
                  L2: {
                    if (var5.field_r > param1) {
                      break L2;
                    } else {
                      if (param0 < var5.field_o) {
                        break L2;
                      } else {
                        if (param1 >= var5.field_n + var5.field_r) {
                          break L2;
                        } else {
                          if (var5.field_m + var5.field_o < param0) {
                            break L2;
                          } else {
                            return var4;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_k;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a((byte) 104, param1, param2, param3, param4);
        if (param0 < 100) {
            return;
        }
        ((df) this).d(false);
    }

    boolean a(ee param0, int param1) {
        if (param1 != 0) {
            return false;
        }
        return false;
    }

    df(String param0, j param1) {
        super(param0, (gg) null);
        ((df) this).field_S = null;
        ((df) this).field_q = param1;
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          if (param0 == -2184) {
            break L0;
          } else {
            field_R = -55;
            break L0;
          }
        }
        var3 = ug.a(param2, param1, -107);
        if (var3 == null) {
          var4 = 0;
          L1: while (true) {
            if (var4 < param2.length()) {
              if (bc.a(param0 ^ -2283, param2.charAt(var4))) {
                var4++;
                continue L1;
              } else {
                return ed.field_h;
              }
            } else {
              return null;
            }
          }
        } else {
          return var3;
        }
    }

    final void d(boolean param0) {
        int var2 = 0;
        gd var3 = null;
        lg var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ia var10 = null;
        int var11 = 0;
        qi var12 = null;
        int var13 = 0;
        int var14 = 0;
        ia var15 = null;
        int var16 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var16 = TorChallenge.field_F ? 1 : 0;
          ((df) this).field_T = new sl();
          if (!param0) {
            break L0;
          } else {
            field_P = null;
            break L0;
          }
        }
        var2 = 0;
        var3 = (gd) (Object) ((df) this).field_q;
        var4 = var3.a(-97, (ee) this);
        L1: while (true) {
          var5 = ((df) this).field_v.indexOf("<hotspot=", var2);
          if ((var5 ^ -1) == 0) {
            return;
          } else {
            var7 = ((df) this).field_v.indexOf(">", var5);
            var6 = ((df) this).field_v.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((df) this).field_v.indexOf("</hotspot>", var5);
            var8 = var4.a((byte) 7, var5);
            var9 = var4.a((byte) 7, var2);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var9 < var11) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_a[var11];
                  if (var8 == var11) {
                    stackOut_8_0 = var4.a(-117, var5);
                    stackIn_9_0 = stackOut_8_0;
                    break L3;
                  } else {
                    stackOut_7_0 = var12.field_g[0];
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_9_0;
                  if (var9 != var11) {
                    if (var12 == null) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      break L4;
                    } else {
                      stackOut_12_0 = var12.field_g[var12.field_g.length - 1];
                      stackIn_14_0 = stackOut_12_0;
                      break L4;
                    }
                  } else {
                    stackOut_10_0 = var4.a(-120, var2);
                    stackIn_14_0 = stackOut_10_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_14_0;
                  var15 = new ia(var7, var13, var12.field_d, -var13 + var14, Math.max(var3.a(-1), var12.field_e + -var12.field_d));
                  if (var10 != null) {
                    var10.field_k = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((df) this).field_T.a((da) (Object) var15, -63);
                var10 = var15;
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_P = null;
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (!bk.a(param0, param2, (byte) -125)) {
            return false;
        }
        for (var3 = param1; var3 < param0.length(); var3++) {
            if (!bc.a(105, param0.charAt(var3))) {
                return false;
            }
        }
        return true;
    }

    String b(boolean param0) {
        if (null == ((df) this).field_S) {
            return null;
        }
        if (null == ((df) this).field_U) {
            return null;
        }
        if (param0) {
            ((df) this).b(94, 108, -21, -91);
        }
        if (((df) this).field_U.length <= ((df) this).field_S.field_s) {
            return null;
        }
        return ((df) this).field_U[((df) this).field_S.field_s];
    }

    final void a(int param0, boolean param1, String param2) {
        String[] var7 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = TorChallenge.field_F ? 1 : 0;
        if (null != ((df) this).field_U) {
            // if_icmpge L25
        } else {
            var7 = new String[1 + param0];
            var4 = var7;
            if (!(null == ((df) this).field_U)) {
                for (var5 = 0; var5 < ((df) this).field_U.length; var5++) {
                    var7[var5] = ((df) this).field_U[var5];
                }
            }
            ((df) this).field_U = var4;
        }
        if (param1) {
            return;
        }
        ((df) this).field_U[param0] = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = false;
        field_Q = 0;
        field_P = "Your character will only collect a health potion when he/she is injured.";
    }
}
