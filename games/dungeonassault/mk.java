/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends ne {
    static nn field_j;
    byte[] field_k;
    static int[] field_i;

    final static String a(byte param0, byte[] param1, int param2, int param3) {
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_3_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            var11 = new char[param2];
            var10 = var11;
            var4 = var10;
            var5 = 0;
            if (param0 == -24) {
              var6 = 0;
              L1: while (true) {
                if (var6 >= param2) {
                  stackIn_18_0 = new String(var11, 0, var5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var7 = 255 & param1[var6 + param3];
                    if (var7 != 0) {
                      L3: {
                        if (-129 < (var7 ^ -1)) {
                          break L3;
                        } else {
                          if (-161 < (var7 ^ -1)) {
                            L4: {
                              var8 = mh.field_d[var7 - 128];
                              if (var8 == 0) {
                                var8 = 63;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var7 = var8;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      incrementValue$1 = var5;
                      var5++;
                      var4[incrementValue$1] = (char)var7;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4_ref);

            stackIn_21_1 = new StringBuilder().append("mk.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_18_0;
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            field_i = (int[]) null;
        }
        field_j = null;
        field_i = null;
    }

    mk(byte[] param0) {
        try {
            this.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "mk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            if (param1 != null) {
              var3_int = param1.length();
              if (-2 < (var3_int ^ -1)) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var3_int <= 12) {
                  L1: {
                    var4 = jm.a((byte) 59, param1);
                    var5 = -123 / ((param2 - 13) / 43);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (-2 >= (var4.length() ^ -1)) {
                        L2: {
                          if (jc.a(var4.charAt(0), -119)) {
                            break L2;
                          } else {
                            if (jc.a(var4.charAt(-1 + var4.length()), -59)) {
                              break L2;
                            } else {
                              var6 = 0;
                              var7 = 0;
                              L3: while (true) {
                                if (var7 >= param1.length()) {
                                  if ((var6 ^ -1) >= -1) {
                                    stackIn_34_0 = 1;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    stackIn_32_0 = 0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                } else {
                                  L4: {
                                    var8 = param1.charAt(var7);
                                    if (!jc.a((char) var8, 68)) {
                                      var6 = 0;
                                      break L4;
                                    } else {
                                      var6++;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if ((var6 ^ -1) > -3) {
                                      break L5;
                                    } else {
                                      if (!param0) {
                                        stackIn_28_0 = 0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  var7++;
                                  continue L3;
                                }
                              }
                            }
                          }
                        }
                        stackIn_18_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var3);

            stackIn_37_1 = new StringBuilder().append("mk.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L6;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L6;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_28_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_32_0 != 0;
                  } else {
                    return stackIn_34_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final static nh a(int param0, byte param1) {
        if (param1 != 34) {
            mk.a(109, (byte) -40);
        }
        return uo.a(false, 1, true, param0, param1 + 27813, false);
    }

    static {
        field_i = new int[4];
    }
}
