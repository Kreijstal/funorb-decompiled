/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static le field_f;
    static java.math.BigInteger field_a;
    static int field_b;
    static boolean field_c;
    static int field_e;
    static boolean field_d;

    final static long a(int param0, CharSequence param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = 0L;
        if (param0 == 37) {
          var4 = param1.length();
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
                      var2 = var2 + (long)(var6 + -64);
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
                      var2 = var2 + (long)(1 - -var6 + -97);
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var6 < 48) {
                  break L1;
                } else {
                  if (var6 <= 57) {
                    var2 = var2 + (long)(var6 + -21);
                    break L1;
                  } else {
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
          sd.a((byte) 7);
          var4 = param1.length();
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
                        var2 = var2 + (long)(var6 + -64);
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
                        var2 = var2 + (long)(1 - -var6 + -97);
                        break L10;
                      } else {
                        break L12;
                      }
                    }
                  }
                  if (var6 < 48) {
                    break L10;
                  } else {
                    if (var6 <= 57) {
                      var2 = var2 + (long)(var6 + -21);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                if (177917621779460413L <= var2) {
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

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 122) {
            field_a = null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_a = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_d = false;
    }
}
