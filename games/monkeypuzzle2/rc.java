/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends kc {
    private String field_e;
    static int field_g;
    static int field_f;
    static double field_l;
    static int[] field_j;
    static md field_k;
    static String field_i;
    private String field_h;

    final fk a(boolean param0) {
        if (param0) {
            return null;
        }
        return te.field_a;
    }

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = -1;
        var5 = param0;
        if (param2 >= 8) {
          L0: while (true) {
            if (param1 <= var5) {
              var4 = var4 ^ -1;
              return var4;
            } else {
              var4 = var4 >>> 904932200 ^ hb.field_k[(param3[var5] ^ var4) & 255];
              var5++;
              continue L0;
            }
          }
        } else {
          return -111;
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        gk var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = new gk(param0);
                    var3 = var9.a((byte) 114);
                    if (param1 > 114) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_i = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var4 = var9.e(127);
                    if (var4 < 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (-1 == fa.field_r) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (fa.field_r < var4) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    throw new RuntimeException();
                }
                case 7: {
                    if (-1 == var3) {
                        statePc = 20;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var5_int = var9.e(-80);
                    if ((var5_int ^ -1) > -1) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (fa.field_r == 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (fa.field_r >= var5_int) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    throw new RuntimeException();
                }
                case 13: {
                    var16 = new byte[var5_int];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var6 = var10;
                    if (1 != var3) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    int discarded$3 = tg.a(var16, var5_int, param0, var4, 9);
                    return var6;
                }
                case 15: {
                    var7 = (Object) (Object) oe.field_o;
                    // monitorenter oe.field_o
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        oe.field_o.a(57, var16, var9);
                        // monitorexit var7
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return var6;
                }
                case 18: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 19: {
                    throw (RuntimeException) (Object) var8;
                }
                case 20: {
                    var17 = new byte[var4];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var5 = var11;
                    var9.a(var17, var4, -127, 0);
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(float param0, int param1, byte param2) {
        float[] var3 = null;
        float[] var4 = null;
        float[] var5 = null;
        float[] var6 = null;
        float[] var7 = null;
        float[] var8 = null;
        float[] var9 = null;
        float[] var10 = null;
        if (0 < param1) {
          if (-18 < (param1 ^ -1)) {
            if (param1 == 16) {
              bl.field_f = (int)pe.field_d[param1].field_e[0];
              mh.field_D = (int)pe.field_d[param1].field_e[1];
              return;
            } else {
              if (param2 != -111) {
                field_f = -35;
                var9 = ac.a(pe.field_d[param1].field_e, 120, pe.field_d[param1 + -1].field_e);
                var7 = var9;
                var6 = var7;
                var5 = var6;
                var4 = var5;
                var3 = var4;
                oa.a(param0, var9, 122);
                wj.a(var9, -92, pe.field_d[param1 + -1].field_e);
                bl.field_f = (int)var9[0];
                mh.field_D = (int)var9[1];
                return;
              } else {
                var10 = ac.a(pe.field_d[param1].field_e, 120, pe.field_d[param1 + -1].field_e);
                var8 = var10;
                var6 = var8;
                var5 = var6;
                var4 = var5;
                var3 = var4;
                oa.a(param0, var10, 122);
                wj.a(var10, -92, pe.field_d[param1 + -1].field_e);
                bl.field_f = (int)var10[0];
                mh.field_D = (int)var10[1];
                return;
              }
            }
          } else {
            bl.field_f = -1;
            mh.field_D = -1;
            return;
          }
        } else {
          bl.field_f = -1;
          mh.field_D = -1;
          return;
        }
    }

    final void a(int param0, gk param1) {
        int var3 = 126 % ((-34 - param0) / 53);
        param1.a(((rc) this).field_e, -45);
        param1.a(((rc) this).field_h, (byte) 57);
    }

    public static void b(byte param0) {
        field_i = null;
        field_j = null;
        if (param0 < 85) {
            field_k = null;
            field_k = null;
            return;
        }
        field_k = null;
    }

    rc(String param0, String param1) {
        ((rc) this).field_h = param1;
        ((rc) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0.0;
        field_j = new int[8192];
        field_i = null;
    }
}
