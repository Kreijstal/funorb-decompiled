/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static ie[] field_d;
    private static String field_e;
    static String field_a;
    static int field_b;
    static int field_c;

    final static byte[] a(String param0, int param1) {
        if (param1 != 4) {
            return null;
        }
        return me.field_e.a(4, "", param0);
    }

    final static hf a(int param0, boolean param1) {
        jd var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        jd var8 = null;
        ba var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        Object stackOut_20_0 = null;
        int[] stackOut_21_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SolKnight.field_L ? 1 : 0;
                    var8 = te.field_N;
                    var2 = var8;
                    var3 = var8.j(255);
                    if ((var3 & 128) == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    ml.field_e = stackIn_3_0 != 0;
                    qk.field_m = 127 & var3;
                    th.field_I = var8.j(255);
                    q.field_b = var8.a(10526);
                    if (-3 != (qk.field_m ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    hc.field_b = var8.i(-127);
                    ah.field_c = var8.b(false);
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    ah.field_c = 0;
                    hc.field_b = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if ((var8.j(255) ^ -1) != -2) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var4 = stackIn_9_0;
                    field_e = var8.h(40);
                    if (var4 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    field_a = field_e;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    field_a = var8.h(112);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (1 == qk.field_m) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (4 != qk.field_m) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    int discarded$4 = var8.i(-117);
                    String discarded$5 = var8.h(27);
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    int discarded$6 = var8.i(-117);
                    String discarded$7 = var8.h(27);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (!param1) {
                        statePc = 25;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var5 = var8.i(12);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        var9 = bf.field_f.a((byte) -109, var5);
                        ek.field_a = var9.a((byte) 100);
                        if (!field_a.equals((Object) (Object) ne.field_g)) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = null;
                        stackIn_22_0 = (int[]) (Object) stackOut_20_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = var9.field_n;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        qe.field_G = stackIn_22_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    var6 = (Exception) (Object) caughtException;
                    hi.a((Throwable) (Object) var6, "CC1", 1);
                    qe.field_G = null;
                    ek.field_a = null;
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    ek.field_a = a.a((gb) (Object) var8, 80, false);
                    qe.field_G = null;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var5 = -3 / ((-23 - param0) / 57);
                    return new hf(param1);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        L0: {
          var9 = SolKnight.field_L ? 1 : 0;
          if (param3 == 160) {
            break L0;
          } else {
            vd.a((byte) 114);
            break L0;
          }
        }
        var10 = new char[param2];
        var4 = var10;
        var5 = 0;
        var6 = 0;
        L1: while (true) {
          if (var6 >= param2) {
            return new String(var10, 0, var5);
          } else {
            var7 = param0[var6 + param1] & 255;
            if (var7 != 0) {
              L2: {
                if (var7 < 128) {
                  break L2;
                } else {
                  if (var7 < 160) {
                    L3: {
                      var8 = vk.field_e[-128 + var7];
                      if (var8 != 0) {
                        break L3;
                      } else {
                        var8 = 63;
                        break L3;
                      }
                    }
                    var7 = var8;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              var5++;
              var10[var5] = (char)var7;
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 <= 9) {
            field_e = null;
        }
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ie[10];
    }
}
