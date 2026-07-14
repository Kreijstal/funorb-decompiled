/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class agb implements dja {
    public final tv a(byte param0) {
        int var2 = -61 % ((param0 - -64) / 50);
        return (tv) (Object) new tt();
    }

    final static long a(CharSequence param0, int param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = VoidHunters.field_G;
        var2 = 0L;
        if (param1 == -49) {
          var4 = param0.length();
          var5 = 0;
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
                      var2 = var2 + (long)(1 - (-var6 - -65));
                      break L1;
                    }
                  }
                }
                L3: {
                  if (97 > var6) {
                    break L3;
                  } else {
                    if (var6 > 122) {
                      break L3;
                    } else {
                      var2 = var2 + (long)(-97 + (1 - -var6));
                      break L1;
                    }
                  }
                }
                if (var6 < 48) {
                  break L1;
                } else {
                  if (var6 <= 57) {
                    var2 = var2 + (long)(27 + var6 + -48);
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
          var8 = null;
          var4 = param0.length();
          var5 = 0;
          L8: while (true) {
            L9: {
              if (var4 <= var5) {
                break L9;
              } else {
                L10: {
                  L11: {
                    var2 = var2 * 37L;
                    var6 = param0.charAt(var5);
                    if (65 > var6) {
                      break L11;
                    } else {
                      if (var6 > 90) {
                        break L11;
                      } else {
                        var2 = var2 + (long)(1 - (-var6 - -65));
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if (97 > var6) {
                      break L12;
                    } else {
                      if (var6 > 122) {
                        break L12;
                      } else {
                        var2 = var2 + (long)(-97 + (1 - -var6));
                        break L10;
                      }
                    }
                  }
                  if (var6 < 48) {
                    break L10;
                  } else {
                    if (var6 <= 57) {
                      var2 = var2 + (long)(27 + var6 + -48);
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

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            tv discarded$0 = ((agb) this).a((byte) 63);
            return (tv[]) (Object) new tt[param1];
        }
        return (tv[]) (Object) new tt[param1];
    }

    static {
    }
}
