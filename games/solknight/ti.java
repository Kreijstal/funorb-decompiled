/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static int field_e;
    static String field_a;
    static nc field_b;
    static String field_d;
    static ff field_c;
    static String[] field_g;
    static e field_f;

    final static int a(qc param0, int param1, sd param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (null == param2.field_i) {
                  break L1;
                } else {
                  if (param0 == null) {
                    break L1;
                  } else {
                    if (param0.field_m == param2.field_o) {
                      var4_int = param0.field_r.length;
                      var5 = param2.field_i[param1].length / var4_int;
                      var6 = param3;
                      L2: while (true) {
                        L3: {
                          L4: {
                            if (var5 <= var6) {
                              break L4;
                            } else {
                              stackIn_23_0 = ((param0.field_n ^ -1L) < (param2.field_m[param1][var6] ^ -1L) ? -1 : ((param0.field_n ^ -1L) == (param2.field_m[param1][var6] ^ -1L) ? 0 : 1));

                              if (var8 != 0) {
                                break L3;
                              } else {
                                L5: {
                                  if (stackIn_23_0 != 0) {
                                    break L5;
                                  } else {
                                    if (!kj.a(param2.field_n[param1][var6], (byte) -109)) {
                                      break L5;
                                    } else {
                                      var7 = 0;
                                      L6: while (true) {
                                        L7: {
                                          L8: {
                                            if (var7 >= var4_int) {
                                              break L8;
                                            } else {
                                              stackIn_20_0 = param0.field_r[var7] ^ -1;

                                              if (var8 != 0) {
                                                break L7;
                                              } else {
                                                if (stackIn_20_0 != (param2.field_i[param1][var7 + var4_int * var6] ^ -1)) {
                                                  break L5;
                                                } else {
                                                  var7++;
                                                  if (var8 == 0) {
                                                    continue L6;
                                                  } else {
                                                    break L8;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          stackIn_20_0 = var6;
                                          break L7;
                                        }
                                        decompiledRegionSelector0 = 2;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                                var6++;
                                if (var8 == 0) {
                                  continue L2;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          stackIn_23_0 = -1;
                          break L3;
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackIn_7_0 = -1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4);

            stackIn_26_1 = new StringBuilder().append("ti.C(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_27_0), stackIn_30_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_23_0;
          } else {
            return stackIn_20_0;
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_c = null;
        int var1 = -55 % ((param0 - 62) / 40);
        field_a = null;
        field_b = null;
        field_g = null;
    }

    final static long a(CharSequence param0, byte param1) {
        int stackIn_21_0 = 0;
        long stackIn_26_0 = 0L;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_long = 0L;
              if (param1 == 44) {
                break L1;
              } else {
                ti.a((byte) 25);
                break L1;
              }
            }
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
                      stackIn_21_0 = var6;

                      if (var7 != 0) {
                        L6: while (true) {
                          if (stackIn_21_0 != 0) {
                            break L4;
                          } else {
                            stackIn_26_0 = 0L;

                            if (var7 != 0) {
                              break L3;
                            } else {
                              if (stackIn_26_0 == var2_long) {
                                break L4;
                              } else {
                                var2_long = var2_long / 37L;
                                if (var7 == 0) {
                                  stackIn_21_0 = (var2_long % 37L < 0L ? -1 : (var2_long % 37L == 0L ? 0 : 1));
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
                            if (stackIn_21_0 < 65) {
                              break L8;
                            } else {
                              if (var6 > 90) {
                                break L8;
                              } else {
                                var2_long = var2_long + (long)(1 - (-var6 + 65));
                                if (var7 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          L9: {
                            if (var6 < 97) {
                              break L9;
                            } else {
                              if (var6 > 122) {
                                break L9;
                              } else {
                                var2_long = var2_long + (long)(-97 + (var6 + 1));
                                if (var7 == 0) {
                                  break L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                          if (var6 < 48) {
                            break L7;
                          } else {
                            if (57 >= var6) {
                              var2_long = var2_long + (long)(27 - (-var6 - -48));
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if ((var2_long ^ -1L) <= -177917621779460414L) {
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
                  L10: while (true) {
                    stackIn_21_0 = (var2_long % 37L < 0L ? -1 : (var2_long % 37L == 0L ? 0 : 1));
                    if (stackIn_21_0 != 0) {
                      break L4;
                    } else {
                      stackIn_26_0 = 0L;

                      if (var7 != 0) {
                        break L3;
                      } else {
                        if (stackIn_26_0 == var2_long) {
                          break L4;
                        } else {
                          var2_long = var2_long / 37L;
                          if (var7 == 0) {
                            continue L10;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                stackIn_26_0 = var2_long;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var2);

            stackIn_29_1 = new StringBuilder().append("ti.B(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L11;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L11;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
        return stackIn_26_0;
    }

    final static void a(byte param0) {
        il.field_c.field_l = 0;
        int var1 = -8 / ((param0 - -58) / 63);
        il.field_c.field_c = 0;
    }

    static {
        field_a = "CONGRATULATIONS!";
        field_d = "Highscores";
        field_b = new nc();
        field_c = new ff(4, 1, 1, 1);
        field_g = new String[]{"By rating", "By win percentage"};
    }
}
