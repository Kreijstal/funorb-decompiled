/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    int field_b;
    static ip field_n;
    static String[][] field_m;
    boolean field_j;
    private Object[][] field_l;
    private Object[] field_g;
    private be field_k;
    static String field_c;
    private ng field_a;
    static String field_i;
    static String field_d;
    static String field_h;
    static boolean field_e;
    static ri field_f;

    final synchronized byte[] a(String param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_12_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_11_0 = null;
        byte[] stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (!((ul) this).a((byte) -120)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                param1 = param1.toLowerCase();
                var4_int = ((ul) this).field_k.field_d.a(1481485697, kd.a((CharSequence) (Object) param0, -79));
                if (!param2) {
                  break L1;
                } else {
                  ul.b(((byte[]) ((ul) this).field_g[3])[9]);
                  break L1;
                }
              }
              if (!this.b(var4_int, -120)) {
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                return (byte[]) (Object) stackIn_12_0;
              } else {
                var5 = ((ul) this).field_k.field_n[var4_int].a(1481485697, kd.a((CharSequence) (Object) param1, -93));
                stackOut_13_0 = ((ul) this).a(var4_int, true, var5);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("ul.V(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L2;
            }
          }
          L3: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param2 + ')');
        }
        return stackIn_14_0;
    }

    final boolean a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_8_0 = false;
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
            if (!((ul) this).a((byte) -110)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  ((ul) this).field_l = null;
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var3_int = ((ul) this).field_k.field_d.a(1481485697, kd.a((CharSequence) (Object) param1, -53));
              stackOut_8_0 = ((ul) this).a(-126, var3_int);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ul.A(").append(param0).append(',');
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
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized boolean a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (!this.b(param1, 101)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (((ul) this).field_g[param1] == null) {
                this.c(-127, param1);
                if (param0 <= -118) {
                  if (((ul) this).field_g[param1] != null) {
                    stackOut_14_0 = 1;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0 != 0;
                  } else {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "ul.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final synchronized boolean b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.a(param0, 6327, param1)) {
              if (param2 == 0) {
                L1: {
                  if (null == ((ul) this).field_l[param1]) {
                    break L1;
                  } else {
                    if (null == ((ul) this).field_l[param1][param0]) {
                      break L1;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0 != 0;
                    }
                  }
                }
                if (null != ((ul) this).field_g[param1]) {
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0 != 0;
                } else {
                  this.c(-113, param1);
                  if (null != ((ul) this).field_g[param1]) {
                    stackOut_20_0 = 1;
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0 != 0;
                  } else {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    break L0;
                  }
                }
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
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var4, "ul.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    private final synchronized void c(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (((ul) this).field_j) {
                  break L2;
                } else {
                  ((ul) this).field_g[param1] = ai.a(-137, false, ((ul) this).field_a.a(-123, param1));
                  if (!ZombieDawnMulti.field_E) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ul) this).field_g[param1] = (Object) (Object) ((ul) this).field_a.a(-123, param1);
              break L1;
            }
            L3: {
              if (param0 < -85) {
                break L3;
              } else {
                ((ul) this).field_k = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "ul.F(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_c = null;
              field_h = null;
              if (param0 == -35) {
                break L1;
              } else {
                ul.b((byte) -55);
                break L1;
              }
            }
            field_m = null;
            field_n = null;
            field_f = null;
            field_d = null;
            field_i = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "ul.D(" + param0 + ')');
        }
    }

    private final synchronized byte[] a(int param0, int param1, int param2, int[] param3) {
        Object var5 = null;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        Object stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        Object stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_46_0 = null;
        Object stackOut_29_0 = null;
        Object stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        Object stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        Object stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        try {
          L0: {
            if (!this.a(param1, param2 ^ -31366, param0)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              L1: {
                L2: {
                  var5 = null;
                  if (((ul) this).field_l[param0] == null) {
                    break L2;
                  } else {
                    if (null == ((ul) this).field_l[param0][param1]) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var6 = this.a(param0, true, param3, param1) ? 1 : 0;
                if (var6 != 0) {
                  break L1;
                } else {
                  this.c(-101, param0);
                  var6 = this.a(param0, true, param3, param1) ? 1 : 0;
                  if (var6 == 0) {
                    stackOut_15_0 = null;
                    stackIn_16_0 = stackOut_15_0;
                    return (byte[]) (Object) stackIn_16_0;
                  } else {
                    break L1;
                  }
                }
              }
              if (((ul) this).field_l[param0] == null) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (null != ((ul) this).field_l[param0][param1]) {
                    var5 = (Object) (Object) h.a(((ul) this).field_l[param0][param1], -110, false);
                    if (var5 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                if (param2 == -25139) {
                  L4: {
                    if (null == var5) {
                      break L4;
                    } else {
                      L5: {
                        if (1 != ((ul) this).field_b) {
                          break L5;
                        } else {
                          ((ul) this).field_l[param0][param1] = null;
                          if (((ul) this).field_k.field_b[param0] != 1) {
                            break L4;
                          } else {
                            ((ul) this).field_l[param0] = null;
                            if (!ZombieDawnMulti.field_E) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (2 != ((ul) this).field_b) {
                        break L4;
                      } else {
                        ((ul) this).field_l[param0] = null;
                        break L4;
                      }
                    }
                  }
                  stackOut_46_0 = var5;
                  stackIn_47_0 = stackOut_46_0;
                  break L0;
                } else {
                  stackOut_29_0 = null;
                  stackIn_30_0 = stackOut_29_0;
                  return (byte[]) (Object) stackIn_30_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_48_0 = var5;
            stackOut_48_1 = new StringBuilder().append("ul.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_51_0 = stackOut_48_0;
            stackIn_51_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param3 == null) {
              stackOut_51_0 = stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L6;
            } else {
              stackOut_49_0 = stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_52_0 = stackOut_49_0;
              stackIn_52_1 = stackOut_49_1;
              stackIn_52_2 = stackOut_49_2;
              break L6;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ')');
        }
        return (byte[]) (Object) stackIn_47_0;
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
        int var10_int = 0;
        byte[] var10 = null;
        k var10_ref = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        k var13 = null;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        byte[] var16_ref_byte__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        int stackIn_50_2 = 0;
        int stackIn_74_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_158_0 = 0;
        RuntimeException stackIn_160_0 = null;
        StringBuilder stackIn_160_1 = null;
        RuntimeException stackIn_162_0 = null;
        StringBuilder stackIn_162_1 = null;
        RuntimeException stackIn_163_0 = null;
        StringBuilder stackIn_163_1 = null;
        String stackIn_163_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        int stackOut_49_2 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        int stackOut_47_2 = 0;
        int stackOut_73_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_159_0 = null;
        StringBuilder stackOut_159_1 = null;
        RuntimeException stackOut_162_0 = null;
        StringBuilder stackOut_162_1 = null;
        String stackOut_162_2 = null;
        RuntimeException stackOut_160_0 = null;
        StringBuilder stackOut_160_1 = null;
        String stackOut_160_2 = null;
        var22 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (this.b(param0, -116)) {
              if (((ul) this).field_g[param0] != null) {
                L1: {
                  var5_int = ((ul) this).field_k.field_s[param0];
                  var6 = ((ul) this).field_k.field_i[param0];
                  if (null == ((ul) this).field_l[param0]) {
                    ((ul) this).field_l[param0] = new Object[((ul) this).field_k.field_b[param0]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((ul) this).field_l[param0];
                var8 = param1 ? 1 : 0;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (~var9_int <= ~var5_int) {
                        break L4;
                      } else {
                        if (var22 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (null != var6) {
                                break L6;
                              } else {
                                var10_int = var9_int;
                                if (var22 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var10_int = var6[var9_int];
                            break L5;
                          }
                          L7: {
                            if (null != var7[var10_int]) {
                              break L7;
                            } else {
                              var8 = 0;
                              if (var22 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var9_int++;
                          if (var22 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var8 != 0) {
                      break L3;
                    } else {
                      L8: {
                        L9: {
                          if (param2 == null) {
                            break L9;
                          } else {
                            L10: {
                              if (0 != param2[0]) {
                                break L10;
                              } else {
                                if (param2[1] != 0) {
                                  break L10;
                                } else {
                                  if (param2[2] != 0) {
                                    break L10;
                                  } else {
                                    if (param2[3] == 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                            var9_array = h.a(((ul) this).field_g[param0], -42, true);
                            var10_ref = new k(var9_array);
                            var10_ref.a(var10_ref.field_m.length, param2, -2564, 5);
                            break L8;
                          }
                        }
                        var9_array = h.a(((ul) this).field_g[param0], -124, false);
                        break L8;
                      }
                      try {
                        L11: {
                          var10 = hb.a(var9_array, 0);
                          break L11;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L12: {
                          var11_ref_RuntimeException = decompiledCaughtException;
                          stackOut_46_0 = (RuntimeException) var11_ref_RuntimeException;
                          stackOut_46_1 = new StringBuilder();
                          stackIn_49_0 = stackOut_46_0;
                          stackIn_49_1 = stackOut_46_1;
                          stackIn_47_0 = stackOut_46_0;
                          stackIn_47_1 = stackOut_46_1;
                          if (param2 == null) {
                            stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                            stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                            stackOut_49_2 = 0;
                            stackIn_50_0 = stackOut_49_0;
                            stackIn_50_1 = stackOut_49_1;
                            stackIn_50_2 = stackOut_49_2;
                            break L12;
                          } else {
                            stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                            stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                            stackOut_47_2 = 1;
                            stackIn_50_0 = stackOut_47_0;
                            stackIn_50_1 = stackOut_47_1;
                            stackIn_50_2 = stackOut_47_2;
                            break L12;
                          }
                        }
                        throw fa.a((Throwable) (Object) stackIn_50_0, (stackIn_50_2 != 0) + " " + param0 + " " + var9_array.length + " " + pb.a(var9_array, var9_array.length, (byte) -42) + " " + pb.a(var9_array, -2 + var9_array.length, (byte) 109) + " " + ((ul) this).field_k.field_r[param0] + " " + ((ul) this).field_k.field_o);
                      }
                      L13: {
                        if (((ul) this).field_j) {
                          ((ul) this).field_g[param0] = null;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        L15: {
                          L16: {
                            if (var5_int > 1) {
                              break L16;
                            } else {
                              L17: {
                                L18: {
                                  if (var6 == null) {
                                    break L18;
                                  } else {
                                    var11 = var6[0];
                                    if (var22 == 0) {
                                      break L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                var11 = 0;
                                break L17;
                              }
                              L19: {
                                L20: {
                                  if (((ul) this).field_b != 0) {
                                    break L20;
                                  } else {
                                    var7[var11] = ai.a(-137, false, var10);
                                    if (var22 == 0) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                var7[var11] = (Object) (Object) var10;
                                break L19;
                              }
                              if (var22 == 0) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          L21: {
                            if (((ul) this).field_b != 2) {
                              break L21;
                            } else {
                              var11 = var10.length;
                              var11--;
                              var12 = 255 & var10[var11];
                              var11 = var11 - var12 * (var5_int * 4);
                              var13 = new k(var10);
                              var14_int = 0;
                              var15_int = 0;
                              var13.field_j = var11;
                              var16 = 0;
                              L22: while (true) {
                                L23: {
                                  L24: {
                                    if (var16 >= var12) {
                                      break L24;
                                    } else {
                                      var17 = 0;
                                      stackOut_73_0 = 0;
                                      stackIn_90_0 = stackOut_73_0;
                                      stackIn_74_0 = stackOut_73_0;
                                      if (var22 != 0) {
                                        break L23;
                                      } else {
                                        var18 = stackIn_74_0;
                                        L25: while (true) {
                                          L26: {
                                            L27: {
                                              if (~var5_int >= ~var18) {
                                                break L27;
                                              } else {
                                                var17 = var17 + var13.i(-1478490344);
                                                if (var22 != 0) {
                                                  break L26;
                                                } else {
                                                  L28: {
                                                    L29: {
                                                      if (var6 != null) {
                                                        break L29;
                                                      } else {
                                                        var19 = var18;
                                                        if (var22 == 0) {
                                                          break L28;
                                                        } else {
                                                          break L29;
                                                        }
                                                      }
                                                    }
                                                    var19 = var6[var18];
                                                    break L28;
                                                  }
                                                  L30: {
                                                    if (var19 == param3) {
                                                      var14_int = var14_int + var17;
                                                      var15_int = var19;
                                                      break L30;
                                                    } else {
                                                      break L30;
                                                    }
                                                  }
                                                  var18++;
                                                  if (var22 == 0) {
                                                    continue L25;
                                                  } else {
                                                    break L27;
                                                  }
                                                }
                                              }
                                            }
                                            var16++;
                                            break L26;
                                          }
                                          if (var22 == 0) {
                                            continue L22;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_89_0 = 0;
                                  stackIn_90_0 = stackOut_89_0;
                                  break L23;
                                }
                                if (stackIn_90_0 == var14_int) {
                                  stackOut_93_0 = 1;
                                  stackIn_94_0 = stackOut_93_0;
                                  return stackIn_94_0 != 0;
                                } else {
                                  var16_ref_byte__ = new byte[var14_int];
                                  var13.field_j = var11;
                                  var14_int = 0;
                                  var17 = 0;
                                  var18 = 0;
                                  L31: while (true) {
                                    L32: {
                                      if (var18 >= var12) {
                                        break L32;
                                      } else {
                                        var19 = 0;
                                        stackOut_97_0 = 0;
                                        stackIn_158_0 = stackOut_97_0;
                                        stackIn_98_0 = stackOut_97_0;
                                        if (var22 != 0) {
                                          break L14;
                                        } else {
                                          var20 = stackIn_98_0;
                                          L33: while (true) {
                                            L34: {
                                              L35: {
                                                if (~var20 <= ~var5_int) {
                                                  break L35;
                                                } else {
                                                  var19 = var19 + var13.i(-1478490344);
                                                  if (var22 != 0) {
                                                    break L34;
                                                  } else {
                                                    L36: {
                                                      L37: {
                                                        if (null != var6) {
                                                          break L37;
                                                        } else {
                                                          var21 = var20;
                                                          if (var22 == 0) {
                                                            break L36;
                                                          } else {
                                                            break L37;
                                                          }
                                                        }
                                                      }
                                                      var21 = var6[var20];
                                                      break L36;
                                                    }
                                                    L38: {
                                                      if (var21 == param3) {
                                                        d.a(var10, var17, var16_ref_byte__, var14_int, var19);
                                                        var14_int = var14_int + var19;
                                                        break L38;
                                                      } else {
                                                        break L38;
                                                      }
                                                    }
                                                    var17 = var17 + var19;
                                                    var20++;
                                                    if (var22 == 0) {
                                                      continue L33;
                                                    } else {
                                                      break L35;
                                                    }
                                                  }
                                                }
                                              }
                                              var18++;
                                              break L34;
                                            }
                                            if (var22 == 0) {
                                              continue L31;
                                            } else {
                                              break L32;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var7[var15_int] = (Object) (Object) var16_ref_byte__;
                                    if (var22 == 0) {
                                      break L15;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var11 = var10.length;
                          var11--;
                          var12 = 255 & var10[var11];
                          var11 = var11 - 4 * var12 * var5_int;
                          var13 = new k(var10);
                          var14 = new int[var5_int];
                          var13.field_j = var11;
                          var15_int = 0;
                          L39: while (true) {
                            L40: {
                              L41: {
                                if (~var12 >= ~var15_int) {
                                  break L41;
                                } else {
                                  var16 = 0;
                                  stackOut_116_0 = 0;
                                  stackIn_126_0 = stackOut_116_0;
                                  stackIn_117_0 = stackOut_116_0;
                                  if (var22 != 0) {
                                    break L40;
                                  } else {
                                    var17 = stackIn_117_0;
                                    L42: while (true) {
                                      L43: {
                                        L44: {
                                          if (var5_int <= var17) {
                                            break L44;
                                          } else {
                                            var16 = var16 + var13.i(-1478490344);
                                            var14[var17] = var14[var17] + var16;
                                            var17++;
                                            if (var22 != 0) {
                                              break L43;
                                            } else {
                                              if (var22 == 0) {
                                                continue L42;
                                              } else {
                                                break L44;
                                              }
                                            }
                                          }
                                        }
                                        var15_int++;
                                        break L43;
                                      }
                                      if (var22 == 0) {
                                        continue L39;
                                      } else {
                                        break L41;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_125_0 = var5_int;
                              stackIn_126_0 = stackOut_125_0;
                              break L40;
                            }
                            var15 = new byte[stackIn_126_0][];
                            var16 = 0;
                            L45: while (true) {
                              L46: {
                                L47: {
                                  if (var16 >= var5_int) {
                                    break L47;
                                  } else {
                                    var15[var16] = new byte[var14[var16]];
                                    var14[var16] = 0;
                                    var16++;
                                    if (var22 != 0) {
                                      break L46;
                                    } else {
                                      if (var22 == 0) {
                                        continue L45;
                                      } else {
                                        break L47;
                                      }
                                    }
                                  }
                                }
                                var13.field_j = var11;
                                var16 = 0;
                                break L46;
                              }
                              var17 = 0;
                              L48: while (true) {
                                L49: {
                                  L50: {
                                    if (~var12 >= ~var17) {
                                      break L50;
                                    } else {
                                      var18 = 0;
                                      stackOut_135_0 = 0;
                                      stackIn_145_0 = stackOut_135_0;
                                      stackIn_136_0 = stackOut_135_0;
                                      if (var22 != 0) {
                                        break L49;
                                      } else {
                                        var19 = stackIn_136_0;
                                        L51: while (true) {
                                          L52: {
                                            L53: {
                                              if (~var19 <= ~var5_int) {
                                                break L53;
                                              } else {
                                                var18 = var18 + var13.i(-1478490344);
                                                d.a(var10, var16, var15[var19], var14[var19], var18);
                                                var16 = var16 + var18;
                                                var14[var19] = var14[var19] + var18;
                                                var19++;
                                                if (var22 != 0) {
                                                  break L52;
                                                } else {
                                                  if (var22 == 0) {
                                                    continue L51;
                                                  } else {
                                                    break L53;
                                                  }
                                                }
                                              }
                                            }
                                            var17++;
                                            break L52;
                                          }
                                          if (var22 == 0) {
                                            continue L48;
                                          } else {
                                            break L50;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_144_0 = 0;
                                  stackIn_145_0 = stackOut_144_0;
                                  break L49;
                                }
                                var17 = stackIn_145_0;
                                L54: while (true) {
                                  if (var17 >= var5_int) {
                                    break L15;
                                  } else {
                                    L55: {
                                      L56: {
                                        if (var6 != null) {
                                          break L56;
                                        } else {
                                          var18 = var17;
                                          if (var22 == 0) {
                                            break L55;
                                          } else {
                                            break L56;
                                          }
                                        }
                                      }
                                      var18 = var6[var17];
                                      break L55;
                                    }
                                    L57: {
                                      L58: {
                                        if (((ul) this).field_b != 0) {
                                          break L58;
                                        } else {
                                          var7[var18] = ai.a(-137, false, var15[var17]);
                                          if (var22 == 0) {
                                            break L57;
                                          } else {
                                            break L58;
                                          }
                                        }
                                      }
                                      var7[var18] = (Object) (Object) var15[var17];
                                      break L57;
                                    }
                                    var17++;
                                    if (var22 == 0) {
                                      continue L54;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_157_0 = 1;
                        stackIn_158_0 = stackOut_157_0;
                        break L14;
                      }
                      break L0;
                    }
                  }
                  stackOut_27_0 = 1;
                  stackIn_28_0 = stackOut_27_0;
                  return stackIn_28_0 != 0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L59: {
            var5 = decompiledCaughtException;
            stackOut_159_0 = (RuntimeException) var5;
            stackOut_159_1 = new StringBuilder().append("ul.M(").append(param0).append(',').append(param1).append(',');
            stackIn_162_0 = stackOut_159_0;
            stackIn_162_1 = stackOut_159_1;
            stackIn_160_0 = stackOut_159_0;
            stackIn_160_1 = stackOut_159_1;
            if (param2 == null) {
              stackOut_162_0 = (RuntimeException) (Object) stackIn_162_0;
              stackOut_162_1 = (StringBuilder) (Object) stackIn_162_1;
              stackOut_162_2 = "null";
              stackIn_163_0 = stackOut_162_0;
              stackIn_163_1 = stackOut_162_1;
              stackIn_163_2 = stackOut_162_2;
              break L59;
            } else {
              stackOut_160_0 = (RuntimeException) (Object) stackIn_160_0;
              stackOut_160_1 = (StringBuilder) (Object) stackIn_160_1;
              stackOut_160_2 = "{...}";
              stackIn_163_0 = stackOut_160_0;
              stackIn_163_1 = stackOut_160_1;
              stackIn_163_2 = stackOut_160_2;
              break L59;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_163_0, stackIn_163_2 + ',' + param3 + ')');
        }
        return stackIn_158_0 != 0;
    }

    final synchronized int b(int param0) {
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
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (!((ul) this).a((byte) -115)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var2_int = 0;
              var3 = param0;
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (((ul) this).field_g.length <= var4) {
                      break L3;
                    } else {
                      stackOut_8_0 = -1;
                      stackOut_8_1 = ~((ul) this).field_k.field_s[var4];
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
                            var2_int += 100;
                            var3 = var3 + ((ul) this).a(var4, (byte) 120);
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
                  stackOut_14_0 = -1;
                  stackOut_14_1 = ~var2_int;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L2;
                }
                if (stackIn_15_0 == stackIn_15_1) {
                  stackOut_17_0 = 100;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
                } else {
                  var4 = var3 * 100 / var2_int;
                  stackOut_19_0 = var4;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ul.O(" + param0 + ')');
        }
        return stackIn_20_0;
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
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
            if (((ul) this).a((byte) -109)) {
              param0 = param0.toLowerCase();
              var3_int = ((ul) this).field_k.field_d.a(1481485697, kd.a((CharSequence) (Object) param0, -37));
              if (!this.b(var3_int, -114)) {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                var4 = 7 % ((54 - param1) / 51);
                stackOut_8_0 = var3_int;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ul.P(");
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
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
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
            if (!((ul) this).a((byte) -115)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param0 == 0) {
                  break L1;
                } else {
                  ((ul) this).field_a = (ng) ((ul) this).field_g[27];
                  break L1;
                }
              }
              var3_int = ((ul) this).field_k.field_d.a(1481485697, kd.a((CharSequence) (Object) param1, param0 + -17));
              stackOut_8_0 = ((ul) this).a(var3_int, (byte) 125);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ul.W(").append(param0).append(',');
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
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_9_0;
    }

    final int c(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -1) {
              if (!((ul) this).a((byte) -108)) {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                stackOut_8_0 = ((ul) this).field_k.field_b.length;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 115;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ul.J(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    final int d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.b(param0, param1 ^ -16)) {
              L1: {
                if (param1 == -2) {
                  break L1;
                } else {
                  this.c(((int[]) ((Object[]) ((ul) this).field_g[7])[9])[0], ((int[]) ((ul) this).field_g[0])[2]);
                  break L1;
                }
              }
              stackOut_6_0 = ((ul) this).field_k.field_b[param0];
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "ul.I(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized boolean a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 <= -107) {
              L1: {
                if (null != ((ul) this).field_k) {
                  break L1;
                } else {
                  ((ul) this).field_k = ((ul) this).field_a.a((byte) -106);
                  if (((ul) this).field_k != null) {
                    ((ul) this).field_l = new Object[((ul) this).field_k.field_e][];
                    ((ul) this).field_g = new Object[((ul) this).field_k.field_e];
                    break L1;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
              stackOut_10_0 = 1;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ul.Q(" + param0 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final synchronized boolean a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (((ul) this).a((byte) -109)) {
              var2_int = 1;
              var3 = param0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 >= ((ul) this).field_k.field_l.length) {
                      break L3;
                    } else {
                      stackOut_6_0 = ((ul) this).field_k.field_l[var3];
                      stackIn_14_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          var4 = stackIn_7_0;
                          if (null == ((ul) this).field_g[var4]) {
                            this.c(-91, var4);
                            if (null != ((ul) this).field_g[var4]) {
                              break L4;
                            } else {
                              var2_int = 0;
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_13_0 = var2_int;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ul.E(" + param0 + ')');
        }
        return stackIn_14_0 != 0;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_23_0 = false;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_24_0 = 0;
        boolean stackOut_22_0 = false;
        int stackOut_18_0 = 0;
        try {
          L0: {
            if (!((ul) this).a((byte) -116)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param2 < 0) {
                  break L1;
                } else {
                  if (param0 < 0) {
                    break L1;
                  } else {
                    if (param2 >= ((ul) this).field_k.field_b.length) {
                      break L1;
                    } else {
                      if (((ul) this).field_k.field_b[param2] <= param0) {
                        break L1;
                      } else {
                        if (param1 == 6327) {
                          stackOut_24_0 = 1;
                          stackIn_25_0 = stackOut_24_0;
                          break L0;
                        } else {
                          stackOut_22_0 = ((boolean[]) ((ul) this).field_g[17])[2];
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        }
                      }
                    }
                  }
                }
              }
              if (em.field_P) {
                throw new IllegalArgumentException(param2 + " " + param0);
              } else {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var4, "ul.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_25_0 != 0;
    }

    private final synchronized boolean b(int param0, int param1) {
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
            if (!((ul) this).a((byte) -111)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (param0 >= ((ul) this).field_k.field_b.length) {
                    break L1;
                  } else {
                    if (((ul) this).field_k.field_b[param0] == 0) {
                      break L1;
                    } else {
                      var3_int = -116 / ((param1 - -61) / 53);
                      stackOut_19_0 = 1;
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    }
                  }
                }
              }
              if (!em.field_P) {
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
          throw fa.a((Throwable) (Object) var3, "ul.T(" + param0 + ',' + param1 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final boolean a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_13_0 = false;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (!((ul) this).a((byte) -118)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var4_int = ((ul) this).field_k.field_d.a(1481485697, kd.a((CharSequence) (Object) param2, 121));
              if (!this.b(var4_int, 10)) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                if (param0 < -23) {
                  var5 = ((ul) this).field_k.field_n[var4_int].a(1481485697, kd.a((CharSequence) (Object) param1, 125));
                  stackOut_13_0 = ((ul) this).b(var5, var4_int, 0);
                  stackIn_14_0 = stackOut_13_0;
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
          L1: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("ul.R(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L1;
            }
          }
          L2: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L2;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_14_0;
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((ul) this).a((byte) -112)) {
              L1: {
                param0 = param0.toLowerCase();
                var3_int = ((ul) this).field_k.field_d.a(1481485697, kd.a((CharSequence) (Object) param0, param1 ^ -81));
                if (param1 == 2) {
                  break L1;
                } else {
                  ((long[]) ((ul) this).field_g[1])[15] = 4L;
                  break L1;
                }
              }
              if (var3_int < 0) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("ul.G(");
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
          throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final synchronized byte[] a(byte param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_12_0 = null;
        Object stackIn_17_0 = null;
        byte[] stackIn_20_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        byte[] stackOut_11_0 = null;
        Object stackOut_16_0 = null;
        byte[] stackOut_19_0 = null;
        try {
          L0: {
            if (param0 == -77) {
              break L0;
            } else {
              ul.b((byte) -63);
              break L0;
            }
          }
          if (!((ul) this).a((byte) -128)) {
            stackOut_6_0 = null;
            stackIn_7_0 = stackOut_6_0;
            return (byte[]) (Object) stackIn_7_0;
          } else {
            if (((ul) this).field_k.field_b.length == 1) {
              stackOut_11_0 = ((ul) this).a(0, true, param1);
              stackIn_12_0 = stackOut_11_0;
              return stackIn_12_0;
            } else {
              if (!this.b(param1, -123)) {
                stackOut_16_0 = null;
                stackIn_17_0 = stackOut_16_0;
                return (byte[]) (Object) stackIn_17_0;
              } else {
                if (((ul) this).field_k.field_b[param1] != 1) {
                  throw new RuntimeException();
                } else {
                  stackOut_19_0 = ((ul) this).a(param1, true, 0);
                  stackIn_20_0 = stackOut_19_0;
                  return stackIn_20_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "ul.H(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (!this.b(param0, 55)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (null == ((ul) this).field_g[param0]) {
                L1: {
                  if (param1 >= 96) {
                    break L1;
                  } else {
                    ((ul) this).field_b = ((int[]) ((ul) this).field_g[16])[7];
                    break L1;
                  }
                }
                stackOut_11_0 = ((ul) this).field_a.b(param0, -3);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_6_0 = 100;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "ul.S(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (this.b(param1, param2 + -117)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param2 == -1) {
                  break L1;
                } else {
                  ((boolean[]) ((ul) this).field_g[0])[27] = true;
                  break L1;
                }
              }
              var4_int = ((ul) this).field_k.field_n[param1].a(param2 ^ -1481485698, kd.a((CharSequence) (Object) param0, param2 + 126));
              if (!this.a(var4_int, 6327, param1)) {
                stackOut_9_0 = -1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                stackOut_11_0 = var4_int;
                stackIn_12_0 = stackOut_11_0;
                break L0;
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
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ul.U(");
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
          throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    final byte[] a(int param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                int discarded$2 = ((ul) this).b(((int[]) ((ul) this).field_g[0])[5]);
                break L1;
              }
            }
            stackOut_3_0 = this.a(param0, param2, -25139, (int[]) null);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var4, "ul.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    ul(ng param0, boolean param1, int param2) {
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
        ((ul) this).field_k = null;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (2 < param2) {
                  break L1;
                } else {
                  ((ul) this).field_a = param0;
                  ((ul) this).field_j = param1;
                  ((ul) this).field_b = param2;
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
            stackOut_8_1 = new StringBuilder().append("ul.<init>(");
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
          throw fa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Your zombies won't wander about if you train them to focus.";
        field_i = "Your hordes will move as fast as lightning...especially if you also equip Determined.";
        field_n = new ip();
        field_d = "Detonate";
        field_h = "Starve your zombies before unleashing them on humans! They'll lunge even faster and from further away than with Hungry.";
    }
}
