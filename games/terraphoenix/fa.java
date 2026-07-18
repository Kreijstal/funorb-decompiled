/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static ci field_d;
    private Object[][] field_g;
    private boolean field_j;
    private int field_h;
    static int field_a;
    static String field_e;
    private uj field_b;
    static pk field_i;
    private Object[] field_k;
    static String field_c;
    private km field_f;

    final boolean a(int param0, String param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        CharSequence var4 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (!((fa) this).a(param0 ^ param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((fa) this).field_f.field_g.b(1, lb.a(var4, -2964));
              stackOut_5_0 = ((fa) this).e(var3_int, 4);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("fa.S(").append(param0).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_6_0;
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (((fa) this).a(param2 ^ param2)) {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((fa) this).field_f.field_g.b(1, lb.a(var6, -2964));
              if (this.d(var4_int, 121)) {
                var7 = (CharSequence) (Object) param1;
                var5 = ((fa) this).field_f.field_f[var4_int].b(1, lb.a(var7, -2964));
                stackOut_8_0 = ((fa) this).b(var4_int, param2 + 21565, var5);
                stackIn_9_0 = stackOut_8_0;
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
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("fa.E(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    private final synchronized void a(int param0, int param1) {
        L0: {
          if (((fa) this).field_j) {
            ((fa) this).field_k[param0] = (Object) (Object) ((fa) this).field_b.a(param0, -126);
            break L0;
          } else {
            ((fa) this).field_k[param0] = pl.a(((fa) this).field_b.a(param0, -115), false, false);
            break L0;
          }
        }
    }

    final int c(int param0) {
        if (!((fa) this).a(0)) {
          return -1;
        } else {
          L0: {
            if (param0 == -1) {
              break L0;
            } else {
              int discarded$1 = ((fa) this).c(((int[]) ((Object[]) ((fa) this).field_k[1])[0])[2]);
              break L0;
            }
          }
          return ((fa) this).field_f.field_k.length;
        }
    }

    final synchronized byte[] b(int param0, int param1) {
        if (((fa) this).a(param1)) {
          if (((fa) this).field_f.field_k.length == 1) {
            return ((fa) this).b(0, param1 + -117, param0);
          } else {
            if (this.d(param0, param1 + -11)) {
              if (((fa) this).field_f.field_k[param0] == 1) {
                return ((fa) this).b(param0, param1 + 124, 0);
              } else {
                throw new RuntimeException();
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final int b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (((fa) this).a(0)) {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) (Object) param1;
              var3_int = ((fa) this).field_f.field_g.b(1, lb.a(var5, -2964));
              var4 = 88 % ((44 - param0) / 46);
              stackOut_3_0 = ((fa) this).a((byte) -91, var3_int);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("fa.P(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    final byte[] b(int param0, int param1, int param2) {
        int var4 = 5 / ((param1 - 84) / 32);
        return this.a((int[]) null, (byte) 110, param2, param0);
    }

    final synchronized boolean a(int param0) {
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            ((boolean[]) ((Object[]) ((fa) this).field_k[8])[13])[0] = true;
            break L0;
          }
        }
        L1: {
          if (null != ((fa) this).field_f) {
            break L1;
          } else {
            ((fa) this).field_f = ((fa) this).field_b.a((byte) 68);
            if (((fa) this).field_f == null) {
              return false;
            } else {
              ((fa) this).field_g = new Object[((fa) this).field_f.field_j][];
              ((fa) this).field_k = new Object[((fa) this).field_f.field_j];
              break L1;
            }
          }
        }
        return true;
    }

    private final synchronized boolean a(int param0, boolean param1, int[] param2, int param3) {
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
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
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
        dh var26 = null;
        byte[] var27 = null;
        dh var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        dh var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        int[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        int[] var45 = null;
        byte[][] var46 = null;
        int[] var48 = null;
        byte[] var49 = null;
        byte[] var50 = null;
        byte[] var51 = null;
        int[] var52 = null;
        byte[][] var53 = null;
        byte[] var54 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        int stackIn_97_0 = 0;
        int stackIn_111_0 = 0;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        String stackIn_116_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        int stackOut_96_0 = 0;
        int stackOut_110_0 = 0;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        var22 = Terraphoenix.field_V;
        try {
          L0: {
            if (!this.d(param3, -45)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (null == ((fa) this).field_k[param3]) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                var5_int = ((fa) this).field_f.field_d[param3];
                var48 = ((fa) this).field_f.field_r[param3];
                var41 = var48;
                var34 = var41;
                var24 = var34;
                var6 = var24;
                L1: {
                  if (null != ((fa) this).field_g[param3]) {
                    break L1;
                  } else {
                    ((fa) this).field_g[param3] = new Object[((fa) this).field_f.field_k[param3]];
                    break L1;
                  }
                }
                var7 = ((fa) this).field_g[param3];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    if (var9_int >= var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 != null) {
                          var10 = param2[var9_int];
                          break L4;
                        } else {
                          var10 = var9_int;
                          break L4;
                        }
                      }
                      if (null == var7[var10]) {
                        var8 = 0;
                        break L3;
                      } else {
                        var9_int++;
                        continue L2;
                      }
                    }
                  }
                  if (var8 != 0) {
                    stackOut_29_0 = 1;
                    stackIn_30_0 = stackOut_29_0;
                    return stackIn_30_0 != 0;
                  } else {
                    L5: {
                      L6: {
                        if (null == param2) {
                          break L6;
                        } else {
                          L7: {
                            if (param2[0] != 0) {
                              break L7;
                            } else {
                              if (param2[1] != 0) {
                                break L7;
                              } else {
                                if (-1 != param2[2]) {
                                  break L7;
                                } else {
                                  if (-1 != param2[3]) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var49 = ei.a(((fa) this).field_k[param3], true, false);
                          var42 = var49;
                          var35 = var42;
                          var25 = var35;
                          var9_array = var25;
                          var26 = new dh(var49);
                          var26.a(-14328, param2, 5, var26.field_i.length);
                          break L5;
                        }
                      }
                      var9_array = ei.a(((fa) this).field_k[param3], false, false);
                      break L5;
                    }
                    try {
                      L8: {
                        var50 = qg.a(-1, var9_array);
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
                        stackOut_41_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_41_1 = new StringBuilder();
                        stackIn_44_0 = stackOut_41_0;
                        stackIn_44_1 = stackOut_41_1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        if (null == param2) {
                          stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                          stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
                          stackOut_44_2 = 0;
                          stackIn_45_0 = stackOut_44_0;
                          stackIn_45_1 = stackOut_44_1;
                          stackIn_45_2 = stackOut_44_2;
                          break L9;
                        } else {
                          stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
                          stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
                          stackOut_42_2 = 1;
                          stackIn_45_0 = stackOut_42_0;
                          stackIn_45_1 = stackOut_42_1;
                          stackIn_45_2 = stackOut_42_2;
                          break L9;
                        }
                      }
                      throw qk.a((Throwable) (Object) stackIn_45_0, (stackIn_45_2 != 0) + " " + param3 + " " + param2.length + " " + j.a(0, param2.length, var9_array) + " " + j.a(0, -2 + param2.length, var9_array) + " " + ((fa) this).field_f.field_h[param3] + " " + ((fa) this).field_f.field_i);
                    }
                    L10: {
                      if (!((fa) this).field_j) {
                        break L10;
                      } else {
                        ((fa) this).field_k[param3] = null;
                        break L10;
                      }
                    }
                    L11: {
                      if (var5_int > 1) {
                        if (((fa) this).field_h == 2) {
                          var11 = var50.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * var12 * var5_int;
                          var32 = new dh(var51);
                          var14 = 0;
                          var15 = 0;
                          var32.field_k = var11;
                          var16 = 0;
                          L12: while (true) {
                            if (var12 <= var16) {
                              if (var14 != 0) {
                                var54 = new byte[var14];
                                var32.field_k = var11;
                                var14 = 0;
                                var17 = 0;
                                var18 = 0;
                                L13: while (true) {
                                  if (var12 <= var18) {
                                    var7[var15] = (Object) (Object) var54;
                                    break L11;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L14: while (true) {
                                      if (var5_int <= var20) {
                                        var18++;
                                        continue L13;
                                      } else {
                                        L15: {
                                          var19 = var19 + var32.f((byte) -107);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L15;
                                          } else {
                                            var21 = param2[var20];
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          if (var21 != param0) {
                                            break L16;
                                          } else {
                                            ka.a(var51, var17, var54, var14, var19);
                                            var14 = var14 + var19;
                                            break L16;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackOut_96_0 = 1;
                                stackIn_97_0 = stackOut_96_0;
                                return stackIn_97_0 != 0;
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L17: while (true) {
                                if (var18 >= var5_int) {
                                  var16++;
                                  continue L12;
                                } else {
                                  L18: {
                                    var17 = var17 + var32.f((byte) -107);
                                    if (var6 == null) {
                                      var19 = var18;
                                      break L18;
                                    } else {
                                      var19 = param2[var18];
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (param0 == var19) {
                                      var15 = var19;
                                      var14 = var14 + var17;
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  var18++;
                                  continue L17;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var50.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * var12 * var5_int;
                          var29 = new dh(var51);
                          var52 = new int[var5_int];
                          var45 = var52;
                          var38 = var45;
                          var30 = var38;
                          var14_ref_int__ = var30;
                          var29.field_k = var11;
                          var15 = 0;
                          L20: while (true) {
                            if (var15 >= var12) {
                              var53 = new byte[var5_int][];
                              var46 = var53;
                              var39 = var46;
                              var31 = var39;
                              var15_ref_byte____ = var31;
                              var16 = 0;
                              L21: while (true) {
                                if (var5_int <= var16) {
                                  var29.field_k = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L22: while (true) {
                                    if (var12 <= var17) {
                                      var17 = 0;
                                      L23: while (true) {
                                        if (var5_int <= var17) {
                                          break L11;
                                        } else {
                                          L24: {
                                            if (var6 != null) {
                                              var18 = param2[var17];
                                              break L24;
                                            } else {
                                              var18 = var17;
                                              break L24;
                                            }
                                          }
                                          L25: {
                                            if (0 != ((fa) this).field_h) {
                                              var7[var18] = (Object) (Object) var53[var17];
                                              break L25;
                                            } else {
                                              var7[var18] = pl.a(var53[var17], false, false);
                                              break L25;
                                            }
                                          }
                                          var17++;
                                          continue L23;
                                        }
                                      }
                                    } else {
                                      L26: {
                                        var18 = 0;
                                        var19 = 0;
                                        if (var5_int <= var19) {
                                          break L26;
                                        } else {
                                          break L26;
                                        }
                                      }
                                      var17++;
                                      continue L22;
                                    }
                                  }
                                } else {
                                  var15_ref_byte____[var16] = new byte[param2[var16]];
                                  param2[var16] = 0;
                                  var16++;
                                  continue L21;
                                }
                              }
                            } else {
                              L27: {
                                var16 = 0;
                                var17 = 0;
                                if (var5_int <= var17) {
                                  break L27;
                                } else {
                                  break L27;
                                }
                              }
                              var15++;
                              continue L20;
                            }
                          }
                        }
                      } else {
                        L28: {
                          if (null == var6) {
                            var11 = 0;
                            break L28;
                          } else {
                            var11 = param2[0];
                            break L28;
                          }
                        }
                        if (((fa) this).field_h != 0) {
                          var7[var11] = (Object) (Object) var51;
                          break L11;
                        } else {
                          var7[var11] = pl.a(var50, false, false);
                          return true;
                        }
                      }
                    }
                    stackOut_110_0 = 1;
                    stackIn_111_0 = stackOut_110_0;
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
            stackOut_112_0 = (RuntimeException) var5;
            stackOut_112_1 = new StringBuilder().append("fa.D(").append(param0).append(',').append(false).append(',');
            stackIn_115_0 = stackOut_112_0;
            stackIn_115_1 = stackOut_112_1;
            stackIn_113_0 = stackOut_112_0;
            stackIn_113_1 = stackOut_112_1;
            if (param2 == null) {
              stackOut_115_0 = (RuntimeException) (Object) stackIn_115_0;
              stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
              stackOut_115_2 = "null";
              stackIn_116_0 = stackOut_115_0;
              stackIn_116_1 = stackOut_115_1;
              stackIn_116_2 = stackOut_115_2;
              break L29;
            } else {
              stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
              stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
              stackOut_113_2 = "{...}";
              stackIn_116_0 = stackOut_113_0;
              stackIn_116_1 = stackOut_113_1;
              stackIn_116_2 = stackOut_113_2;
              break L29;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_116_0, stackIn_116_2 + ',' + param3 + ')');
        }
        return stackIn_111_0 != 0;
    }

    final boolean d(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((fa) this).a(0)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((fa) this).field_f.field_g.b(1, lb.a(var4, param0 + -2963));
              if (param0 >= ~var3_int) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
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
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("fa.V(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void b(int param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        if (param0 < 34) {
            fa.b(29);
        }
        field_i = null;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        L0: {
          if (param0 == -12432) {
            break L0;
          } else {
            ((long[]) ((fa) this).field_k[0])[0] = 43L;
            break L0;
          }
        }
        if (!((fa) this).a(0)) {
          return false;
        } else {
          L1: {
            if (param2 < 0) {
              break L1;
            } else {
              if (0 > param1) {
                break L1;
              } else {
                if (((fa) this).field_f.field_k.length <= param2) {
                  break L1;
                } else {
                  if (((fa) this).field_f.field_k[param2] > param1) {
                    return true;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          if (!rd.field_o) {
            return false;
          } else {
            throw new IllegalArgumentException(param2 + " " + param1);
          }
        }
    }

    final synchronized boolean a(boolean param0, int param1, int param2) {
        if (!this.a(-12432, param1, param2)) {
          return false;
        } else {
          L0: {
            if (((fa) this).field_g[param2] == null) {
              break L0;
            } else {
              if (((fa) this).field_g[param2][param1] != null) {
                return true;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (!param0) {
              break L1;
            } else {
              boolean discarded$1 = ((fa) this).a(((int[]) ((fa) this).field_k[1])[0]);
              break L1;
            }
          }
          if (((fa) this).field_k[param2] != null) {
            return true;
          } else {
            this.a(param2, 3864);
            if (((fa) this).field_k[param2] == null) {
              return false;
            } else {
              return true;
            }
          }
        }
    }

    private final synchronized boolean d(int param0, int param1) {
        int var3 = 0;
        if (!((fa) this).a(0)) {
          return false;
        } else {
          L0: {
            if (0 > param0) {
              break L0;
            } else {
              if (((fa) this).field_f.field_k.length <= param0) {
                break L0;
              } else {
                if (((fa) this).field_f.field_k[param0] != 0) {
                  var3 = -115 / ((53 - param1) / 32);
                  return true;
                } else {
                  break L0;
                }
              }
            }
          }
          if (!rd.field_o) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
        }
    }

    final boolean a(String param0, byte param1, String param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (!((fa) this).a(0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) (Object) param2;
              var4_int = ((fa) this).field_f.field_g.b(1, lb.a(var6, param1 ^ -3068));
              if (this.d(var4_int, -50)) {
                L1: {
                  if (param1 == 104) {
                    break L1;
                  } else {
                    ((boolean[]) ((fa) this).field_k[0])[5] = false;
                    break L1;
                  }
                }
                var7 = (CharSequence) (Object) param0;
                var5 = ((fa) this).field_f.field_f[var4_int].b(param1 ^ 105, lb.a(var7, -2964));
                stackOut_10_0 = ((fa) this).a(false, var5, var4_int);
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("fa.O(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_11_0;
    }

    final synchronized int a(byte param0, int param1) {
        int var3 = 0;
        if (!this.d(param1, 106)) {
          return 0;
        } else {
          var3 = 71 % ((param0 - 17) / 61);
          if (null != ((fa) this).field_k[param1]) {
            return 100;
          } else {
            return ((fa) this).field_b.b(0, param1);
          }
        }
    }

    private final synchronized byte[] a(int[] param0, byte param1, int param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_10_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        Object stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        Object stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_34_0 = null;
        Object stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        Object stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        Object stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        try {
          L0: {
            if (this.a(-12432, param2, param3)) {
              L1: {
                L2: {
                  var5 = null;
                  if (null == ((fa) this).field_g[param3]) {
                    break L2;
                  } else {
                    if (null != ((fa) this).field_g[param3][param2]) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (this.a(param2, false, param0, param3)) {
                  break L1;
                } else {
                  this.a(param3, 3864);
                  if (this.a(param2, false, param0, param3)) {
                    break L1;
                  } else {
                    stackOut_9_0 = null;
                    stackIn_10_0 = stackOut_9_0;
                    return (byte[]) (Object) stackIn_10_0;
                  }
                }
              }
              if (null == ((fa) this).field_g[param3]) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (((fa) this).field_g[param3][param2] == null) {
                    break L3;
                  } else {
                    var7 = ei.a(((fa) this).field_g[param3][param2], false, false);
                    var5 = (Object) (Object) var7;
                    if (null == var7) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (null != var5) {
                    if (((fa) this).field_h == 1) {
                      ((fa) this).field_g[param3][param2] = null;
                      if (((fa) this).field_f.field_k[param3] == 1) {
                        ((fa) this).field_g[param3] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      if (((fa) this).field_h != 2) {
                        break L4;
                      } else {
                        ((fa) this).field_g[param3] = null;
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                stackOut_34_0 = var5;
                stackIn_35_0 = stackOut_34_0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_36_0 = var5;
            stackOut_36_1 = new StringBuilder().append("fa.M(");
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_39_0 = stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L5;
            } else {
              stackOut_37_0 = stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L5;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + 110 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_35_0;
    }

    final int c(int param0, int param1) {
        if (!this.d(param1, 101)) {
            return 0;
        }
        if (param0 != -540) {
            return -24;
        }
        return ((fa) this).field_f.field_k[param1];
    }

    final int c(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (((fa) this).a(param0 + 1)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((fa) this).field_f.field_g.b(1, lb.a(var4, -2964));
              if (this.d(var3_int, param0 ^ 101)) {
                L1: {
                  if (param0 == -1) {
                    break L1;
                  } else {
                    boolean discarded$2 = this.a(127, 122, 13);
                    break L1;
                  }
                }
                stackOut_8_0 = var3_int;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_4_0 = -1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
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
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("fa.AA(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_9_0;
    }

    final int a(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (this.d(param1, -71)) {
              param2 = param2.toLowerCase();
              var5 = (CharSequence) (Object) param2;
              var4_int = ((fa) this).field_f.field_f[param1].b(1, lb.a(var5, -2964));
              if (this.a(-12432, var4_int, param1)) {
                L1: {
                  if (param0 < -75) {
                    break L1;
                  } else {
                    ((long[]) ((fa) this).field_k[0])[4] = -101L;
                    break L1;
                  }
                }
                stackOut_8_0 = var4_int;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_4_0 = -1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
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
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("fa.A(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        if (!((fa) this).a(0)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((fa) this).field_k.length) {
              L1: {
                if (param0 == 127) {
                  break L1;
                } else {
                  int discarded$1 = ((fa) this).a((byte) -72);
                  break L1;
                }
              }
              if (var2 != 0) {
                var4 = 100 * var3 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (((fa) this).field_f.field_d[var4] > 0) {
                var3 = var3 + ((fa) this).a((byte) -91, var4);
                var2 += 100;
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

    final synchronized boolean b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        if (!((fa) this).a(0)) {
          return false;
        } else {
          L0: {
            var2 = 1;
            var3 = 0;
            if (param0 < -127) {
              break L0;
            } else {
              ((fa) this).field_g = null;
              break L0;
            }
          }
          L1: while (true) {
            if (((fa) this).field_f.field_b.length <= var3) {
              return var2 != 0;
            } else {
              var4 = ((fa) this).field_f.field_b[var3];
              if (null == ((fa) this).field_k[var4]) {
                this.a(var4, 3864);
                if (null == ((fa) this).field_k[var4]) {
                  var2 = 0;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    final synchronized boolean e(int param0, int param1) {
        Object var4 = null;
        if (!this.d(param0, 110)) {
          return false;
        } else {
          if (((fa) this).field_k[param0] != null) {
            return true;
          } else {
            this.a(param0, 3864);
            if (null == ((fa) this).field_k[param0]) {
              if (param1 == 4) {
                return false;
              } else {
                var4 = null;
                boolean discarded$1 = ((fa) this).d(-3, (String) null);
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static ci[] f(int param0) {
        ci[] var3 = new ci[9];
        ci[] var2 = var3;
        var3[4] = nb.a(64, param0, 119);
        return var2;
    }

    fa(uj param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        ((fa) this).field_f = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (2 < param2) {
                  break L1;
                } else {
                  L2: {
                    ((fa) this).field_b = param0;
                    ((fa) this).field_h = param2;
                    stackOut_6_0 = this;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (!param1) {
                      stackOut_8_0 = this;
                      stackOut_8_1 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L2;
                    } else {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L2;
                    }
                  }
                  ((fa) this).field_j = stackIn_9_1 != 0;
                  break L0;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("fa.<init>(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_c = "Squiddy with shielded armour";
        field_e = "Select 'ready' mode";
    }
}
