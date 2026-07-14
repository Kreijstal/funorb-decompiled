/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ln {
    static int[] field_c;
    static String[] field_a;
    static int field_b;

    final int a(long param0, int param1) {
        long var4 = 0L;
        var4 = ((ln) this).a((byte) -112);
        if (var4 > (long)param1) {
          ld.a(var4, (byte) 122);
          return ((ln) this).a(-99, param0);
        } else {
          return ((ln) this).a(-99, param0);
        }
    }

    final static aa a(boolean param0, int param1) {
        int var2 = 0;
        am var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Exception var7 = null;
        int var8 = 0;
        dm var9 = null;
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
                    var8 = ZombieDawn.field_J;
                    var2 = -59 / ((param1 - -17) / 52);
                    var3 = fj.field_g;
                    var4 = var3.d((byte) -128);
                    cg.field_e = 127 & var4;
                    if ((var4 & 128) == 0) {
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
                    vi.field_d = stackIn_3_0 != 0;
                    ei.field_J = var3.d((byte) -125);
                    ce.field_s = var3.c(true);
                    if (cg.field_e != 2) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ep.field_i = var3.f(2);
                    td.field_a = var3.g(-1875);
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    td.field_a = 0;
                    ep.field_i = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (1 != var3.d((byte) -115)) {
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
                    var5 = stackIn_9_0;
                    ea.field_b = var3.a(true);
                    if (var5 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    af.field_a = ea.field_b;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    af.field_a = var3.a(true);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (cg.field_e == 1) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if ((cg.field_e ^ -1) == -5) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 15: {
                    int discarded$4 = var3.f(2);
                    String discarded$5 = var3.a(true);
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    int discarded$6 = var3.f(2);
                    String discarded$7 = var3.a(true);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (!param0) {
                        statePc = 25;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var6 = var3.f(2);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        var9 = pa.field_y.a(75, var6);
                        ge.field_a = var9.e(80);
                        if (!af.field_a.equals((Object) (Object) ce.field_r)) {
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
                        stackOut_21_0 = var9.field_u;
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
                        vk.field_d = stackIn_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return new aa(param0);
                }
                case 24: {
                    var7 = (Exception) (Object) caughtException;
                    ae.a((Throwable) (Object) var7, 10331, "CC1");
                    vk.field_d = null;
                    ge.field_a = null;
                    return new aa(param0);
                }
                case 25: {
                    ge.field_a = jj.a(80, -23171, (de) (Object) var3);
                    vk.field_d = null;
                    return new aa(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    abstract void a(boolean param0);

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -5) {
            field_b = -64;
        }
    }

    abstract long a(byte param0);

    abstract int a(int param0, long param1);

    final static void a(int param0, int param1, String param2, String[] param3) {
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        var5 = ZombieDawn.field_J;
        fk.field_F = hm.field_H;
        if ((param0 ^ -1) != -256) {
          if ((param0 ^ -1) > -101) {
            mp.field_f = te.a(param2, -13466, param0);
            if (param1 == -14) {
              return;
            } else {
              field_c = null;
              return;
            }
          } else {
            if (param0 <= 105) {
              mp.field_f = ao.a(param3, -91);
              if (param1 != -14) {
                field_c = null;
                return;
              } else {
                return;
              }
            } else {
              mp.field_f = te.a(param2, -13466, param0);
              if (param1 != -14) {
                field_c = null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          L0: {
            stackOut_1_0 = 5;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if ((ae.field_a ^ -1) <= -14) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          mp.field_f = fl.a(stackIn_4_0, stackIn_4_1 != 0);
          if (param1 == -14) {
            return;
          } else {
            field_c = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_c = new int[]{};
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
