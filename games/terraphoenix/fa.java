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
        int var3_int = 0;
        RuntimeException var3 = null;
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
              var3_int = ((fa) this).field_f.field_g.b(1, lb.a((CharSequence) (Object) param1, -2964));
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
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
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
        Object stackOut_3_0 = null;
        Object stackOut_8_0 = null;
        byte[] stackOut_10_0 = null;
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
            if (!((fa) this).a(param2 ^ param2)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var4_int = ((fa) this).field_f.field_g.b(1, lb.a((CharSequence) (Object) param0, -2964));
              if (!this.d(var4_int, 121)) {
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                return (byte[]) (Object) stackIn_9_0;
              } else {
                var5 = ((fa) this).field_f.field_f[var4_int].b(1, lb.a((CharSequence) (Object) param1, -2964));
                stackOut_10_0 = ((fa) this).b(var4_int, param2 + 21565, var5);
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("fa.E(");
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
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L1;
            }
          }
          L2: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    private final synchronized void a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (((fa) this).field_j) {
                  break L2;
                } else {
                  ((fa) this).field_k[param0] = pl.a(((fa) this).field_b.a(param0, param1 + -3979), false, false);
                  if (Terraphoenix.field_V == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((fa) this).field_k[param0] = (Object) (Object) ((fa) this).field_b.a(param0, -126);
              break L1;
            }
            L3: {
              if (param1 == 3864) {
                break L3;
              } else {
                ((fa) this).field_g = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var3, "fa.T(" + param0 + ',' + param1 + ')');
        }
    }

    final int c(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            if (!((fa) this).a(0)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  int discarded$2 = ((fa) this).c(((int[]) ((Object[]) ((fa) this).field_k[1])[0])[2]);
                  break L1;
                }
              }
              stackOut_8_0 = ((fa) this).field_f.field_k.length;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "fa.Q(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized byte[] b(int param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_13_0 = null;
        byte[] stackOut_18_0 = null;
        try {
          if (!((fa) this).a(param1)) {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (byte[]) (Object) stackIn_4_0;
          } else {
            if (((fa) this).field_f.field_k.length == 1) {
              stackOut_8_0 = ((fa) this).b(0, param1 + -117, param0);
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            } else {
              if (!this.d(param0, param1 + -11)) {
                stackOut_13_0 = null;
                stackIn_14_0 = stackOut_13_0;
                return (byte[]) (Object) stackIn_14_0;
              } else {
                if (((fa) this).field_f.field_k[param0] == 1) {
                  stackOut_18_0 = ((fa) this).b(param0, param1 + 124, 0);
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0;
                } else {
                  throw new RuntimeException();
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var3, "fa.H(" + param0 + ',' + param1 + ')');
        }
    }

    final int b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
              var3_int = ((fa) this).field_f.field_g.b(1, lb.a((CharSequence) (Object) param1, -2964));
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
        int var4_int = 0;
        RuntimeException var4 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        try {
          L0: {
            var4_int = 5 / ((param1 - 84) / 32);
            stackOut_0_0 = this.a((int[]) null, (byte) 110, param2, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var4, "fa.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final synchronized boolean a(int param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((boolean[]) ((Object[]) ((fa) this).field_k[8])[13])[0] = true;
                break L1;
              }
            }
            L2: {
              if (null != ((fa) this).field_f) {
                break L2;
              } else {
                ((fa) this).field_f = ((fa) this).field_b.a((byte) 68);
                if (((fa) this).field_f == null) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                } else {
                  ((fa) this).field_g = new Object[((fa) this).field_f.field_j][];
                  ((fa) this).field_k = new Object[((fa) this).field_f.field_j];
                  break L2;
                }
              }
            }
            stackOut_12_0 = 1;
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "fa.L(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    private final synchronized boolean a(int param0, boolean param1, int[] param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object[] var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        byte[] var10 = null;
        int var10_int = 0;
        dh var10_ref = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        dh var13 = null;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_36_0 = 0;
        int[] stackIn_52_0 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        int stackIn_60_2 = 0;
        int stackIn_83_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_146_0 = 0;
        int stackIn_148_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_167_0 = 0;
        RuntimeException stackIn_169_0 = null;
        StringBuilder stackIn_169_1 = null;
        RuntimeException stackIn_171_0 = null;
        StringBuilder stackIn_171_1 = null;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        String stackIn_172_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_35_0 = 0;
        Object stackOut_50_0 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        int stackOut_59_2 = 0;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        int stackOut_82_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_166_0 = 0;
        RuntimeException stackOut_168_0 = null;
        StringBuilder stackOut_168_1 = null;
        RuntimeException stackOut_171_0 = null;
        StringBuilder stackOut_171_1 = null;
        String stackOut_171_2 = null;
        RuntimeException stackOut_169_0 = null;
        StringBuilder stackOut_169_1 = null;
        String stackOut_169_2 = null;
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
                L1: {
                  var5_int = ((fa) this).field_f.field_d[param3];
                  var6 = ((fa) this).field_f.field_r[param3];
                  if (!param1) {
                    break L1;
                  } else {
                    ((fa) this).field_g = null;
                    break L1;
                  }
                }
                L2: {
                  if (null != ((fa) this).field_g[param3]) {
                    break L2;
                  } else {
                    ((fa) this).field_g[param3] = new Object[((fa) this).field_f.field_k[param3]];
                    break L2;
                  }
                }
                var7 = ((fa) this).field_g[param3];
                var8 = 1;
                var9_int = 0;
                L3: while (true) {
                  L4: {
                    L5: {
                      L6: {
                        if (~var9_int <= ~var5_int) {
                          break L6;
                        } else {
                          stackOut_19_0 = (int[]) var6;
                          stackIn_52_0 = stackOut_19_0;
                          stackIn_20_0 = stackOut_19_0;
                          if (var22 != 0) {
                            break L5;
                          } else {
                            L7: {
                              L8: {
                                if (stackIn_20_0 != null) {
                                  break L8;
                                } else {
                                  var10_int = var9_int;
                                  if (var22 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              var10_int = var6[var9_int];
                              break L7;
                            }
                            L9: {
                              if (null == var7[var10_int]) {
                                var8 = 0;
                                if (var22 == 0) {
                                  break L6;
                                } else {
                                  break L9;
                                }
                              } else {
                                break L9;
                              }
                            }
                            var9_int++;
                            if (var22 == 0) {
                              continue L3;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      if (var8 != 0) {
                        stackOut_35_0 = 1;
                        stackIn_36_0 = stackOut_35_0;
                        return stackIn_36_0 != 0;
                      } else {
                        L10: {
                          if (null == param2) {
                            break L10;
                          } else {
                            L11: {
                              if (param2[0] != 0) {
                                break L11;
                              } else {
                                if (param2[1] != 0) {
                                  break L11;
                                } else {
                                  if (param2[2] != 0) {
                                    break L11;
                                  } else {
                                    if (param2[3] != 0) {
                                      break L11;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                            var9_array = ei.a(((fa) this).field_k[param3], true, false);
                            var10_ref = new dh(var9_array);
                            var10_ref.a(-14328, param2, 5, var10_ref.field_i.length);
                            break L4;
                          }
                        }
                        stackOut_50_0 = ((fa) this).field_k[param3];
                        stackIn_52_0 = (int[]) (Object) stackOut_50_0;
                        break L5;
                      }
                    }
                    var9_array = ei.a((Object) (Object) stackIn_52_0, false, false);
                    break L4;
                  }
                  try {
                    L12: {
                      var10 = qg.a(-1, var9_array);
                      break L12;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L13: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_56_0 = (RuntimeException) var11_ref_RuntimeException;
                      stackOut_56_1 = new StringBuilder();
                      stackIn_59_0 = stackOut_56_0;
                      stackIn_59_1 = stackOut_56_1;
                      stackIn_57_0 = stackOut_56_0;
                      stackIn_57_1 = stackOut_56_1;
                      if (null == param2) {
                        stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
                        stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
                        stackOut_59_2 = 0;
                        stackIn_60_0 = stackOut_59_0;
                        stackIn_60_1 = stackOut_59_1;
                        stackIn_60_2 = stackOut_59_2;
                        break L13;
                      } else {
                        stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
                        stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
                        stackOut_57_2 = 1;
                        stackIn_60_0 = stackOut_57_0;
                        stackIn_60_1 = stackOut_57_1;
                        stackIn_60_2 = stackOut_57_2;
                        break L13;
                      }
                    }
                    throw qk.a((Throwable) (Object) stackIn_60_0, (stackIn_60_2 != 0) + " " + param3 + " " + var9_array.length + " " + j.a(0, var9_array.length, var9_array) + " " + j.a(0, -2 + var9_array.length, var9_array) + " " + ((fa) this).field_f.field_h[param3] + " " + ((fa) this).field_f.field_i);
                  }
                  L14: {
                    if (!((fa) this).field_j) {
                      break L14;
                    } else {
                      ((fa) this).field_k[param3] = null;
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      L17: {
                        if (var5_int > 1) {
                          break L17;
                        } else {
                          L18: {
                            L19: {
                              if (null == var6) {
                                break L19;
                              } else {
                                var11 = var6[0];
                                if (var22 == 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var11 = 0;
                            break L18;
                          }
                          L20: {
                            L21: {
                              if (((fa) this).field_h != 0) {
                                break L21;
                              } else {
                                var7[var11] = pl.a(var10, false, false);
                                if (var22 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            var7[var11] = (Object) (Object) var10;
                            break L20;
                          }
                          if (var22 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L22: {
                        if (((fa) this).field_h == 2) {
                          break L22;
                        } else {
                          var11 = var10.length;
                          var11--;
                          var12 = var10[var11] & 255;
                          var11 = var11 - 4 * var12 * var5_int;
                          var13 = new dh(var10);
                          var14_ref_int__ = new int[var5_int];
                          var13.field_k = var11;
                          var15 = 0;
                          L23: while (true) {
                            L24: {
                              L25: {
                                if (var15 >= var12) {
                                  break L25;
                                } else {
                                  var16_int = 0;
                                  stackOut_82_0 = 0;
                                  stackIn_92_0 = stackOut_82_0;
                                  stackIn_83_0 = stackOut_82_0;
                                  if (var22 != 0) {
                                    break L24;
                                  } else {
                                    var17 = stackIn_83_0;
                                    L26: while (true) {
                                      L27: {
                                        L28: {
                                          if (~var5_int >= ~var17) {
                                            break L28;
                                          } else {
                                            var16_int = var16_int + var13.f((byte) -107);
                                            var14_ref_int__[var17] = var14_ref_int__[var17] + var16_int;
                                            var17++;
                                            if (var22 != 0) {
                                              break L27;
                                            } else {
                                              if (var22 == 0) {
                                                continue L26;
                                              } else {
                                                break L28;
                                              }
                                            }
                                          }
                                        }
                                        var15++;
                                        break L27;
                                      }
                                      if (var22 == 0) {
                                        continue L23;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_91_0 = var5_int;
                              stackIn_92_0 = stackOut_91_0;
                              break L24;
                            }
                            var15_ref_byte____ = new byte[stackIn_92_0][];
                            var16_int = 0;
                            L29: while (true) {
                              L30: {
                                L31: {
                                  if (var5_int <= var16_int) {
                                    break L31;
                                  } else {
                                    var15_ref_byte____[var16_int] = new byte[var14_ref_int__[var16_int]];
                                    var14_ref_int__[var16_int] = 0;
                                    var16_int++;
                                    if (var22 != 0) {
                                      break L30;
                                    } else {
                                      if (var22 == 0) {
                                        continue L29;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                }
                                var13.field_k = var11;
                                var16_int = 0;
                                break L30;
                              }
                              var17 = 0;
                              L32: while (true) {
                                L33: {
                                  L34: {
                                    if (var12 <= var17) {
                                      break L34;
                                    } else {
                                      var18 = 0;
                                      stackOut_101_0 = 0;
                                      stackIn_111_0 = stackOut_101_0;
                                      stackIn_102_0 = stackOut_101_0;
                                      if (var22 != 0) {
                                        break L33;
                                      } else {
                                        var19 = stackIn_102_0;
                                        L35: while (true) {
                                          L36: {
                                            L37: {
                                              if (var5_int <= var19) {
                                                break L37;
                                              } else {
                                                var18 = var18 + var13.f((byte) -107);
                                                ka.a(var10, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
                                                var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                                var16_int = var16_int + var18;
                                                var19++;
                                                if (var22 != 0) {
                                                  break L36;
                                                } else {
                                                  if (var22 == 0) {
                                                    continue L35;
                                                  } else {
                                                    break L37;
                                                  }
                                                }
                                              }
                                            }
                                            var17++;
                                            break L36;
                                          }
                                          if (var22 == 0) {
                                            continue L32;
                                          } else {
                                            break L34;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_110_0 = 0;
                                  stackIn_111_0 = stackOut_110_0;
                                  break L33;
                                }
                                var17 = stackIn_111_0;
                                L38: while (true) {
                                  L39: {
                                    if (var5_int <= var17) {
                                      break L39;
                                    } else {
                                      if (var22 != 0) {
                                        break L16;
                                      } else {
                                        L40: {
                                          L41: {
                                            if (var6 != null) {
                                              break L41;
                                            } else {
                                              var18 = var17;
                                              if (var22 == 0) {
                                                break L40;
                                              } else {
                                                break L41;
                                              }
                                            }
                                          }
                                          var18 = var6[var17];
                                          break L40;
                                        }
                                        L42: {
                                          L43: {
                                            if (0 != ((fa) this).field_h) {
                                              break L43;
                                            } else {
                                              var7[var18] = pl.a(var15_ref_byte____[var17], false, param1);
                                              if (var22 == 0) {
                                                break L42;
                                              } else {
                                                break L43;
                                              }
                                            }
                                          }
                                          var7[var18] = (Object) (Object) var15_ref_byte____[var17];
                                          break L42;
                                        }
                                        var17++;
                                        if (var22 == 0) {
                                          continue L38;
                                        } else {
                                          break L39;
                                        }
                                      }
                                    }
                                  }
                                  if (var22 == 0) {
                                    break L16;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var11 = var10.length;
                      var11--;
                      var12 = var10[var11] & 255;
                      var11 = var11 - 4 * var12 * var5_int;
                      var13 = new dh(var10);
                      var14 = 0;
                      var15 = 0;
                      var13.field_k = var11;
                      var16_int = 0;
                      L44: while (true) {
                        L45: {
                          L46: {
                            if (var12 <= var16_int) {
                              break L46;
                            } else {
                              var17 = 0;
                              stackOut_129_0 = 0;
                              stackIn_146_0 = stackOut_129_0;
                              stackIn_130_0 = stackOut_129_0;
                              if (var22 != 0) {
                                break L45;
                              } else {
                                var18 = stackIn_130_0;
                                L47: while (true) {
                                  L48: {
                                    L49: {
                                      if (~var18 <= ~var5_int) {
                                        break L49;
                                      } else {
                                        var17 = var17 + var13.f((byte) -107);
                                        if (var22 != 0) {
                                          break L48;
                                        } else {
                                          L50: {
                                            L51: {
                                              if (var6 == null) {
                                                break L51;
                                              } else {
                                                var19 = var6[var18];
                                                if (var22 == 0) {
                                                  break L50;
                                                } else {
                                                  break L51;
                                                }
                                              }
                                            }
                                            var19 = var18;
                                            break L50;
                                          }
                                          L52: {
                                            if (param0 == var19) {
                                              var15 = var19;
                                              var14 = var14 + var17;
                                              break L52;
                                            } else {
                                              break L52;
                                            }
                                          }
                                          var18++;
                                          if (var22 == 0) {
                                            continue L47;
                                          } else {
                                            break L49;
                                          }
                                        }
                                      }
                                    }
                                    var16_int++;
                                    break L48;
                                  }
                                  if (var22 == 0) {
                                    continue L44;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_145_0 = -1;
                          stackIn_146_0 = stackOut_145_0;
                          break L45;
                        }
                        if (stackIn_146_0 != ~var14) {
                          var16 = new byte[var14];
                          var13.field_k = var11;
                          var14 = 0;
                          var17 = 0;
                          var18 = 0;
                          L53: while (true) {
                            L54: {
                              if (~var12 >= ~var18) {
                                break L54;
                              } else {
                                var19 = 0;
                                stackOut_151_0 = 0;
                                stackIn_167_0 = stackOut_151_0;
                                stackIn_152_0 = stackOut_151_0;
                                if (var22 != 0) {
                                  break L15;
                                } else {
                                  var20 = stackIn_152_0;
                                  L55: while (true) {
                                    L56: {
                                      L57: {
                                        if (var5_int <= var20) {
                                          break L57;
                                        } else {
                                          var19 = var19 + var13.f((byte) -107);
                                          if (var22 != 0) {
                                            break L56;
                                          } else {
                                            L58: {
                                              L59: {
                                                if (var6 == null) {
                                                  break L59;
                                                } else {
                                                  var21 = var6[var20];
                                                  if (var22 == 0) {
                                                    break L58;
                                                  } else {
                                                    break L59;
                                                  }
                                                }
                                              }
                                              var21 = var20;
                                              break L58;
                                            }
                                            L60: {
                                              if (var21 != param0) {
                                                break L60;
                                              } else {
                                                ka.a(var10, var17, var16, var14, var19);
                                                var14 = var14 + var19;
                                                break L60;
                                              }
                                            }
                                            var17 = var17 + var19;
                                            var20++;
                                            if (var22 == 0) {
                                              continue L55;
                                            } else {
                                              break L57;
                                            }
                                          }
                                        }
                                      }
                                      var18++;
                                      break L56;
                                    }
                                    if (var22 == 0) {
                                      continue L53;
                                    } else {
                                      break L54;
                                    }
                                  }
                                }
                              }
                            }
                            var7[var15] = (Object) (Object) var16;
                            break L16;
                          }
                        } else {
                          stackOut_147_0 = 1;
                          stackIn_148_0 = stackOut_147_0;
                          return stackIn_148_0 != 0;
                        }
                      }
                    }
                    stackOut_166_0 = 1;
                    stackIn_167_0 = stackOut_166_0;
                    break L15;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L61: {
            var5 = decompiledCaughtException;
            stackOut_168_0 = (RuntimeException) var5;
            stackOut_168_1 = new StringBuilder().append("fa.D(").append(param0).append(',').append(param1).append(',');
            stackIn_171_0 = stackOut_168_0;
            stackIn_171_1 = stackOut_168_1;
            stackIn_169_0 = stackOut_168_0;
            stackIn_169_1 = stackOut_168_1;
            if (param2 == null) {
              stackOut_171_0 = (RuntimeException) (Object) stackIn_171_0;
              stackOut_171_1 = (StringBuilder) (Object) stackIn_171_1;
              stackOut_171_2 = "null";
              stackIn_172_0 = stackOut_171_0;
              stackIn_172_1 = stackOut_171_1;
              stackIn_172_2 = stackOut_171_2;
              break L61;
            } else {
              stackOut_169_0 = (RuntimeException) (Object) stackIn_169_0;
              stackOut_169_1 = (StringBuilder) (Object) stackIn_169_1;
              stackOut_169_2 = "{...}";
              stackIn_172_0 = stackOut_169_0;
              stackIn_172_1 = stackOut_169_1;
              stackIn_172_2 = stackOut_169_2;
              break L61;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_172_0, stackIn_172_2 + ',' + param3 + ')');
        }
        return stackIn_167_0 != 0;
    }

    final boolean d(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
              var3_int = ((fa) this).field_f.field_g.b(1, lb.a((CharSequence) (Object) param1, param0 + -2963));
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
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_d = null;
              field_e = null;
              field_c = null;
              if (param0 >= 34) {
                break L1;
              } else {
                fa.b(29);
                break L1;
              }
            }
            field_i = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "fa.G(" + param0 + ')');
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -12432) {
                break L1;
              } else {
                ((long[]) ((fa) this).field_k[0])[0] = 43L;
                break L1;
              }
            }
            if (!((fa) this).a(0)) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            } else {
              L2: {
                if (param2 < 0) {
                  break L2;
                } else {
                  if (0 > param1) {
                    break L2;
                  } else {
                    if (((fa) this).field_f.field_k.length <= param2) {
                      break L2;
                    } else {
                      if (((fa) this).field_f.field_k[param2] > param1) {
                        stackOut_25_0 = 1;
                        stackIn_26_0 = stackOut_25_0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              if (!rd.field_o) {
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                return stackIn_24_0 != 0;
              } else {
                throw new IllegalArgumentException(param2 + " " + param1);
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var4, "fa.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_26_0 != 0;
    }

    final synchronized boolean a(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        try {
          L0: {
            if (!this.a(-12432, param1, param2)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (((fa) this).field_g[param2] == null) {
                  break L1;
                } else {
                  if (((fa) this).field_g[param2][param1] != null) {
                    stackOut_11_0 = 1;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  boolean discarded$2 = ((fa) this).a(((int[]) ((fa) this).field_k[1])[0]);
                  break L2;
                }
              }
              if (((fa) this).field_k[param2] != null) {
                stackOut_19_0 = 1;
                stackIn_20_0 = stackOut_19_0;
                return stackIn_20_0 != 0;
              } else {
                this.a(param2, 3864);
                if (((fa) this).field_k[param2] == null) {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L0;
                } else {
                  stackOut_22_0 = 1;
                  stackIn_23_0 = stackOut_22_0;
                  return stackIn_23_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var4, "fa.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_25_0 != 0;
    }

    private final synchronized boolean d(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        try {
          L0: {
            if (!((fa) this).a(0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (0 > param0) {
                  break L1;
                } else {
                  if (((fa) this).field_f.field_k.length <= param0) {
                    break L1;
                  } else {
                    if (((fa) this).field_f.field_k[param0] != 0) {
                      var3_int = -115 / ((53 - param1) / 32);
                      stackOut_19_0 = 1;
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              if (!rd.field_o) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0 != 0;
              } else {
                throw new IllegalArgumentException(Integer.toString(param0));
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var3, "fa.U(" + param0 + ',' + param1 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final boolean a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (!((fa) this).a(0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var4_int = ((fa) this).field_f.field_g.b(1, lb.a((CharSequence) (Object) param2, param1 ^ -3068));
              if (this.d(var4_int, -50)) {
                L1: {
                  if (param1 == 104) {
                    break L1;
                  } else {
                    ((boolean[]) ((fa) this).field_k[0])[5] = false;
                    break L1;
                  }
                }
                var5 = ((fa) this).field_f.field_f[var4_int].b(param1 ^ 105, lb.a((CharSequence) (Object) param0, -2964));
                stackOut_11_0 = ((fa) this).a(false, var5, var4_int);
                stackIn_12_0 = stackOut_11_0;
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
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("fa.O(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L2;
            }
          }
          L3: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized int a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            if (!this.d(param1, 106)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var3_int = 71 % ((param0 - 17) / 61);
              if (null != ((fa) this).field_k[param1]) {
                stackOut_8_0 = 100;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                stackOut_10_0 = ((fa) this).field_b.b(0, param1);
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var3, "fa.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    private final synchronized byte[] a(int[] param0, byte param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_12_0 = null;
        byte[] stackIn_24_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        Object stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        Object stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_11_0 = null;
        Object stackOut_41_0 = null;
        byte[] stackOut_23_0 = null;
        Object stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        Object stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        Object stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        try {
          L0: {
            if (!this.a(-12432, param2, param3)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
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
                var6 = this.a(param2, false, param0, param3) ? 1 : 0;
                if (var6 != 0) {
                  break L1;
                } else {
                  this.a(param3, 3864);
                  var6 = this.a(param2, false, param0, param3) ? 1 : 0;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    stackOut_11_0 = null;
                    stackIn_12_0 = stackOut_11_0;
                    return (byte[]) (Object) stackIn_12_0;
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
                    var5 = (Object) (Object) ei.a(((fa) this).field_g[param3][param2], false, false);
                    if (null == var5) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  }
                }
                if (param1 >= 75) {
                  L4: {
                    if (null != var5) {
                      L5: {
                        if (((fa) this).field_h == 1) {
                          break L5;
                        } else {
                          if (((fa) this).field_h != 2) {
                            break L4;
                          } else {
                            ((fa) this).field_g[param3] = null;
                            if (Terraphoenix.field_V == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      ((fa) this).field_g[param3][param2] = null;
                      if (((fa) this).field_f.field_k[param3] == 1) {
                        ((fa) this).field_g[param3] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  stackOut_41_0 = var5;
                  stackIn_42_0 = stackOut_41_0;
                  break L0;
                } else {
                  stackOut_23_0 = (byte[]) ((fa) this).field_k[10];
                  stackIn_24_0 = stackOut_23_0;
                  return stackIn_24_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_43_0 = var5;
            stackOut_43_1 = new StringBuilder().append("fa.M(");
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_46_0 = stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L6;
            } else {
              stackOut_44_0 = stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L6;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_42_0;
    }

    final int c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.d(param1, 101)) {
              if (param0 == -540) {
                stackOut_6_0 = ((fa) this).field_f.field_k[param1];
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = -24;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var3, "fa.W(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final int c(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((fa) this).a(param0 + 1)) {
              param1 = param1.toLowerCase();
              var3_int = ((fa) this).field_f.field_g.b(1, lb.a((CharSequence) (Object) param1, -2964));
              if (this.d(var3_int, param0 ^ 101)) {
                L1: {
                  if (param0 == -1) {
                    break L1;
                  } else {
                    boolean discarded$2 = this.a(127, 122, 13);
                    break L1;
                  }
                }
                stackOut_9_0 = var3_int;
                stackIn_10_0 = stackOut_9_0;
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
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("fa.AA(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0;
    }

    final int a(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (this.d(param1, -71)) {
              param2 = param2.toLowerCase();
              var4_int = ((fa) this).field_f.field_f[param1].b(1, lb.a((CharSequence) (Object) param2, -2964));
              if (this.a(-12432, var4_int, param1)) {
                L1: {
                  if (param0 < -75) {
                    break L1;
                  } else {
                    ((long[]) ((fa) this).field_k[0])[4] = -101L;
                    break L1;
                  }
                }
                stackOut_9_0 = var4_int;
                stackIn_10_0 = stackOut_9_0;
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
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("fa.A(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0;
    }

    final synchronized int a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        byte stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            if (!((fa) this).a(0)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var2_int = 0;
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 >= ((fa) this).field_k.length) {
                      break L3;
                    } else {
                      stackOut_8_0 = -1;
                      stackOut_8_1 = ~((fa) this).field_f.field_d[var4];
                      stackIn_15_0 = stackOut_8_0;
                      stackIn_15_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_9_0 <= stackIn_9_1) {
                            break L4;
                          } else {
                            var3 = var3 + ((fa) this).a((byte) -91, var4);
                            var2_int += 100;
                            break L4;
                          }
                        }
                        var4++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_14_0 = param0;
                  stackOut_14_1 = 127;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L2;
                }
                L5: {
                  if (stackIn_15_0 == stackIn_15_1) {
                    break L5;
                  } else {
                    int discarded$2 = ((fa) this).a((byte) -72);
                    break L5;
                  }
                }
                if (var2_int != 0) {
                  var4 = 100 * var3 / var2_int;
                  stackOut_21_0 = var4;
                  stackIn_22_0 = stackOut_21_0;
                  break L0;
                } else {
                  stackOut_19_0 = 100;
                  stackIn_20_0 = stackOut_19_0;
                  return stackIn_20_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "fa.K(" + param0 + ')');
        }
        return stackIn_22_0;
    }

    final synchronized boolean b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            if (!((fa) this).a(0)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                var2_int = 1;
                var3 = 0;
                if (param0 < -127) {
                  break L1;
                } else {
                  ((fa) this).field_g = null;
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  L4: {
                    if (~((fa) this).field_f.field_b.length >= ~var3) {
                      break L4;
                    } else {
                      stackOut_10_0 = ((fa) this).field_f.field_b[var3];
                      stackIn_18_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          var4 = stackIn_11_0;
                          if (null != ((fa) this).field_k[var4]) {
                            break L5;
                          } else {
                            this.a(var4, 3864);
                            if (null != ((fa) this).field_k[var4]) {
                              break L5;
                            } else {
                              var2_int = 0;
                              break L5;
                            }
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_17_0 = var2_int;
                  stackIn_18_0 = stackOut_17_0;
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "fa.B(" + param0 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final synchronized boolean e(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_11_0 = 0;
        try {
          L0: {
            if (!this.d(param0, 110)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (((fa) this).field_k[param0] != null) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                this.a(param0, 3864);
                if (null == ((fa) this).field_k[param0]) {
                  L1: {
                    if (param1 == 4) {
                      break L1;
                    } else {
                      boolean discarded$2 = ((fa) this).d(-3, (String) null);
                      break L1;
                    }
                  }
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var3, "fa.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final static ci[] f(int param0, int param1) {
        ci[] var2 = null;
        RuntimeException var2_ref = null;
        ci[] stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        ci[] stackOut_0_0 = null;
        try {
          L0: {
            var2 = new ci[9];
            var2[param1] = nb.a(64, param0, 119);
            stackOut_0_0 = (ci[]) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2_ref, "fa.R(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    fa(uj param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
                  ((fa) this).field_b = param0;
                  ((fa) this).field_h = param2;
                  ((fa) this).field_j = param1;
                  break L0;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("fa.<init>(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
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
