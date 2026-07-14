/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn implements ca {
    private se field_g;
    static int[] field_k;
    static int field_d;
    private int field_b;
    private int field_i;
    static boolean field_c;
    static gn field_l;
    private int field_f;
    private int field_m;
    static cn field_a;
    private int field_j;
    private int field_e;
    private int field_h;
    static lg field_n;

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        j var14 = null;
        lm stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        lm stackOut_1_0 = null;
        L0: {
          if (!(param1 instanceof j)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (lm) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (lm) param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (j) (Object) stackIn_3_0;
          gf.b(param1.field_q + param2, param3 + param1.field_v, param1.field_x, param1.field_s, ((jn) this).field_i);
          if (var14 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        var7 = param2 + param1.field_q - -var14.field_I;
        var8 = var14.field_R + param1.field_v + param3;
        gf.f(var7, var8, var14.field_M, ((jn) this).field_h);
        if (param0 == 34) {
          L2: {
            if ((var14.field_P ^ -1) != 0) {
              var9 = 2.0 * ((double)var14.field_P * 3.141592653589793) / (double)var14.field_N;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_M);
              var12 = (int)(Math.cos(var9) * (double)var14.field_M);
              gf.f(var7 + var11, var8 - -var12, 1, ((jn) this).field_b);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            gf.f(var7, var8, 2, 1);
            var9 = (double)var14.field_K * 3.141592653589793 * 2.0 / (double)var14.field_N;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_M);
            var12 = (int)(Math.cos(var9) * (double)var14.field_M);
            gf.c(var7, var8, var11 + var7, var12 + var8, 1);
            if (null == ((jn) this).field_g) {
              break L3;
            } else {
              var13 = ((jn) this).field_e + var14.field_I + var14.field_M;
              int discarded$1 = ((jn) this).field_g.a(param1.field_w, param1.field_q + param2 + var13, ((jn) this).field_m + param1.field_v + param3, -((jn) this).field_e - var13 + param1.field_x, -(((jn) this).field_e << -13478399) + param1.field_s, ((jn) this).field_f, ((jn) this).field_j, 1, 1, 0);
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static String[] a(String param0, int[] param1, int param2, se param3) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = null;
        int var4 = 0;
        String[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        String[] var9 = null;
        String[] var10 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = DungeonAssault.field_K;
                    if (wk.field_a != null) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    wk.field_a = new String[16];
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (param2 <= -59) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var8 = null;
                    String[] discarded$2 = jn.a((String) null, (int[]) null, -127, (se) null);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        var4 = param3.a(param0, param1, wk.field_a);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    arrayIndexOutOfBoundsException = (ArrayIndexOutOfBoundsException) (Object) caughtException;
                    if (wk.field_a.length < 1024) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return null;
                }
                case 8: {
                    wk.field_a = new String[wk.field_a.length << 1155248577];
                    statePc = 4;
                    continue stateLoop;
                }
                case 9: {
                    var9 = new String[var4];
                    var10 = var9;
                    var5 = var10;
                    var6 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var6 >= var4) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var9[var6] = new String(wk.field_a[var6]);
                    var6++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 12: {
                    ig.a(var10, (byte) -121);
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_k = null;
        if (param0 != 1) {
            field_c = false;
        }
        field_l = null;
        field_a = null;
    }

    jn(se param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((jn) this).field_f = param3;
        ((jn) this).field_j = param4;
        ((jn) this).field_e = param1;
        ((jn) this).field_h = param5;
        ((jn) this).field_m = param2;
        ((jn) this).field_g = param0;
        ((jn) this).field_b = param6;
        ((jn) this).field_i = param7;
    }

    static {
    }
}
