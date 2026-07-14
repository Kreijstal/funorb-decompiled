/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mh {
    static bi[] field_b;
    private int field_i;
    private int[] field_e;
    private int field_g;
    static String field_a;
    private int field_c;
    private int field_f;
    static pf field_d;
    private int[] field_j;
    static String[] field_h;

    final static int b(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            ob var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_35_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_30_0 = 0;
            int stackOut_34_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 >= 15) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_a = null;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (-5 < (vp.field_o.field_a ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        if ((vp.field_o.field_p ^ -1) == 0) {
                            statePc = 5;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return 3;
                    }
                    case 6: {
                        if (vp.field_o.field_p != 1) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        return 4;
                    }
                    case 8: {
                        return 1;
                    }
                    case 9: {
                        try {
                            if (-1 != gb.field_i) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            oj.field_Gb = dh.field_a.a(65535, hn.field_i, rd.field_d);
                            gb.field_i = gb.field_i + 1;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if ((gb.field_i ^ -1) != -2) {
                                statePc = 18;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (2 != oj.field_Gb.field_d) {
                                statePc = 15;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = is.a((byte) -94, -1);
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0;
                    }
                    case 15: {
                        try {
                            if ((oj.field_Gb.field_d ^ -1) == -2) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            gb.field_i = gb.field_i + 1;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if ((gb.field_i ^ -1) != -3) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            js.field_a = new ke((java.net.Socket) oj.field_Gb.field_e, dh.field_a);
                            var2 = new ob(13);
                            hq.a(ae.field_h, si.field_u, var2, (byte) 20, sr.field_q);
                            var2.c(15, (byte) -69);
                            var2.e(11135, sg.field_Cb);
                            js.field_a.a(13, 0, var2.field_h, -13976);
                            gb.field_i = gb.field_i + 1;
                            am.field_Cb = 30000L + pr.a(14274);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (-4 == (gb.field_i ^ -1)) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if ((js.field_a.a(-1) ^ -1) >= -1) {
                                statePc = 28;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var1_int = js.field_a.a((byte) 127);
                            if (0 != var1_int) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            stackOut_25_0 = is.a((byte) -94, var1_int);
                            stackIn_26_0 = stackOut_25_0;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        return stackIn_26_0;
                    }
                    case 27: {
                        try {
                            gb.field_i = gb.field_i + 1;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (am.field_Cb < pr.a(14274)) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            stackOut_30_0 = is.a((byte) -94, -2);
                            stackIn_31_0 = stackOut_30_0;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        return stackIn_31_0;
                    }
                    case 32: {
                        try {
                            if (4 == gb.field_i) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            return -1;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            vp.field_o.a((byte) 90, hq.field_c, (Object) (Object) js.field_a);
                            js.field_a = null;
                            gb.field_i = 0;
                            oj.field_Gb = null;
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        return stackIn_35_0;
                    }
                    case 36: {
                        var1 = (IOException) (Object) caughtException;
                        return is.a((byte) -94, -3);
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

    final int d(int param0) {
        if (!(((mh) this).field_c != 0)) {
            this.c(5);
            ((mh) this).field_c = 256;
        }
        if (param0 != 13) {
            field_b = null;
        }
        ((mh) this).field_c = ((mh) this).field_c - 1;
        return ((mh) this).field_j[((mh) this).field_c - 1];
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = -1640531527;
        var10 = -1640531527;
        if (param0 == 75) {
          var8 = -1640531527;
          var4 = -1640531527;
          var6 = -1640531527;
          var5 = -1640531527;
          var9 = -1640531527;
          var7 = -1640531527;
          var2 = 0;
          L0: while (true) {
            if (-5 >= (var2 ^ -1)) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= 256) {
                  var2 = 0;
                  L2: while (true) {
                    if (-257 >= (var2 ^ -1)) {
                      this.c(5);
                      ((mh) this).field_c = 256;
                      return;
                    } else {
                      var10 = var10 + ((mh) this).field_e[var2 - -7];
                      var5 = var5 + ((mh) this).field_e[var2 - -2];
                      var4 = var4 + ((mh) this).field_e[1 + var2];
                      var6 = var6 + ((mh) this).field_e[3 + var2];
                      var3 = var3 + ((mh) this).field_e[var2];
                      var9 = var9 + ((mh) this).field_e[6 + var2];
                      var7 = var7 + ((mh) this).field_e[4 + var2];
                      var8 = var8 + ((mh) this).field_e[5 + var2];
                      var3 = var3 ^ var4 << -1005742325;
                      var6 = var6 + var3;
                      var4 = var4 + var5;
                      var4 = var4 ^ var5 >>> -1574942590;
                      var5 = var5 + var6;
                      var7 = var7 + var4;
                      var5 = var5 ^ var6 << -939840792;
                      var6 = var6 + var7;
                      var8 = var8 + var5;
                      var6 = var6 ^ var7 >>> 1691535344;
                      var7 = var7 + var8;
                      var9 = var9 + var6;
                      var7 = var7 ^ var8 << -641031158;
                      var8 = var8 + var9;
                      var10 = var10 + var7;
                      var8 = var8 ^ var9 >>> 1674225316;
                      var9 = var9 + var10;
                      var3 = var3 + var8;
                      var9 = var9 ^ var10 << -393516504;
                      var4 = var4 + var9;
                      var10 = var10 + var3;
                      var10 = var10 ^ var3 >>> 1740441577;
                      var3 = var3 + var4;
                      var5 = var5 + var10;
                      ((mh) this).field_e[var2] = var3;
                      ((mh) this).field_e[var2 - -1] = var4;
                      ((mh) this).field_e[var2 + 2] = var5;
                      ((mh) this).field_e[3 + var2] = var6;
                      ((mh) this).field_e[4 + var2] = var7;
                      ((mh) this).field_e[var2 + 5] = var8;
                      ((mh) this).field_e[var2 - -6] = var9;
                      ((mh) this).field_e[var2 + 7] = var10;
                      var2 += 8;
                      continue L2;
                    }
                  }
                } else {
                  var7 = var7 + ((mh) this).field_j[var2 + 4];
                  var8 = var8 + ((mh) this).field_j[5 + var2];
                  var3 = var3 + ((mh) this).field_j[var2];
                  var9 = var9 + ((mh) this).field_j[var2 - -6];
                  var6 = var6 + ((mh) this).field_j[3 + var2];
                  var5 = var5 + ((mh) this).field_j[2 + var2];
                  var4 = var4 + ((mh) this).field_j[var2 + 1];
                  var10 = var10 + ((mh) this).field_j[var2 + 7];
                  var3 = var3 ^ var4 << 1299845355;
                  var6 = var6 + var3;
                  var4 = var4 + var5;
                  var4 = var4 ^ var5 >>> -716392734;
                  var5 = var5 + var6;
                  var7 = var7 + var4;
                  var5 = var5 ^ var6 << 391666152;
                  var8 = var8 + var5;
                  var6 = var6 + var7;
                  var6 = var6 ^ var7 >>> -567810416;
                  var7 = var7 + var8;
                  var9 = var9 + var6;
                  var7 = var7 ^ var8 << -1397054774;
                  var10 = var10 + var7;
                  var8 = var8 + var9;
                  var8 = var8 ^ var9 >>> -1411713244;
                  var9 = var9 + var10;
                  var3 = var3 + var8;
                  var9 = var9 ^ var10 << -1802806456;
                  var4 = var4 + var9;
                  var10 = var10 + var3;
                  var10 = var10 ^ var3 >>> -1535716119;
                  var5 = var5 + var10;
                  var3 = var3 + var4;
                  ((mh) this).field_e[var2] = var3;
                  ((mh) this).field_e[var2 - -1] = var4;
                  ((mh) this).field_e[var2 - -2] = var5;
                  ((mh) this).field_e[var2 + 3] = var6;
                  ((mh) this).field_e[4 + var2] = var7;
                  ((mh) this).field_e[5 + var2] = var8;
                  ((mh) this).field_e[6 + var2] = var9;
                  ((mh) this).field_e[var2 - -7] = var10;
                  var2 += 8;
                  continue L1;
                }
              }
            } else {
              var3 = var3 ^ var4 << 486842635;
              var4 = var4 + var5;
              var6 = var6 + var3;
              var4 = var4 ^ var5 >>> 993649250;
              var5 = var5 + var6;
              var7 = var7 + var4;
              var5 = var5 ^ var6 << -688935480;
              var8 = var8 + var5;
              var6 = var6 + var7;
              var6 = var6 ^ var7 >>> -2013356368;
              var9 = var9 + var6;
              var7 = var7 + var8;
              var7 = var7 ^ var8 << 1838205610;
              var10 = var10 + var7;
              var8 = var8 + var9;
              var8 = var8 ^ var9 >>> 1664112548;
              var3 = var3 + var8;
              var9 = var9 + var10;
              var9 = var9 ^ var10 << 107978856;
              var4 = var4 + var9;
              var10 = var10 + var3;
              var10 = var10 ^ var3 >>> -675638359;
              var5 = var5 + var10;
              var3 = var3 + var4;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var5 = 0;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (gf.field_i <= param1) {
            if (!(param1 < gf.field_l)) {
                return;
            }
            if (gf.field_a > param2) {
                param0 = param0 + (param2 + -gf.field_a);
                param2 = gf.field_a;
            }
            if (!(gf.field_f >= param0 + param2)) {
                param0 = -param2 + gf.field_f;
            }
            var6 = param1 + gf.field_b * param2;
            if (param4) {
                field_b = null;
            }
            while ((param0 ^ -1) < -1) {
                param1 = gf.field_h[var6];
                var5 = param3;
                param2 = var5 - -param1;
                var5 = (var5 & 16711935) - -(param1 & 16711935);
                param1 = (var5 & 16777472) - -(65536 & param2 - var5);
                gf.field_h[var6] = ee.a(-(param1 >>> 239879112) + param1, -param1 + param2);
                var6 = var6 + gf.field_b;
                param0--;
            }
            return;
        }
    }

    final static void b(int param0) {
        p.field_A = new int[600];
        sd.field_p = 0;
        if (param0 != 1674225316) {
            int discarded$0 = mh.b((byte) -95);
        }
        np.field_f = new int[600];
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        ((mh) this).field_f = ((mh) this).field_f + 1;
        ((mh) this).field_i = ((mh) this).field_i + (((mh) this).field_f + 1);
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                this.a((byte) 6);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              var3 = ((mh) this).field_e[var2];
              if ((2 & var2) == 0) {
                if (0 == (1 & var2)) {
                  ((mh) this).field_g = ((mh) this).field_g ^ ((mh) this).field_g << 436448973;
                  break L2;
                } else {
                  ((mh) this).field_g = ((mh) this).field_g ^ ((mh) this).field_g >>> -343090618;
                  break L2;
                }
              } else {
                if (0 == (1 & var2)) {
                  ((mh) this).field_g = ((mh) this).field_g ^ ((mh) this).field_g << -497383870;
                  break L2;
                } else {
                  ((mh) this).field_g = ((mh) this).field_g ^ ((mh) this).field_g >>> 1518240464;
                  break L2;
                }
              }
            }
            ((mh) this).field_g = ((mh) this).field_g + ((mh) this).field_e[255 & var2 + 128];
            var4 = ((mh) this).field_g + (((mh) this).field_e[we.a(var3 >> 479211330, 255)] - -((mh) this).field_i);
            ((mh) this).field_e[var2] = ((mh) this).field_g + (((mh) this).field_e[we.a(var3 >> 479211330, 255)] - -((mh) this).field_i);
            ((mh) this).field_i = var3 + ((mh) this).field_e[we.a(255, var4 >> 1986793192 >> -30664990)];
            ((mh) this).field_j[var2] = var3 + ((mh) this).field_e[we.a(255, var4 >> 1986793192 >> -30664990)];
            var2++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 >= -25) {
            field_h = null;
        }
        field_a = null;
        field_b = null;
        field_d = null;
    }

    mh(int[] param0) {
        int var2 = 0;
        ((mh) this).field_e = new int[256];
        ((mh) this).field_j = new int[256];
        for (var2 = 0; param0.length > var2; var2++) {
            ((mh) this).field_j[var2] = param0[var2];
        }
        this.a((byte) 75);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This entry doesn't match";
        field_d = new pf();
    }
}
