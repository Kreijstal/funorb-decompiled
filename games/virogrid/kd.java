/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends qe {
    static mg[] field_p;
    private boolean field_s;
    static String field_r;
    private ci field_o;
    static float field_t;
    static String field_n;
    private String field_q;

    public static void c(byte param0) {
        field_r = null;
        if (param0 >= -84) {
          kd.c(false);
        }
        field_p = null;
        field_n = null;
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_o.a(param1, true) == ee.field_c) {
            stackIn_3_0 = this.field_o.a(param0 + 0, param1);
            return stackIn_3_0;
          }
          if (this.a(param1, true) == ee.field_c) {
            stackIn_6_0 = sg.field_g;
            return stackIn_6_0;
          }
          if (param0 != -26358) {
            kd.c((byte) -2);
          }
          stackIn_10_0 = bk.field_c;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("kd.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(byte param0, String param1) {
        try {
          int var2_int = 32 / ((-65 - param0) / 43);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "kd.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(mg[] param0, int param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        mg[] var12 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != null &&
            0 < param3) {
            var6_int = param0[0].field_u;
            var7 = param0[2].field_u;
            var8 = param0[1].field_u;
            param0[0].c(param4, param1, param5);
            param0[2].c(param3 + param4 - var7, param1, param5);
            df.b(od.field_m);
            df.h(param4 + var6_int, param1, -var7 + (param4 + param3), param1 + param0[1].field_z);
            var9 = param4 + var6_int;
            var10 = param4 + (param3 - var7);
            for (param4 = var9; var10 > param4; param4 = param4 + var8) {
              param0[1].c(param4, param1, param5);
            }
            df.a(od.field_m);
            if (param2) {
              var12 = (mg[]) null;
              kd.a((mg[]) null, 31, true, 51, -96, 109);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("kd.Q(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static mg[] c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Virogrid.field_F ? 1 : 0;
        mg[] var1 = new mg[rj.field_h];
        if (!param0) {
          return (mg[]) null;
        }
        for (var2 = 0; rj.field_h > var2; var2++) {
          var3 = db.field_k[var2] * gb.field_F[var2];
          var4 = lj.field_j[var2];
          var5 = new int[var3];
          for (var6 = 0; var6 < var3; var6++) {
            var5[var6] = k.field_c[rb.a((int) var4[var6], 255)];
          }
          var1[var2] = new mg(oj.field_Kb, se.field_d, el.field_w[var2], mb.field_bb[var2], db.field_k[var2], gb.field_F[var2], var5);
        }
        pe.b((byte) -28);
        return var1;
    }

    kd(wa param0, wa param1) {
        super(param0);
        this.field_s = false;
        this.field_q = "";
        try {
          this.field_o = new ci(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "kd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, int[] param1) {
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        bj var4_ref_bj = null;
        int var4 = 0;
        int var5_int = 0;
        bj var5 = null;
        int var6 = 0;
        int var7 = 0;
        mg[] var8 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Virogrid.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 <= -117) {
                            statePc = 3;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 2. */
                            {
                                var8 = (mg[]) null;
                                kd.a((mg[]) null, -48, false, 30, 95, 36);
                                statePc = 3;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (ug.field_a == kh.field_c) {
                            /* Inlined CFG state: 6. */
                            {
                                var2_long = hc.a(-9986);
                                if (kg.field_e == 0) {
                                    statePc = 17;
                                } else {
                                    statePc = 7;
                                }
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 4. */
                            {
                                stackIn_5_0 = 0;
                                statePc = 5;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_3) {
                        statePc = ((Object) stateCaught_3 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_3);
                        }
                        caughtException = stateCaught_3;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 7: {
                    try {
                        if (0 > s.field_g) {
                            /* Inlined CFG state: 9. */
                            {
                                var4_ref_bj = (bj) (ac.field_d.a((byte) -120));
                                if (var4_ref_bj == null) {
                                    statePc = 18;
                                } else {
                                    statePc = 10;
                                }
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 8. */
                            {
                                statePc = 17;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_7) {
                        statePc = ((Object) stateCaught_7 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_7);
                        }
                        caughtException = stateCaught_7;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (~var2_long < ~var4_ref_bj.field_p) {
                            /* Inlined CFG state: 12. */
                            {
                                var4_ref_bj.a(false);
                                ba.field_a = var4_ref_bj.field_l.length;
                                sh.field_qb.field_l = 0;
                                var5_int = 0;
                                statePc = 13;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 11. */
                            {
                                statePc = 18;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_10) {
                        statePc = ((Object) stateCaught_10 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_10);
                        }
                        caughtException = stateCaught_10;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (ba.field_a <= var5_int) {
                            /* Inlined CFG state: 15. */
                            {
                                ah.field_e = pl.field_c;
                                pl.field_c = md.field_b;
                                md.field_b = ci.field_q;
                                ci.field_q = var4_ref_bj.field_i;
                                stackIn_16_0 = 1;
                                statePc = 16;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 14. */
                            {
                                sh.field_qb.field_g[var5_int] = var4_ref_bj.field_l[var5_int];
                                var5_int++;
                                statePc = 13;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_13) {
                        statePc = ((Object) stateCaught_13 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_13);
                        }
                        caughtException = stateCaught_13;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    stackIn_20_0 = s.field_g;
                    statePc = 20;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = s.field_g;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        stackIn_20_0 = s.field_g;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        statePc = ((Object) stateCaught_19 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_19);
                        }
                        caughtException = stateCaught_19;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 >= 0) {
                            statePc = 25;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 21. */
                            {
                                sh.field_qb.field_l = 0;
                                if (wg.a(1, 0)) {
                                    /* Inlined CFG state: 24. */
                                    {
                                        s.field_g = sh.field_qb.e(false);
                                        sh.field_qb.field_l = 0;
                                        ba.field_a = param1[s.field_g];
                                        statePc = 25;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 22. */
                                    {
                                        stackIn_23_0 = 0;
                                        statePc = 23;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_20) {
                        statePc = ((Object) stateCaught_20 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_20);
                        }
                        caughtException = stateCaught_20;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0 != 0;
                }
                case 25: {
                    try {
                        if (ic.c((byte) 48)) {
                            /* Inlined CFG state: 28. */
                            {
                                if (kg.field_e == 0) {
                                    /* Inlined CFG state: 37. */
                                    {
                                        ah.field_e = pl.field_c;
                                        pl.field_c = md.field_b;
                                        md.field_b = ci.field_q;
                                        ci.field_q = s.field_g;
                                        s.field_g = -1;
                                        stackIn_38_0 = 1;
                                        statePc = 38;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 29. */
                                    {
                                        var4 = kg.field_e;
                                        if (0.0 == qa.field_b) {
                                            statePc = 33;
                                        } else {
                                            statePc = 30;
                                        }
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 26. */
                            {
                                stackIn_27_0 = 0;
                                statePc = 27;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_25) {
                        statePc = ((Object) stateCaught_25 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_25);
                        }
                        caughtException = stateCaught_25;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0 != 0;
                }
                case 30: {
                    try {
                        var4 = (int)((double)var4 + mc.field_c.nextGaussian() * qa.field_b);
                        if (var4 < 0) {
                            /* Inlined CFG state: 32. */
                            {
                                var4 = 0;
                                statePc = 33;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 31. */
                            {
                                statePc = 33;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_30) {
                        statePc = ((Object) stateCaught_30 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_30);
                        }
                        caughtException = stateCaught_30;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var5 = new bj((long)var4 + var2_long, s.field_g, new byte[ba.field_a]);
                        var6 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        statePc = ((Object) stateCaught_33 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_33);
                        }
                        caughtException = stateCaught_33;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (ba.field_a <= var6) {
                            /* Inlined CFG state: 36. */
                            {
                                ac.field_d.a(var5, (byte) -68);
                                s.field_g = -1;
                                statePc = 19;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 35. */
                            {
                                var5.field_l[var6] = sh.field_qb.field_g[var6];
                                var6++;
                                statePc = 34;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_34) {
                        statePc = ((Object) stateCaught_34 instanceof RuntimeException ? 39 : -1);
                        if (statePc == -1) {
                            throw kd.<RuntimeException>$cfr$sneakyThrow(stateCaught_34);
                        }
                        caughtException = stateCaught_34;
                        continue stateLoop;
                    }
                }
                case 38: {
                    return stackIn_38_0 != 0;
                }
                case 39: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_41_0 = (RuntimeException) (var2);
                    stackIn_40_0 = stackIn_41_0;
                    stackIn_41_1 = new StringBuilder().append("kd.J(").append(param0).append(',');
                    stackIn_40_1 = stackIn_41_1;
                    if (param1 == null) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_42_0 = stackIn_40_0;
                    stackIn_42_1 = stackIn_40_1;
                    stackIn_42_2 = "{...}";
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = stackIn_41_0;
                    stackIn_42_1 = stackIn_41_1;
                    stackIn_42_2 = "null";
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    throw kg.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(')').toString());
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final wl a(String param0, boolean param1) {
        kg var3 = null;
        RuntimeException var3_ref = null;
        wl stackIn_2_0 = null;
        wl stackIn_7_0 = null;
        wl stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_o.a(param0, param1) == ee.field_c) {
            stackIn_2_0 = ee.field_c;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_q)) {
            var3 = ub.a(99, param0);
            if (!var3.b(-114)) {
              stackIn_7_0 = te.field_d;
              return stackIn_7_0;
            }
            this.field_q = param0;
            this.field_s = var3.a((byte) -47);
          }
          if (this.field_s) {
            stackIn_12_0 = bm.field_i;
          } else {
            stackIn_12_0 = ee.field_c;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("kd.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_r = "Reject";
        field_n = "Macroing or use of bots";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
