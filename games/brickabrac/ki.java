/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ki {
    private String field_h;
    int field_m;
    static int field_a;
    static String field_g;
    vm field_n;
    static String field_o;
    static of field_p;
    private int[] field_c;
    private oe[] field_b;
    private String[] field_j;
    boolean field_q;
    int field_l;
    static int field_e;
    static int[] field_i;
    static mf field_f;
    static jp[][] field_k;
    static int field_d;

    jp c(byte param0) {
        if (param0 > -74) {
            return null;
        }
        return kb.field_Ub[gb.field_n];
    }

    final oe[] a(int param0) {
        String var3 = null;
        String var2 = null;
        if (!(((ki) this).field_l >= ((ki) this).field_b.length)) {
            var3 = ((ki) this).field_j[((ki) this).field_c[((ki) this).field_l]];
            var2 = var3;
            if (BrickABrac.field_I.a(var2, "", (byte) -121)) {
                ((ki) this).field_b[((ki) this).field_l] = l.field_m.a(var3, "", (byte) 122);
            }
            if (!(!og.field_gc.a(var2, "", (byte) -121))) {
                ((ki) this).field_b[((ki) this).field_l] = l.field_m.a((byte) 28, var3, "");
            }
            if (!(((ki) this).field_b[((ki) this).field_l] == null)) {
                ((ki) this).field_l = ((ki) this).field_l + 1;
            }
        }
        if (param0 != 0) {
            field_f = null;
        }
        return ((ki) this).field_b;
    }

    abstract void a(boolean param0, int param1, int param2, int param3, int param4);

    jp[] b(int param0) {
        if (param0 >= -12) {
            return null;
        }
        return im.field_a;
    }

    ki(int param0, String param1, String param2, int param3) {
        this(param0, param1, uc.a(param3, param2, (byte) -1));
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = BrickABrac.field_J ? 1 : 0;
          if (param4 > param1) {
            if (param4 >= param5) {
              if (param5 > param1) {
                int discarded$76 = 0;
                k.a(param2, param6, param1, lb.field_l, param4, param5, param0, param3);
                break L0;
              } else {
                int discarded$77 = 0;
                k.a(param3, param6, param5, lb.field_l, param4, param1, param0, param2);
                break L0;
              }
            } else {
              int discarded$78 = 0;
              k.a(param6, param2, param1, lb.field_l, param5, param4, param0, param3);
              break L0;
            }
          } else {
            if (param5 > param1) {
              int discarded$79 = 0;
              k.a(param3, param2, param4, lb.field_l, param5, param1, param0, param6);
              break L0;
            } else {
              if (param4 < param5) {
                int discarded$80 = 0;
                k.a(param2, param3, param4, lb.field_l, param1, param5, param0, param6);
                break L0;
              } else {
                int discarded$81 = 0;
                k.a(param6, param3, param5, lb.field_l, param1, param4, param0, param2);
                break L0;
              }
            }
          }
        }
        var8 = 0;
    }

    final void e(int param0) {
        if (!((ki) this).b((byte) -99)) {
            boolean discarded$0 = ((ki) this).a(false);
        }
        if (param0 != 1) {
            Object var3 = null;
            String discarded$1 = ki.a((java.applet.Applet) null, 122, (String) null);
        }
    }

    jp[] a(byte param0, int param1) {
        int var3 = -89 % ((param0 - 65) / 49);
        return null;
    }

    abstract boolean a(boolean param0);

    abstract boolean b(byte param0);

    jp a(boolean param0, int param1) {
        if (param0) {
            return null;
        }
        field_g = null;
        return null;
    }

    abstract void a(byte param0, int param1, int param2, int param3);

    public static void a(byte param0) {
        if (param0 != 7) {
            return;
        }
        field_o = null;
        field_i = null;
        field_p = null;
        field_g = null;
        field_k = null;
        field_f = null;
    }

    final void d(int param0) {
        if (((ki) this).field_n == null) {
            vm dupTemp$0 = vm.a(mh.field_lb, "", ((ki) this).field_h);
            ((ki) this).field_n = dupTemp$0;
            if (!(dupTemp$0 != null)) {
                return;
            }
        }
        if (!m.field_f.a(param0 ^ -74, ((ki) this).field_n, 22050, ji.field_a, l.field_m)) {
            return;
        }
        if (sk.field_H > 0) {
            int fieldTemp$1 = sk.field_H - 1;
            sk.field_H = sk.field_H - 1;
            if (0 == fieldTemp$1) {
                m.field_f.a((byte) 118);
            }
        }
        ((ki) this).field_q = true;
        if (param0 != 59) {
            oe[] discarded$2 = ((ki) this).a(-106);
        }
    }

    final static String a(java.applet.Applet param0, int param1, String param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_8_0 = null;
            Object stackIn_13_0 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            String stackOut_7_0 = null;
            Object stackOut_12_0 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = BrickABrac.field_J ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param1 >= 74) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            ki.a((byte) 0);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3 = (String) ne.a("getcookies", -127, param0);
                            var4 = qb.a((byte) 122, var3, ';');
                            var5 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 12;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) param2)) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = var4[var5].substring(1 + var6).trim();
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0;
                    }
                    case 9: {
                        try {
                            var5++;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var3_ref = caughtException;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = null;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return (String) (Object) stackIn_13_0;
                    }
                    case 14: {
                        var3_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_14_0 = (RuntimeException) var3_ref2;
                        stackOut_14_1 = new StringBuilder().append("ki.W(");
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (param0 == null) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                        stackOut_15_2 = "{...}";
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_17_2 = stackOut_15_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "null";
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param1).append(44);
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (param2 == null) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "{...}";
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 19: {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "null";
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        throw qb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
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

    int c(int param0) {
        if (param0 > -72) {
            jp[] discarded$0 = ((ki) this).a(57, false);
        }
        return 256;
    }

    abstract void a(int param0, byte param1, int param2, int param3, int param4);

    jp[] a(int param0, boolean param1) {
        if (param1) {
            return null;
        }
        return null;
    }

    private ki(int param0, String param1, String[] param2) {
        int var4_int = 0;
        try {
            ((ki) this).field_h = param1;
            ((ki) this).field_m = param0;
            ((ki) this).field_j = param2;
            ((ki) this).field_b = new oe[((ki) this).field_j.length];
            ((ki) this).field_c = new int[((ki) this).field_j.length];
            for (var4_int = 0; ((ki) this).field_c.length > var4_int; var4_int++) {
                ((ki) this).field_c[var4_int] = var4_int;
            }
            ke.a(((ki) this).field_c, (byte) 39, hi.field_w);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ki.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Please select options in the following rows:  ";
        field_a = 1;
        field_o = "World select";
        field_e = 0;
        field_p = new of();
        field_i = new int[5];
        field_d = 256;
    }
}
