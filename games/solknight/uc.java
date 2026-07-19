/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static int field_b;
    static int field_f;
    static int field_c;
    static int field_e;
    static nc field_j;
    static String field_d;
    static mg field_g;
    static nc field_a;
    static int field_i;
    static String[] field_h;
    static String field_k;

    final static String a(int param0, char param1, int param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        if (param0 <= -54) {
          var6 = new char[param2];
          var3 = var6;
          var4 = 0;
          L0: while (true) {
            L1: {
              if (var4 >= param2) {
                break L1;
              } else {
                var6[var4] = param1;
                var4++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return new String(var6);
          }
        } else {
          uc.a(49);
          var6 = new char[param2];
          var3 = var6;
          var4 = 0;
          L2: while (true) {
            L3: {
              if (var4 >= param2) {
                break L3;
              } else {
                var6[var4] = param1;
                var4++;
                if (var5 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            return new String(var6);
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = th.field_J;
            L1: while (true) {
              L2: {
                L3: {
                  if (vc.field_d.length <= var3_int) {
                    if (param1 == 1691746689) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    var5 = oa.field_l[var3_int];
                    var10 = var5 ^ -1;
                    var9 = -1;
                    if (var8 != 0) {
                      if (var9 == var10) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      L4: {
                        L5: {
                          if (var9 >= var10) {
                            break L5;
                          } else {
                            var4 = var4 + field_i;
                            if (var8 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var6 = fa.a(vc.field_d[var3_int], true, (byte) 99);
                        var4 = var4 + vg.field_N;
                        var7 = sb.field_d + -(var6 >> -264232799);
                        if (!gh.a(var4, we.field_c + (g.field_l << -1045777439), param0, var6 + (bl.field_i << 1691746689), 16777215, param2, -bl.field_i + var7)) {
                          var4 = var4 + (we.field_c + vg.field_N + (g.field_l << 984967105));
                          break L4;
                        } else {
                          stackOut_10_0 = var5;
                          stackIn_11_0 = stackOut_10_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                field_k = (String) null;
                break L2;
              }
              stackOut_16_0 = -1;
              stackIn_17_0 = stackOut_16_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var3), "uc.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_17_0;
        }
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        boolean stackIn_22_0 = false;
        String stackIn_30_0 = null;
        int stackIn_33_0 = 0;
        String stackIn_36_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_21_0 = false;
        String stackOut_29_0 = null;
        int stackOut_32_0 = 0;
        String stackOut_35_0 = null;
        String stackOut_17_0 = null;
        String stackOut_12_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (12 >= var3_int) {
                    L2: {
                      var4 = jg.a(param1, -2);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (1 <= var4.length()) {
                          L3: {
                            if (ck.a(var4.charAt(0), true)) {
                              break L3;
                            } else {
                              if (!ck.a(var4.charAt(var4.length() + -1), true)) {
                                var5 = 0;
                                var6 = param2;
                                L4: while (true) {
                                  L5: {
                                    L6: {
                                      if (param1.length() <= var6) {
                                        break L6;
                                      } else {
                                        var7 = param1.charAt(var6);
                                        stackOut_21_0 = ck.a((char) var7, true);
                                        stackIn_33_0 = stackOut_21_0 ? 1 : 0;
                                        stackIn_22_0 = stackOut_21_0;
                                        if (var8 != 0) {
                                          break L5;
                                        } else {
                                          L7: {
                                            if (!stackIn_22_0) {
                                              var5 = 0;
                                              if (var8 == 0) {
                                                break L7;
                                              } else {
                                                var5++;
                                                break L7;
                                              }
                                            } else {
                                              var5++;
                                              break L7;
                                            }
                                          }
                                          L8: {
                                            if (var5 < 2) {
                                              break L8;
                                            } else {
                                              if (!param0) {
                                                stackOut_29_0 = td.field_n;
                                                stackIn_30_0 = stackOut_29_0;
                                                decompiledRegionSelector0 = 4;
                                                break L0;
                                              } else {
                                                break L8;
                                              }
                                            }
                                          }
                                          var6++;
                                          if (var8 == 0) {
                                            continue L4;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_32_0 = var5 ^ -1;
                                    stackIn_33_0 = stackOut_32_0;
                                    break L5;
                                  }
                                  if (stackIn_33_0 < -1) {
                                    stackOut_35_0 = qf.field_f;
                                    stackIn_36_0 = stackOut_35_0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  } else {
                                    return null;
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_17_0 = qf.field_f;
                          stackIn_18_0 = stackOut_17_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_12_0 = rk.field_b;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_7_0 = rk.field_b;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = rk.field_b;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var3);
            stackOut_37_1 = new StringBuilder().append("uc.B(").append(param0).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L9;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L9;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0;
                } else {
                  return stackIn_36_0;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        field_g = null;
        int var1 = 7 / ((param0 - -35) / 46);
        field_d = null;
        field_j = null;
        field_k = null;
    }

    static {
        pg.a(50, 1);
        field_j = new nc();
        field_d = "Passwords must be between 5 and 20 letters and numbers";
        field_a = new nc();
        field_k = "Player names can be up to 12 letters, numbers and underscores";
        field_h = new String[]{"Defender of Humanity", "Warrior of the Void", "Heavenly Guardian", "Astral Avenger", "Rock Crusher", "Lord of the System", "Earth's Last Hope", "Revenge of the Rock Scum"};
    }
}
