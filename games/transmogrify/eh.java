/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eh {
    private static long[] field_d;
    static h field_e;
    static ti[] field_c;
    static int field_a;
    static ii[] field_b;

    final static void a(ol param0, byte param1, String param2, kg param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            L1: while (true) {
              if (var7 >= param2.length()) {
                L2: {
                  if (param1 == 79) {
                    break L2;
                  } else {
                    eh.b((byte) 42);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var8 = param2.charAt(var7);
                  if (var8 == 60) {
                    var6 = (var5_int >> 8) - -param0.field_g[0] - -param3.a(param2.substring(0, var7));
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-1 != var6) {
                    param0.field_g[var7] = var6;
                    break L4;
                  } else {
                    L5: {
                      if (32 != var8) {
                        break L5;
                      } else {
                        var5_int = var5_int + param4;
                        break L5;
                      }
                    }
                    param0.field_g[var7] = param0.field_g[0] + ((var5_int >> 8) - (-param3.a(param2.substring(0, var7 + 1)) - -param3.a((char) var8)));
                    break L4;
                  }
                }
                L6: {
                  if (var8 == 62) {
                    var6 = -1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("eh.B(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param4 + ')');
        }
    }

    public static void a() {
        field_b = null;
        field_d = null;
        int var1 = 0;
        field_c = null;
        field_e = null;
    }

    final static void a(sj param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        j var3_ref_j = null;
        j var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 >= 52) {
                break L1;
              } else {
                field_a = -6;
                break L1;
              }
            }
            L2: {
              var2_int = param0.field_t;
              if (param0.field_k == null) {
                break L2;
              } else {
                if (param0.field_k == od.field_g) {
                  break L2;
                } else {
                  if (null != param0.field_k.field_e[param0.field_s]) {
                    break L2;
                  } else {
                    param0.a(param0.field_s, 28, param0.field_k);
                    param0 = null;
                    break L2;
                  }
                }
              }
            }
            L3: {
              if (param0 == null) {
                break L3;
              } else {
                L4: {
                  if (param0.field_h != 0) {
                    var3_ref_j = wk.field_a;
                    var4 = si.field_i;
                    break L4;
                  } else {
                    var4 = wk.field_a;
                    var3_ref_j = si.field_i;
                    break L4;
                  }
                }
                var5 = 0;
                L5: while (true) {
                  L6: {
                    if (var3_ref_j.field_e.length <= var5) {
                      break L6;
                    } else {
                      if (null == var3_ref_j.field_e[var5]) {
                        param0.a(var5, 28, var3_ref_j);
                        param0 = null;
                        break L6;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                  if (param0 == null) {
                    break L3;
                  } else {
                    var7 = 0;
                    var5 = var7;
                    L7: while (true) {
                      if (var7 >= var4.field_e.length) {
                        break L3;
                      } else {
                        if (var4.field_e[var7] == null) {
                          param0.a(var7, 28, var4);
                          break L3;
                        } else {
                          var7++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
            var3 = 1 + var2_int;
            L8: while (true) {
              L9: {
                if (var3 >= 12) {
                  break L9;
                } else {
                  if (od.field_g.field_e[var3] != null) {
                    od.field_g.field_e[var3].a(-1 + var3, 28, od.field_g);
                    var3++;
                    continue L8;
                  } else {
                    break L9;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var2;
            stackOut_30_1 = new StringBuilder().append("eh.D(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param1 + ')');
        }
    }

    final static void b(byte param0) {
        try {
            int var1_int = 0;
            int var3 = Transmogrify.field_A ? 1 : 0;
            if (!(null == oh.field_h)) {
                oh.field_h.a(-2025316960);
            }
            if (!(fd.field_d == null)) {
                fd.field_d.c(-20444);
            }
            if (!(kk.field_b == null)) {
                {
                    kk.field_b.a((byte) -96);
                }
            }
            if (null != oa.field_m) {
                for (var1_int = 0; var1_int < oa.field_m.length; var1_int++) {
                    if (!(oa.field_m[var1_int] == null)) {
                        {
                            oa.field_m[var1_int].a((byte) -61);
                        }
                    }
                }
            }
            if (param0 < 97) {
                Object var4 = null;
                eh.a((ol) null, (byte) 4, (String) null, (kg) null, -68);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static sa a(ii[] param0, int param1, byte[] param2) {
        RuntimeException var5 = null;
        int[] var5_array = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        byte[][] var10 = null;
        int var11_int = 0;
        sa var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        byte[] var22 = null;
        int var23 = 0;
        byte[] var24 = null;
        int var25 = 0;
        byte[] var26 = null;
        int var27 = 0;
        int var28 = 0;
        sa stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        sa stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var28 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (256 != param0.length) {
              throw new IllegalArgumentException();
            } else {
              var5_array = new int[256];
              var6 = new int[256];
              var7 = new int[256];
              var8 = new int[256];
              var9 = new int[]{0, 255, 119};
              var10 = new byte[256][];
              var11_int = param1;
              L1: while (true) {
                if (var11_int >= 256) {
                  var11 = new sa(param2, var5_array, var6, var7, var8, var9, var10);
                  var11.field_D = var11.field_D - 1;
                  var11.field_t = var11.field_t - 1;
                  var11.field_y = var11.field_y - 1;
                  stackOut_25_0 = (sa) var11;
                  stackIn_26_0 = stackOut_25_0;
                  break L0;
                } else {
                  var5_array[var11_int] = param0[var11_int].field_c + -1;
                  var6[var11_int] = -1 + param0[var11_int].field_b;
                  var7[var11_int] = 2 + param0[var11_int].field_f;
                  var8[var11_int] = param0[var11_int].field_g - -2;
                  var10[var11_int] = new byte[var7[var11_int] * var8[var11_int]];
                  var12 = new byte[var7[var11_int] * var8[var11_int]];
                  var13 = param0[var11_int].field_i;
                  var14 = param0[var11_int].field_f;
                  var15 = param0[var11_int].field_g;
                  var16 = var7[var11_int];
                  var17 = var16 - var14;
                  var18 = 0;
                  var19 = 1 + var7[var11_int];
                  var20 = 0;
                  L2: while (true) {
                    if (var15 <= var20) {
                      var19 = var7[var11_int] + 1;
                      var18 = 0;
                      var20 = 0;
                      L3: while (true) {
                        if (var20 >= var15) {
                          var11_int++;
                          continue L1;
                        } else {
                          var21 = 0;
                          L4: while (true) {
                            if (var14 <= var21) {
                              var19 = var19 + var17;
                              var20++;
                              continue L3;
                            } else {
                              L5: {
                                int incrementValue$3 = var18;
                                var18++;
                                if (var13[incrementValue$3] == 0) {
                                  var19++;
                                  break L5;
                                } else {
                                  int incrementValue$4 = var19;
                                  var19++;
                                  var12[incrementValue$4] = (byte) 1;
                                  break L5;
                                }
                              }
                              var21++;
                              continue L4;
                            }
                          }
                        }
                      }
                    } else {
                      var21 = 0;
                      L6: while (true) {
                        if (var14 <= var21) {
                          var19 = var19 + var17;
                          var20++;
                          continue L2;
                        } else {
                          L7: {
                            int incrementValue$5 = var18;
                            var18++;
                            if (0 != var13[incrementValue$5]) {
                              var22 = var12;
                              var23 = -var16 + var19;
                              var24 = var12;
                              var25 = -1 + var19;
                              var26 = var12;
                              var27 = var19 - -1;
                              var12[var19 + var16] = (byte) 2;
                              var26[var27] = (byte) 2;
                              var24[var25] = (byte) 2;
                              var22[var23] = (byte) 2;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          var19++;
                          var21++;
                          continue L6;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var5;
            stackOut_27_1 = new StringBuilder().append("eh.C(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          L9: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param1).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + 255 + ',' + 119 + ')');
        }
        return stackIn_26_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_d = new long[256];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            field_a = 0;
            return;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                field_d[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((1L & var0) == 1L) {
                  var0 = -3932672073523589310L ^ var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
