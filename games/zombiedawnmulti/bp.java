/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp extends un {
    static cj field_u;
    static int field_r;
    static ja field_s;
    static String[] field_v;
    static cj field_w;
    static String field_t;
    static boolean field_q;

    final re a(boolean param0, String param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        var4 = (CharSequence) (Object) param1;
        if (ti.a((byte) 57, var4)) {
          L0: {
            var5 = (CharSequence) (Object) param1;
            var3 = md.a(var5, -9159);
            if (-1 <= var3) {
              break L0;
            } else {
              if (-131 >= var3) {
                if (!param0) {
                  return db.field_b;
                } else {
                  return null;
                }
              } else {
                break L0;
              }
            }
          }
          return jq.field_b;
        } else {
          return jq.field_b;
        }
    }

    final static void a(kj param0, boolean param1, int param2) {
        int var5 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        ga var7 = ma.field_a;
        ga var8 = var7;
        var8.b((byte) -35, param2);
        var8.field_j = var8.field_j + 1;
        int var4 = var8.field_j;
        var8.a(108, 1);
        var8.a(param0.field_i, (byte) -95);
        var8.a(param0.field_v, (byte) -76);
        var8.a(param0.field_t, (byte) -66);
        var8.b(-116, param0.field_w);
        var8.b(-99, param0.field_x);
        var8.b(122, param0.field_l);
        var8.b(-128, param0.field_k);
        var8.a(-83, param0.field_y.length);
        for (var5 = 0; var5 < param0.field_y.length; var5++) {
            var7.b(52, param0.field_y[var5]);
        }
        if (!param1) {
            field_u = null;
        }
        int discarded$0 = var8.f(var4, 118);
        var8.e(77, var8.field_j + -var4);
    }

    bp(pm param0) {
        super(param0);
    }

    public static void h(int param0) {
        field_s = null;
        if (param0 != -3) {
            field_q = true;
        }
        field_t = null;
        field_v = null;
        field_w = null;
        field_u = null;
    }

    final static void a(int param0, k param1, go param2, int param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            Object var15 = null;
            String var16 = null;
            String var17 = null;
            int var18 = 0;
            lp var19 = null;
            byte[][] var20 = null;
            String var21 = null;
            String var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            byte[][] var25 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var14 = ZombieDawnMulti.field_E ? 1 : 0;
                        var19 = new lp();
                        var19.field_n = param1.g(31365);
                        var19.field_r = param1.i(param3 + -1478490340);
                        var19.field_m = new di[var19.field_n];
                        var19.field_o = new byte[var19.field_n][][];
                        var19.field_g = new int[var19.field_n];
                        var19.field_q = new int[var19.field_n];
                        var19.field_l = new di[var19.field_n];
                        var19.field_i = new int[var19.field_n];
                        var5 = 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (var19.field_n <= var5) {
                            statePc = 31;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            var6_int = param1.g(31365);
                            if (var6_int == 0) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof ClassNotFoundException ? 26 : (stateCaught_2 instanceof SecurityException ? 27 : (stateCaught_2 instanceof NullPointerException ? 28 : (stateCaught_2 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (-2 == (var6_int ^ -1)) {
                                statePc = 6;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof ClassNotFoundException ? 26 : (stateCaught_3 instanceof SecurityException ? 27 : (stateCaught_3 instanceof NullPointerException ? 28 : (stateCaught_3 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var6_int != 2) {
                                statePc = 9;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof ClassNotFoundException ? 26 : (stateCaught_4 instanceof SecurityException ? 27 : (stateCaught_4 instanceof NullPointerException ? 28 : (stateCaught_4 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof ClassNotFoundException ? 26 : (stateCaught_5 instanceof SecurityException ? 27 : (stateCaught_5 instanceof NullPointerException ? 28 : (stateCaught_5 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var17 = param1.f((byte) -43);
                            var7 = var17;
                            var16 = param1.f((byte) -61);
                            var8 = var16;
                            var9 = 0;
                            if (var6_int != 1) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof ClassNotFoundException ? 26 : (stateCaught_6 instanceof SecurityException ? 27 : (stateCaught_6 instanceof NullPointerException ? 28 : (stateCaught_6 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var9 = param1.i(param3 + -1478490340);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof ClassNotFoundException ? 26 : (stateCaught_7 instanceof SecurityException ? 27 : (stateCaught_7 instanceof NullPointerException ? 28 : (stateCaught_7 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var19.field_i[var5] = var6_int;
                            var19.field_q[var5] = var9;
                            var19.field_m[var5] = param2.a((byte) -89, var16, mq.a(var17, (byte) -29));
                            var5++;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof ClassNotFoundException ? 26 : (stateCaught_8 instanceof SecurityException ? 27 : (stateCaught_8 instanceof NullPointerException ? 28 : (stateCaught_8 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if ((var6_int ^ -1) == -4) {
                                statePc = 13;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof ClassNotFoundException ? 26 : (stateCaught_9 instanceof SecurityException ? 27 : (stateCaught_9 instanceof NullPointerException ? 28 : (stateCaught_9 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (var6_int == 4) {
                                statePc = 13;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof ClassNotFoundException ? 26 : (stateCaught_10 instanceof SecurityException ? 27 : (stateCaught_10 instanceof NullPointerException ? 28 : (stateCaught_10 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var5++;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof ClassNotFoundException ? 26 : (stateCaught_11 instanceof SecurityException ? 27 : (stateCaught_11 instanceof NullPointerException ? 28 : (stateCaught_11 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var21 = param1.f((byte) -32);
                            var22 = param1.f((byte) -55);
                            var9 = param1.g(31365);
                            var10 = new String[var9];
                            var11_int = 0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof ClassNotFoundException ? 26 : (stateCaught_13 instanceof SecurityException ? 27 : (stateCaught_13 instanceof NullPointerException ? 28 : (stateCaught_13 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (var9 <= var11_int) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof ClassNotFoundException ? 26 : (stateCaught_14 instanceof SecurityException ? 27 : (stateCaught_14 instanceof NullPointerException ? 28 : (stateCaught_14 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var10[var11_int] = param1.f((byte) -8);
                            var11_int++;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof ClassNotFoundException ? 26 : (stateCaught_15 instanceof SecurityException ? 27 : (stateCaught_15 instanceof NullPointerException ? 28 : (stateCaught_15 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var25 = new byte[var9][];
                            var24 = var25;
                            var23 = var24;
                            var20 = var23;
                            var11 = var20;
                            if (-4 == (var6_int ^ -1)) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ClassNotFoundException ? 26 : (stateCaught_16 instanceof SecurityException ? 27 : (stateCaught_16 instanceof NullPointerException ? 28 : (stateCaught_16 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ClassNotFoundException ? 26 : (stateCaught_17 instanceof SecurityException ? 27 : (stateCaught_17 instanceof NullPointerException ? 28 : (stateCaught_17 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var12_int = 0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ClassNotFoundException ? 26 : (stateCaught_18 instanceof SecurityException ? 27 : (stateCaught_18 instanceof NullPointerException ? 28 : (stateCaught_18 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var9 <= var12_int) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ClassNotFoundException ? 26 : (stateCaught_19 instanceof SecurityException ? 27 : (stateCaught_19 instanceof NullPointerException ? 28 : (stateCaught_19 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var13 = param1.i(-1478490344);
                            var11[var12_int] = new byte[var13];
                            param1.a(0, param3 + -6347, var13, var25[var12_int]);
                            var12_int++;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ClassNotFoundException ? 26 : (stateCaught_20 instanceof SecurityException ? 27 : (stateCaught_20 instanceof NullPointerException ? 28 : (stateCaught_20 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var19.field_i[var5] = var6_int;
                            var12 = new Class[var9];
                            var18 = 0;
                            var13 = var18;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ClassNotFoundException ? 26 : (stateCaught_21 instanceof SecurityException ? 27 : (stateCaught_21 instanceof NullPointerException ? 28 : (stateCaught_21 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var9 <= var18) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ClassNotFoundException ? 26 : (stateCaught_22 instanceof SecurityException ? 27 : (stateCaught_22 instanceof NullPointerException ? 28 : (stateCaught_22 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var12[var18] = mq.a(var10[var18], (byte) -119);
                            var18++;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ClassNotFoundException ? 26 : (stateCaught_23 instanceof SecurityException ? 27 : (stateCaught_23 instanceof NullPointerException ? 28 : (stateCaught_23 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var19.field_l[var5] = param2.a(var12, false, mq.a(var21, (byte) -123), var22);
                            var19.field_o[var5] = var25;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ClassNotFoundException ? 26 : (stateCaught_24 instanceof SecurityException ? 27 : (stateCaught_24 instanceof NullPointerException ? 28 : (stateCaught_24 instanceof Exception ? 29 : 30))));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 26: {
                        var6 = (ClassNotFoundException) (Object) caughtException;
                        var19.field_g[var5] = -1;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 27: {
                        var6_ref = (SecurityException) (Object) caughtException;
                        var19.field_g[var5] = -2;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 28: {
                        var6_ref2 = (NullPointerException) (Object) caughtException;
                        var19.field_g[var5] = -3;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 29: {
                        var6_ref3 = (Exception) (Object) caughtException;
                        var19.field_g[var5] = -4;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 30: {
                        var6_ref4 = caughtException;
                        var19.field_g[var5] = -5;
                        var5++;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 31: {
                        we.field_k.a((br) (Object) var19, false);
                        if (param3 == -4) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        var15 = null;
                        bp.a(-51, (k) null, (go) null, 59);
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
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

    final String a(String param0, int param1) {
        if (!(((bp) this).a(false, param0) != jq.field_b)) {
            return ob.field_z;
        }
        if (param1 == -1276425040) {
            return null;
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_u = new cj();
    }
}
