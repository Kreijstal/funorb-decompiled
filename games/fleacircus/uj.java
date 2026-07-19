/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    private static int[] field_b;
    int field_c;
    static String field_f;
    static String field_e;
    static int[] field_a;
    static String field_d;

    final static boolean a(int param0) {
        if (param0 != -2477) {
            field_d = (String) null;
        }
        return ed.field_b;
    }

    final static int a(boolean param0, int param1, int param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
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
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param1;
            L1: while (true) {
              L2: {
                if (param2 <= var5) {
                  L3: {
                    if (!param0) {
                      break L3;
                    } else {
                      var7 = (CharSequence) null;
                      break L3;
                    }
                  }
                  var4_int = var4_int ^ -1;
                  break L2;
                } else {
                  var4_int = field_b[255 & (var4_int ^ param3[var5])] ^ var4_int >>> -429782424;
                  var5++;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              stackOut_9_0 = var4_int;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("uj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(char param0, String param1, int param2, String param3) {
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
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1.length();
              var5 = param3.length();
              var6 = var4_int;
              var7 = var5 - param2;
              if (var7 != 0) {
                var8_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      var8_int = param1.indexOf((int) param0, var8_int);
                      if (-1 >= (var8_int ^ -1)) {
                        break L4;
                      } else {
                        if (var11 != 0) {
                          break L3;
                        } else {
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var6 = var6 + var7;
                    var8_int++;
                    break L3;
                  }
                  if (var11 == 0) {
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L5: while (true) {
              L6: {
                L7: {
                  var10 = param1.indexOf((int) param0, var9);
                  if (-1 < (var10 ^ -1)) {
                    break L7;
                  } else {
                    discarded$6 = var8.append(param1.substring(var9, var10));
                    var9 = 1 + var10;
                    discarded$7 = var8.append(param3);
                    if (var11 != 0) {
                      break L6;
                    } else {
                      if (var11 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                discarded$8 = var8.append(param1.substring(var9));
                break L6;
              }
              stackOut_16_0 = var8.toString();
              stackIn_17_0 = stackOut_16_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("uj.C(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          L9: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        return stackIn_17_0;
    }

    final static long a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        CharSequence var8 = null;
        int stackIn_6_0 = 0;
        int stackIn_22_0 = 0;
        long stackIn_24_0 = 0L;
        long stackIn_27_0 = 0L;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        long stackOut_23_0 = 0L;
        int stackOut_21_0 = 0;
        long stackOut_26_0 = 0L;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < -94) {
                break L1;
              } else {
                var8 = (CharSequence) null;
                break L1;
              }
            }
            var2_long = 0L;
            var4 = param0.length();
            var5 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var4 <= var5) {
                      break L5;
                    } else {
                      var2_long = var2_long * 37L;
                      var6 = param0.charAt(var5);
                      stackOut_5_0 = var6;
                      stackIn_22_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var7 != 0) {
                        L6: while (true) {
                          if (stackIn_22_0 != 0) {
                            break L4;
                          } else {
                            stackOut_23_0 = 0L;
                            stackIn_27_0 = stackOut_23_0;
                            stackIn_24_0 = stackOut_23_0;
                            if (var7 != 0) {
                              break L3;
                            } else {
                              if (stackIn_24_0 == var2_long) {
                                break L4;
                              } else {
                                var2_long = var2_long / 37L;
                                if (var7 == 0) {
                                  stackOut_21_0 = (-1L < (var2_long % 37L ^ -1L) ? -1 : (-1L == (var2_long % 37L ^ -1L) ? 0 : 1));
                                  stackIn_22_0 = stackOut_21_0;
                                  continue L6;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L7: {
                          L8: {
                            L9: {
                              if (stackIn_6_0 < 65) {
                                break L9;
                              } else {
                                if (var6 <= 90) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (var6 < 97) {
                                break L10;
                              } else {
                                if (122 < var6) {
                                  break L10;
                                } else {
                                  var2_long = var2_long + (long)(-97 + var6 + 1);
                                  if (var7 == 0) {
                                    break L7;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            if (48 > var6) {
                              break L7;
                            } else {
                              if (var6 > 57) {
                                break L7;
                              } else {
                                var2_long = var2_long + (long)(var6 + -21);
                                if (var7 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          var2_long = var2_long + (long)(var6 + -64);
                          break L7;
                        }
                        L11: {
                          if (177917621779460413L > var2_long) {
                            break L11;
                          } else {
                            if (var7 == 0) {
                              break L5;
                            } else {
                              break L11;
                            }
                          }
                        }
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  L12: while (true) {
                    stackOut_21_0 = (-1L < (var2_long % 37L ^ -1L) ? -1 : (-1L == (var2_long % 37L ^ -1L) ? 0 : 1));
                    stackIn_22_0 = stackOut_21_0;
                    if (stackIn_22_0 != 0) {
                      break L4;
                    } else {
                      stackOut_23_0 = 0L;
                      stackIn_27_0 = stackOut_23_0;
                      stackIn_24_0 = stackOut_23_0;
                      if (var7 != 0) {
                        break L3;
                      } else {
                        if (stackIn_24_0 == var2_long) {
                          break L4;
                        } else {
                          var2_long = var2_long / 37L;
                          if (var7 == 0) {
                            continue L12;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_26_0 = var2_long;
                stackIn_27_0 = stackOut_26_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var2);
            stackOut_28_1 = new StringBuilder().append("uj.A(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L13;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L13;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
        }
        return stackIn_27_0;
    }

    uj(int param0) {
        this.field_c = param0;
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 <= 124) {
            uj.a((byte) -12);
        }
        field_f = null;
        field_b = null;
        field_e = null;
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            int var2 = 0;
            field_b = new int[256];
            var1 = 0;
            L0: while (true) {
              if (-257 >= (var1 ^ -1)) {
                field_f = "Resume Game";
                field_e = "Play free version";
                field_d = "Level failed! Too many fleas died!";
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if ((var2 ^ -1) <= -9) {
                    field_b[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if ((1 & var0 ^ -1) == -2) {
                      var0 = -306674912 ^ var0 >>> -26146047;
                      var2++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
