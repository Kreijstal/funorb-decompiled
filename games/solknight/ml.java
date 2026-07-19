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
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
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
                    if (-1 >= (var10 ^ -1)) {
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
                  discarded$6 = var8.append(param3.substring(var9, var10));
                  var9 = var10 - -1;
                  discarded$7 = var8.append(param0);
                  break L6;
                }
                if (var11 == 0) {
                  continue L4;
                } else {
                  break L5;
                }
              }
              discarded$8 = var8.append(param3.substring(var9));
              stackOut_15_0 = var8.toString();
              stackIn_16_0 = stackOut_15_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("ml.D(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          L9: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L9;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        return stackIn_16_0;
    }

    final boolean a(byte param0) {
        rh var2 = null;
        int var3 = 0;
        rh var4 = null;
        boolean stackIn_3_0 = false;
        int stackIn_19_0 = 0;
        boolean stackOut_2_0 = false;
        byte stackOut_18_0 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_b <= this.field_d) {
                break L2;
              } else {
                var4 = this.field_h[this.field_d];
                var2 = var4;
                stackOut_2_0 = var4.field_d.c((byte) -121);
                stackIn_19_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var3 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0) {
                    L3: {
                      if (0 > var4.field_c) {
                        break L3;
                      } else {
                        if (var4.field_d.a(var4.field_c, -1)) {
                          break L3;
                        } else {
                          this.a(var2, var4.field_d.b((byte) 99, var4.field_c), 76);
                          return false;
                        }
                      }
                    }
                    L4: {
                      if (null == var4.field_a) {
                        break L4;
                      } else {
                        if (!var4.field_d.a(2, var4.field_a)) {
                          this.a(var2, var4.field_d.d(-1, var4.field_a), 72);
                          return false;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var4.field_c >= 0) {
                        break L5;
                      } else {
                        if (var4.field_a != null) {
                          break L5;
                        } else {
                          if (null == var4.field_h) {
                            break L5;
                          } else {
                            if (var4.field_d.b(true)) {
                              break L5;
                            } else {
                              this.a(var2, var4.field_d.b((byte) -66), 82);
                              return false;
                            }
                          }
                        }
                      }
                    }
                    this.field_d = this.field_d + 1;
                    if (var3 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  } else {
                    this.a(var4, 0, 84);
                    return false;
                  }
                }
              }
            }
            stackOut_18_0 = param0;
            stackIn_19_0 = stackOut_18_0;
            break L1;
          }
          if (stackIn_19_0 < 108) {
            return true;
          } else {
            return true;
          }
        }
    }

    private final void a(rh param0, int param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              var4_float = (float)(this.field_d - -1) + (float)param1 / 100.0f;
              this.field_c = var4_float * (float)this.field_f / (float)(this.field_b + 1);
              if (0 == param1) {
                this.field_a = param0.field_b;
                break L1;
              } else {
                this.field_a = param0.field_h + " - " + param1 + "%";
                if (!SolKnight.field_L) {
                  break L1;
                } else {
                  this.field_a = param0.field_b;
                  break L1;
                }
              }
            }
            if (param2 >= 26) {
              break L0;
            } else {
              field_g = true;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("ml.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static cf[] a(int param0, jd param1) {
        int discarded$12 = 0;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        cf[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        cf var6 = null;
        int var7 = 0;
        cf[] stackIn_6_0 = null;
        cf[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        cf[] stackOut_13_0 = null;
        cf[] stackOut_5_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param1.d((byte) 48, 8);
            if (var2_int <= 0) {
              if (param0 == 22795) {
                var3 = param1.d((byte) 48, 12);
                var4 = new cf[var3];
                var5 = 0;
                L1: while (true) {
                  if (var3 <= var5) {
                    stackOut_13_0 = (cf[]) (var4);
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      L3: {
                        if (wa.a(param1, (byte) -121)) {
                          break L3;
                        } else {
                          var6_int = param1.d((byte) 48, ac.a(var5 + -1, 125));
                          var4[var5] = var4[var6_int];
                          if (var7 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var6 = new cf();
                      discarded$12 = param1.d((byte) 48, 24);
                      discarded$13 = param1.d((byte) 48, 24);
                      var6.field_a = param1.d((byte) 48, 24);
                      discarded$14 = param1.d((byte) 48, 9);
                      discarded$15 = param1.d((byte) 48, 12);
                      discarded$16 = param1.d((byte) 48, 12);
                      discarded$17 = param1.d((byte) 48, 12);
                      var4[var5] = var6;
                      break L2;
                    }
                    var5++;
                    continue L1;
                  }
                }
              } else {
                stackOut_5_0 = (cf[]) null;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var2);
            stackOut_15_1 = new StringBuilder().append("ml.B(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_14_0;
        }
    }

    private ml() throws Throwable {
        throw new Error();
    }

    static {
    }
}
