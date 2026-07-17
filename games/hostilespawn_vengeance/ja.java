/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static int field_d;
    private int field_a;
    private int field_g;
    private gj[] field_j;
    static byte[][] field_e;
    private int field_i;
    String field_b;
    static int field_c;
    static int[] field_h;
    float field_f;

    public static void a(int param0) {
        field_e = null;
        field_h = null;
    }

    final static void a(byte param0, ji param1, boolean param2) {
        try {
            if (ha.field_w.field_p == param1) {
                ha.field_w.field_p = null;
            }
            if (!(ha.field_w.field_u != param1)) {
                ha.field_w.field_u = null;
            }
            db.a(true, 256, param1);
            int var3_int = -47 % ((param0 - -45) / 56);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ja.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final boolean a(byte param0) {
        int var3 = 0;
        gj var5 = null;
        gj var6 = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (param0 > -32) {
          ((ja) this).field_i = -29;
          L0: while (true) {
            if (((ja) this).field_a > ((ja) this).field_i) {
              var6 = ((ja) this).field_j[((ja) this).field_i];
              if (!var6.field_a.a(-15879)) {
                this.a(0, 20467, var6);
                return false;
              } else {
                L1: {
                  if (var6.field_f < 0) {
                    break L1;
                  } else {
                    if (var6.field_a.a(var6.field_f, (byte) 8)) {
                      break L1;
                    } else {
                      this.a(var6.field_a.b(-8102, var6.field_f), 20467, var6);
                      return false;
                    }
                  }
                }
                L2: {
                  if (null == var6.field_c) {
                    break L2;
                  } else {
                    if (!var6.field_a.a(-8088, var6.field_c)) {
                      this.a(var6.field_a.b(-113, var6.field_c), 20467, var6);
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var6.field_f >= 0) {
                    break L3;
                  } else {
                    if (null != var6.field_c) {
                      break L3;
                    } else {
                      if (var6.field_g == null) {
                        break L3;
                      } else {
                        if (var6.field_a.e(0)) {
                          break L3;
                        } else {
                          this.a(var6.field_a.c(0), 20467, var6);
                          return false;
                        }
                      }
                    }
                  }
                }
                ((ja) this).field_i = ((ja) this).field_i + 1;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((ja) this).field_a > ((ja) this).field_i) {
              var5 = ((ja) this).field_j[((ja) this).field_i];
              if (!var5.field_a.a(-15879)) {
                this.a(0, 20467, var5);
                return false;
              } else {
                L5: {
                  if (var5.field_f < 0) {
                    break L5;
                  } else {
                    if (var5.field_a.a(var5.field_f, (byte) 8)) {
                      break L5;
                    } else {
                      this.a(var5.field_a.b(-8102, var5.field_f), 20467, var5);
                      return false;
                    }
                  }
                }
                L6: {
                  if (null == var5.field_c) {
                    break L6;
                  } else {
                    if (!var5.field_a.a(-8088, var5.field_c)) {
                      this.a(var5.field_a.b(-113, var5.field_c), 20467, var5);
                      return false;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (var5.field_f >= 0) {
                    break L7;
                  } else {
                    if (null != var5.field_c) {
                      break L7;
                    } else {
                      if (var5.field_g == null) {
                        break L7;
                      } else {
                        if (var5.field_a.e(0)) {
                          break L7;
                        } else {
                          this.a(var5.field_a.c(0), 20467, var5);
                          return false;
                        }
                      }
                    }
                  }
                }
                ((ja) this).field_i = ((ja) this).field_i + 1;
                continue L4;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
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
            if (!nf.a(param0, -29205)) {
              if (pb.a(17032, param0)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              } else {
                if (!vg.a(true, param0)) {
                  if (param1.length() == 0) {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  } else {
                    if (kc.a(param0, true, param1)) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0 != 0;
                    } else {
                      field_d = -123;
                      if (!vh.a(param1, 29360, param0)) {
                        if (!eg.a(false, param1, param0)) {
                          stackOut_24_0 = 1;
                          stackIn_25_0 = stackOut_24_0;
                          break L0;
                        } else {
                          stackOut_22_0 = 0;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0 != 0;
                        }
                      } else {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0 != 0;
                      }
                    }
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
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
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("ja.B(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L1;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L1;
            }
          }
          L2: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L2;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + 0 + 41);
        }
        return stackIn_25_0 != 0;
    }

    private final void a(int param0, int param1, gj param2) {
        float var4_float = 0.0f;
        try {
            if (param1 != 20467) {
                ((ja) this).field_j = null;
            }
            var4_float = (float)(((ja) this).field_i + 1) + (float)param0 / 100.0f;
            if (param0 == 0) {
                ((ja) this).field_b = param2.field_e;
            } else {
                ((ja) this).field_b = param2.field_g + " - " + param0 + "%";
            }
            ((ja) this).field_f = (float)((ja) this).field_g * var4_float / (float)(1 + ((ja) this).field_a);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ja.G(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(oj param0, byte param1, oc param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param0.field_F <= 1) {
                break L1;
              } else {
                param0.field_F = param0.field_F - 1;
                break L1;
              }
            }
            L2: {
              if (param0.field_F <= 0) {
                break L2;
              } else {
                if (param0.field_F >= 220) {
                  break L2;
                } else {
                  if (param0.field_I <= 0) {
                    break L2;
                  } else {
                    param0.field_e = param0.field_e + 1;
                    if (1000 < param0.field_e) {
                      param0.field_I = param0.field_I - 1;
                      param0.field_e = 0;
                      mm.field_m[el.field_j] = new oj(param2, 1, rl.field_c);
                      mm.field_m[el.field_j].field_F = 1;
                      el.field_j = el.field_j + 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            L3: {
              if (param1 == 113) {
                break L3;
              } else {
                field_c = -3;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ja.E(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!((param0 & param1) == 0)) {
            var2 = -(7 & param1) + 8;
        }
        int var3 = var2 + param1;
        return var3;
    }

    private ja() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_h = new int[]{32, 26};
    }
}
