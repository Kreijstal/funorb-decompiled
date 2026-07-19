/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er {
    static String field_c;
    static String field_b;
    static int field_a;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != -3) {
            field_a = 42;
        }
    }

    final static void b(int param0) {
        if ((p.field_b ^ -1) != param0) {
          if (du.c(10)) {
            dd.field_a = true;
            return;
          } else {
            tb.d(7);
            p.field_b = 11;
            dd.field_a = true;
            return;
          }
        } else {
          tb.d(7);
          p.field_b = 11;
          dd.field_a = true;
          return;
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_33_0 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param3 ^ -1) > -3) {
                break L1;
              } else {
                if ((param3 ^ -1) >= -37) {
                  L2: {
                    var4_int = 0;
                    if (param1 <= -38) {
                      break L2;
                    } else {
                      er.b(-89);
                      break L2;
                    }
                  }
                  var5 = 0;
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  L3: while (true) {
                    L4: {
                      if (var8 >= var7) {
                        stackOut_44_0 = var5;
                        stackIn_45_0 = stackOut_44_0;
                        break L4;
                      } else {
                        var9 = param2.charAt(var8);
                        stackOut_9_0 = 0;
                        stackIn_45_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var11 != 0) {
                          break L4;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_10_0 == var8) {
                                L7: {
                                  if (var9 != 45) {
                                    break L7;
                                  } else {
                                    var4_int = 1;
                                    if (var11 == 0) {
                                      break L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                if (43 != var9) {
                                  break L6;
                                } else {
                                  if (!param0) {
                                    break L6;
                                  } else {
                                    if (var11 == 0) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              L9: {
                                if (var9 < 48) {
                                  break L9;
                                } else {
                                  if (57 < var9) {
                                    break L9;
                                  } else {
                                    var9 -= 48;
                                    if (var11 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              L10: {
                                if (var9 < 65) {
                                  break L10;
                                } else {
                                  if (90 < var9) {
                                    break L10;
                                  } else {
                                    var9 -= 55;
                                    if (var11 == 0) {
                                      break L8;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              L11: {
                                if (var9 < 97) {
                                  break L11;
                                } else {
                                  if (var9 > 122) {
                                    break L11;
                                  } else {
                                    var9 -= 87;
                                    if (var11 == 0) {
                                      break L8;
                                    } else {
                                      return false;
                                    }
                                  }
                                }
                              }
                              stackOut_30_0 = 0;
                              stackIn_31_0 = stackOut_30_0;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            }
                            if (var9 < param3) {
                              L12: {
                                if (var4_int != 0) {
                                  var9 = -var9;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              var10 = var9 + param3 * var6;
                              if (var10 / param3 != var6) {
                                stackOut_40_0 = 0;
                                stackIn_41_0 = stackOut_40_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var5 = 1;
                                var6 = var10;
                                break L5;
                              }
                            } else {
                              stackOut_33_0 = 0;
                              stackIn_34_0 = stackOut_33_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                          var8++;
                          continue L3;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) (var4);
            stackOut_46_1 = new StringBuilder().append("er.D(").append(param0).append(',').append(param1).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param2 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L13;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L13;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_45_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_31_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_34_0 != 0;
            } else {
              return stackIn_41_0 != 0;
            }
          }
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        L0: {
          var1 = -52 % ((param0 - -85) / 37);
          if (null != rl.field_C) {
            rl.field_C.k(0);
            break L0;
          } else {
            break L0;
          }
        }
        if (pq.field_a != null) {
          pq.field_a.i((byte) 2);
          qh.a((byte) 124);
          return;
        } else {
          qh.a((byte) 124);
          return;
        }
    }

    static {
        field_b = "This password is part of your Player Name, and would be easy to guess";
        field_c = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
