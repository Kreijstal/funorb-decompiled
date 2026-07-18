/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class en {
    private int[] field_b;
    static String field_a;
    static String field_g;
    boolean field_c;
    private jh field_m;
    private cn field_f;
    private int[] field_j;
    boolean field_h;
    static int field_k;
    static cn field_i;
    static long field_l;
    static hh field_d;
    static String field_e;

    final int[] a(int param0, byte param1) {
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var12 = EscapeVector.field_A;
          if (aj.b(-101)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_3_0;
          if (var3 == 0) {
            break L1;
          } else {
            if (((en) this).field_h) {
              break L1;
            } else {
              if (!((en) this).field_c) {
                break L1;
              } else {
                ((en) this).b((byte) -128);
                break L1;
              }
            }
          }
        }
        if (this.e(127, param0)) {
          var20 = this.c(param0, (byte) -122);
          var18 = var20;
          var16 = var18;
          var14 = var16;
          var4 = var14;
          if (var4 != null) {
            var5 = this.a(10999, param0);
            var19 = new int[var5];
            var17 = var19;
            var15 = var17;
            var13 = var15;
            var6 = var13;
            var7 = 0;
            L2: while (true) {
              if (var19.length <= var7) {
                var7 = 0;
                var8 = 0;
                L3: while (true) {
                  if (var20.length <= var7) {
                    L4: {
                      if (param1 <= -2) {
                        break L4;
                      } else {
                        field_e = null;
                        break L4;
                      }
                    }
                    return var6;
                  } else {
                    var9 = 0;
                    L5: while (true) {
                      if (var9 >= 32) {
                        var7++;
                        continue L3;
                      } else {
                        if (this.a(1, var7, var20, var9)) {
                          var11 = 32 * var7 + var9;
                          var19[var8] = var11;
                          var8++;
                          if (var8 == var5) {
                            return var6;
                          } else {
                            var9++;
                            continue L5;
                          }
                        } else {
                          var9++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
              } else {
                var19[var7] = -1;
                var7++;
                continue L2;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        ci var4 = this.b(param1, false);
        if (!(var4 != null)) {
            return false;
        }
        if (param2 != 0) {
            field_d = null;
        }
        return var4.a(param0, (byte) -100);
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        field_i = null;
        field_g = null;
    }

    final int c(int param0, int param1) {
        int var3 = ((en) this).a(param0, true);
        if (!(param0 != 0)) {
            return var3;
        }
        int var4 = this.d(param0, param1);
        var3 = var3 - var4;
        return var3;
    }

    private final int a(boolean param0, int param1, int[] param2, int[] param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
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
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
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
            L1: {
              if (param1 < param3.length) {
                break L1;
              } else {
                if (param1 < param2.length) {
                  break L1;
                } else {
                  stackOut_2_0 = 0;
                  stackIn_3_0 = stackOut_2_0;
                  return stackIn_3_0;
                }
              }
            }
            ((en) this).field_j = null;
            if (param1 < param3.length) {
              if (param1 < param2.length) {
                stackOut_10_0 = this.c((byte) -101, param3[param1], param2[param1]);
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_8_0 = param3[param1];
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            } else {
              stackOut_5_0 = param2[param1];
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("en.LA(").append(false).append(',').append(param1).append(',');
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
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
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
          throw t.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_11_0;
    }

    private final int a(int[] param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param2 < param0.length) {
                break L1;
              } else {
                if (param2 < param3.length) {
                  break L1;
                } else {
                  stackOut_2_0 = 0;
                  stackIn_3_0 = stackOut_2_0;
                  return stackIn_3_0;
                }
              }
            }
            if (param0.length <= param2) {
              stackOut_6_0 = param3[param2];
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              var5_int = 0;
              if (param3.length > param2) {
                stackOut_11_0 = this.b((byte) -116, param0[param2], param3[param2]);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_9_0 = param0[param2];
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("en.E(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          L3: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(118).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_12_0;
    }

    final void b(byte param0) {
        if (aj.b(-97)) {
            return;
        }
        if (!(!((en) this).field_h)) {
            return;
        }
        int var2 = 95 / ((-79 - param0) / 45);
        if (!(null != ((en) this).field_m)) {
            ((en) this).field_m = tg.b(4, 126);
            ((en) this).field_c = false;
            ((en) this).field_h = false;
        }
    }

    private final void a(byte param0, int[] param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            if (param1 == null) {
              return;
            } else {
              if (((en) this).field_j == null) {
                ((en) this).field_j = param1;
                return;
              } else {
                L1: {
                  var7 = ((en) this).field_j;
                  var3 = var7;
                  var4 = 0;
                  if (var7 != null) {
                    var4 = var7.length;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if (param1.length <= var4) {
                      break L2;
                    } else {
                      var4 = param1.length;
                      break L2;
                    }
                  }
                }
                ((en) this).field_j = new int[var4];
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    ((en) this).field_j[var5] = this.a(false, var5, param1, var7);
                    var5++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3_ref;
            stackOut_20_1 = new StringBuilder().append("en.NA(").append(-82).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    private final int b(byte param0, int param1, int param2) {
        int var4 = 11;
        return ~param2 & param1;
    }

    private final boolean e(int param0, int param1) {
        if (param0 <= 120) {
            return true;
        }
        if (param1 == 0) {
            return true;
        }
        if (1 != param1) {
            return false;
        }
        return true;
    }

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_2_0 = null;
        Class stackOut_9_0 = null;
        Class stackOut_19_0 = null;
        Class stackOut_23_0 = null;
        Class stackOut_27_0 = null;
        Class stackOut_15_0 = null;
        Class stackOut_12_0 = null;
        Class stackOut_5_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (param0.equals((Object) (Object) "B")) {
              stackOut_2_0 = Byte.TYPE;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (!param0.equals((Object) (Object) "I")) {
                if (param0.equals((Object) (Object) "S")) {
                  stackOut_9_0 = Short.TYPE;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (!param0.equals((Object) (Object) "J")) {
                    if (!param0.equals((Object) (Object) "Z")) {
                      if (param0.equals((Object) (Object) "F")) {
                        stackOut_19_0 = Float.TYPE;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      } else {
                        if (param0.equals((Object) (Object) "D")) {
                          stackOut_23_0 = Double.TYPE;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          if (param0.equals((Object) (Object) "C")) {
                            stackOut_27_0 = Character.TYPE;
                            stackIn_28_0 = stackOut_27_0;
                            break L0;
                          } else {
                            return Class.forName(param0);
                          }
                        }
                      }
                    } else {
                      stackOut_15_0 = Boolean.TYPE;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  } else {
                    stackOut_12_0 = Long.TYPE;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                }
              } else {
                stackOut_5_0 = Integer.TYPE;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var2;
            stackOut_29_1 = new StringBuilder().append("en.HA(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L1;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + 38 + ')');
        }
        return stackIn_28_0;
    }

    private final ci b(int param0, boolean param1) {
        if (param0 < 0) {
            return null;
        }
        if (jb.field_l.length <= param0) {
            return null;
        }
        if (param1) {
            field_k = -102;
        }
        return jb.field_l[param0];
    }

    final ed b(int param0, int param1) {
        ci var3 = null;
        L0: {
          if (param1 >= 98) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          var3 = this.b(param0, false);
          if (var3 == null) {
            break L1;
          } else {
            if (null != var3.field_e) {
              return var3.field_e;
            } else {
              break L1;
            }
          }
        }
        return qh.field_l;
    }

    private final void b(byte param0, int param1, int param2, int param3) {
        if (((en) this).a(param3, (byte) -127, 1)) {
            return;
        }
        if (!(((en) this).a(param2, (byte) -127, 1))) {
            return;
        }
        if (param0 > -127) {
            return;
        }
        int var7 = param3;
        int var8 = param3 ^ 255;
        oe var9 = ma.field_a;
        if (var9 == null) {
            return;
        }
        var9.a(param1, false, var7, var8);
    }

    private final void a(int[] param0, int param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 == null) {
              return;
            } else {
              if (((en) this).field_b == null) {
                ((en) this).field_b = new int[param0.length];
                return;
              } else {
                L1: {
                  var7 = ((en) this).field_b;
                  var3 = var7;
                  var4 = 0;
                  if (var7 == null) {
                    break L1;
                  } else {
                    var4 = var7.length;
                    break L1;
                  }
                }
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (param0.length <= var4) {
                      break L2;
                    } else {
                      var4 = param0.length;
                      break L2;
                    }
                  }
                }
                ((en) this).field_b = new int[var4];
                var5 = 0;
                L3: while (true) {
                  if (var4 <= var5) {
                    break L0;
                  } else {
                    ((en) this).field_b[var5] = this.a(var7, 118, var5, param0);
                    var5++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("en.H(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + -20915 + ')');
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param0 <= 1) {
                if (param0 != 1) {
                  stackOut_13_0 = var3_int;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  stackOut_11_0 = param1 * var3_int;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              } else {
                L2: {
                  if ((1 & param0) != 0) {
                    var3_int = var3_int * param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param1 = param1 * param1;
                param0 = param0 >> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "en.Q(" + param0 + ',' + param1 + ',' + -1 + ')');
        }
        return stackIn_14_0;
    }

    final boolean a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (aj.b(-116)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (var5 == 0) {
            break L1;
          } else {
            if (((en) this).field_h) {
              break L1;
            } else {
              if (!((en) this).field_c) {
                break L1;
              } else {
                ((en) this).b((byte) 118);
                break L1;
              }
            }
          }
        }
        if (!((en) this).a(param2, (byte) -128, 1)) {
          if (this.a(param3, param2, param0 + -54)) {
            this.a((byte) -47, 1, param2);
            this.a((byte) -47, 0, param2);
            nk.b(param2, -128);
            if (param0 == 54) {
              L2: {
                var8 = pl.d(126);
                var7 = var8;
                var6 = var7;
                if (var6 == null) {
                  break L2;
                } else {
                  if (4 != var8.length) {
                    break L2;
                  } else {
                    ((en) this).field_f.a(-12328, (hg) (Object) new qd(param2, param1, var8[0], var8[1], var8[2], var8[3]));
                    return true;
                  }
                }
              }
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void d(byte param0, int param1, int param2) {
        int var5 = 0;
        mb var6 = null;
        int var7 = EscapeVector.field_A;
        if (null == jb.field_i) {
            return;
        }
        if (param0 > -63) {
            ((en) this).field_c = false;
        }
        mb[] var8 = jb.field_i;
        mb[] var4 = var8;
        for (var5 = 0; var8.length > var5; var5++) {
            var6 = var8[var5];
            if (var6 == null) {
                return;
            }
            var6.a(11827, param1, param2);
        }
    }

    final void e(int param0) {
        if (aj.b(-123)) {
            return;
        }
        if (!(!((en) this).field_h)) {
            return;
        }
        if (!(((en) this).field_m != null)) {
            return;
        }
        if (param0 != -19636) {
            return;
        }
        if (!(((en) this).field_m.field_h)) {
            return;
        }
        if (!((en) this).field_m.field_g) {
            this.a((byte) -82, ((en) this).field_m.field_i);
            this.a(((en) this).field_m.field_i, -20915);
            ((en) this).field_c = false;
            ((en) this).field_m = null;
            ((en) this).field_h = true;
        } else {
            ((en) this).field_h = false;
            ((en) this).field_m = null;
            ((en) this).field_c = true;
        }
    }

    final static void a(mf param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var2_int = 5;
            if (param0.a(0, da.field_d[var2_int])) {
              sl.field_b[var2_int][0] = fe.a("tutorial", param0, "layer0", true);
              uj.field_a = sl.field_b[var2_int][0];
              sl.field_b[var2_int][2] = fe.a("tutorial", param0, "layer2", true);
              uf.field_e = fe.a("tutorial", param0, "edge_exit_left", true);
              wa.field_b = fe.a("tutorial", param0, "edge_exit_right", true);
              dg.field_r = fe.a("tutorial", param0, "edge_inner_bottom", true);
              ej.field_e = fe.a("tutorial", param0, "edge_inner_bottom_left", true);
              q.field_G = fe.a("tutorial", param0, "edge_inner_bottom_right", true);
              n.field_l = fe.a("tutorial", param0, "edge_inner_left", true);
              cj.field_a = fe.a("tutorial", param0, "edge_inner_right", true);
              mj.field_f = fe.a("tutorial", param0, "edge_inner_top", true);
              bf.field_T = fe.a("tutorial", param0, "edge_inner_top_left", true);
              kn.field_h = fe.a("tutorial", param0, "edge_inner_top_right", true);
              wa.field_e = fe.a("tutorial", param0, "edge_outer", true);
              qf.field_d = fe.a("tutorial", param0, "exitbg", true);
              c.field_n = fe.a("tutorial", param0, "panel", true);
              gm.field_a = fe.a("tutorial", param0, "platform", true);
              tk.field_a[var2_int] = fe.a("tutorial", param0, "texture", true);
              fa.field_c[var2_int] = true;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("en.PA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + 5 + ')');
        }
    }

    final boolean f(int param0, int param1) {
        if (param1 != 1) {
            this.b((byte) 92, -90, -126, -118);
        }
        ci var3 = this.b(param0, false);
        if (var3 == null) {
            return true;
        }
        return var3.field_h;
    }

    final static void a(byte param0, long param1) {
        int var3 = -51 / ((param0 - 41) / 34);
        if (!(0L < param1)) {
            return;
        }
        if (param1 % 10L == 0L) {
            ae.a(-1L + param1, (byte) 118);
            ae.a(1L, (byte) 118);
        } else {
            ae.a(param1, (byte) 118);
        }
    }

    final void a(byte param0) {
        this.b((byte) -128, 1, 0, 18);
        this.b((byte) -128, 1, 1, 19);
        this.b((byte) -128, 1, 2, 20);
        this.b((byte) -128, 1, 3, 21);
        int var2 = 9 / ((-27 - param0) / 41);
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = EscapeVector.field_A;
        if (!(((en) this).field_b != null)) {
            return;
        }
        if (!param0) {
            int discarded$0 = ((en) this).a(42, false);
        }
        for (var2 = 0; ((en) this).field_b.length > var2; var2++) {
            ((en) this).field_b[var2] = 0;
        }
    }

    final int a(int param0, boolean param1) {
        if (!(0 != param0)) {
            return this.b((byte) 119, ((en) this).field_b);
        }
        if (!param1) {
            ((en) this).field_f = null;
        }
        if (param0 != 1) {
            return 0;
        }
        return 32;
    }

    private final int c(byte param0, int param1, int param2) {
        return param1 | param2;
    }

    final void c(int param0, int param1, int param2) {
        jk[] var4 = null;
        int var5 = 0;
        jk var6 = null;
        int var7 = 0;
        jk[] var8 = null;
        var7 = EscapeVector.field_A;
        if (jb.field_k != null) {
          var8 = jb.field_k;
          var4 = var8;
          var5 = param0;
          L0: while (true) {
            if (var8.length <= var5) {
              return;
            } else {
              var6 = var8[var5];
              if (var6 != null) {
                var6.a((byte) 106, param2, param1);
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final int[] c(int param0, byte param1) {
        if (param0 == 0) {
            return ((en) this).field_b;
        }
        if (param0 == 1) {
            return ((en) this).field_j;
        }
        int var3 = 7 % ((param1 - -78) / 38);
        return null;
    }

    private final boolean c(byte param0) {
        return null != ((en) this).field_m;
    }

    private final int a(int param0, int param1) {
        if (param1 == 0) {
            return this.b((byte) 118, ((en) this).field_b);
        }
        if (param1 != 1) {
            return 0;
        }
        return this.b((byte) 114, ((en) this).field_j);
    }

    private final int d(int param0, int param1) {
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        L0: {
          var8 = EscapeVector.field_A;
          var3 = 0;
          if (param1 == 1) {
            break L0;
          } else {
            ((en) this).field_m = null;
            break L0;
          }
        }
        var4 = jb.field_z;
        var5 = 0;
        L1: while (true) {
          if (var4.length <= var5) {
            return var3;
          } else {
            var6 = var4[var5];
            if (!((en) this).a(var6, (byte) -128, param0)) {
              var3++;
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    private final boolean a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var5_int = param2[param1];
              var6 = 1 << param3;
              if ((var6 & var5_int) == 0) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("en.V(").append(1).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param3 + ')');
        }
        return stackIn_3_0 != 0;
    }

    private final void a(int param0, boolean param1, int[] param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
            var5_int = param2[param3];
            var6 = 1 << param0;
            var5_int = var5_int | var6;
            param2[param3] = var5_int;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "en.I(" + param0 + ',' + false + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean b(int param0) {
        int var2 = 25 / ((9 - param0) / 54);
        return this.a(10999, 0) > 0 ? true : false;
    }

    private final void a(byte param0, int param1, int param2) {
        int var6 = 0;
        if (!(this.e(122, param1))) {
            return;
        }
        int[] var7 = this.c(param1, (byte) -16);
        int[] var4 = var7;
        if (var7 == null) {
            return;
        }
        int var5 = param2 / 32;
        if (var5 >= 0) {
            if (!(var5 < var7.length)) {
                return;
            }
            var6 = param2 % 32;
            if (0 > var6) {
                return;
            }
            this.a(var6, false, var7, var5);
            return;
        }
    }

    final boolean b(int param0, byte param1) {
        if (param1 <= 21) {
            field_k = -22;
        }
        ci var3 = this.b(param0, false);
        if (!(var3 != null)) {
            return true;
        }
        return var3.field_f;
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        fd var9 = null;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_33_0 = null;
        int stackIn_37_0 = 0;
        String stackIn_37_1 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        fd stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        String stackOut_26_0 = null;
        String stackOut_25_0 = null;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        int stackOut_36_0 = 0;
        String stackOut_36_1 = null;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_37_0 = 0;
        String stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        fd stackOut_43_0 = null;
        fd stackOut_42_0 = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var1_int = hi.field_o;
              var2 = param0;
              if (2 == f.field_j) {
                var3_long = -bd.field_k + td.b(128);
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if (0 > var2) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (s.field_I.length <= var3) {
                break L0;
              } else {
                L3: {
                  var4 = jj.field_a[var3];
                  if (var4 >= 0) {
                    if (~var4 != ~cb.field_c.field_h) {
                      var5 = gd.field_X;
                      break L3;
                    } else {
                      var5 = pc.field_d;
                      break L3;
                    }
                  } else {
                    var5 = lh.field_e;
                    break L3;
                  }
                }
                L4: {
                  var6 = s.field_I[var3];
                  if (2 != f.field_j) {
                    break L4;
                  } else {
                    if (1 == var2) {
                      L5: {
                        if (tg.field_nb.length >= qm.field_f.length) {
                          stackOut_18_0 = tg.field_nb.length;
                          stackIn_19_0 = stackOut_18_0;
                          break L5;
                        } else {
                          stackOut_17_0 = qm.field_f.length;
                          stackIn_19_0 = stackOut_17_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_19_0;
                        if (~tb.field_G.length < ~nn.field_i.length) {
                          stackOut_21_0 = tb.field_G.length;
                          stackIn_22_0 = stackOut_21_0;
                          break L6;
                        } else {
                          stackOut_20_0 = nn.field_i.length;
                          stackIn_22_0 = stackOut_20_0;
                          break L6;
                        }
                      }
                      L7: {
                        var8 = stackIn_22_0;
                        if (6 > var3) {
                          break L7;
                        } else {
                          if (var3 >= var7 + 6) {
                            break L7;
                          } else {
                            L8: {
                              if (-var7 + var3 + (-6 + tg.field_nb.length) < 0) {
                                stackOut_26_0 = "";
                                stackIn_27_0 = stackOut_26_0;
                                break L8;
                              } else {
                                stackOut_25_0 = tg.field_nb[-var7 + (tg.field_nb.length + var3) - 6];
                                stackIn_27_0 = stackOut_25_0;
                                break L8;
                              }
                            }
                            var6 = stackIn_27_0;
                            break L7;
                          }
                        }
                      }
                      if (var7 + 7 > var3) {
                        break L4;
                      } else {
                        if (~var3 <= ~(var7 + 7 - -var8)) {
                          break L4;
                        } else {
                          L9: {
                            if (-var7 + (-7 + var3) < nn.field_i.length) {
                              stackOut_32_0 = nn.field_i[-var7 + (var3 - 7)];
                              stackIn_33_0 = stackOut_32_0;
                              break L9;
                            } else {
                              stackOut_31_0 = "";
                              stackIn_33_0 = stackOut_31_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L10: {
                  if (var4 != -2) {
                    break L10;
                  } else {
                    var6 = Integer.toString(var2);
                    break L10;
                  }
                }
                L11: {
                  stackOut_36_0 = param0 ^ 94;
                  stackOut_36_1 = (String) var6;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  if (var4 < 0) {
                    stackOut_38_0 = stackIn_38_0;
                    stackOut_38_1 = (String) (Object) stackIn_38_1;
                    stackOut_38_2 = 0;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    stackIn_39_2 = stackOut_38_2;
                    break L11;
                  } else {
                    stackOut_37_0 = stackIn_37_0;
                    stackOut_37_1 = (String) (Object) stackIn_37_1;
                    stackOut_37_2 = 1;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_39_2 = stackOut_37_2;
                    break L11;
                  }
                }
                L12: {
                  var7 = ee.a(stackIn_39_0, stackIn_39_1, stackIn_39_2 != 0);
                  var8 = rn.field_e - (var7 >> 1);
                  if (var4 >= 0) {
                    L13: {
                      var1_int = var1_int + hn.field_s;
                      if (~var4 != ~cb.field_c.field_h) {
                        stackOut_43_0 = of.field_g;
                        stackIn_44_0 = stackOut_43_0;
                        break L13;
                      } else {
                        stackOut_42_0 = gf.field_e;
                        stackIn_44_0 = stackOut_42_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_44_0;
                      if (var9 != null) {
                        var9.a(-fe.field_k + var8, var1_int, -96, var7 + (fe.field_k << 1), (field_k << 1) + ok.field_a);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1_int = var1_int + field_k;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L15: {
                  if (0 <= var4) {
                    pb.field_e.a(var6, var8, var1_int - -he.field_x, var5, -1);
                    var1_int = var1_int + (ok.field_a + (hn.field_s + field_k));
                    break L15;
                  } else {
                    nb.field_a.a(var6, var8, var1_int - -vk.field_t, var5, -1);
                    var1_int = var1_int + je.field_b;
                    break L15;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "en.D(" + param0 + ')');
        }
    }

    en() {
        ((en) this).field_f = new cn();
        int var1 = 1;
        ((en) this).field_j = new int[var1];
        ((en) this).field_b = new int[var1];
        ((en) this).field_f = new cn();
        ((en) this).field_h = false;
        ((en) this).field_c = false;
    }

    final boolean a(int param0, byte param1, int param2) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        if (!this.e(127, param2)) {
          return false;
        } else {
          var7 = this.c(param2, (byte) -14);
          var4 = var7;
          if (var7 == null) {
            return false;
          } else {
            L0: {
              var5 = param0 / 32;
              if (param1 <= -124) {
                break L0;
              } else {
                field_d = null;
                break L0;
              }
            }
            L1: {
              var7 = var4;
              if (0 > var5) {
                break L1;
              } else {
                if (var7.length <= var5) {
                  break L1;
                } else {
                  var6 = param0 % 32;
                  if (var6 >= 0) {
                    return this.a(1, var5, var7, var6);
                  } else {
                    return false;
                  }
                }
              }
            }
            return false;
          }
        }
    }

    final void d(int param0) {
        qd var2 = null;
        int var3 = 0;
        L0: {
          var3 = EscapeVector.field_A;
          if (this.c((byte) -123)) {
            ((en) this).e(-19636);
            break L0;
          } else {
            break L0;
          }
        }
        if (((en) this).field_h) {
          L1: while (true) {
            var2 = (qd) (Object) ((en) this).field_f.c(-20245);
            if (var2 != null) {
              sc.a(var2, 4, 1);
              continue L1;
            } else {
              L2: {
                if (param0 == -32464) {
                  break L2;
                } else {
                  ci discarded$1 = this.b(22, true);
                  break L2;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    private final int b(byte param0, int[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = 0;
                var4 = param1;
                if (param0 > 106) {
                  break L1;
                } else {
                  ((en) this).field_c = false;
                  break L1;
                }
              }
              var5 = 0;
              L2: while (true) {
                if (var5 >= var4.length) {
                  stackOut_9_0 = var3_int;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  var6 = var4[var5];
                  var3_int = var3_int + ej.a(858993459, var6);
                  var5++;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("en.CA(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_a = "Your email address is used to identify this account";
        field_i = new cn();
        field_e = "Level score: ";
    }
}
