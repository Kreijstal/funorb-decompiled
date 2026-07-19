/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij implements ui {
    private int field_e;
    private int field_b;
    private int field_c;
    private int field_g;
    static wk field_d;
    static int field_a;
    private int field_j;
    static ti field_h;
    private kg field_i;
    private int field_f;

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        fk var13 = null;
        qg stackIn_4_0 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        qg stackOut_2_0 = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var12 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!(param4 instanceof fk)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (qg) ((Object) stackOut_3_0);
                break L1;
              } else {
                stackOut_2_0 = (qg) (param4);
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var13 = (fk) ((Object) stackIn_4_0);
              sb.a(param4.field_p + param0, param1 - -param4.field_n, param4.field_l, param4.field_h, this.field_c);
              if (var13 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            var7 = param4.field_l + -(2 * var13.field_B);
            var8 = var13.field_B + param4.field_p + param0;
            var9 = var13.field_G + (param4.field_n + param1);
            sb.e(var8, var9, var7 + var8, var9, this.field_j);
            var10 = -1 + var13.h(-1);
            L3: while (true) {
              L4: {
                L5: {
                  if (0 > var10) {
                    break L5;
                  } else {
                    stackOut_7_0 = var7 * var13.b((byte) 117, var10) / var13.i(-24733) + var8;
                    stackOut_7_1 = var9;
                    stackOut_7_2 = this.field_e;
                    stackIn_11_0 = stackOut_7_0;
                    stackIn_11_1 = stackOut_7_1;
                    stackIn_11_2 = stackOut_7_2;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    if (var12 != 0) {
                      break L4;
                    } else {
                      sb.c(stackIn_8_0, stackIn_8_1, stackIn_8_2, this.field_f);
                      var10--;
                      if (var12 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                stackOut_10_0 = -49;
                stackOut_10_1 = 51 - param3;
                stackOut_10_2 = 47;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                break L4;
              }
              var11 = stackIn_11_0 % (stackIn_11_1 / stackIn_11_2);
              if (this.field_i == null) {
                break L0;
              } else {
                this.field_i.c(var13.field_k, var8 + var7 / 2, var9 - (-this.field_i.field_C - var13.field_G), this.field_g, this.field_b);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("ij.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static String a(String param0, String[] param1, byte param2) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_10_0 = false;
        String stackIn_23_0 = null;
        int stackIn_26_0 = 0;
        boolean stackIn_33_0 = false;
        String stackIn_44_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_25_0 = 0;
        String stackOut_43_0 = null;
        boolean stackOut_32_0 = false;
        String stackOut_22_0 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (stackIn_3_0 <= var6_int) {
                        break L5;
                      } else {
                        if (var11 != 0) {
                          break L4;
                        } else {
                          if (var11 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var5 = 2 + var6_int;
                    break L4;
                  }
                  L6: while (true) {
                    L7: {
                      if (var3_int <= var5) {
                        break L7;
                      } else {
                        stackOut_9_0 = dj.a(param0.charAt(var5), true);
                        stackIn_3_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var11 != 0) {
                          continue L2;
                        } else {
                          if (!stackIn_10_0) {
                            break L7;
                          } else {
                            var5++;
                            if (var11 == 0) {
                              continue L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      var7_ref_String = param0.substring(var6_int - -2, var5);
                      if (qj.a((CharSequence) ((Object) var7_ref_String), 38)) {
                        break L8;
                      } else {
                        if (var11 == 0) {
                          continue L1;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (var3_int <= var5) {
                        break L9;
                      } else {
                        if (param0.charAt(var5) == 62) {
                          var5++;
                          var8 = aa.a(55, (CharSequence) ((Object) var7_ref_String));
                          var4 = var4 + (-var5 - -var6_int + param1[var8].length());
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (var11 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
                if (param2 < -25) {
                  var6 = new StringBuilder(var4);
                  var5 = 0;
                  var7 = 0;
                  L10: while (true) {
                    var8 = param0.indexOf("<%", var5);
                    stackOut_25_0 = -1;
                    stackIn_26_0 = stackOut_25_0;
                    L11: while (true) {
                      L12: {
                        L13: {
                          if (stackIn_26_0 >= (var8 ^ -1)) {
                            break L13;
                          } else {
                            if (var11 != 0) {
                              break L12;
                            } else {
                              if (var11 == 0) {
                                discarded$3 = var6.append(param0.substring(var7));
                                stackOut_43_0 = var6.toString();
                                stackIn_44_0 = stackOut_43_0;
                                decompiledRegionSelector0 = 1;
                                break L0;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                        var5 = 2 + var8;
                        break L12;
                      }
                      L14: while (true) {
                        L15: {
                          if (var5 >= var3_int) {
                            break L15;
                          } else {
                            stackOut_32_0 = dj.a(param0.charAt(var5), true);
                            stackIn_26_0 = stackOut_32_0 ? 1 : 0;
                            stackIn_33_0 = stackOut_32_0;
                            if (var11 != 0) {
                              continue L11;
                            } else {
                              if (!stackIn_33_0) {
                                break L15;
                              } else {
                                var5++;
                                continue L14;
                              }
                            }
                          }
                        }
                        var9 = param0.substring(2 + var8, var5);
                        if (qj.a((CharSequence) ((Object) var9), 49)) {
                          L16: {
                            if (var5 >= var3_int) {
                              break L16;
                            } else {
                              if (param0.charAt(var5) != 62) {
                                break L16;
                              } else {
                                var5++;
                                var10 = aa.a(66, (CharSequence) ((Object) var9));
                                discarded$4 = var6.append(param0.substring(var7, var8));
                                discarded$5 = var6.append(param1[var10]);
                                var7 = var5;
                                break L16;
                              }
                            }
                          }
                          continue L10;
                        } else {
                          continue L10;
                        }
                      }
                    }
                  }
                } else {
                  stackOut_22_0 = (String) null;
                  stackIn_23_0 = stackOut_22_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var3);
            stackOut_45_1 = new StringBuilder().append("ij.A(");
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param0 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L17;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L17;
            }
          }
          L18: {
            stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param1 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L18;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L18;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_23_0;
        } else {
          return stackIn_44_0;
        }
    }

    ij(kg param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_c = param4;
            this.field_i = param0;
            this.field_b = param2;
            this.field_f = param6;
            this.field_e = param5;
            this.field_g = param1;
            this.field_j = param3;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ij.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != 2) {
            return;
        }
        field_d = null;
    }

    static {
        field_d = new wk();
    }
}
