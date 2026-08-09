/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends gg {
    int field_o;
    static jh field_m;
    int field_q;
    static String field_l;
    int field_i;
    int field_n;
    static int field_h;
    static gb field_k;
    static volatile long field_s;
    int field_j;
    static nc field_t;
    static boolean field_u;
    static int field_p;
    int field_r;

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param1.length() <= var2_int) {
                    break L3;
                  } else {
                    var3 = param1.charAt(var2_int);
                    stackOut_3_0 = ec.a((char) var3, false);
                    stackIn_11_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0) {
                          break L4;
                        } else {
                          if (!gh.a((char) var3, (byte) -124)) {
                            stackIn_8_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var2_int++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackIn_11_0 = 0;
                break L2;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("lc.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final static boolean b(boolean param0) {
        if (param0) {
            field_s = -117L;
            return og.field_b;
        }
        return og.field_b;
    }

    public static void a(int param0) {
        da var2;
        if (param0 >= -44) {
          var2 = (da) null;
          lc.a((da) null, 54, (String) null, (String) null, (da) null);
          field_t = null;
          field_l = null;
          field_k = null;
          field_m = null;
          return;
        } else {
          field_t = null;
          field_l = null;
          field_k = null;
          field_m = null;
          return;
        }
    }

    final static hd a(da param0, int param1, String param2, String param3, da param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        hd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 1) {
                break L1;
              } else {
                lc.a(113);
                break L1;
              }
            }
            var5_int = param0.c(74, param3);
            var6 = param0.a(param2, -1, var5_int);
            stackIn_3_0 = sk.a((byte) -105, param0, var6, var5_int, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("lc.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, String param2, le param3, mg param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = -1;
              if (param0 >= 110) {
                break L1;
              } else {
                field_u = true;
                break L1;
              }
            }
            var7 = 1;
            L2: while (true) {
              L3: {
                if (param2.length() <= var7) {
                  break L3;
                } else {
                  var8 = param2.charAt(var7);
                  if (var9 == 0) {
                    L4: {
                      if (60 != var8) {
                        break L4;
                      } else {
                        var6 = param3.field_c[0] + (var5_int >> 736013096) - -param4.b(param2.substring(0, var7));
                        break L4;
                      }
                    }
                    L5: {
                      L6: {
                        if (var6 != -1) {
                          break L6;
                        } else {
                          L7: {
                            if (32 != var8) {
                              break L7;
                            } else {
                              var5_int = var5_int + param1;
                              break L7;
                            }
                          }
                          param3.field_c[var7] = (var5_int >> 614037416) + param3.field_c[0] - (-param4.b(param2.substring(0, 1 + var7)) + param4.a((char) var8));
                          if (var9 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      param3.field_c[var7] = var6;
                      break L5;
                    }
                    L8: {
                      if (var8 != 62) {
                        break L8;
                      } else {
                        var6 = -1;
                        break L8;
                      }
                    }
                    var7++;
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("lc.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L9;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L10;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L11;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L11;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, hi param3) {
        fh.field_b = param1;
        if (param0 != 5292) {
            return;
        }
        try {
            he.field_c = param3;
            pg.field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "lc.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, long param1) {
        try {
            InterruptedException interruptedException = null;
            mg var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                Thread.sleep(param1);
                break L0;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                break L1;
              }
            }
            if (param0 != 2767) {
              var4 = (mg) null;
              lc.a(14, 1, (String) null, (le) null, (mg) null);
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private lc() throws Throwable {
        throw new Error();
    }

    static {
        field_s = 0L;
        field_h = 2621440;
        field_t = new nc();
    }
}
