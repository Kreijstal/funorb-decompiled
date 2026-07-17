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
        return "</col></u>";
    }

    final static rb a(String param0, int param1) {
        Object var2 = null;
        rb var3 = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_3_0 = null;
        rb stackIn_17_0 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        Object stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        rb stackOut_16_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        Object stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        Object stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (null != ah.field_b) {
            L0: {
              var7 = (CharSequence) (Object) param0;
              var2 = (Object) (Object) pl.a((byte) 119, var7);
              if (var2 != null) {
                break L0;
              } else {
                var2 = (Object) (Object) var7;
                break L0;
              }
            }
            L1: {
              if (param1 == -1684349368) {
                break L1;
              } else {
                var6 = null;
                rb discarded$2 = ja.a((String) null, -90);
                break L1;
              }
            }
            var3 = (rb) (Object) ah.field_b.a((long)((String) var2).hashCode(), false);
            L2: while (true) {
              if (var3 != null) {
                L3: {
                  var8 = (CharSequence) (Object) var3.field_db;
                  var4 = pl.a((byte) 108, var8);
                  if (var4 == null) {
                    var4 = var3.field_db;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (var4.equals(var2)) {
                  stackOut_16_0 = (rb) var3;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0;
                } else {
                  var3 = (rb) (Object) ah.field_b.b(param1 + 1684349273);
                  continue L2;
                }
              } else {
                return null;
              }
            }
          } else {
            stackOut_2_0 = null;
            stackIn_3_0 = stackOut_2_0;
            return (rb) (Object) stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_20_0 = var2;
            stackOut_20_1 = new StringBuilder().append("ja.B(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 41);
        }
    }

    public final void a(int param0, int param1, jj param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                wc.a("terms.ws", false);
                break L1;
              } else {
                if (param0 != 1) {
                  if (param0 == 2) {
                    wc.a("conduct.ws", false);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  wc.a("privacy.ws", false);
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == -21099) {
                break L2;
              } else {
                var7 = null;
                ((ja) this).a(-11, 111, (jj) null, -70);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ja.C(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
    }

    private final String a(int param0) {
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        RuntimeException var6 = null;
        Object var7 = null;
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
              if (((ja) this).field_D != param4) {
                break L1;
              } else {
                ud.a(108);
                ((ja) this).field_C.g((byte) -75);
                break L1;
              }
            }
            L2: {
              if (param3 == 7) {
                break L2;
              } else {
                var7 = null;
                ((ja) this).a(-73, -74, (jj) null, -4);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("ja.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
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
            ((ja) this).field_C = param0;
            ((ja) this).field_D = new t(pi.field_i, (of) null);
            ((ja) this).field_D.field_h = (ml) (Object) new hd();
            var7 = gg.a(new String[2], oi.field_i, true);
            var3 = 20;
            var4 = new a(t.field_z, 0, 0, 0, 0, 16777215, -1, 3, 0, t.field_z.field_C, -1, 2147483647, true);
            ((ja) this).field_z = new jj(var7, (ml) (Object) var4);
            ((ja) this).field_z.field_m = "";
            ((ja) this).field_z.a(false, 0, kg.field_a);
            ((ja) this).field_z.a(false, 1, kg.field_a);
            ((ja) this).field_z.field_o = (of) this;
            ((ja) this).field_z.field_l = ((ja) this).field_l - 40;
            ((ja) this).field_z.c(26, var3, -40 + ((ja) this).field_l, -1);
            var3 = var3 + (15 + ((ja) this).field_z.field_p);
            ((ja) this).b((byte) -41, (we) (Object) ((ja) this).field_z);
            var5 = 4;
            var6 = 200;
            ((ja) this).field_D.a(40, 13361, -var6 + 300 >> 1, var6, var3);
            ((ja) this).field_D.field_o = (of) this;
            ((ja) this).b((byte) -111, (we) (Object) ((ja) this).field_D);
            ((ja) this).a(var3 - (-55 + -var5), 13361, 0, 300, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("ja.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
                if (param2 == 99) {
                  stackOut_8_0 = ((ja) this).b(param0, false);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  var5_int = -4 % ((37 - param3) / 50);
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                }
              } else {
                stackOut_4_0 = ((ja) this).a((byte) 109, param0);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("ja.V(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_11_0 != 0;
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
        int var44 = 0;
        sj var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_14_0 = 0;
        int[] stackIn_15_0 = null;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        ed stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        short stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        short stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        short stackOut_29_0 = 0;
        ed stackOut_38_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int[] stackOut_14_0 = null;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var40 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var45 = param5;
                if (null == var45.field_N) {
                  break L2;
                } else {
                  if (var45.field_D <= 1) {
                    break L2;
                  } else {
                    var62 = var45.field_N;
                    gg.a(cl.field_g, 0, var62, 0, 115);
                    break L1;
                  }
                }
              }
              bb.a(121);
              break L1;
            }
            var66 = new int[param5.field_r];
            var60 = var66;
            var55 = var60;
            var50 = var55;
            var41 = var50;
            var8_array = var41;
            var67 = new int[param5.field_r];
            var65 = gj.field_c;
            var64 = vd.field_a;
            var63 = rc.field_j;
            var13 = 0;
            L3: while (true) {
              if (var13 >= param5.field_r) {
                if (param2 > 15) {
                  var44 = 0;
                  var13 = var44;
                  L4: while (true) {
                    if (var44 >= s.field_R) {
                      break L0;
                    } else {
                      L5: {
                        var14 = dj.field_c[var44];
                        var15 = param5.field_u[var14];
                        var16 = param5.field_L[var14];
                        var17 = param5.field_C[var14];
                        if (gj.field_c.length > param5.field_d[var14]) {
                          stackOut_24_0 = param5.field_d[var14];
                          stackIn_25_0 = stackOut_24_0;
                          break L5;
                        } else {
                          stackOut_23_0 = -1;
                          stackIn_25_0 = stackOut_23_0;
                          break L5;
                        }
                      }
                      L6: {
                        var18 = stackIn_25_0;
                        if (gj.field_c.length <= param5.field_n[var14]) {
                          stackOut_27_0 = -1;
                          stackIn_28_0 = stackOut_27_0;
                          break L6;
                        } else {
                          stackOut_26_0 = param5.field_n[var14];
                          stackIn_28_0 = stackOut_26_0;
                          break L6;
                        }
                      }
                      L7: {
                        var19 = stackIn_28_0;
                        if (gj.field_c.length <= param5.field_A[var14]) {
                          stackOut_30_0 = -1;
                          stackIn_31_0 = stackOut_30_0;
                          break L7;
                        } else {
                          stackOut_29_0 = param5.field_A[var14];
                          stackIn_31_0 = stackOut_29_0;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          var20 = stackIn_31_0;
                          if (ri.field_c == null) {
                            break L9;
                          } else {
                            if (param5.field_c == null) {
                              break L9;
                            } else {
                              if (param5.field_c.length <= var14) {
                                break L9;
                              } else {
                                if (param5.field_c[var14] == -1) {
                                  break L9;
                                } else {
                                  if (ri.field_c.length > param5.field_c[var14]) {
                                    stackOut_38_0 = ri.field_c[param5.field_c[var14]];
                                    stackIn_39_0 = stackOut_38_0;
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_37_0 = null;
                        stackIn_39_0 = (ed) (Object) stackOut_37_0;
                        break L8;
                      }
                      L10: {
                        L11: {
                          var21_ref = stackIn_39_0;
                          var22 = bg.field_L[var15];
                          var23 = sb.field_l[var15];
                          var24 = bg.field_L[var16];
                          var25 = sb.field_l[var16];
                          var26 = bg.field_L[var17];
                          var27 = sb.field_l[var17];
                          if (var18 != var19) {
                            break L11;
                          } else {
                            if (var19 == var20) {
                              L12: {
                                var28 = var66[var18];
                                var29 = var67[var18];
                                if (var21_ref == null) {
                                  stackOut_48_0 = 8355711;
                                  stackIn_49_0 = stackOut_48_0;
                                  break L12;
                                } else {
                                  stackOut_47_0 = var21_ref.field_e;
                                  stackIn_49_0 = stackOut_47_0;
                                  break L12;
                                }
                              }
                              var30 = stackIn_49_0;
                              var31 = var30 & 16711935;
                              var32 = var30 & 65280;
                              var33 = var28 * var32 >>> 8 & -117375232 | -2097217281 & var28 * var31 >>> 8;
                              var33 = var33 + 65793 * var29;
                              ma.a(var26, var23, var25, var24, 4, var22, var27, (var33 & 16711422) >> 1);
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L13: {
                          var28 = var66[var18];
                          var29 = var66[var19];
                          var30 = var66[var20];
                          var31 = var67[var18];
                          var32 = var67[var19];
                          var33 = var67[var20];
                          if (var21_ref != null) {
                            stackOut_44_0 = var21_ref.field_e;
                            stackIn_45_0 = stackOut_44_0;
                            break L13;
                          } else {
                            stackOut_43_0 = 8355711;
                            stackIn_45_0 = stackOut_43_0;
                            break L13;
                          }
                        }
                        var34 = stackIn_45_0;
                        var35 = 16711935 & var34;
                        var36 = var34 & 65280;
                        var37 = (-16711821 & var28 * var35) >>> 8 | (var28 * var36 & 16711856) >>> 8;
                        var38 = (var36 * var29 & 16711823) >>> 8 | -83951361 & var35 * var29 >>> 8;
                        var37 = var37 + var31 * 65793;
                        var39 = (-16711934 & var30 * var35) >>> 8 | (16711726 & var30 * var36) >>> 8;
                        var38 = var38 + var32 * 65793;
                        var39 = var39 + 65793 * var33;
                        oi.a(var27, 255 & var38 >> 8, var25, 255 & var37 >> 8, (byte) 92, var23, var26, var39 & 255, var24, var22, 255 & var37, var39 >> 8 & 255, var38 >> 16, 255 & var38, var39 >> 16, var37 >> 16);
                        break L10;
                      }
                      var44++;
                      continue L4;
                    }
                  }
                } else {
                  return;
                }
              } else {
                L14: {
                  var14 = var63[var13] * param1 + (param4 * var64[var13] + param7 * var65[var13]) >> 8;
                  if (var14 >= 0) {
                    break L14;
                  } else {
                    var14 = -var14;
                    break L14;
                  }
                }
                L15: {
                  if (0 <= var14) {
                    if (var14 >= 128) {
                      stackOut_13_0 = 256;
                      stackIn_14_0 = stackOut_13_0;
                      break L15;
                    } else {
                      stackOut_12_0 = 128 - -var14;
                      stackIn_14_0 = stackOut_12_0;
                      break L15;
                    }
                  } else {
                    stackOut_10_0 = 128;
                    stackIn_14_0 = stackOut_10_0;
                    break L15;
                  }
                }
                L16: {
                  var14 = stackIn_14_0;
                  var15 = param0 * var63[var13] + param6 * var65[var13] - -(var64[var13] * param3) >> 8;
                  stackOut_14_0 = r.field_a;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (var15 >= 0) {
                    stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                    stackOut_16_1 = var15;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L16;
                  } else {
                    stackOut_15_0 = (int[]) (Object) stackIn_15_0;
                    stackOut_15_1 = -var15;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L16;
                  }
                }
                var15 = stackIn_17_0[stackIn_17_1];
                var14 = (-var15 + 256) * var14 >>> 8;
                var66[var13] = var14;
                var67[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var8;
            stackOut_52_1 = new StringBuilder().append("ja.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param5 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L17;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L17;
            }
          }
          throw la.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 44 + param6 + 44 + param7 + 41);
        }
    }

    public static void b(boolean param0) {
        field_A = null;
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
            throw la.a((Throwable) (Object) runtimeException, "ja.J(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new te(7, 0, 1, 1);
        field_F = false;
    }
}
