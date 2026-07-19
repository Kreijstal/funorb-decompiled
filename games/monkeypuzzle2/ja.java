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
        rb discarded$2 = null;
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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rb stackOut_16_0 = null;
        Object stackOut_19_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
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
                  discarded$2 = ja.a((String) null, -90);
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
                    stackOut_16_0 = (rb) (var3);
                    stackIn_17_0 = stackOut_16_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = (rb) ((Object) ah.field_b.b(param1 + 1684349273));
                    if (var5 == 0) {
                      continue L3;
                    } else {
                      stackOut_19_0 = null;
                      stackIn_20_0 = stackOut_19_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2_ref);
            stackOut_21_1 = new StringBuilder().append("ja.B(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
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
        RuntimeException var5 = null;
        int var6 = 0;
        jj var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("ja.C(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
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
        RuntimeException var6 = null;
        jj var7 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackOut_5_0 = (RuntimeException) (var6);
            stackOut_5_1 = new StringBuilder().append("ja.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    ja(jg param0) {
        super(0, 0, 288, 0, (ml) null);
        RuntimeException var2 = null;
        int var3 = 0;
        a var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var2);
            stackOut_3_1 = new StringBuilder().append("ja.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        int stackOut_10_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, -80)) {
              if (param2 != 98) {
                if ((param2 ^ -1) == -100) {
                  stackOut_8_0 = this.b(param0, false);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5_int = -4 % ((37 - param3) / 50);
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackOut_4_0 = this.a((byte) 109, param0);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("ja.V(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
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
        RuntimeException var8 = null;
        int[] var8_array = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        ed var21_ref = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        short stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        short stackOut_29_0 = 0;
        int stackOut_33_0 = 0;
        short stackOut_32_0 = 0;
        ed stackOut_41_0 = null;
        Object stackOut_40_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var40 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var44 = param5;
                if (null == var44.field_N) {
                  break L2;
                } else {
                  if ((var44.field_D ^ -1) >= -2) {
                    break L2;
                  } else {
                    var60 = var44.field_N;
                    gg.a(cl.field_g, 0, var60, 0, 115);
                    if (var40 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              bb.a(121);
              break L1;
            }
            var54 = new int[param5.field_r];
            var49 = var54;
            var41 = var49;
            var8_array = var41;
            var64 = new int[param5.field_r];
            var63 = gj.field_c;
            var62 = vd.field_a;
            var61 = rc.field_j;
            var13 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (var13 >= param5.field_r) {
                    break L5;
                  } else {
                    var14 = var61[var13] * param1 + (param4 * var62[var13] + param7 * var63[var13]) >> 138088520;
                    stackOut_7_0 = var14 ^ -1;
                    stackOut_7_1 = -1;
                    stackIn_20_0 = stackOut_7_0;
                    stackIn_20_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (var40 != 0) {
                      break L4;
                    } else {
                      L6: {
                        if (stackIn_8_0 <= stackIn_8_1) {
                          break L6;
                        } else {
                          var14 = -var14;
                          break L6;
                        }
                      }
                      L7: {
                        if (0 <= var14) {
                          if (var14 >= 128) {
                            stackOut_14_0 = 256;
                            stackIn_15_0 = stackOut_14_0;
                            break L7;
                          } else {
                            stackOut_13_0 = 128 - -var14;
                            stackIn_15_0 = stackOut_13_0;
                            break L7;
                          }
                        } else {
                          stackOut_11_0 = 128;
                          stackIn_15_0 = stackOut_11_0;
                          break L7;
                        }
                      }
                      L8: {
                        var14 = stackIn_15_0;
                        var15 = param0 * var61[var13] + param6 * var63[var13] - -(var62[var13] * param3) >> 482518184;
                        stackOut_15_0 = r.field_a;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_16_0 = stackOut_15_0;
                        if ((var15 ^ -1) <= -1) {
                          stackOut_17_0 = (int[]) ((Object) stackIn_17_0);
                          stackOut_17_1 = var15;
                          stackIn_18_0 = stackOut_17_0;
                          stackIn_18_1 = stackOut_17_1;
                          break L8;
                        } else {
                          stackOut_16_0 = (int[]) ((Object) stackIn_16_0);
                          stackOut_16_1 = -var15;
                          stackIn_18_0 = stackOut_16_0;
                          stackIn_18_1 = stackOut_16_1;
                          break L8;
                        }
                      }
                      var15 = stackIn_18_0[stackIn_18_1];
                      var14 = (-var15 + 256) * var14 >>> -376196856;
                      var54[var13] = var14;
                      var64[var13] = var15;
                      var13++;
                      if (var40 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                stackOut_19_0 = param2;
                stackOut_19_1 = 15;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L4;
              }
              if (stackIn_20_0 > stackIn_20_1) {
                var13 = 0;
                L9: while (true) {
                  L10: {
                    L11: {
                      if ((var13 ^ -1) <= (s.field_R ^ -1)) {
                        break L11;
                      } else {
                        var14 = dj.field_c[var13];
                        var15 = param5.field_u[var14];
                        var16 = param5.field_L[var14];
                        var17 = param5.field_C[var14];
                        if (var40 != 0) {
                          break L10;
                        } else {
                          L12: {
                            if ((gj.field_c.length ^ -1) < (param5.field_d[var14] ^ -1)) {
                              stackOut_27_0 = param5.field_d[var14];
                              stackIn_28_0 = stackOut_27_0;
                              break L12;
                            } else {
                              stackOut_26_0 = -1;
                              stackIn_28_0 = stackOut_26_0;
                              break L12;
                            }
                          }
                          L13: {
                            var18 = stackIn_28_0;
                            if (gj.field_c.length <= param5.field_n[var14]) {
                              stackOut_30_0 = -1;
                              stackIn_31_0 = stackOut_30_0;
                              break L13;
                            } else {
                              stackOut_29_0 = param5.field_n[var14];
                              stackIn_31_0 = stackOut_29_0;
                              break L13;
                            }
                          }
                          L14: {
                            var19 = stackIn_31_0;
                            if ((gj.field_c.length ^ -1) >= (param5.field_A[var14] ^ -1)) {
                              stackOut_33_0 = -1;
                              stackIn_34_0 = stackOut_33_0;
                              break L14;
                            } else {
                              stackOut_32_0 = param5.field_A[var14];
                              stackIn_34_0 = stackOut_32_0;
                              break L14;
                            }
                          }
                          L15: {
                            L16: {
                              var20 = stackIn_34_0;
                              if (ri.field_c == null) {
                                break L16;
                              } else {
                                if (param5.field_c == null) {
                                  break L16;
                                } else {
                                  if (param5.field_c.length <= var14) {
                                    break L16;
                                  } else {
                                    if ((param5.field_c[var14] ^ -1) == 0) {
                                      break L16;
                                    } else {
                                      if ((ri.field_c.length ^ -1) < (param5.field_c[var14] ^ -1)) {
                                        stackOut_41_0 = ri.field_c[param5.field_c[var14]];
                                        stackIn_42_0 = stackOut_41_0;
                                        break L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_40_0 = null;
                            stackIn_42_0 = (ed) ((Object) stackOut_40_0);
                            break L15;
                          }
                          L17: {
                            L18: {
                              L19: {
                                var21_ref = stackIn_42_0;
                                var22 = bg.field_L[var15];
                                var23 = sb.field_l[var15];
                                var24 = bg.field_L[var16];
                                var25 = sb.field_l[var16];
                                var26 = bg.field_L[var17];
                                var27 = sb.field_l[var17];
                                if (var18 != var19) {
                                  break L19;
                                } else {
                                  if (var19 == var20) {
                                    break L18;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              L20: {
                                var28 = var54[var18];
                                var29 = var54[var19];
                                var30 = var54[var20];
                                var31 = var64[var18];
                                var32 = var64[var19];
                                var33 = var64[var20];
                                if (var21_ref != null) {
                                  stackOut_47_0 = var21_ref.field_e;
                                  stackIn_48_0 = stackOut_47_0;
                                  break L20;
                                } else {
                                  stackOut_46_0 = 8355711;
                                  stackIn_48_0 = stackOut_46_0;
                                  break L20;
                                }
                              }
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
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                            L21: {
                              var28 = var54[var18];
                              var29 = var64[var18];
                              if (var21_ref == null) {
                                stackOut_51_0 = 8355711;
                                stackIn_52_0 = stackOut_51_0;
                                break L21;
                              } else {
                                stackOut_50_0 = var21_ref.field_e;
                                stackIn_52_0 = stackOut_50_0;
                                break L21;
                              }
                            }
                            var30 = stackIn_52_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = var28 * var32 >>> -1684349368 & -117375232 | -2097217281 & var28 * var31 >>> 961914664;
                            var33 = var33 + 65793 * var29;
                            ma.a(var26, var23, var25, var24, 4, var22, var27, (var33 & 16711422) >> -1015092767);
                            break L17;
                          }
                          var13++;
                          if (var40 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    break L10;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var8 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) (var8);
            stackOut_55_1 = new StringBuilder().append("ja.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param5 == null) {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L22;
            } else {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L22;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
