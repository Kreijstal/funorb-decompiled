/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc implements ch {
    static String field_d;
    static int field_f;
    static rh field_e;
    static String[] field_a;
    static vc field_c;
    static long field_b;

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 > 113) {
          param0 = param0 & 8191;
          if (-4097 < (param0 ^ -1)) {
            L0: {
              if (-2049 < (param0 ^ -1)) {
                stackOut_18_0 = dk.field_D[param0];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = dk.field_D[4096 - param0];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (-6145 >= (param0 ^ -1)) {
                stackOut_14_0 = -dk.field_D[8192 - param0];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = -dk.field_D[-4096 + param0];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_e = (rh) null;
          param0 = param0 & 8191;
          if (-4097 < (param0 ^ -1)) {
            L2: {
              if (-2049 < (param0 ^ -1)) {
                stackOut_8_0 = dk.field_D[param0];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = dk.field_D[4096 - param0];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (-6145 >= (param0 ^ -1)) {
                stackOut_4_0 = -dk.field_D[8192 - param0];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = -dk.field_D[-4096 + param0];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    public static void a(int param0) {
        int discarded$2 = 0;
        field_d = null;
        if (param0 != -37) {
          discarded$2 = jc.a(84, 50);
          field_e = null;
          field_c = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_c = null;
          field_a = null;
          return;
        }
    }

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        dd var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var6_int = param1 + param3.field_y;
            if (param0 < -36) {
              L1: {
                var7 = param3.field_z + param4;
                pj.a((byte) 127, param3.field_u, var7, var6_int, param3.field_j);
                var8 = t.field_h[1];
                if (!(param3 instanceof bb)) {
                  break L1;
                } else {
                  if (((bb) ((Object) param3)).field_G) {
                    var8.a(var6_int + (1 + (param3.field_u - var8.field_x >> -1375674303)), (-var8.field_r + param3.field_j >> -432594495) + (var7 + 1), 256);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              if (param3.e(1)) {
                ek.a(param3.field_j - 4, 2 + var6_int, 2 + var7, 1, -4 + param3.field_u);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var6);
            stackOut_10_1 = new StringBuilder().append("jc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, boolean param2, CharSequence param3) {
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
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_43_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-3 < (param0 ^ -1)) {
                break L1;
              } else {
                if ((param0 ^ -1) >= -37) {
                  var4_int = 0;
                  if (param1 > 104) {
                    var5 = 0;
                    var6 = 0;
                    var7 = param3.length();
                    var8 = 0;
                    L2: while (true) {
                      L3: {
                        if (var8 >= var7) {
                          stackOut_43_0 = var5;
                          stackIn_44_0 = stackOut_43_0;
                          break L3;
                        } else {
                          var9 = param3.charAt(var8);
                          stackOut_10_0 = -1;
                          stackIn_44_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (var11 != 0) {
                            break L3;
                          } else {
                            L4: {
                              L5: {
                                if (stackIn_11_0 == (var8 ^ -1)) {
                                  L6: {
                                    if (var9 != 45) {
                                      break L6;
                                    } else {
                                      var4_int = 1;
                                      if (var11 == 0) {
                                        break L4;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  if (var9 != 43) {
                                    break L5;
                                  } else {
                                    if (!param2) {
                                      break L5;
                                    } else {
                                      if (var11 == 0) {
                                        break L4;
                                      } else {
                                        break L5;
                                      }
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
                                L10: {
                                  if (var9 < 97) {
                                    break L10;
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
                                      break L10;
                                    }
                                  }
                                }
                                throw new NumberFormatException();
                              }
                              if (var9 < param0) {
                                L11: {
                                  if (var4_int != 0) {
                                    var9 = -var9;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                var10 = var9 + var6 * param0;
                                if (var10 / param0 != var6) {
                                  throw new NumberFormatException();
                                } else {
                                  var5 = 1;
                                  var6 = var10;
                                  break L4;
                                }
                              } else {
                                throw new NumberFormatException();
                              }
                            }
                            var8++;
                            continue L2;
                          }
                        }
                      }
                      if (stackIn_44_0 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackOut_47_0 = var6;
                        stackIn_48_0 = stackOut_47_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  } else {
                    stackOut_6_0 = 51;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) (var4);
            stackOut_49_1 = new StringBuilder().append("jc.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param3 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L12;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L12;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_48_0;
        }
    }

    static {
        field_d = "Error connecting to server. Please try using a different server.";
        field_c = null;
        field_f = 0;
        field_a = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
