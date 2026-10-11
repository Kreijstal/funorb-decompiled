/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static RgbSprite field_b;
    static String field_f;
    static int[] field_a;
    static NodeDeque field_c;
    static int field_d;
    static String field_e;

    final static RgbSprite a(cm param0, String param1, String param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RgbSprite stackIn_2_0 = null;
        RgbSprite stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.a(param1, 32);
          if (param3) {
            stackIn_2_0 = (RgbSprite) null;
            return stackIn_2_0;
          }
          var5 = param0.a(var4_int, -32759, param2);
          stackIn_4_0 = im.a(param0, var5, var4_int, 1048576);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("rl.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_c = null;
        field_a = null;
        field_e = null;
        if (param0 == 0) {
          return;
        }
        field_d = -11;
    }

    final static boolean a(byte param0, int[] param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        kc var4_ref_kc = null;
        int var4 = 0;
        int var5_int = 0;
        kc var5 = null;
        int var6 = 0;
        int var7 = 0;
        scanLoop1: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SteelSentinels.obfuscationControl;
                    statePc = 1;
                    continue scanLoop1;
                }
                case 1: {
                    try {
                        if (rn.field_v == jd.field_sb) {
                            /* Inlined CFG state: 4. */
                            {
                                if (param0 > 10) {
                                    /* Inlined CFG state: 7. */
                                    {
                                        var2_long = mm.a(112);
                                        if (ej.field_H == 0) {
                                            statePc = 18;
                                        } else {
                                            statePc = 8;
                                        }
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 5. */
                                    {
                                        stackIn_6_0 = 1;
                                        statePc = 6;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 2. */
                            {
                                stackIn_3_0 = 0;
                                statePc = 3;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw rl.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue scanLoop1;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 8: {
                    try {
                        if (ub.field_g < 0) {
                            /* Inlined CFG state: 10. */
                            {
                                var4_ref_kc = (kc) (ll.field_r.first(13058));
                                if (var4_ref_kc == null) {
                                    statePc = 19;
                                } else {
                                    statePc = 11;
                                }
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 9. */
                            {
                                statePc = 18;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_8) {
                        statePc = ((Object) stateCaught_8 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw rl.<RuntimeException>$cfr$sneakyThrow(stateCaught_8);
                        }
                        caughtException = stateCaught_8;
                        continue scanLoop1;
                    }
                }
                case 11: {
                    try {
                        if (~var2_long < ~var4_ref_kc.field_v) {
                            /* Inlined CFG state: 13. */
                            {
                                var4_ref_kc.unlink(4);
                                jg.field_f = var4_ref_kc.field_B.length;
                                rf.field_d.position = 0;
                                var5_int = 0;
                                statePc = 14;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 12. */
                            {
                                statePc = 19;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_11) {
                        statePc = ((Object) stateCaught_11 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw rl.<RuntimeException>$cfr$sneakyThrow(stateCaught_11);
                        }
                        caughtException = stateCaught_11;
                        continue scanLoop1;
                    }
                }
                case 14: {
                    try {
                        if (jg.field_f <= var5_int) {
                            /* Inlined CFG state: 16. */
                            {
                                di.field_d = ma.field_W;
                                ma.field_W = aj.field_u;
                                aj.field_u = ch.field_N;
                                ch.field_N = var4_ref_kc.field_p;
                                stackIn_17_0 = 1;
                                statePc = 17;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 15. */
                            {
                                rf.field_d.payload[var5_int] = var4_ref_kc.field_B[var5_int];
                                var5_int++;
                                statePc = 14;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_14) {
                        statePc = ((Object) stateCaught_14 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw rl.<RuntimeException>$cfr$sneakyThrow(stateCaught_14);
                        }
                        caughtException = stateCaught_14;
                        continue scanLoop1;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    stackIn_21_0 = ub.field_g;
                    statePc = 21;
                    continue scanLoop1;
                }
                case 19: {
                    stackIn_21_0 = ub.field_g;
                    statePc = 21;
                    continue scanLoop1;
                }
                case 20: {
                    try {
                        stackIn_21_0 = ub.field_g;
                        statePc = 21;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_20) {
                        statePc = ((Object) stateCaught_20 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw rl.<RuntimeException>$cfr$sneakyThrow(stateCaught_20);
                        }
                        caughtException = stateCaught_20;
                        continue scanLoop1;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 >= 0) {
                            statePc = 26;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 22. */
                            {
                                rf.field_d.position = 0;
                                if (ve.a((byte) -127, 1)) {
                                    /* Inlined CFG state: 25. */
                                    {
                                        ub.field_g = rf.field_d.f(false);
                                        rf.field_d.position = 0;
                                        jg.field_f = param1[ub.field_g];
                                        statePc = 26;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 23. */
                                    {
                                        stackIn_24_0 = 0;
                                        statePc = 24;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_21) {
                        statePc = ((Object) stateCaught_21 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw rl.<RuntimeException>$cfr$sneakyThrow(stateCaught_21);
                        }
                        caughtException = stateCaught_21;
                        continue scanLoop1;
                    }
                }
                case 24: {
                    return stackIn_24_0 != 0;
                }
                case 26: {
                    try {
                        if (pm.n(24)) {
                            /* Inlined CFG state: 29. */
                            {
                                if (ej.field_H != 0) {
                                    /* Inlined CFG state: 32. */
                                    {
                                        var4 = ej.field_H;
                                        if (nh.field_f == 0.0) {
                                            statePc = 36;
                                        } else {
                                            statePc = 33;
                                        }
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 30. */
                                    {
                                        di.field_d = ma.field_W;
                                        ma.field_W = aj.field_u;
                                        aj.field_u = ch.field_N;
                                        ch.field_N = ub.field_g;
                                        ub.field_g = -1;
                                        stackIn_31_0 = 1;
                                        statePc = 31;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 27. */
                            {
                                stackIn_28_0 = 0;
                                statePc = 28;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_26) {
                        statePc = ((Object) stateCaught_26 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw rl.<RuntimeException>$cfr$sneakyThrow(stateCaught_26);
                        }
                        caughtException = stateCaught_26;
                        continue scanLoop1;
                    }
                }
                case 28: {
                    return stackIn_28_0 != 0;
                }
                case 31: {
                    return stackIn_31_0 != 0;
                }
                case 33: {
                    try {
                        var4 = (int)((double)var4 + rb.field_g.nextGaussian() * nh.field_f);
                        if (0 > var4) {
                            /* Inlined CFG state: 35. */
                            {
                                var4 = 0;
                                statePc = 36;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 34. */
                            {
                                statePc = 36;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_33) {
                        statePc = ((Object) stateCaught_33 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw rl.<RuntimeException>$cfr$sneakyThrow(stateCaught_33);
                        }
                        caughtException = stateCaught_33;
                        continue scanLoop1;
                    }
                }
                case 36: {
                    try {
                        var5 = new kc(var2_long + (long)var4, ub.field_g, new byte[jg.field_f]);
                        var6 = 0;
                        statePc = 37;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_36) {
                        statePc = ((Object) stateCaught_36 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw rl.<RuntimeException>$cfr$sneakyThrow(stateCaught_36);
                        }
                        caughtException = stateCaught_36;
                        continue scanLoop1;
                    }
                }
                case 37: {
                    try {
                        if (jg.field_f <= var6) {
                            /* Inlined CFG state: 39. */
                            {
                                ll.field_r.addLast(3, var5);
                                ub.field_g = -1;
                                statePc = 20;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 38. */
                            {
                                var5.field_B[var6] = rf.field_d.payload[var6];
                                var6++;
                                statePc = 37;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_37) {
                        statePc = ((Object) stateCaught_37 instanceof RuntimeException ? 40 : -1);
                        if (statePc == -1) {
                            throw rl.<RuntimeException>$cfr$sneakyThrow(stateCaught_37);
                        }
                        caughtException = stateCaught_37;
                        continue scanLoop1;
                    }
                }
                case 40: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_42_0 = (RuntimeException) (var2);
                    stackIn_41_0 = stackIn_42_0;
                    stackIn_42_1 = new StringBuilder().append("rl.C(").append(param0).append(',');
                    stackIn_41_1 = stackIn_42_1;
                    if (param1 == null) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue scanLoop1;
                }
                case 41: {
                    stackIn_43_0 = stackIn_41_0;
                    stackIn_43_1 = stackIn_41_1;
                    stackIn_43_2 = "{...}";
                    statePc = 43;
                    continue scanLoop1;
                }
                case 42: {
                    stackIn_43_0 = stackIn_42_0;
                    stackIn_43_1 = stackIn_42_1;
                    stackIn_43_2 = "null";
                    statePc = 43;
                    continue scanLoop1;
                }
                case 43: {
                    throw ci.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(')').toString());
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(String param0, vi param1, String param2, int param3, String param4, boolean param5, boolean param6) {
        RuntimeException var7 = null;
        fg var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (cb.field_j != mm.field_e) {
            return false;
          }
          var8 = new fg(ag.field_p, param1);
          ag.field_p.a(var8, 20);
          if (!param6) {
            rl.a(121);
          }
          if (CombatWorld.b(88)) {
            var8.o(126);
            return true;
          }
          bk.field_ab = param0;
          bl.field_a = param5;
          cb.field_j = nj.field_ab;
          bl.field_f = param2;
          qf.field_d = null;
          wi.field_y = param3;
          kf.field_o = param4;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_15_0 = var7;
          stackIn_15_1 = new StringBuilder().append("rl.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void b(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = ub.field_e;
        synchronized (var1) {
          nc.field_d = wn.field_d;
          ob.field_q = ob.field_q + 1;
          oh.field_f = SentinelDesigner.field_j;
          pi.field_c = hc.field_G;
          ik.field_a = ce.field_w;
          ce.field_w = false;
          lb.field_gc = ad.field_c;
          oa.field_S = fg.field_Rb;
          rj.field_j = me.field_d;
          ad.field_c = param0;
          sf.field_d = rb.field_a;
        }
    }

    static {
        field_b = new RgbSprite(80, 90);
        field_c = null;
        field_e = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
