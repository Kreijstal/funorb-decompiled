/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mpa extends lc {
    static int[] field_W;
    static apa field_V;
    static boolean field_X;

    mpa(jta param0, ae param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        if (param2 != null) {
          if (param0 < -66) {
            L0: {
              var3 = param2.length();
              if (var3 > -2) {
                break L0;
              } else {
                if (12 < var3) {
                  break L0;
                } else {
                  var10 = jd.a(1, param2);
                  if (var10 == null) {
                    return ssa.field_d;
                  } else {
                    if (-2 <= var10.length()) {
                      L1: {
                        if (hf.a(-85, var10.charAt(0))) {
                          break L1;
                        } else {
                          if (hf.a(-99, var10.charAt(-1 + var10.length()))) {
                            break L1;
                          } else {
                            var5 = 0;
                            var6 = 0;
                            L2: while (true) {
                              if (param2.length() <= var6) {
                                if ((var5 ^ -1) < -1) {
                                  return gta.field_e;
                                } else {
                                  return null;
                                }
                              } else {
                                L3: {
                                  var7 = param2.charAt(var6);
                                  if (!hf.a(124, (char) var7)) {
                                    var5 = 0;
                                    break L3;
                                  } else {
                                    var5++;
                                    break L3;
                                  }
                                }
                                if ((var5 ^ -1) > -3) {
                                  var6++;
                                  var6++;
                                  continue L2;
                                } else {
                                  if (!param1) {
                                    return pqa.field_r;
                                  } else {
                                    var6++;
                                    continue L2;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      return gta.field_e;
                    } else {
                      return ssa.field_d;
                    }
                  }
                }
              }
            }
            return ssa.field_d;
          } else {
            boolean discarded$1 = mpa.a(true, -28, -59);
            var3 = param2.length();
            if ((var3 ^ -1) <= -2) {
              if (12 >= var3) {
                var9 = jd.a(1, param2);
                if (var9 == null) {
                  return ssa.field_d;
                } else {
                  if (-2 <= var9.length()) {
                    L4: {
                      if (hf.a(-85, var9.charAt(0))) {
                        break L4;
                      } else {
                        if (hf.a(-99, var9.charAt(-1 + var9.length()))) {
                          break L4;
                        } else {
                          var5 = 0;
                          var6 = 0;
                          L5: while (true) {
                            if (param2.length() <= var6) {
                              if ((var5 ^ -1) < -1) {
                                return gta.field_e;
                              } else {
                                return null;
                              }
                            } else {
                              L6: {
                                var7 = param2.charAt(var6);
                                if (!hf.a(124, (char) var7)) {
                                  var5 = 0;
                                  break L6;
                                } else {
                                  var5++;
                                  break L6;
                                }
                              }
                              if ((var5 ^ -1) > -3) {
                                var6++;
                                var6++;
                                continue L5;
                              } else {
                                if (!param1) {
                                  return pqa.field_r;
                                } else {
                                  var6++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    return gta.field_e;
                  } else {
                    return ssa.field_d;
                  }
                }
              } else {
                return ssa.field_d;
              }
            } else {
              return ssa.field_d;
            }
          }
        } else {
          return ssa.field_d;
        }
    }

    final static boolean a(boolean param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            field_X = false;
            if (-1 == (param2 & 1048832)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 == (param2 & 1048832)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, ae param1) {
        if (param0 <= 67) {
            field_W = null;
            super.a(75, param1);
            return;
        }
        super.a(75, param1);
    }

    public static void f(int param0) {
        field_V = null;
        if (param0 != 0) {
            return;
        }
        field_W = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = new int[]{0, 512, 0};
    }
}
