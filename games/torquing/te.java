/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends am {
    private int field_u;
    private int field_s;
    static String field_t;

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][][] var8 = null;
        int var9_int = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18_int = 0;
        int[] var18 = null;
        int[] var19 = null;
        int var19_int = 0;
        int[] var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int[][] var29 = null;
        int[][][] var30 = null;
        int[][] var37 = null;
        int[][][] var38 = null;
        int[][] var45 = null;
        int[][][] var46 = null;
        int[][] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[][] var52 = null;
        int[][] var53 = null;
        int[][][] var54 = null;
        int[][] var55 = null;
        var23 = Torquing.field_u;
        if (param0 == -29116) {
          L0: {
            var53 = ((te) this).field_r.a(15142, param1);
            var45 = var53;
            var37 = var45;
            var29 = var37;
            var3 = var29;
            if (!((te) this).field_r.field_b) {
              break L0;
            } else {
              var4 = ((te) this).field_u + ((te) this).field_u + 1;
              var5 = 65536 / var4;
              var6 = ((te) this).field_s + ((te) this).field_s + 1;
              var7 = 65536 / var6;
              var54 = new int[var4][][];
              var46 = var54;
              var38 = var46;
              var30 = var38;
              var8 = var30;
              var9_int = param1 + -((te) this).field_u;
              L1: while (true) {
                if (var9_int > param1 - -((te) this).field_u) {
                  var9 = var53[0];
                  var10 = var53[1];
                  var11 = var53[2];
                  var12 = 0;
                  L2: while (true) {
                    if (ci.field_c <= var12) {
                      break L0;
                    } else {
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      var16 = 0;
                      L3: while (true) {
                        if (var4 <= var16) {
                          var9[var12] = var5 * var13 >> 16;
                          var10[var12] = var5 * var14 >> 16;
                          var11[var12] = var15 * var5 >> 16;
                          var12++;
                          continue L2;
                        } else {
                          var55 = var54[var16];
                          var14 = var14 + var55[1][var12];
                          var15 = var15 + var55[2][var12];
                          var13 = var13 + var55[0][var12];
                          var16++;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  var48 = ((te) this).c(24066, vp.field_I & var9_int, 0);
                  var52 = new int[3][ci.field_c];
                  var12 = 0;
                  var13 = 0;
                  var14 = 0;
                  var49 = var48[0];
                  var50 = var48[1];
                  var51 = var48[2];
                  var18_int = -((te) this).field_s;
                  L4: while (true) {
                    if (var18_int > ((te) this).field_s) {
                      var18 = var52[0];
                      var19 = var52[1];
                      var20 = var52[2];
                      var21 = 0;
                      L5: while (true) {
                        if (ci.field_c <= var21) {
                          var8[-param1 + ((te) this).field_u + var9_int] = var52;
                          var9_int++;
                          continue L1;
                        } else {
                          var18[var21] = var7 * var12 >> 16;
                          var19[var21] = var7 * var13 >> 16;
                          var20[var21] = var14 * var7 >> 16;
                          var22 = jh.field_A & var21 - ((te) this).field_s;
                          var13 = var13 - var50[var22];
                          var21++;
                          var14 = var14 - var51[var22];
                          var12 = var12 - var49[var22];
                          var22 = ((te) this).field_s + var21 & jh.field_A;
                          var12 = var12 + var49[var22];
                          var13 = var13 + var50[var22];
                          var14 = var14 + var51[var22];
                          continue L5;
                        }
                      }
                    } else {
                      var19_int = jh.field_A & var18_int;
                      var12 = var12 + var49[var19_int];
                      var13 = var13 + var50[var19_int];
                      var14 = var14 + var51[var19_int];
                      var18_int++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][] var8 = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int[] var11_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[][] var17 = null;
        int[] var18 = null;
        int[][] var19 = null;
        int[] var20 = null;
        int[][] var21 = null;
        int[] var22 = null;
        int[][] var23 = null;
        var14 = Torquing.field_u;
        var3 = ((te) this).field_l.a(param1, 25657);
        if (param0 >= 86) {
          L0: {
            if (!((te) this).field_l.field_b) {
              break L0;
            } else {
              var4 = 1 + ((te) this).field_u + ((te) this).field_u;
              var5 = 65536 / var4;
              var6 = 1 + (((te) this).field_s + ((te) this).field_s);
              var7 = 65536 / var6;
              var23 = new int[var4][];
              var21 = var23;
              var19 = var21;
              var17 = var19;
              var8 = var17;
              var9 = -((te) this).field_u + param1;
              L1: while (true) {
                if (((te) this).field_u + param1 < var9) {
                  var9 = 0;
                  L2: while (true) {
                    if (var9 >= ci.field_c) {
                      break L0;
                    } else {
                      var10 = 0;
                      var11 = 0;
                      L3: while (true) {
                        if (var4 <= var11) {
                          var3[var9] = var5 * var10 >> 16;
                          var9++;
                          continue L2;
                        } else {
                          var10 = var10 + var23[var11][var9];
                          var11++;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  var10_ref_int__ = ((te) this).b(0, 0, vp.field_I & var9);
                  var22 = new int[ci.field_c];
                  var20 = var22;
                  var18 = var20;
                  var16 = var18;
                  var11_ref_int__ = var16;
                  var12 = 0;
                  var13 = -((te) this).field_s;
                  L4: while (true) {
                    if (((te) this).field_s < var13) {
                      var15 = 0;
                      var13 = var15;
                      L5: while (true) {
                        if (ci.field_c <= var15) {
                          var8[var9 - -((te) this).field_u - param1] = var22;
                          var9++;
                          continue L1;
                        } else {
                          var11_ref_int__[var15] = var7 * var12 >> 16;
                          var12 = var12 - var10_ref_int__[-((te) this).field_s + var15 & jh.field_A];
                          var15++;
                          var12 = var12 + var10_ref_int__[((te) this).field_s + var15 & jh.field_A];
                          continue L5;
                        }
                      }
                    } else {
                      var12 = var12 + var10_ref_int__[jh.field_A & var13];
                      var13++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    public static void b(int param0) {
        if (param0 != -445141584) {
            te.a(-70, 86, 23, -112, 121, 125, -7, -25);
        }
        field_t = null;
    }

    public te() {
        super(1, false);
        ((te) this).field_u = 1;
        ((te) this).field_s = 1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        L0: {
          var9 = Torquing.field_u;
          if (param2 <= -69) {
            break L0;
          } else {
            field_t = null;
            break L0;
          }
        }
        L1: {
          if (param3 < param6) {
            if (param6 < param5) {
              tk.a(param0, param5, param1, param3, param4, param6, ph.field_e, param7, (byte) 122);
              break L1;
            } else {
              if (param5 > param3) {
                tk.a(param0, param6, param1, param3, param7, param5, ph.field_e, param4, (byte) 126);
                break L1;
              } else {
                tk.a(param7, param6, param1, param5, param0, param3, ph.field_e, param4, (byte) 126);
                break L1;
              }
            }
          } else {
            if (param5 <= param3) {
              if (param6 < param5) {
                tk.a(param4, param3, param1, param6, param7, param5, ph.field_e, param0, (byte) 122);
                break L1;
              } else {
                tk.a(param7, param3, param1, param5, param4, param6, ph.field_e, param0, (byte) 116);
                break L1;
              }
            } else {
              tk.a(param4, param5, param1, param6, param0, param3, ph.field_e, param7, (byte) 119);
              break L1;
            }
          }
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            if (param1 == 35) {
              L1: {
                var4_int = param2;
                if (0 == var4_int) {
                  ((te) this).field_s = param0.i((byte) -101);
                  break L1;
                } else {
                  if (var4_int != 1) {
                    if (var4_int != 2) {
                      break L1;
                    } else {
                      L2: {
                        stackOut_10_0 = this;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (param0.i((byte) -101) != 1) {
                          stackOut_12_0 = this;
                          stackOut_12_1 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          break L2;
                        } else {
                          stackOut_11_0 = this;
                          stackOut_11_1 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          break L2;
                        }
                      }
                      ((te) this).field_p = stackIn_13_1 != 0;
                      break L1;
                    }
                  } else {
                    ((te) this).field_u = param0.i((byte) -101);
                    break L1;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("te.H(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        Runtime discarded$0 = Runtime.getRuntime();
        field_t = "Previous";
    }
}
