/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class ssa {
    private iea field_c;
    private int[] field_a;
    private ha field_b;
    static String field_d;
    static jea field_g;
    private iea field_f;
    private nh field_e;

    final static void a(String param0, byte param1, Throwable param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            naa var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            fia stackIn_15_0 = null;
            java.net.URL stackIn_15_1 = null;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            StringBuilder stackIn_15_4 = null;
            fia stackIn_16_0 = null;
            java.net.URL stackIn_16_1 = null;
            java.net.URL stackIn_16_2 = null;
            java.net.URL stackIn_16_3 = null;
            StringBuilder stackIn_16_4 = null;
            fia stackIn_17_0 = null;
            java.net.URL stackIn_17_1 = null;
            java.net.URL stackIn_17_2 = null;
            java.net.URL stackIn_17_3 = null;
            StringBuilder stackIn_17_4 = null;
            String stackIn_17_5 = null;
            fia stackOut_14_0 = null;
            java.net.URL stackOut_14_1 = null;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            StringBuilder stackOut_14_4 = null;
            fia stackOut_15_0 = null;
            java.net.URL stackOut_15_1 = null;
            java.net.URL stackOut_15_2 = null;
            java.net.URL stackOut_15_3 = null;
            StringBuilder stackOut_15_4 = null;
            String stackOut_15_5 = null;
            fia stackOut_16_0 = null;
            java.net.URL stackOut_16_1 = null;
            java.net.URL stackOut_16_2 = null;
            java.net.URL stackOut_16_3 = null;
            StringBuilder stackOut_16_4 = null;
            String stackOut_16_5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = TombRacer.field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param1 >= 112) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            ssa.d(-5);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3_ref = "";
                            if (param2 == null) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var3_ref = qi.a(107, param2);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param0 != null) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (param2 != null) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var3_ref = var3_ref + param0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            upa.a(var3_ref, (byte) -24);
                            var7 = qf.a(966747152, "%3a", ":", var3_ref);
                            var8 = qf.a(966747152, "%40", "@", var7);
                            var9 = qf.a(966747152, "%26", "&", var8);
                            var10 = qf.a(966747152, "%23", "#", var9);
                            if (dfa.field_e == null) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return;
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = nea.field_c;
                            stackOut_14_1 = null;
                            stackOut_14_2 = null;
                            stackOut_14_3 = dfa.field_e.getCodeBase();
                            stackOut_14_4 = new StringBuilder().append("clienterror.ws?c=").append(sua.field_L).append("&u=");
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_16_1 = stackOut_14_1;
                            stackIn_16_2 = stackOut_14_2;
                            stackIn_16_3 = stackOut_14_3;
                            stackIn_16_4 = stackOut_14_4;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            stackIn_15_3 = stackOut_14_3;
                            stackIn_15_4 = stackOut_14_4;
                            if (toa.field_f != null) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = (fia) (Object) stackIn_15_0;
                            stackOut_15_1 = null;
                            stackOut_15_2 = null;
                            stackOut_15_3 = (java.net.URL) (Object) stackIn_15_3;
                            stackOut_15_4 = (StringBuilder) (Object) stackIn_15_4;
                            stackOut_15_5 = "" + ic.field_b;
                            stackIn_17_0 = stackOut_15_0;
                            stackIn_17_1 = stackOut_15_1;
                            stackIn_17_2 = stackOut_15_2;
                            stackIn_17_3 = stackOut_15_3;
                            stackIn_17_4 = stackOut_15_4;
                            stackIn_17_5 = stackOut_15_5;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = (fia) (Object) stackIn_16_0;
                            stackOut_16_1 = null;
                            stackOut_16_2 = null;
                            stackOut_16_3 = (java.net.URL) (Object) stackIn_16_3;
                            stackOut_16_4 = (StringBuilder) (Object) stackIn_16_4;
                            stackOut_16_5 = toa.field_f;
                            stackIn_17_0 = stackOut_16_0;
                            stackIn_17_1 = stackOut_16_1;
                            stackIn_17_2 = stackOut_16_2;
                            stackIn_17_3 = stackOut_16_3;
                            stackIn_17_4 = stackOut_16_4;
                            stackIn_17_5 = stackOut_16_5;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            new java.net.URL(stackIn_17_3, stackIn_17_5 + "&v1=" + fia.field_e + "&v2=" + fia.field_v + "&e=" + var10);
                            var4 = ((fia) (Object) stackIn_17_0).a(stackIn_17_1, 122);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var4.field_b != 0) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            vja.a(0, 1L);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (1 == var4.field_b) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var5 = (DataInputStream) var4.field_f;
                            int discarded$1 = var5.read();
                            var5.close();
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
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

    private final void c(int param0) {
        iea var2 = null;
        ((ssa) this).field_b.K(((ssa) this).field_a);
        if (param0 != -31138) {
            return;
        }
        if (null != ((ssa) this).field_f) {
            var2 = ((ssa) this).field_f;
            ((ssa) this).field_f = ((ssa) this).field_f.field_b;
        } else {
            var2 = new iea();
        }
        var2.a(((ssa) this).field_a[3], ((ssa) this).field_a[2], ((ssa) this).field_a[1], ((ssa) this).field_a[0], ((ssa) this).field_c, ((ssa) this).field_e, param0 ^ -31170);
        ((ssa) this).field_c = var2;
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        this.c(param2 ^ 31146);
        ((ssa) this).field_b.T(param4, param1, param0, param3);
        if (param2 != -12) {
            this.c(-41);
        }
    }

    final void a(int param0) {
        if (((ssa) this).field_e != ((ssa) this).field_c.field_a) {
            ((ssa) this).field_b.d();
            if (!(((ssa) this).field_c.field_a == null)) {
                ((ssa) this).field_b.a(((ssa) this).field_c.field_a, true);
            }
            ((ssa) this).field_e = ((ssa) this).field_c.field_a;
        }
        ((ssa) this).field_b.KA(((ssa) this).field_c.field_d, ((ssa) this).field_c.field_h, ((ssa) this).field_c.field_c, ((ssa) this).field_c.field_f);
        int var2 = -7 / ((param0 - 36) / 59);
        iea var3 = ((ssa) this).field_c;
        ((ssa) this).field_c = ((ssa) this).field_c.field_b;
        var3.field_b = ((ssa) this).field_f;
        var3.field_a = null;
        ((ssa) this).field_f = var3;
    }

    final static byte[] a(uia param0, int param1, boolean param2) throws Exception {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        int[][] var10 = null;
        byte[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var19 = null;
        int[] var20 = null;
        uia var21 = null;
        uia var22 = null;
        byte[] var24 = null;
        int[] var25 = null;
        byte[] var27 = null;
        int[] var28 = null;
        byte[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        byte[] var34 = null;
        byte[] var35 = null;
        int[] var36 = null;
        var17 = TombRacer.field_G ? 1 : 0;
        var4 = -82 % ((41 - param1) / 37);
        var3 = param0.d(121);
        if (var3 != 0) {
          var5 = param0.field_h;
          var6 = var5 + var3;
          var7 = param0.d(126);
          if (2 < var7) {
            throw new Exception("Local: header error: version=" + var7);
          } else {
            var36 = fqa.e(true);
            var32 = var36;
            var28 = var32;
            var25 = var28;
            var8 = var25;
            var33 = var8;
            var10_int = 0;
            L0: while (true) {
              if ((var10_int ^ -1) <= -9) {
                L1: {
                  if (var7 == -1) {
                    var8[0] = param0.e(105);
                    break L1;
                  } else {
                    if (1 != var7) {
                      var20 = var8;
                      var22 = param0;
                      var11 = var22.h(255);
                      var12 = 0;
                      L2: while (true) {
                        if (var11 <= var12) {
                          break L1;
                        } else {
                          var20[var12] = var22.e(-35);
                          var12++;
                          continue L2;
                        }
                      }
                    } else {
                      var19 = var8;
                      var21 = param0;
                      var11 = 0;
                      L3: while (true) {
                        if (-9 <= var11) {
                          break L1;
                        } else {
                          var19[var11] = var21.e(100);
                          var11++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
                L4: {
                  var9 = param0.h(255);
                  if (-1 > (var9 ^ -1)) {
                    var10 = new int[var9][];
                    var11 = 0;
                    L5: while (true) {
                      if (var11 >= var9) {
                        break L4;
                      } else {
                        var12 = param0.field_h;
                        L6: while (true) {
                          var13_int = param0.h(255);
                          if ((var13_int ^ -1) <= -129) {
                            continue L6;
                          } else {
                            var10[var11] = new int[31 + (-var12 + param0.field_h) * 7 >> -613839035];
                            var13 = new int[31 + (-var12 + param0.field_h) * 7 >> -613839035];
                            param0.field_h = var12;
                            var14 = 0;
                            var15 = 0;
                            L7: while (true) {
                              L8: {
                                var16 = param0.h(255);
                                var13[var14] = var13[var14] + (sea.c(var16, 127) << var15);
                                if (var15 < 26) {
                                  break L8;
                                } else {
                                  var13[var14 - -1] = var13[var14 - -1] + (sea.c(127, var16) >> -var15 + 32);
                                  break L8;
                                }
                              }
                              if (var16 >= 128) {
                                var15 += 7;
                                var14 = var14 + (var15 >> -1448925019);
                                var15 = var15 & 31;
                                continue L7;
                              } else {
                                var11++;
                                continue L5;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L9: {
                  var10 = null;
                  if (param0.field_h < var6) {
                    L10: {
                      var11 = param0.h(255);
                      if (var11 > 0) {
                        var34 = new byte[var11];
                        param0.a(var34, 0, -101, var11);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    var12 = var6 - param0.field_h;
                    if (0 >= var12) {
                      break L9;
                    } else {
                      var35 = new byte[var12];
                      var31 = var35;
                      var27 = var31;
                      var24 = var27;
                      var10_array = var24;
                      param0.a(var35, 0, -93, var12);
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
                if (param0.field_h <= var6) {
                  L11: {
                    if (param2) {
                      System.out.println("Loading funorbprofile local: achievements=" + wg.a(0, var36));
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  return var10_array;
                } else {
                  throw new Exception("Local: data overrun: start=" + var5 + " length=" + var3 + " end=" + var6 + " overranto=" + param0.field_h);
                }
              } else {
                var33[var10_int] = 0;
                var10_int++;
                continue L0;
              }
            }
          }
        } else {
          if (param2) {
            System.out.println("Loading funorbprofile local: blank");
            return null;
          } else {
            return null;
          }
        }
    }

    ssa(ha param0) {
        ((ssa) this).field_e = null;
        ((ssa) this).field_a = new int[4];
        ((ssa) this).field_b = param0;
    }

    final static void b(int param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        int[] var5 = ow.field_q;
        int[] var1 = var5;
        int var2 = param0;
        int var3 = var5.length;
        while (var2 < var3) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    public static void d(int param0) {
        field_g = null;
        field_d = null;
        if (param0 > -89) {
            field_d = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Names should contain a maximum of 12 characters";
    }
}
