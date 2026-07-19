/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static le field_f;
    static java.math.BigInteger field_a;
    static int field_b;
    static boolean field_c;
    static int field_e;
    static boolean field_d;

    final static long a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
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
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_long = 0L;
              if (param0 == 37) {
                break L1;
              } else {
                sd.a((byte) 7);
                break L1;
              }
            }
            var4 = param1.length();
            var5 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var4 <= var5) {
                      break L5;
                    } else {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      stackOut_5_0 = var6 ^ -1;
                      stackIn_22_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var7 != 0) {
                        L6: while (true) {
                          if (stackIn_22_0 != 0) {
                            break L4;
                          } else {
                            stackOut_23_0 = var2_long ^ -1L;
                            stackIn_27_0 = stackOut_23_0;
                            stackIn_24_0 = stackOut_23_0;
                            if (var7 != 0) {
                              break L3;
                            } else {
                              if (stackIn_24_0 == -1L) {
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
                              if (stackIn_6_0 > -66) {
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
                              L11: {
                                if (var6 < 97) {
                                  break L11;
                                } else {
                                  if (var6 <= 122) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (var6 < 48) {
                                break L7;
                              } else {
                                if (var6 <= 57) {
                                  var2_long = var2_long + (long)(var6 + -21);
                                  if (var7 == 0) {
                                    break L7;
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var2_long = var2_long + (long)(1 - -var6 + -97);
                            if (var7 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                          var2_long = var2_long + (long)(var6 + -64);
                          break L7;
                        }
                        if (177917621779460413L <= var2_long) {
                          break L5;
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    }
                  }
                  L12: while (true) {
                    stackOut_21_0 = (-1L < (var2_long % 37L ^ -1L) ? -1 : (-1L == (var2_long % 37L ^ -1L) ? 0 : 1));
                    stackIn_22_0 = stackOut_21_0;
                    if (stackIn_22_0 != 0) {
                      break L4;
                    } else {
                      stackOut_23_0 = var2_long ^ -1L;
                      stackIn_27_0 = stackOut_23_0;
                      stackIn_24_0 = stackOut_23_0;
                      if (var7 != 0) {
                        break L3;
                      } else {
                        if (stackIn_24_0 == -1L) {
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
            stackOut_28_1 = new StringBuilder().append("sd.B(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        return stackIn_27_0;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 122) {
            field_a = (java.math.BigInteger) null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_c = false;
        field_a = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_d = false;
    }
}
