/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    String field_a;
    float field_c;
    static boolean field_e;
    private int field_f;
    private rh[] field_h;
    static boolean field_g;
    private int field_d;
    private int field_b;

    final static String a(String param0, int param1, char param2, String param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param3.length();
              if (param1 == -30614) {
                break L1;
              } else {
                field_e = true;
                break L1;
              }
            }
            L2: {
              var5 = param0.length();
              var6 = var4_int;
              var7 = var5 - 1;
              if (var7 != 0) {
                var8_int = 0;
                L3: while (true) {
                  var8_int = param3.indexOf((int) param2, var8_int);
                  if (0 > var8_int) {
                    break L2;
                  } else {
                    var6 = var6 + var7;
                    var8_int++;
                    if (var11 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L4: while (true) {
              L5: {
                L6: {
                  L7: {
                    var10 = param3.indexOf((int) param2, var9);
                    if (var10 >= 0) {
                      break L7;
                    } else {
                      if (var11 != 0) {
                        break L6;
                      } else {
                        if (var11 == 0) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  StringBuilder discarded$3 = var8.append(param3.substring(var9, var10));
                  var9 = var10 - -1;
                  StringBuilder discarded$4 = var8.append(param0);
                  break L6;
                }
                if (var11 == 0) {
                  continue L4;
                } else {
                  break L5;
                }
              }
              StringBuilder discarded$5 = var8.append(param3.substring(var9));
              stackOut_18_0 = var8.toString();
              stackIn_19_0 = stackOut_18_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("ml.D(");
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L9;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return stackIn_19_0;
    }

    final boolean a(byte param0) {
        RuntimeException var2 = null;
        rh var2_ref = null;
        int var3 = 0;
        boolean stackIn_3_0 = false;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        int stackOut_12_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_6_0 = 0;
        byte stackOut_35_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  if (~((ml) this).field_b >= ~((ml) this).field_d) {
                    break L3;
                  } else {
                    var2_ref = ((ml) this).field_h[((ml) this).field_d];
                    stackOut_2_0 = var2_ref.field_d.c((byte) -121);
                    stackIn_36_0 = stackOut_2_0 ? 1 : 0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (stackIn_3_0) {
                        L4: {
                          if (0 > var2_ref.field_c) {
                            break L4;
                          } else {
                            if (var2_ref.field_d.a(var2_ref.field_c, -1)) {
                              break L4;
                            } else {
                              this.a(var2_ref, var2_ref.field_d.b((byte) 99, var2_ref.field_c), 76);
                              stackOut_12_0 = 0;
                              stackIn_13_0 = stackOut_12_0;
                              return stackIn_13_0 != 0;
                            }
                          }
                        }
                        L5: {
                          if (null == var2_ref.field_a) {
                            break L5;
                          } else {
                            if (!var2_ref.field_d.a(2, var2_ref.field_a)) {
                              this.a(var2_ref, var2_ref.field_d.d(-1, var2_ref.field_a), 72);
                              stackOut_20_0 = 0;
                              stackIn_21_0 = stackOut_20_0;
                              return stackIn_21_0 != 0;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (var2_ref.field_c >= 0) {
                            break L6;
                          } else {
                            if (var2_ref.field_a != null) {
                              break L6;
                            } else {
                              if (null == var2_ref.field_h) {
                                break L6;
                              } else {
                                if (var2_ref.field_d.b(true)) {
                                  break L6;
                                } else {
                                  this.a(var2_ref, var2_ref.field_d.b((byte) -66), 82);
                                  stackOut_32_0 = 0;
                                  stackIn_33_0 = stackOut_32_0;
                                  return stackIn_33_0 != 0;
                                }
                              }
                            }
                          }
                        }
                        ((ml) this).field_d = ((ml) this).field_d + 1;
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        this.a(var2_ref, 0, 84);
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0 != 0;
                      }
                    }
                  }
                }
                stackOut_35_0 = param0;
                stackIn_36_0 = stackOut_35_0;
                break L2;
              }
              if (stackIn_36_0 >= 108) {
                stackOut_39_0 = 1;
                stackIn_40_0 = stackOut_39_0;
                break L0;
              } else {
                stackOut_37_0 = 1;
                stackIn_38_0 = stackOut_37_0;
                return stackIn_38_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var2, "ml.C(" + param0 + ')');
        }
        return stackIn_40_0 != 0;
    }

    private final void a(rh param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        float var4_float = 0.0f;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              L2: {
                var4_float = (float)(((ml) this).field_d - -1) + (float)param1 / 100.0f;
                ((ml) this).field_c = var4_float * (float)((ml) this).field_f / (float)(((ml) this).field_b + 1);
                if (0 == param1) {
                  break L2;
                } else {
                  ((ml) this).field_a = param0.field_h + " - " + param1 + "%";
                  if (!SolKnight.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ml) this).field_a = param0.field_b;
              break L1;
            }
            L3: {
              if (param2 >= 26) {
                break L3;
              } else {
                field_g = true;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("ml.A(");
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
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static cf[] a(int param0, jd param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        cf[] var4 = null;
        int var5 = 0;
        cf var6 = null;
        int var6_int = 0;
        int var7 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        cf[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        cf[] stackOut_15_0 = null;
        Object stackOut_7_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param1.d((byte) 48, 8);
            if (var2_int > 0) {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (cf[]) (Object) stackIn_5_0;
            } else {
              if (param0 == 22795) {
                var3 = param1.d((byte) 48, 12);
                var4 = new cf[var3];
                var5 = 0;
                L1: while (true) {
                  L2: {
                    if (~var3 >= ~var5) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          if (wa.a(param1, (byte) -121)) {
                            break L4;
                          } else {
                            var6_int = param1.d((byte) 48, ac.a(var5 + -1, 125));
                            var4[var5] = var4[var6_int];
                            if (var7 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var6 = new cf();
                        int discarded$6 = param1.d((byte) 48, 24);
                        int discarded$7 = param1.d((byte) 48, 24);
                        var6.field_a = param1.d((byte) 48, 24);
                        int discarded$8 = param1.d((byte) 48, 9);
                        int discarded$9 = param1.d((byte) 48, 12);
                        int discarded$10 = param1.d((byte) 48, 12);
                        int discarded$11 = param1.d((byte) 48, 12);
                        var4[var5] = var6;
                        break L3;
                      }
                      var5++;
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_15_0 = (cf[]) var4;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                }
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (cf[]) (Object) stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("ml.B(").append(param0).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_16_0;
    }

    private ml() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var1, "ml.<init>()");
        }
    }

    static {
    }
}
