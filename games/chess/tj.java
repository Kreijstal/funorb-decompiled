/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends vm {
    static int field_o;
    static String[] field_p;
    static ta field_n;
    static boolean field_l;
    static long field_m;

    public static void i(int param0) {
        if (param0 != -19374) {
          um var2 = (um) null;
          tj.a(-38, -11, (um) null, (byte) -109);
        }
        field_p = null;
        field_n = null;
    }

    final static void b(byte param0) {
        int var1 = -45 % ((param0 + 50) / 58);
        dc.field_q = new ci(0L, (ci) null);
        if (bo.field_c) {
          dc.field_q.a((byte) 127, fe.field_h);
        }
        dc.field_q.a((byte) 124, bh.field_G);
        wf.field_W = new id(ja.field_c, dc.field_q);
        ql.field_d = new ci(0L, (ci) null);
        ql.field_d.a((byte) 124, wf.field_W.field_a);
        ql.field_d.a((byte) 123, ln.field_cc);
        e.g((byte) -128);
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        um var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.length;
          var3 = new byte[var2_int];
          if (param0 >= -12) {
            var4 = (um) null;
            tj.a(93, 27, (um) null, (byte) 6);
          }
          ne.a(param1, 0, var3, 0, var2_int);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("tj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -9316) {
            field_o = 22;
          }
          if (this.a((byte) -121, param0) != qk.field_b) {
            stackIn_6_0 = ie.field_c;
            return stackIn_6_0;
          }
          stackIn_4_0 = bd.field_c;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("tj.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean h(int param0) {
        if (param0 < 53) {
          int[] var2 = (int[]) null;
          tj.a((byte) -38, (int[]) null);
        }
        return null == rm.field_R ? wc.field_x : true;
    }

    final static boolean a(int param0, int param1, um param2, byte param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int[] var5 = null;
        byte[] var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 83) {
            var5 = (int[]) null;
            tj.a((byte) -103, (int[]) null);
          }
          var6 = param2.a(param0, param1, param3 + 5764);
          var4 = var6;
          if (var6 == null) {
            return false;
          }
          b.a(122, var6);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("tj.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(byte param0, int[] param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        tf var4_ref_tf = null;
        int var4 = 0;
        int var5_int = 0;
        tf var5 = null;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ik.field_e != tb.field_f) {
                            /* Inlined CFG state: 3. */
                            {
                                stackIn_4_0 = 0;
                                statePc = 4;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 2. */
                            {
                                /* Sequential CFG blocks: 2, 5. */
                                {
                                }
                                {
                                    if (param0 == 103) {
                                        /* Inlined CFG state: 8. */
                                        {
                                            var2_long = ud.a(2);
                                            if (0 == fh.field_d) {
                                                statePc = 17;
                                            } else {
                                                statePc = 9;
                                            }
                                            continue stateLoop;
                                        }
                                    } else {
                                        /* Inlined CFG state: 6. */
                                        {
                                            stackIn_7_0 = 1;
                                            statePc = 7;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 41 : -1);
                        if (statePc == -1) {
                            throw tj.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 9: {
                    try {
                        if (0 <= da.field_p) {
                            statePc = 17;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 10. */
                            {
                                var4_ref_tf = (tf) (kn.field_I.g(-18110));
                                if (var4_ref_tf == null) {
                                    statePc = 18;
                                } else {
                                    statePc = 11;
                                }
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_9) {
                        statePc = ((Object) stateCaught_9 instanceof RuntimeException ? 41 : -1);
                        if (statePc == -1) {
                            throw tj.<RuntimeException>$cfr$sneakyThrow(stateCaught_9);
                        }
                        caughtException = stateCaught_9;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (~var4_ref_tf.field_m <= ~var2_long) {
                            statePc = 18;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 12. */
                            {
                                var4_ref_tf.c(-2193);
                                sb.field_sb = var4_ref_tf.field_j.length;
                                tk.field_h.field_l = 0;
                                var5_int = 0;
                                statePc = 13;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_11) {
                        statePc = ((Object) stateCaught_11 instanceof RuntimeException ? 41 : -1);
                        if (statePc == -1) {
                            throw tj.<RuntimeException>$cfr$sneakyThrow(stateCaught_11);
                        }
                        caughtException = stateCaught_11;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var5_int >= sb.field_sb) {
                            /* Inlined CFG state: 15. */
                            {
                                lf.field_T = wc.field_u;
                                wc.field_u = hh.field_o;
                                hh.field_o = wg.field_B;
                                wg.field_B = var4_ref_tf.field_n;
                                stackIn_16_0 = 1;
                                statePc = 16;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 14. */
                            {
                                tk.field_h.field_o[var5_int] = var4_ref_tf.field_j[var5_int];
                                var5_int++;
                                statePc = 13;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_13) {
                        statePc = ((Object) stateCaught_13 instanceof RuntimeException ? 41 : -1);
                        if (statePc == -1) {
                            throw tj.<RuntimeException>$cfr$sneakyThrow(stateCaught_13);
                        }
                        caughtException = stateCaught_13;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    stackIn_20_0 = da.field_p;
                    statePc = 20;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = da.field_p;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        stackIn_20_0 = da.field_p;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        statePc = ((Object) stateCaught_19 instanceof RuntimeException ? 41 : -1);
                        if (statePc == -1) {
                            throw tj.<RuntimeException>$cfr$sneakyThrow(stateCaught_19);
                        }
                        caughtException = stateCaught_19;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 >= 0) {
                            statePc = 26;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 21. */
                            {
                                tk.field_h.field_l = 0;
                                if (!tk.a(param0 - 222, 1)) {
                                    /* Inlined CFG state: 23. */
                                    {
                                        stackIn_24_0 = 0;
                                        statePc = 24;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 22. */
                                    {
                                        /* Sequential CFG blocks: 22, 25. */
                                        {
                                        }
                                        {
                                            da.field_p = tk.field_h.n(param0 ^ -31);
                                            tk.field_h.field_l = 0;
                                            sb.field_sb = param1[da.field_p];
                                            statePc = 26;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_20) {
                        statePc = ((Object) stateCaught_20 instanceof RuntimeException ? 41 : -1);
                        if (statePc == -1) {
                            throw tj.<RuntimeException>$cfr$sneakyThrow(stateCaught_20);
                        }
                        caughtException = stateCaught_20;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0 != 0;
                }
                case 26: {
                    try {
                        if (!jl.a(false)) {
                            /* Inlined CFG state: 28. */
                            {
                                stackIn_29_0 = 0;
                                statePc = 29;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 27. */
                            {
                                /* Sequential CFG blocks: 27, 30. */
                                {
                                }
                                {
                                    if (fh.field_d == 0) {
                                        /* Inlined CFG state: 39. */
                                        {
                                            lf.field_T = wc.field_u;
                                            wc.field_u = hh.field_o;
                                            hh.field_o = wg.field_B;
                                            wg.field_B = da.field_p;
                                            da.field_p = -1;
                                            stackIn_40_0 = 1;
                                            statePc = 40;
                                            continue stateLoop;
                                        }
                                    } else {
                                        /* Inlined CFG state: 31. */
                                        {
                                            var4 = fh.field_d;
                                            if (0.0 != rl.field_b) {
                                                statePc = 33;
                                            } else {
                                                statePc = 32;
                                            }
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_26) {
                        statePc = ((Object) stateCaught_26 instanceof RuntimeException ? 41 : -1);
                        if (statePc == -1) {
                            throw tj.<RuntimeException>$cfr$sneakyThrow(stateCaught_26);
                        }
                        caughtException = stateCaught_26;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0 != 0;
                }
                case 32: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        statePc = ((Object) stateCaught_32 instanceof RuntimeException ? 41 : -1);
                        if (statePc == -1) {
                            throw tj.<RuntimeException>$cfr$sneakyThrow(stateCaught_32);
                        }
                        caughtException = stateCaught_32;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var4 = (int)((double)var4 + ph.field_d.nextGaussian() * rl.field_b);
                        if (var4 >= 0) {
                            statePc = 35;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 34. */
                            {
                                var4 = 0;
                                statePc = 35;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_33) {
                        statePc = ((Object) stateCaught_33 instanceof RuntimeException ? 41 : -1);
                        if (statePc == -1) {
                            throw tj.<RuntimeException>$cfr$sneakyThrow(stateCaught_33);
                        }
                        caughtException = stateCaught_33;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5 = new tf((long)var4 + var2_long, da.field_p, new byte[sb.field_sb]);
                        var6 = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        statePc = ((Object) stateCaught_35 instanceof RuntimeException ? 41 : -1);
                        if (statePc == -1) {
                            throw tj.<RuntimeException>$cfr$sneakyThrow(stateCaught_35);
                        }
                        caughtException = stateCaught_35;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var6 >= sb.field_sb) {
                            /* Inlined CFG state: 38. */
                            {
                                kn.field_I.a((o) (var5), (byte) -122);
                                da.field_p = -1;
                                statePc = 19;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 37. */
                            {
                                var5.field_j[var6] = tk.field_h.field_o[var6];
                                var6++;
                                statePc = 36;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_36) {
                        statePc = ((Object) stateCaught_36 instanceof RuntimeException ? 41 : -1);
                        if (statePc == -1) {
                            throw tj.<RuntimeException>$cfr$sneakyThrow(stateCaught_36);
                        }
                        caughtException = stateCaught_36;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return stackIn_40_0 != 0;
                }
                case 41: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_43_0 = (RuntimeException) (var2);
                    stackIn_42_0 = stackIn_43_0;
                    stackIn_43_1 = new StringBuilder().append("tj.T(").append(param0).append(',');
                    stackIn_42_1 = stackIn_43_1;
                    if (param1 == null) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackIn_44_0 = stackIn_42_0;
                    stackIn_44_1 = stackIn_42_1;
                    stackIn_44_2 = "{...}";
                    statePc = 44;
                    continue stateLoop;
                }
                case 43: {
                    stackIn_44_0 = stackIn_43_0;
                    stackIn_44_1 = stackIn_43_1;
                    stackIn_44_2 = "null";
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    throw fk.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(')').toString());
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final mk a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        mk stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (null != mn.a(param1, 19525)) ? 0 : 1;
          var3_int = stackIn_3_0;
          var4 = 63 / ((param0 + 49) / 62);
          if (var3_int != 0) {
            return oa.field_a;
          }
          stackIn_6_0 = qk.field_b;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("tj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    tj(qn param0) {
        super(param0);
    }

    static {
        field_l = true;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
