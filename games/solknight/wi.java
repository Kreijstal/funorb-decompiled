/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends gg {
    static String field_k;
    static int field_l;
    static o[] field_i;
    static na field_j;
    static String field_h;

    private wi() throws Throwable {
        throw new Error();
    }

    final static boolean a(int param0, boolean param1, CharSequence param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_45_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-3 < (param3 ^ -1)) {
                break L1;
              } else {
                if (36 < param3) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  if (param0 == -913) {
                    var6 = 0;
                    var7 = param2.length();
                    var8 = 0;
                    L2: while (true) {
                      L3: {
                        if (var8 >= var7) {
                          stackOut_45_0 = var5;
                          stackIn_46_0 = stackOut_45_0;
                          break L3;
                        } else {
                          var9 = param2.charAt(var8);
                          stackOut_10_0 = var8 ^ -1;
                          stackIn_46_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (var11 != 0) {
                            break L3;
                          } else {
                            L4: {
                              L5: {
                                if (stackIn_11_0 == -1) {
                                  L6: {
                                    if (var9 == 45) {
                                      var4_int = 1;
                                      if (var11 == 0) {
                                        break L4;
                                      } else {
                                        break L6;
                                      }
                                    } else {
                                      break L6;
                                    }
                                  }
                                  if (var9 != 43) {
                                    break L5;
                                  } else {
                                    if (param1) {
                                      break L4;
                                    } else {
                                      break L5;
                                    }
                                  }
                                } else {
                                  break L5;
                                }
                              }
                              L7: {
                                L8: {
                                  if (var9 < 48) {
                                    break L8;
                                  } else {
                                    if (var9 > 57) {
                                      break L8;
                                    } else {
                                      var9 -= 48;
                                      if (var11 == 0) {
                                        break L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                                L9: {
                                  if (var9 < 65) {
                                    break L9;
                                  } else {
                                    if (var9 > 90) {
                                      break L9;
                                    } else {
                                      var9 -= 55;
                                      break L7;
                                    }
                                  }
                                }
                                if (var9 < 97) {
                                  stackOut_30_0 = 0;
                                  stackIn_31_0 = stackOut_30_0;
                                  decompiledRegionSelector0 = 2;
                                  break L0;
                                } else {
                                  if (var9 <= 122) {
                                    var9 -= 87;
                                    if (var11 == 0) {
                                      break L7;
                                    } else {
                                      var9 -= 55;
                                      break L7;
                                    }
                                  } else {
                                    return false;
                                  }
                                }
                              }
                              if (param3 <= var9) {
                                stackOut_36_0 = 0;
                                stackIn_37_0 = stackOut_36_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                L10: {
                                  if (var4_int == 0) {
                                    break L10;
                                  } else {
                                    var9 = -var9;
                                    break L10;
                                  }
                                }
                                var10 = var6 * param3 + var9;
                                if (var10 / param3 == var6) {
                                  var5 = 1;
                                  var6 = var10;
                                  break L4;
                                } else {
                                  stackOut_41_0 = 0;
                                  stackIn_42_0 = stackOut_41_0;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              }
                            }
                            var8++;
                            continue L2;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) (var4);
            stackOut_47_1 = new StringBuilder().append("wi.B(").append(param0).append(',').append(param1).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param2 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L11;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L11;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_46_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_31_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_37_0 != 0;
              } else {
                return stackIn_42_0 != 0;
              }
            }
          }
        }
    }

    final static void c(int param0, int param1) {
        jd var2 = id.field_c;
        var2.e(param1, -2147483648);
        var2.c(114, param0);
        var2.c(75, 0);
    }

    public static void a(int param0) {
        int discarded$2 = 0;
        field_h = null;
        if (param0 != -26923) {
          discarded$2 = wi.b(-104, -27);
          field_i = null;
          field_j = null;
          field_k = null;
          return;
        } else {
          field_i = null;
          field_j = null;
          field_k = null;
          return;
        }
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        var2 = 0;
        if (param1 >= 0) {
          if (param1 < 65536) {
            L0: {
              if ((param1 ^ -1) > -257) {
                break L0;
              } else {
                var2 += 8;
                param1 = param1 >>> 8;
                break L0;
              }
            }
            L1: {
              if (-17 >= (param1 ^ -1)) {
                param1 = param1 >>> 4;
                var2 += 4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 < 4) {
                break L2;
              } else {
                var2 += 2;
                param1 = param1 >>> 2;
                break L2;
              }
            }
            if (param0 < 72) {
              return -3;
            } else {
              L3: {
                if (param1 < 1) {
                  break L3;
                } else {
                  var2++;
                  param1 = param1 >>> 1;
                  break L3;
                }
              }
              return param1 + var2;
            }
          } else {
            L4: {
              var2 += 16;
              param1 = param1 >>> 16;
              if ((param1 ^ -1) > -257) {
                break L4;
              } else {
                var2 += 8;
                param1 = param1 >>> 8;
                break L4;
              }
            }
            L5: {
              if (-17 >= (param1 ^ -1)) {
                param1 = param1 >>> 4;
                var2 += 4;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param1 < 4) {
                break L6;
              } else {
                var2 += 2;
                param1 = param1 >>> 2;
                break L6;
              }
            }
            if (param0 < 72) {
              return -3;
            } else {
              L7: {
                if (param1 < 1) {
                  break L7;
                } else {
                  var2++;
                  param1 = param1 >>> 1;
                  break L7;
                }
              }
              return param1 + var2;
            }
          }
        } else {
          L8: {
            var2 += 16;
            param1 = param1 >>> 16;
            if ((param1 ^ -1) > -257) {
              break L8;
            } else {
              var2 += 8;
              param1 = param1 >>> 8;
              break L8;
            }
          }
          L9: {
            if (-17 >= (param1 ^ -1)) {
              param1 = param1 >>> 4;
              var2 += 4;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (param1 < 4) {
              break L10;
            } else {
              var2 += 2;
              param1 = param1 >>> 2;
              break L10;
            }
          }
          if (param0 < 72) {
            return -3;
          } else {
            L11: {
              if (param1 < 1) {
                break L11;
              } else {
                var2++;
                param1 = param1 >>> 1;
                break L11;
              }
            }
            return param1 + var2;
          }
        }
    }

    static {
        field_l = 250;
        field_k = "Type your password again to make sure it's correct";
        field_h = "Updates will sent to the email address you've given";
    }
}
