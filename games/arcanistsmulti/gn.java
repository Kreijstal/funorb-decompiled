/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    private ig field_i;
    static String field_j;
    private eg field_h;
    private eg field_d;
    static eg field_e;
    static kc field_c;
    static int field_k;
    static int[][] field_g;
    static int field_b;
    static int field_a;
    static String field_f;

    final tk a(int param0, byte param1) {
        tk var3 = null;
        byte[] var4 = null;
        int var5 = 0;
        var3 = (tk) ((gn) this).field_i.a((long)param0, false);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (param0 < 32768) {
              var4 = ((gn) this).field_h.b(param0, 26219, 1);
              break L0;
            } else {
              var4 = ((gn) this).field_d.b(32767 & param0, 26219, 1);
              break L0;
            }
          }
          L1: {
            var3 = new tk();
            if (var4 != null) {
              var3.a(new wk(var4), -22034);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (32768 <= param0) {
              var3.e((byte) -127);
              break L2;
            } else {
              break L2;
            }
          }
          ((gn) this).field_i.a((Object) (Object) var3, (long)param0, -70);
          var5 = 80 / ((param1 - 3) / 56);
          return var3;
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        RuntimeException decompiledCaughtException = null;
        var22 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param0 * param0;
              var6 = -param0 + param4;
              var7 = param0 + param4;
              var8 = -param0 + param3;
              if (param1 >= 60) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            L2: {
              var9 = param3 - -param0;
              if (var8 >= de.field_i) {
                break L2;
              } else {
                var8 = de.field_i;
                break L2;
              }
            }
            L3: {
              if (var7 > de.field_k) {
                var7 = de.field_k;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var6 >= de.field_c) {
                break L4;
              } else {
                var6 = de.field_c;
                break L4;
              }
            }
            L5: {
              if (de.field_h >= var9) {
                break L5;
              } else {
                var9 = de.field_h;
                break L5;
              }
            }
            var26 = de.field_l;
            var25 = var26;
            var24 = var25;
            var23 = var24;
            var10 = var23;
            var15 = var6;
            L6: while (true) {
              if (var7 <= var15) {
                break L0;
              } else {
                var16 = var8;
                L7: while (true) {
                  if (var9 <= var16) {
                    var15++;
                    continue L6;
                  } else {
                    L8: {
                      var12 = -param3 + var16;
                      var13 = var15 + -param4;
                      var14 = var13 * var13 + var12 * var12;
                      if (var14 < var5_int) {
                        L9: {
                          if (var14 == 0) {
                            var14 = 1;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          var11 = var16 + var15 * de.field_e;
                          if (param2 < 0) {
                            var17 = -((256 - param2) * var14 / var5_int) + (-param2 + 256);
                            break L10;
                          } else {
                            var17 = 256 + var14 * param2 / var5_int + -param2;
                            break L10;
                          }
                        }
                        L11: {
                          var18 = var26[var11];
                          var19 = (16724527 & var18) >> 16;
                          var20 = (65334 & var18) >> 8;
                          var21 = var18 & 255;
                          if (0 < var17) {
                            if (var17 < 256) {
                              L12: {
                                if (var20 >= var17) {
                                  var20 = 255;
                                  break L12;
                                } else {
                                  var20 = var20 + (-var17 + 256);
                                  break L12;
                                }
                              }
                              L13: {
                                if (var19 >= var17) {
                                  var19 = 255;
                                  break L13;
                                } else {
                                  var19 = var19 + (-var17 + 256);
                                  break L13;
                                }
                              }
                              if (var21 >= var17) {
                                var21 = 255;
                                break L11;
                              } else {
                                var21 = var21 + (256 + -var17);
                                break L11;
                              }
                            } else {
                              var10[var11] = fj.b(fj.b(var20 << 8, var19 << 16), var21);
                              var16++;
                              continue L7;
                            }
                          } else {
                            var21 = 255;
                            var20 = 255;
                            var19 = 255;
                            break L11;
                          }
                        }
                        var10[var11] = fj.b(fj.b(var20 << 8, var19 << 16), var21);
                        var16++;
                        break L8;
                      } else {
                        var16++;
                        break L8;
                      }
                    }
                    var16++;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var5, "gn.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_j = null;
        field_e = null;
        field_f = null;
        field_g = null;
    }

    gn(int param0, eg param1, eg param2, ok param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        ((gn) this).field_i = new ig(64);
        try {
          L0: {
            L1: {
              ((gn) this).field_d = param2;
              ((gn) this).field_h = param1;
              if (((gn) this).field_h == null) {
                break L1;
              } else {
                int discarded$4 = ((gn) this).field_h.a(1, (byte) -60);
                break L1;
              }
            }
            if (null != ((gn) this).field_d) {
              int discarded$5 = ((gn) this).field_d.a(1, (byte) -60);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("gn.<init>(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Live Combat Situation";
        field_k = 1;
        field_b = 0;
        field_f = "You can also walk around by using the 'Z' and 'X' keys. Walk and jump towards the target on the castle to the right.";
    }
}
