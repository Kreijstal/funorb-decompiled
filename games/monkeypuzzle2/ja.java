/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends ua implements u, ql {
    private jj field_z;
    private jg field_C;
    static te field_B;
    private t field_D;
    static boolean field_F;
    static int[][] field_A;

    private final String d(byte param0) {
        if (param0 <= 93) {
            field_A = (int[][]) null;
        }
        return "</col></u>";
    }

    final static rb a(String param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        rb var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_3_0 = null;
        rb stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (null != ah.field_b) {
              L1: {
                var7 = (CharSequence) ((Object) param0);
                var2 = pl.a((byte) 119, var7);
                if (var2 != null) {
                  break L1;
                } else {
                  var2 = param0;
                  break L1;
                }
              }
              L2: {
                if (param1 == -1684349368) {
                  break L2;
                } else {
                  var6 = (String) null;
                  ja.a((String) null, -90);
                  break L2;
                }
              }
              var3 = (rb) ((Object) ah.field_b.a((long)var2.hashCode(), false));
              L3: while (true) {
                if (var3 != null) {
                  L4: {
                    var8 = (CharSequence) ((Object) var3.field_db);
                    var4 = pl.a((byte) 108, var8);
                    if (var4 == null) {
                      var4 = var3.field_db;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (var4.equals(var2)) {
                    stackIn_17_0 = (rb) (var3);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = (rb) ((Object) ah.field_b.b(param1 + 1684349273));
                    if (var5 == 0) {
                      continue L3;
                    } else {
                      stackIn_20_0 = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2_ref);

            stackIn_23_1 = new StringBuilder().append("ja.B(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (rb) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0;
          } else {
            return (rb) ((Object) stackIn_20_0);
          }
        }
    }

    public final void a(int param0, int param1, jj param2, int param3) {
        int var6 = 0;
        jj var7 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 == 0) {
                  break L2;
                } else {
                  L3: {
                    if (param0 != 1) {
                      break L3;
                    } else {
                      wc.a("privacy.ws", false);
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (param0 == 2) {
                    wc.a("conduct.ws", false);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              wc.a("terms.ws", false);
              break L1;
            }
            L4: {
              if (param1 == -21099) {
                break L4;
              } else {
                var7 = (jj) null;
                this.a(-11, 111, (jj) null, -70);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("ja.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
    }

    private final String a(int param0) {
        if (param0 != 1971849544) {
            jj var3 = (jj) null;
            this.a(-97, -69, (jj) null, 108);
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        jj var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (this.field_D != param4) {
                break L1;
              } else {
                ud.a(108);
                this.field_C.g((byte) -75);
                break L1;
              }
            }
            L2: {
              if (param3 == 7) {
                break L2;
              } else {
                var7 = (jj) null;
                this.a(-73, -74, (jj) null, -4);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("ja.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    ja(jg param0) {
        super(0, 0, 288, 0, (ml) null);
        String var7 = null;
        int var3 = 0;
        a var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_C = param0;
            this.field_D = new t(pi.field_i, (of) null);
            this.field_D.field_h = (ml) ((Object) new hd());
            var7 = gg.a(new String[]{this.a(1971849544), this.d((byte) 106)}, oi.field_i, true);
            var3 = 20;
            var4 = new a(t.field_z, 0, 0, 0, 0, 16777215, -1, 3, 0, t.field_z.field_C, -1, 2147483647, true);
            this.field_z = new jj(var7, var4);
            this.field_z.field_m = "";
            this.field_z.a(false, 0, kg.field_a);
            this.field_z.a(false, 1, kg.field_a);
            this.field_z.field_o = (of) (this);
            this.field_z.field_l = this.field_l - 40;
            this.field_z.c(26, var3, -40 + this.field_l, -1);
            var3 = var3 + (15 + this.field_z.field_p);
            this.b((byte) -41, this.field_z);
            var5 = 4;
            var6 = 200;
            this.field_D.a(40, 13361, -var6 + 300 >> -1615538719, var6, var3);
            this.field_D.field_o = (of) (this);
            this.b((byte) -111, this.field_D);
            this.a(var3 - (-55 + -var5), 13361, 0, 300, 0);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ja.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, -80)) {
              if (param2 != 98) {
                if ((param2 ^ -1) == -100) {
                  stackIn_9_0 = this.b(param0, false);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5_int = -4 % ((37 - param3) / 50);
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_5_0 = this.a((byte) 109, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("ja.V(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, sj param5, int param6, int param7) {
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_15_0 = 0;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        ed stackIn_42_0 = null;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        ed var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        sj var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var40 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var44 = param5;
                        if (null == var44.field_N) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var44.field_D ^ -1) >= -2) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var60 = var44.field_N;
                        gg.a(cl.field_g, 0, var60, 0, 115);
                        if (var40 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        bb.a(121);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var54 = new int[param5.field_r];
                        var49 = var54;
                        var41 = var49;
                        var8 = var41;
                        var64 = new int[param5.field_r];
                        var63 = gj.field_c;
                        var62 = vd.field_a;
                        var61 = rc.field_j;
                        var13 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var13 >= param5.field_r) {
                            statePc = 19;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var14 = var61[var13] * param1 + (param4 * var62[var13] + param7 * var63[var13]) >> 138088520;
                        stackIn_20_0 = var14 ^ -1;
                        stackIn_8_0 = stackIn_20_0;
                        stackIn_20_1 = -1;
                        stackIn_8_1 = stackIn_20_1;
                        if (var40 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 <= stackIn_8_1) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var14 = -var14;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (0 <= var14) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_15_0 = 128;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var14 >= 128) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_15_0 = 128 - -var14;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = 256;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var14 = stackIn_15_0;
                        var15 = param0 * var61[var13] + param6 * var63[var13] - -(var62[var13] * param3) >> 482518184;
                        stackIn_17_0 = r.field_a;
                        stackIn_16_0 = stackIn_17_0;
                        if ((var15 ^ -1) <= -1) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_18_0 = (int[]) ((Object) stackIn_16_0);
                        stackIn_18_1 = -var15;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = (int[]) ((Object) stackIn_17_0);
                        stackIn_18_1 = var15;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var15 = stackIn_18_0[stackIn_18_1];
                        var14 = (-var15 + 256) * var14 >>> -376196856;
                        var54[var13] = var14;
                        var64[var13] = var15;
                        var13++;
                        if (var40 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = param2;
                        stackIn_20_1 = 15;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 > stackIn_20_1) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return;
                }
                case 22: {
                    try {
                        var13 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((var13 ^ -1) <= (s.field_R ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var14 = dj.field_c[var13];
                        var15 = param5.field_u[var14];
                        var16 = param5.field_L[var14];
                        var17 = param5.field_C[var14];
                        if (var40 != 0) {
                            statePc = 59;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if ((gj.field_c.length ^ -1) < (param5.field_d[var14] ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_28_0 = -1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = param5.field_d[var14];
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var18 = stackIn_28_0;
                        if (gj.field_c.length <= param5.field_n[var14]) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_31_0 = param5.field_n[var14];
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = -1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var19 = stackIn_31_0;
                        if ((gj.field_c.length ^ -1) >= (param5.field_A[var14] ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_34_0 = param5.field_A[var14];
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = -1;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var20 = stackIn_34_0;
                        if (ri.field_c == null) {
                            statePc = 40;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (param5.field_c == null) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (param5.field_c.length <= var14) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((param5.field_c[var14] ^ -1) == 0) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((ri.field_c.length ^ -1) < (param5.field_c[var14] ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_42_0 = null;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = ri.field_c[param5.field_c[var14]];
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var21 = stackIn_42_0;
                        var22 = bg.field_L[var15];
                        var23 = sb.field_l[var15];
                        var24 = bg.field_L[var16];
                        var25 = sb.field_l[var16];
                        var26 = bg.field_L[var17];
                        var27 = sb.field_l[var17];
                        if (var18 != var19) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var19 == var20) {
                            statePc = 49;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var28 = var54[var18];
                        var29 = var54[var19];
                        var30 = var54[var20];
                        var31 = var64[var18];
                        var32 = var64[var19];
                        var33 = var64[var20];
                        if (var21 != null) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_48_0 = 8355711;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = var21.field_e;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var34 = stackIn_48_0;
                        var35 = 16711935 & var34;
                        var36 = var34 & 65280;
                        var37 = (-16711821 & var28 * var35) >>> 740609608 | (var28 * var36 & 16711856) >>> 318722216;
                        var38 = (var36 * var29 & 16711823) >>> -559485496 | -83951361 & var35 * var29 >>> 1971849544;
                        var37 = var37 + var31 * 65793;
                        var39 = (-16711934 & var30 * var35) >>> 963583080 | (16711726 & var30 * var36) >>> -2126918872;
                        var38 = var38 + var32 * 65793;
                        var39 = var39 + 65793 * var33;
                        oi.a(var27, 255 & var38 >> -828510872, var25, 255 & var37 >> 1516856360, (byte) 92, var23, var26, var39 & 255, var24, var22, 255 & var37, var39 >> 692379432 & 255, var38 >> -328101328, 255 & var38, var39 >> 969397296, var37 >> -2040640112);
                        if (var40 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var28 = var54[var18];
                        var29 = var64[var18];
                        if (var21 == null) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_52_0 = var21.field_e;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_52_0 = 8355711;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var30 = stackIn_52_0;
                        var31 = var30 & 16711935;
                        var32 = var30 & 65280;
                        var33 = var28 * var32 >>> -1684349368 & -117375232 | -2097217281 & var28 * var31 >>> 961914664;
                        var33 = var33 + 65793 * var29;
                        ma.a(var26, var23, var25, var24, 4, var22, var27, (var33 & 16711422) >> -1015092767);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var13++;
                        if (var40 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    var8_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_57_0 = (RuntimeException) (var8_ref);
                    stackIn_56_0 = stackIn_57_0;
                    stackIn_57_1 = new StringBuilder().append("ja.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                    stackIn_56_1 = stackIn_57_1;
                    if (param5 == null) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackIn_58_0 = (RuntimeException) ((Object) stackIn_56_0);
                    stackIn_58_1 = (StringBuilder) ((Object) stackIn_56_1);
                    stackIn_58_2 = "{...}";
                    statePc = 58;
                    continue stateLoop;
                }
                case 57: {
                    stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
                    stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
                    stackIn_58_2 = "null";
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    throw la.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ',' + param6 + ',' + param7 + ')');
                }
                case 59: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            ja.b(false);
        }
        field_A = (int[][]) null;
        field_B = null;
    }

    final static void a(ug param0, ug param1, int param2) {
        if (!(param1.field_c == null)) {
            param1.c(-19822);
        }
        if (param2 > -97) {
            return;
        }
        try {
            param1.field_c = param0.field_c;
            param1.field_d = param0;
            param1.field_c.field_d = param1;
            param1.field_d.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ja.J(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_B = new te(7, 0, 1, 1);
        field_F = false;
    }
}
