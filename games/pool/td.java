/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static dd field_g;
    static StringBuilder field_c;
    static nm field_e;
    static ph field_f;
    static dd field_a;
    static boolean field_d;
    static int field_b;

    final static long a(byte param0, CharSequence param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var2 = 0L;
          var4 = param1.length();
          if (param0 == 52) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          L2: {
            if (var5 >= var4) {
              break L2;
            } else {
              L3: {
                L4: {
                  var2 = var2 * 37L;
                  var6 = param1.charAt(var5);
                  if (var6 < 65) {
                    break L4;
                  } else {
                    if (var6 <= 90) {
                      var2 = var2 + (long)(-65 + (var6 + 1));
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (97 > var6) {
                    break L5;
                  } else {
                    if (var6 <= 122) {
                      var2 = var2 + (long)(-97 + (var6 + 1));
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                if (var6 < 48) {
                  break L3;
                } else {
                  if (var6 <= 57) {
                    var2 = var2 + (long)(var6 + -21);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if ((var2 ^ -1L) > -177917621779460414L) {
                var5++;
                continue L1;
              } else {
                break L2;
              }
            }
          }
          L6: while (true) {
            L7: {
              if (var2 % 37L != 0L) {
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

    public static void a(byte param0) {
        field_e = null;
        if (param0 <= 56) {
            field_f = null;
        }
        field_f = null;
        field_c = null;
        field_a = null;
        field_g = null;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            Object var2 = null;
        }
        return ro.field_e;
    }

    final static boolean a(char param0, byte param1) {
        int var2 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          L1: {
            L2: {
              var2 = -124 % ((69 - param1) / 54);
              if (param0 < 48) {
                break L2;
              } else {
                if (param0 <= 57) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 < 65) {
                break L3;
              } else {
                if (90 >= param0) {
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param0 < 97) {
                break L4;
              } else {
                if (122 < param0) {
                  break L4;
                } else {
                  break L1;
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
          stackOut_9_0 = 1;
          stackIn_11_0 = stackOut_9_0;
          break L0;
        }
        return stackIn_11_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new StringBuilder(80);
        field_f = new ph();
    }
}
