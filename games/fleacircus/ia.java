/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends lh {
    static String[] field_s;
    static kh[][] field_m;
    static int[] field_l;
    static String field_o;
    static int[] field_j;
    int[] field_i;
    static int[] field_t;
    boolean field_n;
    int field_k;
    static int[] field_r;
    static int[][] field_p;
    static int[] field_q;

    final static sf a(int param0, int param1, int param2) {
        sf var3;
        byte[] var4;
        double var5;
        int var7;
        int var8;
        var8 = fleas.field_A ? 1 : 0;
        var3 = new sf(22050, param0);
        if (param2 != 1) {
          ia.a(-45);
          var4 = var3.field_l;
          var5 = 6.283185307179586 * (double)param1 / 22050.0;
          var7 = param0 + -1;
          L0: while (true) {
            L1: {
              if (0 > var7) {
                break L1;
              } else {
                var4[var7] = (byte)(int)(ma.a(var5 * (double)var7, 97) * 127.0);
                var7--;
                if (var8 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var3;
          }
        } else {
          var4 = var3.field_l;
          var5 = 6.283185307179586 * (double)param1 / 22050.0;
          var7 = param0 + -1;
          L2: while (true) {
            L3: {
              if (0 > var7) {
                break L3;
              } else {
                var4[var7] = (byte)(int)(ma.a(var5 * (double)var7, 97) * 127.0);
                var7--;
                if (var8 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            return var3;
          }
        }
    }

    final static int a(boolean param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              stackIn_4_0 = uj.a(false, 0, param2, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 40;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ia.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void c(boolean param0) {
        field_m = (kh[][]) null;
        field_l = null;
        field_s = null;
        field_o = null;
        field_j = null;
        field_p = (int[][]) null;
        field_t = null;
        if (!param0) {
          ia.b(true);
          field_r = null;
          field_q = null;
          return;
        } else {
          field_r = null;
          field_q = null;
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        pd var2 = null;
        int var3 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_19_0 = false;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        gf.field_d = param1;
                        if (param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ia.a(17, 35, -72);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = (pd) ((Object) bk.field_d.c((byte) 47));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2 == null) {
                            statePc = 12;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_19_0 = var2.field_n.b((byte) -54);
                        stackIn_6_0 = stackIn_19_0;
                        if (var3 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!stackIn_6_0) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2.field_m.h(gf.field_d * var2.field_j - -128 >> 1641415368);
                        if (var3 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2.c(-1);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2.c(-1);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2 = (pd) ((Object) bk.field_d.b((byte) -105));
                        if (var3 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (jc.field_c != null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var2 = (pd) ((Object) jc.field_c.c((byte) 47));
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var2 == null) {
                            statePc = 26;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var3 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        return;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = var2.field_n.b((byte) -54);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var2.c(-1);
                        if (var3 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var2.field_m.h(128 + gf.field_d * var2.field_j >> -1160573624);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var2 = (pd) ((Object) jc.field_c.b((byte) -105));
                        if (var3 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) var2_ref), "ia.B(" + param0 + ',' + param1 + ')');
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(boolean param0) {
        if (!param0) {
            field_s = (String[]) null;
        }
    }

    final static void a(int param0) {
        uh var1;
        var1 = (uh) ((Object) fg.field_t.a((byte) 100));
        if (param0 <= -52) {
          if (var1 == null) {
            throw new IllegalStateException();
          } else {
            gb.a(var1.field_r, var1.field_i, var1.field_p);
            gb.a(var1.field_j, var1.field_l, var1.field_q, var1.field_u);
            var1.field_r = null;
            fk.field_z.a(false, var1);
            return;
          }
        } else {
          field_q = (int[]) null;
          if (var1 == null) {
            throw new IllegalStateException();
          } else {
            gb.a(var1.field_r, var1.field_i, var1.field_p);
            gb.a(var1.field_j, var1.field_l, var1.field_q, var1.field_u);
            var1.field_r = null;
            fk.field_z.a(false, var1);
            return;
          }
        }
    }

    ia() {
        this.field_n = false;
    }

    static {
        field_s = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_m = new kh[2][];
        field_j = new int[11];
        field_o = "<%0>Slopes:<%1> these come in left and right varieties; fleas can walk up these.";
        field_t = new int[11];
        field_l = new int[11];
        field_r = new int[11];
        field_q = new int[4];
        field_p = new int[11][];
        tk.a(34, 155, new int[]{0, 21, 3, 12, 13, 4, 2, 14, 11}, 485, -124, 0, 135);
        tk.a(34, 155, new int[]{1, 19, 12, 13, 3, 7}, 485, -121, 1, 135);
        tk.a(34, 140, new int[]{15, 5}, 500, -123, 2, 383);
        tk.a(34, 85, new int[]{17, 6, 18}, 600, -128, 3, 415);
        tk.a(34, 140, new int[]{15, 5}, 500, -119, 4, 383);
        tk.a(34, 165, new int[]{2, 5}, 475, -118, 5, 383);
        tk.a(70, 165, new int[]{15, 16}, 475, -118, 6, 295);
        tk.a(32, 50, new int[]{}, 288, -119, 7, 400);
        tk.a(34, 140, new int[]{20, 15, 5}, 500, -117, 8, 376);
        tk.a(34, 165, new int[]{22}, 475, -118, 9, 400);
        tk.a(34, 190, new int[]{22}, 450, -126, 10, 400);
    }
}
