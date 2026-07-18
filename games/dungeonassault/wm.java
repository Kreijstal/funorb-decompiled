/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm {
    static String[] field_d;
    static String field_j;
    static int field_a;
    static String field_e;
    static volatile int field_g;
    int[] field_f;
    static int field_b;
    static cn field_c;
    static cn field_h;
    static String[] field_i;

    final boolean a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 >= 65) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            L2: {
              if ((((wm) this).field_f[param0 >> -2028280251] & 1 << (param0 & 31)) == 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3, "wm.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final wm a(byte param0, wm param1) {
        Object var3 = null;
        wm var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_3_0 = null;
        wm stackIn_16_0 = null;
        wm stackIn_20_0 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        Object stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        Object stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        wm stackOut_15_0 = null;
        wm stackOut_19_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        Object stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        Object stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            var3 = this;
            if (param0 == -53) {
              L1: {
                if (param1.field_f.length < ((wm) var3).field_f.length) {
                  var3 = (Object) (Object) param1;
                  param1 = (wm) this;
                  break L1;
                } else {
                  break L1;
                }
              }
              var4 = new wm(32 * param1.field_f.length);
              var5 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (((wm) var3).field_f.length <= var5) {
                        break L5;
                      } else {
                        var4.field_f[var5] = nb.a(param1.field_f[var5], ((wm) var3).field_f[var5]);
                        var5++;
                        if (var6 != 0) {
                          break L4;
                        } else {
                          if (var6 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: while (true) {
                      if (param1.field_f.length <= var5) {
                        break L4;
                      } else {
                        stackOut_15_0 = (wm) var4;
                        stackIn_20_0 = stackOut_15_0;
                        stackIn_16_0 = stackOut_15_0;
                        if (var6 != 0) {
                          break L3;
                        } else {
                          stackIn_16_0.field_f[var5] = param1.field_f[var5];
                          var5++;
                          if (var6 == 0) {
                            continue L6;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_19_0 = (wm) var4;
                  stackIn_20_0 = stackOut_19_0;
                  break L3;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (wm) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_21_0 = var3;
            stackOut_21_1 = new StringBuilder().append("wm.A(").append(param0).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_22_0 = stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L7;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_20_0;
    }

    final static boolean a(String param0, String param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        try {
          L0: {
            if (!dj.a(param2 + 6706, param1)) {
              if (j.a(param1, (byte) -124)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                if (!sm.a(1, param1)) {
                  if (param0.length() != 0) {
                    if (!gk.a(param0, param1, 16777215)) {
                      if (gl.a(param0, param2 ^ -83, param1)) {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0 != 0;
                      } else {
                        if (uo.a((byte) -56, param0, param1)) {
                          stackOut_25_0 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0 != 0;
                        } else {
                          if (param2 == -83) {
                            stackOut_30_0 = 1;
                            stackIn_31_0 = stackOut_30_0;
                            break L0;
                          } else {
                            stackOut_28_0 = 1;
                            stackIn_29_0 = stackOut_28_0;
                            return stackIn_29_0 != 0;
                          }
                        }
                      }
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0 != 0;
                    }
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("wm.B(");
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L1;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L1;
            }
          }
          L2: {
            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L2;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + param2 + ')');
        }
        return stackIn_31_0 != 0;
    }

    final static void a(byte param0, int param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              vo.field_r = param1;
              if (param0 < -41) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            bl.field_p = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3, "wm.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    wm(int param0) {
        try {
            ((wm) this).field_f = new int[param0 - -31 >> 104519493];
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "wm.<init>(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        try {
            ((wm) this).field_f[param0 >> -279849819] = mp.a(((wm) this).field_f[param0 >> -279849819], 1 << nb.a(31, param0));
            if (param1 >= -59) {
                boolean discarded$0 = wm.a((String) null, (String) null, (byte) 25);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "wm.G(" + param0 + ',' + param1 + ')');
        }
    }

    wm(wm param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
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
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            var2_int = param0.field_f.length;
            ((wm) this).field_f = new int[var2_int];
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 >= var2_int) {
                    break L3;
                  } else {
                    ((wm) this).field_f[var3] = param0.field_f[var3];
                    var3++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("wm.<init>(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L4;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_c = null;
              field_h = null;
              field_j = null;
              field_i = null;
              if (param0 == 112) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            field_e = null;
            field_d = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "wm.H(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (((wm) this).field_f.length <= var2_int) {
                    break L3;
                  } else {
                    ((wm) this).field_f[var2_int] = 0;
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 1) {
                  break L2;
                } else {
                  field_d = null;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) (Object) runtimeException, "wm.F(" + param0 + ')');
        }
    }

    final void b(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 31) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            ((wm) this).field_f[param0 >> 749349221] = nb.a(((wm) this).field_f[param0 >> 749349221], ~(1 << nb.a(31, param0)));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var3, "wm.D(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"<%0> of the 6M crew", "<%0>, Ultima", "<%0>, Monarch of the Gem", "<%0>, Scourge Elite", "<%0>, the Relentless", "<%0>, Solar Champion", "<%0>, the Reckless", "<%0>, Mistress of Magic", "Archmage <%0>", "<%0>, the Corrupted"};
        field_e = "You claim a bounty of <%0> Treasure for reaching the hoard room.";
        field_j = "Guardians";
        field_g = 0;
        field_a = 0;
        field_i = new String[]{"<%0> of the 6M crew", "<%0>, Ultima", "<%0>, Monarch of the Gem", "<%0>, Scourge Elite", "<%0>, the Relentless", "<%0>, Solar Champion", "<%0>, the Reckless", "<%0>, Master of Magic", "Archmage <%0>", "<%0>, the Corrupted"};
    }
}
