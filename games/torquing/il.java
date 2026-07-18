/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class il extends gf {
    static int[][] field_m;
    private boolean field_n;
    static int field_l;
    static int[] field_o;
    private String field_r;
    static int[] field_p;
    static java.awt.Frame field_q;

    public static void c() {
        field_p = null;
        field_o = null;
        field_m = null;
        field_q = null;
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        dn var4 = null;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        Object stackOut_10_0 = null;
        String stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            var5 = (CharSequence) (Object) param1;
            var3 = fd.a(0, var5);
            if (var3 != null) {
              stackOut_2_0 = (String) var3;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param0 == -121) {
                  break L1;
                } else {
                  ((il) this).field_r = null;
                  break L1;
                }
              }
              L2: {
                if (param1.equals((Object) (Object) ((il) this).field_r)) {
                  break L2;
                } else {
                  var4 = he.a(1, param1);
                  if (var4 != null) {
                    if (var4.field_e == null) {
                      ((il) this).field_n = var4.field_b;
                      ((il) this).field_r = param1;
                      break L2;
                    } else {
                      stackOut_10_0 = null;
                      stackIn_11_0 = stackOut_10_0;
                      return (String) (Object) stackIn_11_0;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (!((il) this).field_n) {
                stackOut_15_0 = s.field_u;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                return rk.field_d;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("il.H(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    final void e(int param0) {
        ((il) this).field_r = null;
        if (param0 >= -38) {
            il.a((byte) 36, 103);
        }
    }

    final static void a(byte param0, int param1) {
        ip.field_c = hc.field_d[param1];
        if (param0 != 52) {
            Object var3 = null;
            String discarded$0 = il.a((String) null, (la) null, (String) null, (byte) -45);
        }
        Torquing.field_w = in.field_a[param1];
        md.field_b = oc.field_a[param1];
    }

    il(tk param0) {
        super(param0);
        ((il) this).field_n = false;
    }

    final static String a(String param0, la param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
            var4_int = 17 % ((-22 - param3) / 48);
            if (!param1.a(-12749)) {
              stackOut_2_0 = (String) param0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              stackOut_4_0 = param2 + " - " + param1.a((byte) -32) + "%";
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("il.J(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final static void f() {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        bm var4_ref_bm = null;
        long var4 = 0L;
        int var5 = 0;
        wc var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        df var28 = null;
        RuntimeException decompiledCaughtException = null;
        var26 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var28 = kj.field_d;
              var2 = var28.i((byte) -101);
              if (0 != var2) {
                if (1 == var2) {
                  var3 = var28.i(7088);
                  var4 = var28.b(68);
                  var6 = (wc) (Object) so.field_t.b(0);
                  L2: while (true) {
                    L3: {
                      if (var6 == null) {
                        break L3;
                      } else {
                        if (var3 != var6.field_q) {
                          var6 = (wc) (Object) so.field_t.f(-24059);
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var6 != null) {
                      var6.field_l = var4;
                      var6.f(0);
                      break L1;
                    } else {
                      int discarded$10 = 1;
                      ih.b();
                      return;
                    }
                  }
                } else {
                  nn.a("HS1: " + me.a(-1), (Throwable) null, -9958);
                  int discarded$11 = 1;
                  ih.b();
                  break L1;
                }
              } else {
                var3 = var28.i(7088);
                var4_ref_bm = (bm) (Object) gl.field_d.b(0);
                L4: while (true) {
                  L5: {
                    if (var4_ref_bm == null) {
                      break L5;
                    } else {
                      if (var4_ref_bm.field_s != var3) {
                        var4_ref_bm = (bm) (Object) gl.field_d.f(-24059);
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (var4_ref_bm != null) {
                    L6: {
                      var5 = var28.i((byte) -101);
                      if (var5 == 0) {
                        break L6;
                      } else {
                        var6_int = var4_ref_bm.field_q;
                        cb.field_m[0].field_c = null;
                        cb.field_m[0].field_e = false;
                        cb.field_m[0].field_d = re.field_e;
                        var7 = var4_ref_bm.field_o;
                        var8_int = 1;
                        L7: while (true) {
                          if (var8_int >= var5) {
                            String[][] dupTemp$12 = new String[3][var6_int];
                            var4_ref_bm.field_p = dupTemp$12;
                            var8 = dupTemp$12;
                            var9 = new String[3][var6_int];
                            long[][] dupTemp$13 = new long[3][var6_int];
                            var4_ref_bm.field_m = dupTemp$13;
                            var10 = dupTemp$13;
                            int[][] dupTemp$14 = new int[3][var6_int * var7];
                            var4_ref_bm.field_n = dupTemp$14;
                            var11 = dupTemp$14;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var28.i((byte) -101);
                            if (var18 > 0) {
                              var19 = 0;
                              L8: while (true) {
                                if (var19 >= var18) {
                                  break L6;
                                } else {
                                  L9: {
                                    var20 = var28.i((byte) -101);
                                    var21 = cb.field_m[var20].field_d;
                                    var22 = var28.b(67);
                                    var24 = var28.field_n;
                                    if (var19 < var6_int) {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = cb.field_m[var20].field_c;
                                      var10[0][var12] = var22;
                                      var12++;
                                      var25 = 0;
                                      L10: while (true) {
                                        if (var25 >= var7) {
                                          break L9;
                                        } else {
                                          int incrementValue$15 = var15;
                                          var15++;
                                          var11[0][incrementValue$15] = var28.c((byte) -33);
                                          var25++;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      break L9;
                                    }
                                  }
                                  L11: {
                                    if (var21 == null) {
                                      break L11;
                                    } else {
                                      int discarded$16 = -17310;
                                      if (!bn.a(var21)) {
                                        break L11;
                                      } else {
                                        var8[1][var13] = re.field_e;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var28.field_n = var24;
                                        var13++;
                                        var25 = 0;
                                        L12: while (true) {
                                          if (var7 <= var25) {
                                            break L11;
                                          } else {
                                            int incrementValue$17 = var16;
                                            var16++;
                                            var11[1][incrementValue$17] = var28.c((byte) -76);
                                            var25++;
                                            continue L12;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L13: {
                                    if (var6_int <= var14) {
                                      break L13;
                                    } else {
                                      if (!cb.field_m[var20].field_e) {
                                        cb.field_m[var20].field_e = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = cb.field_m[var20].field_c;
                                        var10[2][var14] = var22;
                                        var14++;
                                        var28.field_n = var24;
                                        var25 = 0;
                                        L14: while (true) {
                                          if (var7 <= var25) {
                                            break L13;
                                          } else {
                                            int incrementValue$18 = var17;
                                            var17++;
                                            var11[2][incrementValue$18] = var28.c((byte) -55);
                                            var25++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L8;
                                }
                              }
                            } else {
                              break L6;
                            }
                          } else {
                            L15: {
                              cb.field_m[var8_int].field_d = var28.h((byte) 124);
                              cb.field_m[var8_int].field_e = false;
                              if (var28.i((byte) -101) != 1) {
                                cb.field_m[var8_int].field_c = null;
                                break L15;
                              } else {
                                cb.field_m[var8_int].field_c = var28.h((byte) 123);
                                break L15;
                              }
                            }
                            var8_int++;
                            continue L7;
                          }
                        }
                      }
                    }
                    var4_ref_bm.field_k = true;
                    var4_ref_bm.f(0);
                    break L1;
                  } else {
                    int discarded$19 = 1;
                    ih.b();
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "il.D(" + -30593 + ')');
        }
    }

    final cd a(int param0, String param1) {
        dn var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        cd stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        cd stackIn_13_0 = null;
        cd stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        cd stackOut_2_0 = null;
        cd stackOut_12_0 = null;
        cd stackOut_17_0 = null;
        cd stackOut_16_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            var4 = (CharSequence) (Object) param1;
            if (!va.a(-21369, var4)) {
              stackOut_2_0 = so.field_u;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param0 > 62) {
                L1: {
                  if (!param1.equals((Object) (Object) ((il) this).field_r)) {
                    L2: {
                      var3 = he.a(1, param1);
                      if (var3 == null) {
                        break L2;
                      } else {
                        if (null != var3.field_e) {
                          break L2;
                        } else {
                          ((il) this).field_n = var3.field_b;
                          ((il) this).field_r = param1;
                          break L1;
                        }
                      }
                    }
                    stackOut_12_0 = gn.field_h;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    break L1;
                  }
                }
                L3: {
                  if (((il) this).field_n) {
                    stackOut_17_0 = so.field_s;
                    stackIn_18_0 = stackOut_17_0;
                    break L3;
                  } else {
                    stackOut_16_0 = so.field_u;
                    stackIn_18_0 = stackOut_16_0;
                    break L3;
                  }
                }
                break L0;
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (cd) (Object) stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3_ref;
            stackOut_19_1 = new StringBuilder().append("il.F(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_18_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[][]{new int[3], new int[3]};
        field_l = -1;
        field_p = new int[3];
    }
}
