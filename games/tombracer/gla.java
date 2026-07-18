/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gla extends ci {
    private int field_n;
    static String field_q;
    static it field_p;
    static String field_o;
    static int field_m;

    public static void d(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_p = null;
              field_o = null;
              if (param0 < -91) {
                break L1;
              } else {
                field_p = null;
                break L1;
              }
            }
            field_q = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "gla.B(" + param0 + ')');
        }
    }

    final int[] c(int param0, int param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_24_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_57_0 = 0;
        int[] stackIn_62_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_7_0 = null;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        int[] stackOut_61_0 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                field_p = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3_array = ((gla) this).field_i.a((byte) 17, param1);
                if (!((gla) this).field_i.field_d) {
                  break L3;
                } else {
                  var4 = sj.field_b[param1];
                  var5 = 0;
                  L4: while (true) {
                    if (ns.field_g <= var5) {
                      break L3;
                    } else {
                      stackOut_7_0 = ht.field_Fb;
                      stackIn_62_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var8 != 0) {
                        break L2;
                      } else {
                        L5: {
                          L6: {
                            var6 = stackIn_8_0[var5];
                            if (var6 <= ((gla) this).field_n) {
                              break L6;
                            } else {
                              if (var6 >= -((gla) this).field_n + 4096) {
                                break L6;
                              } else {
                                if (var4 <= -((gla) this).field_n + 2048) {
                                  break L6;
                                } else {
                                  if (~var4 > ~(((gla) this).field_n + 2048)) {
                                    L7: {
                                      var7 = 2048 + -var6;
                                      if (var7 < 0) {
                                        stackOut_23_0 = -var7;
                                        stackIn_24_0 = stackOut_23_0;
                                        break L7;
                                      } else {
                                        stackOut_21_0 = var7;
                                        stackIn_24_0 = stackOut_21_0;
                                        break L7;
                                      }
                                    }
                                    var7 = stackIn_24_0;
                                    var7 = var7 << 12;
                                    var7 = var7 / (-((gla) this).field_n + 2048);
                                    var3_array[var5] = -var7 + 4096;
                                    if (var8 == 0) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          L8: {
                            if (var6 <= 2048 + -((gla) this).field_n) {
                              break L8;
                            } else {
                              if (~var6 <= ~(2048 - -((gla) this).field_n)) {
                                break L8;
                              } else {
                                L9: {
                                  var7 = var4 + -2048;
                                  if (0 > var7) {
                                    stackOut_34_0 = -var7;
                                    stackIn_35_0 = stackOut_34_0;
                                    break L9;
                                  } else {
                                    stackOut_32_0 = var7;
                                    stackIn_35_0 = stackOut_32_0;
                                    break L9;
                                  }
                                }
                                var7 = stackIn_35_0;
                                var7 = var7 - ((gla) this).field_n;
                                var7 = var7 << 12;
                                var3_array[var5] = var7 / (-((gla) this).field_n + 2048);
                                if (var8 == 0) {
                                  break L5;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          L10: {
                            L11: {
                              if (~((gla) this).field_n < ~var4) {
                                break L11;
                              } else {
                                if (4096 - ((gla) this).field_n >= var4) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              var7 = var6 - 2048;
                              if (var7 >= 0) {
                                stackOut_45_0 = var7;
                                stackIn_46_0 = stackOut_45_0;
                                break L12;
                              } else {
                                stackOut_43_0 = -var7;
                                stackIn_46_0 = stackOut_43_0;
                                break L12;
                              }
                            }
                            var7 = stackIn_46_0;
                            var7 = var7 - ((gla) this).field_n;
                            var7 = var7 << 12;
                            var3_array[var5] = var7 / (-((gla) this).field_n + 2048);
                            if (var8 == 0) {
                              break L5;
                            } else {
                              break L10;
                            }
                          }
                          L13: {
                            L14: {
                              if (var6 < ((gla) this).field_n) {
                                break L14;
                              } else {
                                if (var6 <= -((gla) this).field_n + 4096) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            L15: {
                              var7 = 2048 - var4;
                              if (var7 < 0) {
                                stackOut_56_0 = -var7;
                                stackIn_57_0 = stackOut_56_0;
                                break L15;
                              } else {
                                stackOut_54_0 = var7;
                                stackIn_57_0 = stackOut_54_0;
                                break L15;
                              }
                            }
                            var7 = stackIn_57_0;
                            var7 = var7 << 12;
                            var7 = var7 / (2048 - ((gla) this).field_n);
                            var3_array[var5] = -var7 + 4096;
                            if (var8 == 0) {
                              break L5;
                            } else {
                              break L13;
                            }
                          }
                          var3_array[var5] = 0;
                          break L5;
                        }
                        var5++;
                        if (var8 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_61_0 = (int[]) var3_array;
              stackIn_62_0 = stackOut_61_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "gla.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_62_0;
    }

    public gla() {
        super(0, true);
        ((gla) this).field_n = 585;
    }

    final void a(byte param0, uia param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
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
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int == 0) {
                ((gla) this).field_n = param1.d(124);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 107) {
                break L2;
              } else {
                gla.d((byte) 92);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("gla.A(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Room complete +<%0>";
        field_p = new it();
        field_o = "Idols";
        field_m = -1;
    }
}
