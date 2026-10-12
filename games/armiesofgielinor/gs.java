/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gs implements kh {
    static int field_b;
    static boolean field_a;
    static String[] field_c;

    final static void a(boolean param0) {
        int var1_int = 0;
        int var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          ds.field_a = new RgbSprite[op.field_c[0].length];
          if (param0) {
            field_a = true;
          }
          le.field_c = new RgbSprite[op.field_c[0].length];
          rq.a((byte) -56);
          for (var1_int = 0; var1_int < op.field_c[0].length; var1_int++) {
            ds.field_a[var1_int] = new RgbSprite(vo.field_d.field_y, vo.field_d.field_v);
            le.field_c[var1_int] = new RgbSprite(im.field_y.field_y, im.field_y.field_v);
            ds.field_a[var1_int].b();
            vo.field_d.d(0, 0, op.field_c[0][var1_int]);
            le.field_c[var1_int].b();
            im.field_y.b(0, 0, op.field_c[0][var1_int]);
          }
          rf.b(-18862);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "gs.F(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = vl.field_n;
        var2.writeCipheredOpcode(32161, param0);
        var2.position = var2.position + 1;
        int var3 = var2.position;
        var2.writeByte(1, 2);
        var2.a(CoatOfArms.field_d, 0, CoatOfArms.field_d.length, 113);
        var2.writeByte(1, nh.field_E);
        var2.writeByte(1, AiPlanningStrategy.field_b);
        var2.a(tg.field_d, 0, tg.field_d.length, -72);
        if (param1 != -8006) {
          field_b = -111;
        }
        var2.e(-var3 + var2.position, 5930);
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          tm.a();
          hg.field_a = new int[260];
          fn.field_M = 11;
          var1_int = 0;
          var2 = -93 / ((-68 - param0) / 57);
          while (256 > var1_int) {
            var3 = 15.0;
            hg.field_a[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var3) * 255.0);
            var1_int++;
          }
          var6 = 256;
          var1_intLifetime1 = var6;
          while (var6 < hg.field_a.length) {
            hg.field_a[var6] = 255;
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var1), "gs.D(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -29 / ((13 - param0) / 56);
        field_c = null;
    }

    final static tu a(String param0, kl param1, kl param2, byte param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        tu stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param1.a(param0, 106);
          var6 = param1.a((byte) -65, var5_int, param4);
          if (param3 != -53) {
            field_a = true;
          }
          stackIn_3_0 = cc.a(param1, var5_int, param2, true, var6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("gs.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var6_intLifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          for (var6_int = 0; var6_int <= param0.field_w; var6_int++) {
            var7 = 152 + var6_int * 48 / param0.field_w;
            var8 = var7 | (var7 << 16 | var7 << 8);
            SoftwareRaster.e(param0.field_B + param1, var6_int + param4 + param0.field_p, param0.field_l, var8);
          }
          var6_intLifetime1 = 1;
          if (param2 > -79) {
            var11 = (int[]) null;
            gs.a((byte) -58, (int[]) null);
          }
          while (5 >= var6_intLifetime1) {
            var7Lifetime1 = var6_intLifetime1 + (-5 + (param1 + param0.field_B)) + (param0.field_l - (param0.field_l >> 1));
            var8Lifetime1 = -(var6_intLifetime1 * 2) + (param0.field_l >> 1);
            var9 = var6_intLifetime1 + (param4 + (param0.field_p + (-4 + param0.field_w >> 1)));
            if (var9 >= SoftwareRaster.field_a &&
              SoftwareRaster.field_f > var9) {
              if (SoftwareRaster.field_j < var7Lifetime1) {
                SoftwareRaster.field_d[var9 * SoftwareRaster.field_l - (-var7Lifetime1 + 1)] = rn.a(SoftwareRaster.field_d[-1 + (var7Lifetime1 + SoftwareRaster.field_l * var9)], 16711422) >> 1;
              }
              if (var8Lifetime1 + var7Lifetime1 < SoftwareRaster.field_e) {
                SoftwareRaster.field_d[SoftwareRaster.field_l * var9 + (var7Lifetime1 + var8Lifetime1)] = rn.a(16711422, SoftwareRaster.field_d[SoftwareRaster.field_l * var9 + var7Lifetime1 + var8Lifetime1]) >> 1;
              }
            }
            SoftwareRaster.e(var7Lifetime1, var9, var8Lifetime1, 0);
            var6_intLifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("gs.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean a(byte param0, int[] param1) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        qu var4_ref_qu = null;
        int var4 = 0;
        int var5_int = 0;
        qu var5 = null;
        int var6 = 0;
        int var7 = 0;
        scanLoop1: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
                    statePc = 1;
                    continue scanLoop1;
                }
                case 1: {
                    try {
                        if (param0 == 42) {
                            /* Inlined CFG state: 4. */
                            {
                                if (ov.field_g != kl.field_k) {
                                    /* Inlined CFG state: 6. */
                                    {
                                        stackIn_7_0 = 0;
                                        statePc = 7;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 5. */
                                    {
                                        /* Sequential CFG blocks: 5, 8. */
                                        {
                                        }
                                        {
                                            var2_long = vi.b(126);
                                            if (dq.field_c == 0) {
                                                statePc = 19;
                                            } else {
                                                statePc = 9;
                                            }
                                            continue scanLoop1;
                                        }
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
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 43 : -1);
                        if (statePc == -1) {
                            throw gs.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue scanLoop1;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 9: {
                    try {
                        if (0 > mg.field_f) {
                            /* Inlined CFG state: 11. */
                            {
                                var4_ref_qu = (qu) (AnimationPlayer.field_b.first((byte) 127));
                                if (var4_ref_qu == null) {
                                    statePc = 20;
                                } else {
                                    statePc = 12;
                                }
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 10. */
                            {
                                statePc = 19;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_9) {
                        statePc = ((Object) stateCaught_9 instanceof RuntimeException ? 43 : -1);
                        if (statePc == -1) {
                            throw gs.<RuntimeException>$cfr$sneakyThrow(stateCaught_9);
                        }
                        caughtException = stateCaught_9;
                        continue scanLoop1;
                    }
                }
                case 12: {
                    try {
                        if (~var2_long < ~var4_ref_qu.field_l) {
                            /* Inlined CFG state: 14. */
                            {
                                var4_ref_qu.unlink(-111);
                                fk.field_b = var4_ref_qu.field_m.length;
                                mg.field_e.position = 0;
                                var5_int = 0;
                                statePc = 15;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 13. */
                            {
                                statePc = 20;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_12) {
                        statePc = ((Object) stateCaught_12 instanceof RuntimeException ? 43 : -1);
                        if (statePc == -1) {
                            throw gs.<RuntimeException>$cfr$sneakyThrow(stateCaught_12);
                        }
                        caughtException = stateCaught_12;
                        continue scanLoop1;
                    }
                }
                case 15: {
                    try {
                        if (fk.field_b <= var5_int) {
                            /* Inlined CFG state: 17. */
                            {
                                me.field_c = ba.field_F;
                                ba.field_F = sj.field_e;
                                sj.field_e = nm.field_o;
                                nm.field_o = var4_ref_qu.field_o;
                                stackIn_18_0 = 1;
                                statePc = 18;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 16. */
                            {
                                mg.field_e.payload[var5_int] = var4_ref_qu.field_m[var5_int];
                                var5_int++;
                                statePc = 15;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_15) {
                        statePc = ((Object) stateCaught_15 instanceof RuntimeException ? 43 : -1);
                        if (statePc == -1) {
                            throw gs.<RuntimeException>$cfr$sneakyThrow(stateCaught_15);
                        }
                        caughtException = stateCaught_15;
                        continue scanLoop1;
                    }
                }
                case 18: {
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    stackIn_22_0 = mg.field_f;
                    statePc = 22;
                    continue scanLoop1;
                }
                case 20: {
                    stackIn_22_0 = mg.field_f;
                    statePc = 22;
                    continue scanLoop1;
                }
                case 21: {
                    try {
                        stackIn_22_0 = mg.field_f;
                        statePc = 22;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_21) {
                        statePc = ((Object) stateCaught_21 instanceof RuntimeException ? 43 : -1);
                        if (statePc == -1) {
                            throw gs.<RuntimeException>$cfr$sneakyThrow(stateCaught_21);
                        }
                        caughtException = stateCaught_21;
                        continue scanLoop1;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 < 0) {
                            /* Inlined CFG state: 24. */
                            {
                                mg.field_e.position = 0;
                                if (es.a(param0 ^ -83, 1)) {
                                    /* Inlined CFG state: 27. */
                                    {
                                        mg.field_f = mg.field_e.readCipheredOpcode(255);
                                        mg.field_e.position = 0;
                                        fk.field_b = param1[mg.field_f];
                                        statePc = 28;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 25. */
                                    {
                                        stackIn_26_0 = 0;
                                        statePc = 26;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 23. */
                            {
                                statePc = 28;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_22) {
                        statePc = ((Object) stateCaught_22 instanceof RuntimeException ? 43 : -1);
                        if (statePc == -1) {
                            throw gs.<RuntimeException>$cfr$sneakyThrow(stateCaught_22);
                        }
                        caughtException = stateCaught_22;
                        continue scanLoop1;
                    }
                }
                case 26: {
                    return stackIn_26_0 != 0;
                }
                case 28: {
                    try {
                        if (!jh.g(2)) {
                            /* Inlined CFG state: 30. */
                            {
                                stackIn_31_0 = 0;
                                statePc = 31;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 29. */
                            {
                                /* Sequential CFG blocks: 29, 32. */
                                {
                                }
                                {
                                    if (dq.field_c == 0) {
                                        /* Inlined CFG state: 41. */
                                        {
                                            me.field_c = ba.field_F;
                                            ba.field_F = sj.field_e;
                                            sj.field_e = nm.field_o;
                                            nm.field_o = mg.field_f;
                                            mg.field_f = -1;
                                            stackIn_42_0 = 1;
                                            statePc = 42;
                                            continue scanLoop1;
                                        }
                                    } else {
                                        /* Inlined CFG state: 33. */
                                        {
                                            var4 = dq.field_c;
                                            if (0.0 == sp.field_e) {
                                                statePc = 37;
                                            } else {
                                                statePc = 34;
                                            }
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_28) {
                        statePc = ((Object) stateCaught_28 instanceof RuntimeException ? 43 : -1);
                        if (statePc == -1) {
                            throw gs.<RuntimeException>$cfr$sneakyThrow(stateCaught_28);
                        }
                        caughtException = stateCaught_28;
                        continue scanLoop1;
                    }
                }
                case 31: {
                    return stackIn_31_0 != 0;
                }
                case 34: {
                    try {
                        var4 = (int)((double)var4 + iq.field_e.nextGaussian() * sp.field_e);
                        if (0 > var4) {
                            /* Inlined CFG state: 36. */
                            {
                                var4 = 0;
                                statePc = 37;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 35. */
                            {
                                statePc = 37;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_34) {
                        statePc = ((Object) stateCaught_34 instanceof RuntimeException ? 43 : -1);
                        if (statePc == -1) {
                            throw gs.<RuntimeException>$cfr$sneakyThrow(stateCaught_34);
                        }
                        caughtException = stateCaught_34;
                        continue scanLoop1;
                    }
                }
                case 37: {
                    try {
                        var5 = new qu(var2_long + (long)var4, mg.field_f, new byte[fk.field_b]);
                        var6 = 0;
                        statePc = 38;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_37) {
                        statePc = ((Object) stateCaught_37 instanceof RuntimeException ? 43 : -1);
                        if (statePc == -1) {
                            throw gs.<RuntimeException>$cfr$sneakyThrow(stateCaught_37);
                        }
                        caughtException = stateCaught_37;
                        continue scanLoop1;
                    }
                }
                case 38: {
                    try {
                        if (var6 >= fk.field_b) {
                            /* Inlined CFG state: 40. */
                            {
                                AnimationPlayer.field_b.addLast((byte) -119, (IntrusiveNode) (var5));
                                mg.field_f = -1;
                                statePc = 21;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 39. */
                            {
                                var5.field_m[var6] = mg.field_e.payload[var6];
                                var6++;
                                statePc = 38;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_38) {
                        statePc = ((Object) stateCaught_38 instanceof RuntimeException ? 43 : -1);
                        if (statePc == -1) {
                            throw gs.<RuntimeException>$cfr$sneakyThrow(stateCaught_38);
                        }
                        caughtException = stateCaught_38;
                        continue scanLoop1;
                    }
                }
                case 42: {
                    return stackIn_42_0 != 0;
                }
                case 43: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_45_0 = (RuntimeException) (var2);
                    stackIn_44_0 = stackIn_45_0;
                    stackIn_45_1 = new StringBuilder().append("gs.A(").append(param0).append(',');
                    stackIn_44_1 = stackIn_45_1;
                    if (param1 == null) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue scanLoop1;
                }
                case 44: {
                    stackIn_46_0 = stackIn_44_0;
                    stackIn_46_1 = stackIn_44_1;
                    stackIn_46_2 = "{...}";
                    statePc = 46;
                    continue scanLoop1;
                }
                case 45: {
                    stackIn_46_0 = stackIn_45_0;
                    stackIn_46_1 = stackIn_45_1;
                    stackIn_46_2 = "null";
                    statePc = 46;
                    continue scanLoop1;
                }
                case 46: {
                    throw ig.addExceptionContext((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(')').toString());
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_a = true;
        field_c = new String[]{"This unit is not carrying any equipment.", "This unit is carrying a flag. As such, it is able to capture a single structure.", "This unit is carrying a grappling hook, enabling it attack flying units.", "This unit is wearing waders, allowing it to better traverse rivers and swamps.", "This unit is wearing boots of Elidinis, allowing it to travel very quickly over water.", "This unit is carrying a ring of life, allowing it to respawn at the nearest unoccupied allied structure when it dies."};
        field_b = 0;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
