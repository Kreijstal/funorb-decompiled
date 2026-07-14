/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static int[] field_c;
    static int field_a;
    static String field_b;
    static int field_d;
    static String field_e;

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        var2 = param1;
        if (-4 != var2) {
          if (-25 != var2) {
            if (var2 != -19) {
              if (19 != var2) {
                if (-29 != var2) {
                  if (-226 != (var2 ^ -1)) {
                    if (1 != var2) {
                      if (var2 != -28) {
                        if (-9 != var2) {
                          if (var2 != 25) {
                            if (param0 != -28) {
                              return -56;
                            } else {
                              return 8;
                            }
                          } else {
                            return 4;
                          }
                        } else {
                          return 8;
                        }
                      } else {
                        return 5;
                      }
                    } else {
                      return 8;
                    }
                  } else {
                    return 4;
                  }
                } else {
                  return 4;
                }
              } else {
                return 4;
              }
            } else {
              return 7;
            }
          } else {
            return 6;
          }
        } else {
          return 6;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        int var1 = -25 / ((45 - param0) / 34);
        field_e = null;
    }

    final static void a(String param0, byte param1) {
        int var2 = 108 / ((param1 - 44) / 48);
        ad.field_c = param0;
        g.a((byte) -116, 12);
    }

    final static long a(CharSequence param0, byte param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = HostileSpawn.field_I ? 1 : 0;
        var2 = 0L;
        var4 = param0.length();
        var5 = 0;
        if (param1 > 74) {
          L0: while (true) {
            if (var4 > var5) {
              L1: {
                L2: {
                  var2 = var2 * 37L;
                  var6 = param0.charAt(var5);
                  if (65 > var6) {
                    break L2;
                  } else {
                    if (var6 > 90) {
                      break L2;
                    } else {
                      var2 = var2 + (long)(-64 + var6);
                      break L1;
                    }
                  }
                }
                L3: {
                  if (var6 < 97) {
                    break L3;
                  } else {
                    if (var6 > 122) {
                      break L3;
                    } else {
                      var2 = var2 + (long)(-97 + var6 + 1);
                      break L1;
                    }
                  }
                }
                if (var6 < 48) {
                  break L1;
                } else {
                  if (var6 > 57) {
                    break L1;
                  } else {
                    var2 = var2 + (long)(-48 + (27 + var6));
                    break L1;
                  }
                }
              }
              if (177917621779460413L > var2) {
                var5++;
                continue L0;
              } else {
                L4: while (true) {
                  L5: {
                    if ((var2 % 37L ^ -1L) != -1L) {
                      break L5;
                    } else {
                      if (-1L == (var2 ^ -1L)) {
                        break L5;
                      } else {
                        var2 = var2 / 37L;
                        continue L4;
                      }
                    }
                  }
                  return var2;
                }
              }
            } else {
              L6: while (true) {
                L7: {
                  if ((var2 % 37L ^ -1L) != -1L) {
                    break L7;
                  } else {
                    if (-1L == (var2 ^ -1L)) {
                      break L7;
                    } else {
                      var2 = var2 / 37L;
                      continue L6;
                    }
                  }
                }
                return var2;
              }
            }
          }
        } else {
          return 5L;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Password is valid";
        field_d = -1;
        field_c = new int[8192];
        field_e = "Loading...";
    }
}
