/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static int field_g;
    static int[] field_a;
    boolean field_d;
    boolean field_i;
    String field_h;
    int field_b;
    static int[] field_e;
    String[] field_c;
    static int[] field_f;

    public static void a(byte param0) {
        field_a = null;
        field_f = null;
        field_e = null;
        if (param0 < 102) {
            CharSequence var2 = (CharSequence) null;
            wd.a((byte) 89, (CharSequence) null, false);
        }
    }

    final static boolean a(byte param0, CharSequence param1, boolean param2) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        var8 = wizardrun.field_H;
        try {
          L0: {
            if (param1 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = param1.length();
              if (var3_int < 1) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-13 <= (var3_int ^ -1)) {
                  L1: {
                    var4 = ta.a(-77, param1);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (1 <= var4.length()) {
                        L2: {
                          if (d.a(true, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (!d.a(true, var4.charAt(var4.length() - 1))) {
                              L3: {
                                var5 = 0;
                                if (param0 == 43) {
                                  break L3;
                                } else {
                                  var9 = (CharSequence) null;
                                  wd.a((byte) 21, (CharSequence) null, true);
                                  break L3;
                                }
                              }
                              var6 = 0;
                              L4: while (true) {
                                if (param1.length() <= var6) {
                                  if (-1 > (var5 ^ -1)) {
                                    stackIn_35_0 = 0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  L5: {
                                    var7 = param1.charAt(var6);
                                    if (d.a(true, (char) var7)) {
                                      var5++;
                                      break L5;
                                    } else {
                                      var5 = 0;
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if ((var5 ^ -1) > -3) {
                                      break L6;
                                    } else {
                                      if (param2) {
                                        break L6;
                                      } else {
                                        stackIn_30_0 = 0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L4;
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackIn_19_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3);

            stackIn_38_1 = new StringBuilder().append("wd.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L7;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L7;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0 != 0;
                } else {
                  return stackIn_35_0 != 0;
                }
              }
            }
          }
        }
    }

    wd(boolean param0) {
        this.field_i = param0 ? true : false;
    }

    static {
        $cfr$clinit: {
            int var0;
            int var1;
            int var2;
            field_g = 100;
            field_a = new int[128];
            field_e = new int[8192];
            field_f = new int[256];
            var1 = 0;
            L0: while (true) {
              if (var1 >= 256) {
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if ((var2 ^ -1) <= -9) {
                    field_f[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if (1 != (var0 & 1)) {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    } else {
                      var0 = -306674912 ^ var0 >>> 371290497;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
