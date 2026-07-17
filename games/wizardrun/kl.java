/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    private Object[][] field_c;
    private Object[] field_b;
    private boolean field_a;
    static String field_e;
    private hl field_g;
    private int field_f;
    private pc field_d;

    final boolean a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (!((kl) this).b(17820)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param0 == 29) {
                  break L1;
                } else {
                  ((long[]) ((kl) this).field_b[0])[20] = -49L;
                  break L1;
                }
              }
              var4 = (CharSequence) (Object) param1;
              var3_int = ((kl) this).field_d.field_h.b((byte) 60, wj.a(var4, 2148));
              stackOut_6_0 = ((kl) this).a(false, var3_int);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("kl.D(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    final int b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (((kl) this).b(param0 + 17821)) {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  var4 = null;
                  boolean discarded$2 = ((kl) this).a(((byte[]) ((kl) this).field_b[0])[10], (String) null);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var5 = (CharSequence) (Object) param1;
              var3_int = ((kl) this).field_d.field_h.b((byte) 98, wj.a(var5, 2148));
              if (!this.a(var3_int, 6447)) {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                return var3_int;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("kl.AA(").append(param0).append(44);
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
          throw bd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0;
    }

    final int a(int param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -11986) {
                break L1;
              } else {
                ((kl) this).field_b = null;
                break L1;
              }
            }
            if (this.a(param0, 6447)) {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) (Object) param1;
              var4_int = ((kl) this).field_d.field_x[param0].b((byte) 80, wj.a(var5, 2148));
              if (this.a(var4_int, param0, true)) {
                stackOut_8_0 = var4_int;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            } else {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("kl.T(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 41);
        }
        return stackIn_9_0;
    }

    private final synchronized boolean a(boolean param0, int[] param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        va var26 = null;
        byte[] var27 = null;
        va var29 = null;
        va var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        int[] var46 = null;
        byte[][] var47 = null;
        int[] var48 = null;
        byte[] var49 = null;
        byte[] var50 = null;
        byte[] var51 = null;
        byte[] var52 = null;
        int[] var53 = null;
        byte[][] var54 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_56_0 = 0;
        int stackIn_100_0 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_55_0 = 0;
        int stackOut_99_0 = 0;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        var22 = wizardrun.field_H;
        try {
          L0: {
            if (!this.a(param2, 6447)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (null == ((kl) this).field_b[param2]) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                L1: {
                  var5_int = ((kl) this).field_d.field_p[param2];
                  var48 = ((kl) this).field_d.field_w[param2];
                  var41 = var48;
                  var34 = var41;
                  var24 = var34;
                  var6 = var24;
                  if (((kl) this).field_c[param2] == null) {
                    ((kl) this).field_c[param2] = new Object[((kl) this).field_d.field_t[param2]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((kl) this).field_c[param2];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var9_int >= var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 == null) {
                          var10 = var9_int;
                          break L4;
                        } else {
                          var10 = var48[var9_int];
                          break L4;
                        }
                      }
                      if (null != var7[var10]) {
                        var9_int++;
                        continue L2;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                  }
                  if (var8 != 0) {
                    stackOut_22_0 = 1;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0 != 0;
                  } else {
                    L5: {
                      L6: {
                        if (param1 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (param1[0] != 0) {
                              break L7;
                            } else {
                              if (param1[1] != 0) {
                                break L7;
                              } else {
                                if (0 != param1[2]) {
                                  break L7;
                                } else {
                                  if (0 != param1[3]) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var49 = bh.a((byte) 104, ((kl) this).field_b[param2], true);
                          var42 = var49;
                          var35 = var42;
                          var25 = var35;
                          var9_array = var25;
                          var26 = new va(var49);
                          var26.a(false, param1, 5, var26.field_k.length);
                          break L5;
                        }
                      }
                      var9_array = bh.a((byte) 115, ((kl) this).field_b[param2], false);
                      break L5;
                    }
                    try {
                      L8: {
                        var50 = dg.a(var9_array, 31027);
                        var43 = var50;
                        var36 = var43;
                        var27 = var36;
                        var23 = var27;
                        var51 = var23;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_34_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_34_1 = new StringBuilder();
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_36_1 = stackOut_34_1;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        if (param1 == null) {
                          stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                          stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                          stackOut_36_2 = 0;
                          stackIn_37_0 = stackOut_36_0;
                          stackIn_37_1 = stackOut_36_1;
                          stackIn_37_2 = stackOut_36_2;
                          break L9;
                        } else {
                          stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                          stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                          stackOut_35_2 = 1;
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_37_1 = stackOut_35_1;
                          stackIn_37_2 = stackOut_35_2;
                          break L9;
                        }
                      }
                      throw bd.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + " " + param2 + " " + param1.length + " " + bi.a(var9_array, 10510, param1.length) + " " + bi.a(var9_array, 10510, -2 + param1.length) + " " + ((kl) this).field_d.field_q[param2] + " " + ((kl) this).field_d.field_i);
                    }
                    L10: {
                      if (((kl) this).field_a) {
                        ((kl) this).field_b[param2] = null;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (1 >= var5_int) {
                        L12: {
                          if (var6 != null) {
                            var11 = var48[0];
                            break L12;
                          } else {
                            var11 = 0;
                            break L12;
                          }
                        }
                        if (((kl) this).field_f != 0) {
                          var7[var11] = (Object) (Object) var51;
                          break L11;
                        } else {
                          int discarded$4 = 0;
                          int discarded$5 = 0;
                          var7[var11] = pi.a(var23);
                          break L11;
                        }
                      } else {
                        if (((kl) this).field_f != 2) {
                          var11 = var50.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - var5_int * var12 * 4;
                          var31 = new va(var51);
                          var53 = new int[var5_int];
                          var46 = var53;
                          var39 = var46;
                          var32 = var39;
                          var14 = var32;
                          var31.field_m = var11;
                          var15_int = 0;
                          L13: while (true) {
                            if (var12 <= var15_int) {
                              var54 = new byte[var5_int][];
                              var47 = var54;
                              var40 = var47;
                              var33 = var40;
                              var15 = var33;
                              var16 = 0;
                              L14: while (true) {
                                if (var16 >= var5_int) {
                                  var31.field_m = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L15: while (true) {
                                    if (var17 >= var12) {
                                      var17 = 0;
                                      L16: while (true) {
                                        if (var5_int <= var17) {
                                          break L11;
                                        } else {
                                          L17: {
                                            if (var6 != null) {
                                              var18 = var48[var17];
                                              break L17;
                                            } else {
                                              var18 = var17;
                                              break L17;
                                            }
                                          }
                                          L18: {
                                            if (0 == ((kl) this).field_f) {
                                              int discarded$6 = 0;
                                              int discarded$7 = 0;
                                              var7[var18] = pi.a(var54[var17]);
                                              break L18;
                                            } else {
                                              var7[var18] = (Object) (Object) var54[var17];
                                              break L18;
                                            }
                                          }
                                          var17++;
                                          continue L16;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L19: while (true) {
                                        if (var19 >= var5_int) {
                                          var17++;
                                          continue L15;
                                        } else {
                                          var18 = var18 + var31.i(255);
                                          g.a(var51, var16, var54[var19], var53[var19], var18);
                                          var16 = var16 + var18;
                                          var14[var19] = var14[var19] + var18;
                                          var19++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var15[var16] = new byte[var53[var16]];
                                  var53[var16] = 0;
                                  var16++;
                                  continue L14;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L20: while (true) {
                                if (var17 >= var5_int) {
                                  var15_int++;
                                  continue L13;
                                } else {
                                  var16 = var16 + var31.i(255);
                                  var14[var17] = var14[var17] + var16;
                                  var17++;
                                  continue L20;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var50.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * var12 * var5_int;
                          var29 = new va(var51);
                          var14_int = 0;
                          var15_int = 0;
                          var29.field_m = var11;
                          var16 = 0;
                          L21: while (true) {
                            if (var16 >= var12) {
                              if (var14_int != 0) {
                                var52 = new byte[var14_int];
                                var29.field_m = var11;
                                var14_int = 0;
                                var17 = 0;
                                var18 = 0;
                                L22: while (true) {
                                  if (var18 >= var12) {
                                    var7[var15_int] = (Object) (Object) var52;
                                    return true;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L23: while (true) {
                                      if (var5_int <= var20) {
                                        var18++;
                                        continue L22;
                                      } else {
                                        L24: {
                                          var19 = var19 + var29.i(255);
                                          if (var6 != null) {
                                            var21 = var48[var20];
                                            break L24;
                                          } else {
                                            var21 = var20;
                                            break L24;
                                          }
                                        }
                                        L25: {
                                          if (param3 != var21) {
                                            break L25;
                                          } else {
                                            g.a(var51, var17, var52, var14_int, var19);
                                            var14_int = var14_int + var19;
                                            break L25;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L23;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackOut_55_0 = 1;
                                stackIn_56_0 = stackOut_55_0;
                                return stackIn_56_0 != 0;
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L26: while (true) {
                                if (var5_int <= var18) {
                                  var16++;
                                  continue L21;
                                } else {
                                  L27: {
                                    var17 = var17 + var29.i(255);
                                    if (var6 == null) {
                                      var19 = var18;
                                      break L27;
                                    } else {
                                      var19 = var48[var18];
                                      break L27;
                                    }
                                  }
                                  L28: {
                                    if (param3 != var19) {
                                      break L28;
                                    } else {
                                      break L28;
                                    }
                                  }
                                  var18++;
                                  continue L26;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_99_0 = 1;
                    stackIn_100_0 = stackOut_99_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var5 = decompiledCaughtException;
            stackOut_101_0 = (RuntimeException) var5;
            stackOut_101_1 = new StringBuilder().append("kl.Q(").append(0).append(44);
            stackIn_103_0 = stackOut_101_0;
            stackIn_103_1 = stackOut_101_1;
            stackIn_102_0 = stackOut_101_0;
            stackIn_102_1 = stackOut_101_1;
            if (param1 == null) {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "null";
              stackIn_104_0 = stackOut_103_0;
              stackIn_104_1 = stackOut_103_1;
              stackIn_104_2 = stackOut_103_2;
              break L29;
            } else {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "{...}";
              stackIn_104_0 = stackOut_102_0;
              stackIn_104_1 = stackOut_102_1;
              stackIn_104_2 = stackOut_102_2;
              break L29;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_104_0, stackIn_104_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_100_0 != 0;
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.setFocusTraversalKeysEnabled(false);
        param1.addKeyListener((java.awt.event.KeyListener) (Object) ff.field_H);
        if (param0 != 0) {
            return;
        }
        try {
            param1.addFocusListener((java.awt.event.FocusListener) (Object) ff.field_H);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "kl.M(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final synchronized boolean d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = wizardrun.field_H;
        if (!((kl) this).b(17820)) {
          return false;
        } else {
          var2 = -35 / (param0 / 45);
          var3 = 1;
          var4 = 0;
          L0: while (true) {
            if (((kl) this).field_d.field_c.length <= var4) {
              return var3 != 0;
            } else {
              var5 = ((kl) this).field_d.field_c[var4];
              if (((kl) this).field_b[var5] == null) {
                this.c(var5, -15053);
                if (((kl) this).field_b[var5] == null) {
                  var3 = 0;
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    private final synchronized boolean a(int param0, int param1, boolean param2) {
        if (((kl) this).b(17820)) {
          L0: {
            if (param1 < 0) {
              break L0;
            } else {
              if (0 > param0) {
                break L0;
              } else {
                if (param1 >= ((kl) this).field_d.field_t.length) {
                  break L0;
                } else {
                  if (((kl) this).field_d.field_t[param1] > param0) {
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          if (!v.field_a) {
            return false;
          } else {
            throw new IllegalArgumentException(param1 + " " + param0);
          }
        } else {
          return false;
        }
    }

    private final synchronized byte[] a(int param0, int param1, int[] param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        Object stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            if (this.a(param1, param3, true)) {
              L1: {
                L2: {
                  var5 = null;
                  if (((kl) this).field_c[param3] == null) {
                    break L2;
                  } else {
                    if (((kl) this).field_c[param3][param1] != null) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!this.a(false, param2, param3, param1)) {
                  this.c(param3, -15053);
                  if (this.a(false, param2, param3, param1)) {
                    break L1;
                  } else {
                    stackOut_9_0 = null;
                    stackIn_10_0 = stackOut_9_0;
                    return (byte[]) (Object) stackIn_10_0;
                  }
                } else {
                  break L1;
                }
              }
              if (null != ((kl) this).field_c[param3]) {
                L3: {
                  if (((kl) this).field_c[param3][param1] == null) {
                    break L3;
                  } else {
                    var7 = bh.a((byte) 115, ((kl) this).field_c[param3][param1], false);
                    var5 = (Object) (Object) var7;
                    if (var7 != null) {
                      break L3;
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                }
                L4: {
                  if (var5 != null) {
                    if (1 == ((kl) this).field_f) {
                      ((kl) this).field_c[param3][param1] = null;
                      if (((kl) this).field_d.field_t[param3] == 1) {
                        ((kl) this).field_c[param3] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      if (((kl) this).field_f != 2) {
                        break L4;
                      } else {
                        ((kl) this).field_c[param3] = null;
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                stackOut_24_0 = var5;
                stackIn_25_0 = stackOut_24_0;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_26_0 = var5;
            stackOut_26_1 = new StringBuilder().append("kl.H(").append(1).append(44).append(param1).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_27_0 = stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L5;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param3 + 41);
        }
        return (byte[]) (Object) stackIn_25_0;
    }

    final synchronized boolean b(int param0) {
        if (param0 != 17820) {
            return true;
        }
        if (((kl) this).field_d != null) {
            return true;
        }
        ((kl) this).field_d = ((kl) this).field_g.b(false);
        if (null == ((kl) this).field_d) {
            return false;
        }
        ((kl) this).field_b = new Object[((kl) this).field_d.field_s];
        ((kl) this).field_c = new Object[((kl) this).field_d.field_s][];
        return true;
    }

    final boolean c(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (((kl) this).b(17820)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((kl) this).field_d.field_h.b((byte) 117, wj.a(var4, param0 ^ -2149));
              if (param0 < ~var3_int) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return true;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("kl.K(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final int d(int param0, int param1) {
        if (!(this.a(param1, 6447))) {
            return 0;
        }
        if (param0 > -81) {
            ((kl) this).field_f = ((int[]) ((kl) this).field_b[1])[2];
        }
        return ((kl) this).field_d.field_t[param1];
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var4_int = -66 / ((param0 - -18) / 54);
            if (((kl) this).b(17820)) {
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var7 = (CharSequence) (Object) param2;
              var5 = ((kl) this).field_d.field_h.b((byte) 104, wj.a(var7, 2148));
              if (this.a(var5, 6447)) {
                var8 = (CharSequence) (Object) param1;
                var6 = ((kl) this).field_d.field_x[var5].b((byte) 99, wj.a(var8, 2148));
                stackOut_6_0 = ((kl) this).a(var6, var5, 1);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("kl.S(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0;
    }

    private final synchronized boolean a(int param0, int param1) {
        if (!((kl) this).b(17820)) {
            return false;
        }
        if (param0 >= 0) {
            if (param0 < ((kl) this).field_d.field_t.length) {
                if (((kl) this).field_d.field_t[param0] != 0) {
                    return true;
                }
            }
        }
        if (!v.field_a) {
            return false;
        }
        throw new IllegalArgumentException(Integer.toString(param0));
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((kl) this).field_c = null;
                break L1;
              }
            }
            if (((kl) this).b(17820)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((kl) this).field_d.field_h.b((byte) 102, wj.a(var4, 2148));
              stackOut_5_0 = ((kl) this).b((byte) -72, var3_int);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("kl.BA(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final int c(int param0) {
        if (param0 != 0) {
            byte[] discarded$0 = ((kl) this).a(51, (String) null, (String) ((Object[]) ((kl) this).field_b[10])[2]);
        }
        if (!(((kl) this).b(17820))) {
            return -1;
        }
        return ((kl) this).field_d.field_t.length;
    }

    final synchronized int b(byte param0, int param1) {
        if (!(this.a(param1, 6447))) {
            return 0;
        }
        if (param0 >= -33) {
            return 44;
        }
        if (!(((kl) this).field_b[param1] == null)) {
            return 100;
        }
        return ((kl) this).field_g.a(false, param1);
    }

    final synchronized int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = wizardrun.field_H;
        if (!((kl) this).b(17820)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((kl) this).field_b.length) {
              L1: {
                if (param0 == 75) {
                  break L1;
                } else {
                  var6 = null;
                  kl.a(-90, (java.awt.Component) null);
                  break L1;
                }
              }
              if (var2 == 0) {
                return 100;
              } else {
                var4 = var3 * 100 / var2;
                return var4;
              }
            } else {
              if (0 < ((kl) this).field_d.field_p[var4]) {
                var2 += 100;
                var3 = var3 + ((kl) this).b((byte) -95, var4);
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final synchronized byte[] a(byte param0, int param1) {
        if (!((kl) this).b(17820)) {
            return null;
        }
        if (!(((kl) this).field_d.field_t.length != 1)) {
            return ((kl) this).a(param1, 0, 1);
        }
        if (!this.a(param1, 6447)) {
            return null;
        }
        if (param0 >= -126) {
            return null;
        }
        if (((kl) this).field_d.field_t[param1] == 1) {
            return ((kl) this).a(0, param1, 1);
        }
        throw new RuntimeException();
    }

    private final synchronized void c(int param0, int param1) {
        if (param1 != -15053) {
            return;
        }
        if (!((kl) this).field_a) {
            int discarded$1 = 0;
            int discarded$2 = 0;
            ((kl) this).field_b[param0] = pi.a(((kl) this).field_g.a((byte) -23, param0));
        } else {
            ((kl) this).field_b[param0] = (Object) (Object) ((kl) this).field_g.a((byte) -22, param0);
        }
    }

    final static boolean a(char param0) {
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          L1: {
            L2: {
              if (param0 < 48) {
                break L2;
              } else {
                if (param0 <= 57) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 < 65) {
                break L3;
              } else {
                if (param0 <= 90) {
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param0 < 97) {
                break L4;
              } else {
                if (param0 > 122) {
                  break L4;
                } else {
                  break L1;
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
          stackOut_9_0 = 1;
          stackIn_11_0 = stackOut_9_0;
          break L0;
        }
        return stackIn_11_0 != 0;
    }

    static int b(int param0, int param1) {
        return param0 & param1;
    }

    final synchronized boolean a(int param0, int param1, byte param2) {
        if (!this.a(param1, param0, true)) {
            return false;
        }
        if (((kl) this).field_c[param0] != null) {
            if (null != ((kl) this).field_c[param0][param1]) {
                return true;
            }
        }
        if (!(null == ((kl) this).field_b[param0])) {
            return true;
        }
        this.c(param0, param2 + -14987);
        if (((kl) this).field_b[param0] != null) {
            return true;
        }
        if (param2 != -66) {
            ((kl) this).field_f = -125;
            return false;
        }
        return false;
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!((kl) this).b(17820)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                if (param2 < -125) {
                  break L1;
                } else {
                  boolean discarded$2 = ((kl) this).d(-13);
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) (Object) param1;
              var4_int = ((kl) this).field_d.field_h.b((byte) 63, wj.a(var6, 2148));
              if (!this.a(var4_int, 6447)) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                var7 = (CharSequence) (Object) param0;
                var5 = ((kl) this).field_d.field_x[var4_int].b((byte) 89, wj.a(var7, 2148));
                stackOut_10_0 = ((kl) this).a(var4_int, var5, (byte) -66);
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("kl.A(");
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
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
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
          throw bd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 41);
        }
        return stackIn_11_0;
    }

    final synchronized boolean a(boolean param0, int param1) {
        if (param0) {
            ((byte[]) ((kl) this).field_b[7])[1] = (byte) -124;
        }
        if (!(this.a(param1, 6447))) {
            return false;
        }
        if (null != ((kl) this).field_b[param1]) {
            return true;
        }
        this.c(param1, -15053);
        if (((kl) this).field_b[param1] != null) {
            return true;
        }
        return false;
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param2 != 1) {
            int discarded$0 = 1;
            boolean discarded$1 = kl.a('');
        }
        return this.a(1, param0, (int[]) null, param1);
    }

    public static void a(int param0) {
        if (param0 != 22775) {
            field_e = null;
        }
        field_e = null;
    }

    kl(hl param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((kl) this).field_d = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (2 >= param2) {
                  L2: {
                    ((kl) this).field_g = param0;
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((kl) this).field_a = stackIn_7_1 != 0;
                  ((kl) this).field_f = param2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("kl.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Orb points: <%0>";
    }
}
