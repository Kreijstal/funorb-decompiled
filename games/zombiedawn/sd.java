/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static String field_a;
    static String field_c;
    static int field_b;

    public static void a(int param0) {
        if (param0 < 40) {
            field_a = null;
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static long a(int param0, CharSequence param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = ZombieDawn.field_J;
        var2 = 0L;
        var4 = param1.length();
        if (param0 != -66) {
          var8 = null;
          var5 = 0;
          L0: while (true) {
            if (var4 > var5) {
              L1: {
                L2: {
                  var2 = var2 * 37L;
                  var6 = param1.charAt(var5);
                  if (var6 < 65) {
                    break L2;
                  } else {
                    if (var6 <= 90) {
                      var2 = var2 + (long)(-65 + var6 + 1);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var6 < 97) {
                    break L3;
                  } else {
                    if (var6 <= 122) {
                      var2 = var2 + (long)(-97 + var6 + 1);
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                if (48 > var6) {
                  break L1;
                } else {
                  if (57 < var6) {
                    break L1;
                  } else {
                    var2 = var2 + (long)(27 - (-var6 - -48));
                    break L1;
                  }
                }
              }
              if (var2 < 177917621779460413L) {
                var5++;
                continue L0;
              } else {
                L4: while (true) {
                  L5: {
                    if (-1L != (var2 % 37L ^ -1L)) {
                      break L5;
                    } else {
                      if ((var2 ^ -1L) == -1L) {
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
                  if (-1L != (var2 % 37L ^ -1L)) {
                    break L7;
                  } else {
                    if ((var2 ^ -1L) == -1L) {
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
          var5 = 0;
          L8: while (true) {
            L9: {
              if (var4 <= var5) {
                break L9;
              } else {
                L10: {
                  L11: {
                    var2 = var2 * 37L;
                    var6 = param1.charAt(var5);
                    if (var6 < 65) {
                      break L11;
                    } else {
                      if (var6 <= 90) {
                        var2 = var2 + (long)(-65 + var6 + 1);
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (var6 < 97) {
                      break L12;
                    } else {
                      if (var6 <= 122) {
                        var2 = var2 + (long)(-97 + var6 + 1);
                        break L10;
                      } else {
                        break L12;
                      }
                    }
                  }
                  if (48 > var6) {
                    break L10;
                  } else {
                    if (57 < var6) {
                      break L10;
                    } else {
                      var2 = var2 + (long)(27 - (-var6 - -48));
                      break L10;
                    }
                  }
                }
                if (var2 >= 177917621779460413L) {
                  break L9;
                } else {
                  var5++;
                  continue L8;
                }
              }
            }
            L13: while (true) {
              L14: {
                if (-1L != (var2 % 37L ^ -1L)) {
                  break L14;
                } else {
                  if ((var2 ^ -1L) == -1L) {
                    break L14;
                  } else {
                    var2 = var2 / 37L;
                    continue L13;
                  }
                }
              }
              return var2;
            }
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Game Complete!";
        field_c = "Email is valid";
    }
}
