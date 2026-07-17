/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends ed {
    private boolean field_l;
    static qc field_n;
    private tj field_i;
    static long field_s;
    static int[] field_o;
    private int field_g;
    private int field_f;
    private String field_m;
    static int field_e;
    static tg field_q;
    private int field_p;
    static String field_k;
    private int field_r;
    static int field_j;
    private int field_h;

    final void a(int param0, tj param1, String param2, boolean param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        bh var14 = null;
        int var15 = 0;
        Object var16 = null;
        String[] var17 = null;
        String[] var18 = null;
        bh stackIn_36_0 = null;
        bh stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        bh stackIn_37_0 = null;
        bh stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        bh stackIn_38_0 = null;
        bh stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        tj stackIn_41_0 = null;
        String stackIn_41_1 = null;
        tj stackIn_42_0 = null;
        String stackIn_42_1 = null;
        tj stackIn_43_0 = null;
        String stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        bh stackOut_35_0 = null;
        bh stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        bh stackOut_37_0 = null;
        bh stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        bh stackOut_36_0 = null;
        bh stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        tj stackOut_40_0 = null;
        String stackOut_40_1 = null;
        tj stackOut_42_0 = null;
        String stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        tj stackOut_41_0 = null;
        String stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var15 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (0 == param7) {
                param7 = param1.field_p;
                break L1;
              } else {
                break L1;
              }
            }
            if (param2 != null) {
              L2: {
                if (((mb) this).field_i != param1) {
                  break L2;
                } else {
                  if (((mb) this).field_l) {
                    break L2;
                  } else {
                    if (param6 != ((mb) this).field_p) {
                      break L2;
                    } else {
                      if (((mb) this).field_f != param5) {
                        break L2;
                      } else {
                        if (((mb) this).field_r != param7) {
                          break L2;
                        } else {
                          if (param4 != ((mb) this).field_h) {
                            break L2;
                          } else {
                            if (param0 != ((mb) this).field_g) {
                              break L2;
                            } else {
                              if (((mb) this).field_m == null) {
                                break L2;
                              } else {
                                if (!((mb) this).field_m.equals((Object) (Object) param2)) {
                                  break L2;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L3: {
                ((mb) this).field_h = param4;
                ((mb) this).field_p = param6;
                ((mb) this).field_i = param1;
                ((mb) this).field_r = param7;
                ((mb) this).field_g = param0;
                ((mb) this).field_l = false;
                ((mb) this).field_f = param5;
                if (param3) {
                  break L3;
                } else {
                  var16 = null;
                  ((mb) this).a((String) null, -57, (byte) -100, -16, (tj) null);
                  break L3;
                }
              }
              L4: {
                ((mb) this).field_m = param2;
                var17 = new String[1 + param1.a(param2, param0)];
                var18 = var17;
                var10 = Math.max(1, param1.a(param2, new int[1], var18));
                if (((mb) this).field_f != 3) {
                  break L4;
                } else {
                  if (var10 != 1) {
                    break L4;
                  } else {
                    ((mb) this).field_f = 1;
                    break L4;
                  }
                }
              }
              L5: {
                ((mb) this).field_a = new bh[var10];
                if (((mb) this).field_f != 0) {
                  if (((mb) this).field_f == 1) {
                    var11 = param1.field_s + (((mb) this).field_h - var10 * ((mb) this).field_r >> 1);
                    break L5;
                  } else {
                    if (((mb) this).field_f == 2) {
                      var11 = -(((mb) this).field_r * var10) + -param1.field_x + ((mb) this).field_h;
                      break L5;
                    } else {
                      L6: {
                        var12 = (((mb) this).field_h + -(((mb) this).field_r * var10)) / (var10 - -1);
                        if (var12 < 0) {
                          var12 = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      ((mb) this).field_r = ((mb) this).field_r + var12;
                      var11 = var12 + param1.field_s;
                      break L5;
                    }
                  }
                } else {
                  var11 = param1.field_s;
                  break L5;
                }
              }
              var12 = 0;
              L7: while (true) {
                if (var12 >= var10) {
                  break L0;
                } else {
                  L8: {
                    var13 = var17[var12];
                    stackOut_35_0 = null;
                    stackOut_35_1 = null;
                    stackOut_35_2 = -param1.field_s + var11;
                    stackOut_35_3 = var11 + param1.field_x;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_37_1 = stackOut_35_1;
                    stackIn_37_2 = stackOut_35_2;
                    stackIn_37_3 = stackOut_35_3;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    stackIn_36_2 = stackOut_35_2;
                    stackIn_36_3 = stackOut_35_3;
                    if (var13 == null) {
                      stackOut_37_0 = null;
                      stackOut_37_1 = null;
                      stackOut_37_2 = stackIn_37_2;
                      stackOut_37_3 = stackIn_37_3;
                      stackOut_37_4 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      stackIn_38_2 = stackOut_37_2;
                      stackIn_38_3 = stackOut_37_3;
                      stackIn_38_4 = stackOut_37_4;
                      break L8;
                    } else {
                      stackOut_36_0 = null;
                      stackOut_36_1 = null;
                      stackOut_36_2 = stackIn_36_2;
                      stackOut_36_3 = stackIn_36_3;
                      stackOut_36_4 = var13.length();
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      stackIn_38_2 = stackOut_36_2;
                      stackIn_38_3 = stackOut_36_3;
                      stackIn_38_4 = stackOut_36_4;
                      break L8;
                    }
                  }
                  L9: {
                    var14 = new bh(stackIn_38_2, stackIn_38_3, stackIn_38_4);
                    var14.field_a[0] = 0;
                    if (var13 != null) {
                      L10: {
                        var14.field_a[var13.length()] = param1.b(var13);
                        stackOut_40_0 = (tj) param1;
                        stackOut_40_1 = (String) var13;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_42_1 = stackOut_40_1;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        if (param6 != 3) {
                          stackOut_42_0 = (tj) (Object) stackIn_42_0;
                          stackOut_42_1 = (String) (Object) stackIn_42_1;
                          stackOut_42_2 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          stackIn_43_1 = stackOut_42_1;
                          stackIn_43_2 = stackOut_42_2;
                          break L10;
                        } else {
                          stackOut_41_0 = (tj) (Object) stackIn_41_0;
                          stackOut_41_1 = (String) (Object) stackIn_41_1;
                          stackOut_41_2 = ((mb) this).a(param1.b(var13), param0, -127, var13);
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_43_1 = stackOut_41_1;
                          stackIn_43_2 = stackOut_41_2;
                          break L10;
                        }
                      }
                      wi.a(stackIn_43_0, stackIn_43_1, stackIn_43_2, false, var14);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var11 = var11 + param7;
                  ((mb) this).field_a[var12] = var14;
                  var12++;
                  continue L7;
                }
              }
            } else {
              ((mb) this).field_a = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var9;
            stackOut_46_1 = new StringBuilder().append("mb.N(").append(param0).append(44);
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param1 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L11;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L11;
            }
          }
          L12: {
            stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(44);
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param2 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L12;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L12;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    private final bh a(int param0, byte param1, String param2, tj param3) {
        bh var5 = null;
        RuntimeException var5_ref = null;
        bh var6 = null;
        Object stackIn_2_0 = null;
        bh stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        bh stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            if (param1 > 97) {
              var6 = new bh(-param3.field_s + param0, param0 + param3.field_x, param2.length());
              var5 = var6;
              ((mb) this).field_a = new bh[]{var6};
              stackOut_3_0 = (bh) var5;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (bh) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("mb.P(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    final void a(String param0, tj param1, int param2, int param3, int param4) {
        bh var9 = null;
        bh var10 = null;
        if (!(param0 != null)) {
            ((mb) this).field_a = null;
            return;
        }
        if (((mb) this).field_i == param1) {
            if (((mb) this).field_l) {
                if (((mb) this).field_p == 2) {
                    if (((mb) this).field_m != null) {
                        if (((mb) this).field_m.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((mb) this).field_i = param1;
            ((mb) this).field_p = 2;
            ((mb) this).field_l = true;
            ((mb) this).field_m = param0;
            var9 = this.a(param2, (byte) 102, param0, param1);
            var10 = var9;
            var10.field_a[0] = -param1.b(param0) + param4;
            int var7 = 117 / ((1 - param3) / 57);
            var10.field_a[param0.length()] = param4;
            wi.a(param1, param0, 0, false, var10);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "mb.R(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void c() {
        field_n = null;
        field_o = null;
        field_q = null;
        field_k = null;
    }

    final void a(int param0, String param1, tj param2, int param3, boolean param4) {
        bh var8 = null;
        int var7 = 0;
        if (param1 == null) {
            ((mb) this).field_a = null;
            return;
        }
        if (param2 == ((mb) this).field_i) {
            if (((mb) this).field_l) {
                if (((mb) this).field_p == 1) {
                    if (((mb) this).field_m != null) {
                        if (!(!((mb) this).field_m.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((mb) this).field_l = true;
            ((mb) this).field_i = param2;
            ((mb) this).field_p = 1;
            var8 = this.a(param0, (byte) 107, param1, param2);
            var7 = param2.b(param1);
            var8.field_a[0] = param3 + -(var7 >> 1);
            var8.field_a[param1.length()] = param3 + (var7 >> 1);
            wi.a(param2, param1, 0, param4, var8);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "mb.O(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(String param0, int param1, byte param2, int param3, tj param4) {
        bh var7 = null;
        if (!(param0 != null)) {
            ((mb) this).field_a = null;
            return;
        }
        if (((mb) this).field_i == param4) {
            if (((mb) this).field_l) {
                if (0 == ((mb) this).field_p) {
                    if (null != ((mb) this).field_m) {
                        if (((mb) this).field_m.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            int var6_int = -29 / ((-10 - param2) / 63);
            ((mb) this).field_l = true;
            ((mb) this).field_p = 0;
            ((mb) this).field_m = param0;
            ((mb) this).field_i = param4;
            var7 = this.a(param1, (byte) 100, param0, param4);
            var7.field_a[0] = param3;
            var7.field_a[param0.length()] = param4.b(param0) + param3;
            wi.a(param4, param0, 0, false, var7);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "mb.S(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    public mb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_n = new qc();
        field_e = 20;
        field_k = "This password contains repeated characters, and would be easy to guess";
        field_j = 0;
    }
}
