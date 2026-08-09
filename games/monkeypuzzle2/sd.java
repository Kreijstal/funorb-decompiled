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
        int stackIn_23_0 = 0;
        long stackIn_28_0 = 0L;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
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
                      stackIn_23_0 = var6 ^ -1;

                      if (var7 != 0) {
                        L6: while (true) {
                          if (stackIn_23_0 != 0) {
                            break L4;
                          } else {
                            stackIn_28_0 = var2_long ^ -1L;

                            if (var7 != 0) {
                              break L3;
                            } else {
                              if (stackIn_28_0 == -1L) {
                                break L4;
                              } else {
                                var2_long = var2_long / 37L;
                                if (var7 == 0) {
                                  stackIn_23_0 = (-1L < (var2_long % 37L ^ -1L) ? -1 : (-1L == (var2_long % 37L ^ -1L) ? 0 : 1));
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
                              if (stackIn_23_0 > -66) {
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
                          if (var7 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  L12: while (true) {
                    stackIn_23_0 = (-1L < (var2_long % 37L ^ -1L) ? -1 : (-1L == (var2_long % 37L ^ -1L) ? 0 : 1));
                    if (stackIn_23_0 != 0) {
                      break L4;
                    } else {
                      stackIn_28_0 = var2_long ^ -1L;

                      if (var7 != 0) {
                        break L3;
                      } else {
                        if (stackIn_28_0 == -1L) {
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
                stackIn_28_0 = var2_long;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var2);

            stackIn_31_1 = new StringBuilder().append("sd.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L13;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L13;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        return stackIn_28_0;
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
