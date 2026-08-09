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
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        re stackIn_2_0 = null;
        re stackIn_7_0 = null;
        re stackIn_10_0 = null;
        re stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param1);
            if (ti.a((byte) 57, var4)) {
              L1: {
                var5 = (CharSequence) ((Object) param1);
                var3_int = md.a(var5, -9159);
                if (-1 <= (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (-131 <= (var3_int ^ -1)) {
                    if (!param0) {
                      stackIn_12_0 = db.field_b;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_10_0 = (re) null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_7_0 = jq.field_b;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = jq.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("bp.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final static void a(kj param0, boolean param1, int param2) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ga var7 = null;
        ga var8 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7 = ma.field_a;
                        var8 = var7;
                        var8.b((byte) -35, param2);
                        var8.field_j = var8.field_j + 1;
                        var4 = var8.field_j;
                        var8.a(108, 1);
                        var8.a(param0.field_i, (byte) -95);
                        var8.a(param0.field_v, (byte) -76);
                        var8.a(param0.field_t, (byte) -66);
                        var8.b(-116, param0.field_w);
                        var8.b(-99, param0.field_x);
                        var8.b(122, param0.field_l);
                        var8.b(-128, param0.field_k);
                        var8.a(-83, param0.field_y.length);
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5 >= param0.field_y.length) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7.b(52, param0.field_y[var5]);
                        var5++;
                        if (var6 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        field_u = (cj) null;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8.f(var4, 118);
                        var8.e(77, var8.field_j + -var4);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_12_0 = (RuntimeException) (var3);
                    stackIn_11_0 = stackIn_12_0;
                    stackIn_12_1 = new StringBuilder().append("bp.B(");
                    stackIn_11_1 = stackIn_12_1;
                    if (param0 == null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_13_2 = "{...}";
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_13_2 = "null";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    bp(pm param0) {
        super(param0);
    }

    public static void h(int param0) {
        field_s = null;
        if (param0 != -3) {
          field_q = true;
          field_t = null;
          field_v = null;
          field_w = null;
          field_u = null;
          return;
        } else {
          field_t = null;
          field_v = null;
          field_w = null;
          field_u = null;
          return;
        }
    }

    final static void a(int param0, k param1, go param2, int param3) {
        try {
            byte[] array$0 = null;
            int stackIn_4_0 = 0;
            int stackIn_42_0 = 0;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            go var15 = null;
            lp var16 = null;
            String var17 = null;
            byte[][] var18 = null;
            String var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var14 = ZombieDawnMulti.field_E ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var16 = new lp();
                            var16.field_n = param1.g(31365);
                            var16.field_r = param1.i(param3 + -1478490340);
                            var16.field_m = new di[var16.field_n];
                            var16.field_o = new byte[var16.field_n][][];
                            var16.field_g = new int[var16.field_n];
                            var16.field_q = new int[var16.field_n];
                            var16.field_l = new di[var16.field_n];
                            var16.field_i = new int[var16.field_n];
                            var5 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var16.field_n <= var5) {
                                statePc = 41;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var6_int = param1.g(31365);
                            stackIn_42_0 = var6_int;
                            stackIn_4_0 = stackIn_42_0;
                            if (var14 != 0) {
                                statePc = 42;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = ((Object) stateCaught_3 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_3 instanceof SecurityException ? 36 : ((Object) stateCaught_3 instanceof NullPointerException ? 37 : ((Object) stateCaught_3 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (stackIn_4_0 == 0) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = ((Object) stateCaught_4 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_4 instanceof SecurityException ? 36 : ((Object) stateCaught_4 instanceof NullPointerException ? 37 : ((Object) stateCaught_4 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (-2 == (var6_int ^ -1)) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = ((Object) stateCaught_5 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_5 instanceof SecurityException ? 36 : ((Object) stateCaught_5 instanceof NullPointerException ? 37 : ((Object) stateCaught_5 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var6_int != 2) {
                                statePc = 11;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = ((Object) stateCaught_6 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_6 instanceof SecurityException ? 36 : ((Object) stateCaught_6 instanceof NullPointerException ? 37 : ((Object) stateCaught_6 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = ((Object) stateCaught_7 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_7 instanceof SecurityException ? 36 : ((Object) stateCaught_7 instanceof NullPointerException ? 37 : ((Object) stateCaught_7 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var17 = param1.f((byte) -43);
                            var8 = param1.f((byte) -61);
                            var9 = 0;
                            if (var6_int != 1) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = ((Object) stateCaught_8 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_8 instanceof SecurityException ? 36 : ((Object) stateCaught_8 instanceof NullPointerException ? 37 : ((Object) stateCaught_8 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var9 = param1.i(param3 + -1478490340);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = ((Object) stateCaught_9 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_9 instanceof SecurityException ? 36 : ((Object) stateCaught_9 instanceof NullPointerException ? 37 : ((Object) stateCaught_9 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var16.field_i[var5] = var6_int;
                            var16.field_q[var5] = var9;
                            var16.field_m[var5] = param2.a((byte) -89, var8, mq.a(var17, (byte) -29));
                            if (var14 == 0) {
                                statePc = 40;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = ((Object) stateCaught_10 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_10 instanceof SecurityException ? 36 : ((Object) stateCaught_10 instanceof NullPointerException ? 37 : ((Object) stateCaught_10 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if ((var6_int ^ -1) == -4) {
                                statePc = 14;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = ((Object) stateCaught_11 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_11 instanceof SecurityException ? 36 : ((Object) stateCaught_11 instanceof NullPointerException ? 37 : ((Object) stateCaught_11 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (var6_int != 4) {
                                statePc = 40;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = ((Object) stateCaught_12 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_12 instanceof SecurityException ? 36 : ((Object) stateCaught_12 instanceof NullPointerException ? 37 : ((Object) stateCaught_12 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = ((Object) stateCaught_13 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_13 instanceof SecurityException ? 36 : ((Object) stateCaught_13 instanceof NullPointerException ? 37 : ((Object) stateCaught_13 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var19 = param1.f((byte) -32);
                            var20 = param1.f((byte) -55);
                            var9 = param1.g(31365);
                            var10 = new String[var9];
                            var11_int = 0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = ((Object) stateCaught_14 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_14 instanceof SecurityException ? 36 : ((Object) stateCaught_14 instanceof NullPointerException ? 37 : ((Object) stateCaught_14 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var9 <= var11_int) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = ((Object) stateCaught_15 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_15 instanceof SecurityException ? 36 : ((Object) stateCaught_15 instanceof NullPointerException ? 37 : ((Object) stateCaught_15 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var10[var11_int] = param1.f((byte) -8);
                            var11_int++;
                            if (var14 != 0) {
                                statePc = 40;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = ((Object) stateCaught_16 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_16 instanceof SecurityException ? 36 : ((Object) stateCaught_16 instanceof NullPointerException ? 37 : ((Object) stateCaught_16 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var14 == 0) {
                                statePc = 15;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = ((Object) stateCaught_17 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_17 instanceof SecurityException ? 36 : ((Object) stateCaught_17 instanceof NullPointerException ? 37 : ((Object) stateCaught_17 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = ((Object) stateCaught_18 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_18 instanceof SecurityException ? 36 : ((Object) stateCaught_18 instanceof NullPointerException ? 37 : ((Object) stateCaught_18 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var21 = new byte[var9][];
                            var18 = var21;
                            var11 = var18;
                            if (-4 == (var6_int ^ -1)) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = ((Object) stateCaught_19 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_19 instanceof SecurityException ? 36 : ((Object) stateCaught_19 instanceof NullPointerException ? 37 : ((Object) stateCaught_19 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = ((Object) stateCaught_20 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_20 instanceof SecurityException ? 36 : ((Object) stateCaught_20 instanceof NullPointerException ? 37 : ((Object) stateCaught_20 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var12_int = 0;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = ((Object) stateCaught_21 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_21 instanceof SecurityException ? 36 : ((Object) stateCaught_21 instanceof NullPointerException ? 37 : ((Object) stateCaught_21 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var9 <= var12_int) {
                                statePc = 26;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = ((Object) stateCaught_22 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_22 instanceof SecurityException ? 36 : ((Object) stateCaught_22 instanceof NullPointerException ? 37 : ((Object) stateCaught_22 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var13 = param1.i(-1478490344);
                            array$0 = new byte[var13];
                            var11[var12_int] = array$0;
                            param1.a(0, param3 + -6347, var13, var21[var12_int]);
                            var12_int++;
                            if (var14 != 0) {
                                statePc = 27;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = ((Object) stateCaught_23 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_23 instanceof SecurityException ? 36 : ((Object) stateCaught_23 instanceof NullPointerException ? 37 : ((Object) stateCaught_23 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var14 == 0) {
                                statePc = 22;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = ((Object) stateCaught_24 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_24 instanceof SecurityException ? 36 : ((Object) stateCaught_24 instanceof NullPointerException ? 37 : ((Object) stateCaught_24 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = ((Object) stateCaught_25 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_25 instanceof SecurityException ? 36 : ((Object) stateCaught_25 instanceof NullPointerException ? 37 : ((Object) stateCaught_25 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var16.field_i[var5] = var6_int;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = ((Object) stateCaught_26 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_26 instanceof SecurityException ? 36 : ((Object) stateCaught_26 instanceof NullPointerException ? 37 : ((Object) stateCaught_26 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var12 = new Class[var9];
                            var13 = 0;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = ((Object) stateCaught_27 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_27 instanceof SecurityException ? 36 : ((Object) stateCaught_27 instanceof NullPointerException ? 37 : ((Object) stateCaught_27 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var9 <= var13) {
                                statePc = 32;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = ((Object) stateCaught_28 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_28 instanceof SecurityException ? 36 : ((Object) stateCaught_28 instanceof NullPointerException ? 37 : ((Object) stateCaught_28 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var12[var13] = mq.a(var10[var13], (byte) -119);
                            var13++;
                            if (var14 != 0) {
                                statePc = 33;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = ((Object) stateCaught_29 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_29 instanceof SecurityException ? 36 : ((Object) stateCaught_29 instanceof NullPointerException ? 37 : ((Object) stateCaught_29 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var14 == 0) {
                                statePc = 28;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = ((Object) stateCaught_30 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_30 instanceof SecurityException ? 36 : ((Object) stateCaught_30 instanceof NullPointerException ? 37 : ((Object) stateCaught_30 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = ((Object) stateCaught_31 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_31 instanceof SecurityException ? 36 : ((Object) stateCaught_31 instanceof NullPointerException ? 37 : ((Object) stateCaught_31 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var16.field_l[var5] = param2.a(var12, false, mq.a(var19, (byte) -123), var20);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = ((Object) stateCaught_32 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_32 instanceof SecurityException ? 36 : ((Object) stateCaught_32 instanceof NullPointerException ? 37 : ((Object) stateCaught_32 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var16.field_o[var5] = var21;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = ((Object) stateCaught_33 instanceof ClassNotFoundException ? 35 : ((Object) stateCaught_33 instanceof SecurityException ? 36 : ((Object) stateCaught_33 instanceof NullPointerException ? 37 : ((Object) stateCaught_33 instanceof Exception ? 38 : 39))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var6 = (ClassNotFoundException) ((Object) caughtException);
                            var16.field_g[var5] = -1;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var6_ref = (SecurityException) ((Object) caughtException);
                            var16.field_g[var5] = -2;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var6_ref2 = (NullPointerException) ((Object) caughtException);
                            var16.field_g[var5] = -3;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var6_ref3 = (Exception) ((Object) caughtException);
                            var16.field_g[var5] = -4;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var6_ref4 = caughtException;
                            var16.field_g[var5] = -5;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var5++;
                            if (var14 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            we.field_k.a(var16, false);
                            stackIn_42_0 = param3;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (stackIn_42_0 == -4) {
                                statePc = 52;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var15 = (go) null;
                            bp.a(-51, (k) null, (go) null, 59);
                            return;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        var4 = (RuntimeException) ((Object) caughtException);
                        stackIn_47_0 = (RuntimeException) (var4);
                        stackIn_46_0 = stackIn_47_0;
                        stackIn_47_1 = new StringBuilder().append("bp.D(").append(param0).append(',');
                        stackIn_46_1 = stackIn_47_1;
                        if (param1 == null) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        stackIn_48_0 = (RuntimeException) ((Object) stackIn_46_0);
                        stackIn_48_1 = (StringBuilder) ((Object) stackIn_46_1);
                        stackIn_48_2 = "{...}";
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 47: {
                        stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                        stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                        stackIn_48_2 = "null";
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        stackIn_50_0 = (RuntimeException) ((Object) stackIn_48_0);
                        stackIn_49_0 = stackIn_50_0;
                        stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');
                        stackIn_49_1 = stackIn_50_1;
                        if (param2 == null) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        stackIn_51_0 = (RuntimeException) ((Object) stackIn_49_0);
                        stackIn_51_1 = (StringBuilder) ((Object) stackIn_49_1);
                        stackIn_51_2 = "{...}";
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 50: {
                        stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
                        stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                        stackIn_51_2 = "null";
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        throw fa.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param3 + ')');
                    }
                    case 52: {
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
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(false, param0) == jq.field_b) {
              stackIn_3_0 = ob.field_z;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 != -1276425040) {
                stackIn_7_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("bp.C(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_v = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_u = new cj();
    }
}
