/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends ne {
    static nn field_j;
    byte[] field_k;
    static int[] field_i;

    final static String a(byte param0, byte[] param1, int param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        var9 = DungeonAssault.field_K;
        var11 = new char[param2];
        var10 = var11;
        var4 = var10;
        var5 = 0;
        if (param0 == -24) {
          var6 = 0;
          L0: while (true) {
            if (var6 >= param2) {
              return new String(var11, 0, var5);
            } else {
              var7 = 255 & param1[var6 + param3];
              if (var7 != -1) {
                L1: {
                  if (-129 > var7) {
                    break L1;
                  } else {
                    if (-161 < (var7 ^ -1)) {
                      L2: {
                        var8 = mh.field_d[var7 - 128];
                        if (var8 == 0) {
                          var8 = 63;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var7 = var8;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                var5++;
                var4[var5] = (char)var7;
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            field_i = null;
        }
        field_j = null;
        field_i = null;
    }

    mk(byte[] param0) {
        ((mk) this).field_k = param0;
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = DungeonAssault.field_K;
        if (param1 != null) {
          var3 = param1.length();
          if (-2 < (var3 ^ -1)) {
            return false;
          } else {
            if (var3 <= 12) {
              L0: {
                var4 = jm.a((byte) 59, param1);
                var5 = -123 / ((param2 - 13) / 43);
                if (var4 == null) {
                  break L0;
                } else {
                  if (-2 >= (var4.length() ^ -1)) {
                    L1: {
                      if (jc.a(var4.charAt(0), -119)) {
                        break L1;
                      } else {
                        if (jc.a(var4.charAt(-1 + var4.length()), -59)) {
                          break L1;
                        } else {
                          var6 = 0;
                          var7 = 0;
                          L2: while (true) {
                            if (var7 >= param1.length()) {
                              if ((var6 ^ -1) >= -1) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              L3: {
                                var8 = param1.charAt(var7);
                                if (!jc.a((char) var8, 68)) {
                                  var6 = 0;
                                  break L3;
                                } else {
                                  var6++;
                                  break L3;
                                }
                              }
                              if ((var6 ^ -1) <= -3) {
                                if (!param0) {
                                  return false;
                                } else {
                                  var7++;
                                  continue L2;
                                }
                              } else {
                                var7++;
                                continue L2;
                              }
                            }
                          }
                        }
                      }
                    }
                    return false;
                  } else {
                    break L0;
                  }
                }
              }
              return false;
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final static nh a(int param0, byte param1) {
        if (param1 != 34) {
            nh discarded$0 = mk.a(109, (byte) -40);
        }
        return uo.a(false, 1, true, param0, param1 + 27813, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[4];
    }
}
