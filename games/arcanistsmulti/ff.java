/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static ll[] field_b;
    static String field_d;
    static int field_c;
    static String[] field_f;
    static String field_a;
    static String field_g;
    static String field_e;

    final static void a(byte param0, oo param1) {
        Object var3 = null;
        if (param0 != 91) {
          var3 = null;
          ff.a((byte) -45, (oo) null);
          param1.field_D = new int[]{-1};
          param1.field_z = new char[]{(char)63};
          return;
        } else {
          param1.field_D = new int[]{-1};
          param1.field_z = new char[]{(char)63};
          return;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 46) {
          field_c = -44;
          field_a = null;
          field_b = null;
          field_g = null;
          field_f = null;
          field_e = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_g = null;
          field_f = null;
          field_e = null;
          return;
        }
    }

    final static ij a(int[] param0, int param1, kc param2, kc param3, kc param4) {
        int var5 = 0;
        String[] var6 = null;
        char[] var7 = null;
        ij[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        tk var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ArcanistsMulti.field_G ? 1 : 0;
                    var5 = param0.length;
                    var6 = new String[var5];
                    var14 = new char[var5];
                    var13 = var14;
                    var7 = var13;
                    var8 = new ij[var5];
                    var9 = (char)param1;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var10_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5 <= var10_int) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var11 = th.field_d.a(param0[var10_int], (byte) -87);
                        var6[var10_int] = var11.c(true);
                        var9 = (char)(var9 + 1);
                        var7[var10_int] = (char)var9;
                        var8[var10_int] = null;
                        var10_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    var10 = (Exception) (Object) caughtException;
                    return null;
                }
                case 6: {
                    return new ij(0L, param4, param3, param2, var8, param0, var6, var14);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static qb[] a(byte param0, int param1, int param2, int param3) {
        Object var5 = null;
        if (param0 <= 25) {
          var5 = null;
          ff.a((byte) -74, (oo) null);
          return qa.a(param3, param1, 1, param2, (byte) 123);
        } else {
          return qa.a(param3, param1, 1, param2, (byte) 123);
        }
    }

    final static void a(boolean param0, String param1, byte param2, String param3) {
        ge.field_g = param3;
        vh.field_o = param1;
        jn.a(bj.field_qb, param0, -1);
        if (param2 != -97) {
            field_c = 14;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_d = "GAME DRAWN<br>(out of time)<br><br>";
        field_g = "This game option is only available to members.";
        field_e = "Names cannot contain consecutive spaces";
    }
}
