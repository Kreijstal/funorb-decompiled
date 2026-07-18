/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    int field_b;
    int field_c;
    static wb field_d;
    int[] field_a;
    static boolean field_f;
    static oj field_e;

    final static int a(CharSequence param0, byte param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_37_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var11 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param2 < 2) {
                break L1;
              } else {
                if (param2 > 36) {
                  break L1;
                } else {
                  L2: {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = param0.length();
                    if (param1 >= 74) {
                      break L2;
                    } else {
                      field_e = null;
                      break L2;
                    }
                  }
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= var7) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackOut_37_0 = var6;
                        stackIn_38_0 = stackOut_37_0;
                        break L0;
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param0.charAt(var8);
                          if (var8 != 0) {
                            break L5;
                          } else {
                            if (var9 == 45) {
                              var4_int = 1;
                              break L4;
                            } else {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        L6: {
                          L7: {
                            if (48 > var9) {
                              break L7;
                            } else {
                              if (var9 > 57) {
                                break L7;
                              } else {
                                var9 -= 48;
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (var9 <= 90) {
                                var9 -= 55;
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (97 > var9) {
                              break L9;
                            } else {
                              if (var9 <= 122) {
                                var9 -= 87;
                                break L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (param2 > var9) {
                          L10: {
                            if (var4_int == 0) {
                              break L10;
                            } else {
                              var9 = -var9;
                              break L10;
                            }
                          }
                          var10 = var9 + var6 * param2;
                          if (var10 / param2 == var6) {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          } else {
                            throw new NumberFormatException();
                          }
                        } else {
                          throw new NumberFormatException();
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var4;
            stackOut_39_1 = new StringBuilder().append("uj.C(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L11;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L11;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + param1 + ',' + param2 + ',' + true + ')');
        }
        return stackIn_38_0;
    }

    public static void b(int param0) {
        field_e = null;
        field_d = null;
        if (param0 != 0) {
            uj.b(-20);
        }
    }

    uj(int param0, int param1, int param2) {
        ((uj) this).field_a = new int[1 + param2];
        ((uj) this).field_c = param1;
        ((uj) this).field_b = param0;
    }

    final int a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 >= 41) {
          L0: {
            L1: {
              if (((uj) this).field_a == null) {
                break L1;
              } else {
                if (0 != ((uj) this).field_a.length) {
                  stackOut_6_0 = ((uj) this).field_a[((uj) this).field_a.length + -1];
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return -77;
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = stellarshard.field_B;
          if (((uj) this).field_a == null) {
            break L0;
          } else {
            if (((uj) this).field_a.length == 0) {
              break L0;
            } else {
              L1: {
                var3 = 1;
                if (param1 <= -121) {
                  break L1;
                } else {
                  int discarded$2 = ((uj) this).a(119);
                  break L1;
                }
              }
              L2: while (true) {
                if (var3 >= ((uj) this).field_a.length) {
                  return ((uj) this).field_a.length - 1;
                } else {
                  if (param0 >= ((uj) this).field_a[var3] + ((uj) this).field_a[-1 + var3] >> 1) {
                    var3++;
                    continue L2;
                  } else {
                    return -1 + var3;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new wb();
    }
}
