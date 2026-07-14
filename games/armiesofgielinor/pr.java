/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pr {
    static String[] field_a;
    private int field_j;
    static String field_i;
    private at[] field_b;
    private int field_e;
    private int field_c;
    static int[] field_f;
    static vj field_g;
    private int[] field_d;
    private ru field_h;

    final at a(int param0, int param1) {
        if (param1 != 1) {
            return null;
        }
        return ((pr) this).field_b[1 + param0];
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        if (11 == p.field_b) {
            wp.d((byte) -13);
        }
        to.a(dd.field_a, q.field_C, wa.field_e, -1);
        if (param0 <= 106) {
            return;
        }
        pt.a(0, 12, param1, 0);
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        param2++;
        if (!(((pr) this).field_b[param2] != null)) {
            ((pr) this).field_b[param2] = new at();
        }
        if (param3 >= -95) {
            int discarded$0 = ((pr) this).a(-65, (byte) -99, 28);
        }
        ((pr) this).field_b[param2].a((byte) -119, (tc) (Object) new a(param1, param0));
    }

    final static boolean b(int param0) {
        int var1 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var1 = -21 % ((param0 - -25) / 55);
            if (null == ra.field_e) {
              break L1;
            } else {
              if (!ra.field_e.a((byte) 103)) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final static void a(vh param0, byte param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            Object var6 = null;
            byte[] var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
                        if (param1 == -84) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var6 = null;
                        pr.a((byte) -8, (java.awt.Canvas) null);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        var7 = new byte[24];
                        var2 = var7;
                        if (le.field_d == null) {
                            statePc = 15;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            le.field_d.a(-1, 0L);
                            le.field_d.a(0, var7);
                            var3_int = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var2[var3_int] == 0) {
                                statePc = 7;
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
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var3_int++;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if ((var3_int ^ -1) <= -25) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            param0.a(var2, 0, 24, 81);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (var4 >= 24) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 15: {
                        param0.a(var2, 0, 24, 81);
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
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

    final static je a(int param0, int param1, int param2, int param3, int param4, int param5, ka param6, int param7, int param8, int param9, int param10, byte param11, int param12) {
        int var13 = -103 % ((-17 - param11) / 52);
        je var14 = new je(0L, (je) null);
        var14.field_G = tn.a(true, param12, param3);
        var14.field_mb = tn.a(true, param4, param8);
        var14.field_U = tn.a(true, param1, param7);
        var14.field_H = tn.a(true, param10, param9);
        var14.field_A = tn.a(true, param2, param0);
        var14.field_N = param5;
        var14.field_Z = param6;
        return var14;
    }

    public static void a(int param0) {
        field_i = null;
        field_g = null;
        if (param0 != 7742) {
            field_g = null;
        }
        field_a = null;
        field_f = null;
    }

    final wk a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        wk var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        var5 = ((pr) this).field_h.field_e;
        var6 = 0;
        var7 = ((pr) this).field_h.field_h;
        var8 = 0;
        var10 = 6 / ((17 - param2) / 40);
        var9 = ((pr) this).field_h.field_d;
        L0: while (true) {
          if (var9 >= ((pr) this).field_h.field_h) {
            var9 = 1 + (var8 - var7);
            var10 = 1 + (var6 + -var5);
            if ((var10 ^ -1) < -1) {
              if (0 < var9) {
                var10 = var10 + 2 * param3;
                var9 = var9 + param3 * 2;
                var11 = new wk(var10, var9);
                var12 = var7;
                L1: while (true) {
                  if (var8 < var12) {
                    var11.field_A = var10 + var5;
                    var11.field_x = var9 + var7;
                    var11.field_z = var7;
                    var11.field_w = var5;
                    return var11;
                  } else {
                    var17 = var5;
                    var13 = var17;
                    L2: while (true) {
                      if (var17 >= var6) {
                        var12++;
                        continue L1;
                      } else {
                        L3: {
                          var14 = ((pr) this).field_h.field_k[var12 * ((pr) this).field_h.field_e + var17];
                          var15 = ((pr) this).field_d[var14];
                          stackOut_16_0 = var11.field_B;
                          stackOut_16_1 = (param3 + (-var7 + var12)) * var10 + (var17 - (var5 - param3));
                          stackIn_18_0 = stackOut_16_0;
                          stackIn_18_1 = stackOut_16_1;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          if (var15 == param0) {
                            stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                            stackOut_18_1 = stackIn_18_1;
                            stackOut_18_2 = param1;
                            stackIn_19_0 = stackOut_18_0;
                            stackIn_19_1 = stackOut_18_1;
                            stackIn_19_2 = stackOut_18_2;
                            break L3;
                          } else {
                            stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                            stackOut_17_1 = stackIn_17_1;
                            stackOut_17_2 = 0;
                            stackIn_19_0 = stackOut_17_0;
                            stackIn_19_1 = stackOut_17_1;
                            stackIn_19_2 = stackOut_17_2;
                            break L3;
                          }
                        }
                        stackIn_19_0[stackIn_19_1] = stackIn_19_2;
                        var17++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            var11_int = ((pr) this).field_h.field_i;
            L4: while (true) {
              if (((pr) this).field_h.field_e <= var11_int) {
                var9++;
                continue L0;
              } else {
                var12 = ((pr) this).field_h.field_k[var11_int + ((pr) this).field_h.field_e * var9];
                var13 = ((pr) this).field_d[var12];
                if (param0 == var13) {
                  var5 = Math.min(var5, var11_int);
                  var6 = Math.max(var6, var11_int);
                  var7 = Math.min(var7, var9);
                  var8 = Math.max(var8, var9);
                  var11_int++;
                  continue L4;
                } else {
                  var11_int++;
                  continue L4;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        if (param3 != 0) {
            boolean discarded$0 = pr.b(-81);
        }
        vo.a(mi.field_l, 2, jn.field_d, param0, gl.field_c, param1, param2);
    }

    pr(ru param0, int param1, int param2) {
        ((pr) this).field_e = 0;
        ((pr) this).field_h = param0;
        ((pr) this).field_j = param2;
        ((pr) this).field_c = param1;
        this.c(-91);
    }

    final int a(int param0, byte param1, int param2) {
        int var4 = -((pr) this).field_h.field_i + param0;
        int var5 = param2 - ((pr) this).field_h.field_d;
        if (var4 >= 0) {
            // if_icmpge L79
            // if_icmpgt L79
            // if_icmple L79
        } else {
            return -1;
        }
        if (((pr) this).field_h.field_k.length <= var4 - -(((pr) this).field_h.field_e * var5)) {
            return -1;
        }
        int var8 = -17 % ((-35 - param1) / 36);
        int var6 = ((pr) this).field_h.field_k[var4 - -(var5 * ((pr) this).field_h.field_e)];
        int var7 = ((pr) this).field_d[var6];
        return var7;
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((pr) this).field_b = new at[257];
        ((pr) this).field_d = new int[256];
        var2 = 0;
        L0: while (true) {
          if (var2 >= ((pr) this).field_d.length) {
            var2 = -1;
            var3 = -1;
            var4 = 101 % ((-34 - param0) / 39);
            var5 = 0;
            L1: while (true) {
              if (((pr) this).field_h.field_j.length <= var5) {
                var4 = -1;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= ((pr) this).field_h.field_k.length) {
                    return;
                  } else {
                    var6 = ((pr) this).field_h.field_k[var5] & 255;
                    if (var2 != var6) {
                      if (var3 != var6) {
                        L3: {
                          if (((pr) this).field_d[var6] != -1) {
                            break L3;
                          } else {
                            ((pr) this).field_e = ((pr) this).field_e + 1;
                            ((pr) this).field_d[var6] = ((pr) this).field_e;
                            break L3;
                          }
                        }
                        var4 = ((pr) this).field_d[var6];
                        var5++;
                        continue L2;
                      } else {
                        this.a(var5 / ((pr) this).field_h.field_e, var5 % ((pr) this).field_h.field_e, var4, (byte) -121);
                        var5++;
                        continue L2;
                      }
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (((pr) this).field_c != ((pr) this).field_h.field_j[var5]) {
                  if (((pr) this).field_h.field_j[var5] == ((pr) this).field_j) {
                    var3 = var5;
                    var5++;
                    continue L1;
                  } else {
                    var5++;
                    continue L1;
                  }
                } else {
                  var2 = var5;
                  var5++;
                  continue L1;
                }
              }
            }
          } else {
            ((pr) this).field_d[var2] = -1;
            var2++;
            continue L0;
          }
        }
    }

    final void a(byte param0, int param1, boolean[] param2, int param3, ru param4) {
        int[] var6 = null;
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
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        L0: {
          var18 = ArmiesOfGielinor.field_M ? 1 : 0;
          var23 = qn.field_d;
          var22 = var23;
          var21 = var22;
          var20 = var21;
          var19 = var20;
          var6 = var19;
          var7 = ((pr) this).field_h.field_i;
          var8 = ((pr) this).field_h.field_d;
          if (param0 > 79) {
            break L0;
          } else {
            at discarded$1 = ((pr) this).a(52, 9);
            break L0;
          }
        }
        L1: {
          var9 = ((pr) this).field_h.field_e;
          if (qn.field_j > var7 + param1) {
            var7 = qn.field_j + -param1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var9 + param1 >= qn.field_e) {
            var9 = -param1 + qn.field_e;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var10 = ((pr) this).field_h.field_h;
          if (qn.field_a > var8 - -param3) {
            var8 = -param3 + qn.field_a;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (qn.field_f > var10 - -param3) {
            break L4;
          } else {
            var10 = -param3 + qn.field_f;
            break L4;
          }
        }
        var11 = var8;
        L5: while (true) {
          if (var11 >= var10) {
            return;
          } else {
            var12 = var7;
            L6: while (true) {
              if (var12 < var9) {
                var13 = var12 - -(var11 * ((pr) this).field_h.field_e);
                var14 = 255 & ((pr) this).field_h.field_k[var13];
                var15 = ((pr) this).field_d[var14];
                if (0 <= var15) {
                  if (var15 < param2.length) {
                    if (param2[var15]) {
                      L7: {
                        var16 = param4.field_j[255 & param4.field_k[var13]];
                        var17 = qn.field_l * (param3 + var11) + (param1 + var12);
                        if (var23.length > var17) {
                          break L7;
                        } else {
                          System.out.println(var23.length);
                          break L7;
                        }
                      }
                      var23[var17] = var16;
                      var12++;
                      continue L6;
                    } else {
                      var12++;
                      continue L6;
                    }
                  } else {
                    var12++;
                    continue L6;
                  }
                } else {
                  var12++;
                  continue L6;
                }
              } else {
                var11++;
                continue L5;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"This unit has plate armour, giving +<%0>0% defence against melee attacks.", "This unit has padded armour, giving +<%0>0% defence against ranged attacks.", "This unit has enchanted armour, giving +<%0>0% defence against magical attacks.", "This unit has dragon armour, giving +<%0>0% defence against flame attacks.", "This unit has runic armour, giving +<%0>0% defence against all attacks.", "This unit has camoflaged armour, giving +<%0>0% defence against aerial attacks.", "This unit has stone armour, protecting it from <%0> attacks but halving its speed.", "This unit has granite armour, protecting it from <%0> attacks but immobilising it."};
        field_f = new int[]{0, 70, 74, 78, 82, 86, 90, 103, 104};
    }
}
